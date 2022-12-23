package com.google.android.gms.internal.ads;

import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzeor implements zzfok {
    public static final /* synthetic */ zzeor zza = new zzeor();

    private /* synthetic */ zzeor() {
    }

    public final Object apply(Object obj) {
        ArrayList arrayList = (ArrayList) obj;
        if (arrayList.isEmpty()) {
            return null;
        }
        return new zzeos(arrayList);
    }
}
