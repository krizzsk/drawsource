package com.mbridge.msdk.mbbid.common.p330b;

import com.mbridge.msdk.foundation.same.net.C8536f;
import com.mbridge.msdk.foundation.same.net.C8557k;
import com.mbridge.msdk.foundation.same.net.p306a.C8508a;
import com.mbridge.msdk.foundation.same.net.p308c.C8513b;
import com.mbridge.msdk.foundation.same.net.p311f.C8537a;
import com.mbridge.msdk.mbbid.common.BidResponsedEx;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.mbbid.common.b.b */
/* compiled from: BidResponseHandler */
public abstract class C8789b extends C8536f<JSONObject> {

    /* renamed from: a */
    private static final String f21597a = C8789b.class.getSimpleName();

    /* renamed from: a */
    public abstract void mo58444a(int i, String str);

    /* renamed from: a */
    public abstract void mo58445a(BidResponsedEx bidResponsedEx);

    public C8789b(String str, String str2) {
        this.f20918d = str2;
        this.f20919e = str;
    }

    /* renamed from: a */
    public final void mo57895a(C8557k<JSONObject> kVar) {
        super.mo57895a(kVar);
        if (kVar != null && kVar.f21017c != null) {
            List<C8513b> list = kVar.f21017c.f20915d;
            JSONObject jSONObject = (JSONObject) kVar.f21015a;
            int optInt = jSONObject.optInt("status");
            if (200 == optInt) {
                BidResponsedEx parseBidResponsedEx = BidResponsedEx.parseBidResponsedEx(jSONObject.optJSONObject("data"), this.f20918d);
                if (parseBidResponsedEx != null) {
                    mo58445a(parseBidResponsedEx);
                } else {
                    mo58444a(optInt, jSONObject.optString("msg"));
                }
            } else {
                mo58444a(optInt, jSONObject.optString("msg"));
            }
        }
    }

    /* renamed from: a */
    public final void mo57894a(C8508a aVar) {
        mo58444a(aVar.f20851a, C8537a.m24452a(aVar));
    }
}
