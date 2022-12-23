package com.bykv.p054vk.openvk.component.video.api.renderview;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.bykv.p054vk.openvk.component.video.api.p074f.C2415c;
import com.bykv.p054vk.openvk.component.video.api.renderview.C2419b;

/* renamed from: com.bykv.vk.openvk.component.video.api.renderview.SSRenderTextureView */
public class SSRenderTextureView extends TextureView implements TextureView.SurfaceTextureListener, C2419b {

    /* renamed from: a */
    private C2418a f4928a;

    /* renamed from: b */
    private C2419b.C2420a f4929b;

    public SurfaceHolder getHolder() {
        return null;
    }

    public View getView() {
        return this;
    }

    public SSRenderTextureView(Context context) {
        this(context, (AttributeSet) null);
    }

    public SSRenderTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public void mo16072a(C2418a aVar) {
        this.f4928a = aVar;
        setSurfaceTextureListener(this);
    }

    /* renamed from: a */
    public void mo16071a(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        setLayoutParams(layoutParams);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        try {
            super.onDetachedFromWindow();
        } catch (Throwable th) {
            th.printStackTrace();
            if (C2415c.m5834b()) {
                C2415c.m5832b("CSJ_VIDEO_TextureView", "rethrow exception for debug & local_test, (TextureView)", th);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        C2415c.m5831b("CSJ_VIDEO_TextureView", "onSurfaceTextureAvailable: ");
        C2418a aVar = this.f4928a;
        if (aVar != null) {
            aVar.mo16089a(surfaceTexture, i, i2);
        }
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        C2415c.m5831b("CSJ_VIDEO_TextureView", "onSurfaceTextureSizeChanged: ");
        C2418a aVar = this.f4928a;
        if (aVar != null) {
            aVar.mo16094b(surfaceTexture, i, i2);
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        C2415c.m5831b("CSJ_VIDEO_TextureView", "onSurfaceTextureDestroyed: ");
        C2418a aVar = this.f4928a;
        if (aVar != null) {
            return aVar.mo16092a(surfaceTexture);
        }
        return false;
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        C2418a aVar = this.f4928a;
        if (aVar != null) {
            aVar.mo16093b(surfaceTexture);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        C2419b.C2420a aVar = this.f4929b;
        if (aVar != null) {
            aVar.mo16097a(i);
        }
    }

    public void setWindowVisibilityChangedListener(C2419b.C2420a aVar) {
        this.f4929b = aVar;
    }
}
