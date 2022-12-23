package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzvf {
    public final zzck zza;
    public final int[] zzb;

    public zzvf(zzck zzck, int[] iArr, int i) {
        if (iArr.length == 0) {
            zzdn.zza("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.zza = zzck;
        this.zzb = iArr;
    }
}
