package com.fyber.inneractive.sdk.web;

import android.content.Context;
import android.graphics.Rect;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.flow.C4361j;
import com.fyber.inneractive.sdk.measurement.C4401a;
import com.fyber.inneractive.sdk.measurement.C4405d;
import com.fyber.inneractive.sdk.p191ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.C5262d0;
import com.fyber.inneractive.sdk.util.C5270f0;
import com.fyber.inneractive.sdk.util.C5292l;
import com.fyber.inneractive.sdk.util.C5299n;
import com.fyber.inneractive.sdk.util.C5306p0;
import com.fyber.inneractive.sdk.util.C5310r;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C5347c;
import com.fyber.inneractive.sdk.web.C5349d;
import com.fyber.inneractive.sdk.web.C5371o;
import com.fyber.inneractive.sdk.web.C5378u;
import com.iab.omid.library.fyber.ScriptInjector;

/* renamed from: com.fyber.inneractive.sdk.web.a */
public abstract class C5338a<L extends C5378u> implements C5346b, C5270f0.C5275e, C5347c.C5348a, C5371o.C5372a {

    /* renamed from: a */
    public boolean f14078a = false;

    /* renamed from: b */
    public C5347c f14079b;

    /* renamed from: c */
    public C5369m f14080c;

    /* renamed from: d */
    public C5370n f14081d;

    /* renamed from: e */
    public boolean f14082e;

    /* renamed from: f */
    public C5344f f14083f;

    /* renamed from: g */
    public L f14084g;

    /* renamed from: h */
    public float f14085h = 0.0f;

    /* renamed from: i */
    public Rect f14086i = new Rect();

    /* renamed from: j */
    public boolean f14087j;

    /* renamed from: k */
    public boolean f14088k;

    /* renamed from: l */
    public C5343e f14089l;

    /* renamed from: m */
    public final Runnable f14090m;

    /* renamed from: n */
    public final Runnable f14091n;

    /* renamed from: o */
    public Runnable f14092o;

    /* renamed from: p */
    public long f14093p;

    /* renamed from: q */
    public long f14094q;

    /* renamed from: r */
    public AsyncTask<Void, Void, String> f14095r;

    /* renamed from: s */
    public String f14096s;

    /* renamed from: t */
    public String f14097t;

    /* renamed from: u */
    public InneractiveAdRequest f14098u;

    /* renamed from: v */
    public C4361j f14099v;

    /* renamed from: com.fyber.inneractive.sdk.web.a$a */
    public class C5339a implements Runnable {
        public C5339a() {
        }

        public void run() {
            IAlog.m16449d("Removing clicked state after timeout", new Object[0]);
            C5338a.this.mo26433d();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.web.a$b */
    public class C5340b implements Runnable {
        public C5340b() {
        }

        public void run() {
            C5338a aVar = C5338a.this;
            if (aVar.f14088k) {
                IAlog.m16446a("No user web action detected for : %s blocking.", aVar.f14089l);
                C5338a aVar2 = C5338a.this;
                String c = aVar2.f14089l.mo26445c();
                String a = C5338a.this.f14089l.mo26443a();
                L l = aVar2.f14084g;
                if (l != null) {
                    l.mo24893a(c, a);
                }
                int i = IAlog.f13936a;
                IAlog.m16444a(1, (Exception) null, "AD_AUTO_CLICK_DETECTED", new Object[0]);
                C5338a.this.f14089l.mo26444b();
                C5338a.this.mo26433d();
            } else {
                IAlog.m16446a("User web action detected for: %s", aVar.f14089l);
                C5338a.this.f14089l.mo26446d();
            }
            C5338a.this.f14089l = null;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.web.a$c */
    public class C5341c extends AsyncTask<Void, Void, String> {

        /* renamed from: a */
        public final /* synthetic */ String f14102a;

        /* renamed from: b */
        public final /* synthetic */ String f14103b;

        /* renamed from: c */
        public final /* synthetic */ String f14104c;

        /* renamed from: d */
        public final /* synthetic */ String f14105d;

        public C5341c(String str, String str2, String str3, String str4) {
            this.f14102a = str;
            this.f14103b = str2;
            this.f14104c = str3;
            this.f14105d = str4;
        }

        public Object doInBackground(Object[] objArr) {
            Void[] voidArr = (Void[]) objArr;
            long currentTimeMillis = System.currentTimeMillis();
            C5338a aVar = C5338a.this;
            String str = this.f14102a;
            String str2 = this.f14103b;
            String str3 = this.f14104c;
            IAmraidWebViewController iAmraidWebViewController = (IAmraidWebViewController) aVar;
            iAmraidWebViewController.getClass();
            System.currentTimeMillis();
            StringBuilder sb = new StringBuilder();
            String str4 = null;
            if (TextUtils.isEmpty(str)) {
                IAlog.m16446a("loadHtml called with an empty HTML!", new Object[0]);
            } else {
                sb.append("<html><head>");
                sb.append("<link rel=\"icon\" href=\"data:,\">");
                if (iAmraidWebViewController.f13917Y) {
                    String c = C5292l.m16513c("ia_js_load_monitor.txt");
                    if (!TextUtils.isEmpty(c)) {
                        sb.append(c);
                    }
                }
                sb.append("<script> window.iaPreCachedAd = true; </script>");
                IAConfigManager iAConfigManager = IAConfigManager.f10324J;
                boolean a = iAConfigManager.f10356v.f10459b.mo24273a("use_js_inline", false);
                if (!a || iAConfigManager.f10331F.f10285b == null) {
                    sb.append("<script src=\"https://cdn2.inner-active.mobi/client/ia-js-tags/MRAID-VIDEO.js\"></script>");
                } else {
                    sb.append("<script type=\"text/javascript\">");
                    sb.append(iAConfigManager.f10331F.f10285b);
                    sb.append("</script>");
                }
                if (!TextUtils.isEmpty(str2)) {
                    sb.append(str2);
                }
                sb.append("<script>var prevWindowOnError = window.onerror; window.onerror = function(err) {if (typeof prevWindowOnError === 'function') {prevWindowOnError.apply();} console.log('WINDOW.ONERROR Javascript Error: ' + err);};</script>");
                sb.append("</head>");
                sb.append("<style>body{text-align:center !important;margin:0;padding:0;}");
                if (!TextUtils.isEmpty(str3)) {
                    sb.append(str3);
                }
                sb.append("</style>");
                sb.append("<body id=\"iaBody\">");
                if (iAmraidWebViewController.f13921c0) {
                    C5349d.C5356g gVar = iAmraidWebViewController.f14120B;
                    if (gVar != null && gVar.equals(C5349d.C5356g.INTERSTITIAL)) {
                        if (!a || iAConfigManager.f10331F.f10286c == null) {
                            sb.append("<link rel=\"stylesheet\" href=\"https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.css\">");
                        } else {
                            sb.append("<style type=\"text/css\">");
                            sb.append(iAConfigManager.f10331F.f10286c);
                            sb.append("</style>");
                        }
                        if (!a || iAConfigManager.f10331F.f10287d == null) {
                            sb.append("<script src=\"https://cdn2.inner-active.mobi/IA-JSTag/Production/centering_v1.js\"></script>");
                        } else {
                            sb.append("<script type=\"text/javascript\">");
                            sb.append(iAConfigManager.f10331F.f10287d);
                            sb.append("</script>");
                        }
                    }
                }
                String c2 = C5292l.m16513c("ia_mraid_bridge.txt");
                if (!TextUtils.isEmpty(c2)) {
                    sb.append("<div id='iaScriptBr' style='display:none;'>");
                    sb.append(c2);
                    sb.append("</div>");
                    if (IAlog.f13936a >= 2) {
                        sb.append("<script type=\"text/javascript\">window.mraidbridge.loggingEnabled = true;</script>");
                    }
                }
                sb.append(str);
                sb.append("</body></html>");
                C4401a aVar2 = iAmraidWebViewController.f14142w;
                if (aVar2 != null) {
                    str4 = sb.toString();
                    C4405d dVar = (C4405d) aVar2;
                    if (!TextUtils.isEmpty(dVar.f10803b)) {
                        str4 = ScriptInjector.injectScriptContentIntoHtml(dVar.f10803b, str4);
                    }
                } else {
                    str4 = sb.toString();
                }
            }
            C5338a aVar3 = C5338a.this;
            aVar3.getClass();
            IAlog.m16446a("%sbuild html string took %d msec", IAlog.m16443a((Object) aVar3), Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            return str4;
        }

        public void onPostExecute(Object obj) {
            String str = (String) obj;
            String str2 = C5310r.m16527a() ? "http://" : "https://";
            if (!TextUtils.isEmpty(str) && !isCancelled()) {
                C5338a.this.f14095r = null;
                if (!TextUtils.isEmpty(this.f14105d)) {
                    C5338a aVar = C5338a.this;
                    aVar.f14096s = str2 + this.f14105d;
                } else {
                    C5338a aVar2 = C5338a.this;
                    aVar2.f14096s = str2 + "wv.inner-active.mobi/";
                }
                C5338a aVar3 = C5338a.this;
                C5347c cVar = aVar3.f14079b;
                if (cVar != null) {
                    cVar.loadDataWithBaseURL(aVar3.f14096s, str, "text/html", "utf-8", (String) null);
                    C5338a.this.f14097t = str;
                    return;
                }
                InneractiveErrorCode inneractiveErrorCode = InneractiveErrorCode.SDK_INTERNAL_ERROR;
                C5344f fVar = aVar3.f14083f;
                if (fVar != null) {
                    fVar.mo24515a(aVar3, inneractiveErrorCode);
                }
                aVar3.mo26429a(true);
            } else if (!isCancelled()) {
                C5338a aVar4 = C5338a.this;
                InneractiveErrorCode inneractiveErrorCode2 = InneractiveErrorCode.SDK_INTERNAL_ERROR;
                C5344f fVar2 = aVar4.f14083f;
                if (fVar2 != null) {
                    fVar2.mo24515a(aVar4, inneractiveErrorCode2);
                }
                aVar4.mo26429a(true);
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.web.a$d */
    public class C5342d implements Runnable {
        public C5342d() {
        }

        public void run() {
            C5338a aVar = C5338a.this;
            AsyncTask<Void, Void, String> asyncTask = aVar.f14095r;
            if (asyncTask != null) {
                asyncTask.cancel(true);
                aVar.f14095r = null;
            }
            IAlog.m16446a("%sonLoadTimeout after %d msec", IAlog.m16443a((Object) aVar), Long.valueOf(aVar.f14093p));
            aVar.mo26427a(InneractiveErrorCode.LOAD_TIMEOUT);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.web.a$e */
    public interface C5343e {
        /* renamed from: a */
        String mo26443a();

        /* renamed from: b */
        void mo26444b();

        /* renamed from: c */
        String mo26445c();

        /* renamed from: d */
        void mo26446d();
    }

    /* renamed from: com.fyber.inneractive.sdk.web.a$f */
    public interface C5344f {
        /* renamed from: a */
        void mo24514a(C5338a aVar);

        /* renamed from: a */
        void mo24515a(C5338a aVar, InneractiveErrorCode inneractiveErrorCode);
    }

    /* renamed from: com.fyber.inneractive.sdk.web.a$g */
    public class C5345g implements C5343e {

        /* renamed from: a */
        public String f14108a;

        /* renamed from: b */
        public C5306p0 f14109b;

        public C5345g(String str, C5306p0 p0Var) {
            this.f14109b = p0Var;
            this.f14108a = str;
        }

        /* renamed from: a */
        public String mo26443a() {
            return null;
        }

        /* renamed from: b */
        public void mo26444b() {
        }

        /* renamed from: c */
        public String mo26445c() {
            return "open";
        }

        /* renamed from: d */
        public void mo26446d() {
            C5338a aVar = C5338a.this;
            String str = this.f14108a;
            C5306p0 p0Var = this.f14109b;
            L l = aVar.f14084g;
            if (l != null) {
                C5262d0.C5265c cVar = l.mo24886a(str, p0Var).f13957a;
            }
        }

        public String toString() {
            return "action: open url: " + this.f14108a;
        }
    }

    public C5338a(Context context, boolean z, boolean z2) {
        this.f14088k = z;
        this.f14079b = mo26425a(context);
        this.f14082e = z2;
        this.f14091n = new C5339a();
        this.f14090m = new C5340b();
    }

    /* renamed from: a */
    public void mo26428a(String str, String str2, String str3, String str4, C5344f fVar, long j) {
        this.f14083f = fVar;
        this.f14093p = j;
        try {
            mo26431b();
            C5341c cVar = new C5341c(str2, str3, str4, str);
            this.f14095r = cVar;
            cVar.executeOnExecutor(C5299n.f14023a, new Void[0]);
            mo26434e();
        } catch (Throwable unused) {
            mo26427a(InneractiveErrorCode.SDK_INTERNAL_ERROR);
        }
    }

    /* renamed from: a */
    public abstract void mo26429a(boolean z);

    /* renamed from: b */
    public abstract void mo26431b();

    /* renamed from: c */
    public void mo26432c() {
        this.f14079b.setTapListener(this);
    }

    /* renamed from: d */
    public void mo26433d() {
        IAlog.m16446a("IAWebViewController resetClick()", new Object[0]);
        Runnable runnable = this.f14091n;
        if (runnable != null) {
            C5299n.f14024b.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f14090m;
        if (runnable2 != null) {
            C5299n.f14024b.removeCallbacks(runnable2);
        }
        this.f14087j = false;
    }

    /* renamed from: e */
    public final void mo26434e() {
        IAlog.m16446a("IAWebViewController: Starting load timeout with %d", Long.valueOf(this.f14093p));
        this.f14094q = System.currentTimeMillis();
        C5342d dVar = new C5342d();
        this.f14092o = dVar;
        C5299n.f14024b.postDelayed(dVar, this.f14093p);
    }

    public void setAdContent(C4361j jVar) {
        this.f14099v = jVar;
    }

    public void setAdRequest(InneractiveAdRequest inneractiveAdRequest) {
        this.f14098u = inneractiveAdRequest;
    }

    public void setListener(L l) {
        this.f14084g = l;
    }

    /* renamed from: a */
    public C5347c mo26424a() {
        return this.f14079b;
    }

    /* renamed from: a */
    public void mo26426a(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        C5347c cVar = this.f14079b;
        if (cVar != null) {
            if (layoutParams != null) {
                viewGroup.addView(cVar, layoutParams);
            } else {
                viewGroup.addView(cVar);
            }
            C5270f0.C5274d.f13984a.mo26369a(viewGroup.getContext(), (View) this.f14079b, (C5270f0.C5275e) this);
            this.f14079b.setTapListener(this);
        }
    }

    /* renamed from: a */
    public C5347c mo26425a(Context context) {
        return new C5347c(context);
    }

    /* renamed from: a */
    public final void mo26427a(InneractiveErrorCode inneractiveErrorCode) {
        C5344f fVar = this.f14083f;
        if (fVar != null) {
            fVar.mo24515a(this, inneractiveErrorCode);
        }
        mo26429a(true);
    }

    /* renamed from: a */
    public void mo26268a(View view, float f, Rect rect) {
        if (f != this.f14085h || !rect.equals(this.f14086i)) {
            this.f14085h = f;
            this.f14086i.set(rect);
            C5347c cVar = this.f14079b;
            if (cVar != null) {
                cVar.mo26449a();
            }
        }
    }

    /* renamed from: a */
    public boolean mo26430a(C5343e eVar) {
        IAlog.m16449d("IAWebViewController Web view click detected", new Object[0]);
        if (this.f14087j) {
            IAlog.m16449d("IAWebViewController Native click detected before web view request. Processing click", new Object[0]);
            eVar.mo26446d();
            mo26433d();
            return true;
        }
        if (this.f14088k) {
            IAlog.m16449d("IAWebViewController Native click was not detected yet. Caching click request and waiting", new Object[0]);
            Runnable runnable = this.f14090m;
            if (runnable != null) {
                C5299n.f14024b.removeCallbacks(runnable);
            }
            this.f14089l = null;
            this.f14089l = eVar;
            if (this.f14090m != null) {
                C5299n.f14024b.postDelayed(this.f14090m, (long) IAConfigManager.f10324J.f10356v.f10459b.mo24271a("click_timeout", 1000, 1000));
            }
        } else {
            Runnable runnable2 = this.f14090m;
            if (runnable2 != null) {
                C5299n.f14024b.removeCallbacks(runnable2);
            }
            this.f14089l = null;
            eVar.mo26446d();
        }
        return false;
    }
}
