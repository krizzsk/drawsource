package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzepn implements zzetg {
    private final zzeyh zza;

    zzepn(zzeyh zzeyh) {
        this.zza = zzeyh;
    }

    public final int zza() {
        return 15;
    }

    public final zzfvl zzb() {
        zzeyh zzeyh = this.zza;
        zzepm zzepm = null;
        if (!(zzeyh == null || zzeyh.zza() == null || zzeyh.zza().isEmpty())) {
            zzepm = new zzepm(this);
        }
        return zzfvc.zzi(zzepm);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(Bundle bundle) {
        bundle.putString("key_schema", this.zza.zza());
    }
}
