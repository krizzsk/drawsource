package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public abstract class zzek implements zzeq {
    private final boolean zza;
    private final ArrayList zzb = new ArrayList(1);
    private int zzc;
    private zzev zzd;

    protected zzek(boolean z) {
        this.zza = z;
    }

    public /* synthetic */ Map zze() {
        return Collections.emptyMap();
    }

    public final void zzf(zzfs zzfs) {
        if (zzfs == null) {
            throw null;
        } else if (!this.zzb.contains(zzfs)) {
            this.zzb.add(zzfs);
            this.zzc++;
        }
    }

    /* access modifiers changed from: protected */
    public final void zzg(int i) {
        zzev zzev = this.zzd;
        int i2 = zzeg.zza;
        for (int i3 = 0; i3 < this.zzc; i3++) {
            ((zzfs) this.zzb.get(i3)).zza(this, zzev, this.zza, i);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzh() {
        zzev zzev = this.zzd;
        int i = zzeg.zza;
        for (int i2 = 0; i2 < this.zzc; i2++) {
            ((zzfs) this.zzb.get(i2)).zzb(this, zzev, this.zza);
        }
        this.zzd = null;
    }

    /* access modifiers changed from: protected */
    public final void zzi(zzev zzev) {
        for (int i = 0; i < this.zzc; i++) {
            ((zzfs) this.zzb.get(i)).zzc(this, zzev, this.zza);
        }
    }

    /* access modifiers changed from: protected */
    public final void zzj(zzev zzev) {
        this.zzd = zzev;
        for (int i = 0; i < this.zzc; i++) {
            ((zzfs) this.zzb.get(i)).zzd(this, zzev, this.zza);
        }
    }
}
