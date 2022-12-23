package com.mbridge.msdk.foundation.same.net.p309d;

import com.mbridge.msdk.foundation.same.net.C8532e;
import com.mbridge.msdk.foundation.same.net.C8557k;
import com.mbridge.msdk.foundation.same.net.p306a.C8508a;
import com.mbridge.msdk.foundation.same.net.p310e.C8535c;
import com.mbridge.msdk.foundation.same.net.p311f.C8538b;
import com.mbridge.msdk.foundation.tools.C8672v;
import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.same.net.d.d */
/* compiled from: JsonObjectRequest */
public class C8529d extends C8530e<JSONObject> {

    /* renamed from: c */
    private static final String f20901c = C8529d.class.getSimpleName();

    public C8529d(int i, String str, String str2, C8532e<JSONObject> eVar) {
        super(i, str, str2, eVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C8557k<JSONObject> mo57946a(C8535c cVar) {
        try {
            return C8557k.m24541a(new JSONObject(new String(cVar.f20913b, C8538b.m24453a(cVar.f20915d))), cVar);
        } catch (UnsupportedEncodingException e) {
            C8672v.m24878d(f20901c, e.getMessage());
            return C8557k.m24540a(new C8508a(8, cVar));
        } catch (JSONException e2) {
            C8672v.m24878d(f20901c, e2.getMessage());
            return C8557k.m24540a(new C8508a(8, cVar));
        }
    }
}
