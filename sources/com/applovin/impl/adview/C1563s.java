package com.applovin.impl.adview;

import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.adview.s */
public class C1563s {

    /* renamed from: a */
    private final int f1991a;

    /* renamed from: b */
    private final int f1992b;

    /* renamed from: c */
    private final int f1993c;

    /* renamed from: d */
    private final int f1994d;

    /* renamed from: e */
    private final boolean f1995e;

    /* renamed from: f */
    private final int f1996f;

    /* renamed from: g */
    private final int f1997g;

    /* renamed from: h */
    private final int f1998h;

    /* renamed from: i */
    private final float f1999i;

    /* renamed from: j */
    private final float f2000j;

    public C1563s(JSONObject jSONObject, C1969m mVar) {
        if (C2102v.m5104a()) {
            C2102v A = mVar.mo14509A();
            A.mo15014c("VideoButtonProperties", "Updating video button properties with JSON = " + JsonUtils.maybeConvertToIndentedString(jSONObject));
        }
        this.f1991a = JsonUtils.getInt(jSONObject, "width", 64);
        this.f1992b = JsonUtils.getInt(jSONObject, "height", 7);
        this.f1993c = JsonUtils.getInt(jSONObject, "margin", 20);
        this.f1994d = JsonUtils.getInt(jSONObject, "gravity", 85);
        this.f1995e = JsonUtils.getBoolean(jSONObject, "tap_to_fade", false).booleanValue();
        this.f1996f = JsonUtils.getInt(jSONObject, "tap_to_fade_duration_milliseconds", 500);
        this.f1997g = JsonUtils.getInt(jSONObject, "fade_in_duration_milliseconds", 500);
        this.f1998h = JsonUtils.getInt(jSONObject, "fade_out_duration_milliseconds", 500);
        this.f1999i = JsonUtils.getFloat(jSONObject, "fade_in_delay_seconds", 1.0f);
        this.f2000j = JsonUtils.getFloat(jSONObject, "fade_out_delay_seconds", 6.0f);
    }

    /* renamed from: a */
    public int mo13230a() {
        return this.f1991a;
    }

    /* renamed from: b */
    public int mo13231b() {
        return this.f1992b;
    }

    /* renamed from: c */
    public int mo13232c() {
        return this.f1993c;
    }

    /* renamed from: d */
    public int mo13233d() {
        return this.f1994d;
    }

    /* renamed from: e */
    public boolean mo13234e() {
        return this.f1995e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1563s sVar = (C1563s) obj;
        if (this.f1991a == sVar.f1991a && this.f1992b == sVar.f1992b && this.f1993c == sVar.f1993c && this.f1994d == sVar.f1994d && this.f1995e == sVar.f1995e && this.f1996f == sVar.f1996f && this.f1997g == sVar.f1997g && this.f1998h == sVar.f1998h && Float.compare(sVar.f1999i, this.f1999i) == 0) {
            return Float.compare(sVar.f2000j, this.f2000j) == 0;
        }
        return false;
    }

    /* renamed from: f */
    public long mo13236f() {
        return (long) this.f1996f;
    }

    /* renamed from: g */
    public long mo13237g() {
        return (long) this.f1997g;
    }

    /* renamed from: h */
    public long mo13238h() {
        return (long) this.f1998h;
    }

    public int hashCode() {
        int i = ((((((((((((((this.f1991a * 31) + this.f1992b) * 31) + this.f1993c) * 31) + this.f1994d) * 31) + (this.f1995e ? 1 : 0)) * 31) + this.f1996f) * 31) + this.f1997g) * 31) + this.f1998h) * 31;
        float f = this.f1999i;
        int i2 = 0;
        int floatToIntBits = (i + (f != 0.0f ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.f2000j;
        if (f2 != 0.0f) {
            i2 = Float.floatToIntBits(f2);
        }
        return floatToIntBits + i2;
    }

    /* renamed from: i */
    public float mo13240i() {
        return this.f1999i;
    }

    /* renamed from: j */
    public float mo13241j() {
        return this.f2000j;
    }

    public String toString() {
        return "VideoButtonProperties{widthPercentOfScreen=" + this.f1991a + ", heightPercentOfScreen=" + this.f1992b + ", margin=" + this.f1993c + ", gravity=" + this.f1994d + ", tapToFade=" + this.f1995e + ", tapToFadeDurationMillis=" + this.f1996f + ", fadeInDurationMillis=" + this.f1997g + ", fadeOutDurationMillis=" + this.f1998h + ", fadeInDelay=" + this.f1999i + ", fadeOutDelay=" + this.f2000j + '}';
    }
}
