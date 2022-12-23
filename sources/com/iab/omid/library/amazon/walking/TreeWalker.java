package com.iab.omid.library.amazon.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.amazon.adsession.C7673a;
import com.iab.omid.library.amazon.p231b.C7675a;
import com.iab.omid.library.amazon.p232c.C7684a;
import com.iab.omid.library.amazon.p232c.C7686b;
import com.iab.omid.library.amazon.p233d.C7690b;
import com.iab.omid.library.amazon.p233d.C7693d;
import com.iab.omid.library.amazon.p233d.C7695f;
import com.iab.omid.library.amazon.p234e.C7696a;
import com.iab.omid.library.amazon.walking.C7705a;
import com.iab.omid.library.amazon.walking.p235a.C7711c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class TreeWalker implements C7684a.C7685a {

    /* renamed from: a */
    private static TreeWalker f18618a = new TreeWalker();

    /* renamed from: b */
    private static Handler f18619b = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static Handler f18620c = null;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final Runnable f18621l = new Runnable() {
        public void run() {
            TreeWalker.getInstance().m21383h();
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final Runnable f18622m = new Runnable() {
        public void run() {
            if (TreeWalker.f18620c != null) {
                TreeWalker.f18620c.post(TreeWalker.f18621l);
                TreeWalker.f18620c.postDelayed(TreeWalker.f18622m, 200);
            }
        }
    };

    /* renamed from: d */
    private List<TreeWalkerTimeLogger> f18623d = new ArrayList();

    /* renamed from: e */
    private int f18624e;

    /* renamed from: f */
    private boolean f18625f = false;

    /* renamed from: g */
    private final List<C7696a> f18626g = new ArrayList();

    /* renamed from: h */
    private C7686b f18627h = new C7686b();

    /* renamed from: i */
    private C7705a f18628i = new C7705a();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C7715b f18629j = new C7715b(new C7711c());

    /* renamed from: k */
    private long f18630k;

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j);
    }

    TreeWalker() {
    }

    /* renamed from: a */
    private void m21374a(long j) {
        if (this.f18623d.size() > 0) {
            for (TreeWalkerTimeLogger next : this.f18623d) {
                next.onTreeProcessed(this.f18624e, TimeUnit.NANOSECONDS.toMillis(j));
                if (next instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) next).onTreeProcessedNano(this.f18624e, j);
                }
            }
        }
    }

    /* renamed from: a */
    private void m21375a(View view, C7684a aVar, JSONObject jSONObject, C7716c cVar, boolean z) {
        aVar.mo54596a(view, jSONObject, this, cVar == C7716c.PARENT_VIEW, z);
    }

    /* renamed from: a */
    private void m21376a(String str, View view, JSONObject jSONObject) {
        C7684a b = this.f18627h.mo54599b();
        String a = this.f18628i.mo54639a(str);
        if (a != null) {
            JSONObject a2 = b.mo54595a(view);
            C7690b.m21312a(a2, str);
            C7690b.m21317b(a2, a);
            C7690b.m21314a(jSONObject, a2);
        }
    }

    /* renamed from: a */
    private boolean m21377a(View view, JSONObject jSONObject) {
        String a = this.f18628i.mo54638a(view);
        if (a == null) {
            return false;
        }
        C7690b.m21312a(jSONObject, a);
        C7690b.m21311a(jSONObject, Boolean.valueOf(this.f18628i.mo54647d(view)));
        this.f18628i.mo54648e();
        return true;
    }

    /* renamed from: b */
    private boolean m21379b(View view, JSONObject jSONObject) {
        C7705a.C7706a b = this.f18628i.mo54642b(view);
        if (b == null) {
            return false;
        }
        C7690b.m21310a(jSONObject, b);
        return true;
    }

    public static TreeWalker getInstance() {
        return f18618a;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m21383h() {
        m21384i();
        mo54631d();
        m21385j();
    }

    /* renamed from: i */
    private void m21384i() {
        this.f18624e = 0;
        this.f18626g.clear();
        this.f18625f = false;
        Iterator<C7673a> it = C7675a.m21236a().mo54552c().iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().mo54515b()) {
                    this.f18625f = true;
                    break;
                }
            } else {
                break;
            }
        }
        this.f18630k = C7693d.m21326a();
    }

    /* renamed from: j */
    private void m21385j() {
        m21374a(C7693d.m21326a() - this.f18630k);
    }

    /* renamed from: k */
    private void m21386k() {
        if (f18620c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f18620c = handler;
            handler.post(f18621l);
            f18620c.postDelayed(f18622m, 200);
        }
    }

    /* renamed from: l */
    private void m21387l() {
        Handler handler = f18620c;
        if (handler != null) {
            handler.removeCallbacks(f18622m);
            f18620c = null;
        }
    }

    /* renamed from: a */
    public void mo54627a() {
        m21386k();
    }

    /* renamed from: a */
    public void mo54597a(View view, C7684a aVar, JSONObject jSONObject, boolean z) {
        C7716c c;
        if (C7695f.m21343d(view) && (c = this.f18628i.mo54644c(view)) != C7716c.UNDERLYING_VIEW) {
            JSONObject a = aVar.mo54595a(view);
            C7690b.m21314a(jSONObject, a);
            if (!m21377a(view, a)) {
                boolean z2 = z || m21379b(view, a);
                if (this.f18625f && c == C7716c.OBSTRUCTION_VIEW && !z2) {
                    this.f18626g.add(new C7696a(view));
                }
                m21375a(view, aVar, a, c, z2);
            }
            this.f18624e++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (!this.f18623d.contains(treeWalkerTimeLogger)) {
            this.f18623d.add(treeWalkerTimeLogger);
        }
    }

    /* renamed from: b */
    public void mo54629b() {
        mo54630c();
        this.f18623d.clear();
        f18619b.post(new Runnable() {
            public void run() {
                TreeWalker.this.f18629j.mo54666a();
            }
        });
    }

    /* renamed from: c */
    public void mo54630c() {
        m21387l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo54631d() {
        this.f18628i.mo54645c();
        long a = C7693d.m21326a();
        C7684a a2 = this.f18627h.mo54598a();
        if (this.f18628i.mo54643b().size() > 0) {
            Iterator<String> it = this.f18628i.mo54643b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a3 = a2.mo54595a((View) null);
                m21376a(next, this.f18628i.mo54641b(next), a3);
                C7690b.m21309a(a3);
                HashSet hashSet = new HashSet();
                hashSet.add(next);
                this.f18629j.mo54668b(a3, hashSet, a);
            }
        }
        if (this.f18628i.mo54640a().size() > 0) {
            JSONObject a4 = a2.mo54595a((View) null);
            m21375a((View) null, a2, a4, C7716c.PARENT_VIEW, false);
            C7690b.m21309a(a4);
            this.f18629j.mo54667a(a4, this.f18628i.mo54640a(), a);
            if (this.f18625f) {
                for (C7673a a5 : C7675a.m21236a().mo54552c()) {
                    a5.mo54513a(this.f18626g);
                }
            }
        } else {
            this.f18629j.mo54666a();
        }
        this.f18628i.mo54646d();
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f18623d.contains(treeWalkerTimeLogger)) {
            this.f18623d.remove(treeWalkerTimeLogger);
        }
    }
}
