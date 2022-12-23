package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzfpp extends zzfsa {
    final /* synthetic */ zzfpr zza;

    zzfpp(zzfpr zzfpr) {
        this.zza = zzfpr;
    }

    public final boolean contains(@CheckForNull Object obj) {
        return zzfqk.zza(this.zza.zza.entrySet(), obj);
    }

    public final Iterator iterator() {
        return new zzfpq(this.zza);
    }

    public final boolean remove(@CheckForNull Object obj) {
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        entry.getClass();
        zzfqe.zzq(this.zza.zzb, entry.getKey());
        return true;
    }

    /* access modifiers changed from: package-private */
    public final Map zza() {
        return this.zza;
    }
}
