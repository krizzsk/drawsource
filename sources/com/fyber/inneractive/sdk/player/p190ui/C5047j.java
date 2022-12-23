package com.fyber.inneractive.sdk.player.p190ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.fyber.inneractive.sdk.player.ui.j */
public class C5047j extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ C5042i f13484a;

    public C5047j(C5042i iVar) {
        this.f13484a = iVar;
    }

    public void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        C5042i iVar = this.f13484a;
        ViewGroup viewGroup = iVar.f13473y;
        if (viewGroup != null && viewGroup.getParent() != null) {
            ((View) iVar.f13473y.getParent()).setOnTouchListener((View.OnTouchListener) null);
        }
    }
}
