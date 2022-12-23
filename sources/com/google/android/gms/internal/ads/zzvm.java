package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public abstract class zzvm {
    private zzvl zza;
    private zzvu zzb;

    public boolean zzh() {
        throw null;
    }

    public abstract zzvn zzj(zzju[] zzjuArr, zzty zzty, zzsa zzsa, zzci zzci) throws zzgt;

    public abstract void zzk(Object obj);

    /* access modifiers changed from: protected */
    public final zzvu zzl() {
        zzvu zzvu = this.zzb;
        zzcw.zzb(zzvu);
        return zzvu;
    }

    public final void zzm(zzvl zzvl, zzvu zzvu) {
        this.zza = zzvl;
        this.zzb = zzvu;
    }

    /* access modifiers changed from: protected */
    public final void zzn() {
        zzvl zzvl = this.zza;
        if (zzvl != null) {
            zzvl.zzj();
        }
    }

    public final void zzo() {
        this.zza = null;
        this.zzb = null;
    }
}
