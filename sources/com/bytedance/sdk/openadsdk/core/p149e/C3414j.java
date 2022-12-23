package com.bytedance.sdk.openadsdk.core.p149e;

import android.util.SparseArray;
import com.bytedance.sdk.component.adexpress.C2548b;
import com.bytedance.sdk.openadsdk.core.p144b.C3362c;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.e.j */
/* compiled from: DynamicClickInfo */
public class C3414j implements C2548b {

    /* renamed from: a */
    public final float f8265a;

    /* renamed from: b */
    public final float f8266b;

    /* renamed from: c */
    public final float f8267c;

    /* renamed from: d */
    public final float f8268d;

    /* renamed from: e */
    public final long f8269e;

    /* renamed from: f */
    public final long f8270f;

    /* renamed from: g */
    public final int f8271g;

    /* renamed from: h */
    public final int f8272h;

    /* renamed from: i */
    public final int f8273i;

    /* renamed from: j */
    public final int f8274j;

    /* renamed from: k */
    public final String f8275k;

    /* renamed from: l */
    public int f8276l;

    /* renamed from: m */
    public JSONObject f8277m;

    /* renamed from: n */
    public SparseArray<C3362c.C3363a> f8278n;

    /* renamed from: o */
    public final boolean f8279o;

    /* renamed from: p */
    public int f8280p;

    private C3414j(C3416a aVar) {
        this.f8265a = aVar.f8287g;
        this.f8266b = aVar.f8286f;
        this.f8267c = aVar.f8285e;
        this.f8268d = aVar.f8284d;
        this.f8269e = aVar.f8283c;
        this.f8270f = aVar.f8282b;
        this.f8271g = aVar.f8288h;
        this.f8272h = aVar.f8289i;
        this.f8273i = aVar.f8290j;
        this.f8274j = aVar.f8291k;
        this.f8275k = aVar.f8292l;
        this.f8278n = aVar.f8281a;
        this.f8279o = aVar.f8296p;
        this.f8276l = aVar.f8293m;
        this.f8277m = aVar.f8294n;
        this.f8280p = aVar.f8295o;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.e.j$a */
    /* compiled from: DynamicClickInfo */
    public static class C3416a {

        /* renamed from: a */
        protected SparseArray<C3362c.C3363a> f8281a = new SparseArray<>();
        /* access modifiers changed from: private */

        /* renamed from: b */
        public long f8282b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public long f8283c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public float f8284d;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public float f8285e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public float f8286f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public float f8287g;
        /* access modifiers changed from: private */

        /* renamed from: h */
        public int f8288h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public int f8289i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public int f8290j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public int f8291k;
        /* access modifiers changed from: private */

        /* renamed from: l */
        public String f8292l;
        /* access modifiers changed from: private */

        /* renamed from: m */
        public int f8293m;
        /* access modifiers changed from: private */

        /* renamed from: n */
        public JSONObject f8294n;
        /* access modifiers changed from: private */

        /* renamed from: o */
        public int f8295o;
        /* access modifiers changed from: private */

        /* renamed from: p */
        public boolean f8296p;

        /* renamed from: a */
        public C3416a mo19452a(int i) {
            this.f8295o = i;
            return this;
        }

        /* renamed from: b */
        public C3416a mo19460b(int i) {
            this.f8293m = i;
            return this;
        }

        /* renamed from: a */
        public C3416a mo19456a(JSONObject jSONObject) {
            this.f8294n = jSONObject;
            return this;
        }

        /* renamed from: a */
        public C3416a mo19457a(boolean z) {
            this.f8296p = z;
            return this;
        }

        /* renamed from: a */
        public C3416a mo19453a(long j) {
            this.f8282b = j;
            return this;
        }

        /* renamed from: b */
        public C3416a mo19461b(long j) {
            this.f8283c = j;
            return this;
        }

        /* renamed from: a */
        public C3416a mo19451a(float f) {
            this.f8284d = f;
            return this;
        }

        /* renamed from: b */
        public C3416a mo19459b(float f) {
            this.f8285e = f;
            return this;
        }

        /* renamed from: c */
        public C3416a mo19462c(float f) {
            this.f8286f = f;
            return this;
        }

        /* renamed from: d */
        public C3416a mo19464d(float f) {
            this.f8287g = f;
            return this;
        }

        /* renamed from: c */
        public C3416a mo19463c(int i) {
            this.f8288h = i;
            return this;
        }

        /* renamed from: d */
        public C3416a mo19465d(int i) {
            this.f8289i = i;
            return this;
        }

        /* renamed from: e */
        public C3416a mo19466e(int i) {
            this.f8290j = i;
            return this;
        }

        /* renamed from: f */
        public C3416a mo19467f(int i) {
            this.f8291k = i;
            return this;
        }

        /* renamed from: a */
        public C3416a mo19455a(String str) {
            this.f8292l = str;
            return this;
        }

        /* renamed from: a */
        public C3416a mo19454a(SparseArray<C3362c.C3363a> sparseArray) {
            this.f8281a = sparseArray;
            return this;
        }

        /* renamed from: a */
        public C3414j mo19458a() {
            return new C3414j(this);
        }
    }
}
