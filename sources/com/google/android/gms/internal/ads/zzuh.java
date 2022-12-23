package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzuh implements zzuz {
    public final /* synthetic */ zzut zza;
    public final /* synthetic */ boolean zzb;

    public /* synthetic */ zzuh(zzut zzut, boolean z) {
        this.zza = zzut;
        this.zzb = z;
    }

    public final List zza(int i, zzck zzck, int[] iArr) {
        zzut zzut = this.zza;
        boolean z = this.zzb;
        int i2 = zzve.zza;
        zzfrg zzi = zzfrj.zzi();
        int i3 = 0;
        while (true) {
            int i4 = zzck.zzb;
            if (i3 > 0) {
                return zzi.zzg();
            }
            zzi.zze(new zzup(i, zzck, i3, zzut, iArr[i3], z));
            i3++;
        }
    }
}
