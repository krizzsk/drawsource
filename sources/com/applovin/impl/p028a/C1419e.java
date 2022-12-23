package com.applovin.impl.p028a;

import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.p049ad.C1835b;
import com.applovin.impl.sdk.utils.C2098r;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.google.android.exoplayer2.util.MimeTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.a.e */
public class C1419e {

    /* renamed from: c */
    private static final List<String> f1588c = Arrays.asList(new String[]{"video/mp4", "video/webm", "video/3gpp", MimeTypes.VIDEO_MATROSKA});

    /* renamed from: a */
    protected List<C2098r> f1589a = new ArrayList();

    /* renamed from: b */
    private final C1969m f1590b;

    /* renamed from: d */
    private final JSONObject f1591d;

    /* renamed from: e */
    private final JSONObject f1592e;

    /* renamed from: f */
    private final C1835b f1593f;

    /* renamed from: g */
    private final long f1594g = System.currentTimeMillis();

    public C1419e(JSONObject jSONObject, JSONObject jSONObject2, C1835b bVar, C1969m mVar) {
        this.f1590b = mVar;
        this.f1591d = jSONObject;
        this.f1592e = jSONObject2;
        this.f1593f = bVar;
    }

    /* renamed from: a */
    public int mo12897a() {
        return this.f1589a.size();
    }

    /* renamed from: b */
    public List<C2098r> mo12898b() {
        return this.f1589a;
    }

    /* renamed from: c */
    public JSONObject mo12899c() {
        return this.f1591d;
    }

    /* renamed from: d */
    public JSONObject mo12900d() {
        return this.f1592e;
    }

    /* renamed from: e */
    public C1835b mo12901e() {
        return this.f1593f;
    }

    /* renamed from: f */
    public long mo12902f() {
        return this.f1594g;
    }

    /* renamed from: g */
    public List<String> mo12903g() {
        List<String> explode = CollectionUtils.explode(JsonUtils.getString(this.f1591d, "vast_preferred_video_types", (String) null));
        return !explode.isEmpty() ? explode : f1588c;
    }

    /* renamed from: h */
    public int mo12904h() {
        return Utils.getVideoCompletionPercent(this.f1591d);
    }
}
