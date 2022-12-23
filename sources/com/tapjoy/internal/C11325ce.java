package com.tapjoy.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;

/* renamed from: com.tapjoy.internal.ce */
public final class C11325ce {

    /* renamed from: a */
    private static C11350dc f27014a = new C11350dc();

    /* renamed from: a */
    public static String m31030a() {
        return "1.3.16-tapjoy";
    }

    /* renamed from: a */
    public static void m31031a(Context context) {
        C11350dc dcVar = f27014a;
        Context applicationContext = context.getApplicationContext();
        C11368dq.m31091a((Object) applicationContext, "Application Context cannot be null");
        if (!dcVar.f27109a) {
            dcVar.f27109a = true;
            C11358di a = C11358di.m31067a();
            a.f27129b = new C11330cj(new Handler(), applicationContext, new C11327cg(), a);
            C11352de a2 = C11352de.m31052a();
            if (applicationContext instanceof Application) {
                ((Application) applicationContext).registerActivityLifecycleCallbacks(a2);
            }
            C11365do.m31079a(applicationContext);
            C11355dg.m31056a().f27122a = applicationContext != null ? applicationContext.getApplicationContext() : null;
        }
    }

    /* renamed from: b */
    public static boolean m31032b() {
        return f27014a.f27109a;
    }
}
