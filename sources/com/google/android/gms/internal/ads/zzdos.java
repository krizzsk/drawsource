package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.util.zze;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdos {
    private final zzdtp zza;
    private final zzdse zzb;
    private final zzcun zzc;
    private final zzdnp zzd;

    public zzdos(zzdtp zzdtp, zzdse zzdse, zzcun zzcun, zzdnp zzdnp) {
        this.zza = zzdtp;
        this.zzb = zzdse;
        this.zzc = zzcun;
        this.zzd = zzdnp;
    }

    public final View zza() throws zzclt {
        zzcli zza2 = this.zza.zza(zzq.zzc(), (zzfbl) null, (zzfbo) null);
        View view = (View) zza2;
        view.setVisibility(8);
        zza2.zzaf("/sendMessageToSdk", new zzdom(this));
        zza2.zzaf("/adMuted", new zzdon(this));
        this.zzb.zzj(new WeakReference(zza2), "/loadHtml", new zzdoo(this));
        this.zzb.zzj(new WeakReference(zza2), "/showOverlay", new zzdop(this));
        this.zzb.zzj(new WeakReference(zza2), "/hideOverlay", new zzdoq(this));
        return view;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzb(zzcli zzcli, Map map) {
        this.zzb.zzg("sendMessageToNativeJs", map);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzc(zzcli zzcli, Map map) {
        this.zzd.zzf();
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(Map map, boolean z) {
        HashMap hashMap = new HashMap();
        hashMap.put("messageType", "htmlLoaded");
        hashMap.put("id", (String) map.get("id"));
        this.zzb.zzg("sendMessageToNativeJs", hashMap);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zze(zzcli zzcli, Map map) {
        zze.zzi("Showing native ads overlay.");
        zzcli.zzH().setVisibility(0);
        this.zzc.zze(true);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzf(zzcli zzcli, Map map) {
        zze.zzi("Hiding native ads overlay.");
        zzcli.zzH().setVisibility(8);
        this.zzc.zze(false);
    }
}
