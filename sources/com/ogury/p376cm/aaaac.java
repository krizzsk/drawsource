package com.ogury.p376cm;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;
import com.ogury.core.OguryError;
import com.ogury.p376cm.ConsentActivity;
import com.ogury.p376cm.internal.aabca;
import com.ogury.p376cm.internal.ababa;
import com.ogury.p376cm.internal.ababb;
import com.ogury.p376cm.internal.abbba;
import com.ogury.p376cm.internal.abbbb;
import com.ogury.p376cm.internal.abbbc;
import com.ogury.p376cm.internal.baaba;
import com.ogury.p376cm.internal.babca;
import com.ogury.p376cm.internal.bbabc;
import com.ogury.p376cm.internal.bbacb;
import com.ogury.p376cm.internal.bbcbc;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ogury.cm.aaaac */
public final class aaaac {

    /* renamed from: a */
    public static final aaaac f24147a = new aaaac();

    /* renamed from: b */
    private static abbbb f24148b;

    /* renamed from: c */
    private static aaaaa f24149c;

    /* renamed from: d */
    private static WebView f24150d;

    /* renamed from: e */
    private static final Handler f24151e = new Handler(Looper.getMainLooper());

    /* renamed from: com.ogury.cm.aaaac$aaaaa */
    public static final class aaaaa implements abbbb {

        /* renamed from: a */
        final /* synthetic */ bbacb.aaaaa f24152a;

        /* renamed from: b */
        final /* synthetic */ bbacb.aaaaa f24153b;

        /* renamed from: c */
        final /* synthetic */ Context f24154c;

        aaaaa(bbacb.aaaaa aaaaa, bbacb.aaaaa aaaaa2, Context context) {
            this.f24152a = aaaaa;
            this.f24153b = aaaaa2;
            this.f24154c = context;
        }

        /* renamed from: a */
        public final void mo63770a(OguryError oguryError) {
            bbabc.m28052b(oguryError, "error");
            aaaac aaaac = aaaac.f24147a;
            aaaac.m27653d().removeCallbacksAndMessages((Object) null);
            aaaac aaaac2 = aaaac.f24147a;
            abbbb a = aaaac.m27641a();
            if (a != null) {
                a.mo63770a(oguryError);
            }
        }

        /* renamed from: a */
        public final void mo63771a(String str) {
            bbabc.m28052b(str, "response");
            if (bbabc.m28051a((Object) str, (Object) "ready")) {
                this.f24152a.f24527a = true;
                aaaac aaaac = aaaac.f24147a;
                boolean z = this.f24153b.f24527a;
                aaaac aaaac2 = aaaac.f24147a;
                aaaac.m27650a(z, aaaac.m27641a(), 15000);
            } else if (bbabc.m28051a((Object) str, (Object) "success")) {
                this.f24153b.f24527a = true;
                aaaac.m27645a(aaaac.f24147a, this.f24154c);
                aaaac aaaac3 = aaaac.f24147a;
                aaaac.m27653d().removeCallbacksAndMessages((Object) null);
            } else if (bbcbc.m28090a(str, "parsedConfig=", false, 2, (Object) null)) {
                aaaac.m27646a(aaaac.f24147a, this.f24154c, str);
                aabca aabca = aabca.f24267a;
                aabca.m27763a("ANSWERED");
            }
        }
    }

    /* renamed from: com.ogury.cm.aaaac$aaaab */
    public static final class aaaab implements ababa {

        /* renamed from: a */
        final /* synthetic */ Context f24155a;

        /* renamed from: b */
        final /* synthetic */ String f24156b;

        /* renamed from: com.ogury.cm.aaaac$aaaab$aaaaa */
        static final class aaaaa implements Runnable {

            /* renamed from: a */
            final /* synthetic */ aaaab f24157a;

            /* renamed from: b */
            final /* synthetic */ String f24158b;

            aaaaa(aaaab aaaab, String str) {
                this.f24157a = aaaab;
                this.f24158b = str;
            }

            public final void run() {
                abbba abbba = abbba.f24320a;
                abbba.m27836e(this.f24158b);
                abbba abbba2 = abbba.f24320a;
                abbba.m27833d().mo63910a(this.f24157a.f24155a);
                abbba abbba3 = abbba.f24320a;
                abbba.m27835e().mo63920a(this.f24157a.f24155a, "");
                aabca aabca = aabca.f24267a;
                aabca.m27761a();
                aaaac aaaac = aaaac.f24147a;
                abbbb a = aaaac.m27641a();
                if (a != null) {
                    a.mo63771a(this.f24157a.f24156b);
                }
            }
        }

        aaaab(Context context, String str) {
            this.f24155a = context;
            this.f24156b = str;
        }

        /* renamed from: a */
        public final void mo63772a(String str) {
            bbabc.m28052b(str, "aaid");
            new Handler(Looper.getMainLooper()).post(new aaaaa(this, str));
        }
    }

    /* renamed from: com.ogury.cm.aaaac$aaaac  reason: collision with other inner class name */
    static final class C12656aaaac implements Runnable {

        /* renamed from: a */
        final /* synthetic */ boolean f24159a;

        /* renamed from: b */
        final /* synthetic */ abbbb f24160b;

        C12656aaaac(boolean z, abbbb abbbb) {
            this.f24159a = z;
            this.f24160b = abbbb;
        }

        public final void run() {
            if (!this.f24159a) {
                aaaac.m27649a(this.f24160b, new OguryError(1002, "Timeout error"));
            }
        }
    }

    private aaaac() {
    }

    /* renamed from: a */
    public static abbbb m27641a() {
        return f24148b;
    }

    /* renamed from: a */
    public static void m27642a(Context context, abbbb abbbb) {
        bbabc.m28052b(context, "context");
        bbabc.m28052b(abbbb, "callback");
        baaba.f24478a.queryProductDetails();
        f24148b = abbbb;
        bbacb.aaaaa aaaaa2 = new bbacb.aaaaa();
        aaaaa2.f24527a = false;
        bbacb.aaaaa aaaaa3 = new bbacb.aaaaa();
        aaaaa3.f24527a = false;
        try {
            WebView webView = new WebView(context.getApplicationContext(), (AttributeSet) null);
            f24150d = webView;
            WebSettings settings = webView.getSettings();
            if (settings != null) {
                settings.setJavaScriptEnabled(true);
            }
            WebView webView2 = f24150d;
            if (webView2 != null) {
                webView2.setBackgroundColor(0);
            }
            WebView webView3 = f24150d;
            if (webView3 != null) {
                webView3.setLayerType(1, (Paint) null);
            }
            aaaaa aaaaa4 = new aaaaa(context, new aaaaa(aaaaa2, aaaaa3, context));
            f24149c = aaaaa4;
            WebView webView4 = f24150d;
            if (webView4 != null) {
                webView4.setWebViewClient(aaaaa4);
            }
            m27650a(aaaaa2.f24527a, abbbb, (long) SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US);
            WebView webView5 = f24150d;
            if (webView5 != null) {
                StringBuilder sb = new StringBuilder("https://consent-form.ogury.co");
                abbba abbba = abbba.f24320a;
                sb.append(abbba.m27839g().mo63852c());
                sb.append("?assetType=android");
                webView5.loadUrl(sb.toString());
            }
        } catch (Exception unused) {
            abbbc abbbc = abbbc.f24336a;
            abbbc.m27857b("Cannot create WebView");
            m27649a(f24148b, new OguryError(4, "Cannot create WebView"));
        }
    }

    /* renamed from: a */
    public static void m27643a(WebView webView) {
        f24150d = null;
    }

    /* renamed from: a */
    public static void m27644a(aaaaa aaaaa2) {
        f24149c = null;
    }

    /* renamed from: a */
    public static final /* synthetic */ void m27645a(aaaac aaaac, Context context) {
        Object systemService = context.getSystemService("activity");
        if (systemService != null) {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) systemService).getRunningAppProcesses();
            boolean z = false;
            if (runningAppProcesses != null) {
                String packageName = context.getPackageName();
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.importance == 100 && bbabc.m28051a((Object) next.processName, (Object) packageName)) {
                        break;
                    }
                }
            }
            if (!z) {
                ConsentActivity.aaaaa aaaaa2 = ConsentActivity.f24131a;
                bbabc.m28052b(context, "context");
                context.startActivity(new Intent(context, ConsentActivity.class));
                return;
            }
            m27649a(f24148b, new OguryError(4, "App in background"));
            return;
        }
        throw new babca("null cannot be cast to non-null type android.app.ActivityManager");
    }

    /* renamed from: a */
    public static final /* synthetic */ void m27646a(aaaac aaaac, Context context, String str) {
        if (str != null) {
            String substring = str.substring(13);
            bbabc.m28049a((Object) substring, "(this as java.lang.String).substring(startIndex)");
            ababb ababb = ababb.f24305a;
            ababb.m27807a(context, new aaaab(context, substring));
            return;
        }
        throw new babca("null cannot be cast to non-null type java.lang.String");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m27649a(abbbb abbbb, OguryError oguryError) {
        f24150d = null;
        f24149c = null;
        if (abbbb != null) {
            abbbb.mo63770a(oguryError);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static void m27650a(boolean z, abbbb abbbb, long j) {
        f24151e.postDelayed(new C12656aaaac(z, abbbb), j);
    }

    /* renamed from: b */
    public static aaaaa m27651b() {
        return f24149c;
    }

    /* renamed from: c */
    public static WebView m27652c() {
        return f24150d;
    }

    /* renamed from: d */
    public static Handler m27653d() {
        return f24151e;
    }
}
