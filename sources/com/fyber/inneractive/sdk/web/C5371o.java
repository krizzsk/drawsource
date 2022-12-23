package com.fyber.inneractive.sdk.web;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.C5299n;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.web.o */
public final class C5371o implements View.OnTouchListener {

    /* renamed from: a */
    public final C5372a f14179a;

    /* renamed from: b */
    public float f14180b;

    /* renamed from: c */
    public float f14181c;

    /* renamed from: d */
    public float f14182d;

    /* renamed from: com.fyber.inneractive.sdk.web.o$a */
    public interface C5372a {
    }

    public C5371o(C5372a aVar, Context context) {
        this.f14179a = aVar;
        this.f14182d = (float) ViewConfiguration.get(context).getScaledTouchSlop();
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (this.f14179a != null) {
            if (motionEvent.getActionMasked() == 0) {
                ((C5338a) this.f14179a).mo26433d();
                this.f14180b = motionEvent.getX();
                this.f14181c = motionEvent.getY();
            } else if (motionEvent.getActionMasked() == 3) {
                ((C5338a) this.f14179a).mo26433d();
                this.f14181c = -1.0f;
                this.f14180b = -1.0f;
            } else if (motionEvent.getActionMasked() == 1) {
                float f = this.f14180b;
                if (f >= 0.0f && this.f14181c >= 0.0f) {
                    float round = (float) Math.round(Math.abs(this.f14181c - motionEvent.getY()));
                    float f2 = this.f14182d;
                    if (((float) Math.round(Math.abs(f - motionEvent.getX()))) < f2 && round < f2) {
                        C5338a aVar = (C5338a) this.f14179a;
                        aVar.getClass();
                        IAlog.m16446a("IAWebViewController onClicked()", new Object[0]);
                        if (aVar.f14089l != null) {
                            IAlog.m16449d("Native click detected in time. Processing pending click", new Object[0]);
                            aVar.f14089l.mo26446d();
                            Runnable runnable = aVar.f14090m;
                            if (runnable != null) {
                                C5299n.f14024b.removeCallbacks(runnable);
                            }
                            aVar.f14089l = null;
                            aVar.mo26433d();
                        } else {
                            if (aVar.f14091n != null) {
                                C5299n.f14024b.postDelayed(aVar.f14091n, (long) IAConfigManager.f10324J.f10356v.f10459b.mo24271a("click_timeout", 1000, 1000));
                            }
                            aVar.f14087j = true;
                        }
                    }
                    this.f14180b = -1.0f;
                    this.f14181c = -1.0f;
                }
            }
        }
        return false;
    }
}
