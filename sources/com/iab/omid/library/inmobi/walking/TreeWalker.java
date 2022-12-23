package com.iab.omid.library.inmobi.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.inmobi.p250c.C7836a;
import com.iab.omid.library.inmobi.p250c.C7838b;
import com.iab.omid.library.inmobi.p251d.C7842b;
import com.iab.omid.library.inmobi.p251d.C7845d;
import com.iab.omid.library.inmobi.p251d.C7847f;
import com.iab.omid.library.inmobi.walking.C7857a;
import com.iab.omid.library.inmobi.walking.p253a.C7863c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class TreeWalker implements C7836a.C7837a {

    /* renamed from: a */
    private static TreeWalker f18968a = new TreeWalker();

    /* renamed from: b */
    private static Handler f18969b = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static Handler f18970c = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final Runnable f18971j = new Runnable() {
        public void run() {
            TreeWalker.getInstance().m22069h();
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final Runnable f18972k = new Runnable() {
        public void run() {
            if (TreeWalker.f18970c != null) {
                TreeWalker.f18970c.post(TreeWalker.f18971j);
                TreeWalker.f18970c.postDelayed(TreeWalker.f18972k, 200);
            }
        }
    };

    /* renamed from: d */
    private List<TreeWalkerTimeLogger> f18973d = new ArrayList();

    /* renamed from: e */
    private int f18974e;

    /* renamed from: f */
    private C7838b f18975f = new C7838b();

    /* renamed from: g */
    private C7857a f18976g = new C7857a();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C7867b f18977h = new C7867b(new C7863c());

    /* renamed from: i */
    private long f18978i;

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j);
    }

    TreeWalker() {
    }

    /* renamed from: a */
    private void m22060a(long j) {
        if (this.f18973d.size() > 0) {
            for (TreeWalkerTimeLogger next : this.f18973d) {
                next.onTreeProcessed(this.f18974e, TimeUnit.NANOSECONDS.toMillis(j));
                if (next instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) next).onTreeProcessedNano(this.f18974e, j);
                }
            }
        }
    }

    /* renamed from: a */
    private void m22061a(View view, C7836a aVar, JSONObject jSONObject, C7868c cVar) {
        aVar.mo55189a(view, jSONObject, this, cVar == C7868c.PARENT_VIEW);
    }

    /* renamed from: a */
    private void m22062a(String str, View view, JSONObject jSONObject) {
        C7836a b = this.f18975f.mo55192b();
        String a = this.f18976g.mo55232a(str);
        if (a != null) {
            JSONObject a2 = b.mo55188a(view);
            C7842b.m21999a(a2, str);
            C7842b.m22004b(a2, a);
            C7842b.m22001a(jSONObject, a2);
        }
    }

    /* renamed from: a */
    private boolean m22063a(View view, JSONObject jSONObject) {
        String a = this.f18976g.mo55231a(view);
        if (a == null) {
            return false;
        }
        C7842b.m21999a(jSONObject, a);
        this.f18976g.mo55240e();
        return true;
    }

    /* renamed from: b */
    private void m22064b(View view, JSONObject jSONObject) {
        C7857a.C7858a b = this.f18976g.mo55235b(view);
        if (b != null) {
            C7842b.m21998a(jSONObject, b);
        }
    }

    public static TreeWalker getInstance() {
        return f18968a;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m22069h() {
        m22070i();
        mo55224d();
        m22071j();
    }

    /* renamed from: i */
    private void m22070i() {
        this.f18974e = 0;
        this.f18978i = C7845d.m22012a();
    }

    /* renamed from: j */
    private void m22071j() {
        m22060a(C7845d.m22012a() - this.f18978i);
    }

    /* renamed from: k */
    private void m22072k() {
        if (f18970c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f18970c = handler;
            handler.post(f18971j);
            f18970c.postDelayed(f18972k, 200);
        }
    }

    /* renamed from: l */
    private void m22073l() {
        Handler handler = f18970c;
        if (handler != null) {
            handler.removeCallbacks(f18972k);
            f18970c = null;
        }
    }

    /* renamed from: a */
    public void mo55220a() {
        m22072k();
    }

    /* renamed from: a */
    public void mo55190a(View view, C7836a aVar, JSONObject jSONObject) {
        C7868c c;
        if (C7847f.m22029d(view) && (c = this.f18976g.mo55237c(view)) != C7868c.UNDERLYING_VIEW) {
            JSONObject a = aVar.mo55188a(view);
            C7842b.m22001a(jSONObject, a);
            if (!m22063a(view, a)) {
                m22064b(view, a);
                m22061a(view, aVar, a, c);
            }
            this.f18974e++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (!this.f18973d.contains(treeWalkerTimeLogger)) {
            this.f18973d.add(treeWalkerTimeLogger);
        }
    }

    /* renamed from: b */
    public void mo55222b() {
        mo55223c();
        this.f18973d.clear();
        f18969b.post(new Runnable() {
            public void run() {
                TreeWalker.this.f18977h.mo55258a();
            }
        });
    }

    /* renamed from: c */
    public void mo55223c() {
        m22073l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo55224d() {
        this.f18976g.mo55238c();
        long a = C7845d.m22012a();
        C7836a a2 = this.f18975f.mo55191a();
        if (this.f18976g.mo55236b().size() > 0) {
            Iterator<String> it = this.f18976g.mo55236b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a3 = a2.mo55188a((View) null);
                m22062a(next, this.f18976g.mo55234b(next), a3);
                C7842b.m21997a(a3);
                HashSet hashSet = new HashSet();
                hashSet.add(next);
                this.f18977h.mo55260b(a3, hashSet, a);
            }
        }
        if (this.f18976g.mo55233a().size() > 0) {
            JSONObject a4 = a2.mo55188a((View) null);
            m22061a((View) null, a2, a4, C7868c.PARENT_VIEW);
            C7842b.m21997a(a4);
            this.f18977h.mo55259a(a4, this.f18976g.mo55233a(), a);
        } else {
            this.f18977h.mo55258a();
        }
        this.f18976g.mo55239d();
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f18973d.contains(treeWalkerTimeLogger)) {
            this.f18973d.remove(treeWalkerTimeLogger);
        }
    }
}
