package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
public final class zzcbo implements RewardItem {
    private final zzcbb zza;

    public zzcbo(zzcbb zzcbb) {
        this.zza = zzcbb;
    }

    public final int getAmount() {
        zzcbb zzcbb = this.zza;
        if (zzcbb != null) {
            try {
                return zzcbb.zze();
            } catch (RemoteException e) {
                zzcfi.zzk("Could not forward getAmount to RewardItem", e);
            }
        }
        return 0;
    }

    public final String getType() {
        zzcbb zzcbb = this.zza;
        if (zzcbb != null) {
            try {
                return zzcbb.zzf();
            } catch (RemoteException e) {
                zzcfi.zzk("Could not forward getType to RewardItem", e);
            }
        }
        return null;
    }
}
