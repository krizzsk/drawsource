package com.bytedance.sdk.openadsdk.component.reward;

import com.bytedance.sdk.component.p123f.C2882e;
import com.bytedance.sdk.component.p123f.C2885g;
import com.bytedance.sdk.component.utils.C2898h;
import com.bytedance.sdk.component.utils.C2909o;
import com.bytedance.sdk.openadsdk.core.C3513m;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.component.reward.a */
/* compiled from: ContinueDownloadTask */
public class C3217a extends C2885g {

    /* renamed from: a */
    private final List<? extends C2885g> f7571a;

    public C3217a(String str, List<? extends C2885g> list) {
        super(str);
        this.f7571a = list;
    }

    public void run() {
        List<? extends C2885g> list;
        if (!(C2909o.m8136c(C3513m.m10963a()) == 0 || (list = this.f7571a) == null)) {
            Iterator<? extends C2885g> it = list.iterator();
            while (it.hasNext()) {
                C2882e.m8036a((C2885g) it.next(), 1);
                it.remove();
            }
        }
        try {
            C2898h.m8093a().removeCallbacks(this);
        } catch (Exception unused) {
        }
    }
}
