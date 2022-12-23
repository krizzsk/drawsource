package com.bytedance.sdk.openadsdk.core;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.JProtect;
import com.bytedance.sdk.component.p108d.p117d.C2815g;
import com.bytedance.sdk.component.p118e.p121c.C2857d;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.core.EmptyView;
import com.bytedance.sdk.openadsdk.core.p144b.C3359a;
import com.bytedance.sdk.openadsdk.core.p144b.C3360b;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.p128b.C3090e;
import com.bytedance.sdk.openadsdk.p128b.C3100j;
import com.bytedance.sdk.openadsdk.p178l.C3886o;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import com.com.bytedance.overseas.sdk.p185a.C3968c;
import com.com.bytedance.overseas.sdk.p185a.C3969d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.l */
/* compiled from: InteractionManager */
public class C3508l {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C3431n f8775a;

    /* renamed from: b */
    private C3968c f8776b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Context f8777c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final TTNativeAd f8778d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public List<View> f8779e = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public String f8780f = C2815g.g1659536876620dc("el`f``bXim");

    /* renamed from: g */
    private TTNativeAd.AdInteractionListener f8781g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public long f8782h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Double f8783i = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C3100j f8784j = new C3100j();

    public C3508l(Context context, TTNativeAd tTNativeAd, C3431n nVar, String str) {
        this.f8778d = tTNativeAd;
        this.f8775a = nVar;
        this.f8777c = context;
        this.f8780f = str;
        if (nVar.mo19519L() == 4) {
            this.f8776b = C3969d.m13089a(this.f8777c, this.f8775a, this.f8780f);
        }
    }

    /* renamed from: a */
    private EmptyView m10945a(ViewGroup viewGroup) {
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof EmptyView) {
                return (EmptyView) childAt;
            }
        }
        return null;
    }

    /* renamed from: c */
    static /* synthetic */ long m10947c(C3508l lVar) {
        long j = lVar.f8782h;
        while (true) {
            char c = '^';
            char c2 = 'K';
            while (true) {
                switch (c) {
                    case '\\':
                        switch (c2) {
                            case 21:
                                break;
                            case 22:
                            case 23:
                                break;
                        }
                    case ']':
                        break;
                    case '^':
                        break;
                }
                c = ']';
                c2 = ']';
            }
            while (true) {
                switch (c2) {
                    case '[':
                    case '\\':
                    case ']':
                        break;
                    default:
                        c2 = '[';
                }
            }
        }
        return j;
    }

    /* renamed from: a */
    public C3100j mo19975a() {
        return this.f8784j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        switch(r4) {
            case 55: goto L_0x0022;
            case 56: goto L_0x000c;
            case 57: goto L_0x0022;
            default: goto L_0x001a;
        };
     */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0014  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo19976a(android.view.View r3, int r4) {
        /*
            r2 = this;
            com.bytedance.sdk.openadsdk.TTNativeAd$AdInteractionListener r4 = r2.f8781g
            r0 = 95
            if (r4 == 0) goto L_0x000c
            com.bytedance.sdk.openadsdk.TTNativeAd r1 = r2.f8778d
            r4.onAdCreativeClick(r3, r1)
            goto L_0x001f
        L_0x000c:
            r3 = 94
            r4 = 125(0x7d, float:1.75E-43)
        L_0x0010:
            switch(r3) {
                case 94: goto L_0x001b;
                case 95: goto L_0x0014;
                case 96: goto L_0x0017;
                default: goto L_0x0013;
            }
        L_0x0013:
            goto L_0x000c
        L_0x0014:
            switch(r4) {
                case 94: goto L_0x001f;
                case 95: goto L_0x000c;
                case 96: goto L_0x001f;
                default: goto L_0x0017;
            }
        L_0x0017:
            switch(r4) {
                case 55: goto L_0x0022;
                case 56: goto L_0x000c;
                case 57: goto L_0x0022;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x0022
        L_0x001b:
            r3 = 39
            if (r4 != r3) goto L_0x0022
        L_0x001f:
            r3 = r0
            r4 = r3
            goto L_0x0010
        L_0x0022:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C3508l.mo19976a(android.view.View, int):void");
    }

    /* renamed from: a */
    public void mo19977a(final ViewGroup viewGroup, List<View> list, List<View> list2, List<View> list3, View view, final TTNativeAd.AdInteractionListener adInteractionListener) {
        this.f8781g = adInteractionListener;
        viewGroup.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                C3508l.this.f8784j.mo18681a(System.currentTimeMillis(), C3703x.m12103a(viewGroup));
            }
        });
        this.f8779e = list;
        C3090e.m8903a(this.f8775a);
        EmptyView a = m10945a(viewGroup);
        if (a == null) {
            a = new EmptyView(this.f8777c, viewGroup);
            viewGroup.addView(a);
        }
        a.mo19259a();
        a.setRefClickViews(list2);
        if (list != null) {
            for (View next : this.f8779e) {
                if (next != null) {
                    next.setTag(C2914t.m8158e(C3513m.m10963a(), C2857d.d1659536876571dc("tu]j`ZotWcoibQyrfffp")), true);
                }
            }
            list3.addAll(list);
        }
        a.setRefCreativeViews(list3);
        HashMap hashMap = new HashMap();
        hashMap.put(C2857d.d1659536876571dc("cmk`oZudmgin"), 1);
        Context context = this.f8777c;
        C3431n nVar = this.f8775a;
        String str = this.f8780f;
        C3360b bVar = new C3360b(context, nVar, str, C3898x.m12747a(str));
        bVar.mo19305a((View) viewGroup);
        bVar.mo19317b(view);
        bVar.mo19311a(this.f8776b);
        bVar.mo19307a(this.f8778d);
        bVar.mo19313a((Map<String, Object>) hashMap);
        bVar.mo19309a((C3360b.C3361a) new C3360b.C3361a() {
            /* renamed from: a */
            public void mo18309a(View view, int i) {
                TTNativeAd.AdInteractionListener adInteractionListener = adInteractionListener;
                if (adInteractionListener != null) {
                    adInteractionListener.onAdClicked(view, C3508l.this.f8778d);
                }
            }
        });
        Context context2 = this.f8777c;
        C3431n nVar2 = this.f8775a;
        String str2 = this.f8780f;
        C3359a aVar = new C3359a(context2, nVar2, str2, C3898x.m12747a(str2));
        aVar.mo19305a((View) viewGroup);
        aVar.mo19317b(view);
        aVar.mo19311a(this.f8776b);
        aVar.mo19307a(this.f8778d);
        aVar.mo19313a((Map<String, Object>) hashMap);
        aVar.mo19309a((C3360b.C3361a) new C3360b.C3361a() {
            /* renamed from: a */
            public void mo18309a(View view, int i) {
                TTNativeAd.AdInteractionListener adInteractionListener = adInteractionListener;
                if (adInteractionListener != null) {
                    adInteractionListener.onAdCreativeClick(view, C3508l.this.f8778d);
                }
            }
        });
        a.mo19260a(list2, bVar);
        a.mo19260a(list3, aVar);
        a.setCallback(new EmptyView.C3332a() {
            /* renamed from: a */
            public void mo19271a() {
                C3508l.this.f8784j.mo18681a(System.currentTimeMillis(), C3703x.m12103a(viewGroup));
            }

            @JProtect
            /* renamed from: a */
            public void mo19272a(View view) {
                C3508l.this.f8784j.mo18681a(System.currentTimeMillis(), C3703x.m12103a(viewGroup));
                long unused = C3508l.this.f8782h = System.currentTimeMillis();
                HashMap hashMap = new HashMap();
                if (C3508l.this.f8779e != null) {
                    JSONArray jSONArray = new JSONArray();
                    for (View view2 : C3508l.this.f8779e) {
                        if (view2 != null) {
                            JSONObject jSONObject = new JSONObject();
                            try {
                                jSONObject.put(C3886o.o1659536876602dc("whfwl"), view2.getWidth());
                                jSONObject.put(C3886o.o1659536876602dc("hdkdlq"), view2.getHeight());
                                jSONObject.put(C3886o.o1659536876602dc("amrke"), (double) view2.getAlpha());
                            } catch (Throwable unused2) {
                            }
                            jSONArray.put(jSONObject);
                        }
                    }
                    hashMap.put(C3886o.o1659536876602dc("ilcdaZpnm~"), jSONArray.toString());
                }
                if (viewGroup != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put(C3886o.o1659536876602dc("whfwl"), viewGroup.getWidth());
                        jSONObject2.put(C3886o.o1659536876602dc("hdkdlq"), viewGroup.getHeight());
                        jSONObject2.put(C3886o.o1659536876602dc("amrke"), (double) viewGroup.getAlpha());
                    } catch (Throwable unused3) {
                    }
                    hashMap.put(C3886o.o1659536876602dc("rnmw[sob"), jSONObject2.toString());
                }
                C3090e.m8899a(C3508l.this.f8777c, C3508l.this.f8775a, C3508l.this.f8780f, (Map<String, Object>) hashMap, C3508l.this.f8783i);
                TTNativeAd.AdInteractionListener adInteractionListener = adInteractionListener;
                if (adInteractionListener != null) {
                    adInteractionListener.onAdShow(C3508l.this.f8778d);
                }
                if (C3508l.this.f8775a.mo19575ai()) {
                    C3898x.m12759a(C3508l.this.f8775a, view);
                }
            }

            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
                	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
                */
            /* JADX WARNING: Removed duplicated region for block: B:10:0x007c A[SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:8:0x0078 A[LOOP:0: B:6:0x0078->B:8:0x0078, LOOP_END, SYNTHETIC] */
            /* JADX WARNING: Removed duplicated region for block: B:9:0x0076 A[SYNTHETIC] */
            /* renamed from: a */
            public void mo19273a(boolean r7) {
                /*
                    r6 = this;
                    if (r7 != 0) goto L_0x005a
                    com.bytedance.sdk.openadsdk.core.l r7 = com.bytedance.sdk.openadsdk.core.C3508l.this
                    long r0 = com.bytedance.sdk.openadsdk.core.C3508l.m10947c(r7)
                    r2 = 0
                    int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                    if (r7 <= 0) goto L_0x005a
                    java.lang.StringBuilder r7 = new java.lang.StringBuilder
                    r7.<init>()
                    long r0 = java.lang.System.currentTimeMillis()
                    com.bytedance.sdk.openadsdk.core.l r4 = com.bytedance.sdk.openadsdk.core.C3508l.this
                    long r4 = com.bytedance.sdk.openadsdk.core.C3508l.m10947c(r4)
                    long r0 = r0 - r4
                    r7.append(r0)
                    java.lang.String r0 = ""
                    r7.append(r0)
                    java.lang.String r7 = r7.toString()
                    com.bytedance.sdk.openadsdk.core.l r0 = com.bytedance.sdk.openadsdk.core.C3508l.this
                    com.bytedance.sdk.openadsdk.b.j r0 = r0.f8784j
                    long r4 = java.lang.System.currentTimeMillis()
                    android.view.ViewGroup r1 = r9
                    float r1 = com.bytedance.sdk.openadsdk.core.C3703x.m12103a(r1)
                    r0.mo18681a(r4, r1)
                    com.bytedance.sdk.openadsdk.core.l r0 = com.bytedance.sdk.openadsdk.core.C3508l.this
                    com.bytedance.sdk.openadsdk.core.e.n r0 = r0.f8775a
                    com.bytedance.sdk.openadsdk.core.l r1 = com.bytedance.sdk.openadsdk.core.C3508l.this
                    java.lang.String r1 = r1.f8780f
                    com.bytedance.sdk.openadsdk.core.l r4 = com.bytedance.sdk.openadsdk.core.C3508l.this
                    com.bytedance.sdk.openadsdk.b.j r4 = r4.f8784j
                    com.bytedance.sdk.openadsdk.p128b.C3090e.m8913a((java.lang.String) r7, (com.bytedance.sdk.openadsdk.core.p149e.C3431n) r0, (java.lang.String) r1, (com.bytedance.sdk.openadsdk.p128b.C3100j) r4)
                    com.bytedance.sdk.openadsdk.core.l r7 = com.bytedance.sdk.openadsdk.core.C3508l.this
                    long unused = r7.f8782h = r2
                    r7 = 64
                    goto L_0x0078
                L_0x005a:
                    com.bytedance.sdk.openadsdk.core.l r7 = com.bytedance.sdk.openadsdk.core.C3508l.this
                    com.bytedance.sdk.openadsdk.b.j r7 = r7.f8784j
                    long r0 = java.lang.System.currentTimeMillis()
                    android.view.ViewGroup r2 = r9
                    float r2 = com.bytedance.sdk.openadsdk.core.C3703x.m12103a(r2)
                    r7.mo18681a(r0, r2)
                    com.bytedance.sdk.openadsdk.core.l r7 = com.bytedance.sdk.openadsdk.core.C3508l.this
                    long r0 = java.lang.System.currentTimeMillis()
                    long unused = r7.f8782h = r0
                L_0x0076:
                    r7 = 66
                L_0x0078:
                    switch(r7) {
                        case 64: goto L_0x007c;
                        case 65: goto L_0x0076;
                        case 66: goto L_0x007c;
                        default: goto L_0x007b;
                    }
                L_0x007b:
                    goto L_0x0078
                L_0x007c:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.C3508l.C35124.mo19273a(boolean):void");
            }

            /* renamed from: b */
            public void mo19274b() {
                if (C3508l.m10947c(C3508l.this) > 0) {
                    C3090e.m8913a((System.currentTimeMillis() - C3508l.m10947c(C3508l.this)) + "", C3508l.this.f8775a, C3508l.this.f8780f, C3508l.this.f8784j);
                    long unused = C3508l.this.f8782h = 0;
                }
            }
        });
        a.setNeedCheckingShow(true);
    }

    /* renamed from: a */
    public void mo19978a(Double d) {
        this.f8783i = d;
    }
}
