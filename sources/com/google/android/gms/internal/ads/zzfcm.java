package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfcm {
    private final zzfbl zza;
    private final zzfbo zzb;
    private final zzees zzc;
    private final zzfii zzd;
    private final zzfhs zze;

    public zzfcm(zzees zzees, zzfii zzfii, zzfbl zzfbl, zzfbo zzfbo, zzfhs zzfhs) {
        this.zza = zzfbl;
        this.zzb = zzfbo;
        this.zzc = zzees;
        this.zzd = zzfii;
        this.zze = zzfhs;
    }

    public final void zza(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), 2);
        }
    }

    public final void zzb(String str, int i) {
        if (!this.zza.zzak) {
            this.zzd.zzc(str, this.zze);
            return;
        }
        this.zzc.zzd(new zzeeu(zzt.zzA().currentTimeMillis(), this.zzb.zzb, str, i));
    }

    public final void zzc(List list, int i) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), i);
        }
    }
}
