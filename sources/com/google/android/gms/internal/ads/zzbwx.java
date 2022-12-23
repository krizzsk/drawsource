package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
public final class zzbwx extends NativeAd.AdChoicesInfo {
    private final List zza = new ArrayList();
    private String zzb;

    public zzbwx(zzbkt zzbkt) {
        try {
            this.zzb = zzbkt.zzg();
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
            this.zzb = "";
        }
        try {
            for (Object next : zzbkt.zzh()) {
                zzblb zzg = next instanceof IBinder ? zzbla.zzg((IBinder) next) : null;
                if (zzg != null) {
                    this.zza.add(new zzbwz(zzg));
                }
            }
        } catch (RemoteException e2) {
            zzcfi.zzh("", e2);
        }
    }

    public final List<NativeAd.Image> getImages() {
        return this.zza;
    }

    public final CharSequence getText() {
        return this.zzb;
    }
}
