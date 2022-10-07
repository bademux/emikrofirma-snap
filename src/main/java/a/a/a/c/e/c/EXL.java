package a.a.a.c.e.c;

import a.a.a.c.e.a.e.EWF;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.*;
import java.util.*;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;
import java.util.jar.Manifest;

public class EXL extends URLClassLoader {
    private final Map<String, byte[]> GUK;
    private final Map<String, EXM> GUL;
    private final Map<String, byte[]> GUM;
    private final Map<String, Class<?>> GUN;
    private final Map<String, Package> GUO;
    private final URL GUP = new URL(null, "bytes:/DYNAMIC_RESOURCES!/", new URLStreamHandler() {
        protected URLConnection openConnection(final URL var1) throws IOException {
            return new URLConnection(var1) {
                public void connect() throws IOException {
                }

                public InputStream getInputStream() throws IOException {
                    return EXL.this.getResourceAsStream(var1.getFile().split("!")[1].substring(1));
                }
            };
        }
    });

    public EXL(URL[] var1, Map<String, byte[]> var2, ClassLoader var3) throws IOException {
        super(var1, var3);
        this.GUK = var2;
        this.GUL = this.IEK();
        this.GUM = new HashMap();
        this.GUN = new HashMap();
        this.GUO = new HashMap();
    }

    public Set<String> getResourcesWithPrefix(String var1) {
        HashSet var2 = new HashSet();
        Iterator var3 = this.GUL.keySet().iterator();

        while (var3.hasNext()) {
            String var4 = (String) var3.next();
            if (var4.startsWith(var1) && var4.charAt(var4.length() - 1) != '/') {
                var2.add(var4);
            }
        }

        return var2;
    }

    private Map<String, EXM> IEK() throws IOException {
        HashMap var1 = new HashMap();
        Iterator var2 = this.GUK.entrySet().iterator();

        while (var2.hasNext()) {
            Map.Entry var3 = (Map.Entry) var2.next();
            JarInputStream var4 = null;

            try {
                String var5 = (String) var3.getKey();
                byte[] var6 = (byte[]) var3.getValue();
                var4 = new JarInputStream(new ByteArrayInputStream(var6));
                Manifest var7 = var4.getManifest();

                JarEntry var8;
                while ((var8 = var4.getNextJarEntry()) != null) {
                    String var9 = var8.getName();
                    var1.put(var9, new EXM(var5, var7));
                }
            } finally {
                if (var4 != null) {
                    var4.close();
                }

            }
        }

        return Collections.unmodifiableMap(var1);
    }

    private synchronized byte[] IEL(String var1, String var2) {
        try {
            if (!this.GUM.containsKey(var1)) {
                JarInputStream var3 = null;

                try {
                    byte[] var4 = this.GUK.get(var2);
                    var3 = new JarInputStream(new ByteArrayInputStream(var4));

                    JarEntry var5;
                    while ((var5 = var3.getNextJarEntry()) != null) {
                        String var6 = var5.getName();
                        if (var6.equals(var1)) {
                            byte[] var7 = EWF.IAD(var3, false);
                            this.GUM.put(var1, var7);
                        }
                    }
                } finally {
                    if (var3 != null) {
                        var3.close();
                    }

                }
            }

            byte[] var13 = this.GUM.get(var1);
            return var13;
        } catch (IOException var12) {
            var12.printStackTrace();
            return null;
        }
    }

    private synchronized Class<?> IEM(String var1, String var2, String var3, Manifest var4) {
        if (!this.GUN.containsKey(var1)) {
            byte[] var5 = this.IEL(var2, var3);
            Class var6 = this.defineClass(var1, var5, 0, var5.length);
            this.GUN.put(var1, var6);
            int var7 = var1.lastIndexOf(46);
            if (var7 != -1) {
                String var8 = var1.substring(0, var7);
                if (!this.GUO.containsKey(var8)) {
                    URL var9 = null;

                    try {
                        var9 = new URL(this.GUP, var3);
                    } catch (MalformedURLException var11) {
                        var11.printStackTrace();
                    }

                    Package var10 = null;
                    if (var4 != null) {
                        var10 = this.definePackage(var8, var4, var9);
                    } else {
                        var10 = this.definePackage(var8, null, null, null, null, null, null, var9);
                    }

                    this.GUO.put(var8, var10);
                }
            }
        }

        Class var12 = this.GUN.get(var1);
        return var12;
    }

    public URL getResource(String var1) {
        URL var2;
        if (this.GUL.containsKey(var1)) {
            try {
                var2 = new URL(this.GUP, var1);
            } catch (MalformedURLException var4) {
                var4.printStackTrace();
                var2 = null;
            }

            return var2;
        } else {
            var2 = super.getResource(var1);
            return var2;
        }
    }

    public InputStream getResourceAsStream(String var1) {
        if (this.GUL.containsKey(var1)) {
            String var2 = this.GUL.get(var1).getJarName();
            return new ByteArrayInputStream(this.IEL(var1, var2));
        } else {
            return super.getResourceAsStream(var1);
        }
    }

    protected Class<?> findClass(String var1) throws ClassNotFoundException {
        String var2 = var1.replace('.', '/').concat(".class");
        if (this.GUL.containsKey(var2)) {
            EXM var3 = this.GUL.get(var2);
            String var4 = var3.getJarName();
            Manifest var5 = var3.getManifest();
            return this.IEM(var1, var2, var4, var5);
        } else {
            return super.findClass(var1);
        }
    }

    protected Package getPackage(String var1) {
        return this.GUO.containsKey(var1) ? this.GUO.get(var1) : super.getPackage(var1);
    }

    private class EXM {
        private final String GUI;
        private final Manifest GUJ;

        public EXM(String var2, Manifest var3) {
            this.GUI = var2;
            this.GUJ = var3;
        }

        public String getJarName() {
            return this.GUI;
        }

        public Manifest getManifest() {
            return this.GUJ;
        }
    }
}
