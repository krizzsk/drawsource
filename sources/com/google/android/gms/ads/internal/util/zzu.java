package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbhz;
import com.google.android.gms.internal.ads.zzcfb;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public class zzu extends zzt {
    static final boolean zzf(int i, int i2, int i3) {
        return Math.abs(i - i2) <= i3;
    }

    public final boolean zze(Activity activity, Configuration configuration) {
        if (!((Boolean) zzay.zzc().zzb(zzbhz.zzdR)).booleanValue()) {
            return false;
        }
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzdT)).booleanValue()) {
            return activity.isInMultiWindowMode();
        }
        zzaw.zzb();
        int zzw = zzcfb.zzw(activity, configuration.screenHeightDp);
        int zzw2 = zzcfb.zzw(activity, configuration.screenWidthDp);
        zzt.zzp();
        DisplayMetrics zzr = zzs.zzr((WindowManager) activity.getApplicationContext().getSystemService("window"));
        int i = zzr.heightPixels;
        int i2 = zzr.widthPixels;
        int identifier = activity.getResources().getIdentifier("status_bar_height", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? activity.getResources().getDimensionPixelSize(identifier) : 0;
        int round = ((int) Math.round(((double) activity.getResources().getDisplayMetrics().density) + 0.5d)) * ((Integer) zzay.zzc().zzb(zzbhz.zzdP)).intValue();
        if (!zzf(i, zzw + dimensionPixelSize, round)) {
            return true;
        }
        if (zzf(i2, zzw2, round)) {
            return false;
        }
        return true;
    }
}
