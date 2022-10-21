package a.a.a.c.c.b.b;

import a.a.a.b.f.FFK;
import a.a.a.b.f.FFO;
import a.a.a.c.b.ParametrizedModel;
import a.a.a.c.c.a.ProcessDefinitionBase;
import a.a.a.c.e.a.d.ValueContainer2;
import a.a.a.c.f.a.ModelBusinessPeriodElement;
import a.a.a.c.f.a.ModelBusinessTopElement;
import a.a.a.c.f.a.a.Dictionary;
import a.a.a.c.f.a.e.Invoice;
import a.a.a.c.f.a.e.InvoiceElement;
import a.a.a.c.f.a.g.PeriodModelCriteria;
import a.a.a.c.f.a.g.ModelBusinessElementCriteria;
import a.a.a.c.f.a.g.ModelTechnicalElementCriteria;
import a.a.a.c.f.a.h.Settlement;
import a.a.a.c.f.a.n.InvoiceOther;
import a.a.a.c.f.a.n.InvoiceOtherElement;
import a.a.a.c.f.b.b.Period;
import a.a.a.c.f.c.BaseUserData;

import java.util.Date;
import java.util.List;
import java.util.Map;

public interface EMU {
    <T extends BaseUserData, Q extends ModelTechnicalElementCriteria<T>> T HJT(ProcessDefinitionBase var1, Q var2) throws FFK;

    <T extends BaseUserData> void HJU(ProcessDefinitionBase var1, T var2) throws FFK;

    <T extends BaseUserData> void HJV(ProcessDefinitionBase var1, T var2) throws FFK;

    <T extends BaseUserData> void HJW(ProcessDefinitionBase var1, T var2) throws FFK;

    <A extends Invoice<B>, B extends InvoiceElement> A HJX(ProcessDefinitionBase var1, Class<A> var2) throws FFK, FFO;

    <A extends InvoiceOther<B>, B extends InvoiceOtherElement> A ROG(ProcessDefinitionBase var1, Class<A> var2) throws FFK, FFO;

    <T extends ModelBusinessTopElement, Q extends ModelBusinessElementCriteria<T>, R extends ParametrizedModel<T>, S extends List<R>> ValueContainer2<Integer, S> HJY(ProcessDefinitionBase var1, Q var2) throws FFK, FFO;

    <T extends ModelBusinessTopElement> void HJZ(ProcessDefinitionBase var1, T var2) throws FFK, FFO;

    <T extends ModelBusinessTopElement> void HKA(ProcessDefinitionBase var1, T var2, Settlement var3) throws FFK, FFO;

    <T extends ModelBusinessTopElement> void HKB(ProcessDefinitionBase var1, T var2) throws FFK, FFO;

    <T extends ModelBusinessTopElement> void HKC(ProcessDefinitionBase var1, T var2) throws FFK, FFO;

    <T extends ModelBusinessTopElement> void ROH(ParametrizedModel<T> var1, Class<T> var2) throws FFK, FFO;

    <T extends ModelBusinessTopElement> Integer getMaxDocumentIndex(ProcessDefinitionBase var1, Class<T> var2, Period var3, Enum<?> var4, Enum<?> var5) throws FFK, FFO;

    <T extends ModelBusinessPeriodElement, I extends Enum<I>, L extends Enum<L>, Q extends PeriodModelCriteria<T, I, L>, R extends ParametrizedModel<T>, S extends List<R>> ValueContainer2<Integer, S> HKD(ProcessDefinitionBase var1, Q var2) throws FFK, FFO;

    <T extends ModelBusinessTopElement, Q extends ModelBusinessElementCriteria<T>, R extends ParametrizedModel<T>, S extends List<R>> ValueContainer2<Integer, S> HKE(ProcessDefinitionBase var1, Q var2) throws FFK, FFO;

    <T extends Dictionary> void HKF(ProcessDefinitionBase var1, T var2) throws FFK, FFO;

    <T extends Dictionary> void HKG(ProcessDefinitionBase var1, T var2) throws FFK, FFO;

    <T extends Dictionary> void HKH(ProcessDefinitionBase var1, T var2) throws FFK, FFO;

    <R extends Dictionary, S extends List<R>> S HKI(ProcessDefinitionBase var1, String var2, String var3) throws FFK, FFO;

    String HKJ(Date var1, String var2) throws FFK;

    String ROI(Date var1, String var2, boolean var3) throws FFK;

    Map<String, Map<Period, Integer>> getSequences() throws FFK;

    void ROJ(Period var1, String var2, Integer var3, Integer var4) throws FFK;

    void HKL(ProcessDefinitionBase var1) throws FFK;

    void resetData(ProcessDefinitionBase var1) throws FFK;
}
