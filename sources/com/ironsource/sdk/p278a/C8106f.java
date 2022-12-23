package com.ironsource.sdk.p278a;

import com.ogury.p377ed.OguryAdFormatErrorCode;

/* renamed from: com.ironsource.sdk.a.f */
public final class C8106f {

    /* renamed from: a */
    public static C8107a f19622a = new C8107a(2001, m23178a("initsdk"));

    /* renamed from: b */
    public static C8107a f19623b = new C8107a(2002, m23178a("createcontrollerweb"));

    /* renamed from: c */
    public static C8107a f19624c = new C8107a(2003, m23178a("createcontrollernative"));

    /* renamed from: d */
    public static C8107a f19625d = new C8107a(2004, m23178a("controllerstageready"));

    /* renamed from: e */
    public static C8107a f19626e = new C8107a(2005, m23178a("loadad"));

    /* renamed from: f */
    public static C8107a f19627f = new C8107a(2006, m23178a("loadadfailed"));

    /* renamed from: g */
    public static C8107a f19628g = new C8107a(2007, m23178a("initproduct"));

    /* renamed from: h */
    public static C8107a f19629h = new C8107a(2008, m23178a("initproductfailed"));

    /* renamed from: i */
    public static C8107a f19630i = new C8107a(2009, m23178a("loadproduct"));

    /* renamed from: j */
    public static C8107a f19631j = new C8107a(OguryAdFormatErrorCode.SHOW_FAILED, m23178a("parseadmfailed"));

    /* renamed from: k */
    public static C8107a f19632k = new C8107a(2011, m23178a("loadadsuccess"));

    /* renamed from: l */
    public static C8107a f19633l = new C8107a(2013, m23178a("controllerfailed"));

    /* renamed from: m */
    public static C8107a f19634m = new C8107a(2015, m23178a("appendnativefeaturesdatafailed"));

    /* renamed from: n */
    public static C8107a f19635n = new C8107a(2016, m23178a("adunitcouldnotloadtowebview"));

    /* renamed from: o */
    public static C8107a f19636o = new C8107a(2017, m23178a("webviewcleanupfailed"));

    /* renamed from: p */
    public static C8107a f19637p = new C8107a(2018, m23178a("removewebviewfailed"));

    /* renamed from: q */
    public static C8107a f19638q = new C8107a(2021, m23178a("fialedregactlifecycle"));

    /* renamed from: r */
    public static C8107a f19639r = new C8107a(2022, m23178a("loadcontrollerhtml"));

    /* renamed from: s */
    public static C8107a f19640s = new C8107a(2023, m23178a("controllerhtmlsuccess"));

    /* renamed from: t */
    public static C8107a f19641t = new C8107a(2024, m23178a("controllerhtmlfailed"));

    /* renamed from: u */
    public static C8107a f19642u = new C8107a(2025, m23178a("webviewcrashrpg"));

    /* renamed from: com.ironsource.sdk.a.f$a */
    public static class C8107a {

        /* renamed from: a */
        String f19643a;

        /* renamed from: b */
        int f19644b;

        C8107a(int i, String str) {
            this.f19644b = i;
            this.f19643a = str;
        }
    }

    static {
        new C8107a(2014, m23178a("extractinstalledpackagesfailed"));
        new C8107a(2019, m23178a("adunitcouldnotloadtowebviewbanners"));
        new C8107a(2020, m23178a("banneralreadydestroyed"));
    }

    /* renamed from: a */
    private static String m23178a(String str) {
        return "n_" + str;
    }
}
