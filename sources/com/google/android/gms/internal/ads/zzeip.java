package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeoutException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
final class zzeip implements zzfuy {
    final /* synthetic */ long zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzfbl zzc;
    final /* synthetic */ zzfbo zzd;
    final /* synthetic */ zzfie zze;
    final /* synthetic */ zzfbx zzf;
    final /* synthetic */ zzeiq zzg;

    zzeip(zzeiq zzeiq, long j, String str, zzfbl zzfbl, zzfbo zzfbo, zzfie zzfie, zzfbx zzfbx) {
        this.zzg = zzeiq;
        this.zza = j;
        this.zzb = str;
        this.zzc = zzfbl;
        this.zzd = zzfbo;
        this.zze = zzfie;
        this.zzf = zzfbx;
    }

    public final void zza(Throwable th) {
        int i;
        zze zze2;
        long elapsedRealtime = this.zzg.zza.elapsedRealtime() - this.zza;
        if (th instanceof TimeoutException) {
            i = 2;
        } else if (th instanceof zzeif) {
            i = 3;
        } else if (th instanceof CancellationException) {
            i = 4;
        } else {
            i = th instanceof zzfci ? 5 : (!(th instanceof zzdzl) || zzfdc.zza(th).zza != 3) ? 6 : 1;
        }
        zzeiq.zzg(this.zzg, this.zzb, i, elapsedRealtime, this.zzc.zzah);
        zzeiq zzeiq = this.zzg;
        if (zzeiq.zze) {
            zzeiq.zzb.zza(this.zzd, this.zzc, i, th instanceof zzefh ? (zzefh) th : null, elapsedRealtime);
        }
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzgZ)).booleanValue()) {
            zzfii zzc2 = this.zzg.zzc;
            zzfie zzfie = this.zze;
            zzfbx zzfbx = this.zzf;
            zzfbl zzfbl = this.zzc;
            zzc2.zzd(zzfie.zza(zzfbx, zzfbl, zzfbl.zzo));
        }
        zze zza2 = zzfdc.zza(th);
        int i2 = zza2.zza;
        if ((i2 == 3 || i2 == 0) && (zze2 = zza2.zzd) != null && !zze2.zzc.equals(MobileAds.ERROR_DOMAIN)) {
            zza2 = zzfdc.zza(new zzefh(13, zza2.zzd));
        }
        this.zzg.zzf.zze(this.zzc, elapsedRealtime, zza2);
    }

    public final void zzb(Object obj) {
        long elapsedRealtime = this.zzg.zza.elapsedRealtime() - this.zza;
        zzeiq.zzg(this.zzg, this.zzb, 0, elapsedRealtime, this.zzc.zzah);
        zzeiq zzeiq = this.zzg;
        if (zzeiq.zze) {
            zzeiq.zzb.zza(this.zzd, this.zzc, 0, (zzefh) null, elapsedRealtime);
        }
        this.zzg.zzf.zzf(this.zzc, elapsedRealtime, (zze) null);
    }
}
