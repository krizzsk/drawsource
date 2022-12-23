package com.bytedance.sdk.component.adexpress.dynamic.dynamicview;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.adexpress.dynamic.C2581a;
import com.bytedance.sdk.component.adexpress.dynamic.C2609b;
import com.bytedance.sdk.component.adexpress.dynamic.C2620c;
import com.bytedance.sdk.component.adexpress.dynamic.C2641d;
import com.bytedance.sdk.component.adexpress.dynamic.p096a.C2588b;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2615e;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2616f;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2618h;
import com.bytedance.sdk.component.adexpress.dynamic.p100d.C2642a;
import com.bytedance.sdk.component.adexpress.p093b.C2561j;
import com.bytedance.sdk.component.adexpress.p093b.C2563l;
import com.bytedance.sdk.component.adexpress.p093b.C2565m;
import com.bytedance.sdk.component.adexpress.theme.C2676a;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import java.util.ArrayList;
import java.util.List;

public class DynamicRootView extends FrameLayout implements C2620c, C2676a {

    /* renamed from: a */
    protected final C2565m f5774a;

    /* renamed from: b */
    boolean f5775b;

    /* renamed from: c */
    private C2561j f5776c;

    /* renamed from: d */
    private DynamicBaseWidget f5777d;

    /* renamed from: e */
    private C2642a f5778e;

    /* renamed from: f */
    private ThemeStatusBroadcastReceiver f5779f;

    /* renamed from: g */
    private C2581a f5780g;

    /* renamed from: h */
    private ViewGroup f5781h = null;

    /* renamed from: i */
    private int f5782i = 0;

    /* renamed from: j */
    private List<C2609b> f5783j = new ArrayList();

    /* renamed from: k */
    private C2641d f5784k;

    /* renamed from: l */
    private int f5785l = 0;

    /* renamed from: m */
    private int f5786m = 0;

    /* renamed from: n */
    private C2563l f5787n;

    /* renamed from: o */
    private Context f5788o;

    /* renamed from: p */
    private String f5789p;

    public DynamicRootView(Context context, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, boolean z, C2563l lVar, C2642a aVar) {
        super(context);
        this.f5788o = context;
        C2565m mVar = new C2565m();
        this.f5774a = mVar;
        mVar.mo16705a(2);
        this.f5778e = aVar;
        aVar.mo17132a((View) this);
        this.f5779f = themeStatusBroadcastReceiver;
        themeStatusBroadcastReceiver.mo17237a(this);
        this.f5775b = z;
        this.f5787n = lVar;
    }

    public String getBgColor() {
        return this.f5789p;
    }

    public void setBgColor(String str) {
        this.f5789p = str;
    }

    public void setRenderListener(C2561j jVar) {
        this.f5776c = jVar;
        this.f5778e.mo17133a(jVar);
    }

    /* renamed from: a */
    public void mo17183a(C2618h hVar, int i) {
        this.f5777d = mo17180a(hVar, (ViewGroup) this, i);
        this.f5774a.mo16707a(true);
        this.f5774a.mo16703a((double) this.f5777d.f5744e);
        this.f5774a.mo16710b((double) this.f5777d.f5745f);
        this.f5776c.mo16670a(this.f5774a);
    }

    /* renamed from: a */
    public DynamicBaseWidget mo17180a(C2618h hVar, ViewGroup viewGroup, int i) {
        if (hVar == null) {
            return null;
        }
        DynamicBaseWidget a = C2588b.m6699a(this.f5788o, this, hVar);
        if (a instanceof DynamicUnKnowView) {
            mo17182a(i == 3 ? 128 : 118);
            return null;
        }
        m7128a(hVar);
        a.mo17150c();
        if (viewGroup != null) {
            viewGroup.addView(a);
            m7127a(viewGroup, hVar);
        }
        List<C2618h> j = hVar.mo17083j();
        if (j == null || j.size() <= 0) {
            return null;
        }
        for (C2618h a2 : j) {
            mo17180a(a2, (ViewGroup) a, i);
        }
        return a;
    }

    /* renamed from: a */
    private void m7128a(C2618h hVar) {
        C2616f e;
        C2615e i = hVar.mo17082i();
        if (i != null && (e = i.mo16882e()) != null) {
            this.f5774a.mo16713b(e.mo16929ak());
        }
    }

    /* renamed from: a */
    private void m7127a(ViewGroup viewGroup, C2618h hVar) {
        ViewGroup viewGroup2;
        if (viewGroup != null && (viewGroup2 = (ViewGroup) viewGroup.getParent()) != null && hVar.mo17093t()) {
            viewGroup2.setClipChildren(false);
            viewGroup2.setClipToPadding(false);
            ViewGroup viewGroup3 = (ViewGroup) viewGroup2.getParent();
            if (viewGroup3 != null) {
                viewGroup3.setClipChildren(false);
                viewGroup3.setClipToPadding(false);
            }
        }
    }

    /* renamed from: a */
    public void mo17181a(double d, double d2, double d3, double d4, float f) {
        this.f5774a.mo16715c(d);
        this.f5774a.mo16718d(d2);
        this.f5774a.mo16721e(d3);
        this.f5774a.mo16723f(d4);
        this.f5774a.mo16704a(f);
        this.f5774a.mo16711b(f);
        this.f5774a.mo16716c(f);
        this.f5774a.mo16719d(f);
    }

    /* renamed from: a */
    public void mo17182a(int i) {
        this.f5774a.mo16707a(false);
        this.f5774a.mo16712b(i);
        this.f5776c.mo16670a(this.f5774a);
    }

    public void setMuteListener(C2581a aVar) {
        this.f5780g = aVar;
    }

    public void setDislikeView(View view) {
        this.f5778e.mo17134b(view);
    }

    public C2561j getRenderListener() {
        return this.f5776c;
    }

    public C2642a getDynamicClickListener() {
        return this.f5778e;
    }

    /* renamed from: b */
    public void mo17184b(int i) {
        DynamicBaseWidget dynamicBaseWidget = this.f5777d;
        if (dynamicBaseWidget != null) {
            dynamicBaseWidget.mo17148a(i);
        }
    }

    /* renamed from: a */
    public void mo17097a(CharSequence charSequence, int i, int i2) {
        for (int i3 = 0; i3 < this.f5783j.size(); i3++) {
            if (this.f5783j.get(i3) != null) {
                C2609b bVar = this.f5783j.get(i3);
                boolean z = true;
                if (i != 1) {
                    z = false;
                }
                bVar.mo16832a(charSequence, z, i2);
            }
        }
    }

    public void setSoundMute(boolean z) {
        C2581a aVar = this.f5780g;
        if (aVar != null) {
            aVar.setSoundMute(z);
        }
    }

    public void setTimeUpdate(int i) {
        this.f5784k.setTimeUpdate(i);
    }

    /* renamed from: f */
    public void mo17098f() {
        this.f5784k.mo17130a();
    }

    public ViewGroup getTimeOut() {
        return this.f5781h;
    }

    public void setTimeOut(ViewGroup viewGroup) {
        this.f5781h = viewGroup;
    }

    public int getTimedown() {
        return this.f5782i;
    }

    public void setTimedown(int i) {
        this.f5782i = i;
    }

    public List<C2609b> getTimeOutListener() {
        return this.f5783j;
    }

    public void setTimeOutListener(C2609b bVar) {
        this.f5783j.add(bVar);
    }

    public void setVideoListener(C2641d dVar) {
        this.f5784k = dVar;
    }

    public int getScoreCountWithIcon() {
        return this.f5786m;
    }

    public void setScoreCountWithIcon(int i) {
        this.f5786m = i;
    }

    public int getLogoUnionHeight() {
        return this.f5785l;
    }

    public void setLogoUnionHeight(int i) {
        this.f5785l = i;
    }

    public C2563l getRenderRequest() {
        return this.f5787n;
    }
}
