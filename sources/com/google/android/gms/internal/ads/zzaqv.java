package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzaqv extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzaqv zzb;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private long zzi;
    private long zzj;

    static {
        zzaqv zzaqv = new zzaqv();
        zzb = zzaqv;
        zzgkq.zzaP(zzaqv.class, zzaqv);
    }

    private zzaqv() {
    }

    public static zzaqu zze() {
        return (zzaqu) zzb.zzay();
    }

    public static zzaqv zzg() {
        return zzb;
    }

    public static zzaqv zzh(zzgji zzgji) throws zzglc {
        return (zzaqv) zzgkq.zzaB(zzb, zzgji);
    }

    public static zzaqv zzi(zzgji zzgji, zzgkc zzgkc) throws zzglc {
        return (zzaqv) zzgkq.zzaD(zzb, zzgji, zzgkc);
    }

    static /* synthetic */ void zzl(zzaqv zzaqv, String str) {
        str.getClass();
        zzaqv.zze |= 1;
        zzaqv.zzf = str;
    }

    static /* synthetic */ void zzm(zzaqv zzaqv, long j) {
        zzaqv.zze |= 16;
        zzaqv.zzj = j;
    }

    static /* synthetic */ void zzn(zzaqv zzaqv, String str) {
        str.getClass();
        zzaqv.zze |= 2;
        zzaqv.zzg = str;
    }

    static /* synthetic */ void zzo(zzaqv zzaqv, long j) {
        zzaqv.zze |= 4;
        zzaqv.zzh = j;
    }

    static /* synthetic */ void zzp(zzaqv zzaqv, long j) {
        zzaqv.zze |= 8;
        zzaqv.zzi = j;
    }

    public final long zza() {
        return this.zzi;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဃ\u0002\u0004ဃ\u0003\u0005ဃ\u0004", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new zzaqv();
        } else {
            if (i2 == 4) {
                return new zzaqu((zzaqt) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final long zzc() {
        return this.zzh;
    }

    public final long zzd() {
        return this.zzj;
    }

    public final String zzj() {
        return this.zzg;
    }

    public final String zzk() {
        return this.zzf;
    }
}
