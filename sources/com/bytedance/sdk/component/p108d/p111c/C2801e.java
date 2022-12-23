package com.bytedance.sdk.component.p108d.p111c;

import android.content.Context;
import com.bytedance.sdk.component.p108d.C2759b;
import com.bytedance.sdk.component.p108d.C2765c;
import com.bytedance.sdk.component.p108d.C2807d;
import com.bytedance.sdk.component.p108d.C2829k;
import com.bytedance.sdk.component.p108d.C2830l;
import com.bytedance.sdk.component.p108d.C2833o;
import com.bytedance.sdk.component.p108d.C2834p;
import com.bytedance.sdk.component.p108d.C2835q;
import java.util.concurrent.ExecutorService;

/* renamed from: com.bytedance.sdk.component.d.c.e */
/* compiled from: LoadConfig */
public class C2801e implements C2830l {

    /* renamed from: a */
    private C2829k f6299a;

    /* renamed from: b */
    private ExecutorService f6300b;

    /* renamed from: c */
    private C2807d f6301c;

    /* renamed from: d */
    private C2834p f6302d;

    /* renamed from: e */
    private C2835q f6303e;

    /* renamed from: f */
    private C2765c f6304f;

    /* renamed from: g */
    private C2833o f6305g;

    /* renamed from: h */
    private C2759b f6306h;

    private C2801e(C2803a aVar) {
        this.f6299a = aVar.f6307a;
        this.f6300b = aVar.f6308b;
        this.f6301c = aVar.f6309c;
        this.f6302d = aVar.f6310d;
        this.f6303e = aVar.f6311e;
        this.f6304f = aVar.f6312f;
        this.f6306h = aVar.f6314h;
        this.f6305g = aVar.f6313g;
    }

    /* renamed from: a */
    public C2829k mo17652a() {
        return this.f6299a;
    }

    /* renamed from: b */
    public ExecutorService mo17653b() {
        return this.f6300b;
    }

    /* renamed from: c */
    public C2807d mo17654c() {
        return this.f6301c;
    }

    /* renamed from: d */
    public C2834p mo17655d() {
        return this.f6302d;
    }

    /* renamed from: e */
    public C2835q mo17656e() {
        return this.f6303e;
    }

    /* renamed from: f */
    public C2765c mo17657f() {
        return this.f6304f;
    }

    /* renamed from: g */
    public C2833o mo17658g() {
        return this.f6305g;
    }

    /* renamed from: h */
    public C2759b mo17659h() {
        return this.f6306h;
    }

    /* renamed from: a */
    public static C2801e m7739a(Context context) {
        return new C2803a().mo17663a();
    }

    /* renamed from: com.bytedance.sdk.component.d.c.e$a */
    /* compiled from: LoadConfig */
    public static class C2803a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public C2829k f6307a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public ExecutorService f6308b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C2807d f6309c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public C2834p f6310d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public C2835q f6311e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public C2765c f6312f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public C2833o f6313g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public C2759b f6314h;

        /* renamed from: a */
        public C2803a mo17660a(C2759b bVar) {
            this.f6314h = bVar;
            return this;
        }

        /* renamed from: a */
        public C2803a mo17662a(ExecutorService executorService) {
            this.f6308b = executorService;
            return this;
        }

        /* renamed from: a */
        public C2803a mo17661a(C2807d dVar) {
            this.f6309c = dVar;
            return this;
        }

        /* renamed from: a */
        public C2801e mo17663a() {
            return new C2801e(this);
        }
    }
}
