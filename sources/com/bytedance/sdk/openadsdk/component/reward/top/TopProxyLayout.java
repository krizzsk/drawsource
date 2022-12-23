package com.bytedance.sdk.openadsdk.component.reward.top;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;

public class TopProxyLayout extends View implements C3311a<TopProxyLayout> {

    /* renamed from: a */
    private C3311a f7886a;

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
    }

    public void draw(Canvas canvas) {
    }

    public TopProxyLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    public TopProxyLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TopProxyLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setVisibility(8);
        setWillNotDraw(true);
    }

    public View getITopLayout() {
        C3311a aVar = this.f7886a;
        if (!(aVar instanceof View)) {
            return null;
        }
        return (View) aVar;
    }

    /* renamed from: a */
    public TopProxyLayout mo19164a(boolean z, C3431n nVar) {
        TopLayoutDislike2 a = new TopLayoutDislike2(getContext()).mo19150a(z, nVar);
        if (a instanceof C3311a) {
            this.f7886a = a;
            ViewParent parent = getParent();
            if (parent != null && (parent instanceof ViewGroup)) {
                m9770a((View) a, (ViewGroup) parent);
            }
            return this;
        }
        C2905l.m8118e("TopProxyLayout", "view not implements ITopLayout interface");
        return this;
    }

    /* renamed from: a */
    private void m9770a(View view, ViewGroup viewGroup) {
        int indexOfChild = viewGroup.indexOfChild(this);
        viewGroup.removeViewInLayout(this);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            viewGroup.addView(view, indexOfChild, layoutParams);
        } else {
            viewGroup.addView(view, indexOfChild);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setShowSkip(boolean z) {
        C3311a aVar = this.f7886a;
        if (aVar != null) {
            aVar.setShowSkip(z);
        }
    }

    public void setSkipEnable(boolean z) {
        C3311a aVar = this.f7886a;
        if (aVar != null) {
            aVar.setSkipEnable(z);
        }
    }

    /* renamed from: c */
    public void mo19154c() {
        C3311a aVar = this.f7886a;
        if (aVar != null) {
            aVar.mo19154c();
        }
    }

    public void setShowSound(boolean z) {
        C3311a aVar = this.f7886a;
        if (aVar != null) {
            aVar.setShowSound(z);
        }
    }

    public void setSoundMute(boolean z) {
        C3311a aVar = this.f7886a;
        if (aVar != null) {
            aVar.setSoundMute(z);
        }
    }

    /* renamed from: a */
    public void mo19152a(CharSequence charSequence, CharSequence charSequence2) {
        C3311a aVar = this.f7886a;
        if (aVar != null) {
            aVar.mo19152a(charSequence, charSequence2);
        }
    }

    public void setShowDislike(boolean z) {
        C3311a aVar = this.f7886a;
        if (aVar != null) {
            aVar.setShowDislike(z);
        }
    }

    public void setListener(C3312b bVar) {
        C3311a aVar = this.f7886a;
        if (aVar != null) {
            aVar.setListener(bVar);
        }
    }

    /* renamed from: a */
    public void mo19151a() {
        C3311a aVar = this.f7886a;
        if (aVar != null) {
            aVar.mo19151a();
        }
    }

    /* renamed from: b */
    public void mo19153b() {
        C3311a aVar = this.f7886a;
        if (aVar != null) {
            aVar.mo19153b();
        }
    }
}
