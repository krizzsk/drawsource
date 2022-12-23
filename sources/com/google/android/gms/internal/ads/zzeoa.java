package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.common.internal.Preconditions;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzeoa implements zzetf {
    public final zzq zza;
    public final String zzb;
    public final boolean zzc;
    public final String zzd;
    public final float zze;
    public final int zzf;
    public final int zzg;
    public final String zzh;
    public final boolean zzi;

    public zzeoa(zzq zzq, String str, boolean z, String str2, float f, int i, int i2, String str3, boolean z2) {
        Preconditions.checkNotNull(zzq, "the adSize must not be null");
        this.zza = zzq;
        this.zzb = str;
        this.zzc = z;
        this.zzd = str2;
        this.zze = f;
        this.zzf = i;
        this.zzg = i2;
        this.zzh = str3;
        this.zzi = z2;
    }

    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        zzfco.zzg(bundle, "smart_w", "full", this.zza.zze == -1);
        zzfco.zzg(bundle, "smart_h", "auto", this.zza.zzb == -2);
        zzfco.zze(bundle, "ene", true, this.zza.zzj);
        zzfco.zzg(bundle, "rafmt", "102", this.zza.zzm);
        zzfco.zzg(bundle, "rafmt", "103", this.zza.zzn);
        zzfco.zzg(bundle, "rafmt", "105", this.zza.zzo);
        zzfco.zze(bundle, "inline_adaptive_slot", true, this.zzi);
        zzfco.zze(bundle, "interscroller_slot", true, this.zza.zzo);
        zzfco.zzc(bundle, "format", this.zzb);
        zzfco.zzg(bundle, "fluid", "height", this.zzc);
        String str = this.zzd;
        zzfco.zzg(bundle, "sz", str, !TextUtils.isEmpty(str));
        bundle.putFloat("u_sd", this.zze);
        bundle.putInt("sw", this.zzf);
        bundle.putInt(CampaignUnit.JSON_KEY_SH, this.zzg);
        String str2 = this.zzh;
        zzfco.zzg(bundle, "sc", str2, true ^ TextUtils.isEmpty(str2));
        ArrayList arrayList = new ArrayList();
        zzq[] zzqArr = this.zza.zzg;
        if (zzqArr == null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("height", this.zza.zzb);
            bundle2.putInt("width", this.zza.zze);
            bundle2.putBoolean("is_fluid_height", this.zza.zzi);
            arrayList.add(bundle2);
        } else {
            for (zzq zzq : zzqArr) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean("is_fluid_height", zzq.zzi);
                bundle3.putInt("height", zzq.zzb);
                bundle3.putInt("width", zzq.zze);
                arrayList.add(bundle3);
            }
        }
        bundle.putParcelableArrayList("valid_ad_sizes", arrayList);
    }
}
