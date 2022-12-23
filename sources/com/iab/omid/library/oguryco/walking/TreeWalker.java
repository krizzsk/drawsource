package com.iab.omid.library.oguryco.walking;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.iab.omid.library.oguryco.p268c.C7987a;
import com.iab.omid.library.oguryco.p268c.C7989b;
import com.iab.omid.library.oguryco.p269d.C7993b;
import com.iab.omid.library.oguryco.p269d.C7996d;
import com.iab.omid.library.oguryco.p269d.C7998f;
import com.iab.omid.library.oguryco.walking.C8008a;
import com.iab.omid.library.oguryco.walking.p271a.C8014c;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class TreeWalker implements C7987a.C7988a {

    /* renamed from: a */
    private static TreeWalker f19320a = new TreeWalker();

    /* renamed from: b */
    private static Handler f19321b = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static Handler f19322c = null;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final Runnable f19323j = new Runnable() {
        public final void run() {
            TreeWalker.getInstance().m22749h();
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: k */
    public static final Runnable f19324k = new Runnable() {
        public final void run() {
            if (TreeWalker.f19322c != null) {
                TreeWalker.f19322c.post(TreeWalker.f19323j);
                TreeWalker.f19322c.postDelayed(TreeWalker.f19324k, 200);
            }
        }
    };

    /* renamed from: d */
    private List<TreeWalkerTimeLogger> f19325d = new ArrayList();

    /* renamed from: e */
    private int f19326e;

    /* renamed from: f */
    private C7989b f19327f = new C7989b();

    /* renamed from: g */
    private C8008a f19328g = new C8008a();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public C8018b f19329h = new C8018b(new C8014c());

    /* renamed from: i */
    private long f19330i;

    public interface TreeWalkerNanoTimeLogger extends TreeWalkerTimeLogger {
        void onTreeProcessedNano(int i, long j);
    }

    public interface TreeWalkerTimeLogger {
        void onTreeProcessed(int i, long j);
    }

    TreeWalker() {
    }

    /* renamed from: a */
    private void m22740a(long j) {
        if (this.f19325d.size() > 0) {
            for (TreeWalkerTimeLogger next : this.f19325d) {
                next.onTreeProcessed(this.f19326e, TimeUnit.NANOSECONDS.toMillis(j));
                if (next instanceof TreeWalkerNanoTimeLogger) {
                    ((TreeWalkerNanoTimeLogger) next).onTreeProcessedNano(this.f19326e, j);
                }
            }
        }
    }

    /* renamed from: a */
    private void m22741a(View view, C7987a aVar, JSONObject jSONObject, C8019c cVar) {
        aVar.mo55788a(view, jSONObject, this, cVar == C8019c.PARENT_VIEW);
    }

    /* renamed from: a */
    private void m22742a(String str, View view, JSONObject jSONObject) {
        C7987a b = this.f19327f.mo55791b();
        String a = this.f19328g.mo55831a(str);
        if (a != null) {
            JSONObject a2 = b.mo55787a(view);
            C7993b.m22679a(a2, str);
            C7993b.m22684b(a2, a);
            C7993b.m22681a(jSONObject, a2);
        }
    }

    /* renamed from: a */
    private boolean m22743a(View view, JSONObject jSONObject) {
        String a = this.f19328g.mo55830a(view);
        if (a == null) {
            return false;
        }
        C7993b.m22679a(jSONObject, a);
        this.f19328g.mo55839e();
        return true;
    }

    /* renamed from: b */
    private void m22744b(View view, JSONObject jSONObject) {
        C8008a.C8009a b = this.f19328g.mo55834b(view);
        if (b != null) {
            C7993b.m22678a(jSONObject, b);
        }
    }

    public static TreeWalker getInstance() {
        return f19320a;
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m22749h() {
        m22750i();
        mo55823d();
        m22751j();
    }

    /* renamed from: i */
    private void m22750i() {
        this.f19326e = 0;
        this.f19330i = C7996d.m22692a();
    }

    /* renamed from: j */
    private void m22751j() {
        m22740a(C7996d.m22692a() - this.f19330i);
    }

    /* renamed from: k */
    private void m22752k() {
        if (f19322c == null) {
            Handler handler = new Handler(Looper.getMainLooper());
            f19322c = handler;
            handler.post(f19323j);
            f19322c.postDelayed(f19324k, 200);
        }
    }

    /* renamed from: l */
    private void m22753l() {
        Handler handler = f19322c;
        if (handler != null) {
            handler.removeCallbacks(f19324k);
            f19322c = null;
        }
    }

    /* renamed from: a */
    public void mo55819a() {
        m22752k();
    }

    /* renamed from: a */
    public void mo55789a(View view, C7987a aVar, JSONObject jSONObject) {
        C8019c c;
        if (C7998f.m22709d(view) && (c = this.f19328g.mo55836c(view)) != C8019c.UNDERLYING_VIEW) {
            JSONObject a = aVar.mo55787a(view);
            C7993b.m22681a(jSONObject, a);
            if (!m22743a(view, a)) {
                m22744b(view, a);
                m22741a(view, aVar, a, c);
            }
            this.f19326e++;
        }
    }

    public void addTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (!this.f19325d.contains(treeWalkerTimeLogger)) {
            this.f19325d.add(treeWalkerTimeLogger);
        }
    }

    /* renamed from: b */
    public void mo55821b() {
        mo55822c();
        this.f19325d.clear();
        f19321b.post(new Runnable() {
            public void run() {
                TreeWalker.this.f19329h.mo55857a();
            }
        });
    }

    /* renamed from: c */
    public void mo55822c() {
        m22753l();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo55823d() {
        this.f19328g.mo55837c();
        long a = C7996d.m22692a();
        C7987a a2 = this.f19327f.mo55790a();
        if (this.f19328g.mo55835b().size() > 0) {
            Iterator<String> it = this.f19328g.mo55835b().iterator();
            while (it.hasNext()) {
                String next = it.next();
                JSONObject a3 = a2.mo55787a((View) null);
                m22742a(next, this.f19328g.mo55833b(next), a3);
                C7993b.m22677a(a3);
                HashSet hashSet = new HashSet();
                hashSet.add(next);
                this.f19329h.mo55859b(a3, hashSet, a);
            }
        }
        if (this.f19328g.mo55832a().size() > 0) {
            JSONObject a4 = a2.mo55787a((View) null);
            m22741a((View) null, a2, a4, C8019c.PARENT_VIEW);
            C7993b.m22677a(a4);
            this.f19329h.mo55858a(a4, this.f19328g.mo55832a(), a);
        } else {
            this.f19329h.mo55857a();
        }
        this.f19328g.mo55838d();
    }

    public void removeTimeLogger(TreeWalkerTimeLogger treeWalkerTimeLogger) {
        if (this.f19325d.contains(treeWalkerTimeLogger)) {
            this.f19325d.remove(treeWalkerTimeLogger);
        }
    }
}
