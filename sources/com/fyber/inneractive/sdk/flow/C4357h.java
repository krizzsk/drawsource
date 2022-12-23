package com.fyber.inneractive.sdk.flow;

import android.app.Application;
import com.fyber.inneractive.sdk.config.C4203a;
import com.fyber.inneractive.sdk.config.C4287y;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.features.C4232h;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveError;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.measurement.C4401a;
import com.fyber.inneractive.sdk.network.C4507o;
import com.fyber.inneractive.sdk.network.C4509p;
import com.fyber.inneractive.sdk.network.C4511q;
import com.fyber.inneractive.sdk.p191ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.response.C5234f;
import com.fyber.inneractive.sdk.util.C5276g;
import com.fyber.inneractive.sdk.util.C5292l;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C5338a;
import com.fyber.inneractive.sdk.web.C5349d;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.flow.h */
public class C4357h extends C4348c<C5234f, C4379u> {

    /* renamed from: h */
    public IAmraidWebViewController f10707h;

    /* renamed from: i */
    public C5338a.C5344f f10708i = new C4358a();

    /* renamed from: com.fyber.inneractive.sdk.flow.h$b */
    public static /* synthetic */ class C4359b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f10710a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType[] r0 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f10710a = r0
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.INTERSTITIAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f10710a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.C4357h.C4359b.<clinit>():void");
        }
    }

    /* renamed from: a */
    public void mo24491a() {
        IAmraidWebViewController iAmraidWebViewController;
        if (!(this.f10671c == null || (iAmraidWebViewController = this.f10707h) == null)) {
            iAmraidWebViewController.mo26483k();
            this.f10707h.mo26345l();
            this.f10707h = null;
        }
        super.mo24491a();
    }

    /* renamed from: b */
    public String mo24296b() {
        return "send_failed_display_creatives";
    }

    /* renamed from: e */
    public void mo24297e() {
        C5349d.C5353d dVar;
        String str;
        String str2;
        Content uVar = new C4379u(mo24495c(), this.f10674f);
        this.f10671c = uVar;
        C5234f fVar = this.f10670b;
        uVar.f10713b = fVar;
        uVar.f10717f = this.f10675g;
        UnitDisplayType unitDisplayType = fVar.f13878n;
        C5349d.C5356g gVar = C5349d.C5356g.INLINE;
        C4401a aVar = null;
        if (unitDisplayType == null) {
            this.f10708i.mo24515a((C5338a) null, InneractiveErrorCode.SDK_INTERNAL_ERROR);
            return;
        }
        int i = C4359b.f10710a[unitDisplayType.ordinal()];
        boolean z = false;
        if (i == 1 || i == 2) {
            dVar = C5349d.C5353d.ENABLED;
            InneractiveAdRequest inneractiveAdRequest = this.f10669a;
            if (inneractiveAdRequest == null || inneractiveAdRequest.getAllowFullscreen()) {
                gVar = C5349d.C5356g.INTERSTITIAL;
            }
        } else {
            dVar = C5349d.C5353d.ENABLED;
        }
        C5349d.C5356g gVar2 = gVar;
        C5349d.C5353d dVar2 = dVar;
        boolean z2 = !((C5234f) this.f10670b).f13891B.contains("iaNotifyLoadFinished");
        IAConfigManager iAConfigManager = IAConfigManager.f10324J;
        boolean a = C5276g.m16480a(unitDisplayType, iAConfigManager.f10356v.f10459b);
        try {
            Application application = C5292l.f14015a;
            C5349d.C5357h hVar = C5349d.C5357h.AD_CONTROLLED;
            if (((C4232h) this.f10674f.mo24264a(C4232h.class)).mo24244c()) {
                aVar = iAConfigManager.f10334I;
            }
            IAmraidWebViewController iAmraidWebViewController = new IAmraidWebViewController(application, a, gVar2, dVar2, hVar, z2, aVar);
            this.f10707h = iAmraidWebViewController;
            iAmraidWebViewController.setAdContent(this.f10671c);
            this.f10707h.setAdRequest(this.f10669a);
            InneractiveAdRequest inneractiveAdRequest2 = this.f10669a;
            if (!(inneractiveAdRequest2 == null || inneractiveAdRequest2.getSelectedUnitConfig() == null || ((C4287y) this.f10669a.getSelectedUnitConfig()).f10546c == null)) {
                IAmraidWebViewController iAmraidWebViewController2 = this.f10707h;
                C4379u uVar2 = (C4379u) this.f10671c;
                uVar2.getClass();
                iAmraidWebViewController2.setMuteMraidVideo((iAConfigManager.f10346l || uVar2.f10717f) && ((C4287y) this.f10669a.getSelectedUnitConfig()).f10546c.f10490b != UnitDisplayType.REWARDED);
            }
            ((C4379u) this.f10671c).f10770g = this.f10707h;
            Response response = this.f10670b;
            if (response != null) {
                UnitDisplayType unitDisplayType2 = ((C5234f) response).f13878n;
                InneractiveAdRequest inneractiveAdRequest3 = this.f10669a;
                if (inneractiveAdRequest3 == null || inneractiveAdRequest3.getAllowFullscreen()) {
                    z = true;
                }
                StringBuilder sb = new StringBuilder();
                if (unitDisplayType2 != null && unitDisplayType2.isFullscreenUnit() && !z) {
                    sb.append("<script type=\"text/javascript\">  var IaCloseBtnHelper = (function initIaCloseBtnHelper(){    var styleContent = '.celtra-close-button {display:none !important;} .close-button {display:none !important;}';    function getStyle(doc){      var style = doc.createElement('style');      style.type = 'text/css';      if (style.styleSheet){        style.styleSheet.cssText = styleContent;      } else {        style.appendChild(doc.createTextNode(styleContent));      }      return style;    }    function onDomReady(){      var iframes = window.document.getElementsByTagName('iframe'),          i = 0,          len = iframes && iframes.length || 0;      for(; i < len; ++i){        if(!iframes[i].src){          try {            iframes[i].contentDocument.body.appendChild(getStyle(iframes[i].contentDocument));          }catch(e){          }}}}    function registerWindowEvents(){      window.addEventListener('load', function onWindowLoad(){        window.removeEventListener('load', onWindowLoad);        onDomReady();      });    }    return {      init: function init(){        if(window.document.readyState != 'complete'){          registerWindowEvents();        }else{          onDomReady();        }}}})();  IaCloseBtnHelper.init();</script>");
                }
                String sb2 = sb.toString();
                str = m13457a(unitDisplayType2);
                str2 = sb2;
            } else {
                str2 = "";
                str = str2;
            }
            this.f10707h.setAutoplayMRAIDVideos(unitDisplayType.isFullscreenUnit());
            this.f10707h.mo26428a(C4203a.m13184a(), "" + ((C5234f) this.f10670b).f13891B, str2, str, this.f10708i, TimeUnit.SECONDS.toMillis((long) iAConfigManager.f10357w.f10464a.f10459b.mo24271a("DisplayAdLoadTimeOutInSeconds", 10, 3)));
        } catch (Throwable th) {
            mo24494a(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, th));
        }
    }

    /* renamed from: a */
    public static String m13457a(UnitDisplayType unitDisplayType) {
        StringBuilder sb = new StringBuilder();
        if (unitDisplayType != null && !unitDisplayType.isFullscreenUnit()) {
            if (unitDisplayType == UnitDisplayType.BANNER) {
                sb.append(" body {display: flex;} #iawrapper { position:unset !important; display: unset !important; } ");
            } else {
                sb.append(" #iawrapper { position:unset !important; display: unset !important; }");
            }
        }
        return sb.toString();
    }

    /* renamed from: com.fyber.inneractive.sdk.flow.h$a */
    public class C4358a implements C5338a.C5344f {
        public C4358a() {
        }

        /* renamed from: a */
        public void mo24514a(C5338a aVar) {
            C4357h hVar = C4357h.this;
            hVar.getClass();
            IAlog.m16446a("%sweb view returned onReady!", IAlog.m16443a((Object) hVar));
            Response response = C4357h.this.f10670b;
            UnitDisplayType unitDisplayType = response != null ? ((C5234f) response).f13878n : null;
            if (unitDisplayType != null && unitDisplayType.isFullscreenUnit()) {
                C4357h hVar2 = C4357h.this;
                hVar2.getClass();
                try {
                    C4509p pVar = C4509p.EVENT_READY_ON_CLIENT;
                    InneractiveAdRequest inneractiveAdRequest = hVar2.f10669a;
                    Content content = hVar2.f10671c;
                    C4511q.C4512a aVar2 = new C4511q.C4512a(content != null ? (C5234f) ((C4379u) content).f10713b : null);
                    aVar2.f11164c = pVar;
                    aVar2.f11162a = inneractiveAdRequest;
                    aVar2.f11165d = null;
                    aVar2.mo24693a((String) null);
                } catch (Exception unused) {
                }
            }
            C4357h.this.mo24496d();
        }

        /* renamed from: a */
        public void mo24515a(C5338a aVar, InneractiveErrorCode inneractiveErrorCode) {
            InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(inneractiveErrorCode);
            C4357h.this.mo24493a((InneractiveError) inneractiveInfrastructureError);
            C4357h hVar = C4357h.this;
            hVar.getClass();
            IAlog.m16446a("%sweb view returned onFailedLoading!", IAlog.m16443a((Object) hVar));
            C4357h.this.mo24494a(inneractiveInfrastructureError);
            if (inneractiveErrorCode == InneractiveErrorCode.NON_SECURE_CONTENT_DETECTED) {
                C4507o oVar = C4507o.MRAID_ERROR_UNSECURE_CONTENT;
                C4357h hVar2 = C4357h.this;
                InneractiveAdRequest inneractiveAdRequest = hVar2.f10669a;
                Response response = hVar2.f10670b;
                JSONArray c = hVar2.f10674f.mo24268c();
                C4511q.C4512a aVar2 = new C4511q.C4512a(response);
                aVar2.f11163b = oVar;
                aVar2.f11162a = inneractiveAdRequest;
                aVar2.f11165d = c;
                aVar2.mo24693a((String) null);
            }
        }
    }
}
