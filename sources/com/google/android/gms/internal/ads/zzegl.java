package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdk;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzegl implements zzcxv {
    public final /* synthetic */ zzefg zza;

    public /* synthetic */ zzegl(zzefg zzefg) {
        this.zza = zzefg;
    }

    public final zzdk zza() {
        try {
            return ((zzbvt) this.zza.zzb).zze();
        } catch (RemoteException e) {
            throw new zzfci(e);
        }
    }
}
