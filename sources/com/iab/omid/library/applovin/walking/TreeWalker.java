package com.iab.omid.library.applovin.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.applovin.adsession.C7723a;
import com.iab.omid.library.applovin.p237b.C7725a;
import com.iab.omid.library.applovin.p238c.C7734a;
import com.iab.omid.library.applovin.p238c.C7736b;
import com.iab.omid.library.applovin.p239d.C7740b;
import com.iab.omid.library.applovin.p239d.C7743d;
import com.iab.omid.library.applovin.p239d.C7745f;
import com.iab.omid.library.applovin.p240e.C7746a;
import com.iab.omid.library.applovin.walking.C7755a;
import com.iab.omid.library.applovin.walking.p241a.C7761c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class TreeWalker implements C7734a.C7735a {

    /* renamed from: a */
    private static TreeWalker f18735a = new TreeWalker();

    /* renamed from: b */
    private static Handler f18736b = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static Handler f18737c = null;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final Runnable f18738l = new Runnable() {
        public void run() {
            TreeWalker.getInstance().m21613h();
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final Runnable f18739m = new Runnable() {
        public void run() {
            if (TreeWalker.f18737c != null) {
                TreeWalker.f18737c.post(TreeWalker.f18738l);
                TreeWalker.f18737c.postDelayed(TreeWalker.f18739m, 200);
            }
        }
    };

    /* renamed from: d */
    private List<TreeWalkerTimeLogger> f18740d = new ArrayList();

    /* renamed from: e */
    private int f18741e;

    /* renamed from: f */
    private boolean f18742f = false;

    /* renamed from: g */
    private final List<C7746a> f18743g = new ArrayList();

    /* renamed from: h */
    private C7736b f18744h = new C7736b();

    /* renamed from: i */
    private C7755a f18745i = new C7755a();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C7765b f18746j = new C7765b(new C7761c());

    /* renamed from: k */
    private long f18747k;

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j);
    }

    TreeWalker() {
    }

    /* renamed from: a */
    private void m21604a(long j) {
        if (this.f18740d.size() > 0) {
            for (TreeWalkerTimeLogger next : this.f18740d) {
                next.onTreeProcessed(this.f18741e, TimeUnit.NANOSECONDS.toMillis(j));
                if (next instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) next).onTreeProcessedNano(this.f18741e, j);
                }
            }
        }
    }

    /* renamed from: a */
    private void m21605a(View view, C7734a aVar, JSONObject jSONObject, C7766c cVar, boolean z) {
        aVar.mo54795a(view, jSONObject, this, cVar == C7766c.PARENT_VIEW, z);
    }

    /* renamed from: a */
    private void m21606a(String str, View view, JSONObject jSONObject) {
        C7734a b = this.f18744h.mo54798b();
        String a = this.f18745i.mo54838a(str);
        if (a != null) {
            JSONObject a2 = b.mo54794a(view);
            C7740b.m21542a(a2, str);
            C7740b.m21547b(a2, a);
            C7740b.m21544a(jSONObject, a2);
        }
    }

    /* renamed from: a */
    private boolean m21607a(View view, JSONObject jSONObject) {
        String a = this.f18745i.mo54837a(view);
        if (a == null) {
            return false;
        }
        C7740b.m21542a(jSONObject, a);
        C7740b.m21541a(jSONObject, Boolean.valueOf(this.f18745i.mo54846d(view)));
        this.f18745i.mo54847e();
        return true;
    }

    /* renamed from: b */
    private boolean m21609b(View view, JSONObject jSONObject) {
        C7755a.C7756a b = this.f18745i.mo54841b(view);
        if (b == null) {
            return false;
        }
        C7740b.m21540a(jSONObject, b);
        return true;
    }

    public static TreeWalker getInstance() {
        return f18735a;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m21613h() {
        m21614i();
        mo54830d();
        m21615j();
    }

    /* renamed from: i */
    private void m21614i() {
        this.f18741e = 0;
        this.f18743g.clear();
        this.f18742f = false;
        Iterator<C7723a> it = C7725a.m21466a().mo54751c().iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().mo54714b()) {
                    this.f18742f = true;
                    break;
                }
            } else {
                break;
            }
        }
        this.f18747k = C7743d.m21556a();
    }

    /* renamed from: j */
    private void m21615j() {
        m21604a(C7743d.m21556a() - this.f18747k);
    }

    /* renamed from: k */
    private void m21616k() {
        if (f18737c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f18737c = handler;
            handler.post(f18738l);
            f18737c.postDelayed(f18739m, 200);
        }
    }

    /* renamed from: l */
    private void m21617l() {
        Handler handler = f18737c;
        if (handler != null) {
            handler.removeCallbacks(f18739m);
            f18737c = null;
        }
    }

    /* renamed from: a */
    public void mo54826a() {
        m21616k();
    }

    /* renamed from: a */
    public void mo54796a(View view, C7734a aVar, JSONObject jSONObject, boolean z) {
        C7766c c;
        if (C7745f.m21573d(view) && (c = this.f18745i.mo54843c(view)) != C7766c.UNDERLYING_VIEW) {
            JSONObject a = aVar.mo54794a(view);
            C7740b.m21544a(jSONObject, a);
            if (!m21607a(view, a)) {
                boolean z2 = z || m21609b(view, a);
                if (this.f18742f && c == C7766c.OBSTRUCTION_VIEW && !z2) {
                    this.f18743g.add(new C7746a(view));
                }
                m21605a(view, aVar, a, c, z2);
            }
            this.f18741e++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (!this.f18740d.contains(treeWalkerTimeLogger)) {
            this.f18740d.add(treeWalkerTimeLogger);
        }
    }

    /* renamed from: b */
    public void mo54828b() {
        mo54829c();
        this.f18740d.clear();
        f18736b.post(new Runnable() {
            public void run() {
                TreeWalker.this.f18746j.mo54865a();
            }
        });
    }

    /* renamed from: c */
    public void mo54829c() {
        m21617l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo54830d() {
        this.f18745i.mo54844c();
        long a = C7743d.m21556a();
        C7734a a2 = this.f18744h.mo54797a();
        if (this.f18745i.mo54842b().size() > 0) {
            Iterator<String> it = this.f18745i.mo54842b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a3 = a2.mo54794a((View) null);
                m21606a(next, this.f18745i.mo54840b(next), a3);
                C7740b.m21539a(a3);
                HashSet hashSet = new HashSet();
                hashSet.add(next);
                this.f18746j.mo54867b(a3, hashSet, a);
            }
        }
        if (this.f18745i.mo54839a().size() > 0) {
            JSONObject a4 = a2.mo54794a((View) null);
            m21605a((View) null, a2, a4, C7766c.PARENT_VIEW, false);
            C7740b.m21539a(a4);
            this.f18746j.mo54866a(a4, this.f18745i.mo54839a(), a);
            if (this.f18742f) {
                for (C7723a a5 : C7725a.m21466a().mo54751c()) {
                    a5.mo54712a(this.f18743g);
                }
            }
        } else {
            this.f18746j.mo54865a();
        }
        this.f18745i.mo54845d();
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f18740d.contains(treeWalkerTimeLogger)) {
            this.f18740d.remove(treeWalkerTimeLogger);
        }
    }
}
