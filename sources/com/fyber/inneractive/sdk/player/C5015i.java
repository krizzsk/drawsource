package com.fyber.inneractive.sdk.player;

import android.view.View;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.C4251s;
import com.fyber.inneractive.sdk.config.global.features.C4234j;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveError;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.external.InneractiveVideoError;
import com.fyber.inneractive.sdk.flow.C4354g;
import com.fyber.inneractive.sdk.flow.C4360i;
import com.fyber.inneractive.sdk.flow.C4392y;
import com.fyber.inneractive.sdk.model.vast.C4420b;
import com.fyber.inneractive.sdk.model.vast.C4431m;
import com.fyber.inneractive.sdk.model.vast.C4435q;
import com.fyber.inneractive.sdk.network.C4494j0;
import com.fyber.inneractive.sdk.network.C4507o;
import com.fyber.inneractive.sdk.network.C4511q;
import com.fyber.inneractive.sdk.p191ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.player.C4530a;
import com.fyber.inneractive.sdk.player.controller.C4575c;
import com.fyber.inneractive.sdk.player.controller.C4582g;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.response.C5235g;
import com.fyber.inneractive.sdk.util.C5290k;
import com.fyber.inneractive.sdk.util.C5299n;
import com.fyber.inneractive.sdk.util.C5307q;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C5347c;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.player.i */
public class C5015i implements C5014h {

    /* renamed from: a */
    public C4530a f13369a;

    /* renamed from: b */
    public InneractiveAdRequest f13370b;

    /* renamed from: c */
    public C5235g f13371c;

    /* renamed from: d */
    public C5017b f13372d;

    /* renamed from: e */
    public C4431m f13373e;

    /* renamed from: f */
    public C4530a.C4531a f13374f;

    /* renamed from: g */
    public boolean f13375g = false;

    /* renamed from: h */
    public C4251s f13376h;

    /* renamed from: com.fyber.inneractive.sdk.player.i$a */
    public static /* synthetic */ class C5016a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f13377a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.fyber.inneractive.sdk.external.InneractiveVideoError$Error[] r0 = com.fyber.inneractive.sdk.external.InneractiveVideoError.Error.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f13377a = r0
                com.fyber.inneractive.sdk.external.InneractiveVideoError$Error r1 = com.fyber.inneractive.sdk.external.InneractiveVideoError.Error.ERROR_NO_MEDIA_FILES     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f13377a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.fyber.inneractive.sdk.external.InneractiveVideoError$Error r1 = com.fyber.inneractive.sdk.external.InneractiveVideoError.Error.ERROR_FAILED_PLAYING_MEDIA_FILE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f13377a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.fyber.inneractive.sdk.external.InneractiveVideoError$Error r1 = com.fyber.inneractive.sdk.external.InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f13377a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.fyber.inneractive.sdk.external.InneractiveVideoError$Error r1 = com.fyber.inneractive.sdk.external.InneractiveVideoError.Error.ERROR_PRE_BUFFER_TIMEOUT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f13377a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.fyber.inneractive.sdk.external.InneractiveVideoError$Error r1 = com.fyber.inneractive.sdk.external.InneractiveVideoError.Error.ERROR_BUFFER_TIMEOUT     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.C5015i.C5016a.<clinit>():void");
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.i$b */
    public interface C5017b {
    }

    public C5015i(C5235g gVar, InneractiveAdRequest inneractiveAdRequest, C4392y yVar, C5017b bVar) {
        this.f13370b = inneractiveAdRequest;
        this.f13371c = gVar;
        this.f13372d = bVar;
        this.f13376h = yVar.mo24518b();
        this.f13369a = new C4530a(yVar);
    }

    /* renamed from: a */
    public final C4507o mo25601a(InneractiveVideoError.Error error) {
        int i = C5016a.f13377a[error.ordinal()];
        if (i == 1) {
            return C4507o.VAST_ERROR_NO_MEDIA_FILES;
        }
        if (i == 2) {
            return C4507o.VAST_ERROR_FAILED_PLAYING_MEDIA_FILE;
        }
        if (i == 3) {
            return C4507o.VAST_ERROR_FAILED_PLAYING_ALL_MEDIA_FILES;
        }
        if (i == 4) {
            return C4507o.VAST_ERROR_PRE_BUFFER_TIMEOUT;
        }
        if (i == 5) {
            return C4507o.VAST_ERROR_BUFFER_TIMEOUT;
        }
        IAlog.m16446a("IAReportError, Does not know player error " + error.getErrorString(), new Object[0]);
        return C4507o.VAST_UNKNOWN_PLAYER_ERROR;
    }

    /* renamed from: b */
    public final void mo25605b() {
        C4507o a = mo25601a(new InneractiveVideoError(InneractiveVideoError.Error.ERROR_FAILED_PLAYING_ALL_MEDIA_FILES).getPlayerError());
        InneractiveAdRequest inneractiveAdRequest = this.f13370b;
        C5235g gVar = this.f13371c;
        JSONArray c = this.f13376h.mo24268c();
        C4511q.C4512a aVar = new C4511q.C4512a(gVar);
        aVar.f11163b = a;
        aVar.f11162a = inneractiveAdRequest;
        aVar.f11165d = c;
        aVar.mo24693a((String) null);
    }

    /* renamed from: c */
    public C4530a.C4531a mo25606c() {
        return this.f13374f;
    }

    /* renamed from: d */
    public final void mo25607d() {
        C4530a.C4531a aVar = this.f13374f;
        if (aVar != null) {
            C4431m mVar = this.f13373e;
            C5008f fVar = (C5008f) aVar;
            fVar.f11223t = this;
            if (mVar != null) {
                String str = mVar.f10916g;
                fVar.f11225v = mVar;
                fVar.f11222s++;
                fVar.f11218o = false;
                fVar.f11220q = false;
                fVar.f11206c = str;
                IAlog.m16446a("IAMediaPlayerFlowManager: playNextMediaFile - loading video url: %s", str);
                C5307q qVar = fVar.f11216m;
                if (qVar != null) {
                    qVar.cancel(true);
                    qVar.f14033b = null;
                    fVar.f11217n = null;
                }
                if (fVar.f11217n == null) {
                    fVar.f11217n = new C4606d(fVar);
                }
                IAlog.m16446a("IAMediaPlayerFlowManager: start - start fetching video frame", new Object[0]);
                if (!fVar.f11205b.mo24786a()) {
                    C5307q qVar2 = new C5307q(fVar.f11204a, fVar.f11217n, fVar.f11206c, (String) null, 81920);
                    fVar.f11216m = qVar2;
                    qVar2.executeOnExecutor(C5299n.f14023a, new Void[0]);
                }
                if (!fVar.f11219p) {
                    fVar.f11205b.mo24784a(str, fVar.f11224u);
                }
                int i = 10;
                if (C5290k.m16495m()) {
                    C4251s sVar = fVar.f11207d;
                    int a = IAConfigManager.f10324J.f10356v.f10459b.mo24271a("VASTLoadTimeoutWiFi", 10, 1);
                    if (sVar != null) {
                        Integer b = ((C4234j) sVar.mo24264a(C4234j.class)).mo24240b("load_timeout_wifi");
                        if (b != null) {
                            i = b.intValue();
                        }
                    } else {
                        i = a;
                    }
                } else {
                    C4251s sVar2 = fVar.f11207d;
                    i = IAConfigManager.f10324J.f10356v.f10459b.mo24271a("VASTLoadTimeout3G", 30, 1);
                    if (sVar2 != null) {
                        Integer b2 = ((C4234j) sVar2.mo24264a(C4234j.class)).mo24240b("load_timeout_3g");
                        i = b2 != null ? b2.intValue() : 30;
                    }
                }
                fVar.mo24713a((long) (i * 1000));
                fVar.f13360B.mo24510a();
                return;
            }
            return;
        }
        C5017b bVar = this.f13372d;
        InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR);
        C4360i iVar = (C4360i) bVar;
        iVar.mo24493a((InneractiveError) inneractiveInfrastructureError);
        iVar.mo24494a(inneractiveInfrastructureError);
    }

    /* renamed from: e */
    public final void mo25608e() {
        try {
            this.f13374f = this.f13369a.mo24711a();
        } catch (Throwable th) {
            C5017b bVar = this.f13372d;
            InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, th);
            C4360i iVar = (C4360i) bVar;
            iVar.mo24493a((InneractiveError) inneractiveInfrastructureError);
            iVar.mo24494a(inneractiveInfrastructureError);
        }
    }

    /* renamed from: a */
    public void mo25602a() {
        C4575c cVar;
        IAmraidWebViewController iAmraidWebViewController;
        C4530a.C4531a aVar = this.f13369a.f11201b;
        if (aVar != null) {
            C5008f fVar = (C5008f) aVar;
            fVar.f11219p = true;
            IAlog.m16446a("IAMediaPlayerFlowManager: destroy", new Object[0]);
            View c = fVar.mo24721c();
            if (c != null && (c instanceof C5347c)) {
                ((C5347c) c).destroy();
            }
            C5307q qVar = fVar.f11216m;
            if (qVar != null) {
                qVar.cancel(true);
                qVar.f14033b = null;
                fVar.f11217n = null;
            }
            fVar.mo24712a();
            C4582g gVar = fVar.f11205b;
            if (gVar != null) {
                gVar.mo24787b();
                fVar.f11205b = null;
            }
            fVar.f11215l = null;
            fVar.f11223t = null;
            Runnable runnable = fVar.f11208e;
            if (runnable != null) {
                C5299n.f14024b.removeCallbacks(runnable);
            }
            C4354g gVar2 = fVar.f13360B;
            if (gVar2 != null) {
                gVar2.f10691f = false;
                View view = gVar2.f10692g;
                if (!(view == null || !(view instanceof C5347c) || (cVar = gVar2.f10694i) == null || (iAmraidWebViewController = cVar.f11345a) == null)) {
                    iAmraidWebViewController.mo26345l();
                    cVar.f11345a = null;
                }
                C4494j0 j0Var = gVar2.f10696k;
                if (j0Var != null) {
                    j0Var.f11022a = true;
                }
                gVar2.f10694i = null;
            }
            fVar.f13360B = null;
        }
    }

    /* renamed from: a */
    public void mo25603a(InneractiveVideoError inneractiveVideoError, InneractiveErrorCode inneractiveErrorCode, JSONObject jSONObject, boolean z) {
        C4420b bVar;
        C4507o a = mo25601a(inneractiveVideoError.getPlayerError());
        InneractiveAdRequest inneractiveAdRequest = this.f13370b;
        C5235g gVar = this.f13371c;
        JSONArray c = this.f13376h.mo24268c();
        C4511q.C4512a aVar = new C4511q.C4512a(gVar);
        aVar.f11163b = a;
        aVar.f11162a = inneractiveAdRequest;
        aVar.f11165d = c;
        if (jSONObject != null) {
            try {
                aVar.f11167f.put(new JSONObject(jSONObject.toString()));
            } catch (Exception unused) {
            }
        }
        aVar.mo24693a((String) null);
        IAlog.m16446a("got onMediaPlayerLoadError with: " + inneractiveVideoError.getPlayerError(), new Object[0]);
        InneractiveErrorCode inneractiveErrorCode2 = z ? InneractiveErrorCode.LOAD_TIMEOUT : null;
        IAlog.m16446a("got onMediaPlayerLoadError with: " + inneractiveVideoError.description(), new Object[0]);
        if (inneractiveVideoError.getPlayerError().isFatal()) {
            inneractiveErrorCode2 = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
        }
        if (inneractiveErrorCode2 == null) {
            inneractiveErrorCode2 = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
        }
        if (InneractiveErrorCode.NON_SECURE_CONTENT_DETECTED == null) {
            C4507o oVar = C4507o.VPAID_ERROR_UNSECURE_CONTENT;
            InneractiveAdRequest inneractiveAdRequest2 = this.f13370b;
            C5235g gVar2 = this.f13371c;
            JSONArray c2 = this.f13376h.mo24268c();
            C4511q.C4512a aVar2 = new C4511q.C4512a(gVar2);
            aVar2.f11163b = oVar;
            aVar2.f11162a = inneractiveAdRequest2;
            aVar2.f11165d = c2;
            aVar2.mo24693a((String) null);
        }
        this.f13373e = null;
        C5235g gVar3 = this.f13371c;
        if (!(gVar3 == null || (bVar = gVar3.f13893C) == null)) {
            this.f13373e = bVar.f10862d.poll();
        }
        if (this.f13373e == null) {
            mo25605b();
            C5017b bVar2 = this.f13372d;
            if (bVar2 != null) {
                InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(inneractiveErrorCode2, inneractiveVideoError.getCause());
                C4360i iVar = (C4360i) bVar2;
                iVar.mo24493a((InneractiveError) inneractiveInfrastructureError);
                iVar.mo24494a(inneractiveInfrastructureError);
                mo25602a();
            }
        } else if (!this.f13375g) {
            mo25608e();
            mo25607d();
        }
    }

    /* renamed from: a */
    public void mo25604a(String str, String... strArr) {
        C4530a.C4531a aVar = this.f13374f;
        if (aVar != null) {
            C5008f fVar = (C5008f) aVar;
            fVar.getClass();
            if ("TRACKING_COMPLETED".equalsIgnoreCase(str)) {
                fVar.f13364z = true;
            } else if ("EVENT_TRACKING".equalsIgnoreCase(str)) {
                for (String a : strArr) {
                    fVar.mo24716a(fVar.f13362x, VideoClickOrigin.InvalidOrigin, C4435q.m13617a(a));
                }
            }
        }
    }
}
