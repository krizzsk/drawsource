package com.google.android.gms.internal.ads;

import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzaqp implements PackageManager.OnChecksumsReadyListener {
    public final /* synthetic */ zzfvt zza;

    public /* synthetic */ zzaqp(zzfvt zzfvt) {
        this.zza = zzfvt;
    }

    public final void onChecksumsReady(List list) {
        zzfvt zzfvt = this.zza;
        if (list == null) {
            zzfvt.zzd((Object) null);
            return;
        }
        try {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ApkChecksum apkChecksum = (ApkChecksum) list.get(i);
                if (apkChecksum.getType() == 8) {
                    zzfvt.zzd(zzapf.zzc(apkChecksum.getValue()));
                    return;
                }
            }
            zzfvt.zzd((Object) null);
        } catch (Throwable unused) {
            zzfvt.zzd((Object) null);
        }
    }
}
