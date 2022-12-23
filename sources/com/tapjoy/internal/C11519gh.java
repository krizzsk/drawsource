package com.tapjoy.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.tapjoy.TapjoyConstants;
import com.tapjoy.TapjoyUtil;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tapjoy.internal.gh */
public final class C11519gh {

    /* renamed from: d */
    private static final C11519gh f27657d;

    /* renamed from: e */
    private static C11519gh f27658e;

    /* renamed from: a */
    public String f27659a = null;

    /* renamed from: b */
    public String f27660b = null;

    /* renamed from: c */
    public boolean f27661c = false;

    /* renamed from: f */
    private Boolean f27662f = null;

    /* renamed from: g */
    private Boolean f27663g = null;

    /* renamed from: h */
    private Context f27664h;

    static {
        C11519gh ghVar = new C11519gh();
        f27657d = ghVar;
        f27658e = ghVar;
    }

    /* renamed from: a */
    public static C11519gh m31513a() {
        return f27658e;
    }

    /* renamed from: a */
    public final synchronized void mo70053a(Context context) {
        if (context != null) {
            if (this.f27664h == null) {
                this.f27664h = context;
            }
        }
        C11519gh ghVar = f27658e;
        if (ghVar.f27664h != null) {
            SharedPreferences sharedPreferences = ghVar.f27664h.getSharedPreferences(TapjoyConstants.TJC_PREFERENCE, 0);
            if (ghVar.f27662f == null && sharedPreferences.contains("gdpr")) {
                ghVar.f27662f = Boolean.valueOf(sharedPreferences.getBoolean("gdpr", false));
            }
            if (ghVar.f27659a == null) {
                ghVar.f27659a = sharedPreferences.getString("cgdpr", "");
            }
            if (ghVar.f27663g == null && sharedPreferences.contains("below_consent_age")) {
                ghVar.f27663g = Boolean.valueOf(sharedPreferences.getBoolean("below_consent_age", false));
            }
            if (ghVar.f27660b == null) {
                ghVar.f27660b = sharedPreferences.getString("us_privacy", "");
            }
        }
        if (this.f27661c) {
            this.f27661c = false;
            C11519gh ghVar2 = f27658e;
            if (ghVar2.f27664h != null) {
                if (ghVar2.f27662f != null) {
                    ghVar2.m31514d();
                }
                if (ghVar2.f27659a != null) {
                    ghVar2.m31515e();
                }
                if (ghVar2.f27663g != null) {
                    ghVar2.m31516f();
                }
                if (ghVar2.f27660b != null) {
                    ghVar2.mo70058c();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo70055a(boolean z) {
        this.f27662f = Boolean.valueOf(z);
        if (!m31514d()) {
            this.f27661c = true;
        }
    }

    /* renamed from: a */
    public final void mo70054a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f27659a = str;
            if (!m31515e()) {
                this.f27661c = true;
            }
        }
    }

    /* renamed from: d */
    private boolean m31514d() {
        Context context = this.f27664h;
        if (context == null) {
            return false;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences(TapjoyConstants.TJC_PREFERENCE, 0).edit();
        edit.putBoolean("gdpr", this.f27662f.booleanValue());
        edit.apply();
        return true;
    }

    /* renamed from: e */
    private boolean m31515e() {
        Context context = this.f27664h;
        if (context == null) {
            return false;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences(TapjoyConstants.TJC_PREFERENCE, 0).edit();
        edit.putString("cgdpr", this.f27659a);
        edit.apply();
        return true;
    }

    /* renamed from: b */
    public final Map<String, String> mo70056b() {
        String str;
        HashMap hashMap = new HashMap();
        Boolean bool = this.f27662f;
        String str2 = "1";
        if (bool != null) {
            if (bool.booleanValue()) {
                str = str2;
            } else {
                str = "0";
            }
            TapjoyUtil.safePut(hashMap, "gdpr", str, true);
        }
        if (!TextUtils.isEmpty(this.f27659a)) {
            TapjoyUtil.safePut(hashMap, "cgdpr", this.f27659a, true);
        }
        Boolean bool2 = this.f27663g;
        if (bool2 != null) {
            if (!bool2.booleanValue()) {
                str2 = "0";
            }
            TapjoyUtil.safePut(hashMap, "below_consent_age", str2, true);
        }
        if (!TextUtils.isEmpty(this.f27660b)) {
            TapjoyUtil.safePut(hashMap, "us_privacy", this.f27660b, true);
        }
        return hashMap;
    }

    /* renamed from: b */
    public final void mo70057b(boolean z) {
        this.f27663g = Boolean.valueOf(z);
        if (!m31516f()) {
            this.f27661c = true;
        }
    }

    /* renamed from: f */
    private boolean m31516f() {
        Context context = this.f27664h;
        if (context == null) {
            return false;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences(TapjoyConstants.TJC_PREFERENCE, 0).edit();
        edit.putBoolean("below_consent_age", this.f27663g.booleanValue());
        edit.apply();
        return true;
    }

    /* renamed from: c */
    public final boolean mo70058c() {
        Context context = this.f27664h;
        if (context == null) {
            return false;
        }
        SharedPreferences.Editor edit = context.getSharedPreferences(TapjoyConstants.TJC_PREFERENCE, 0).edit();
        edit.putString("us_privacy", this.f27660b);
        edit.apply();
        return true;
    }
}
