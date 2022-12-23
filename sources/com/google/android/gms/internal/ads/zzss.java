package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzss extends zzrj {
    private static final zzbb zza;
    private final zzsc[] zzb;
    private final zzci[] zzc;
    private final ArrayList zzd;
    private final Map zze;
    private final zzfsf zzf;
    private int zzg = -1;
    private long[][] zzh;
    private zzsr zzi;
    private final zzrl zzj;

    static {
        zzah zzah = new zzah();
        zzah.zza("MergingMediaSource");
        zza = zzah.zzc();
    }

    public zzss(boolean z, boolean z2, zzsc... zzscArr) {
        zzrl zzrl = new zzrl();
        this.zzb = zzscArr;
        this.zzj = zzrl;
        this.zzd = new ArrayList(Arrays.asList(zzscArr));
        this.zzc = new zzci[zzscArr.length];
        this.zzh = new long[0][];
        this.zze = new HashMap();
        this.zzf = zzfsm.zzb(8).zzb(2).zza();
    }

    public final void zzB(zzry zzry) {
        zzsq zzsq = (zzsq) zzry;
        int i = 0;
        while (true) {
            zzsc[] zzscArr = this.zzb;
            if (i < zzscArr.length) {
                zzscArr[i].zzB(zzsq.zzn(i));
                i++;
            } else {
                return;
            }
        }
    }

    public final zzry zzD(zzsa zzsa, zzvv zzvv, long j) {
        int length = this.zzb.length;
        zzry[] zzryArr = new zzry[length];
        int zza2 = this.zzc[0].zza(zzsa.zza);
        for (int i = 0; i < length; i++) {
            zzryArr[i] = this.zzb[i].zzD(zzsa.zzc(this.zzc[i].zzf(zza2)), zzvv, j - this.zzh[zza2][i]);
        }
        return new zzsq(this.zzj, this.zzh[zza2], zzryArr, (byte[]) null);
    }

    /* access modifiers changed from: protected */
    public final void zzn(zzfs zzfs) {
        super.zzn(zzfs);
        for (int i = 0; i < this.zzb.length; i++) {
            zzy(Integer.valueOf(i), this.zzb[i]);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzq() {
        super.zzq();
        Arrays.fill(this.zzc, (Object) null);
        this.zzg = -1;
        this.zzi = null;
        this.zzd.clear();
        Collections.addAll(this.zzd, this.zzb);
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ zzsa zzv(Object obj, zzsa zzsa) {
        if (((Integer) obj).intValue() == 0) {
            return zzsa;
        }
        return null;
    }

    public final void zzw() throws IOException {
        zzsr zzsr = this.zzi;
        if (zzsr == null) {
            super.zzw();
            return;
        }
        throw zzsr;
    }

    /* access modifiers changed from: protected */
    public final /* bridge */ /* synthetic */ void zzx(Object obj, zzsc zzsc, zzci zzci) {
        int i;
        if (this.zzi == null) {
            if (this.zzg == -1) {
                i = zzci.zzb();
                this.zzg = i;
            } else {
                int zzb2 = zzci.zzb();
                int i2 = this.zzg;
                if (zzb2 == i2) {
                    i = i2;
                } else {
                    this.zzi = new zzsr(0);
                    return;
                }
            }
            if (this.zzh.length == 0) {
                int[] iArr = new int[2];
                iArr[1] = this.zzc.length;
                iArr[0] = i;
                this.zzh = (long[][]) Array.newInstance(long.class, iArr);
            }
            this.zzd.remove(zzsc);
            this.zzc[((Integer) obj).intValue()] = zzci;
            if (this.zzd.isEmpty()) {
                zzo(this.zzc[0]);
            }
        }
    }

    public final zzbb zzz() {
        zzsc[] zzscArr = this.zzb;
        return zzscArr.length > 0 ? zzscArr[0].zzz() : zza;
    }
}
