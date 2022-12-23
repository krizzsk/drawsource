package com.mbridge.msdk.foundation.controller.authoritycontroller;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.p083a.p084a.C2461a;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.p078c.C2440a;
import com.mbridge.msdk.p078c.C2445b;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.controller.authoritycontroller.a */
/* compiled from: SDKAuthorityController */
public class C8395a {

    /* renamed from: b */
    private static volatile C8395a f20489b;

    /* renamed from: a */
    public ArrayList<String> f20490a = new ArrayList<>();

    /* renamed from: c */
    private AuthorityInfoBean f20491c = new AuthorityInfoBean();

    /* renamed from: d */
    private int f20492d = 3;

    private C8395a() {
        try {
            if (C2461a.m6124a().mo16390b(MBridgeConstans.AUTHORITY_GENERAL_DATA).equals("")) {
                this.f20491c.mo56929b(1);
            }
            if (C2461a.m6124a().mo16390b(MBridgeConstans.AUTHORITY_DEVICE_ID).equals("")) {
                this.f20491c.mo56930c(1);
            }
            if (C2461a.m6124a().mo16390b(MBridgeConstans.AUTHORITY_SERIAL_ID).equals("")) {
                this.f20491c.mo56931d(1);
            }
            if (C2461a.m6124a().mo16390b(MBridgeConstans.AUTHORITY_OTHER).equals("")) {
                this.f20491c.mo56932e(1);
            }
            this.f20490a.add(MBridgeConstans.AUTHORITY_GENERAL_DATA);
            this.f20490a.add(MBridgeConstans.AUTHORITY_DEVICE_ID);
            this.f20490a.add(MBridgeConstans.AUTHORITY_SERIAL_ID);
            this.f20490a.add(MBridgeConstans.AUTHORITY_OTHER);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static C8395a m23879a() {
        if (f20489b == null) {
            synchronized (C8395a.class) {
                if (f20489b == null) {
                    f20489b = new C8395a();
                }
            }
        }
        return f20489b;
    }

    /* renamed from: a */
    public final void mo56940a(String str, int i) {
        if (this.f20491c == null) {
            return;
        }
        if (str.equals(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            this.f20491c.mo56929b(i);
        } else if (str.equals(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            this.f20491c.mo56930c(i);
        } else if (str.equals(MBridgeConstans.AUTHORITY_ALL_INFO)) {
            this.f20491c.mo56928a(i);
        } else if (str.equals(MBridgeConstans.AUTHORITY_SERIAL_ID)) {
            this.f20491c.mo56931d(i);
        } else if (str.equals(MBridgeConstans.AUTHORITY_OTHER)) {
            this.f20491c.mo56932e(i);
        }
    }

    /* renamed from: b */
    public final AuthorityInfoBean mo56942b() {
        AuthorityInfoBean authorityInfoBean = this.f20491c;
        if (authorityInfoBean != null) {
            return authorityInfoBean;
        }
        return new AuthorityInfoBean().mo56928a(1);
    }

    /* renamed from: b */
    private int m23880b(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                String b = C2461a.m6124a().mo16390b(str);
                if (TextUtils.isEmpty(b)) {
                    return 0;
                }
                return Integer.parseInt(b);
            }
        } catch (Exception e) {
            C8672v.m24878d("SDKAuthorityController", e.getMessage());
        }
        return 0;
    }

    /* renamed from: c */
    private int m23881c(String str) {
        C2440a b = C2445b.m6020a().mo16286b(C8388a.m23845e().mo56914h());
        if (b == null) {
            b = C2445b.m6020a().mo16285b();
        }
        if (str.equals(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            return b.mo16147B();
        }
        if (str.equals(MBridgeConstans.AUTHORITY_DEVICE_ID)) {
            return b.mo16148C();
        }
        if (str.equals(MBridgeConstans.AUTHORITY_SERIAL_ID)) {
            return b.mo16146A();
        }
        return -1;
    }

    /* renamed from: a */
    public final boolean mo56941a(String str) {
        boolean z;
        boolean z2;
        C2440a b = C2445b.m6020a().mo16286b(C8388a.m23845e().mo56914h());
        boolean z3 = false;
        if (b == null) {
            b = C2445b.m6020a().mo16285b();
            z = true;
        } else {
            z = false;
        }
        int D = b.mo16149D();
        if (D != 0 ? !(D == 1 && m23881c(str) == 1) : !(m23880b(str) == 1 && m23881c(str) == 1)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (str.equals(MBridgeConstans.AUTHORITY_OTHER)) {
            z2 = m23880b(str) == 1;
        }
        if (!str.equals(MBridgeConstans.AUTHORITY_DEVICE_ID) || m23879a().f20492d != 2) {
            return z2;
        }
        if (!b.mo16205aw() && !z && m23880b(str) == 1) {
            z3 = true;
        }
        return z3;
    }

    /* renamed from: c */
    public final String mo56944c() {
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < this.f20490a.size(); i++) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("keyname", String.valueOf(this.f20490a.get(i)));
                jSONObject.put("client_status", m23880b(this.f20490a.get(i)));
                jSONObject.put("server_status", m23881c(this.f20490a.get(i)));
                jSONArray.put(jSONObject);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONArray.toString();
    }

    /* renamed from: a */
    public final void mo56939a(int i) {
        if (this.f20491c != null) {
            int i2 = 1;
            if (i != 1) {
                i2 = 2;
            }
            this.f20492d = i2;
        }
    }

    /* renamed from: d */
    public final boolean mo56945d() {
        int i = this.f20492d;
        return i == 1 || i == 3;
    }

    /* renamed from: b */
    public final void mo56943b(int i) {
        C2461a.m6124a().mo16386a(MBridgeConstans.AUTHORITY_DNT, i);
    }

    /* renamed from: e */
    public final int mo56946e() {
        return this.f20492d;
    }
}
