package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzjq {
    private final zzjp zza;
    private final zzjo zzb;
    private final zzcx zzc;
    private final zzci zzd;
    private int zze;
    private Object zzf;
    private final Looper zzg;
    private final int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    public zzjq(zzjo zzjo, zzjp zzjp, zzci zzci, int i, zzcx zzcx, Looper looper) {
        this.zzb = zzjo;
        this.zza = zzjp;
        this.zzd = zzci;
        this.zzg = looper;
        this.zzc = zzcx;
        this.zzh = i;
    }

    public final int zza() {
        return this.zze;
    }

    public final Looper zzb() {
        return this.zzg;
    }

    public final zzjp zzc() {
        return this.zza;
    }

    public final zzjq zzd() {
        zzcw.zzf(!this.zzi);
        this.zzi = true;
        this.zzb.zzm(this);
        return this;
    }

    public final zzjq zze(Object obj) {
        zzcw.zzf(!this.zzi);
        this.zzf = obj;
        return this;
    }

    public final zzjq zzf(int i) {
        zzcw.zzf(!this.zzi);
        this.zze = i;
        return this;
    }

    public final Object zzg() {
        return this.zzf;
    }

    public final synchronized void zzh(boolean z) {
        this.zzj = z | this.zzj;
        this.zzk = true;
        notifyAll();
    }

    public final synchronized boolean zzi(long j) throws InterruptedException, TimeoutException {
        zzcw.zzf(this.zzi);
        zzcw.zzf(this.zzg.getThread() != Thread.currentThread());
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        while (!this.zzk) {
            if (j > 0) {
                wait(j);
                j = elapsedRealtime - SystemClock.elapsedRealtime();
            } else {
                throw new TimeoutException("Message delivery timed out.");
            }
        }
        return this.zzj;
    }

    public final synchronized boolean zzj() {
        return false;
    }
}
