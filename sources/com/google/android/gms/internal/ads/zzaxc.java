package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.IdentityHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzaxc implements zzawz, zzawy {
    public final zzawz[] zza;
    private final IdentityHashMap zzb = new IdentityHashMap();
    private zzawy zzc;
    private int zzd;
    private zzaxq zze;
    private zzawz[] zzf;
    private zzaxn zzg;

    public zzaxc(zzawz... zzawzArr) {
        this.zza = zzawzArr;
    }

    public final long zzB(zzaxu[] zzaxuArr, boolean[] zArr, zzaxl[] zzaxlArr, boolean[] zArr2, long j) {
        int length;
        int i;
        zzaxu[] zzaxuArr2 = zzaxuArr;
        zzaxl[] zzaxlArr2 = zzaxlArr;
        int length2 = zzaxuArr2.length;
        int[] iArr = new int[length2];
        int[] iArr2 = new int[length2];
        int i2 = 0;
        while (true) {
            length = zzaxuArr2.length;
            if (i2 >= length) {
                break;
            }
            zzaxl zzaxl = zzaxlArr2[i2];
            if (zzaxl == null) {
                i = -1;
            } else {
                i = ((Integer) this.zzb.get(zzaxl)).intValue();
            }
            iArr[i2] = i;
            iArr2[i2] = -1;
            zzaxu zzaxu = zzaxuArr2[i2];
            if (zzaxu != null) {
                zzaxp zzd2 = zzaxu.zzd();
                int i3 = 0;
                while (true) {
                    zzawz[] zzawzArr = this.zza;
                    if (i3 >= zzawzArr.length) {
                        break;
                    } else if (zzawzArr[i3].zzn().zza(zzd2) != -1) {
                        iArr2[i2] = i3;
                        break;
                    } else {
                        i3++;
                    }
                }
            }
            i2++;
        }
        this.zzb.clear();
        zzaxl[] zzaxlArr3 = new zzaxl[length];
        zzaxl[] zzaxlArr4 = new zzaxl[length];
        zzaxu[] zzaxuArr3 = new zzaxu[length];
        ArrayList arrayList = new ArrayList(this.zza.length);
        long j2 = j;
        int i4 = 0;
        while (i4 < this.zza.length) {
            for (int i5 = 0; i5 < zzaxuArr2.length; i5++) {
                zzaxu zzaxu2 = null;
                zzaxlArr4[i5] = iArr[i5] == i4 ? zzaxlArr2[i5] : null;
                if (iArr2[i5] == i4) {
                    zzaxu2 = zzaxuArr2[i5];
                }
                zzaxuArr3[i5] = zzaxu2;
            }
            int i6 = i4;
            zzaxu[] zzaxuArr4 = zzaxuArr3;
            ArrayList arrayList2 = arrayList;
            long zzB = this.zza[i4].zzB(zzaxuArr3, zArr, zzaxlArr4, zArr2, j2);
            if (i6 == 0) {
                j2 = zzB;
            } else if (zzB != j2) {
                throw new IllegalStateException("Children enabled at different positions");
            }
            boolean z = false;
            for (int i7 = 0; i7 < zzaxuArr2.length; i7++) {
                boolean z2 = true;
                if (iArr2[i7] == i6) {
                    zzayz.zze(zzaxlArr4[i7] != null);
                    zzaxl zzaxl2 = zzaxlArr4[i7];
                    zzaxlArr3[i7] = zzaxl2;
                    this.zzb.put(zzaxl2, Integer.valueOf(i6));
                    z = true;
                } else if (iArr[i7] == i6) {
                    if (zzaxlArr4[i7] != null) {
                        z2 = false;
                    }
                    zzayz.zze(z2);
                }
            }
            if (z) {
                arrayList2.add(this.zza[i6]);
            }
            i4 = i6 + 1;
            arrayList = arrayList2;
            zzaxuArr3 = zzaxuArr4;
            zzaxlArr2 = zzaxlArr;
        }
        zzaxl[] zzaxlArr5 = zzaxlArr2;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(zzaxlArr3, 0, zzaxlArr5, 0, length);
        zzawz[] zzawzArr2 = new zzawz[arrayList3.size()];
        this.zzf = zzawzArr2;
        arrayList3.toArray(zzawzArr2);
        this.zzg = new zzawn(this.zzf);
        return j2;
    }

    public final long zza() {
        return this.zzg.zza();
    }

    public final boolean zzbj(long j) {
        return this.zzg.zzbj(j);
    }

    public final /* bridge */ /* synthetic */ void zze(zzaxn zzaxn) {
        zzawz zzawz = (zzawz) zzaxn;
        if (this.zze != null) {
            this.zzc.zze(this);
        }
    }

    public final void zzf(zzawz zzawz) {
        int i = this.zzd - 1;
        this.zzd = i;
        if (i <= 0) {
            int i2 = 0;
            for (zzawz zzn : this.zza) {
                i2 += zzn.zzn().zzb;
            }
            zzaxp[] zzaxpArr = new zzaxp[i2];
            int i3 = 0;
            for (zzawz zzn2 : this.zza) {
                zzaxq zzn3 = zzn2.zzn();
                int i4 = zzn3.zzb;
                int i5 = 0;
                while (i5 < i4) {
                    zzaxpArr[i3] = zzn3.zzb(i5);
                    i5++;
                    i3++;
                }
            }
            this.zze = new zzaxq(zzaxpArr);
            this.zzc.zzf(this);
        }
    }

    public final long zzg() {
        long j = Long.MAX_VALUE;
        for (zzawz zzg2 : this.zzf) {
            long zzg3 = zzg2.zzg();
            if (zzg3 != Long.MIN_VALUE) {
                j = Math.min(j, zzg3);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    public final long zzh() {
        long zzh = this.zza[0].zzh();
        int i = 1;
        while (true) {
            zzawz[] zzawzArr = this.zza;
            if (i >= zzawzArr.length) {
                if (zzh != -9223372036854775807L) {
                    zzawz[] zzawzArr2 = this.zzf;
                    int length = zzawzArr2.length;
                    int i2 = 0;
                    while (i2 < length) {
                        zzawz zzawz = zzawzArr2[i2];
                        if (zzawz == this.zza[0] || zzawz.zzi(zzh) == zzh) {
                            i2++;
                        } else {
                            throw new IllegalStateException("Children seeked to different positions");
                        }
                    }
                }
                return zzh;
            } else if (zzawzArr[i].zzh() == -9223372036854775807L) {
                i++;
            } else {
                throw new IllegalStateException("Child reported discontinuity");
            }
        }
    }

    public final long zzi(long j) {
        long zzi = this.zzf[0].zzi(j);
        int i = 1;
        while (true) {
            zzawz[] zzawzArr = this.zzf;
            if (i >= zzawzArr.length) {
                return zzi;
            }
            if (zzawzArr[i].zzi(zzi) == zzi) {
                i++;
            } else {
                throw new IllegalStateException("Children seeked to different positions");
            }
        }
    }

    public final zzaxq zzn() {
        return this.zze;
    }

    public final void zzq(long j) {
        for (zzawz zzq : this.zzf) {
            zzq.zzq(j);
        }
    }

    public final void zzs() throws IOException {
        for (zzawz zzs : this.zza) {
            zzs.zzs();
        }
    }

    public final void zzw(zzawy zzawy, long j) {
        this.zzc = zzawy;
        this.zzd = r0;
        for (zzawz zzw : this.zza) {
            zzw.zzw(this, j);
        }
    }
}
