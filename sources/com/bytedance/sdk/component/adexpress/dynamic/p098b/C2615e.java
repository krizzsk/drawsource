package com.bytedance.sdk.component.adexpress.dynamic.p098b;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.RewardPlus;
import com.tapjoy.TJAdUnitConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.b.e */
/* compiled from: DynamicLayoutBrick */
public class C2615e {

    /* renamed from: a */
    public static final Map<String, Integer> f5587a;

    /* renamed from: b */
    private String f5588b;

    /* renamed from: c */
    private String f5589c;

    /* renamed from: d */
    private C2616f f5590d;

    /* renamed from: e */
    private C2616f f5591e;

    /* renamed from: f */
    private String f5592f;

    static {
        HashMap hashMap = new HashMap();
        f5587a = hashMap;
        hashMap.put("root", 8);
        f5587a.put("footer", 6);
        f5587a.put("empty", 6);
        f5587a.put("title", 0);
        f5587a.put("subtitle", 0);
        f5587a.put("source", 0);
        f5587a.put("score-count", 0);
        f5587a.put("text_star", 0);
        f5587a.put("text", 0);
        f5587a.put("tag-group", 17);
        f5587a.put("app-version", 0);
        f5587a.put("development-name", 0);
        f5587a.put("privacy-detail", 23);
        f5587a.put("image", 1);
        f5587a.put("image-wide", 1);
        f5587a.put("image-square", 1);
        f5587a.put("image-long", 1);
        f5587a.put("image-splash", 1);
        f5587a.put("image-cover", 1);
        f5587a.put("app-icon", 1);
        f5587a.put("icon-download", 1);
        f5587a.put("logoad", 4);
        f5587a.put("logounion", 5);
        f5587a.put("logo-union", 9);
        f5587a.put("dislike", 3);
        f5587a.put("close", 3);
        f5587a.put("close-fill", 3);
        f5587a.put("webview-close", 22);
        f5587a.put("feedback-dislike", 12);
        f5587a.put("button", 2);
        f5587a.put("downloadWithIcon", 2);
        f5587a.put("downloadButton", 2);
        f5587a.put("fillButton", 2);
        f5587a.put("laceButton", 2);
        f5587a.put("cardButton", 2);
        f5587a.put("colourMixtureButton", 2);
        f5587a.put("arrowButton", 1);
        f5587a.put("download-progress-button", 2);
        f5587a.put("vessel", 6);
        f5587a.put("image-group", 6);
        f5587a.put("custom-component-vessel", 6);
        f5587a.put("carousel", 24);
        f5587a.put("video-hd", 7);
        f5587a.put("video", 7);
        f5587a.put("video-vd", 7);
        f5587a.put("muted", 10);
        f5587a.put("star", 11);
        f5587a.put("skip-countdowns", 19);
        f5587a.put("skip-with-countdowns-skip-btn", 21);
        f5587a.put("skip-with-countdowns-video-countdown", 13);
        f5587a.put("skip-with-countdowns-skip-countdown", 20);
        f5587a.put("skip-with-time", 14);
        f5587a.put("skip-with-time-countdown", 13);
        f5587a.put("skip-with-time-skip-btn", 15);
        f5587a.put("skip", 15);
        f5587a.put("timedown", 13);
        f5587a.put(RewardPlus.ICON, 16);
        f5587a.put("scoreCountWithIcon", 6);
        f5587a.put("split-line", 18);
        f5587a.put("creative-playable-bait", 0);
        f5587a.put("score-count-type-2", 0);
    }

    /* renamed from: a */
    public int mo16873a() {
        if (TextUtils.isEmpty(this.f5588b)) {
            return 0;
        }
        if (this.f5588b.equals("logo")) {
            String str = this.f5588b + this.f5589c;
            this.f5588b = str;
            if (str.contains("logoad")) {
                return 4;
            }
            if (this.f5588b.contains("logounion")) {
                return 5;
            }
        }
        if (f5587a.get(this.f5588b) != null) {
            return f5587a.get(this.f5588b).intValue();
        }
        return -1;
    }

    /* renamed from: b */
    public String mo16876b() {
        return this.f5588b;
    }

    /* renamed from: a */
    public void mo16875a(String str) {
        this.f5588b = str;
    }

    /* renamed from: c */
    public String mo16879c() {
        return this.f5589c;
    }

    /* renamed from: b */
    public void mo16878b(String str) {
        this.f5589c = str;
    }

    /* renamed from: c */
    public void mo16880c(String str) {
        this.f5592f = str;
    }

    /* renamed from: d */
    public String mo16881d() {
        return this.f5592f;
    }

    /* renamed from: e */
    public C2616f mo16882e() {
        return this.f5590d;
    }

    /* renamed from: a */
    public void mo16874a(C2616f fVar) {
        this.f5590d = fVar;
    }

    /* renamed from: b */
    public void mo16877b(C2616f fVar) {
        this.f5591e = fVar;
    }

    /* renamed from: f */
    public C2616f mo16883f() {
        return this.f5591e;
    }

    public String toString() {
        return "DynamicLayoutBrick{type='" + this.f5588b + '\'' + ", data='" + this.f5589c + '\'' + ", value=" + this.f5590d + ", themeValue=" + this.f5591e + ", dataExtraInfo='" + this.f5592f + '\'' + '}';
    }

    /* renamed from: a */
    public static void m6765a(JSONObject jSONObject, C2615e eVar) {
        if (jSONObject != null && eVar != null) {
            eVar.mo16875a(jSONObject.optString("type", "root"));
            eVar.mo16878b(jSONObject.optString("data"));
            eVar.mo16880c(jSONObject.optString("dataExtraInfo"));
            C2616f c = C2616f.m6778c(jSONObject.optJSONObject(TJAdUnitConstants.String.USAGE_TRACKER_VALUES));
            C2616f c2 = C2616f.m6778c(jSONObject.optJSONObject("nightThemeValues"));
            eVar.mo16874a(c);
            eVar.mo16877b(c2);
        }
    }
}
