package com.bytedance.sdk.openadsdk.p170h.p171a;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.JProtect;
import com.bytedance.sdk.component.p102b.p103a.C2736e;
import com.bytedance.sdk.component.p102b.p103a.p104a.p105a.C2722f;
import com.bytedance.sdk.component.p118e.p122d.C2863b;
import com.bytedance.sdk.component.utils.C2909o;
import com.bytedance.sdk.openadsdk.core.C3457h;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.p170h.p171a.C3752b;
import com.bytedance.sdk.openadsdk.p178l.C3886o;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import com.com.bytedance.overseas.sdk.p186b.C3970a;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.h.a.b */
/* compiled from: LogStatsBase */
public class C3752b<T extends C3752b> implements C3751a {

    /* renamed from: a */
    private String f9681a;

    /* renamed from: b */
    private String f9682b;

    /* renamed from: c */
    private String f9683c;

    /* renamed from: d */
    private String f9684d = C2863b.b1659536876590dc("4/7-4+1");

    /* renamed from: e */
    private String f9685e;

    /* renamed from: f */
    private long f9686f = (System.currentTimeMillis() / 1000);

    /* renamed from: g */
    private int f9687g = 0;

    /* renamed from: h */
    private String f9688h;

    /* renamed from: i */
    private int f9689i = 0;

    /* renamed from: j */
    private String f9690j;

    /* renamed from: k */
    private String f9691k;

    /* renamed from: l */
    private String f9692l;

    /* renamed from: m */
    private String f9693m;

    /* renamed from: n */
    private String f9694n;

    /* renamed from: b */
    public static C3752b<C3752b> m12257b() {
        return new C3752b<>();
    }

    @JProtect
    /* renamed from: q */
    private JSONObject m12258q() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C2736e.e1659536876632dc("or"), 1);
            jSONObject.put(C2736e.e1659536876632dc("mnffh"), Build.MODEL);
            jSONObject.put(C2736e.e1659536876632dc("vdlgkw"), Build.MANUFACTURER);
            jSONObject.put(C2736e.e1659536876632dc("p`ahebcXfhgn"), C3898x.m12785d());
            jSONObject.put(C2736e.e1659536876632dc("u`"), C3898x.m12768b());
            jSONObject.put(C3886o.o1659536876602dc("g`kg"), C3970a.m13090a().mo20862b());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* renamed from: r */
    private T m12259r() {
        return this;
    }

    /* renamed from: a */
    public T mo20542a(int i) {
        this.f9687g = i;
        return m12259r();
    }

    /* renamed from: a */
    public T mo20543a(long j) {
        this.f9686f = j;
        return m12259r();
    }

    /* renamed from: a */
    public T mo20544a(String str) {
        this.f9681a = str;
        return m12259r();
    }

    @JProtect
    /* renamed from: a */
    public JSONObject mo20541a() {
        String e1659536876632dc;
        String f;
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(mo20548c())) {
                jSONObject.put(C2722f.f1659536876631dc("txrf"), mo20548c());
            }
            if (!TextUtils.isEmpty(mo20552e())) {
                jSONObject.put(C2722f.f1659536876631dc("rhv"), mo20552e());
            }
            if (!TextUtils.isEmpty(mo20554f())) {
                jSONObject.put(C2722f.f1659536876631dc("csgbplpbW`n"), mo20554f());
            }
            if (!TextUtils.isEmpty(mo20556g())) {
                jSONObject.put(C2722f.f1659536876631dc("ae]p`nYqm{ybcc"), mo20556g());
            }
            if (!TextUtils.isEmpty(mo20558h())) {
                e1659536876632dc = C2736e.e1659536876632dc("aqr\\r`ttafd");
                f = mo20558h();
            } else {
                e1659536876632dc = C2736e.e1659536876632dc("aqr\\r`ttafd");
                f = C3898x.m12797f();
            }
            jSONObject.put(e1659536876632dc, f);
            if (mo20559i() > 0) {
                jSONObject.put(C2736e.e1659536876632dc("thofwqgjx"), mo20559i());
            }
            if (mo20560j() > 0) {
                jSONObject.put(C2736e.e1659536876632dc("aevzt`"), mo20560j());
            }
            if (!TextUtils.isEmpty(mo20561k())) {
                jSONObject.put(C2736e.e1659536876632dc("rds\\ma"), mo20561k());
            }
            jSONObject.put(C2736e.e1659536876632dc("esplvZehll"), mo20562l());
            if (!TextUtils.isEmpty(mo20563m())) {
                jSONObject.put(C2736e.e1659536876632dc("esplvZkto"), mo20563m());
            }
            if (!TextUtils.isEmpty(mo20564n())) {
                jSONObject.put(C2736e.e1659536876632dc("eyvqe"), mo20564n());
            }
            if (!TextUtils.isEmpty(mo20565o())) {
                jSONObject.put(C2736e.e1659536876632dc("ilcdaZsud"), mo20565o());
            }
            if (!TextUtils.isEmpty(mo20550d())) {
                jSONObject.put(C2736e.e1659536876632dc("ewgmpZc|{k"), mo20550d());
            }
            if (!TextUtils.isEmpty(mo20566p())) {
                jSONObject.put(C2736e.e1659536876632dc("dtpbplii"), mo20566p());
            }
            if (!TextUtils.isEmpty(C3457h.m10580d().mo19764f())) {
                jSONObject.put(C2736e.e1659536876632dc("aqrj`"), C3457h.m10580d().mo19764f());
            }
            jSONObject.put(C2736e.e1659536876632dc("cnlm[qwm"), C2909o.m8135b(C3513m.m10963a()));
            jSONObject.put(C2736e.e1659536876632dc("ddtjg`Ynfoe"), m12258q());
        } catch (Throwable th) {
            th.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: b */
    public T mo20545b(int i) {
        this.f9689i = i;
        return m12259r();
    }

    /* renamed from: b */
    public T mo20546b(String str) {
        this.f9693m = str;
        return m12259r();
    }

    /* renamed from: c */
    public T mo20547c(String str) {
        this.f9682b = str;
        return m12259r();
    }

    /* renamed from: c */
    public String mo20548c() {
        return this.f9681a;
    }

    /* renamed from: d */
    public T mo20549d(String str) {
        this.f9683c = str;
        return m12259r();
    }

    /* renamed from: d */
    public String mo20550d() {
        return this.f9693m;
    }

    /* renamed from: e */
    public T mo20551e(String str) {
        this.f9688h = str;
        return m12259r();
    }

    /* renamed from: e */
    public String mo20552e() {
        return this.f9682b;
    }

    /* renamed from: f */
    public T mo20553f(String str) {
        this.f9690j = str;
        return m12259r();
    }

    /* renamed from: f */
    public String mo20554f() {
        return this.f9683c;
    }

    /* renamed from: g */
    public T mo20555g(String str) {
        this.f9691k = str;
        return m12259r();
    }

    /* renamed from: g */
    public String mo20556g() {
        return this.f9684d;
    }

    /* renamed from: h */
    public T mo20557h(String str) {
        this.f9694n = str;
        return m12259r();
    }

    /* renamed from: h */
    public String mo20558h() {
        return this.f9685e;
    }

    /* renamed from: i */
    public long mo20559i() {
        long j = this.f9686f;
        while (true) {
            char c = ']';
            char c2 = ']';
            while (true) {
                switch (c) {
                    case '\\':
                        switch (c2) {
                            case 21:
                                break;
                            case 22:
                            case 23:
                                break;
                        }
                    case ']':
                        break;
                    case '^':
                        if (c2 > 4) {
                            break;
                        } else {
                            continue;
                        }
                }
                while (true) {
                    switch (c2) {
                        case '[':
                        case ']':
                            break;
                        case '\\':
                            break;
                        default:
                            c2 = '[';
                    }
                }
                c = '^';
                c2 = 'K';
            }
        }
        return j;
    }

    /* renamed from: j */
    public int mo20560j() {
        int i = this.f9687g;
        while (true) {
            char c = ']';
            char c2 = ']';
            while (true) {
                switch (c) {
                    case '\\':
                        switch (c2) {
                            case 21:
                                break;
                            case 22:
                            case 23:
                                break;
                        }
                    case ']':
                        break;
                    case '^':
                        if (c2 > 4) {
                            break;
                        } else {
                            continue;
                        }
                }
                while (true) {
                    switch (c2) {
                        case '[':
                        case ']':
                            break;
                        case '\\':
                            break;
                        default:
                            c2 = '[';
                    }
                }
                c = '^';
                c2 = 'K';
            }
        }
        return i;
    }

    /* renamed from: k */
    public String mo20561k() {
        return this.f9688h;
    }

    /* renamed from: l */
    public int mo20562l() {
        int i = this.f9689i;
        while (true) {
            char c = ']';
            char c2 = ']';
            while (true) {
                switch (c) {
                    case '\\':
                        switch (c2) {
                            case 21:
                                break;
                            case 22:
                            case 23:
                                break;
                        }
                    case ']':
                        break;
                    case '^':
                        if (c2 > 4) {
                            break;
                        } else {
                            continue;
                        }
                }
                while (true) {
                    switch (c2) {
                        case '[':
                        case ']':
                            break;
                        case '\\':
                            break;
                        default:
                            c2 = '[';
                    }
                }
                c = '^';
                c2 = 'K';
            }
        }
        return i;
    }

    /* renamed from: m */
    public String mo20563m() {
        return this.f9690j;
    }

    /* renamed from: n */
    public String mo20564n() {
        return this.f9691k;
    }

    /* renamed from: o */
    public String mo20565o() {
        return this.f9692l;
    }

    /* renamed from: p */
    public String mo20566p() {
        return this.f9694n;
    }
}
