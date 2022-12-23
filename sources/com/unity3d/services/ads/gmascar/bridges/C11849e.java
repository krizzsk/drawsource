package com.unity3d.services.ads.gmascar.bridges;

import android.content.Context;
import com.google.ads.AdRequest;
import com.unity3d.services.core.log.C12065a;
import com.unity3d.services.core.reflection.C12090a;
import java.util.HashMap;

/* renamed from: com.unity3d.services.ads.gmascar.bridges.e */
/* compiled from: MobileAdsBridge */
public class C11849e extends C12090a {

    /* renamed from: com.unity3d.services.ads.gmascar.bridges.e$a */
    /* compiled from: MobileAdsBridge */
    class C11850a extends HashMap<String, Class<?>[]> {
        C11850a() throws RuntimeException, Error {
            try {
                put("initialize", new Class[]{Context.class, Class.forName("com.google.android.gms.ads.initialization.OnInitializationCompleteListener")});
            } catch (ClassNotFoundException e) {
                C12065a.m32843a("Could not find class \"com.google.android.gms.ads.initialization.OnInitializationCompleteListener\" %s", e.getLocalizedMessage());
            }
            put("getInitializationStatus", new Class[0]);
            put("getVersionString", new Class[0]);
        }
    }

    public C11849e() {
        super(new C11850a());
    }

    /* renamed from: a */
    public void mo70792a(Context context, Object obj) {
        mo71234b("initialize", (Object) null, context, obj);
    }

    /* renamed from: g */
    public String mo70785g() {
        return "com.google.android.gms.ads.MobileAds";
    }

    /* renamed from: i */
    public Object mo70793i() {
        return mo71233a("getInitializationStatus", (Object) null, new Object[0]);
    }

    /* renamed from: j */
    public String mo70794j() {
        Object a = mo71233a("getVersionString", (Object) null, new Object[0]);
        if (a == null) {
            return AdRequest.VERSION;
        }
        return a.toString();
    }
}
