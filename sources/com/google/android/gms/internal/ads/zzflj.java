package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.OnFailureListener;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzflj implements OnFailureListener {
    public final /* synthetic */ zzfln zza;

    public /* synthetic */ zzflj(zzfln zzfln) {
        this.zza = zzfln;
    }

    public final void onFailure(Exception exc) {
        this.zza.zzf(exc);
    }
}
