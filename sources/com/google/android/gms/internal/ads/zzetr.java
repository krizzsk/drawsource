package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzetr implements zzetg {
    private final zzfvm zza;
    private final Context zzb;

    public zzetr(zzfvm zzfvm, Context context) {
        this.zza = zzfvm;
        this.zzb = context;
    }

    public final int zza() {
        return 39;
    }

    public final zzfvl zzb() {
        return this.zza.zzb(new zzetq(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzetp zzc() throws Exception {
        int i;
        boolean z;
        int i2;
        TelephonyManager telephonyManager = (TelephonyManager) this.zzb.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int phoneType = telephonyManager.getPhoneType();
        zzt.zzp();
        int i3 = -1;
        if (zzs.zzx(this.zzb, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.zzb.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                int ordinal = activeNetworkInfo.getDetailedState().ordinal();
                i2 = type;
                i3 = ordinal;
            } else {
                i2 = -1;
            }
            z = connectivityManager.isActiveNetworkMetered();
            i = i3;
        } else {
            i = -1;
            z = false;
            i2 = -2;
        }
        return new zzetp(networkOperator, i2, zzt.zzq().zzl(this.zzb), phoneType, z, i);
    }
}
