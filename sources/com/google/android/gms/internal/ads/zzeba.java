package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzeba extends zzeay {
    zzeba(Context context) {
        this.zzf = new zzbzg(context, zzt.zzt().zzb(), this, this);
    }

    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    this.zzf.zzp().zzf(this.zze, new zzeax(this));
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.zza.zze(new zzebn(1));
                } catch (Throwable th) {
                    zzt.zzo().zzt(th, "RemoteSignalsClientTask.onConnected");
                    this.zza.zze(new zzebn(1));
                }
            }
        }
    }
}
