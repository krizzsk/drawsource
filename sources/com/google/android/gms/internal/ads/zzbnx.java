package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zze;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzbnx implements zzbom {
    public static final /* synthetic */ zzbnx zza = new zzbnx();

    private /* synthetic */ zzbnx() {
    }

    public final void zza(Object obj, Map map) {
        zzcmj zzcmj = (zzcmj) obj;
        zzbom zzbom = zzbol.zza;
        String str = (String) map.get("urls");
        if (TextUtils.isEmpty(str)) {
            zze.zzj("URLs missing in canOpenURLs GMSG.");
            return;
        }
        String[] split = str.split(",");
        HashMap hashMap = new HashMap();
        PackageManager packageManager = zzcmj.getContext().getPackageManager();
        for (String str2 : split) {
            String[] split2 = str2.split(";", 2);
            boolean z = true;
            if (packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) == null) {
                z = false;
            }
            Boolean valueOf = Boolean.valueOf(z);
            hashMap.put(str2, valueOf);
            zze.zza("/canOpenURLs;" + str2 + ";" + valueOf);
        }
        ((zzbrd) zzcmj).zzd("openableURLs", hashMap);
    }
}
