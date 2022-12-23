package com.ironsource.sdk.controller;

import android.os.Build;
import android.webkit.JavascriptInterface;
import com.ironsource.sdk.controller.C8202x;
import com.ironsource.sdk.utils.Logger;
import java.lang.reflect.Method;
import java.security.AccessControlException;

/* renamed from: com.ironsource.sdk.controller.d */
class C8140d {

    /* renamed from: b */
    private static final String f19758b = C8140d.class.getSimpleName();

    /* renamed from: a */
    final C8202x.C8225d f19759a;

    C8140d(C8202x.C8225d dVar) {
        this.f19759a = dVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo56399a(String str, String str2) {
        if (this.f19759a == null) {
            Logger.m23747e(f19758b, "!!! nativeAPI == null !!!");
            return;
        }
        Method declaredMethod = C8202x.C8225d.class.getDeclaredMethod(str, new Class[]{String.class});
        if (Build.VERSION.SDK_INT >= 17) {
            if (!declaredMethod.isAnnotationPresent(JavascriptInterface.class)) {
                throw new AccessControlException("Trying to access a private function: " + str);
            }
        }
        declaredMethod.invoke(this.f19759a, new Object[]{str2});
    }
}
