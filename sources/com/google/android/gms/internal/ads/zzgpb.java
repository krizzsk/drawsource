package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgpb extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzgpb zzb;
    private int zze;
    private zzgpa zzf;
    private zzgkz zzg = zzaJ();
    private zzgji zzh = zzgji.zzb;
    private zzgji zzi;
    private int zzj;
    private zzgji zzk;
    private byte zzl = 2;

    static {
        zzgpb zzgpb = new zzgpb();
        zzb = zzgpb;
        zzgkq.zzaP(zzgpb.class, zzgpb);
    }

    private zzgpb() {
        zzgji zzgji = zzgji.zzb;
        this.zzi = zzgji;
        this.zzk = zzgji;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzl);
        }
        byte b = 1;
        if (i2 == 2) {
            return zzaO(zzb, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဉ\u0000\u0002Л\u0003ည\u0001\u0004ည\u0002\u0005င\u0003\u0006ည\u0004", new Object[]{"zze", "zzf", "zzg", zzgot.class, "zzh", "zzi", "zzj", "zzk"});
        } else if (i2 == 3) {
            return new zzgpb();
        } else {
            if (i2 == 4) {
                return new zzgoy((zzgoc) null);
            }
            if (i2 == 5) {
                return zzb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzl = b;
            return null;
        }
    }
}
