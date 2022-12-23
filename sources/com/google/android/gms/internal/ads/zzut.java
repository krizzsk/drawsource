package com.google.android.gms.internal.ads;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzut extends zzcp {
    public static final zzut zzD;
    @Deprecated
    public static final zzut zzE;
    public static final zzl zzF = zzur.zza;
    public final boolean zzG;
    public final boolean zzH;
    public final boolean zzI;
    public final boolean zzJ;
    public final boolean zzK;
    public final boolean zzL;
    public final boolean zzM;
    public final boolean zzN;
    public final boolean zzO;
    public final boolean zzP;
    public final boolean zzQ;
    public final boolean zzR;
    /* access modifiers changed from: private */
    public final SparseArray zzS;
    /* access modifiers changed from: private */
    public final SparseBooleanArray zzT;

    static {
        zzut zzut = new zzut(new zzuv());
        zzD = zzut;
        zzE = zzut;
    }

    private zzut(zzuv zzuv) {
        super(zzuv);
        this.zzG = zzuv.zza;
        this.zzH = false;
        this.zzI = zzuv.zzb;
        this.zzJ = false;
        this.zzK = zzuv.zzc;
        this.zzL = false;
        this.zzM = false;
        this.zzN = false;
        this.zzO = false;
        this.zzP = zzuv.zzd;
        this.zzQ = false;
        this.zzR = zzuv.zze;
        this.zzS = zzuv.zzf;
        this.zzT = zzuv.zzg;
    }

    public static zzut zzc(Context context) {
        return new zzut(new zzuv(context));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzut zzut = (zzut) obj;
            if (super.equals(zzut) && this.zzG == zzut.zzG && this.zzI == zzut.zzI && this.zzK == zzut.zzK && this.zzP == zzut.zzP && this.zzR == zzut.zzR) {
                SparseBooleanArray sparseBooleanArray = this.zzT;
                SparseBooleanArray sparseBooleanArray2 = zzut.zzT;
                int size = sparseBooleanArray.size();
                if (sparseBooleanArray2.size() == size) {
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            SparseArray sparseArray = this.zzS;
                            SparseArray sparseArray2 = zzut.zzS;
                            int size2 = sparseArray.size();
                            if (sparseArray2.size() == size2) {
                                int i2 = 0;
                                while (i2 < size2) {
                                    int indexOfKey = sparseArray2.indexOfKey(sparseArray.keyAt(i2));
                                    if (indexOfKey >= 0) {
                                        Map map = (Map) sparseArray.valueAt(i2);
                                        Map map2 = (Map) sparseArray2.valueAt(indexOfKey);
                                        if (map2.size() == map.size()) {
                                            for (Map.Entry entry : map.entrySet()) {
                                                zzty zzty = (zzty) entry.getKey();
                                                if (map2.containsKey(zzty)) {
                                                    if (!zzeg.zzS(entry.getValue(), map2.get(zzty))) {
                                                    }
                                                }
                                            }
                                            i2++;
                                        }
                                    }
                                }
                                return true;
                            }
                        } else if (sparseBooleanArray2.indexOfKey(sparseBooleanArray.keyAt(i)) < 0) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((super.hashCode() + 31) * 31) + (this.zzG ? 1 : 0)) * 961) + (this.zzI ? 1 : 0)) * 961) + (this.zzK ? 1 : 0)) * 28629151) + (this.zzP ? 1 : 0)) * 961) + (this.zzR ? 1 : 0);
    }

    public final zzuv zzd() {
        return new zzuv(this, (zzuu) null);
    }

    @Deprecated
    public final zzux zze(int i, zzty zzty) {
        Map map = (Map) this.zzS.get(i);
        if (map != null) {
            return (zzux) map.get(zzty);
        }
        return null;
    }

    public final boolean zzf(int i) {
        return this.zzT.get(i);
    }

    @Deprecated
    public final boolean zzg(int i, zzty zzty) {
        Map map = (Map) this.zzS.get(i);
        return map != null && map.containsKey(zzty);
    }
}
