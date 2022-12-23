package com.bytedance.sdk.openadsdk.core.p154j.p158c;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.p154j.p155a.C3474a;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.sdk.openadsdk.core.j.c.c */
/* compiled from: VastMacroHelper */
public class C3499c {

    /* renamed from: a */
    private final List<String> f8743a;

    /* renamed from: b */
    private final Map<C3498b, String> f8744b;

    public C3499c(List<String> list) {
        this.f8743a = list;
        HashMap hashMap = new HashMap();
        this.f8744b = hashMap;
        hashMap.put(C3498b.CACHEBUSTING, m10871b());
    }

    /* renamed from: a */
    public List<String> mo19943a() {
        ArrayList arrayList = new ArrayList();
        for (String next : this.f8743a) {
            if (!TextUtils.isEmpty(next)) {
                for (C3498b bVar : C3498b.values()) {
                    String str = this.f8744b.get(bVar);
                    if (str == null) {
                        str = "";
                    }
                    next = next.replaceAll("\\[" + bVar.name() + "\\]", str);
                }
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public C3499c mo19941a(C3474a aVar) {
        if (aVar != null) {
            this.f8744b.put(C3498b.ERRORCODE, aVar.mo19908a());
        }
        return this;
    }

    /* renamed from: a */
    public C3499c mo19940a(long j) {
        if (j >= 0) {
            String b = m10872b(j);
            if (!TextUtils.isEmpty(b)) {
                this.f8744b.put(C3498b.CONTENTPLAYHEAD, b);
            }
        }
        return this;
    }

    /* renamed from: a */
    public C3499c mo19942a(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                str = URLEncoder.encode(str, "UTF-8");
            } catch (Throwable unused) {
            }
            this.f8744b.put(C3498b.ASSETURI, str);
        }
        return this;
    }

    /* renamed from: b */
    private String m10871b() {
        return String.format(Locale.US, "%08d", new Object[]{Long.valueOf(Math.round(Math.random() * 1.0E8d))});
    }

    /* renamed from: b */
    private String m10872b(long j) {
        return String.format("%02d:%02d:%02d.%03d", new Object[]{Long.valueOf(TimeUnit.MILLISECONDS.toHours(j)), Long.valueOf(TimeUnit.MILLISECONDS.toMinutes(j) % TimeUnit.HOURS.toMinutes(1)), Long.valueOf(TimeUnit.MILLISECONDS.toSeconds(j) % TimeUnit.MINUTES.toSeconds(1)), Long.valueOf(j % 1000)});
    }
}
