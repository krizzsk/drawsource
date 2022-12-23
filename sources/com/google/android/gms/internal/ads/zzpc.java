package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzpc {
    public final int zza;
    public final zzsa zzb;
    private final CopyOnWriteArrayList zzc;

    public zzpc() {
        this(new CopyOnWriteArrayList(), 0, (zzsa) null);
    }

    private zzpc(CopyOnWriteArrayList copyOnWriteArrayList, int i, zzsa zzsa) {
        this.zzc = copyOnWriteArrayList;
        this.zza = i;
        this.zzb = zzsa;
    }

    public final zzpc zza(int i, zzsa zzsa) {
        return new zzpc(this.zzc, i, zzsa);
    }

    public final void zzc(zzpd zzpd) {
        Iterator it = this.zzc.iterator();
        while (it.hasNext()) {
            zzpb zzpb = (zzpb) it.next();
            if (zzpb.zzb == zzpd) {
                this.zzc.remove(zzpb);
            }
        }
    }

    public final void zzb(Handler handler, zzpd zzpd) {
        if (zzpd != null) {
            this.zzc.add(new zzpb(handler, zzpd));
            return;
        }
        throw null;
    }
}
