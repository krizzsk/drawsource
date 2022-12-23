package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.webkit.WebView;

/* renamed from: com.applovin.impl.adview.h */
public class C1534h extends WebView {

    /* renamed from: a */
    private PointF f1927a = new PointF();

    public C1534h(Context context) {
        super(context);
    }

    public PointF getAndClearLastClickLocation() {
        PointF pointF = this.f1927a;
        this.f1927a = new PointF();
        return pointF;
    }

    public PointF getLastClickLocation() {
        return this.f1927a;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f1927a = new PointF(motionEvent.getRawX(), motionEvent.getRawY());
        return super.onTouchEvent(motionEvent);
    }
}
