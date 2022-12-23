package com.ogury.p377ed.internal;

/* renamed from: com.ogury.ed.internal.hd */
public final class C10081hd {

    /* renamed from: a */
    public static final C10081hd f25312a = new C10081hd();

    /* renamed from: a */
    private static String m29306a() {
        return "window.MRAID_ENV =  { version: '3.0', sdk: 'Presage', sdkVersion: '4.2.0'};";
    }

    private C10081hd() {
    }

    /* renamed from: b */
    private static String m29308b(C9991ek ekVar) {
        return "window.MRAID_ENV =  { version: '3.0', sdk: 'Presage', sdkVersion: '4.2.0', adUnit: { type: '" + ekVar.mo64577c() + "', reward : { name: '" + ekVar.mo64581e().getName() + "', value: '" + ekVar.mo64581e().getValue() + "', launch: '" + ekVar.mo64579d() + "'}}};";
    }

    /* renamed from: a */
    public static String m29307a(C9991ek ekVar) {
        if (ekVar == null || !C10263mq.m29881a((Object) ekVar.mo64577c(), (Object) "optin_video")) {
            return m29306a();
        }
        return m29308b(ekVar);
    }
}
