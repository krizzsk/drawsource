package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzui implements Comparator {
    public static final /* synthetic */ zzui zza = new zzui();

    private /* synthetic */ zzui() {
    }

    public final int compare(Object obj, Object obj2) {
        return ((zzup) Collections.max((List) obj)).compareTo((zzup) Collections.max((List) obj2));
    }
}
