package com.fyber.inneractive.sdk.p191ui;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.C4109R;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.C4361j;
import com.fyber.inneractive.sdk.measurement.C4401a;
import com.fyber.inneractive.sdk.measurement.C4405d;
import com.fyber.inneractive.sdk.measurement.C4407f;
import com.fyber.inneractive.sdk.mraid.C4443a;
import com.fyber.inneractive.sdk.mraid.C4444a0;
import com.fyber.inneractive.sdk.mraid.C4445b;
import com.fyber.inneractive.sdk.mraid.C4446b0;
import com.fyber.inneractive.sdk.mraid.C4447c;
import com.fyber.inneractive.sdk.mraid.C4448d;
import com.fyber.inneractive.sdk.mraid.C4449e;
import com.fyber.inneractive.sdk.mraid.C4450f;
import com.fyber.inneractive.sdk.mraid.C4451g;
import com.fyber.inneractive.sdk.mraid.C4452h;
import com.fyber.inneractive.sdk.mraid.C4453i;
import com.fyber.inneractive.sdk.mraid.C4454j;
import com.fyber.inneractive.sdk.mraid.C4455k;
import com.fyber.inneractive.sdk.mraid.C4456l;
import com.fyber.inneractive.sdk.mraid.C4457m;
import com.fyber.inneractive.sdk.mraid.C4458n;
import com.fyber.inneractive.sdk.mraid.C4459o;
import com.fyber.inneractive.sdk.mraid.C4460p;
import com.fyber.inneractive.sdk.mraid.C4461q;
import com.fyber.inneractive.sdk.mraid.C4462r;
import com.fyber.inneractive.sdk.mraid.C4464t;
import com.fyber.inneractive.sdk.mraid.C4465u;
import com.fyber.inneractive.sdk.mraid.C4466v;
import com.fyber.inneractive.sdk.mraid.C4467w;
import com.fyber.inneractive.sdk.mraid.C4468x;
import com.fyber.inneractive.sdk.mraid.C4469y;
import com.fyber.inneractive.sdk.mraid.C4470z;
import com.fyber.inneractive.sdk.network.C4507o;
import com.fyber.inneractive.sdk.network.C4509p;
import com.fyber.inneractive.sdk.network.C4511q;
import com.fyber.inneractive.sdk.response.C5233e;
import com.fyber.inneractive.sdk.util.C5290k;
import com.fyber.inneractive.sdk.util.C5292l;
import com.fyber.inneractive.sdk.util.C5299n;
import com.fyber.inneractive.sdk.util.C5306p0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C5338a;
import com.fyber.inneractive.sdk.web.C5347c;
import com.fyber.inneractive.sdk.web.C5349d;
import com.iab.omid.library.fyber.adsession.AdEvents;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.iab.omid.library.fyber.adsession.AdSessionConfiguration;
import com.iab.omid.library.fyber.adsession.AdSessionContext;
import com.iab.omid.library.fyber.adsession.CreativeType;
import com.iab.omid.library.fyber.adsession.ImpressionType;
import com.iab.omid.library.fyber.adsession.Owner;
import com.iab.omid.library.fyber.adsession.Partner;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.net.URI;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.ui.IAmraidWebViewController */
public class IAmraidWebViewController extends C5349d<C5349d.C5355f> {

    /* renamed from: Y */
    public boolean f13917Y;

    /* renamed from: Z */
    public boolean f13918Z = false;

    /* renamed from: a0 */
    public boolean f13919a0 = false;

    /* renamed from: b0 */
    public boolean f13920b0 = false;

    /* renamed from: c0 */
    public boolean f13921c0 = true;

    /* renamed from: d0 */
    public boolean f13922d0 = false;

    /* renamed from: e0 */
    public C5349d.C5356g f13923e0;

    /* renamed from: f0 */
    public final Runnable f13924f0 = new C5245a();

    /* renamed from: g0 */
    public final Runnable f13925g0 = new C5248b();

    /* renamed from: com.fyber.inneractive.sdk.ui.IAmraidWebViewController$MraidVideoFailedToDisplayError */
    public static class MraidVideoFailedToDisplayError extends InneractiveUnitController.AdDisplayError {
        public MraidVideoFailedToDisplayError(String str) {
            super(str);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.ui.IAmraidWebViewController$a */
    public class C5245a implements Runnable {

        /* renamed from: com.fyber.inneractive.sdk.ui.IAmraidWebViewController$a$a */
        public class C5246a implements ViewTreeObserver.OnPreDrawListener {

            /* renamed from: com.fyber.inneractive.sdk.ui.IAmraidWebViewController$a$a$a */
            public class C5247a implements Runnable {
                public C5247a() {
                }

                public void run() {
                    C4401a.C4402a aVar;
                    AdEvents adEvents;
                    IAmraidWebViewController iAmraidWebViewController = IAmraidWebViewController.this;
                    if (iAmraidWebViewController.f14142w != null && (aVar = iAmraidWebViewController.f14143x) != null) {
                        C4407f fVar = (C4407f) aVar;
                        if (!fVar.f10809d && fVar.f10807b != null && (adEvents = fVar.f10808c) != null) {
                            fVar.f10809d = true;
                            try {
                                adEvents.impressionOccurred();
                            } catch (Throwable th) {
                                fVar.mo24586a(th);
                            }
                        }
                    }
                }
            }

            public C5246a() {
            }

            public boolean onPreDraw() {
                int i;
                C5347c cVar;
                C5347c cVar2 = IAmraidWebViewController.this.f14079b;
                if (cVar2 != null) {
                    cVar2.getViewTreeObserver().removeOnPreDrawListener(this);
                    IAmraidWebViewController iAmraidWebViewController = IAmraidWebViewController.this;
                    iAmraidWebViewController.getClass();
                    ArrayList arrayList = new ArrayList();
                    if (iAmraidWebViewController.f14079b.getScaleX() == 1.0f || iAmraidWebViewController.f14079b.getScaleY() == 1.0f) {
                        arrayList.add(new C4468x(iAmraidWebViewController.f14129K, iAmraidWebViewController.f14130L));
                        arrayList.add(new C4466v(iAmraidWebViewController.f14131M, iAmraidWebViewController.f14132N));
                    } else {
                        arrayList.add(new C4468x(iAmraidWebViewController.f14079b.getWidthDp(), iAmraidWebViewController.f14079b.getHeightDp()));
                        arrayList.add(new C4466v(iAmraidWebViewController.f14079b.getWidthDp(), iAmraidWebViewController.f14079b.getHeightDp()));
                    }
                    C5347c cVar3 = iAmraidWebViewController.f14079b;
                    int c = C5292l.m16512c(cVar3 != null ? cVar3.getWidth() : iAmraidWebViewController.f14131M);
                    C5347c cVar4 = iAmraidWebViewController.f14079b;
                    if (cVar4 != null) {
                        i = cVar4.getHeight();
                    } else {
                        i = iAmraidWebViewController.f14132N;
                    }
                    arrayList.add(new C4465u(0, 0, c, C5292l.m16512c(i)));
                    if (iAmraidWebViewController.f14079b != null) {
                        String arrayList2 = arrayList.toString();
                        if (arrayList2.length() >= 2) {
                            String str = "{" + arrayList2.substring(1, arrayList2.length() - 1) + "}";
                            iAmraidWebViewController.f14079b.mo26448a("window.mraidbridge.fireChangeEvent(" + str + ");");
                            IAlog.m16449d("Fire changes: %s", str);
                        }
                    }
                    C4444a0 a0Var = C4444a0.DEFAULT;
                    iAmraidWebViewController.f14144y = a0Var;
                    iAmraidWebViewController.mo26471a((C4464t) new C4469y(a0Var));
                    C5347c cVar5 = iAmraidWebViewController.f14079b;
                    boolean a = (cVar5 == null || cVar5.getContext() == null) ? false : C5290k.m16488a(new Intent(iAmraidWebViewController.f14079b.getContext(), InneractiveRichMediaVideoPlayerActivityCore.class));
                    C4470z zVar = new C4470z();
                    Intent intent = new Intent("android.intent.action.DIAL");
                    intent.setData(Uri.parse("tel:"));
                    zVar.f10990b = C5290k.m16488a(intent);
                    Intent intent2 = new Intent("android.intent.action.VIEW");
                    intent2.setData(Uri.parse("sms:"));
                    zVar.f10989a = C5290k.m16488a(intent2);
                    zVar.f10991c = C5290k.m16488a(new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.item/event"));
                    zVar.f10993e = a;
                    zVar.f10992d = C5290k.m16496n();
                    iAmraidWebViewController.mo26471a((C4464t) zVar);
                    IAmraidWebViewController iAmraidWebViewController2 = IAmraidWebViewController.this;
                    iAmraidWebViewController2.mo26471a((C4464t) new C4467w(iAmraidWebViewController2.f13923e0));
                    IAmraidWebViewController iAmraidWebViewController3 = IAmraidWebViewController.this;
                    if (iAmraidWebViewController3.f13923e0 == C5349d.C5356g.INTERSTITIAL && (cVar = iAmraidWebViewController3.f14079b) != null) {
                        cVar.mo26448a("showInterstitial();");
                    }
                    C5347c cVar6 = IAmraidWebViewController.this.f14079b;
                    if (cVar6 != null) {
                        cVar6.mo26448a("window.mraidbridge.fireReadyEvent();");
                    }
                    IAmraidWebViewController iAmraidWebViewController4 = IAmraidWebViewController.this;
                    iAmraidWebViewController4.mo26469a(iAmraidWebViewController4.mo26479g(), true);
                    IAmraidWebViewController.this.mo26347n();
                    C5299n.f14024b.postDelayed(new C5247a(), 100);
                }
                return false;
            }
        }

        public C5245a() {
        }

        public void run() {
            C5347c cVar = IAmraidWebViewController.this.f14079b;
            if (cVar != null) {
                cVar.getViewTreeObserver().addOnPreDrawListener(new C5246a());
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.ui.IAmraidWebViewController$b */
    public class C5248b implements Runnable {
        public C5248b() {
        }

        public void run() {
            C5347c cVar = IAmraidWebViewController.this.f14079b;
            if (cVar != null) {
                cVar.mo26448a("if (FyMraidVideo.getCurrentTime() < 0.2) { var ifr = document.createElement('iframe'); var container = document.body || document.documentElement; container.appendChild(ifr); ifr.setAttribute('sandbox', ''); ifr.setAttribute('style', 'position: fixed; bottom: -20px; border: none; visibility: hidden; height: 20px; z-index: -99999'); ifr.setAttribute('src','FyMraidVideo://fyMraidVideoAdPlaybackFailure'); console.log('dispatched closure event'); } else { console.log('video has progressed'); };");
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.ui.IAmraidWebViewController$c */
    public class C5249c implements Runnable {
        public C5249c() {
        }

        public void run() {
            C5347c cVar = IAmraidWebViewController.this.f14079b;
            if (cVar != null) {
                try {
                    cVar.invalidate();
                } catch (Throwable unused) {
                }
            }
        }
    }

    public IAmraidWebViewController(Context context, boolean z, C5349d.C5356g gVar, C5349d.C5353d dVar, C5349d.C5357h hVar, boolean z2, C4401a aVar) {
        super(context, z, false, gVar, dVar, hVar, aVar);
        this.f13917Y = z2;
        this.f14079b.setId(C4109R.C4111id.inneractive_webview_mraid);
        this.f13923e0 = gVar;
    }

    /* renamed from: a */
    public final void mo26341a(long j) {
        C5299n.f14024b.postDelayed(new C5249c(), j);
    }

    /* renamed from: e */
    public void mo26344e(boolean z) {
        C5347c cVar;
        mo26471a((C4464t) new C4446b0(z));
        IAlog.m16446a("%sonWebViewVisibilityChanged called with: %s", IAlog.m16443a((Object) this), Boolean.valueOf(z));
        L l = this.f14084g;
        if (l != null) {
            l.mo26255a(z);
        }
        if (this.f13919a0 && this.f13918Z && this.f13920b0 && (cVar = this.f14079b) != null) {
            StringBuilder sb = new StringBuilder();
            sb.append("FyMraidVideo.");
            sb.append(z ? "play" : CampaignEx.JSON_NATIVE_VIDEO_PAUSE);
            sb.append("();");
            cVar.mo26448a(sb.toString());
        }
        if (this.f14079b != null && z) {
            mo26341a(1);
            mo26341a(100);
            mo26341a(250);
            mo26341a(1000);
        }
    }

    /* renamed from: l */
    public void mo26345l() {
        mo26429a(false);
        Handler handler = C5299n.f14024b;
        handler.removeCallbacks(this.f13925g0);
        handler.removeCallbacks(this.f13924f0);
    }

    /* renamed from: m */
    public void mo26346m() {
        C5347c cVar = this.f14079b;
        if (cVar != null) {
            this.f13918Z = true;
            if (Build.VERSION.SDK_INT >= 17 && this.f13920b0) {
                cVar.getSettings().setMediaPlaybackRequiresUserGesture(false);
            }
            C5299n.f14024b.postDelayed(this.f13924f0, 0);
        }
    }

    /* renamed from: n */
    public final void mo26347n() {
        C5347c cVar;
        if (this.f13918Z && this.f13919a0 && this.f13920b0 && (cVar = this.f14079b) != null) {
            cVar.mo26448a("FyMraidVideo.play()");
            Runnable runnable = this.f13925g0;
            if (runnable != null) {
                C5299n.f14024b.postDelayed(runnable, 5000);
            }
            if (this.f13922d0) {
                this.f14079b.mo26448a("FyMraidVideo.mute(true)");
            }
        }
    }

    public void setAutoplayMRAIDVideos(boolean z) {
        this.f13920b0 = z;
    }

    public void setCenteringTagsRequired(boolean z) {
        this.f13921c0 = z;
    }

    public void setMuteMraidVideo(boolean z) {
        this.f13922d0 = z;
    }

    /* renamed from: a */
    public boolean mo26343a(String str, C5306p0 p0Var) {
        C4450f fVar;
        C5347c cVar;
        C4407f fVar2;
        AdSessionConfiguration adSessionConfiguration;
        AdSessionContext adSessionContext;
        Uri parse = Uri.parse(str);
        String uri = parse.toString();
        parse.getScheme();
        C4445b bVar = null;
        if (uri.startsWith("iaadfinishedloading")) {
            if (uri.endsWith("success")) {
                IAlog.m16449d("received iaadfinishedloading success", new Object[0]);
                if (!(this.f14078a || this.f14083f == null || (cVar = this.f14079b) == null)) {
                    cVar.mo26449a();
                    this.f14078a = true;
                    C4401a aVar = this.f14142w;
                    if (aVar != null) {
                        C5347c cVar2 = this.f14079b;
                        C4361j jVar = this.f14099v;
                        IAlog.m16446a("omsdk initMraidSession", new Object[0]);
                        Partner partner = ((C4405d) aVar).f10804c;
                        if (partner == null) {
                            IAlog.m16446a("omsdk partner is null", new Object[0]);
                            fVar2 = null;
                        } else {
                            fVar2 = new C4407f(partner, cVar2, jVar);
                            try {
                                adSessionConfiguration = AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.UNSPECIFIED, Owner.NATIVE, Owner.NONE, false);
                            } catch (Throwable th) {
                                fVar2.mo24586a(th);
                            }
                            try {
                                adSessionContext = AdSessionContext.createHtmlAdSessionContext(fVar2.f10806a, cVar2, "", "");
                            } catch (Throwable th2) {
                                fVar2.mo24586a(th2);
                                adSessionContext = null;
                            }
                            AdSession createAdSession = AdSession.createAdSession(adSessionConfiguration, adSessionContext);
                            fVar2.f10807b = createAdSession;
                            createAdSession.registerAdView(cVar2);
                            fVar2.f10807b.start();
                            AdEvents createAdEvents = AdEvents.createAdEvents(fVar2.f10807b);
                            fVar2.f10808c = createAdEvents;
                            createAdEvents.loaded();
                        }
                        this.f14143x = fVar2;
                    }
                    IAlog.m16446a("%sIAWebViewController: onWebviewLoaded - load took %d msec", IAlog.m16443a((Object) this), Long.valueOf(System.currentTimeMillis() - this.f14094q));
                    Runnable runnable = this.f14092o;
                    if (runnable != null) {
                        C5299n.f14024b.removeCallbacks(runnable);
                        this.f14092o = null;
                    }
                    C5338a.C5344f fVar3 = this.f14083f;
                    if (fVar3 != null) {
                        fVar3.mo24514a(this);
                    }
                }
            }
            return true;
        } else if (!CampaignEx.JSON_KEY_MRAID.equals(Uri.parse(str).getScheme())) {
            return false;
        } else {
            URI create = URI.create(str);
            String host = create.getHost();
            try {
                Map<String, String> a = mo26467a(create);
                C4450f[] values = C4450f.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        fVar = C4450f.UNSPECIFIED;
                        break;
                    }
                    fVar = values[i];
                    if (fVar.f10976a.equals(host)) {
                        break;
                    }
                    i++;
                }
                switch (fVar.ordinal()) {
                    case 0:
                        bVar = new C4447c(a, this, p0Var);
                        break;
                    case 1:
                        bVar = new C4449e(a, this, p0Var);
                        break;
                    case 2:
                        bVar = new C4462r(a, this, p0Var);
                        break;
                    case 3:
                        bVar = new C4456l(a, this, p0Var);
                        break;
                    case 4:
                        bVar = new C4458n(a, this, p0Var);
                        break;
                    case 5:
                        bVar = new C4454j(a, this, p0Var);
                        break;
                    case 6:
                        bVar = new C4460p(a, this, p0Var);
                        break;
                    case 7:
                        bVar = new C4459o(a, this, p0Var);
                        break;
                    case 8:
                        bVar = new C4457m(a, this, p0Var);
                        break;
                    case 9:
                        bVar = new C4461q(a, this, p0Var);
                        break;
                    case 10:
                        bVar = new C4451g(a, this, p0Var);
                        break;
                    case 11:
                        bVar = new C4452h(a, this, p0Var);
                        break;
                    case 12:
                        bVar = new C4453i(a, this, p0Var);
                        break;
                    case 13:
                        bVar = new C4455k(a, this, p0Var);
                        break;
                    case 14:
                        bVar = new C4448d(a, this, p0Var);
                        break;
                }
                if (bVar == null || ((bVar instanceof C4449e) && this.f14120B == C5349d.C5356g.INTERSTITIAL)) {
                    mo26473b(host);
                    return true;
                }
                bVar.f10961a = host;
                IAlog.m16449d("Processing MRaid command: %s", host);
                if (bVar instanceof C4443a) {
                    mo26430a((C5338a.C5343e) new C5349d.C5359j(this, (C4443a) bVar, p0Var));
                } else {
                    if (bVar.mo24631b()) {
                        mo26433d();
                    }
                    bVar.mo24635a();
                }
                mo26473b(host);
                return true;
            } catch (Exception unused) {
                return true;
            }
        }
    }

    /* renamed from: a */
    public boolean mo26342a(WebView webView, String str) {
        JSONArray jSONArray;
        JSONArray jSONArray2;
        IAlog.m16446a("IAmraidWebViewController: handleUrl = %s", str);
        if (this.f14079b == null) {
            IAlog.m16446a("handleUrl: web view already destroyed. Cannot handle url", new Object[0]);
            return false;
        } else if (str == null || !str.toLowerCase().startsWith("FyMraidVideo".toLowerCase())) {
            return super.mo26342a(webView, str);
        } else {
            if (str.toLowerCase().endsWith("fyMraidVideoAd".toLowerCase())) {
                IAlog.m16449d("Dispatching MRAID Video detection event", new Object[0]);
                C4509p pVar = C4509p.MRAID_VIDEO_DETECTED;
                InneractiveAdRequest inneractiveAdRequest = this.f14098u;
                C4361j jVar = this.f14099v;
                C5233e c = jVar == null ? null : jVar.mo24293c();
                C4361j jVar2 = this.f14099v;
                if (jVar2 == null) {
                    jSONArray2 = null;
                } else {
                    jSONArray2 = jVar2.f10714c.mo24268c();
                }
                C4511q.C4512a aVar = new C4511q.C4512a(c);
                aVar.f11164c = pVar;
                aVar.f11162a = inneractiveAdRequest;
                aVar.f11165d = jSONArray2;
                aVar.mo24693a((String) null);
                this.f13919a0 = true;
                mo26347n();
            } else if (str.toLowerCase().endsWith("fyMraidVideoAdPlaybackFailure".toLowerCase())) {
                IAlog.m16447b("MRAID Video has not started in a timely fashion, showing close button", new Object[0]);
                if (this.f14084g != null) {
                    mo26474b(false);
                    C4507o oVar = C4507o.MRAID_VIDEO_HAS_NOT_STARTED_PLAYING_IN_A_TIMELY_FASHION;
                    InneractiveAdRequest inneractiveAdRequest2 = this.f14098u;
                    C4361j jVar3 = this.f14099v;
                    C5233e c2 = jVar3 == null ? null : jVar3.mo24293c();
                    C4361j jVar4 = this.f14099v;
                    if (jVar4 == null) {
                        jSONArray = null;
                    } else {
                        jSONArray = jVar4.f10714c.mo24268c();
                    }
                    C4511q.C4512a aVar2 = new C4511q.C4512a(c2);
                    aVar2.f11163b = oVar;
                    aVar2.f11162a = inneractiveAdRequest2;
                    aVar2.f11165d = jSONArray;
                    aVar2.mo24692a("video_timeout_in_msecs", String.valueOf(5000)).mo24693a((String) null);
                }
                L l = this.f14084g;
                if (l != null) {
                    ((C5349d.C5355f) l).mo24888a((InneractiveUnitController.AdDisplayError) new MraidVideoFailedToDisplayError("an MRAID video has not started playing in a timely fashion"));
                }
            }
            return true;
        }
    }
}
