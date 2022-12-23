package com.bytedance.sdk.component.p118e;

import android.content.Context;
import com.bytedance.sdk.component.p102b.p103a.C2740g;
import com.bytedance.sdk.component.p102b.p103a.C2743i;
import com.bytedance.sdk.component.p118e.p120b.C2844a;
import com.bytedance.sdk.component.p118e.p120b.C2846b;
import com.bytedance.sdk.component.p118e.p120b.C2849d;
import com.bytedance.sdk.component.p118e.p121c.C2855b;
import com.bytedance.sdk.component.p118e.p121c.C2860f;
import com.bytedance.sdk.component.p118e.p121c.C2861g;
import com.bytedance.sdk.component.p118e.p122d.C2863b;
import com.bytedance.sdk.component.p118e.p122d.C2871f;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.sdk.component.e.a */
/* compiled from: NetClient */
public class C2839a {

    /* renamed from: a */
    private C2743i f6347a;

    /* renamed from: b */
    private C2860f f6348b;

    /* renamed from: c */
    private int f6349c;

    private C2839a(C2841a aVar) {
        C2743i.C2744a b = new C2743i.C2744a().mo17497a((long) aVar.f6350a, TimeUnit.MILLISECONDS).mo17501c((long) aVar.f6352c, TimeUnit.MILLISECONDS).mo17500b((long) aVar.f6351b, TimeUnit.MILLISECONDS);
        if (aVar.f6353d) {
            C2860f fVar = new C2860f();
            this.f6348b = fVar;
            b.mo17498a(fVar);
        }
        if (aVar.f6354e != null && aVar.f6354e.size() > 0) {
            for (C2740g a : aVar.f6354e) {
                b.mo17498a(a);
            }
        }
        this.f6347a = b.mo17499a();
    }

    /* renamed from: a */
    public void mo17682a(Context context, boolean z, boolean z2, C2855b bVar) {
        if (context == null) {
            throw new IllegalArgumentException("tryInitAdTTNet context is null");
        } else if (bVar != null) {
            int a = bVar.mo17735a();
            this.f6349c = a;
            C2860f fVar = this.f6348b;
            if (fVar != null) {
                fVar.mo17764a(a);
            }
            C2861g.m7987a().mo17766a(this.f6349c).mo17755a(z2);
            C2861g.m7987a().mo17766a(this.f6349c).mo17754a(bVar);
            C2861g.m7987a().mo17766a(this.f6349c).mo17751a(context, C2871f.m8008b(context));
            if (C2871f.m8007a(context) || (!C2871f.m8008b(context) && z)) {
                C2861g.m7987a().mo17765a(this.f6349c, context).mo17729d();
                C2861g.m7987a().mo17765a(this.f6349c, context).mo17722a();
            }
            if (C2871f.m8008b(context)) {
                C2861g.m7987a().mo17765a(this.f6349c, context).mo17729d();
                C2861g.m7987a().mo17765a(this.f6349c, context).mo17722a();
            }
        } else {
            throw new IllegalArgumentException("tryInitAdTTNet ITTAdNetDepend is null");
        }
    }

    /* renamed from: a */
    public static void m7860a() {
        C2863b.m7992a(C2863b.C2865a.DEBUG);
    }

    /* renamed from: b */
    public C2849d mo17683b() {
        return new C2849d(this.f6347a);
    }

    /* renamed from: c */
    public C2846b mo17684c() {
        return new C2846b(this.f6347a);
    }

    /* renamed from: d */
    public C2844a mo17685d() {
        return new C2844a(this.f6347a);
    }

    /* renamed from: e */
    public C2743i mo17686e() {
        return this.f6347a;
    }

    /* renamed from: com.bytedance.sdk.component.e.a$a */
    /* compiled from: NetClient */
    public static final class C2841a {

        /* renamed from: a */
        int f6350a = 10000;

        /* renamed from: b */
        int f6351b = 10000;

        /* renamed from: c */
        int f6352c = 10000;

        /* renamed from: d */
        boolean f6353d = true;

        /* renamed from: e */
        final List<C2740g> f6354e = new ArrayList();

        /* renamed from: a */
        public C2841a mo17687a(long j, TimeUnit timeUnit) {
            this.f6350a = m7866a("timeout", j, timeUnit);
            return this;
        }

        /* renamed from: b */
        public C2841a mo17690b(long j, TimeUnit timeUnit) {
            this.f6351b = m7866a("timeout", j, timeUnit);
            return this;
        }

        /* renamed from: c */
        public C2841a mo17691c(long j, TimeUnit timeUnit) {
            this.f6352c = m7866a("timeout", j, timeUnit);
            return this;
        }

        /* renamed from: a */
        public C2841a mo17688a(boolean z) {
            this.f6353d = z;
            return this;
        }

        /* renamed from: a */
        private static int m7866a(String str, long j, TimeUnit timeUnit) {
            int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            if (i < 0) {
                throw new IllegalArgumentException(str + " < 0");
            } else if (timeUnit != null) {
                long millis = timeUnit.toMillis(j);
                if (millis > 2147483647L) {
                    throw new IllegalArgumentException(str + " too large.");
                } else if (millis != 0 || i <= 0) {
                    return (int) millis;
                } else {
                    throw new IllegalArgumentException(str + " too small.");
                }
            } else {
                throw new NullPointerException("unit == null");
            }
        }

        /* renamed from: a */
        public C2839a mo17689a() {
            return new C2839a(this);
        }
    }
}
