package com.mbridge.msdk.mbsignalcommon.mraid;

import android.net.Uri;
import android.text.TextUtils;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.C8659q;
import com.mbridge.msdk.mbsignalcommon.mraid.C8871a;
import com.mbridge.msdk.mbsignalcommon.windvane.C8881a;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.mbsignalcommon.mraid.c */
/* compiled from: MraidUriUtil */
public final class C8874c {

    /* renamed from: a */
    private static volatile ConcurrentHashMap<String, String> f21855a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private static ArrayList<String> f21856b = new ArrayList<>();

    /* renamed from: a */
    public static C8881a m25635a(WindVaneWebView windVaneWebView, String str) {
        Set<String> set;
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (TextUtils.isEmpty(scheme) || !scheme.contains(CampaignEx.JSON_KEY_MRAID)) {
            return null;
        }
        C8881a aVar = new C8881a();
        aVar.f21886d = C8659q.m24802b("n+ztLkxpVTzBLkxgHN==");
        aVar.f21887e = parse.getHost();
        int i = 0;
        if (f21856b.size() == 0) {
            for (Method name : C8873b.class.getDeclaredMethods()) {
                f21856b.add(name.getName());
            }
        }
        if (f21856b.contains(aVar.f21887e) || windVaneWebView == null) {
            String encodedQuery = parse.getEncodedQuery();
            if (encodedQuery == null) {
                set = Collections.emptySet();
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                do {
                    int indexOf = encodedQuery.indexOf(38, i);
                    if (indexOf == -1) {
                        indexOf = encodedQuery.length();
                    }
                    int indexOf2 = encodedQuery.indexOf(61, i);
                    if (indexOf2 > indexOf || indexOf2 == -1) {
                        indexOf2 = indexOf;
                    }
                    linkedHashSet.add(Uri.decode(encodedQuery.substring(i, indexOf2)));
                    i = indexOf + 1;
                } while (i < encodedQuery.length());
                set = Collections.unmodifiableSet(linkedHashSet);
            }
            try {
                JSONObject jSONObject = new JSONObject();
                for (String str2 : set) {
                    jSONObject.put(str2, parse.getQueryParameter(str2));
                }
                aVar.f21888f = jSONObject.toString();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return aVar;
        }
        String campaignId = windVaneWebView.getCampaignId();
        String str3 = aVar.f21887e;
        if (!TextUtils.isEmpty(campaignId)) {
            if (f21855a.containsKey(campaignId)) {
                String str4 = f21855a.get(campaignId);
                if (!TextUtils.isEmpty(str3) && !str4.contains(str3)) {
                    if (str4.length() > 0) {
                        str4 = str4.concat(",");
                    }
                    f21855a.put(campaignId, str4.concat(str3));
                }
            } else {
                f21855a.put(campaignId, str3);
            }
        }
        C8871a.C8872a.f21854a.mo58632a((WebView) windVaneWebView, aVar.f21887e);
        C8871a.C8872a.f21854a.mo58633a((WebView) windVaneWebView, aVar.f21887e, "Specified command is not implemented");
        return null;
    }

    /* renamed from: a */
    public static String m25636a(String str) {
        if (f21855a.containsKey(str)) {
            return f21855a.get(str);
        }
        return null;
    }

    /* renamed from: b */
    public static void m25637b(String str) {
        if (!TextUtils.isEmpty(str)) {
            f21855a.remove(str);
        }
    }
}
