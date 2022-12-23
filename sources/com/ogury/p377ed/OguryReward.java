package com.ogury.p377ed;

import com.ogury.p377ed.internal.C10263mq;
import java.io.Serializable;

/* renamed from: com.ogury.ed.OguryReward */
public final class OguryReward implements Serializable {

    /* renamed from: a */
    private final String f24706a;

    /* renamed from: b */
    private final String f24707b;

    public static /* synthetic */ OguryReward copy$default(OguryReward oguryReward, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = oguryReward.f24706a;
        }
        if ((i & 2) != 0) {
            str2 = oguryReward.f24707b;
        }
        return oguryReward.copy(str, str2);
    }

    public final String component1() {
        return this.f24706a;
    }

    public final String component2() {
        return this.f24707b;
    }

    public final OguryReward copy(String str, String str2) {
        C10263mq.m29882b(str, "name");
        C10263mq.m29882b(str2, "value");
        return new OguryReward(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OguryReward)) {
            return false;
        }
        OguryReward oguryReward = (OguryReward) obj;
        return C10263mq.m29881a((Object) this.f24706a, (Object) oguryReward.f24706a) && C10263mq.m29881a((Object) this.f24707b, (Object) oguryReward.f24707b);
    }

    public final int hashCode() {
        return (this.f24706a.hashCode() * 31) + this.f24707b.hashCode();
    }

    public final String toString() {
        return "OguryReward(name=" + this.f24706a + ", value=" + this.f24707b + ')';
    }

    public OguryReward(String str, String str2) {
        C10263mq.m29882b(str, "name");
        C10263mq.m29882b(str2, "value");
        this.f24706a = str;
        this.f24707b = str2;
    }

    public final String getName() {
        return this.f24706a;
    }

    public final String getValue() {
        return this.f24707b;
    }
}
