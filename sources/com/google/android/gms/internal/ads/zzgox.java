package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgox extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzgox zzb;
    private int zze;
    private zzgow zzf;
    private zzgkz zzg = zzaJ();
    private zzgji zzh = zzgji.zzb;
    private zzgji zzi = zzgji.zzb;
    private int zzj;
    private byte zzk = 2;

    static {
        zzgox zzgox = new zzgox();
        zzb = zzgox;
        zzgkq.zzaP(zzgox.class, zzgox);
    }

    private zzgox() {
    }

    public static zzgou zza() {
        return (zzgou) zzb.zzay();
    }

    static /* synthetic */ void zzd(zzgox zzgox, zzgot zzgot) {
        zzgot.getClass();
        zzgkz zzgkz = zzgox.zzg;
        if (!zzgkz.zzc()) {
            zzgox.zzg = zzgkq.zzaK(zzgkz);
        }
        zzgox.zzg.add(zzgot);
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzk);
        }
        byte b = 1;
        if (i2 == 2) {
            return zzaO(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003", new Object[]{"zze", "zzf", "zzg", zzgot.class, "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new zzgox();
        } else {
            if (i2 == 4) {
                return new zzgou((zzgoc) null);
            }
            if (i2 == 5) {
                return zzb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzk = b;
            return null;
        }
    }
}
