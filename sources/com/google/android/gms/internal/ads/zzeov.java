package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzeov implements zzfok {
    public static final /* synthetic */ zzeov zza = new zzeov();

    private /* synthetic */ zzeov() {
    }

    public final Object apply(Object obj) {
        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
        return new zzeoz(appSetIdInfo.getId(), appSetIdInfo.getScope());
    }
}
