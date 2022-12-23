package com.bytedance.sdk.component.adexpress.dynamic.interact.p101a;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.C2570c;
import com.bytedance.sdk.component.adexpress.dynamic.interact.C2664c;
import com.bytedance.sdk.component.adexpress.p094c.C2572b;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.interact.a.b */
/* compiled from: SlideRightTouch */
public class C2660b implements View.OnTouchListener {

    /* renamed from: a */
    private float f5826a;

    /* renamed from: b */
    private float f5827b;

    /* renamed from: c */
    private boolean f5828c;

    /* renamed from: d */
    private C2664c f5829d;

    public C2660b(C2664c cVar) {
        this.f5829d = cVar;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        C2664c cVar;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f5826a = motionEvent.getX();
        } else if (action != 1) {
            if (action == 2) {
                float x = motionEvent.getX();
                this.f5827b = x;
                if (Math.abs(x - this.f5826a) > 10.0f) {
                    this.f5828c = true;
                }
            }
        } else if (!this.f5828c) {
            return false;
        } else {
            int b = C2572b.m6626b(C2570c.m6618a(), Math.abs(this.f5827b - this.f5826a));
            if (this.f5827b > this.f5826a && b > 5 && (cVar = this.f5829d) != null) {
                cVar.mo17214a();
            }
        }
        return true;
    }
}
