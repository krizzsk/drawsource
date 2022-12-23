package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.formats.AdManagerAdViewOptions;
import com.google.android.gms.ads.formats.NativeAdOptions;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.ads.internal.client.zzbz;
import com.google.android.gms.ads.internal.client.zzcd;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.ads.internal.util.zzs;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfcd {
    public final zzff zza;
    public final zzbqs zzb;
    public final zzemh zzc;
    public final zzl zzd;
    public final zzq zze;
    public final String zzf;
    public final ArrayList zzg;
    public final ArrayList zzh;
    public final zzbkp zzi;
    public final zzw zzj;
    public final int zzk;
    public final AdManagerAdViewOptions zzl;
    public final PublisherAdViewOptions zzm;
    public final zzbz zzn;
    public final zzfbt zzo;
    public final boolean zzp;
    public final boolean zzq;
    public final zzcd zzr;

    /* synthetic */ zzfcd(zzfcb zzfcb, zzfcc zzfcc) {
        zzff zzff;
        zzbkp zzbkp;
        this.zze = zzfcb.zzb;
        this.zzf = zzfcb.zzc;
        this.zzr = zzfcb.zzs;
        int i = zzfcb.zza.zza;
        long j = zzfcb.zza.zzb;
        Bundle bundle = zzfcb.zza.zzc;
        int i2 = zzfcb.zza.zzd;
        List list = zzfcb.zza.zze;
        boolean z = zzfcb.zza.zzf;
        int i3 = zzfcb.zza.zzg;
        boolean z2 = true;
        if (!zzfcb.zza.zzh && !zzfcb.zze) {
            z2 = false;
        }
        this.zzd = new zzl(i, j, bundle, i2, list, z, i3, z2, zzfcb.zza.zzi, zzfcb.zza.zzj, zzfcb.zza.zzk, zzfcb.zza.zzl, zzfcb.zza.zzm, zzfcb.zza.zzn, zzfcb.zza.zzo, zzfcb.zza.zzp, zzfcb.zza.zzq, zzfcb.zza.zzr, zzfcb.zza.zzs, zzfcb.zza.zzt, zzfcb.zza.zzu, zzfcb.zza.zzv, zzs.zza(zzfcb.zza.zzw), zzfcb.zza.zzx);
        if (zzfcb.zzd != null) {
            zzff = zzfcb.zzd;
        } else {
            zzff = zzfcb.zzh != null ? zzfcb.zzh.zzf : null;
        }
        this.zza = zzff;
        this.zzg = zzfcb.zzf;
        this.zzh = zzfcb.zzg;
        if (zzfcb.zzf == null) {
            zzbkp = null;
        } else {
            zzbkp = zzfcb.zzh == null ? new zzbkp(new NativeAdOptions.Builder().build()) : zzfcb.zzh;
        }
        this.zzi = zzbkp;
        this.zzj = zzfcb.zzi;
        this.zzk = zzfcb.zzm;
        this.zzl = zzfcb.zzj;
        this.zzm = zzfcb.zzk;
        this.zzn = zzfcb.zzl;
        this.zzb = zzfcb.zzn;
        this.zzo = new zzfbt(zzfcb.zzo, (zzfbs) null);
        this.zzp = zzfcb.zzp;
        this.zzc = zzfcb.zzq;
        this.zzq = zzfcb.zzr;
    }

    public final zzbms zza() {
        PublisherAdViewOptions publisherAdViewOptions = this.zzm;
        if (publisherAdViewOptions == null && this.zzl == null) {
            return null;
        }
        if (publisherAdViewOptions != null) {
            return publisherAdViewOptions.zzb();
        }
        return this.zzl.zza();
    }
}
