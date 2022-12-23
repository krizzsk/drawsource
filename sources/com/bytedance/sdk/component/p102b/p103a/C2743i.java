package com.bytedance.sdk.component.p102b.p103a;

import com.bytedance.sdk.component.p102b.p103a.p104a.C2713a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.sdk.component.b.a.i */
/* compiled from: OkHttpClient */
public abstract class C2743i implements Cloneable {

    /* renamed from: a */
    public List<C2740g> f6109a;

    /* renamed from: b */
    public long f6110b;

    /* renamed from: c */
    public TimeUnit f6111c;

    /* renamed from: d */
    public long f6112d;

    /* renamed from: e */
    public TimeUnit f6113e;

    /* renamed from: f */
    public long f6114f;

    /* renamed from: g */
    public TimeUnit f6115g;

    /* renamed from: a */
    public abstract C2724b mo17398a(C2746k kVar);

    /* renamed from: a */
    public abstract C2735d mo17399a();

    public C2743i(C2744a aVar) {
        this.f6110b = aVar.f6117b;
        this.f6112d = aVar.f6119d;
        this.f6114f = aVar.f6121f;
        this.f6109a = aVar.f6116a;
        this.f6111c = aVar.f6118c;
        this.f6113e = aVar.f6120e;
        this.f6115g = aVar.f6122g;
        this.f6109a = aVar.f6116a;
    }

    /* renamed from: com.bytedance.sdk.component.b.a.i$a */
    /* compiled from: OkHttpClient */
    public static final class C2744a {

        /* renamed from: a */
        public final List<C2740g> f6116a = new ArrayList();

        /* renamed from: b */
        public long f6117b = 10000;

        /* renamed from: c */
        public TimeUnit f6118c = TimeUnit.MILLISECONDS;

        /* renamed from: d */
        public long f6119d = 10000;

        /* renamed from: e */
        public TimeUnit f6120e = TimeUnit.MILLISECONDS;

        /* renamed from: f */
        public long f6121f = 10000;

        /* renamed from: g */
        public TimeUnit f6122g = TimeUnit.MILLISECONDS;

        public C2744a() {
        }

        public C2744a(C2743i iVar) {
            this.f6117b = iVar.f6110b;
            this.f6118c = iVar.f6111c;
            this.f6119d = iVar.f6112d;
            this.f6120e = iVar.f6113e;
            this.f6121f = iVar.f6114f;
            this.f6122g = iVar.f6115g;
        }

        /* renamed from: a */
        public C2744a mo17497a(long j, TimeUnit timeUnit) {
            this.f6117b = j;
            this.f6118c = timeUnit;
            return this;
        }

        /* renamed from: b */
        public C2744a mo17500b(long j, TimeUnit timeUnit) {
            this.f6119d = j;
            this.f6120e = timeUnit;
            return this;
        }

        /* renamed from: c */
        public C2744a mo17501c(long j, TimeUnit timeUnit) {
            this.f6121f = j;
            this.f6122g = timeUnit;
            return this;
        }

        /* renamed from: a */
        public C2744a mo17498a(C2740g gVar) {
            this.f6116a.add(gVar);
            return this;
        }

        /* renamed from: a */
        public C2743i mo17499a() {
            return C2713a.m7318a(this);
        }
    }

    /* renamed from: b */
    public C2744a mo17496b() {
        return new C2744a(this);
    }
}
