package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdbd {
    /* access modifiers changed from: private */
    public Context zza;
    /* access modifiers changed from: private */
    public zzfcd zzb;
    /* access modifiers changed from: private */
    public Bundle zzc;
    /* access modifiers changed from: private */
    public zzfby zzd;

    public final zzdbd zzc(Context context) {
        this.zza = context;
        return this;
    }

    public final zzdbd zzd(Bundle bundle) {
        this.zzc = bundle;
        return this;
    }

    public final zzdbd zze(zzfby zzfby) {
        this.zzd = zzfby;
        return this;
    }

    public final zzdbd zzf(zzfcd zzfcd) {
        this.zzb = zzfcd;
        return this;
    }

    public final zzdbf zzg() {
        return new zzdbf(this, (zzdbe) null);
    }
}
