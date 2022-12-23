package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.PackageManager;
import com.google.android.gms.common.wrappers.Wrappers;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzeac implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;

    public zzeac(zzgrh zzgrh, zzgrh zzgrh2) {
        this.zza = zzgrh;
        this.zzb = zzgrh2;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return Wrappers.packageManager((Context) this.zza.zzb()).getPackageInfo(((zzdzx) this.zzb).zzb().packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
