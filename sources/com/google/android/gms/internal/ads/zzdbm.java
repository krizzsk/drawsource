package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdg;
import com.google.android.gms.ads.internal.client.zzu;
import com.google.android.gms.ads.internal.zzt;
import java.util.List;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzdbm extends zzdg {
    private final String zza;
    private final String zzb;
    private final String zzc;
    private final List zzd;
    private final long zze;
    private final String zzf;
    private final zzefi zzg;
    private final Bundle zzh;

    public zzdbm(zzfbl zzfbl, String str, zzefi zzefi, zzfbo zzfbo) {
        String str2;
        String str3;
        String str4 = null;
        if (zzfbl == null) {
            str2 = null;
        } else {
            str2 = zzfbl.zzac;
        }
        this.zzb = str2;
        if (zzfbo == null) {
            str3 = null;
        } else {
            str3 = zzfbo.zzb;
        }
        this.zzc = str3;
        if ("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) {
            try {
                str4 = zzfbl.zzw.getString("class_name");
            } catch (JSONException unused) {
            }
        }
        this.zza = str4 != null ? str4 : str;
        this.zzd = zzefi.zzc();
        this.zzg = zzefi;
        this.zze = zzt.zzA().currentTimeMillis() / 1000;
        if (!((Boolean) zzay.zzc().zzb(zzbhz.zzfN)).booleanValue() || zzfbo == null) {
            this.zzh = new Bundle();
        } else {
            this.zzh = zzfbo.zzj;
        }
        this.zzf = (!((Boolean) zzay.zzc().zzb(zzbhz.zzhM)).booleanValue() || zzfbo == null || TextUtils.isEmpty(zzfbo.zzh)) ? "" : zzfbo.zzh;
    }

    public final long zzc() {
        return this.zze;
    }

    public final String zzd() {
        return this.zzf;
    }

    public final Bundle zze() {
        return this.zzh;
    }

    public final zzu zzf() {
        zzefi zzefi = this.zzg;
        if (zzefi != null) {
            return zzefi.zza();
        }
        return null;
    }

    public final String zzg() {
        return this.zza;
    }

    public final String zzh() {
        return this.zzb;
    }

    public final List zzi() {
        return this.zzd;
    }

    public final String zzj() {
        return this.zzc;
    }
}
