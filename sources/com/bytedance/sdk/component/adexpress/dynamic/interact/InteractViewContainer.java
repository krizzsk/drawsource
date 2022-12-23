package com.bytedance.sdk.component.adexpress.dynamic.interact;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.DynamicBaseWidget;
import com.bytedance.sdk.component.adexpress.dynamic.interact.p101a.C2659a;
import com.bytedance.sdk.component.adexpress.dynamic.interact.p101a.C2660b;
import com.bytedance.sdk.component.adexpress.dynamic.interact.p101a.C2661c;
import com.bytedance.sdk.component.adexpress.dynamic.interact.p101a.C2662d;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2617g;
import com.bytedance.sdk.component.adexpress.widget.CircleLongPressView;
import com.bytedance.sdk.component.adexpress.widget.RippleView;
import com.bytedance.sdk.component.adexpress.widget.ShakeAnimationView;
import com.bytedance.sdk.component.adexpress.widget.WriggleGuideAnimationView;

public class InteractViewContainer extends FrameLayout implements C2664c {

    /* renamed from: a */
    private Context f5806a;

    /* renamed from: b */
    private DynamicBaseWidget f5807b;

    /* renamed from: c */
    private C2617g f5808c;

    /* renamed from: d */
    private View f5809d;

    /* renamed from: e */
    private C2663b f5810e;

    /* renamed from: f */
    private String f5811f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public RippleView f5812g;

    /* renamed from: h */
    private View.OnTouchListener f5813h;

    /* renamed from: i */
    private int f5814i;

    /* renamed from: j */
    private int f5815j;

    /* renamed from: k */
    private int f5816k;

    public InteractViewContainer(Context context, DynamicBaseWidget dynamicBaseWidget, C2617g gVar) {
        super(context);
        this.f5806a = context;
        this.f5807b = dynamicBaseWidget;
        this.f5808c = gVar;
        m7174e();
    }

    public InteractViewContainer(Context context, DynamicBaseWidget dynamicBaseWidget, C2617g gVar, int i, int i2) {
        super(context);
        this.f5806a = context;
        this.f5807b = dynamicBaseWidget;
        this.f5808c = gVar;
        this.f5815j = i;
        this.f5816k = i2;
        m7174e();
    }

    /* renamed from: e */
    private void m7174e() {
        setBackgroundColor(0);
        setClipChildren(false);
        setClipToPadding(false);
        this.f5811f = this.f5808c.mo17024D();
        this.f5814i = this.f5808c.mo17025E();
        C2663b a = C2665d.m7190a(this.f5806a, this.f5807b, this.f5808c, this.f5815j, this.f5816k);
        this.f5810e = a;
        if (a != null) {
            this.f5809d = a.mo17224d();
            if (TextUtils.equals(this.f5811f, "6")) {
                RippleView rippleView = new RippleView(this.f5806a);
                this.f5812g = rippleView;
                addView(rippleView, new FrameLayout.LayoutParams(-1, -1));
                post(new Runnable() {
                    public void run() {
                        InteractViewContainer.this.f5812g.mo17314b();
                    }
                });
            }
            addView(this.f5810e.mo17224d());
            m7175f();
            setVisibility(0);
        }
    }

    /* renamed from: f */
    private void m7175f() {
        if (this.f5809d != null) {
            String str = this.f5811f;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 50) {
                switch (hashCode) {
                    case 53:
                        if (str.equals("5")) {
                            c = 7;
                            break;
                        }
                        break;
                    case 54:
                        if (str.equals("6")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 55:
                        if (str.equals("7")) {
                            c = 10;
                            break;
                        }
                        break;
                    case 56:
                        if (str.equals("8")) {
                            c = 5;
                            break;
                        }
                        break;
                    case 57:
                        if (str.equals("9")) {
                            c = 0;
                            break;
                        }
                        break;
                    default:
                        switch (hashCode) {
                            case 1568:
                                if (str.equals("11")) {
                                    c = 4;
                                    break;
                                }
                                break;
                            case 1569:
                                if (str.equals("12")) {
                                    c = 6;
                                    break;
                                }
                                break;
                            case 1570:
                                if (str.equals("13")) {
                                    c = 2;
                                    break;
                                }
                                break;
                            case 1571:
                                if (str.equals("14")) {
                                    c = 8;
                                    break;
                                }
                                break;
                            default:
                                switch (hashCode) {
                                    case 1573:
                                        if (str.equals("16")) {
                                            c = 11;
                                            break;
                                        }
                                        break;
                                    case 1574:
                                        if (str.equals("17")) {
                                            c = 1;
                                            break;
                                        }
                                        break;
                                    case 1575:
                                        if (str.equals("18")) {
                                            c = 12;
                                            break;
                                        }
                                        break;
                                }
                        }
                }
            } else if (str.equals("2")) {
                c = 9;
            }
            switch (c) {
                case 0:
                case 1:
                    this.f5809d.setTag(2);
                    break;
                case 2:
                    this.f5813h = new C2661c(this, this.f5814i);
                    break;
                case 3:
                    setBackgroundColor(Color.parseColor("#80000000"));
                    this.f5813h = new C2662d(this);
                    break;
                case 4:
                case 5:
                    this.f5807b.setClipChildren(false);
                    this.f5807b.setClipChildren(false);
                    ViewGroup viewGroup = (ViewGroup) this.f5807b.getParent();
                    if (viewGroup != null) {
                        viewGroup.setClipChildren(false);
                        viewGroup.setClipToPadding(false);
                    }
                    this.f5813h = new C2662d(this);
                    break;
                case 6:
                    this.f5813h = new C2660b(this);
                    break;
                case 7:
                    setBackgroundColor(Color.parseColor("#80000000"));
                    this.f5813h = new C2660b(this);
                    break;
                case 8:
                    this.f5813h = new C2659a(this, this);
                    break;
                case 9:
                case 10:
                    setBackgroundColor(Color.parseColor("#80000000"));
                    this.f5813h = new C2659a(this, this);
                    break;
                case 11:
                    View view = this.f5809d;
                    if (!(view == null || !(view instanceof ShakeAnimationView) || ((ShakeAnimationView) view).getShakeLayout() == null)) {
                        ((ShakeAnimationView) this.f5809d).getShakeLayout().setTag(2);
                    }
                    this.f5809d.setTag(2);
                    break;
                case 12:
                    View view2 = this.f5809d;
                    if (!(view2 == null || !(view2 instanceof WriggleGuideAnimationView) || ((WriggleGuideAnimationView) view2).getWriggleLayout() == null)) {
                        ((WriggleGuideAnimationView) this.f5809d).getWriggleLayout().setTag(2);
                    }
                    this.f5809d.setTag(2);
                    break;
            }
            View.OnTouchListener onTouchListener = this.f5813h;
            if (onTouchListener != null) {
                setOnTouchListener(onTouchListener);
            }
            if (m7176g()) {
                setOnClickListener((View.OnClickListener) this.f5807b.getDynamicClickListener());
            }
        }
    }

    /* renamed from: g */
    private boolean m7176g() {
        if (!this.f5808c.mo17030J() && !TextUtils.equals("9", this.f5811f) && !TextUtils.equals("16", this.f5811f) && !TextUtils.equals("17", this.f5811f) && !TextUtils.equals("18", this.f5811f)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo17215b() {
        C2663b bVar = this.f5810e;
        if (bVar != null) {
            bVar.mo17221a();
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C2663b bVar = this.f5810e;
        if (bVar != null) {
            bVar.mo17222b();
        }
    }

    /* renamed from: c */
    public void mo17216c() {
        if (this.f5809d != null && TextUtils.equals(this.f5811f, "2")) {
            View view = this.f5809d;
            if (view instanceof CircleLongPressView) {
                ((CircleLongPressView) view).mo17256c();
            }
        }
    }

    /* renamed from: d */
    public void mo17217d() {
        if (this.f5809d != null && TextUtils.equals(this.f5811f, "2")) {
            View view = this.f5809d;
            if (view instanceof CircleLongPressView) {
                ((CircleLongPressView) view).mo17257d();
            }
        }
    }

    /* renamed from: a */
    public void mo17214a() {
        if (TextUtils.equals(this.f5811f, "6")) {
            RippleView rippleView = this.f5812g;
            if (rippleView != null) {
                rippleView.mo17315c();
                postDelayed(new Runnable() {
                    public void run() {
                        InteractViewContainer.this.m7177h();
                    }
                }, 300);
                return;
            }
            return;
        }
        m7177h();
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public void m7177h() {
        if (this.f5813h != null) {
            setOnClickListener((View.OnClickListener) this.f5807b.getDynamicClickListener());
            performClick();
        }
    }
}
