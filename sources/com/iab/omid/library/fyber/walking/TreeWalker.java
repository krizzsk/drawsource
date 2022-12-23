package com.iab.omid.library.fyber.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.fyber.adsession.C7774a;
import com.iab.omid.library.fyber.p243b.C7776a;
import com.iab.omid.library.fyber.p244c.C7785a;
import com.iab.omid.library.fyber.p244c.C7787b;
import com.iab.omid.library.fyber.p245d.C7791b;
import com.iab.omid.library.fyber.p245d.C7794d;
import com.iab.omid.library.fyber.p245d.C7796f;
import com.iab.omid.library.fyber.p246e.C7797a;
import com.iab.omid.library.fyber.walking.C7806a;
import com.iab.omid.library.fyber.walking.p247a.C7812c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class TreeWalker implements C7785a.C7786a {

    /* renamed from: a */
    private static TreeWalker f18852a = new TreeWalker();

    /* renamed from: b */
    private static Handler f18853b = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static Handler f18854c = null;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final Runnable f18855l = new Runnable() {
        public void run() {
            TreeWalker.getInstance().m21843h();
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final Runnable f18856m = new Runnable() {
        public void run() {
            if (TreeWalker.f18854c != null) {
                TreeWalker.f18854c.post(TreeWalker.f18855l);
                TreeWalker.f18854c.postDelayed(TreeWalker.f18856m, 200);
            }
        }
    };

    /* renamed from: d */
    private List<TreeWalkerTimeLogger> f18857d = new ArrayList();

    /* renamed from: e */
    private int f18858e;

    /* renamed from: f */
    private boolean f18859f = false;

    /* renamed from: g */
    private final List<C7797a> f18860g = new ArrayList();

    /* renamed from: h */
    private C7787b f18861h = new C7787b();

    /* renamed from: i */
    private C7806a f18862i = new C7806a();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public C7816b f18863j = new C7816b(new C7812c());

    /* renamed from: k */
    private long f18864k;

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j);
    }

    TreeWalker() {
    }

    /* renamed from: a */
    private void m21834a(long j) {
        if (this.f18857d.size() > 0) {
            for (TreeWalkerTimeLogger next : this.f18857d) {
                next.onTreeProcessed(this.f18858e, TimeUnit.NANOSECONDS.toMillis(j));
                if (next instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) next).onTreeProcessedNano(this.f18858e, j);
                }
            }
        }
    }

    /* renamed from: a */
    private void m21835a(View view, C7785a aVar, JSONObject jSONObject, C7817c cVar, boolean z) {
        aVar.mo54994a(view, jSONObject, this, cVar == C7817c.PARENT_VIEW, z);
    }

    /* renamed from: a */
    private void m21836a(String str, View view, JSONObject jSONObject) {
        C7785a b = this.f18861h.mo54997b();
        String a = this.f18862i.mo55037a(str);
        if (a != null) {
            JSONObject a2 = b.mo54993a(view);
            C7791b.m21772a(a2, str);
            C7791b.m21777b(a2, a);
            C7791b.m21774a(jSONObject, a2);
        }
    }

    /* renamed from: a */
    private boolean m21837a(View view, JSONObject jSONObject) {
        String a = this.f18862i.mo55036a(view);
        if (a == null) {
            return false;
        }
        C7791b.m21772a(jSONObject, a);
        C7791b.m21771a(jSONObject, Boolean.valueOf(this.f18862i.mo55045d(view)));
        this.f18862i.mo55046e();
        return true;
    }

    /* renamed from: b */
    private boolean m21839b(View view, JSONObject jSONObject) {
        C7806a.C7807a b = this.f18862i.mo55040b(view);
        if (b == null) {
            return false;
        }
        C7791b.m21770a(jSONObject, b);
        return true;
    }

    public static TreeWalker getInstance() {
        return f18852a;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m21843h() {
        m21844i();
        mo55029d();
        m21845j();
    }

    /* renamed from: i */
    private void m21844i() {
        this.f18858e = 0;
        this.f18860g.clear();
        this.f18859f = false;
        Iterator<C7774a> it = C7776a.m21696a().mo54950c().iterator();
        while (true) {
            if (it.hasNext()) {
                if (it.next().mo54913b()) {
                    this.f18859f = true;
                    break;
                }
            } else {
                break;
            }
        }
        this.f18864k = C7794d.m21786a();
    }

    /* renamed from: j */
    private void m21845j() {
        m21834a(C7794d.m21786a() - this.f18864k);
    }

    /* renamed from: k */
    private void m21846k() {
        if (f18854c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f18854c = handler;
            handler.post(f18855l);
            f18854c.postDelayed(f18856m, 200);
        }
    }

    /* renamed from: l */
    private void m21847l() {
        Handler handler = f18854c;
        if (handler != null) {
            handler.removeCallbacks(f18856m);
            f18854c = null;
        }
    }

    /* renamed from: a */
    public void mo55025a() {
        m21846k();
    }

    /* renamed from: a */
    public void mo54995a(View view, C7785a aVar, JSONObject jSONObject, boolean z) {
        C7817c c;
        if (C7796f.m21803d(view) && (c = this.f18862i.mo55042c(view)) != C7817c.UNDERLYING_VIEW) {
            JSONObject a = aVar.mo54993a(view);
            C7791b.m21774a(jSONObject, a);
            if (!m21837a(view, a)) {
                boolean z2 = z || m21839b(view, a);
                if (this.f18859f && c == C7817c.OBSTRUCTION_VIEW && !z2) {
                    this.f18860g.add(new C7797a(view));
                }
                m21835a(view, aVar, a, c, z2);
            }
            this.f18858e++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (!this.f18857d.contains(treeWalkerTimeLogger)) {
            this.f18857d.add(treeWalkerTimeLogger);
        }
    }

    /* renamed from: b */
    public void mo55027b() {
        mo55028c();
        this.f18857d.clear();
        f18853b.post(new Runnable() {
            public void run() {
                TreeWalker.this.f18863j.mo55064a();
            }
        });
    }

    /* renamed from: c */
    public void mo55028c() {
        m21847l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo55029d() {
        this.f18862i.mo55043c();
        long a = C7794d.m21786a();
        C7785a a2 = this.f18861h.mo54996a();
        if (this.f18862i.mo55041b().size() > 0) {
            Iterator<String> it = this.f18862i.mo55041b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a3 = a2.mo54993a((View) null);
                m21836a(next, this.f18862i.mo55039b(next), a3);
                C7791b.m21769a(a3);
                HashSet hashSet = new HashSet();
                hashSet.add(next);
                this.f18863j.mo55066b(a3, hashSet, a);
            }
        }
        if (this.f18862i.mo55038a().size() > 0) {
            JSONObject a4 = a2.mo54993a((View) null);
            m21835a((View) null, a2, a4, C7817c.PARENT_VIEW, false);
            C7791b.m21769a(a4);
            this.f18863j.mo55065a(a4, this.f18862i.mo55038a(), a);
            if (this.f18859f) {
                for (C7774a a5 : C7776a.m21696a().mo54950c()) {
                    a5.mo54911a(this.f18860g);
                }
            }
        } else {
            this.f18863j.mo55064a();
        }
        this.f18862i.mo55044d();
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f18857d.contains(treeWalkerTimeLogger)) {
            this.f18857d.remove(treeWalkerTimeLogger);
        }
    }
}
