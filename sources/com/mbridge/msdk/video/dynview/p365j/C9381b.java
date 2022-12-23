package com.mbridge.msdk.video.dynview.p365j;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.dycreator.baseview.MBFrameLayout;
import com.mbridge.msdk.dycreator.baseview.MBStarLevelLayoutView;
import com.mbridge.msdk.dycreator.baseview.MBTextView;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeFramLayout;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeTextView;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.tools.C8658p;
import com.mbridge.msdk.foundation.tools.C8677z;
import com.mbridge.msdk.video.dynview.C9317c;
import com.mbridge.msdk.video.dynview.p351a.C9313a;
import com.mbridge.msdk.video.dynview.p360h.C9356b;
import com.mbridge.msdk.video.dynview.p361i.p363b.C9366a;
import com.mbridge.msdk.video.dynview.widget.MBridgeLevelLayoutView;
import com.mbridge.msdk.video.dynview.widget.MBridgeRelativeLayout;
import com.mbridge.msdk.video.module.MBridgeClickCTAView;
import java.util.Map;

/* renamed from: com.mbridge.msdk.video.dynview.j.b */
/* compiled from: UIEnergizeWrapper */
public final class C9381b {

    /* renamed from: a */
    private String f23044a = "mbridge_top_play_bg";

    /* renamed from: b */
    private String f23045b = "mbridge_top_finger_bg";

    /* renamed from: c */
    private String f23046c = "mbridge_bottom_play_bg";

    /* renamed from: d */
    private String f23047d = "mbridge_bottom_finger_bg";

    /* renamed from: e */
    private String f23048e = "mbridge_tv_count";

    /* renamed from: f */
    private String f23049f = "mbridge_sound_switch";

    /* renamed from: g */
    private String f23050g = "mbridge_top_control";

    /* renamed from: h */
    private String f23051h = "mbridge_tv_title";

    /* renamed from: i */
    private String f23052i = "mbridge_tv_desc";

    /* renamed from: j */
    private String f23053j = "mbridge_tv_install";

    /* renamed from: k */
    private String f23054k = "mbridge_sv_starlevel";

    /* renamed from: l */
    private String f23055l = "mbridge_sv_heat_count_level";

    /* renamed from: m */
    private String f23056m = "mbridge_tv_cta";

    /* renamed from: n */
    private String f23057n = "mbridge_native_ec_controller";

    /* renamed from: o */
    private String f23058o = "mbridge_reward_shape_choice_rl";

    /* renamed from: p */
    private String f23059p = "#FFFFFF";

    /* renamed from: q */
    private String f23060q = "#FF000000";

    /* renamed from: r */
    private String f23061r = "#40000000";

    /* renamed from: s */
    private String f23062s = "#CAEF79";

    /* renamed from: t */
    private String f23063t = "#2196F3";

    /* renamed from: u */
    private String f23064u = "#402196F3";

    /* renamed from: v */
    private String f23065v = "#8FC31F";

    /* renamed from: w */
    private String f23066w = "#03A9F4";

    /* renamed from: x */
    private boolean f23067x = false;

    /* renamed from: a */
    public final void mo62901a(View view, Map<String, Object> map) {
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        ImageView imageView4;
        if (view != null && (view instanceof MBridgeFramLayout)) {
            MBridgeFramLayout mBridgeFramLayout = (MBridgeFramLayout) view;
            AnimatorSet animatorSet = new AnimatorSet();
            if (view.getContext() != null) {
                if (map != null && map.containsKey("is_dy_success")) {
                    this.f23067x = ((Boolean) map.get("is_dy_success")).booleanValue();
                }
                if (this.f23067x) {
                    imageView = (ImageView) view.findViewById(m26741b(this.f23044a));
                    imageView4 = (ImageView) view.findViewById(m26741b(this.f23045b));
                    imageView3 = (ImageView) view.findViewById(m26741b(this.f23046c));
                    imageView2 = (ImageView) view.findViewById(m26741b(this.f23047d));
                } else {
                    imageView = (ImageView) view.findViewById(m26740a(this.f23044a));
                    imageView4 = (ImageView) view.findViewById(m26740a(this.f23045b));
                    imageView3 = (ImageView) view.findViewById(m26740a(this.f23046c));
                    imageView2 = (ImageView) view.findViewById(m26740a(this.f23047d));
                }
                ObjectAnimator objectAnimator = null;
                ObjectAnimator a = imageView != null ? new C9356b().mo62861a(imageView) : null;
                ObjectAnimator b = imageView4 != null ? new C9356b().mo62865b(imageView4) : null;
                ObjectAnimator a2 = imageView3 != null ? new C9356b().mo62861a(imageView3) : null;
                if (imageView2 != null) {
                    objectAnimator = new C9356b().mo62865b(imageView2);
                }
                if (a != null && a2 != null && b != null && objectAnimator != null) {
                    animatorSet.playTogether(new Animator[]{a, a2, b, objectAnimator});
                    mBridgeFramLayout.setAnimatorSet(animatorSet);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo62900a(View view, C9317c cVar, Map<String, Object> map) {
        TextView textView;
        TextView textView2;
        String str;
        String str2;
        RelativeLayout relativeLayout;
        Context context = view != null ? view.getContext() : null;
        if (context != null && cVar != null) {
            if (map == null || !map.containsKey("is_dy_success")) {
                textView = (TextView) view.findViewById(m26740a(this.f23048e));
                textView2 = (TextView) view.findViewById(m26740a("mbridge_reward_click_tv"));
            } else {
                boolean booleanValue = ((Boolean) map.get("is_dy_success")).booleanValue();
                this.f23067x = booleanValue;
                if (booleanValue) {
                    textView = (TextView) view.findViewById(m26741b(this.f23048e));
                    textView2 = (TextView) view.findViewById(m26741b("mbridge_reward_click_tv"));
                } else {
                    textView = (TextView) view.findViewById(m26740a(this.f23048e));
                    textView2 = (TextView) view.findViewById(m26740a("mbridge_reward_click_tv"));
                }
            }
            if (textView != null) {
                textView.setBackgroundResource(C8658p.m24799a(context, "mbridge_reward_shape_progress", "drawable"));
                textView.setTextColor(Color.parseColor(this.f23059p));
                textView.setTextSize(11.0f);
            }
            if (textView2 != null) {
                textView2.setTextSize(20.0f);
                if (textView2 instanceof MBridgeTextView) {
                    ((MBridgeTextView) textView2).setObjectAnimator(new C9356b().mo62867c(textView2));
                }
                if (textView2 instanceof MBTextView) {
                    ((MBTextView) textView2).setAnimator(new C9356b().mo62867c(textView2));
                }
            }
            if (cVar != null) {
                String str3 = this.f23060q;
                String str4 = this.f23062s;
                float f = 1.0f;
                float f2 = 5.0f;
                int i = cVar.mo62753i();
                if (i == 302) {
                    str2 = this.f23063t;
                    str = this.f23066w;
                    str3 = this.f23059p;
                    str4 = this.f23064u;
                    f2 = 10.0f;
                } else if (i != 802) {
                    str2 = this.f23065v;
                    str = this.f23062s;
                } else {
                    str2 = this.f23059p;
                    str3 = this.f23060q;
                    str4 = this.f23061r;
                    f = 0.5f;
                    f2 = 25.0f;
                    str = str2;
                }
                if (textView2 != null) {
                    textView2.setTextColor(Color.parseColor(str3));
                    C9366a.m26704a(textView2, f, f2, str4, new String[]{str2, str}, GradientDrawable.Orientation.LEFT_RIGHT);
                }
                if (cVar.mo62750f() != null) {
                    RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) cVar.mo62750f().getLayoutParams();
                    layoutParams.setMargins(0, 0, 0, 0);
                    cVar.mo62750f().setLayoutParams(layoutParams);
                }
                if (this.f23067x) {
                    relativeLayout = (RelativeLayout) view.findViewById(m26741b(this.f23050g));
                } else {
                    relativeLayout = (RelativeLayout) view.findViewById(m26740a(this.f23050g));
                }
                if (relativeLayout == null) {
                    return;
                }
                if (C9313a.f22855a != 0 || C9313a.f22856b != 0 || C9313a.f22857c != 0 || C9313a.f22858d != 0) {
                    relativeLayout.setVisibility(4);
                    AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 100.0f);
                    alphaAnimation.setDuration(200);
                    relativeLayout.startAnimation(alphaAnimation);
                    relativeLayout.setVisibility(0);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo62899a(View view, C9317c cVar) {
        Context context;
        int i;
        if (view != null && cVar != null && (context = view.getContext()) != null) {
            if (cVar.mo62749e() == 1) {
                view.setBackground(context.getResources().getDrawable(C8658p.m24799a(context, this.f23058o, "drawable")));
                TextView textView = (TextView) view.findViewById(m26740a(this.f23051h));
                if (textView != null) {
                    textView.setTextColor(Color.parseColor(this.f23060q));
                }
                TextView textView2 = (TextView) view.findViewById(m26740a(this.f23052i));
                if (textView2 != null) {
                    textView2.setTextColor(Color.parseColor(this.f23060q));
                }
                i = C8677z.m24924b(context, 2.0f);
            } else {
                i = C8677z.m24924b(context, 10.0f);
                view.getBackground().setAlpha(100);
            }
            int b = C8677z.m24924b(context, 8.0f);
            View findViewById = view.findViewById(m26740a(this.f23053j));
            if (findViewById != null) {
                if (cVar.mo62750f() != null && (cVar.mo62750f() instanceof MBridgeClickCTAView)) {
                    ((MBridgeClickCTAView) cVar.mo62750f()).setObjectAnimator(new C9356b().mo62867c(findViewById));
                }
                if (findViewById instanceof TextView) {
                    TextView textView3 = (TextView) findViewById;
                    textView3.setTextColor(Color.parseColor(this.f23059p));
                    textView3.setTextSize(15.0f);
                    String str = this.f23062s;
                    C9366a.m26704a(textView3, 1.0f, 5.0f, str, new String[]{this.f23065v, str}, GradientDrawable.Orientation.LEFT_RIGHT);
                }
            }
            if (view.getLayoutParams() == null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
                layoutParams.setMargins(i, i, i, b);
                layoutParams.height = C8677z.m24924b(context, 60.0f);
                view.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: b */
    public final void mo62902b(View view, C9317c cVar, Map<String, Object> map) {
        LinearLayout linearLayout;
        View view2;
        if (view != null && cVar != null) {
            if (view.getContext() != null) {
                if (map != null && map.containsKey("is_dy_success")) {
                    this.f23067x = ((Boolean) map.get("is_dy_success")).booleanValue();
                }
                if (this.f23067x) {
                    linearLayout = (LinearLayout) view.findViewById(m26741b(this.f23054k));
                    view2 = view.findViewById(m26741b(this.f23056m));
                } else {
                    linearLayout = (LinearLayout) view.findViewById(m26740a(this.f23054k));
                    view2 = view.findViewById(m26740a(this.f23056m));
                }
                View view3 = view2;
                if (linearLayout != null && (linearLayout instanceof MBridgeLevelLayoutView)) {
                    if (cVar.mo62749e() == 1) {
                        linearLayout.setOrientation(1);
                    } else {
                        linearLayout.setOrientation(0);
                    }
                }
                if (linearLayout != null && (linearLayout instanceof MBStarLevelLayoutView)) {
                    linearLayout.setOrientation(0);
                }
                RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(m26740a(this.f23057n));
                if (relativeLayout != null) {
                    if (cVar.mo62749e() == 1) {
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                        layoutParams.setMargins(layoutParams.leftMargin + C9313a.f22855a, layoutParams.topMargin + C9313a.f22857c, layoutParams.rightMargin + C9313a.f22856b, layoutParams.bottomMargin + C9313a.f22858d);
                        relativeLayout.setLayoutParams(layoutParams);
                    } else {
                        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -1);
                        layoutParams2.setMargins(layoutParams2.leftMargin + C9313a.f22855a, layoutParams2.topMargin + C9313a.f22857c, layoutParams2.rightMargin + C9313a.f22856b, layoutParams2.bottomMargin + C9313a.f22858d);
                        relativeLayout.setLayoutParams(layoutParams2);
                    }
                }
                if (view3 != null) {
                    if (view3 instanceof TextView) {
                        TextView textView = (TextView) view3;
                        textView.setTextColor(Color.parseColor(this.f23059p));
                        textView.setTextSize(25.0f);
                        String str = this.f23062s;
                        View view4 = view3;
                        C9366a.m26704a(view4, 1.0f, 5.0f, str, new String[]{this.f23065v, str}, GradientDrawable.Orientation.LEFT_RIGHT);
                    }
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(new Animator[]{new C9356b().mo62867c(view3)});
                    if (view instanceof MBFrameLayout) {
                        ((MBFrameLayout) view).setAnimator(animatorSet);
                    }
                    if (view instanceof MBridgeFramLayout) {
                        ((MBridgeFramLayout) view).setAnimatorSet(animatorSet);
                    }
                    if (view instanceof MBridgeRelativeLayout) {
                        ((MBridgeRelativeLayout) view).setAnimatorSet(animatorSet);
                    }
                }
            }
            new C9356b().mo62868c(view, 500);
        }
    }

    /* renamed from: a */
    private int m26740a(String str) {
        return C8658p.m24799a(C8388a.m23845e().mo56913g(), str, "id");
    }

    /* renamed from: b */
    private int m26741b(String str) {
        if (!TextUtils.isEmpty(str)) {
            return str.hashCode();
        }
        return -1;
    }
}
