package com.bytedance.sdk.openadsdk.core.p154j;

import com.bytedance.sdk.openadsdk.core.p154j.p155a.C3474a;
import com.bytedance.sdk.openadsdk.core.p154j.p157b.C3487c;
import com.bytedance.sdk.openadsdk.core.p154j.p158c.C3493a;
import com.smaato.sdk.video.vast.model.StaticResource;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.core.j.c */
/* compiled from: VastResource */
public class C3491c {

    /* renamed from: a */
    protected int f8718a;

    /* renamed from: b */
    protected int f8719b;

    /* renamed from: c */
    protected C3493a.C3496a f8720c;

    /* renamed from: d */
    protected C3493a.C3497b f8721d;

    /* renamed from: e */
    protected String f8722e;

    /* renamed from: f */
    protected List<C3487c> f8723f = new ArrayList();

    /* renamed from: g */
    protected List<C3487c> f8724g = new ArrayList();

    /* renamed from: h */
    protected String f8725h;

    /* renamed from: i */
    private String f8726i;

    public C3491c(int i, int i2, C3493a.C3496a aVar, C3493a.C3497b bVar, String str, List<C3487c> list, List<C3487c> list2, String str2) {
        this.f8718a = i;
        this.f8719b = i2;
        this.f8720c = aVar;
        this.f8721d = bVar;
        this.f8722e = str;
        this.f8723f = list;
        this.f8724g = list2;
        this.f8725h = str2;
    }

    /* renamed from: b */
    public int mo19935b() {
        return this.f8718a;
    }

    /* renamed from: c */
    public int mo19937c() {
        return this.f8719b;
    }

    /* renamed from: a */
    public void mo19933a(long j) {
        C3487c.m10849b(this.f8723f, (C3474a) null, j, this.f8726i);
    }

    /* renamed from: b */
    public void mo19936b(long j) {
        C3487c.m10849b(this.f8724g, (C3474a) null, j, this.f8726i);
    }

    /* renamed from: a */
    public static float m10859a(int i, int i2, int i3, int i4, C3493a.C3497b bVar, C3493a.C3496a aVar) {
        if (i2 == 0 || i4 == 0) {
            return 0.0f;
        }
        float f = (float) i;
        float f2 = (float) i3;
        return m10860a(bVar, aVar) / ((Math.abs((f / ((float) i2)) - (f2 / ((float) i4))) + Math.abs((f - f2) / f)) + 1.0f);
    }

    /* renamed from: com.bytedance.sdk.openadsdk.core.j.c$1 */
    /* compiled from: VastResource */
    static /* synthetic */ class C34921 {

        /* renamed from: a */
        static final /* synthetic */ int[] f8727a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.bytedance.sdk.openadsdk.core.j.c.a$b[] r0 = com.bytedance.sdk.openadsdk.core.p154j.p158c.C3493a.C3497b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f8727a = r0
                com.bytedance.sdk.openadsdk.core.j.c.a$b r1 = com.bytedance.sdk.openadsdk.core.p154j.p158c.C3493a.C3497b.STATIC_RESOURCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f8727a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.bytedance.sdk.openadsdk.core.j.c.a$b r1 = com.bytedance.sdk.openadsdk.core.p154j.p158c.C3493a.C3497b.HTML_RESOURCE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f8727a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.bytedance.sdk.openadsdk.core.j.c.a$b r1 = com.bytedance.sdk.openadsdk.core.p154j.p158c.C3493a.C3497b.IFRAME_RESOURCE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.p154j.C3491c.C34921.<clinit>():void");
        }
    }

    /* renamed from: a */
    private static float m10860a(C3493a.C3497b bVar, C3493a.C3496a aVar) {
        int i = C34921.f8727a[bVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return i != 3 ? 0.0f : 1.0f;
            }
            return 1.2f;
        } else if (C3493a.C3496a.JAVASCRIPT.equals(aVar)) {
            return 1.0f;
        } else {
            if (C3493a.C3496a.IMAGE.equals(aVar)) {
                return 0.8f;
            }
            return 0.0f;
        }
    }

    /* renamed from: d */
    public String mo19938d() {
        int i = C34921.f8727a[this.f8721d.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return this.f8722e;
            }
            if (i != 3) {
                return null;
            }
            return "<iframe frameborder=\"0\" scrolling=\"no\" marginheight=\"0\" marginwidth=\"0\" style=\"border: 0px; margin: 0px;\" width=\"" + this.f8718a + "\" height=\"" + this.f8719b + "\" src=\"" + this.f8722e + "\"></iframe>";
        } else if (this.f8720c == C3493a.C3496a.IMAGE) {
            return "<html><head></head><body style=\"margin:0;padding:0\"><img src=\"" + this.f8722e + "\" width=\"100%\" style=\"max-width:100%;max-height:100%;\" /></body></html>";
        } else if (this.f8720c != C3493a.C3496a.JAVASCRIPT) {
            return null;
        } else {
            return "<script src=\"" + this.f8722e + "\"></script>";
        }
    }

    /* renamed from: e */
    public String mo19939e() {
        if (this.f8721d == C3493a.C3497b.STATIC_RESOURCE && this.f8720c == C3493a.C3496a.IMAGE) {
            return this.f8722e;
        }
        return null;
    }

    /* renamed from: a */
    public void mo19934a(String str) {
        this.f8726i = str;
    }

    /* renamed from: b */
    public static C3491c m10861b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        int optInt = jSONObject.optInt("width");
        int optInt2 = jSONObject.optInt("height");
        String optString = jSONObject.optString(StaticResource.CREATIVE_TYPE, C3493a.C3496a.NONE.toString());
        String optString2 = jSONObject.optString("resourceType", C3493a.C3497b.HTML_RESOURCE.toString());
        String optString3 = jSONObject.optString("contentUrl");
        String optString4 = jSONObject.optString("clickThroughUri");
        JSONArray optJSONArray = jSONObject.optJSONArray("clickTrackers");
        JSONArray optJSONArray2 = jSONObject.optJSONArray("creativeViewTrackers");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < optJSONArray.length(); i++) {
            arrayList.add(new C3487c.C3489a(optJSONArray.optString(i)).mo19932a());
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
            arrayList2.add(new C3487c.C3489a(optJSONArray2.optString(i2)).mo19932a());
        }
        return new C3491c(optInt, optInt2, C3493a.C3496a.valueOf(optString), C3493a.C3497b.valueOf(optString2), optString3, arrayList, arrayList2, optString4);
    }

    /* renamed from: a */
    public JSONObject mo19916a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("width", this.f8718a);
        jSONObject.put("height", this.f8719b);
        jSONObject.put(StaticResource.CREATIVE_TYPE, this.f8720c.toString());
        jSONObject.put("resourceType", this.f8721d.toString());
        jSONObject.put("contentUrl", this.f8722e);
        jSONObject.put("clickThroughUri", this.f8725h);
        jSONObject.put("clickTrackers", C3487c.m10848b(this.f8723f));
        jSONObject.put("creativeViewTrackers", C3487c.m10848b(this.f8724g));
        return jSONObject;
    }
}
