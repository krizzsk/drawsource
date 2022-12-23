package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzbrn implements Runnable {
    public final /* synthetic */ zzbrp zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzbrn(zzbrp zzbrp, String str) {
        this.zza = zzbrp;
        this.zzb = str;
    }

    public final void run() {
        this.zza.zzo(this.zzb);
    }
}
