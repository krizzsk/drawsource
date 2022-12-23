package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzftt;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzfvq extends zzftt.zzi implements Runnable {
    private final Runnable zza;

    public zzfvq(Runnable runnable) {
        if (runnable != null) {
            this.zza = runnable;
            return;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    public final String zza() {
        return "task=[" + this.zza + "]";
    }

    public final void run() {
        try {
            this.zza.run();
        } catch (Error | RuntimeException e) {
            zze(e);
            throw e;
        }
    }
}
