package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzdoj implements zzbom {
    public final /* synthetic */ zzdok zza;
    public final /* synthetic */ zzbmv zzb;

    public /* synthetic */ zzdoj(zzdok zzdok, zzbmv zzbmv) {
        this.zza = zzdok;
        this.zzb = zzbmv;
    }

    public final void zza(Object obj, Map map) {
        zzdok zzdok = this.zza;
        zzbmv zzbmv = this.zzb;
        try {
            zzdok.zzb = Long.valueOf(Long.parseLong((String) map.get("timestamp")));
        } catch (NumberFormatException unused) {
            zze.zzg("Failed to call parse unconfirmedClickTimestamp.");
        }
        zzdok.zza = (String) map.get("id");
        String str = (String) map.get("asset_id");
        if (zzbmv == null) {
            zze.zze("Received unconfirmed click but UnconfirmedClickListener is null.");
            return;
        }
        try {
            zzbmv.zzf(str);
        } catch (RemoteException e) {
            zzcfi.zzl("#007 Could not call remote method.", e);
        }
    }
}
