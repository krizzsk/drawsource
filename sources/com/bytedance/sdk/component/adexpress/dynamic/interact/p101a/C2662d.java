package com.bytedance.sdk.component.adexpress.dynamic.interact.p101a;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.interact.C2664c;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.interact.a.d */
/* compiled from: TapTouch */
public class C2662d implements View.OnTouchListener {

    /* renamed from: c */
    private static int f5835c = 10;

    /* renamed from: a */
    private float f5836a;

    /* renamed from: b */
    private float f5837b;

    /* renamed from: d */
    private boolean f5838d;

    /* renamed from: e */
    private C2664c f5839e;

    public C2662d(C2664c cVar) {
        this.f5839e = cVar;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f5836a = motionEvent.getX();
            this.f5837b = motionEvent.getY();
        } else if (action != 1) {
            if (action == 2) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (Math.abs(x - this.f5836a) >= ((float) f5835c) || Math.abs(y - this.f5837b) >= ((float) f5835c)) {
                    this.f5838d = true;
                }
            } else if (action == 3) {
                this.f5838d = false;
            }
        } else if (this.f5838d) {
            this.f5838d = false;
            return false;
        } else {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            if (Math.abs(x2 - this.f5836a) >= ((float) f5835c) || Math.abs(y2 - this.f5837b) >= ((float) f5835c)) {
                this.f5838d = false;
            } else {
                C2664c cVar = this.f5839e;
                if (cVar != null) {
                    cVar.mo17214a();
                }
            }
        }
        return true;
    }
}
