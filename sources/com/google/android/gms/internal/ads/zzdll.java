package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.util.zze;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdll implements zzdbt, zzdiq {
    private final zzccv zza;
    private final Context zzb;
    private final zzcdn zzc;
    private final View zzd;
    private String zze;
    private final zzbdw zzf;

    public zzdll(zzccv zzccv, Context context, zzcdn zzcdn, View view, zzbdw zzbdw) {
        this.zza = zzccv;
        this.zzb = context;
        this.zzc = zzcdn;
        this.zzd = view;
        this.zzf = zzbdw;
    }

    public final void zzbv() {
    }

    public final void zze() {
    }

    public final void zzf() {
        if (this.zzf != zzbdw.APP_OPEN) {
            String zzd2 = this.zzc.zzd(this.zzb);
            this.zze = zzd2;
            this.zze = String.valueOf(zzd2).concat(this.zzf == zzbdw.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial");
        }
    }

    public final void zzj() {
        this.zza.zzb(false);
    }

    public final void zzm() {
    }

    public final void zzo() {
        View view = this.zzd;
        if (!(view == null || this.zze == null)) {
            this.zzc.zzs(view.getContext(), this.zze);
        }
        this.zza.zzb(true);
    }

    @ParametersAreNonnullByDefault
    public final void zzp(zzcal zzcal, String str, String str2) {
        if (this.zzc.zzu(this.zzb)) {
            try {
                zzcdn zzcdn = this.zzc;
                Context context = this.zzb;
                zzcdn.zzo(context, zzcdn.zza(context), this.zza.zza(), zzcal.zzc(), zzcal.zzb());
            } catch (RemoteException e) {
                zze.zzk("Remote Exception to get reward item.", e);
            }
        }
    }

    public final void zzr() {
    }
}
