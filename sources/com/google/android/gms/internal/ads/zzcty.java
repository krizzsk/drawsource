package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzcty {
    private final String zza;
    private final zzbtj zzb;
    /* access modifiers changed from: private */
    public final Executor zzc;
    /* access modifiers changed from: private */
    public zzcud zzd;
    private final zzbom zze = new zzctv(this);
    private final zzbom zzf = new zzctx(this);

    public zzcty(String str, zzbtj zzbtj, Executor executor) {
        this.zza = str;
        this.zzb = zzbtj;
        this.zzc = executor;
    }

    static /* bridge */ /* synthetic */ boolean zzg(zzcty zzcty, Map map) {
        if (map == null) {
            return false;
        }
        String str = (String) map.get("hashCode");
        return !TextUtils.isEmpty(str) && str.equals(zzcty.zza);
    }

    public final void zzc(zzcud zzcud) {
        this.zzb.zzb("/updateActiveView", this.zze);
        this.zzb.zzb("/untrackActiveViewUnit", this.zzf);
        this.zzd = zzcud;
    }

    public final void zzd(zzcli zzcli) {
        zzcli.zzaf("/updateActiveView", this.zze);
        zzcli.zzaf("/untrackActiveViewUnit", this.zzf);
    }

    public final void zze() {
        this.zzb.zzc("/updateActiveView", this.zze);
        this.zzb.zzc("/untrackActiveViewUnit", this.zzf);
    }

    public final void zzf(zzcli zzcli) {
        zzcli.zzaw("/updateActiveView", this.zze);
        zzcli.zzaw("/untrackActiveViewUnit", this.zzf);
    }
}
