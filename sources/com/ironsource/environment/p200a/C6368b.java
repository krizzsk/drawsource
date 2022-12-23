package com.ironsource.environment.p200a;

import com.ironsource.environment.p202c.C6376b;
import com.ironsource.mediationsdk.C6689r;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(mo72581bv = {1, 0, 3}, mo72582d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0006\u0010\u000b\u001a\u00020\tR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, mo72583d2 = {"Lcom/ironsource/environment/auction/AuctionProvider;", "", "()V", "mAuctionKeyList", "Ljava/util/ArrayList;", "", "mGlobalDataReader", "Lcom/ironsource/environment/globaldata/GlobalDataReader;", "formatDataMetaData", "Lorg/json/JSONObject;", "tokenData", "getAuctionData", "environment_release"}, mo72584k = 1, mo72585mv = {1, 4, 2})
/* renamed from: com.ironsource.environment.a.b */
public final class C6368b {

    /* renamed from: a */
    private final ArrayList<String> f16132a = new ArrayList<>(new C6367a().f16131a);

    /* renamed from: b */
    private final C6689r f16133b = new C6689r();

    /* renamed from: a */
    public final JSONObject mo35878a() {
        JSONObject a = this.f16133b.mo36834a(this.f16132a);
        Intrinsics.checkNotNullExpressionValue(a, "mGlobalDataReader.getDataByKeys(mAuctionKeyList)");
        JSONObject a2 = C6376b.m19049a(a.optJSONObject("md"));
        if (a2 != null) {
            a.put("md", a2);
        }
        return a;
    }
}
