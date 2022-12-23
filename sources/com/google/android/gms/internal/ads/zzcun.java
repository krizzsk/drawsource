package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.util.Clock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzcun implements zzban {
    private zzcli zza;
    private final Executor zzb;
    private final zzctz zzc;
    private final Clock zzd;
    private boolean zze = false;
    private boolean zzf = false;
    private final zzcuc zzg = new zzcuc();

    public zzcun(Executor executor, zzctz zzctz, Clock clock) {
        this.zzb = executor;
        this.zzc = zzctz;
        this.zzd = clock;
    }

    private final void zzg() {
        try {
            JSONObject zza2 = this.zzc.zzb(this.zzg);
            if (this.zza != null) {
                this.zzb.execute(new zzcum(this, zza2));
            }
        } catch (JSONException e) {
            zze.zzb("Failed to call video active view js", e);
        }
    }

    public final void zza() {
        this.zze = false;
    }

    public final void zzb() {
        this.zze = true;
        zzg();
    }

    public final void zzc(zzbam zzbam) {
        boolean z;
        zzcuc zzcuc = this.zzg;
        if (this.zzf) {
            z = false;
        } else {
            z = zzbam.zzj;
        }
        zzcuc.zza = z;
        zzcuc.zzd = this.zzd.elapsedRealtime();
        this.zzg.zzf = zzbam;
        if (this.zze) {
            zzg();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(JSONObject jSONObject) {
        this.zza.zzl("AFMA_updateActiveView", jSONObject);
    }

    public final void zze(boolean z) {
        this.zzf = z;
    }

    public final void zzf(zzcli zzcli) {
        this.zza = zzcli;
    }
}
