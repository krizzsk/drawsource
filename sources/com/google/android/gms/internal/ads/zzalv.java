package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzalv extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzalv zzb;
    private int zze;
    private long zzf = -1;
    private long zzg = -1;
    private long zzh = -1;
    private long zzi = -1;
    private long zzj = -1;
    private long zzk = -1;
    private int zzl = 1000;
    private long zzm = -1;
    private long zzn = -1;
    private long zzo = -1;
    private int zzp = 1000;
    private long zzq = -1;
    private long zzr = -1;
    private long zzs = -1;
    private long zzt = -1;
    private long zzu;
    private long zzv;
    private long zzw = -1;
    private long zzx = -1;
    private long zzy = -1;
    private long zzz = -1;

    static {
        zzalv zzalv = new zzalv();
        zzb = zzalv;
        zzgkq.zzaP(zzalv.class, zzalv);
    }

    private zzalv() {
    }

    public static zzalu zza() {
        return (zzalu) zzb.zzay();
    }

    static /* synthetic */ void zzd(zzalv zzalv, long j) {
        zzalv.zze |= 1;
        zzalv.zzf = j;
    }

    static /* synthetic */ void zze(zzalv zzalv, long j) {
        zzalv.zze |= 2;
        zzalv.zzg = j;
    }

    static /* synthetic */ void zzf(zzalv zzalv, long j) {
        zzalv.zze |= 4;
        zzalv.zzh = j;
    }

    static /* synthetic */ void zzg(zzalv zzalv, long j) {
        zzalv.zze |= 8;
        zzalv.zzi = j;
    }

    static /* synthetic */ void zzh(zzalv zzalv) {
        zzalv.zze &= -9;
        zzalv.zzi = -1;
    }

    static /* synthetic */ void zzi(zzalv zzalv, long j) {
        zzalv.zze |= 16;
        zzalv.zzj = j;
    }

    static /* synthetic */ void zzj(zzalv zzalv, long j) {
        zzalv.zze |= 32;
        zzalv.zzk = j;
    }

    static /* synthetic */ void zzk(zzalv zzalv, long j) {
        zzalv.zze |= 128;
        zzalv.zzm = j;
    }

    static /* synthetic */ void zzl(zzalv zzalv, long j) {
        zzalv.zze |= 256;
        zzalv.zzn = j;
    }

    static /* synthetic */ void zzm(zzalv zzalv, long j) {
        zzalv.zze |= 512;
        zzalv.zzo = j;
    }

    static /* synthetic */ void zzn(zzalv zzalv, long j) {
        zzalv.zze |= 2048;
        zzalv.zzq = j;
    }

    static /* synthetic */ void zzo(zzalv zzalv, long j) {
        zzalv.zze |= 4096;
        zzalv.zzr = j;
    }

    static /* synthetic */ void zzp(zzalv zzalv, long j) {
        zzalv.zze |= 8192;
        zzalv.zzs = j;
    }

    static /* synthetic */ void zzq(zzalv zzalv, long j) {
        zzalv.zze |= 16384;
        zzalv.zzt = j;
    }

    static /* synthetic */ void zzr(zzalv zzalv, long j) {
        zzalv.zze |= 32768;
        zzalv.zzu = j;
    }

    static /* synthetic */ void zzs(zzalv zzalv, long j) {
        zzalv.zze |= 65536;
        zzalv.zzv = j;
    }

    static /* synthetic */ void zzt(zzalv zzalv, long j) {
        zzalv.zze |= 131072;
        zzalv.zzw = j;
    }

    static /* synthetic */ void zzu(zzalv zzalv, long j) {
        zzalv.zze |= 262144;
        zzalv.zzx = j;
    }

    static /* synthetic */ void zzv(zzalv zzalv, int i) {
        zzalv.zzl = i - 1;
        zzalv.zze |= 64;
    }

    static /* synthetic */ void zzw(zzalv zzalv, int i) {
        zzalv.zzp = i - 1;
        zzalv.zze |= 1024;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzgku zzgku = zzame.zza;
            return zzaO(zzb, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001???\u0000\u0002???\u0001\u0003???\u0002\u0004???\u0003\u0005???\u0004\u0006???\u0005\u0007???\u0006\b???\u0007\t???\b\n???\t\u000b???\n\f???\u000b\r???\f\u000e???\r\u000f???\u000e\u0010???\u000f\u0011???\u0010\u0012???\u0011\u0013???\u0012\u0014???\u0013\u0015???\u0014", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", zzgku, "zzm", "zzn", "zzo", "zzp", zzgku, "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz"});
        } else if (i2 == 3) {
            return new zzalv();
        } else {
            if (i2 == 4) {
                return new zzalu((zzalh) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
