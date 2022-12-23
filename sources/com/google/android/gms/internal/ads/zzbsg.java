package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzbsg extends zzcgh {
    private final Object zza = new Object();
    /* access modifiers changed from: private */
    public final zzbsl zzb;
    private boolean zzc;

    public zzbsg(zzbsl zzbsl) {
        this.zzb = zzbsl;
    }

    public final void zzb() {
        synchronized (this.zza) {
            if (!this.zzc) {
                this.zzc = true;
                zzi(new zzbsd(this), new zzcgd());
                zzi(new zzbse(this), new zzbsf(this));
            }
        }
    }
}
