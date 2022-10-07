package a.a.a.c.e.a.g;

import a.a.a.c.e.a.k.a.EXF;

public abstract class EWX {
   public static final String GRR = "0.00";
   public static final String GRS = " MB/s";
   private long GRT;
   private double GRU;
   private long GRV;
   private long GRW;
   private long GRX;
   private long GRY;
   private int GRZ;
   private int GSA;

   public EWX() {
      this(10);
   }

   public EWX(int var1) {
      this(var1, 1, 1);
   }

   public EWX(int var1, int var2, int var3) {
      EXF.getInstance().ICO();

      try {
         this.GRZ = var2;
         this.GSA = var3;
         this.GRT = System.currentTimeMillis();
         this.GRU = 0.0;
         this.GRV = 0L;
         this.GRW = 0L;
         this.GRX = 0L;
         this.GRY = 0L;
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public int getListItemIndex() {
      return this.GRZ;
   }

   public void setListItemIndex(int var1) {
      this.GRZ = var1;
   }

   public int getListItemSize() {
      return this.GSA;
   }

   public void setListItemSize(int var1) {
      this.GSA = var1;
   }

   public void IBH(double var1, long var3, long var5) {
      EXF.getInstance().ICO();

      try {
         this.GRT = System.currentTimeMillis();
         this.GRU = var1;
         this.GRV = var3;
         this.GRW = var5;
         this.GRX += this.GRV;
         this.GRY += this.GRW;
         this.IBI(this.GRT, this.GRU, this.GRV, this.GRW, this.GRX, this.GRY);
      } finally {
         EXF.getInstance().ICP();
      }

   }

   public abstract void IBI(long var1, double var3, long var5, long var7, long var9, long var11);

   public long getLastUpdate() {
      return this.GRT;
   }

   public double getCurrentProgress() {
      return this.GRU;
   }

   public long getUpdateChunkDuration() {
      return this.GRV;
   }

   public long getUpdateChunkSize() {
      return this.GRW;
   }

   public double getUpdateChunkMBperSecondAvg() {
      Double var1 = (double)this.GRY * 1000.0 / (double)(this.GRX * 1024L * 1024L);
      return var1 > 0.0 ? var1 : 0.0;
   }

   public double getUpdateChunkMBperSecond() {
      Double var1;
      if (this.GRV != 0L) {
         var1 = (double)this.GRW * 1000.0 / (double)(this.GRV * 1024L * 1024L);
      } else {
         var1 = 0.0;
      }

      return var1 > 0.0 ? var1 : 0.0;
   }

   public static void IBJ(EWX var0, double var1, long var3, long var5) {
      EXF.getInstance().ICO();

      try {
         if (var0 != null) {
            var0.IBH(var1, var3, var5);
         }
      } finally {
         EXF.getInstance().ICP();
      }

   }
}
