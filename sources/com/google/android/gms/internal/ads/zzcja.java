package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzcja implements zzayj {
    private final zzayj zza;
    private final long zzb;
    private final zzayj zzc;
    private long zzd;
    private Uri zze;

    zzcja(zzayj zzayj, int i, zzayj zzayj2) {
        this.zza = zzayj;
        this.zzb = (long) i;
        this.zzc = zzayj2;
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

    public final Uri zzc() {
        return this.zze;
    }

    public final void zzd() throws IOException {
        this.zza.zzd();
        this.zzc.zzd();
    }

    public final long zzb(zzayl zzayl) throws IOException {
        zzayl zzayl2;
        zzayl zzayl3 = zzayl;
        this.zze = zzayl3.zza;
        long j = zzayl3.zzc;
        long j2 = this.zzb;
        zzayl zzayl4 = null;
        if (j >= j2) {
            zzayl2 = null;
        } else {
            long j3 = zzayl3.zzd;
            zzayl2 = new zzayl(zzayl3.zza, (byte[]) null, j, j, j3 != -1 ? Math.min(j3, j2 - j) : j2 - j, (String) null, 0);
        }
        long j4 = zzayl3.zzd;
        if (j4 == -1 || zzayl3.zzc + j4 > this.zzb) {
            long max = Math.max(this.zzb, zzayl3.zzc);
            long j5 = zzayl3.zzd;
            zzayl4 = new zzayl(zzayl3.zza, (byte[]) null, max, max, j5 != -1 ? Math.min(j5, (zzayl3.zzc + j5) - this.zzb) : -1, (String) null, 0);
        }
        long j6 = 0;
        long zzb2 = zzayl2 != null ? this.zza.zzb(zzayl2) : 0;
        if (zzayl4 != null) {
            j6 = this.zzc.zzb(zzayl4);
        }
        this.zzd = zzayl3.zzc;
        if (j6 == -1) {
            return -1;
        }
        return zzb2 + j6;
    }
}
