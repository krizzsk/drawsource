package com.tapjoy.internal;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.tapjoy.internal.co */
public final class C11335co {

    /* renamed from: a */
    public final C11342cv f27027a;

    /* renamed from: b */
    final WebView f27028b;

    /* renamed from: c */
    public final List<C11343cw> f27029c = new ArrayList();

    /* renamed from: d */
    public final Map<String, C11343cw> f27030d = new HashMap();

    /* renamed from: e */
    final String f27031e;

    /* renamed from: f */
    public final String f27032f;

    /* renamed from: g */
    public final String f27033g;

    /* renamed from: h */
    public final C11336cp f27034h;

    public C11335co(C11342cv cvVar, String str, List<C11343cw> list, String str2, String str3, C11336cp cpVar) {
        this.f27027a = cvVar;
        this.f27028b = null;
        this.f27031e = str;
        this.f27034h = cpVar;
        if (list != null) {
            this.f27029c.addAll(list);
            for (C11343cw put : list) {
                String uuid = UUID.randomUUID().toString();
                this.f27030d.put(uuid, put);
            }
        }
        this.f27033g = str2;
        this.f27032f = str3;
    }
}
