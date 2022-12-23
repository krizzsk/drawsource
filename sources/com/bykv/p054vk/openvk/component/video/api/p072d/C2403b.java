package com.bykv.p054vk.openvk.component.video.api.p072d;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.bykv.p054vk.openvk.component.video.api.p070b.C2398a;
import java.lang.ref.WeakReference;

/* renamed from: com.bykv.vk.openvk.component.video.api.d.b */
/* compiled from: IMediaLayout */
public interface C2403b<T> extends C2398a {

    /* renamed from: com.bykv.vk.openvk.component.video.api.d.b$a */
    /* compiled from: IMediaLayout */
    public enum C2404a {
        hideCloseBtn,
        alwayShowBackBtn,
        alwayShowMediaView,
        fixedSize,
        hideBackBtn,
        hideTopMoreBtn
    }

    /* renamed from: a */
    void mo16016a();

    /* renamed from: a */
    void mo16017a(Drawable drawable);

    /* renamed from: a */
    void mo16018a(T t, WeakReference<Context> weakReference, boolean z);

    /* renamed from: a */
    void mo16019a(boolean z);

    /* renamed from: b */
    void mo16020b();

    /* renamed from: c */
    View mo16021c();
}
