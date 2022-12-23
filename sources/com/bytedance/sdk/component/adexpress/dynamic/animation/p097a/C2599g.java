package com.bytedance.sdk.component.adexpress.dynamic.animation.p097a;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2610a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.a.g */
/* compiled from: RubInAnimation */
public class C2599g extends C2592d {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C2601a f5537d;

    public C2599g(View view, C2610a aVar) {
        super(view, aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public List<ObjectAnimator> mo16801a() {
        ObjectAnimator duration = ObjectAnimator.ofFloat(this.f5527c, "alpha", new float[]{0.0f, 1.0f}).setDuration((long) ((int) (this.f5526b.mo16860i() * 1000.0d)));
        this.f5537d = new C2601a(this.f5527c);
        final int i = this.f5527c.getLayoutParams().height;
        ObjectAnimator duration2 = ObjectAnimator.ofInt(this.f5537d, "height", new int[]{0, i}).setDuration((long) ((int) (this.f5526b.mo16860i() * 1000.0d)));
        ArrayList arrayList = new ArrayList();
        arrayList.add(mo16805a(duration));
        arrayList.add(mo16805a(duration2));
        ((ObjectAnimator) arrayList.get(0)).addListener(new Animator.AnimatorListener() {
            public void onAnimationCancel(Animator animator) {
            }

            public void onAnimationEnd(Animator animator, boolean z) {
            }

            public void onAnimationRepeat(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
            }

            public void onAnimationStart(Animator animator, boolean z) {
            }

            public void onAnimationEnd(Animator animator) {
                C2599g.this.f5537d.mo16821a(i);
            }
        });
        return arrayList;
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.a.g$a */
    /* compiled from: RubInAnimation */
    private class C2601a {

        /* renamed from: b */
        private View f5541b;

        public C2601a(View view) {
            this.f5541b = view;
        }

        /* renamed from: a */
        public void mo16821a(int i) {
            ViewGroup.LayoutParams layoutParams = this.f5541b.getLayoutParams();
            layoutParams.height = i;
            this.f5541b.setLayoutParams(layoutParams);
            this.f5541b.requestLayout();
        }
    }
}
