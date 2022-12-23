package com.fyber.inneractive.sdk.web;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.global.C4251s;
import com.fyber.inneractive.sdk.config.global.features.C4228d;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.C4361j;
import com.fyber.inneractive.sdk.measurement.C4401a;
import com.fyber.inneractive.sdk.mraid.C4443a;
import com.fyber.inneractive.sdk.mraid.C4444a0;
import com.fyber.inneractive.sdk.mraid.C4450f;
import com.fyber.inneractive.sdk.mraid.C4463s;
import com.fyber.inneractive.sdk.mraid.C4464t;
import com.fyber.inneractive.sdk.mraid.C4465u;
import com.fyber.inneractive.sdk.mraid.C4466v;
import com.fyber.inneractive.sdk.mraid.C4468x;
import com.fyber.inneractive.sdk.mraid.C4469y;
import com.fyber.inneractive.sdk.network.C4492i0;
import com.fyber.inneractive.sdk.network.C4501m0;
import com.fyber.inneractive.sdk.network.C4521u;
import com.fyber.inneractive.sdk.p191ui.IAcloseButton;
import com.fyber.inneractive.sdk.p191ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.C5270f0;
import com.fyber.inneractive.sdk.util.C5292l;
import com.fyber.inneractive.sdk.util.C5299n;
import com.fyber.inneractive.sdk.util.C5306p0;
import com.fyber.inneractive.sdk.util.C5310r;
import com.fyber.inneractive.sdk.util.C5311r0;
import com.fyber.inneractive.sdk.util.C5312s;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C5338a;
import com.fyber.inneractive.sdk.web.C5349d.C5355f;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tapjoy.TJAdUnitConstants;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.web.d */
public abstract class C5349d<T extends C5355f> extends C5338a<T> {

    /* renamed from: X */
    public static final String[] f14118X = {"yyyy-MM-dd'T'HH:mm:ssZZZZZ", "yyyy-MM-dd'T'HH:mmZZZZZ"};

    /* renamed from: A */
    public final C5357h f14119A;

    /* renamed from: B */
    public C5356g f14120B;

    /* renamed from: C */
    public ViewGroup f14121C;

    /* renamed from: D */
    public C5347c f14122D;

    /* renamed from: E */
    public boolean f14123E = false;

    /* renamed from: F */
    public int f14124F;

    /* renamed from: G */
    public C5349d<T>.i f14125G;

    /* renamed from: H */
    public IAcloseButton f14126H;

    /* renamed from: I */
    public boolean f14127I;

    /* renamed from: J */
    public float f14128J;

    /* renamed from: K */
    public int f14129K = -1;

    /* renamed from: L */
    public int f14130L = -1;

    /* renamed from: M */
    public int f14131M = -1;

    /* renamed from: N */
    public int f14132N = -1;

    /* renamed from: O */
    public int f14133O = -1;

    /* renamed from: P */
    public int f14134P = -1;

    /* renamed from: Q */
    public Orientation f14135Q = Orientation.NONE;

    /* renamed from: R */
    public int f14136R;

    /* renamed from: S */
    public FrameLayout f14137S;

    /* renamed from: T */
    public FrameLayout f14138T;

    /* renamed from: U */
    public RelativeLayout f14139U;

    /* renamed from: V */
    public int f14140V;

    /* renamed from: W */
    public int f14141W;

    /* renamed from: w */
    public final C4401a f14142w;

    /* renamed from: x */
    public C4401a.C4402a f14143x = null;

    /* renamed from: y */
    public C4444a0 f14144y = C4444a0.HIDDEN;

    /* renamed from: z */
    public final C5353d f14145z;

    /* renamed from: com.fyber.inneractive.sdk.web.d$a */
    public class C5350a implements View.OnClickListener {
        public C5350a() {
        }

        public void onClick(View view) {
            C5349d.this.mo26478f();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.web.d$b */
    public class C5351b implements View.OnKeyListener {
        public C5351b() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (i != 4 || !C5349d.this.mo26480h()) {
                return false;
            }
            IAlog.m16449d("back button pressed while ad is expanded, ad will be collapsed.", new Object[0]);
            C5349d.this.mo26478f();
            return true;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.web.d$c */
    public class C5352c implements C4521u<String> {
        public C5352c() {
        }

        /* renamed from: a */
        public void mo24154a(Object obj, Exception exc, boolean z) {
            String str = (String) obj;
            if (exc != null || TextUtils.isEmpty(str)) {
                C5299n.f14024b.post(new C5366j(this));
                return;
            }
            C5349d dVar = C5349d.this;
            if (dVar.mo26479g() != null) {
                C5354e eVar = new C5354e(dVar, str, (String) null);
                MediaScannerConnection mediaScannerConnection = new MediaScannerConnection(dVar.mo26479g().getApplicationContext(), eVar);
                eVar.f14153b = mediaScannerConnection;
                mediaScannerConnection.connect();
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.web.d$d */
    public enum C5353d {
        ENABLED,
        DISABLED
    }

    /* renamed from: com.fyber.inneractive.sdk.web.d$e */
    public class C5354e implements MediaScannerConnection.MediaScannerConnectionClient {

        /* renamed from: a */
        public final String f14152a;

        /* renamed from: b */
        public MediaScannerConnection f14153b;

        public C5354e(C5349d dVar, String str, String str2) {
            this.f14152a = str;
        }

        public void onMediaScannerConnected() {
            MediaScannerConnection mediaScannerConnection = this.f14153b;
            if (mediaScannerConnection != null) {
                mediaScannerConnection.scanFile(this.f14152a, (String) null);
            }
        }

        public void onScanCompleted(String str, Uri uri) {
            MediaScannerConnection mediaScannerConnection = this.f14153b;
            if (mediaScannerConnection != null) {
                mediaScannerConnection.disconnect();
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.web.d$f */
    public interface C5355f extends C5378u {
        /* renamed from: a */
        void mo24888a(InneractiveUnitController.AdDisplayError adDisplayError);

        /* renamed from: a */
        void mo24889a(C5349d dVar);

        /* renamed from: a */
        void mo24890a(C5349d dVar, C4444a0 a0Var);

        /* renamed from: a */
        void mo24891a(C5349d dVar, boolean z);

        /* renamed from: a */
        void mo24892a(C5349d dVar, boolean z, Orientation orientation);

        /* renamed from: a */
        boolean mo24894a(String str);

        /* renamed from: b */
        void mo24895b();

        /* renamed from: b */
        void mo24896b(C5349d dVar);
    }

    /* renamed from: com.fyber.inneractive.sdk.web.d$g */
    public enum C5356g {
        INLINE,
        INTERSTITIAL
    }

    /* renamed from: com.fyber.inneractive.sdk.web.d$h */
    public enum C5357h {
        ALWAYS_VISIBLE,
        ALWAYS_HIDDEN,
        AD_CONTROLLED
    }

    /* renamed from: com.fyber.inneractive.sdk.web.d$i */
    public class C5358i extends BroadcastReceiver {

        /* renamed from: a */
        public Context f14161a;

        /* renamed from: b */
        public int f14162b = -1;

        public C5358i() {
        }

        /* renamed from: a */
        public void mo26491a() {
            try {
                C5349d dVar = C5349d.this;
                dVar.getClass();
                IAlog.m16446a("%sunregister screen broadcast receiver called", IAlog.m16443a((Object) dVar));
                if (this.f14161a != null) {
                    C5349d dVar2 = C5349d.this;
                    dVar2.getClass();
                    IAlog.m16446a("%sunregistering broadcast receiver", IAlog.m16443a((Object) dVar2));
                    this.f14161a.unregisterReceiver(this);
                    this.f14161a = null;
                }
            } catch (Throwable unused) {
            }
        }

        public void onReceive(Context context, Intent intent) {
            int rotation;
            if ((this.f14161a != null) && "android.intent.action.CONFIGURATION_CHANGED".equals(intent.getAction()) && (rotation = ((WindowManager) C5292l.f14015a.getSystemService("window")).getDefaultDisplay().getRotation()) != this.f14162b) {
                this.f14162b = rotation;
                C5349d dVar = C5349d.this;
                C5347c cVar = dVar.f14079b;
                if (cVar != null) {
                    cVar.getViewTreeObserver().addOnPreDrawListener(new C5361e(dVar, context));
                }
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.web.d$j */
    public class C5359j implements C5338a.C5343e {

        /* renamed from: a */
        public C4443a f14164a;

        public C5359j(C5349d dVar, C4443a aVar, C5306p0 p0Var) {
            this.f14164a = aVar;
        }

        /* renamed from: a */
        public String mo26443a() {
            return this.f14164a.mo24632c();
        }

        /* renamed from: b */
        public void mo26444b() {
            C4443a aVar = this.f14164a;
            if (aVar != null) {
                aVar.mo24633d();
            }
        }

        /* renamed from: c */
        public String mo26445c() {
            return this.f14164a.f10961a;
        }

        /* renamed from: d */
        public void mo26446d() {
            this.f14164a.mo24635a();
        }

        public String toString() {
            return "action = " + this.f14164a.f10961a + " url = " + this.f14164a.mo24632c();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.web.d$k */
    public static abstract class C5360k implements C5355f {
        /* renamed from: a */
        public void mo26255a(boolean z) {
        }
    }

    public C5349d(Context context, boolean z, boolean z2, C5356g gVar, C5353d dVar, C5357h hVar, C4401a aVar) {
        super(context, z, z2);
        this.f14142w = aVar;
        this.f14120B = gVar;
        this.f14145z = dVar;
        this.f14119A = hVar;
    }

    /* renamed from: a */
    public void mo26470a(C4450f fVar, String str) {
        String str2 = fVar.f10976a;
        C5347c cVar = this.f14079b;
        if (cVar != null) {
            cVar.mo26448a("window.mraidbridge.fireErrorEvent('" + str2 + "', '" + str + "');");
        }
    }

    /* renamed from: a */
    public abstract boolean mo26343a(String str, C5306p0 p0Var);

    /* renamed from: b */
    public void mo26431b() {
        int i;
        int i2;
        int i3;
        boolean z;
        C4251s sVar;
        C4228d dVar;
        WebSettings settings = this.f14079b.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        int i4 = 2;
        if (!IAConfigManager.f10324J.f10352r && C5310r.m16527a() && Build.VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(2);
        }
        if (this.f14082e && Build.VERSION.SDK_INT >= 17) {
            settings.setMediaPlaybackRequiresUserGesture(false);
        }
        C5347c cVar = this.f14079b;
        cVar.setHorizontalScrollBarEnabled(false);
        cVar.setHorizontalScrollbarOverlay(false);
        cVar.setVerticalScrollBarEnabled(false);
        cVar.setVerticalScrollbarOverlay(false);
        cVar.getSettings().setSupportZoom(false);
        C5347c cVar2 = this.f14079b;
        cVar2.getClass();
        if (Build.VERSION.SDK_INT < 18) {
            try {
                cVar2.getSettings().setPluginState(WebSettings.PluginState.ON);
            } catch (Exception unused) {
                IAlog.m16446a("Failed to modify WebView plugin state.", new Object[0]);
            }
        }
        this.f14079b.setFocusable(true);
        this.f14079b.setBackgroundColor(0);
        C5369m mVar = new C5369m();
        this.f14080c = mVar;
        this.f14079b.setWebChromeClient(mVar);
        C4361j jVar = this.f14099v;
        int i5 = 500;
        if (jVar == null || (sVar = jVar.f10714c) == null || (dVar = (C4228d) sVar.mo24264a(C4228d.class)) == null) {
            i3 = 500;
            i2 = 500;
            i = 2;
            z = false;
        } else {
            boolean a = dVar.mo24239a("agg_res", false);
            Integer b = dVar.mo24240b("agg_res_ct");
            int max = Math.max(b != null ? b.intValue() : 500, 50);
            Integer b2 = dVar.mo24240b("agg_res_rt");
            if (b2 != null) {
                i5 = b2.intValue();
            }
            int max2 = Math.max(i5, 50);
            Integer b3 = dVar.mo24240b("agg_res_retries");
            if (b3 != null) {
                i4 = b3.intValue();
            }
            i2 = max2;
            i = Math.max(i4, 1);
            z = a;
            i3 = max;
        }
        C5370n nVar = new C5370n(this, z, i3, i2, i);
        this.f14081d = nVar;
        this.f14079b.setWebViewClient(nVar);
        try {
            if (Build.VERSION.SDK_INT >= 19) {
                WebView.setWebContentsDebuggingEnabled(true);
            }
        } catch (Exception unused2) {
            IAlog.m16446a("Could not set web contents debugging flag", new Object[0]);
        }
        this.f14079b.setListener(this);
        this.f14144y = C4444a0.LOADING;
        Context g = mo26479g();
        this.f14124F = g instanceof Activity ? ((Activity) g).getRequestedOrientation() : -1;
        this.f14138T = new FrameLayout(mo26479g());
        this.f14139U = new RelativeLayout(mo26479g());
        FrameLayout frameLayout = new FrameLayout(mo26479g());
        frameLayout.setBackgroundColor(-858993460);
        this.f14137S = frameLayout;
        mo26469a(g, false);
        this.f14079b.setOnKeyListener(new C5351b());
    }

    /* renamed from: c */
    public final Date mo26475c(String str) {
        Date date = null;
        int i = 0;
        while (true) {
            String[] strArr = f14118X;
            if (i >= strArr.length) {
                break;
            }
            try {
                date = new SimpleDateFormat(strArr[i], Locale.getDefault()).parse(str);
                if (date != null) {
                    break;
                }
                i++;
            } catch (ParseException unused) {
            }
        }
        return date;
    }

    /* renamed from: d */
    public final void mo26477d(boolean z) {
        try {
            Activity activity = (Activity) mo26479g();
            if (activity == null) {
                return;
            }
            if (!z || activity.getResources() == null || activity.getResources().getConfiguration() == null) {
                activity.setRequestedOrientation(this.f14124F);
            } else {
                activity.setRequestedOrientation(activity.getResources().getConfiguration().orientation);
            }
        } catch (Exception unused) {
            IAlog.m16446a("Failed to modify the device orientation.", new Object[0]);
        }
    }

    /* renamed from: f */
    public void mo26478f() {
        this.f14123E = false;
        C4444a0 a0Var = this.f14144y;
        C4444a0 a0Var2 = C4444a0.EXPANDED;
        if (a0Var == a0Var2 || a0Var == C4444a0.RESIZED) {
            mo26476c(false);
            C5347c cVar = this.f14079b;
            if (cVar != null) {
                C4444a0 a0Var3 = this.f14144y;
                if (a0Var3 == a0Var2) {
                    mo26482j();
                    ViewGroup viewGroup = (ViewGroup) this.f14137S.getParent();
                    if (viewGroup != null) {
                        viewGroup.addView(this.f14079b, this.f14136R, new FrameLayout.LayoutParams(this.f14140V, this.f14141W, 17));
                        viewGroup.removeView(this.f14137S);
                        viewGroup.invalidate();
                        this.f14079b.requestLayout();
                    }
                    this.f14133O = this.f14140V;
                    this.f14134P = this.f14141W;
                } else if (a0Var3 == C4444a0.RESIZED) {
                    this.f14133O = this.f14140V;
                    this.f14134P = this.f14141W;
                    cVar.setLayoutParams(new FrameLayout.LayoutParams(this.f14140V, this.f14141W, 17));
                }
            }
            this.f14144y = C4444a0.DEFAULT;
            mo26477d(false);
            mo26471a((C4464t) new C4469y(this.f14144y));
        } else if (a0Var == C4444a0.DEFAULT) {
            C5347c cVar2 = this.f14079b;
            if (cVar2 != null) {
                cVar2.setVisibility(4);
            }
            C4444a0 a0Var4 = C4444a0.HIDDEN;
            this.f14144y = a0Var4;
            mo26471a((C4464t) new C4469y(a0Var4));
        }
        L l = this.f14084g;
        if (l != null) {
            ((C5355f) l).mo24890a(this, this.f14144y);
        }
    }

    /* renamed from: g */
    public final Context mo26479g() {
        C5347c cVar = this.f14079b;
        if (cVar != null) {
            return cVar.getContext();
        }
        return null;
    }

    /* renamed from: h */
    public boolean mo26480h() {
        return this.f14144y == C4444a0.EXPANDED;
    }

    /* renamed from: i */
    public boolean mo26481i() {
        return this.f14144y == C4444a0.RESIZED;
    }

    /* renamed from: j */
    public final void mo26482j() {
        FrameLayout frameLayout = this.f14138T;
        if (frameLayout != null && this.f14139U != null) {
            frameLayout.removeAllViewsInLayout();
            this.f14139U.removeAllViewsInLayout();
            ViewGroup viewGroup = this.f14121C;
            if (viewGroup != null) {
                viewGroup.removeView(this.f14139U);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r0 = (com.fyber.inneractive.sdk.measurement.C4407f) r0;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo26483k() {
        /*
            r5 = this;
            com.fyber.inneractive.sdk.measurement.a$a r0 = r5.f14143x
            if (r0 == 0) goto L_0x0023
            com.fyber.inneractive.sdk.measurement.f r0 = (com.fyber.inneractive.sdk.measurement.C4407f) r0
            com.iab.omid.library.fyber.adsession.AdSession r1 = r0.f10807b
            if (r1 == 0) goto L_0x0023
            r1.finish()     // Catch:{ all -> 0x000e }
            goto L_0x0012
        L_0x000e:
            r1 = move-exception
            r0.mo24586a(r1)
        L_0x0012:
            android.os.Handler r1 = com.fyber.inneractive.sdk.util.C5299n.f14024b
            com.fyber.inneractive.sdk.measurement.e r2 = new com.fyber.inneractive.sdk.measurement.e
            r2.<init>(r0)
            r3 = 2000(0x7d0, double:9.88E-321)
            r1.postDelayed(r2, r3)
            r1 = 0
            r0.f10807b = r1
            r0.f10808c = r1
        L_0x0023:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.web.C5349d.mo26483k():void");
    }

    public void setAdDefaultSize(int i, int i2) {
        this.f14140V = i;
        this.f14141W = i2;
        this.f14133O = i;
        this.f14134P = i2;
    }

    public void setOrientationProperties(boolean z, String str) {
        if ("portrait".equals(str)) {
            this.f14135Q = Orientation.PORTRAIT;
        } else if ("landscape".equals(str)) {
            this.f14135Q = Orientation.LANDSCAPE;
        } else {
            this.f14135Q = Orientation.NONE;
        }
        L l = this.f14084g;
        if (l != null) {
            ((C5355f) l).mo24892a(this, z, this.f14135Q);
        }
    }

    public void setResizeProperties() {
    }

    /* renamed from: a */
    public void mo26429a(boolean z) {
        Handler handler = C5299n.f14024b;
        handler.post(new C5363g(this));
        C5347c cVar = this.f14122D;
        if (!(cVar == null || cVar.getParent() == null || !(this.f14122D.getParent() instanceof ViewGroup))) {
            ((ViewGroup) this.f14122D.getParent()).removeView(this.f14122D);
            this.f14122D = null;
        }
        mo26482j();
        this.f14078a = false;
        AsyncTask<Void, Void, String> asyncTask = this.f14095r;
        if (asyncTask != null) {
            asyncTask.cancel(true);
        }
        C5347c cVar2 = this.f14079b;
        if (cVar2 != null) {
            C5270f0.C5274d.f13984a.mo26371a(cVar2);
            C5312s.m16536a((View) this.f14079b);
            this.f14079b.setWebChromeClient((WebChromeClient) null);
            this.f14079b.setWebViewClient((WebViewClient) null);
            if (((IAmraidWebViewController) this).f14143x == null) {
                this.f14079b.destroy();
            }
        }
        C5370n nVar = this.f14081d;
        if (nVar != null) {
            nVar.f14178e = null;
        }
        Runnable runnable = this.f14091n;
        if (runnable != null) {
            handler.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f14090m;
        if (runnable2 != null) {
            handler.removeCallbacks(runnable2);
        }
        this.f14084g = null;
        if (!z) {
            this.f14083f = null;
        }
        this.f14079b = null;
        this.f14080c = null;
        this.f14081d = null;
        this.f14099v = null;
        this.f14098u = null;
    }

    /* renamed from: c */
    public void mo26476c(boolean z) {
        if (this.f14121C != null) {
            if (z) {
                int b = C5292l.m16507b(35);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(b, b);
                layoutParams.addRule(10);
                layoutParams.addRule(11);
                layoutParams.rightMargin = C5292l.m16507b(10);
                layoutParams.topMargin = C5292l.m16507b(10);
                if (this.f14126H == null) {
                    IAcloseButton iAcloseButton = new IAcloseButton(mo26479g(), b, true);
                    this.f14126H = iAcloseButton;
                    iAcloseButton.setOnClickListener(new C5350a());
                }
                C5312s.m16536a((View) this.f14126H);
                this.f14139U.addView(this.f14126H, layoutParams);
            } else {
                this.f14139U.removeView(this.f14126H);
            }
            L l = this.f14084g;
            if (l != null) {
                ((C5355f) l).mo24891a(this, z);
            }
            this.f14127I = !z;
        }
    }

    /* renamed from: a */
    public boolean mo26342a(WebView webView, String str) {
        C5306p0 p0Var;
        C5347c cVar;
        IAlog.m16446a("%shandle url for: %s webView = %s", IAlog.m16443a((Object) this), str, webView);
        C4444a0 a0Var = this.f14144y;
        C4444a0 a0Var2 = C4444a0.EXPANDED;
        if (a0Var != a0Var2 || TextUtils.isEmpty(str) || !webView.equals(this.f14122D) || this.f14123E) {
            IAlog.m16446a("%shandleUrl called with: %s", IAlog.m16443a((Object) this), str);
            if (this.f14079b == null) {
                IAlog.m16446a("handleUrl: web view already destroyed. Cannot handle url", new Object[0]);
                return false;
            }
            if (C5311r0.m16529a(str)) {
                this.f14079b.loadUrl("chrome://crash");
            } else {
                if (this.f14144y != a0Var2 || (cVar = this.f14122D) == null) {
                    C5347c cVar2 = this.f14079b;
                    p0Var = cVar2 != null ? cVar2.getLastClickedLocation() : C5306p0.m16523a();
                } else {
                    p0Var = cVar.getLastClickedLocation();
                }
                if (!mo26343a(str, p0Var)) {
                    mo26430a((C5338a.C5343e) new C5338a.C5345g(str, p0Var));
                }
            }
            return true;
        }
        this.f14123E = true;
        return false;
    }

    /* renamed from: a */
    public final void mo26469a(Context context, boolean z) {
        int i;
        int i2;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (Build.VERSION.SDK_INT >= 17) {
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        } else {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        }
        this.f14128J = displayMetrics.density;
        if (context instanceof Activity) {
            Window window = ((Activity) context).getWindow();
            Rect rect = new Rect();
            window.getDecorView().getWindowVisibleDisplayFrame(rect);
            i2 = rect.top;
            i = window.findViewById(16908290).getTop() - i2;
        } else {
            i = 0;
            i2 = 0;
        }
        int i3 = displayMetrics.widthPixels;
        int i4 = displayMetrics.heightPixels;
        double d = (double) i3;
        double d2 = 160.0d / ((double) displayMetrics.densityDpi);
        int i5 = (int) (d * d2);
        int i6 = (int) (((double) i4) * d2);
        int i7 = (i4 - i2) - i;
        if (this.f14079b.getScaleX() == 1.0f || this.f14079b.getScaleY() == 1.0f) {
            double d3 = 160.0d / ((double) displayMetrics.densityDpi);
            this.f14131M = (int) (d * d3);
            this.f14132N = (int) (((double) i7) * d3);
        } else {
            i5 = this.f14079b.getWidthDp();
            i6 = this.f14079b.getHeightDp();
            int b = (C5292l.m16507b(this.f14079b.getHeightDp()) - i2) - i;
            this.f14131M = this.f14129K;
            this.f14132N = (int) (((double) b) * (160.0d / ((double) displayMetrics.densityDpi)));
        }
        if (this.f14129K != i5 || this.f14130L != i6) {
            this.f14129K = i5;
            this.f14130L = i6;
            if (z) {
                mo26471a((C4464t) new C4468x(i5, i6));
                mo26471a((C4464t) new C4466v(this.f14131M, this.f14132N));
                mo26471a((C4464t) new C4465u(0, 0, this.f14131M, this.f14132N));
                int i8 = this.f14133O;
                if (i8 <= 0 || this.f14134P <= 0) {
                    C5347c cVar = this.f14079b;
                    if (cVar != null && cVar.getWidth() > 0 && this.f14079b.getHeight() > 0) {
                        mo26471a((C4464t) new C4463s(C5292l.m16512c(this.f14079b.getWidth()), C5292l.m16512c(this.f14079b.getHeight())));
                        return;
                    }
                    return;
                }
                mo26471a((C4464t) new C4463s(C5292l.m16512c(i8), C5292l.m16512c(this.f14134P)));
            }
        }
    }

    /* renamed from: b */
    public void mo26474b(boolean z) {
        this.f14127I = z;
        L l = this.f14084g;
        if (l != null) {
            ((C5355f) l).mo24891a(this, z);
        }
    }

    /* renamed from: b */
    public void mo26473b(String str) {
        C5347c cVar = this.f14079b;
        if (cVar != null) {
            cVar.mo26448a("window.mraidbridge.nativeCallComplete('" + str + "');");
        }
    }

    /* renamed from: a */
    public final Map<String, Object> mo26468a(Map<String, String> map) throws Exception {
        String str;
        HashMap hashMap = new HashMap();
        if (!map.containsKey("description") || !map.containsKey("start")) {
            throw new IllegalArgumentException("Missing start and description fields");
        }
        hashMap.put("title", map.get("description"));
        if (!map.containsKey("start") || map.get("start") == null) {
            throw new IllegalArgumentException("Invalid calendar event: start is null.");
        }
        Date c = mo26475c(map.get("start"));
        if (c != null) {
            hashMap.put("beginTime", Long.valueOf(c.getTime()));
            if (map.containsKey("end") && map.get("end") != null) {
                Date c2 = mo26475c(map.get("end"));
                if (c2 != null) {
                    hashMap.put(SDKConstants.PARAM_END_TIME, Long.valueOf(c2.getTime()));
                } else {
                    throw new IllegalArgumentException("Invalid calendar event: end time is malformed. Date format expecting (yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx) i.e. 2013-08-14T09:00:01-08:00");
                }
            }
            if (map.containsKey(FirebaseAnalytics.Param.LOCATION)) {
                hashMap.put("eventLocation", map.get(FirebaseAnalytics.Param.LOCATION));
            }
            if (map.containsKey("summary")) {
                hashMap.put("description", map.get("summary"));
            }
            if (map.containsKey("transparency")) {
                hashMap.put("availability", Integer.valueOf(TJAdUnitConstants.String.TRANSPARENT.equals(map.get("transparency")) ? 1 : 0));
            }
            StringBuilder sb = new StringBuilder();
            if (map.containsKey("frequency")) {
                String str2 = map.get("frequency");
                int parseInt = map.containsKey(TJAdUnitConstants.String.INTERVAL) ? Integer.parseInt(map.get(TJAdUnitConstants.String.INTERVAL)) : -1;
                if ("daily".equals(str2)) {
                    sb.append("FREQ=DAILY;");
                    if (parseInt != -1) {
                        sb.append("INTERVAL=" + parseInt + ";");
                    }
                } else {
                    if ("weekly".equals(str2)) {
                        sb.append("FREQ=WEEKLY;");
                        if (parseInt != -1) {
                            sb.append("INTERVAL=" + parseInt + ";");
                        }
                        if (map.containsKey("daysInWeek")) {
                            StringBuilder sb2 = new StringBuilder();
                            boolean[] zArr = new boolean[7];
                            String[] split = map.get("daysInWeek").split(",");
                            for (String parseInt2 : split) {
                                int parseInt3 = Integer.parseInt(parseInt2);
                                if (parseInt3 == 7) {
                                    parseInt3 = 0;
                                }
                                if (!zArr[parseInt3]) {
                                    StringBuilder sb3 = new StringBuilder();
                                    switch (parseInt3) {
                                        case 0:
                                            str = "SU";
                                            break;
                                        case 1:
                                            str = "MO";
                                            break;
                                        case 2:
                                            str = "TU";
                                            break;
                                        case 3:
                                            str = "WE";
                                            break;
                                        case 4:
                                            str = "TH";
                                            break;
                                        case 5:
                                            str = "FR";
                                            break;
                                        case 6:
                                            str = "SA";
                                            break;
                                        default:
                                            throw new IllegalArgumentException("invalid day of week " + parseInt3);
                                    }
                                    sb3.append(str);
                                    sb3.append(",");
                                    sb2.append(sb3.toString());
                                    zArr[parseInt3] = true;
                                }
                            }
                            if (split.length != 0) {
                                sb2.deleteCharAt(sb2.length() - 1);
                                String sb4 = sb2.toString();
                                if (sb4 != null) {
                                    sb.append("BYDAY=" + sb4 + ";");
                                } else {
                                    throw new IllegalArgumentException("invalid ");
                                }
                            } else {
                                throw new IllegalArgumentException("must have at least 1 day of the week if specifying repeating weekly");
                            }
                        }
                    } else if ("monthly".equals(str2)) {
                        sb.append("FREQ=MONTHLY;");
                        if (parseInt != -1) {
                            sb.append("INTERVAL=" + parseInt + ";");
                        }
                        if (map.containsKey("daysInMonth")) {
                            StringBuilder sb5 = new StringBuilder();
                            boolean[] zArr2 = new boolean[63];
                            String[] split2 = map.get("daysInMonth").split(",");
                            for (String parseInt4 : split2) {
                                int parseInt5 = Integer.parseInt(parseInt4);
                                int i = parseInt5 + 31;
                                if (!zArr2[i]) {
                                    StringBuilder sb6 = new StringBuilder();
                                    if (parseInt5 == 0 || parseInt5 < -31 || parseInt5 > 31) {
                                        throw new IllegalArgumentException("invalid day of month " + parseInt5);
                                    }
                                    sb6.append("" + parseInt5);
                                    sb6.append(",");
                                    sb5.append(sb6.toString());
                                    zArr2[i] = true;
                                }
                            }
                            if (split2.length != 0) {
                                sb5.deleteCharAt(sb5.length() - 1);
                                String sb7 = sb5.toString();
                                if (sb7 != null) {
                                    sb.append("BYMONTHDAY=" + sb7 + ";");
                                } else {
                                    throw new IllegalArgumentException();
                                }
                            } else {
                                throw new IllegalArgumentException("must have at least 1 day of the month if specifying repeating weekly");
                            }
                        }
                    } else {
                        throw new IllegalArgumentException("frequency is only supported for daily, weekly, and monthly.");
                    }
                }
            }
            String sb8 = sb.toString();
            if (!TextUtils.isEmpty(sb8)) {
                hashMap.put("rrule", sb8);
            }
            return hashMap;
        }
        throw new IllegalArgumentException("Invalid calendar event: start time is malformed. Date format expecting (yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx) i.e. 2013-08-14T09:00:01-08:00");
    }

    /* renamed from: a */
    public final void mo26472a(String str) {
        new File(Environment.getExternalStorageDirectory(), "Pictures").mkdirs();
        C4492i0 i0Var = new C4492i0(new C5352c(), str);
        IAConfigManager.f10324J.f10354t.f11186a.offer(i0Var);
        i0Var.mo24642a(C4501m0.QUEUED);
    }

    /* renamed from: a */
    public void mo26471a(C4464t tVar) {
        if (this.f14079b != null) {
            String str = "{" + tVar.toString() + "}";
            this.f14079b.mo26448a("window.mraidbridge.fireChangeEvent(" + str + ");");
            IAlog.m16449d("Fire changes: %s", str);
        }
    }

    /* renamed from: a */
    public final Map<String, String> mo26467a(URI uri) throws UnsupportedEncodingException {
        int i;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String rawQuery = uri.getRawQuery();
        if (rawQuery != null && rawQuery.length() > 0) {
            for (String str : rawQuery.split("&")) {
                int indexOf = str.indexOf("=");
                linkedHashMap.put(indexOf > 0 ? URLDecoder.decode(str.substring(0, indexOf), "UTF-8") : str, (indexOf <= 0 || str.length() <= (i = indexOf + 1)) ? null : URLDecoder.decode(str.substring(i), "UTF-8"));
            }
        }
        return linkedHashMap;
    }
}
