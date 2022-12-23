package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzepj implements zzetg {
    private final zzfvm zza;
    private final Context zzb;

    zzepj(zzfvm zzfvm, Context context) {
        this.zza = zzfvm;
        this.zzb = context;
    }

    public final int zza() {
        return 14;
    }

    public final zzfvl zzb() {
        return this.zza.zzb(new zzepi(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzepk zzc() throws Exception {
        double d;
        Intent registerReceiver = this.zzb.registerReceiver((BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        boolean z = false;
        if (registerReceiver != null) {
            int intExtra = registerReceiver.getIntExtra("status", -1);
            d = ((double) registerReceiver.getIntExtra("level", -1)) / ((double) registerReceiver.getIntExtra("scale", -1));
            if (intExtra == 2 || intExtra == 5) {
                z = true;
            }
        } else {
            d = -1.0d;
        }
        return new zzepk(d, z);
    }
}
