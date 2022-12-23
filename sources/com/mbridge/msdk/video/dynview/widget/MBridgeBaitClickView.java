package com.mbridge.msdk.video.dynview.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.same.p302c.C8481b;
import com.mbridge.msdk.foundation.same.p302c.C8484c;
import com.mbridge.msdk.foundation.tools.C8658p;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.foundation.tools.C8677z;

public class MBridgeBaitClickView extends RelativeLayout {
    public static final int ANIMATION_TYPE_DOUBLE_CLICK = 4;
    public static final int ANIMATION_TYPE_FAST_SCALE = 1;
    public static final int ANIMATION_TYPE_ROTATE = 5;
    public static final int ANIMATION_TYPE_SLOW_SCALE = 2;
    public static final int ANIMATION_TYPE_SLOW_SCALE_WITH_PAUSE = 3;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public MBridgeDyImageView f23130a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public MBridgeDyImageView f23131b;

    /* renamed from: c */
    private TextView f23132c;

    /* renamed from: d */
    private String f23133d = "";

    /* renamed from: e */
    private String f23134e = "";

    /* renamed from: f */
    private String f23135f = "Click now for details";

    /* renamed from: g */
    private int f23136g = 1;

    /* renamed from: h */
    private int f23137h = 1342177280;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Animation f23138i;

    /* renamed from: j */
    private Animation f23139j;

    /* renamed from: k */
    private Animation f23140k;

    /* renamed from: l */
    private Animation f23141l;

    public MBridgeBaitClickView(Context context) {
        super(context);
    }

    public MBridgeBaitClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MBridgeBaitClickView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MBridgeBaitClickView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void init(int i) {
        this.f23136g = i;
        init();
    }

    public void init(int i, int i2) {
        this.f23137h = i;
        this.f23136g = i2;
        init();
    }

    public void init(int i, int i2, String str, String str2, String str3) {
        this.f23137h = i;
        this.f23136g = i2;
        this.f23133d = str;
        this.f23134e = str2;
        this.f23135f = str3;
        init();
    }

    public void init() {
        try {
            setBackgroundColor(this.f23137h);
            this.f23135f = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh") ? "点击查看详情" : "Click now for details";
        } catch (Throwable th) {
            C8672v.m24878d("MBridgeAnimationClickView", th.getMessage());
            return;
        }
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        int b = C8677z.m24924b(getContext(), 55.0f);
        int b2 = C8677z.m24924b(getContext(), 33.0f);
        this.f23131b = new MBridgeDyImageView(getContext());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(b, b);
        layoutParams.setMargins(b2, b2, 0, 0);
        this.f23131b.setLayoutParams(layoutParams);
        final int a = C8658p.m24799a(getContext(), "mbridge_icon_click_circle", "drawable");
        if (TextUtils.isEmpty(this.f23134e)) {
            this.f23131b.setImageResource(a);
        } else {
            C8481b.m24310a(C8388a.m23845e().mo56913g()).mo57883a(this.f23133d, (C8484c) new C8484c() {
                public final void onSuccessLoad(Bitmap bitmap, String str) {
                    if (!bitmap.isRecycled()) {
                        MBridgeBaitClickView.this.f23131b.setImageBitmap(bitmap);
                    }
                }

                public final void onFailedLoad(String str, String str2) {
                    MBridgeBaitClickView.this.f23131b.setImageResource(a);
                }
            });
        }
        int b3 = C8677z.m24924b(getContext(), 108.0f);
        int b4 = C8677z.m24924b(getContext(), 35.0f);
        int b5 = C8677z.m24924b(getContext(), 43.0f);
        this.f23130a = new MBridgeDyImageView(getContext());
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(b3, b3);
        layoutParams2.setMargins(b4, b5, 0, 0);
        this.f23130a.setLayoutParams(layoutParams2);
        final int a2 = C8658p.m24799a(getContext(), "mbridge_icon_click_hand", "drawable");
        if (TextUtils.isEmpty(this.f23133d)) {
            this.f23130a.setImageResource(a2);
        } else {
            C8481b.m24310a(C8388a.m23845e().mo56913g()).mo57883a(this.f23133d, (C8484c) new C8484c() {
                public final void onSuccessLoad(Bitmap bitmap, String str) {
                    if (!bitmap.isRecycled()) {
                        MBridgeBaitClickView.this.f23130a.setImageBitmap(bitmap);
                    }
                }

                public final void onFailedLoad(String str, String str2) {
                    MBridgeBaitClickView.this.f23130a.setImageResource(a2);
                }
            });
        }
        relativeLayout.addView(this.f23131b);
        relativeLayout.addView(this.f23130a);
        LinearLayout linearLayout = new LinearLayout(getContext());
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(13);
        linearLayout.setLayoutParams(layoutParams3);
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.addView(relativeLayout);
        this.f23132c = new TextView(getContext());
        this.f23132c.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        this.f23132c.setText(this.f23135f);
        this.f23132c.setTextColor(-1);
        this.f23132c.setGravity(14);
        linearLayout.addView(this.f23132c);
        addView(linearLayout);
    }

    public void startAnimation() {
        int i = this.f23136g;
        if (i == 2) {
            this.f23131b.setVisibility(4);
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
            this.f23138i = scaleAnimation;
            scaleAnimation.setDuration(500);
            this.f23138i.setRepeatCount(-1);
            this.f23138i.setRepeatMode(2);
            MBridgeDyImageView mBridgeDyImageView = this.f23130a;
            if (mBridgeDyImageView != null) {
                mBridgeDyImageView.startAnimation(this.f23138i);
            }
        } else if (i == 3) {
            MBridgeDyImageView mBridgeDyImageView2 = this.f23131b;
            if (mBridgeDyImageView2 != null) {
                mBridgeDyImageView2.setVisibility(4);
            }
            ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
            this.f23138i = scaleAnimation2;
            scaleAnimation2.setDuration(500);
            this.f23138i.setRepeatCount(1);
            this.f23138i.setRepeatMode(2);
            ScaleAnimation scaleAnimation3 = new ScaleAnimation(0.0f, 1.5f, 0.0f, 1.5f, 1, 0.5f, 1, 0.5f);
            this.f23139j = scaleAnimation3;
            scaleAnimation3.setDuration(1000);
            this.f23139j.setRepeatCount(0);
            AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
            this.f23140k = alphaAnimation;
            alphaAnimation.setDuration(1000);
            this.f23140k.setRepeatCount(0);
            final AnimationSet animationSet = new AnimationSet(true);
            animationSet.addAnimation(this.f23139j);
            animationSet.addAnimation(this.f23140k);
            this.f23139j.setAnimationListener(new Animation.AnimationListener() {
                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                    if (MBridgeBaitClickView.this.f23131b != null) {
                        MBridgeBaitClickView.this.f23131b.setVisibility(0);
                    }
                }

                public final void onAnimationEnd(Animation animation) {
                    if (MBridgeBaitClickView.this.f23131b != null) {
                        MBridgeBaitClickView.this.f23131b.setVisibility(4);
                    }
                }
            });
            this.f23138i.setAnimationListener(new Animation.AnimationListener() {
                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                    MBridgeBaitClickView.this.postDelayed(new Runnable() {
                        public final void run() {
                            if (MBridgeBaitClickView.this.f23131b != null) {
                                MBridgeBaitClickView.this.f23131b.startAnimation(animationSet);
                            }
                        }
                    }, 550);
                }

                public final void onAnimationEnd(Animation animation) {
                    MBridgeBaitClickView.this.postDelayed(new Runnable() {
                        public final void run() {
                            if (MBridgeBaitClickView.this.f23130a != null) {
                                MBridgeBaitClickView.this.f23130a.startAnimation(MBridgeBaitClickView.this.f23138i);
                            }
                        }
                    }, 1000);
                }
            });
            MBridgeDyImageView mBridgeDyImageView3 = this.f23130a;
            if (mBridgeDyImageView3 != null) {
                mBridgeDyImageView3.startAnimation(this.f23138i);
            }
        } else if (i == 4) {
            this.f23131b.setVisibility(4);
            ScaleAnimation scaleAnimation4 = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
            this.f23138i = scaleAnimation4;
            scaleAnimation4.setDuration(200);
            this.f23138i.setRepeatCount(1);
            this.f23138i.setAnimationListener(new Animation.AnimationListener() {
                public final void onAnimationRepeat(Animation animation) {
                }

                public final void onAnimationStart(Animation animation) {
                }

                public final void onAnimationEnd(Animation animation) {
                    MBridgeBaitClickView.this.postDelayed(new Runnable() {
                        public final void run() {
                            if (MBridgeBaitClickView.this.f23130a != null) {
                                MBridgeBaitClickView.this.f23130a.startAnimation(MBridgeBaitClickView.this.f23138i);
                            }
                        }
                    }, 1000);
                }
            });
            MBridgeDyImageView mBridgeDyImageView4 = this.f23130a;
            if (mBridgeDyImageView4 != null) {
                mBridgeDyImageView4.startAnimation(this.f23138i);
            }
        } else if (i != 5) {
            ScaleAnimation scaleAnimation5 = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
            this.f23138i = scaleAnimation5;
            scaleAnimation5.setDuration(200);
            this.f23138i.setRepeatCount(-1);
            this.f23138i.setRepeatMode(2);
            MBridgeDyImageView mBridgeDyImageView5 = this.f23130a;
            if (mBridgeDyImageView5 != null) {
                mBridgeDyImageView5.startAnimation(this.f23138i);
            }
            ScaleAnimation scaleAnimation6 = new ScaleAnimation(0.0f, 1.2f, 0.0f, 1.2f, 1, 0.5f, 1, 0.5f);
            this.f23139j = scaleAnimation6;
            scaleAnimation6.setDuration(400);
            this.f23139j.setRepeatCount(-1);
            AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.3f);
            this.f23140k = alphaAnimation2;
            alphaAnimation2.setDuration(400);
            this.f23140k.setRepeatCount(-1);
            AnimationSet animationSet2 = new AnimationSet(true);
            animationSet2.addAnimation(this.f23139j);
            animationSet2.addAnimation(this.f23140k);
            MBridgeDyImageView mBridgeDyImageView6 = this.f23131b;
            if (mBridgeDyImageView6 != null) {
                mBridgeDyImageView6.startAnimation(animationSet2);
            }
        } else {
            RotateAnimation rotateAnimation = new RotateAnimation(-10.0f, 30.0f, 1, 0.5f, 1, 0.5f);
            this.f23141l = rotateAnimation;
            rotateAnimation.setDuration(300);
            this.f23141l.setRepeatMode(2);
            this.f23141l.setRepeatCount(-1);
            ScaleAnimation scaleAnimation7 = new ScaleAnimation(0.0f, 1.2f, 0.0f, 1.2f, 1, 0.5f, 1, 0.5f);
            this.f23139j = scaleAnimation7;
            scaleAnimation7.setDuration(600);
            this.f23139j.setRepeatCount(-1);
            AlphaAnimation alphaAnimation3 = new AlphaAnimation(1.0f, 0.0f);
            this.f23140k = alphaAnimation3;
            alphaAnimation3.setDuration(600);
            this.f23140k.setRepeatCount(-1);
            AnimationSet animationSet3 = new AnimationSet(true);
            animationSet3.addAnimation(this.f23139j);
            animationSet3.addAnimation(this.f23140k);
            MBridgeDyImageView mBridgeDyImageView7 = this.f23130a;
            if (mBridgeDyImageView7 != null) {
                mBridgeDyImageView7.startAnimation(this.f23141l);
            }
            MBridgeDyImageView mBridgeDyImageView8 = this.f23131b;
            if (mBridgeDyImageView8 != null) {
                mBridgeDyImageView8.startAnimation(animationSet3);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearAnimation();
        Animation animation = this.f23138i;
        if (animation != null) {
            animation.cancel();
        }
        Animation animation2 = this.f23139j;
        if (animation2 != null) {
            animation2.cancel();
        }
        Animation animation3 = this.f23140k;
        if (animation3 != null) {
            animation3.cancel();
        }
        Animation animation4 = this.f23141l;
        if (animation4 != null) {
            animation4.cancel();
        }
    }
}
