package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.0.0 */
final class zzid implements zzls {
    final /* synthetic */ zzip zza;

    zzid(zzip zzip) {
        this.zza = zzip;
    }

    public final void zza(String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            this.zza.zzG("auto", "_err", bundle, str);
        } else {
            this.zza.zzE("auto", "_err", bundle);
        }
    }
}
