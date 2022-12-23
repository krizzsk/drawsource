package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzfuk extends zzfum {
    zzfuk(zzfre zzfre, boolean z) {
        super(zzfre, true);
        zzw();
    }

    public final /* bridge */ /* synthetic */ Object zzG(List list) {
        ArrayList zza = zzfrx.zza(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzful zzful = (zzful) it.next();
            zza.add(zzful != null ? zzful.zza : null);
        }
        return Collections.unmodifiableList(zza);
    }
}
