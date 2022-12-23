package com.bytedance.sdk.openadsdk.core.p144b;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import com.bykv.p054vk.openvk.component.video.api.p072d.C2405c;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.openadsdk.TTNativeAd;
import com.bytedance.sdk.openadsdk.TTNativeExpressAd;
import com.bytedance.sdk.openadsdk.core.C3457h;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.C3704y;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C3528a;
import com.bytedance.sdk.openadsdk.core.p144b.C3362c;
import com.bytedance.sdk.openadsdk.core.p149e.C3409g;
import com.bytedance.sdk.openadsdk.core.p149e.C3414j;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.p149e.C3434p;
import com.bytedance.sdk.openadsdk.p128b.C3066b;
import com.bytedance.sdk.openadsdk.p128b.C3090e;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import com.bytedance.sdk.openadsdk.p178l.C3904y;
import com.com.bytedance.overseas.sdk.p185a.C3968c;
import com.com.bytedance.overseas.sdk.p185a.C3969d;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.b.b */
/* compiled from: ClickListener */
public class C3360b extends C3362c {

    /* renamed from: F */
    private WeakReference<Activity> f8043F;

    /* renamed from: G */
    private boolean f8044G;

    /* renamed from: a */
    private String f8045a;

    /* renamed from: b */
    protected Context f8046b;

    /* renamed from: c */
    public C3414j f8047c;

    /* renamed from: d */
    protected final C3431n f8048d;

    /* renamed from: e */
    protected final String f8049e;

    /* renamed from: f */
    protected final int f8050f;

    /* renamed from: g */
    protected WeakReference<View> f8051g;

    /* renamed from: h */
    protected WeakReference<View> f8052h;

    /* renamed from: i */
    protected C3409g f8053i;

    /* renamed from: j */
    protected C3361a f8054j;

    /* renamed from: k */
    protected TTNativeAd f8055k;

    /* renamed from: l */
    protected C2405c f8056l;

    /* renamed from: m */
    protected boolean f8057m;

    /* renamed from: n */
    protected C3968c f8058n;

    /* renamed from: o */
    protected Map<String, Object> f8059o;

    /* renamed from: p */
    protected TTNativeExpressAd f8060p;

    /* renamed from: q */
    protected C3528a f8061q;

    /* renamed from: r */
    protected int f8062r;

    /* renamed from: com.bytedance.sdk.openadsdk.core.b.b$a */
    /* compiled from: ClickListener */
    public interface C3361a {
        /* renamed from: a */
        void mo18309a(View view, int i);
    }

    /* renamed from: a */
    public void mo19311a(C3968c cVar) {
        this.f8058n = cVar;
    }

    /* renamed from: a */
    public void mo19310a(C3528a aVar) {
        this.f8061q = aVar;
    }

    /* renamed from: a */
    public void mo19307a(TTNativeAd tTNativeAd) {
        this.f8055k = tTNativeAd;
    }

    /* renamed from: a */
    public void mo19308a(TTNativeExpressAd tTNativeExpressAd) {
        this.f8060p = tTNativeExpressAd;
    }

    /* renamed from: d */
    public void mo19321d(boolean z) {
        this.f8057m = z;
    }

    /* renamed from: a */
    public void mo19306a(C2405c cVar) {
        this.f8056l = cVar;
    }

    public C3360b(Context context, C3431n nVar, String str, int i) {
        this.f8057m = false;
        this.f8062r = 0;
        this.f8044G = false;
        this.f8046b = context;
        this.f8048d = nVar;
        this.f8049e = str;
        this.f8050f = i;
    }

    public C3360b(Context context, C3431n nVar, String str, int i, boolean z) {
        this(context, nVar, str, i);
        this.f8044G = z;
    }

    /* renamed from: a */
    public void mo19309a(C3361a aVar) {
        this.f8054j = aVar;
    }

    /* renamed from: a */
    public void mo19304a(Activity activity) {
        if (activity != null) {
            this.f8043F = new WeakReference<>(activity);
        }
    }

    /* renamed from: a */
    public void mo19305a(View view) {
        if (view != null) {
            this.f8051g = new WeakReference<>(view);
        }
    }

    /* renamed from: b */
    public void mo19317b(View view) {
        if (view != null) {
            this.f8052h = new WeakReference<>(view);
        }
    }

    /* renamed from: d */
    public View mo19319d() {
        WeakReference<Activity> weakReference = this.f8043F;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return ((Activity) this.f8043F.get()).findViewById(16908290);
    }

    /* renamed from: e */
    public View mo19322e() {
        WeakReference<Activity> weakReference = this.f8043F;
        if (weakReference == null || weakReference.get() == null) {
            return null;
        }
        return ((Activity) this.f8043F.get()).findViewById(C2914t.m8158e(C3513m.m10963a(), "tt_top_dislike"));
    }

    /* renamed from: a */
    public void mo19313a(Map<String, Object> map) {
        this.f8059o = map;
    }

    /* renamed from: a */
    public void mo19303a(int i) {
        this.f8069A = i;
    }

    /* renamed from: b */
    public void mo19316b(int i) {
        this.f8082z = i;
    }

    /* renamed from: c */
    public void mo19318c(int i) {
        this.f8081y = i;
    }

    /* renamed from: d */
    public void mo19320d(int i) {
        this.f8062r = i;
    }

    /* renamed from: a */
    public void mo18383a(View view, float f, float f2, float f3, float f4, SparseArray<C3362c.C3363a> sparseArray, boolean z) {
        JSONObject jSONObject;
        int i;
        View view2;
        View view3;
        C3431n nVar;
        View view4 = view;
        boolean z2 = z;
        if (this.f8046b == null) {
            this.f8046b = C3513m.m10963a();
        }
        if ((this.f8044G || !mo19314a(view, 1, f, f2, f3, f4, sparseArray, z)) && this.f8046b != null) {
            C3414j jVar = this.f8047c;
            if (jVar != null) {
                i = jVar.f8276l;
                jSONObject = this.f8047c.f8277m;
            } else {
                jSONObject = null;
                i = -1;
            }
            long j = this.f8079w;
            long j2 = this.f8080x;
            WeakReference<View> weakReference = this.f8051g;
            if (weakReference == null) {
                view2 = null;
            } else {
                view2 = (View) weakReference.get();
            }
            WeakReference<View> weakReference2 = this.f8052h;
            if (weakReference2 == null) {
                view3 = null;
            } else {
                view3 = (View) weakReference2.get();
            }
            C3409g a = mo19302a(f, f2, f3, f4, sparseArray, j, j2, view2, view3, mo19323f(), C3904y.m12885e(this.f8046b), C3904y.m12890g(this.f8046b), C3904y.m12888f(this.f8046b), i, jSONObject);
            this.f8053i = a;
            if (this.f8044G) {
                C3090e.m8901a(this.f8046b, "click", this.f8048d, a, this.f8049e, true, this.f8059o, z ? 1 : 2);
                return;
            }
            boolean z3 = z;
            C3361a aVar = this.f8054j;
            View view5 = view;
            if (aVar != null) {
                aVar.mo18309a(view5, -1);
            }
            if (mo19315a(view5, z3)) {
                boolean a2 = C3434p.m10489a(this.f8048d);
                String a3 = a2 ? this.f8049e : C3898x.m12752a(this.f8050f);
                if (view5 != null) {
                    try {
                        if (((Boolean) view5.getTag(C2914t.m8158e(C3513m.m10963a(), "tt_id_is_video_picture"))).booleanValue()) {
                            C3704y.m12112a(true);
                        }
                    } catch (Exception unused) {
                    }
                }
                boolean a4 = C3704y.m12113a(this.f8046b, this.f8048d, this.f8050f, this.f8055k, this.f8060p, a3, this.f8058n, a2);
                C3704y.m12112a(false);
                if (a4 || (nVar = this.f8048d) == null || nVar.mo19568ab() == null || this.f8048d.mo19568ab().mo19448c() != 2) {
                    C3431n nVar2 = this.f8048d;
                    if (nVar2 != null && !a4 && TextUtils.isEmpty(nVar2.mo19522O()) && C3066b.m8762a(this.f8049e)) {
                        C3969d.m13089a(this.f8046b, this.f8048d, this.f8049e).mo20860d();
                    }
                    C3090e.m8901a(this.f8046b, "click", this.f8048d, this.f8053i, this.f8049e, a4, this.f8059o, z3 ? 1 : 2);
                }
            }
        }
    }

    /* renamed from: a */
    public boolean mo19315a(View view, boolean z) {
        return m9975a(view, this.f8048d, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x004f A[RETURN] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m9975a(android.view.View r4, com.bytedance.sdk.openadsdk.core.p149e.C3431n r5, boolean r6) {
        /*
            r0 = 1
            if (r4 == 0) goto L_0x004f
            if (r5 != 0) goto L_0x0006
            goto L_0x004f
        L_0x0006:
            android.content.Context r1 = com.bytedance.sdk.openadsdk.core.C3513m.m10963a()
            java.lang.String r2 = "tt_id_click_tag"
            int r1 = com.bytedance.sdk.component.utils.C2914t.m8158e(r1, r2)
            java.lang.Object r1 = r4.getTag(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            android.content.Context r3 = com.bytedance.sdk.openadsdk.core.C3513m.m10963a()
            int r2 = com.bytedance.sdk.component.utils.C2914t.m8158e(r3, r2)
            java.lang.Object r2 = r4.getTag(r2)
            if (r2 == 0) goto L_0x0036
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0036
            java.lang.String r4 = "click"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x0035
            return r6
        L_0x0035:
            return r0
        L_0x0036:
            boolean r4 = m9976c((android.view.View) r4)
            r1 = 0
            if (r4 == 0) goto L_0x0046
            int r4 = r5.mo19625i()
            if (r4 != r0) goto L_0x004f
            if (r6 != 0) goto L_0x004f
            return r1
        L_0x0046:
            int r4 = r5.mo19621h()
            if (r4 != r0) goto L_0x004f
            if (r6 != 0) goto L_0x004f
            return r1
        L_0x004f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.p144b.C3360b.m9975a(android.view.View, com.bytedance.sdk.openadsdk.core.e.n, boolean):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C3409g mo19302a(float f, float f2, float f3, float f4, SparseArray<C3362c.C3363a> sparseArray, long j, long j2, View view, View view2, String str, float f5, int i, float f6, int i2, JSONObject jSONObject) {
        float f7 = f;
        float f8 = f2;
        float f9 = f3;
        float f10 = f4;
        long j3 = j;
        long j4 = j2;
        SparseArray<C3362c.C3363a> sparseArray2 = sparseArray;
        return new C3409g.C3411a().mo19441f(f).mo19439e(f2).mo19436d(f3).mo19433c(f4).mo19431b(j).mo19423a(j2).mo19432b(C3904y.m12867a(view)).mo19427a(C3904y.m12867a(view2)).mo19435c(C3904y.m12880c(view)).mo19438d(C3904y.m12880c(view2)).mo19437d(this.f8081y).mo19440e(this.f8082z).mo19442f(this.f8069A).mo19424a(sparseArray).mo19430b(C3457h.m10580d().mo19752b() ? 1 : 2).mo19425a(str).mo19421a(f5).mo19434c(i).mo19429b(f6).mo19422a(i2).mo19426a(jSONObject).mo19428a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo19314a(View view, int i, float f, float f2, float f3, float f4, SparseArray<C3362c.C3363a> sparseArray, boolean z) {
        if (this.f8061q == null) {
            return false;
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        WeakReference<View> weakReference = this.f8052h;
        if (weakReference != null) {
            iArr = C3904y.m12867a((View) weakReference.get());
            iArr2 = C3904y.m12880c((View) this.f8052h.get());
        }
        this.f8061q.mo20002a(view, i, new C3414j.C3416a().mo19464d(f).mo19462c(f2).mo19459b(f3).mo19451a(f4).mo19461b(this.f8079w).mo19453a(this.f8080x).mo19463c(iArr[0]).mo19465d(iArr[1]).mo19466e(iArr2[0]).mo19467f(iArr2[1]).mo19454a(sparseArray).mo19457a(z).mo19458a());
        return true;
    }

    /* renamed from: c */
    public static boolean m9976c(View view) {
        return C2914t.m8158e(view.getContext(), "tt_reward_ad_download") == view.getId() || C2914t.m8158e(view.getContext(), "tt_reward_ad_download_backup") == view.getId() || C2914t.m8158e(view.getContext(), "tt_bu_download") == view.getId() || C2914t.m8158e(view.getContext(), "btn_native_creative") == view.getId() || C2914t.m8158e(view.getContext(), "tt_full_ad_download") == view.getId() || C2914t.m8158e(view.getContext(), "tt_playable_play") == view.getId();
    }

    /* renamed from: f */
    public String mo19323f() {
        return this.f8045a;
    }

    /* renamed from: a */
    public void mo19312a(String str) {
        this.f8045a = str;
    }
}
