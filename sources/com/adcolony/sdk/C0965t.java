package com.adcolony.sdk;

import com.adcolony.sdk.C0826e0;
import com.adcolony.sdk.C0960s;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.adcolony.sdk.t */
class C0965t implements C0960s.C0961a {

    /* renamed from: a */
    private LinkedBlockingQueue<Runnable> f776a = new LinkedBlockingQueue<>();

    /* renamed from: b */
    private int f777b = 4;

    /* renamed from: c */
    private int f778c = 16;

    /* renamed from: d */
    private double f779d = 1.0d;

    /* renamed from: e */
    private ThreadPoolExecutor f780e = new ThreadPoolExecutor(this.f777b, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, this.f776a);

    /* renamed from: com.adcolony.sdk.t$a */
    class C0966a implements C0865j0 {
        C0966a() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C0965t tVar = C0965t.this;
            tVar.mo11104a(new C0960s(h0Var, tVar));
        }
    }

    /* renamed from: com.adcolony.sdk.t$b */
    class C0967b implements C0865j0 {
        C0967b() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C0965t tVar = C0965t.this;
            tVar.mo11104a(new C0960s(h0Var, tVar));
        }
    }

    /* renamed from: com.adcolony.sdk.t$c */
    class C0968c implements C0865j0 {
        C0968c() {
        }

        /* renamed from: a */
        public void mo10531a(C0850h0 h0Var) {
            C0965t tVar = C0965t.this;
            tVar.mo11104a(new C0960s(h0Var, tVar));
        }
    }

    C0965t() {
    }

    /* renamed from: b */
    private void m1023b() {
        int corePoolSize = this.f780e.getCorePoolSize();
        int size = this.f776a.size();
        int i = this.f777b;
        if (((double) size) * this.f779d > ((double) ((corePoolSize - i) + 1)) && corePoolSize < this.f778c) {
            this.f780e.setCorePoolSize(corePoolSize + 1);
        } else if (size == 0 && corePoolSize > i) {
            this.f780e.setCorePoolSize(i);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11101a() {
        this.f780e.allowCoreThreadTimeOut(true);
        C0723a.m192a("WebServices.download", (C0865j0) new C0966a());
        C0723a.m192a("WebServices.get", (C0865j0) new C0967b());
        C0723a.m192a("WebServices.post", (C0865j0) new C0968c());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo11106c(int i) {
        this.f780e.setKeepAliveTime((long) i, TimeUnit.SECONDS);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo11105b(int i) {
        this.f778c = i;
        int corePoolSize = this.f780e.getCorePoolSize();
        int i2 = this.f778c;
        if (corePoolSize > i2) {
            this.f780e.setCorePoolSize(i2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11104a(C0960s sVar) {
        m1023b();
        try {
            this.f780e.execute(sVar);
        } catch (RejectedExecutionException unused) {
            C0826e0.C0827a a = new C0826e0.C0827a().mo10746a("RejectedExecutionException: ThreadPoolExecutor unable to ");
            a.mo10746a("execute download for url " + sVar.f763l).mo10747a(C0826e0.f462i);
            mo10925a(sVar, sVar.mo11086b(), (Map<String, List<String>>) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11103a(int i) {
        this.f777b = i;
        int corePoolSize = this.f780e.getCorePoolSize();
        int i2 = this.f777b;
        if (corePoolSize < i2) {
            this.f780e.setCorePoolSize(i2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11102a(double d) {
        this.f779d = d;
    }

    /* renamed from: a */
    public void mo10925a(C0960s sVar, C0850h0 h0Var, Map<String, List<String>> map) {
        C0832f1 b = C0773c0.m379b();
        C0773c0.m376a(b, "url", sVar.f763l);
        C0773c0.m385b(b, "success", sVar.f765n);
        C0773c0.m383b(b, "status", sVar.f767p);
        C0773c0.m376a(b, "body", sVar.f764m);
        C0773c0.m383b(b, "size", sVar.f766o);
        if (map != null) {
            C0832f1 b2 = C0773c0.m379b();
            for (Map.Entry next : map.entrySet()) {
                String obj = ((List) next.getValue()).toString();
                String substring = obj.substring(1, obj.length() - 1);
                if (next.getKey() != null) {
                    C0773c0.m376a(b2, (String) next.getKey(), substring);
                }
            }
            C0773c0.m375a(b, "headers", b2);
        }
        h0Var.mo10835a(b).mo10838c();
    }
}
