package a.a.a.b.b;

import a.a.a.c.e.a.g.EWW;
import a.a.a.c.e.a.g.EWX;
import a.a.a.c.e.a.k.a.EXF;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

public class FEJ {
   private static FileFilter HEU = new FileFilter() {
      public boolean accept(File var1) {
         return var1.isFile();
      }
   };

   public FEJ() {
   }

   public static List<File> IKA(File var0) throws NoSuchAlgorithmException, IOException {
      EXF.getInstance().ICO();

      ArrayList var10;
      try {
         if (!var0.isDirectory()) {
            throw new RuntimeException("Path is NOT a directory!");
         }

         ArrayList var1 = new ArrayList();
         File[] var2 = var0.listFiles(HEU);
         if (var2 != null) {
            File[] var3 = var2;
            int var4 = var2.length;

            for(int var5 = 0; var5 < var4; ++var5) {
               File var6 = var3[var5];
               var1.add(var6);
            }
         }

         var10 = var1;
      } finally {
         EXF.getInstance().ICP();
      }

      return var10;
   }

   public static void IKB(String var0, String var1) throws IOException {
      EXF.getInstance().ICO();

      try {
         Path var2 = Paths.get(var0);
         Path var3 = Paths.get(var1);
         if (!Files.exists(var2, new LinkOption[]{LinkOption.NOFOLLOW_LINKS}) || Files.exists(var3, new LinkOption[]{LinkOption.NOFOLLOW_LINKS})) {
            throw new RuntimeException("Either source file does not exist or destination file exist!");
         }

         Path var4 = Files.move(var2, var3, StandardCopyOption.REPLACE_EXISTING);
         EXF.getInstance().ICK("Result file is " + var4);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public static void IKC(boolean var0, File var1, File... var2) throws IOException {
      EXF.getInstance().ICO();
      FileOutputStream var3 = null;

      try {
         var3 = new FileOutputStream(var1);
         ZipOutputStream var4 = new ZipOutputStream(var3);
         var4.setMethod(8);
         File[] var5 = var2;
         int var6 = var2.length;

         for(int var7 = 0; var7 < var6; ++var7) {
            File var8 = var5[var7];
            FileInputStream var9 = null;

            try {
               var9 = new FileInputStream(var8);
               String var10 = null;
               if (var0) {
                  var10 = var8.getPath();
               } else {
                  var10 = var8.getName();
               }

               ZipEntry var11 = new ZipEntry(var10);
               var4.putNextEntry(var11);
               int var13 = 1048576;
               byte[] var14 = new byte[var13];

               int var12;
               while((var12 = var9.read(var14)) != -1) {
                  var4.write(var14, 0, var12);
                  var4.flush();
               }
            } finally {
               if (var9 != null) {
                  var9.close();
               }

            }
         }

         var4.flush();
         var4.close();
      } finally {
         if (var3 != null) {
            var3.close();
         }

         EXF.getInstance().ICP();
      }

   }

   public static List<File> IKD(File var0, File var1, long var2) throws IOException {
      EXF.getInstance().ICO();
      FileInputStream var4 = null;
      FileOutputStream var5 = null;

      ArrayList var16;
      try {
         int var6 = 1048576;
         if (var2 < (long)var6) {
            throw new RuntimeException("Split size [" + var2 + "] is smaller than buffer size [" + var6 + "].");
         }

         var4 = new FileInputStream(var0);
         int var7 = 0;
         ArrayList var8 = new ArrayList();
         File var9 = new File(var1, var0.getName() + "." + var7);
         var8.add(var9);
         var5 = new FileOutputStream(var9);
         Long var17 = var2;
         byte[] var11 = new byte[var6];

         int var10;
         while((var10 = var4.read(var11)) != -1) {
            if ((long)var10 <= var17) {
               var5.write(var11, 0, var10);
               var17 = var17 - (long)var10;
            } else {
               var5.write(var11, 0, var17.intValue());
               var5.close();
               if (var10 - var17.intValue() > 0) {
                  ++var7;
                  File var12 = new File(var1, var0.getName() + "." + var7);
                  var8.add(var12);
                  var5 = new FileOutputStream(var12);
                  var5.write(var11, var17.intValue(), var10 - var17.intValue());
                  var17 = var2 - ((long)var10 - var17);
               }
            }
         }

         var5.close();
         var16 = var8;
      } finally {
         if (var4 != null) {
            var4.close();
         }

         if (var5 != null) {
            var5.close();
         }

         EXF.getInstance().ICP();
      }

      return var16;
   }

   public static String IKE(byte[] var0) {
      EXF.getInstance().ICO();

      String var1;
      try {
         var1 = IKF(var0, "");
      } finally {
         EXF.getInstance().ICP();
      }

      return var1;
   }

   public static String IKF(byte[] var0, String var1) {
      EXF.getInstance().ICO();

      try {
         StringBuffer var2 = new StringBuffer();
         byte[] var3 = var0;
         int var4 = var0.length;

         for(int var5 = 0; var5 < var4; ++var5) {
            byte var6 = var3[var5];
            var2.append(String.format("%02x", var6)).append(var1);
         }

         String var10 = var2.toString();
         return var10;
      } finally {
         EXF.getInstance().ICP();
      }
   }

   public static byte[] IKG(byte[] var0) throws NoSuchAlgorithmException, IOException {
      EXF.getInstance().ICO();

      byte[] var1;
      try {
         var1 = IKK("SHA1", var0);
      } finally {
         EXF.getInstance().ICP();
      }

      return var1;
   }

   public static byte[] IKH(byte[] var0) throws NoSuchAlgorithmException, IOException {
      EXF.getInstance().ICO();

      byte[] var1;
      try {
         var1 = IKK("SHA-256", var0);
      } finally {
         EXF.getInstance().ICP();
      }

      return var1;
   }

   public static String IKI(byte[] var0) throws NoSuchAlgorithmException, IOException {
      EXF.getInstance().ICO();

      String var2;
      try {
         byte[] var1 = IKJ(var0);
         var2 = IKE(var1);
      } finally {
         EXF.getInstance().ICP();
      }

      return var2;
   }

   public static byte[] IKJ(byte[] var0) throws NoSuchAlgorithmException, IOException {
      EXF.getInstance().ICO();

      byte[] var1;
      try {
         var1 = IKK("MD5", var0);
      } finally {
         EXF.getInstance().ICP();
      }

      return var1;
   }

   public static byte[] IKK(String var0, byte[] var1) throws NoSuchAlgorithmException, IOException {
      EXF.getInstance().ICO();

      try {
         MessageDigest var2 = MessageDigest.getInstance(var0);
         ByteArrayInputStream var3 = new ByteArrayInputStream(var1);
         DigestInputStream var4 = new DigestInputStream(var3, var2);

         while(var4.read() != -1) {
         }

         var4.close();
         byte[] var5 = var2.digest();
         byte[] var6 = var5;
         return var6;
      } finally {
         EXF.getInstance().ICP();
      }
   }

   public static String IKL(File var0) throws NoSuchAlgorithmException, IOException {
      EXF.getInstance().ICO();

      String var2;
      try {
         byte[] var1 = IKM(var0);
         var2 = IKE(var1);
      } finally {
         EXF.getInstance().ICP();
      }

      return var2;
   }

   public static byte[] IKM(File var0) throws NoSuchAlgorithmException, IOException {
      EXF.getInstance().ICO();
      FileInputStream var1 = null;

      try {
         MessageDigest var2 = MessageDigest.getInstance("MD5");
         var1 = new FileInputStream(var0);
         DigestInputStream var3 = new DigestInputStream(var1, var2);

         while(var3.read() != -1) {
         }

         var3.close();
         byte[] var4 = var2.digest();
         byte[] var5 = var4;
         return var5;
      } finally {
         if (var1 != null) {
            var1.close();
         }

         EXF.getInstance().ICP();
      }
   }

   public static byte[] IKN(File var0, EWX var1) throws NoSuchAlgorithmException, IOException {
      EXF.getInstance().ICO();
      FileInputStream var2 = null;

      try {
         MessageDigest var3 = MessageDigest.getInstance("MD5");
         var2 = new FileInputStream(var0);
         DigestInputStream var4 = new DigestInputStream(var2, var3);
         EWW var5 = new EWW(var4, var0.length(), var1);
         byte[] var6 = new byte[1048576];

         while(var5.read(var6) != -1) {
         }

         var4.close();
         var5.close();
         byte[] var7 = var3.digest();
         byte[] var8 = var7;
         return var8;
      } finally {
         if (var2 != null) {
            var2.close();
         }

         EXF.getInstance().ICP();
      }
   }

   public static byte[] IKO(InputStream var0, boolean var1) throws IOException {
      EXF.getInstance().ICO();

      try {
         ByteArrayOutputStream var2 = new ByteArrayOutputStream();
         int var4 = 1048576;
         byte[] var5 = new byte[var4];

         int var3;
         while((var3 = var0.read(var5)) != -1) {
            var2.write(var5, 0, var3);
            var2.flush();
         }

         var2.flush();
         if (var1) {
            var0.close();
         }

         byte[] var6 = var2.toByteArray();
         return var6;
      } finally {
         EXF.getInstance().ICP();
      }
   }

   public static byte[] IKP(File var0) throws IOException {
      EXF.getInstance().ICO();
      FileInputStream var1 = null;

      try {
         var1 = new FileInputStream(var0);
         ByteArrayOutputStream var2 = new ByteArrayOutputStream();
         int var4 = 1048576;
         byte[] var5 = new byte[var4];

         int var3;
         while((var3 = var1.read(var5)) != -1) {
            var2.write(var5, 0, var3);
            var2.flush();
         }

         var2.flush();
         byte[] var6 = var2.toByteArray();
         return var6;
      } finally {
         if (var1 != null) {
            var1.close();
         }

         EXF.getInstance().ICP();
      }
   }

   public static InputStream getFileInputStreamSkipBOM(File var0) throws IOException {
      EXF.getInstance().ICO();

      PushbackInputStream var9;
      try {
         FileInputStream var1 = new FileInputStream(var0);
         PushbackInputStream var2 = new PushbackInputStream(var1, 4);
         byte[] var3 = new byte[4];
         int var4 = var2.read(var3);
         long var5;
         switch (var4) {
            case 4:
               if (var3[0] == -1 && var3[1] == -2 && var3[2] == 0 && var3[3] == 0) {
                  var5 = 4L;
                  break;
               } else if (var3[0] == 0 && var3[1] == 0 && var3[2] == -2 && var3[3] == -1) {
                  var5 = 4L;
                  break;
               }
            case 3:
               if (var3[0] == -17 && var3[1] == -69 && var3[2] == -65) {
                  var5 = 3L;
                  break;
               }
            case 2:
               if (var3[0] == -1 && var3[1] == -2) {
                  var5 = 2L;
                  break;
               } else if (var3[0] == -2 && var3[1] == -1) {
                  var5 = 2L;
                  break;
               }
            default:
               var5 = 0L;
         }

         if (var4 > 0) {
            var2.unread(var3, 0, var4);
         }

         long var7 = var2.skip(var5);
         EXF.getInstance().ICK("skipped " + var7);
         var9 = var2;
      } finally {
         EXF.getInstance().ICP();
      }

      return var9;
   }

   public static void IKQ(byte[] var0, File var1) throws IOException {
      EXF.getInstance().ICO();
      FileOutputStream var2 = null;

      try {
         var2 = new FileOutputStream(var1);
         var2.write(var0);
         var2.flush();
         var2.close();
      } finally {
         if (var2 != null) {
            var2.close();
         }

         EXF.getInstance().ICP();
      }

   }

   public static byte[] IKR(File var0) throws IOException, SAXException, ParserConfigurationException {
      EXF.getInstance().ICO();
      FileInputStream var1 = null;

      byte[] var7;
      try {
         var1 = new FileInputStream(var0);
         InputSource var2 = new InputSource(var1);
         final StringBuilder var3 = new StringBuilder();
         SAXParserFactory var4 = SAXParserFactory.newInstance();
         SAXParser var5 = var4.newSAXParser();
         XMLReader var6 = var5.getXMLReader();
         var6.setContentHandler(new DefaultHandler() {
            boolean ACGA = false;

            public void startElement(String var1, String var2, String var3x, Attributes var4) throws SAXException {
               var3.append("<").append(var3x);

               for(int var5 = 0; var5 < var4.getLength(); ++var5) {
                  var3.append(" ").append(var4.getQName(var5)).append("=").append("\"").append(var4.getValue(var5)).append("\"");
               }

               var3.append(">");
               this.ACGA = true;
            }

            public void endElement(String var1, String var2, String var3x) throws SAXException {
               var3.append("</").append(var3x).append(">");
               this.ACGA = false;
            }

            public void characters(char[] var1, int var2, int var3x) throws SAXException {
               if (this.ACGA) {
                  StringBuilder var4 = new StringBuilder();

                  for(int var5 = 0; var5 < var3x; ++var5) {
                     var4.append(var1[var2 + var5]);
                  }

                  String var6 = var4.toString().trim();
                  var3.append(var6);
               }

            }
         });
         var6.parse(var2);
         var7 = var3.toString().getBytes(StandardCharsets.UTF_8);
      } finally {
         if (var1 != null) {
            var1.close();
         }

         EXF.getInstance().ICP();
      }

      return var7;
   }
}
