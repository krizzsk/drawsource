package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzexz implements zzfuj {
    public final /* synthetic */ zzeyb zza;
    public final /* synthetic */ zzfdx zzb;
    public final /* synthetic */ zzcza zzc;

    public /* synthetic */ zzexz(zzeyb zzeyb, zzfdx zzfdx, zzcza zzcza) {
        this.zza = zzeyb;
        this.zzb = zzfdx;
        this.zzc = zzcza;
    }

    public final zzfvl zza(Object obj) {
        zzfdx zzfdx = this.zzb;
        zzcza zzcza = this.zzc;
        zzfbx zzfbx = (zzfbx) obj;
        zzfdx.zzb = zzfbx;
        Iterator it = zzfbx.zzb.zza.iterator();
        boolean z = false;
        loop0:
        while (true) {
            if (it.hasNext()) {
                Iterator it2 = ((zzfbl) it.next()).zza.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (!((String) it2.next()).contains("FirstPartyRenderer")) {
                            break loop0;
                        }
                        z = true;
                    }
                }
            } else if (z) {
                return zzcza.zzh(zzfvc.zzi(zzfbx));
            }
        }
        return zzfvc.zzi((Object) null);
    }
}
