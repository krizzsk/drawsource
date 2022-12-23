package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public abstract class zzvj extends zzvm {
    private zzvi zza;

    /* access modifiers changed from: protected */
    public abstract Pair zzb(zzvi zzvi, int[][][] iArr, int[] iArr2, zzsa zzsa, zzci zzci) throws zzgt;

    public final zzvn zzj(zzju[] zzjuArr, zzty zzty, zzsa zzsa, zzci zzci) throws zzgt {
        boolean z;
        int[] iArr;
        zzty zzty2 = zzty;
        int[] iArr2 = new int[3];
        zzck[][] zzckArr = new zzck[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i = 0; i < 3; i++) {
            int i2 = zzty2.zzc;
            zzckArr[i] = new zzck[i2];
            iArr3[i] = new int[i2][];
        }
        int i3 = 2;
        int[] iArr4 = new int[2];
        for (int i4 = 0; i4 < 2; i4++) {
            iArr4[i4] = zzjuArr[i4].zze();
        }
        int i5 = 0;
        while (i5 < zzty2.zzc) {
            zzck zzb = zzty2.zzb(i5);
            int i6 = zzb.zzd;
            int i7 = i3;
            int i8 = 0;
            int i9 = 0;
            boolean z2 = true;
            while (i8 < i3) {
                zzju zzju = zzjuArr[i8];
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    int i12 = zzb.zzb;
                    if (i10 > 0) {
                        break;
                    }
                    i11 = Math.max(i11, zzju.zzO(zzb.zzb(i10)) & 7);
                    i10++;
                }
                boolean z3 = iArr2[i8] == 0;
                if (i11 > i9) {
                    z2 = z3;
                    i7 = i8;
                    i9 = i11;
                } else if (i11 == i9 && i6 == 5 && !z2 && z3) {
                    i7 = i8;
                    i9 = i11;
                    z2 = true;
                }
                i8++;
                i3 = 2;
            }
            if (i7 == i3) {
                int i13 = zzb.zzb;
                iArr = new int[1];
            } else {
                zzju zzju2 = zzjuArr[i7];
                int i14 = zzb.zzb;
                int[] iArr5 = new int[1];
                int i15 = 0;
                while (true) {
                    int i16 = zzb.zzb;
                    if (i15 > 0) {
                        break;
                    }
                    iArr5[i15] = zzju2.zzO(zzb.zzb(i15));
                    i15++;
                }
                iArr = iArr5;
            }
            int i17 = iArr2[i7];
            zzckArr[i7][i17] = zzb;
            iArr3[i7][i17] = iArr;
            iArr2[i7] = i17 + 1;
            i5++;
            i3 = 2;
        }
        zzty[] zztyArr = new zzty[i3];
        String[] strArr = new String[i3];
        int[] iArr6 = new int[i3];
        int i18 = 0;
        while (i18 < i3) {
            int i19 = iArr2[i18];
            zztyArr[i18] = new zzty((zzck[]) zzeg.zzad(zzckArr[i18], i19));
            iArr3[i18] = (int[][]) zzeg.zzad(iArr3[i18], i19);
            strArr[i18] = zzjuArr[i18].zzK();
            iArr6[i18] = zzjuArr[i18].zzb();
            i18++;
            i3 = 2;
        }
        int i20 = i3;
        zzvi zzvi = new zzvi(strArr, iArr6, zztyArr, iArr4, iArr3, new zzty((zzck[]) zzeg.zzad(zzckArr[i20], iArr2[i20])));
        Pair zzb2 = zzb(zzvi, iArr3, iArr4, zzsa, zzci);
        zzvk[] zzvkArr = (zzvk[]) zzb2.second;
        List[] listArr = new List[zzvkArr.length];
        for (int i21 = 0; i21 < zzvkArr.length; i21++) {
            zzvk zzvk = zzvkArr[i21];
            listArr[i21] = zzvk != null ? zzfrj.zzp(zzvk) : zzfrj.zzo();
        }
        zzfrg zzfrg = new zzfrg();
        for (int i22 = 0; i22 < 2; i22++) {
            zzty zzd = zzvi.zzd(i22);
            List list = listArr[i22];
            for (int i23 = 0; i23 < zzd.zzc; i23++) {
                zzck zzb3 = zzd.zzb(i23);
                boolean z4 = zzvi.zza(i22, i23, false) != 0;
                int i24 = zzb3.zzb;
                int[] iArr7 = new int[1];
                boolean[] zArr = new boolean[1];
                int i25 = 0;
                while (true) {
                    int i26 = zzb3.zzb;
                    if (i25 > 0) {
                        break;
                    }
                    iArr7[i25] = zzvi.zzb(i22, i23, i25) & 7;
                    int i27 = 0;
                    while (true) {
                        if (i27 >= list.size()) {
                            z = false;
                            break;
                        }
                        zzvk zzvk2 = (zzvk) list.get(i27);
                        if (zzvk2.zze().equals(zzb3) && zzvk2.zzb(i25) != -1) {
                            z = true;
                            break;
                        }
                        i27++;
                    }
                    zArr[i25] = z;
                    i25++;
                }
                zzfrg.zze(new zzcs(zzb3, z4, iArr7, zArr));
            }
        }
        zzty zze = zzvi.zze();
        for (int i28 = 0; i28 < zze.zzc; i28++) {
            zzck zzb4 = zze.zzb(i28);
            int i29 = zzb4.zzb;
            int[] iArr8 = new int[1];
            Arrays.fill(iArr8, 0);
            int i30 = zzb4.zzb;
            zzfrg.zze(new zzcs(zzb4, false, iArr8, new boolean[1]));
        }
        return new zzvn((zzjv[]) zzb2.first, (zzvg[]) zzb2.second, new zzct(zzfrg.zzg()), zzvi);
    }

    public final void zzk(Object obj) {
        this.zza = (zzvi) obj;
    }
}
