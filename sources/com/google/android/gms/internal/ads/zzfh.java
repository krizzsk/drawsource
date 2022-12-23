package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.tapjoy.TJAdUnitConstants;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzfh implements zzfov {
    public static final /* synthetic */ zzfh zza = new zzfh();

    private /* synthetic */ zzfh() {
    }

    public final boolean zza(Object obj) {
        String str = (String) obj;
        if (str == null) {
            return false;
        }
        String zza2 = zzfoc.zza(str);
        if (!TextUtils.isEmpty(zza2)) {
            return (!zza2.contains("text") || zza2.contains("text/vtt")) && !zza2.contains(TJAdUnitConstants.String.HTML) && !zza2.contains("xml");
        }
        return false;
    }
}
