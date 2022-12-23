package com.saygames.saypromo.p378a;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import com.saygames.saypromo.widget.SayPromoVideoView;

/* renamed from: com.saygames.saypromo.a.b6 */
public final class C10570b6 implements TextureView.SurfaceTextureListener {

    /* renamed from: a */
    final /* synthetic */ C10586d6 f26080a;

    C10570b6(SayPromoVideoView sayPromoVideoView) {
        this.f26080a = sayPromoVideoView;
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f26080a.f26102e = new Surface(surfaceTexture);
        this.f26080a.m30379b();
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f26080a.f26102e = null;
        this.f26080a.mo65445e();
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
