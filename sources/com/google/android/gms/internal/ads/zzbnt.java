package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzbnt implements zzfok {
    public final /* synthetic */ String zza;

    public /* synthetic */ zzbnt(String str) {
        this.zza = str;
    }

    public final Object apply(Object obj) {
        String str = this.zza;
        Throwable th = (Throwable) obj;
        zzbom zzbom = zzbol.zza;
        if (((Boolean) zzbjo.zzk.zze()).booleanValue()) {
            zzt.zzo().zzt(th, "prepareClickUrl.attestation2");
        }
        return str;
    }
}
