package com.google.android.gms.internal.ads;

import java.io.Closeable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.1.0 */
public abstract class zzfnf implements Closeable {
    public static zzfnr zza() {
        return new zzfnr();
    }

    public static zzfnr zzb(int i, zzfnq zzfnq) {
        return new zzfnr(new zzfnd(i), zzfne.zza, zzfnq);
    }

    public static zzfnr zzc(zzfpj<Integer> zzfpj, zzfpj<Integer> zzfpj2, zzfnq zzfnq) {
        return new zzfnr(zzfpj, zzfpj2, zzfnq);
    }

    static /* synthetic */ Integer zze() {
        return -1;
    }
}
