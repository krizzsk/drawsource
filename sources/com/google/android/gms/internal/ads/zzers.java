package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzers implements zzetg, zzetf {
    private final ApplicationInfo zza;
    private final PackageInfo zzb;

    zzers(ApplicationInfo applicationInfo, PackageInfo packageInfo) {
        this.zza = applicationInfo;
        this.zzb = packageInfo;
    }

    public final int zza() {
        return 29;
    }

    public final zzfvl zzb() {
        return zzfvc.zzi(this);
    }

    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Integer num;
        Bundle bundle = (Bundle) obj;
        String str = this.zza.packageName;
        PackageInfo packageInfo = this.zzb;
        String str2 = null;
        if (packageInfo == null) {
            num = null;
        } else {
            num = Integer.valueOf(packageInfo.versionCode);
        }
        bundle.putString("pn", str);
        if (num != null) {
            bundle.putInt("vc", num.intValue());
        }
        PackageInfo packageInfo2 = this.zzb;
        if (packageInfo2 != null) {
            str2 = packageInfo2.versionName;
        }
        if (str2 != null) {
            bundle.putString("vnm", str2);
        }
    }
}
