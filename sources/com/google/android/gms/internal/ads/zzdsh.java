package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzo;
import com.google.android.gms.ads.internal.overlay.zzw;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdsh implements zza, zzbnm, zzo, zzbno, zzw, zzdjg {
    private zza zza;
    private zzbnm zzb;
    private zzo zzc;
    private zzbno zzd;
    private zzw zze;
    private zzdjg zzf;

    /* access modifiers changed from: private */
    public final synchronized void zzi(zza zza2, zzbnm zzbnm, zzo zzo, zzbno zzbno, zzw zzw, zzdjg zzdjg) {
        this.zza = zza2;
        this.zzb = zzbnm;
        this.zzc = zzo;
        this.zzd = zzbno;
        this.zze = zzw;
        this.zzf = zzdjg;
    }

    public final synchronized void onAdClicked() {
        zza zza2 = this.zza;
        if (zza2 != null) {
            zza2.onAdClicked();
        }
    }

    public final synchronized void zza(String str, Bundle bundle) {
        zzbnm zzbnm = this.zzb;
        if (zzbnm != null) {
            zzbnm.zza(str, bundle);
        }
    }

    public final synchronized void zzb() {
        zzo zzo = this.zzc;
        if (zzo != null) {
            zzo.zzb();
        }
    }

    public final synchronized void zzbC() {
        zzo zzo = this.zzc;
        if (zzo != null) {
            zzo.zzbC();
        }
    }

    public final synchronized void zzbD(String str, String str2) {
        zzbno zzbno = this.zzd;
        if (zzbno != null) {
            zzbno.zzbD(str, str2);
        }
    }

    public final synchronized void zzbK() {
        zzo zzo = this.zzc;
        if (zzo != null) {
            zzo.zzbK();
        }
    }

    public final synchronized void zzbr() {
        zzo zzo = this.zzc;
        if (zzo != null) {
            zzo.zzbr();
        }
    }

    public final synchronized void zze() {
        zzo zzo = this.zzc;
        if (zzo != null) {
            zzo.zze();
        }
    }

    public final synchronized void zzf(int i) {
        zzo zzo = this.zzc;
        if (zzo != null) {
            zzo.zzf(i);
        }
    }

    public final synchronized void zzg() {
        zzw zzw = this.zze;
        if (zzw != null) {
            ((zzdsi) zzw).zza.zzb();
        }
    }

    public final synchronized void zzq() {
        zzdjg zzdjg = this.zzf;
        if (zzdjg != null) {
            zzdjg.zzq();
        }
    }
}
