package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzarf extends Exception {
    private zzarf(int i, String str, Throwable th, int i2) {
        super((String) null, th);
    }

    public static zzarf zza(Exception exc, int i) {
        return new zzarf(1, (String) null, exc, i);
    }

    public static zzarf zzb(IOException iOException) {
        return new zzarf(0, (String) null, iOException, -1);
    }

    static zzarf zzc(RuntimeException runtimeException) {
        return new zzarf(2, (String) null, runtimeException, -1);
    }
}
