package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzckj implements zzeq {
    private final zzeq zza;
    private final long zzb;
    private final zzeq zzc;
    private long zzd;
    private Uri zze;

    zzckj(zzeq zzeq, int i, zzeq zzeq2) {
        this.zza = zzeq;
        this.zzb = (long) i;
        this.zzc = zzeq2;
    }

    public final int zza(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        long j = this.zzd;
        long j2 = this.zzb;
        if (j < j2) {
            int zza2 = this.zza.zza(bArr, i, (int) Math.min((long) i2, j2 - j));
            long j3 = this.zzd + ((long) zza2);
            this.zzd = j3;
            i3 = zza2;
            j = j3;
        } else {
            i3 = 0;
        }
        if (j < this.zzb) {
            return i3;
        }
        int zza3 = this.zzc.zza(bArr, i + i3, i2 - i3);
        this.zzd += (long) zza3;
        return i3 + zza3;
    }

    public final long zzb(zzev zzev) throws IOException {
        zzev zzev2;
        zzev zzev3 = zzev;
        this.zze = zzev3.zza;
        long j = zzev3.zzf;
        long j2 = this.zzb;
        zzev zzev4 = null;
        if (j >= j2) {
            zzev2 = null;
        } else {
            long j3 = zzev3.zzg;
            zzev2 = new zzev(zzev3.zza, (byte[]) null, j, j, j3 != -1 ? Math.min(j3, j2 - j) : j2 - j, (String) null, 0);
        }
        long j4 = zzev3.zzg;
        if (j4 == -1 || zzev3.zzf + j4 > this.zzb) {
            long max = Math.max(this.zzb, zzev3.zzf);
            long j5 = zzev3.zzg;
            zzev4 = new zzev(zzev3.zza, (byte[]) null, max, max, j5 != -1 ? Math.min(j5, (zzev3.zzf + j5) - this.zzb) : -1, (String) null, 0);
        }
        long j6 = 0;
        long zzb2 = zzev2 != null ? this.zza.zzb(zzev2) : 0;
        if (zzev4 != null) {
            j6 = this.zzc.zzb(zzev4);
        }
        this.zzd = zzev3.zzf;
        if (zzb2 == -1 || j6 == -1) {
            return -1;
        }
        return zzb2 + j6;
    }

    public final Uri zzc() {
        return this.zze;
    }

    public final void zzd() throws IOException {
        this.zza.zzd();
        this.zzc.zzd();
    }

    public final Map zze() {
        return zzfrm.zzd();
    }

    public final void zzf(zzfs zzfs) {
    }
}
