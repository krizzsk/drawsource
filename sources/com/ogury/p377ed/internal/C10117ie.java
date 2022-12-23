package com.ogury.p377ed.internal;

import android.content.Context;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import java.util.List;

/* renamed from: com.ogury.ed.internal.ie */
public final class C10117ie {

    /* renamed from: a */
    public static final C10118a f25416a = new C10118a((byte) 0);

    /* renamed from: b */
    private final C10116id f25417b;

    /* renamed from: c */
    private C10134ir f25418c;

    /* renamed from: d */
    private final C10122ii f25419d;

    /* renamed from: e */
    private final C10029fn f25420e;

    /* renamed from: f */
    private long f25421f;

    /* renamed from: g */
    private final Context f25422g;

    private C10117ie(Context context, C10116id idVar, C10134ir irVar, C10122ii iiVar, C10029fn fnVar) {
        C10263mq.m29882b(context, "context");
        C10263mq.m29882b(idVar, "mraidCacheStore");
        C10263mq.m29882b(irVar, "webViewLoader");
        C10263mq.m29882b(iiVar, "chromeVersionHelper");
        C10263mq.m29882b(fnVar, "profigGateway");
        this.f25417b = idVar;
        this.f25418c = irVar;
        this.f25419d = iiVar;
        this.f25420e = fnVar;
        this.f25421f = 80000;
        this.f25422g = context.getApplicationContext();
    }

    public /* synthetic */ C10117ie(Context context, C10116id idVar) {
        this(context, idVar, new C10134ir(), new C10122ii(), C10029fn.f25239a);
    }

    /* renamed from: com.ogury.ed.internal.ie$a */
    public static final class C10118a {
        public /* synthetic */ C10118a(byte b) {
            this();
        }

        private C10118a() {
        }

        /* renamed from: a */
        public static C10117ie m29489a(Context context) {
            C10263mq.m29882b(context, "context");
            return new C10117ie(context, C10116id.f25410a);
        }
    }

    /* renamed from: a */
    public final void mo64898a(C10120ig igVar, List<C9981eb> list, C10119if ifVar) {
        C10263mq.m29882b(igVar, "presageAdGateway");
        C10263mq.m29882b(list, CampaignUnit.JSON_KEY_ADS);
        C10263mq.m29882b(ifVar, "preCacheListener");
        m29485a(ifVar, igVar);
        for (C9981eb next : list) {
            Context context = this.f25422g;
            C10263mq.m29879a((Object) context, "context");
            C10158jh a = C10161jk.m29713a(context, next);
            if (a != null) {
                WebView webView = a;
                this.f25419d.mo64905a(webView);
                C10064gr.m29214a(webView);
                this.f25418c.mo64920a((C10133iq) new C10125ik(a, next, this.f25417b, igVar));
                if (next.mo64540r().length() > 0) {
                    m29484a(next);
                }
            } else {
                ifVar.mo64901b();
                return;
            }
        }
        this.f25418c.mo64919a(this.f25419d, this.f25421f, list.size());
    }

    /* renamed from: a */
    private final void m29485a(C10119if ifVar, C10120ig igVar) {
        this.f25418c.mo64918a(ifVar);
        this.f25418c.mo64921b();
        C10116id.m29475a(igVar);
        m29483a();
    }

    /* renamed from: a */
    private final void m29483a() {
        Context context = this.f25422g;
        C10263mq.m29879a((Object) context, "context");
        C10028fm a = C10029fn.m29114a(context);
        if (a != null) {
            this.f25421f = a.mo64715i();
        }
    }

    /* renamed from: a */
    private final void m29484a(C9981eb ebVar) {
        C10158jh b = m29486b(ebVar);
        if (b != null) {
            C10092hn.m29337a(b);
            this.f25418c.mo64920a((C10133iq) new C10128im(b, ebVar));
        }
    }

    /* renamed from: b */
    private final C10158jh m29486b(C9981eb ebVar) {
        Context context = this.f25422g;
        C10263mq.m29879a((Object) context, "context");
        C10158jh a = C10161jk.m29713a(context, ebVar);
        if (a != null) {
            C10064gr.m29214a((WebView) a);
        }
        return a;
    }

    /* renamed from: a */
    public final void mo64897a(C10120ig igVar) {
        C10263mq.m29882b(igVar, "presageAdGateway");
        this.f25418c.mo64918a((C10119if) null);
        this.f25418c.mo64921b();
        C10116id.m29475a(igVar);
    }
}
