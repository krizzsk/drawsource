package com.iab.omid.library.adcolony.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.adcolony.adsession.C7623a;
import com.iab.omid.library.adcolony.p225b.C7625a;
import com.iab.omid.library.adcolony.p226c.C7634a;
import com.iab.omid.library.adcolony.p226c.C7636b;
import com.iab.omid.library.adcolony.p227d.C7640b;
import com.iab.omid.library.adcolony.p227d.C7643d;
import com.iab.omid.library.adcolony.p227d.C7645f;
import com.iab.omid.library.adcolony.p228e.C7646a;
import com.iab.omid.library.adcolony.walking.C7655a;
import com.iab.omid.library.adcolony.walking.p229a.C7661c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class TreeWalker implements C7634a.C7635a {

    /* renamed from: a */
    private static TreeWalker f18501a = new TreeWalker();

    /* renamed from: b */
    private static Handler f18502b = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static Handler f18503c = null;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final Runnable f18504l = new Runnable() {
        public void run() {
            TreeWalker.getInstance().m21153h();
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final Runnable f18505m = new Runnable() {
        public void run() {
            if (TreeWalker.f18503c != null) {
                TreeWalker.f18503c.post(TreeWalker.f18504l);
                TreeWalker.f18503c.postDelayed(TreeWalker.f18505m, 200);
            }
        }
    };

    /* renamed from: d */
    private List<TreeWalkerTimeLogger> f18506d = new ArrayList();

    /* renamed from: e */
    private int f18507e;

    /* renamed from: f */
    private boolean f18508f = false;

    /* renamed from: g */
    private final List<C7646a> f18509g = new ArrayList();

    /* renamed from: h */
    private C7636b f18510h = new C7636b();

    /* renamed from: i */
    private C7655a f18511i = new C7655a();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C7665b f18512j = new C7665b(new C7661c());

    /* renamed from: k */
    private long f18513k;

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j);
    }

    TreeWalker() {
    }

    /* renamed from: a */
    private void m21144a(long j) {
        if (this.f18506d.size() > 0) {
            for (TreeWalkerTimeLogger next : this.f18506d) {
                next.onTreeProcessed(this.f18507e, TimeUnit.NANOSECONDS.toMillis(j));
                if (next instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) next).onTreeProcessedNano(this.f18507e, j);
                }
            }
        }
    }

    /* renamed from: a */
    private void m21145a(View view, C7634a aVar, JSONObject jSONObject, C7666c cVar, boolean z) {
        aVar.mo54397a(view, jSONObject, this, cVar == C7666c.PARENT_VIEW, z);
    }

    /* renamed from: a */
    private void m21146a(String str, View view, JSONObject jSONObject) {
        C7634a b = this.f18510h.mo54400b();
        String a = this.f18511i.mo54440a(str);
        if (a != null) {
            JSONObject a2 = b.mo54396a(view);
            C7640b.m21082a(a2, str);
            C7640b.m21087b(a2, a);
            C7640b.m21084a(jSONObject, a2);
        }
    }

    /* renamed from: a */
    private boolean m21147a(View view, JSONObject jSONObject) {
        String a = this.f18511i.mo54439a(view);
        if (a == null) {
            return false;
        }
        C7640b.m21082a(jSONObject, a);
        C7640b.m21081a(jSONObject, Boolean.valueOf(this.f18511i.mo54448d(view)));
        this.f18511i.mo54449e();
        return true;
    }

    /* renamed from: b */
    private boolean m21149b(View view, JSONObject jSONObject) {
        C7655a.C7656a b = this.f18511i.mo54443b(view);
        if (b == null) {
            return false;
        }
        C7640b.m21080a(jSONObject, b);
        return true;
    }

    public static TreeWalker getInstance() {
        return f18501a;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m21153h() {
        m21154i();
        mo54432d();
        m21155j();
    }

    /* renamed from: i */
    private void m21154i() {
        this.f18507e = 0;
        this.f18509g.clear();
        this.f18508f = false;
        Iterator<C7623a> it = C7625a.m21006a().mo54353c().iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().mo54316b()) {
                    this.f18508f = true;
                    break;
                }
            } else {
                break;
            }
        }
        this.f18513k = C7643d.m21096a();
    }

    /* renamed from: j */
    private void m21155j() {
        m21144a(C7643d.m21096a() - this.f18513k);
    }

    /* renamed from: k */
    private void m21156k() {
        if (f18503c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f18503c = handler;
            handler.post(f18504l);
            f18503c.postDelayed(f18505m, 200);
        }
    }

    /* renamed from: l */
    private void m21157l() {
        Handler handler = f18503c;
        if (handler != null) {
            handler.removeCallbacks(f18505m);
            f18503c = null;
        }
    }

    /* renamed from: a */
    public void mo54428a() {
        m21156k();
    }

    /* renamed from: a */
    public void mo54398a(View view, C7634a aVar, JSONObject jSONObject, boolean z) {
        C7666c c;
        if (C7645f.m21113d(view) && (c = this.f18511i.mo54445c(view)) != C7666c.UNDERLYING_VIEW) {
            JSONObject a = aVar.mo54396a(view);
            C7640b.m21084a(jSONObject, a);
            if (!m21147a(view, a)) {
                boolean z2 = z || m21149b(view, a);
                if (this.f18508f && c == C7666c.OBSTRUCTION_VIEW && !z2) {
                    this.f18509g.add(new C7646a(view));
                }
                m21145a(view, aVar, a, c, z2);
            }
            this.f18507e++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (!this.f18506d.contains(treeWalkerTimeLogger)) {
            this.f18506d.add(treeWalkerTimeLogger);
        }
    }

    /* renamed from: b */
    public void mo54430b() {
        mo54431c();
        this.f18506d.clear();
        f18502b.post(new Runnable() {
            public void run() {
                TreeWalker.this.f18512j.mo54467a();
            }
        });
    }

    /* renamed from: c */
    public void mo54431c() {
        m21157l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo54432d() {
        this.f18511i.mo54446c();
        long a = C7643d.m21096a();
        C7634a a2 = this.f18510h.mo54399a();
        if (this.f18511i.mo54444b().size() > 0) {
            Iterator<String> it = this.f18511i.mo54444b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a3 = a2.mo54396a((View) null);
                m21146a(next, this.f18511i.mo54442b(next), a3);
                C7640b.m21079a(a3);
                HashSet hashSet = new HashSet();
                hashSet.add(next);
                this.f18512j.mo54469b(a3, hashSet, a);
            }
        }
        if (this.f18511i.mo54441a().size() > 0) {
            JSONObject a4 = a2.mo54396a((View) null);
            m21145a((View) null, a2, a4, C7666c.PARENT_VIEW, false);
            C7640b.m21079a(a4);
            this.f18512j.mo54468a(a4, this.f18511i.mo54441a(), a);
            if (this.f18508f) {
                for (C7623a a5 : C7625a.m21006a().mo54353c()) {
                    a5.mo54314a(this.f18509g);
                }
            }
        } else {
            this.f18512j.mo54467a();
        }
        this.f18511i.mo54447d();
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f18506d.contains(treeWalkerTimeLogger)) {
            this.f18506d.remove(treeWalkerTimeLogger);
        }
    }
}
