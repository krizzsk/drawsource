package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.text.TextUtils;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public final class zzfjs extends zzfjp {
    /* access modifiers changed from: private */
    public WebView zza;
    private Long zzb = null;
    private final Map zzc;

    public zzfjs(Map map, String str) {
        this.zzc = map;
    }

    public final void zzc() {
        long j;
        super.zzc();
        if (this.zzb == null) {
            j = 4000;
        } else {
            j = TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.zzb.longValue(), TimeUnit.NANOSECONDS);
        }
        new Handler().postDelayed(new zzfjr(this), Math.max(4000 - j, 2000));
        this.zza = null;
    }

    public final void zzf(zzfir zzfir, zzfip zzfip) {
        JSONObject jSONObject = new JSONObject();
        Map zzi = zzfip.zzi();
        for (String str : zzi.keySet()) {
            zzfjt.zzg(jSONObject, str, (zzfix) zzi.get(str));
        }
        zzg(zzfir, zzfip, jSONObject);
    }

    public final void zzj() {
        WebView webView = new WebView(zzfjg.zzb().zza());
        this.zza = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        zzi(this.zza);
        WebView webView2 = this.zza;
        if (webView2 != null && !TextUtils.isEmpty((CharSequence) null)) {
            webView2.loadUrl("javascript: null");
        }
        Iterator it = this.zzc.keySet().iterator();
        if (!it.hasNext()) {
            this.zzb = Long.valueOf(System.nanoTime());
            return;
        }
        zzfix zzfix = (zzfix) this.zzc.get((String) it.next());
        throw null;
    }
}
