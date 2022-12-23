package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzs;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdec extends zzdhc implements zzdcn, zzdds {
    private final zzfbl zzb;
    private final AtomicBoolean zzc = new AtomicBoolean();

    public zzdec(Set set, zzfbl zzfbl) {
        super(set);
        this.zzb = zzfbl;
    }

    private final void zzb() {
        zzs zzs;
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzgA)).booleanValue() && this.zzc.compareAndSet(false, true) && (zzs = this.zzb.zzag) != null && zzs.zza == 3) {
            zzo(new zzdeb(this));
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzdee zzdee) throws Exception {
        zzdee.zzg(this.zzb.zzag);
    }

    public final void zzh() {
        if (this.zzb.zzb == 1) {
            zzb();
        }
    }

    public final void zzl() {
        int i = this.zzb.zzb;
        if (i == 2 || i == 5 || i == 4 || i == 6 || i == 7) {
            zzb();
        }
    }
}
