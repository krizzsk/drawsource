package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzrd implements zzst {
    private final zzyy zza;
    private zzyr zzb;
    private zzys zzc;

    public zzrd(zzyy zzyy) {
        this.zza = zzyy;
    }

    public final long zzb() {
        zzys zzys = this.zzc;
        if (zzys != null) {
            return zzys.zzf();
        }
        return -1;
    }

    public final void zzc() {
        zzyr zzyr = this.zzb;
        if (zzyr instanceof zzado) {
            ((zzado) zzyr).zze();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x004a, code lost:
        if (r0.zzf() != r11) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x006c, code lost:
        if (r0.zzf() != r11) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x006f, code lost:
        r1 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzd(com.google.android.gms.internal.ads.zzp r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, com.google.android.gms.internal.ads.zzyu r15) throws java.io.IOException {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzyl r6 = new com.google.android.gms.internal.ads.zzyl
            r0 = r6
            r1 = r8
            r2 = r11
            r4 = r13
            r0.<init>(r1, r2, r4)
            r7.zzc = r6
            com.google.android.gms.internal.ads.zzyr r8 = r7.zzb
            if (r8 == 0) goto L_0x0010
            return
        L_0x0010:
            com.google.android.gms.internal.ads.zzyy r8 = r7.zza
            com.google.android.gms.internal.ads.zzyr[] r8 = r8.zzb(r9, r10)
            int r10 = r8.length
            r13 = 0
            r14 = 1
            if (r10 != r14) goto L_0x0021
            r8 = r8[r13]
            r7.zzb = r8
            goto L_0x007f
        L_0x0021:
            r0 = r13
        L_0x0022:
            if (r0 >= r10) goto L_0x007b
            r1 = r8[r0]
            boolean r2 = r1.zzd(r6)     // Catch:{ EOFException -> 0x0062, all -> 0x004d }
            if (r2 == 0) goto L_0x0040
            r7.zzb = r1     // Catch:{ EOFException -> 0x0062, all -> 0x004d }
            if (r1 != 0) goto L_0x0038
            long r0 = r6.zzf()
            int r10 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r10 != 0) goto L_0x0039
        L_0x0038:
            r13 = r14
        L_0x0039:
            com.google.android.gms.internal.ads.zzcw.zzf(r13)
            r6.zzj()
            goto L_0x007b
        L_0x0040:
            com.google.android.gms.internal.ads.zzyr r1 = r7.zzb
            if (r1 != 0) goto L_0x0071
            long r1 = r6.zzf()
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L_0x006f
            goto L_0x0071
        L_0x004d:
            r8 = move-exception
            com.google.android.gms.internal.ads.zzyr r9 = r7.zzb
            if (r9 != 0) goto L_0x005a
            long r9 = r6.zzf()
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 != 0) goto L_0x005b
        L_0x005a:
            r13 = r14
        L_0x005b:
            com.google.android.gms.internal.ads.zzcw.zzf(r13)
            r6.zzj()
            throw r8
        L_0x0062:
            com.google.android.gms.internal.ads.zzyr r1 = r7.zzb
            if (r1 != 0) goto L_0x0071
            long r1 = r6.zzf()
            int r1 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r1 != 0) goto L_0x006f
            goto L_0x0071
        L_0x006f:
            r1 = r13
            goto L_0x0072
        L_0x0071:
            r1 = r14
        L_0x0072:
            com.google.android.gms.internal.ads.zzcw.zzf(r1)
            r6.zzj()
            int r0 = r0 + 1
            goto L_0x0022
        L_0x007b:
            com.google.android.gms.internal.ads.zzyr r10 = r7.zzb
            if (r10 == 0) goto L_0x0085
        L_0x007f:
            com.google.android.gms.internal.ads.zzyr r8 = r7.zzb
            r8.zzb(r15)
            return
        L_0x0085:
            com.google.android.gms.internal.ads.zztz r10 = new com.google.android.gms.internal.ads.zztz
            java.lang.String r8 = com.google.android.gms.internal.ads.zzeg.zzJ(r8)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "None of the available extractors ("
            r11.append(r12)
            r11.append(r8)
            java.lang.String r8 = ") could read the stream."
            r11.append(r8)
            java.lang.String r8 = r11.toString()
            r10.<init>(r8, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzrd.zzd(com.google.android.gms.internal.ads.zzp, android.net.Uri, java.util.Map, long, long, com.google.android.gms.internal.ads.zzyu):void");
    }

    public final void zze() {
        if (this.zzb != null) {
            this.zzb = null;
        }
        this.zzc = null;
    }

    public final int zza(zzzr zzzr) throws IOException {
        zzyr zzyr = this.zzb;
        if (zzyr != null) {
            zzys zzys = this.zzc;
            if (zzys != null) {
                return zzyr.zza(zzys, zzzr);
            }
            throw null;
        }
        throw null;
    }

    public final void zzf(long j, long j2) {
        zzyr zzyr = this.zzb;
        if (zzyr != null) {
            zzyr.zzc(j, j2);
            return;
        }
        throw null;
    }
}
