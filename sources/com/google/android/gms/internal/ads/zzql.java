package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzql implements zzqw {
    public final /* synthetic */ zzad zza;

    public /* synthetic */ zzql(zzad zzad) {
        this.zza = zzad;
    }

    public final int zza(Object obj) {
        zzad zzad = this.zza;
        zzqf zzqf = (zzqf) obj;
        int i = zzqx.zza;
        try {
            return !zzqf.zzd(zzad) ? 0 : 1;
        } catch (zzqr unused) {
            return -1;
        }
    }
}
