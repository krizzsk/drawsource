package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzexo implements zzemw {
    final /* synthetic */ zzexp zza;

    zzexo(zzexp zzexp) {
        this.zza = zzexp;
    }

    public final void zza() {
        synchronized (this.zza) {
            this.zza.zza = null;
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcvo zzcvo = (zzcvo) obj;
        synchronized (this.zza) {
            zzcvo zzcvo2 = this.zza.zza;
            if (zzcvo2 != null) {
                zzcvo2.zzV();
            }
            zzexp zzexp = this.zza;
            zzexp.zza = zzcvo;
            zzcvo.zzc(zzexp);
            zzexp zzexp2 = this.zza;
            zzexp2.zzg.zzl(new zzcvp(zzcvo, zzexp2, zzexp2.zzg));
            zzcvo.zzW();
        }
    }
}
