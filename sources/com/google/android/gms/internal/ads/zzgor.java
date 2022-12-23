package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgor extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzgor zzb;
    private int zze;
    private String zzf = "";
    private zzgoq zzg;
    private long zzh;
    private String zzi = "";

    static {
        zzgor zzgor = new zzgor();
        zzb = zzgor;
        zzgkq.zzaP(zzgor.class, zzgor);
    }

    private zzgor() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004ဈ\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
        } else if (i2 == 3) {
            return new zzgor();
        } else {
            if (i2 == 4) {
                return new zzgoo((zzgoc) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
