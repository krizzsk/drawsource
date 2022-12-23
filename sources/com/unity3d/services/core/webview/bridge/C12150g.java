package com.unity3d.services.core.webview.bridge;

import com.unity3d.services.core.log.C12065a;
import com.unity3d.services.core.webview.C12136a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import org.json.JSONException;

/* renamed from: com.unity3d.services.core.webview.bridge.g */
/* compiled from: WebViewBridge */
public class C12150g {

    /* renamed from: a */
    private static HashMap<String, HashMap<String, HashMap<Integer, Method>>> f29666a;

    /* renamed from: a */
    public static void m33138a(Class[] clsArr) {
        HashMap hashMap;
        if (clsArr != null) {
            f29666a = new HashMap<>();
            for (Class cls : clsArr) {
                if (cls != null && (cls.getPackage().getName().startsWith("com.unity3d.services") || cls.getPackage().getName().startsWith("com.unity3d.ads.test"))) {
                    HashMap hashMap2 = new HashMap();
                    for (Method method : cls.getMethods()) {
                        if (method.getAnnotation(WebViewExposed.class) != null) {
                            String name = method.getName();
                            if (hashMap2.containsKey(name)) {
                                hashMap = (HashMap) hashMap2.get(name);
                            } else {
                                hashMap = new HashMap();
                            }
                            hashMap.put(Integer.valueOf(Arrays.deepHashCode(method.getParameterTypes())), method);
                            hashMap2.put(name, hashMap);
                        }
                    }
                    f29666a.put(cls.getName(), hashMap2);
                }
            }
        }
    }

    /* renamed from: b */
    public static void m33141b(String str, String str2, Object[] objArr) throws Exception {
        try {
            C12136a.m33103c().mo71304a(str).mo71338a(str2, m33140a(objArr, (C12160l) null));
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | JSONException e) {
            C12065a.m32848c("Error while invoking method");
            throw e;
        }
    }

    /* renamed from: a */
    private static Method m33136a(String str, String str2, Object[] objArr) throws JSONException, NoSuchMethodException {
        if (f29666a.containsKey(str)) {
            HashMap hashMap = f29666a.get(str);
            if (hashMap.containsKey(str2)) {
                return (Method) ((HashMap) hashMap.get(str2)).get(Integer.valueOf(Arrays.deepHashCode(m33139a(objArr))));
            }
            throw new NoSuchMethodException();
        }
        throw new NoSuchMethodException();
    }

    /* renamed from: a */
    private static Class<?>[] m33139a(Object[] objArr) throws JSONException {
        Class[] clsArr = objArr == null ? new Class[1] : new Class[(objArr.length + 1)];
        if (objArr != null) {
            for (int i = 0; i < objArr.length; i++) {
                clsArr[i] = objArr[i].getClass();
            }
        }
        clsArr[clsArr.length - 1] = C12160l.class;
        return clsArr;
    }

    /* renamed from: a */
    private static Object[] m33140a(Object[] objArr, C12160l lVar) throws JSONException {
        Object[] objArr2;
        if (objArr != null) {
            objArr2 = new Object[(objArr.length + (lVar != null ? 1 : 0))];
        } else if (lVar == null) {
            return null;
        } else {
            objArr2 = new Object[1];
        }
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
        if (lVar != null) {
            objArr2[objArr2.length - 1] = lVar;
        }
        return objArr2;
    }

    /* renamed from: a */
    public static void m33137a(String str, String str2, Object[] objArr, C12160l lVar) throws Exception {
        try {
            try {
                m33136a(str, str2, objArr).invoke((Object) null, m33140a(objArr, lVar));
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | JSONException e) {
                lVar.mo71346a(C12151h.INVOCATION_FAILED, str, str2, objArr, e.getMessage());
                throw e;
            }
        } catch (NoSuchMethodException | JSONException e2) {
            lVar.mo71346a(C12151h.METHOD_NOT_FOUND, str, str2, objArr);
            throw e2;
        }
    }
}
