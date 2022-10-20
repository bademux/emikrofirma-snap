package a.a.a.c.f.a.d;

import a.a.a.c.f.b.c.Nip;
import a.a.a.c.f.b.c.a.TaxOffice;

import java.time.LocalDate;

public class JpkFaGenerateSettings {
    private final DateType QLJ;
    private final LocalDate QLK;
    private final LocalDate QLL;
    private final boolean QLM;
    private final Nip QLN;
    private final TaxOffice QLO;

    public JpkFaGenerateSettings(DateType var1, LocalDate var2, LocalDate var3, boolean var4, Nip var5, TaxOffice var6) {
        this.QLJ = var1;
        this.QLK = var2;
        this.QLL = var3;
        this.QLM = var4;
        this.QLN = var5;
        this.QLO = var6;
    }

    public DateType getPossibleDateTypeForSearch() {
        return this.QLJ;
    }

    public LocalDate getDateFrom() {
        return this.QLK;
    }

    public LocalDate getDateTo() {
        return this.QLL;
    }

    public boolean QOO() {
        return this.QLM;
    }

    public Nip getNip() {
        return this.QLN;
    }

    public TaxOffice getTaxOffice() {
        return this.QLO;
    }
}
