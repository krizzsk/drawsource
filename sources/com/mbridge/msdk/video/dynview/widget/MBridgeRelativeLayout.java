package com.mbridge.msdk.video.dynview.widget;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.mbridge.msdk.video.dynview.moffer.C9394b;
import com.mbridge.msdk.video.dynview.moffer.C9396d;

public class MBridgeRelativeLayout extends RelativeLayout {

    /* renamed from: a */
    private C9396d f23188a;

    /* renamed from: b */
    private boolean f23189b;

    /* renamed from: c */
    private AnimatorSet f23190c;

    /* renamed from: d */
    private boolean f23191d;

    /* renamed from: e */
    private C9394b f23192e;

    public MBridgeRelativeLayout(Context context) {
        super(context);
    }

    public MBridgeRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MBridgeRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setAnimatorSet(AnimatorSet animatorSet) {
        this.f23190c = animatorSet;
    }

    public void setMoreOfferShowFailedCallBack(C9396d dVar) {
        this.f23188a = dVar;
    }

    public void setMoreOfferCacheReportCallBack(C9394b bVar) {
        this.f23192e = bVar;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        AnimatorSet animatorSet = this.f23190c;
        if (animatorSet != null) {
            try {
                animatorSet.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        C9396d dVar;
        super.onDetachedFromWindow();
        if (!this.f23189b && (dVar = this.f23188a) != null) {
            this.f23189b = true;
            dVar.mo62912a();
        }
        AnimatorSet animatorSet = this.f23190c;
        if (animatorSet != null) {
            try {
                animatorSet.cancel();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        C9394b bVar;
        super.onVisibilityChanged(view, i);
        if ((view instanceof MBridgeRelativeLayout) && i == 0 && (bVar = this.f23192e) != null && !this.f23191d) {
            this.f23191d = true;
            bVar.mo62911a();
        }
    }
}
