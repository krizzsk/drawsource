package com.tapjoy.internal;

import java.io.InputStream;
import java.net.URI;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.tapjoy.internal.bt */
public abstract class C11313bt<Result> extends C11314bu<Result> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Result mo69752a(C11296bh bhVar);

    /* renamed from: a */
    public final Map<String, Object> mo69754a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("Accept", "application/json");
        return linkedHashMap;
    }

    /* renamed from: a */
    public final Result mo69753a(URI uri, InputStream inputStream) {
        C11296bh a = C11296bh.m30909a(inputStream);
        a.mo69703a("BASE_URI", uri);
        int i = 0;
        try {
            a.mo69722h();
            Result result = null;
            String str = null;
            while (a.mo69724j()) {
                String l = a.mo69726l();
                if ("status".equals(l)) {
                    i = a.mo69732r();
                } else if ("message".equals(l)) {
                    str = a.mo69727m();
                } else if ("data".equals(l)) {
                    result = mo69752a(a);
                } else {
                    a.mo69733s();
                }
            }
            a.mo69723i();
            if (i == 200) {
                return result;
            }
            throw new C11315bv(i, str);
        } finally {
            a.close();
        }
    }
}
