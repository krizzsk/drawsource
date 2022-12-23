package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgdt extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzgdt zzb;
    private zzgdw zze;

    static {
        zzgdt zzgdt = new zzgdt();
        zzb = zzgdt;
        zzgkq.zzaP(zzgdt.class, zzgdt);
    }

    private zzgdt() {
    }

    public static zzgds zza() {
        return (zzgds) zzb.zzay();
    }

    public static zzgdt zzd(zzgji zzgji, zzgkc zzgkc) throws zzglc {
        return (zzgdt) zzgkq.zzaD(zzb, zzgji, zzgkc);
    }

    static /* synthetic */ void zzf(zzgdt zzgdt, zzgdw zzgdw) {
        zzgdw.getClass();
        zzgdt.zze = zzgdw;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zze"});
        } else if (i2 == 3) {
            return new zzgdt();
        } else {
            if (i2 == 4) {
                return new zzgds((zzgdr) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgdw zze() {
        zzgdw zzgdw = this.zze;
        return zzgdw == null ? zzgdw.zze() : zzgdw;
    }
}
