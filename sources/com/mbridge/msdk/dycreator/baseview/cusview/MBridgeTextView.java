package com.mbridge.msdk.dycreator.baseview.cusview;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;

public class MBridgeTextView extends TextView {

    /* renamed from: a */
    private ObjectAnimator f18251a;

    public MBridgeTextView(Context context) {
        super(context);
    }

    public MBridgeTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MBridgeTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setObjectAnimator(ObjectAnimator objectAnimator) {
        this.f18251a = objectAnimator;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ObjectAnimator objectAnimator = this.f18251a;
        if (objectAnimator != null) {
            try {
                objectAnimator.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ObjectAnimator objectAnimator = this.f18251a;
        if (objectAnimator != null) {
            try {
                objectAnimator.cancel();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
