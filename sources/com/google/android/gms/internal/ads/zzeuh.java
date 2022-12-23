package com.google.android.gms.internal.ads;

import com.google.android.gms.appset.AppSetIdInfo;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzeuh implements zzfuj {
    public static final /* synthetic */ zzeuh zza = new zzeuh();

    private /* synthetic */ zzeuh() {
    }

    public final zzfvl zza(Object obj) {
        AppSetIdInfo appSetIdInfo = (AppSetIdInfo) obj;
        if (appSetIdInfo == null) {
            return zzfvc.zzi(new zzeuk((String) null, -1));
        }
        return zzfvc.zzi(new zzeuk(appSetIdInfo.getId(), appSetIdInfo.getScope()));
    }
}
