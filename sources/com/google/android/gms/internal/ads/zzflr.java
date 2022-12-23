package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzflr extends zzgkq implements zzgmb {
    private static final zzgkw zzb = new zzflo();
    /* access modifiers changed from: private */
    public static final zzflr zze;
    private int zzf;
    private zzgkv zzg = zzaG();
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        zzflr zzflr = new zzflr();
        zze = zzflr;
        zzgkq.zzaP(zzflr.class, zzflr);
    }

    private zzflr() {
    }

    public static zzflq zza() {
        return (zzflq) zze.zzay();
    }

    static /* synthetic */ void zzd(zzflr zzflr, String str) {
        str.getClass();
        zzflr.zzf |= 1;
        zzflr.zzh = str;
    }

    static /* synthetic */ void zze(zzflr zzflr, int i) {
        zzgkv zzgkv = zzflr.zzg;
        if (!zzgkv.zzc()) {
            zzflr.zzg = zzgkq.zzaH(zzgkv);
        }
        zzflr.zzg.zzh(2);
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zze, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001e\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zzf", "zzg", zzflp.zza, "zzh", "zzi", "zzj"});
        } else if (i2 == 3) {
            return new zzflr();
        } else {
            if (i2 == 4) {
                return new zzflq((zzflo) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zze;
        }
    }
}
