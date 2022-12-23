package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.internal.ads.zzbiv;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzgri;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzn implements zzbiv {
    final /* synthetic */ zzbix zza;
    final /* synthetic */ Context zzb;
    final /* synthetic */ Uri zzc;

    zzn(zzs zzs, zzbix zzbix, Context context, Uri uri) {
        this.zza = zzbix;
        this.zzb = context;
        this.zzc = uri;
    }

    public final void zza() {
        CustomTabsIntent build = new CustomTabsIntent.Builder(this.zza.zza()).build();
        build.intent.setPackage(zzgri.zza(this.zzb));
        build.launchUrl(this.zzb, this.zzc);
        this.zza.zzf((Activity) this.zzb);
    }
}
