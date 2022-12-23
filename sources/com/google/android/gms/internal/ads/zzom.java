package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.ConditionVariable;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzom implements zznq {
    private boolean zzA;
    private boolean zzB;
    private long zzC;
    private float zzD;
    private zzmy[] zzE;
    private ByteBuffer[] zzF;
    private ByteBuffer zzG;
    private int zzH;
    private ByteBuffer zzI;
    private byte[] zzJ;
    private int zzK;
    private int zzL;
    private boolean zzM;
    private boolean zzN;
    /* access modifiers changed from: private */
    public boolean zzO;
    private boolean zzP;
    private int zzQ;
    private zzj zzR;
    /* access modifiers changed from: private */
    public long zzS;
    private boolean zzT;
    private boolean zzU;
    private final zzoc zzV;
    private final zzmv zza;
    private final zznw zzb = new zznw();
    private final zzox zzc = new zzox();
    private final zzmy[] zzd;
    private final zzmy[] zze;
    /* access modifiers changed from: private */
    public final ConditionVariable zzf = new ConditionVariable(true);
    private final zznu zzg = new zznu(new zzoh(this, (zzog) null));
    private final ArrayDeque zzh;
    private zzok zzi;
    private final zzof zzj;
    private final zzof zzk;
    private final zznz zzl;
    private zzmu zzm;
    /* access modifiers changed from: private */
    public zznn zzn;
    private zzob zzo;
    private zzob zzp;
    /* access modifiers changed from: private */
    public AudioTrack zzq;
    private zzi zzr;
    private zzoe zzs;
    private zzoe zzt;
    private final zzbt zzu;
    private long zzv;
    private long zzw;
    private long zzx;
    private long zzy;
    private int zzz;

    /* synthetic */ zzom(zzoa zzoa, zzol zzol) {
        this.zza = zzoa.zzb;
        this.zzV = zzoa.zzc;
        int i = zzeg.zza;
        this.zzl = zzoa.zza;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new zznv[]{new zzot(), this.zzb, this.zzc});
        Collections.addAll(arrayList, this.zzV.zze());
        this.zzd = (zzmy[]) arrayList.toArray(new zzmy[0]);
        this.zze = new zzmy[]{new zzop()};
        this.zzD = 1.0f;
        this.zzr = zzi.zza;
        this.zzQ = 0;
        this.zzR = new zzj(0, 0.0f);
        this.zzt = new zzoe(zzbt.zza, false, 0, 0, (zzod) null);
        this.zzu = zzbt.zza;
        this.zzL = -1;
        this.zzE = new zzmy[0];
        this.zzF = new ByteBuffer[0];
        this.zzh = new ArrayDeque();
        this.zzj = new zzof(100);
        this.zzk = new zzof(100);
    }

    /* access modifiers changed from: private */
    public final long zzE() {
        zzob zzob = this.zzp;
        return zzob.zzc == 0 ? this.zzv / ((long) zzob.zzb) : this.zzw;
    }

    /* access modifiers changed from: private */
    public final long zzF() {
        zzob zzob = this.zzp;
        return zzob.zzc == 0 ? this.zzx / ((long) zzob.zzd) : this.zzy;
    }

    private final AudioTrack zzG(zzob zzob) throws zznm {
        try {
            return zzob.zzb(false, this.zzr, this.zzQ);
        } catch (zznm e) {
            zznn zznn = this.zzn;
            if (zznn != null) {
                zznn.zza(e);
            }
            throw e;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x00c8 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.util.Pair zzH(com.google.android.gms.internal.ads.zzad r12, com.google.android.gms.internal.ads.zzmv r13) {
        /*
            java.lang.String r0 = r12.zzm
            r1 = 0
            if (r0 == 0) goto L_0x00d6
            java.lang.String r2 = r12.zzj
            int r0 = com.google.android.gms.internal.ads.zzbo.zza(r0, r2)
            r2 = 5
            r3 = 7
            r4 = 18
            r5 = 8
            r6 = 6
            if (r0 == r2) goto L_0x0026
            if (r0 == r6) goto L_0x0026
            if (r0 == r4) goto L_0x0026
            r7 = 17
            if (r0 == r7) goto L_0x0026
            if (r0 == r3) goto L_0x0026
            if (r0 == r5) goto L_0x0026
            r7 = 14
            if (r0 != r7) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            return r1
        L_0x0026:
            if (r0 != r4) goto L_0x0030
            boolean r7 = r13.zza(r4)
            if (r7 != 0) goto L_0x0030
            r0 = r6
            goto L_0x0039
        L_0x0030:
            if (r0 != r5) goto L_0x0039
            boolean r7 = r13.zza(r5)
            if (r7 != 0) goto L_0x0039
            r0 = r3
        L_0x0039:
            boolean r13 = r13.zza(r0)
            if (r13 != 0) goto L_0x0040
            return r1
        L_0x0040:
            r13 = 3
            r7 = 1
            if (r0 != r4) goto L_0x0097
            int r8 = com.google.android.gms.internal.ads.zzeg.zza
            r9 = 29
            if (r8 < r9) goto L_0x0095
            int r12 = r12.zzA
            r8 = -1
            if (r12 != r8) goto L_0x0052
            r12 = 48000(0xbb80, float:6.7262E-41)
        L_0x0052:
            android.media.AudioAttributes$Builder r8 = new android.media.AudioAttributes$Builder
            r8.<init>()
            android.media.AudioAttributes$Builder r8 = r8.setUsage(r7)
            android.media.AudioAttributes$Builder r8 = r8.setContentType(r13)
            android.media.AudioAttributes r8 = r8.build()
            r9 = r5
        L_0x0064:
            if (r9 <= 0) goto L_0x0089
            android.media.AudioFormat$Builder r10 = new android.media.AudioFormat$Builder
            r10.<init>()
            android.media.AudioFormat$Builder r10 = r10.setEncoding(r4)
            android.media.AudioFormat$Builder r10 = r10.setSampleRate(r12)
            int r11 = com.google.android.gms.internal.ads.zzeg.zzj(r9)
            android.media.AudioFormat$Builder r10 = r10.setChannelMask(r11)
            android.media.AudioFormat r10 = r10.build()
            boolean r10 = android.media.AudioTrack.isDirectPlaybackSupported(r10, r8)
            if (r10 == 0) goto L_0x0086
            goto L_0x008a
        L_0x0086:
            int r9 = r9 + -1
            goto L_0x0064
        L_0x0089:
            r9 = 0
        L_0x008a:
            if (r9 == 0) goto L_0x008d
            goto L_0x009c
        L_0x008d:
            java.lang.String r12 = "DefaultAudioSink"
            java.lang.String r13 = "E-AC3 JOC encoding supported but no channel count supported"
            android.util.Log.w(r12, r13)
            return r1
        L_0x0095:
            r9 = r6
            goto L_0x009c
        L_0x0097:
            int r9 = r12.zzz
            if (r9 <= r5) goto L_0x009c
            return r1
        L_0x009c:
            int r12 = com.google.android.gms.internal.ads.zzeg.zza
            r4 = 28
            if (r12 > r4) goto L_0x00ae
            if (r9 != r3) goto L_0x00a5
            goto L_0x00af
        L_0x00a5:
            if (r9 == r13) goto L_0x00ac
            r12 = 4
            if (r9 == r12) goto L_0x00ac
            if (r9 != r2) goto L_0x00ae
        L_0x00ac:
            r5 = r6
            goto L_0x00af
        L_0x00ae:
            r5 = r9
        L_0x00af:
            int r12 = com.google.android.gms.internal.ads.zzeg.zza
            r13 = 26
            if (r12 > r13) goto L_0x00c2
            java.lang.String r12 = com.google.android.gms.internal.ads.zzeg.zzb
            java.lang.String r13 = "fugu"
            boolean r12 = r13.equals(r12)
            if (r12 == 0) goto L_0x00c2
            if (r5 != r7) goto L_0x00c2
            r5 = 2
        L_0x00c2:
            int r12 = com.google.android.gms.internal.ads.zzeg.zzj(r5)
            if (r12 != 0) goto L_0x00c9
            return r1
        L_0x00c9:
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            android.util.Pair r12 = android.util.Pair.create(r13, r12)
            return r12
        L_0x00d6:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzom.zzH(com.google.android.gms.internal.ads.zzad, com.google.android.gms.internal.ads.zzmv):android.util.Pair");
    }

    private final zzoe zzI() {
        zzoe zzoe = this.zzs;
        if (zzoe != null) {
            return zzoe;
        }
        return !this.zzh.isEmpty() ? (zzoe) this.zzh.getLast() : this.zzt;
    }

    private final void zzJ(long j) {
        zzbt zzbt;
        boolean z;
        if (zzU()) {
            zzoc zzoc = this.zzV;
            zzbt = zzI().zza;
            zzoc.zzc(zzbt);
        } else {
            zzbt = zzbt.zza;
        }
        zzbt zzbt2 = zzbt;
        if (zzU()) {
            zzoc zzoc2 = this.zzV;
            boolean z2 = zzI().zzb;
            zzoc2.zzd(z2);
            z = z2;
        } else {
            z = false;
        }
        this.zzh.add(new zzoe(zzbt2, z, Math.max(0, j), this.zzp.zza(zzF()), (zzod) null));
        zzmy[] zzmyArr = this.zzp.zzi;
        ArrayList arrayList = new ArrayList();
        for (zzmy zzmy : zzmyArr) {
            if (zzmy.zzg()) {
                arrayList.add(zzmy);
            } else {
                zzmy.zzc();
            }
        }
        int size = arrayList.size();
        this.zzE = (zzmy[]) arrayList.toArray(new zzmy[size]);
        this.zzF = new ByteBuffer[size];
        zzK();
        zznn zznn = this.zzn;
        if (zznn != null) {
            ((zzor) zznn).zza.zzc.zzs(z);
        }
    }

    private final void zzK() {
        int i = 0;
        while (true) {
            zzmy[] zzmyArr = this.zzE;
            if (i < zzmyArr.length) {
                zzmy zzmy = zzmyArr[i];
                zzmy.zzc();
                this.zzF[i] = zzmy.zzb();
                i++;
            } else {
                return;
            }
        }
    }

    private final void zzL() {
        if (this.zzp.zzc()) {
            this.zzT = true;
        }
    }

    private final void zzM() {
        if (!this.zzN) {
            this.zzN = true;
            this.zzg.zzd(zzF());
            this.zzq.stop();
        }
    }

    private final void zzN(long j) throws zznp {
        ByteBuffer byteBuffer;
        int length = this.zzE.length;
        int i = length;
        while (i >= 0) {
            if (i > 0) {
                byteBuffer = this.zzF[i - 1];
            } else {
                byteBuffer = this.zzG;
                if (byteBuffer == null) {
                    byteBuffer = zzmy.zza;
                }
            }
            if (i == length) {
                zzQ(byteBuffer, j);
            } else {
                zzmy zzmy = this.zzE[i];
                if (i > this.zzL) {
                    zzmy.zze(byteBuffer);
                }
                ByteBuffer zzb2 = zzmy.zzb();
                this.zzF[i] = zzb2;
                if (zzb2.hasRemaining()) {
                    i++;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i--;
            } else {
                return;
            }
        }
    }

    private final void zzO(zzbt zzbt, boolean z) {
        zzoe zzI2 = zzI();
        if (!zzbt.equals(zzI2.zza) || z != zzI2.zzb) {
            zzoe zzoe = new zzoe(zzbt, z, -9223372036854775807L, -9223372036854775807L, (zzod) null);
            if (zzS()) {
                this.zzs = zzoe;
            } else {
                this.zzt = zzoe;
            }
        }
    }

    private final void zzP() {
        if (zzS()) {
            if (zzeg.zza >= 21) {
                this.zzq.setVolume(this.zzD);
                return;
            }
            AudioTrack audioTrack = this.zzq;
            float f = this.zzD;
            audioTrack.setStereoVolume(f, f);
        }
    }

    private final void zzQ(ByteBuffer byteBuffer, long j) throws zznp {
        int i;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer2 = this.zzI;
            boolean z = true;
            if (byteBuffer2 != null) {
                zzcw.zzd(byteBuffer2 == byteBuffer);
            } else {
                this.zzI = byteBuffer;
                if (zzeg.zza < 21) {
                    int remaining = byteBuffer.remaining();
                    byte[] bArr = this.zzJ;
                    if (bArr == null || bArr.length < remaining) {
                        this.zzJ = new byte[remaining];
                    }
                    int position = byteBuffer.position();
                    byteBuffer.get(this.zzJ, 0, remaining);
                    byteBuffer.position(position);
                    this.zzK = 0;
                }
            }
            int remaining2 = byteBuffer.remaining();
            if (zzeg.zza < 21) {
                int zza2 = this.zzg.zza(this.zzx);
                if (zza2 > 0) {
                    i = this.zzq.write(this.zzJ, this.zzK, Math.min(remaining2, zza2));
                    if (i > 0) {
                        this.zzK += i;
                        byteBuffer.position(byteBuffer.position() + i);
                    }
                } else {
                    i = 0;
                }
            } else {
                i = this.zzq.write(byteBuffer, remaining2, 1);
            }
            this.zzS = SystemClock.elapsedRealtime();
            if (i < 0) {
                if ((zzeg.zza < 24 || i != -6) && i != -32) {
                    z = false;
                }
                if (z) {
                    zzL();
                }
                zznp zznp = new zznp(i, this.zzp.zza, z);
                zznn zznn = this.zzn;
                if (zznn != null) {
                    zznn.zza(zznp);
                }
                if (!zznp.zzb) {
                    this.zzk.zzb(zznp);
                    return;
                }
                throw zznp;
            }
            this.zzk.zza();
            if (zzT(this.zzq)) {
                long j2 = this.zzy;
                if (j2 > 0) {
                    this.zzU = false;
                }
                if (this.zzO && this.zzn != null && i < remaining2 && !this.zzU) {
                    long zzc2 = this.zzg.zzc(j2);
                    zzos zzos = ((zzor) this.zzn).zza;
                    if (zzos.zzl != null) {
                        zzos.zzl.zza(zzc2);
                    }
                }
            }
            int i2 = this.zzp.zzc;
            if (i2 == 0) {
                this.zzx += (long) i;
            }
            if (i == remaining2) {
                if (i2 != 0) {
                    if (byteBuffer != this.zzG) {
                        z = false;
                    }
                    zzcw.zzf(z);
                    this.zzy += ((long) this.zzz) * ((long) this.zzH);
                }
                this.zzI = null;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean zzR() throws com.google.android.gms.internal.ads.zznp {
        /*
            r9 = this;
            int r0 = r9.zzL
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 != r1) goto L_0x000b
            r9.zzL = r3
        L_0x0009:
            r0 = r2
            goto L_0x000c
        L_0x000b:
            r0 = r3
        L_0x000c:
            int r4 = r9.zzL
            com.google.android.gms.internal.ads.zzmy[] r5 = r9.zzE
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L_0x002f
            r4 = r5[r4]
            if (r0 == 0) goto L_0x001f
            r4.zzd()
        L_0x001f:
            r9.zzN(r7)
            boolean r0 = r4.zzh()
            if (r0 != 0) goto L_0x0029
            return r3
        L_0x0029:
            int r0 = r9.zzL
            int r0 = r0 + r2
            r9.zzL = r0
            goto L_0x0009
        L_0x002f:
            java.nio.ByteBuffer r0 = r9.zzI
            if (r0 == 0) goto L_0x003b
            r9.zzQ(r0, r7)
            java.nio.ByteBuffer r0 = r9.zzI
            if (r0 == 0) goto L_0x003b
            return r3
        L_0x003b:
            r9.zzL = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzom.zzR():boolean");
    }

    private final boolean zzS() {
        return this.zzq != null;
    }

    private static boolean zzT(AudioTrack audioTrack) {
        return zzeg.zza >= 29 && audioTrack.isOffloadedPlayback();
    }

    private final boolean zzU() {
        if (!"audio/raw".equals(this.zzp.zza.zzm)) {
            return false;
        }
        int i = this.zzp.zza.zzB;
        return true;
    }

    public final int zza(zzad zzad) {
        if (!"audio/raw".equals(zzad.zzm)) {
            if (!this.zzT) {
                int i = zzeg.zza;
            }
            return zzH(zzad, this.zza) != null ? 2 : 0;
        } else if (!zzeg.zzU(zzad.zzB)) {
            int i2 = zzad.zzB;
            Log.w("DefaultAudioSink", "Invalid PCM encoding: " + i2);
            return 0;
        } else if (zzad.zzB != 2) {
            return 1;
        } else {
            return 2;
        }
    }

    public final long zzb(boolean z) {
        long j;
        if (!zzS() || this.zzB) {
            return Long.MIN_VALUE;
        }
        long min = Math.min(this.zzg.zzb(z), this.zzp.zza(zzF()));
        while (!this.zzh.isEmpty() && min >= ((zzoe) this.zzh.getFirst()).zzd) {
            this.zzt = (zzoe) this.zzh.remove();
        }
        zzoe zzoe = this.zzt;
        long j2 = min - zzoe.zzd;
        if (zzoe.zza.equals(zzbt.zza)) {
            j = this.zzt.zzc + j2;
        } else if (this.zzh.isEmpty()) {
            j = this.zzV.zza(j2) + this.zzt.zzc;
        } else {
            zzoe zzoe2 = (zzoe) this.zzh.getFirst();
            j = zzoe2.zzc - zzeg.zzs(zzoe2.zzd - min, this.zzt.zza.zzc);
        }
        return j + this.zzp.zza(this.zzV.zzb());
    }

    public final zzbt zzc() {
        return zzI().zza;
    }

    public final void zzd(zzad zzad, int i, int[] iArr) throws zznl {
        zzmy[] zzmyArr;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int[] iArr2;
        zzad zzad2 = zzad;
        if ("audio/raw".equals(zzad2.zzm)) {
            zzcw.zzd(zzeg.zzU(zzad2.zzB));
            i7 = zzeg.zzo(zzad2.zzB, zzad2.zzz);
            int i9 = zzad2.zzB;
            zzmy[] zzmyArr2 = this.zzd;
            this.zzc.zzq(zzad2.zzC, zzad2.zzD);
            if (zzeg.zza < 21 && zzad2.zzz == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i10 = 0; i10 < 6; i10++) {
                    iArr2[i10] = i10;
                }
            } else {
                iArr2 = iArr;
            }
            this.zzb.zzo(iArr2);
            zzmw zzmw = new zzmw(zzad2.zzA, zzad2.zzz, zzad2.zzB);
            int length = zzmyArr2.length;
            int i11 = 0;
            while (i11 < length) {
                zzmy zzmy = zzmyArr2[i11];
                try {
                    zzmw zza2 = zzmy.zza(zzmw);
                    if (true == zzmy.zzg()) {
                        zzmw = zza2;
                    }
                    i11++;
                } catch (zzmx e) {
                    throw new zznl((Throwable) e, zzad2);
                }
            }
            int i12 = zzmw.zzd;
            int i13 = zzmw.zzb;
            int i14 = zzmw.zzc;
            int zzj2 = zzeg.zzj(i14);
            zzmyArr = zzmyArr2;
            i6 = zzeg.zzo(i12, i14);
            i5 = i13;
            i3 = 0;
            int i15 = zzj2;
            i2 = i12;
            i4 = i15;
        } else {
            zzmy[] zzmyArr3 = new zzmy[0];
            int i16 = zzad2.zzA;
            int i17 = zzeg.zza;
            Pair zzH2 = zzH(zzad2, this.zza);
            if (zzH2 != null) {
                i3 = 2;
                zzmyArr = zzmyArr3;
                i2 = ((Integer) zzH2.first).intValue();
                i7 = -1;
                i4 = ((Integer) zzH2.second).intValue();
                i5 = i16;
                i6 = -1;
            } else {
                throw new zznl("Unable to configure passthrough for: ".concat(String.valueOf(String.valueOf(zzad))), zzad2);
            }
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i5, i4, i2);
        zzcw.zzf(minBufferSize != -2);
        int i18 = 250000;
        if (i3 == 0) {
            int i19 = i6;
            i8 = zzeg.zzf(minBufferSize * 4, zzoo.zza(250000, i5, i6), zzoo.zza(750000, i5, i6));
        } else if (i3 != 1) {
            int i20 = 5;
            if (i2 == 5) {
                i18 = 500000;
                i2 = 5;
            } else {
                i20 = i2;
            }
            i8 = zzfto.zza((((long) i18) * ((long) zzoo.zzb(i2))) / 1000000);
            i6 = i6;
            i2 = i20;
        } else {
            int i21 = i6;
            i8 = zzfto.zza((((long) zzoo.zzb(i2)) * 50000000) / 1000000);
        }
        int max = (((Math.max(minBufferSize, (int) ((double) i8)) + i6) - 1) / i6) * i6;
        if (i2 == 0) {
            throw new zznl("Invalid output encoding (mode=" + i3 + ") for: " + String.valueOf(zzad), zzad);
        } else if (i4 != 0) {
            this.zzT = false;
            zzob zzob = new zzob(zzad, i7, i3, i6, i5, i4, i2, max, zzmyArr);
            if (zzS()) {
                this.zzo = zzob;
            } else {
                this.zzp = zzob;
            }
        } else {
            throw new zznl("Invalid output channel config (mode=" + i3 + ") for: " + String.valueOf(zzad), zzad);
        }
    }

    public final void zze() {
        if (zzS()) {
            this.zzv = 0;
            this.zzw = 0;
            this.zzx = 0;
            this.zzy = 0;
            this.zzU = false;
            this.zzz = 0;
            this.zzt = new zzoe(zzI().zza, zzI().zzb, 0, 0, (zzod) null);
            this.zzC = 0;
            this.zzs = null;
            this.zzh.clear();
            this.zzG = null;
            this.zzH = 0;
            this.zzI = null;
            this.zzN = false;
            this.zzM = false;
            this.zzL = -1;
            this.zzc.zzp();
            zzK();
            if (this.zzg.zzi()) {
                this.zzq.pause();
            }
            if (zzT(this.zzq)) {
                zzok zzok = this.zzi;
                if (zzok != null) {
                    zzok.zzb(this.zzq);
                } else {
                    throw null;
                }
            }
            AudioTrack audioTrack = this.zzq;
            this.zzq = null;
            if (zzeg.zza < 21 && !this.zzP) {
                this.zzQ = 0;
            }
            zzob zzob = this.zzo;
            if (zzob != null) {
                this.zzp = zzob;
                this.zzo = null;
            }
            this.zzg.zze();
            this.zzf.close();
            new zznx(this, "ExoPlayer:AudioTrackReleaseThread", audioTrack).start();
        }
        this.zzk.zza();
        this.zzj.zza();
    }

    public final void zzf() {
        this.zzA = true;
    }

    public final void zzg() {
        this.zzO = false;
        if (zzS() && this.zzg.zzl()) {
            this.zzq.pause();
        }
    }

    public final void zzh() {
        this.zzO = true;
        if (zzS()) {
            this.zzg.zzg();
            this.zzq.play();
        }
    }

    public final void zzi() throws zznp {
        if (!this.zzM && zzS() && zzR()) {
            zzM();
            this.zzM = true;
        }
    }

    public final void zzj() {
        zze();
        for (zzmy zzf2 : this.zzd) {
            zzf2.zzf();
        }
        zzmy[] zzmyArr = this.zze;
        int length = zzmyArr.length;
        for (int i = 0; i <= 0; i++) {
            zzmyArr[i].zzf();
        }
        this.zzO = false;
        this.zzT = false;
    }

    public final void zzk(zzi zzi2) {
        if (!this.zzr.equals(zzi2)) {
            this.zzr = zzi2;
            zze();
        }
    }

    public final void zzl(int i) {
        if (this.zzQ != i) {
            this.zzQ = i;
            this.zzP = i != 0;
            zze();
        }
    }

    public final void zzm(zzj zzj2) {
        if (!this.zzR.equals(zzj2)) {
            int i = zzj2.zza;
            float f = zzj2.zzb;
            if (this.zzq != null) {
                int i2 = this.zzR.zza;
            }
            this.zzR = zzj2;
        }
    }

    public final void zzn(zznn zznn) {
        this.zzn = zznn;
    }

    public final void zzo(zzbt zzbt) {
        zzO(new zzbt(zzeg.zza(zzbt.zzc, 0.1f, 8.0f), zzeg.zza(zzbt.zzd, 0.1f, 8.0f)), zzI().zzb);
    }

    public final void zzp(zzmu zzmu) {
        this.zzm = zzmu;
    }

    public final void zzq(boolean z) {
        zzO(zzI().zza, z);
    }

    public final void zzr(float f) {
        if (this.zzD != f) {
            this.zzD = f;
            zzP();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:37|38|39|40|(3:42|43|44)|67|68|69) */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0241, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02b4, code lost:
        r1.zzz = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02b6, code lost:
        if (r0 == 0) goto L_0x02b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02b9, code lost:
        return r10;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:67:0x013d */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:45:0x00c5=Splitter:B:45:0x00c5, B:67:0x013d=Splitter:B:67:0x013d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean zzs(java.nio.ByteBuffer r25, long r26, int r28) throws com.google.android.gms.internal.ads.zznm, com.google.android.gms.internal.ads.zznp {
        /*
            r24 = this;
            r1 = r24
            r2 = r25
            r3 = r26
            r5 = r28
            java.nio.ByteBuffer r0 = r1.zzG
            r6 = 0
            r7 = 1
            if (r0 == 0) goto L_0x0013
            if (r2 != r0) goto L_0x0011
            goto L_0x0013
        L_0x0011:
            r0 = r6
            goto L_0x0014
        L_0x0013:
            r0 = r7
        L_0x0014:
            com.google.android.gms.internal.ads.zzcw.zzd(r0)
            com.google.android.gms.internal.ads.zzob r0 = r1.zzo
            r8 = 0
            if (r0 == 0) goto L_0x0076
            boolean r0 = r24.zzR()
            if (r0 != 0) goto L_0x0023
            return r6
        L_0x0023:
            com.google.android.gms.internal.ads.zzob r0 = r1.zzo
            com.google.android.gms.internal.ads.zzob r9 = r1.zzp
            int r10 = r9.zzc
            int r11 = r0.zzc
            if (r10 != r11) goto L_0x0066
            int r10 = r9.zzg
            int r11 = r0.zzg
            if (r10 != r11) goto L_0x0066
            int r10 = r9.zze
            int r11 = r0.zze
            if (r10 != r11) goto L_0x0066
            int r10 = r9.zzf
            int r11 = r0.zzf
            if (r10 != r11) goto L_0x0066
            int r9 = r9.zzd
            int r10 = r0.zzd
            if (r9 != r10) goto L_0x0066
            r1.zzp = r0
            r1.zzo = r8
            android.media.AudioTrack r0 = r1.zzq
            boolean r0 = zzT(r0)
            if (r0 == 0) goto L_0x0073
            android.media.AudioTrack r0 = r1.zzq
            r0.setOffloadEndOfStream()
            android.media.AudioTrack r0 = r1.zzq
            com.google.android.gms.internal.ads.zzob r9 = r1.zzp
            com.google.android.gms.internal.ads.zzad r9 = r9.zza
            int r10 = r9.zzC
            int r9 = r9.zzD
            r0.setOffloadDelayPadding(r10, r9)
            r1.zzU = r7
            goto L_0x0073
        L_0x0066:
            r24.zzM()
            boolean r0 = r24.zzt()
            if (r0 == 0) goto L_0x0070
            return r6
        L_0x0070:
            r24.zze()
        L_0x0073:
            r1.zzJ(r3)
        L_0x0076:
            boolean r0 = r24.zzS()
            r9 = 31
            if (r0 != 0) goto L_0x014e
            android.os.ConditionVariable r0 = r1.zzf     // Catch:{ zznm -> 0x0141 }
            r0.block()     // Catch:{ zznm -> 0x0141 }
            com.google.android.gms.internal.ads.zzob r0 = r1.zzp     // Catch:{ zznm -> 0x008d }
            if (r0 == 0) goto L_0x008c
            android.media.AudioTrack r0 = r1.zzG(r0)     // Catch:{ zznm -> 0x008d }
            goto L_0x00c5
        L_0x008c:
            throw r8     // Catch:{ zznm -> 0x008d }
        L_0x008d:
            r0 = move-exception
            r11 = r0
            com.google.android.gms.internal.ads.zzob r0 = r1.zzp     // Catch:{ zznm -> 0x0141 }
            int r12 = r0.zzh     // Catch:{ zznm -> 0x0141 }
            r13 = 1000000(0xf4240, float:1.401298E-39)
            if (r12 <= r13) goto L_0x013d
            com.google.android.gms.internal.ads.zzob r12 = new com.google.android.gms.internal.ads.zzob     // Catch:{ zznm -> 0x0141 }
            com.google.android.gms.internal.ads.zzad r15 = r0.zza     // Catch:{ zznm -> 0x0141 }
            int r13 = r0.zzb     // Catch:{ zznm -> 0x0141 }
            int r14 = r0.zzc     // Catch:{ zznm -> 0x0141 }
            int r8 = r0.zzd     // Catch:{ zznm -> 0x0141 }
            int r6 = r0.zze     // Catch:{ zznm -> 0x0141 }
            int r7 = r0.zzf     // Catch:{ zznm -> 0x0141 }
            int r10 = r0.zzg     // Catch:{ zznm -> 0x0141 }
            r22 = 1000000(0xf4240, float:1.401298E-39)
            com.google.android.gms.internal.ads.zzmy[] r0 = r0.zzi     // Catch:{ zznm -> 0x0141 }
            r17 = r14
            r14 = r12
            r16 = r13
            r18 = r8
            r19 = r6
            r20 = r7
            r21 = r10
            r23 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ zznm -> 0x0141 }
            android.media.AudioTrack r0 = r1.zzG(r12)     // Catch:{ zznm -> 0x0124 }
            r1.zzp = r12     // Catch:{ zznm -> 0x0124 }
        L_0x00c5:
            r1.zzq = r0     // Catch:{ zznm -> 0x0141 }
            boolean r0 = zzT(r0)     // Catch:{ zznm -> 0x0141 }
            if (r0 == 0) goto L_0x00ec
            android.media.AudioTrack r0 = r1.zzq     // Catch:{ zznm -> 0x0141 }
            com.google.android.gms.internal.ads.zzok r6 = r1.zzi     // Catch:{ zznm -> 0x0141 }
            if (r6 != 0) goto L_0x00da
            com.google.android.gms.internal.ads.zzok r6 = new com.google.android.gms.internal.ads.zzok     // Catch:{ zznm -> 0x0141 }
            r6.<init>(r1)     // Catch:{ zznm -> 0x0141 }
            r1.zzi = r6     // Catch:{ zznm -> 0x0141 }
        L_0x00da:
            com.google.android.gms.internal.ads.zzok r6 = r1.zzi     // Catch:{ zznm -> 0x0141 }
            r6.zza(r0)     // Catch:{ zznm -> 0x0141 }
            android.media.AudioTrack r0 = r1.zzq     // Catch:{ zznm -> 0x0141 }
            com.google.android.gms.internal.ads.zzob r6 = r1.zzp     // Catch:{ zznm -> 0x0141 }
            com.google.android.gms.internal.ads.zzad r6 = r6.zza     // Catch:{ zznm -> 0x0141 }
            int r7 = r6.zzC     // Catch:{ zznm -> 0x0141 }
            int r6 = r6.zzD     // Catch:{ zznm -> 0x0141 }
            r0.setOffloadDelayPadding(r7, r6)     // Catch:{ zznm -> 0x0141 }
        L_0x00ec:
            int r0 = com.google.android.gms.internal.ads.zzeg.zza     // Catch:{ zznm -> 0x0141 }
            if (r0 < r9) goto L_0x00f9
            com.google.android.gms.internal.ads.zzmu r0 = r1.zzm     // Catch:{ zznm -> 0x0141 }
            if (r0 == 0) goto L_0x00f9
            android.media.AudioTrack r6 = r1.zzq     // Catch:{ zznm -> 0x0141 }
            com.google.android.gms.internal.ads.zzny.zza(r6, r0)     // Catch:{ zznm -> 0x0141 }
        L_0x00f9:
            android.media.AudioTrack r0 = r1.zzq     // Catch:{ zznm -> 0x0141 }
            int r0 = r0.getAudioSessionId()     // Catch:{ zznm -> 0x0141 }
            r1.zzQ = r0     // Catch:{ zznm -> 0x0141 }
            com.google.android.gms.internal.ads.zznu r10 = r1.zzg     // Catch:{ zznm -> 0x0141 }
            android.media.AudioTrack r11 = r1.zzq     // Catch:{ zznm -> 0x0141 }
            com.google.android.gms.internal.ads.zzob r0 = r1.zzp     // Catch:{ zznm -> 0x0141 }
            int r6 = r0.zzc     // Catch:{ zznm -> 0x0141 }
            r7 = 2
            if (r6 != r7) goto L_0x010e
            r12 = 1
            goto L_0x010f
        L_0x010e:
            r12 = 0
        L_0x010f:
            int r13 = r0.zzg     // Catch:{ zznm -> 0x0141 }
            int r14 = r0.zzd     // Catch:{ zznm -> 0x0141 }
            int r15 = r0.zzh     // Catch:{ zznm -> 0x0141 }
            r10.zzf(r11, r12, r13, r14, r15)     // Catch:{ zznm -> 0x0141 }
            r24.zzP()     // Catch:{ zznm -> 0x0141 }
            com.google.android.gms.internal.ads.zzj r0 = r1.zzR     // Catch:{ zznm -> 0x0141 }
            int r0 = r0.zza     // Catch:{ zznm -> 0x0141 }
            r6 = 1
            r1.zzB = r6     // Catch:{ zznm -> 0x0141 }
            r6 = 0
            goto L_0x014e
        L_0x0124:
            r0 = move-exception
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x013d }
            java.lang.Class<java.lang.Throwable> r2 = java.lang.Throwable.class
            r4 = 0
            r3[r4] = r2     // Catch:{ Exception -> 0x013d }
            java.lang.Class<java.lang.Throwable> r2 = java.lang.Throwable.class
            java.lang.String r5 = "addSuppressed"
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r5, r3)     // Catch:{ Exception -> 0x013d }
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x013d }
            r3[r4] = r0     // Catch:{ Exception -> 0x013d }
            r2.invoke(r11, r3)     // Catch:{ Exception -> 0x013d }
        L_0x013d:
            r24.zzL()     // Catch:{ zznm -> 0x0141 }
            throw r11     // Catch:{ zznm -> 0x0141 }
        L_0x0141:
            r0 = move-exception
            boolean r2 = r0.zzb
            if (r2 != 0) goto L_0x014d
            com.google.android.gms.internal.ads.zzof r2 = r1.zzj
            r2.zzb(r0)
            r6 = 0
            return r6
        L_0x014d:
            throw r0
        L_0x014e:
            com.google.android.gms.internal.ads.zzof r0 = r1.zzj
            r0.zza()
            boolean r0 = r1.zzB
            r7 = 0
            if (r0 == 0) goto L_0x016d
            long r10 = java.lang.Math.max(r7, r3)
            r1.zzC = r10
            r1.zzA = r6
            r1.zzB = r6
            r1.zzJ(r3)
            boolean r0 = r1.zzO
            if (r0 == 0) goto L_0x016d
            r24.zzh()
        L_0x016d:
            com.google.android.gms.internal.ads.zznu r0 = r1.zzg
            long r10 = r24.zzF()
            boolean r0 = r0.zzk(r10)
            if (r0 != 0) goto L_0x017b
            r6 = 0
            return r6
        L_0x017b:
            java.nio.ByteBuffer r0 = r1.zzG
            if (r0 != 0) goto L_0x034a
            java.nio.ByteOrder r0 = r25.order()
            java.nio.ByteOrder r6 = java.nio.ByteOrder.LITTLE_ENDIAN
            if (r0 != r6) goto L_0x0189
            r0 = 1
            goto L_0x018a
        L_0x0189:
            r0 = 0
        L_0x018a:
            com.google.android.gms.internal.ads.zzcw.zzd(r0)
            boolean r0 = r25.hasRemaining()
            if (r0 != 0) goto L_0x0195
            r6 = 1
            return r6
        L_0x0195:
            com.google.android.gms.internal.ads.zzob r0 = r1.zzp
            int r6 = r0.zzc
            if (r6 == 0) goto L_0x02ba
            int r6 = r1.zzz
            if (r6 != 0) goto L_0x02ba
            int r0 = r0.zzg
            r6 = 1024(0x400, float:1.435E-42)
            r10 = -2
            r11 = 16
            r12 = -1
            switch(r0) {
                case 5: goto L_0x02af;
                case 6: goto L_0x02af;
                case 7: goto L_0x0249;
                case 8: goto L_0x0249;
                case 9: goto L_0x0233;
                case 10: goto L_0x0231;
                case 11: goto L_0x022e;
                case 12: goto L_0x022e;
                case 13: goto L_0x01aa;
                case 14: goto L_0x01df;
                case 15: goto L_0x01dc;
                case 16: goto L_0x0231;
                case 17: goto L_0x01c1;
                case 18: goto L_0x02af;
                default: goto L_0x01aa;
            }
        L_0x01aa:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Unexpected audio encoding: "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x01c1:
            int r0 = com.google.android.gms.internal.ads.zzxz.zza
            byte[] r0 = new byte[r11]
            int r6 = r25.position()
            r2.get(r0)
            r2.position(r6)
            com.google.android.gms.internal.ads.zzdx r6 = new com.google.android.gms.internal.ads.zzdx
            r6.<init>(r0, r11)
            com.google.android.gms.internal.ads.zzxy r0 = com.google.android.gms.internal.ads.zzxz.zza(r6)
            int r0 = r0.zzc
            goto L_0x0241
        L_0x01dc:
            r0 = 512(0x200, float:7.175E-43)
            goto L_0x0241
        L_0x01df:
            int r0 = com.google.android.gms.internal.ads.zzxw.zza
            int r0 = r25.position()
            int r6 = r25.limit()
            int r6 = r6 + -10
            r9 = r0
        L_0x01ec:
            if (r9 > r6) goto L_0x01ff
            int r13 = r9 + 4
            int r13 = com.google.android.gms.internal.ads.zzeg.zzk(r2, r13)
            r13 = r13 & r10
            r14 = -126718022(0xfffffffff8726fba, float:-1.966878E34)
            if (r13 != r14) goto L_0x01fc
            int r9 = r9 - r0
            goto L_0x0200
        L_0x01fc:
            int r9 = r9 + 1
            goto L_0x01ec
        L_0x01ff:
            r9 = r12
        L_0x0200:
            if (r9 != r12) goto L_0x0204
            r0 = 0
            goto L_0x0241
        L_0x0204:
            int r0 = r25.position()
            int r0 = r0 + r9
            int r0 = r0 + 7
            byte r0 = r2.get(r0)
            int r6 = r25.position()
            int r6 = r6 + r9
            r0 = r0 & 255(0xff, float:3.57E-43)
            r9 = 187(0xbb, float:2.62E-43)
            if (r0 != r9) goto L_0x021d
            r0 = 9
            goto L_0x021f
        L_0x021d:
            r0 = 8
        L_0x021f:
            r9 = 40
            int r6 = r6 + r0
            byte r0 = r2.get(r6)
            int r0 = r0 >> 4
            r0 = r0 & 7
            int r0 = r9 << r0
            int r0 = r0 * r11
            goto L_0x0241
        L_0x022e:
            r0 = 2048(0x800, float:2.87E-42)
            goto L_0x0241
        L_0x0231:
            r0 = r6
            goto L_0x0241
        L_0x0233:
            int r0 = r25.position()
            int r0 = com.google.android.gms.internal.ads.zzeg.zzk(r2, r0)
            int r0 = com.google.android.gms.internal.ads.zzzl.zzc(r0)
            if (r0 == r12) goto L_0x0243
        L_0x0241:
            r10 = 1
            goto L_0x02b4
        L_0x0243:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x0249:
            int r0 = com.google.android.gms.internal.ads.zzyp.zza
            int r0 = r25.position()
            byte r6 = r2.get(r0)
            if (r6 == r10) goto L_0x0296
            if (r6 == r12) goto L_0x027f
            if (r6 == r9) goto L_0x026d
            int r6 = r0 + 4
            byte r6 = r2.get(r6)
            r9 = 1
            r6 = r6 & r9
            int r6 = r6 << 6
            int r0 = r0 + 5
            byte r0 = r2.get(r0)
            r0 = r0 & 252(0xfc, float:3.53E-43)
            r9 = 2
            goto L_0x0292
        L_0x026d:
            r9 = 2
            int r6 = r0 + 5
            byte r6 = r2.get(r6)
            r6 = r6 & 7
            int r6 = r6 << 4
            int r0 = r0 + 6
            byte r0 = r2.get(r0)
            goto L_0x0290
        L_0x027f:
            r9 = 2
            int r6 = r0 + 4
            byte r6 = r2.get(r6)
            r6 = r6 & 7
            int r6 = r6 << 4
            int r0 = r0 + 7
            byte r0 = r2.get(r0)
        L_0x0290:
            r0 = r0 & 60
        L_0x0292:
            int r0 = r0 >> r9
            r0 = r0 | r6
            r10 = 1
            goto L_0x02ab
        L_0x0296:
            r9 = 2
            int r6 = r0 + 5
            byte r6 = r2.get(r6)
            r10 = 1
            r6 = r6 & r10
            int r6 = r6 << 6
            int r0 = r0 + 4
            byte r0 = r2.get(r0)
            r0 = r0 & 252(0xfc, float:3.53E-43)
            int r0 = r0 >> r9
            r0 = r0 | r6
        L_0x02ab:
            int r0 = r0 + r10
            int r0 = r0 * 32
            goto L_0x02b4
        L_0x02af:
            r10 = 1
            int r0 = com.google.android.gms.internal.ads.zzxw.zza(r25)
        L_0x02b4:
            r1.zzz = r0
            if (r0 == 0) goto L_0x02b9
            goto L_0x02ba
        L_0x02b9:
            return r10
        L_0x02ba:
            com.google.android.gms.internal.ads.zzoe r0 = r1.zzs
            if (r0 == 0) goto L_0x02cc
            boolean r0 = r24.zzR()
            if (r0 != 0) goto L_0x02c6
            r6 = 0
            return r6
        L_0x02c6:
            r1.zzJ(r3)
            r6 = 0
            r1.zzs = r6
        L_0x02cc:
            long r9 = r1.zzC
            com.google.android.gms.internal.ads.zzob r0 = r1.zzp
            long r11 = r24.zzE()
            com.google.android.gms.internal.ads.zzox r6 = r1.zzc
            long r13 = r6.zzo()
            long r11 = r11 - r13
            r13 = 1000000(0xf4240, double:4.940656E-318)
            long r11 = r11 * r13
            com.google.android.gms.internal.ads.zzad r0 = r0.zza
            int r0 = r0.zzA
            long r13 = (long) r0
            long r11 = r11 / r13
            long r9 = r9 + r11
            boolean r0 = r1.zzA
            if (r0 != 0) goto L_0x0304
            long r11 = r9 - r3
            long r11 = java.lang.Math.abs(r11)
            r13 = 200000(0x30d40, double:9.8813E-319)
            int r0 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r0 <= 0) goto L_0x0304
            com.google.android.gms.internal.ads.zznn r0 = r1.zzn
            com.google.android.gms.internal.ads.zzno r6 = new com.google.android.gms.internal.ads.zzno
            r6.<init>(r3, r9)
            r0.zza(r6)
            r6 = 1
            r1.zzA = r6
        L_0x0304:
            boolean r0 = r1.zzA
            if (r0 == 0) goto L_0x032b
            boolean r0 = r24.zzR()
            r6 = 0
            if (r0 != 0) goto L_0x0310
            return r6
        L_0x0310:
            long r9 = r3 - r9
            long r11 = r1.zzC
            long r11 = r11 + r9
            r1.zzC = r11
            r1.zzA = r6
            r1.zzJ(r3)
            com.google.android.gms.internal.ads.zznn r0 = r1.zzn
            if (r0 == 0) goto L_0x032b
            int r6 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x032b
            com.google.android.gms.internal.ads.zzor r0 = (com.google.android.gms.internal.ads.zzor) r0
            com.google.android.gms.internal.ads.zzos r0 = r0.zza
            r0.zzab()
        L_0x032b:
            com.google.android.gms.internal.ads.zzob r0 = r1.zzp
            int r0 = r0.zzc
            if (r0 != 0) goto L_0x033c
            long r6 = r1.zzv
            int r0 = r25.remaining()
            long r8 = (long) r0
            long r6 = r6 + r8
            r1.zzv = r6
            goto L_0x0346
        L_0x033c:
            long r6 = r1.zzw
            int r0 = r1.zzz
            long r8 = (long) r0
            long r10 = (long) r5
            long r8 = r8 * r10
            long r6 = r6 + r8
            r1.zzw = r6
        L_0x0346:
            r1.zzG = r2
            r1.zzH = r5
        L_0x034a:
            r1.zzN(r3)
            java.nio.ByteBuffer r0 = r1.zzG
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L_0x035d
            r2 = 0
            r1.zzG = r2
            r2 = 0
            r1.zzH = r2
            r3 = 1
            return r3
        L_0x035d:
            r2 = 0
            r3 = 1
            com.google.android.gms.internal.ads.zznu r0 = r1.zzg
            long r4 = r24.zzF()
            boolean r0 = r0.zzj(r4)
            if (r0 == 0) goto L_0x0376
            java.lang.String r0 = "DefaultAudioSink"
            java.lang.String r2 = "Resetting stalled audio track"
            android.util.Log.w(r0, r2)
            r24.zze()
            return r3
        L_0x0376:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzom.zzs(java.nio.ByteBuffer, long, int):boolean");
    }

    public final boolean zzt() {
        return zzS() && this.zzg.zzh(zzF());
    }

    public final boolean zzu() {
        return !zzS() || (this.zzM && !zzt());
    }

    public final boolean zzv(zzad zzad) {
        return zza(zzad) != 0;
    }
}
