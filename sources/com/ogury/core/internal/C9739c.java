package com.ogury.core.internal;

import com.adcolony.sdk.AdColonyAppOptions;

/* renamed from: com.ogury.core.internal.c */
/* compiled from: OguryFrameworkChecker.kt */
public final class C9739c {

    /* renamed from: a */
    private C9794w f24611a;

    /* renamed from: b */
    private final C9774f f24612b;

    static {
        new C9740a((byte) 0);
    }

    public C9739c() {
        this((C9774f) null, 1);
    }

    private C9739c(C9774f fVar) {
        C9794w wVar;
        C9717ai.m28145b(fVar, "reflectionUtil");
        this.f24612b = fVar;
        if (C9774f.m28234a("com.unity3d.player.UnityPlayer")) {
            wVar = new C9794w(1, AdColonyAppOptions.UNITY);
        } else if (C9774f.m28234a("org.apache.cordova.CordovaWebView")) {
            wVar = new C9794w(2, "Cordova");
        } else if (C9774f.m28234a("mono.android.Runtime")) {
            wVar = new C9794w(3, "Xamarin");
        } else if (C9774f.m28234a("com.adobe.fre.FREFunction")) {
            wVar = new C9794w(4, "Adobe Air");
        } else {
            wVar = new C9794w(0, "Native");
        }
        this.f24611a = wVar;
    }

    public /* synthetic */ C9739c(C9774f fVar, int i) {
        this(new C9774f());
    }

    /* renamed from: com.ogury.core.internal.c$a */
    /* compiled from: OguryFrameworkChecker.kt */
    public static final class C9740a {
        private C9740a() {
        }

        public /* synthetic */ C9740a(byte b) {
            this();
        }
    }

    /* renamed from: a */
    public final int mo64074a() {
        return this.f24611a.mo64211a();
    }

    /* renamed from: b */
    public final String mo64075b() {
        return this.f24611a.mo64212b();
    }
}
