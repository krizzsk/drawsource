package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.C5706af;
import com.smaato.sdk.video.vast.model.ErrorCode;
import com.tapjoy.TJAdUnitConstants;

/* renamed from: com.inmobi.media.an */
/* compiled from: InterstitialAdUnit */
public class C5745an extends C5706af {

    /* renamed from: y */
    private static final String f14435y = C5745an.class.getSimpleName();

    /* renamed from: A */
    private boolean f14436A = false;

    /* renamed from: z */
    private int f14437z = 0;

    /* renamed from: a */
    public void mo34551a(int i, C6301q qVar) {
    }

    /* renamed from: k */
    public String mo34479k() {
        return "int";
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final byte mo34481l() {
        return 1;
    }

    public C5745an(Context context, C5791bc bcVar, C5706af.C5724a aVar) {
        super(context, bcVar, aVar);
        bcVar.mo34723e();
        mo34409a(context, bcVar, aVar);
        mo34441b("activity");
    }

    /* renamed from: t */
    public C6301q mo34490t() {
        C6301q t = super.mo34490t();
        if (this.f14436A && t != null) {
            t.mo35448a();
        }
        return t;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x00b6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b7  */
    /* renamed from: aa */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m17010aa() {
        /*
            r9 = this;
            boolean r0 = r9.mo34494x()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0015
            com.inmobi.ads.InMobiAdRequestStatus r0 = new com.inmobi.ads.InMobiAdRequestStatus
            com.inmobi.ads.InMobiAdRequestStatus$StatusCode r3 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.MISSING_REQUIRED_DEPENDENCIES
            r0.<init>(r3)
            r3 = 39
            r9.mo34411a((com.inmobi.ads.InMobiAdRequestStatus) r0, (boolean) r2, (byte) r3)
            return r1
        L_0x0015:
            com.inmobi.media.af$a r0 = r9.mo34486p()
            if (r0 != 0) goto L_0x001c
            return r1
        L_0x001c:
            byte r3 = r9.mo34477j()
            r4 = 53
            java.lang.String r5 = "An ad load is already in progress. Please wait for the load to complete before requesting for another ad for placement id: "
            r6 = 2
            java.lang.String r7 = "InMobiInterstitial"
            if (r3 == r2) goto L_0x0099
            if (r3 == r6) goto L_0x005f
            r4 = 6
            if (r3 == r4) goto L_0x0034
            r4 = 7
            if (r3 == r4) goto L_0x0034
            r0 = r1
            goto L_0x00b4
        L_0x0034:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "An ad is currently being viewed by the user. Please wait for the user to close the ad before requesting for another ad for placement id: "
            r3.<init>(r4)
            com.inmobi.media.bc r4 = r9.mo34475i()
            java.lang.String r4 = r4.toString()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.inmobi.media.C6195ic.m18378a((byte) r2, (java.lang.String) r7, (java.lang.String) r3)
            com.inmobi.ads.InMobiAdRequestStatus r3 = new com.inmobi.ads.InMobiAdRequestStatus
            com.inmobi.ads.InMobiAdRequestStatus$StatusCode r4 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.AD_ACTIVE
            r3.<init>(r4)
            r4 = 15
            r9.mo34404a((byte) r4)
            if (r0 == 0) goto L_0x00b3
            r0.mo34525a((com.inmobi.media.C5706af) r9, (com.inmobi.ads.InMobiAdRequestStatus) r3)
            goto L_0x00b3
        L_0x005f:
            java.lang.String r3 = r9.mo34484n()
            java.lang.String r8 = "html"
            boolean r3 = r8.equals(r3)
            if (r3 != 0) goto L_0x007e
            java.lang.String r3 = r9.mo34484n()
            java.lang.String r8 = "htmlUrl"
            boolean r3 = r8.equals(r3)
            if (r3 == 0) goto L_0x0078
            goto L_0x007e
        L_0x0078:
            if (r0 == 0) goto L_0x00b3
            r9.mo34439b((com.inmobi.media.C5706af.C5724a) r0)
            goto L_0x00b3
        L_0x007e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            com.inmobi.media.bc r3 = r9.mo34475i()
            java.lang.String r3 = r3.toString()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.inmobi.media.C6195ic.m18378a((byte) r2, (java.lang.String) r7, (java.lang.String) r0)
            r9.mo34437b((byte) r4)
            goto L_0x00b3
        L_0x0099:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r5)
            com.inmobi.media.bc r3 = r9.mo34475i()
            java.lang.String r3 = r3.toString()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.inmobi.media.C6195ic.m18378a((byte) r2, (java.lang.String) r7, (java.lang.String) r0)
            r9.mo34437b((byte) r4)
        L_0x00b3:
            r0 = r2
        L_0x00b4:
            if (r0 == 0) goto L_0x00b7
            return r1
        L_0x00b7:
            r0 = 4
            byte r3 = r9.mo34477j()
            if (r0 != r3) goto L_0x00db
            boolean r0 = r9.mo34487q()
            if (r0 == 0) goto L_0x00c8
            r9.mo34380D()
            goto L_0x00db
        L_0x00c8:
            com.inmobi.media.af$a r0 = r9.mo34486p()
            if (r0 != 0) goto L_0x00d4
            java.lang.String r0 = "Listener was garbage collected. Unable to give callback"
            com.inmobi.media.C6195ic.m18378a((byte) r6, (java.lang.String) r7, (java.lang.String) r0)
            goto L_0x00da
        L_0x00d4:
            r9.mo34439b((com.inmobi.media.C5706af.C5724a) r0)
            r9.mo34451c((com.inmobi.media.C5706af.C5724a) r0)
        L_0x00da:
            return r1
        L_0x00db:
            r9.f14352l = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5745an.m17010aa():boolean");
    }

    /* renamed from: y */
    public void mo34495y() {
        if (m17010aa()) {
            super.mo34495y();
        }
    }

    /* renamed from: a */
    public void mo34433a(byte[] bArr) {
        if (m17010aa()) {
            super.mo34433a(bArr);
        }
    }

    /* renamed from: h */
    public void mo34603h(C5706af.C5724a aVar) {
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            mo34411a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.CALLED_FROM_WRONG_THREAD), false, (byte) 44);
            C6195ic.m18378a((byte) 1, "InMobiInterstitial", "Please ensure that you call show() on the UI thread");
        } else if (aVar == null) {
            C6195ic.m18378a((byte) 2, "InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
        } else if (!mo34549Y()) {
            C6195ic.m18378a((byte) 1, f14435y, "Ad Load is not complete. Please wait for the Ad to be in a ready state before calling show.");
            mo34413a(aVar, (byte) 50);
        } else {
            mo34412a(aVar);
            this.f14342b = 6;
            if (!TJAdUnitConstants.String.HTML.equals(mo34484n()) && !"htmlUrl".equals(mo34484n())) {
                this.f14363w.mo35396a(hashCode(), new C5744am(this, aVar));
            } else if (mo34487q()) {
                mo34602b(aVar, (byte) 36);
                C6234j s = mo34489s();
                if (s != null) {
                    s.destroy();
                }
            } else {
                mo34604i(aVar);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final void mo34604i(C5706af.C5724a aVar) {
        boolean b = m17013b(mo34473h());
        if (aVar == null) {
            C6195ic.m18378a((byte) 2, "InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
        } else if (!b) {
            this.f14342b = 3;
            mo34413a(aVar, (byte) 51);
        } else {
            aVar.mo34532b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean m17013b(Context context) {
        if (context == null) {
            return false;
        }
        try {
            InMobiAdActivity.class.getSimpleName();
            C6234j s = mo34489s();
            if (s != null) {
                if (!"unknown".equals(s.getMarkupType())) {
                    int a = InMobiAdActivity.m23146a(s);
                    Intent intent = new Intent(context, InMobiAdActivity.class);
                    intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX", a);
                    intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 102);
                    if (mo34484n().equals("htmlUrl")) {
                        intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_TYPE", ErrorCode.DIFFERENT_DURATION_EXPECTED_ERROR);
                    } else if (mo34484n().equals(TJAdUnitConstants.String.HTML)) {
                        intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_TYPE", 200);
                    } else {
                        intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_TYPE", ErrorCode.DIFFERENT_LINEARITY_EXPECTED_ERROR);
                    }
                    intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_IS_FULL_SCREEN", true);
                    if (this.f14362v) {
                        if (this.f14360t == -1) {
                            this.f14360t = System.currentTimeMillis();
                        }
                        if (this.f14359s > 0) {
                            intent.setFlags(603979776);
                        }
                    }
                    C6183hw.m18313a(context, intent);
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            C6195ic.m18378a((byte) 1, "InMobiInterstitial", "Cannot show ad; SDK encountered an unexpected error");
            C6130gj.m18161a().mo35310a(new C6167hk(e));
            return false;
        }
    }

    /* renamed from: Y */
    public boolean mo34549Y() {
        return mo34477j() == 4;
    }

    /* renamed from: Z */
    public void mo34550Z() {
        C6234j s = mo34489s();
        if (s != null) {
            this.f14436A = true;
            s.mo35448a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public final Integer mo34493w() {
        return Integer.valueOf(this.f14343c.minimumRefreshInterval);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo34432a(boolean z, InMobiAdRequestStatus inMobiAdRequestStatus) {
        super.mo34432a(z, inMobiAdRequestStatus);
        if (mo34477j() == 2) {
            C6195ic.m18378a((byte) 2, "InMobiInterstitial", "Interstitial ad successfully fetched for placement id: " + mo34475i().toString());
            mo34393Q();
        }
    }

    /* renamed from: S */
    public void mo34395S() {
        mo34382F();
        try {
            if (!mo34394R()) {
                mo34396T();
                String n = mo34484n();
                char c = 65535;
                int hashCode = n.hashCode();
                if (hashCode != -1084172778) {
                    if (hashCode != 3213227) {
                        if (hashCode == 1236050372) {
                            if (n.equals("htmlUrl")) {
                                c = 1;
                            }
                        }
                    } else if (n.equals(TJAdUnitConstants.String.HTML)) {
                        c = 0;
                    }
                } else if (n.equals("inmobiJson")) {
                    c = 2;
                }
                if (c == 0 || c == 1) {
                    this.f14349i.post(new Runnable() {
                        public final void run() {
                            C5745an.this.mo34431a(true);
                            if (C5745an.this.f14362v) {
                                for (int i = 1; i < C5745an.this.f14356p.mo34756b().size(); i++) {
                                    C5745an.this.f14358r++;
                                    C5745an.this.mo34431a(false);
                                }
                            }
                        }
                    });
                } else if (c != 2) {
                    mo34484n();
                }
            }
        } catch (IllegalStateException unused) {
            mo34411a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (byte) 48);
        }
    }

    /* renamed from: a */
    public void mo34415a(C5783aw awVar, boolean z, byte b) {
        if (!z) {
            mo34411a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, b);
            return;
        }
        try {
            super.mo34415a(awVar, z, b);
        } catch (IllegalStateException unused) {
        }
        C5783aw u = mo34491u();
        if (u == null) {
            mo34411a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), true, (byte) 55);
        } else if (u.mo34674d()) {
            this.f14350j = true;
            mo34390N();
        } else {
            mo34414a(u);
        }
    }

    /* renamed from: a */
    public void mo34417a(C5791bc bcVar, boolean z) {
        super.mo34417a(bcVar, z);
        if (!z) {
            if (!mo34475i().equals(bcVar)) {
                return;
            }
            if (2 == mo34477j() || 4 == mo34477j()) {
                this.f14342b = 0;
                mo34411a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.AD_NO_LONGER_AVAILABLE), false, (byte) 0);
            }
        } else if (mo34475i().equals(bcVar) && 2 == mo34477j()) {
            if (this.f14350j) {
                this.f14351k = true;
                mo34391O();
                return;
            }
            mo34392P();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public final void mo34392P() {
        mo34385I();
        this.f14342b = 4;
        C5706af.C5724a p = mo34486p();
        if (p != null && p.mo34542g()) {
            mo34451c(p);
        }
    }

    /* renamed from: j */
    public void mo34478j(C6301q qVar) {
        super.mo34478j(qVar);
        if (this.f14362v) {
            int indexOf = this.f14344d.indexOf(qVar);
            if (indexOf >= this.f14359s) {
                this.f14361u.add(Integer.valueOf(indexOf));
                boolean z = false;
                int i = 0;
                while (true) {
                    if (i >= indexOf) {
                        z = true;
                        break;
                    } else if (this.f14344d.get(i) != null) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (z && mo34477j() == 2) {
                    mo34467f((byte) 2);
                    this.f14359s = indexOf;
                    m17012ac();
                }
            }
        } else if (mo34477j() == 2) {
            mo34467f((byte) 2);
            m17012ac();
        }
    }

    /* renamed from: k */
    public void mo34480k(C6301q qVar) {
        super.mo34480k(qVar);
        if (this.f14362v) {
            int indexOf = this.f14344d.indexOf(qVar);
            mo34458d(indexOf);
            boolean z = false;
            boolean z2 = true;
            int i = 0;
            boolean z3 = true;
            while (true) {
                if (i >= this.f14344d.size()) {
                    z = z2;
                    i = -1;
                    break;
                }
                if (!(i == indexOf || this.f14344d.get(i) == null)) {
                    if (this.f14361u.contains(Integer.valueOf(i))) {
                        break;
                    }
                    z2 = false;
                    z3 = false;
                }
                i++;
            }
            if (i != -1) {
                if (z3 && mo34477j() == 2) {
                    mo34467f((byte) 2);
                    this.f14359s = i;
                    m17012ac();
                }
            } else if (z) {
                m17011ab();
            }
        } else {
            m17011ab();
        }
    }

    /* renamed from: ab */
    private void m17011ab() {
        if (mo34477j() == 2) {
            mo34467f((byte) 2);
            this.f14342b = 3;
            C6195ic.m18378a((byte) 2, "InMobiInterstitial", "Failed to load the Interstitial markup in the WebView for placement id: " + mo34475i().toString());
            mo34411a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), false, (byte) 43);
        }
    }

    /* renamed from: ac */
    private void m17012ac() {
        C6195ic.m18378a((byte) 2, "InMobiInterstitial", "Successfully loaded Interstitial ad markup in the WebView for placement id: " + mo34475i().toString());
        mo34378B();
        mo34392P();
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final void mo34383G() {
        if (2 == mo34477j()) {
            mo34467f((byte) 2);
            this.f14342b = 3;
            C6195ic.m18378a((byte) 2, "InMobiInterstitial", "Failed to load the Interstitial markup in the WebView for placement id: " + mo34475i().toString());
            mo34411a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), false, (byte) 42);
        }
    }

    /* renamed from: a_ */
    public synchronized void mo34552a_(C6301q qVar) {
        super.mo34552a_(qVar);
        this.f14349i.post(new Runnable() {
            public final void run() {
                C5745an anVar = C5745an.this;
                anVar.mo34468f(anVar.mo34486p());
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo34468f(C5706af.C5724a aVar) {
        if (mo34477j() == 6) {
            int i = this.f14437z + 1;
            this.f14437z = i;
            if (i == 1) {
                C6195ic.m18378a((byte) 2, "InMobiInterstitial", "Successfully displayed Interstitial for placement id: " + mo34475i().toString());
                if (aVar != null) {
                    if ((mo34484n().equals(TJAdUnitConstants.String.HTML) || mo34484n().equals("htmlUrl")) && !mo34397U()) {
                        mo34466f();
                    }
                    mo34459d(aVar);
                    return;
                }
                return;
            }
            this.f14342b = 7;
        } else if (mo34477j() == 7) {
            this.f14437z++;
        }
    }

    /* renamed from: b_ */
    public synchronized void mo34558b_(C6301q qVar) {
        super.mo34558b_(qVar);
        this.f14349i.post(new Runnable() {
            public final void run() {
                C5745an anVar = C5745an.this;
                anVar.mo34471g(anVar.mo34486p());
            }
        });
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo34471g(C5706af.C5724a aVar) {
        if (mo34477j() == 7) {
            int i = this.f14437z - 1;
            this.f14437z = i;
            if (i == 1) {
                this.f14342b = 6;
            }
        } else if (mo34477j() == 6) {
            this.f14437z--;
            C6195ic.m18378a((byte) 2, "InMobiInterstitial", "Interstitial ad dismissed for placement id: " + mo34475i().toString());
            if (aVar != null) {
                aVar.mo34537c();
            } else {
                C6195ic.m18378a((byte) 2, "InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
            }
        }
    }

    /* renamed from: H */
    public boolean mo34384H() {
        return 2 == mo34477j();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public final void mo34393Q() {
        C5706af.C5724a p = mo34486p();
        if (p != null) {
            mo34439b(p);
        }
    }

    /* renamed from: b */
    public void mo34441b(String str) {
        super.mo34441b("activity");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final void mo34382F() {
        super.mo34382F();
        this.f14437z = 0;
    }

    /* renamed from: g */
    public void mo34470g() {
        Activity fullScreenActivity;
        super.mo34470g();
        C6234j s = mo34489s();
        if ((s instanceof C6301q) && (fullScreenActivity = ((C6301q) s).getFullScreenActivity()) != null) {
            this.f14357q = true;
            fullScreenActivity.finish();
        }
    }

    /* renamed from: D */
    public void mo34380D() {
        super.mo34380D();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo34410a(InMobiAdRequestStatus inMobiAdRequestStatus) {
        if (this.f14362v) {
            if (mo34477j() != 2) {
                mo34400X();
                return;
            } else if (this.f14361u.isEmpty()) {
                mo34400X();
            } else {
                mo34467f((byte) 2);
                this.f14361u.first();
                this.f14359s = ((Integer) this.f14361u.first()).intValue();
                m17012ac();
                for (int i = 0; i < this.f14344d.size(); i++) {
                    if (!this.f14361u.contains(Integer.valueOf(i))) {
                        mo34458d(i);
                    }
                }
                return;
            }
        }
        super.mo34410a(inMobiAdRequestStatus);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo34602b(C5706af.C5724a aVar, byte b) {
        this.f14342b = 0;
        if (aVar != null) {
            mo34413a(aVar, b);
        } else {
            C6195ic.m18378a((byte) 2, "InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
        }
    }

    /* renamed from: a */
    public void mo34406a(int i, final C6301q qVar, final Context context) {
        if (this.f14362v) {
            if (!this.f14361u.contains(Integer.valueOf(i)) || i <= this.f14344d.indexOf(qVar) || i >= this.f14344d.size() || this.f14344d.get(i) == null || !((C6301q) this.f14344d.get(i)).f15963w) {
                mo34407a(this.f14344d.indexOf(qVar), false);
                return;
            }
            if (context == null) {
                context = mo34473h();
            }
            super.mo34406a(i, qVar, context);
            this.f14349i.post(new Runnable() {
                public final void run() {
                    final int indexOf = C5745an.this.f14344d.indexOf(qVar);
                    if (indexOf >= 0 && indexOf < C5745an.this.f14344d.size()) {
                        boolean a = C5745an.this.m17013b(context);
                        if (!a) {
                            C5745an.this.mo34463e(indexOf);
                        }
                        C5745an.this.mo34407a(indexOf, a);
                        C5745an.this.f14349i.post(new Runnable() {
                            public final void run() {
                                C5745an.this.mo34458d(indexOf);
                            }
                        });
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public void mo34422a(C6301q qVar, Context context) {
        if (this.f14362v) {
            Integer num = (Integer) this.f14361u.higher(Integer.valueOf(this.f14344d.indexOf(qVar)));
            if (num != null) {
                mo34406a(num.intValue(), qVar, context);
            } else {
                mo34556b();
            }
        }
    }

    /* renamed from: b */
    public boolean mo34446b(C6301q qVar) {
        if (this.f14362v) {
            if (((Integer) this.f14361u.higher(Integer.valueOf(this.f14344d.indexOf(qVar)))) != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public void mo34556b() {
        if (this.f14362v) {
            this.f14349i.post(new Runnable() {
                public final void run() {
                    C5745an.this.mo34381E();
                    C6195ic.m18378a((byte) 2, "InMobiInterstitial", "Interstitial ad dismissed for placement id: " + C5745an.this.mo34475i().toString());
                    if (C5745an.this.mo34486p() != null) {
                        C5745an.this.mo34486p().mo34537c();
                    } else {
                        C6195ic.m18378a((byte) 2, "InMobiInterstitial", "Listener was garbage collected. Unable to give callback");
                    }
                }
            });
        }
    }
}
