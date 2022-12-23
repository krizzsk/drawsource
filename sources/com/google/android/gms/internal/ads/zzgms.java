package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzgms extends zzgji {
    static final int[] zza = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, IronSourceError.ERROR_BN_INSTANCE_LOAD_EMPTY_BANNER, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, Integer.MAX_VALUE};
    private final int zzc;
    /* access modifiers changed from: private */
    public final zzgji zzd;
    /* access modifiers changed from: private */
    public final zzgji zze;
    private final int zzf;
    private final int zzg;

    private zzgms(zzgji zzgji, zzgji zzgji2) {
        this.zzd = zzgji;
        this.zze = zzgji2;
        int zzd2 = zzgji.zzd();
        this.zzf = zzd2;
        this.zzc = zzd2 + zzgji2.zzd();
        this.zzg = Math.max(zzgji.zzf(), zzgji2.zzf()) + 1;
    }

    static zzgji zzG(zzgji zzgji, zzgji zzgji2) {
        if (zzgji2.zzd() == 0) {
            return zzgji;
        }
        if (zzgji.zzd() == 0) {
            return zzgji2;
        }
        int zzd2 = zzgji.zzd() + zzgji2.zzd();
        if (zzd2 < 128) {
            return zzH(zzgji, zzgji2);
        }
        if (zzgji instanceof zzgms) {
            zzgms zzgms = (zzgms) zzgji;
            if (zzgms.zze.zzd() + zzgji2.zzd() < 128) {
                return new zzgms(zzgms.zzd, zzH(zzgms.zze, zzgji2));
            } else if (zzgms.zzd.zzf() > zzgms.zze.zzf() && zzgms.zzg > zzgji2.zzf()) {
                return new zzgms(zzgms.zzd, new zzgms(zzgms.zze, zzgji2));
            }
        }
        if (zzd2 >= zzc(Math.max(zzgji.zzf(), zzgji2.zzf()) + 1)) {
            return new zzgms(zzgji, zzgji2);
        }
        return zzgmo.zza(new zzgmo((zzgmn) null), zzgji, zzgji2);
    }

    private static zzgji zzH(zzgji zzgji, zzgji zzgji2) {
        int zzd2 = zzgji.zzd();
        int zzd3 = zzgji2.zzd();
        byte[] bArr = new byte[(zzd2 + zzd3)];
        zzgji.zzC(bArr, 0, 0, zzd2);
        zzgji2.zzC(bArr, 0, zzd2, zzd3);
        return new zzgje(bArr);
    }

    static int zzc(int i) {
        int[] iArr = zza;
        int length = iArr.length;
        if (i >= 47) {
            return Integer.MAX_VALUE;
        }
        return iArr[i];
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgji)) {
            return false;
        }
        zzgji zzgji = (zzgji) obj;
        if (this.zzc != zzgji.zzd()) {
            return false;
        }
        if (this.zzc == 0) {
            return true;
        }
        int zzr = zzr();
        int zzr2 = zzgji.zzr();
        if (zzr != 0 && zzr2 != 0 && zzr != zzr2) {
            return false;
        }
        zzgmq zzgmq = new zzgmq(this, (zzgmp) null);
        zzgjd zza2 = zzgmq.next();
        zzgmq zzgmq2 = new zzgmq(zzgji, (zzgmp) null);
        zzgjd zza3 = zzgmq2.next();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int zzd2 = zza2.zzd() - i;
            int zzd3 = zza3.zzd() - i2;
            int min = Math.min(zzd2, zzd3);
            if (i == 0) {
                z = zza2.zzg(zza3, i2, min);
            } else {
                z = zza3.zzg(zza2, i, min);
            }
            if (!z) {
                return false;
            }
            i3 += min;
            int i4 = this.zzc;
            if (i3 < i4) {
                if (min == zzd2) {
                    zza2 = zzgmq.next();
                    i = 0;
                } else {
                    i += min;
                }
                if (min == zzd3) {
                    zza3 = zzgmq2.next();
                    i2 = 0;
                } else {
                    i2 += min;
                }
            } else if (i3 == i4) {
                return true;
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public final /* synthetic */ Iterator iterator() {
        return new zzgmm(this);
    }

    public final byte zza(int i) {
        zzB(i, this.zzc);
        return zzb(i);
    }

    /* access modifiers changed from: package-private */
    public final byte zzb(int i) {
        int i2 = this.zzf;
        if (i < i2) {
            return this.zzd.zzb(i);
        }
        return this.zze.zzb(i - i2);
    }

    public final int zzd() {
        return this.zzc;
    }

    /* access modifiers changed from: protected */
    public final void zze(byte[] bArr, int i, int i2, int i3) {
        int i4 = this.zzf;
        if (i + i3 <= i4) {
            this.zzd.zze(bArr, i, i2, i3);
        } else if (i >= i4) {
            this.zze.zze(bArr, i - i4, i2, i3);
        } else {
            int i5 = i4 - i;
            this.zzd.zze(bArr, i, i2, i5);
            this.zze.zze(bArr, 0, i2 + i5, i3 - i5);
        }
    }

    /* access modifiers changed from: protected */
    public final int zzf() {
        return this.zzg;
    }

    /* access modifiers changed from: protected */
    public final boolean zzh() {
        return this.zzc >= zzc(this.zzg);
    }

    /* access modifiers changed from: protected */
    public final int zzi(int i, int i2, int i3) {
        int i4 = this.zzf;
        if (i2 + i3 <= i4) {
            return this.zzd.zzi(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.zze.zzi(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return this.zze.zzi(this.zzd.zzi(i, i2, i5), 0, i3 - i5);
    }

    /* access modifiers changed from: protected */
    public final int zzj(int i, int i2, int i3) {
        int i4 = this.zzf;
        if (i2 + i3 <= i4) {
            return this.zzd.zzj(i, i2, i3);
        }
        if (i2 >= i4) {
            return this.zze.zzj(i, i2 - i4, i3);
        }
        int i5 = i4 - i2;
        return this.zze.zzj(this.zzd.zzj(i, i2, i5), 0, i3 - i5);
    }

    public final zzgji zzk(int i, int i2) {
        int zzq = zzq(i, i2, this.zzc);
        if (zzq == 0) {
            return zzgji.zzb;
        }
        if (zzq == this.zzc) {
            return this;
        }
        int i3 = this.zzf;
        if (i2 <= i3) {
            return this.zzd.zzk(i, i2);
        }
        if (i >= i3) {
            return this.zze.zzk(i - i3, i2 - i3);
        }
        zzgji zzgji = this.zzd;
        return new zzgms(zzgji.zzk(i, zzgji.zzd()), this.zze.zzk(0, i2 - this.zzf));
    }

    public final zzgjq zzl() {
        ArrayList<ByteBuffer> arrayList = new ArrayList<>();
        zzgmq zzgmq = new zzgmq(this, (zzgmp) null);
        while (zzgmq.hasNext()) {
            arrayList.add(zzgmq.next().zzn());
        }
        int i = zzgjq.zzd;
        boolean z = false;
        int i2 = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            i2 += byteBuffer.remaining();
            if (byteBuffer.hasArray()) {
                z |= true;
            } else {
                z = byteBuffer.isDirect() ? z | true : z | true;
            }
        }
        if (z) {
            return new zzgjm(arrayList, i2, true, (zzgjl) null);
        }
        return zzgjq.zzH(new zzgld(arrayList), 4096);
    }

    /* access modifiers changed from: protected */
    public final String zzm(Charset charset) {
        return new String(zzE(), charset);
    }

    public final ByteBuffer zzn() {
        throw null;
    }

    /* access modifiers changed from: package-private */
    public final void zzo(zzgix zzgix) throws IOException {
        this.zzd.zzo(zzgix);
        this.zze.zzo(zzgix);
    }

    public final boolean zzp() {
        int zzj = this.zzd.zzj(0, 0, this.zzf);
        zzgji zzgji = this.zze;
        if (zzgji.zzj(zzj, 0, zzgji.zzd()) == 0) {
            return true;
        }
        return false;
    }

    public final zzgjc zzs() {
        return new zzgmm(this);
    }
}
