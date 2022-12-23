package com.bytedance.sdk.openadsdk.core.p149e;

import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.p170h.C3750a;
import com.bytedance.sdk.openadsdk.p170h.C3753b;
import com.bytedance.sdk.openadsdk.p170h.p171a.C3751a;
import com.bytedance.sdk.openadsdk.p170h.p171a.C3752b;
import com.google.firebase.messaging.Constants;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.e.b */
/* compiled from: AdLogInfoModel */
public class C3403b {

    /* renamed from: a */
    public String f8198a;

    /* renamed from: b */
    public int f8199b;

    /* renamed from: c */
    public int f8200c = 1;

    /* renamed from: d */
    public ArrayList<Integer> f8201d;

    /* renamed from: e */
    public AdSlot f8202e;

    /* renamed from: a */
    public static void m10134a(C3403b bVar) {
        if (bVar != null && bVar.mo19398d() != null) {
            C3753b.m12287a().mo20569a((C3750a) new C3750a(bVar) {

                /* renamed from: a */
                final /* synthetic */ C3403b f8203a;

                {
                    this.f8203a = r1;
                }

                /* renamed from: a */
                public C3751a mo18582a() throws Exception {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(Constants.MessagePayloadKeys.FROM, this.f8203a.mo19397c());
                    jSONObject.put("err_code", this.f8203a.mo19395b());
                    jSONObject.put("server_res_str", this.f8203a.mo19390a());
                    if (this.f8203a.mo19399e() != null && this.f8203a.mo19399e().size() > 0) {
                        jSONObject.put("mate_unavailable_code_list", new JSONArray(this.f8203a.mo19399e()).toString());
                    }
                    C2905l.m8107a("AdLogInfoModel", "rd_client_custom_error = ", jSONObject);
                    return C3752b.m12257b().mo20544a("rd_client_custom_error").mo20542a(this.f8203a.mo19398d().getDurationSlotType()).mo20546b(jSONObject.toString());
                }
            });
        }
    }

    /* renamed from: a */
    public String mo19390a() {
        return this.f8198a;
    }

    /* renamed from: a */
    public void mo19391a(int i) {
        this.f8199b = i;
    }

    /* renamed from: a */
    public void mo19392a(AdSlot adSlot) {
        this.f8202e = adSlot;
    }

    /* renamed from: a */
    public void mo19393a(String str) {
        this.f8198a = str;
    }

    /* renamed from: a */
    public void mo19394a(ArrayList<Integer> arrayList) {
        this.f8201d = arrayList;
    }

    /* renamed from: b */
    public int mo19395b() {
        return this.f8199b;
    }

    /* renamed from: b */
    public void mo19396b(int i) {
        this.f8200c = i;
    }

    /* renamed from: c */
    public int mo19397c() {
        return this.f8200c;
    }

    /* renamed from: d */
    public AdSlot mo19398d() {
        return this.f8202e;
    }

    /* renamed from: e */
    public ArrayList<Integer> mo19399e() {
        return this.f8201d;
    }
}
