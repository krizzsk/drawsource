package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzqn implements zzqw {
    public static final /* synthetic */ zzqn zza = new zzqn();

    private /* synthetic */ zzqn() {
    }

    public final int zza(Object obj) {
        int i = zzqx.zza;
        String str = ((zzqf) obj).zza;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        if (zzeg.zza >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
            return 0;
        }
        return -1;
    }
}
