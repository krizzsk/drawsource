package com.google.android.gms.internal.ads;

import android.os.IBinder;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzekc implements zzddc {
    boolean zza = false;
    final /* synthetic */ zzefg zzb;
    final /* synthetic */ zzcga zzc;
    final /* synthetic */ zzekd zzd;

    zzekc(zzekd zzekd, zzefg zzefg, zzcga zzcga) {
        this.zzd = zzekd;
        this.zzb = zzefg;
        this.zzc = zzcga;
    }

    private final synchronized void zze(zze zze) {
        int i = 1;
        if (true == ((Boolean) zzay.zzc().zzb(zzbhz.zzev)).booleanValue()) {
            i = 3;
        }
        this.zzc.zze(new zzefh(i, zze));
    }

    public final synchronized void zza(int i) {
        if (!this.zza) {
            this.zza = true;
            zze(new zze(i, zzekd.zze(this.zzb.zza, i), AdError.UNDEFINED_DOMAIN, (zze) null, (IBinder) null));
        }
    }

    public final synchronized void zzb(zze zze) {
        if (!this.zza) {
            this.zza = true;
            zze(zze);
        }
    }

    public final synchronized void zzc(int i, String str) {
        if (!this.zza) {
            this.zza = true;
            if (str == null) {
                str = zzekd.zze(this.zzb.zza, i);
            }
            zze(new zze(i, str, AdError.UNDEFINED_DOMAIN, (zze) null, (IBinder) null));
        }
    }

    public final synchronized void zzd() {
        this.zzc.zzd((Object) null);
    }
}
