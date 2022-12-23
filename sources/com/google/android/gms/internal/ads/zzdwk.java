package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdwk implements zzfgg {
    private final Map zza = new HashMap();
    private final zzdwc zzb;
    private final Clock zzc;
    private final Map zzd = new HashMap();

    public zzdwk(zzdwc zzdwc, Set set, Clock clock) {
        this.zzb = zzdwc;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            zzdwj zzdwj = (zzdwj) it.next();
            this.zzd.put(zzdwj.zzc, zzdwj);
        }
        this.zzc = clock;
    }

    private final void zze(zzffz zzffz, boolean z) {
        zzffz zzb2 = ((zzdwj) this.zzd.get(zzffz)).zzb;
        String str = true != z ? "f." : "s.";
        if (this.zza.containsKey(zzb2)) {
            this.zzb.zza().put("label.".concat(((zzdwj) this.zzd.get(zzffz)).zza), str.concat(String.valueOf(Long.toString(this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzb2)).longValue()))));
        }
    }

    public final void zzbF(zzffz zzffz, String str) {
    }

    public final void zzbG(zzffz zzffz, String str, Throwable th) {
        if (this.zza.containsKey(zzffz)) {
            this.zzb.zza().put("task.".concat(String.valueOf(str)), "f.".concat(String.valueOf(Long.toString(this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzffz)).longValue()))));
        }
        if (this.zzd.containsKey(zzffz)) {
            zze(zzffz, false);
        }
    }

    public final void zzc(zzffz zzffz, String str) {
        this.zza.put(zzffz, Long.valueOf(this.zzc.elapsedRealtime()));
    }

    public final void zzd(zzffz zzffz, String str) {
        if (this.zza.containsKey(zzffz)) {
            this.zzb.zza().put("task.".concat(String.valueOf(str)), "s.".concat(String.valueOf(Long.toString(this.zzc.elapsedRealtime() - ((Long) this.zza.get(zzffz)).longValue()))));
        }
        if (this.zzd.containsKey(zzffz)) {
            zze(zzffz, true);
        }
    }
}
