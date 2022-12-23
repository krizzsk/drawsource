package com.applovin.impl.sdk;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.view.animation.Animation;
import com.applovin.impl.mediation.p031a.C1587e;
import com.applovin.impl.sdk.utils.C2049g;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdkUtils;

/* renamed from: com.applovin.impl.sdk.z */
public class C2111z {

    /* renamed from: a */
    private final C1969m f4152a;

    /* renamed from: b */
    private final C2102v f4153b;

    /* renamed from: c */
    private final View f4154c;

    public C2111z(View view, C1969m mVar) {
        this.f4152a = mVar;
        this.f4153b = mVar.mo14509A();
        this.f4154c = view;
    }

    /* renamed from: a */
    public long mo15033a(C1587e eVar) {
        if (C2102v.m5104a()) {
            this.f4153b.mo15012b("ViewabilityTracker", "Checking visibility...");
        }
        long j = 0;
        if (!this.f4154c.isShown()) {
            if (C2102v.m5104a()) {
                this.f4153b.mo15016e("ViewabilityTracker", "View is hidden");
            }
            j = 2;
        }
        if (this.f4154c.getAlpha() < eVar.mo13424E()) {
            if (C2102v.m5104a()) {
                this.f4153b.mo15016e("ViewabilityTracker", "View is transparent");
            }
            j |= 4;
        }
        Animation animation = this.f4154c.getAnimation();
        if (animation != null && animation.hasStarted() && !animation.hasEnded()) {
            if (C2102v.m5104a()) {
                this.f4153b.mo15016e("ViewabilityTracker", "View is animating");
            }
            j |= 8;
        }
        if (this.f4154c.getParent() == null) {
            if (C2102v.m5104a()) {
                this.f4153b.mo15016e("ViewabilityTracker", "No parent view found");
            }
            j |= 16;
        }
        int pxToDp = AppLovinSdkUtils.pxToDp(this.f4154c.getContext(), this.f4154c.getWidth());
        if (pxToDp < eVar.mo13422C()) {
            if (C2102v.m5104a()) {
                C2102v vVar = this.f4153b;
                vVar.mo15016e("ViewabilityTracker", "View has width (" + pxToDp + ") below threshold");
            }
            j |= 32;
        }
        int pxToDp2 = AppLovinSdkUtils.pxToDp(this.f4154c.getContext(), this.f4154c.getHeight());
        if (pxToDp2 < eVar.mo13423D()) {
            if (C2102v.m5104a()) {
                C2102v vVar2 = this.f4153b;
                vVar2.mo15016e("ViewabilityTracker", "View has height (" + pxToDp2 + ") below threshold");
            }
            j |= 64;
        }
        Point a = C2049g.m4937a(this.f4154c.getContext());
        Rect rect = new Rect(0, 0, a.x, a.y);
        int[] iArr = {-1, -1};
        this.f4154c.getLocationOnScreen(iArr);
        Rect rect2 = new Rect(iArr[0], iArr[1], iArr[0] + this.f4154c.getWidth(), iArr[1] + this.f4154c.getHeight());
        if (!Rect.intersects(rect, rect2)) {
            if (C2102v.m5104a()) {
                C2102v vVar3 = this.f4153b;
                vVar3.mo15016e("ViewabilityTracker", "Rect (" + rect2 + ") outside of screen's bounds (" + rect + ")");
            }
            j |= 128;
        }
        Activity a2 = this.f4152a.mo14556af().mo14045a();
        if (a2 != null && !Utils.isViewInTopActivity(this.f4154c, a2)) {
            if (C2102v.m5104a()) {
                this.f4153b.mo15016e("ViewabilityTracker", "View is not in top activity's view hierarchy");
            }
            j |= 256;
        }
        if (C2102v.m5104a()) {
            C2102v vVar4 = this.f4153b;
            vVar4.mo15012b("ViewabilityTracker", "Returning flags: " + Long.toBinaryString(j));
        }
        return j;
    }
}
