package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;
import com.vungle.warren.model.CookieDBAdapter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzctf implements zzcsp {
    private final CookieManager zza;

    public zzctf(Context context) {
        this.zza = zzt.zzq().zzb(context);
    }

    public final void zza(Map map) {
        if (this.zza != null) {
            if (((String) map.get("clear")) != null) {
                String str = (String) zzay.zzc().zzb(zzbhz.zzaH);
                String cookie = this.zza.getCookie(str);
                if (cookie != null) {
                    List zzf = zzfpg.zzc(zzfoh.zzc(';')).zzf(cookie);
                    int i = 0;
                    while (i < zzf.size()) {
                        CookieManager cookieManager = this.zza;
                        Iterator it = zzfpg.zzc(zzfoh.zzc('=')).zzd((String) zzf.get(i)).iterator();
                        if (it == null) {
                            throw null;
                        } else if (it.hasNext()) {
                            cookieManager.setCookie(str, String.valueOf((String) it.next()).concat(String.valueOf((String) zzay.zzc().zzb(zzbhz.zzau))));
                            i++;
                        } else {
                            throw new IndexOutOfBoundsException("position (0) must be less than the number of elements that remained (" + 0 + ")");
                        }
                    }
                    return;
                }
                return;
            }
            String str2 = (String) map.get(CookieDBAdapter.CookieColumns.TABLE_NAME);
            if (!TextUtils.isEmpty(str2)) {
                this.zza.setCookie((String) zzay.zzc().zzb(zzbhz.zzaH), str2);
            }
        }
    }
}
