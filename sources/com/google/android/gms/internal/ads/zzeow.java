package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzeow implements zzfuj {
    public static final /* synthetic */ zzeow zza = new zzeow();

    private /* synthetic */ zzeow() {
    }

    public final zzfvl zza(Object obj) {
        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
        if (appSetIdInfo == null) {
            return zzfvc.zzi(new zzeoz((String) null, -1));
        }
        return zzfvc.zzi(new zzeoz(appSetIdInfo.getId(), appSetIdInfo.getScope()));
    }
}
