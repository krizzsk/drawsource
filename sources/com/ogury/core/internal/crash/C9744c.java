package com.ogury.core.internal.crash;

import android.content.Context;
import android.os.Build;
import com.ogury.core.internal.C9717ai;
import com.ogury.core.internal.crash.C9741a;
import com.ogury.core.internal.crash.C9765o;
import com.ogury.core.internal.crash.C9767p;
import java.io.File;
import java.io.IOException;
import org.json.JSONObject;

/* renamed from: com.ogury.core.internal.crash.c */
/* compiled from: CrashFileSerializer.kt */
public final class C9744c {

    /* renamed from: a */
    private final C9748e f24622a;

    /* renamed from: b */
    private final C9762m f24623b;

    /* renamed from: c */
    private final Throwable f24624c;

    /* renamed from: d */
    private final C9765o f24625d;

    /* renamed from: e */
    private final C9741a f24626e;

    /* renamed from: f */
    private final C9750f f24627f;

    /* renamed from: g */
    private final C9746d f24628g;

    /* renamed from: h */
    private final C9764n f24629h;

    /* renamed from: i */
    private final String f24630i;

    private C9744c(C9745a aVar) {
        this.f24622a = aVar.mo64093f();
        this.f24623b = aVar.mo64094g();
        this.f24624c = aVar.mo64095h();
        this.f24625d = aVar.mo64088a();
        this.f24626e = aVar.mo64089b();
        this.f24627f = aVar.mo64090c();
        this.f24628g = aVar.mo64091d();
        this.f24629h = aVar.mo64092e();
        this.f24630i = C9748e.m28188a(this.f24624c);
    }

    public /* synthetic */ C9744c(C9745a aVar, byte b) {
        this(aVar);
    }

    /* renamed from: com.ogury.core.internal.crash.c$a */
    /* compiled from: CrashFileSerializer.kt */
    public static final class C9745a {

        /* renamed from: a */
        private C9765o f24631a;

        /* renamed from: b */
        private C9741a f24632b;

        /* renamed from: c */
        private C9750f f24633c;

        /* renamed from: d */
        private C9746d f24634d;

        /* renamed from: e */
        private C9764n f24635e;

        /* renamed from: f */
        private final C9748e f24636f;

        /* renamed from: g */
        private final C9762m f24637g;

        /* renamed from: h */
        private final Throwable f24638h;

        public C9745a(Context context, C9748e eVar, C9762m mVar, Throwable th) {
            C9767p pVar;
            Context context2 = context;
            C9748e eVar2 = eVar;
            C9762m mVar2 = mVar;
            Throwable th2 = th;
            C9717ai.m28145b(context2, "context");
            C9717ai.m28145b(eVar2, "crashFormatter");
            C9717ai.m28145b(mVar2, "fileStore");
            C9717ai.m28145b(th2, "throwable");
            this.f24636f = eVar2;
            this.f24637g = mVar2;
            this.f24638h = th2;
            C9765o.C9766a aVar = C9765o.f24665a;
            String str = Build.MODEL;
            C9717ai.m28143a((Object) str, "Build.MODEL");
            String str2 = Build.VERSION.RELEASE;
            C9717ai.m28143a((Object) str2, "Build.VERSION.RELEASE");
            C9767p.C9768a aVar2 = C9767p.f24669a;
            Runtime runtime = Runtime.getRuntime();
            if (runtime != null) {
                pVar = new C9767p(runtime.freeMemory(), runtime.totalMemory(), runtime.maxMemory(), true);
            } else {
                pVar = new C9767p(0, 0, 0, false, 15);
            }
            this.f24631a = new C9765o(str, str2, pVar);
            C9741a.C9742a aVar3 = C9741a.f24618a;
            this.f24632b = C9741a.C9742a.m28171a(context);
            this.f24633c = new C9750f(context2);
            this.f24634d = new C9746d();
            this.f24635e = new C9764n(this.f24633c);
        }

        /* renamed from: f */
        public final C9748e mo64093f() {
            return this.f24636f;
        }

        /* renamed from: g */
        public final C9762m mo64094g() {
            return this.f24637g;
        }

        /* renamed from: h */
        public final Throwable mo64095h() {
            return this.f24638h;
        }

        /* renamed from: a */
        public final C9765o mo64088a() {
            return this.f24631a;
        }

        /* renamed from: b */
        public final C9741a mo64089b() {
            return this.f24632b;
        }

        /* renamed from: c */
        public final C9750f mo64090c() {
            return this.f24633c;
        }

        /* renamed from: d */
        public final C9746d mo64091d() {
            return this.f24634d;
        }

        /* renamed from: e */
        public final C9764n mo64092e() {
            return this.f24635e;
        }
    }

    /* renamed from: a */
    public final void mo64085a() throws IOException {
        String c;
        String a = this.f24629h.mo64118a(this.f24630i);
        if (a != null && (c = this.f24627f.mo64105c(a)) != null) {
            m28173a(c, 1);
        }
    }

    /* renamed from: a */
    public final void mo64086a(String str) {
        C9717ai.m28145b(str, "sdkKey");
        m28173a(str, 1);
    }

    /* renamed from: b */
    public final void mo64087b(String str) {
        C9717ai.m28145b(str, "sdkKey");
        m28173a(str, 2);
    }

    /* renamed from: a */
    private final void m28173a(String str, int i) {
        File a = this.f24623b.mo64114a(str, i);
        if (a != null) {
            JSONObject a2 = this.f24622a.mo64098a(this.f24626e, this.f24625d, this.f24624c, this.f24630i);
            if (this.f24627f.mo64104b(str)) {
                this.f24628g.mo64096a(a, a2, C9762m.m28214b(a));
            }
        }
    }
}
