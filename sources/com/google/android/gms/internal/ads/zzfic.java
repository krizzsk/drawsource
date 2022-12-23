package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfic extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzfic zzb;
    /* access modifiers changed from: private */
    public zzgkz zze = zzaJ();

    static {
        zzfic zzfic = new zzfic();
        zzb = zzfic;
        zzgkq.zzaP(zzfic.class, zzfic);
    }

    private zzfic() {
    }

    public static zzfhz zzc() {
        return (zzfhz) zzb.zzay();
    }

    static /* synthetic */ void zzf(zzfic zzfic, zzfib zzfib) {
        zzfib.getClass();
        zzgkz zzgkz = zzfic.zze;
        if (!zzgkz.zzc()) {
            zzfic.zze = zzgkq.zzaK(zzgkz);
        }
        zzfic.zze.add(zzfib);
    }

    public final int zza() {
        return this.zze.size();
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zze", zzfib.class});
        } else if (i2 == 3) {
            return new zzfic();
        } else {
            if (i2 == 4) {
                return new zzfhz((zzfhy) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }
}
