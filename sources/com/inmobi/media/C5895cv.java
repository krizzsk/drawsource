package com.inmobi.media;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.ads.rendering.InMobiAdActivity;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.inmobi.media.cv */
/* compiled from: HtmlMarkupAdHandler */
public class C5895cv extends C5894cu {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final String f14906a = C5895cv.class.getSimpleName();

    /* renamed from: b */
    private final String f14907b = "InMobi";

    /* renamed from: c */
    private WeakReference<Activity> f14908c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C6234j f14909d;

    /* renamed from: e */
    private RelativeLayout f14910e;

    /* renamed from: f */
    private C5879cs f14911f;

    /* renamed from: g */
    private C5879cs f14912g;

    /* renamed from: h */
    private boolean f14913h = false;

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo34973d() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo34969a(float f) {
        super.mo34969a(f);
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ void mo34976g() {
        super.mo34976g();
    }

    public C5895cv(WeakReference<Activity> weakReference, C6234j jVar, RelativeLayout relativeLayout) {
        super(relativeLayout);
        this.f14908c = weakReference;
        this.f14909d = jVar;
        this.f14910e = relativeLayout;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo34968a() {
        float f = C6215il.m18444a().f15674c;
        this.f14910e.setBackgroundColor(0);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(10);
        C58961 r3 = new View.OnClickListener() {
            public final void onClick(View view) {
                try {
                    C5895cv.this.f14909d.mo35450b();
                } catch (Exception unused) {
                    String unused2 = C5895cv.this.f14906a;
                    C6195ic.m18378a((byte) 2, "InMobi", "SDK encountered unexpected error in processing close request");
                }
            }
        };
        int i = (int) (50.0f * f);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i, i);
        layoutParams2.addRule(11);
        C5879cs csVar = new C5879cs(this.f14910e.getContext(), f, (byte) 0);
        this.f14911f = csVar;
        csVar.setId(C6192i.f15629d);
        this.f14911f.setOnClickListener(r3);
        C5879cs csVar2 = new C5879cs(this.f14910e.getContext(), f, (byte) 1);
        this.f14912g = csVar2;
        csVar2.setId(C6192i.f15630e);
        this.f14912g.setOnClickListener(r3);
        View c = this.f14909d.getViewableAd().mo35074c();
        if (c != null) {
            ViewGroup viewGroup = (ViewGroup) c.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(c);
            }
            this.f14910e.addView(c, layoutParams);
            this.f14910e.addView(this.f14911f, layoutParams2);
            this.f14910e.addView(this.f14912g, layoutParams2);
            C6234j jVar = this.f14909d;
            ((C6301q) jVar).mo35583b(((C6301q) jVar).f15954n);
            C6234j jVar2 = this.f14909d;
            ((C6301q) jVar2).mo35586c(((C6301q) jVar2).f15952l);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo34971b() {
        if (1 == this.f14909d.getPlacementType()) {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put(this.f14911f, FriendlyObstructionPurpose.CLOSE_AD);
                hashMap.put(this.f14912g, FriendlyObstructionPurpose.CLOSE_AD);
                C5953dz viewableAd = this.f14909d.getViewableAd();
                if (viewableAd != null) {
                    viewableAd.mo35072a((Map<View, FriendlyObstructionPurpose>) hashMap);
                }
            } catch (Exception unused) {
                if (this.f14909d.getFullScreenEventsListener() != null) {
                    this.f14909d.getFullScreenEventsListener().mo35461a();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo34972c() {
        if (!this.f14913h) {
            try {
                this.f14913h = true;
                if (this.f14909d.getFullScreenEventsListener() != null) {
                    this.f14909d.getFullScreenEventsListener().mo35462a((Object) null);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo34975f() {
        C6301q qVar;
        if (!this.f14909d.mo35451c() && (qVar = (C6301q) this.f14909d) != null) {
            if (qVar.f15956p != null) {
                qVar.mo35579a(qVar.f15956p, "broadcastEvent('backButtonPressed')");
            }
            if (!qVar.f15955o) {
                try {
                    qVar.mo35450b();
                } catch (Exception unused) {
                    C6195ic.m18378a((byte) 2, "InMobi", "SDK encountered unexpected error in processing close request");
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo34970a(C5923di diVar) {
        super.mo34970a(diVar);
        int i = diVar.f15004e;
        ((C6301q) this.f14909d).mo35588d("window.imraid.broadcastEvent('orientationChange','" + i + "');");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo34974e() {
        boolean z;
        Activity activity = (Activity) this.f14908c.get();
        if (activity instanceof InMobiAdActivity) {
            z = ((InMobiAdActivity) activity).f19592b;
        } else {
            z = false;
        }
        if (z) {
            try {
                this.f14909d.getFullScreenEventsListener().mo35463b((Object) null);
            } catch (Exception unused) {
                C6195ic.m18378a((byte) 2, "InMobi", "SDK encountered unexpected error while finishing fullscreen view");
            }
        } else {
            C6301q qVar = (C6301q) this.f14909d;
            qVar.setFullScreenActivityContext((Activity) null);
            try {
                qVar.mo35450b();
            } catch (Exception unused2) {
                C6195ic.m18378a((byte) 2, "InMobi", "SDK encountered unexpected error in processing close request");
            }
        }
        this.f14909d.destroy();
    }
}
