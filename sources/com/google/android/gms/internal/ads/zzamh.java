package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzamh extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzamh zzb;
    private int zze;
    private long zzf;
    private String zzg = "";
    private zzgji zzh = zzgji.zzb;

    static {
        zzamh zzamh = new zzamh();
        zzb = zzamh;
        zzgkq.zzaP(zzamh.class, zzamh);
    }

    private zzamh() {
    }

    public static zzamh zzd() {
        return zzb;
    }

    public final long zza() {
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zzb, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဂ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"zze", "zzf", "zzg", "zzh"});
        } else if (i2 == 3) {
            return new zzamh();
        } else {
            if (i2 == 4) {
                return new zzamg((zzalh) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final boolean zze() {
        return (this.zze & 1) != 0;
    }
}
