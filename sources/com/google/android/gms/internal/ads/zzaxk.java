package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzaxk implements zzauf {
    private final zzaxh zza = new zzaxh();
    private final zzaxg zzb = new zzaxg();
    private final zzazh zzc = new zzazh(32);
    private final AtomicInteger zzd = new AtomicInteger();
    private zzaxi zze;
    private zzaxi zzf;
    private zzart zzg;
    private zzart zzh;
    private long zzi;
    private int zzj = 65536;
    private zzaxj zzk;
    private final zzaym zzl;

    public zzaxk(zzaym zzaym, byte[] bArr) {
        this.zzl = zzaym;
        zzaxi zzaxi = new zzaxi(0, 65536);
        this.zze = zzaxi;
        this.zzf = zzaxi;
    }

    private final int zzo(int i) {
        if (this.zzj == 65536) {
            this.zzj = 0;
            zzaxi zzaxi = this.zzf;
            if (zzaxi.zzc) {
                this.zzf = zzaxi.zze;
            }
            zzaxi zzaxi2 = this.zzf;
            zzayg zzb2 = this.zzl.zzb();
            zzaxi zzaxi3 = new zzaxi(this.zzf.zzb, 65536);
            zzaxi2.zzd = zzb2;
            zzaxi2.zze = zzaxi3;
            zzaxi2.zzc = true;
        }
        return Math.min(i, 65536 - this.zzj);
    }

    private final void zzp() {
        this.zza.zzg();
        zzaxi zzaxi = this.zze;
        if (zzaxi.zzc) {
            zzaxi zzaxi2 = this.zzf;
            int i = (zzaxi2.zzc ? 1 : 0) + (((int) (zzaxi2.zza - zzaxi.zza)) / 65536);
            zzayg[] zzaygArr = new zzayg[i];
            for (int i2 = 0; i2 < i; i2++) {
                zzaygArr[i2] = zzaxi.zzd;
                zzaxi.zzd = null;
                zzaxi = zzaxi.zze;
            }
            this.zzl.zzd(zzaygArr);
        }
        zzaxi zzaxi3 = new zzaxi(0, 65536);
        this.zze = zzaxi3;
        this.zzf = zzaxi3;
        this.zzi = 0;
        this.zzj = 65536;
        this.zzl.zzg();
    }

    private final void zzq(long j) {
        while (true) {
            zzaxi zzaxi = this.zze;
            if (j >= zzaxi.zzb) {
                this.zzl.zzc(zzaxi.zzd);
                zzaxi zzaxi2 = this.zze;
                zzaxi2.zzd = null;
                this.zze = zzaxi2.zze;
            } else {
                return;
            }
        }
    }

    private final void zzr() {
        if (!this.zzd.compareAndSet(1, 0)) {
            zzp();
        }
    }

    private final void zzs(long j, byte[] bArr, int i) {
        zzq(j);
        int i2 = 0;
        while (i2 < i) {
            int i3 = (int) (j - this.zze.zza);
            int min = Math.min(i - i2, 65536 - i3);
            zzayg zzayg = this.zze.zzd;
            System.arraycopy(zzayg.zza, i3, bArr, i2, min);
            j += (long) min;
            i2 += min;
            if (j == this.zze.zzb) {
                this.zzl.zzc(zzayg);
                zzaxi zzaxi = this.zze;
                zzaxi.zzd = null;
                this.zze = zzaxi.zze;
            }
        }
    }

    private final boolean zzt() {
        return this.zzd.compareAndSet(0, 1);
    }

    public final void zza(zzart zzart) {
        zzart zzart2 = zzart == null ? null : zzart;
        boolean zzk2 = this.zza.zzk(zzart2);
        this.zzh = zzart;
        zzaxj zzaxj = this.zzk;
        if (zzaxj != null && zzk2) {
            zzaxj.zzv(zzart2);
        }
    }

    public final void zzb(zzazh zzazh, int i) {
        if (zzt()) {
            while (i > 0) {
                int zzo = zzo(i);
                zzazh.zzq(this.zzf.zzd.zza, this.zzj, zzo);
                this.zzj += zzo;
                this.zzi += (long) zzo;
                i -= zzo;
            }
            zzr();
            return;
        }
        zzazh.zzw(i);
    }

    public final void zzc(long j, int i, int i2, int i3, zzaue zzaue) {
        if (zzt()) {
            try {
                this.zza.zzh(j, i, this.zzi - ((long) i2), i2, zzaue);
            } finally {
                zzr();
            }
        } else {
            long j2 = j;
            this.zza.zzi(j);
        }
    }

    public final int zzd(zzatv zzatv, int i, boolean z) throws IOException, InterruptedException {
        if (!zzt()) {
            int zzb2 = zzatv.zzb(i);
            if (zzb2 != -1) {
                return zzb2;
            }
            throw new EOFException();
        }
        try {
            int zza2 = zzatv.zza(this.zzf.zzd.zza, this.zzj, zzo(i));
            if (zza2 != -1) {
                this.zzj += zza2;
                this.zzi += (long) zza2;
                return zza2;
            }
            throw new EOFException();
        } finally {
            zzr();
        }
    }

    public final int zze() {
        return this.zza.zza();
    }

    public final int zzf(zzaru zzaru, zzato zzato, boolean z, boolean z2, long j) {
        zzato zzato2 = zzato;
        int zzb2 = this.zza.zzb(zzaru, zzato, z, z2, this.zzg, this.zzb);
        if (zzb2 == -5) {
            this.zzg = zzaru.zza;
            return -5;
        } else if (zzb2 != -4) {
            return -3;
        } else {
            if (!zzato.zzf()) {
                if (zzato2.zzc < j) {
                    zzato2.zza(Integer.MIN_VALUE);
                }
                if (zzato.zzi()) {
                    zzaxg zzaxg = this.zzb;
                    long j2 = zzaxg.zzb;
                    int i = 1;
                    this.zzc.zzs(1);
                    zzs(j2, this.zzc.zza, 1);
                    long j3 = j2 + 1;
                    byte b = this.zzc.zza[0];
                    byte b2 = b & 128;
                    byte b3 = b & Byte.MAX_VALUE;
                    zzatm zzatm = zzato2.zza;
                    if (zzatm.zza == null) {
                        zzatm.zza = new byte[16];
                    }
                    zzs(j3, zzatm.zza, b3);
                    long j4 = j3 + ((long) b3);
                    if (b2 != 0) {
                        this.zzc.zzs(2);
                        zzs(j4, this.zzc.zza, 2);
                        j4 += 2;
                        i = this.zzc.zzj();
                    }
                    int i2 = i;
                    zzatm zzatm2 = zzato2.zza;
                    int[] iArr = zzatm2.zzd;
                    if (iArr == null || iArr.length < i2) {
                        iArr = new int[i2];
                    }
                    int[] iArr2 = iArr;
                    int[] iArr3 = zzatm2.zze;
                    if (iArr3 == null || iArr3.length < i2) {
                        iArr3 = new int[i2];
                    }
                    int[] iArr4 = iArr3;
                    if (b2 != 0) {
                        int i3 = i2 * 6;
                        this.zzc.zzs(i3);
                        zzs(j4, this.zzc.zza, i3);
                        j4 += (long) i3;
                        this.zzc.zzv(0);
                        for (int i4 = 0; i4 < i2; i4++) {
                            iArr2[i4] = this.zzc.zzj();
                            iArr4[i4] = this.zzc.zzi();
                        }
                    } else {
                        iArr2[0] = 0;
                        iArr4[0] = zzaxg.zza - ((int) (j4 - zzaxg.zzb));
                    }
                    zzaue zzaue = zzaxg.zzd;
                    zzatm zzatm3 = zzato2.zza;
                    byte[] bArr = zzaue.zzb;
                    byte[] bArr2 = zzatm3.zza;
                    int i5 = zzaue.zza;
                    zzatm3.zzb(i2, iArr2, iArr4, bArr, bArr2, 1);
                    long j5 = zzaxg.zzb;
                    int i6 = (int) (j4 - j5);
                    zzaxg.zzb = j5 + ((long) i6);
                    zzaxg.zza -= i6;
                }
                zzato2.zzh(this.zzb.zza);
                zzaxg zzaxg2 = this.zzb;
                long j6 = zzaxg2.zzb;
                ByteBuffer byteBuffer = zzato2.zzb;
                int i7 = zzaxg2.zza;
                zzq(j6);
                while (i7 > 0) {
                    int i8 = (int) (j6 - this.zze.zza);
                    int min = Math.min(i7, 65536 - i8);
                    zzayg zzayg = this.zze.zzd;
                    byteBuffer.put(zzayg.zza, i8, min);
                    j6 += (long) min;
                    i7 -= min;
                    if (j6 == this.zze.zzb) {
                        this.zzl.zzc(zzayg);
                        zzaxi zzaxi = this.zze;
                        zzaxi.zzd = null;
                        this.zze = zzaxi.zze;
                    }
                }
                zzq(this.zzb.zzc);
            }
            return -4;
        }
    }

    public final long zzg() {
        return this.zza.zzc();
    }

    public final zzart zzh() {
        return this.zza.zzf();
    }

    public final void zzi() {
        if (this.zzd.getAndSet(2) == 0) {
            zzp();
        }
    }

    public final void zzj(boolean z) {
        int andSet = this.zzd.getAndSet(true != z ? 2 : 0);
        zzp();
        this.zza.zzj();
        if (andSet == 2) {
            this.zzg = null;
        }
    }

    public final void zzk(zzaxj zzaxj) {
        this.zzk = zzaxj;
    }

    public final void zzl() {
        long zzd2 = this.zza.zzd();
        if (zzd2 != -1) {
            zzq(zzd2);
        }
    }

    public final boolean zzm() {
        return this.zza.zzl();
    }

    public final boolean zzn(long j, boolean z) {
        long zze2 = this.zza.zze(j, z);
        if (zze2 == -1) {
            return false;
        }
        zzq(zze2);
        return true;
    }
}
