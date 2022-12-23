package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsCallback;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.ads.nonagon.signalgeneration.zzf;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdvq implements zzdgk, zza, zzdcn, zzdbx {
    private final Context zza;
    private final zzfcs zzb;
    private final zzdwh zzc;
    private final zzfbx zzd;
    private final zzfbl zze;
    private final zzees zzf;
    private Boolean zzg;
    private final boolean zzh = ((Boolean) zzay.zzc().zzb(zzbhz.zzfO)).booleanValue();

    public zzdvq(Context context, zzfcs zzfcs, zzdwh zzdwh, zzfbx zzfbx, zzfbl zzfbl, zzees zzees) {
        this.zza = context;
        this.zzb = zzfcs;
        this.zzc = zzdwh;
        this.zzd = zzfbx;
        this.zze = zzfbl;
        this.zzf = zzees;
    }

    private final zzdwg zzf(String str) {
        zzdwg zza2 = this.zzc.zza();
        zza2.zze(this.zzd.zzb.zzb);
        zza2.zzd(this.zze);
        zza2.zzb("action", str);
        boolean z = false;
        if (!this.zze.zzu.isEmpty()) {
            zza2.zzb("ancn", (String) this.zze.zzu.get(0));
        }
        if (this.zze.zzak) {
            zza2.zzb("device_connectivity", true != zzt.zzo().zzv(this.zza) ? "offline" : CustomTabsCallback.ONLINE_EXTRAS_KEY);
            zza2.zzb("event_timestamp", String.valueOf(zzt.zzA().currentTimeMillis()));
            zza2.zzb("offline_ad", "1");
        }
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzfX)).booleanValue()) {
            if (zzf.zzd(this.zzd.zza.zza) != 1) {
                z = true;
            }
            zza2.zzb("scar", String.valueOf(z));
            if (z) {
                zzl zzl = this.zzd.zza.zza.zzd;
                zza2.zzc("ragent", zzl.zzp);
                zza2.zzc("rtype", zzf.zza(zzf.zzb(zzl)));
            }
        }
        return zza2;
    }

    private final void zzg(zzdwg zzdwg) {
        if (this.zze.zzak) {
            this.zzf.zzd(new zzeeu(zzt.zzA().currentTimeMillis(), this.zzd.zzb.zzb.zzb, zzdwg.zzf(), 2));
            return;
        }
        zzdwg.zzg();
    }

    private final boolean zzh() {
        if (this.zzg == null) {
            synchronized (this) {
                if (this.zzg == null) {
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
                    this.zzg = Boolean.valueOf(z);
                }
            }
        }
        return this.zzg.booleanValue();
    }

    public final void onAdClicked() {
        if (this.zze.zzak) {
            zzg(zzf("click"));
        }
    }

    public final void zza(zze zze2) {
        zze zze3;
        if (this.zzh) {
            zzdwg zzf2 = zzf("ifts");
            zzf2.zzb(IronSourceConstants.EVENTS_ERROR_REASON, "adapter");
            int i = zze2.zza;
            String str = zze2.zzb;
            if (zze2.zzc.equals(MobileAds.ERROR_DOMAIN) && (zze3 = zze2.zzd) != null && !zze3.zzc.equals(MobileAds.ERROR_DOMAIN)) {
                zze zze4 = zze2.zzd;
                i = zze4.zza;
                str = zze4.zzb;
            }
            if (i >= 0) {
                zzf2.zzb("arec", String.valueOf(i));
            }
            String zza2 = this.zzb.zza(str);
            if (zza2 != null) {
                zzf2.zzb("areec", zza2);
            }
            zzf2.zzg();
        }
    }

    public final void zzb() {
        if (this.zzh) {
            zzdwg zzf2 = zzf("ifts");
            zzf2.zzb(IronSourceConstants.EVENTS_ERROR_REASON, "blocked");
            zzf2.zzg();
        }
    }

    public final void zzc() {
        if (zzh()) {
            zzf("adapter_shown").zzg();
        }
    }

    public final void zzd() {
        if (zzh()) {
            zzf("adapter_impression").zzg();
        }
    }

    public final void zze(zzdlf zzdlf) {
        if (this.zzh) {
            zzdwg zzf2 = zzf("ifts");
            zzf2.zzb(IronSourceConstants.EVENTS_ERROR_REASON, "exception");
            if (!TextUtils.isEmpty(zzdlf.getMessage())) {
                zzf2.zzb("msg", zzdlf.getMessage());
            }
            zzf2.zzg();
        }
    }

    public final void zzl() {
        if (zzh() || this.zze.zzak) {
            zzg(zzf("impression"));
        }
    }
}
