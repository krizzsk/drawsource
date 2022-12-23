package com.mbridge.msdk.mbbanner.common.bridge;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.AdError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.click.p218b.C6782a;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C8660r;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.mbbanner.common.p324b.C8733a;
import com.mbridge.msdk.mbsignalcommon.mraid.C8871a;
import com.mbridge.msdk.mbsignalcommon.mraid.C8873b;
import com.mbridge.msdk.mbsignalcommon.p339b.C8853b;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.p078c.p080b.C2446a;
import com.tapjoy.TJAdUnitConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public class BannerExpandDialog extends Dialog {

    /* renamed from: a */
    private final String f21449a = "BannerExpandDialog";

    /* renamed from: b */
    private String f21450b;

    /* renamed from: c */
    private boolean f21451c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public FrameLayout f21452d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public WindVaneWebView f21453e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public TextView f21454f;

    /* renamed from: g */
    private String f21455g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public List<CampaignEx> f21456h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C8733a f21457i;

    /* renamed from: j */
    private C8873b f21458j = new C8873b() {
        public final void expand(String str, boolean z) {
        }

        public final CampaignEx getMraidCampaign() {
            return null;
        }

        public final void open(String str) {
            try {
                if (BannerExpandDialog.this.f21453e == null || System.currentTimeMillis() - BannerExpandDialog.this.f21453e.lastTouchTime <= ((long) C6782a.f17892c) || !C6782a.m20651a((CampaignEx) BannerExpandDialog.this.f21456h.get(0), BannerExpandDialog.this.f21453e.getUrl(), C6782a.f17890a)) {
                    C8672v.m24878d("BannerExpandDialog", str);
                    if (BannerExpandDialog.this.f21456h.size() > 1) {
                        C8388a.m23845e().mo56913g().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                        str = null;
                    }
                    if (BannerExpandDialog.this.f21457i != null) {
                        BannerExpandDialog.this.f21457i.mo58369a(true, str);
                    }
                }
            } catch (Throwable th) {
                C8672v.m24875a("BannerExpandDialog", "open", th);
            }
        }

        public final void close() {
            BannerExpandDialog.this.dismiss();
        }

        public final void unload() {
            close();
        }

        public final void useCustomClose(boolean z) {
            try {
                BannerExpandDialog.this.f21454f.setVisibility(z ? 4 : 0);
            } catch (Throwable th) {
                C8672v.m24875a("BannerExpandDialog", "useCustomClose", th);
            }
        }
    };

    public BannerExpandDialog(Context context, Bundle bundle, C8733a aVar) {
        super(context);
        if (bundle != null) {
            this.f21450b = bundle.getString("url");
            this.f21451c = bundle.getBoolean("shouldUseCustomClose");
        }
        this.f21457i = aVar;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setCanceledOnTouchOutside(false);
        setCancelable(true);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f21452d = frameLayout;
        frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        WindVaneWebView windVaneWebView = new WindVaneWebView(getContext().getApplicationContext());
        this.f21453e = windVaneWebView;
        windVaneWebView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.f21452d.addView(this.f21453e);
        TextView textView = new TextView(getContext());
        this.f21454f = textView;
        textView.setBackgroundColor(0);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(96, 96);
        layoutParams.gravity = 8388661;
        layoutParams.setMargins(30, 30, 30, 30);
        this.f21454f.setLayoutParams(layoutParams);
        this.f21454f.setVisibility(this.f21451c ? 4 : 0);
        this.f21454f.setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                BannerExpandDialog.this.dismiss();
            }
        });
        this.f21452d.addView(this.f21454f);
        setContentView(this.f21452d);
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().getDecorView().setPadding(0, 0, 0, 0);
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            getWindow().setAttributes(attributes);
            if (Build.VERSION.SDK_INT >= 16) {
                int i = 519;
                if (Build.VERSION.SDK_INT >= 19) {
                    i = 4615;
                }
                getWindow().getDecorView().setSystemUiVisibility(i);
            }
        }
        this.f21453e.setWebViewListener(new C8853b() {
            /* renamed from: a */
            public final void mo58279a(WebView webView, String str) {
                super.mo58279a(webView, str);
                StringBuilder sb = new StringBuilder("javascript:");
                sb.append(C2446a.m6038a().mo16297b());
                if (Build.VERSION.SDK_INT <= 19) {
                    webView.loadUrl(sb.toString());
                } else {
                    webView.evaluateJavascript(sb.toString(), new ValueCallback<String>() {
                        public final /* bridge */ /* synthetic */ void onReceiveValue(Object obj) {
                            String str = (String) obj;
                        }
                    });
                }
                BannerExpandDialog.m25189a(BannerExpandDialog.this);
            }
        });
        this.f21453e.setObject(this.f21458j);
        this.f21453e.loadUrl(this.f21450b);
        setOnDismissListener(new DialogInterface.OnDismissListener() {
            public final void onDismiss(DialogInterface dialogInterface) {
                if (BannerExpandDialog.this.f21457i != null) {
                    BannerExpandDialog.this.f21457i.mo58368a(false);
                }
                BannerExpandDialog.this.f21453e.loadDataWithBaseURL((String) null, "", "text/html", "utf-8", (String) null);
                BannerExpandDialog.this.f21452d.removeView(BannerExpandDialog.this.f21453e);
                BannerExpandDialog.this.f21453e.release();
                WindVaneWebView unused = BannerExpandDialog.this.f21453e = null;
                C8733a unused2 = BannerExpandDialog.this.f21457i = null;
            }
        });
    }

    public void setCampaignList(String str, List<CampaignEx> list) {
        this.f21455g = str;
        this.f21456h = list;
    }

    /* renamed from: a */
    static /* synthetic */ void m25189a(BannerExpandDialog bannerExpandDialog) {
        BannerExpandDialog bannerExpandDialog2 = bannerExpandDialog;
        try {
            int i = C8388a.m23845e().mo56913g().getResources().getConfiguration().orientation;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(TJAdUnitConstants.String.ORIENTATION, i == 2 ? "landscape" : i == 1 ? "portrait" : AdError.UNDEFINED_DOMAIN);
            jSONObject.put("locked", "true");
            HashMap k = C8660r.m24833k(C8388a.m23845e().mo56913g());
            int intValue = ((Integer) k.get("width")).intValue();
            int intValue2 = ((Integer) k.get("height")).intValue();
            HashMap hashMap = new HashMap();
            hashMap.put("placementType", IronSourceConstants.INTERSTITIAL_AD_UNIT);
            hashMap.put("state", "expanded");
            hashMap.put("viewable", "true");
            hashMap.put("currentAppOrientation", jSONObject);
            int[] iArr = new int[2];
            bannerExpandDialog2.f21453e.getLocationInWindow(iArr);
            C8871a.m25621a().mo58631a(bannerExpandDialog2.f21453e, (float) iArr[0], (float) iArr[1], (float) bannerExpandDialog2.f21453e.getWidth(), (float) bannerExpandDialog2.f21453e.getHeight());
            C8871a.m25621a().mo58636b(bannerExpandDialog2.f21453e, (float) iArr[0], (float) iArr[1], (float) bannerExpandDialog2.f21453e.getWidth(), (float) bannerExpandDialog2.f21453e.getHeight());
            C8871a.m25621a().mo58635b(bannerExpandDialog2.f21453e, (float) C8660r.m24829i(C8388a.m23845e().mo56913g()), (float) C8660r.m24831j(C8388a.m23845e().mo56913g()));
            C8871a.m25621a().mo58638c(bannerExpandDialog2.f21453e, (float) intValue, (float) intValue2);
            C8871a.m25621a().mo58634a((WebView) bannerExpandDialog2.f21453e, (Map<String, Object>) hashMap);
            C8871a.m25621a().mo58628a(bannerExpandDialog2.f21453e);
        } catch (Throwable th) {
            C8672v.m24875a("BannerExpandDialog", "notifyMraid", th);
        }
    }
}
