package p401io.presage.common.network.models;

import com.ogury.p377ed.internal.C10263mq;
import java.io.Serializable;

/* renamed from: io.presage.common.network.models.RewardItem */
public final class RewardItem implements Serializable {

    /* renamed from: a */
    private String f29805a;

    /* renamed from: b */
    private String f29806b;

    public static /* synthetic */ RewardItem copy$default(RewardItem rewardItem, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = rewardItem.f29805a;
        }
        if ((i & 2) != 0) {
            str2 = rewardItem.f29806b;
        }
        return rewardItem.copy(str, str2);
    }

    public final String component1() {
        return this.f29805a;
    }

    public final String component2() {
        return this.f29806b;
    }

    public final RewardItem copy(String str, String str2) {
        C10263mq.m29882b(str, "name");
        C10263mq.m29882b(str2, "value");
        return new RewardItem(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardItem)) {
            return false;
        }
        RewardItem rewardItem = (RewardItem) obj;
        return C10263mq.m29881a((Object) this.f29805a, (Object) rewardItem.f29805a) && C10263mq.m29881a((Object) this.f29806b, (Object) rewardItem.f29806b);
    }

    public final int hashCode() {
        return (this.f29805a.hashCode() * 31) + this.f29806b.hashCode();
    }

    public final String toString() {
        return "RewardItem(name=" + this.f29805a + ", value=" + this.f29806b + ')';
    }

    public RewardItem(String str, String str2) {
        C10263mq.m29882b(str, "name");
        C10263mq.m29882b(str2, "value");
        this.f29805a = str;
        this.f29806b = str2;
    }

    public final String getName() {
        return this.f29805a;
    }

    public final String getValue() {
        return this.f29806b;
    }

    public final void setName(String str) {
        C10263mq.m29882b(str, "<set-?>");
        this.f29805a = str;
    }

    public final void setValue(String str) {
        C10263mq.m29882b(str, "<set-?>");
        this.f29806b = str;
    }
}
