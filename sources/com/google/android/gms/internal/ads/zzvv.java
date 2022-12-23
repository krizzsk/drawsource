package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzvv {
    private int zza;
    private int zzb;
    private int zzc = 0;
    private zzvo[] zzd = new zzvo[100];

    public zzvv(boolean z, int i) {
    }

    public final synchronized int zza() {
        return this.zzb * 65536;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.android.gms.internal.ads.zzvo zzb() {
        /*
            r4 = this;
            monitor-enter(r4)
            int r0 = r4.zzb     // Catch:{ all -> 0x0038 }
            int r0 = r0 + 1
            r4.zzb = r0     // Catch:{ all -> 0x0038 }
            int r0 = r4.zzc     // Catch:{ all -> 0x0038 }
            if (r0 <= 0) goto L_0x001a
            com.google.android.gms.internal.ads.zzvo[] r1 = r4.zzd     // Catch:{ all -> 0x0038 }
            int r0 = r0 + -1
            r4.zzc = r0     // Catch:{ all -> 0x0038 }
            r2 = r1[r0]     // Catch:{ all -> 0x0038 }
            r3 = 0
            if (r2 == 0) goto L_0x0019
            r1[r0] = r3     // Catch:{ all -> 0x0038 }
            goto L_0x002b
        L_0x0019:
            throw r3     // Catch:{ all -> 0x0038 }
        L_0x001a:
            com.google.android.gms.internal.ads.zzvo r2 = new com.google.android.gms.internal.ads.zzvo     // Catch:{ all -> 0x0038 }
            r0 = 65536(0x10000, float:9.18355E-41)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x0038 }
            r1 = 0
            r2.<init>(r0, r1)     // Catch:{ all -> 0x0038 }
            int r0 = r4.zzb     // Catch:{ all -> 0x0038 }
            com.google.android.gms.internal.ads.zzvo[] r1 = r4.zzd     // Catch:{ all -> 0x0038 }
            int r3 = r1.length     // Catch:{ all -> 0x0038 }
            if (r0 > r3) goto L_0x002d
        L_0x002b:
            monitor-exit(r4)
            return r2
        L_0x002d:
            int r3 = r3 + r3
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r3)     // Catch:{ all -> 0x0038 }
            com.google.android.gms.internal.ads.zzvo[] r0 = (com.google.android.gms.internal.ads.zzvo[]) r0     // Catch:{ all -> 0x0038 }
            r4.zzd = r0     // Catch:{ all -> 0x0038 }
            monitor-exit(r4)
            return r2
        L_0x0038:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvv.zzb():com.google.android.gms.internal.ads.zzvo");
    }

    public final synchronized void zzc(zzvo zzvo) {
        zzvo[] zzvoArr = this.zzd;
        int i = this.zzc;
        this.zzc = i + 1;
        zzvoArr[i] = zzvo;
        this.zzb--;
        notifyAll();
    }

    public final synchronized void zzd(zzvp zzvp) {
        while (zzvp != null) {
            zzvo[] zzvoArr = this.zzd;
            int i = this.zzc;
            this.zzc = i + 1;
            zzvoArr[i] = zzvp.zzc();
            this.zzb--;
            zzvp = zzvp.zzd();
        }
        notifyAll();
    }

    public final synchronized void zze() {
        zzf(0);
    }

    public final synchronized void zzf(int i) {
        int i2 = this.zza;
        this.zza = i;
        if (i < i2) {
            zzg();
        }
    }

    public final synchronized void zzg() {
        int max = Math.max(0, zzeg.zze(this.zza, 65536) - this.zzb);
        int i = this.zzc;
        if (max < i) {
            Arrays.fill(this.zzd, max, i, (Object) null);
            this.zzc = max;
        }
    }
}
