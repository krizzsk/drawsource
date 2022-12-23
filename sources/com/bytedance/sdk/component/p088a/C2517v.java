package com.bytedance.sdk.component.p088a;

import android.net.Uri;
import android.text.TextUtils;
import android.util.LruCache;
import com.bytedance.sdk.component.p088a.C2500k;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.a.v */
/* compiled from: PermissionConfig */
class C2517v {

    /* renamed from: a */
    private final Map<String, List<C2520b>> f5310a = new ConcurrentHashMap();

    /* renamed from: b */
    private final LruCache<String, C2521c> f5311b;

    /* renamed from: c */
    private final C2500k.C2501a f5312c;

    /* renamed from: d */
    private final String f5313d;

    /* renamed from: e */
    private volatile boolean f5314e = false;

    /* renamed from: com.bytedance.sdk.component.a.v$c */
    /* compiled from: PermissionConfig */
    static final class C2521c {

        /* renamed from: a */
        C2524x f5321a = C2524x.PUBLIC;

        /* renamed from: b */
        Set<String> f5322b = new HashSet();

        /* renamed from: c */
        Set<String> f5323c = new HashSet();

        C2521c() {
        }
    }

    C2517v(String str, int i, C2500k.C2501a aVar, final Executor executor, JSONObject jSONObject) {
        this.f5313d = str;
        if (i <= 0) {
            this.f5311b = new LruCache<>(16);
        } else {
            this.f5311b = new LruCache<>(i);
        }
        this.f5312c = aVar;
        if (jSONObject == null) {
            aVar.mo16503a(m6317d(str), (C2500k.C2501a.C2502a) new C2500k.C2501a.C2502a() {
            });
        } else {
            mo16536a(jSONObject);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo16536a(JSONObject jSONObject) {
        m6314b(jSONObject);
        this.f5312c.mo16504a(m6317d(this.f5313d), jSONObject.toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2521c mo16535a(String str, Set<String> set) {
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        String authority = parse.getAuthority();
        String builder = new Uri.Builder().scheme(scheme).authority(authority).path(parse.getPath()).toString();
        C2521c cVar = new C2521c();
        if (authority == null || authority.isEmpty()) {
            cVar.f5321a = C2524x.PUBLIC;
            return cVar;
        }
        for (String next : set) {
            if (!authority.equals(next)) {
                if (authority.endsWith("." + next)) {
                }
            }
            cVar.f5321a = C2524x.PRIVATE;
            return cVar;
        }
        C2521c cVar2 = this.f5311b.get(builder);
        if (cVar2 != null) {
            return cVar2;
        }
        return m6312a(builder);
    }

    /* renamed from: b */
    private void m6314b(JSONObject jSONObject) {
        this.f5310a.clear();
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("content");
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONArray jSONArray = jSONObject2.getJSONArray(next);
                LinkedList linkedList = new LinkedList();
                this.f5310a.put(next, linkedList);
                for (int i = 0; i < jSONArray.length(); i++) {
                    linkedList.add(m6315c(jSONArray.getJSONObject(i)));
                }
            }
        } catch (JSONException e) {
            C2498i.m6255b("Parse configurations failed, response: " + jSONObject.toString(), e);
        }
        this.f5314e = true;
    }

    /* renamed from: a */
    private C2521c m6312a(String str) throws C2519a {
        C2521c cVar = new C2521c();
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        String authority = parse.getAuthority();
        String b = m6313b(authority);
        if (TextUtils.isEmpty(scheme) || TextUtils.isEmpty(authority) || b == null) {
            cVar.f5321a = C2524x.PUBLIC;
            return cVar;
        }
        List<C2520b> c = m6316c(b);
        if (c == null) {
            return cVar;
        }
        for (C2520b next : c) {
            if (next.f5317a.matcher(str).find()) {
                if (next.f5318b.compareTo(cVar.f5321a) >= 0) {
                    cVar.f5321a = next.f5318b;
                }
                cVar.f5322b.addAll(next.f5319c);
                cVar.f5323c.addAll(next.f5320d);
            }
        }
        this.f5311b.put(str, cVar);
        return cVar;
    }

    /* renamed from: com.bytedance.sdk.component.a.v$a */
    /* compiled from: PermissionConfig */
    static class C2519a extends IllegalStateException {
        C2519a(String str) {
            super(str);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0004, code lost:
        r1 = r4.split("[.]");
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String m6313b(java.lang.String r4) {
        /*
            r0 = 0
            if (r4 != 0) goto L_0x0004
            return r0
        L_0x0004:
            java.lang.String r1 = "[.]"
            java.lang.String[] r1 = r4.split(r1)
            int r2 = r1.length
            r3 = 2
            if (r2 >= r3) goto L_0x000f
            return r0
        L_0x000f:
            if (r2 != r3) goto L_0x0012
            return r4
        L_0x0012:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r0 = r2 + -2
            r0 = r1[r0]
            r4.append(r0)
            java.lang.String r0 = "."
            r4.append(r0)
            int r2 = r2 + -1
            r0 = r1[r2]
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.p088a.C2517v.m6313b(java.lang.String):java.lang.String");
    }

    /* renamed from: c */
    private List<C2520b> m6316c(String str) throws C2519a {
        if (this.f5314e) {
            return this.f5310a.get(str);
        }
        throw new C2519a("Permission config is outdated!");
    }

    /* renamed from: c */
    private static C2520b m6315c(JSONObject jSONObject) throws JSONException {
        C2520b bVar = new C2520b();
        bVar.f5317a = Pattern.compile(jSONObject.getString("pattern"));
        bVar.f5318b = C2524x.m6324a(jSONObject.getString("group"));
        bVar.f5319c = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("included_methods");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                bVar.f5319c.add(optJSONArray.getString(i));
            }
        }
        bVar.f5320d = new ArrayList();
        JSONArray optJSONArray2 = jSONObject.optJSONArray("excluded_methods");
        if (optJSONArray2 != null) {
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                bVar.f5320d.add(optJSONArray2.getString(i2));
            }
        }
        return bVar;
    }

    /* renamed from: d */
    private static String m6317d(String str) {
        return "com.bytedance.ies.web.jsbridge2.PermissionConfig." + str;
    }

    /* renamed from: com.bytedance.sdk.component.a.v$b */
    /* compiled from: PermissionConfig */
    private static final class C2520b {

        /* renamed from: a */
        Pattern f5317a;

        /* renamed from: b */
        C2524x f5318b;

        /* renamed from: c */
        List<String> f5319c;

        /* renamed from: d */
        List<String> f5320d;

        private C2520b() {
        }
    }
}
