package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzeqb implements zzetg {
    private final Context zza;
    private final zzfvm zzb;

    zzeqb(Context context, zzfvm zzfvm) {
        this.zza = context;
        this.zzb = zzfvm;
    }

    public final int zza() {
        return 18;
    }

    public final zzfvl zzb() {
        return this.zzb.zzb(new zzepy(this));
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ zzeqa zzc() throws Exception {
        String str;
        Bundle bundle;
        zzt.zzp();
        Context context = this.zza;
        String str2 = "";
        if (!((Boolean) zzay.zzc().zzb(zzbhz.zzeZ)).booleanValue()) {
            str = str2;
        } else {
            str = context.getSharedPreferences("mobileads_consent", 0).getString("consent_string", str2);
        }
        if (((Boolean) zzay.zzc().zzb(zzbhz.zzfb)).booleanValue()) {
            str2 = this.zza.getSharedPreferences("mobileads_consent", 0).getString("fc_consent", str2);
        }
        zzt.zzp();
        Context context2 = this.zza;
        if (!((Boolean) zzay.zzc().zzb(zzbhz.zzfa)).booleanValue()) {
            bundle = null;
        } else {
            SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context2);
            bundle = new Bundle();
            if (defaultSharedPreferences.contains("IABConsent_CMPPresent")) {
                bundle.putBoolean("IABConsent_CMPPresent", defaultSharedPreferences.getBoolean("IABConsent_CMPPresent", false));
            }
            String[] strArr = {"IABConsent_SubjectToGDPR", "IABConsent_ConsentString", "IABConsent_ParsedPurposeConsents", "IABConsent_ParsedVendorConsents"};
            for (int i = 0; i < 4; i++) {
                String str3 = strArr[i];
                if (defaultSharedPreferences.contains(str3)) {
                    bundle.putString(str3, defaultSharedPreferences.getString(str3, (String) null));
                }
            }
        }
        return new zzeqa(str, str2, bundle, (zzepz) null);
    }
}
