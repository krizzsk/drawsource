package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzedf implements zzfgg {
    private final Map zza = new HashMap();
    private final Map zzb = new HashMap();
    private final zzfgo zzc;

    public zzedf(Set set, zzfgo zzfgo) {
        this.zzc = zzfgo;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzede zzede = (zzede) it.next();
            this.zza.put(zzede.zzb, zzede.zza);
            this.zzb.put(zzede.zzc, zzede.zza);
        }
    }

    public final void zzbF(zzffz zzffz, String str) {
    }

    public final void zzbG(zzffz zzffz, String str, Throwable th) {
        this.zzc.zze("task.".concat(String.valueOf(str)), "f.");
        if (this.zzb.containsKey(zzffz)) {
            this.zzc.zze("label.".concat(String.valueOf((String) this.zzb.get(zzffz))), "f.");
        }
    }

    public final void zzc(zzffz zzffz, String str) {
        this.zzc.zzd("task.".concat(String.valueOf(str)));
        if (this.zza.containsKey(zzffz)) {
            this.zzc.zzd("label.".concat(String.valueOf((String) this.zza.get(zzffz))));
        }
    }

    public final void zzd(zzffz zzffz, String str) {
        this.zzc.zze("task.".concat(String.valueOf(str)), "s.");
        if (this.zzb.containsKey(zzffz)) {
            this.zzc.zze("label.".concat(String.valueOf((String) this.zzb.get(zzffz))), "s.");
        }
    }
}
