package com.unity3d.services.banners.view;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.RelativeLayout;
import com.unity3d.services.ads.webplayer.C11929f;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.banners.bridge.C11961a;
import com.unity3d.services.core.misc.C12080j;
import com.unity3d.services.core.misc.C12081k;
import org.json.JSONObject;

/* renamed from: com.unity3d.services.banners.view.b */
/* compiled from: BannerWebPlayerContainer */
public class C11965b extends RelativeLayout {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C11929f f29090a;

    /* renamed from: b */
    private int f29091b = -1;

    /* renamed from: c */
    private UnityBannerSize f29092c;

    /* renamed from: d */
    private String f29093d;

    /* renamed from: e */
    private JSONObject f29094e;

    /* renamed from: f */
    private JSONObject f29095f;

    /* renamed from: g */
    private JSONObject f29096g;

    /* renamed from: h */
    private Runnable f29097h = null;

    /* renamed from: com.unity3d.services.banners.view.b$a */
    /* compiled from: BannerWebPlayerContainer */
    class C11966a implements View.OnLayoutChangeListener {
        C11966a() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            C11965b.this.mo71000a(view, i, i2, i3, i4, i5, i6, i7, i8);
        }
    }

    /* renamed from: com.unity3d.services.banners.view.b$b */
    /* compiled from: BannerWebPlayerContainer */
    class C11967b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View.OnLayoutChangeListener f29099a;

        C11967b(View.OnLayoutChangeListener onLayoutChangeListener) {
            this.f29099a = onLayoutChangeListener;
        }

        public void run() {
            C11965b.this.removeOnLayoutChangeListener(this.f29099a);
        }
    }

    /* renamed from: com.unity3d.services.banners.view.b$c */
    /* compiled from: BannerWebPlayerContainer */
    class C11968c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C11965b f29101a;

        C11968c(C11965b bVar) {
            this.f29101a = bVar;
        }

        public void run() {
            this.f29101a.removeAllViews();
            ViewParent parent = this.f29101a.getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                ((ViewGroup) parent).removeView(this.f29101a);
            }
            if (this.f29101a.f29090a != null) {
                this.f29101a.f29090a.destroy();
            }
            C11929f unused = this.f29101a.f29090a = null;
        }
    }

    public C11965b(Context context, String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, UnityBannerSize unityBannerSize) {
        super(context);
        this.f29092c = unityBannerSize;
        this.f29093d = str;
        this.f29094e = jSONObject;
        this.f29095f = jSONObject2;
        this.f29096g = jSONObject3;
        C11929f fVar = new C11929f(context, str, this.f29094e, this.f29095f);
        this.f29090a = fVar;
        fVar.setEventSettings(this.f29096g);
        m32565c();
        addView(this.f29090a);
        m32564b();
    }

    /* renamed from: b */
    private void m32564b() {
        setLayoutParams(new RelativeLayout.LayoutParams(Math.round(C12081k.m32887b(getContext(), (float) this.f29092c.getWidth())), Math.round(C12081k.m32887b(getContext(), (float) this.f29092c.getHeight()))));
        ViewGroup.LayoutParams layoutParams = this.f29090a.getLayoutParams();
        layoutParams.height = -1;
        layoutParams.width = -1;
        this.f29090a.setLayoutParams(layoutParams);
    }

    /* renamed from: c */
    private void m32565c() {
        Runnable runnable = this.f29097h;
        if (runnable != null) {
            runnable.run();
        }
        if (Build.VERSION.SDK_INT >= 11) {
            C11966a aVar = new C11966a();
            addOnLayoutChangeListener(aVar);
            this.f29097h = new C11967b(aVar);
        }
    }

    public C11929f getWebPlayer() {
        return this.f29090a;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C11961a.m32555b(this.f29093d);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C11961a.m32556c(this.f29093d);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i3 != 0 || i4 != 0) {
            int left = getLeft();
            int right = getRight();
            float f = 1.0f;
            if (Build.VERSION.SDK_INT >= 11) {
                f = getAlpha();
            }
            C11961a.m32553a(this.f29093d, left, right, i, i2, f);
            Rect rect = new Rect();
            getHitRect(rect);
            if (((View) getParent()).getLocalVisibleRect(rect)) {
                onVisibilityChanged(this, 8);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        if (view == this) {
            int i2 = this.f29091b;
            if (i2 == -1) {
                this.f29091b = i;
                return;
            }
            if (i != 0 && i2 == 0) {
                C11961a.m32552a(this.f29093d, i);
            }
            this.f29091b = i;
        }
    }

    public void setAlpha(float f) {
        super.setAlpha(f);
        mo71000a(this, getLeft(), getTop(), getRight(), getBottom(), getLeft(), getTop(), getRight(), getBottom());
    }

    public void setWebPlayerEventSettings(JSONObject jSONObject) {
        this.f29096g = jSONObject;
    }

    /* renamed from: a */
    public void mo71001a(JSONObject jSONObject, JSONObject jSONObject2) {
        this.f29094e = jSONObject;
        this.f29095f = jSONObject2;
    }

    /* renamed from: a */
    public void mo70999a() {
        Runnable runnable = this.f29097h;
        if (runnable != null) {
            runnable.run();
        }
        C12080j.m32879a((Runnable) new C11968c(this));
    }

    /* renamed from: a */
    public void mo71000a(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C11961a.m32553a(this.f29093d, i, i2, i3, i4, Build.VERSION.SDK_INT >= 11 ? getAlpha() : 1.0f);
        if (getParent() != null) {
            Rect rect = new Rect();
            getHitRect(rect);
            if ((getParent() instanceof View) && !((View) getParent()).getLocalVisibleRect(rect)) {
                onVisibilityChanged(this, 8);
            }
        }
    }
}
