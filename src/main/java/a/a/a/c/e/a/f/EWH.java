package a.a.a.c.e.a.f;

import a.a.a.c.e.a.d.EWC;
import a.a.a.c.e.a.f.a.EWN;
import a.a.a.c.e.a.g.EWV;
import a.a.a.c.e.a.g.EWX;
import a.a.a.c.e.a.k.a.EXF;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Socket;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Base64;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.X509TrustManager;

public class EWH extends EWM {
   private static volatile EWH GQI = getInstance();
   private static final int GQJ = 60000;

   private static EWH getInstance() {
      if (GQI == null) {
         Class var0 = EWH.class;
         synchronized(EWH.class) {
            if (GQI == null) {
               GQI = new EWH();
            }
         }
      }

      return GQI;
   }

   private EWH() {
      System.setProperty("jsse.enableSNIExtension", "false");
   }

   public static <_PAYLOAD_TYPE, _RESULT_TYPE> EWK<_RESULT_TYPE> IAW(EWJ<_PAYLOAD_TYPE> var0, EWX var1, EWG<_RESULT_TYPE> var2) throws Exception {
      EXF.getInstance().ICO();

      EWK var3;
      try {
         var3 = IAX(var0, var1, var1, var2);
      } finally {
         EXF.getInstance().ICP();
      }

      return var3;
   }

   public static <_PAYLOAD_TYPE, _RESULT_TYPE> EWK<_RESULT_TYPE> IAX(EWJ<_PAYLOAD_TYPE> var0, EWX var1, EWX var2, EWG<_RESULT_TYPE> var3) throws Exception {
      EXF.getInstance().ICO();

      EWK var14;
      try {
         EWP var4 = var0.getMethod();
         EWS var5 = var0.getProtocol();
         String var6 = var0.getHost();
         int var7 = var0.getPort();
         String var8 = var0.getFile();
         LinkedHashMap var9 = new LinkedHashMap();
         var9.putAll(var0.getHeaderFields());
         EWQ var10 = var0.getContentType();
         InputStream var11 = var0.getPayloadStream();
         long var12 = var0.getPayloadSize();
         var14 = IAZ(var4, var5, var6, var7, var8, var9, var10, var11, var12, var1, var2, var3);
      } finally {
         EXF.getInstance().ICP();
      }

      return var14;
   }

   public static <_RESULT_TYPE> EWK<_RESULT_TYPE> IAY(EWP var0, EWS var1, String var2, int var3, String var4, Map<String, String> var5, EWQ var6, InputStream var7, long var8, EWX var10, EWG<_RESULT_TYPE> var11) throws Exception {
      EXF.getInstance().ICO();

      EWK var12;
      try {
         var12 = IAZ(var0, var1, var2, var3, var4, var5, var6, var7, var8, var10, var10, var11);
      } finally {
         EXF.getInstance().ICP();
      }

      return var12;
   }

   public static <_RESULT_TYPE> EWK<_RESULT_TYPE> IAZ(EWP var0, EWS var1, String var2, int var3, String var4, Map<String, String> var5, EWQ var6, InputStream var7, long var8, EWX var10, EWX var11, EWG<_RESULT_TYPE> var12) throws Exception {
      EXF.getInstance().ICO();

      EWK var52;
      try {
         LinkedHashMap var13 = new LinkedHashMap();
         var13.putAll(var5);
         var13.put("Proxy-Connection", "keep-alive");
         var13.put("Connection", "keep-alive");
         var13.put("Cache-Control", "no-cache");
         var13.put("Pragma", "no-cache");
         var13.put("Host", var2);
         Socket var14 = null;
         String var16;
         String var17;
         String var18;
         String var20;
         String var21;
         String var22;
         String var26;
         switch (var1) {
            case http:
               String var15 = System.getProperty("http.proxyHost");
               var16 = System.getProperty("http.proxyPort");
               if (var15 != null && var15.length() > 0 && var16 != null && var16.length() > 0) {
                  EXF.getInstance().ICE("Using proxy " + var15 + ":" + var16);
                  var17 = System.getProperty("http.proxyUser");
                  var18 = System.getProperty("http.proxyPassword");
                  String var40 = null;
                  if (var17 != null && var17.length() > 0 && var18 != null && var18.length() > 0) {
                     var40 = var17 + ":" + var18;
                  }

                  var14 = new Socket(var15, Integer.parseInt(var16));
                  var20 = "CONNECT " + var2 + ":" + var3 + " " + "HTTP/1.1";
                  OutputStream var46 = var14.getOutputStream();
                  var46.write((var20 + "\r\n").getBytes(StandardCharsets.UTF_8));
                  var46.write("Proxy-Connection: keep-alive\r\n".getBytes(StandardCharsets.UTF_8));
                  var46.write("Connection: keep-alive\r\n".getBytes(StandardCharsets.UTF_8));
                  var46.write(("Host: " + var2 + ":" + var3 + "\r\n").getBytes(StandardCharsets.UTF_8));
                  if (var40 != null && var40.length() > 0) {
                     var22 = "Proxy-Authorization: Basic " + Base64.getEncoder().encodeToString(var40.getBytes(StandardCharsets.UTF_8));
                     var46.write((var22 + "\r\n").getBytes(StandardCharsets.UTF_8));
                  }

                  var46.write("\r\n".getBytes(StandardCharsets.UTF_8));
                  EXF.getInstance().ICK("Trying to acquire input stream.");
                  InputStream var47 = var14.getInputStream();
                  byte[] var48 = IAQ(var47);
                  if (var47.available() > 0) {
                     var47.skip((long)var47.available());
                  }

                  Map var51 = IAV(var48);
                  String var53 = (String)((List)var51.get(null)).get(0);
                  var26 = var53.split(" ")[1];
                  if (!"200".equals(var26)) {
                     throw new EWN(var53);
                  }
               } else {
                  var14 = new Socket(var2, var3);
               }
               break;
            case https:
               var17 = System.getProperty("https.proxyHost");
               var18 = System.getProperty("https.proxyPort");
               SSLContext var19 = SSLContext.getDefault();
               if (var17 != null && var17.length() > 0 && var18 != null && var18.length() > 0) {
                  EXF.getInstance().ICE("Using proxy " + var17 + ":" + var18);
                  var20 = System.getProperty("https.proxyUser");
                  var21 = System.getProperty("https.proxyPassword");
                  var22 = null;
                  if (var20 != null && var20.length() > 0 && var21 != null && var21.length() > 0) {
                     var22 = var20 + ":" + var21;
                  }

                  Socket var23 = new Socket(var17, Integer.parseInt(var18));
                  String var24 = "CONNECT " + var2 + ":" + var3 + " " + "HTTP/1.1";
                  OutputStream var25 = var23.getOutputStream();
                  var25.write((var24 + "\r\n").getBytes(StandardCharsets.UTF_8));
                  var25.write("Proxy-Connection: keep-alive\r\n".getBytes(StandardCharsets.UTF_8));
                  var25.write("Connection: keep-alive\r\n".getBytes(StandardCharsets.UTF_8));
                  var25.write(("Host: " + var2 + ":" + var3 + "\r\n").getBytes(StandardCharsets.UTF_8));
                  if (var22 != null && var22.length() > 0) {
                     var26 = "Proxy-Authorization: Basic " + Base64.getEncoder().encodeToString(var22.getBytes(StandardCharsets.UTF_8));
                     var25.write((var26 + "\r\n").getBytes(StandardCharsets.UTF_8));
                  }

                  var25.write("\r\n".getBytes(StandardCharsets.UTF_8));
                  EXF.getInstance().ICK("Trying to acquire input stream.");
                  InputStream var54 = var23.getInputStream();
                  byte[] var27 = IAQ(var54);
                  if (var54.available() > 0) {
                     var54.skip((long)var54.available());
                  }

                  Map var28 = IAV(var27);
                  String var29 = (String)((List)var28.get(null)).get(0);
                  String var30 = var29.split(" ")[1];
                  if (!"200".equals(var30)) {
                     throw new EWN(var29);
                  }

                  var14 = var19.getSocketFactory().createSocket(var23, var2, var3, true);
               } else {
                  var14 = var19.getSocketFactory().createSocket(var2, var3);
               }
               break;
            default:
               throw new RuntimeException("Invalid protocol [" + var1 + "]!");
         }

         var14.setSoTimeout(60000);
         if (var4.length() > 0) {
            if (var4.charAt(0) != '/') {
               var4 = "/" + var4;
            }
         } else {
            var4 = "/";
         }

         OutputStream var34 = var14.getOutputStream();
         var16 = var0.name() + " " + var4 + " " + "HTTP/1.1";
         var34.write((var16 + "\r\n").getBytes(StandardCharsets.UTF_8));
         Iterator var35 = var13.entrySet().iterator();

         while(var35.hasNext()) {
            Map.Entry var38 = (Map.Entry)var35.next();
            var34.write(((String)var38.getKey() + ": " + (String)var38.getValue() + "\r\n").getBytes(StandardCharsets.UTF_8));
         }

         switch (var0) {
            case GET:
               var34.write("\r\n".getBytes(StandardCharsets.UTF_8));
               break;
            case POST:
            case PUT:
               var34.write(("Content-Type: " + var6.getMimeType() + "\r\n").getBytes(StandardCharsets.UTF_8));
               if (var7 != null && var8 > 0L) {
                  var34.write(("Content-Length: " + var8 + "\r\n").getBytes(StandardCharsets.UTF_8));
                  var34.write("\r\n".getBytes(StandardCharsets.UTF_8));
                  EWV var36 = new EWV(var34, var8, var10);
                  DataOutputStream var39 = new DataOutputStream(var36);
                  byte[] var44 = new byte[1048576];

                  while(true) {
                     int var42;
                     if ((var42 = var7.read(var44)) == -1) {
                        var39.flush();
                        var7.close();
                        break;
                     }

                     var39.write(var44, 0, var42);
                     var39.flush();
                  }
               } else {
                  var34.write("Content-Length: -1\r\n".getBytes(StandardCharsets.UTF_8));
                  var34.write("\r\n".getBytes(StandardCharsets.UTF_8));
                  EXF.getInstance().ICI("Payload is NULL or empty!");
               }
         }

         EXF.getInstance().ICK("Trying to acquire input stream.");
         InputStream var37 = var14.getInputStream();
         byte[] var41 = IAQ(var37);
         Map var43 = IAV(var41);
         List var45 = (List)var43.get("Content-Length");
         var21 = var45 != null && var45.size() > 0 ? (String)var45.get(0) : null;
         Long var49 = var21 != null ? Long.parseLong(var21) : null;
         Object var50 = var12.IAP(var37, var11, var49);
         var52 = new EWK(var50, (Throwable)null, var43);
      } finally {
         EXF.getInstance().ICP();
      }

      return var52;
   }

   public static <_RESULT_TYPE> EWK<_RESULT_TYPE> MXE(EWP var0, EWS var1, String var2, int var3, String var4, String var5, List<EWC<String, InputStream, Long>> var6, EWX var7, EWX var8, EWG<_RESULT_TYPE> var9, X509Certificate var10) throws Exception {
      EXF.getInstance().ICO();

      try {
         LinkedHashMap var11 = new LinkedHashMap();
         var11.put("Content-Type", EWQ.MULTIPART_RELATED.getMimeType() + "; boundary=" + var5);
         var11.put("Host", var2);
         ByteArrayOutputStream var12 = new ByteArrayOutputStream();
         Long var13 = 0L;
         Iterator var14 = var6.iterator();

         EWC var15;
         String var16;
         while(var14.hasNext()) {
            var15 = (EWC)var14.next();
            var16 = (String)var15.getFirstValue();
            Long var17 = (Long)var15.getThirdValue();
            var13 = var13 + var17;
            var12.write(("--" + var5 + "\r\n").getBytes(StandardCharsets.UTF_8));
            var12.write(("Content-Type: " + EWQ.TEXT_XML.getMimeType() + "\r\n").getBytes(StandardCharsets.UTF_8));
            var12.write(("Content-ID: " + var16 + "\r\n").getBytes(StandardCharsets.UTF_8));
            var12.write("\r\n".getBytes(StandardCharsets.UTF_8));
            var12.write("\r\n".getBytes(StandardCharsets.UTF_8));
            var12.flush();
         }

         var12.write("\r\n".getBytes(StandardCharsets.UTF_8));
         var12.write(("--" + var5 + "--" + "\r\n").getBytes(StandardCharsets.UTF_8));
         var12.flush();
         int var35 = var12.toByteArray().length;
         var13 = var13 + (long)var35;
         var11.put("Content-Length", String.valueOf(var13));
         var15 = null;
         String var18;
         String var19;
         String var21;
         String var22;
         String var23;
         String var27;
         Socket var36;
         String var38;
         InputStream var51;
         switch (var1) {
            case http:
               var16 = System.getProperty("http.proxyHost");
               var38 = System.getProperty("http.proxyPort");
               if (var16 != null && var16.length() > 0 && var38 != null && var38.length() > 0) {
                  EXF.getInstance().ICE("Using proxy " + var16 + ":" + var38);
                  var18 = System.getProperty("http.proxyUser");
                  var19 = System.getProperty("http.proxyPassword");
                  String var45 = null;
                  if (var18 != null && var18.length() > 0 && var19 != null && var19.length() > 0) {
                     var45 = var18 + ":" + var19;
                  }

                  var36 = new Socket(var16, Integer.parseInt(var38));
                  var21 = "CONNECT " + var2 + ":" + var3 + " " + "HTTP/1.1";
                  OutputStream var48 = var36.getOutputStream();
                  var48.write((var21 + "\r\n").getBytes(StandardCharsets.UTF_8));
                  var48.write("Proxy-Connection: keep-alive\r\n".getBytes(StandardCharsets.UTF_8));
                  var48.write("Connection: keep-alive\r\n".getBytes(StandardCharsets.UTF_8));
                  var48.write(("Host: " + var2 + ":" + var3 + "\r\n").getBytes(StandardCharsets.UTF_8));
                  if (var45 != null && var45.length() > 0) {
                     var23 = "Proxy-Authorization: Basic " + Base64.getEncoder().encodeToString(var45.getBytes(StandardCharsets.UTF_8));
                     var48.write((var23 + "\r\n").getBytes(StandardCharsets.UTF_8));
                  }

                  var48.write("\r\n".getBytes(StandardCharsets.UTF_8));
                  EXF.getInstance().ICK("Trying to acquire input stream.");
                  var51 = var36.getInputStream();
                  byte[] var52 = IAQ(var51);
                  if (var51.available() > 0) {
                     var51.skip((long)var51.available());
                  }

                  Map var56 = IAV(var52);
                  String var59 = (String)((List)var56.get(null)).get(0);
                  var27 = var59.split(" ")[1];
                  if (!"200".equals(var27)) {
                     throw new EWN(var59);
                  }
               } else {
                  var36 = new Socket(var2, var3);
               }
               break;
            case https:
               var18 = System.getProperty("https.proxyHost");
               var19 = System.getProperty("https.proxyPort");
               SSLContext var20 = null;
               if (var10 == null) {
                  var20 = SSLContext.getDefault();
               } else {
                  var20 = getSSLContext_trustSingleCert(var10);
               }

               if (var18 != null && var18.length() > 0 && var19 != null && var19.length() > 0) {
                  EXF.getInstance().ICE("Using proxy " + var18 + ":" + var19);
                  var21 = System.getProperty("https.proxyUser");
                  var22 = System.getProperty("https.proxyPassword");
                  var23 = null;
                  if (var21 != null && var21.length() > 0 && var22 != null && var22.length() > 0) {
                     var23 = var21 + ":" + var22;
                  }

                  Socket var24 = new Socket(var18, Integer.parseInt(var19));
                  String var25 = "CONNECT " + var2 + ":" + var3 + " " + "HTTP/1.1";
                  OutputStream var26 = var24.getOutputStream();
                  var26.write((var25 + "\r\n").getBytes(StandardCharsets.UTF_8));
                  var26.write("Proxy-Connection: keep-alive\r\n".getBytes(StandardCharsets.UTF_8));
                  var26.write("Connection: keep-alive\r\n".getBytes(StandardCharsets.UTF_8));
                  var26.write(("Host: " + var2 + ":" + var3 + "\r\n").getBytes(StandardCharsets.UTF_8));
                  if (var23 != null && var23.length() > 0) {
                     var27 = "Proxy-Authorization: Basic " + Base64.getEncoder().encodeToString(var23.getBytes(StandardCharsets.UTF_8));
                     var26.write((var27 + "\r\n").getBytes(StandardCharsets.UTF_8));
                  }

                  var26.write("\r\n".getBytes(StandardCharsets.UTF_8));
                  EXF.getInstance().ICK("Trying to acquire input stream.");
                  InputStream var61 = var24.getInputStream();
                  byte[] var28 = IAQ(var61);
                  if (var61.available() > 0) {
                     var61.skip((long)var61.available());
                  }

                  Map var29 = IAV(var28);
                  String var30 = (String)((List)var29.get(null)).get(0);
                  String var31 = var30.split(" ")[1];
                  if (!"200".equals(var31)) {
                     throw new EWN(var30);
                  }

                  var36 = var20.getSocketFactory().createSocket(var24, var2, var3, true);
               } else {
                  var36 = var20.getSocketFactory().createSocket(var2, var3);
               }
               break;
            default:
               throw new RuntimeException("Invalid protocol [" + var1 + "]!");
         }

         var36.setSoTimeout(60000);
         if (var4.length() > 0) {
            if (var4.charAt(0) != '/') {
               var4 = "/" + var4;
            }
         } else {
            var4 = "/";
         }

         OutputStream var37 = var36.getOutputStream();
         var38 = var0.name() + " " + var4 + " " + "HTTP/1.1";
         var37.write((var38 + "\r\n").getBytes(StandardCharsets.UTF_8));
         Iterator var39 = var11.entrySet().iterator();

         while(var39.hasNext()) {
            Map.Entry var42 = (Map.Entry)var39.next();
            var37.write(((String)var42.getKey() + ": " + (String)var42.getValue() + "\r\n").getBytes(StandardCharsets.UTF_8));
         }

         switch (var0) {
            case POST:
            case PUT:
               EWV var40 = new EWV(var37, var13, var7);
               DataOutputStream var43 = new DataOutputStream(var40);
               var37.write("\r\n".getBytes(StandardCharsets.UTF_8));
               Iterator var49 = var6.iterator();

               for(; var49.hasNext(); var37.write("\r\n".getBytes(StandardCharsets.UTF_8))) {
                  EWC var46 = (EWC)var49.next();
                  var22 = (String)var46.getFirstValue();
                  var51 = (InputStream)var46.getSecondValue();
                  Long var53 = (Long)var46.getThirdValue();
                  var37.write(("--" + var5 + "\r\n").getBytes(StandardCharsets.UTF_8));
                  var37.write(("Content-Type: " + EWQ.TEXT_XML.getMimeType() + "\r\n").getBytes(StandardCharsets.UTF_8));
                  var37.write(("Content-ID: " + var22 + "\r\n").getBytes(StandardCharsets.UTF_8));
                  var37.write("\r\n".getBytes(StandardCharsets.UTF_8));
                  if (var51 != null && var53 > 0L) {
                     byte[] var60 = new byte[1048576];

                     int var57;
                     while((var57 = var51.read(var60)) != -1) {
                        var43.write(var60, 0, var57);
                        var43.flush();
                     }

                     var43.flush();
                     var51.close();
                  } else {
                     EXF.getInstance().ICI("Payload is NULL or empty!");
                  }
               }

               var37.write("\r\n".getBytes(StandardCharsets.UTF_8));
               var37.write(("--" + var5 + "--" + "\r\n").getBytes(StandardCharsets.UTF_8));
               var37.flush();
               EXF.getInstance().ICK("Trying to acquire input stream.");
               InputStream var41 = var36.getInputStream();
               byte[] var44 = IAQ(var41);
               Map var50 = IAV(var44);
               List var47 = (List)var50.get("Content-Length");
               var22 = var47 != null && var47.size() > 0 ? (String)var47.get(0) : null;
               Long var54 = var22 != null ? Long.parseLong(var22) : null;
               Object var55 = var9.IAP(var41, var8, var54);
               EWK var58 = new EWK(var55, (Throwable)null, var50);
               return var58;
            default:
               throw new RuntimeException("Unsupported method [" + var0 + "]!");
         }
      } finally {
         EXF.getInstance().ICP();
      }
   }

   public static <_PAYLOAD_TYPE, _RESULT_TYPE> EWK<_RESULT_TYPE> IBA(EWJ<_PAYLOAD_TYPE> var0, EWX var1, EWG<_RESULT_TYPE> var2) throws Exception {
      EXF.getInstance().ICO();

      EWK var3;
      try {
         var3 = MXG(var0, var1, var1, var2, (X509Certificate)null);
      } finally {
         EXF.getInstance().ICP();
      }

      return var3;
   }

   public static <_PAYLOAD_TYPE, _RESULT_TYPE> EWK<_RESULT_TYPE> MXF(EWJ<_PAYLOAD_TYPE> var0, EWX var1, EWG<_RESULT_TYPE> var2, X509Certificate var3) throws Exception {
      EXF.getInstance().ICO();

      EWK var4;
      try {
         var4 = MXG(var0, var1, var1, var2, var3);
      } finally {
         EXF.getInstance().ICP();
      }

      return var4;
   }

   public static <_PAYLOAD_TYPE, _RESULT_TYPE> EWK<_RESULT_TYPE> MXG(EWJ<_PAYLOAD_TYPE> var0, EWX var1, EWX var2, EWG<_RESULT_TYPE> var3, X509Certificate var4) throws Exception {
      EXF.getInstance().ICO();

      EWK var30;
      try {
         URL var5 = var0.getURL();
         URLConnection var6 = var5.openConnection();
         HttpURLConnection var7 = (HttpURLConnection)var6;
         var7.setConnectTimeout(60000);
         Iterator var8 = var0.getHeaderFields().entrySet().iterator();

         while(var8.hasNext()) {
            Map.Entry var9 = (Map.Entry)var8.next();
            var7.setRequestProperty((String)var9.getKey(), (String)var9.getValue());
         }

         var7.setRequestProperty("Content-Type", var0.getContentType().getMimeType());
         var7.setRequestProperty("Accept-Charset", StandardCharsets.UTF_8.name());
         switch (var0.getProtocol()) {
            case http:
               var7.setRequestMethod(var0.getMethod().name());
               break;
            case https:
               HttpsURLConnection var23 = (HttpsURLConnection)var7;
               var23.setRequestMethod(var0.getMethod().name());
               if (var4 != null) {
                  SSLContext var25 = getSSLContext_trustSingleCert(var4);
                  var23.setSSLSocketFactory(var25.getSocketFactory());
               }
               break;
            default:
               throw new RuntimeException("Invalid protocol [" + var0.getProtocol() + "]!");
         }

         switch (var0.getMethod()) {
            case POST:
            case PUT:
               if (var0.getPayloadStream() != null && var0.getPayloadSize() > 0L) {
                  DataOutputStream var24 = null;

                  try {
                     var7.setDoOutput(true);
                     var7.setRequestProperty("Content-Length", "" + var0.getPayloadSize());
                     EWV var27 = new EWV(var7.getOutputStream(), var0.getPayloadSize(), var1);
                     var24 = new DataOutputStream(var27);
                     byte[] var11 = new byte[1048576];

                     int var10;
                     while((var10 = var0.getPayloadStream().read(var11)) != -1) {
                        var24.write(var11, 0, var10);
                        var24.flush();
                     }

                     var24.flush();
                     var0.getPayloadStream().close();
                     var24.close();
                  } finally {
                     if (var24 != null) {
                        var24.close();
                     }

                  }
               } else {
                  var7.setRequestProperty("Content-Length", "-1");
                  EXF.getInstance().ICI("Payload is NULL or empty!");
               }
         }

         IOException var26 = null;

         InputStream var28;
         try {
            EXF.getInstance().ICK("Trying to acquire standard input stream.");
            var28 = var7.getInputStream();
         } catch (IOException var20) {
            EXF.getInstance().ICH("IOException", var20);
            EXF.getInstance().ICK("Trying to acquire error input stream.");
            var28 = var7.getErrorStream();
            var26 = var20;
         }

         Object var29 = var3.IAP(var28, var2, (Long)null);
         var30 = new EWK(var29, var26, var6.getHeaderFields());
      } finally {
         EXF.getInstance().ICP();
      }

      return var30;
   }

   private static SSLContext getSSLContext_trustSingleCert(final X509Certificate var0) throws NoSuchAlgorithmException, KeyManagementException, CertificateException, IOException {
      EXF.getInstance().ICO();
      Object var1 = null;

      SSLContext var3;
      try {
         SSLContext var2 = SSLContext.getInstance("TLS");
         var2.init((KeyManager[])null, new X509TrustManager[]{new X509TrustManager() {
            public void checkClientTrusted(X509Certificate[] var1, String var2) throws CertificateException {
               throw new CertificateException("Not implemented!");
            }

            public void checkServerTrusted(X509Certificate[] var1, String var2) throws CertificateException {
               boolean var3 = false;
               if (var0 != null) {
                  for(int var4 = 0; var4 < var1.length; ++var4) {
                     X509Certificate var5 = var1[var4];
                     if (var5 != null && Arrays.equals(var0.getEncoded(), var5.getEncoded())) {
                        var3 = true;
                        break;
                     }
                  }
               }

               if (!var3) {
                  throw new CertificateException("Certificate not valid!");
               }
            }

            public X509Certificate[] getAcceptedIssuers() {
               return new X509Certificate[]{var0};
            }
         }}, new SecureRandom());
         var3 = var2;
      } finally {
         if (var1 != null) {
            ((InputStream)var1).close();
         }

         EXF.getInstance().ICP();
      }

      return var3;
   }
}
