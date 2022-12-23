package com.bykv.p054vk.openvk.component.video.api.p071c;

import android.text.TextUtils;
import com.bykv.p054vk.openvk.component.video.api.p074f.C2414b;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* renamed from: com.bykv.vk.openvk.component.video.api.c.b */
/* compiled from: VideoInfo */
public class C2400b {

    /* renamed from: a */
    private int f4874a;

    /* renamed from: b */
    private int f4875b;

    /* renamed from: c */
    private long f4876c;

    /* renamed from: d */
    private double f4877d;

    /* renamed from: e */
    private String f4878e;

    /* renamed from: f */
    private String f4879f;

    /* renamed from: g */
    private String f4880g;

    /* renamed from: h */
    private String f4881h;

    /* renamed from: i */
    private String f4882i;

    /* renamed from: j */
    private String f4883j;

    /* renamed from: k */
    private int f4884k;

    /* renamed from: l */
    private int f4885l;

    /* renamed from: m */
    private int f4886m = 0;

    /* renamed from: n */
    private int f4887n = 0;

    /* renamed from: o */
    private int f4888o = 0;

    /* renamed from: p */
    private int f4889p = 0;

    /* renamed from: q */
    private int f4890q = 307200;

    /* renamed from: a */
    public int mo15929a() {
        return this.f4884k;
    }

    /* renamed from: a */
    public void mo15931a(int i) {
        this.f4884k = i;
    }

    /* renamed from: b */
    public int mo15934b() {
        return this.f4874a;
    }

    /* renamed from: b */
    public void mo15935b(int i) {
        this.f4874a = i;
    }

    /* renamed from: c */
    public int mo15937c() {
        return this.f4875b;
    }

    /* renamed from: c */
    public void mo15938c(int i) {
        this.f4875b = i;
    }

    /* renamed from: d */
    public int mo15940d() {
        return this.f4885l;
    }

    /* renamed from: d */
    public void mo15941d(int i) {
        this.f4885l = i;
    }

    /* renamed from: e */
    public long mo15943e() {
        return this.f4876c;
    }

    /* renamed from: a */
    public void mo15932a(long j) {
        this.f4876c = j;
    }

    /* renamed from: f */
    public double mo15946f() {
        return this.f4877d;
    }

    /* renamed from: a */
    public void mo15930a(double d) {
        this.f4877d = d;
    }

    /* renamed from: g */
    public String mo15949g() {
        return this.f4878e;
    }

    /* renamed from: a */
    public void mo15933a(String str) {
        this.f4878e = str;
    }

    /* renamed from: h */
    public String mo15951h() {
        return this.f4879f;
    }

    /* renamed from: b */
    public void mo15936b(String str) {
        this.f4879f = str;
    }

    /* renamed from: i */
    public String mo15953i() {
        return this.f4880g;
    }

    /* renamed from: c */
    public void mo15939c(String str) {
        this.f4880g = str;
    }

    /* renamed from: j */
    public String mo15955j() {
        return this.f4881h;
    }

    /* renamed from: d */
    public void mo15942d(String str) {
        this.f4881h = str;
    }

    /* renamed from: k */
    public String mo15956k() {
        return this.f4882i;
    }

    /* renamed from: e */
    public void mo15945e(String str) {
        this.f4882i = str;
    }

    /* renamed from: l */
    public String mo15957l() {
        if (TextUtils.isEmpty(this.f4883j)) {
            this.f4883j = C2414b.m5821a(this.f4880g);
        }
        return this.f4883j;
    }

    /* renamed from: f */
    public void mo15948f(String str) {
        this.f4883j = str;
    }

    /* renamed from: m */
    public int mo15958m() {
        if (this.f4890q < 0) {
            this.f4890q = 307200;
        }
        long j = this.f4876c;
        if (((long) this.f4890q) > j) {
            this.f4890q = (int) j;
        }
        return this.f4890q;
    }

    /* renamed from: e */
    public void mo15944e(int i) {
        this.f4890q = i;
    }

    /* renamed from: n */
    public int mo15959n() {
        return this.f4888o;
    }

    /* renamed from: f */
    public void mo15947f(int i) {
        this.f4888o = i;
    }

    /* renamed from: o */
    public int mo15960o() {
        return this.f4889p;
    }

    /* renamed from: g */
    public void mo15950g(int i) {
        this.f4889p = i;
    }

    /* renamed from: p */
    public JSONObject mo15961p() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cover_height", mo15934b());
            jSONObject.put("cover_url", mo15951h());
            jSONObject.put("cover_width", mo15937c());
            jSONObject.put(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD, mo15955j());
            jSONObject.put("file_hash", mo15957l());
            jSONObject.put("resolution", mo15949g());
            jSONObject.put("size", mo15943e());
            jSONObject.put("video_duration", mo15946f());
            jSONObject.put("video_url", mo15953i());
            jSONObject.put("playable_download_url", mo15956k());
            jSONObject.put("if_playable_loading_show", mo15962q());
            jSONObject.put("remove_loading_page_type", mo15963r());
            jSONObject.put("fallback_endcard_judge", mo15929a());
            jSONObject.put("video_preload_size", mo15958m());
            jSONObject.put("reward_video_cached_type", mo15959n());
            jSONObject.put("execute_cached_type", mo15960o());
            jSONObject.put("endcard_render", mo15940d());
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: q */
    public int mo15962q() {
        return this.f4886m;
    }

    /* renamed from: h */
    public void mo15952h(int i) {
        this.f4886m = i;
    }

    /* renamed from: r */
    public int mo15963r() {
        return this.f4887n;
    }

    /* renamed from: i */
    public void mo15954i(int i) {
        this.f4887n = i;
    }

    /* renamed from: s */
    public boolean mo15964s() {
        return this.f4889p == 1;
    }

    /* renamed from: t */
    public boolean mo15965t() {
        return this.f4888o == 0;
    }
}
