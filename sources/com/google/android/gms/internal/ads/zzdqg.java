package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final /* synthetic */ class zzdqg implements zzfuj {
    public final /* synthetic */ zzfvl zza;

    public /* synthetic */ zzdqg(zzfvl zzfvl) {
        this.zza = zzfvl;
    }

    public final zzfvl zza(Object obj) {
        zzfvl zzfvl = this.zza;
        zzcli zzcli = (zzcli) obj;
        if (zzcli != null && zzcli.zzs() != null) {
            return zzfvl;
        }
        throw new zzeit(1, "Retrieve video view in html5 ad response failed.");
    }
}
