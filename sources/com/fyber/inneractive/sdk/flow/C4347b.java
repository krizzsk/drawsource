package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.metrics.C4412a;
import com.fyber.inneractive.sdk.response.C5233e;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.flow.b */
public class C4347b<T extends C5233e> extends C4412a {

    /* renamed from: e */
    public static final String f10664e = String.valueOf(24);

    /* renamed from: f */
    public static final String f10665f = String.valueOf(1);

    /* renamed from: b */
    public final T f10666b;

    /* renamed from: c */
    public final InneractiveAdRequest f10667c;

    /* renamed from: d */
    public final JSONArray f10668d;

    public C4347b(T t, InneractiveAdRequest inneractiveAdRequest, String str, JSONArray jSONArray) {
        super(str);
        this.f10666b = t;
        this.f10667c = inneractiveAdRequest;
        this.f10668d = jSONArray;
    }
}
