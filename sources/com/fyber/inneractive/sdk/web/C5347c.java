package com.fyber.inneractive.sdk.web;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.p191ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.C5299n;
import com.fyber.inneractive.sdk.util.C5306p0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C5371o;

/* renamed from: com.fyber.inneractive.sdk.web.c */
public class C5347c extends WebView {

    /* renamed from: a */
    public boolean f14111a = false;

    /* renamed from: b */
    public boolean f14112b;

    /* renamed from: c */
    public C5348a f14113c;

    /* renamed from: d */
    public C5371o f14114d;

    /* renamed from: e */
    public final C5306p0 f14115e = C5306p0.m16523a();

    /* renamed from: f */
    public int f14116f;

    /* renamed from: g */
    public int f14117g;

    /* renamed from: com.fyber.inneractive.sdk.web.c$a */
    public interface C5348a {
    }

    public C5347c() {
        super((Context) null);
    }

    /* renamed from: a */
    public void mo26448a(String str) {
        IAlog.m16446a("injecting JS: %s", str);
        if (str != null) {
            try {
                loadUrl("javascript:" + str);
            } catch (Exception unused) {
                IAlog.m16446a("Failed to inject JS", new Object[0]);
            }
        }
    }

    public void destroy() {
        try {
            super.destroy();
        } catch (Throwable unused) {
        }
        this.f14113c = null;
    }

    public int getHeightDp() {
        return this.f14117g;
    }

    public boolean getIsVisible() {
        return this.f14112b;
    }

    public C5306p0 getLastClickedLocation() {
        return this.f14115e;
    }

    public int getWidthDp() {
        return this.f14116f;
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!this.f14111a) {
            this.f14111a = true;
            C5348a aVar = this.f14113c;
            if (aVar != null) {
                C5349d dVar = (C5349d) aVar;
                dVar.getClass();
                C5299n.f14024b.post(new C5362f(dVar));
            }
            mo26449a();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f14112b = false;
        if (this.f14111a) {
            this.f14111a = false;
            C5348a aVar = this.f14113c;
            if (aVar != null) {
                C5349d dVar = (C5349d) aVar;
                dVar.getClass();
                C5299n.f14024b.post(new C5363g(dVar));
            }
            mo26449a();
        }
    }

    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        mo26449a();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C5371o oVar = this.f14114d;
        if (oVar != null) {
            oVar.onTouch(this, motionEvent);
        }
        if (motionEvent.getAction() == 0) {
            C5306p0 p0Var = this.f14115e;
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            p0Var.f14029a = x;
            p0Var.f14030b = y;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        mo26449a();
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        IAlog.m16449d("onWindowFocusChanged with: %s", Boolean.valueOf(z));
        mo26449a();
    }

    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (i == 8) {
            mo26450a(false);
        } else {
            mo26449a();
        }
    }

    public void setHeightDp(int i) {
        this.f14117g = i;
    }

    public void setListener(C5348a aVar) {
        this.f14113c = aVar;
    }

    public void setTapListener(C5371o.C5372a aVar) {
        this.f14114d = new C5371o(aVar, getContext());
    }

    public void setWidthDp(int i) {
        this.f14116f = i;
    }

    /* renamed from: a */
    public boolean mo26449a() {
        boolean z = false;
        IAlog.m16449d("updateVisibility called - is = %s hwf = %s atw = %swinToken - %s app token - %s", Boolean.valueOf(isShown()), Boolean.valueOf(hasWindowFocus()), Boolean.valueOf(this.f14111a), getWindowToken(), getApplicationWindowToken());
        if (getWindowToken() != getApplicationWindowToken()) {
            if (getWindowVisibility() != 8 && isShown() && this.f14111a) {
                z = true;
            }
            return mo26450a(z);
        }
        if (isShown() && hasWindowFocus() && this.f14111a) {
            z = true;
        }
        return mo26450a(z);
    }

    public C5347c(Context context) {
        super(context.getApplicationContext());
    }

    /* renamed from: a */
    public final boolean mo26450a(boolean z) {
        if (z) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                Rect rect = new Rect();
                viewGroup.getHitRect(rect);
                if (!getLocalVisibleRect(rect) && getWindowToken() == getApplicationWindowToken()) {
                    IAlog.m16449d("updateVisibility - Cannot find local visible rect. Scrolled out?", new Object[0]);
                    z = false;
                }
            } else {
                IAlog.m16449d("updateVisibility - No parent available", new Object[0]);
            }
        }
        if (this.f14112b == z) {
            return false;
        }
        this.f14112b = z;
        C5348a aVar = this.f14113c;
        if (aVar != null) {
            ((IAmraidWebViewController) aVar).mo26344e(z);
        }
        return true;
    }
}
