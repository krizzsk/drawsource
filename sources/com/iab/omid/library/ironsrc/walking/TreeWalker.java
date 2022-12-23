package com.iab.omid.library.ironsrc.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.ironsrc.p256c.C7886a;
import com.iab.omid.library.ironsrc.p256c.C7888b;
import com.iab.omid.library.ironsrc.p257d.C7892b;
import com.iab.omid.library.ironsrc.p257d.C7895d;
import com.iab.omid.library.ironsrc.p257d.C7897f;
import com.iab.omid.library.ironsrc.walking.C7907a;
import com.iab.omid.library.ironsrc.walking.p259a.C7913c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class TreeWalker implements C7886a.C7887a {

    /* renamed from: a */
    private static TreeWalker f19082a = new TreeWalker();

    /* renamed from: b */
    private static Handler f19083b = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static Handler f19084c = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final Runnable f19085j = new Runnable() {
        public final void run() {
            TreeWalker.getInstance().m22290h();
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final Runnable f19086k = new Runnable() {
        public final void run() {
            if (TreeWalker.f19084c != null) {
                TreeWalker.f19084c.post(TreeWalker.f19085j);
                TreeWalker.f19084c.postDelayed(TreeWalker.f19086k, 200);
            }
        }
    };

    /* renamed from: d */
    private List<TreeWalkerTimeLogger> f19087d = new ArrayList();

    /* renamed from: e */
    private int f19088e;

    /* renamed from: f */
    private C7888b f19089f = new C7888b();

    /* renamed from: g */
    private C7907a f19090g = new C7907a();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C7917b f19091h = new C7917b(new C7913c());

    /* renamed from: i */
    private long f19092i;

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j);
    }

    TreeWalker() {
    }

    /* renamed from: a */
    private void m22281a(long j) {
        if (this.f19087d.size() > 0) {
            for (TreeWalkerTimeLogger next : this.f19087d) {
                next.onTreeProcessed(this.f19088e, TimeUnit.NANOSECONDS.toMillis(j));
                if (next instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) next).onTreeProcessedNano(this.f19088e, j);
                }
            }
        }
    }

    /* renamed from: a */
    private void m22282a(View view, C7886a aVar, JSONObject jSONObject, C7918c cVar) {
        aVar.mo55375a(view, jSONObject, this, cVar == C7918c.PARENT_VIEW);
    }

    /* renamed from: a */
    private void m22283a(String str, View view, JSONObject jSONObject) {
        C7886a b = this.f19089f.mo55378b();
        String a = this.f19090g.mo55418a(str);
        if (a != null) {
            JSONObject a2 = b.mo55374a(view);
            C7892b.m22220a(a2, str);
            C7892b.m22225b(a2, a);
            C7892b.m22222a(jSONObject, a2);
        }
    }

    /* renamed from: a */
    private boolean m22284a(View view, JSONObject jSONObject) {
        String a = this.f19090g.mo55417a(view);
        if (a == null) {
            return false;
        }
        C7892b.m22220a(jSONObject, a);
        this.f19090g.mo55426e();
        return true;
    }

    /* renamed from: b */
    private void m22285b(View view, JSONObject jSONObject) {
        C7907a.C7908a b = this.f19090g.mo55421b(view);
        if (b != null) {
            C7892b.m22219a(jSONObject, b);
        }
    }

    public static TreeWalker getInstance() {
        return f19082a;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m22290h() {
        m22291i();
        mo55410d();
        m22292j();
    }

    /* renamed from: i */
    private void m22291i() {
        this.f19088e = 0;
        this.f19092i = C7895d.m22233a();
    }

    /* renamed from: j */
    private void m22292j() {
        m22281a(C7895d.m22233a() - this.f19092i);
    }

    /* renamed from: k */
    private void m22293k() {
        if (f19084c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f19084c = handler;
            handler.post(f19085j);
            f19084c.postDelayed(f19086k, 200);
        }
    }

    /* renamed from: l */
    private void m22294l() {
        Handler handler = f19084c;
        if (handler != null) {
            handler.removeCallbacks(f19086k);
            f19084c = null;
        }
    }

    /* renamed from: a */
    public void mo55406a() {
        m22293k();
    }

    /* renamed from: a */
    public void mo55376a(View view, C7886a aVar, JSONObject jSONObject) {
        C7918c c;
        if (C7897f.m22250d(view) && (c = this.f19090g.mo55423c(view)) != C7918c.UNDERLYING_VIEW) {
            JSONObject a = aVar.mo55374a(view);
            C7892b.m22222a(jSONObject, a);
            if (!m22284a(view, a)) {
                m22285b(view, a);
                m22282a(view, aVar, a, c);
            }
            this.f19088e++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (!this.f19087d.contains(treeWalkerTimeLogger)) {
            this.f19087d.add(treeWalkerTimeLogger);
        }
    }

    /* renamed from: b */
    public void mo55408b() {
        mo55409c();
        this.f19087d.clear();
        f19083b.post(new Runnable() {
            public void run() {
                TreeWalker.this.f19091h.mo55444a();
            }
        });
    }

    /* renamed from: c */
    public void mo55409c() {
        m22294l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo55410d() {
        this.f19090g.mo55424c();
        long a = C7895d.m22233a();
        C7886a a2 = this.f19089f.mo55377a();
        if (this.f19090g.mo55422b().size() > 0) {
            Iterator<String> it = this.f19090g.mo55422b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a3 = a2.mo55374a((View) null);
                m22283a(next, this.f19090g.mo55420b(next), a3);
                C7892b.m22218a(a3);
                HashSet hashSet = new HashSet();
                hashSet.add(next);
                this.f19091h.mo55446b(a3, hashSet, a);
            }
        }
        if (this.f19090g.mo55419a().size() > 0) {
            JSONObject a4 = a2.mo55374a((View) null);
            m22282a((View) null, a2, a4, C7918c.PARENT_VIEW);
            C7892b.m22218a(a4);
            this.f19091h.mo55445a(a4, this.f19090g.mo55419a(), a);
        } else {
            this.f19091h.mo55444a();
        }
        this.f19090g.mo55425d();
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f19087d.contains(treeWalkerTimeLogger)) {
            this.f19087d.remove(treeWalkerTimeLogger);
        }
    }
}
