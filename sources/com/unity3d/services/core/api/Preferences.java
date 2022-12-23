package com.unity3d.services.core.api;

import com.unity3d.services.core.preferences.C12082a;
import com.unity3d.services.core.preferences.C12083b;
import com.unity3d.services.core.webview.bridge.C12160l;
import com.unity3d.services.core.webview.bridge.WebViewExposed;

public class Preferences {
    @WebViewExposed
    public static void getBoolean(String str, String str2, C12160l lVar) {
        Boolean a = C12082a.m32888a(str, str2);
        if (a != null) {
            lVar.mo71347a(a);
            return;
        }
        lVar.mo71346a(C12083b.COULDNT_GET_VALUE, str, str2);
    }

    @WebViewExposed
    public static void getFloat(String str, String str2, C12160l lVar) {
        Float b = C12082a.m32894b(str, str2);
        if (b != null) {
            lVar.mo71347a(b);
            return;
        }
        lVar.mo71346a(C12083b.COULDNT_GET_VALUE, str, str2);
    }

    @WebViewExposed
    public static void getInt(String str, String str2, C12160l lVar) {
        Integer c = C12082a.m32895c(str, str2);
        if (c != null) {
            lVar.mo71347a(c);
            return;
        }
        lVar.mo71346a(C12083b.COULDNT_GET_VALUE, str, str2);
    }

    @WebViewExposed
    public static void getLong(String str, String str2, C12160l lVar) {
        Long d = C12082a.m32896d(str, str2);
        if (d != null) {
            lVar.mo71347a(d);
            return;
        }
        lVar.mo71346a(C12083b.COULDNT_GET_VALUE, str, str2);
    }

    @WebViewExposed
    public static void getString(String str, String str2, C12160l lVar) {
        String e = C12082a.m32897e(str, str2);
        if (e != null) {
            lVar.mo71347a(e);
            return;
        }
        lVar.mo71346a(C12083b.COULDNT_GET_VALUE, str, str2);
    }

    @WebViewExposed
    public static void hasKey(String str, String str2, C12160l lVar) {
        lVar.mo71347a(Boolean.valueOf(C12082a.m32898f(str, str2)));
    }

    @WebViewExposed
    public static void removeKey(String str, String str2, C12160l lVar) {
        C12082a.m32899g(str, str2);
        lVar.mo71347a(new Object[0]);
    }

    @WebViewExposed
    public static void setBoolean(String str, String str2, Boolean bool, C12160l lVar) {
        C12082a.m32889a(str, str2, bool);
        lVar.mo71347a(new Object[0]);
    }

    @WebViewExposed
    public static void setFloat(String str, String str2, Double d, C12160l lVar) {
        C12082a.m32890a(str, str2, d);
        lVar.mo71347a(new Object[0]);
    }

    @WebViewExposed
    public static void setInt(String str, String str2, Integer num, C12160l lVar) {
        C12082a.m32891a(str, str2, num);
        lVar.mo71347a(new Object[0]);
    }

    @WebViewExposed
    public static void setLong(String str, String str2, Long l, C12160l lVar) {
        C12082a.m32892a(str, str2, l);
        lVar.mo71347a(new Object[0]);
    }

    @WebViewExposed
    public static void setString(String str, String str2, String str3, C12160l lVar) {
        C12082a.m32893a(str, str2, str3);
        lVar.mo71347a(new Object[0]);
    }
}
