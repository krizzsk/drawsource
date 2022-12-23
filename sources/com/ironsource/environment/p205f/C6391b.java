package com.ironsource.environment.p205f;

import com.ironsource.environment.p202c.C6376b;
import com.ironsource.environment.p205f.C6389a;
import com.ironsource.mediationsdk.C6689r;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(mo72581bv = {1, 0, 3}, mo72582d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\f\u001a\u00020\nH\u0007J\u000e\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0004\n\u0002\u0010\b¨\u0006\u000f"}, mo72583d2 = {"Lcom/ironsource/environment/token/TokenProvider;", "", "()V", "mGlobalDataReader", "Lcom/ironsource/environment/globaldata/GlobalDataReader;", "mTokenKeyList", "", "", "[Ljava/lang/String;", "formatDataMetaData", "Lorg/json/JSONObject;", "tokenData", "getToken", "context", "Landroid/content/Context;", "environment_release"}, mo72584k = 1, mo72585mv = {1, 4, 2})
/* renamed from: com.ironsource.environment.f.b */
public final class C6391b {

    /* renamed from: a */
    public final String[] f16176a = C6389a.f16175b;

    /* renamed from: b */
    private final C6689r f16177b = new C6689r();

    public C6391b() {
        C6389a.C6390a aVar = C6389a.f16174a;
    }

    /* renamed from: a */
    public static JSONObject m19080a(JSONObject jSONObject) {
        JSONObject a = C6376b.m19049a(jSONObject.optJSONObject("md"));
        if (a != null) {
            jSONObject.put("md", a);
        }
        return jSONObject;
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use the new method getToken(context: Context)")
    /* renamed from: a */
    public final JSONObject mo35900a() {
        JSONObject a = C6689r.m20301a(this.f16176a);
        Intrinsics.checkNotNullExpressionValue(a, "mGlobalDataReader.getDataByKeys(mTokenKeyList)");
        return m19080a(a);
    }
}
