package com.google.android.gms.internal.ads;

import java.util.Comparator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzum implements Comparator {
    public static final /* synthetic */ zzum zza = new zzum();

    private /* synthetic */ zzum() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((zzuy) ((List) obj).get(0)).compareTo((zzuy) ((List) obj2).get(0));
    }
}
