package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nonagon.signalgeneration.zzf;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzeqm implements zzetg {
    private final zzfvm zza;
    private final zzfcd zzb;

    zzeqm(zzfvm zzfvm, zzfcd zzfcd) {
        this.zza = zzfvm;
        this.zzb = zzfcd;
    }

    public final int zza() {
        return 21;
    }

    public final zzfvl zzb() {
        return this.zza.zzb(new zzeql(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzeqn zzc() throws Exception {
        return new zzeqn("requester_type_2".equals(zzf.zzb(this.zzb.zzd)));
    }
}
