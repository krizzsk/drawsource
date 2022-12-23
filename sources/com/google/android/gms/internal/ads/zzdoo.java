package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzdoo implements zzbom {
    public final /* synthetic */ zzdos zza;

    public /* synthetic */ zzdoo(zzdos zzdos) {
        this.zza = zzdos;
    }

    public final void zza(Object obj, Map map) {
        zzcli zzcli = (zzcli) obj;
        zzcli.zzP().zzz(new zzdor(this.zza, map));
        String str = (String) map.get("overlayHtml");
        String str2 = (String) map.get("baseUrl");
        if (TextUtils.isEmpty(str2)) {
            zzcli.loadData(str, "text/html", "UTF-8");
        } else {
            zzcli.loadDataWithBaseURL(str2, str, "text/html", "UTF-8", (String) null);
        }
    }
}
