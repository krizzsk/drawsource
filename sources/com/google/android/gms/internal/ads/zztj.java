package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zztj {
    private final zzdy zza = new zzdy(32);
    private zzti zzb;
    private zzti zzc;
    private zzti zzd;
    private long zze;
    private final zzvv zzf;

    public zztj(zzvv zzvv, byte[] bArr) {
        this.zzf = zzvv;
        zzti zzti = new zzti(0, 65536);
        this.zzb = zzti;
        this.zzc = zzti;
        this.zzd = zzti;
    }

    private final int zzi(int i) {
        zzti zzti = this.zzd;
        if (zzti.zzc == null) {
            zzvo zzb2 = this.zzf.zzb();
            zzti zzti2 = new zzti(this.zzd.zzb, 65536);
            zzti.zzc = zzb2;
            zzti.zzd = zzti2;
        }
        return Math.min(i, (int) (this.zzd.zzb - this.zze));
    }

    private static zzti zzj(zzti zzti, long j) {
        while (j >= zzti.zzb) {
            zzti = zzti.zzd;
        }
        return zzti;
    }

    private static zzti zzk(zzti zzti, long j, ByteBuffer byteBuffer, int i) {
        zzti zzj = zzj(zzti, j);
        while (i > 0) {
            int min = Math.min(i, (int) (zzj.zzb - j));
            byteBuffer.put(zzj.zzc.zza, zzj.zza(j), min);
            i -= min;
            j += (long) min;
            if (j == zzj.zzb) {
                zzj = zzj.zzd;
            }
        }
        return zzj;
    }

    private static zzti zzl(zzti zzti, long j, byte[] bArr, int i) {
        zzti zzj = zzj(zzti, j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (zzj.zzb - j));
            System.arraycopy(zzj.zzc.zza, zzj.zza(j), bArr, i - i2, min);
            i2 -= min;
            j += (long) min;
            if (j == zzj.zzb) {
                zzj = zzj.zzd;
            }
        }
        return zzj;
    }

    private static zzti zzm(zzti zzti, zzgb zzgb, zztl zztl, zzdy zzdy) {
        zzti zzti2;
        zzgb zzgb2 = zzgb;
        zztl zztl2 = zztl;
        zzdy zzdy2 = zzdy;
        if (zzgb.zzk()) {
            long j = zztl2.zzb;
            int i = 1;
            zzdy2.zzC(1);
            zzti zzl = zzl(zzti, j, zzdy.zzH(), 1);
            long j2 = j + 1;
            byte b = zzdy.zzH()[0];
            byte b2 = b & 128;
            byte b3 = b & Byte.MAX_VALUE;
            zzfy zzfy = zzgb2.zza;
            byte[] bArr = zzfy.zza;
            if (bArr == null) {
                zzfy.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            zzti2 = zzl(zzl, j2, zzfy.zza, b3);
            long j3 = j2 + ((long) b3);
            if (b2 != 0) {
                zzdy2.zzC(2);
                zzti2 = zzl(zzti2, j3, zzdy.zzH(), 2);
                j3 += 2;
                i = zzdy.zzo();
            }
            int i2 = i;
            int[] iArr = zzfy.zzd;
            if (iArr == null || iArr.length < i2) {
                iArr = new int[i2];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzfy.zze;
            if (iArr3 == null || iArr3.length < i2) {
                iArr3 = new int[i2];
            }
            int[] iArr4 = iArr3;
            if (b2 != 0) {
                int i3 = i2 * 6;
                zzdy2.zzC(i3);
                zzti2 = zzl(zzti2, j3, zzdy.zzH(), i3);
                j3 += (long) i3;
                zzdy2.zzF(0);
                for (int i4 = 0; i4 < i2; i4++) {
                    iArr2[i4] = zzdy.zzo();
                    iArr4[i4] = zzdy.zzn();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zztl2.zza - ((int) (j3 - zztl2.zzb));
            }
            zzzx zzzx = zztl2.zzc;
            int i5 = zzeg.zza;
            zzfy.zzc(i2, iArr2, iArr4, zzzx.zzb, zzfy.zza, zzzx.zza, zzzx.zzc, zzzx.zzd);
            long j4 = zztl2.zzb;
            int i6 = (int) (j3 - j4);
            zztl2.zzb = j4 + ((long) i6);
            zztl2.zza -= i6;
        } else {
            zzti2 = zzti;
        }
        if (zzgb.zze()) {
            zzdy2.zzC(4);
            zzti zzl2 = zzl(zzti2, zztl2.zzb, zzdy.zzH(), 4);
            int zzn = zzdy.zzn();
            zztl2.zzb += 4;
            zztl2.zza -= 4;
            zzgb2.zzi(zzn);
            zzti zzk = zzk(zzl2, zztl2.zzb, zzgb2.zzb, zzn);
            zztl2.zzb += (long) zzn;
            int i7 = zztl2.zza - zzn;
            zztl2.zza = i7;
            ByteBuffer byteBuffer = zzgb2.zze;
            if (byteBuffer == null || byteBuffer.capacity() < i7) {
                zzgb2.zze = ByteBuffer.allocate(i7);
            } else {
                zzgb2.zze.clear();
            }
            return zzk(zzk, zztl2.zzb, zzgb2.zze, zztl2.zza);
        }
        zzgb2.zzi(zztl2.zza);
        return zzk(zzti2, zztl2.zzb, zzgb2.zzb, zztl2.zza);
    }

    private final void zzn(int i) {
        long j = this.zze + ((long) i);
        this.zze = j;
        zzti zzti = this.zzd;
        if (j == zzti.zzb) {
            this.zzd = zzti.zzd;
        }
    }

    public final int zza(zzp zzp, int i, boolean z) throws IOException {
        int zzi = zzi(i);
        zzti zzti = this.zzd;
        int zza2 = zzp.zza(zzti.zzc.zza, zzti.zza(this.zze), zzi);
        if (zza2 != -1) {
            zzn(zza2);
            return zza2;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public final long zzb() {
        return this.zze;
    }

    public final void zzc(long j) {
        zzti zzti;
        if (j != -1) {
            while (true) {
                zzti = this.zzb;
                if (j < zzti.zzb) {
                    break;
                }
                this.zzf.zzc(zzti.zzc);
                this.zzb = this.zzb.zzb();
            }
            if (this.zzc.zza < zzti.zza) {
                this.zzc = zzti;
            }
        }
    }

    public final void zzd(zzgb zzgb, zztl zztl) {
        zzm(this.zzc, zzgb, zztl, this.zza);
    }

    public final void zze(zzgb zzgb, zztl zztl) {
        this.zzc = zzm(this.zzc, zzgb, zztl, this.zza);
    }

    public final void zzf() {
        zzti zzti = this.zzb;
        if (zzti.zzc != null) {
            this.zzf.zzd(zzti);
            zzti.zzb();
        }
        this.zzb.zze(0, 65536);
        zzti zzti2 = this.zzb;
        this.zzc = zzti2;
        this.zzd = zzti2;
        this.zze = 0;
        this.zzf.zzg();
    }

    public final void zzg() {
        this.zzc = this.zzb;
    }

    public final void zzh(zzdy zzdy, int i) {
        while (i > 0) {
            int zzi = zzi(i);
            zzti zzti = this.zzd;
            zzdy.zzB(zzti.zzc.zza, zzti.zza(this.zze), zzi);
            i -= zzi;
            zzn(zzi);
        }
    }
}
