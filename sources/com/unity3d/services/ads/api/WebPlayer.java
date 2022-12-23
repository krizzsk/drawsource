package com.unity3d.services.ads.api;

import android.os.Build;
import com.unity3d.services.ads.webplayer.C11925b;
import com.unity3d.services.ads.webplayer.C11927d;
import com.unity3d.services.ads.webplayer.C11928e;
import com.unity3d.services.ads.webplayer.C11929f;
import com.unity3d.services.ads.webplayer.C11937g;
import com.unity3d.services.core.log.C12065a;
import com.unity3d.services.core.misc.C12080j;
import com.unity3d.services.core.webview.bridge.C12160l;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class WebPlayer {

    /* renamed from: com.unity3d.services.ads.api.WebPlayer$a */
    static class C11831a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11929f f28728a;

        /* renamed from: b */
        final /* synthetic */ String f28729b;

        C11831a(C11929f fVar, String str) {
            this.f28728a = fVar;
            this.f28729b = str;
        }

        public void run() {
            this.f28728a.loadUrl(this.f28729b);
        }
    }

    /* renamed from: com.unity3d.services.ads.api.WebPlayer$b */
    static class C11832b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11929f f28730a;

        /* renamed from: b */
        final /* synthetic */ String f28731b;

        /* renamed from: c */
        final /* synthetic */ String f28732c;

        /* renamed from: d */
        final /* synthetic */ String f28733d;

        C11832b(C11929f fVar, String str, String str2, String str3) {
            this.f28730a = fVar;
            this.f28731b = str;
            this.f28732c = str2;
            this.f28733d = str3;
        }

        public void run() {
            this.f28730a.loadData(this.f28731b, this.f28732c, this.f28733d);
        }
    }

    /* renamed from: com.unity3d.services.ads.api.WebPlayer$c */
    static class C11833c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11929f f28734a;

        /* renamed from: b */
        final /* synthetic */ String f28735b;

        /* renamed from: c */
        final /* synthetic */ String f28736c;

        /* renamed from: d */
        final /* synthetic */ String f28737d;

        /* renamed from: e */
        final /* synthetic */ String f28738e;

        C11833c(C11929f fVar, String str, String str2, String str3, String str4) {
            this.f28734a = fVar;
            this.f28735b = str;
            this.f28736c = str2;
            this.f28737d = str3;
            this.f28738e = str4;
        }

        public void run() {
            this.f28734a.loadDataWithBaseURL(this.f28735b, this.f28736c, this.f28737d, this.f28738e, (String) null);
        }
    }

    /* renamed from: com.unity3d.services.ads.api.WebPlayer$d */
    static class C11834d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11929f f28739a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f28740b;

        /* renamed from: c */
        final /* synthetic */ JSONObject f28741c;

        C11834d(C11929f fVar, JSONObject jSONObject, JSONObject jSONObject2) {
            this.f28739a = fVar;
            this.f28740b = jSONObject;
            this.f28741c = jSONObject2;
        }

        public void run() {
            this.f28739a.mo70896a(this.f28740b, this.f28741c);
        }
    }

    /* renamed from: com.unity3d.services.ads.api.WebPlayer$e */
    static class C11835e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11929f f28742a;

        /* renamed from: b */
        final /* synthetic */ JSONObject f28743b;

        C11835e(C11929f fVar, JSONObject jSONObject) {
            this.f28742a = fVar;
            this.f28743b = jSONObject;
        }

        public void run() {
            this.f28742a.setEventSettings(this.f28743b);
        }
    }

    /* renamed from: com.unity3d.services.ads.api.WebPlayer$f */
    static class C11836f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11929f f28744a;

        C11836f(C11929f fVar) {
            this.f28744a = fVar;
        }

        public void run() {
            this.f28744a.mo70896a(new JSONObject(), new JSONObject());
            this.f28744a.setEventSettings(new JSONObject());
        }
    }

    /* renamed from: com.unity3d.services.ads.api.WebPlayer$g */
    static class C11837g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11929f f28745a;

        /* renamed from: b */
        final /* synthetic */ String f28746b;

        /* renamed from: c */
        final /* synthetic */ String f28747c;

        C11837g(C11929f fVar, String str, String str2) {
            this.f28745a = fVar;
            this.f28746b = str;
            this.f28747c = str2;
        }

        public void run() {
            int[] iArr = new int[2];
            this.f28745a.getLocationOnScreen(iArr);
            C11927d.m32478a(this.f28746b, this.f28747c, iArr[0], iArr[1], this.f28745a.getWidth(), this.f28745a.getHeight(), Build.VERSION.SDK_INT >= 11 ? this.f28745a.getAlpha() : 1.0f);
        }
    }

    @WebViewExposed
    public static void clearSettings(String str, C12160l lVar) {
        C11928e a = C11928e.m32480a();
        a.mo70893f(str);
        a.mo70892e(str);
        a.mo70891d(str);
        C11929f a2 = C11937g.m32510a().mo70943a(str);
        if (a2 != null) {
            C12080j.m32879a((Runnable) new C11836f(a2));
            lVar.mo71347a(new Object[0]);
            return;
        }
        lVar.mo71346a(C11925b.WEBPLAYER_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void getErroredSettings(String str, C12160l lVar) {
        C11929f a = C11937g.m32510a().mo70943a(str);
        if (a != null) {
            Map<String, String> erroredSettings = a.getErroredSettings();
            JSONObject jSONObject = new JSONObject();
            try {
                for (Map.Entry next : erroredSettings.entrySet()) {
                    jSONObject.put((String) next.getKey(), next.getValue());
                }
            } catch (Exception e) {
                C12065a.m32842a("Error forming JSON object", e);
            }
            lVar.mo71347a(jSONObject);
            lVar.mo71347a(new Object[0]);
            return;
        }
        lVar.mo71346a(C11925b.WEBPLAYER_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void getFrame(String str, String str2, C12160l lVar) {
        lVar.mo71347a(new Object[0]);
        C11929f a = C11937g.m32510a().mo70943a(str2);
        if (a != null) {
            C12080j.m32879a((Runnable) new C11837g(a, str, str2));
        }
    }

    @WebViewExposed
    public static void sendEvent(JSONArray jSONArray, String str, C12160l lVar) {
        C11929f a = C11937g.m32510a().mo70943a(str);
        if (a != null) {
            a.mo70898c(jSONArray);
            lVar.mo71347a(new Object[0]);
            return;
        }
        lVar.mo71346a(C11925b.WEBPLAYER_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void setData(String str, String str2, String str3, String str4, C12160l lVar) {
        C11929f a = C11937g.m32510a().mo70943a(str4);
        if (a != null) {
            C12080j.m32879a((Runnable) new C11832b(a, str, str2, str3));
            lVar.mo71347a(new Object[0]);
            return;
        }
        lVar.mo71346a(C11925b.WEBPLAYER_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void setDataWithUrl(String str, String str2, String str3, String str4, String str5, C12160l lVar) {
        C11929f a = C11937g.m32510a().mo70943a(str5);
        if (a != null) {
            C12080j.m32879a((Runnable) new C11833c(a, str, str2, str3, str4));
            lVar.mo71347a(new Object[0]);
            return;
        }
        lVar.mo71346a(C11925b.WEBPLAYER_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void setEventSettings(JSONObject jSONObject, String str, C12160l lVar) {
        C11928e.m32480a().mo70886a(str, jSONObject);
        C11929f a = C11937g.m32510a().mo70943a(str);
        if (a != null) {
            C12080j.m32879a((Runnable) new C11835e(a, jSONObject));
            lVar.mo71347a(new Object[0]);
            return;
        }
        lVar.mo71346a(C11925b.WEBPLAYER_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void setSettings(JSONObject jSONObject, JSONObject jSONObject2, String str, C12160l lVar) {
        C11928e.m32480a().mo70890c(str, jSONObject);
        C11928e.m32480a().mo70888b(str, jSONObject2);
        C11929f a = C11937g.m32510a().mo70943a(str);
        if (a != null) {
            C12080j.m32879a((Runnable) new C11834d(a, jSONObject, jSONObject2));
            lVar.mo71347a(new Object[0]);
            return;
        }
        lVar.mo71346a(C11925b.WEBPLAYER_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void setUrl(String str, String str2, C12160l lVar) {
        C11929f a = C11937g.m32510a().mo70943a(str2);
        if (a != null) {
            C12080j.m32879a((Runnable) new C11831a(a, str));
            lVar.mo71347a(new Object[0]);
            return;
        }
        lVar.mo71346a(C11925b.WEBPLAYER_NULL, new Object[0]);
    }
}
