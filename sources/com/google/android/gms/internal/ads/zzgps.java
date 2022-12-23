package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgps extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzgps zzb;
    private int zze;
    private String zzf = "";
    private String zzg = "";

    static {
        zzgps zzgps = new zzgps();
        zzb = zzgps;
        zzgkq.zzaP(zzgps.class, zzgps);
    }

    private zzgps() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzgps();
        } else {
            if (i2 == 4) {
                return new zzgpr((zzgoc) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
