package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzaxw extends zzaya {
    private final AtomicReference zza;

    public zzaxw() {
        this((zzayb) null);
    }

    protected static boolean zza(int i, boolean z) {
        int i2 = i & 3;
        return i2 == 3 || (z && i2 == 2);
    }

    private static int zzh(int i, int i2) {
        if (i == -1) {
            return i2 != -1 ? -1 : 0;
        }
        if (i2 == -1) {
            return 1;
        }
        return i - i2;
    }

    /* access modifiers changed from: protected */
    public final zzaxu[] zzb(zzarz[] zzarzArr, zzaxq[] zzaxqArr, int[][][] iArr) throws zzarf {
        boolean z;
        zzaxx zzaxx;
        zzaxx zzaxx2;
        int[] iArr2;
        ArrayList arrayList;
        zzaxp zzaxp;
        boolean z2;
        int i;
        int i2;
        int i3 = 2;
        zzaxu[] zzaxuArr = new zzaxu[2];
        zzaxv zzaxv = (zzaxv) this.zza.get();
        int i4 = 0;
        boolean z3 = false;
        while (true) {
            int i5 = 1;
            if (i4 >= i3) {
                break;
            }
            if (zzarzArr[i4].zzc() == i3) {
                if (!z3) {
                    zzarz zzarz = zzarzArr[i4];
                    zzaxq zzaxq = zzaxqArr[i4];
                    int[][] iArr3 = iArr[i4];
                    int i6 = zzaxv.zzd;
                    int i7 = zzaxv.zze;
                    int i8 = zzaxv.zzf;
                    boolean z4 = zzaxv.zzc;
                    boolean z5 = zzaxv.zzb;
                    int i9 = zzaxv.zzi;
                    int i10 = zzaxv.zzj;
                    boolean z6 = zzaxv.zzk;
                    boolean z7 = zzaxv.zzg;
                    boolean z8 = zzaxv.zzh;
                    int i11 = 0;
                    zzaxp zzaxp2 = null;
                    int i12 = 0;
                    int i13 = 0;
                    int i14 = -1;
                    int i15 = -1;
                    while (i11 < zzaxq.zzb) {
                        zzaxp zzb = zzaxq.zzb(i11);
                        int i16 = zzb.zza;
                        ArrayList arrayList2 = new ArrayList(i5);
                        int i17 = 0;
                        while (true) {
                            int i18 = zzb.zza;
                            if (i17 > 0) {
                                break;
                            }
                            arrayList2.add(Integer.valueOf(i17));
                            i17++;
                        }
                        int[] iArr4 = iArr3[i11];
                        int i19 = i15;
                        int i20 = 0;
                        while (true) {
                            int i21 = zzb.zza;
                            if (i20 > 0) {
                                break;
                            }
                            zzaxq zzaxq2 = zzaxq;
                            if (zza(iArr4[i20], true)) {
                                zzart zzb2 = zzb.zzb(i20);
                                if (arrayList2.contains(Integer.valueOf(i20))) {
                                    int i22 = zzb2.zzj;
                                    int i23 = zzb2.zzk;
                                    int i24 = zzb2.zzb;
                                    zzaxp = zzb;
                                    z2 = true;
                                } else {
                                    zzaxp = zzb;
                                    z2 = false;
                                }
                                if (true != z2) {
                                    arrayList = arrayList2;
                                    i = 1;
                                } else {
                                    arrayList = arrayList2;
                                    i = 2;
                                }
                                iArr2 = iArr4;
                                boolean zza2 = zza(iArr4[i20], false);
                                if (zza2) {
                                    i += 1000;
                                }
                                boolean z9 = i > i13;
                                if (i == i13) {
                                    if (zzb2.zza() != i19) {
                                        i2 = zzh(zzb2.zza(), i19);
                                    } else {
                                        i2 = zzh(zzb2.zzb, i14);
                                    }
                                    z9 = !zza2 || !z2 ? i2 < 0 : i2 > 0;
                                }
                                if (z9) {
                                    i14 = zzb2.zzb;
                                    i19 = zzb2.zza();
                                    i13 = i;
                                    i12 = i20;
                                    zzaxp2 = zzaxp;
                                }
                            } else {
                                zzaxp = zzb;
                                iArr2 = iArr4;
                                arrayList = arrayList2;
                            }
                            i20++;
                            zzaxq = zzaxq2;
                            zzb = zzaxp;
                            arrayList2 = arrayList;
                            iArr4 = iArr2;
                        }
                        zzaxq zzaxq3 = zzaxq;
                        i11++;
                        i15 = i19;
                        i5 = 1;
                    }
                    if (zzaxp2 == null) {
                        zzaxx2 = null;
                    } else {
                        zzaxx2 = new zzaxx(zzaxp2, i12, 0, (Object) null);
                    }
                    zzaxuArr[i4] = zzaxx2;
                    z3 = zzaxx2 != null;
                }
                int i25 = zzaxqArr[i4].zzb;
            }
            i4++;
            i3 = 2;
        }
        int i26 = 0;
        boolean z10 = false;
        while (i26 < i3) {
            if (zzarzArr[i26].zzc() == 1) {
                if (!z10) {
                    zzaxq zzaxq4 = zzaxqArr[i26];
                    int[][] iArr5 = iArr[i26];
                    String str = zzaxv.zza;
                    boolean z11 = zzaxv.zzh;
                    boolean z12 = zzaxv.zzb;
                    int i27 = -1;
                    int i28 = -1;
                    int i29 = 0;
                    int i30 = 0;
                    while (i29 < zzaxq4.zzb) {
                        zzaxp zzb3 = zzaxq4.zzb(i29);
                        int[] iArr6 = iArr5[i29];
                        int i31 = i30;
                        int i32 = i28;
                        int i33 = i27;
                        int i34 = 0;
                        while (true) {
                            int i35 = zzb3.zza;
                            if (i34 > 0) {
                                break;
                            }
                            if (zza(iArr6[i34], true)) {
                                zzart zzb4 = zzb3.zzb(i34);
                                int i36 = iArr6[i34];
                                int i37 = 1 != (zzb4.zzx & 1) ? 1 : i3;
                                if (zza(i36, false)) {
                                    i37 += 1000;
                                }
                                if (i37 > i31) {
                                    i32 = i34;
                                    i33 = i29;
                                    i31 = i37;
                                }
                            }
                            i34++;
                            i3 = 2;
                        }
                        i29++;
                        i27 = i33;
                        i28 = i32;
                        i30 = i31;
                        i3 = 2;
                    }
                    if (i27 == -1) {
                        zzaxx = null;
                        z = false;
                    } else {
                        z = false;
                        zzaxx = new zzaxx(zzaxq4.zzb(i27), i28, 0, (Object) null);
                    }
                    zzaxuArr[i26] = zzaxx;
                    z10 = zzaxx != null ? true : z;
                }
            }
            i26++;
            i3 = 2;
        }
        return zzaxuArr;
    }

    public zzaxw(zzayb zzayb) {
        this.zza = new AtomicReference(new zzaxv());
    }
}
