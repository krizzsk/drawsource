package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Future;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzbdi {
    /* access modifiers changed from: private */
    public zzbcx zza;
    /* access modifiers changed from: private */
    public boolean zzb;
    private final Context zzc;
    /* access modifiers changed from: private */
    public final Object zzd = new Object();

    zzbdi(Context context) {
        this.zzc = context;
    }

    /* access modifiers changed from: package-private */
    public final Future zzc(zzbcy zzbcy) {
        zzbdc zzbdc = new zzbdc(this);
        zzbdg zzbdg = new zzbdg(this, zzbcy, zzbdc);
        zzbdh zzbdh = new zzbdh(this, zzbdc);
        synchronized (this.zzd) {
            zzbcx zzbcx = new zzbcx(this.zzc, zzt.zzt().zzb(), zzbdg, zzbdh);
            this.zza = zzbcx;
            zzbcx.checkAvailabilityAndConnect();
        }
        return zzbdc;
    }

    static /* bridge */ /* synthetic */ void zze(zzbdi zzbdi) {
        synchronized (zzbdi.zzd) {
            zzbcx zzbcx = zzbdi.zza;
            if (zzbcx != null) {
                zzbcx.disconnect();
                zzbdi.zza = null;
                Binder.flushPendingCommands();
            }
        }
    }
}
