package com.google.android.gms.internal.ads;

import java.util.Iterator;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzfrq extends zzfpm {
    final /* synthetic */ Iterator zza;
    final /* synthetic */ zzfov zzb;

    zzfrq(Iterator it, zzfov zzfov) {
        this.zza = it;
        this.zzb = zzfov;
    }

    /* access modifiers changed from: protected */
    @CheckForNull
    public final Object zza() {
        while (this.zza.hasNext()) {
            Object next = this.zza.next();
            if (this.zzb.zza(next)) {
                return next;
            }
        }
        zzb();
        return null;
    }
}
