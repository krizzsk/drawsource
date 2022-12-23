package com.bytedance.sdk.component.adexpress.dynamic.interact.p101a;

import android.view.MotionEvent;
import android.view.View;
import com.bytedance.sdk.component.adexpress.C2570c;
import com.bytedance.sdk.component.adexpress.dynamic.interact.C2664c;
import com.bytedance.sdk.component.adexpress.dynamic.interact.InteractViewContainer;
import com.bytedance.sdk.component.adexpress.p094c.C2572b;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.interact.a.a */
/* compiled from: LongPressTouch */
public class C2659a implements View.OnTouchListener {

    /* renamed from: a */
    private float f5820a;

    /* renamed from: b */
    private float f5821b;

    /* renamed from: c */
    private long f5822c;

    /* renamed from: d */
    private boolean f5823d;

    /* renamed from: e */
    private InteractViewContainer f5824e;

    /* renamed from: f */
    private C2664c f5825f;

    public C2659a(InteractViewContainer interactViewContainer, C2664c cVar) {
        this.f5824e = interactViewContainer;
        this.f5825f = cVar;
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f5822c = System.currentTimeMillis();
            this.f5820a = motionEvent.getX();
            this.f5821b = motionEvent.getY();
            this.f5824e.mo17216c();
        } else if (action != 1) {
            if (action == 2) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (Math.abs(x - this.f5820a) >= C2572b.m6622a(C2570c.m6618a(), 10.0f) || Math.abs(y - this.f5821b) >= C2572b.m6622a(C2570c.m6618a(), 10.0f)) {
                    this.f5823d = true;
                    this.f5824e.mo17217d();
                }
            }
        } else if (this.f5823d) {
            return false;
        } else {
            if (System.currentTimeMillis() - this.f5822c >= 1500) {
                C2664c cVar = this.f5825f;
                if (cVar != null) {
                    cVar.mo17214a();
                }
            } else {
                this.f5824e.mo17217d();
            }
        }
        return true;
    }
}
