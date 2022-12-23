package com.inmobi.media;

import android.app.Activity;
import android.graphics.Point;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.inmobi.ads.rendering.InMobiAdActivity;
import java.lang.ref.WeakReference;

/* renamed from: com.inmobi.media.cy */
/* compiled from: JsonMarkupAdHandler */
public class C5900cy extends C5894cu {

    /* renamed from: a */
    private final String f14930a = C5900cy.class.getSimpleName();

    /* renamed from: b */
    private final String f14931b = "InMobi";

    /* renamed from: c */
    private WeakReference<Activity> f14932c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C6234j f14933d;

    /* renamed from: e */
    private RelativeLayout f14934e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C6038fm f14935f;

    /* renamed from: g */
    private boolean f14936g = false;

    /* renamed from: h */
    private boolean f14937h = false;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo34969a(float f) {
        super.mo34969a(f);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo34970a(C5923di diVar) {
        super.mo34970a(diVar);
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ void mo34976g() {
        super.mo34976g();
    }

    public C5900cy(WeakReference<Activity> weakReference, C6234j jVar, RelativeLayout relativeLayout) {
        super(relativeLayout);
        this.f14932c = weakReference;
        this.f14933d = jVar;
        this.f14934e = relativeLayout;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo34968a() {
        C6051fn fnVar;
        byte placementType = this.f14933d.getPlacementType();
        this.f14934e.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        C5854ca caVar = (C5854ca) this.f14933d.getDataModel();
        Point point = caVar.f14751d.f14705c.f14728a;
        C5953dz viewableAd = this.f14933d.getViewableAd();
        View b = caVar.f14750c ? viewableAd.mo35073b() : null;
        int i = 0;
        if (b == null) {
            b = viewableAd.mo35067a((View) null, this.f14934e, false);
        }
        C6234j jVar = this.f14933d;
        if ((jVar instanceof C6296o) && (fnVar = (C6051fn) jVar.getVideoContainerView()) != null) {
            C6038fm videoView = fnVar.getVideoView();
            this.f14935f = videoView;
            videoView.requestFocus();
            C5869cj cjVar = (C5869cj) this.f14935f.getTag();
            if (cjVar.f14727y != null) {
                cjVar.mo34865a((C5869cj) cjVar.f14727y);
            }
            if (placementType == 0) {
                cjVar.f14724v.put("placementType", (byte) 0);
            } else {
                cjVar.f14724v.put("placementType", (byte) 1);
            }
        }
        if (b != null) {
            this.f14934e.addView(b, new RelativeLayout.LayoutParams(point.x, point.y));
        }
        Activity activity = (Activity) this.f14932c.get();
        if (activity != null && caVar != null) {
            byte b2 = caVar.f14748a;
            if (b2 == 1) {
                i = 1;
            } else if (b2 != 2) {
                i = activity.getRequestedOrientation();
            }
            if (activity instanceof InMobiAdActivity) {
                InMobiAdActivity inMobiAdActivity = (InMobiAdActivity) activity;
                if (inMobiAdActivity.f19591a != null) {
                    inMobiAdActivity.f19591a.mo34987a(i);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(3:17|18|(2:20|29)(1:32)) */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0057, code lost:
        if (r7.f14933d.getFullScreenEventsListener() != null) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0059, code lost:
        r7.f14933d.getFullScreenEventsListener().mo35461a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0051 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo34971b() {
        /*
            r7 = this;
            java.lang.String r0 = "time"
            com.inmobi.media.j r1 = r7.f14933d     // Catch:{ Exception -> 0x0063 }
            com.inmobi.media.ft r1 = r1.getAdConfig()     // Catch:{ Exception -> 0x0063 }
            com.inmobi.media.j r2 = r7.f14933d     // Catch:{ Exception -> 0x0063 }
            com.inmobi.media.dz r2 = r2.getViewableAd()     // Catch:{ Exception -> 0x0063 }
            android.view.View r3 = r2.mo35073b()     // Catch:{ Exception -> 0x0063 }
            if (r3 == 0) goto L_0x0062
            com.inmobi.media.j r3 = r7.f14933d     // Catch:{ Exception -> 0x0063 }
            boolean r3 = r3 instanceof com.inmobi.media.C6296o     // Catch:{ Exception -> 0x0063 }
            r4 = 0
            if (r3 == 0) goto L_0x0047
            com.inmobi.media.fm r3 = r7.f14935f     // Catch:{ Exception -> 0x0063 }
            java.lang.Object r3 = r3.getTag()     // Catch:{ Exception -> 0x0063 }
            com.inmobi.media.cj r3 = (com.inmobi.media.C5869cj) r3     // Catch:{ Exception -> 0x0063 }
            if (r3 == 0) goto L_0x0046
            com.inmobi.media.ft$m r1 = r1.viewability     // Catch:{ Exception -> 0x0063 }
            com.inmobi.media.ft$l r5 = r1.video     // Catch:{ Exception -> 0x0063 }
            int r5 = r5.impressionMinTimeViewed     // Catch:{ Exception -> 0x0063 }
            java.util.Map<java.lang.String, java.lang.Object> r6 = r3.f14824G     // Catch:{ Exception -> 0x0063 }
            boolean r6 = r6.containsKey(r0)     // Catch:{ Exception -> 0x0063 }
            if (r6 == 0) goto L_0x003f
            java.util.Map<java.lang.String, java.lang.Object> r3 = r3.f14824G     // Catch:{ Exception -> 0x0063 }
            java.lang.Object r0 = r3.get(r0)     // Catch:{ Exception -> 0x0063 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x0063 }
            int r5 = r0.intValue()     // Catch:{ Exception -> 0x0063 }
        L_0x003f:
            com.inmobi.media.ft$l r0 = r1.video     // Catch:{ Exception -> 0x0063 }
            r0.impressionMinTimeViewed = r5     // Catch:{ Exception -> 0x0063 }
            r2.mo35072a((java.util.Map<android.view.View, com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose>) r4)     // Catch:{ Exception -> 0x0063 }
        L_0x0046:
            return
        L_0x0047:
            com.inmobi.media.j r0 = r7.f14933d     // Catch:{ Exception -> 0x0063 }
            boolean r0 = r0 instanceof com.inmobi.media.C6281n     // Catch:{ Exception -> 0x0063 }
            if (r0 == 0) goto L_0x0062
            r2.mo35072a((java.util.Map<android.view.View, com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose>) r4)     // Catch:{ Exception -> 0x0051 }
            return
        L_0x0051:
            com.inmobi.media.j r0 = r7.f14933d     // Catch:{ Exception -> 0x0063 }
            com.inmobi.media.j$a r0 = r0.getFullScreenEventsListener()     // Catch:{ Exception -> 0x0063 }
            if (r0 == 0) goto L_0x0062
            com.inmobi.media.j r0 = r7.f14933d     // Catch:{ Exception -> 0x0063 }
            com.inmobi.media.j$a r0 = r0.getFullScreenEventsListener()     // Catch:{ Exception -> 0x0063 }
            r0.mo35461a()     // Catch:{ Exception -> 0x0063 }
        L_0x0062:
            return
        L_0x0063:
            r0 = move-exception
            com.inmobi.media.j r1 = r7.f14933d
            com.inmobi.media.j$a r1 = r1.getFullScreenEventsListener()
            if (r1 == 0) goto L_0x0075
            com.inmobi.media.j r1 = r7.f14933d
            com.inmobi.media.j$a r1 = r1.getFullScreenEventsListener()
            r1.mo35461a()
        L_0x0075:
            com.inmobi.media.gj r1 = com.inmobi.media.C6130gj.m18161a()
            com.inmobi.media.hk r2 = new com.inmobi.media.hk
            r2.<init>(r0)
            r1.mo35310a((com.inmobi.media.C6167hk) r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5900cy.mo34971b():void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo34972c() {
        C6038fm fmVar;
        if (!(this.f14933d instanceof C6296o) || (fmVar = this.f14935f) == null) {
            C6234j jVar = this.f14933d;
            if (jVar instanceof C6281n) {
                try {
                    if (!this.f14937h) {
                        this.f14937h = true;
                        jVar.getFullScreenEventsListener().mo35462a((Object) null);
                    }
                } catch (Exception e) {
                    C6130gj.m18161a().mo35310a(new C6167hk(e));
                }
            }
        } else {
            final C5869cj cjVar = (C5869cj) fmVar.getTag();
            if (cjVar != null && this.f14936g) {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                    public final void run() {
                        if (C5900cy.this.f14933d == null) {
                            return;
                        }
                        if (C5900cy.this.f14933d.getPlacementType() != 1 || !((Boolean) cjVar.f14724v.get("didCompleteQ4")).booleanValue()) {
                            C5900cy.this.f14935f.start();
                        }
                    }
                }, 50);
            }
            if (this.f14933d.getFullScreenEventsListener() != null) {
                try {
                    if (!this.f14937h) {
                        this.f14937h = true;
                        this.f14933d.getFullScreenEventsListener().mo35462a(cjVar);
                    }
                } catch (Exception e2) {
                    C6130gj.m18161a().mo35310a(new C6167hk(e2));
                }
            }
        }
        this.f14936g = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo34973d() {
        this.f14936g = true;
        C6038fm fmVar = this.f14935f;
        if (fmVar != null) {
            fmVar.pause();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo34975f() {
        if (!this.f14933d.mo35451c()) {
            C6234j jVar = this.f14933d;
            if (jVar instanceof C6296o) {
                C6296o oVar = (C6296o) jVar;
                if (oVar != null && !oVar.mo35536i().f14749b) {
                    Activity activity = (Activity) this.f14932c.get();
                    if (activity instanceof InMobiAdActivity) {
                        ((InMobiAdActivity) activity).f19592b = true;
                    }
                    C6038fm fmVar = this.f14935f;
                    if (fmVar != null) {
                        C5869cj cjVar = (C5869cj) fmVar.getTag();
                        if (cjVar != null) {
                            if (1 == oVar.getPlacementType()) {
                                this.f14935f.mo35211e();
                            }
                            try {
                                if (((Boolean) cjVar.f14724v.get("isFullScreen")).booleanValue()) {
                                    cjVar.f14724v.put("seekPosition", Integer.valueOf(this.f14935f.getCurrentPosition()));
                                    if (!oVar.f15846j && ((Boolean) cjVar.f14724v.get("didRequestFullScreen")).booleanValue()) {
                                        cjVar.f14724v.put("didRequestFullScreen", Boolean.FALSE);
                                        if (cjVar.f14727y != null) {
                                            cjVar.f14727y.f14724v.put("didRequestFullScreen", Boolean.FALSE);
                                        }
                                        oVar.mo35450b();
                                        cjVar.f14724v.put("isFullScreen", Boolean.FALSE);
                                    }
                                }
                            } catch (Exception e) {
                                C6195ic.m18378a((byte) 2, "InMobi", "SDK encountered unexpected error in closing video");
                                C6130gj.m18161a().mo35310a(new C6167hk(e));
                            }
                        }
                    } else {
                        m17560h();
                    }
                }
            } else if (jVar instanceof C6281n) {
                C6281n nVar = (C6281n) jVar;
                if (nVar == null) {
                    m17560h();
                } else if (!nVar.mo35536i().f14749b) {
                    nVar.mo35450b();
                }
            }
        }
    }

    /* renamed from: a */
    private void m17558a(C5847bw bwVar) {
        try {
            this.f14933d.getFullScreenEventsListener().mo35463b(bwVar);
        } catch (Exception e) {
            C6195ic.m18378a((byte) 2, "InMobi", "SDK encountered unexpected error while finishing fullscreen view");
            C6130gj.m18161a().mo35310a(new C6167hk(e));
        }
    }

    /* renamed from: h */
    private void m17560h() {
        Activity activity = (Activity) this.f14932c.get();
        if (activity instanceof InMobiAdActivity) {
            activity.finish();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo34974e() {
        boolean z;
        C5869cj cjVar;
        Activity activity = (Activity) this.f14932c.get();
        if (activity instanceof InMobiAdActivity) {
            z = ((InMobiAdActivity) activity).f19592b;
        } else {
            z = false;
        }
        if (z) {
            C6234j jVar = this.f14933d;
            if (jVar instanceof C6296o) {
                C6051fn fnVar = (C6051fn) ((C6296o) jVar).getVideoContainerView();
                if (fnVar != null) {
                    m17558a((C5847bw) (C5869cj) fnVar.getVideoView().getTag());
                }
            } else if (jVar instanceof C6281n) {
                m17558a((C5847bw) null);
            }
        } else {
            C6234j jVar2 = this.f14933d;
            if (jVar2 instanceof C6296o) {
                C6296o oVar = (C6296o) jVar2;
                C6038fm fmVar = this.f14935f;
                if (!(fmVar == null || (cjVar = (C5869cj) fmVar.getTag()) == null)) {
                    if (1 == oVar.getPlacementType()) {
                        this.f14935f.mo35211e();
                    }
                    m17558a((C5847bw) cjVar);
                }
            } else if (jVar2 instanceof C6281n) {
                m17558a((C5847bw) null);
            }
            InMobiAdActivity.m23150a((Object) this.f14933d);
        }
        this.f14933d.destroy();
    }
}
