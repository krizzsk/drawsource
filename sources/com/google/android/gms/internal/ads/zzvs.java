package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzvs {
    private final CopyOnWriteArrayList zza = new CopyOnWriteArrayList();

    public final void zza(Handler handler, zzvt zzvt) {
        zzc(zzvt);
        this.zza.add(new zzvr(handler, zzvt));
    }

    public final void zzb(int i, long j, long j2) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzvr zzvr = (zzvr) it.next();
            if (!zzvr.zzc) {
                zzvr.zza.post(new zzvq(zzvr, i, j, j2));
            }
        }
    }

    public final void zzc(zzvt zzvt) {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzvr zzvr = (zzvr) it.next();
            if (zzvr.zzb == zzvt) {
                zzvr.zzc();
                this.zza.remove(zzvr);
            }
        }
    }
}
