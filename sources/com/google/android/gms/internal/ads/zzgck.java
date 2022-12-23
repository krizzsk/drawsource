package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgck extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzgck zzb;
    private zzgcn zze;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        zzgck zzgck = new zzgck();
        zzb = zzgck;
        zzgkq.zzaP(zzgck.class, zzgck);
    }

    private zzgck() {
    }

    public static zzgcj zzc() {
        return (zzgcj) zzb.zzay();
    }

    public static zzgck zze(zzgji zzgji, zzgkc zzgkc) throws zzglc {
        return (zzgck) zzgkq.zzaD(zzb, zzgji, zzgkc);
    }

    static /* synthetic */ void zzg(zzgck zzgck, zzgcn zzgcn) {
        zzgcn.getClass();
        zzgck.zze = zzgcn;
    }

    public final int zza() {
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zze", "zzf"});
        } else if (i2 == 3) {
            return new zzgck();
        } else {
            if (i2 == 4) {
                return new zzgcj((zzgci) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgcn zzf() {
        zzgcn zzgcn = this.zze;
        return zzgcn == null ? zzgcn.zze() : zzgcn;
    }
}
