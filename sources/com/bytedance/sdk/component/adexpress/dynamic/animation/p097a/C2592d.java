package com.bytedance.sdk.component.adexpress.dynamic.animation.p097a;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C2655c;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2610a;
import com.bytedance.sdk.component.adexpress.p089a.p090a.C2529a;
import com.bytedance.sdk.component.p123f.C2882e;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.a.d */
/* compiled from: BaseAnimation */
public abstract class C2592d implements C2655c {

    /* renamed from: a */
    public List<ObjectAnimator> f5525a = mo16801a();

    /* renamed from: b */
    C2610a f5526b;

    /* renamed from: c */
    public View f5527c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Set<ScheduledFuture<?>> f5528d = new HashSet();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract List<ObjectAnimator> mo16801a();

    public C2592d(View view, C2610a aVar) {
        this.f5527c = view;
        this.f5526b = aVar;
    }

    /* renamed from: c */
    public void mo16806c() {
        if ("translate".equals(this.f5526b.mo16858h()) || "fade".equals(this.f5526b.mo16858h())) {
            this.f5527c.setVisibility(4);
        }
        List<ObjectAnimator> list = this.f5525a;
        if (list != null) {
            for (final ObjectAnimator next : list) {
                next.start();
                if (this.f5526b.mo16867p() > 0.0d && Build.VERSION.SDK_INT >= 19) {
                    next.addListener(new Animator.AnimatorListener() {
                        public void onAnimationCancel(Animator animator) {
                        }

                        public void onAnimationEnd(Animator animator) {
                        }

                        public void onAnimationStart(Animator animator) {
                        }

                        public void onAnimationRepeat(Animator animator) {
                            next.pause();
                            C2595a aVar = new C2595a(next);
                            ScheduledFuture<?> schedule = C2882e.m8045d().schedule(aVar, (long) (C2592d.this.f5526b.mo16867p() * 1000.0d), TimeUnit.MILLISECONDS);
                            aVar.mo16812a(schedule);
                            C2592d.this.f5528d.add(schedule);
                        }
                    });
                }
            }
        }
    }

    /* renamed from: b */
    public void mo16803b() {
        List<ObjectAnimator> list = this.f5525a;
        if (list != null) {
            for (ObjectAnimator next : list) {
                next.cancel();
                next.removeAllUpdateListeners();
            }
            for (ScheduledFuture<?> cancel : this.f5528d) {
                cancel.cancel(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ObjectAnimator mo16805a(final ObjectAnimator objectAnimator) {
        objectAnimator.setStartDelay((long) (this.f5526b.mo16864m() * 1000.0d));
        if (this.f5526b.mo16865n() > 0) {
            objectAnimator.setRepeatCount(this.f5526b.mo16865n() - 1);
        } else {
            objectAnimator.setRepeatCount(-1);
        }
        if (!Constants.NORMAL.equals(this.f5526b.mo16866o())) {
            if ("reverse".equals(this.f5526b.mo16866o()) || "alternate".equals(this.f5526b.mo16866o())) {
                objectAnimator.setRepeatMode(2);
            } else {
                objectAnimator.setRepeatMode(1);
            }
        }
        if ("ease-in-out".equals(this.f5526b.mo16863l())) {
            objectAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        } else if ("ease-in".equals(this.f5526b.mo16866o())) {
            objectAnimator.setInterpolator(new AccelerateInterpolator());
        } else if ("ease-out".equals(this.f5526b.mo16866o())) {
            objectAnimator.setInterpolator(new DecelerateInterpolator());
        } else {
            objectAnimator.setInterpolator(new LinearInterpolator());
        }
        objectAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (valueAnimator.getCurrentPlayTime() > 0) {
                    C2592d.this.f5527c.setVisibility(0);
                    objectAnimator.removeAllUpdateListeners();
                }
            }
        });
        return objectAnimator;
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.a.d$a */
    /* compiled from: BaseAnimation */
    public class C2595a implements Runnable {

        /* renamed from: a */
        ObjectAnimator f5533a;

        /* renamed from: b */
        ScheduledFuture<?> f5534b;

        C2595a(ObjectAnimator objectAnimator) {
            this.f5533a = objectAnimator;
        }

        /* renamed from: a */
        public void mo16812a(ScheduledFuture<?> scheduledFuture) {
            this.f5534b = scheduledFuture;
        }

        public void run() {
            if (Build.VERSION.SDK_INT >= 19 && C2529a.m6339a().mo16550c() != null) {
                C2529a.m6339a().mo16550c().mo16559c().post(new Runnable() {
                    public void run() {
                        C2595a.this.f5533a.resume();
                    }
                });
                if (this.f5534b != null) {
                    C2592d.this.f5528d.remove(this.f5534b);
                }
            }
        }
    }
}
