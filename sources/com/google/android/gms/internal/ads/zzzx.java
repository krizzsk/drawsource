package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzzx {
    public final int zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public zzzx(int i, byte[] bArr, int i2, int i3) {
        this.zza = i;
        this.zzb = bArr;
        this.zzc = i2;
        this.zzd = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzzx zzzx = (zzzx) obj;
            return this.zza == zzzx.zza && this.zzc == zzzx.zzc && this.zzd == zzzx.zzd && Arrays.equals(this.zzb, zzzx.zzb);
        }
    }

    public final int hashCode() {
        return (((((this.zza * 31) + Arrays.hashCode(this.zzb)) * 31) + this.zzc) * 31) + this.zzd;
    }
}
