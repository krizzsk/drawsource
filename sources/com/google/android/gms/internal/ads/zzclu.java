package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.StrictMode;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzl;
import javax.annotation.ParametersAreNonnullByDefault;

@ParametersAreNonnullByDefault
/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzclu {
    /* JADX WARNING: type inference failed for: r0v3, types: [com.google.android.gms.internal.ads.zzcli, java.lang.Object] */
    public static final zzcli zza(Context context, zzcmx zzcmx, String str, boolean z, boolean z2, zzaoc zzaoc, zzbiy zzbiy, zzcfo zzcfo, zzbio zzbio, zzl zzl, zza zza, zzbdm zzbdm, zzfbl zzfbl, zzfbo zzfbo) throws zzclt {
        StrictMode.ThreadPolicy threadPolicy;
        zzbhz.zzc(context);
        try {
            zzclq zzclq = new zzclq(context, zzcmx, str, z, z2, zzaoc, zzbiy, zzcfo, (zzbio) null, zzl, zza, zzbdm, zzfbl, zzfbo);
            threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            ? zza2 = zzclq.zza();
            StrictMode.setThreadPolicy(threadPolicy);
            return zza2;
        } catch (Throwable th) {
            throw new zzclt("Webview initialization failed.", th);
        }
    }
}
