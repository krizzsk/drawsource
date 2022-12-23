package com.google.android.gms.internal.ads;

import android.util.Log;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzpy {
    private long zza;
    private long zzb;
    private boolean zzc;

    zzpy() {
    }

    private final long zzd(long j) {
        return this.zza + Math.max(0, ((this.zzb - 529) * 1000000) / j);
    }

    public final long zza(zzad zzad) {
        return zzd((long) zzad.zzA);
    }

    public final long zzb(zzad zzad, zzgb zzgb) {
        if (this.zzb == 0) {
            this.zza = zzgb.zzd;
        }
        if (this.zzc) {
            return zzgb.zzd;
        }
        ByteBuffer byteBuffer = zzgb.zzb;
        if (byteBuffer != null) {
            byte b = 0;
            for (int i = 0; i < 4; i++) {
                b = (b << 8) | (byteBuffer.get(i) & 255);
            }
            int zzc2 = zzzl.zzc(b);
            if (zzc2 == -1) {
                this.zzc = true;
                this.zzb = 0;
                this.zza = zzgb.zzd;
                Log.w("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
                return zzgb.zzd;
            }
            long zzd = zzd((long) zzad.zzA);
            this.zzb += (long) zzc2;
            return zzd;
        }
        throw null;
    }

    public final void zzc() {
        this.zza = 0;
        this.zzb = 0;
        this.zzc = false;
    }
}
