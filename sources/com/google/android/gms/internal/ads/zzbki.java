package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
public final class zzbki {
    private final Context zza;

    public zzbki(Context context) {
        this.zza = context;
    }

    public final void zza(zzbzf zzbzf) {
        try {
            ((zzbkj) zzcfm.zzb(this.zza, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", zzbkh.zza)).zze(zzbzf);
        } catch (zzcfl e) {
            zzcfi.zzj("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e.getMessage())));
        } catch (RemoteException e2) {
            zzcfi.zzj("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e2.getMessage())));
        }
    }
}
