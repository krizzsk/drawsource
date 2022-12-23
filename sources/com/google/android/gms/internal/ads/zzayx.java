package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzayx {
    /* access modifiers changed from: private */
    public final ExecutorService zza = zzazo.zzl("Loader:ExtractorMediaPeriod");
    /* access modifiers changed from: private */
    public zzayu zzb;
    /* access modifiers changed from: private */
    public IOException zzc;

    public zzayx(String str) {
    }

    public final long zza(zzayv zzayv, zzayt zzayt, int i) {
        Looper myLooper = Looper.myLooper();
        zzayz.zze(myLooper != null);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new zzayu(this, myLooper, zzayv, zzayt, i, elapsedRealtime).zzc(0);
        return elapsedRealtime;
    }

    public final void zzf() {
        this.zzb.zza(false);
    }

    public final void zzg(int i) throws IOException {
        IOException iOException = this.zzc;
        if (iOException == null) {
            zzayu zzayu = this.zzb;
            if (zzayu != null) {
                zzayu.zzb(zzayu.zza);
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void zzh(Runnable runnable) {
        zzayu zzayu = this.zzb;
        if (zzayu != null) {
            zzayu.zza(true);
        }
        this.zza.execute(runnable);
        this.zza.shutdown();
    }

    public final boolean zzi() {
        return this.zzb != null;
    }
}
