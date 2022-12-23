package com.iab.omid.library.vungle.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.vungle.p274c.C8050a;
import com.iab.omid.library.vungle.p274c.C8052b;
import com.iab.omid.library.vungle.p275d.C8056b;
import com.iab.omid.library.vungle.p275d.C8059d;
import com.iab.omid.library.vungle.p275d.C8061f;
import com.iab.omid.library.vungle.walking.C8071a;
import com.iab.omid.library.vungle.walking.p277a.C8077c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class TreeWalker implements C8050a.C8051a {

    /* renamed from: a */
    private static TreeWalker f19501a = new TreeWalker();

    /* renamed from: b */
    private static Handler f19502b = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static Handler f19503c = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final Runnable f19504j = new Runnable() {
        public void run() {
            TreeWalker.getInstance().m23070h();
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final Runnable f19505k = new Runnable() {
        public void run() {
            if (TreeWalker.f19503c != null) {
                TreeWalker.f19503c.post(TreeWalker.f19504j);
                TreeWalker.f19503c.postDelayed(TreeWalker.f19505k, 200);
            }
        }
    };

    /* renamed from: d */
    private List<TreeWalkerTimeLogger> f19506d = new ArrayList();

    /* renamed from: e */
    private int f19507e;

    /* renamed from: f */
    private C8052b f19508f = new C8052b();

    /* renamed from: g */
    private C8071a f19509g = new C8071a();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C8081b f19510h = new C8081b(new C8077c());

    /* renamed from: i */
    private long f19511i;

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j);
    }

    TreeWalker() {
    }

    /* renamed from: a */
    private void m23061a(long j) {
        if (this.f19506d.size() > 0) {
            for (TreeWalkerTimeLogger next : this.f19506d) {
                next.onTreeProcessed(this.f19507e, TimeUnit.NANOSECONDS.toMillis(j));
                if (next instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) next).onTreeProcessedNano(this.f19507e, j);
                }
            }
        }
    }

    /* renamed from: a */
    private void m23062a(View view, C8050a aVar, JSONObject jSONObject, C8082c cVar) {
        aVar.mo56106a(view, jSONObject, this, cVar == C8082c.PARENT_VIEW);
    }

    /* renamed from: a */
    private void m23063a(String str, View view, JSONObject jSONObject) {
        C8050a b = this.f19508f.mo56109b();
        String a = this.f19509g.mo56149a(str);
        if (a != null) {
            JSONObject a2 = b.mo56105a(view);
            C8056b.m23000a(a2, str);
            C8056b.m23005b(a2, a);
            C8056b.m23002a(jSONObject, a2);
        }
    }

    /* renamed from: a */
    private boolean m23064a(View view, JSONObject jSONObject) {
        String a = this.f19509g.mo56148a(view);
        if (a == null) {
            return false;
        }
        C8056b.m23000a(jSONObject, a);
        this.f19509g.mo56157e();
        return true;
    }

    /* renamed from: b */
    private void m23065b(View view, JSONObject jSONObject) {
        C8071a.C8072a b = this.f19509g.mo56152b(view);
        if (b != null) {
            C8056b.m22999a(jSONObject, b);
        }
    }

    public static TreeWalker getInstance() {
        return f19501a;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m23070h() {
        m23071i();
        mo56141d();
        m23072j();
    }

    /* renamed from: i */
    private void m23071i() {
        this.f19507e = 0;
        this.f19511i = C8059d.m23013a();
    }

    /* renamed from: j */
    private void m23072j() {
        m23061a(C8059d.m23013a() - this.f19511i);
    }

    /* renamed from: k */
    private void m23073k() {
        if (f19503c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f19503c = handler;
            handler.post(f19504j);
            f19503c.postDelayed(f19505k, 200);
        }
    }

    /* renamed from: l */
    private void m23074l() {
        Handler handler = f19503c;
        if (handler != null) {
            handler.removeCallbacks(f19505k);
            f19503c = null;
        }
    }

    /* renamed from: a */
    public void mo56137a() {
        m23073k();
    }

    /* renamed from: a */
    public void mo56107a(View view, C8050a aVar, JSONObject jSONObject) {
        C8082c c;
        if (C8061f.m23030d(view) && (c = this.f19509g.mo56154c(view)) != C8082c.UNDERLYING_VIEW) {
            JSONObject a = aVar.mo56105a(view);
            C8056b.m23002a(jSONObject, a);
            if (!m23064a(view, a)) {
                m23065b(view, a);
                m23062a(view, aVar, a, c);
            }
            this.f19507e++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (!this.f19506d.contains(treeWalkerTimeLogger)) {
            this.f19506d.add(treeWalkerTimeLogger);
        }
    }

    /* renamed from: b */
    public void mo56139b() {
        mo56140c();
        this.f19506d.clear();
        f19502b.post(new Runnable() {
            public void run() {
                TreeWalker.this.f19510h.mo56175a();
            }
        });
    }

    /* renamed from: c */
    public void mo56140c() {
        m23074l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo56141d() {
        this.f19509g.mo56155c();
        long a = C8059d.m23013a();
        C8050a a2 = this.f19508f.mo56108a();
        if (this.f19509g.mo56153b().size() > 0) {
            Iterator<String> it = this.f19509g.mo56153b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a3 = a2.mo56105a((View) null);
                m23063a(next, this.f19509g.mo56151b(next), a3);
                C8056b.m22998a(a3);
                HashSet hashSet = new HashSet();
                hashSet.add(next);
                this.f19510h.mo56177b(a3, hashSet, a);
            }
        }
        if (this.f19509g.mo56150a().size() > 0) {
            JSONObject a4 = a2.mo56105a((View) null);
            m23062a((View) null, a2, a4, C8082c.PARENT_VIEW);
            C8056b.m22998a(a4);
            this.f19510h.mo56176a(a4, this.f19509g.mo56150a(), a);
        } else {
            this.f19510h.mo56175a();
        }
        this.f19509g.mo56156d();
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f19506d.contains(treeWalkerTimeLogger)) {
            this.f19506d.remove(treeWalkerTimeLogger);
        }
    }
}
