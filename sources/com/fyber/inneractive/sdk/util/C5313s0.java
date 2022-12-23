package com.fyber.inneractive.sdk.util;

import android.net.Uri;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.util.s0 */
public class C5313s0 implements Comparable<C5313s0> {

    /* renamed from: a */
    public C5314a f14039a;

    /* renamed from: b */
    public Uri f14040b;

    /* renamed from: c */
    public List<String> f14041c;

    /* renamed from: com.fyber.inneractive.sdk.util.s0$a */
    public enum C5314a {
        Primary(1),
        FallBack(2);
        

        /* renamed from: a */
        public Integer f14045a;

        /* access modifiers changed from: public */
        C5314a(Integer num) {
            this.f14045a = num;
        }
    }

    public C5313s0(C5314a aVar, Uri uri, List<String> list) {
        this.f14039a = aVar;
        this.f14040b = uri;
        this.f14041c = list;
    }

    public int compareTo(Object obj) {
        return this.f14039a.f14045a.compareTo(((C5313s0) obj).f14039a.f14045a);
    }
}
