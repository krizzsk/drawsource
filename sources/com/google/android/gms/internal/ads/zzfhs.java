package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import com.smaato.sdk.core.api.VideoType;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfhs implements Runnable {
    private final List zza = new ArrayList();
    private final zzfhu zzb;
    private String zzc;
    private String zzd;
    private zzfbw zze;
    private zze zzf;
    private Future zzg;
    private int zzh = 2;

    zzfhs(zzfhu zzfhu) {
        this.zzb = zzfhu;
    }

    public final synchronized void run() {
        zzg();
    }

    public final synchronized zzfhs zza(zzfhh zzfhh) {
        if (((Boolean) zzbji.zzc.zze()).booleanValue()) {
            List list = this.zza;
            zzfhh.zzg();
            list.add(zzfhh);
            Future future = this.zzg;
            if (future != null) {
                future.cancel(false);
            }
            this.zzg = zzcfv.zzd.schedule(this, (long) ((Integer) zzay.zzc().zzb(zzbhz.zzhq)).intValue(), TimeUnit.MILLISECONDS);
        }
        return this;
    }

    public final synchronized zzfhs zzb(String str) {
        if (((Boolean) zzbji.zzc.zze()).booleanValue() && zzfhr.zze(str)) {
            this.zzc = str;
        }
        return this;
    }

    public final synchronized zzfhs zzc(zze zze2) {
        if (((Boolean) zzbji.zzc.zze()).booleanValue()) {
            this.zzf = zze2;
        }
        return this;
    }

    public final synchronized zzfhs zzd(ArrayList arrayList) {
        if (((Boolean) zzbji.zzc.zze()).booleanValue()) {
            if (!arrayList.contains("banner")) {
                if (!arrayList.contains(AdFormat.BANNER.name())) {
                    if (!arrayList.contains("interstitial")) {
                        if (!arrayList.contains(AdFormat.INTERSTITIAL.name())) {
                            if (!arrayList.contains("native")) {
                                if (!arrayList.contains(AdFormat.NATIVE.name())) {
                                    if (!arrayList.contains(VideoType.REWARDED)) {
                                        if (!arrayList.contains(AdFormat.REWARDED.name())) {
                                            if (arrayList.contains("app_open_ad")) {
                                                this.zzh = 7;
                                            } else if (arrayList.contains("rewarded_interstitial") || arrayList.contains(AdFormat.REWARDED_INTERSTITIAL.name())) {
                                                this.zzh = 6;
                                            }
                                        }
                                    }
                                    this.zzh = 5;
                                }
                            }
                            this.zzh = 8;
                        }
                    }
                    this.zzh = 4;
                }
            }
            this.zzh = 3;
        }
        return this;
    }

    public final synchronized zzfhs zze(String str) {
        if (((Boolean) zzbji.zzc.zze()).booleanValue()) {
            this.zzd = str;
        }
        return this;
    }

    public final synchronized zzfhs zzf(zzfbw zzfbw) {
        if (((Boolean) zzbji.zzc.zze()).booleanValue()) {
            this.zze = zzfbw;
        }
        return this;
    }

    public final synchronized void zzg() {
        if (((Boolean) zzbji.zzc.zze()).booleanValue()) {
            Future future = this.zzg;
            if (future != null) {
                future.cancel(false);
            }
            for (zzfhh zzfhh : this.zza) {
                int i = this.zzh;
                if (i != 2) {
                    zzfhh.zzk(i);
                }
                if (!TextUtils.isEmpty(this.zzc)) {
                    zzfhh.zzd(this.zzc);
                }
                if (!TextUtils.isEmpty(this.zzd) && !zzfhh.zzi()) {
                    zzfhh.zzc(this.zzd);
                }
                zzfbw zzfbw = this.zze;
                if (zzfbw != null) {
                    zzfhh.zzb(zzfbw);
                } else {
                    zze zze2 = this.zzf;
                    if (zze2 != null) {
                        zzfhh.zza(zze2);
                    }
                }
                this.zzb.zzb(zzfhh.zzj());
            }
            this.zza.clear();
        }
    }

    public final synchronized zzfhs zzh(int i) {
        if (((Boolean) zzbji.zzc.zze()).booleanValue()) {
            this.zzh = i;
        }
        return this;
    }
}
