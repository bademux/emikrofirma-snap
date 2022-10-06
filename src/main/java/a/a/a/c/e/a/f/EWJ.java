package a.a.a.c.e.a.f;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class EWJ<_PAYLOAD_TYPE> {
   private final EWP GQK;
   private final URL GQL;
   private final EWQ GQM;
   private final _PAYLOAD_TYPE GQN;
   private final Map<String, String> GQO;
   InputStream GQP;

   public EWJ(EWP var1, EWS var2, String var3, int var4, String var5, EWQ var6, _PAYLOAD_TYPE var7) throws MalformedURLException {
      this(var1, var2, var3, var4, var5, var6, var7, new HashMap());
   }

   public EWJ(EWP var1, EWS var2, String var3, int var4, String var5, EWQ var6, _PAYLOAD_TYPE var7, Map<String, String> var8) throws MalformedURLException {
      this.GQP = null;
      this.GQK = var1;
      this.GQL = new URL(var2.name(), var3, var4, var5);
      this.GQM = var6;
      this.GQN = var7;
      this.GQO = var8;
   }

   public EWJ(EWP var1, URL var2, EWQ var3, _PAYLOAD_TYPE var4) {
      this(var1, var2, var3, var4, new HashMap());
   }

   public EWJ(EWP var1, URL var2, EWQ var3, _PAYLOAD_TYPE var4, Map<String, String> var5) {
      this.GQP = null;
      this.GQK = var1;
      this.GQM = var3;
      this.GQN = var4;
      this.GQO = var5;
      this.GQL = var2;
   }

   public EWP getMethod() {
      return this.GQK;
   }

   public EWQ getContentType() {
      return this.GQM;
   }

   public InputStream getPayloadStream() throws FileNotFoundException {
      if (this.GQN != null) {
         if (this.GQP == null) {
            if (this.GQN instanceof byte[]) {
               this.GQP = new ByteArrayInputStream((byte[])((byte[])this.GQN));
            } else {
               if (!(this.GQN instanceof File)) {
                  throw new RuntimeException("Payload class [" + this.GQN.getClass() + "] NOT implemented!");
               }

               this.GQP = new FileInputStream((File)this.GQN);
            }
         }

         return this.GQP;
      } else {
         return null;
      }
   }

   public long getPayloadSize() {
      if (this.GQN != null) {
         if (this.GQN instanceof byte[]) {
            return (long)((byte[])((byte[])this.GQN)).length;
         } else if (this.GQN instanceof File) {
            return ((File)this.GQN).length();
         } else {
            throw new RuntimeException("Payload class [" + this.GQN.getClass() + "] NOT implemented!");
         }
      } else {
         return -1L;
      }
   }

   public Map<String, String> getHeaderFields() {
      return this.GQO;
   }

   public URL getURL() {
      return this.GQL;
   }

   public EWS getProtocol() {
      return EWS.valueOf(this.GQL.getProtocol());
   }

   public String getHost() {
      return this.GQL.getHost();
   }

   public int getPort() {
      return this.GQL.getPort() < 0 ? this.GQL.getDefaultPort() : this.GQL.getPort();
   }

   public String getFile() {
      return this.GQL.getFile();
   }

   public String toString() {
      return "HttpSenderRequest [method=" + this.GQK + ", url=" + this.GQL + ", contentType=" + this.GQM + ", headerFields=" + this.GQO + "]";
   }
}
