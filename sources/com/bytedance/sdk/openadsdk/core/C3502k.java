package com.bytedance.sdk.openadsdk.core;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.bytedance.sdk.component.adexpress.p089a.p090a.C2529a;
import com.bytedance.sdk.component.adexpress.p089a.p090a.C2530b;
import com.bytedance.sdk.component.adexpress.p089a.p090a.C2531c;
import com.bytedance.sdk.component.adexpress.p089a.p090a.C2532d;
import com.bytedance.sdk.component.adexpress.p089a.p091b.C2533a;
import com.bytedance.sdk.component.adexpress.p089a.p092c.C2544a;
import com.bytedance.sdk.component.p118e.p120b.C2844a;
import com.bytedance.sdk.component.p118e.p120b.C2846b;
import com.bytedance.sdk.component.widget.p125a.C2929a;
import com.bytedance.sdk.component.widget.p125a.C2930b;
import com.bytedance.sdk.component.widget.p126b.C2931a;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.video.p161b.C3597a;
import com.bytedance.sdk.openadsdk.multipro.C3948b;
import com.bytedance.sdk.openadsdk.multipro.aidl.C3947c;
import com.bytedance.sdk.openadsdk.multipro.p179a.C3909a;
import com.bytedance.sdk.openadsdk.p128b.C3090e;
import com.bytedance.sdk.openadsdk.p170h.C3753b;
import com.bytedance.sdk.openadsdk.p170h.p171a.C3752b;
import com.bytedance.sdk.openadsdk.p174i.C3791c;
import com.bytedance.sdk.openadsdk.p174i.C3792d;
import com.bytedance.sdk.openadsdk.p178l.C3885n;
import com.bytedance.sdk.openadsdk.p178l.C3894t;
import com.bytedance.sdk.openadsdk.p178l.C3904y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.k */
/* compiled from: InitHelper */
public class C3502k {

    /* renamed from: a */
    public static volatile boolean f8766a = false;

    /* renamed from: b */
    public static AtomicBoolean f8767b = new AtomicBoolean(false);

    /* renamed from: c */
    public static volatile boolean f8768c = false;

    /* renamed from: d */
    public static final List<TTAdSdk.InitCallback> f8769d = Collections.synchronizedList(new ArrayList());

    /* renamed from: e */
    private static AtomicBoolean f8770e = new AtomicBoolean(false);

    /* renamed from: f */
    private static volatile HandlerThread f8771f;

    /* renamed from: g */
    private static volatile Handler f8772g = null;

    /* renamed from: h */
    private static volatile int f8773h = 0;

    /* renamed from: com.bytedance.sdk.openadsdk.core.k$a */
    /* compiled from: InitHelper */
    private static class C3507a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final Handler f8774a = new Handler(Looper.getMainLooper());
    }

    static {
        f8771f = null;
        f8771f = new HandlerThread("csj_init", 10);
        f8771f.start();
    }

    /* renamed from: a */
    public static void m10916a() {
        Context a;
        if (C3513m.m10973h().mo19845d() && (a = C3513m.m10963a()) != null) {
            try {
                C3792d.m12395a().mo20615b().mo17682a(a, C3948b.m12959c(), true, new C3791c(a));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m10918a(Context context) {
        C3894t.m12720a();
        C3904y.m12849a(context);
        m10920b(context);
        C3513m.m10974i().mo20585a();
        C3579s.m11319a(C3472j.m10774a(context));
        C3513m.m10972g().mo20694a();
        C2533a.m6366a();
        C3597a.m11391a().mo20170b();
    }

    /* renamed from: b */
    public static void m10919b() {
        C2529a.m6339a().mo16545a((C2530b) new C2530b() {
            /* renamed from: a */
            public int mo16553a(String str, ContentValues contentValues, String str2, String[] strArr) {
                return C3909a.m12906a(C3513m.m10963a(), str, contentValues, str2, strArr);
            }

            /* renamed from: a */
            public Cursor mo16555a(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
                return new C3947c(C3909a.m12910a(C3513m.m10963a(), str, strArr, str2, strArr2, str3, str4, str5));
            }

            /* renamed from: a */
            public int mo16554a(String str, String str2, String[] strArr) {
                return C3909a.m12907a(C3513m.m10963a(), str, str2, strArr);
            }

            /* renamed from: a */
            public void mo16556a(String str, ContentValues contentValues) {
                C3909a.m12912a(C3513m.m10963a(), str, contentValues);
            }
        });
        C2529a.m6339a().mo16546a((C2531c) new C2531c() {
            /* renamed from: d */
            public void mo16560d() {
            }

            /* renamed from: i */
            public int mo16565i() {
                return 1;
            }

            /* renamed from: k */
            public int mo16567k() {
                return 0;
            }

            /* renamed from: a */
            public int mo16557a() {
                if (C3513m.m10973h() == null) {
                    return 0;
                }
                return C3513m.m10973h().mo19838b();
            }

            /* renamed from: b */
            public Context mo16558b() {
                return C3513m.m10963a();
            }

            /* renamed from: c */
            public Handler mo16559c() {
                return C3502k.m10922d();
            }

            /* renamed from: e */
            public C2544a mo16561e() {
                return C3513m.m10971f().mo19980a();
            }

            /* renamed from: f */
            public C2844a mo16562f() {
                return C3792d.m12395a().mo20615b().mo17685d();
            }

            /* renamed from: g */
            public C2846b mo16563g() {
                return C3792d.m12395a().mo20615b().mo17684c();
            }

            /* renamed from: h */
            public String mo16564h() {
                return C3457h.m10580d().mo19764f();
            }

            /* renamed from: j */
            public int mo16566j() {
                return C3513m.m10973h().mo19831H();
            }
        });
        C2529a.m6339a().mo16547a((C2532d) new C2532d() {
            /* renamed from: a */
            public void mo16568a(int i) {
                C3753b.m12287a().mo20575b(C3752b.m12257b().mo20545b(i).mo20553f(C3446g.m10553a(i)));
            }
        });
        C2929a.m8227a().mo17906a(new C2930b() {
            /* renamed from: a */
            public boolean mo17909a() {
                return true;
            }

            /* renamed from: a */
            public void mo17908a(C2931a aVar, String str, String str2, JSONObject jSONObject, long j) {
                C3431n nVar = new C3431n();
                nVar.mo19650q(aVar.mo17910a());
                nVar.mo19639m(aVar.mo17913b());
                nVar.mo19633k(aVar.mo17915c());
                C3090e.m8898a(C3513m.m10963a(), nVar, str, str2, jSONObject, j);
            }
        });
    }

    /* renamed from: b */
    private static void m10920b(Context context) {
        C3388c.m10078a(context).mo19366a("uuid", C3885n.m12675a());
    }

    /* renamed from: c */
    public static Handler m10921c() {
        Class<C3502k> cls = C3502k.class;
        if (f8771f == null || !f8771f.isAlive()) {
            synchronized (cls) {
                if (f8771f == null || !f8771f.isAlive()) {
                    f8771f = new HandlerThread("csj_init", -1);
                    f8771f.start();
                    f8772g = new Handler(f8771f.getLooper());
                }
            }
        } else if (f8772g == null) {
            synchronized (cls) {
                if (f8772g == null) {
                    f8772g = new Handler(f8771f.getLooper());
                }
            }
        }
        return f8772g;
    }

    /* renamed from: d */
    public static Handler m10922d() {
        return C3507a.f8774a;
    }

    /* renamed from: e */
    public static int m10923e() {
        return f8773h;
    }

    /* renamed from: a */
    public static void m10917a(int i) {
        f8773h = i;
    }
}
