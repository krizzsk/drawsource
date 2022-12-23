package com.fyber.inneractive.sdk.config.remote;

import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.smaato.sdk.video.vast.model.MediaFile;
import com.tapjoy.TJAdUnitConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.remote.j */
public class C4279j {

    /* renamed from: a */
    public Boolean f10524a;

    /* renamed from: b */
    public Integer f10525b;

    /* renamed from: c */
    public Integer f10526c;

    /* renamed from: d */
    public Skip f10527d;

    /* renamed from: e */
    public Boolean f10528e;

    /* renamed from: f */
    public TapAction f10529f;

    /* renamed from: g */
    public Orientation f10530g;

    /* renamed from: h */
    public Integer f10531h;

    /* renamed from: i */
    public Integer f10532i;

    /* renamed from: j */
    public UnitDisplayType f10533j;

    /* renamed from: k */
    public List<Integer> f10534k = new ArrayList();

    /* renamed from: a */
    public static C4279j m13311a(JSONObject jSONObject) {
        Integer num = null;
        if (jSONObject == null) {
            return null;
        }
        C4279j jVar = new C4279j();
        Integer valueOf = Integer.valueOf(jSONObject.optInt(MediaFile.MAX_BITRATE, Integer.MIN_VALUE));
        Integer valueOf2 = Integer.valueOf(jSONObject.optInt(MediaFile.MIN_BITRATE, Integer.MIN_VALUE));
        Integer valueOf3 = Integer.valueOf(jSONObject.optInt("pivotBitrate", Integer.MIN_VALUE));
        Integer valueOf4 = Integer.valueOf(jSONObject.optInt("padding", Integer.MIN_VALUE));
        if (valueOf.intValue() == Integer.MIN_VALUE) {
            valueOf = null;
        }
        jVar.f10525b = valueOf;
        if (valueOf2.intValue() == Integer.MIN_VALUE) {
            valueOf2 = null;
        }
        jVar.f10526c = valueOf2;
        jVar.f10527d = Skip.fromValue(Integer.valueOf(jSONObject.optInt("skip", Integer.MIN_VALUE)));
        jVar.f10528e = jSONObject.has("muted") ? Boolean.valueOf(jSONObject.optBoolean("muted", true)) : null;
        jVar.f10524a = jSONObject.has("autoPlay") ? Boolean.valueOf(jSONObject.optBoolean("autoPlay", true)) : null;
        jVar.f10530g = Orientation.fromValue(jSONObject.optString(TJAdUnitConstants.String.ORIENTATION));
        jVar.f10529f = TapAction.fromValue(jSONObject.optString("tap"));
        if (valueOf3.intValue() == Integer.MIN_VALUE) {
            valueOf3 = null;
        }
        jVar.f10531h = valueOf3;
        if (valueOf4.intValue() != Integer.MIN_VALUE) {
            num = valueOf4;
        }
        jVar.f10532i = num;
        jVar.f10533j = UnitDisplayType.fromValue(jSONObject.optString("unitDisplayType"));
        JSONArray optJSONArray = jSONObject.optJSONArray("filterApi");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                int optInt = optJSONArray.optInt(i, Integer.MIN_VALUE);
                if (optInt != Integer.MIN_VALUE) {
                    jVar.f10534k.add(Integer.valueOf(optInt));
                }
            }
        }
        return jVar;
    }
}
