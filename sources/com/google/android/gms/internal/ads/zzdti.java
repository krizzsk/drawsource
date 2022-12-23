package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzdti implements View.OnTouchListener {
    public final /* synthetic */ zzdto zza;

    public /* synthetic */ zzdti(zzdto zzdto) {
        this.zza = zzdto;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        this.zza.zzh(view, motionEvent);
        return false;
    }
}
