package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdwg {
    final /* synthetic */ zzdwh zza;
    private final Map zzb = new ConcurrentHashMap();

    zzdwg(zzdwh zzdwh) {
        this.zza = zzdwh;
    }

    public final zzdwg zzb(String str, String str2) {
        this.zzb.put(str, str2);
        return this;
    }

    public final zzdwg zzc(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.zzb.put(str, str2);
        }
        return this;
    }

    public final zzdwg zzd(zzfbl zzfbl) {
        this.zzb.put("aai", zzfbl.zzx);
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzfX)).booleanValue()) {
            zzc("rid", zzfbl.zzap);
        }
        return this;
    }

    public final zzdwg zze(zzfbo zzfbo) {
        this.zzb.put("gqi", zzfbo.zzb);
        return this;
    }

    public final String zzf() {
        return this.zza.zza.zzb(this.zzb);
    }

    public final void zzg() {
        this.zza.zzb.execute(new zzdwf(this));
    }

    public final void zzh() {
        this.zza.zzb.execute(new zzdwe(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzi() {
        this.zza.zza.zze(this.zzb);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzj() {
        this.zza.zza.zzd(this.zzb);
    }
}
