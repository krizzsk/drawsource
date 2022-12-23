package com.inmobi.media;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import com.inmobi.media.C5862cf;
import com.inmobi.media.C6008fc;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.inmobi.media.ex */
/* compiled from: AnimationManager */
public class C5996ex {

    /* renamed from: b */
    private static final String f15198b = C5996ex.class.getSimpleName();

    /* renamed from: a */
    public List<C5999a> f15199a = new ArrayList();

    /* renamed from: c */
    private boolean f15200c = false;

    /* renamed from: com.inmobi.media.ex$a */
    /* compiled from: AnimationManager */
    public class C5999a {

        /* renamed from: a */
        public Animator f15207a;

        /* renamed from: b */
        long f15208b;

        /* renamed from: c */
        boolean f15209c;

        C5999a(Animator animator) {
            this.f15207a = animator;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final List<C5999a> mo35134a(final View view, C5847bw bwVar) {
        LinkedList linkedList = new LinkedList();
        try {
            float c = (float) C6052fo.m18017c(bwVar.f14705c.f14730c.x);
            float c2 = (float) C6052fo.m18017c(bwVar.f14705c.f14731d.x);
            if (c != c2) {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{(float) ((int) c), (float) ((int) c2)});
                final C6008fc.C6009a aVar = (C6008fc.C6009a) view.getLayoutParams();
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        aVar.f15229a = ((Float) valueAnimator.getAnimatedValue()).intValue();
                        view.setLayoutParams(aVar);
                        view.requestLayout();
                    }
                });
                linkedList.add(m17865a((Animator) ofFloat, bwVar));
            }
            float c3 = (float) C6052fo.m18017c(bwVar.f14705c.f14730c.y);
            float c4 = (float) C6052fo.m18017c(bwVar.f14705c.f14731d.y);
            if (c3 != c4) {
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{(float) ((int) c3), (float) ((int) c4)});
                final C6008fc.C6009a aVar2 = (C6008fc.C6009a) view.getLayoutParams();
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        aVar2.f15230b = ((Float) valueAnimator.getAnimatedValue()).intValue();
                        view.setLayoutParams(aVar2);
                        view.requestLayout();
                    }
                });
                linkedList.add(m17865a((Animator) ofFloat2, bwVar));
            }
            float c5 = (float) C6052fo.m18017c(bwVar.f14705c.f14728a.x);
            float c6 = (float) C6052fo.m18017c(bwVar.f14705c.f14729b.x);
            if (c5 != c6) {
                linkedList.add(m17865a(m17864a(view, "scaleX", c5, c6), bwVar));
            }
            float c7 = (float) C6052fo.m18017c(bwVar.f14705c.f14728a.y);
            float c8 = (float) C6052fo.m18017c(bwVar.f14705c.f14729b.y);
            if (c7 != c8) {
                linkedList.add(m17865a(m17864a(view, "scaleY", c7, c8), bwVar));
            }
        } catch (Exception unused) {
        }
        if (linkedList.isEmpty()) {
            return null;
        }
        return linkedList;
    }

    /* renamed from: a */
    private C5999a m17865a(Animator animator, C5847bw bwVar) {
        m17866b(animator, bwVar);
        return new C5999a(animator);
    }

    /* renamed from: b */
    private static void m17866b(Animator animator, C5847bw bwVar) {
        animator.setDuration(0);
        animator.setStartDelay(0);
        C5862cf g = bwVar.f14705c.mo34833g();
        if (g != null) {
            C5862cf.C5863a aVar = g.f14787a;
            C5862cf.C5863a aVar2 = g.f14788b;
            if (aVar2 != null) {
                animator.setDuration(aVar2.mo34853a() * 1000);
            }
            if (aVar != null) {
                animator.setStartDelay(aVar.mo34853a() * 1000);
            }
        }
    }

    /* renamed from: a */
    private static Animator m17864a(View view, String str, float f, float f2) {
        view.setPivotX(0.0f);
        view.setPivotY(0.0f);
        return ObjectAnimator.ofFloat(view, str, new float[]{f2 / f});
    }

    /* renamed from: a */
    public final void mo35135a() {
        if (!this.f15200c) {
            this.f15200c = true;
            mo35136a(this.f15199a);
        }
    }

    /* renamed from: a */
    public final void mo35136a(List<C5999a> list) {
        if (list != null) {
            for (C5999a next : list) {
                if (!next.f15209c) {
                    ValueAnimator valueAnimator = (ValueAnimator) next.f15207a;
                    valueAnimator.setCurrentPlayTime(next.f15208b);
                    valueAnimator.start();
                }
                if (!this.f15199a.contains(next)) {
                    this.f15199a.add(next);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo35137b() {
        if (this.f15200c) {
            this.f15200c = false;
            for (C5999a next : this.f15199a) {
                ValueAnimator valueAnimator = (ValueAnimator) next.f15207a;
                next.f15208b = valueAnimator.getCurrentPlayTime();
                if (((double) valueAnimator.getAnimatedFraction()) == 1.0d) {
                    next.f15209c = true;
                }
                valueAnimator.cancel();
            }
        }
    }
}
