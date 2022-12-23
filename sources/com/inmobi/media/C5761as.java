package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.C5791bc;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.as */
/* compiled from: NativeUnifiedAdManager */
public class C5761as extends C5771av {

    /* renamed from: k */
    private static final String f14469k = C5761as.class.getSimpleName();

    /* renamed from: l */
    private static final String f14470l = "InMobi";

    /* renamed from: m */
    private C5758aq f14471m;

    /* renamed from: a */
    public void mo34521a() {
    }

    public C5761as(PublisherCallbacks publisherCallbacks) {
        this.f14496h = publisherCallbacks;
    }

    /* renamed from: a */
    public void mo34623a(C5840bp bpVar, Context context) {
        C5758aq aqVar = this.f14471m;
        if (aqVar == null) {
            this.f14471m = new C5758aq(context, new C5791bc.C5793a("native", f14470l).mo34741a(bpVar.f14690a).mo34749b(C5903d.m17571a(context)).mo34750c(bpVar.f14691b).mo34745a(bpVar.f14692c).mo34746a(bpVar.f14693d).mo34751d(bpVar.f14694e).mo34752e(bpVar.f14695f).mo34747a(), this);
        } else {
            aqVar.mo34408a(context);
            this.f14471m.mo34441b(C5903d.m17571a(context));
        }
        if (TextUtils.isEmpty(bpVar.f14694e)) {
            this.f14471m.mo34386J();
        }
        this.f14471m.mo34429a(bpVar.f14692c);
    }

    /* renamed from: l */
    public boolean mo34625l() {
        C5758aq aqVar = this.f14471m;
        return aqVar != null && aqVar.mo34550Z();
    }

    /* renamed from: m */
    public C5706af mo34587m() {
        return this.f14471m;
    }

    /* renamed from: a */
    public void mo34523a(final AdMetaInfo adMetaInfo) {
        this.f14498j = adMetaInfo;
        InMobiAdRequestStatus inMobiAdRequestStatus = new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR);
        C5758aq aqVar = this.f14471m;
        if (aqVar == null) {
            mo34525a((C5706af) null, inMobiAdRequestStatus);
        } else if (aqVar.mo34491u() == null) {
            mo34525a((C5706af) null, inMobiAdRequestStatus);
        } else {
            super.mo34523a(adMetaInfo);
            this.f14497i.post(new Runnable() {
                public final void run() {
                    if (C5761as.this.f14496h != null) {
                        C5761as.this.f14496h.onAdFetchSuccessful(adMetaInfo);
                    }
                }
            });
            if (!mo34625l() && this.f14471m.mo34465e((byte) 1)) {
                this.f14471m.mo34395S();
            }
        }
    }

    /* renamed from: n */
    public void mo34626n() {
        if (this.f14495g == null || this.f14495g.booleanValue()) {
            this.f14495g = Boolean.TRUE;
            C5758aq aqVar = this.f14471m;
            if (aqVar != null && mo34651a(f14470l, aqVar.mo34475i().toString(), this.f14496h)) {
                this.f14494f = 1;
                this.f14471m.mo34495y();
                return;
            }
            return;
        }
        C6195ic.m18378a((byte) 1, f14470l, "Cannot call load() API after calling load(byte[])");
    }

    /* renamed from: b */
    public void mo34533b(final AdMetaInfo adMetaInfo) {
        super.mo34533b(adMetaInfo);
        this.f14494f = 2;
        this.f14497i.post(new Runnable() {
            public final void run() {
                if (C5761as.this.f14496h != null) {
                    C5761as.this.f14496h.onAdLoadSucceeded(adMetaInfo);
                }
            }
        });
    }

    /* renamed from: o */
    public void mo34627o() {
        C5758aq aqVar = this.f14471m;
        if (aqVar != null) {
            aqVar.mo34549Y();
        }
        this.f14471m = null;
    }

    /* renamed from: p */
    public void mo34628p() {
        C5758aq aqVar = this.f14471m;
        if (aqVar == null) {
            C6195ic.m18378a((byte) 1, f14469k, "InMobiNative is not initialized. Ignoring takeAction");
        } else if (aqVar.f14347g != null) {
            aqVar.f14347g.mo35553s();
        }
    }

    /* renamed from: q */
    public void mo34629q() {
        C6234j s;
        C5758aq aqVar = this.f14471m;
        if (aqVar != null && aqVar.mo34477j() == 4 && !(aqVar.mo34473h() instanceof Activity) && (s = aqVar.mo34489s()) != null) {
            ((C6281n) s).mo35552r();
        }
    }

    /* renamed from: r */
    public void mo34630r() {
        C6234j s;
        C5758aq aqVar = this.f14471m;
        if (aqVar != null && aqVar.mo34477j() == 4 && !(aqVar.mo34473h() instanceof Activity) && (s = aqVar.mo34489s()) != null) {
            ((C6281n) s).mo35551q();
        }
    }

    /* renamed from: s */
    public JSONObject mo34631s() {
        C5854ca caVar;
        C5758aq aqVar = this.f14471m;
        if (aqVar == null) {
            return new JSONObject();
        }
        C6234j s = aqVar.mo34489s();
        if (s == null || (caVar = (C5854ca) s.getDataModel()) == null) {
            return null;
        }
        return caVar.f14756i.f14768a;
    }

    /* renamed from: t */
    public String mo34632t() {
        C6234j s;
        C5854ca caVar;
        C5758aq aqVar = this.f14471m;
        if (aqVar == null || (s = aqVar.mo34489s()) == null || (caVar = (C5854ca) s.getDataModel()) == null) {
            return null;
        }
        return caVar.f14756i.f14769b.f14772a;
    }

    /* renamed from: u */
    public String mo34633u() {
        C6234j s;
        C5854ca caVar;
        C5758aq aqVar = this.f14471m;
        if (aqVar == null || (s = aqVar.mo34489s()) == null || (caVar = (C5854ca) s.getDataModel()) == null) {
            return null;
        }
        return caVar.f14756i.f14769b.f14773b;
    }

    /* renamed from: v */
    public String mo34634v() {
        C6234j s;
        C5854ca caVar;
        C5758aq aqVar = this.f14471m;
        if (aqVar == null || (s = aqVar.mo34489s()) == null || (caVar = (C5854ca) s.getDataModel()) == null) {
            return null;
        }
        return caVar.f14756i.f14769b.f14774c;
    }

    /* renamed from: w */
    public String mo34635w() {
        C6234j s;
        C5854ca caVar;
        C5758aq aqVar = this.f14471m;
        if (aqVar == null || (s = aqVar.mo34489s()) == null || (caVar = (C5854ca) s.getDataModel()) == null) {
            return null;
        }
        return caVar.f14756i.f14769b.f14777f;
    }

    /* renamed from: x */
    public String mo34636x() {
        C6234j s;
        C5854ca caVar;
        C5758aq aqVar = this.f14471m;
        if (aqVar == null || (s = aqVar.mo34489s()) == null || (caVar = (C5854ca) s.getDataModel()) == null) {
            return null;
        }
        return caVar.f14756i.f14769b.f14775d;
    }

    /* renamed from: y */
    public float mo34637y() {
        C6234j s;
        C5854ca caVar;
        C5758aq aqVar = this.f14471m;
        if (aqVar == null || (s = aqVar.mo34489s()) == null || (caVar = (C5854ca) s.getDataModel()) == null) {
            return 0.0f;
        }
        return caVar.f14756i.f14769b.f14776e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000b, code lost:
        r0 = (com.inmobi.media.C5854ca) r0.getDataModel();
     */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo34638z() {
        /*
            r2 = this;
            com.inmobi.media.aq r0 = r2.f14471m
            r1 = 0
            if (r0 == 0) goto L_0x001f
            com.inmobi.media.j r0 = r0.mo34489s()
            if (r0 == 0) goto L_0x001a
            java.lang.Object r0 = r0.getDataModel()
            com.inmobi.media.ca r0 = (com.inmobi.media.C5854ca) r0
            if (r0 == 0) goto L_0x001a
            com.inmobi.media.ca$a r0 = r0.f14756i
            com.inmobi.media.ca$a$a r0 = r0.f14769b
            boolean r0 = r0.f14778g
            goto L_0x001b
        L_0x001a:
            r0 = r1
        L_0x001b:
            if (r0 == 0) goto L_0x001f
            r0 = 1
            return r0
        L_0x001f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5761as.mo34638z():boolean");
    }

    /* renamed from: A */
    public Boolean mo34621A() {
        C6234j s;
        C5758aq aqVar = this.f14471m;
        if (aqVar == null || (s = aqVar.mo34489s()) == null) {
            return null;
        }
        return Boolean.valueOf(s instanceof C6296o);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = (com.inmobi.media.C6281n) r0;
     */
    /* renamed from: B */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo34622B() {
        /*
            r4 = this;
            com.inmobi.media.aq r0 = r4.f14471m
            if (r0 == 0) goto L_0x0022
            com.inmobi.media.j r0 = r0.mo34489s()
            if (r0 == 0) goto L_0x0022
            com.inmobi.media.n r0 = (com.inmobi.media.C6281n) r0
            com.inmobi.media.ca r1 = r0.mo35536i()
            if (r1 == 0) goto L_0x0022
            r2 = 0
            com.inmobi.media.ca$a r3 = r1.f14756i
            com.inmobi.media.bw r3 = r3.f14770c
            r0.mo35523a((android.view.View) r2, (com.inmobi.media.C5847bw) r3)
            com.inmobi.media.ca$a r1 = r1.f14756i
            com.inmobi.media.bw r1 = r1.f14770c
            r2 = 1
            r0.mo35524a((com.inmobi.media.C5847bw) r1, (boolean) r2)
        L_0x0022:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5761as.mo34622B():void");
    }

    /* renamed from: b */
    public void mo34624b(C5840bp bpVar, Context context) {
        if (this.f14471m == null) {
            mo34623a(bpVar, context);
        }
        C5758aq aqVar = this.f14471m;
        if (aqVar != null) {
            aqVar.f14463A = true;
        }
    }

    /* renamed from: e */
    public void mo34540e() {
        this.f14497i.post(new Runnable() {
            public final void run() {
                if (C5761as.this.f14496h != null) {
                    C5761as.this.f14496h.onAdImpressed();
                }
            }
        });
    }

    /* renamed from: h */
    public void mo34543h() {
        this.f14497i.post(new Runnable() {
            public final void run() {
                if (C5761as.this.f14496h != null) {
                    C5761as.this.f14496h.onVideoSkipped();
                }
            }
        });
    }

    /* renamed from: f */
    public void mo34541f() {
        this.f14497i.post(new Runnable() {
            public final void run() {
                if (C5761as.this.f14496h != null) {
                    C5761as.this.f14496h.onVideoCompleted();
                }
            }
        });
    }

    /* renamed from: a */
    public void mo34530a(final boolean z) {
        this.f14497i.post(new Runnable() {
            public final void run() {
                if (C5761as.this.f14496h != null) {
                    C5761as.this.f14496h.onAudioStateChanged(z);
                }
            }
        });
    }
}
