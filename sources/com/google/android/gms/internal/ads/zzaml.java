package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzaml extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzaml zzb;
    private int zze;
    private zzgkz zzf = zzaJ();
    private zzgji zzg = zzgji.zzb;
    private int zzh = 1;
    private int zzi = 1;

    static {
        zzaml zzaml = new zzaml();
        zzb = zzaml;
        zzgkq.zzaP(zzaml.class, zzaml);
    }

    private zzaml() {
    }

    public static zzamk zza() {
        return (zzamk) zzb.zzay();
    }

    static /* synthetic */ void zzd(zzaml zzaml, zzgji zzgji) {
        zzgkz zzgkz = zzaml.zzf;
        if (!zzgkz.zzc()) {
            zzaml.zzf = zzgkq.zzaK(zzgkz);
        }
        zzaml.zzf.add(zzgji);
    }

    static /* synthetic */ void zze(zzaml zzaml, zzgji zzgji) {
        zzaml.zze |= 1;
        zzaml.zzg = zzgji;
    }

    static /* synthetic */ void zzf(zzaml zzaml, int i) {
        zzaml.zzi = i - 1;
        zzaml.zze |= 4;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zzb, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002ည\u0000\u0003ဌ\u0001\u0004ဌ\u0002", new Object[]{"zze", "zzf", "zzg", "zzh", zzamf.zza, "zzi", zzamd.zza});
        } else if (i2 == 3) {
            return new zzaml();
        } else {
            if (i2 == 4) {
                return new zzamk((zzalh) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
