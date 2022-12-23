package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfec {
    private final HashMap zza = new HashMap();

    public final zzfeb zza(zzfds zzfds, Context context, zzfdk zzfdk, zzfei zzfei) {
        zzfeb zzfeb = (zzfeb) this.zza.get(zzfds);
        if (zzfeb != null) {
            return zzfeb;
        }
        zzfdp zzfdp = new zzfdp(zzfdv.zza(zzfds, context));
        zzfeb zzfeb2 = new zzfeb(zzfdp, new zzfek(zzfdp, zzfdk, zzfei));
        this.zza.put(zzfds, zzfeb2);
        return zzfeb2;
    }
}
