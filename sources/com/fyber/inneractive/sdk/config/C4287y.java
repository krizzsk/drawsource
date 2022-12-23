package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.util.C5297m0;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.y */
public class C4287y implements C4288z {

    /* renamed from: a */
    public String f10544a;

    /* renamed from: b */
    public String f10545b;

    /* renamed from: c */
    public C4269r f10546c;

    /* renamed from: d */
    public C4284v f10547d;

    /* renamed from: e */
    public C4285w f10548e;

    /* renamed from: f */
    public C4204a0 f10549f;

    /* renamed from: g */
    public C4211c0 f10550g;

    /* renamed from: a */
    public C4209b0 mo24287a() {
        return this.f10549f;
    }

    /* renamed from: b */
    public C4211c0 mo24288b() {
        return this.f10550g;
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        C5297m0.m16518a(jSONObject, "id", this.f10544a);
        C5297m0.m16518a(jSONObject, "spotId", this.f10545b);
        C5297m0.m16518a(jSONObject, "display", this.f10546c);
        C5297m0.m16518a(jSONObject, "monitor", this.f10547d);
        C5297m0.m16518a(jSONObject, "native", this.f10548e);
        C5297m0.m16518a(jSONObject, "video", this.f10549f);
        C5297m0.m16518a(jSONObject, "viewability", this.f10550g);
        return jSONObject.toString();
    }
}
