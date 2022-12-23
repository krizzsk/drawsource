package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.facebook.share.internal.ShareConstants;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.C5971ej;
import com.inmobi.media.C5996ex;
import com.inmobi.media.C6234j;
import com.smaato.sdk.video.vast.model.ErrorCode;
import com.vungle.warren.model.ReportDBAdapter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.n */
/* compiled from: NativeAdContainer */
public class C6281n implements Application.ActivityLifecycleCallbacks, C6234j {
    /* access modifiers changed from: private */

    /* renamed from: z */
    public static final String f15822z = C6281n.class.getSimpleName();

    /* renamed from: A */
    private byte f15823A;

    /* renamed from: B */
    private Set<Integer> f15824B = new HashSet();

    /* renamed from: C */
    private List<C5847bw> f15825C = new ArrayList();

    /* renamed from: D */
    private C6016ff f15826D;

    /* renamed from: E */
    private int f15827E = -1;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public C6281n f15828F;

    /* renamed from: G */
    private C5847bw f15829G = null;

    /* renamed from: H */
    private String f15830H = null;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public C6281n f15831I;

    /* renamed from: J */
    private C6321s f15832J;

    /* renamed from: K */
    private final C6234j.C6235a f15833K = new C6234j.C6235a() {
        /* renamed from: a */
        public final void mo35461a() {
            String unused = C6281n.f15822z;
            C6295c f = C6281n.this.mo35533f();
            if (f != null) {
                f.mo34504a();
            }
        }

        /* renamed from: a */
        public final void mo35462a(Object obj) {
            C6295c f;
            if (C6281n.this.mo35540m() != null && (f = C6281n.this.mo35533f()) != null) {
                f.mo34508b();
            }
        }

        /* renamed from: b */
        public final void mo35463b(Object obj) {
            C6295c f = C6281n.this.mo35533f();
            if (f != null) {
                f.mo34512f();
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: L */
    public C6185hy f15834L;
    /* access modifiers changed from: private */

    /* renamed from: M */
    public C5727ah<C6281n> f15835M = new C5727ah<C6281n>(this) {
        /* renamed from: a */
        public final void mo34371a() {
            if (!C6281n.this.f15846j && C6281n.this.getPlacementType() == 0 && C6281n.this.f15837a.f14750c) {
                String unused = C6281n.f15822z;
                C6281n.m18710a(C6281n.this);
            }
        }
    };

    /* renamed from: N */
    private final C6004f f15836N = new C6004f() {
        /* renamed from: a */
        public final void mo35143a(String str) {
            Context context = (Context) C6281n.this.f15850n.get();
            if (context != null && C6193ia.m18372a(str)) {
                InMobiAdActivity.m23148a((C6301q) null);
                InMobiAdActivity.m23149a(C6281n.this.mo35555u());
                Intent intent = new Intent(context, InMobiAdActivity.class);
                intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 100);
                intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.IN_APP_BROWSER_URL", str);
                intent.putExtra(ReportDBAdapter.ReportColumns.COLUMN_PLACEMENT_ID, C6281n.this.f15840d);
                intent.putExtra("creativeId", C6281n.this.f15841e);
                intent.putExtra("impressionId", C6281n.this.f15839c);
                intent.putExtra("allowAutoRedirection", C6281n.this.f15842f);
                C6183hw.m18313a(context, intent);
            }
        }

        /* renamed from: a */
        public final void mo35142a() {
            C6295c f = C6281n.this.mo35533f();
            if (f != null) {
                f.mo34508b();
            }
        }

        /* renamed from: b */
        public final void mo35144b() {
            C6295c f = C6281n.this.mo35533f();
            if (f != null) {
                f.mo34512f();
            }
        }
    };

    /* renamed from: a */
    protected C5854ca f15837a;

    /* renamed from: b */
    C6074ft f15838b;

    /* renamed from: c */
    public final String f15839c;

    /* renamed from: d */
    public final long f15840d;

    /* renamed from: e */
    public final String f15841e;

    /* renamed from: f */
    public final boolean f15842f;

    /* renamed from: g */
    protected Set<C5951dx> f15843g;

    /* renamed from: h */
    protected C5953dz f15844h;

    /* renamed from: i */
    protected boolean f15845i;

    /* renamed from: j */
    public boolean f15846j;

    /* renamed from: k */
    protected boolean f15847k;

    /* renamed from: l */
    public C6281n f15848l;

    /* renamed from: m */
    protected C6295c f15849m;

    /* renamed from: n */
    protected WeakReference<Context> f15850n = new WeakReference<>((Object) null);

    /* renamed from: o */
    WeakReference<Activity> f15851o;

    /* renamed from: p */
    boolean f15852p = false;

    /* renamed from: q */
    public int f15853q = 0;

    /* renamed from: r */
    public boolean f15854r = false;

    /* renamed from: s */
    Intent f15855s = null;

    /* renamed from: t */
    public C6301q f15856t;

    /* renamed from: u */
    public C6301q f15857u;

    /* renamed from: v */
    public byte f15858v;

    /* renamed from: w */
    public Map<String, C6166hj> f15859w;

    /* renamed from: x */
    protected C5817bk f15860x = new C5817bk() {
        /* renamed from: a */
        public final void mo34374a() {
            C6173ho e = C6281n.this.mo35532e();
            e.f15591d = "nativeBeacon";
            C6295c f = C6281n.this.mo35533f();
            if (f != null) {
                f.mo34505a(e);
            }
        }

        /* renamed from: a */
        public final void mo34375a(String str) {
            C6173ho e = C6281n.this.mo35532e();
            e.f15591d = "nativeBeacon";
            e.mo35383a(str);
        }
    };

    /* renamed from: y */
    public final C5971ej.C5975a f15861y = new C5971ej.C5975a() {
        /* renamed from: a */
        public final void mo35105a(View view, boolean z) {
            C6281n.this.mo35528a(z);
        }
    };

    /* renamed from: com.inmobi.media.n$c */
    /* compiled from: NativeAdContainer */
    public interface C6295c {
        /* renamed from: a */
        void mo34504a();

        /* renamed from: a */
        void mo34505a(C6173ho hoVar);

        /* renamed from: a */
        void mo34506a(Map<String, String> map);

        /* renamed from: a */
        void mo34507a(boolean z);

        /* renamed from: b */
        void mo34508b();

        /* renamed from: c */
        void mo34509c();

        /* renamed from: d */
        void mo34510d();

        /* renamed from: e */
        void mo34511e();

        /* renamed from: f */
        void mo34512f();

        /* renamed from: g */
        void mo34513g();

        /* renamed from: h */
        void mo34514h();

        /* renamed from: i */
        void mo34515i();
    }

    /* renamed from: a */
    public final void mo35448a() {
    }

    public String getMarkupType() {
        return "inmobiJson";
    }

    public View getVideoContainerView() {
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo35542o() {
        return false;
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityPaused(Activity activity) {
    }

    public void onActivityResumed(Activity activity) {
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    /* renamed from: com.inmobi.media.n$b */
    /* compiled from: NativeAdContainer */
    public static final class C6294b {
        /* renamed from: a */
        public static C6281n m18786a(Context context, byte b, C5854ca caVar, String str, Set<C5951dx> set, C6074ft ftVar, long j, boolean z, String str2) {
            if (caVar.mo34849e().contains(ShareConstants.VIDEO_URL)) {
                return new C6296o(context, b, caVar, str, set, ftVar, j, z, str2);
            }
            return new C6281n(context, b, caVar, str, set, ftVar, j, z, str2);
        }
    }

    C6281n(Context context, byte b, C5854ca caVar, String str, Set<C5951dx> set, C6074ft ftVar, long j, boolean z, String str2) {
        this.f15823A = b;
        this.f15837a = caVar;
        this.f15839c = str;
        this.f15840d = j;
        this.f15842f = z;
        this.f15841e = str2;
        mo35525a((C6234j) this);
        this.f15845i = false;
        this.f15846j = false;
        this.f15838b = ftVar;
        if (set != null) {
            this.f15843g = new HashSet(set);
        }
        this.f15837a.f14751d.f14742z = System.currentTimeMillis();
        mo35521a(context);
        this.f15858v = -1;
        this.f15834L = C6185hy.m18355a();
        new Handler(Looper.getMainLooper()).post(new Runnable() {
            public final void run() {
                C6281n.this.f15834L.mo35396a(C6281n.this.hashCode(), C6281n.this.f15835M);
            }
        });
    }

    public C6234j.C6235a getFullScreenEventsListener() {
        return this.f15833K;
    }

    public byte getPlacementType() {
        return this.f15823A;
    }

    /* renamed from: a */
    public final void mo35521a(Context context) {
        this.f15850n = new WeakReference<>(context);
        C6183hw.m18312a(context, (Application.ActivityLifecycleCallbacks) this);
    }

    /* renamed from: d */
    public final Context mo35531d() {
        return (Context) this.f15850n.get();
    }

    /* renamed from: a */
    public final void mo35525a(C6234j jVar) {
        if (jVar instanceof C6281n) {
            this.f15848l = (C6281n) jVar;
        }
    }

    /* renamed from: f */
    public final C6295c mo35533f() {
        return this.f15849m;
    }

    /* renamed from: a */
    public final void mo35526a(C6295c cVar) {
        this.f15849m = cVar;
    }

    /* renamed from: g */
    public final View mo35534g() {
        C5953dz dzVar = this.f15844h;
        if (dzVar == null) {
            return null;
        }
        return dzVar.mo35073b();
    }

    public C6074ft getAdConfig() {
        return this.f15838b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo35535h() {
        Map<String, String> a = mo35519a((C5847bw) this.f15837a.f14751d);
        mo35449a((byte) 1, a);
        mo35449a((byte) 2, a);
    }

    public C5953dz getViewableAd() {
        Context k = mo35538k();
        if (this.f15844h == null && k != null) {
            mo35535h();
            this.f15844h = new C5969eh(k, this, new C5957eb(this, this.f15856t));
            Set<C5951dx> set = this.f15843g;
            if (set != null) {
                for (C5951dx next : set) {
                    try {
                        if (next.f15086a == 3) {
                            C5983en enVar = (C5983en) next.f15087b.get("omidAdSession");
                            if (next.f15087b.containsKey("deferred")) {
                                ((Boolean) next.f15087b.get("deferred")).booleanValue();
                            }
                            if (enVar != null) {
                                if (this.f15858v == 0) {
                                    this.f15844h = new C5988er(this, this.f15844h, enVar);
                                } else {
                                    this.f15844h = new C5989es(this, this.f15844h, enVar);
                                }
                            }
                        }
                    } catch (Exception e) {
                        C6130gj.m18161a().mo35310a(new C6167hk(e));
                    }
                }
            }
        }
        return this.f15844h;
    }

    /* renamed from: i */
    public final C5854ca mo35536i() {
        return this.f15837a;
    }

    /* renamed from: c */
    public final boolean mo35451c() {
        return this.f15846j;
    }

    public void destroy() {
        if (!this.f15846j) {
            this.f15846j = true;
            this.f15827E = -1;
            C6281n nVar = this.f15828F;
            if (nVar != null) {
                nVar.mo35450b();
            }
            this.f15846j = true;
            this.f15849m = null;
            C6016ff z = m18731z();
            if (z != null) {
                C5996ex exVar = z.f15252b;
                for (C5996ex.C5999a aVar : exVar.f15199a) {
                    aVar.f15207a.cancel();
                }
                exVar.f15199a.clear();
                z.mo35175a();
            }
            this.f15826D = null;
            this.f15825C.clear();
            C5953dz dzVar = this.f15844h;
            if (dzVar != null) {
                dzVar.mo35075d();
                this.f15844h.mo35076e();
            }
            m18701A();
            this.f15850n.clear();
            WeakReference<Activity> weakReference = this.f15851o;
            if (weakReference != null) {
                weakReference.clear();
            }
            this.f15837a = null;
            this.f15856t = null;
            C6281n nVar2 = this.f15831I;
            if (nVar2 != null) {
                nVar2.destroy();
                this.f15831I = null;
            }
            this.f15834L.mo35395a(hashCode());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public boolean mo35537j() {
        return getPlacementType() == 0 && mo35540m() != null;
    }

    /* renamed from: k */
    public final Context mo35538k() {
        return (1 == getPlacementType() || mo35537j()) ? mo35540m() : (Context) this.f15850n.get();
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final boolean mo35539l() {
        return this.f15845i;
    }

    /* renamed from: a */
    private C5847bw m18704a(C5847bw bwVar, C5854ca caVar, String str) {
        if (C6193ia.m18370a((Context) this.f15850n.get(), str)) {
            return bwVar;
        }
        String[] split = str.split("\\|");
        C5847bw b = caVar.mo34844b(split[0]);
        if (b == null) {
            return m18714b(caVar.f14753f, bwVar);
        }
        if (b.equals(bwVar)) {
            return null;
        }
        if (1 == split.length || 2 == split.length) {
            b.f14715m = 1;
            return b;
        }
        b.f14715m = C5854ca.m17421a(split[2]);
        return b;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static byte m18703a(java.lang.String r6) {
        /*
            java.util.Locale r0 = java.util.Locale.US
            java.lang.String r6 = r6.toLowerCase(r0)
            java.lang.String r6 = r6.trim()
            int r0 = r6.hashCode()
            r1 = 5
            r2 = 4
            r3 = 1
            r4 = 3
            r5 = 2
            switch(r0) {
                case -934641255: goto L_0x0053;
                case -934524953: goto L_0x0049;
                case 0: goto L_0x003f;
                case 3127582: goto L_0x0035;
                case 3443508: goto L_0x002b;
                case 3532159: goto L_0x0021;
                case 110066619: goto L_0x0017;
                default: goto L_0x0016;
            }
        L_0x0016:
            goto L_0x005d
        L_0x0017:
            java.lang.String r0 = "fullscreen"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x005d
            r6 = 6
            goto L_0x005e
        L_0x0021:
            java.lang.String r0 = "skip"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x005d
            r6 = r5
            goto L_0x005e
        L_0x002b:
            java.lang.String r0 = "play"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x005d
            r6 = 7
            goto L_0x005e
        L_0x0035:
            java.lang.String r0 = "exit"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x005d
            r6 = r1
            goto L_0x005e
        L_0x003f:
            java.lang.String r0 = ""
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x005d
            r6 = r3
            goto L_0x005e
        L_0x0049:
            java.lang.String r0 = "replay"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x005d
            r6 = r2
            goto L_0x005e
        L_0x0053:
            java.lang.String r0 = "reload"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L_0x005d
            r6 = r4
            goto L_0x005e
        L_0x005d:
            r6 = -1
        L_0x005e:
            switch(r6) {
                case 2: goto L_0x0067;
                case 3: goto L_0x0066;
                case 4: goto L_0x0066;
                case 5: goto L_0x0065;
                case 6: goto L_0x0064;
                case 7: goto L_0x0063;
                default: goto L_0x0061;
            }
        L_0x0061:
            r6 = 0
            return r6
        L_0x0063:
            return r1
        L_0x0064:
            return r2
        L_0x0065:
            return r3
        L_0x0066:
            return r4
        L_0x0067:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6281n.m18703a(java.lang.String):byte");
    }

    /* renamed from: a */
    public final void mo35524a(C5847bw bwVar, boolean z) {
        C5847bw b;
        C5937dp f;
        if (this.f15837a.f14757j && !this.f15846j && (b = m18714b(this.f15837a, bwVar)) != null) {
            Map<String, String> a = mo35519a(b);
            b.f14711i = bwVar.f14711i;
            if (ShareConstants.VIDEO_URL.equals(b.f14704b) || b.f14710h) {
                byte b2 = b.f14711i;
                C5953dz dzVar = this.f15844h;
                if (dzVar != null) {
                    dzVar.mo35069a((byte) 4);
                }
                if (b2 != 0) {
                    String str = b.f14720r;
                    if (2 == b.f14715m && (f = ((C5869cj) b).mo34867b().mo35065f()) != null && f.f15034e != null && !f.f15034e.trim().isEmpty()) {
                        str = f.f15034e;
                    }
                    if (!C6193ia.m18370a(m18702B(), str)) {
                        str = b.f14721s;
                        if (!C6193ia.m18370a(m18702B(), str)) {
                            return;
                        }
                    }
                    String a2 = C6196id.m18383a(str, a);
                    if (!this.f15854r || z) {
                        m18707a(b, b2, a2);
                        return;
                    }
                    C6281n i = m18726i(this);
                    if (i != null) {
                        C6295c cVar = i.f15849m;
                        if (cVar != null) {
                            if (1 != b2 || !C6193ia.m18372a(a2)) {
                                cVar.mo34513g();
                            } else {
                                cVar.mo34509c();
                            }
                        }
                        this.f15829G = b;
                        this.f15830H = a2;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo35520a(int i, C5847bw bwVar) {
        if (!this.f15824B.contains(Integer.valueOf(i)) && !this.f15846j) {
            mo35571w();
            m18706a(i, (C5849by) bwVar);
        }
    }

    public void setFullScreenActivityContext(Activity activity) {
        this.f15851o = new WeakReference<>(activity);
    }

    /* renamed from: m */
    public final Activity mo35540m() {
        WeakReference<Activity> weakReference = this.f15851o;
        if (weakReference == null) {
            return null;
        }
        return (Activity) weakReference.get();
    }

    /* renamed from: w */
    private void mo35571w() {
        C5849by a = this.f15837a.mo34842a(0);
        if (!this.f15824B.contains(0) && a != null) {
            m18706a(0, a);
        }
    }

    /* renamed from: a */
    public final Map<String, String> mo35519a(C5847bw bwVar) {
        C5854ca caVar;
        HashMap hashMap = new HashMap(3);
        if (!this.f15846j && (caVar = this.f15837a) != null) {
            hashMap.put("$LTS", String.valueOf(caVar.f14751d.f14742z));
            C5849by a = C5854ca.m17427a(bwVar);
            long currentTimeMillis = System.currentTimeMillis();
            if (!(a == null || 0 == a.f14742z)) {
                currentTimeMillis = a.f14742z;
            }
            hashMap.put("$STS", String.valueOf(currentTimeMillis));
            hashMap.put("$TS", String.valueOf(System.currentTimeMillis()));
            hashMap.putAll(this.f15837a.mo34843a());
        }
        return hashMap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35528a(boolean z) {
        if (z) {
            m18729x();
        } else {
            m18730y();
        }
    }

    /* renamed from: b */
    static C5865ch m18715b(View view) {
        if (view != null) {
            return (C5865ch) view.findViewWithTag("timerView");
        }
        return null;
    }

    /* renamed from: c */
    protected static void m18719c(View view) {
        C5865ch b = m18715b(view);
        if (b != null) {
            b.mo34856b();
        }
    }

    /* renamed from: d */
    protected static void m18721d(View view) {
        C5865ch b = m18715b(view);
        if (b != null && b.f14797c != null && !b.f14797c.isRunning()) {
            b.f14797c.setCurrentPlayTime(b.f14796b);
            b.f14797c.start();
        }
    }

    /* renamed from: x */
    private void m18729x() {
        C6016ff z = m18731z();
        if (z != null) {
            z.f15252b.mo35135a();
        }
    }

    /* renamed from: y */
    private void m18730y() {
        C6016ff z = m18731z();
        if (z != null) {
            z.f15252b.mo35137b();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final void mo35541n() {
        final C6281n i = m18726i(this);
        if (i != null) {
            C6295c cVar = i.f15849m;
            if (cVar != null) {
                cVar.mo34509c();
            }
            this.f15834L.mo35396a(hashCode(), new C5727ah<C6281n>(this) {
                /* renamed from: a */
                public final void mo34371a() {
                    if (C6281n.this.f15828F == null) {
                        C6281n.m18710a(C6281n.this);
                    }
                    int a = InMobiAdActivity.m23146a((C6234j) C6281n.this.f15828F);
                    Intent intent = new Intent((Context) C6281n.this.f15850n.get(), InMobiAdActivity.class);
                    intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_INDEX", a);
                    intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_TYPE", 102);
                    intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_ACTIVITY_IS_FULL_SCREEN", true);
                    intent.putExtra("com.inmobi.ads.rendering.InMobiAdActivity.EXTRA_AD_CONTAINER_TYPE", ErrorCode.DIFFERENT_LINEARITY_EXPECTED_ERROR);
                    if (C6281n.this.f15854r) {
                        C6281n.this.f15855s = intent;
                    } else {
                        C6183hw.m18313a((Context) C6281n.this.f15850n.get(), intent);
                    }
                }

                /* renamed from: b */
                public final void mo34373b() {
                    super.mo34373b();
                    C6295c f = i.mo35533f();
                    if (f != null) {
                        f.mo34504a();
                    }
                }
            });
        }
    }

    /* renamed from: p */
    public final void mo35550p() {
        if (mo35542o()) {
            this.f15852p = true;
            C6295c cVar = this.f15849m;
            if (cVar != null && this.f15837a.f14754g != null) {
                cVar.mo34506a(this.f15837a.f14754g);
            }
        }
    }

    /* renamed from: a */
    private void mo35562a(C5869cj cjVar) {
        C5937dp f = cjVar.mo34867b().mo35065f();
        if (f != null && f.f15035g) {
            for (C5868ci a : f.mo35046a("closeEndCard")) {
                C5847bw.m17403a(a, mo35519a((C5847bw) cjVar), (C5817bk) null);
            }
            f.f15035g = false;
        }
    }

    /* renamed from: i */
    private static C6281n m18726i(C6281n nVar) {
        C6281n nVar2;
        while (nVar != null) {
            if (nVar.mo35540m() != null || nVar == (nVar2 = nVar.f15848l)) {
                return nVar;
            }
            nVar = nVar2;
        }
        return null;
    }

    /* renamed from: z */
    private C6016ff m18731z() {
        C6013fe feVar;
        C5953dz dzVar = this.f15844h;
        if (dzVar == null) {
            feVar = null;
        } else {
            feVar = (C6013fe) dzVar.mo35068a();
        }
        if (feVar != null) {
            this.f15826D = feVar.f15245b;
        }
        return this.f15826D;
    }

    /* renamed from: a */
    private void m18707a(C5847bw bwVar, byte b, String str) {
        if (1 == b) {
            m18717b(str);
        } else {
            m18712a(str, bwVar.f14721s, bwVar);
        }
    }

    /* renamed from: a */
    private void m18712a(String str, String str2, C5847bw bwVar) {
        String a;
        C6281n i;
        if (this.f15850n.get() != null && (a = C6193ia.m18368a((Context) this.f15850n.get(), str, str2)) != null && (i = m18726i(this)) != null) {
            C6295c cVar = i.f15849m;
            if (cVar != null && !this.f15854r) {
                cVar.mo34513g();
            }
            if (a.equals(str2)) {
                bwVar.mo34824a("TRACKER_EVENT_TYPE_FALLBACK_URL", mo35519a(bwVar), (C5817bk) null);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
        com.inmobi.media.C6193ia.m18374b(r0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0038 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m18717b(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.ref.WeakReference<android.content.Context> r0 = r3.f15850n
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            android.app.Activity r1 = r3.mo35540m()
            if (r1 != 0) goto L_0x0018
            com.inmobi.media.n$c r1 = r3.f15849m
            if (r1 == 0) goto L_0x0018
            r1.mo34509c()
        L_0x0018:
            java.lang.String r1 = com.inmobi.media.C6155h.m18219a(r0)
            com.inmobi.media.ft r2 = r3.getAdConfig()     // Catch:{ Exception -> 0x0038 }
            boolean r2 = r2.cctEnabled     // Catch:{ Exception -> 0x0038 }
            if (r1 == 0) goto L_0x0032
            if (r2 != 0) goto L_0x0027
            goto L_0x0032
        L_0x0027:
            com.inmobi.media.cr r1 = new com.inmobi.media.cr     // Catch:{ Exception -> 0x0038 }
            com.inmobi.media.f r2 = r3.f15836N     // Catch:{ Exception -> 0x0038 }
            r1.<init>(r4, r0, r2)     // Catch:{ Exception -> 0x0038 }
            r1.mo34872b()     // Catch:{ Exception -> 0x0038 }
            return
        L_0x0032:
            com.inmobi.media.f r1 = r3.f15836N     // Catch:{ Exception -> 0x0038 }
            r1.mo35143a(r4)     // Catch:{ Exception -> 0x0038 }
            return
        L_0x0038:
            com.inmobi.media.C6193ia.m18374b(r0, r4)     // Catch:{ URISyntaxException -> 0x003b }
        L_0x003b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6281n.m18717b(java.lang.String):void");
    }

    /* renamed from: A */
    private void m18701A() {
        Context context = (Context) this.f15850n.get();
        if (context instanceof Activity) {
            ((Activity) context).getApplication().unregisterActivityLifecycleCallbacks(this);
        }
    }

    public void onActivityStarted(Activity activity) {
        Context B = m18702B();
        if (B != null && B.equals(activity)) {
            mo35551q();
        }
    }

    /* renamed from: q */
    public final void mo35551q() {
        this.f15847k = false;
        m18721d(mo35534g());
        m18729x();
        C5953dz dzVar = this.f15844h;
        if (dzVar != null) {
            dzVar.mo35070a(m18702B(), (byte) 0);
        }
    }

    public void onActivityStopped(Activity activity) {
        Context B = m18702B();
        if (B != null && B.equals(activity)) {
            mo35552r();
        }
    }

    /* renamed from: B */
    private Context m18702B() {
        Activity m = mo35540m();
        return m == null ? (Context) this.f15850n.get() : m;
    }

    /* renamed from: r */
    public void mo35552r() {
        this.f15847k = true;
        m18719c(mo35534g());
        m18730y();
        C5953dz dzVar = this.f15844h;
        if (dzVar != null) {
            dzVar.mo35070a(m18702B(), (byte) 1);
        }
    }

    public void onActivityDestroyed(Activity activity) {
        C5953dz dzVar = this.f15844h;
        if (dzVar != null) {
            dzVar.mo35070a(activity, (byte) 2);
        }
        m18701A();
    }

    /* renamed from: s */
    public final void mo35553s() {
        C5847bw bwVar = this.f15829G;
        if (bwVar != null && this.f15830H != null) {
            m18707a(bwVar, bwVar.f14711i, this.f15830H);
        } else if (this.f15855s != null && this.f15850n.get() != null) {
            C6183hw.m18313a((Context) this.f15850n.get(), this.f15855s);
        }
    }

    /* renamed from: t */
    public final void mo35554t() {
        new C6293a(this).start();
    }

    /* renamed from: com.inmobi.media.n$a */
    /* compiled from: NativeAdContainer */
    final class C6293a extends Thread {

        /* renamed from: b */
        private WeakReference<C6281n> f15875b;

        C6293a(C6281n nVar) {
            this.f15875b = new WeakReference<>(nVar);
        }

        public final void run() {
            if (C6281n.this.mo35540m() == null) {
                String unused = C6281n.f15822z;
                return;
            }
            C6281n nVar = (C6281n) this.f15875b.get();
            if (nVar != null && !nVar.f15846j) {
                try {
                    C5854ca i = nVar.mo35536i();
                    if (C6281n.this.mo35540m() != null) {
                        if (i.f14752e.length() != 0) {
                            String unused2 = C6281n.f15822z;
                            JSONObject b = i.mo34845b();
                            if (b != null) {
                                C5854ca caVar = new C5854ca((int) C6281n.this.getPlacementType(), b, i, C6281n.this.getPlacementType() == 0, C6281n.this.getAdConfig());
                                if (caVar.mo34848d()) {
                                    C6281n a = C6294b.m18786a(C6281n.this.mo35540m(), (byte) 0, caVar, C6281n.this.f15839c, (Set<C5951dx>) null, C6281n.this.f15838b, C6281n.this.f15840d, C6281n.this.f15842f, C6281n.this.f15841e);
                                    String unused3 = C6281n.f15822z;
                                    a.mo35525a((C6234j) nVar);
                                    a.f15856t = nVar.f15856t;
                                    nVar.f15831I = a;
                                    return;
                                }
                                String unused4 = C6281n.f15822z;
                                return;
                            }
                            return;
                        }
                    }
                    String unused5 = C6281n.f15822z;
                } catch (Exception e) {
                    String unused6 = C6281n.f15822z;
                    C6130gj.m18161a().mo35310a(new C6167hk(e));
                }
            }
        }
    }

    /* renamed from: u */
    public final C6321s mo35555u() {
        if (this.f15832J == null) {
            this.f15832J = new C6321s() {
                /* renamed from: a */
                public final void mo34403a() {
                    C6295c f = C6281n.this.mo35533f();
                    if (f != null) {
                        f.mo34504a();
                    }
                }

                /* renamed from: a_ */
                public final void mo34552a_(C6301q qVar) {
                    C6295c f = C6281n.this.mo35533f();
                    if (f != null) {
                        f.mo34508b();
                    }
                }

                /* renamed from: b_ */
                public final void mo34558b_(C6301q qVar) {
                    C6295c f = C6281n.this.mo35533f();
                    if (f != null) {
                        f.mo34512f();
                    }
                }

                /* renamed from: a */
                public final void mo34428a(HashMap<Object, Object> hashMap) {
                    C6295c f = C6281n.this.mo35533f();
                    if (f != null) {
                        f.mo34511e();
                    }
                }

                /* renamed from: a_ */
                public final void mo34435a_() {
                    C6295c f = C6281n.this.mo35533f();
                    if (f != null) {
                        f.mo34513g();
                    }
                }

                /* renamed from: d_ */
                public final void mo35558d_() {
                    C6295c f = C6281n.this.mo35533f();
                    if (f != null && C6281n.this.getPlacementType() == 0) {
                        f.mo34509c();
                    }
                }

                /* renamed from: c_ */
                public final C6268jq mo34455c_() {
                    return C6268jq.m18631a();
                }

                /* renamed from: a */
                public final void mo34421a(C6173ho hoVar) {
                    C6295c f = C6281n.this.mo35533f();
                    if (f != null) {
                        f.mo34505a(hoVar);
                    }
                }
            };
        }
        return this.f15832J;
    }

    /* renamed from: a */
    public final void mo35449a(byte b, Map<String, String> map) {
        if (!this.f15846j) {
            if (b == 1) {
                this.f15837a.f14751d.mo34824a("load", map, (C5817bk) null);
            } else if (b == 2) {
                this.f15837a.f14751d.mo34824a("client_fill", map, (C5817bk) null);
            }
        }
    }

    /* renamed from: e */
    public final C6173ho mo35532e() {
        Map<String, C6166hj> map = this.f15859w;
        return new C6173ho(map != null ? map.get("AdImpressionSuccessful") : null, this.f15841e, getMarkupType());
    }

    /* renamed from: a */
    private void m18706a(int i, C5849by byVar) {
        if (!this.f15846j) {
            this.f15824B.add(Integer.valueOf(i));
            byVar.f14742z = System.currentTimeMillis();
            if (this.f15845i) {
                m18716b((C5847bw) byVar, mo35519a((C5847bw) byVar));
            } else {
                this.f15825C.add(byVar);
            }
        }
    }

    /* renamed from: b */
    private C5847bw m18714b(C5854ca caVar, C5847bw bwVar) {
        C5847bw bwVar2 = null;
        if (caVar == null) {
            return null;
        }
        String str = bwVar.f14720r;
        String str2 = bwVar.f14721s;
        if (str != null) {
            bwVar2 = m18704a(bwVar, caVar, str);
        }
        return (bwVar2 != null || str2 == null) ? bwVar2 : m18704a(bwVar, caVar, str2);
    }

    /* renamed from: a */
    public static C5847bw m18705a(C5854ca caVar, C5847bw bwVar) {
        while (caVar != null) {
            String str = bwVar.f14712j;
            if (str == null || str.length() == 0) {
                bwVar.f14714l = 0;
                return bwVar;
            }
            String[] split = str.split("\\|");
            if (1 == split.length) {
                bwVar.f14714l = m18703a(split[0]);
                return bwVar;
            }
            C5847bw b = caVar.mo34844b(split[0]);
            if (b == null) {
                caVar = caVar.f14753f;
            } else if (b.equals(bwVar)) {
                return null;
            } else {
                b.f14714l = m18703a(split[1]);
                return b;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void mo35523a(View view, C5847bw bwVar) {
        C6295c cVar;
        if (!this.f15846j) {
            mo35571w();
            C5847bw b = m18714b(this.f15837a, bwVar);
            if (b != null) {
                Map<String, String> a = mo35519a(b);
                m18708a(b, a);
                if (!b.equals(bwVar)) {
                    m18708a(bwVar, a);
                }
            } else {
                m18708a(bwVar, mo35519a(bwVar));
            }
            C6281n i = m18726i(this);
            if (i != null) {
                if (!bwVar.f14720r.trim().isEmpty() && (cVar = i.f15849m) != null) {
                    cVar.mo34511e();
                }
                C5847bw a2 = m18705a(this.f15837a, bwVar);
                if (a2 != null) {
                    if (view != null && ShareConstants.VIDEO_URL.equals(a2.f14704b) && 5 == a2.f14714l) {
                        view.setVisibility(4);
                        bwVar.f14726x = 4;
                    }
                    mo35529b(a2);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo35522a(View view) {
        C6295c cVar;
        if (!this.f15845i && !this.f15846j) {
            this.f15845i = true;
            this.f15837a.f14751d.mo34824a("Impression", mo35519a((C5847bw) this.f15837a.f14751d), this.f15860x);
            mo35571w();
            for (C5847bw next : this.f15825C) {
                m18716b(next, mo35519a(next));
            }
            this.f15825C.clear();
            this.f15844h.mo35069a((byte) 0);
            C6281n i = m18726i(this);
            if (i != null && (cVar = i.f15849m) != null) {
                cVar.mo34510d();
            }
        }
    }

    /* renamed from: a */
    private static void m18708a(C5847bw bwVar, Map<String, String> map) {
        if (2 == bwVar.f14715m) {
            C5937dp f = ((C5869cj) bwVar).mo34867b().mo35065f();
            if (f == null || (f.f15034e == null && bwVar.f14720r != null)) {
                bwVar.mo34824a("click", map, (C5817bk) null);
            } else if (f.f15033d.size() > 0) {
                for (C5868ci a : f.mo35046a("click")) {
                    C5847bw.m17403a(a, map, (C5817bk) null);
                }
            }
        } else {
            bwVar.mo34824a("click", map, (C5817bk) null);
        }
    }

    /* renamed from: b */
    private static void m18716b(C5847bw bwVar, Map<String, String> map) {
        if (bwVar != null) {
            bwVar.mo34824a("page_view", map, (C5817bk) null);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo35529b(C5847bw bwVar) {
        C6051fn fnVar;
        byte b = bwVar.f14714l;
        if (b == 0) {
            return;
        }
        if (b == 1) {
            try {
                if (this.f15856t != null) {
                    this.f15856t.mo35588d("window.imraid.broadcastEvent('close');");
                }
                mo35450b();
            } catch (Exception e) {
                C6195ic.m18378a((byte) 2, "InMobi", "SDK encountered unexpected error in exiting video");
                C6130gj.m18161a().mo35310a(new C6167hk(e));
            }
        } else if (b == 3) {
            try {
                if (this.f15856t != null) {
                    this.f15856t.mo35588d("window.imraid.broadcastEvent('replay');");
                }
                if (mo35534g() != null) {
                    View g = mo35534g();
                    ViewGroup viewGroup = (ViewGroup) g.getParent();
                    if (viewGroup != null) {
                        viewGroup.removeView(g);
                    }
                }
                C6281n nVar = this.f15848l;
                C5865ch b2 = m18715b(nVar.mo35534g());
                if (!(b2 == null || b2.f14797c == null || !b2.f14797c.isRunning())) {
                    b2.f14797c.setCurrentPlayTime(b2.f14795a * 1000);
                    b2.mo34855a(1.0f);
                }
                if (ShareConstants.VIDEO_URL.equals(bwVar.f14704b) && (nVar instanceof C6296o) && (fnVar = (C6051fn) nVar.getVideoContainerView()) != null) {
                    C6038fm videoView = fnVar.getVideoView();
                    C5869cj cjVar = (C5869cj) videoView.getTag();
                    if (cjVar != null) {
                        if (cjVar.mo34866a()) {
                            videoView.mo35228i();
                        } else {
                            videoView.mo35227h();
                        }
                    } else if (1 == getPlacementType()) {
                        videoView.mo35228i();
                    } else {
                        videoView.mo35227h();
                    }
                    mo35562a(cjVar);
                    videoView.start();
                }
            } catch (Exception e2) {
                C6195ic.m18378a((byte) 2, "InMobi", "SDK encountered unexpected error in replaying video");
                C6130gj.m18161a().mo35310a(new C6167hk(e2));
            }
        } else if (b == 4) {
            try {
                if (getPlacementType() == 0) {
                    mo35541n();
                }
            } catch (Exception e3) {
                C6195ic.m18378a((byte) 2, "InMobi", "SDK encountered unexpected error in launching fullscreen ad");
                C6130gj.m18161a().mo35310a(new C6167hk(e3));
            }
        } else if (b != 5) {
            this.f15852p = true;
            C6301q qVar = this.f15856t;
            if (!(qVar == null || qVar == null)) {
                qVar.mo35588d("window.imraid.broadcastEvent('skip');");
            }
            m18719c(mo35534g());
            mo35530c(bwVar);
        }
    }

    /* renamed from: b */
    public final void mo35450b() {
        C6281n i;
        Activity activity;
        C6051fn fnVar;
        try {
            if (!this.f15846j && (i = m18726i(this)) != null) {
                i.mo35550p();
                InMobiAdActivity.m23150a((Object) i);
                if ((i instanceof C6296o) && (fnVar = (C6051fn) ((C6296o) i).getVideoContainerView()) != null) {
                    C6038fm videoView = fnVar.getVideoView();
                    C5869cj cjVar = (C5869cj) videoView.getTag();
                    cjVar.f14724v.put("seekPosition", Integer.valueOf(videoView.getCurrentPosition()));
                    cjVar.f14724v.put("lastMediaVolume", Integer.valueOf(videoView.getVolume()));
                    if (cjVar.f14727y != null) {
                        ((C5869cj) cjVar.f14727y).mo34865a(cjVar);
                    }
                    mo35562a(cjVar);
                }
                if (i.f15851o == null) {
                    activity = null;
                } else {
                    activity = (Activity) i.f15851o.get();
                }
                if (activity instanceof InMobiAdActivity) {
                    ((InMobiAdActivity) activity).f19592b = true;
                    activity.finish();
                    if (this.f15827E != -1) {
                        activity.overridePendingTransition(0, this.f15827E);
                    }
                }
                this.f15848l.f15828F = null;
                new Handler(Looper.getMainLooper()).post(new Runnable() {
                    public final void run() {
                        C6281n.this.f15848l.f15834L.mo35396a(C6281n.this.f15848l.hashCode(), C6281n.this.f15848l.f15835M);
                    }
                });
            }
        } catch (Exception e) {
            C6195ic.m18378a((byte) 2, "InMobi", "SDK encountered unexpected error in exiting video");
            C6130gj.m18161a().mo35310a(new C6167hk(e));
        }
    }

    /* renamed from: a */
    public final void mo35527a(C6301q qVar) {
        if (this.f15858v == 0 && this.f15857u == null && this.f15856t == null) {
            this.f15857u = qVar;
        }
    }

    /* renamed from: c */
    public final void mo35530c(C5847bw bwVar) {
        C5937dp f;
        C6281n nVar = this.f15831I;
        if (nVar == null || mo35534g() == null) {
            C6195ic.m18378a((byte) 2, "InMobi", "Failed to show end card");
            mo35450b();
            return;
        }
        try {
            ViewGroup viewGroup = (ViewGroup) mo35534g();
            View a = nVar.getViewableAd().mo35067a((View) null, viewGroup, false);
            if (a != null) {
                viewGroup.addView(a);
                a.setClickable(true);
                nVar.m18729x();
                if ((bwVar instanceof C5869cj) && (f = ((C5869cj) bwVar).mo34867b().mo35065f()) != null) {
                    f.f15035g = true;
                    return;
                }
                return;
            }
            mo35450b();
        } catch (Exception e) {
            mo35450b();
            C6130gj.m18161a().mo35310a(new C6167hk(e));
        }
    }

    public /* bridge */ /* synthetic */ Object getDataModel() {
        return this.f15837a;
    }

    /* renamed from: a */
    static /* synthetic */ void m18710a(C6281n nVar) {
        JSONObject b;
        C6281n nVar2 = nVar;
        C5854ca caVar = nVar2.f15837a;
        if (caVar.f14752e.length() != 0 && (b = caVar.mo34845b()) != null) {
            C5854ca caVar2 = new C5854ca((int) nVar.getPlacementType(), b, caVar, nVar.getPlacementType() == 0, nVar.getAdConfig());
            caVar2.f14750c = caVar.f14750c;
            caVar2.f14757j = caVar.f14757j;
            Context context = (Context) nVar2.f15850n.get();
            if (caVar2.mo34848d() && context != null) {
                C6281n a = C6294b.m18786a(context, (byte) 0, caVar2, nVar2.f15839c, nVar2.f15843g, nVar2.f15838b, nVar2.f15840d, nVar2.f15842f, nVar2.f15841e);
                nVar2.f15828F = a;
                a.mo35525a((C6234j) nVar2);
                C6295c cVar = nVar2.f15849m;
                if (cVar != null) {
                    nVar2.f15828F.f15849m = cVar;
                }
                if (caVar.f14750c) {
                    new Handler(Looper.getMainLooper()).post(new Runnable() {
                        public final void run() {
                            C6281n.this.f15828F.getViewableAd().mo35067a((View) null, new RelativeLayout(C6281n.this.mo35538k()), false);
                        }
                    });
                }
            }
        }
    }
}
