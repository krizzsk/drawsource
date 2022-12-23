package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public class zzdzl extends Exception {
    private final int zza;

    public zzdzl(int i) {
        this.zza = i;
    }

    public final int zza() {
        return this.zza;
    }

    public zzdzl(int i, String str) {
        super(str);
        this.zza = i;
    }

    public zzdzl(int i, String str, Throwable th) {
        super(str, th);
        this.zza = 1;
    }
}
