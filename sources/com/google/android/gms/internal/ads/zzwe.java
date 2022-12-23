package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzwe extends Handler implements Runnable {
    final /* synthetic */ zzwj zza;
    private final zzwf zzb;
    private final long zzc;
    private zzwb zzd;
    private IOException zze;
    private int zzf;
    private Thread zzg;
    private boolean zzh;
    private volatile boolean zzi;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzwe(zzwj zzwj, Looper looper, zzwf zzwf, zzwb zzwb, int i, long j) {
        super(looper);
        this.zza = zzwj;
        this.zzb = zzwf;
        this.zzd = zzwb;
        this.zzc = j;
    }

    public final void handleMessage(Message message) {
        long j;
        if (!this.zzi) {
            if (message.what == 0) {
                zzd();
            } else if (message.what != 3) {
                this.zza.zzf = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j2 = elapsedRealtime - this.zzc;
                zzwb zzwb = this.zzd;
                if (zzwb == null) {
                    throw null;
                } else if (this.zzh) {
                    zzwb.zzG(this.zzb, elapsedRealtime, j2, false);
                } else {
                    int i = message.what;
                    if (i == 1) {
                        try {
                            zzwb.zzH(this.zzb, elapsedRealtime, j2);
                        } catch (RuntimeException e) {
                            zzdn.zza("LoadTask", "Unexpected exception handling load completed", e);
                            this.zza.zzg = new zzwi(e);
                        }
                    } else if (i == 2) {
                        IOException iOException = (IOException) message.obj;
                        this.zze = iOException;
                        int i2 = this.zzf + 1;
                        this.zzf = i2;
                        zzwd zzt = zzwb.zzt(this.zzb, elapsedRealtime, j2, iOException, i2);
                        if (zzt.zza == 3) {
                            this.zza.zzg = this.zze;
                        } else if (zzt.zza != 2) {
                            if (zzt.zza == 1) {
                                this.zzf = 1;
                            }
                            if (zzt.zzb != -9223372036854775807L) {
                                j = zzt.zzb;
                            } else {
                                j = (long) Math.min((this.zzf - 1) * 1000, 5000);
                            }
                            zzc(j);
                        }
                    }
                }
            } else {
                throw ((Error) message.obj);
            }
        }
    }

    public final void run() {
        boolean z;
        try {
            synchronized (this) {
                z = !this.zzh;
                this.zzg = Thread.currentThread();
            }
            if (z) {
                int i = zzeg.zza;
                Trace.beginSection("load:" + this.zzb.getClass().getSimpleName());
                this.zzb.zzi();
                Trace.endSection();
            }
            synchronized (this) {
                this.zzg = null;
                Thread.interrupted();
            }
            if (!this.zzi) {
                sendEmptyMessage(1);
            }
        } catch (IOException e) {
            if (!this.zzi) {
                obtainMessage(2, e).sendToTarget();
            }
        } catch (Exception e2) {
            if (!this.zzi) {
                zzdn.zza("LoadTask", "Unexpected exception loading stream", e2);
                obtainMessage(2, new zzwi(e2)).sendToTarget();
            }
        } catch (OutOfMemoryError e3) {
            if (!this.zzi) {
                zzdn.zza("LoadTask", "OutOfMemory error loading stream", e3);
                obtainMessage(2, new zzwi(e3)).sendToTarget();
            }
        } catch (Error e4) {
            if (!this.zzi) {
                zzdn.zza("LoadTask", "Unexpected error loading stream", e4);
                obtainMessage(3, e4).sendToTarget();
            }
            throw e4;
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final void zza(boolean z) {
        this.zzi = z;
        this.zze = null;
        if (hasMessages(0)) {
            this.zzh = true;
            removeMessages(0);
            if (!z) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                this.zzh = true;
                this.zzb.zzh();
                Thread thread = this.zzg;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z) {
            this.zza.zzf = null;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            zzwb zzwb = this.zzd;
            if (zzwb != null) {
                zzwb.zzG(this.zzb, elapsedRealtime, elapsedRealtime - this.zzc, true);
                this.zzd = null;
                return;
            }
            throw null;
        }
    }

    public final void zzb(int i) throws IOException {
        IOException iOException = this.zze;
        if (iOException != null && this.zzf > i) {
            throw iOException;
        }
    }

    public final void zzc(long j) {
        zzcw.zzf(this.zza.zzf == null);
        this.zza.zzf = this;
        if (j > 0) {
            sendEmptyMessageDelayed(0, j);
        } else {
            zzd();
        }
    }

    private final void zzd() {
        this.zze = null;
        zzwj zzwj = this.zza;
        ExecutorService zzd2 = zzwj.zze;
        zzwe zzc2 = zzwj.zzf;
        if (zzc2 != null) {
            zzd2.execute(zzc2);
            return;
        }
        throw null;
    }
}
