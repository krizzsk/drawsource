package com.unity3d.services.core.webview;

import android.os.Build;
import android.os.ConditionVariable;
import android.os.Looper;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.unity3d.services.ads.api.AdUnit;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.configuration.InitializeThread;
import com.unity3d.services.core.log.C12065a;
import com.unity3d.services.core.misc.C12080j;
import com.unity3d.services.core.misc.C12081k;
import com.unity3d.services.core.properties.C12084a;
import com.unity3d.services.core.properties.C12088d;
import com.unity3d.services.core.request.metrics.C12120i;
import com.unity3d.services.core.webview.bridge.C12144a;
import com.unity3d.services.core.webview.bridge.C12145b;
import com.unity3d.services.core.webview.bridge.C12148e;
import com.unity3d.services.core.webview.bridge.C12149f;
import com.unity3d.services.core.webview.bridge.C12150g;
import com.vungle.warren.model.Advertisement;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: com.unity3d.services.core.webview.a */
/* compiled from: WebViewApp */
public class C12136a implements C12145b {

    /* renamed from: a */
    private static C12136a f29618a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static ConditionVariable f29619b;

    /* renamed from: c */
    private static AtomicReference<Boolean> f29620c = new AtomicReference<>(Boolean.FALSE);

    /* renamed from: d */
    private static AtomicReference<String> f29621d = new AtomicReference<>();

    /* renamed from: e */
    private static AtomicReference<Integer> f29622e = new AtomicReference<>();

    /* renamed from: f */
    private boolean f29623f;

    /* renamed from: g */
    private WebView f29624g;

    /* renamed from: h */
    private Configuration f29625h;

    /* renamed from: i */
    private HashMap<String, C12149f> f29626i;

    /* renamed from: com.unity3d.services.core.webview.a$a */
    /* compiled from: WebViewApp */
    static class C12137a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Configuration f29627a;

        C12137a(Configuration configuration) {
            this.f29627a = configuration;
        }

        public void run() {
            try {
                Configuration configuration = this.f29627a;
                C12136a aVar = new C12136a(configuration, configuration.getExperiments().isWebAssetAdCaching(), (C12137a) null);
                String a = new C12162c(Advertisement.FILE_SCHEME + C12088d.m32940m(), this.f29627a).mo71354a();
                if (a == null) {
                    String str = "?platform=android";
                    try {
                        if (this.f29627a.getWebViewUrl() != null) {
                            str = str + "&origin=" + URLEncoder.encode(this.f29627a.getWebViewUrl(), "UTF-8");
                        }
                    } catch (UnsupportedEncodingException e) {
                        C12065a.m32842a("Unsupported charset when encoding origin url", (Exception) e);
                    }
                    try {
                        if (this.f29627a.getWebViewVersion() != null) {
                            str = str + "&version=" + URLEncoder.encode(this.f29627a.getWebViewVersion(), "UTF-8");
                        }
                    } catch (UnsupportedEncodingException e2) {
                        C12065a.m32842a("Unsupported charset when encoding webview version", (Exception) e2);
                    }
                    aVar.mo71319g().loadDataWithBaseURL(Advertisement.FILE_SCHEME + C12088d.m32940m() + str, this.f29627a.getWebViewData(), "text/html", "UTF-8", (String) null);
                } else {
                    aVar.mo71319g().loadDataWithBaseURL(a, this.f29627a.getWebViewData(), "text/html", "UTF-8", (String) null);
                }
                C12136a.m33101a(aVar);
            } catch (Exception unused) {
                C12065a.m32848c("Couldn't construct WebViewApp");
                C12136a.f29619b.open();
            }
        }
    }

    /* renamed from: com.unity3d.services.core.webview.a$b */
    /* compiled from: WebViewApp */
    static class C12138b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Configuration f29628a;

        C12138b(Configuration configuration) {
            this.f29628a = configuration;
        }

        public void run() {
            try {
                C12136a aVar = new C12136a(this.f29628a, true, (C12137a) null);
                aVar.mo71319g().loadUrl(new C12162c(this.f29628a.getWebViewUrl(), this.f29628a).mo71354a());
                C12136a.m33101a(aVar);
            } catch (Exception unused) {
                C12065a.m32848c("Couldn't construct WebViewApp");
                C12136a.f29619b.open();
            }
        }
    }

    /* renamed from: com.unity3d.services.core.webview.a$c */
    /* compiled from: WebViewApp */
    private class C12139c extends WebChromeClient {
        private C12139c() {
        }

        public void onConsoleMessage(String str, int i, String str2) {
            File file;
            try {
                file = new File(str2);
            } catch (Exception e) {
                C12065a.m32842a("Could not handle sourceId", e);
                file = null;
            }
            if (file != null) {
                str2 = file.getName();
            }
            if (Build.VERSION.SDK_INT < 19) {
                C12065a.m32845b("JavaScript (sourceId=" + str2 + ", line=" + i + "): " + str);
            }
        }

        /* synthetic */ C12139c(C12136a aVar, C12137a aVar2) {
            this();
        }
    }

    /* renamed from: com.unity3d.services.core.webview.a$d */
    /* compiled from: WebViewApp */
    private class C12140d extends WebViewClient {

        /* renamed from: com.unity3d.services.core.webview.a$d$a */
        /* compiled from: WebViewApp */
        class C12141a implements Runnable {
            C12141a() {
            }

            public void run() {
                if (AdUnit.getAdUnitActivity() != null) {
                    AdUnit.getAdUnitActivity().finish();
                }
                if (!(C12136a.m33103c() == null || C12136a.m33103c().mo71319g() == null)) {
                    C12081k.m32885a(C12136a.m33103c().mo71319g());
                }
                InitializeThread.reset();
            }
        }

        /* renamed from: com.unity3d.services.core.webview.a$d$b */
        /* compiled from: WebViewApp */
        class C12142b extends HashMap<String, String> {

            /* renamed from: a */
            final /* synthetic */ RenderProcessGoneDetail f29632a;

            C12142b(RenderProcessGoneDetail renderProcessGoneDetail) {
                this.f29632a = renderProcessGoneDetail;
                if (Build.VERSION.SDK_INT >= 26) {
                    put("dc", "" + renderProcessGoneDetail.didCrash());
                    put("pae", "" + renderProcessGoneDetail.rendererPriorityAtExit());
                }
            }
        }

        private C12140d() {
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            C12065a.m32845b("onPageFinished url: " + str);
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            if (webView != null) {
                C12065a.m32848c("WEBVIEW_ERROR: " + webView.toString());
            }
            if (webResourceRequest != null) {
                C12065a.m32848c("WEBVIEW_ERROR: " + webResourceRequest.toString());
            }
            if (webResourceError != null) {
                C12065a.m32848c("WEBVIEW_ERROR: " + webResourceError.toString());
            }
        }

        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            C12080j.m32879a((Runnable) new C12141a());
            C12065a.m32848c("UnityAds Sdk WebView onRenderProcessGone : " + renderProcessGoneDetail.toString());
            C12120i.m33045a().mo71267a("native_webview_render_process_gone", new C12142b(renderProcessGoneDetail));
            return true;
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            C12065a.m32845b("Trying to load url: " + str);
            return false;
        }

        /* synthetic */ C12140d(C12136a aVar, C12137a aVar2) {
            this();
        }
    }

    /* synthetic */ C12136a(Configuration configuration, boolean z, C12137a aVar) {
        this(configuration, z);
    }

    /* renamed from: c */
    public static C12136a m33103c() {
        return f29618a;
    }

    /* renamed from: d */
    private ErrorState m33104d() {
        int e = mo71317e();
        if (e == 1) {
            return ErrorState.CreateWebviewGameIdDisabled;
        }
        if (e == 2) {
            return ErrorState.CreateWebviewConfigError;
        }
        if (e == 3) {
            return ErrorState.CreateWebviewInvalidArgument;
        }
        return ErrorState.CreateWebview;
    }

    /* renamed from: b */
    public void mo71316b(boolean z) {
        this.f29623f = z;
    }

    /* renamed from: e */
    public int mo71317e() {
        return f29622e.get().intValue();
    }

    /* renamed from: f */
    public String mo71318f() {
        return f29621d.get();
    }

    /* renamed from: g */
    public WebView mo71319g() {
        return this.f29624g;
    }

    /* renamed from: h */
    public boolean mo71320h() {
        return f29620c.get().booleanValue();
    }

    /* renamed from: i */
    public boolean mo71321i() {
        return this.f29623f;
    }

    /* renamed from: j */
    public void mo71322j() {
        this.f29623f = false;
        f29622e.set(-1);
        f29621d.set("");
        f29620c.set(Boolean.FALSE);
    }

    private C12136a(Configuration configuration, boolean z) {
        this.f29623f = false;
        mo71313b(configuration);
        C12150g.m33138a(mo71312b().getWebAppApiClassList());
        WebView dVar = z ? new C12163d(C12084a.m32908e()) : new WebView(C12084a.m32908e());
        this.f29624g = dVar;
        dVar.setWebViewClient(new C12140d(this, (C12137a) null));
        this.f29624g.setWebChromeClient(new C12139c(this, (C12137a) null));
    }

    /* renamed from: a */
    public void mo71305a(int i) {
        f29622e.set(Integer.valueOf(i));
    }

    /* renamed from: b */
    public void mo71315b(String str) {
        f29621d.set(str);
    }

    /* renamed from: a */
    public void mo71308a(boolean z) {
        f29620c.set(Boolean.valueOf(z));
        f29619b.open();
    }

    /* renamed from: b */
    public Configuration mo71312b() {
        return this.f29625h;
    }

    /* renamed from: b */
    public void mo71313b(Configuration configuration) {
        this.f29625h = configuration;
    }

    /* renamed from: b */
    private void m33102b(String str, String str2, JSONArray jSONArray) throws JSONException {
        String a = m33100a(str, str2, jSONArray);
        C12065a.m32843a("Invoking javascript: %s", a);
        mo71319g().mo71301a(a);
    }

    /* renamed from: a */
    public void mo71306a(WebView webView) {
        this.f29624g = webView;
    }

    /* renamed from: a */
    private String m33100a(String str, String str2, JSONArray jSONArray) throws JSONException {
        String jSONArray2 = jSONArray.toString();
        StringBuilder sb = new StringBuilder(str.length() + 22 + str2.length() + jSONArray2.length());
        sb.append("javascript:window.");
        sb.append(str);
        sb.append(".");
        sb.append(str2);
        sb.append("(");
        sb.append(jSONArray2);
        sb.append(");");
        return sb.toString();
    }

    /* renamed from: b */
    public void mo71314b(C12149f fVar) {
        HashMap<String, C12149f> hashMap = this.f29626i;
        if (hashMap != null) {
            synchronized (hashMap) {
                this.f29626i.remove(fVar.mo71337a());
            }
        }
    }

    /* renamed from: a */
    public boolean mo71310a(Enum enumR, Enum enumR2, Object... objArr) {
        if (!mo71321i()) {
            C12065a.m32845b("sendEvent ignored because web app is not loaded");
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(enumR.name());
        jSONArray.put(enumR2.name());
        for (Object put : objArr) {
            jSONArray.put(put);
        }
        try {
            m33102b("nativebridge", "handleEvent", jSONArray);
            return true;
        } catch (Exception e) {
            C12065a.m32842a("Error while sending event to WebView", e);
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo71311a(String str, String str2, Method method, Object... objArr) {
        if (!mo71321i()) {
            C12065a.m32845b("invokeMethod ignored because web app is not loaded");
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(str);
        jSONArray.put(str2);
        if (method != null) {
            C12149f fVar = new C12149f(method);
            mo71307a(fVar);
            jSONArray.put(fVar.mo71337a());
        } else {
            jSONArray.put((Object) null);
        }
        if (objArr != null) {
            for (Object put : objArr) {
                jSONArray.put(put);
            }
        }
        try {
            m33102b("nativebridge", "handleInvocation", jSONArray);
            return true;
        } catch (Exception e) {
            C12065a.m32842a("Error invoking javascript method", e);
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo71309a(C12148e eVar) {
        if (!mo71321i()) {
            C12065a.m32845b("invokeBatchCallback ignored because web app is not loaded");
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        ArrayList<ArrayList<Object>> b = eVar.mo71334b();
        if (b != null && !b.isEmpty()) {
            Iterator<ArrayList<Object>> it = b.iterator();
            while (it.hasNext()) {
                ArrayList next = it.next();
                Enum enumR = (Enum) next.get(1);
                Object[] objArr = (Object[]) next.get(2);
                Object[] copyOfRange = Arrays.copyOfRange(objArr, 1, objArr.length);
                ArrayList arrayList = new ArrayList();
                arrayList.add((String) objArr[0]);
                arrayList.add(((C12144a) next.get(0)).toString());
                JSONArray jSONArray2 = new JSONArray();
                if (enumR != null) {
                    jSONArray2.put(enumR.name());
                }
                for (Object put : copyOfRange) {
                    jSONArray2.put(put);
                }
                arrayList.add(jSONArray2);
                JSONArray jSONArray3 = new JSONArray();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    jSONArray3.put(it2.next());
                }
                jSONArray.put(jSONArray3);
            }
        }
        try {
            m33102b("nativebridge", "handleCallback", jSONArray);
        } catch (Exception e) {
            C12065a.m32842a("Error while invoking batch response for WebView", e);
        }
        return true;
    }

    /* renamed from: a */
    public void mo71307a(C12149f fVar) {
        if (this.f29626i == null) {
            this.f29626i = new HashMap<>();
        }
        synchronized (this.f29626i) {
            this.f29626i.put(fVar.mo71337a(), fVar);
        }
    }

    /* renamed from: a */
    public C12149f mo71304a(String str) {
        C12149f fVar;
        synchronized (this.f29626i) {
            fVar = this.f29626i.get(str);
        }
        return fVar;
    }

    /* renamed from: a */
    public static void m33101a(C12136a aVar) {
        f29618a = aVar;
    }

    /* renamed from: a */
    public static ErrorState m33099a(Configuration configuration, boolean z) throws IllegalThreadStateException {
        C12065a.m32839a();
        if (z) {
            return m33098a(configuration);
        }
        if (!Thread.currentThread().equals(Looper.getMainLooper().getThread())) {
            C12080j.m32879a((Runnable) new C12137a(configuration));
            ConditionVariable conditionVariable = new ConditionVariable();
            f29619b = conditionVariable;
            boolean block = conditionVariable.block(configuration.getWebViewAppCreateTimeout());
            boolean z2 = true;
            boolean z3 = m33103c() != null;
            boolean z4 = z3 && m33103c().mo71320h();
            if (!block || !z3 || !z4) {
                z2 = false;
            }
            if (z2) {
                return null;
            }
            if (!block) {
                return ErrorState.CreateWebviewTimeout;
            }
            return m33103c().m33104d();
        }
        throw new IllegalThreadStateException("Cannot call create() from main thread!");
    }

    /* renamed from: a */
    private static ErrorState m33098a(Configuration configuration) {
        if (!Thread.currentThread().equals(Looper.getMainLooper().getThread())) {
            C12080j.m32879a((Runnable) new C12138b(configuration));
            ConditionVariable conditionVariable = new ConditionVariable();
            f29619b = conditionVariable;
            boolean block = conditionVariable.block(configuration.getWebViewAppCreateTimeout());
            boolean z = true;
            boolean z2 = m33103c() != null;
            boolean z3 = z2 && m33103c().mo71320h();
            if (!block || !z2 || !z3) {
                z = false;
            }
            if (z) {
                return null;
            }
            if (!block) {
                return ErrorState.CreateWebviewTimeout;
            }
            return m33103c().m33104d();
        }
        throw new IllegalThreadStateException("Cannot call create() from main thread!");
    }
}
