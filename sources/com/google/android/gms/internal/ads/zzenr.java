package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzenr implements zzetg {
    private final zzfvm zza;
    private final zzfcd zzb;
    private final zzfcp zzc;

    zzenr(zzfvm zzfvm, zzfcd zzfcd, zzfcp zzfcp) {
        this.zza = zzfvm;
        this.zzb = zzfcd;
        this.zzc = zzfcp;
    }

    public final int zza() {
        return 5;
    }

    public final zzfvl zzb() {
        return this.zza.zzb(new zzenq(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzens zzc() throws Exception {
        String str = null;
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzgg)).booleanValue() && "requester_type_2".equals(zzf.zzb(this.zzb.zzd))) {
            str = zzfcp.zza();
        }
        return new zzens(str);
    }
}
