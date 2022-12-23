package com.fyber.inneractive.sdk.flow;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.fyber.inneractive.sdk.C4109R;
import com.fyber.inneractive.sdk.config.C4288z;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.C4251s;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.model.vast.C4420b;
import com.fyber.inneractive.sdk.model.vast.C4421c;
import com.fyber.inneractive.sdk.model.vast.C4425g;
import com.fyber.inneractive.sdk.model.vast.C4426h;
import com.fyber.inneractive.sdk.network.C4473b;
import com.fyber.inneractive.sdk.network.C4494j0;
import com.fyber.inneractive.sdk.network.C4507o;
import com.fyber.inneractive.sdk.network.C4509p;
import com.fyber.inneractive.sdk.network.C4511q;
import com.fyber.inneractive.sdk.network.C4521u;
import com.fyber.inneractive.sdk.player.controller.C4575c;
import com.fyber.inneractive.sdk.response.C5233e;
import com.fyber.inneractive.sdk.response.C5235g;
import com.fyber.inneractive.sdk.util.C5324v0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C5338a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.net.UnknownHostException;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.flow.g */
public class C4354g {

    /* renamed from: a */
    public int f10686a = 2;

    /* renamed from: b */
    public final InneractiveAdRequest f10687b;

    /* renamed from: c */
    public final C5235g f10688c;

    /* renamed from: d */
    public C4251s f10689d;

    /* renamed from: e */
    public C4420b f10690e;

    /* renamed from: f */
    public boolean f10691f = false;

    /* renamed from: g */
    public View f10692g = null;

    /* renamed from: h */
    public Context f10693h;

    /* renamed from: i */
    public C4575c f10694i;

    /* renamed from: j */
    public boolean f10695j;

    /* renamed from: k */
    public C4494j0 f10696k;

    /* renamed from: l */
    public UnitDisplayType f10697l;

    /* renamed from: m */
    public boolean f10698m;

    /* renamed from: n */
    public int f10699n;

    /* renamed from: o */
    public int f10700o;

    /* renamed from: p */
    public C4288z f10701p;

    /* renamed from: q */
    public int f10702q;

    /* renamed from: com.fyber.inneractive.sdk.flow.g$a */
    public class C4355a implements C5338a.C5344f {

        /* renamed from: a */
        public final /* synthetic */ C4421c f10703a;

        public C4355a(C4421c cVar) {
            this.f10703a = cVar;
        }

        /* renamed from: a */
        public void mo24514a(C5338a aVar) {
            boolean unused = C4354g.this.f10691f = true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0061  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo24515a(com.fyber.inneractive.sdk.web.C5338a r7, com.fyber.inneractive.sdk.external.InneractiveErrorCode r8) {
            /*
                r6 = this;
                java.lang.StringBuilder r7 = new java.lang.StringBuilder
                r7.<init>()
                com.fyber.inneractive.sdk.flow.g r8 = com.fyber.inneractive.sdk.flow.C4354g.this
                java.lang.String r8 = com.fyber.inneractive.sdk.util.IAlog.m16443a((java.lang.Object) r8)
                r7.append(r8)
                java.lang.String r8 = " Fetching companion html failed!"
                r7.append(r8)
                java.lang.String r7 = r7.toString()
                r8 = 0
                java.lang.Object[] r0 = new java.lang.Object[r8]
                com.fyber.inneractive.sdk.util.IAlog.m16446a(r7, r0)
                com.fyber.inneractive.sdk.flow.g r7 = com.fyber.inneractive.sdk.flow.C4354g.this
                boolean unused = r7.f10691f = r8
                com.fyber.inneractive.sdk.model.vast.h r7 = com.fyber.inneractive.sdk.model.vast.C4426h.Gif
                com.fyber.inneractive.sdk.model.vast.c r0 = r6.f10703a
                com.fyber.inneractive.sdk.model.vast.h r0 = r0.f10869b
                boolean r7 = r7.equals(r0)
                r0 = 1
                if (r7 == 0) goto L_0x003e
                com.fyber.inneractive.sdk.model.vast.c r7 = r6.f10703a
                java.lang.String r1 = r7.f10873f
                com.fyber.inneractive.sdk.model.vast.h r7 = r7.f10869b
                boolean r7 = com.fyber.inneractive.sdk.util.C5324v0.m16548a(r1, r7)
                if (r7 == 0) goto L_0x003c
                goto L_0x003e
            L_0x003c:
                r7 = r8
                goto L_0x003f
            L_0x003e:
                r7 = r0
            L_0x003f:
                com.fyber.inneractive.sdk.flow.g r1 = com.fyber.inneractive.sdk.flow.C4354g.this
                int r2 = r1.f10702q
                int r3 = r1.f10686a
                if (r2 > r3) goto L_0x005e
                if (r7 == 0) goto L_0x005e
                java.lang.Object[] r7 = new java.lang.Object[r0]
                java.lang.String r0 = com.fyber.inneractive.sdk.util.IAlog.m16443a((java.lang.Object) r6)
                r7[r8] = r0
                java.lang.String r8 = "%sloadHtmlCompanion retry"
                com.fyber.inneractive.sdk.util.IAlog.m16446a(r8, r7)
                com.fyber.inneractive.sdk.flow.g r7 = com.fyber.inneractive.sdk.flow.C4354g.this
                com.fyber.inneractive.sdk.model.vast.c r8 = r6.f10703a
                r7.mo24511a(r8)
                goto L_0x00ad
            L_0x005e:
                r2 = 0
                if (r7 != 0) goto L_0x0075
                com.fyber.inneractive.sdk.network.q$a r7 = new com.fyber.inneractive.sdk.network.q$a
                com.fyber.inneractive.sdk.network.o r3 = com.fyber.inneractive.sdk.network.C4507o.VAST_COMPANION_INCOMPATIBLE_MIMETYPE
                com.fyber.inneractive.sdk.external.InneractiveAdRequest r4 = r1.f10687b
                com.fyber.inneractive.sdk.response.g r1 = r1.f10688c
                r7.<init>(r1)
                r7.f11163b = r3
                r7.f11162a = r4
                r7.f11165d = r2
                r7.mo24693a((java.lang.String) r2)
            L_0x0075:
                com.fyber.inneractive.sdk.network.q$a r7 = new com.fyber.inneractive.sdk.network.q$a
                com.fyber.inneractive.sdk.network.o r1 = com.fyber.inneractive.sdk.network.C4507o.VAST_COMPANION_FAILED_LOADING
                com.fyber.inneractive.sdk.flow.g r3 = com.fyber.inneractive.sdk.flow.C4354g.this
                com.fyber.inneractive.sdk.external.InneractiveAdRequest r4 = r3.f10687b
                com.fyber.inneractive.sdk.response.g r5 = r3.f10688c
                com.fyber.inneractive.sdk.config.global.s r3 = r3.f10689d
                org.json.JSONArray r3 = r3.mo24268c()
                r7.<init>(r5)
                r7.f11163b = r1
                r7.f11162a = r4
                r7.f11165d = r3
                r1 = 2
                java.lang.Object[] r1 = new java.lang.Object[r1]
                java.lang.String r3 = "companion_data"
                r1[r8] = r3
                com.fyber.inneractive.sdk.model.vast.c r3 = r6.f10703a
                org.json.JSONObject r3 = r3.mo24612a()
                r1[r0] = r3
                r7.mo24692a((java.lang.Object[]) r1)
                r7.mo24693a((java.lang.String) r2)
                com.fyber.inneractive.sdk.flow.g r7 = com.fyber.inneractive.sdk.flow.C4354g.this
                boolean unused = r7.f10691f = r8
                com.fyber.inneractive.sdk.flow.g r7 = com.fyber.inneractive.sdk.flow.C4354g.this
                r7.mo24510a()
            L_0x00ad:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.C4354g.C4355a.mo24515a(com.fyber.inneractive.sdk.web.a, com.fyber.inneractive.sdk.external.InneractiveErrorCode):void");
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.flow.g$b */
    public class C4356b implements C4521u<C4494j0.C4495a> {

        /* renamed from: a */
        public final /* synthetic */ C4421c f10705a;

        public C4356b(C4421c cVar) {
            this.f10705a = cVar;
        }

        /* renamed from: a */
        public void mo24154a(Object obj, Exception exc, boolean z) {
            View view;
            C4494j0.C4495a aVar = (C4494j0.C4495a) obj;
            C4354g.this.f10692g = new ImageView(C4354g.this.f10693h);
            C4354g.this.f10692g.setId(C4109R.C4111id.inneractive_vast_endcard_static);
            C4354g.this.f10692g.setContentDescription("inneractive_vast_endcard_static");
            if (exc == null && aVar != null && aVar.f11049b == null) {
                Bitmap bitmap = aVar.f11048a;
                if (bitmap != null && (view = C4354g.this.f10692g) != null) {
                    ((ImageView) view).setImageBitmap(bitmap);
                    boolean unused = C4354g.this.f10691f = true;
                    return;
                }
                return;
            }
            IAlog.m16446a("%s Fetching companion image failed!", IAlog.m16443a((Object) C4354g.this));
            C4421c cVar = this.f10705a;
            boolean a = C5324v0.m16548a(cVar.f10873f, cVar.f10869b);
            if ((aVar == null || (aVar.f11049b != null && ((exc instanceof C4473b) || (exc instanceof UnknownHostException)))) && a) {
                C4354g gVar = C4354g.this;
                if (gVar.f10702q <= gVar.f10686a) {
                    IAlog.m16446a("%sloadStaticCompanion retry", IAlog.m16443a((Object) this));
                    C4354g.this.mo24513b(this.f10705a);
                    return;
                }
            }
            if (!a) {
                C4354g gVar2 = C4354g.this;
                gVar2.getClass();
                new C4511q.C4512a(C4507o.VAST_COMPANION_INCOMPATIBLE_MIMETYPE, gVar2.f10687b, (C5233e) gVar2.f10688c, (JSONArray) null).mo24693a((String) null);
            }
            C4507o oVar = C4507o.VAST_COMPANION_FAILED_LOADING;
            C4354g gVar3 = C4354g.this;
            C4511q.C4512a aVar2 = new C4511q.C4512a(oVar, gVar3.f10687b, (C5233e) gVar3.f10688c, (JSONArray) null);
            JSONObject jSONObject = new JSONObject();
            JSONObject a2 = this.f10705a.mo24612a();
            try {
                jSONObject.put("companion_data", a2);
            } catch (Exception unused2) {
                IAlog.m16450e("Got exception adding param to json object: %s, %s", "companion_data", a2);
            }
            if (aVar != null && !TextUtils.isEmpty(aVar.f11049b)) {
                String str = aVar.f11049b;
                try {
                    jSONObject.put(IronSourceConstants.EVENTS_ERROR_REASON, str);
                } catch (Exception unused3) {
                    IAlog.m16450e("Got exception adding param to json object: %s, %s", IronSourceConstants.EVENTS_ERROR_REASON, str);
                }
            }
            aVar2.f11167f.put(jSONObject);
            aVar2.mo24693a((String) null);
            C4354g.this.mo24510a();
        }
    }

    public C4354g(Context context, C5235g gVar, InneractiveAdRequest inneractiveAdRequest, C4251s sVar) {
        this.f10690e = gVar.mo26318f();
        this.f10693h = context;
        this.f10688c = gVar;
        this.f10687b = inneractiveAdRequest;
        this.f10689d = sVar;
        this.f10686a = IAConfigManager.m13176b().mo24276a().mo24271a("companion_retry_count", 2, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0110  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24511a(com.fyber.inneractive.sdk.model.vast.C4421c r15) {
        /*
            r14 = this;
            com.fyber.inneractive.sdk.factories.b r0 = com.fyber.inneractive.sdk.factories.C4339b.C4340a.f10657a
            com.fyber.inneractive.sdk.response.a r1 = com.fyber.inneractive.sdk.response.C5229a.RETURNED_ADTYPE_HTML
            java.util.HashMap<com.fyber.inneractive.sdk.response.a, com.fyber.inneractive.sdk.factories.b$b> r0 = r0.f10656a
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L_0x000d
            return
        L_0x000d:
            r14.mo24512b()
            int r0 = r14.f10702q
            r1 = 1
            int r0 = r0 + r1
            r14.f10702q = r0
            int r0 = com.fyber.inneractive.sdk.util.IAlog.f13936a
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "COMPANION_TYPE"
            r3 = 0
            r0[r3] = r2
            com.fyber.inneractive.sdk.model.vast.g r2 = r15.f10868a
            java.lang.String r2 = r2.name()
            r0[r1] = r2
            r2 = 0
            java.lang.String r4 = "%s: %s"
            com.fyber.inneractive.sdk.util.IAlog.m16444a(r1, r2, r4, r0)
            com.fyber.inneractive.sdk.player.controller.c r0 = new com.fyber.inneractive.sdk.player.controller.c
            android.content.Context r6 = r14.f10693h
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r7 = r14.f10697l
            boolean r8 = r14.f10698m
            int r9 = r14.f10699n
            int r10 = r14.f10700o
            com.fyber.inneractive.sdk.config.z r11 = r14.f10701p
            com.fyber.inneractive.sdk.model.vast.g r12 = r15.f10868a
            r5 = r0
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            r14.f10694i = r0
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r4 = r0.f11345a
            if (r4 != 0) goto L_0x004a
            r5 = r2
            goto L_0x004c
        L_0x004a:
            com.fyber.inneractive.sdk.web.c r5 = r4.f14079b
        L_0x004c:
            r14.f10692g = r5
            com.fyber.inneractive.sdk.flow.g$a r11 = new com.fyber.inneractive.sdk.flow.g$a
            r11.<init>(r15)
            java.lang.String r5 = r15.f10873f
            com.fyber.inneractive.sdk.model.vast.g r6 = r15.f10868a
            com.fyber.inneractive.sdk.model.vast.g r7 = com.fyber.inneractive.sdk.model.vast.C4425g.Iframe
            java.lang.String r8 = "$__IMGSRC__$"
            if (r6 != r7) goto L_0x0079
            java.lang.String r1 = "fyb_iframe_endcard_tmpl.html"
            java.lang.String r1 = com.fyber.inneractive.sdk.util.C5292l.m16513c((java.lang.String) r1)
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 != 0) goto L_0x00c7
            java.lang.String r4 = r15.f10873f
            java.lang.String r1 = r1.replace(r8, r4)
            java.lang.String r15 = r15.f10873f
            java.lang.String r4 = "$__SrcIframeUrl__$"
            java.lang.String r15 = r1.replace(r4, r15)
        L_0x0077:
            r8 = r15
            goto L_0x00c8
        L_0x0079:
            com.fyber.inneractive.sdk.model.vast.g r7 = com.fyber.inneractive.sdk.model.vast.C4425g.Static
            if (r6 != r7) goto L_0x00c7
            com.fyber.inneractive.sdk.model.vast.h r6 = r15.f10869b
            com.fyber.inneractive.sdk.model.vast.h r7 = com.fyber.inneractive.sdk.model.vast.C4426h.Gif
            if (r6 != r7) goto L_0x00c7
            if (r4 == 0) goto L_0x009a
            com.fyber.inneractive.sdk.web.c r4 = r4.f14079b
            android.webkit.WebSettings r4 = r4.getSettings()
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 17
            if (r6 < r7) goto L_0x0094
            r4.setMediaPlaybackRequiresUserGesture(r3)
        L_0x0094:
            r4.setLoadWithOverviewMode(r1)
            r4.setUseWideViewPort(r1)
        L_0x009a:
            com.fyber.inneractive.sdk.player.controller.c r1 = r14.f10694i
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r1 = r1.f11345a
            if (r1 == 0) goto L_0x00a2
            r1.f13917Y = r3
        L_0x00a2:
            java.lang.String r1 = "fyb_static_endcard_tmpl.html"
            java.lang.String r1 = com.fyber.inneractive.sdk.util.C5292l.m16513c((java.lang.String) r1)
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 != 0) goto L_0x00b4
            java.lang.String r4 = r15.f10873f
            java.lang.String r5 = r1.replace(r8, r4)
        L_0x00b4:
            java.lang.String r15 = r15.f10874g
            if (r15 == 0) goto L_0x00c7
            java.lang.String r1 = "\""
            java.lang.String r4 = "\\\""
            java.lang.String r15 = r15.replace(r1, r4)
            java.lang.String r1 = "$__IMGHREF__$"
            java.lang.String r15 = r5.replace(r1, r15)
            goto L_0x0077
        L_0x00c7:
            r8 = r5
        L_0x00c8:
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r15 = r0.f11345a
            if (r15 == 0) goto L_0x0110
            boolean r15 = android.text.TextUtils.isEmpty(r8)
            if (r15 != 0) goto L_0x0110
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r15 = r0.f11345a
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r1 = r0.f11347c
            boolean r1 = r1.isFullscreenUnit()
            r15.setAutoplayMRAIDVideos(r1)
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r15 = r0.f11345a
            r15.setCenteringTagsRequired(r3)
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r6 = r0.f11345a
            java.lang.String r7 = com.fyber.inneractive.sdk.config.C4203a.m13184a()
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r15 = r0.f11347c
            boolean r1 = r0.f11349e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            if (r15 == 0) goto L_0x0100
            boolean r15 = r15.isFullscreenUnit()
            if (r15 == 0) goto L_0x0100
            if (r1 != 0) goto L_0x0100
            java.lang.String r15 = "<script type=\"text/javascript\">  var IaCloseBtnHelper = (function initIaCloseBtnHelper(){    var styleContent = '.celtra-close-button {display:none !important;} .close-button {display:none !important;}';    function getStyle(doc){      var style = doc.createElement('style');      style.type = 'text/css';      if (style.styleSheet){        style.styleSheet.cssText = styleContent;      } else {        style.appendChild(doc.createTextNode(styleContent));      }      return style;    }    function onDomReady(){      var iframes = window.document.getElementsByTagName('iframe'),          i = 0,          len = iframes && iframes.length || 0;      for(; i < len; ++i){        if(!iframes[i].src){          try {            iframes[i].contentDocument.body.appendChild(getStyle(iframes[i].contentDocument));          }catch(e){          }}}}    function registerWindowEvents(){      window.addEventListener('load', function onWindowLoad(){        window.removeEventListener('load', onWindowLoad);        onDomReady();      });    }    return {      init: function init(){        if(window.document.readyState != 'complete'){          registerWindowEvents();        }else{          onDomReady();        }}}})();  IaCloseBtnHelper.init();</script>"
            r2.append(r15)
        L_0x0100:
            java.lang.String r9 = r2.toString()
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r15 = r0.f11347c
            java.lang.String r10 = com.fyber.inneractive.sdk.flow.C4357h.m13457a(r15)
            r12 = 10000(0x2710, double:4.9407E-320)
            r6.mo26428a(r7, r8, r9, r10, r11, r12)
            goto L_0x0115
        L_0x0110:
            com.fyber.inneractive.sdk.external.InneractiveErrorCode r15 = com.fyber.inneractive.sdk.external.InneractiveErrorCode.UNSPECIFIED
            r11.mo24515a(r2, r15)
        L_0x0115:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.flow.C4354g.mo24511a(com.fyber.inneractive.sdk.model.vast.c):void");
    }

    /* renamed from: b */
    public final void mo24512b() {
        C4509p pVar = C4509p.VAST_COMPANION_LOAD_ATTEMPT;
        InneractiveAdRequest inneractiveAdRequest = this.f10687b;
        C5235g gVar = this.f10688c;
        C4251s sVar = this.f10689d;
        JSONArray c = sVar == null ? null : sVar.mo24268c();
        C4511q.C4512a aVar = new C4511q.C4512a(gVar);
        aVar.f11164c = pVar;
        aVar.f11162a = inneractiveAdRequest;
        aVar.f11165d = c;
        aVar.mo24693a((String) null);
    }

    /* renamed from: b */
    public final void mo24513b(C4421c cVar) {
        mo24512b();
        int i = IAlog.f13936a;
        IAlog.m16444a(1, (Exception) null, "%s: %s", "COMPANION_TYPE", cVar.f10868a.name());
        this.f10702q++;
        C4494j0 j0Var = new C4494j0(new C4356b(cVar), cVar.f10873f);
        this.f10696k = j0Var;
        IAConfigManager.f10324J.f10354t.mo24706c(j0Var);
    }

    /* renamed from: a */
    public void mo24510a() {
        boolean z;
        if (!this.f10691f) {
            IAlog.m16446a("%sloadNextVastCompanion called", IAlog.m16443a((Object) this));
            this.f10695j = false;
            this.f10692g = null;
            if (this.f10690e == null) {
                IAlog.m16446a("%svast data is null! Object must have already been destroyed", IAlog.m16443a((Object) this));
                z = false;
            } else {
                z = true;
            }
            if (this.f10690e.f10864f.size() == 0) {
                IAlog.m16447b("%sgetNextIAvastCompanion - No companion ads found", IAlog.m16443a((Object) this));
                z = false;
            }
            if (!z) {
                IAlog.m16446a("%sno more companion ads available.", IAlog.m16443a((Object) this));
                return;
            }
            C4420b bVar = this.f10690e;
            C4421c poll = bVar.f10864f.poll();
            bVar.f10865g = poll;
            IAlog.m16446a("%sgetNextIAvastCompanion returning: %s", IAlog.m16443a((Object) this), poll);
            this.f10702q = 0;
            if (poll == null) {
                return;
            }
            if (poll.f10868a != C4425g.Static || C4426h.Gif.equals(poll.f10869b)) {
                mo24511a(poll);
            } else {
                mo24513b(poll);
            }
        }
    }
}
