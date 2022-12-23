package com.bykv.p054vk.openvk.component.video.api.renderview;

import android.view.SurfaceHolder;
import android.view.View;

/* renamed from: com.bykv.vk.openvk.component.video.api.renderview.b */
/* compiled from: IRenderView */
public interface C2419b {

    /* renamed from: com.bykv.vk.openvk.component.video.api.renderview.b$a */
    /* compiled from: IRenderView */
    public interface C2420a {
        /* renamed from: a */
        void mo16097a(int i);
    }

    /* renamed from: a */
    void mo16071a(int i, int i2);

    /* renamed from: a */
    void mo16072a(C2418a aVar);

    SurfaceHolder getHolder();

    View getView();

    void setVisibility(int i);
}
