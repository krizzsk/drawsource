package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.SystemClock;
import com.google.common.base.Ascii;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public abstract class zzavr extends zzard {
    private static final byte[] zzb = zzazo.zzp("0000016742C00BDA259000000168CE0F13200000016588840DCE7118A0002FBF1C31C3275D78");
    private boolean zzA;
    private int zzB;
    private int zzC;
    private boolean zzD;
    private boolean zzE;
    private boolean zzF;
    private boolean zzG;
    private boolean zzH;
    protected zzatn zza;
    private final zzavt zzc;
    private final zzato zzd;
    private final zzato zze;
    private final zzaru zzf;
    private final List zzg;
    private final MediaCodec.BufferInfo zzh;
    private zzart zzi;
    private MediaCodec zzj;
    private zzavp zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private boolean zzq;
    private boolean zzr;
    private boolean zzs;
    private boolean zzt;
    private ByteBuffer[] zzu;
    private ByteBuffer[] zzv;
    private long zzw;
    private int zzx;
    private int zzy;
    private boolean zzz;

    public zzavr(int i, zzavt zzavt, zzatt zzatt, boolean z) {
        super(i);
        zzayz.zze(zzazo.zza >= 16);
        this.zzc = zzavt;
        this.zzd = new zzato(0);
        this.zze = new zzato(0);
        this.zzf = new zzaru();
        this.zzg = new ArrayList();
        this.zzh = new MediaCodec.BufferInfo();
        this.zzB = 0;
        this.zzC = 0;
    }

    private final void zzI() throws zzarf {
        if (this.zzC == 2) {
            zzY();
            zzW();
            return;
        }
        this.zzG = true;
        zzS();
    }

    private final boolean zzJ() throws zzarf {
        MediaCodec mediaCodec = this.zzj;
        if (mediaCodec == null || this.zzC == 2 || this.zzF) {
            return false;
        }
        if (this.zzx < 0) {
            int dequeueInputBuffer = mediaCodec.dequeueInputBuffer(0);
            this.zzx = dequeueInputBuffer;
            if (dequeueInputBuffer < 0) {
                return false;
            }
            zzato zzato = this.zzd;
            zzato.zzb = this.zzu[dequeueInputBuffer];
            zzato.zzb();
        }
        if (this.zzC == 1) {
            if (!this.zzo) {
                this.zzE = true;
                this.zzj.queueInputBuffer(this.zzx, 0, 0, 0, 4);
                this.zzx = -1;
            }
            this.zzC = 2;
            return false;
        } else if (this.zzs) {
            this.zzs = false;
            this.zzd.zzb.put(zzb);
            MediaCodec mediaCodec2 = this.zzj;
            int i = this.zzx;
            int length = zzb.length;
            mediaCodec2.queueInputBuffer(i, 0, 38, 0, 0);
            this.zzx = -1;
            this.zzD = true;
            return true;
        } else {
            if (this.zzB == 1) {
                for (int i2 = 0; i2 < this.zzi.zzh.size(); i2++) {
                    this.zzd.zzb.put((byte[]) this.zzi.zzh.get(i2));
                }
                this.zzB = 2;
            }
            int position = this.zzd.zzb.position();
            int zzd2 = zzd(this.zzf, this.zzd, false);
            if (zzd2 == -3) {
                return false;
            }
            if (zzd2 == -5) {
                if (this.zzB == 2) {
                    this.zzd.zzb();
                    this.zzB = 1;
                }
                zzQ(this.zzf.zza);
                return true;
            }
            zzato zzato2 = this.zzd;
            if (zzato2.zzf()) {
                if (this.zzB == 2) {
                    zzato2.zzb();
                    this.zzB = 1;
                }
                this.zzF = true;
                if (!this.zzD) {
                    zzI();
                    return false;
                }
                try {
                    if (!this.zzo) {
                        this.zzE = true;
                        this.zzj.queueInputBuffer(this.zzx, 0, 0, 0, 4);
                        this.zzx = -1;
                    }
                    return false;
                } catch (MediaCodec.CryptoException e) {
                    throw zzarf.zza(e, zza());
                }
            } else if (!this.zzH || zzato2.zzg()) {
                this.zzH = false;
                boolean zzi2 = zzato2.zzi();
                if (this.zzl && !zzi2) {
                    ByteBuffer byteBuffer = zzato2.zzb;
                    byte[] bArr = zzazf.zza;
                    int position2 = byteBuffer.position();
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        int i5 = i3 + 1;
                        if (i5 >= position2) {
                            byteBuffer.clear();
                            break;
                        }
                        byte b = byteBuffer.get(i3) & 255;
                        if (i4 == 3) {
                            if (b == 1) {
                                if ((byteBuffer.get(i5) & Ascii.f18308US) == 7) {
                                    ByteBuffer duplicate = byteBuffer.duplicate();
                                    duplicate.position(i3 - 3);
                                    duplicate.limit(position2);
                                    byteBuffer.position(0);
                                    byteBuffer.put(duplicate);
                                    break;
                                }
                                b = 1;
                            }
                        } else if (b == 0) {
                            i4++;
                        }
                        if (b != 0) {
                            i4 = 0;
                        }
                        i3 = i5;
                    }
                    if (this.zzd.zzb.position() == 0) {
                        return true;
                    }
                    this.zzl = false;
                }
                try {
                    zzato zzato3 = this.zzd;
                    long j = zzato3.zzc;
                    if (zzato3.zze()) {
                        this.zzg.add(Long.valueOf(j));
                    }
                    this.zzd.zzb.flip();
                    zzX(this.zzd);
                    if (zzi2) {
                        MediaCodec.CryptoInfo zza2 = this.zzd.zza.zza();
                        if (position != 0) {
                            if (zza2.numBytesOfClearData == null) {
                                zza2.numBytesOfClearData = new int[1];
                            }
                            int[] iArr = zza2.numBytesOfClearData;
                            iArr[0] = iArr[0] + position;
                        }
                        this.zzj.queueSecureInputBuffer(this.zzx, 0, zza2, j, 0);
                    } else {
                        this.zzj.queueInputBuffer(this.zzx, 0, this.zzd.zzb.limit(), j, 0);
                    }
                    this.zzx = -1;
                    this.zzD = true;
                    this.zzB = 0;
                    this.zza.zzc++;
                    return true;
                } catch (MediaCodec.CryptoException e2) {
                    throw zzarf.zza(e2, zza());
                }
            } else {
                zzato2.zzb();
                if (this.zzB == 2) {
                    this.zzB = 1;
                }
                return true;
            }
        }
    }

    public final void zzD(long j, long j2) throws zzarf {
        boolean z;
        int i;
        boolean z2;
        if (this.zzG) {
            zzS();
            return;
        }
        if (this.zzi == null) {
            this.zze.zzb();
            int zzd2 = zzd(this.zzf, this.zze, true);
            if (zzd2 == -5) {
                zzQ(this.zzf.zza);
            } else if (zzd2 == -4) {
                zzayz.zze(this.zze.zzf());
                this.zzF = true;
                zzI();
                return;
            } else {
                return;
            }
        }
        zzW();
        if (this.zzj != null) {
            zzazm.zza("drainAndFeed");
            while (true) {
                if (this.zzy < 0) {
                    if (!this.zzq || !this.zzE) {
                        i = this.zzj.dequeueOutputBuffer(this.zzh, 0);
                        this.zzy = i;
                    } else {
                        try {
                            i = this.zzj.dequeueOutputBuffer(this.zzh, 0);
                            this.zzy = i;
                        } catch (IllegalStateException unused) {
                            zzI();
                            if (this.zzG) {
                                zzY();
                            }
                        }
                    }
                    if (i >= 0) {
                        if (this.zzt) {
                            this.zzt = false;
                            this.zzj.releaseOutputBuffer(i, false);
                            this.zzy = -1;
                        } else if ((this.zzh.flags & 4) != 0) {
                            zzI();
                            this.zzy = -1;
                            break;
                        } else {
                            ByteBuffer byteBuffer = this.zzv[this.zzy];
                            if (byteBuffer != null) {
                                byteBuffer.position(this.zzh.offset);
                                byteBuffer.limit(this.zzh.offset + this.zzh.size);
                            }
                            long j3 = this.zzh.presentationTimeUs;
                            int size = this.zzg.size();
                            int i2 = 0;
                            while (true) {
                                if (i2 >= size) {
                                    z2 = false;
                                    break;
                                } else if (((Long) this.zzg.get(i2)).longValue() == j3) {
                                    this.zzg.remove(i2);
                                    z2 = true;
                                    break;
                                } else {
                                    i2++;
                                }
                            }
                            this.zzz = z2;
                        }
                    } else if (i == -2) {
                        MediaFormat outputFormat = this.zzj.getOutputFormat();
                        if (this.zzn && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                            this.zzt = true;
                        } else {
                            if (this.zzr) {
                                outputFormat.setInteger("channel-count", 1);
                            }
                            zzR(this.zzj, outputFormat);
                        }
                    } else if (i == -3) {
                        this.zzv = this.zzj.getOutputBuffers();
                    } else if (this.zzo && (this.zzF || this.zzC == 2)) {
                        zzI();
                    }
                }
                if (!this.zzq || !this.zzE) {
                    MediaCodec mediaCodec = this.zzj;
                    ByteBuffer[] byteBufferArr = this.zzv;
                    int i3 = this.zzy;
                    z = zzT(j, j2, mediaCodec, byteBufferArr[i3], i3, this.zzh.flags, this.zzh.presentationTimeUs, this.zzz);
                } else {
                    try {
                        MediaCodec mediaCodec2 = this.zzj;
                        ByteBuffer[] byteBufferArr2 = this.zzv;
                        int i4 = this.zzy;
                        z = zzT(j, j2, mediaCodec2, byteBufferArr2[i4], i4, this.zzh.flags, this.zzh.presentationTimeUs, this.zzz);
                    } catch (IllegalStateException unused2) {
                        zzI();
                        if (this.zzG) {
                            zzY();
                        }
                    }
                }
                if (!z) {
                    break;
                }
                long j4 = this.zzh.presentationTimeUs;
                this.zzy = -1;
            }
            do {
            } while (zzJ());
            zzazm.zzb();
        } else {
            zzx(j);
            this.zze.zzb();
            int zzd3 = zzd(this.zzf, this.zze, false);
            if (zzd3 == -5) {
                zzQ(this.zzf.zza);
            } else if (zzd3 == -4) {
                zzayz.zze(this.zze.zzf());
                this.zzF = true;
                zzI();
            }
        }
        this.zza.zza();
    }

    public boolean zzE() {
        return this.zzG;
    }

    public boolean zzF() {
        if (this.zzi != null) {
            if (zzC() || this.zzy >= 0) {
                return true;
            }
            if (this.zzw != -9223372036854775807L && SystemClock.elapsedRealtime() < this.zzw) {
                return true;
            }
        }
        return false;
    }

    public final int zzG(zzart zzart) throws zzarf {
        try {
            return zzH(this.zzc, zzart);
        } catch (zzavw e) {
            throw zzarf.zza(e, zza());
        }
    }

    /* access modifiers changed from: protected */
    public abstract int zzH(zzavt zzavt, zzart zzart) throws zzavw;

    /* access modifiers changed from: protected */
    public zzavp zzM(zzavt zzavt, zzart zzart, boolean z) throws zzavw {
        return zzawb.zzc(zzart.zzf, false);
    }

    /* access modifiers changed from: protected */
    public abstract void zzO(zzavp zzavp, MediaCodec mediaCodec, zzart zzart, MediaCrypto mediaCrypto) throws zzavw;

    /* access modifiers changed from: protected */
    public void zzP(String str, long j, long j2) {
        throw null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004f, code lost:
        if (r6.zzk == r0.zzk) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void zzQ(com.google.android.gms.internal.ads.zzart r6) throws com.google.android.gms.internal.ads.zzarf {
        /*
            r5 = this;
            com.google.android.gms.internal.ads.zzart r0 = r5.zzi
            r5.zzi = r6
            com.google.android.gms.internal.ads.zzats r6 = r6.zzi
            if (r0 != 0) goto L_0x000a
            r1 = 0
            goto L_0x000c
        L_0x000a:
            com.google.android.gms.internal.ads.zzats r1 = r0.zzi
        L_0x000c:
            boolean r6 = com.google.android.gms.internal.ads.zzazo.zzo(r6, r1)
            if (r6 != 0) goto L_0x0029
            com.google.android.gms.internal.ads.zzart r6 = r5.zzi
            com.google.android.gms.internal.ads.zzats r6 = r6.zzi
            if (r6 != 0) goto L_0x0019
            goto L_0x0029
        L_0x0019:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "Media requires a DrmSessionManager"
            r6.<init>(r0)
            int r0 = r5.zza()
            com.google.android.gms.internal.ads.zzarf r6 = com.google.android.gms.internal.ads.zzarf.zza(r6, r0)
            throw r6
        L_0x0029:
            android.media.MediaCodec r6 = r5.zzj
            r1 = 1
            if (r6 == 0) goto L_0x0056
            com.google.android.gms.internal.ads.zzavp r2 = r5.zzk
            boolean r2 = r2.zzb
            com.google.android.gms.internal.ads.zzart r3 = r5.zzi
            boolean r6 = r5.zzZ(r6, r2, r0, r3)
            if (r6 == 0) goto L_0x0056
            r5.zzA = r1
            r5.zzB = r1
            boolean r6 = r5.zzn
            r2 = 0
            if (r6 == 0) goto L_0x0052
            com.google.android.gms.internal.ads.zzart r6 = r5.zzi
            int r3 = r6.zzj
            int r4 = r0.zzj
            if (r3 != r4) goto L_0x0052
            int r6 = r6.zzk
            int r0 = r0.zzk
            if (r6 != r0) goto L_0x0052
            goto L_0x0053
        L_0x0052:
            r1 = r2
        L_0x0053:
            r5.zzs = r1
            return
        L_0x0056:
            boolean r6 = r5.zzD
            if (r6 == 0) goto L_0x005d
            r5.zzC = r1
            return
        L_0x005d:
            r5.zzY()
            r5.zzW()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzavr.zzQ(com.google.android.gms.internal.ads.zzart):void");
    }

    /* access modifiers changed from: protected */
    public void zzR(MediaCodec mediaCodec, MediaFormat mediaFormat) throws zzarf {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void zzS() throws zzarf {
    }

    /* access modifiers changed from: protected */
    public abstract boolean zzT(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws zzarf;

    /* access modifiers changed from: protected */
    public final MediaCodec zzU() {
        return this.zzj;
    }

    /* access modifiers changed from: protected */
    public final zzavp zzV() {
        return this.zzk;
    }

    /* access modifiers changed from: protected */
    public final void zzW() throws zzarf {
        zzart zzart;
        boolean z;
        if (this.zzj == null && (zzart = this.zzi) != null) {
            zzavp zzavp = this.zzk;
            if (zzavp == null) {
                try {
                    zzavp = zzM(this.zzc, zzart, false);
                    this.zzk = zzavp;
                    if (zzavp == null) {
                        throw zzarf.zza(new zzavq(this.zzi, (Throwable) null, false, -49999), zza());
                    }
                } catch (zzavw e) {
                    throw zzarf.zza(new zzavq(this.zzi, (Throwable) e, false, -49998), zza());
                }
            }
            if (zzaa(zzavp)) {
                String str = this.zzk.zza;
                this.zzl = zzazo.zza < 21 && this.zzi.zzh.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
                this.zzm = zzazo.zza < 18 || (zzazo.zza == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (zzazo.zza == 19 && zzazo.zzd.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
                this.zzn = zzazo.zza < 24 && ("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str)) && ("flounder".equals(zzazo.zzb) || "flounder_lte".equals(zzazo.zzb) || "grouper".equals(zzazo.zzb) || "tilapia".equals(zzazo.zzb));
                this.zzo = zzazo.zza <= 17 && ("OMX.rk.video_decoder.avc".equals(str) || "OMX.allwinner.video.decoder.avc".equals(str));
                if ((zzazo.zza > 23 || !"OMX.google.vorbis.decoder".equals(str)) && (zzazo.zza > 19 || !"hb2000".equals(zzazo.zzb) || (!"OMX.amlogic.avc.decoder.awesome".equals(str) && !"OMX.amlogic.avc.decoder.awesome.secure".equals(str)))) {
                    z = false;
                } else {
                    z = true;
                }
                this.zzp = z;
                this.zzq = zzazo.zza == 21 && "OMX.google.aac.decoder".equals(str);
                this.zzr = zzazo.zza <= 18 && this.zzi.zzr == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
                try {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    zzazm.zza("createCodec:" + str);
                    this.zzj = MediaCodec.createByCodecName(str);
                    zzazm.zzb();
                    zzazm.zza("configureCodec");
                    zzO(this.zzk, this.zzj, this.zzi, (MediaCrypto) null);
                    zzazm.zzb();
                    zzazm.zza("startCodec");
                    this.zzj.start();
                    zzazm.zzb();
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    zzP(str, elapsedRealtime2, elapsedRealtime2 - elapsedRealtime);
                    this.zzu = this.zzj.getInputBuffers();
                    this.zzv = this.zzj.getOutputBuffers();
                    this.zzw = zzb() == 2 ? SystemClock.elapsedRealtime() + 1000 : -9223372036854775807L;
                    this.zzx = -1;
                    this.zzy = -1;
                    this.zzH = true;
                    this.zza.zza++;
                } catch (Exception e2) {
                    throw zzarf.zza(new zzavq(this.zzi, (Throwable) e2, false, str), zza());
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void zzX(zzato zzato) {
    }

    /* access modifiers changed from: protected */
    public void zzY() {
        this.zzw = -9223372036854775807L;
        this.zzx = -1;
        this.zzy = -1;
        this.zzz = false;
        this.zzg.clear();
        this.zzu = null;
        this.zzv = null;
        this.zzk = null;
        this.zzA = false;
        this.zzD = false;
        this.zzl = false;
        this.zzm = false;
        this.zzn = false;
        this.zzo = false;
        this.zzp = false;
        this.zzr = false;
        this.zzs = false;
        this.zzt = false;
        this.zzE = false;
        this.zzB = 0;
        this.zzC = 0;
        this.zzd.zzb = null;
        MediaCodec mediaCodec = this.zzj;
        if (mediaCodec != null) {
            this.zza.zzb++;
            try {
                mediaCodec.stop();
                try {
                    this.zzj.release();
                } finally {
                    this.zzj = null;
                }
            } catch (Throwable th) {
                this.zzj.release();
                throw th;
            } finally {
                this.zzj = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean zzZ(MediaCodec mediaCodec, boolean z, zzart zzart, zzart zzart2) {
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean zzaa(zzavp zzavp) {
        return true;
    }

    public final int zze() {
        return 4;
    }

    /* access modifiers changed from: protected */
    public void zzo(boolean z) throws zzarf {
        this.zza = new zzatn();
    }

    /* access modifiers changed from: protected */
    public void zzp(long j, boolean z) throws zzarf {
        this.zzF = false;
        this.zzG = false;
        if (this.zzj != null) {
            this.zzw = -9223372036854775807L;
            this.zzx = -1;
            this.zzy = -1;
            this.zzH = true;
            this.zzz = false;
            this.zzg.clear();
            this.zzs = false;
            this.zzt = false;
            if (this.zzm || (this.zzp && this.zzE)) {
                zzY();
                zzW();
            } else if (this.zzC != 0) {
                zzY();
                zzW();
            } else {
                this.zzj.flush();
                this.zzD = false;
            }
            if (this.zzA && this.zzi != null) {
                this.zzB = 1;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void zzn() {
        this.zzi = null;
        zzY();
    }
}
