package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zznw extends zznv {
    private int[] zzd;
    private int[] zze;

    zznw() {
    }

    public final void zze(ByteBuffer byteBuffer) {
        int[] iArr = this.zze;
        if (iArr != null) {
            int[] iArr2 = iArr;
            int position = byteBuffer.position();
            int limit = byteBuffer.limit();
            ByteBuffer zzj = zzj(((limit - position) / this.zzb.zze) * this.zzc.zze);
            while (position < limit) {
                for (int i : iArr2) {
                    zzj.putShort(byteBuffer.getShort(i + i + position));
                }
                position += this.zzb.zze;
            }
            byteBuffer.position(limit);
            zzj.flip();
            return;
        }
        throw null;
    }

    public final zzmw zzi(zzmw zzmw) throws zzmx {
        int[] iArr = this.zzd;
        if (iArr == null) {
            return zzmw.zza;
        }
        if (zzmw.zzd == 2) {
            boolean z = zzmw.zzc != iArr.length;
            int i = 0;
            while (true) {
                int length = iArr.length;
                if (i >= length) {
                    return z ? new zzmw(zzmw.zzb, length, 2) : zzmw.zza;
                }
                int i2 = iArr[i];
                if (i2 < zzmw.zzc) {
                    z |= i2 != i;
                    i++;
                } else {
                    throw new zzmx(zzmw);
                }
            }
        } else {
            throw new zzmx(zzmw);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzk() {
        this.zze = this.zzd;
    }

    /* access modifiers changed from: protected */
    public final void zzm() {
        this.zze = null;
        this.zzd = null;
    }

    public final void zzo(int[] iArr) {
        this.zzd = iArr;
    }
}
