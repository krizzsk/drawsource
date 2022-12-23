package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.overlay.zzu;
import com.google.android.gms.ads.internal.overlay.zzw;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzegs implements zzefd {
    private final Context zza;
    private final zzdky zzb;
    private final Executor zzc;
    private final zzfbk zzd;

    public zzegs(Context context, Executor executor, zzdky zzdky, zzfbk zzfbk) {
        this.zza = context;
        this.zzb = zzdky;
        this.zzc = executor;
        this.zzd = zzfbk;
    }

    private static String zzd(zzfbl zzfbl) {
        try {
            return zzfbl.zzw.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    public final zzfvl zza(zzfbx zzfbx, zzfbl zzfbl) {
        String zzd2 = zzd(zzfbl);
        return zzfvc.zzn(zzfvc.zzi((Object) null), new zzegq(this, zzd2 != null ? Uri.parse(zzd2) : null, zzfbx, zzfbl), this.zzc);
    }

    public final boolean zzb(zzfbx zzfbx, zzfbl zzfbl) {
        Context context = this.zza;
        return (context instanceof Activity) && zzbix.zzg(context) && !TextUtils.isEmpty(zzd(zzfbl));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zzc(Uri uri, zzfbx zzfbx, zzfbl zzfbl, Object obj) throws Exception {
        try {
            CustomTabsIntent build = new CustomTabsIntent.Builder().build();
            build.intent.setData(uri);
            zzc zzc2 = new zzc(build.intent, (zzu) null);
            zzcga zzcga = new zzcga();
            zzdka zze = this.zzb.zze(new zzcym(zzfbx, zzfbl, (String) null), new zzdkd(new zzegr(zzcga), (zzcli) null));
            zzcga.zzd(new AdOverlayInfoParcel(zzc2, (zza) null, zze.zza(), (zzw) null, new zzcfo(0, 0, false, false, false), (zzcli) null, (zzdjg) null));
            this.zzd.zza();
            return zzfvc.zzi(zze.zzg());
        } catch (Throwable th) {
            zze.zzh("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }
}
