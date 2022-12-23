package com.adcolony.sdk;

import android.app.Activity;
import android.content.Context;
import com.adcolony.sdk.C0826e0;

/* renamed from: com.adcolony.sdk.a */
class C0723a {

    /* renamed from: a */
    private static Context f204a = null;

    /* renamed from: b */
    private static C0866k f205b = null;

    /* renamed from: c */
    static boolean f206c = false;

    /* renamed from: d */
    static boolean f207d = false;

    /* renamed from: e */
    static boolean f208e = false;

    /* renamed from: a */
    static void m190a(AdColonyAppOptions adColonyAppOptions) {
        f208e = adColonyAppOptions.getIsChildDirectedApp() && (!adColonyAppOptions.isPrivacyFrameworkRequiredSet(AdColonyAppOptions.COPPA) || adColonyAppOptions.getPrivacyFrameworkRequired(AdColonyAppOptions.COPPA));
    }

    /* renamed from: b */
    static C0866k m193b() {
        if (!m196d()) {
            Context a = m186a();
            if (a == null) {
                return new C0866k();
            }
            f205b = new C0866k();
            f205b.mo10881a(new AdColonyAppOptions().mo10381a(C0773c0.m393h(C0773c0.m388c(a.getFilesDir().getAbsolutePath() + "/adc3/AppInfo"), "appId")), false);
        }
        return f205b;
    }

    /* renamed from: c */
    static boolean m195c() {
        return f204a != null;
    }

    /* renamed from: d */
    static boolean m196d() {
        return f205b != null;
    }

    /* renamed from: e */
    static boolean m197e() {
        return f206c;
    }

    /* renamed from: f */
    static void m198f() {
        m193b().mo10909r().mo10856j();
    }

    /* renamed from: a */
    static void m189a(Context context, AdColonyAppOptions adColonyAppOptions, boolean z) {
        m188a((!z || !(context instanceof Activity)) ? context : ((Activity) context).getApplication());
        f207d = true;
        if (f205b == null) {
            f205b = new C0866k();
            adColonyAppOptions.mo10384b(context);
            f205b.mo10881a(adColonyAppOptions, z);
        } else {
            adColonyAppOptions.mo10384b(context);
            f205b.mo10880a(adColonyAppOptions);
        }
        m190a(adColonyAppOptions);
        C0943q n = f205b.mo10905n();
        n.mo11028a(context);
        n.mo11035b(context);
        new C0826e0.C0827a().mo10746a("Configuring AdColony").mo10747a(C0826e0.f457d);
        f205b.mo10890c(false);
        f205b.mo10915x().mo11120g(false);
        f205b.mo10893d(true);
        f205b.mo10915x().mo11113c(false);
        f205b.mo10915x().mo11115d(true);
    }

    /* renamed from: b */
    static void m194b(String str, C0865j0 j0Var) {
        m193b().mo10909r().mo10846b(str, j0Var);
    }

    /* renamed from: a */
    static void m188a(Context context) {
        f204a = context;
    }

    /* renamed from: a */
    static Context m186a() {
        return f204a;
    }

    /* renamed from: a */
    static void m192a(String str, C0865j0 j0Var) {
        m193b().mo10909r().mo10845a(str, j0Var);
    }

    /* renamed from: a */
    static C0865j0 m187a(String str, C0865j0 j0Var, boolean z) {
        m193b().mo10909r().mo10845a(str, j0Var);
        return j0Var;
    }

    /* renamed from: a */
    static void m191a(String str, C0832f1 f1Var) {
        if (f1Var == null) {
            f1Var = C0773c0.m379b();
        }
        C0773c0.m376a(f1Var, "m_type", str);
        m193b().mo10909r().mo10850c(f1Var);
    }
}
