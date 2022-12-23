package com.unity3d.services.core.configuration;

import android.os.Build;
import android.webkit.JavascriptInterface;
import com.unity3d.services.core.log.C12065a;
import com.unity3d.services.core.properties.C12088d;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class EnvironmentCheck {
    /* renamed from: a */
    private static boolean m32627a(Method method) {
        if (Build.VERSION.SDK_INT < 17) {
            return true;
        }
        Annotation[] annotations = method.getAnnotations();
        if (annotations != null) {
            for (Annotation annotation : annotations) {
                if (annotation instanceof JavascriptInterface) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isEnvironmentOk() {
        return testProGuard() && testCacheDirectory();
    }

    public static boolean testCacheDirectory() {
        if (C12088d.m32913a() != null) {
            C12065a.m32845b("Unity Ads cache directory check OK");
            return true;
        }
        C12065a.m32848c("Unity Ads cache directory check fail: no working cache directory available");
        return false;
    }

    public static boolean testProGuard() {
        try {
            Class<?> cls = Class.forName("com.unity3d.services.core.webview.bridge.i");
            Method method = cls.getMethod("handleInvocation", new Class[]{String.class});
            Method method2 = cls.getMethod("handleCallback", new Class[]{String.class, String.class, String.class});
            if (!m32627a(method) || !m32627a(method2)) {
                C12065a.m32848c("Unity Ads ProGuard check fail: missing @JavascriptInterface annotations in Unity Ads web bridge");
                return false;
            }
            C12065a.m32845b("Unity Ads ProGuard check OK");
            return true;
        } catch (ClassNotFoundException e) {
            C12065a.m32842a("Unity Ads ProGuard check fail: Unity Ads web bridge class not found", (Exception) e);
            return false;
        } catch (NoSuchMethodException e2) {
            C12065a.m32842a("Unity Ads ProGuard check fail: Unity Ads web bridge methods not found", (Exception) e2);
            return false;
        } catch (Exception e3) {
            C12065a.m32842a("Unknown exception during Unity Ads ProGuard check: " + e3.getMessage(), e3);
            return true;
        }
    }
}
