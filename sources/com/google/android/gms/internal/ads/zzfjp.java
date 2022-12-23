package com.google.android.gms.internal.ads;

import android.os.Build;
import android.webkit.WebView;
import com.amazon.aps.shared.APSAnalytics;
import com.tapjoy.TapjoyConstants;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public class zzfjp {
    private zzfkn zza = new zzfkn((WebView) null);
    private long zzb;
    private int zzc;

    public zzfjp() {
        zzb();
    }

    public final WebView zza() {
        return (WebView) this.zza.get();
    }

    public final void zzb() {
        this.zzb = System.nanoTime();
        this.zzc = 1;
    }

    public void zzc() {
        this.zza.clear();
    }

    public final void zzd(String str, long j) {
        if (j >= this.zzb && this.zzc != 3) {
            this.zzc = 3;
            zzfji.zza().zzf(zza(), str);
        }
    }

    public final void zze(String str, long j) {
        if (j >= this.zzb) {
            this.zzc = 2;
            zzfji.zza().zzf(zza(), str);
        }
    }

    public void zzf(zzfir zzfir, zzfip zzfip) {
        zzg(zzfir, zzfip, (JSONObject) null);
    }

    /* access modifiers changed from: protected */
    public final void zzg(zzfir zzfir, zzfip zzfip, JSONObject jSONObject) {
        String zzh = zzfir.zzh();
        JSONObject jSONObject2 = new JSONObject();
        zzfjt.zzg(jSONObject2, "environment", TapjoyConstants.TJC_APP_PLACEMENT);
        zzfjt.zzg(jSONObject2, "adSessionType", zzfip.zzd());
        JSONObject jSONObject3 = new JSONObject();
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        zzfjt.zzg(jSONObject3, "deviceType", str + "; " + str2);
        zzfjt.zzg(jSONObject3, "osVersion", Integer.toString(Build.VERSION.SDK_INT));
        zzfjt.zzg(jSONObject3, "os", APSAnalytics.OS_NAME);
        zzfjt.zzg(jSONObject2, "deviceInfo", jSONObject3);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        zzfjt.zzg(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject4 = new JSONObject();
        zzfjt.zzg(jSONObject4, "partnerName", zzfip.zze().zzb());
        zzfjt.zzg(jSONObject4, "partnerVersion", zzfip.zze().zzc());
        zzfjt.zzg(jSONObject2, "omidNativeInfo", jSONObject4);
        JSONObject jSONObject5 = new JSONObject();
        zzfjt.zzg(jSONObject5, "libraryVersion", "1.3.3-google_20200416");
        zzfjt.zzg(jSONObject5, "appId", zzfjg.zzb().zza().getApplicationContext().getPackageName());
        zzfjt.zzg(jSONObject2, TapjoyConstants.TJC_APP_PLACEMENT, jSONObject5);
        if (zzfip.zzf() != null) {
            zzfjt.zzg(jSONObject2, "contentUrl", zzfip.zzf());
        }
        zzfjt.zzg(jSONObject2, "customReferenceData", zzfip.zzg());
        JSONObject jSONObject6 = new JSONObject();
        Iterator it = zzfip.zzh().iterator();
        if (!it.hasNext()) {
            zzfji.zza().zzg(zza(), zzh, jSONObject2, jSONObject6, jSONObject);
        } else {
            zzfix zzfix = (zzfix) it.next();
            throw null;
        }
    }

    public final void zzh(float f) {
        zzfji.zza().zze(zza(), f);
    }

    /* access modifiers changed from: package-private */
    public final void zzi(WebView webView) {
        this.zza = new zzfkn(webView);
    }

    public void zzj() {
    }

    public final boolean zzk() {
        return this.zza.get() != null;
    }
}
