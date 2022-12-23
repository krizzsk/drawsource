package com.iab.omid.library.mmadbridge.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.mmadbridge.adsession.C7925a;
import com.iab.omid.library.mmadbridge.p261b.C7927a;
import com.iab.omid.library.mmadbridge.p262c.C7936a;
import com.iab.omid.library.mmadbridge.p262c.C7938b;
import com.iab.omid.library.mmadbridge.p263d.C7942b;
import com.iab.omid.library.mmadbridge.p263d.C7945d;
import com.iab.omid.library.mmadbridge.p263d.C7947f;
import com.iab.omid.library.mmadbridge.p264e.C7948a;
import com.iab.omid.library.mmadbridge.walking.C7957a;
import com.iab.omid.library.mmadbridge.walking.p265a.C7963c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class TreeWalker implements C7936a.C7937a {

    /* renamed from: a */
    private static TreeWalker f19196a = new TreeWalker();

    /* renamed from: b */
    private static Handler f19197b = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static Handler f19198c = null;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final Runnable f19199l = new Runnable() {
        public void run() {
            TreeWalker.getInstance().m22518h();
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final Runnable f19200m = new Runnable() {
        public void run() {
            if (TreeWalker.f19198c != null) {
                TreeWalker.f19198c.post(TreeWalker.f19199l);
                TreeWalker.f19198c.postDelayed(TreeWalker.f19200m, 200);
            }
        }
    };

    /* renamed from: d */
    private List<TreeWalkerTimeLogger> f19201d = new ArrayList();

    /* renamed from: e */
    private int f19202e;

    /* renamed from: f */
    private boolean f19203f = false;

    /* renamed from: g */
    private final List<C7948a> f19204g = new ArrayList();

    /* renamed from: h */
    private C7938b f19205h = new C7938b();

    /* renamed from: i */
    private C7957a f19206i = new C7957a();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C7967b f19207j = new C7967b(new C7963c());

    /* renamed from: k */
    private long f19208k;

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j);
    }

    TreeWalker() {
    }

    /* renamed from: a */
    private void m22509a(long j) {
        if (this.f19201d.size() > 0) {
            for (TreeWalkerTimeLogger next : this.f19201d) {
                next.onTreeProcessed(this.f19202e, TimeUnit.NANOSECONDS.toMillis(j));
                if (next instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) next).onTreeProcessedNano(this.f19202e, j);
                }
            }
        }
    }

    /* renamed from: a */
    private void m22510a(View view, C7936a aVar, JSONObject jSONObject, C7968c cVar, boolean z) {
        aVar.mo55573a(view, jSONObject, this, cVar == C7968c.PARENT_VIEW, z);
    }

    /* renamed from: a */
    private void m22511a(String str, View view, JSONObject jSONObject) {
        C7936a b = this.f19205h.mo55576b();
        String a = this.f19206i.mo55616a(str);
        if (a != null) {
            JSONObject a2 = b.mo55572a(view);
            C7942b.m22447a(a2, str);
            C7942b.m22452b(a2, a);
            C7942b.m22449a(jSONObject, a2);
        }
    }

    /* renamed from: a */
    private boolean m22512a(View view, JSONObject jSONObject) {
        String a = this.f19206i.mo55615a(view);
        if (a == null) {
            return false;
        }
        C7942b.m22447a(jSONObject, a);
        C7942b.m22446a(jSONObject, Boolean.valueOf(this.f19206i.mo55624d(view)));
        this.f19206i.mo55625e();
        return true;
    }

    /* renamed from: b */
    private boolean m22514b(View view, JSONObject jSONObject) {
        C7957a.C7958a b = this.f19206i.mo55619b(view);
        if (b == null) {
            return false;
        }
        C7942b.m22445a(jSONObject, b);
        return true;
    }

    public static TreeWalker getInstance() {
        return f19196a;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m22518h() {
        m22519i();
        mo55608d();
        m22520j();
    }

    /* renamed from: i */
    private void m22519i() {
        this.f19202e = 0;
        this.f19204g.clear();
        this.f19203f = false;
        Iterator<C7925a> it = C7927a.m22371a().mo55529c().iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().mo55492b()) {
                    this.f19203f = true;
                    break;
                }
            } else {
                break;
            }
        }
        this.f19208k = C7945d.m22461a();
    }

    /* renamed from: j */
    private void m22520j() {
        m22509a(C7945d.m22461a() - this.f19208k);
    }

    /* renamed from: k */
    private void m22521k() {
        if (f19198c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f19198c = handler;
            handler.post(f19199l);
            f19198c.postDelayed(f19200m, 200);
        }
    }

    /* renamed from: l */
    private void m22522l() {
        Handler handler = f19198c;
        if (handler != null) {
            handler.removeCallbacks(f19200m);
            f19198c = null;
        }
    }

    /* renamed from: a */
    public void mo55604a() {
        m22521k();
    }

    /* renamed from: a */
    public void mo55574a(View view, C7936a aVar, JSONObject jSONObject, boolean z) {
        C7968c c;
        if (C7947f.m22478d(view) && (c = this.f19206i.mo55621c(view)) != C7968c.UNDERLYING_VIEW) {
            JSONObject a = aVar.mo55572a(view);
            C7942b.m22449a(jSONObject, a);
            if (!m22512a(view, a)) {
                boolean z2 = z || m22514b(view, a);
                if (this.f19203f && c == C7968c.OBSTRUCTION_VIEW && !z2) {
                    this.f19204g.add(new C7948a(view));
                }
                m22510a(view, aVar, a, c, z2);
            }
            this.f19202e++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (!this.f19201d.contains(treeWalkerTimeLogger)) {
            this.f19201d.add(treeWalkerTimeLogger);
        }
    }

    /* renamed from: b */
    public void mo55606b() {
        mo55607c();
        this.f19201d.clear();
        f19197b.post(new Runnable() {
            public void run() {
                TreeWalker.this.f19207j.mo55643a();
            }
        });
    }

    /* renamed from: c */
    public void mo55607c() {
        m22522l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo55608d() {
        this.f19206i.mo55622c();
        long a = C7945d.m22461a();
        C7936a a2 = this.f19205h.mo55575a();
        if (this.f19206i.mo55620b().size() > 0) {
            Iterator<String> it = this.f19206i.mo55620b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a3 = a2.mo55572a((View) null);
                m22511a(next, this.f19206i.mo55618b(next), a3);
                C7942b.m22444a(a3);
                HashSet hashSet = new HashSet();
                hashSet.add(next);
                this.f19207j.mo55645b(a3, hashSet, a);
            }
        }
        if (this.f19206i.mo55617a().size() > 0) {
            JSONObject a4 = a2.mo55572a((View) null);
            m22510a((View) null, a2, a4, C7968c.PARENT_VIEW, false);
            C7942b.m22444a(a4);
            this.f19207j.mo55644a(a4, this.f19206i.mo55617a(), a);
            if (this.f19203f) {
                for (C7925a a5 : C7927a.m22371a().mo55529c()) {
                    a5.mo55490a(this.f19204g);
                }
            }
        } else {
            this.f19207j.mo55643a();
        }
        this.f19206i.mo55623d();
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f19201d.contains(treeWalkerTimeLogger)) {
            this.f19201d.remove(treeWalkerTimeLogger);
        }
    }
}
