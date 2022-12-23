package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdcl extends zzdhc {
    private boolean zzb = false;

    public zzdcl(Set set) {
        super(set);
    }

    public final synchronized void zza() {
        if (!this.zzb) {
            zzo(zzdck.zza);
            this.zzb = true;
        }
    }
}
