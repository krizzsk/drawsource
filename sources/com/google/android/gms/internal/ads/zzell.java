package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzbf;
import com.google.android.gms.ads.internal.client.zzbl;
import com.google.android.gms.ads.internal.client.zzbn;
import com.google.android.gms.ads.internal.client.zzcd;
import com.google.android.gms.ads.internal.client.zzq;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzell extends zzbn {
    final zzfcb zza = new zzfcb();
    final zzdnq zzb = new zzdnq();
    private final Context zzc;
    private final zzcnf zzd;
    private zzbf zze;

    public zzell(zzcnf zzcnf, Context context, String str) {
        this.zzd = zzcnf;
        this.zza.zzs(str);
        this.zzc = context;
    }

    public final zzbl zze() {
        zzdns zzg = this.zzb.zzg();
        this.zza.zzB(zzg.zzi());
        this.zza.zzC(zzg.zzh());
        zzfcb zzfcb = this.zza;
        if (zzfcb.zzg() == null) {
            zzfcb.zzr(zzq.zzc());
        }
        return new zzelm(this.zzc, this.zzd, this.zza, zzg, this.zze);
    }

    public final void zzf(zzblz zzblz) {
        this.zzb.zza(zzblz);
    }

    public final void zzg(zzbmc zzbmc) {
        this.zzb.zzb(zzbmc);
    }

    public final void zzh(String str, zzbmi zzbmi, zzbmf zzbmf) {
        this.zzb.zzc(str, zzbmi, zzbmf);
    }

    public final void zzi(zzbrb zzbrb) {
        this.zzb.zzd(zzbrb);
    }

    public final void zzj(zzbmm zzbmm, zzq zzq) {
        this.zzb.zze(zzbmm);
        this.zza.zzr(zzq);
    }

    public final void zzk(zzbmp zzbmp) {
        this.zzb.zzf(zzbmp);
    }

    public final void zzl(zzbf zzbf) {
        this.zze = zzbf;
    }

    public final void zzm(AdManagerAdViewOptions adManagerAdViewOptions) {
        this.zza.zzq(adManagerAdViewOptions);
    }

    public final void zzn(zzbqs zzbqs) {
        this.zza.zzv(zzbqs);
    }

    public final void zzo(zzbkp zzbkp) {
        this.zza.zzA(zzbkp);
    }

    public final void zzp(PublisherAdViewOptions publisherAdViewOptions) {
        this.zza.zzD(publisherAdViewOptions);
    }

    public final void zzq(zzcd zzcd) {
        this.zza.zzQ(zzcd);
    }
}
