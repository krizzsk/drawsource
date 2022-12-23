package com.inmobi.media;

import com.mbridge.msdk.foundation.tools.SameMD5;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.ja */
/* compiled from: UidMap */
public class C6236ja {

    /* renamed from: a */
    private C6112ge f15714a;

    public C6236ja(C6112ge geVar) {
        this.f15714a = geVar;
    }

    /* renamed from: a */
    public final HashMap<String, String> mo35464a() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("u-id-map", m18536b());
        return hashMap;
    }

    /* renamed from: b */
    private String m18536b() {
        return new JSONObject(m18537c()).toString();
    }

    /* renamed from: c */
    private Map<String, String> m18537c() {
        C6231iy e;
        HashMap hashMap = new HashMap();
        String str = null;
        try {
            if (!(!this.f15714a.GPID || (e = C6232iz.m18518a().mo35445e()) == null || (str = e.mo35442b()) == null)) {
                hashMap.put("GPID", str);
            }
            m18535a(hashMap, str);
        } catch (Exception unused) {
            C6236ja.class.getSimpleName();
            m18535a(hashMap, (String) null);
        }
        return hashMap;
    }

    /* renamed from: a */
    private void m18535a(Map<String, String> map, String str) {
        try {
            if (this.f15714a.UM5 && str == null) {
                C6232iz.m18518a();
                C6232iz.m18518a();
                map.put("UM5", C6232iz.m18519a(C6232iz.m18520d(), SameMD5.TAG));
            }
            if (this.f15714a.f15436O1 && str == null) {
                C6232iz.m18518a();
                C6232iz.m18518a();
                map.put("O1", C6232iz.m18519a(C6232iz.m18520d(), "SHA-1"));
            }
        } catch (Exception unused) {
            C6236ja.class.getSimpleName();
        }
    }
}
