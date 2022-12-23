package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.CookieManager;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdzv implements zzgqu {
    private final zzgrh zza;
    private final zzgrh zzb;

    public zzdzv(zzgrh zzgrh, zzgrh zzgrh2) {
        this.zza = zzgrh;
        this.zzb = zzgrh2;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        CookieManager zzb2 = zzt.zzq().zzb((Context) this.zzb.zzb());
        zzffz zzffz = zzffz.WEBVIEW_COOKIE;
        return zzffp.zza(new zzdzs(zzb2), zzffz, (zzfgf) this.zza.zzb()).zzi(1, TimeUnit.SECONDS).zzc(Exception.class, new zzffs(zzdzt.zza)).zza();
    }
}
