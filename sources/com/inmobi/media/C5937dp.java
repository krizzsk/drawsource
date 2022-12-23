package com.inmobi.media;

import com.adjust.sdk.Constants;
import com.google.android.exoplayer2.util.MimeTypes;
import com.tapjoy.TJAdUnitConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.dp */
/* compiled from: VastCompanionAd */
public class C5937dp {

    /* renamed from: f */
    static final ArrayList<String> f15028f = new ArrayList<>(Arrays.asList(new String[]{MimeTypes.IMAGE_JPEG, "image/png"}));
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static final String f15029h = C5937dp.class.getSimpleName();

    /* renamed from: a */
    int f15030a;

    /* renamed from: b */
    int f15031b;

    /* renamed from: c */
    List<C5938a> f15032c = new ArrayList();

    /* renamed from: d */
    public List<C5868ci> f15033d = new ArrayList();

    /* renamed from: e */
    public String f15034e = null;

    /* renamed from: g */
    public boolean f15035g;

    /* renamed from: i */
    private String f15036i;

    /* renamed from: com.inmobi.media.dp$a */
    /* compiled from: VastCompanionAd */
    public static final class C5938a {

        /* renamed from: a */
        public byte f15037a;

        /* renamed from: b */
        public String f15038b;

        C5938a(byte b, String str) {
            this.f15037a = b;
            this.f15038b = str;
        }

        public final String toString() {
            JSONObject jSONObject = new JSONObject();
            try {
                byte b = this.f15037a;
                jSONObject.put("type", b != 1 ? b != 2 ? b != 3 ? "unknown" : "iframe" : TJAdUnitConstants.String.HTML : "static");
                jSONObject.put("content", this.f15038b);
                return jSONObject.toString();
            } catch (JSONException e) {
                String unused = C5937dp.f15029h;
                C6130gj.m18161a().mo35310a(new C6167hk(e));
                return "";
            }
        }
    }

    public C5937dp(int i, int i2, String str) {
        this.f15036i = str;
        this.f15030a = i;
        this.f15031b = i2;
    }

    /* renamed from: a */
    public final List<C5938a> mo35045a(int i) {
        ArrayList arrayList = new ArrayList();
        for (C5938a next : this.f15032c) {
            if (next.f15037a == i) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo35048a(C5938a aVar) {
        this.f15032c.add(aVar);
    }

    /* renamed from: a */
    public final List<C5868ci> mo35046a(String str) {
        ArrayList arrayList = new ArrayList();
        for (C5868ci next : this.f15033d) {
            if (next.f14815d.equals(str)) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo35047a(C5868ci ciVar) {
        this.f15033d.add(ciVar);
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.f15036i != null) {
                jSONObject.put("id", this.f15036i);
            }
            jSONObject.put("width", this.f15030a);
            jSONObject.put("height", this.f15031b);
            jSONObject.put("clickThroughUrl", this.f15034e);
            JSONArray jSONArray = new JSONArray();
            for (C5938a aVar : this.f15032c) {
                jSONArray.put(aVar.toString());
            }
            jSONObject.put("resources", jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            for (C5868ci ciVar : this.f15033d) {
                jSONArray2.put(ciVar.toString());
            }
            jSONObject.put(Constants.ADJUST_PREINSTALL_CONTENT_URI_PATH, jSONArray2);
            return jSONObject.toString();
        } catch (JSONException e) {
            C6130gj.m18161a().mo35310a(new C6167hk(e));
            return "";
        }
    }
}
