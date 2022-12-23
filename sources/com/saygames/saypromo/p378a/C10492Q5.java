package com.saygames.saypromo.p378a;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* renamed from: com.saygames.saypromo.a.Q5 */
public final class C10492Q5 {

    /* renamed from: a */
    private final String f25955a;

    /* renamed from: b */
    private final String f25956b;

    /* renamed from: c */
    private final ArrayList f25957c = new ArrayList();

    /* renamed from: d */
    private final LinkedHashMap f25958d = new LinkedHashMap();

    public C10492Q5(String str, String str2) {
        this.f25955a = str;
        this.f25956b = str2;
    }

    /* renamed from: a */
    public final C10492Q5 mo65366a(String str) {
        this.f25957c.add(str);
        return this;
    }

    /* renamed from: a */
    public final C10492Q5 mo65367a(String str, String str2) {
        this.f25958d.put(str, str2);
        return this;
    }

    /* renamed from: a */
    public final C10498R5 mo65368a() {
        StringBuilder append = StringsKt.append(new StringBuilder(), this.f25955a, "://", this.f25956b);
        Iterator it = this.f25957c.iterator();
        while (it.hasNext()) {
            StringsKt.append(append, "/", (String) it.next());
        }
        int i = 0;
        for (Object next : this.f25958d.entrySet()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Map.Entry entry = (Map.Entry) next;
            StringsKt.append(append, i == 0 ? "?" : "&", (String) entry.getKey(), "=", URLEncoder.encode((String) entry.getValue(), Charsets.UTF_8.toString()));
            i = i2;
        }
        return new C10498R5(this.f25957c, this.f25958d, this.f25956b, this.f25955a, append.toString(), 0);
    }
}
