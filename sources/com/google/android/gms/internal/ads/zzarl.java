package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzarl extends Handler {
    final /* synthetic */ zzarm zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzarl(zzarm zzarm, Looper looper) {
        super(looper);
        this.zza = zzarm;
    }

    public final void handleMessage(Message message) {
        this.zza.zzt(message);
    }
}
