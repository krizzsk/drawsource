package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsCallback;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzecw implements zzdgk, zza, zzdcn, zzdbx {
    private final Context zza;
    private final zzfcs zzb;
    private final zzfbx zzc;
    private final zzfbl zzd;
    private final zzees zze;
    private Boolean zzf;
    private final boolean zzg = ((Boolean) zzay.zzc().zzb(zzbhz.zzfO)).booleanValue();
    private final zzfgp zzh;
    private final String zzi;

    public zzecw(Context context, zzfcs zzfcs, zzfbx zzfbx, zzfbl zzfbl, zzees zzees, zzfgp zzfgp, String str) {
        this.zza = context;
        this.zzb = zzfcs;
        this.zzc = zzfbx;
        this.zzd = zzfbl;
        this.zze = zzees;
        this.zzh = zzfgp;
        this.zzi = str;
    }

    private final zzfgo zzf(String str) {
        zzfgo zzb2 = zzfgo.zzb(str);
        zzb2.zzh(this.zzc, (zzcev) null);
        zzb2.zzf(this.zzd);
        zzb2.zza(SDKAnalyticsEvents.PARAMETER_REQUEST_ID, this.zzi);
        if (!this.zzd.zzu.isEmpty()) {
            zzb2.zza("ancn", (String) this.zzd.zzu.get(0));
        }
        if (this.zzd.zzak) {
            zzb2.zza("device_connectivity", true != zzt.zzo().zzv(this.zza) ? "offline" : CustomTabsCallback.ONLINE_EXTRAS_KEY);
            zzb2.zza("event_timestamp", String.valueOf(zzt.zzA().currentTimeMillis()));
            zzb2.zza("offline_ad", "1");
        }
        return zzb2;
    }

    private final void zzg(zzfgo zzfgo) {
        if (this.zzd.zzak) {
            this.zze.zzd(new zzeeu(zzt.zzA().currentTimeMillis(), this.zzc.zzb.zzb.zzb, this.zzh.zza(zzfgo), 2));
            return;
        }
        this.zzh.zzb(zzfgo);
    }

    private final boolean zzh() {
        if (this.zzf == null) {
            synchronized (this) {
                if (this.zzf == null) {
                    String str = (String) zzay.zzc().zzb(zzbhz.zzbm);
                    zzt.zzp();
                    String zzo = zzs.zzo(this.zza);
                    boolean z = false;
                    if (!(str == null || zzo == null)) {
                        try {
                            z = Pattern.matches(str, zzo);
                        } catch (RuntimeException e) {
                            zzt.zzo().zzt(e, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.zzf = Boolean.valueOf(z);
                }
            }
        }
        return this.zzf.booleanValue();
    }

    public final void onAdClicked() {
        if (this.zzd.zzak) {
            zzg(zzf("click"));
        }
    }

    public final void zza(zze zze2) {
        zze zze3;
        if (this.zzg) {
            int i = zze2.zza;
            String str = zze2.zzb;
            if (zze2.zzc.equals(MobileAds.ERROR_DOMAIN) && (zze3 = zze2.zzd) != null && !zze3.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                zze zze4 = zze2.zzd;
                i = zze4.zza;
                str = zze4.zzb;
            }
            String zza2 = this.zzb.zza(str);
            zzfgo zzf2 = zzf("ifts");
            zzf2.zza(IronSourceConstants.EVENTS_ERROR_REASON, "adapter");
            if (i >= 0) {
                zzf2.zza("arec", String.valueOf(i));
            }
            if (zza2 != null) {
                zzf2.zza("areec", zza2);
            }
            this.zzh.zzb(zzf2);
        }
    }

    public final void zzb() {
        if (this.zzg) {
            zzfgp zzfgp = this.zzh;
            zzfgo zzf2 = zzf("ifts");
            zzf2.zza(IronSourceConstants.EVENTS_ERROR_REASON, "blocked");
            zzfgp.zzb(zzf2);
        }
    }

    public final void zzc() {
        if (zzh()) {
            this.zzh.zzb(zzf("adapter_shown"));
        }
    }

    public final void zzd() {
        if (zzh()) {
            this.zzh.zzb(zzf("adapter_impression"));
        }
    }

    public final void zze(zzdlf zzdlf) {
        if (this.zzg) {
            zzfgo zzf2 = zzf("ifts");
            zzf2.zza(IronSourceConstants.EVENTS_ERROR_REASON, "exception");
            if (!TextUtils.isEmpty(zzdlf.getMessage())) {
                zzf2.zza("msg", zzdlf.getMessage());
            }
            this.zzh.zzb(zzf2);
        }
    }

    public final void zzl() {
        if (zzh() || this.zzd.zzak) {
            zzg(zzf("impression"));
        }
    }
}
