package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzgls implements zzgmu {
    private static final zzgly zza = new zzglq();
    private final zzgly zzb;

    public zzgls() {
        zzgly zzgly;
        zzgly[] zzglyArr = new zzgly[2];
        zzglyArr[0] = zzgkl.zza();
        try {
            zzgly = (zzgly) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception unused) {
            zzgly = zza;
        }
        zzglyArr[1] = zzgly;
        zzglr zzglr = new zzglr(zzglyArr);
        zzgla.zzf(zzglr, "messageInfoFactory");
        this.zzb = zzglr;
    }

    private static boolean zzb(zzglx zzglx) {
        return zzglx.zzc() == 1;
    }

    public final zzgmt zza(Class cls) {
        zzgmv.zzG(cls);
        zzglx zzb2 = this.zzb.zzb(cls);
        if (zzb2.zzb()) {
            if (zzgkq.class.isAssignableFrom(cls)) {
                return zzgme.zzc(zzgmv.zzB(), zzgkf.zzb(), zzb2.zza());
            }
            return zzgme.zzc(zzgmv.zzz(), zzgkf.zza(), zzb2.zza());
        } else if (zzgkq.class.isAssignableFrom(cls)) {
            if (zzb(zzb2)) {
                return zzgmd.zzl(cls, zzb2, zzgmg.zzb(), zzglo.zze(), zzgmv.zzB(), zzgkf.zzb(), zzglw.zzb());
            }
            return zzgmd.zzl(cls, zzb2, zzgmg.zzb(), zzglo.zze(), zzgmv.zzB(), (zzgkd) null, zzglw.zzb());
        } else if (zzb(zzb2)) {
            return zzgmd.zzl(cls, zzb2, zzgmg.zza(), zzglo.zzd(), zzgmv.zzz(), zzgkf.zza(), zzglw.zza());
        } else {
            return zzgmd.zzl(cls, zzb2, zzgmg.zza(), zzglo.zzd(), zzgmv.zzA(), (zzgkd) null, zzglw.zza());
        }
    }
}
