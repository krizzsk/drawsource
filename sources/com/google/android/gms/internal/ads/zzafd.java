package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzafd implements zzyr {
    public static final zzyy zza = zzafc.zza;
    private zzyu zzb;
    private zzafl zzc;
    private boolean zzd;

    @EnsuresNonNullIf(expression = {"streamReader"}, result = true)
    private final boolean zze(zzys zzys) throws IOException {
        zzaff zzaff = new zzaff();
        if (zzaff.zzb(zzys, true) && (zzaff.zza & 2) == 2) {
            int min = Math.min(zzaff.zze, 8);
            zzdy zzdy = new zzdy(min);
            ((zzyl) zzys).zzm(zzdy.zzH(), 0, min, false);
            zzdy.zzF(0);
            if (zzdy.zza() >= 5 && zzdy.zzk() == 127 && zzdy.zzs() == 1179402563) {
                this.zzc = new zzafb();
            } else {
                zzdy.zzF(0);
                try {
                    if (zzaae.zzd(1, zzdy, true)) {
                        this.zzc = new zzafn();
                    }
                } catch (zzbp unused) {
                }
                zzdy.zzF(0);
                if (zzafh.zzd(zzdy)) {
                    this.zzc = new zzafh();
                }
            }
            return true;
        }
        return false;
    }

    public final int zza(zzys zzys, zzzr zzzr) throws IOException {
        zzcw.zzb(this.zzb);
        if (this.zzc == null) {
            if (zze(zzys)) {
                zzys.zzj();
            } else {
                throw zzbp.zza("Failed to determine bitstream type", (Throwable) null);
            }
        }
        if (!this.zzd) {
            zzzy zzv = this.zzb.zzv(0, 1);
            this.zzb.zzB();
            this.zzc.zzh(this.zzb, zzv);
            this.zzd = true;
        }
        return this.zzc.zze(zzys, zzzr);
    }

    public final void zzb(zzyu zzyu) {
        this.zzb = zzyu;
    }

    public final void zzc(long j, long j2) {
        zzafl zzafl = this.zzc;
        if (zzafl != null) {
            zzafl.zzj(j, j2);
        }
    }

    public final boolean zzd(zzys zzys) throws IOException {
        try {
            return zze(zzys);
        } catch (zzbp unused) {
            return false;
        }
    }
}
