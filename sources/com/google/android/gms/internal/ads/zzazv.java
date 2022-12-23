package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzazv {
    public final List zza;
    public final int zzb;

    private zzazv(List list, int i) {
        this.zza = list;
        this.zzb = i;
    }

    public static zzazv zza(zzazh zzazh) throws zzarw {
        List list;
        try {
            zzazh.zzw(21);
            int zzg = zzazh.zzg() & 3;
            int zzg2 = zzazh.zzg();
            int zzc = zzazh.zzc();
            int i = 0;
            for (int i2 = 0; i2 < zzg2; i2++) {
                zzazh.zzw(1);
                int zzj = zzazh.zzj();
                for (int i3 = 0; i3 < zzj; i3++) {
                    int zzj2 = zzazh.zzj();
                    i += zzj2 + 4;
                    zzazh.zzw(zzj2);
                }
            }
            zzazh.zzv(zzc);
            byte[] bArr = new byte[i];
            int i4 = 0;
            for (int i5 = 0; i5 < zzg2; i5++) {
                zzazh.zzw(1);
                int zzj3 = zzazh.zzj();
                for (int i6 = 0; i6 < zzj3; i6++) {
                    int zzj4 = zzazh.zzj();
                    System.arraycopy(zzazf.zza, 0, bArr, i4, 4);
                    int i7 = i4 + 4;
                    System.arraycopy(zzazh.zza, zzazh.zzc(), bArr, i7, zzj4);
                    i4 = i7 + zzj4;
                    zzazh.zzw(zzj4);
                }
            }
            if (i == 0) {
                list = null;
            } else {
                list = Collections.singletonList(bArr);
            }
            return new zzazv(list, zzg + 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new zzarw("Error parsing HEVC config", e);
        }
    }
}
