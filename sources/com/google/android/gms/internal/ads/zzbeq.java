package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzbeq extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzbeq zzb;
    private int zze;
    private String zzf = "";
    private zzgkz zzg = zzaJ();
    private int zzh = 1000;
    private int zzi = 1000;
    private int zzj = 1000;

    static {
        zzbeq zzbeq = new zzbeq();
        zzb = zzbeq;
        zzgkq.zzaP(zzbeq.class, zzbeq);
    }

    private zzbeq() {
    }

    public static zzbeq zzc() {
        return zzb;
    }

    static /* synthetic */ void zzd(zzbeq zzbeq, String str) {
        str.getClass();
        zzbeq.zze |= 1;
        zzbeq.zzf = str;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzgku zzgku = zzbez.zza;
            return zzaO(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဌ\u0001\u0004ဌ\u0002\u0005ဌ\u0003", new Object[]{"zze", "zzf", "zzg", zzbem.class, "zzh", zzgku, "zzi", zzgku, "zzj", zzgku});
        } else if (i2 == 3) {
            return new zzbeq();
        } else {
            if (i2 == 4) {
                return new zzbep((zzbdt) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
