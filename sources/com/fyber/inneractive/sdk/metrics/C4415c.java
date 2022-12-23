package com.fyber.inneractive.sdk.metrics;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.metrics.c */
public class C4415c {

    /* renamed from: c */
    public static final C4415c f10844c = new C4415c();

    /* renamed from: a */
    public final Map<String, C4418f> f10845a = new HashMap();

    /* renamed from: b */
    public final C4418f f10846b = new C4417e();

    /* renamed from: a */
    public C4418f mo24596a(String str) {
        if (str == null) {
            try {
                return this.f10846b;
            } catch (Exception unused) {
                return this.f10846b;
            }
        } else {
            C4418f fVar = this.f10845a.get(str);
            if (fVar != null) {
                return fVar;
            }
            C4416d dVar = new C4416d();
            this.f10845a.put(str, dVar);
            return dVar;
        }
    }
}
