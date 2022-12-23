package com.ogury.p377ed.internal;

import android.graphics.Rect;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ogury.ed.internal.gy */
public final class C10074gy {

    /* renamed from: a */
    private Rect f25305a;

    /* renamed from: b */
    private List<Rect> f25306b;

    /* renamed from: c */
    private float f25307c;

    public C10074gy() {
        List<Rect> emptyList = Collections.emptyList();
        C10263mq.m29879a((Object) emptyList, "emptyList()");
        this.f25306b = emptyList;
    }

    /* renamed from: a */
    public final Rect mo64793a() {
        return this.f25305a;
    }

    /* renamed from: a */
    public final void mo64795a(Rect rect) {
        this.f25305a = rect;
    }

    /* renamed from: a */
    public final void mo64796a(List<Rect> list) {
        C10263mq.m29882b(list, "<set-?>");
        this.f25306b = list;
    }

    /* renamed from: b */
    public final List<Rect> mo64797b() {
        return this.f25306b;
    }

    /* renamed from: a */
    public final void mo64794a(float f) {
        this.f25307c = f;
    }

    /* renamed from: c */
    public final float mo64798c() {
        return this.f25307c;
    }
}
