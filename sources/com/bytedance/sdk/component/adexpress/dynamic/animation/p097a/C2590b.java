package com.bytedance.sdk.component.adexpress.dynamic.animation.p097a;

import android.view.View;
import com.bytedance.sdk.component.adexpress.dynamic.dynamicview.C2655c;
import com.bytedance.sdk.component.adexpress.dynamic.p098b.C2610a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.animation.a.b */
/* compiled from: AnimationSets */
public class C2590b implements C2655c {

    /* renamed from: a */
    List<C2592d> f5523a = new ArrayList();

    public C2590b(View view, List<C2610a> list) {
        for (C2610a a : list) {
            C2592d a2 = C2591c.m6703a().mo16804a(view, a);
            if (a2 != null) {
                this.f5523a.add(a2);
            }
        }
    }

    /* renamed from: a */
    public void mo16802a() {
        for (C2592d c : this.f5523a) {
            try {
                c.mo16806c();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public void mo16803b() {
        for (C2592d b : this.f5523a) {
            try {
                b.mo16803b();
            } catch (Exception unused) {
            }
        }
    }
}
