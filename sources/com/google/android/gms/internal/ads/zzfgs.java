package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzfgs implements zzfgp {
    private final zzfgp zza;
    private final Queue zzb = new LinkedBlockingQueue();
    private final int zzc = ((Integer) zzay.zzc().zzb(zzbhz.zzhm)).intValue();
    private final AtomicBoolean zzd = new AtomicBoolean(false);

    public zzfgs(zzfgp zzfgp, ScheduledExecutorService scheduledExecutorService) {
        this.zza = zzfgp;
        long intValue = (long) ((Integer) zzay.zzc().zzb(zzbhz.zzhl)).intValue();
        scheduledExecutorService.scheduleAtFixedRate(new zzfgr(this), intValue, intValue, TimeUnit.MILLISECONDS);
    }

    public static /* synthetic */ void zzc(zzfgs zzfgs) {
        while (!zzfgs.zzb.isEmpty()) {
            zzfgs.zza.zzb((zzfgo) zzfgs.zzb.remove());
        }
    }

    public final String zza(zzfgo zzfgo) {
        return this.zza.zza(zzfgo);
    }

    public final void zzb(zzfgo zzfgo) {
        if (this.zzb.size() < this.zzc) {
            this.zzb.offer(zzfgo);
        } else if (!this.zzd.getAndSet(true)) {
            Queue queue = this.zzb;
            zzfgo zzb2 = zzfgo.zzb("dropped_event");
            Map zzj = zzfgo.zzj();
            if (zzj.containsKey("action")) {
                zzb2.zza("dropped_action", (String) zzj.get("action"));
            }
            queue.offer(zzb2);
        }
    }
}
