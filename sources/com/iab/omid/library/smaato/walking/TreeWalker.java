package com.iab.omid.library.smaato.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.smaato.adsession.C8021a;
import com.iab.omid.library.smaato.walking.C8030a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import p012c.C0689a;
import p396d.C12459a;
import p396d.C12461b;
import p397e.C12465b;
import p397e.C12468d;
import p397e.C12470f;
import p398f.C12471a;
import p399g.C12476c;
import p400h.C12480a;

public class TreeWalker implements C12459a.C12460a {

    /* renamed from: i */
    private static TreeWalker f19396i = new TreeWalker();

    /* renamed from: j */
    private static Handler f19397j = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static Handler f19398k = null;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final Runnable f19399l = new C8028b();
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final Runnable f19400m = new C8029c();

    /* renamed from: a */
    private List<TreeWalkerTimeLogger> f19401a = new ArrayList();

    /* renamed from: b */
    private int f19402b;

    /* renamed from: c */
    private boolean f19403c = false;

    /* renamed from: d */
    private final List<C12480a> f19404d = new ArrayList();

    /* renamed from: e */
    private C12461b f19405e = new C12461b();

    /* renamed from: f */
    private C8030a f19406f = new C8030a();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C12471a f19407g = new C12471a(new C12476c());

    /* renamed from: h */
    private long f19408h;

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j);
    }

    /* renamed from: com.iab.omid.library.smaato.walking.TreeWalker$a */
    class C8027a implements Runnable {
        C8027a() {
        }

        public void run() {
            TreeWalker.this.f19407g.mo72492b();
        }
    }

    /* renamed from: com.iab.omid.library.smaato.walking.TreeWalker$b */
    class C8028b implements Runnable {
        C8028b() {
        }

        public void run() {
            TreeWalker.getInstance().m22869l();
        }
    }

    /* renamed from: com.iab.omid.library.smaato.walking.TreeWalker$c */
    class C8029c implements Runnable {
        C8029c() {
        }

        public void run() {
            if (TreeWalker.f19398k != null) {
                TreeWalker.f19398k.post(TreeWalker.f19399l);
                TreeWalker.f19398k.postDelayed(TreeWalker.f19400m, 200);
            }
        }
    }

    TreeWalker() {
    }

    /* renamed from: a */
    private void m22857a(long j) {
        if (this.f19401a.size() > 0) {
            for (TreeWalkerTimeLogger next : this.f19401a) {
                next.onTreeProcessed(this.f19402b, TimeUnit.NANOSECONDS.toMillis(j));
                if (next instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) next).onTreeProcessedNano(this.f19402b, j);
                }
            }
        }
    }

    /* renamed from: a */
    private void m22858a(View view, C12459a aVar, JSONObject jSONObject, C8032b bVar, boolean z) {
        aVar.mo72485a(view, jSONObject, this, bVar == C8032b.PARENT_VIEW, z);
    }

    /* renamed from: a */
    private void m22859a(String str, View view, JSONObject jSONObject) {
        C12459a b = this.f19405e.mo72487b();
        String b2 = this.f19406f.mo55972b(str);
        if (b2 != null) {
            JSONObject a = b.mo72484a(view);
            C12465b.m33290a(a, str);
            C12465b.m33295b(a, b2);
            C12465b.m33292a(jSONObject, a);
        }
    }

    /* renamed from: a */
    private boolean m22860a(View view, JSONObject jSONObject) {
        C8030a.C8031a c = this.f19406f.mo55974c(view);
        if (c == null) {
            return false;
        }
        C12465b.m33288a(jSONObject, c);
        return true;
    }

    /* renamed from: b */
    private boolean m22863b(View view, JSONObject jSONObject) {
        String d = this.f19406f.mo55976d(view);
        if (d == null) {
            return false;
        }
        C12465b.m33290a(jSONObject, d);
        C12465b.m33289a(jSONObject, Boolean.valueOf(this.f19406f.mo55980f(view)));
        this.f19406f.mo55977d();
        return true;
    }

    /* renamed from: d */
    private void m22865d() {
        m22857a(C12468d.m33304a() - this.f19408h);
    }

    /* renamed from: e */
    private void m22866e() {
        this.f19402b = 0;
        this.f19404d.clear();
        this.f19403c = false;
        Iterator<C8021a> it = C0689a.m34c().mo10261a().iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().mo55903e()) {
                    this.f19403c = true;
                    break;
                }
            } else {
                break;
            }
        }
        this.f19408h = C12468d.m33304a();
    }

    public static TreeWalker getInstance() {
        return f19396i;
    }

    /* renamed from: i */
    private void m22867i() {
        if (f19398k == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f19398k = handler;
            handler.post(f19399l);
            f19398k.postDelayed(f19400m, 200);
        }
    }

    /* renamed from: k */
    private void m22868k() {
        Handler handler = f19398k;
        if (handler != null) {
            handler.removeCallbacks(f19400m);
            f19398k = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public void m22869l() {
        m22866e();
        mo55960f();
        m22865d();
    }

    /* renamed from: a */
    public void mo55958a(View view, C12459a aVar, JSONObject jSONObject, boolean z) {
        C8032b e;
        if (C12470f.m33321d(view) && (e = this.f19406f.mo55978e(view)) != C8032b.UNDERLYING_VIEW) {
            JSONObject a = aVar.mo72484a(view);
            C12465b.m33292a(jSONObject, a);
            if (!m22863b(view, a)) {
                boolean z2 = z || m22860a(view, a);
                if (this.f19403c && e == C8032b.OBSTRUCTION_VIEW && !z2) {
                    this.f19404d.add(new C12480a(view));
                }
                m22858a(view, aVar, a, e, z2);
            }
            this.f19402b++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (!this.f19401a.contains(treeWalkerTimeLogger)) {
            this.f19401a.add(treeWalkerTimeLogger);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo55960f() {
        this.f19406f.mo55979e();
        long a = C12468d.m33304a();
        C12459a a2 = this.f19405e.mo72486a();
        if (this.f19406f.mo55973b().size() > 0) {
            Iterator<String> it = this.f19406f.mo55973b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a3 = a2.mo72484a((View) null);
                m22859a(next, this.f19406f.mo55970a(next), a3);
                C12465b.m33294b(a3);
                HashSet hashSet = new HashSet();
                hashSet.add(next);
                this.f19407g.mo72491a(a3, hashSet, a);
            }
        }
        if (this.f19406f.mo55975c().size() > 0) {
            JSONObject a4 = a2.mo72484a((View) null);
            m22858a((View) null, a2, a4, C8032b.PARENT_VIEW, false);
            C12465b.m33294b(a4);
            this.f19407g.mo72493b(a4, this.f19406f.mo55975c(), a);
            if (this.f19403c) {
                for (C8021a a5 : C0689a.m34c().mo10261a()) {
                    a5.mo55899a(this.f19404d);
                }
            }
        } else {
            this.f19407g.mo72492b();
        }
        this.f19406f.mo55971a();
    }

    /* renamed from: g */
    public void mo55961g() {
        m22868k();
    }

    /* renamed from: h */
    public void mo55962h() {
        m22867i();
    }

    /* renamed from: j */
    public void mo55963j() {
        mo55961g();
        this.f19401a.clear();
        f19397j.post(new C8027a());
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f19401a.contains(treeWalkerTimeLogger)) {
            this.f19401a.remove(treeWalkerTimeLogger);
        }
    }
}
