package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.C5297m0;
import com.smaato.sdk.video.vast.model.MediaFile;
import com.tapjoy.TJAdUnitConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.a0 */
public class C4204a0 implements C4209b0, C5297m0.C5298a {

    /* renamed from: a */
    public Boolean f10369a;

    /* renamed from: b */
    public Integer f10370b = 5000;

    /* renamed from: c */
    public Integer f10371c = 0;

    /* renamed from: d */
    public Boolean f10372d;

    /* renamed from: e */
    public Orientation f10373e;

    /* renamed from: f */
    public Integer f10374f;

    /* renamed from: g */
    public Integer f10375g;

    /* renamed from: h */
    public Skip f10376h;

    /* renamed from: i */
    public TapAction f10377i;

    /* renamed from: j */
    public UnitDisplayType f10378j;

    /* renamed from: k */
    public List<Integer> f10379k;

    public C4204a0() {
        Boolean bool = Boolean.TRUE;
        this.f10369a = bool;
        this.f10372d = bool;
        this.f10374f = 0;
        this.f10375g = 2048;
        this.f10376h = Skip.fromValue(0);
        this.f10379k = new ArrayList();
    }

    /* renamed from: a */
    public JSONObject mo24189a() {
        JSONObject jSONObject = new JSONObject();
        C5297m0.m16518a(jSONObject, "autoPlay", this.f10369a);
        C5297m0.m16518a(jSONObject, MediaFile.MAX_BITRATE, this.f10370b);
        C5297m0.m16518a(jSONObject, MediaFile.MIN_BITRATE, this.f10371c);
        C5297m0.m16518a(jSONObject, "muted", this.f10372d);
        C5297m0.m16518a(jSONObject, TJAdUnitConstants.String.ORIENTATION, this.f10373e);
        C5297m0.m16518a(jSONObject, "padding", this.f10374f);
        C5297m0.m16518a(jSONObject, "pivotBitrate", this.f10375g);
        C5297m0.m16518a(jSONObject, "skip", this.f10376h);
        C5297m0.m16518a(jSONObject, "tapAction", this.f10377i);
        C5297m0.m16518a(jSONObject, "unitDisplayType", this.f10378j);
        JSONArray jSONArray = new JSONArray();
        List<Integer> list = this.f10379k;
        if (list != null) {
            for (Integer next : list) {
                if (next != null) {
                    jSONArray.put(next);
                }
            }
        }
        C5297m0.m16518a(jSONObject, "filterApi", jSONArray);
        return jSONObject;
    }

    /* renamed from: b */
    public Boolean mo24190b() {
        return this.f10369a;
    }
}
