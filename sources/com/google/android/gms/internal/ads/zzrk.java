package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzrk implements zzts {
    protected final zzts[] zza;

    public zzrk(zzts[] zztsArr) {
        this.zza = zztsArr;
    }

    public final long zzb() {
        long j = Long.MAX_VALUE;
        for (zzts zzb : this.zza) {
            long zzb2 = zzb.zzb();
            if (zzb2 != Long.MIN_VALUE) {
                j = Math.min(j, zzb2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    public final long zzc() {
        long j = Long.MAX_VALUE;
        for (zzts zzc : this.zza) {
            long zzc2 = zzc.zzc();
            if (zzc2 != Long.MIN_VALUE) {
                j = Math.min(j, zzc2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    public final void zzm(long j) {
        for (zzts zzm : this.zza) {
            zzm.zzm(j);
        }
    }

    public final boolean zzo(long j) {
        long j2 = j;
        boolean z = false;
        while (true) {
            long zzc = zzc();
            if (zzc != Long.MIN_VALUE) {
                boolean z2 = false;
                for (zzts zzts : this.zza) {
                    long zzc2 = zzts.zzc();
                    boolean z3 = zzc2 != Long.MIN_VALUE && zzc2 <= j2;
                    if (zzc2 == zzc || z3) {
                        z2 |= zzts.zzo(j2);
                    }
                }
                z |= z2;
                if (!z2) {
                    break;
                }
            } else {
                break;
            }
        }
        return z;
    }

    public final boolean zzp() {
        for (zzts zzp : this.zza) {
            if (zzp.zzp()) {
                return true;
            }
        }
        return false;
    }
}
