package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgpu extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzgpu zzb;
    private int zze;
    private int zzf;
    private String zzg = "";
    private zzgkv zzh = zzaG();
    private int zzi;
    private zzgkz zzj = zzaJ();
    private zzgji zzk = zzgji.zzb;

    static {
        zzgpu zzgpu = new zzgpu();
        zzb = zzgpu;
        zzgkq.zzaP(zzgpu.class, zzgpu);
    }

    private zzgpu() {
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zzb, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0002\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u0016\u0005င\u0002\u0006\u001b\u0007ည\u0003", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzgps.class, "zzk"});
        } else if (i2 == 3) {
            return new zzgpu();
        } else {
            if (i2 == 4) {
                return new zzgpt((zzgoc) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
