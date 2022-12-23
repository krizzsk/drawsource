package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzwj {
    public static final zzwd zza = new zzwd(0, -9223372036854775807L, (zzwc) null);
    public static final zzwd zzb = new zzwd(1, -9223372036854775807L, (zzwc) null);
    public static final zzwd zzc = new zzwd(2, -9223372036854775807L, (zzwc) null);
    public static final zzwd zzd = new zzwd(3, -9223372036854775807L, (zzwc) null);
    /* access modifiers changed from: private */
    public final ExecutorService zze = zzeg.zzP("ExoPlayer:Loader:ProgressiveMediaPeriod");
    /* access modifiers changed from: private */
    public zzwe zzf;
    /* access modifiers changed from: private */
    public IOException zzg;

    public zzwj(String str) {
    }

    public static zzwd zzb(boolean z, long j) {
        return new zzwd(z ? 1 : 0, j, (zzwc) null);
    }

    public final long zza(zzwf zzwf, zzwb zzwb, int i) {
        Looper myLooper = Looper.myLooper();
        zzcw.zzb(myLooper);
        this.zzg = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new zzwe(this, myLooper, zzwf, zzwb, i, elapsedRealtime).zzc(0);
        return elapsedRealtime;
    }

    public final void zzg() {
        zzwe zzwe = this.zzf;
        zzcw.zzb(zzwe);
        zzwe.zza(false);
    }

    public final void zzh() {
        this.zzg = null;
    }

    public final void zzi(int i) throws IOException {
        IOException iOException = this.zzg;
        if (iOException == null) {
            zzwe zzwe = this.zzf;
            if (zzwe != null) {
                zzwe.zzb(i);
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void zzj(zzwg zzwg) {
        zzwe zzwe = this.zzf;
        if (zzwe != null) {
            zzwe.zza(true);
        }
        this.zze.execute(new zzwh(zzwg));
        this.zze.shutdown();
    }

    public final boolean zzk() {
        return this.zzg != null;
    }

    public final boolean zzl() {
        return this.zzf != null;
    }
}
