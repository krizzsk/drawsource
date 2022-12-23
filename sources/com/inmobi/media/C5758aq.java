package com.inmobi.media;

import android.content.Context;
import android.view.View;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.C5706af;
import com.tapjoy.TJAdUnitConstants;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.inmobi.media.aq */
/* compiled from: NativeAdUnit */
public final class C5758aq extends C5706af {

    /* renamed from: y */
    public static final String f14462y = C5758aq.class.getSimpleName();

    /* renamed from: A */
    public boolean f14463A = false;

    /* renamed from: B */
    private int f14464B = 0;

    /* renamed from: z */
    public WeakReference<View> f14465z;

    /* renamed from: a */
    public final void mo34551a(int i, C6301q qVar) {
    }

    /* renamed from: b */
    public final void mo34556b() {
    }

    /* renamed from: k */
    public final String mo34479k() {
        return "native";
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final byte mo34481l() {
        return 0;
    }

    C5758aq(Context context, C5791bc bcVar, C5706af.C5724a aVar) {
        super(context, bcVar, aVar);
        bcVar.mo34723e();
        mo34409a(context, bcVar, aVar);
    }

    /* renamed from: a */
    public final void mo34408a(Context context) {
        super.mo34408a(context);
        m17076b(context);
    }

    /* renamed from: aa */
    private boolean m17075aa() {
        C5706af.C5724a p = mo34486p();
        if (mo34494x()) {
            if (p != null) {
                p.mo34525a((C5706af) this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES));
            }
            return false;
        } else if (1 == mo34477j() || 2 == mo34477j()) {
            C6195ic.m18378a((byte) 1, f14462y, "An ad load is already in progress. Please wait for the load to complete before requesting for another ad");
            return false;
        } else {
            String str = f14462y;
            C6195ic.m18378a((byte) 2, str, "Fetching a Native ad for placement id: " + mo34475i().toString());
            if (4 == mo34477j()) {
                if (!mo34487q()) {
                    if (p != null) {
                        m17076b(mo34473h());
                        mo34439b(p);
                        mo34451c(p);
                    }
                    return false;
                }
                mo34549Y();
            }
            this.f14352l = false;
            return true;
        }
    }

    /* renamed from: b */
    private void m17076b(Context context) {
        C6234j s = mo34489s();
        if (s instanceof C6281n) {
            ((C6281n) s).mo35521a(context);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo34417a(C5791bc bcVar, boolean z) {
        super.mo34417a(bcVar, z);
        if (!z) {
            if (!mo34475i().equals(bcVar)) {
                return;
            }
            if (2 == mo34477j() || 4 == mo34477j()) {
                this.f14342b = 0;
                if (mo34486p() != null) {
                    mo34486p().mo34525a((C5706af) this, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE));
                }
            }
        } else if (mo34475i().equals(bcVar) && 2 == mo34477j() && mo34486p() != null && mo34473h() != null) {
            if (this.f14350j) {
                this.f14351k = true;
                mo34391O();
                return;
            }
            mo34392P();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo34440b(C5794bd bdVar) {
        if (TJAdUnitConstants.String.HTML.equals(mo34484n()) || "htmlUrl".equals(mo34484n())) {
            mo34416a(mo34475i(), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), (byte) 57);
        } else {
            super.mo34440b(bdVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo34432a(boolean z, InMobiAdRequestStatus inMobiAdRequestStatus) {
        C5706af.C5724a p;
        super.mo34432a(z, inMobiAdRequestStatus);
        if (mo34477j() == 2 && (p = mo34486p()) != null) {
            mo34439b(p);
        }
    }

    /* renamed from: S */
    public final void mo34395S() {
        mo34382F();
        try {
            if (!mo34394R()) {
                mo34396T();
            }
        } catch (IllegalStateException unused) {
            mo34411a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (byte) 48);
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:4|5|6|7|(2:9|10)(4:11|(2:13|(1:15))(1:16)|17|(2:19|23)(1:24))) */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        mo34411a(new com.inmobi.ads.InMobiAdRequestStatus(com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (byte) com.google.common.base.Ascii.f18296CR);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004e, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x0011 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0024 A[Catch:{ Exception -> 0x0042 }] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017 A[Catch:{ Exception -> 0x0042 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo34415a(com.inmobi.media.C5783aw r2, boolean r3, byte r4) {
        /*
            r1 = this;
            r0 = 1
            if (r3 != 0) goto L_0x000e
            com.inmobi.ads.InMobiAdRequestStatus r2 = new com.inmobi.ads.InMobiAdRequestStatus
            com.inmobi.ads.InMobiAdRequestStatus$StatusCode r3 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR
            r2.<init>(r3)
            r1.mo34411a((com.inmobi.ads.InMobiAdRequestStatus) r2, (boolean) r0, (byte) r4)
            return
        L_0x000e:
            super.mo34415a((com.inmobi.media.C5783aw) r2, (boolean) r3, (byte) r4)     // Catch:{ IllegalStateException -> 0x0011 }
        L_0x0011:
            com.inmobi.media.aw r2 = r1.mo34491u()     // Catch:{ Exception -> 0x0042 }
            if (r2 != 0) goto L_0x0024
            com.inmobi.ads.InMobiAdRequestStatus r2 = new com.inmobi.ads.InMobiAdRequestStatus     // Catch:{ Exception -> 0x0042 }
            com.inmobi.ads.InMobiAdRequestStatus$StatusCode r3 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR     // Catch:{ Exception -> 0x0042 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0042 }
            r3 = 55
            r1.mo34411a((com.inmobi.ads.InMobiAdRequestStatus) r2, (boolean) r0, (byte) r3)     // Catch:{ Exception -> 0x0042 }
            return
        L_0x0024:
            byte r3 = r1.f14348h     // Catch:{ Exception -> 0x0042 }
            if (r3 != 0) goto L_0x0033
            boolean r3 = r2.mo34674d()     // Catch:{ Exception -> 0x0042 }
            if (r3 != 0) goto L_0x0036
            r3 = 0
            r1.mo34482l(r3)     // Catch:{ Exception -> 0x0042 }
            goto L_0x0036
        L_0x0033:
            r1.mo34414a((com.inmobi.media.C5783aw) r2)     // Catch:{ Exception -> 0x0042 }
        L_0x0036:
            boolean r2 = r2.mo34674d()     // Catch:{ Exception -> 0x0042 }
            if (r2 == 0) goto L_0x0041
            r1.f14350j = r0     // Catch:{ Exception -> 0x0042 }
            r1.mo34390N()     // Catch:{ Exception -> 0x0042 }
        L_0x0041:
            return
        L_0x0042:
            com.inmobi.ads.InMobiAdRequestStatus r2 = new com.inmobi.ads.InMobiAdRequestStatus
            com.inmobi.ads.InMobiAdRequestStatus$StatusCode r3 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR
            r2.<init>(r3)
            r3 = 13
            r1.mo34411a((com.inmobi.ads.InMobiAdRequestStatus) r2, (boolean) r0, (byte) r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5758aq.mo34415a(com.inmobi.media.aw, boolean, byte):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public final void mo34392P() {
        this.f14363w.mo35396a(hashCode(), new C5760ar(this));
    }

    /* renamed from: Y */
    public final void mo34549Y() {
        try {
            super.mo34380D();
        } catch (Exception e) {
            C6195ic.m18378a((byte) 1, "InMobi", "Could not destroy native ad; SDK encountered unexpected error");
            C6130gj.m18161a().mo35310a(new C6167hk(e));
        }
    }

    /* renamed from: Z */
    public final boolean mo34550Z() {
        return mo34477j() == 4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final Map<String, String> mo34483m() {
        Map<String, String> m = super.mo34483m();
        m.put("a-parentViewWidth", String.valueOf(C6215il.m18444a().f15672a));
        m.put("a-productVersion", "NS-1.0.0-20160411");
        m.put("trackerType", "url_ping");
        return m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo34468f(C5706af.C5724a aVar) {
        if (mo34477j() == 4) {
            this.f14342b = 6;
        } else if (mo34477j() == 6) {
            this.f14464B++;
        }
        C6195ic.m18378a((byte) 2, "InMobi", "Successfully displayed fullscreen for placement id: " + mo34475i().toString());
        if (this.f14464B != 0) {
            return;
        }
        if (aVar != null) {
            mo34459d(aVar);
        } else {
            C6195ic.m18378a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo34471g(C5706af.C5724a aVar) {
        if (mo34477j() == 6) {
            int i = this.f14464B;
            if (i > 0) {
                this.f14464B = i - 1;
            } else {
                this.f14342b = 4;
            }
        }
        C6195ic.m18378a((byte) 2, "InMobi", "Successfully dismissed fullscreen for placement id: " + mo34475i().toString());
        if (this.f14464B != 0 || mo34477j() != 4) {
            return;
        }
        if (aVar != null) {
            aVar.mo34537c();
        } else {
            C6195ic.m18378a((byte) 2, "InMobi", "Listener was garbage collected. Unable to give callback");
        }
    }

    /* renamed from: y */
    public final void mo34495y() {
        if (!this.f14352l && m17075aa()) {
            super.mo34495y();
        }
    }
}
