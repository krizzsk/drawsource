package com.ogury.p377ed.internal;

import android.content.Context;
import com.vungle.warren.model.VisionDataDBAdapter;
import org.json.JSONObject;

/* renamed from: com.ogury.ed.internal.dj */
public final class C9944dj {

    /* renamed from: a */
    public static final C9945a f25017a = new C9945a((byte) 0);

    /* renamed from: b */
    private final C9967dv f25018b;

    /* renamed from: c */
    private final C9960dp f25019c;

    /* renamed from: d */
    private final Context f25020d;

    public /* synthetic */ C9944dj(C9967dv dvVar, C9960dp dpVar, Context context, byte b) {
        this(dvVar, dpVar, context);
    }

    private C9944dj(C9967dv dvVar, C9960dp dpVar, Context context) {
        this.f25018b = dvVar;
        this.f25019c = dpVar;
        this.f25020d = context;
    }

    /* renamed from: com.ogury.ed.internal.dj$a */
    public static final class C9945a {
        public /* synthetic */ C9945a(byte b) {
            this();
        }

        private C9945a() {
        }

        /* renamed from: a */
        public static C9944dj m28726a(Context context) {
            C10263mq.m29882b(context, "context");
            C9968dw dwVar = C9968dw.f25057a;
            return new C9944dj(C9968dw.m28771a(context), new C9960dp(context), context, (byte) 0);
        }
    }

    /* renamed from: a */
    public final void mo64470a(C9942dh dhVar) {
        C10263mq.m29882b(dhVar, "event");
        if (dhVar instanceof C9952dk) {
            m28720a((C9952dk) dhVar);
        } else if (dhVar instanceof C9953dl) {
            m28721a((C9953dl) dhVar);
        } else if (dhVar instanceof C9941dg) {
            m28719a((C9941dg) dhVar);
        }
    }

    /* renamed from: a */
    private final void m28720a(C9952dk dkVar) {
        this.f25018b.mo64487a(m28723b(dkVar), dkVar.mo64471a()).mo64444a((C10228lk<? super Throwable, C10182ke>) new C9948d(C10051gf.f25281a)).mo64445a((C10227lj<C10182ke>) C9949e.f25022a);
    }

    /* renamed from: com.ogury.ed.internal.dj$d */
    /* synthetic */ class C9948d extends C10262mp implements C10228lk<Throwable, C10182ke> {
        C9948d(Object obj) {
            super(1, obj, C10051gf.class, "e", "e(Ljava/lang/Throwable;)V");
        }

        /* renamed from: a */
        private static void m28730a(Throwable th) {
            C10263mq.m29882b(th, "p0");
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo64242a(Object obj) {
            m28730a((Throwable) obj);
            return C10182ke.f25542a;
        }
    }

    /* renamed from: com.ogury.ed.internal.dj$e */
    static final class C9949e extends C10264mr implements C10227lj<C10182ke> {

        /* renamed from: a */
        public static final C9949e f25022a = new C9949e();

        C9949e() {
            super(0);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo64355a() {
            return C10182ke.f25542a;
        }
    }

    /* renamed from: b */
    private static JSONObject m28723b(C9952dk dkVar) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("type", dkVar.mo64469f());
        jSONObject.put("timestamp_diff", 0);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("content", jSONObject);
        return jSONObject2;
    }

    /* renamed from: a */
    private final void m28721a(C9953dl dlVar) {
        this.f25018b.mo64490b(m28724b(dlVar), dlVar.mo64472a().mo64548z()).mo64444a((C10228lk<? super Throwable, C10182ke>) new C9950f(C10051gf.f25281a)).mo64445a((C10227lj<C10182ke>) C9951g.f25023a);
    }

    /* renamed from: com.ogury.ed.internal.dj$f */
    /* synthetic */ class C9950f extends C10262mp implements C10228lk<Throwable, C10182ke> {
        C9950f(Object obj) {
            super(1, obj, C10051gf.class, "e", "e(Ljava/lang/Throwable;)V");
        }

        /* renamed from: a */
        private static void m28733a(Throwable th) {
            C10263mq.m29882b(th, "p0");
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo64242a(Object obj) {
            m28733a((Throwable) obj);
            return C10182ke.f25542a;
        }
    }

    /* renamed from: com.ogury.ed.internal.dj$g */
    static final class C9951g extends C10264mr implements C10227lj<C10182ke> {

        /* renamed from: a */
        public static final C9951g f25023a = new C9951g();

        C9951g() {
            super(0);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo64355a() {
            return C10182ke.f25542a;
        }
    }

    /* renamed from: a */
    private final String m28718a() {
        String str = this.f25020d.getPackageManager().getPackageInfo(this.f25020d.getPackageName(), 0).versionName;
        C10263mq.m29879a((Object) str, "context.packageManager.g…ckageName, 0).versionName");
        return str;
    }

    /* renamed from: b */
    private final JSONObject m28724b(C9953dl dlVar) {
        C9981eb a = dlVar.mo64472a();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", dlVar.mo64469f());
        jSONObject.put("campaign", a.mo64518g());
        jSONObject.put(VisionDataDBAdapter.VisionDataColumns.COLUMN_ADVERTISER, a.mo64515f());
        jSONObject.put("advert", a.mo64503b());
        jSONObject.put("ad_unit_id", a.mo64530m().mo64573a());
        jSONObject.put("version_publisher_app", m28718a());
        JSONObject a2 = this.f25019c.mo64476a();
        a2.put("content", jSONObject);
        return a2;
    }

    /* renamed from: a */
    private final void m28719a(C9941dg dgVar) {
        this.f25018b.mo64491c(m28722b(dgVar), dgVar.mo64464a().mo64494B()).mo64444a((C10228lk<? super Throwable, C10182ke>) new C9946b(C10051gf.f25281a)).mo64445a((C10227lj<C10182ke>) C9947c.f25021a);
    }

    /* renamed from: com.ogury.ed.internal.dj$b */
    /* synthetic */ class C9946b extends C10262mp implements C10228lk<Throwable, C10182ke> {
        C9946b(Object obj) {
            super(1, obj, C10051gf.class, "e", "e(Ljava/lang/Throwable;)V");
        }

        /* renamed from: a */
        private static void m28727a(Throwable th) {
            C10263mq.m29882b(th, "p0");
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo64242a(Object obj) {
            m28727a((Throwable) obj);
            return C10182ke.f25542a;
        }
    }

    /* renamed from: com.ogury.ed.internal.dj$c */
    static final class C9947c extends C10264mr implements C10227lj<C10182ke> {

        /* renamed from: a */
        public static final C9947c f25021a = new C9947c();

        C9947c() {
            super(0);
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ Object mo64355a() {
            return C10182ke.f25542a;
        }
    }

    /* renamed from: b */
    private final JSONObject m28722b(C9941dg dgVar) {
        C9981eb a = dgVar.mo64464a();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("campaign_id", a.mo64518g());
        jSONObject.put("advert_id", a.mo64503b());
        jSONObject.put("advertiser_id", a.mo64515f());
        jSONObject.put("ad_unit_id", a.mo64530m().mo64573a());
        jSONObject.put("url", dgVar.mo64465b());
        jSONObject.put("source", dgVar.mo64466c());
        if (dgVar.mo64467d() != null) {
            jSONObject.put("tracker_pattern", dgVar.mo64467d());
        }
        if (dgVar.mo64468e() != null) {
            jSONObject.put("tracker_url", dgVar.mo64468e());
        }
        JSONObject a2 = this.f25019c.mo64476a();
        a2.put("content", jSONObject);
        return a2;
    }
}
