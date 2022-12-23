package com.google.android.gms.internal.ads;

import android.support.p003v4.media.session.PlaybackStateCompat;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public class zzyh {
    protected final zzyb zza;
    protected final zzyg zzb;
    protected zzyd zzc;
    private final int zzd;

    protected zzyh(zzye zzye, zzyg zzyg, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.zzb = zzyg;
        this.zzd = i;
        this.zza = new zzyb(zzye, j, 0, j3, j4, j5, j6);
    }

    protected static final int zzf(zzys zzys, long j, zzzr zzzr) {
        if (j == zzys.zzf()) {
            return 0;
        }
        zzzr.zza = j;
        return 1;
    }

    protected static final boolean zzg(zzys zzys, long j) throws IOException {
        long zzf = j - zzys.zzf();
        if (zzf < 0 || zzf > PlaybackStateCompat.ACTION_SET_REPEAT_MODE) {
            return false;
        }
        ((zzyl) zzys).zzo((int) zzf, false);
        return true;
    }

    public final int zza(zzys zzys, zzzr zzzr) throws IOException {
        while (true) {
            zzyd zzyd = this.zzc;
            zzcw.zzb(zzyd);
            long zzb2 = zzyd.zzf;
            long zza2 = zzyd.zzg;
            long zzc2 = zzyd.zzh;
            if (zza2 - zzb2 <= ((long) this.zzd)) {
                zzc(false, zzb2);
                return zzf(zzys, zzb2, zzzr);
            } else if (!zzg(zzys, zzc2)) {
                return zzf(zzys, zzc2, zzzr);
            } else {
                zzys.zzj();
                zzyf zza3 = this.zzb.zza(zzys, zzyd.zzb);
                int zza4 = zza3.zzb;
                if (zza4 == -3) {
                    zzc(false, zzc2);
                    return zzf(zzys, zzc2, zzzr);
                } else if (zza4 == -2) {
                    zzyd.zzh(zzyd, zza3.zzc, zza3.zzd);
                } else if (zza4 != -1) {
                    zzg(zzys, zza3.zzd);
                    zzc(true, zza3.zzd);
                    return zzf(zzys, zza3.zzd, zzzr);
                } else {
                    zzyd.zzg(zzyd, zza3.zzc, zza3.zzd);
                }
            }
        }
    }

    public final zzzu zzb() {
        return this.zza;
    }

    /* access modifiers changed from: protected */
    public final void zzc(boolean z, long j) {
        this.zzc = null;
        this.zzb.zzb();
    }

    public final void zzd(long j) {
        long j2 = j;
        zzyd zzyd = this.zzc;
        if (zzyd == null || zzyd.zza != j2) {
            long zzf = this.zza.zzf(j2);
            zzyb zzyb = this.zza;
            zzyd zzyd2 = r1;
            zzyd zzyd3 = new zzyd(j, zzf, 0, zzyb.zzc, zzyb.zzd, zzyb.zze, zzyb.zzf);
            this.zzc = zzyd2;
        }
    }

    public final boolean zze() {
        return this.zzc != null;
    }
}
