package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zze;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdvb implements zzdeo, zzddh, zzdbw, zzdcn, zza, zzdgz {
    private final zzbdm zza;
    private boolean zzb = false;

    public zzdvb(zzbdm zzbdm, @Nullable zzezg zzezg) {
        this.zza = zzbdm;
        zzbdm.zzc(2);
        if (zzezg != null) {
            zzbdm.zzc(IronSourceConstants.RV_API_HAS_AVAILABILITY_TRUE);
        }
    }

    public final synchronized void onAdClicked() {
        if (!this.zzb) {
            this.zza.zzc(7);
            this.zzb = true;
            return;
        }
        this.zza.zzc(8);
    }

    public final void zza(zze zze) {
        switch (zze.zza) {
            case 1:
                this.zza.zzc(101);
                return;
            case 2:
                this.zza.zzc(102);
                return;
            case 3:
                this.zza.zzc(5);
                return;
            case 4:
                this.zza.zzc(103);
                return;
            case 5:
                this.zza.zzc(104);
                return;
            case 6:
                this.zza.zzc(105);
                return;
            case 7:
                this.zza.zzc(106);
                return;
            default:
                this.zza.zzc(4);
                return;
        }
    }

    public final void zzb(zzfbx zzfbx) {
        this.zza.zzb(new zzdux(zzfbx));
    }

    public final void zzbE(zzbzv zzbzv) {
    }

    public final void zzd() {
        this.zza.zzc(1109);
    }

    public final void zze(zzbeh zzbeh) {
        this.zza.zzb(new zzdva(zzbeh));
        this.zza.zzc(1103);
    }

    public final void zzf(zzbeh zzbeh) {
        this.zza.zzb(new zzduz(zzbeh));
        this.zza.zzc(IronSourceConstants.RV_API_HAS_AVAILABILITY_FALSE);
    }

    public final void zzh(boolean z) {
        this.zza.zzc(true != z ? 1108 : 1107);
    }

    public final void zzi(zzbeh zzbeh) {
        this.zza.zzb(new zzduy(zzbeh));
        this.zza.zzc(1104);
    }

    public final void zzk(boolean z) {
        this.zza.zzc(true != z ? 1106 : 1105);
    }

    public final synchronized void zzl() {
        this.zza.zzc(6);
    }

    public final void zzn() {
        this.zza.zzc(3);
    }
}
