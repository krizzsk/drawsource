package com.bytedance.sdk.component.adexpress.dynamic.interact.p101a;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.C2570c;
import com.bytedance.sdk.component.adexpress.dynamic.interact.C2664c;
import com.bytedance.sdk.component.adexpress.p094c.C2572b;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.interact.a.c */
/* compiled from: SlideUpTouch */
public class C2661c implements View.OnTouchListener {

    /* renamed from: a */
    private float f5830a;

    /* renamed from: b */
    private float f5831b;

    /* renamed from: c */
    private boolean f5832c;

    /* renamed from: d */
    private C2664c f5833d;

    /* renamed from: e */
    private int f5834e;

    public C2661c(C2664c cVar, int i) {
        this.f5833d = cVar;
        this.f5834e = i;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        C2664c cVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f5830a = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float y = motionEvent.getY();
                this.f5831b = y;
                if (Math.abs(y - this.f5830a) > 10.0f) {
                    this.f5832c = true;
                }
            }
        } else if (!this.f5832c) {
            return false;
        } else {
            int b = C2572b.m6626b(C2570c.m6618a(), Math.abs(this.f5831b - this.f5830a));
            if (this.f5831b - this.f5830a < 0.0f && b > this.f5834e && (cVar = this.f5833d) != null) {
                cVar.mo17214a();
            }
        }
        return true;
    }
}
