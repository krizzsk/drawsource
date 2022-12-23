package com.bytedance.sdk.component.p108d.p111c;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import com.bytedance.sdk.component.p108d.C2759b;
import com.bytedance.sdk.component.p108d.C2765c;
import com.bytedance.sdk.component.p108d.C2807d;
import com.bytedance.sdk.component.p108d.C2829k;
import com.bytedance.sdk.component.p108d.C2830l;
import com.bytedance.sdk.component.p108d.C2833o;
import com.bytedance.sdk.component.p108d.C2834p;
import com.bytedance.sdk.component.p108d.C2835q;
import com.bytedance.sdk.component.p108d.p109a.C2756b;
import com.bytedance.sdk.component.p108d.p109a.C2758c;
import com.bytedance.sdk.component.p108d.p110b.C2761b;
import com.bytedance.sdk.component.p108d.p111c.p112a.C2767a;
import com.bytedance.sdk.component.p108d.p111c.p112a.p113a.C2775b;
import com.bytedance.sdk.component.p108d.p111c.p112a.p114b.C2780a;
import com.bytedance.sdk.component.p108d.p111c.p112a.p114b.C2786e;
import com.bytedance.sdk.component.p108d.p111c.p115b.C2789a;
import java.io.File;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* renamed from: com.bytedance.sdk.component.d.c.f */
/* compiled from: LoadFactory */
public class C2804f {

    /* renamed from: a */
    private Map<String, List<C2790c>> f6315a = new ConcurrentHashMap();

    /* renamed from: b */
    private final C2830l f6316b;

    /* renamed from: c */
    private Map<String, C2834p> f6317c = new HashMap();

    /* renamed from: d */
    private Map<String, C2835q> f6318d = new HashMap();

    /* renamed from: e */
    private Map<String, C2765c> f6319e = new HashMap();

    /* renamed from: f */
    private C2807d f6320f;

    /* renamed from: g */
    private C2829k f6321g;

    /* renamed from: h */
    private ExecutorService f6322h;

    /* renamed from: i */
    private C2833o f6323i;

    public C2804f(Context context, C2830l lVar) {
        this.f6316b = (C2830l) C2806h.m7780a(lVar);
        C2767a.m7544a(context, lVar.mo17659h());
    }

    /* renamed from: d */
    private C2834p m7760d(C2759b bVar) {
        C2834p d = this.f6316b.mo17655d();
        return d != null ? C2780a.m7615a(d) : C2780a.m7614a(bVar.mo17528b());
    }

    /* renamed from: e */
    private C2835q m7761e(C2759b bVar) {
        C2835q e = this.f6316b.mo17656e();
        return e != null ? e : C2786e.m7639a(bVar.mo17528b());
    }

    /* renamed from: f */
    private C2765c m7762f(C2759b bVar) {
        C2765c f = this.f6316b.mo17657f();
        return f != null ? f : new C2775b(bVar.mo17531e(), bVar.mo17527a(), mo17673e());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r0 = 'I';
        r1 = '`';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        switch(r1) {
            case 55: goto L_0x0026;
            case 56: goto L_0x0026;
            case 57: goto L_0x000f;
            default: goto L_0x000e;
        };
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String f1659536876622dc(java.lang.String r2) {
        /*
        L_0x0000:
            r0 = 74
            r1 = 55
        L_0x0004:
            switch(r0) {
                case 72: goto L_0x0000;
                case 73: goto L_0x0008;
                case 74: goto L_0x000b;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x002b
        L_0x0008:
            switch(r1) {
                case 94: goto L_0x0026;
                case 95: goto L_0x000f;
                case 96: goto L_0x000f;
                default: goto L_0x000b;
            }
        L_0x000b:
            switch(r1) {
                case 55: goto L_0x0026;
                case 56: goto L_0x0026;
                case 57: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0026
        L_0x000f:
            char[] r2 = r2.toCharArray()
            r0 = 0
        L_0x0014:
            int r1 = r2.length
            if (r0 >= r1) goto L_0x0020
            char r1 = r2[r0]
            r1 = r1 ^ r0
            char r1 = (char) r1
            r2[r0] = r1
            int r0 = r0 + 1
            goto L_0x0014
        L_0x0020:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            return r0
        L_0x0026:
            r0 = 73
            r1 = 96
            goto L_0x0004
        L_0x002b:
            r0 = 72
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p108d.p111c.C2804f.f1659536876622dc(java.lang.String):java.lang.String");
    }

    /* renamed from: h */
    private C2807d m7763h() {
        C2807d c = this.f6316b.mo17654c();
        return c == null ? C2761b.m7525a() : c;
    }

    /* renamed from: i */
    private C2829k m7764i() {
        C2829k a = this.f6316b.mo17652a();
        return a != null ? a : C2756b.m7512a();
    }

    /* renamed from: j */
    private ExecutorService m7765j() {
        ExecutorService b = this.f6316b.mo17653b();
        return b != null ? b : C2758c.m7516a();
    }

    /* renamed from: k */
    private C2833o m7766k() {
        C2833o g = this.f6316b.mo17658g();
        return g == null ? new C2805g() : g;
    }

    /* renamed from: a */
    public C2789a mo17664a(C2790c cVar) {
        ImageView.ScaleType d = cVar.mo17613d();
        if (d == null) {
            d = C2789a.f6230a;
        }
        Bitmap.Config h = cVar.mo17617h();
        if (h == null) {
            h = C2789a.f6231b;
        }
        return new C2789a(cVar.mo17610b(), cVar.mo17612c(), d, h);
    }

    /* renamed from: a */
    public C2765c mo17665a(String str) {
        return mo17670c(C2767a.m7543a(new File(str)));
    }

    /* renamed from: a */
    public C2834p mo17666a(C2759b bVar) {
        if (bVar == null) {
            bVar = C2767a.m7545f();
        }
        String file = bVar.mo17531e().toString();
        C2834p pVar = this.f6317c.get(file);
        if (pVar != null) {
            return pVar;
        }
        C2834p d = m7760d(bVar);
        this.f6317c.put(file, d);
        return d;
    }

    /* renamed from: a */
    public Collection<C2835q> mo17667a() {
        return this.f6318d.values();
    }

    /* renamed from: b */
    public C2835q mo17668b(C2759b bVar) {
        if (bVar == null) {
            bVar = C2767a.m7545f();
        }
        String file = bVar.mo17531e().toString();
        C2835q qVar = this.f6318d.get(file);
        if (qVar != null) {
            return qVar;
        }
        C2835q e = m7761e(bVar);
        this.f6318d.put(file, e);
        return e;
    }

    /* renamed from: b */
    public Collection<C2765c> mo17669b() {
        return this.f6319e.values();
    }

    /* renamed from: c */
    public C2765c mo17670c(C2759b bVar) {
        if (bVar == null) {
            bVar = C2767a.m7545f();
        }
        String file = bVar.mo17531e().toString();
        C2765c cVar = this.f6319e.get(file);
        if (cVar != null) {
            return cVar;
        }
        C2765c f = m7762f(bVar);
        this.f6319e.put(file, f);
        return f;
    }

    /* renamed from: c */
    public C2807d mo17671c() {
        if (this.f6320f == null) {
            this.f6320f = m7763h();
        }
        return this.f6320f;
    }

    /* renamed from: d */
    public C2829k mo17672d() {
        if (this.f6321g == null) {
            this.f6321g = m7764i();
        }
        return this.f6321g;
    }

    /* renamed from: e */
    public ExecutorService mo17673e() {
        if (this.f6322h == null) {
            this.f6322h = m7765j();
        }
        return this.f6322h;
    }

    /* renamed from: f */
    public Map<String, List<C2790c>> mo17674f() {
        return this.f6315a;
    }

    /* renamed from: g */
    public C2833o mo17675g() {
        if (this.f6323i == null) {
            this.f6323i = m7766k();
        }
        return this.f6323i;
    }
}
