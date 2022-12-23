package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgfd extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzgfd zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzgfg zzf;
    /* access modifiers changed from: private */
    public zzgji zzg = zzgji.zzb;

    static {
        zzgfd zzgfd = new zzgfd();
        zzb = zzgfd;
        zzgkq.zzaP(zzgfd.class, zzgfd);
    }

    private zzgfd() {
    }

    public static zzgfc zzc() {
        return (zzgfc) zzb.zzay();
    }

    public static zzgfd zze(zzgji zzgji, zzgkc zzgkc) throws zzglc {
        return (zzgfd) zzgkq.zzaD(zzb, zzgji, zzgkc);
    }

    static /* synthetic */ void zzi(zzgfd zzgfd, zzgfg zzgfg) {
        zzgfg.getClass();
        zzgfd.zzf = zzgfg;
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
            return new zzgfd();
        } else {
            if (i2 == 4) {
                return new zzgfc((zzgfb) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgfg zzf() {
        zzgfg zzgfg = this.zzf;
        return zzgfg == null ? zzgfg.zzf() : zzgfg;
    }

    public final zzgji zzg() {
        return this.zzg;
    }

    public final boolean zzk() {
        return this.zzf != null;
    }
}
