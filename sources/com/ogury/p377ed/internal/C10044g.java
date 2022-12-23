package com.ogury.p377ed.internal;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.ogury.p377ed.internal.C10303o;

/* renamed from: com.ogury.ed.internal.g */
public final class C10044g extends FrameLayout implements C10326p {

    /* renamed from: a */
    public static final C10045a f25264a = new C10045a((byte) 0);

    /* renamed from: b */
    private int f25265b;

    /* renamed from: c */
    private int f25266c;

    /* renamed from: d */
    private final C9854be f25267d = new C9854be();

    /* renamed from: e */
    private C10273n f25268e;

    /* renamed from: f */
    private C10146iz f25269f;

    /* renamed from: g */
    private C10228lk<? super C10044g, C10182ke> f25270g;

    /* renamed from: h */
    private C10228lk<? super C10044g, C10182ke> f25271h;

    /* renamed from: i */
    private C10227lj<C10182ke> f25272i;

    /* renamed from: j */
    private C10227lj<C10182ke> f25273j;

    /* renamed from: k */
    private C10227lj<C10182ke> f25274k;

    /* renamed from: l */
    private C10227lj<C10182ke> f25275l;

    /* renamed from: m */
    private C10227lj<C10182ke> f25276m;

    /* renamed from: n */
    private boolean f25277n;

    /* renamed from: o */
    private boolean f25278o;

    /* renamed from: p */
    private C10146iz f25279p;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10044g(Context context) {
        super(context);
        C10263mq.m29882b(context, "context");
        C10303o.C10304a aVar = C10303o.f25629a;
        this.f25268e = C10303o.C10304a.m29936a();
        setLayoutParams(new FrameLayout.LayoutParams(600, 600));
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                C10044g.m29167a(C10044g.this, view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        });
    }

    public final int getContainerHeight() {
        return this.f25265b;
    }

    public final void setContainerHeight(int i) {
        this.f25265b = i;
    }

    public final int getContainerWidth() {
        return this.f25266c;
    }

    public final void setContainerWidth(int i) {
        this.f25266c = i;
    }

    public final C10146iz getResizeProps() {
        return this.f25269f;
    }

    public final void setResizeProps(C10146iz izVar) {
        this.f25269f = izVar;
    }

    public final C10228lk<C10044g, C10182ke> getAdLayoutChangeListener() {
        return this.f25270g;
    }

    public final void setAdLayoutChangeListener(C10228lk<? super C10044g, C10182ke> lkVar) {
        this.f25270g = lkVar;
    }

    public final C10228lk<C10044g, C10182ke> getOnMouseUpListener() {
        return this.f25271h;
    }

    public final void setOnMouseUpListener(C10228lk<? super C10044g, C10182ke> lkVar) {
        this.f25271h = lkVar;
    }

    public final C10227lj<C10182ke> getOnWindowGainFocusListener() {
        return this.f25272i;
    }

    public final void setOnWindowGainFocusListener(C10227lj<C10182ke> ljVar) {
        this.f25272i = ljVar;
    }

    public final C10227lj<C10182ke> getOnWindowLoseFocusListener() {
        return this.f25273j;
    }

    public final void setOnWindowLoseFocusListener(C10227lj<C10182ke> ljVar) {
        this.f25273j = ljVar;
    }

    public final C10227lj<C10182ke> getOnAttachToWindowListener() {
        return this.f25274k;
    }

    public final void setOnAttachToWindowListener(C10227lj<C10182ke> ljVar) {
        this.f25274k = ljVar;
    }

    public final C10227lj<C10182ke> getOnDetachFromWindowListener() {
        return this.f25275l;
    }

    public final void setOnDetachFromWindowListener(C10227lj<C10182ke> ljVar) {
        this.f25275l = ljVar;
    }

    public final C10227lj<C10182ke> getOnOverlayPositionChanged() {
        return this.f25276m;
    }

    public final void setOnOverlayPositionChanged(C10227lj<C10182ke> ljVar) {
        this.f25276m = ljVar;
    }

    public final void setDisplayedInFullScreen(boolean z) {
        this.f25277n = z;
    }

    public final boolean getContainsOverlayAd() {
        return this.f25278o;
    }

    public final void setContainsOverlayAd(boolean z) {
        this.f25278o = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m29167a(C10044g gVar, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C10263mq.m29882b(gVar, "this$0");
        C10228lk<C10044g, C10182ke> adLayoutChangeListener = gVar.getAdLayoutChangeListener();
        if (adLayoutChangeListener != null) {
            adLayoutChangeListener.mo64242a(gVar);
        }
    }

    /* renamed from: com.ogury.ed.internal.g$a */
    public static final class C10045a {
        public /* synthetic */ C10045a(byte b) {
            this();
        }

        private C10045a() {
        }
    }

    public final void setupDrag(boolean z) {
        C10303o.C10304a aVar = C10303o.f25629a;
        this.f25268e = C10303o.C10304a.m29937a(this, z);
    }

    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        C10263mq.m29882b(view, "child");
        C10263mq.m29882b(layoutParams, "params");
        if (!(view instanceof WebView) || getChildCount() <= 0) {
            super.addView(view, layoutParams);
        } else {
            super.addView(view, getChildCount() - 1, layoutParams);
        }
    }

    /* renamed from: a */
    public final void mo64735a() {
        ViewGroup parentAsViewGroup = getParentAsViewGroup();
        if (parentAsViewGroup != null) {
            parentAsViewGroup.removeView(this);
        }
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C10263mq.m29882b(motionEvent, "ev");
        if (this.f25268e.mo65147a(motionEvent)) {
            return true;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* renamed from: b */
    public final void mo64738b() {
        C10227lj<C10182ke> ljVar;
        C10228lk<? super C10044g, C10182ke> lkVar = this.f25271h;
        if (lkVar != null) {
            lkVar.mo64242a(this);
        }
        C10228lk<? super C10044g, C10182ke> lkVar2 = this.f25270g;
        if (lkVar2 != null) {
            lkVar2.mo64242a(this);
        }
        if (m29172i() && (ljVar = this.f25276m) != null) {
            ljVar.mo64355a();
        }
    }

    /* renamed from: c */
    public final void mo64739c() {
        m29168a(this.f25269f);
    }

    /* renamed from: a */
    public final void mo64736a(Rect rect) {
        m29168a(C10149ja.m29670a(this.f25269f, rect));
    }

    /* renamed from: a */
    private final void m29168a(C10146iz izVar) {
        if (izVar != null) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                setX((float) izVar.mo64951d());
                setY((float) izVar.mo64953e());
                layoutParams2.width = izVar.mo64947b();
                layoutParams2.height = izVar.mo64949c();
                layoutParams2.gravity = izVar.mo64956f();
                setLayoutParams(layoutParams2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        }
    }

    /* renamed from: h */
    private final void m29171h() {
        setX(0.0f);
        setY(0.0f);
    }

    /* renamed from: d */
    public final void mo64740d() {
        m29171h();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.width = -1;
            layoutParams2.height = -1;
            setLayoutParams(layoutParams2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    public final void setInitialSize(C10146iz izVar) {
        C10263mq.m29882b(izVar, "initialSize");
        this.f25279p = izVar;
        m29171h();
        m29168a(izVar);
    }

    public final void setInitialSizeWithoutResizing(C10146iz izVar) {
        C10263mq.m29882b(izVar, "initialSize");
        this.f25279p = izVar;
    }

    /* renamed from: e */
    public final void mo64742e() {
        m29171h();
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            if (this.f25278o) {
                this.f25269f = this.f25267d.mo64370a((View) viewGroup, this.f25279p);
            } else {
                this.f25269f = this.f25279p;
            }
            m29166a(viewGroup);
        }
    }

    /* renamed from: a */
    private final void m29166a(ViewGroup viewGroup) {
        setContainerWidth(viewGroup.getMeasuredWidth());
        setContainerHeight(viewGroup.getMeasuredHeight());
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ViewGroup parentAsViewGroup = getParentAsViewGroup();
        if (parentAsViewGroup != null) {
            if (m29172i()) {
                m29169b(parentAsViewGroup);
                C10227lj<C10182ke> ljVar = this.f25276m;
                if (ljVar != null) {
                    ljVar.mo64355a();
                }
            }
            m29166a(parentAsViewGroup);
        }
    }

    /* renamed from: i */
    private final boolean m29172i() {
        return !this.f25277n && this.f25278o;
    }

    /* renamed from: b */
    private final void m29169b(ViewGroup viewGroup) {
        if (getContainerHeight() != viewGroup.getMeasuredHeight() || getContainerWidth() != viewGroup.getMeasuredWidth()) {
            m29170c(viewGroup);
        }
    }

    /* renamed from: c */
    private final void m29170c(ViewGroup viewGroup) {
        m29168a(this.f25267d.mo64371a(this, (View) viewGroup));
    }

    /* access modifiers changed from: protected */
    public final void onAttachedToWindow() {
        if (this.f25278o) {
            C10329s sVar = C10329s.f25652a;
            C10329s.m29984a(true);
        }
        super.onAttachedToWindow();
        C10227lj<C10182ke> ljVar = this.f25274k;
        if (ljVar != null) {
            ljVar.mo64355a();
        }
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        this.f25277n = false;
        if (this.f25278o) {
            C10329s sVar = C10329s.f25652a;
            C10329s.m29984a(false);
        }
        super.onDetachedFromWindow();
        C10227lj<C10182ke> ljVar = this.f25275l;
        if (ljVar != null) {
            ljVar.mo64355a();
        }
    }

    public final ViewGroup getParentAsViewGroup() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            return (ViewGroup) parent;
        }
        return null;
    }

    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            C10227lj<C10182ke> ljVar = this.f25272i;
            if (ljVar != null) {
                ljVar.mo64355a();
                return;
            }
            return;
        }
        C10227lj<C10182ke> ljVar2 = this.f25273j;
        if (ljVar2 != null) {
            ljVar2.mo64355a();
        }
    }

    /* renamed from: f */
    public final void mo64743f() {
        this.f25270g = null;
        this.f25272i = null;
        this.f25273j = null;
        this.f25274k = null;
        this.f25275l = null;
        this.f25271h = null;
        this.f25276m = null;
        removeAllViews();
    }

    /* renamed from: g */
    public final boolean mo64744g() {
        Activity a = C10062gp.m29210a((View) this);
        if (a == null) {
            return true;
        }
        return a.hasWindowFocus();
    }
}
