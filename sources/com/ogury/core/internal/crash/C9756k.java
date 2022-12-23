package com.ogury.core.internal.crash;

import com.ogury.core.internal.C9713ae;
import com.ogury.core.internal.C9717ai;
import com.ogury.core.internal.C9718aj;
import com.ogury.core.internal.C9775g;
import java.io.File;
import org.json.JSONArray;

/* renamed from: com.ogury.core.internal.crash.k */
/* compiled from: CrashUploader.kt */
public final class C9756k {

    /* renamed from: a */
    private final C9750f f24651a;

    /* renamed from: b */
    private final C9762m f24652b;

    /* renamed from: c */
    private final C9746d f24653c;

    static {
        new C9757a((byte) 0);
    }

    private C9756k(C9750f fVar, C9762m mVar, C9746d dVar) {
        C9717ai.m28145b(fVar, "crashReportDao");
        C9717ai.m28145b(mVar, "fileStore");
        C9717ai.m28145b(dVar, "crashFileWriter");
        this.f24651a = fVar;
        this.f24652b = mVar;
        this.f24653c = dVar;
    }

    public /* synthetic */ C9756k(C9750f fVar, C9762m mVar, C9746d dVar, int i) {
        this(fVar, mVar, new C9746d());
    }

    /* renamed from: com.ogury.core.internal.crash.k$a */
    /* compiled from: CrashUploader.kt */
    public static final class C9757a {
        private C9757a() {
        }

        public /* synthetic */ C9757a(byte b) {
            this();
        }
    }

    /* renamed from: com.ogury.core.internal.crash.k$b */
    /* compiled from: CrashUploader.kt */
    static final class C9758b extends C9718aj implements C9713ae<C9775g> {

        /* renamed from: a */
        private /* synthetic */ C9756k f24654a;

        /* renamed from: b */
        private /* synthetic */ String f24655b;

        /* renamed from: c */
        private /* synthetic */ int f24656c;

        /* renamed from: d */
        private /* synthetic */ int f24657d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9758b(C9756k kVar, String str, int i, int i2) {
            super(0);
            this.f24654a = kVar;
            this.f24655b = str;
            this.f24656c = i;
            this.f24657d = i2;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo64059a() {
            C9756k.m28210a(this.f24654a, this.f24655b, this.f24656c, this.f24657d);
            return C9775g.f24678a;
        }
    }

    /* renamed from: com.ogury.core.internal.crash.k$c */
    /* compiled from: CrashUploader.kt */
    static final class C9759c extends C9718aj implements C9713ae<C9775g> {

        /* renamed from: a */
        private /* synthetic */ C9756k f24658a;

        /* renamed from: b */
        private /* synthetic */ String f24659b;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C9759c(C9756k kVar, String str) {
            super(0);
            this.f24658a = kVar;
            this.f24659b = str;
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo64059a() {
            C9756k.m28209a(this.f24658a, this.f24659b);
            return C9775g.f24678a;
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ void m28210a(C9756k kVar, String str, int i, int i2) {
        try {
            File c = kVar.f24652b.mo64117c(str);
            JSONArray b = C9762m.m28214b(c);
            C9769q qVar = C9769q.f24674a;
            JSONArray a = C9769q.m28229a(b, i);
            if (a.length() != 0) {
                C9743b bVar = C9743b.f24621a;
                String jSONArray = a.toString();
                C9717ai.m28143a((Object) jSONArray, "crashesToUpload.toString()");
                int a2 = C9743b.m28172a(jSONArray, kVar.f24651a.mo64099a(str));
                if (a2 == 201) {
                    kVar.f24653c.mo64097a(b, c);
                }
                if (a2 < 500 && b.length() >= i2) {
                    C9762m.m28213a(c);
                }
            }
        } catch (Exception e) {
            C9754i iVar = C9754i.f24647a;
            C9754i.m28207a(e);
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ void m28209a(C9756k kVar, String str) {
        try {
            File b = kVar.f24652b.mo64116b(str);
            JSONArray b2 = C9762m.m28214b(b);
            if (b2.length() != 0) {
                C9743b bVar = C9743b.f24621a;
                String jSONArray = b2.toString();
                C9717ai.m28143a((Object) jSONArray, "savedCrashes.toString()");
                if (C9743b.m28172a(jSONArray, kVar.f24651a.mo64099a(str)) < 500) {
                    C9762m.m28213a(b);
                }
            }
        } catch (Exception e) {
            C9754i iVar = C9754i.f24647a;
            C9754i.m28207a(e);
        }
    }
}
