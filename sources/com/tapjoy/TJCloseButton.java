package com.tapjoy;

import android.animation.Animator;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;

public class TJCloseButton extends ImageButton {

    /* renamed from: a */
    private static final String f26591a = TJCloseButton.class.getSimpleName();

    /* renamed from: b */
    private ClosePosition f26592b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f26593c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f26594d;

    public enum ClosePosition {
        TOP_LEFT(new int[]{10, 9}),
        TOP_CENTER(new int[]{10, 14}),
        TOP_RIGHT(new int[]{10, 11}),
        CENTER(new int[]{13}),
        BOTTOM_LEFT(new int[]{12, 9}),
        BOTTOM_CENTER(new int[]{12, 14}),
        BOTTOM_RIGHT(new int[]{12, 11});
        

        /* renamed from: a */
        final RelativeLayout.LayoutParams f26598a;

        private ClosePosition(int[] iArr) {
            this.f26598a = new RelativeLayout.LayoutParams((int) (((double) TapjoyConnectCore.getDeviceScreenDensityScale()) * 75.0d), (int) (((double) TapjoyConnectCore.getDeviceScreenDensityScale()) * 75.0d));
            for (int addRule : iArr) {
                this.f26598a.addRule(addRule);
            }
            int deviceScreenDensityScale = (int) (TapjoyConnectCore.getDeviceScreenDensityScale() * -10.0f);
            this.f26598a.setMargins(0, deviceScreenDensityScale, deviceScreenDensityScale, 0);
        }
    }

    public TJCloseButton(Context context) {
        this(context, ClosePosition.TOP_RIGHT);
    }

    public TJCloseButton(Context context, ClosePosition closePosition) {
        super(context);
        this.f26593c = true;
        this.f26592b = closePosition;
        setImageBitmap(TapjoyIcons.getCloseCircularImage(new TapjoyDisplayMetricsUtil(getContext()).getScreenDensityScale()));
        setScaleType(ImageView.ScaleType.FIT_XY);
        setBackgroundColor(ViewCompat.MEASURED_SIZE_MASK);
        setLayoutParams(this.f26592b.f26598a);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        if (Build.VERSION.SDK_INT >= 12) {
            setAlpha(0.0f);
            setVisibility(0);
            this.f26594d = true;
            setClickable(false);
            new Handler().postDelayed(new Runnable() {
                public final void run() {
                    TJCloseButton.this.animate().alpha(1.0f).setDuration(500).setListener(new Animator.AnimatorListener() {
                        public final void onAnimationRepeat(Animator animator) {
                        }

                        public final void onAnimationStart(Animator animator) {
                        }

                        public final void onAnimationCancel(Animator animator) {
                            TJCloseButton.this.setClickable(TJCloseButton.this.f26593c);
                            boolean unused = TJCloseButton.this.f26594d = false;
                        }

                        public final void onAnimationEnd(Animator animator) {
                            TJCloseButton.this.setClickable(TJCloseButton.this.f26593c);
                            boolean unused = TJCloseButton.this.f26594d = false;
                        }
                    });
                }
            }, 2000);
        }
    }

    /* access modifiers changed from: package-private */
    public void setClickableRequested(boolean z) {
        this.f26593c = z;
        if (!this.f26594d) {
            setClickable(z);
        }
    }
}
