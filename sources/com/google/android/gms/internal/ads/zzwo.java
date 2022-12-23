package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzwo {
    private static final Comparator zza = zzwk.zza;
    private static final Comparator zzb = zzwl.zza;
    private final ArrayList zzc = new ArrayList();
    private final zzwn[] zzd = new zzwn[5];
    private int zze = -1;
    private int zzf;
    private int zzg;
    private int zzh;

    public zzwo(int i) {
    }

    public final float zza(float f) {
        if (this.zze != 0) {
            Collections.sort(this.zzc, zzb);
            this.zze = 0;
        }
        float f2 = ((float) this.zzg) * 0.5f;
        int i = 0;
        for (int i2 = 0; i2 < this.zzc.size(); i2++) {
            zzwn zzwn = (zzwn) this.zzc.get(i2);
            i += zzwn.zzb;
            if (((float) i) >= f2) {
                return zzwn.zzc;
            }
        }
        if (this.zzc.isEmpty()) {
            return Float.NaN;
        }
        ArrayList arrayList = this.zzc;
        return ((zzwn) arrayList.get(arrayList.size() - 1)).zzc;
    }

    public final void zzb(int i, float f) {
        zzwn zzwn;
        if (this.zze != 1) {
            Collections.sort(this.zzc, zza);
            this.zze = 1;
        }
        int i2 = this.zzh;
        if (i2 > 0) {
            zzwn[] zzwnArr = this.zzd;
            int i3 = i2 - 1;
            this.zzh = i3;
            zzwn = zzwnArr[i3];
        } else {
            zzwn = new zzwn((zzwm) null);
        }
        int i4 = this.zzf;
        this.zzf = i4 + 1;
        zzwn.zza = i4;
        zzwn.zzb = i;
        zzwn.zzc = f;
        this.zzc.add(zzwn);
        this.zzg += i;
        while (true) {
            int i5 = this.zzg;
            if (i5 > 2000) {
                int i6 = i5 - 2000;
                zzwn zzwn2 = (zzwn) this.zzc.get(0);
                int i7 = zzwn2.zzb;
                if (i7 <= i6) {
                    this.zzg -= i7;
                    this.zzc.remove(0);
                    int i8 = this.zzh;
                    if (i8 < 5) {
                        zzwn[] zzwnArr2 = this.zzd;
                        this.zzh = i8 + 1;
                        zzwnArr2[i8] = zzwn2;
                    }
                } else {
                    zzwn2.zzb = i7 - i6;
                    this.zzg -= i6;
                }
            } else {
                return;
            }
        }
    }

    public final void zzc() {
        this.zzc.clear();
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
    }
}
