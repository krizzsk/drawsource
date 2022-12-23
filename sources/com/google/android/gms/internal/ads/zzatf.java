package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzatf extends zzavr implements zzazd {
    /* access modifiers changed from: private */
    public final zzasp zzb;
    private final zzatb zzc = new zzatb((zzasg) null, new zzasi[0], new zzate(this, (zzatd) null));
    private boolean zzd;
    private int zze;
    private int zzf;
    private long zzg;
    /* access modifiers changed from: private */
    public boolean zzh;

    public zzatf(zzavt zzavt, zzatt zzatt, boolean z, Handler handler, zzasq zzasq) {
        super(1, zzavt, (zzatt) null, true);
        this.zzb = new zzasp(handler, zzasq);
    }

    public final boolean zzE() {
        return super.zzE() && this.zzc.zzo();
    }

    public final boolean zzF() {
        return this.zzc.zzn() || super.zzF();
    }

    /* access modifiers changed from: protected */
    public final int zzH(zzavt zzavt, zzart zzart) throws zzavw {
        int i;
        int i2;
        String str = zzart.zzf;
        if (!zzaze.zza(str)) {
            return 0;
        }
        int i3 = zzazo.zza >= 21 ? 16 : 0;
        zzavp zzc2 = zzawb.zzc(str, false);
        if (zzc2 == null) {
            return 1;
        }
        int i4 = 2;
        if (zzazo.zza < 21 || (((i = zzart.zzs) == -1 || zzc2.zzd(i)) && ((i2 = zzart.zzr) == -1 || zzc2.zzc(i2)))) {
            i4 = 3;
        }
        return i3 | 4 | i4;
    }

    public final long zzI() {
        long zza = this.zzc.zza(zzE());
        if (zza != Long.MIN_VALUE) {
            if (!this.zzh) {
                zza = Math.max(this.zzg, zza);
            }
            this.zzg = zza;
            this.zzh = false;
        }
        return this.zzg;
    }

    public final zzarx zzJ() {
        return this.zzc.zzc();
    }

    public final zzarx zzK(zzarx zzarx) {
        return this.zzc.zzd(zzarx);
    }

    /* access modifiers changed from: protected */
    public final zzavp zzM(zzavt zzavt, zzart zzart, boolean z) throws zzavw {
        return super.zzM(zzavt, zzart, false);
    }

    /* access modifiers changed from: protected */
    public final void zzO(zzavp zzavp, MediaCodec mediaCodec, zzart zzart, MediaCrypto mediaCrypto) {
        String str = zzavp.zza;
        boolean z = true;
        if (zzazo.zza >= 24 || !"OMX.SEC.aac.dec".equals(str) || !"samsung".equals(zzazo.zzc) || (!zzazo.zzb.startsWith("zeroflte") && !zzazo.zzb.startsWith("herolte") && !zzazo.zzb.startsWith("heroqlte"))) {
            z = false;
        }
        this.zzd = z;
        mediaCodec.configure(zzart.zzb(), (Surface) null, (MediaCrypto) null, 0);
    }

    /* access modifiers changed from: protected */
    public final void zzP(String str, long j, long j2) {
        this.zzb.zzd(str, j, j2);
    }

    /* access modifiers changed from: protected */
    public final void zzQ(zzart zzart) throws zzarf {
        super.zzQ(zzart);
        this.zzb.zzg(zzart);
        this.zze = "audio/raw".equals(zzart.zzf) ? zzart.zzt : 2;
        this.zzf = zzart.zzr;
    }

    /* access modifiers changed from: protected */
    public final void zzR(MediaCodec mediaCodec, MediaFormat mediaFormat) throws zzarf {
        int[] iArr;
        int i;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (!this.zzd || integer != 6) {
            i = integer;
            iArr = null;
        } else {
            int i2 = this.zzf;
            if (i2 < 6) {
                int[] iArr2 = new int[i2];
                for (int i3 = 0; i3 < this.zzf; i3++) {
                    iArr2[i3] = i3;
                }
                iArr = iArr2;
            } else {
                iArr = null;
            }
            i = 6;
        }
        try {
            this.zzc.zze("audio/raw", i, integer2, this.zze, 0, iArr);
        } catch (zzasv e) {
            throw zzarf.zza(e, zza());
        }
    }

    /* access modifiers changed from: protected */
    public final boolean zzT(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws zzarf {
        if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.zza.zze++;
            this.zzc.zzf();
            return true;
        }
        try {
            if (!this.zzc.zzm(byteBuffer, j3)) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i, false);
            this.zza.zzd++;
            return true;
        } catch (zzasw | zzata e) {
            throw zzarf.zza(e, zza());
        }
    }

    public final zzazd zzi() {
        return this;
    }

    public final void zzl(int i, Object obj) throws zzarf {
        if (i == 2) {
            this.zzc.zzl(((Float) obj).floatValue());
        }
    }

    /* access modifiers changed from: protected */
    public final void zzn() {
        try {
            this.zzc.zzj();
            try {
                super.zzn();
            } finally {
                this.zza.zza();
                this.zzb.zze(this.zza);
            }
        } catch (Throwable th) {
            super.zzn();
            throw th;
        } finally {
            this.zza.zza();
            this.zzb.zze(this.zza);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzo(boolean z) throws zzarf {
        super.zzo(z);
        this.zzb.zzf(this.zza);
        int i = zzg().zzb;
    }

    /* access modifiers changed from: protected */
    public final void zzp(long j, boolean z) throws zzarf {
        super.zzp(j, z);
        this.zzc.zzk();
        this.zzg = j;
        this.zzh = true;
    }

    /* access modifiers changed from: protected */
    public final void zzq() {
        this.zzc.zzh();
    }

    /* access modifiers changed from: protected */
    public final void zzr() {
        this.zzc.zzg();
    }

    /* access modifiers changed from: protected */
    public final void zzS() throws zzarf {
        try {
            this.zzc.zzi();
        } catch (zzata e) {
            throw zzarf.zza(e, zza());
        }
    }
}
