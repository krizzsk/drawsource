package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzgch extends zzgkq implements zzgmb {
    /* access modifiers changed from: private */
    public static final zzgch zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzgcn zzf;
    /* access modifiers changed from: private */
    public zzgji zzg = zzgji.zzb;

    static {
        zzgch zzgch = new zzgch();
        zzb = zzgch;
        zzgkq.zzaP(zzgch.class, zzgch);
    }

    private zzgch() {
    }

    public static zzgcg zzc() {
        return (zzgcg) zzb.zzay();
    }

    public static zzgch zze(zzgji zzgji, zzgkc zzgkc) throws zzglc {
        return (zzgch) zzgkq.zzaD(zzb, zzgji, zzgkc);
    }

    static /* synthetic */ void zzi(zzgch zzgch, zzgcn zzgcn) {
        zzgcn.getClass();
        zzgch.zzf = zzgcn;
    }

    public final int zza() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    public final Object zzb(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzaO(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
        } else if (i2 == 3) {
            return new zzgch();
        } else {
            if (i2 == 4) {
                return new zzgcg((zzgcf) null);
            }
            if (i2 != 5) {
                return null;
            }
            return zzb;
        }
    }

    public final zzgcn zzf() {
        zzgcn zzgcn = this.zzf;
        return zzgcn == null ? zzgcn.zze() : zzgcn;
    }

    public final zzgji zzg() {
        return this.zzg;
    }
}
