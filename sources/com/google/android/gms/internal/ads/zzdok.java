package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.google.android.gms.common.util.Clock;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdok implements View.OnClickListener {
    String zza;
    Long zzb;
    WeakReference zzc;
    private final zzdse zzd;
    private final Clock zze;
    private zzbmv zzf;
    private zzbom zzg;

    public zzdok(zzdse zzdse, Clock clock) {
        this.zzd = zzdse;
        this.zze = clock;
    }

    private final void zzd() {
        View view;
        this.zza = null;
        this.zzb = null;
        WeakReference weakReference = this.zzc;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            view.setClickable(false);
            view.setOnClickListener((View.OnClickListener) null);
            this.zzc = null;
        }
    }

    public final void onClick(View view) {
        WeakReference weakReference = this.zzc;
        if (weakReference != null && weakReference.get() == view) {
            if (!(this.zza == null || this.zzb == null)) {
                HashMap hashMap = new HashMap();
                hashMap.put("id", this.zza);
                hashMap.put(SDKConstants.PARAM_A2U_TIME_INTERVAL, String.valueOf(this.zze.currentTimeMillis() - this.zzb.longValue()));
                hashMap.put("messageType", "onePointFiveClick");
                this.zzd.zzg("sendMessageToNativeJs", hashMap);
            }
            zzd();
        }
    }

    public final zzbmv zza() {
        return this.zzf;
    }

    public final void zzb() {
        if (this.zzf != null && this.zzb != null) {
            zzd();
            try {
                this.zzf.zze();
            } catch (RemoteException e) {
                zzcfi.zzl("#007 Could not call remote method.", e);
            }
        }
    }

    public final void zzc(zzbmv zzbmv) {
        this.zzf = zzbmv;
        zzbom zzbom = this.zzg;
        if (zzbom != null) {
            this.zzd.zzk("/unconfirmedClick", zzbom);
        }
        zzdoj zzdoj = new zzdoj(this, zzbmv);
        this.zzg = zzdoj;
        this.zzd.zzi("/unconfirmedClick", zzdoj);
    }
}
