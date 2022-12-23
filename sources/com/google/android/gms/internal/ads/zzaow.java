package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzaow implements zzfmt {
    private final zzfkw zza;
    private final zzfln zzb;
    private final zzapj zzc;
    private final zzaov zzd;
    private final zzaog zze;
    private final zzapl zzf;

    zzaow(zzfkw zzfkw, zzfln zzfln, zzapj zzapj, zzaov zzaov, zzaog zzaog, zzapl zzapl) {
        this.zza = zzfkw;
        this.zzb = zzfln;
        this.zzc = zzapj;
        this.zzd = zzaov;
        this.zze = zzaog;
        this.zzf = zzapl;
    }

    private final Map zze() {
        HashMap hashMap = new HashMap();
        zzaly zzb2 = this.zzb.zzb();
        hashMap.put("v", this.zza.zzb());
        hashMap.put("gms", Boolean.valueOf(this.zza.zzc()));
        hashMap.put("int", zzb2.zzh());
        hashMap.put("up", Boolean.valueOf(this.zzd.zza()));
        hashMap.put("t", new Throwable());
        return hashMap;
    }

    public final Map zza() {
        Map zze2 = zze();
        zze2.put("lts", Long.valueOf(this.zzc.zza()));
        return zze2;
    }

    public final Map zzb() {
        Map zze2 = zze();
        zzaly zza2 = this.zzb.zza();
        zze2.put("gai", Boolean.valueOf(this.zza.zzd()));
        zze2.put("did", zza2.zzg());
        zze2.put("dst", Integer.valueOf(zza2.zzak() - 1));
        zze2.put("doo", Boolean.valueOf(zza2.zzah()));
        zzaog zzaog = this.zze;
        if (zzaog != null) {
            zze2.put("nt", Long.valueOf(zzaog.zza()));
        }
        zzapl zzapl = this.zzf;
        if (zzapl != null) {
            zze2.put("vs", Long.valueOf(zzapl.zzc()));
            zze2.put("vf", Long.valueOf(this.zzf.zzb()));
        }
        return zze2;
    }

    public final Map zzc() {
        return zze();
    }

    /* access modifiers changed from: package-private */
    public final void zzd(View view) {
        this.zzc.zzd(view);
    }
}
