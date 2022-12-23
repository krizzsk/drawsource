package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzaym {
    private final zzayg[] zza = new zzayg[1];
    private int zzb;
    private int zzc;
    private int zzd = 0;
    private zzayg[] zze = new zzayg[100];

    public zzaym(boolean z, int i) {
    }

    public final synchronized int zza() {
        return this.zzc * 65536;
    }

    public final synchronized zzayg zzb() {
        zzayg zzayg;
        this.zzc++;
        int i = this.zzd;
        if (i > 0) {
            zzayg[] zzaygArr = this.zze;
            int i2 = i - 1;
            this.zzd = i2;
            zzayg = zzaygArr[i2];
            zzaygArr[i2] = null;
        } else {
            zzayg = new zzayg(new byte[65536], 0);
        }
        return zzayg;
    }

    public final synchronized void zzc(zzayg zzayg) {
        zzayg[] zzaygArr = this.zza;
        zzaygArr[0] = zzayg;
        zzd(zzaygArr);
    }

    public final synchronized void zzd(zzayg[] zzaygArr) {
        int i = this.zzd;
        int i2 = i + r1;
        zzayg[] zzaygArr2 = this.zze;
        int length = zzaygArr2.length;
        if (i2 >= length) {
            this.zze = (zzayg[]) Arrays.copyOf(zzaygArr2, Math.max(length + length, i2));
        }
        for (zzayg zzayg : zzaygArr) {
            byte[] bArr = zzayg.zza;
            zzayg[] zzaygArr3 = this.zze;
            int i3 = this.zzd;
            this.zzd = i3 + 1;
            zzaygArr3[i3] = zzayg;
        }
        this.zzc -= zzaygArr.length;
        notifyAll();
    }

    public final synchronized void zze() {
        zzf(0);
    }

    public final synchronized void zzf(int i) {
        int i2 = this.zzb;
        this.zzb = i;
        if (i < i2) {
            zzg();
        }
    }

    public final synchronized void zzg() {
        int max = Math.max(0, zzazo.zzd(this.zzb, 65536) - this.zzc);
        int i = this.zzd;
        if (max < i) {
            Arrays.fill(this.zze, max, i, (Object) null);
            this.zzd = max;
        }
    }
}
