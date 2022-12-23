package com.google.android.gms.internal.ads;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzdog implements zzbko {
    final /* synthetic */ zzdpc zza;
    final /* synthetic */ ViewGroup zzb;

    zzdog(zzdpc zzdpc, ViewGroup viewGroup) {
        this.zza = zzdpc;
        this.zzb = viewGroup;
    }

    public final JSONObject zza() {
        return this.zza.zzo();
    }

    public final JSONObject zzb() {
        return this.zza.zzp();
    }

    public final void zzc() {
        zzdpc zzdpc = this.zza;
        zzfrj zzfrj = zzdod.zza;
        Map zzm = zzdpc.zzm();
        if (zzm != null) {
            int size = zzfrj.size();
            int i = 0;
            while (i < size) {
                int i2 = i + 1;
                if (zzm.get((String) zzfrj.get(i)) == null) {
                    i = i2;
                } else {
                    this.zza.onClick(this.zzb);
                    return;
                }
            }
        }
    }

    public final void zzd(MotionEvent motionEvent) {
        this.zza.onTouch((View) null, motionEvent);
    }
}
