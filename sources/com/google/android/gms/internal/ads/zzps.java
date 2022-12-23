package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzps extends Handler {
    final /* synthetic */ zzpu zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzps(zzpu zzpu, Looper looper) {
        super(looper);
        this.zza = zzpu;
    }

    public final void handleMessage(Message message) {
        zzpu.zza(this.zza, message);
    }
}
