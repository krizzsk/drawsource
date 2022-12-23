package com.inmobi.media;

import android.os.Build;
import androidx.browser.trusted.sharing.ShareTarget;
import com.inmobi.media.C6094fv;
import com.inmobi.media.C6207ij;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.dk */
/* compiled from: TokenRequest */
public final class C5929dk extends C6156ha {

    /* renamed from: a */
    public String f15013a;

    /* renamed from: b */
    public Map<String, String> f15014b;

    public C5929dk(C6236ja jaVar) {
        super(ShareTarget.METHOD_POST, (String) null, jaVar, false, ShareTarget.ENCODING_TYPE_URL_ENCODED);
        this.f15538s = C6183hw.m18332f();
        this.f15534o = true;
        mo35339a(C6183hw.m18331e());
    }

    /* renamed from: a */
    public final void mo34869a() {
        String d;
        super.mo34869a();
        C5872cl a = C6273ju.m18658a();
        if (a.f14830a != null) {
            this.f15527h.put("ufid", a.f14830a);
        }
        Map map = this.f15527h;
        StringBuilder sb = new StringBuilder();
        sb.append(a.f14831b);
        map.put("is-unifid-service-used", sb.toString());
        this.f15527h.putAll(C6240jd.m18548a().mo35468d());
        this.f15527h.putAll(C6220io.m18469a());
        this.f15527h.put("d-media-volume", String.valueOf(C6210ik.m18423a(C6183hw.m18324c(), this.f15537r)));
        mo35344d(this.f15527h);
        if (this.f15013a != null) {
            this.f15527h.put("p-keywords", this.f15013a);
        }
        Map<String, String> map2 = this.f15014b;
        if (map2 != null) {
            for (Map.Entry next : map2.entrySet()) {
                if (!this.f15527h.containsKey(next.getKey())) {
                    this.f15527h.put((String) next.getKey(), (String) next.getValue());
                }
            }
        }
        JSONObject jSONObject = ((C6120gh) C6094fv.m18084a("signals", this.f15538s, (C6094fv.C6097c) null)).ext;
        if (jSONObject != null && jSONObject.length() > 0) {
            this.f15527h.put("im-ext", jSONObject.toString());
        }
        if (Build.VERSION.SDK_INT >= 29 && (d = C6215il.m18452d()) != null) {
            this.f15527h.put("d-device-gesture-margins", d);
        }
        Map map3 = this.f15527h;
        C6074ft ftVar = (C6074ft) C6094fv.m18084a(CampaignUnit.JSON_KEY_ADS, this.f15538s, (C6094fv.C6097c) null);
        boolean z = true;
        if (!(ftVar != null && ftVar.cctEnabled) || C6155h.m18219a(C6183hw.m18324c()) == null) {
            z = false;
        }
        map3.put("cct-enabled", String.valueOf(z));
        this.f15527h.putAll(C6221ip.m18481d());
        this.f15527h.putAll(C6215il.m18451c());
        this.f15527h.putAll(C6250ji.m18585a("InMobi"));
        m18221a(this.f15527h, C6210ik.m18430c());
        m18221a(this.f15527h, C6210ik.m18431d());
        m18221a(this.f15527h, C6210ik.m18432e());
        m18221a(this.f15527h, C6210ik.m18433f());
        m18221a(this.f15527h, C6210ik.m18434g());
        m18221a(this.f15527h, C6210ik.m18435h());
        m18221a(this.f15527h, C6210ik.m18436i());
        m18221a(this.f15527h, C6210ik.m18437j());
        m18221a(this.f15527h, C6210ik.m18438k());
        m18221a(this.f15527h, C6210ik.m18439l());
        m18221a(this.f15527h, C6210ik.m18440m());
        C6207ij.C6209a.f15663a.mo35426a(this.f15527h);
    }
}
