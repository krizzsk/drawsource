package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgpm extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzgpm zzb;
    private int zze;
    private String zzf = "";
    private long zzg;
    private boolean zzh;
    private int zzi;
    private String zzj = "";
    private String zzk = "";

    static {
        zzgpm zzgpm = new zzgpm();
        zzb = zzgpm;
        zzgkq.zzaP(zzgpm.class, zzgpm);
    }

    private zzgpm() {
    }

    public static zzgpl zza() {
        return (zzgpl) zzb.zzay();
    }

    static /* synthetic */ void zzd(zzgpm zzgpm, String str) {
        zzgpm.zze |= 1;
        zzgpm.zzf = str;
    }

    static /* synthetic */ void zze(zzgpm zzgpm, long j) {
        zzgpm.zze |= 2;
        zzgpm.zzg = j;
    }

    static /* synthetic */ void zzf(zzgpm zzgpm, boolean z) {
        zzgpm.zze |= 4;
        zzgpm.zzh = z;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004ဌ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", zzgpn.zza, "zzj", "zzk"});
        } else if (i2 == 3) {
            return new zzgpm();
        } else {
            if (i2 == 4) {
                return new zzgpl((zzgoc) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
