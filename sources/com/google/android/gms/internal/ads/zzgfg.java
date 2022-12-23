package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgfg extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzgfg zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzgfa zzf;
    /* access modifiers changed from: private */
    public zzgji zzg = zzgji.zzb;

    static {
        zzgfg zzgfg = new zzgfg();
        zzb = zzgfg;
        zzgkq.zzaP(zzgfg.class, zzgfg);
    }

    private zzgfg() {
    }

    public static zzgff zzd() {
        return (zzgff) zzb.zzay();
    }

    public static zzgfg zzf() {
        return zzb;
    }

    public static zzgfg zzg(zzgji zzgji, zzgkc zzgkc) throws zzglc {
        return (zzgfg) zzgkq.zzaD(zzb, zzgji, zzgkc);
    }

    static /* synthetic */ void zzj(zzgfg zzgfg, zzgfa zzgfa) {
        zzgfa.getClass();
        zzgfg.zzf = zzgfa;
    }

    public final int zza() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzgfg();
        } else {
            if (i2 == 4) {
                return new zzgff((zzgfe) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgfa zzc() {
        zzgfa zzgfa = this.zzf;
        return zzgfa == null ? zzgfa.zzd() : zzgfa;
    }

    public final zzgji zzh() {
        return this.zzg;
    }

    public final boolean zzl() {
        return this.zzf != null;
    }
}
