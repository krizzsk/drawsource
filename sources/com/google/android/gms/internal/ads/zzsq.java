package com.google.android.gms.internal.ads;

import com.facebook.internal.security.CertificateUtil;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzsq implements zzry, zzrx {
    private final zzry[] zza;
    private final IdentityHashMap zzb;
    private final ArrayList zzc = new ArrayList();
    private final HashMap zzd = new HashMap();
    private zzrx zze;
    private zzty zzf;
    private zzry[] zzg;
    private zzts zzh;
    private final zzrl zzi;

    public zzsq(zzrl zzrl, long[] jArr, zzry[] zzryArr, byte... bArr) {
        this.zzi = zzrl;
        this.zza = zzryArr;
        this.zzh = new zzrk(new zzts[0]);
        this.zzb = new IdentityHashMap();
        this.zzg = new zzry[0];
        for (int i = 0; i < zzryArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.zza[i] = new zzso(zzryArr[i], j);
            }
        }
    }

    public final long zza(long j, zzjw zzjw) {
        zzry[] zzryArr = this.zzg;
        return (zzryArr.length > 0 ? zzryArr[0] : this.zza[0]).zza(j, zzjw);
    }

    public final long zzb() {
        return this.zzh.zzb();
    }

    public final long zzc() {
        return this.zzh.zzc();
    }

    public final long zzd() {
        long j = -9223372036854775807L;
        for (zzry zzry : this.zzg) {
            long zzd2 = zzry.zzd();
            if (zzd2 != -9223372036854775807L) {
                if (j == -9223372036854775807L) {
                    zzry[] zzryArr = this.zzg;
                    int length = zzryArr.length;
                    int i = 0;
                    while (i < length) {
                        zzry zzry2 = zzryArr[i];
                        if (zzry2 == zzry) {
                            break;
                        } else if (zzry2.zze(zzd2) == zzd2) {
                            i++;
                        } else {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = zzd2;
                } else if (zzd2 != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (!(j == -9223372036854775807L || zzry.zze(j) == j)) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    public final long zze(long j) {
        long zze2 = this.zzg[0].zze(j);
        int i = 1;
        while (true) {
            zzry[] zzryArr = this.zzg;
            if (i >= zzryArr.length) {
                return zze2;
            }
            if (zzryArr[i].zze(zze2) == zze2) {
                i++;
            } else {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
    }

    public final long zzf(zzvg[] zzvgArr, boolean[] zArr, zztq[] zztqArr, boolean[] zArr2, long j) {
        ArrayList arrayList;
        int i;
        zzvg[] zzvgArr2 = zzvgArr;
        zztq[] zztqArr2 = zztqArr;
        int length = zzvgArr2.length;
        int[] iArr = new int[length];
        int[] iArr2 = new int[length];
        int i2 = 0;
        while (true) {
            int length2 = zzvgArr2.length;
            if (i2 < length2) {
                zztq zztq = zztqArr2[i2];
                Integer num = zztq == null ? null : (Integer) this.zzb.get(zztq);
                if (num == null) {
                    i = -1;
                } else {
                    i = num.intValue();
                }
                iArr[i2] = i;
                iArr2[i2] = -1;
                zzvg zzvg = zzvgArr2[i2];
                if (zzvg != null) {
                    zzck zzck = (zzck) this.zzd.get(zzvg.zze());
                    if (zzck != null) {
                        int i3 = 0;
                        while (true) {
                            zzry[] zzryArr = this.zza;
                            if (i3 >= zzryArr.length) {
                                break;
                            } else if (zzryArr[i3].zzh().zza(zzck) != -1) {
                                iArr2[i2] = i3;
                                break;
                            } else {
                                i3++;
                            }
                        }
                    } else {
                        throw null;
                    }
                }
                i2++;
            } else {
                this.zzb.clear();
                zztq[] zztqArr3 = new zztq[length2];
                zztq[] zztqArr4 = new zztq[length2];
                zzvg[] zzvgArr3 = new zzvg[length2];
                ArrayList arrayList2 = new ArrayList(this.zza.length);
                long j2 = j;
                int i4 = 0;
                while (i4 < this.zza.length) {
                    for (int i5 = 0; i5 < zzvgArr2.length; i5++) {
                        zztqArr4[i5] = iArr[i5] == i4 ? zztqArr2[i5] : null;
                        if (iArr2[i5] == i4) {
                            zzvg zzvg2 = zzvgArr2[i5];
                            if (zzvg2 != null) {
                                zzck zzck2 = (zzck) this.zzd.get(zzvg2.zze());
                                if (zzck2 != null) {
                                    zzvgArr3[i5] = new zzsn(zzvg2, zzck2);
                                } else {
                                    throw null;
                                }
                            } else {
                                throw null;
                            }
                        } else {
                            zzvgArr3[i5] = null;
                        }
                    }
                    int i6 = i4;
                    ArrayList arrayList3 = arrayList2;
                    zztq[] zztqArr5 = zztqArr4;
                    zzvg[] zzvgArr4 = zzvgArr3;
                    long zzf2 = this.zza[i4].zzf(zzvgArr3, zArr, zztqArr4, zArr2, j2);
                    if (i6 == 0) {
                        j2 = zzf2;
                    } else if (zzf2 != j2) {
                        throw new IllegalStateException("Children enabled at different positions.");
                    }
                    boolean z = false;
                    for (int i7 = 0; i7 < zzvgArr2.length; i7++) {
                        boolean z2 = true;
                        if (iArr2[i7] == i6) {
                            zztq zztq2 = zztqArr5[i7];
                            if (zztq2 != null) {
                                zztqArr3[i7] = zztq2;
                                this.zzb.put(zztq2, Integer.valueOf(i6));
                                z = true;
                            } else {
                                throw null;
                            }
                        } else if (iArr[i7] == i6) {
                            if (zztqArr5[i7] != null) {
                                z2 = false;
                            }
                            zzcw.zzf(z2);
                        }
                    }
                    if (z) {
                        arrayList = arrayList3;
                        arrayList.add(this.zza[i6]);
                    } else {
                        arrayList = arrayList3;
                    }
                    i4 = i6 + 1;
                    arrayList2 = arrayList;
                    zztqArr4 = zztqArr5;
                    zzvgArr3 = zzvgArr4;
                }
                System.arraycopy(zztqArr3, 0, zztqArr2, 0, length2);
                zzry[] zzryArr2 = (zzry[]) arrayList2.toArray(new zzry[0]);
                this.zzg = zzryArr2;
                this.zzh = new zzrk(zzryArr2);
                return j2;
            }
        }
    }

    public final /* bridge */ /* synthetic */ void zzg(zzts zzts) {
        zzry zzry = (zzry) zzts;
        zzrx zzrx = this.zze;
        if (zzrx != null) {
            zzrx.zzg(this);
            return;
        }
        throw null;
    }

    public final zzty zzh() {
        zzty zzty = this.zzf;
        if (zzty != null) {
            return zzty;
        }
        throw null;
    }

    public final void zzi(zzry zzry) {
        this.zzc.remove(zzry);
        if (this.zzc.isEmpty()) {
            int i = 0;
            for (zzry zzh2 : this.zza) {
                i += zzh2.zzh().zzc;
            }
            zzck[] zzckArr = new zzck[i];
            int i2 = 0;
            int i3 = 0;
            while (true) {
                zzry[] zzryArr = this.zza;
                if (i2 >= zzryArr.length) {
                    break;
                }
                zzty zzh3 = zzryArr[i2].zzh();
                int i4 = zzh3.zzc;
                int i5 = 0;
                while (i5 < i4) {
                    zzck zzb2 = zzh3.zzb(i5);
                    zzck zzc2 = zzb2.zzc(i2 + CertificateUtil.DELIMITER + zzb2.zzc);
                    this.zzd.put(zzc2, zzb2);
                    zzckArr[i3] = zzc2;
                    i5++;
                    i3++;
                }
                i2++;
            }
            this.zzf = new zzty(zzckArr);
            zzrx zzrx = this.zze;
            if (zzrx != null) {
                zzrx.zzi(this);
                return;
            }
            throw null;
        }
    }

    public final void zzj(long j, boolean z) {
        for (zzry zzj : this.zzg) {
            zzj.zzj(j, false);
        }
    }

    public final void zzk() throws IOException {
        for (zzry zzk : this.zza) {
            zzk.zzk();
        }
    }

    public final void zzl(zzrx zzrx, long j) {
        this.zze = zzrx;
        Collections.addAll(this.zzc, this.zza);
        for (zzry zzl : this.zza) {
            zzl.zzl(this, j);
        }
    }

    public final void zzm(long j) {
        this.zzh.zzm(j);
    }

    public final zzry zzn(int i) {
        zzry zzry = this.zza[i];
        return zzry instanceof zzso ? ((zzso) zzry).zza : zzry;
    }

    public final boolean zzo(long j) {
        if (this.zzc.isEmpty()) {
            return this.zzh.zzo(j);
        }
        int size = this.zzc.size();
        for (int i = 0; i < size; i++) {
            ((zzry) this.zzc.get(i)).zzo(j);
        }
        return false;
    }

    public final boolean zzp() {
        return this.zzh.zzp();
    }
}
