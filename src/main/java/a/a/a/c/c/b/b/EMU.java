package a.a.a.c.c.b.b;

import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.b.EDF;
import a.a.a.c.c.a.ELZ;
import a.a.a.c.e.a.d.EVZ;
import a.a.a.c.f.a.IK;
import a.a.a.c.f.a.IL;
import a.a.a.c.f.a.a.IJE;
import a.a.a.c.f.a.e.HN;
import a.a.a.c.f.a.e.HO;
import a.a.a.c.f.a.g.EYD;
import a.a.a.c.f.a.g.IW;
import a.a.a.c.f.a.g.JB;
import a.a.a.c.f.a.h.JF;
import a.a.a.c.f.a.n.QSG;
import a.a.a.c.f.a.n.QSH;
import a.a.a.c.f.b.b.JN;
import a.a.a.c.f.c.LW;
import java.util.Date;
import java.util.List;
import java.util.Map;

public interface EMU {
   <T extends LW, Q extends JB<T>> T HJT(ELZ var1, Q var2) throws FFK;

   <T extends LW> void HJU(ELZ var1, T var2) throws FFK;

   <T extends LW> void HJV(ELZ var1, T var2) throws FFK;

   <T extends LW> void HJW(ELZ var1, T var2) throws FFK;

   <A extends HN<B>, B extends HO> A HJX(ELZ var1, Class<A> var2) throws FFK, FFO;

   <A extends QSG<B>, B extends QSH> A ROG(ELZ var1, Class<A> var2) throws FFK, FFO;

   <T extends IL, Q extends IW<T>, R extends EDF<T>, S extends List<R>> EVZ<Integer, S> HJY(ELZ var1, Q var2) throws FFK, FFO;

   <T extends IL> void HJZ(ELZ var1, T var2) throws FFK, FFO;

   <T extends IL> void HKA(ELZ var1, T var2, JF var3) throws FFK, FFO;

   <T extends IL> void HKB(ELZ var1, T var2) throws FFK, FFO;

   <T extends IL> void HKC(ELZ var1, T var2) throws FFK, FFO;

   <T extends IL> void ROH(EDF<T> var1, Class<T> var2) throws FFK, FFO;

   <T extends IL> Integer getMaxDocumentIndex(ELZ var1, Class<T> var2, JN var3, Enum<?> var4, Enum<?> var5) throws FFK, FFO;

   <T extends IK, I extends Enum<I>, L extends Enum<L>, Q extends EYD<T, I, L>, R extends EDF<T>, S extends List<R>> EVZ<Integer, S> HKD(ELZ var1, Q var2) throws FFK, FFO;

   <T extends IL, Q extends IW<T>, R extends EDF<T>, S extends List<R>> EVZ<Integer, S> HKE(ELZ var1, Q var2) throws FFK, FFO;

   <T extends IJE> void HKF(ELZ var1, T var2) throws FFK, FFO;

   <T extends IJE> void HKG(ELZ var1, T var2) throws FFK, FFO;

   <T extends IJE> void HKH(ELZ var1, T var2) throws FFK, FFO;

   <R extends IJE, S extends List<R>> S HKI(ELZ var1, String var2, String var3) throws FFK, FFO;

   String HKJ(Date var1, String var2) throws FFK;

   String ROI(Date var1, String var2, boolean var3) throws FFK;

   Map<String, Map<JN, Integer>> getSequences() throws FFK;

   void ROJ(JN var1, String var2, Integer var3, Integer var4) throws FFK;

   void HKL(ELZ var1) throws FFK;

   void resetData(ELZ var1) throws FFK;
}
