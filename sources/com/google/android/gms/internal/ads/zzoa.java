package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzoa {
    final zznz zza = zznz.zza;
    /* access modifiers changed from: private */
    public zzmv zzb = zzmv.zza;
    /* access modifiers changed from: private */
    public zzoc zzc;

    public final zzoa zzb(zzmv zzmv) {
        this.zzb = zzmv;
        return this;
    }

    public final zzoa zzc(zzmy[] zzmyArr) {
        this.zzc = new zzoc(zzmyArr);
        return this;
    }

    public final zzom zzd() {
        if (this.zzc == null) {
            this.zzc = new zzoc(new zzmy[0]);
        }
        return new zzom(this, (zzol) null);
    }
}
