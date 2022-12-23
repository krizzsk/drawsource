package com.adcolony.sdk;

import android.util.Log;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: com.adcolony.sdk.g0 */
class C0835g0 {

    /* renamed from: f */
    static boolean f481f = false;

    /* renamed from: g */
    static int f482g = 3;

    /* renamed from: h */
    static int f483h = 1;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C0832f1 f484a = C0773c0.m379b();

    /* renamed from: b */
    private C0828e1 f485b = null;

    /* renamed from: c */
    private ExecutorService f486c = null;

    /* renamed from: d */
    private final Queue<Runnable> f487d = new ConcurrentLinkedQueue();

    /* renamed from: e */
    C0962s0 f488e;

    /* renamed from: com.adcolony.sdk.g0$a */
    class C0836a implements C0865j0 {
        C0836a() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C0835g0.this.mo10828b(C0773c0.m389d(h0Var.mo10834a(), "module"), 0, C0773c0.m393h(h0Var.mo10834a(), "message"), true);
        }
    }

    /* renamed from: com.adcolony.sdk.g0$b */
    class C0837b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ int f490a;

        /* renamed from: b */
        final /* synthetic */ String f491b;

        /* renamed from: c */
        final /* synthetic */ int f492c;

        /* renamed from: d */
        final /* synthetic */ boolean f493d;

        C0837b(int i, String str, int i2, boolean z) {
            this.f490a = i;
            this.f491b = str;
            this.f492c = i2;
            this.f493d = z;
        }

        public void run() {
            C0835g0.this.m592a(this.f490a, this.f491b, this.f492c);
            int i = 0;
            while (i <= this.f491b.length() / TTAdSdk.INIT_LOCAL_FAIL_CODE) {
                int i2 = i * TTAdSdk.INIT_LOCAL_FAIL_CODE;
                i++;
                int min = Math.min(i * TTAdSdk.INIT_LOCAL_FAIL_CODE, this.f491b.length());
                if (this.f492c == 3) {
                    C0835g0 g0Var = C0835g0.this;
                    if (g0Var.mo10826a(C0773c0.m391f(g0Var.f484a, Integer.toString(this.f490a)), 3, this.f493d)) {
                        Log.d("AdColony [TRACE]", this.f491b.substring(i2, min));
                    }
                }
                if (this.f492c == 2) {
                    C0835g0 g0Var2 = C0835g0.this;
                    if (g0Var2.mo10826a(C0773c0.m391f(g0Var2.f484a, Integer.toString(this.f490a)), 2, this.f493d)) {
                        Log.i("AdColony [INFO]", this.f491b.substring(i2, min));
                    }
                }
                if (this.f492c == 1) {
                    C0835g0 g0Var3 = C0835g0.this;
                    if (g0Var3.mo10826a(C0773c0.m391f(g0Var3.f484a, Integer.toString(this.f490a)), 1, this.f493d)) {
                        Log.w("AdColony [WARNING]", this.f491b.substring(i2, min));
                    }
                }
                if (this.f492c == 0) {
                    C0835g0 g0Var4 = C0835g0.this;
                    if (g0Var4.mo10826a(C0773c0.m391f(g0Var4.f484a, Integer.toString(this.f490a)), 0, this.f493d)) {
                        Log.e("AdColony [ERROR]", this.f491b.substring(i2, min));
                    }
                }
                if (this.f492c == -1 && C0835g0.f482g >= -1) {
                    Log.e("AdColony [FATAL]", this.f491b.substring(i2, min));
                }
            }
        }
    }

    /* renamed from: com.adcolony.sdk.g0$c */
    class C0838c implements C0865j0 {
        C0838c(C0835g0 g0Var) {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C0835g0.f482g = C0773c0.m389d(h0Var.mo10834a(), "level");
        }
    }

    /* renamed from: com.adcolony.sdk.g0$d */
    class C0839d implements C0865j0 {
        C0839d() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C0835g0.this.mo10828b(C0773c0.m389d(h0Var.mo10834a(), "module"), 3, C0773c0.m393h(h0Var.mo10834a(), "message"), false);
        }
    }

    /* renamed from: com.adcolony.sdk.g0$e */
    class C0840e implements C0865j0 {
        C0840e() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C0835g0.this.mo10828b(C0773c0.m389d(h0Var.mo10834a(), "module"), 3, C0773c0.m393h(h0Var.mo10834a(), "message"), true);
        }
    }

    /* renamed from: com.adcolony.sdk.g0$f */
    class C0841f implements C0865j0 {
        C0841f() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C0835g0.this.mo10828b(C0773c0.m389d(h0Var.mo10834a(), "module"), 2, C0773c0.m393h(h0Var.mo10834a(), "message"), false);
        }
    }

    /* renamed from: com.adcolony.sdk.g0$g */
    class C0842g implements C0865j0 {
        C0842g() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C0835g0.this.mo10828b(C0773c0.m389d(h0Var.mo10834a(), "module"), 2, C0773c0.m393h(h0Var.mo10834a(), "message"), true);
        }
    }

    /* renamed from: com.adcolony.sdk.g0$h */
    class C0843h implements C0865j0 {
        C0843h() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C0835g0.this.mo10828b(C0773c0.m389d(h0Var.mo10834a(), "module"), 1, C0773c0.m393h(h0Var.mo10834a(), "message"), false);
        }
    }

    /* renamed from: com.adcolony.sdk.g0$i */
    class C0844i implements C0865j0 {
        C0844i() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C0835g0.this.mo10828b(C0773c0.m389d(h0Var.mo10834a(), "module"), 1, C0773c0.m393h(h0Var.mo10834a(), "message"), true);
        }
    }

    /* renamed from: com.adcolony.sdk.g0$j */
    class C0845j implements C0865j0 {
        C0845j() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C0835g0.this.mo10828b(C0773c0.m389d(h0Var.mo10834a(), "module"), 0, C0773c0.m393h(h0Var.mo10834a(), "message"), false);
        }
    }

    C0835g0() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo10828b(int i, int i2, String str, boolean z) {
        if (!m594a(m591a(i, i2, str, z))) {
            synchronized (this.f487d) {
                this.f487d.add(m591a(i, i2, str, z));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo10830c() {
        C0723a.m192a("Log.set_log_level", (C0865j0) new C0838c(this));
        C0723a.m192a("Log.public.trace", (C0865j0) new C0839d());
        C0723a.m192a("Log.private.trace", (C0865j0) new C0840e());
        C0723a.m192a("Log.public.info", (C0865j0) new C0841f());
        C0723a.m192a("Log.private.info", (C0865j0) new C0842g());
        C0723a.m192a("Log.public.warning", (C0865j0) new C0843h());
        C0723a.m192a("Log.private.warning", (C0865j0) new C0844i());
        C0723a.m192a("Log.public.error", (C0865j0) new C0845j());
        C0723a.m192a("Log.private.error", (C0865j0) new C0836a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo10832d() {
        ExecutorService executorService = this.f486c;
        if (executorService == null || executorService.isShutdown() || this.f486c.isTerminated()) {
            this.f486c = Executors.newSingleThreadExecutor();
        }
        synchronized (this.f487d) {
            while (!this.f487d.isEmpty()) {
                m594a(this.f487d.poll());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10823a(int i, String str, boolean z) {
        mo10828b(0, i, str, z);
    }

    /* renamed from: a */
    private Runnable m591a(int i, int i2, String str, boolean z) {
        return new C0837b(i, str, i2, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo10826a(C0832f1 f1Var, int i, boolean z) {
        int d = C0773c0.m389d(f1Var, "print_level");
        boolean b = C0773c0.m382b(f1Var, "log_private");
        if (f1Var.mo10791b()) {
            d = f482g;
            b = f481f;
        }
        return (!z || b) && d != 4 && d >= i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo10829b(C0828e1 e1Var) {
        this.f484a = mo10821a(e1Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C0828e1 mo10827b() {
        return this.f485b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo10825a(C0832f1 f1Var, int i) {
        int d = C0773c0.m389d(f1Var, "send_level");
        if (f1Var.mo10791b()) {
            d = f483h;
        }
        return d >= i && d != 4;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo10824a(HashMap<String, Object> hashMap) {
        try {
            C0962s0 s0Var = new C0962s0(new C0822d0(new URL("https://wd.adcolony.com/logs")), Executors.newSingleThreadScheduledExecutor(), hashMap);
            this.f488e = s0Var;
            s0Var.mo11090a(5, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m592a(int i, String str, int i2) {
        if (this.f488e != null) {
            if (i2 == 3 && mo10825a(C0773c0.m391f(this.f484a, Integer.toString(i)), 3)) {
                this.f488e.mo11091a(str);
            } else if (i2 == 2 && mo10825a(C0773c0.m391f(this.f484a, Integer.toString(i)), 2)) {
                this.f488e.mo11095c(str);
            } else if (i2 == 1 && mo10825a(C0773c0.m391f(this.f484a, Integer.toString(i)), 1)) {
                this.f488e.mo11096d(str);
            } else if (i2 == 0 && mo10825a(C0773c0.m391f(this.f484a, Integer.toString(i)), 0)) {
                this.f488e.mo11094b(str);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0832f1 mo10821a(C0828e1 e1Var) {
        C0832f1 b = C0773c0.m379b();
        for (int i = 0; i < e1Var.mo10752b(); i++) {
            C0832f1 a = C0773c0.m368a(e1Var, i);
            C0773c0.m375a(b, Integer.toString(C0773c0.m389d(a, "id")), a);
        }
        return b;
    }

    /* renamed from: a */
    private boolean m594a(Runnable runnable) {
        try {
            ExecutorService executorService = this.f486c;
            if (executorService == null || executorService.isShutdown() || this.f486c.isTerminated()) {
                return false;
            }
            this.f486c.submit(runnable);
            return true;
        } catch (RejectedExecutionException unused) {
            Log.e("ADCLogError", "Internal error when submitting log to executor service.");
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo10831c(C0828e1 e1Var) {
        if (e1Var != null) {
            e1Var.mo10754b("level");
            e1Var.mo10754b("message");
        }
        this.f485b = e1Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0962s0 mo10822a() {
        return this.f488e;
    }
}
