package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzeub implements zzetg {
    private final Executor zza;
    private final String zzb;
    private final PackageInfo zzc;
    private final zzcei zzd;

    public zzeub(zzcei zzcei, Executor executor, String str, PackageInfo packageInfo, int i, byte[] bArr) {
        this.zzd = zzcei;
        this.zza = executor;
        this.zzb = str;
        this.zzc = packageInfo;
    }

    public final int zza() {
        return 41;
    }

    public final zzfvl zzb() {
        return zzfvc.zzg(zzfvc.zzm(zzfvc.zzi(this.zzb), zzetz.zza, this.zza), Throwable.class, new zzeua(this), this.zza);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzfvl zzc(Throwable th) throws Exception {
        return zzfvc.zzi(new zzeuc(this.zzb));
    }
}
