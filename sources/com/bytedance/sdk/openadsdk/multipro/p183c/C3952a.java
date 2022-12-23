package com.bytedance.sdk.openadsdk.multipro.p183c;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.component.utils.C2909o;
import com.bytedance.sdk.openadsdk.IListenerManager;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.C3516n;
import com.bytedance.sdk.openadsdk.multipro.C3908a;
import com.bytedance.sdk.openadsdk.multipro.C3951c;
import com.bytedance.sdk.openadsdk.multipro.C3964e;
import com.bytedance.sdk.openadsdk.multipro.p179a.C3909a;
import com.bytedance.sdk.openadsdk.p128b.C3060a;
import com.bytedance.sdk.openadsdk.p128b.C3086c;
import com.bytedance.sdk.openadsdk.p128b.C3093f;
import com.bytedance.sdk.openadsdk.p128b.C3094g;
import com.bytedance.sdk.openadsdk.p128b.C3095h;
import com.bytedance.sdk.openadsdk.p128b.C3114q;
import com.bytedance.sdk.openadsdk.p128b.C3116s;
import com.bytedance.sdk.openadsdk.p128b.C3117t;
import com.bytedance.sdk.openadsdk.p170h.C3750a;
import com.bytedance.sdk.openadsdk.p170h.p171a.C3751a;
import com.bytedance.sdk.openadsdk.p170h.p173c.C3775c;
import com.bytedance.sdk.openadsdk.p177k.C3840a;
import com.bytedance.sdk.openadsdk.p177k.C3841b;
import com.bytedance.sdk.openadsdk.p177k.C3850h;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.c.a */
/* compiled from: AdEventProviderImpl */
public class C3952a implements C3908a {
    /* renamed from: a */
    public int mo20772a(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    /* renamed from: a */
    public int mo20773a(Uri uri, String str, String[] strArr) {
        return 0;
    }

    /* renamed from: a */
    public Cursor mo20774a(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    /* renamed from: a */
    public Uri mo20775a(Uri uri, ContentValues contentValues) {
        return null;
    }

    /* renamed from: a */
    public String mo20776a() {
        return "t_event_ad_event";
    }

    /* renamed from: b */
    public void mo20778b() {
    }

    /* renamed from: f */
    private static IListenerManager m12980f() {
        try {
            if (C3513m.m10963a() != null) {
                return C3909a.m12908a(C3513m.m10963a());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static void m12977c() {
        if (C3513m.m10963a() != null) {
            try {
                IListenerManager f = m12980f();
                if (f != null) {
                    f.getType(Uri.parse(m12981g() + "adEventStart"));
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m12975a(boolean z) {
        if (C3513m.m10963a() != null) {
            try {
                IListenerManager f = m12980f();
                if (f != null) {
                    f.getType(Uri.parse(m12981g() + "logStatusStart" + ("?isRealTime=" + String.valueOf(z))));
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m12972a(String str) {
        if (!TextUtils.isEmpty(str)) {
            C2905l.m8111b("AdEventProviderImpl", "dispatch event");
            try {
                IListenerManager f = m12980f();
                if (f != null) {
                    String a = C3951c.m12970a(str);
                    f.getType(Uri.parse(m12981g() + "adEventDispatch" + "?event=" + a));
                }
            } catch (Throwable th) {
                C2905l.m8118e("AdEventProviderImpl", "dispatch event Throwable:" + th.toString());
            }
        }
    }

    /* renamed from: a */
    public static void m12974a(List<String> list) {
        if (list != null && !list.isEmpty()) {
            try {
                StringBuilder sb = new StringBuilder();
                for (String a : list) {
                    sb.append(C3951c.m12970a(a));
                    sb.append(",");
                }
                String a2 = C3951c.m12970a(sb.toString());
                String str = "?track=" + String.valueOf(a2);
                IListenerManager f = m12980f();
                if (f != null) {
                    f.getType(Uri.parse(m12981g() + "trackUrl" + str));
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: d */
    public static void m12978d() {
        try {
            IListenerManager f = m12980f();
            if (f != null) {
                f.getType(Uri.parse(m12981g() + "trackFailed"));
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: e */
    public static void m12979e() {
        try {
            IListenerManager f = m12980f();
            if (f != null) {
                f.getType(Uri.parse(m12981g() + "logStatusInit"));
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static void m12976b(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                IListenerManager f = m12980f();
                if (f != null) {
                    String a = C3951c.m12970a(str);
                    f.getType(Uri.parse(m12981g() + "logStatusUpload" + "?event=" + a));
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m12973a(String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            try {
                IListenerManager f = m12980f();
                if (f != null) {
                    f.getType(Uri.parse(m12981g() + "logStatusDispatch" + ("?event=" + C3951c.m12970a(str) + "&isRealTime=" + String.valueOf(z))));
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: g */
    private static String m12981g() {
        return C3964e.f10075b + "/" + "t_event_ad_event" + "/";
    }

    /* renamed from: a */
    public String mo20777a(Uri uri) {
        String str = uri.getPath().split("/")[2];
        if ("adEventStart".equals(str)) {
            C2905l.m8111b("AdEventProviderImpl", "====ad event function will be start====");
            C3955b.m12993a().mo18653a();
        } else if ("logStatusStart".equals(str)) {
            C2905l.m8111b("AdEventProviderImpl", "====log stats function will be start====");
            if (Boolean.valueOf(uri.getQueryParameter("isRealTime")).booleanValue()) {
                C3955b.m12996c().mo18653a();
            } else {
                C3955b.m12995b().mo18653a();
            }
        } else if ("adEventDispatch".equals(str)) {
            C2905l.m8111b("AdEventProviderImpl", "dispatch FUN_AD_EVENT_DISPATCH");
            C3060a a = C3060a.m8730a(C3951c.m12971b(uri.getQueryParameter("event")));
            if (a != null) {
                C3955b.m12993a().mo18654a(a);
            }
        } else if ("logStatusDispatch".equals(str)) {
            Boolean valueOf = Boolean.valueOf(uri.getQueryParameter("isRealTime"));
            C3775c.C3778a a2 = C3775c.C3778a.m12339a(C3951c.m12971b(uri.getQueryParameter("event")));
            if (a2 == null) {
                return null;
            }
            if (valueOf.booleanValue()) {
                C3955b.m12996c().mo18654a(a2);
            } else {
                C3955b.m12995b().mo18654a(a2);
            }
        } else if ("trackUrl".equals(str)) {
            try {
                String[] split = C3951c.m12971b(uri.getQueryParameter("track")).split(",");
                if (split.length > 0) {
                    ArrayList arrayList = new ArrayList();
                    for (String b : split) {
                        String b2 = C3951c.m12971b(b);
                        if (!TextUtils.isEmpty(b2)) {
                            arrayList.add(b2);
                        }
                    }
                    C3958d.m13000a().mo20695a(arrayList);
                }
            } catch (Throwable unused) {
            }
        } else if ("trackFailed".equals(str)) {
            C3958d.m13000a().mo20694a();
            C2905l.m8111b("AdEventProviderImpl", "track failed: ");
        } else if ("logStatusInit".equals(str)) {
            C3957c.m12999a().mo20585a();
        } else if ("logStatusUpload".equals(str)) {
            final String b3 = C3951c.m12971b(uri.getQueryParameter("event"));
            if (!TextUtils.isEmpty(b3)) {
                C3957c.m12999a().mo20586a((C3750a) new C3750a() {
                    /* renamed from: a */
                    public C3751a mo18582a() throws Exception {
                        return C3954a.m12991b(b3);
                    }
                });
            }
        }
        return null;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.multipro.c.a$b */
    /* compiled from: AdEventProviderImpl */
    private static class C3955b {

        /* renamed from: a */
        private static volatile C3086c<C3060a> f10066a;

        /* renamed from: b */
        private static volatile C3086c<C3775c.C3778a> f10067b;

        /* renamed from: c */
        private static volatile C3086c<C3775c.C3778a> f10068c;

        /* renamed from: a */
        static C3086c<C3060a> m12993a() {
            if (f10066a == null) {
                synchronized (C3513m.class) {
                    if (f10066a == null) {
                        f10066a = new C3086c<>(new C3094g(C3513m.m10963a()), C3513m.m10971f(), C3095h.C3098c.m8985a(), m12997d());
                    }
                }
            }
            return f10066a;
        }

        /* renamed from: b */
        public static C3086c<C3775c.C3778a> m12995b() {
            if (f10068c == null) {
                synchronized (C3513m.class) {
                    if (f10068c == null) {
                        f10068c = m12994a("ttad_bk_batch_stats", "AdStatsEventBatchThread", false);
                    }
                }
            }
            return f10068c;
        }

        /* renamed from: c */
        public static C3086c<C3775c.C3778a> m12996c() {
            if (f10067b == null) {
                synchronized (C3513m.class) {
                    if (f10067b == null) {
                        f10067b = m12994a("ttad_bk_stats", "AdStatsEventThread", true);
                    }
                }
            }
            return f10067b;
        }

        /* renamed from: a */
        public static C3086c<C3775c.C3778a> m12994a(String str, String str2, boolean z) {
            C3093f fVar;
            C3095h.C3098c cVar;
            if (z) {
                fVar = new C3116s(C3513m.m10963a());
                cVar = C3095h.C3098c.m8985a();
            } else {
                cVar = C3095h.C3098c.m8986b();
                fVar = new C3114q(C3513m.m10963a());
            }
            C3095h.C3097b d = m12997d();
            return new C3086c(fVar, (C3516n) null, cVar, d, new C3117t(str, str2, fVar, (C3516n) null, cVar, d));
        }

        /* renamed from: d */
        private static C3095h.C3097b m12997d() {
            return new C3095h.C3097b() {
                /* renamed from: a */
                public boolean mo18678a() {
                    return C2909o.m8133a(C3513m.m10963a());
                }
            };
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.multipro.c.a$d */
    /* compiled from: AdEventProviderImpl */
    private static class C3958d {

        /* renamed from: a */
        private static volatile C3840a f10070a;

        /* renamed from: a */
        public static C3840a m13000a() {
            if (f10070a == null) {
                synchronized (C3840a.class) {
                    if (f10070a == null) {
                        f10070a = new C3841b(C3513m.m10963a(), new C3850h(C3513m.m10963a()));
                    }
                }
            }
            return f10070a;
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.multipro.c.a$c */
    /* compiled from: AdEventProviderImpl */
    private static class C3957c {

        /* renamed from: a */
        private static volatile C3775c f10069a;

        /* renamed from: a */
        public static C3775c m12999a() {
            if (f10069a == null) {
                synchronized (C3775c.class) {
                    if (f10069a == null) {
                        f10069a = new C3775c();
                    }
                }
            }
            return f10069a;
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.multipro.c.a$a */
    /* compiled from: AdEventProviderImpl */
    private static class C3954a implements C3751a {

        /* renamed from: a */
        JSONObject f10065a;

        /* access modifiers changed from: private */
        /* renamed from: b */
        public static C3954a m12991b(String str) {
            return new C3954a(str);
        }

        private C3954a(String str) {
            try {
                this.f10065a = new JSONObject(str);
            } catch (Throwable unused) {
            }
        }

        /* renamed from: a */
        public JSONObject mo20541a() {
            return this.f10065a;
        }
    }
}
