package com.unity3d.services.core.api;

import com.unity3d.services.core.device.C12025f;
import com.unity3d.services.core.device.C12026g;
import com.unity3d.services.core.device.C12028i;
import com.unity3d.services.core.webview.bridge.C12160l;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public class Storage {
    /* renamed from: a */
    private static void m32593a(String str, String str2, Object obj, C12160l lVar) {
        C12025f a = m32592a(str);
        if (a == null) {
            lVar.mo71346a(C12026g.COULDNT_GET_STORAGE, str, str2);
        } else if (a.set(str2, obj)) {
            lVar.mo71347a(str2);
        } else {
            lVar.mo71346a(C12026g.COULDNT_SET_VALUE, str2);
        }
    }

    @WebViewExposed
    public static void clear(String str, C12160l lVar) {
        C12025f a = m32592a(str);
        if (a == null) {
            lVar.mo71346a(C12026g.COULDNT_GET_STORAGE, str);
        } else if (a.mo71164a()) {
            lVar.mo71347a(str);
        } else {
            lVar.mo71346a(C12026g.COULDNT_CLEAR_STORAGE, str);
        }
    }

    @WebViewExposed
    public static void delete(String str, String str2, C12160l lVar) {
        C12025f a = m32592a(str);
        if (a == null) {
            lVar.mo71346a(C12026g.COULDNT_GET_STORAGE, str);
        } else if (a.delete(str2)) {
            lVar.mo71347a(str);
        } else {
            lVar.mo71346a(C12026g.COULDNT_DELETE_VALUE, str);
        }
    }

    @WebViewExposed
    public static void get(String str, String str2, C12160l lVar) {
        C12025f a = m32592a(str);
        if (a != null) {
            Object obj = a.get(str2);
            if (obj == null) {
                lVar.mo71346a(C12026g.COULDNT_GET_VALUE, str2);
                return;
            }
            lVar.mo71347a(obj);
            return;
        }
        lVar.mo71346a(C12026g.COULDNT_GET_STORAGE, str, str2);
    }

    @WebViewExposed
    public static void getKeys(String str, String str2, Boolean bool, C12160l lVar) {
        C12025f a = m32592a(str);
        if (a != null) {
            List<String> keys = a.getKeys(str2, bool.booleanValue());
            if (keys != null) {
                lVar.mo71347a(new JSONArray(keys));
                return;
            }
            lVar.mo71347a(new JSONArray());
            return;
        }
        lVar.mo71346a(C12026g.COULDNT_GET_STORAGE, str, str2);
    }

    @WebViewExposed
    public static void read(String str, C12160l lVar) {
        C12025f a = m32592a(str);
        if (a != null) {
            a.mo71167d();
            lVar.mo71347a(str);
            return;
        }
        lVar.mo71346a(C12026g.COULDNT_GET_STORAGE, str);
    }

    @WebViewExposed
    public static void set(String str, String str2, Integer num, C12160l lVar) {
        m32593a(str, str2, num, lVar);
    }

    @WebViewExposed
    public static void write(String str, C12160l lVar) {
        C12025f a = m32592a(str);
        if (a == null) {
            lVar.mo71346a(C12026g.COULDNT_GET_STORAGE, str);
        } else if (a.mo71169f()) {
            lVar.mo71347a(str);
        } else {
            lVar.mo71346a(C12026g.COULDNT_WRITE_STORAGE_TO_CACHE, str);
        }
    }

    @WebViewExposed
    public static void set(String str, String str2, Boolean bool, C12160l lVar) {
        m32593a(str, str2, bool, lVar);
    }

    @WebViewExposed
    public static void set(String str, String str2, Long l, C12160l lVar) {
        m32593a(str, str2, l, lVar);
    }

    @WebViewExposed
    public static void set(String str, String str2, Double d, C12160l lVar) {
        m32593a(str, str2, d, lVar);
    }

    @WebViewExposed
    public static void set(String str, String str2, String str3, C12160l lVar) {
        m32593a(str, str2, str3, lVar);
    }

    @WebViewExposed
    public static void set(String str, String str2, JSONObject jSONObject, C12160l lVar) {
        m32593a(str, str2, jSONObject, lVar);
    }

    @WebViewExposed
    public static void set(String str, String str2, JSONArray jSONArray, C12160l lVar) {
        m32593a(str, str2, jSONArray, lVar);
    }

    /* renamed from: a */
    private static C12025f m32592a(String str) {
        return C12028i.m32764a(C12028i.C12029a.valueOf(str));
    }
}
