package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgpk extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzgpk zzb;
    private int zze;
    private int zzf;
    private String zzg = "";
    private zzgox zzh;
    private zzgpb zzi;
    private int zzj;
    private zzgkv zzk = zzaG();
    private String zzl = "";
    private int zzm;
    private zzgkz zzn = zzgkq.zzaJ();
    private byte zzo = 2;

    static {
        zzgpk zzgpk = new zzgpk();
        zzb = zzgpk;
        zzgkq.zzaP(zzgpk.class, zzgpk);
    }

    private zzgpk() {
    }

    public static zzgpj zzc() {
        return (zzgpj) zzb.zzay();
    }

    static /* synthetic */ void zzf(zzgpk zzgpk, int i) {
        zzgpk.zze |= 1;
        zzgpk.zzf = i;
    }

    static /* synthetic */ void zzg(zzgpk zzgpk, String str) {
        str.getClass();
        zzgpk.zze |= 2;
        zzgpk.zzg = str;
    }

    static /* synthetic */ void zzh(zzgpk zzgpk, zzgox zzgox) {
        zzgox.getClass();
        zzgpk.zzh = zzgox;
        zzgpk.zze |= 4;
    }

    static /* synthetic */ void zzi(zzgpk zzgpk, String str) {
        str.getClass();
        zzgkz zzgkz = zzgpk.zzn;
        if (!zzgkz.zzc()) {
            zzgpk.zzn = zzgkq.zzaK(zzgkz);
        }
        zzgpk.zzn.add(str);
    }

    static /* synthetic */ void zzj(zzgpk zzgpk, int i) {
        zzgpk.zzm = i - 1;
        zzgpk.zze |= 64;
    }

    public final int zza() {
        return this.zzn.size();
    }

    public final String zze() {
        return this.zzg;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzo);
        }
        byte b = 1;
        if (i2 == 2) {
            return zzaO(zzb, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001ᔄ\u0000\u0002ဈ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005င\u0004\u0006\u0016\u0007ဈ\u0005\bဌ\u0006\t\u001a", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", zzgph.zza, "zzn"});
        } else if (i2 == 3) {
            return new zzgpk();
        } else {
            if (i2 == 4) {
                return new zzgpj((zzgoc) null);
            }
            if (i2 == 5) {
                return zzb;
            }
            if (obj == null) {
                b = 0;
            }
            this.zzo = b;
            return null;
        }
    }
}
