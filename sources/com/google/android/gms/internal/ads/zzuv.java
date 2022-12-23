package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Point;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzuv extends zzco {
    /* access modifiers changed from: private */
    public boolean zza;
    /* access modifiers changed from: private */
    public boolean zzb;
    /* access modifiers changed from: private */
    public boolean zzc;
    /* access modifiers changed from: private */
    public boolean zzd;
    /* access modifiers changed from: private */
    public boolean zze;
    /* access modifiers changed from: private */
    public final SparseArray zzf;
    /* access modifiers changed from: private */
    public final SparseBooleanArray zzg;

    @Deprecated
    public zzuv() {
        this.zzf = new SparseArray();
        this.zzg = new SparseBooleanArray();
        zzu();
    }

    private final void zzu() {
        this.zza = true;
        this.zzb = true;
        this.zzc = true;
        this.zzd = true;
        this.zze = true;
    }

    public final /* synthetic */ zzco zze(int i, int i2, boolean z) {
        super.zze(i, i2, true);
        return this;
    }

    public final zzuv zzo(int i, boolean z) {
        if (this.zzg.get(i) == z) {
            return this;
        }
        if (z) {
            this.zzg.put(i, true);
        } else {
            this.zzg.delete(i);
        }
        return this;
    }

    public zzuv(Context context) {
        super.zzd(context);
        Point zzA = zzeg.zzA(context);
        zze(zzA.x, zzA.y, true);
        this.zzf = new SparseArray();
        this.zzg = new SparseBooleanArray();
        zzu();
    }

    /* synthetic */ zzuv(zzut zzut, zzuu zzuu) {
        super(zzut);
        this.zza = zzut.zzG;
        this.zzb = zzut.zzI;
        this.zzc = zzut.zzK;
        this.zzd = zzut.zzP;
        this.zze = zzut.zzR;
        SparseArray zza2 = zzut.zzS;
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < zza2.size(); i++) {
            sparseArray.put(zza2.keyAt(i), new HashMap((Map) zza2.valueAt(i)));
        }
        this.zzf = sparseArray;
        this.zzg = zzut.zzT.clone();
    }
}
