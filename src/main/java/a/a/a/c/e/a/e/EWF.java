package a.a.a.c.e.a.e;

import a.a.a.c.e.a.k.a.EXF;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class EWF {
   public EWF() {
   }

   public static void RHV(String var0, String var1) throws IOException {
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

   public static void HZZ(String var0, String var1) throws IOException {
      EXF.getInstance().ICO();

      try {
         Path var2 = Paths.get(var0);
         Path var3 = Paths.get(var1);
         if (!Files.exists(var2, new LinkOption[]{LinkOption.NOFOLLOW_LINKS})) {
            throw new RuntimeException("Source file does not exist!");
         }

         Path var4 = Files.move(var2, var3, StandardCopyOption.REPLACE_EXISTING);
         EXF.getInstance().ICK("Result file is " + var4);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public static void RHW(String var0, String var1) throws IOException {
      EXF.getInstance().ICO();

      try {
         Path var2 = Paths.get(var0);
         Path var3 = Paths.get(var1);
         if (!Files.exists(var2, new LinkOption[]{LinkOption.NOFOLLOW_LINKS}) || Files.exists(var3, new LinkOption[]{LinkOption.NOFOLLOW_LINKS})) {
            throw new RuntimeException("Either source file does not exist or destination file exist!");
         }

         Path var4 = Files.copy(var2, var3, StandardCopyOption.REPLACE_EXISTING);
         EXF.getInstance().ICK("Result file is " + var4);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public static void IAB(boolean var0, File var1, File... var2) throws IOException {
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
               byte[] var14 = new byte[8096];

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

   public static File[] QOF(File var0, File var1) throws IOException {
      EXF.getInstance().ICO();
      FileInputStream var2 = null;

      File[] var21;
      try {
         if (var0 == null || var1 == null) {
            throw new RuntimeException("inputFile and outputDir cannot be null!");
         }

         boolean var3 = var1.mkdirs();
         EXF.getInstance().ICK("mkdirs " + var3);
         ArrayList var4 = new ArrayList();
         var2 = new FileInputStream(var0);
         ZipInputStream var5 = new ZipInputStream(var2);

         for(ZipEntry var6 = var5.getNextEntry(); var6 != null; var6 = var5.getNextEntry()) {
            String var7 = var6.getName();
            File var8 = new File(var1, var7);
            var4.add(var8);
            FileOutputStream var9 = null;

            try {
               var9 = new FileOutputStream(var8);
               int var11 = 1048576;
               byte[] var12 = new byte[var11];

               int var10;
               while((var10 = var5.read(var12)) != -1) {
                  var9.write(var12, 0, var10);
                  var9.flush();
               }
            } finally {
               if (var9 != null) {
                  var9.close();
               }

            }
         }

         var5.closeEntry();
         var5.close();
         var21 = (File[])var4.toArray(new File[0]);
      } finally {
         if (var2 != null) {
            var2.close();
         }

         EXF.getInstance().ICP();
      }

      return var21;
   }

   public static void IAC(RandomAccessFile var0, RandomAccessFile var1) throws IOException {
      EXF.getInstance().ICO();

      try {
         var1.getChannel().truncate(0L);
         var1.seek(0L);
         var0.seek(0L);
         int var3 = 1048576;
         byte[] var4 = new byte[var3];

         int var2;
         while((var2 = var0.read(var4)) != -1) {
            var1.write(var4, 0, var2);
         }

         var1.getFD().sync();
      } finally {
         EXF.getInstance().ICP();
      }
   }

   public static byte[] IAD(InputStream var0, boolean var1) throws IOException {
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

   public static byte[] IAE(File var0) throws IOException {
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

   public static String IAF(File var0) throws NoSuchAlgorithmException, IOException {
      EXF.getInstance().ICO();

      String var2;
      try {
         byte[] var1 = IAG(var0);
         var2 = IAM(var1);
      } finally {
         EXF.getInstance().ICP();
      }

      return var2;
   }

   public static byte[] IAG(File var0) throws NoSuchAlgorithmException, IOException {
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

   public static String IAH(byte[] var0) throws NoSuchAlgorithmException, IOException {
      EXF.getInstance().ICO();

      String var2;
      try {
         byte[] var1 = IAI(var0);
         var2 = IAM(var1);
      } finally {
         EXF.getInstance().ICP();
      }

      return var2;
   }

   public static byte[] IAI(byte[] var0) throws NoSuchAlgorithmException, IOException {
      EXF.getInstance().ICO();

      byte[] var1;
      try {
         var1 = IAL("SHA-256", var0);
      } finally {
         EXF.getInstance().ICP();
      }

      return var1;
   }

   public static String IAJ(byte[] var0) throws NoSuchAlgorithmException, IOException {
      EXF.getInstance().ICO();

      String var2;
      try {
         byte[] var1 = IAK(var0);
         var2 = IAM(var1);
      } finally {
         EXF.getInstance().ICP();
      }

      return var2;
   }

   public static byte[] IAK(byte[] var0) throws NoSuchAlgorithmException, IOException {
      EXF.getInstance().ICO();

      byte[] var1;
      try {
         var1 = IAL("MD5", var0);
      } finally {
         EXF.getInstance().ICP();
      }

      return var1;
   }

   public static byte[] IAL(String var0, byte[] var1) throws NoSuchAlgorithmException, IOException {
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

   public static String IAM(byte[] var0) {
      EXF.getInstance().ICO();

      String var1;
      try {
         var1 = IAN(var0, "");
      } finally {
         EXF.getInstance().ICP();
      }

      return var1;
   }

   public static String IAN(byte[] var0, String var1) {
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
}
