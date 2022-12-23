package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzl;
import com.google.android.gms.ads.internal.zzt;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzbrp implements zzbrh, zzbrf {
    private final zzcli zza;

    public zzbrp(Context context, zzcfo zzcfo, zzaoc zzaoc, zza zza2) throws zzclt {
        zzt.zzz();
        zzcli zza3 = zzclu.zza(context, zzcmx.zza(), "", false, false, (zzaoc) null, (zzbiy) null, zzcfo, (zzbio) null, (zzl) null, (zza) null, zzbdm.zza(), (zzfbl) null, (zzfbo) null);
        this.zza = zza3;
        ((View) zza3).setWillNotDraw(true);
    }

    private static final void zzs(Runnable runnable) {
        zzaw.zzb();
        if (zzcfb.zzt()) {
            runnable.run();
        } else {
            zzs.zza.post(runnable);
        }
    }

    public final void zza(String str) {
        zzs(new zzbrk(this, str));
    }

    public final /* synthetic */ void zzb(String str, String str2) {
        zzbre.zzc(this, str, str2);
    }

    public final void zzc() {
        this.zza.destroy();
    }

    public final /* synthetic */ void zzd(String str, Map map) {
        zzbre.zza(this, str, map);
    }

    public final /* synthetic */ void zze(String str, JSONObject jSONObject) {
        zzbre.zzb(this, str, jSONObject);
    }

    public final void zzf(String str) {
        zzs(new zzbrl(this, str));
    }

    public final void zzg(String str) {
        zzs(new zzbrn(this, str));
    }

    public final void zzh(String str) {
        zzs(new zzbrm(this, String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", new Object[]{str})));
    }

    public final boolean zzi() {
        return this.zza.zzaB();
    }

    public final zzbso zzj() {
        return new zzbso(this);
    }

    public final void zzk(zzbrv zzbrv) {
        this.zza.zzP().zzF(new zzbri(zzbrv, (byte[]) null));
    }

    public final /* synthetic */ void zzl(String str, JSONObject jSONObject) {
        zzbre.zzd(this, str, jSONObject);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzm(String str) {
        this.zza.zza(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzn(String str) {
        this.zza.loadData(str, "text/html", "UTF-8");
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzo(String str) {
        this.zza.loadUrl(str);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzp(String str) {
        this.zza.loadData(str, "text/html", "UTF-8");
    }

    public final void zzq(String str, zzbom zzbom) {
        this.zza.zzaf(str, new zzbro(this, zzbom));
    }

    public final void zzr(String str, zzbom zzbom) {
        this.zza.zzax(str, new zzbrj(zzbom));
    }
}
