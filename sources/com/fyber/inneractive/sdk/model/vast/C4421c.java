package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.response.C5237i;
import com.fyber.inneractive.sdk.util.IAlog;
import com.smaato.sdk.video.vast.model.StaticResource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.model.vast.c */
public class C4421c implements C5237i {

    /* renamed from: a */
    public C4425g f10868a;

    /* renamed from: b */
    public C4426h f10869b;

    /* renamed from: c */
    public int f10870c;

    /* renamed from: d */
    public int f10871d;

    /* renamed from: e */
    public String f10872e;

    /* renamed from: f */
    public String f10873f;

    /* renamed from: g */
    public String f10874g;

    /* renamed from: h */
    public Map<C4435q, List<String>> f10875h = new HashMap();

    public C4421c(C4425g gVar, int i, int i2, String str) {
        this.f10868a = gVar;
        this.f10870c = i;
        this.f10871d = i2;
        this.f10872e = str;
    }

    /* renamed from: a */
    public void mo24613a(C4435q qVar, String str) {
        List list = this.f10875h.get(qVar);
        if (list == null) {
            list = new ArrayList();
            this.f10875h.put(qVar, list);
        }
        list.add(str);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Companion: ");
        sb.append(" w:");
        sb.append(this.f10870c);
        sb.append(" h:");
        sb.append(this.f10871d);
        sb.append(" type:");
        sb.append(this.f10868a.toString());
        sb.append(" creativeType: ");
        C4426h hVar = this.f10869b;
        sb.append(hVar != null ? hVar.f10900a : "none");
        sb.append(" ctr:");
        sb.append(this.f10874g);
        sb.append(" events:");
        sb.append(this.f10875h);
        return sb.toString();
    }

    /* renamed from: a */
    public List<String> mo24589a(C4435q qVar) {
        Map<C4435q, List<String>> map = this.f10875h;
        if (map == null) {
            return null;
        }
        return map.get(qVar);
    }

    /* renamed from: a */
    public JSONObject mo24612a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("w", this.f10870c);
            jSONObject.put("h", this.f10871d);
            jSONObject.put("type", this.f10868a.toString());
            C4426h hVar = this.f10869b;
            jSONObject.put(StaticResource.CREATIVE_TYPE, hVar != null ? hVar.f10900a : "none");
            jSONObject.put("content", this.f10873f);
        } catch (JSONException e) {
            IAlog.m16446a("Vast Parser: Failed creating Companion json object: %s", e.getMessage());
        }
        return jSONObject;
    }
}
