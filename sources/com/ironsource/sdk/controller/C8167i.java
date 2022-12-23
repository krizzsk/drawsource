package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ironsource.environment.C6393h;
import com.ironsource.sdk.controller.C8202x;
import com.ironsource.sdk.p287i.C8308a;
import com.ironsource.sdk.p288j.C8320g;

/* renamed from: com.ironsource.sdk.controller.i */
public final class C8167i extends FrameLayout implements C8320g {

    /* renamed from: a */
    Context f19850a;

    /* renamed from: b */
    C8202x f19851b;

    public C8167i(Context context) {
        super(context);
        this.f19850a = context;
        setClickable(true);
    }

    /* renamed from: a */
    static /* synthetic */ ViewGroup m23313a(C8167i iVar) {
        Activity activity = (Activity) iVar.f19850a;
        if (activity != null) {
            return (ViewGroup) activity.getWindow().getDecorView();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo56455a() {
        int identifier;
        try {
            if (this.f19850a == null || (identifier = this.f19850a.getResources().getIdentifier("status_bar_height", "dimen", "android")) <= 0) {
                return 0;
            }
            return this.f19850a.getResources().getDimensionPixelSize(identifier);
        } catch (Exception unused) {
            return 0;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public int mo56456b() {
        Activity activity = (Activity) this.f19850a;
        try {
            if (Build.VERSION.SDK_INT > 9) {
                Rect rect = new Rect();
                activity.getWindow().getDecorView().getDrawingRect(rect);
                Rect rect2 = new Rect();
                activity.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect2);
                if (C6393h.m19130o(activity) == 1) {
                    if (rect.bottom - rect2.bottom > 0) {
                        return rect.bottom - rect2.bottom;
                    }
                    return 0;
                } else if (rect.right - rect2.right > 0) {
                    return rect.right - rect2.right;
                }
            }
        } catch (Exception unused) {
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f19851b.mo56514l();
        this.f19851b.mo56503a(true, "main");
    }

    public final boolean onBackButtonPressed() {
        new C8308a();
        return C8308a.m23666a((Activity) this.f19850a);
    }

    public final void onCloseRequested() {
        ((Activity) this.f19850a).runOnUiThread(new Runnable() {
            public final void run() {
                ViewGroup a = C8167i.m23313a(C8167i.this);
                if (a != null) {
                    a.removeView(C8167i.this);
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f19851b.mo56513k();
        this.f19851b.mo56503a(false, "main");
        C8202x xVar = this.f19851b;
        if (xVar != null) {
            xVar.f19978j = C8202x.C8258g.Gone;
            this.f19851b.f19980l = null;
            this.f19851b.f19990v = null;
        }
        removeAllViews();
    }

    public final void onOrientationChanged(String str, int i) {
    }
}
