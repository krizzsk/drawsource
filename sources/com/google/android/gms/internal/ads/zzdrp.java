package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdrp implements zzbom {
    private final zzbmf zza;
    private final zzdse zzb;
    private final zzgqo zzc;

    public zzdrp(zzdns zzdns, zzdnh zzdnh, zzdse zzdse, zzgqo zzgqo) {
        this.zza = zzdns.zzc(zzdnh.zzy());
        this.zzb = zzdse;
        this.zzc = zzgqo;
    }

    public final void zza(Object obj, Map map) {
        String str = (String) map.get("asset");
        try {
            this.zza.zze((zzblv) this.zzc.zzb(), str);
        } catch (RemoteException e) {
            zze.zzk("Failed to call onCustomClick for asset " + str + ".", e);
        }
    }

    public final void zzb() {
        if (this.zza != null) {
            this.zzb.zzi("/nativeAdCustomClick", this);
        }
    }
}
