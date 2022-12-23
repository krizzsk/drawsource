package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Arrays;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public abstract class zzaya extends zzaye {
    private final SparseArray zza = new SparseArray();
    private final SparseBooleanArray zzb = new SparseBooleanArray();
    private zzaxy zzc;

    /* access modifiers changed from: protected */
    public abstract zzaxu[] zzb(zzarz[] zzarzArr, zzaxq[] zzaxqArr, int[][][] iArr) throws zzarf;

    public final zzayf zzc(zzarz[] zzarzArr, zzaxq zzaxq) throws zzarf {
        zzaxz zzaxz;
        int[] iArr;
        zzarz[] zzarzArr2 = zzarzArr;
        zzaxq zzaxq2 = zzaxq;
        int[] iArr2 = new int[3];
        zzaxp[][] zzaxpArr = new zzaxp[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i = 0; i < 3; i++) {
            int i2 = zzaxq2.zzb;
            zzaxpArr[i] = new zzaxp[i2];
            iArr3[i] = new int[i2][];
        }
        int i3 = 2;
        int[] iArr4 = new int[2];
        for (int i4 = 0; i4 < 2; i4++) {
            zzarzArr2[i4].zze();
            iArr4[i4] = 4;
        }
        int i5 = 0;
        while (i5 < zzaxq2.zzb) {
            zzaxp zzb2 = zzaxq2.zzb(i5);
            int i6 = i3;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                if (i7 >= i3) {
                    i7 = i6;
                    break;
                }
                zzarz zzarz = zzarzArr2[i7];
                int i9 = 0;
                while (true) {
                    int i10 = zzb2.zza;
                    if (i9 > 0) {
                        break;
                    }
                    int zzG = zzarz.zzG(zzb2.zzb(i9)) & 3;
                    if (zzG > i8) {
                        if (zzG == 3) {
                            break;
                        }
                        i6 = i7;
                        i8 = zzG;
                    }
                    i9++;
                }
                i7++;
                i3 = 2;
            }
            if (i7 == 2) {
                int i11 = zzb2.zza;
                iArr = new int[1];
            } else {
                zzarz zzarz2 = zzarzArr2[i7];
                int i12 = zzb2.zza;
                int[] iArr5 = new int[1];
                int i13 = 0;
                while (true) {
                    int i14 = zzb2.zza;
                    if (i13 > 0) {
                        break;
                    }
                    iArr5[i13] = zzarz2.zzG(zzb2.zzb(i13));
                    i13++;
                }
                iArr = iArr5;
            }
            int i15 = iArr2[i7];
            zzaxpArr[i7][i15] = zzb2;
            iArr3[i7][i15] = iArr;
            iArr2[i7] = i15 + 1;
            i5++;
            i3 = 2;
        }
        int i16 = i3;
        zzaxq[] zzaxqArr = new zzaxq[i16];
        int[] iArr6 = new int[i16];
        int i17 = 0;
        while (i17 < i16) {
            int i18 = iArr2[i17];
            zzaxqArr[i17] = new zzaxq((zzaxp[]) Arrays.copyOf(zzaxpArr[i17], i18));
            iArr3[i17] = (int[][]) Arrays.copyOf(iArr3[i17], i18);
            iArr6[i17] = zzarzArr2[i17].zzc();
            i17++;
            i16 = 2;
        }
        int i19 = i16;
        zzaxq zzaxq3 = new zzaxq((zzaxp[]) Arrays.copyOf(zzaxpArr[i19], iArr2[i19]));
        zzaxu[] zzb3 = zzb(zzarzArr2, zzaxqArr, iArr3);
        int i20 = 0;
        while (i20 < i19) {
            if (this.zzb.get(i20)) {
                zzb3[i20] = null;
            } else {
                zzaxq zzaxq4 = zzaxqArr[i20];
                Map map = (Map) this.zza.get(i20);
                if (map == null) {
                    zzaxz = null;
                } else {
                    zzaxz = (zzaxz) map.get(zzaxq4);
                }
                if (zzaxz != null) {
                    throw null;
                }
            }
            i20++;
            i19 = 2;
        }
        zzaxy zzaxy = new zzaxy(iArr6, zzaxqArr, iArr4, iArr3, zzaxq3);
        zzasa[] zzasaArr = new zzasa[2];
        for (int i21 = 0; i21 < 2; i21++) {
            zzasaArr[i21] = zzb3[i21] != null ? zzasa.zza : null;
        }
        return new zzayf(zzaxq2, new zzayc(zzb3, (byte[]) null), zzaxy, zzasaArr);
    }

    public final void zzd(Object obj) {
        this.zzc = (zzaxy) obj;
    }

    public final void zze(int i, boolean z) {
        if (this.zzb.get(i) != z) {
            this.zzb.put(i, z);
            zzg();
        }
    }
}
