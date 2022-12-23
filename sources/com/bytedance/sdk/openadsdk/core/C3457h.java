package com.bytedance.sdk.openadsdk.core;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.bykv.p054vk.openvk.component.video.api.p074f.C2413a;
import com.bytedance.sdk.component.utils.C2892d;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.core.bannerexpress.C3378a;
import com.bytedance.sdk.openadsdk.core.video.p161b.C3605c;
import com.bytedance.sdk.openadsdk.dislike.TTDislikeListView;
import com.bytedance.sdk.openadsdk.multipro.C3948b;
import com.bytedance.sdk.openadsdk.multipro.p184d.C3961a;
import com.bytedance.sdk.openadsdk.p178l.C3851a;
import com.bytedance.sdk.openadsdk.p178l.C3876g;
import com.bytedance.sdk.openadsdk.p178l.C3895u;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.h */
/* compiled from: GlobalInfo */
public class C3457h {

    /* renamed from: a */
    public static TTAdSdk.InitCallback f8515a;

    /* renamed from: b */
    public static final Set<String> f8516b = new HashSet<String>() {
        {
            add("8025677");
            add("5001121");
        }
    };

    /* renamed from: c */
    private String f8517c;

    /* renamed from: d */
    private String f8518d;

    /* renamed from: e */
    private int f8519e;

    /* renamed from: f */
    private boolean f8520f;

    /* renamed from: g */
    private String f8521g;

    /* renamed from: h */
    private String f8522h;

    /* renamed from: i */
    private AtomicBoolean f8523i;

    /* renamed from: j */
    private int f8524j;

    /* renamed from: k */
    private boolean f8525k;

    /* renamed from: l */
    private final Set<Integer> f8526l;

    /* renamed from: m */
    private boolean f8527m;

    /* renamed from: n */
    private Bitmap f8528n;

    /* renamed from: o */
    private C3851a f8529o;

    /* renamed from: p */
    private String[] f8530p;

    /* renamed from: q */
    private int f8531q;

    /* renamed from: r */
    private int f8532r;

    /* renamed from: s */
    private boolean f8533s;

    /* renamed from: t */
    private String f8534t;

    /* renamed from: u */
    private C3605c f8535u;

    /* renamed from: v */
    private volatile ConcurrentHashMap<String, C3378a.C3385a> f8536v;

    /* renamed from: com.bytedance.sdk.openadsdk.core.h$a */
    /* compiled from: GlobalInfo */
    private static class C3459a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static C3457h f8537a = new C3457h();
    }

    /* renamed from: a */
    public static void m10578a(TTAdSdk.InitCallback initCallback) {
        f8515a = initCallback;
    }

    /* renamed from: a */
    public boolean mo19748a() {
        return this.f8529o.mo20712a();
    }

    /* renamed from: b */
    public boolean mo19752b() {
        return this.f8533s;
    }

    /* renamed from: c */
    public C3851a mo19753c() {
        return this.f8529o;
    }

    private C3457h() {
        this.f8523i = new AtomicBoolean(false);
        this.f8524j = 0;
        this.f8525k = true;
        this.f8526l = Collections.synchronizedSet(new HashSet());
        this.f8527m = false;
        this.f8528n = null;
        this.f8529o = new C3851a();
        this.f8531q = 0;
        this.f8532r = 0;
        this.f8533s = false;
        this.f8536v = null;
        try {
            C2413a.m5820a(C3513m.m10963a());
            this.f8526l.add(4);
            Context a = C3513m.m10963a();
            if (a instanceof Application) {
                ((Application) a).registerActivityLifecycleCallbacks(this.f8529o);
            } else if (a != null && a.getApplicationContext() != null) {
                ((Application) a.getApplicationContext()).registerActivityLifecycleCallbacks(this.f8529o);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: d */
    public static C3457h m10580d() {
        return C3459a.f8537a;
    }

    /* renamed from: e */
    public boolean mo19763e() {
        if (C3948b.m12959c()) {
            return C3961a.m13032a("sp_global_info", "sdk_activate_init", true);
        }
        return C3895u.m12724a((String) null, C3513m.m10963a()).mo20761b("sdk_activate_init", true);
    }

    /* renamed from: a */
    public void mo19746a(boolean z) {
        this.f8533s = z;
    }

    /* renamed from: b */
    public void mo19751b(boolean z) {
        if (C3948b.m12959c()) {
            C3961a.m13025a("sp_global_info", "sdk_activate_init", Boolean.valueOf(z));
        }
        C3895u.m12724a((String) null, C3513m.m10963a()).mo20754a("sdk_activate_init", z);
    }

    /* renamed from: f */
    public String mo19764f() {
        if (C3948b.m12959c()) {
            return C3961a.m13035b("sp_global_info", "app_id", (String) null);
        }
        return this.f8517c;
    }

    /* renamed from: a */
    public void mo19744a(String str) {
        m10581g(str);
        if (C3948b.m12959c()) {
            C3961a.m13029a("sp_global_info", "app_id", str);
        }
        this.f8517c = str;
    }

    /* renamed from: g */
    public String mo19767g() {
        if (C3948b.m12959c()) {
            return C3961a.m13035b("sp_global_info", "name", (String) null);
        }
        return this.f8518d;
    }

    /* renamed from: b */
    public void mo19750b(String str) {
        m10582h(str);
        if (C3948b.m12959c()) {
            C3961a.m13029a("sp_global_info", "name", str);
        }
        this.f8518d = str;
    }

    /* renamed from: a */
    public void mo19743a(int i) {
        if (C3948b.m12959c()) {
            C3961a.m13027a("sp_global_info", "icon_id", Integer.valueOf(i));
        }
        this.f8519e = i;
    }

    /* renamed from: h */
    public int mo19768h() {
        if (C3948b.m12959c()) {
            return C3961a.m13020a("sp_global_info", "icon_id", 0);
        }
        return this.f8519e;
    }

    /* renamed from: b */
    public void mo19749b(int i) {
        if (i == 0 || i == 1 || i == -1) {
            if (C3948b.m12959c()) {
                C3961a.m13027a("sp_global_info", "sdk_coppa", Integer.valueOf(i));
            } else {
                C3895u.m12724a((String) null, C3513m.m10963a()).mo20750a("sdk_coppa", i);
            }
            this.f8531q = i;
        }
    }

    /* renamed from: i */
    public int mo19769i() {
        if (C3948b.m12959c()) {
            return C3961a.m13020a("sp_global_info", "sdk_coppa", -1);
        }
        int b = C3895u.m12724a((String) null, C3513m.m10963a()).mo20757b("sdk_coppa", -1);
        this.f8531q = b;
        return b;
    }

    /* renamed from: j */
    public int mo19770j() {
        if (C3948b.m12959c()) {
            return C3961a.m13020a("sp_global_info", "tt_gdpr", -1);
        }
        return C3895u.m12724a((String) null, C3513m.m10963a()).mo20757b("tt_gdpr", -1);
    }

    /* renamed from: c */
    public void mo19754c(int i) {
        if (i != 0 && i != 1 && i != -1) {
            return;
        }
        if (C3948b.m12959c()) {
            C3961a.m13027a("sp_global_info", "tt_gdpr", Integer.valueOf(i));
        } else {
            C3895u.m12724a((String) null, C3513m.m10963a()).mo20750a("tt_gdpr", i);
        }
    }

    /* renamed from: d */
    public void mo19757d(int i) {
        if (!(i == 0 || i == 1)) {
            i = -99;
        }
        if (C3948b.m12959c()) {
            C3961a.m13027a("sp_global_info", "global_coppa", Integer.valueOf(i));
        } else {
            C3895u.m12724a((String) null, C3513m.m10963a()).mo20750a("global_coppa", i);
        }
        this.f8532r = i;
    }

    /* renamed from: k */
    public int mo19771k() {
        if (C3948b.m12959c()) {
            this.f8532r = C3961a.m13020a("sp_global_info", "global_coppa", -99);
        } else {
            this.f8532r = C3895u.m12724a((String) null, C3513m.m10963a()).mo20757b("global_coppa", -99);
        }
        if (this.f8532r == -99) {
            this.f8532r = mo19769i();
        }
        return this.f8532r;
    }

    /* renamed from: l */
    public boolean mo19772l() {
        if (C3948b.m12959c()) {
            return C3961a.m13032a("sp_global_info", "is_paid", false);
        }
        return this.f8520f;
    }

    /* renamed from: c */
    public void mo19756c(boolean z) {
        if (C3948b.m12959c()) {
            C3961a.m13025a("sp_global_info", "is_paid", Boolean.valueOf(z));
        }
        this.f8520f = z;
    }

    /* renamed from: m */
    public String mo19773m() {
        if (C3948b.m12959c()) {
            return C3961a.m13035b("sp_global_info", "keywords", (String) null);
        }
        return this.f8521g;
    }

    /* renamed from: c */
    public void mo19755c(String str) {
        m10583i(str);
        if (C3948b.m12959c()) {
            C3961a.m13029a("sp_global_info", "keywords", str);
        }
        this.f8521g = str;
    }

    /* renamed from: n */
    public String mo19774n() {
        if (C3948b.m12959c()) {
            return C3961a.m13035b("sp_global_info", "extra_data", (String) null);
        }
        return this.f8522h;
    }

    /* renamed from: d */
    public void mo19758d(String str) {
        m10584j(str);
        if (C3948b.m12959c()) {
            C3961a.m13029a("sp_global_info", "extra_data", str);
        }
        this.f8522h = str;
    }

    /* renamed from: e */
    public void mo19761e(int i) {
        if (C3948b.m12959c()) {
            C3961a.m13027a("sp_global_info", "title_bar_theme", Integer.valueOf(i));
        }
        this.f8524j = i;
    }

    /* renamed from: o */
    public int mo19775o() {
        if (C3948b.m12959c()) {
            return C3961a.m13020a("sp_global_info", "title_bar_theme", 0);
        }
        return this.f8524j;
    }

    /* renamed from: d */
    public void mo19759d(boolean z) {
        if (C3948b.m12959c()) {
            C3961a.m13025a("sp_global_info", "allow_show_notify", Boolean.valueOf(z));
        }
        this.f8525k = z;
    }

    /* renamed from: g */
    private static void m10581g(String str) {
        TTAdSdk.InitCallback initCallback;
        if (TextUtils.isEmpty(str) && (initCallback = f8515a) != null) {
            initCallback.fail(TTAdSdk.INIT_LOCAL_FAIL_CODE, "appid cannot be empty");
        }
        C2905l.m8118e("GlobalInfo", "appid cannot be empty");
    }

    /* renamed from: h */
    private static void m10582h(String str) {
        TTAdSdk.InitCallback initCallback;
        if (TextUtils.isEmpty(str) && (initCallback = f8515a) != null) {
            initCallback.fail(TTAdSdk.INIT_LOCAL_FAIL_CODE, "name cannot be empty");
        }
        C2905l.m8118e("GlobalInfo", "name cannot be empty");
    }

    /* renamed from: i */
    private static void m10583i(String str) {
        if (!TextUtils.isEmpty(str) && str.length() > 1000) {
            TTAdSdk.InitCallback initCallback = f8515a;
            if (initCallback != null) {
                initCallback.fail(TTAdSdk.INIT_LOCAL_FAIL_CODE, "keyword is super long, the longest is 1000");
            }
            C2905l.m8118e("GlobalInfo", "keyword is super long, the longest is 1000");
        }
    }

    /* renamed from: j */
    private static void m10584j(String str) {
        if (!TextUtils.isEmpty(str) && str.length() > 1000) {
            TTAdSdk.InitCallback initCallback = f8515a;
            if (initCallback != null) {
                initCallback.fail(TTAdSdk.INIT_LOCAL_FAIL_CODE, "Data is very long, the longest is 1000");
            }
            C2905l.m8118e("GlobalInfo", "Data is very long, the longest is 1000");
        }
    }

    /* renamed from: p */
    public C3605c mo19776p() {
        if (this.f8535u == null) {
            this.f8535u = new C3605c(10, 8);
        }
        return this.f8535u;
    }

    /* renamed from: q */
    public boolean mo19777q() {
        if (C3948b.m12959c()) {
            return C3961a.m13032a("sp_global_info", "is_use_texture", false);
        }
        return this.f8527m;
    }

    /* renamed from: e */
    public void mo19762e(boolean z) {
        if (C3948b.m12959c()) {
            C3961a.m13025a("sp_global_info", "is_use_texture", Boolean.valueOf(z));
        }
        this.f8527m = z;
    }

    /* renamed from: r */
    public Bitmap mo19778r() {
        if (C3948b.m12959c()) {
            return C2892d.m8074a(C3961a.m13035b("sp_global_info", "pause_icon", (String) null));
        }
        return this.f8528n;
    }

    /* renamed from: a */
    public void mo19747a(String[] strArr) {
        if (C3948b.m12959c() && strArr != null && strArr.length > 0) {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            for (String str : strArr) {
                if (!TextUtils.isEmpty(str)) {
                    int i2 = i + 1;
                    if (i > 0) {
                        sb.append(",");
                    }
                    sb.append(str);
                    i = i2;
                }
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2)) {
                C3961a.m13029a("sp_global_info", "need_clear_task_reset", sb2);
            }
        }
        this.f8530p = strArr;
    }

    /* renamed from: s */
    public boolean mo19779s() {
        return f8516b.contains(this.f8517c);
    }

    /* renamed from: t */
    public boolean mo19780t() {
        return "com.union_test.internationad".equals(C3898x.m12785d());
    }

    /* renamed from: u */
    public String mo19781u() {
        if (!TextUtils.isEmpty(this.f8534t)) {
            return this.f8534t;
        }
        String a = C3876g.m12651a();
        this.f8534t = a;
        if (!TextUtils.isEmpty(a)) {
            return this.f8534t;
        }
        String valueOf = String.valueOf(System.currentTimeMillis());
        C3876g.m12652a(valueOf);
        this.f8534t = valueOf;
        return valueOf;
    }

    /* renamed from: k */
    private static JSONObject m10585k(String str) {
        String str2;
        if (C3948b.m12959c()) {
            str2 = C3961a.m13035b("sp_global_info", str, (String) null);
        } else {
            str2 = C3895u.m12724a((String) null, C3513m.m10963a()).mo20759b(str, (String) null);
        }
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        try {
            return new JSONObject(str2);
        } catch (JSONException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public static void m10579a(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("value", str2);
                jSONObject.put("time", System.currentTimeMillis());
                if (C3948b.m12959c()) {
                    C3961a.m13029a("sp_global_info", str, jSONObject.toString());
                } else {
                    C3895u.m12724a((String) null, C3513m.m10963a()).mo20752a(str, jSONObject.toString());
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static String m10577a(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject k = m10585k(str);
            if (k == null) {
                return null;
            }
            if (System.currentTimeMillis() - k.getLong("time") <= j) {
                return k.getString("value");
            }
            return null;
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: v */
    public int mo19782v() {
        if (C3948b.m12959c()) {
            return C3961a.m13020a("sp_global_info", "global_ccpa", -1);
        }
        return C3895u.m12724a((String) null, C3513m.m10963a()).mo20757b("global_ccpa", -1);
    }

    /* renamed from: f */
    public void mo19765f(int i) {
        if (i != 0 && i != 1 && i != -1) {
            return;
        }
        if (C3948b.m12959c()) {
            C3961a.m13027a("sp_global_info", "global_ccpa", Integer.valueOf(i));
        } else {
            C3895u.m12724a((String) null, C3513m.m10963a()).mo20750a("global_ccpa", i);
        }
    }

    /* renamed from: e */
    public C3378a.C3385a mo19760e(String str) {
        if (this.f8536v == null || str == null) {
            return null;
        }
        return this.f8536v.get(str);
    }

    /* renamed from: a */
    public void mo19745a(String str, C3378a.C3385a aVar) {
        if (!TextUtils.isEmpty(str) && aVar != null) {
            if (C3948b.m12959c()) {
                TTDislikeListView.m12148a(6, str, aVar);
                return;
            }
            if (this.f8536v == null) {
                synchronized (C3457h.class) {
                    if (this.f8536v == null) {
                        this.f8536v = new ConcurrentHashMap<>();
                    }
                }
            }
            this.f8536v.put(str, aVar);
        }
    }

    /* renamed from: f */
    public void mo19766f(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (C3948b.m12959c()) {
            TTDislikeListView.m12147a(6, str);
        } else if (this.f8536v != null) {
            this.f8536v.remove(str);
        }
    }

    /* renamed from: w */
    public void mo19783w() {
        if (this.f8536v != null && this.f8536v.size() == 0) {
            this.f8536v = null;
        }
    }
}
