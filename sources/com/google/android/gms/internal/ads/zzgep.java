package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgep extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzgep zzb;
    private zzges zze;
    /* access modifiers changed from: private */
    public int zzf;
    private int zzg;

    static {
        zzgep zzgep = new zzgep();
        zzb = zzgep;
        zzgkq.zzaP(zzgep.class, zzgep);
    }

    private zzgep() {
    }

    public static zzgeo zzc() {
        return (zzgeo) zzb.zzay();
    }

    public static zzgep zze() {
        return zzb;
    }

    public static zzgep zzf(zzgji zzgji, zzgkc zzgkc) throws zzglc {
        return (zzgep) zzgkq.zzaD(zzb, zzgji, zzgkc);
    }

    static /* synthetic */ void zzh(zzgep zzgep, zzges zzges) {
        zzges.getClass();
        zzgep.zze = zzges;
    }

    public final int zza() {
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzgep();
        } else {
            if (i2 == 4) {
                return new zzgeo((zzgen) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzges zzg() {
        zzges zzges = this.zze;
        return zzges == null ? zzges.zze() : zzges;
    }
}
