package com.fyber.inneractive.sdk.player.p190ui;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.config.C4287y;
import com.fyber.inneractive.sdk.config.C4288z;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.C5292l;
import com.fyber.inneractive.sdk.util.C5306p0;
import com.fyber.inneractive.sdk.util.C5309q0;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.player.ui.c */
public abstract class C5036c extends RelativeLayout implements C5040g {

    /* renamed from: a */
    public final C5306p0 f13437a;

    /* renamed from: b */
    public int f13438b;

    /* renamed from: c */
    public C4288z f13439c;

    /* renamed from: d */
    public UnitDisplayType f13440d;

    /* renamed from: e */
    public boolean f13441e;

    /* renamed from: f */
    public boolean f13442f;

    /* renamed from: g */
    public C5041h f13443g;

    /* renamed from: h */
    public boolean f13444h;

    public C5036c(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f13437a = C5306p0.m16523a();
        this.f13438b = 0;
        this.f13441e = false;
        this.f13442f = false;
        this.f13444h = false;
        this.f13438b = Math.min(C5292l.m16516e(), C5292l.m16514d());
    }

    /* renamed from: a */
    public String mo25650a() {
        return IAlog.m16443a((Object) this);
    }

    /* renamed from: a */
    public abstract void mo25651a(C5309q0 q0Var, int i, int i2);

    /* renamed from: b */
    public void mo25652b() {
        boolean z = isShown() && hasWindowFocus() && this.f13442f && !this.f13444h;
        if (z) {
            z = getGlobalVisibleRect(new Rect());
        }
        if (z != this.f13441e && this.f13443g != null) {
            IAlog.m16446a("%supdateVisibility changing to %s", IAlog.m16443a((Object) this), Boolean.valueOf(z));
            this.f13441e = z;
            this.f13443g.mo24816a(z);
        }
    }

    public void destroy() {
        if (this.f13443g != null) {
            this.f13443g = null;
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        IAlog.m16446a("%sGot onAttachedToWindow: mIsAttached = %s", IAlog.m16443a((Object) this), Boolean.valueOf(this.f13442f));
        this.f13442f = true;
        C5041h hVar = this.f13443g;
        if (hVar != null) {
            hVar.mo24817b();
        }
        mo25652b();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        IAlog.m16446a("%sGot onDetachedFromWindow: mIsAttached = %s", IAlog.m16443a((Object) this), Boolean.valueOf(this.f13442f));
        this.f13442f = false;
        C5041h hVar = this.f13443g;
        if (hVar != null) {
            hVar.mo24852d();
        }
        mo25652b();
    }

    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (equals(view)) {
            IAlog.m16446a("%sgot onVisibilityChanged with %d", IAlog.m16443a((Object) this), Integer.valueOf(i));
            mo25652b();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        IAlog.m16446a("%sgot onWindowFocusChanged with: %s", IAlog.m16443a((Object) this), Boolean.valueOf(z));
        mo25652b();
    }

    public void setListener(C5041h hVar) {
        this.f13443g = hVar;
    }

    public void setUnitConfig(C4288z zVar) {
        UnitDisplayType unitDisplayType;
        this.f13439c = zVar;
        C4287y yVar = (C4287y) zVar;
        if (yVar.f10548e == null) {
            unitDisplayType = yVar.f10549f.f10378j;
        } else {
            unitDisplayType = UnitDisplayType.DEFAULT;
        }
        this.f13440d = unitDisplayType;
    }
}
