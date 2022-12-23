package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.DialogInterface;
import com.google.android.gms.ads.internal.overlay.zzl;
import com.tapjoy.TapjoyConstants;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzeex implements DialogInterface.OnClickListener {
    public final /* synthetic */ zzees zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzdwh zzc;
    public final /* synthetic */ Activity zzd;
    public final /* synthetic */ zzfgp zze;
    public final /* synthetic */ zzl zzf;

    public /* synthetic */ zzeex(zzees zzees, String str, zzdwh zzdwh, Activity activity, zzfgp zzfgp, zzl zzl) {
        this.zza = zzees;
        this.zzb = str;
        this.zzc = zzdwh;
        this.zzd = activity;
        this.zze = zzfgp;
        this.zzf = zzl;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        zzees zzees = this.zza;
        String str = this.zzb;
        zzdwh zzdwh = this.zzc;
        Activity activity = this.zzd;
        zzfgp zzfgp = this.zze;
        zzl zzl = this.zzf;
        zzees.zzc(str);
        if (zzdwh != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("dialog_action", TapjoyConstants.TJC_FULLSCREEN_AD_DISMISS_URL);
            zzefa.zzd(activity, zzdwh, zzfgp, zzees, str, "dialog_click", hashMap);
        }
        if (zzl != null) {
            zzl.zzb();
        }
    }
}
