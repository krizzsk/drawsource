package com.inmobi.media;

import android.content.Context;
import android.os.Build;
import android.webkit.WebView;
import com.inmobi.media.C6094fv;
import com.mbridge.msdk.foundation.entity.CampaignUnit;

/* renamed from: com.inmobi.media.y */
/* compiled from: EmbeddedBrowserWebView */
public final class C6327y extends WebView {

    /* renamed from: a */
    private C5702ab f16007a;

    public C6327y(Context context) {
        super(context);
        if (Build.VERSION.SDK_INT >= 16) {
            setImportantForAccessibility(2);
        }
        getSettings().setJavaScriptEnabled(true);
        setVerticalScrollBarEnabled(false);
        setHorizontalScrollBarEnabled(false);
        if (Build.VERSION.SDK_INT >= 17) {
            getSettings().setMediaPlaybackRequiresUserGesture(false);
        }
        C5702ab abVar = new C5702ab();
        this.f16007a = abVar;
        abVar.f14319b = ((C6074ft) C6094fv.m18084a(CampaignUnit.JSON_KEY_ADS, C6183hw.m18332f(), (C6094fv.C6097c) null)).rendering.otherNetworkLoadsLimit;
        setWebViewClient(this.f16007a);
    }

    public final void loadUrl(String str) {
        super.loadUrl(str);
        this.f16007a.f14320c = true;
    }

    public final void loadData(String str, String str2, String str3) {
        super.loadData(str, str2, str3);
        this.f16007a.f14320c = true;
    }
}
