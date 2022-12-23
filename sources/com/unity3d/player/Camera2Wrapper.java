package com.unity3d.player;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.Camera;

public class Camera2Wrapper implements C11755c {

    /* renamed from: a */
    private Context f28241a;

    /* renamed from: b */
    private C11748b f28242b = null;

    /* renamed from: c */
    private final int f28243c = 100;

    public Camera2Wrapper(Context context) {
        this.f28241a = context;
        initCamera2Jni();
    }

    /* renamed from: a */
    private static int m32074a(float f) {
        return (int) Math.min(Math.max((f * 2000.0f) - 0.0040893555f, -900.0f), 900.0f);
    }

    private final native void deinitCamera2Jni();

    private final native void initCamera2Jni();

    private final native void nativeFrameReady(Object obj, Object obj2, Object obj3, int i, int i2, int i3);

    private final native void nativeSurfaceTextureReady(Object obj);

    /* renamed from: a */
    public final void mo70366a() {
        deinitCamera2Jni();
        closeCamera2();
    }

    /* renamed from: a */
    public final void mo70367a(Object obj) {
        nativeSurfaceTextureReady(obj);
    }

    /* renamed from: a */
    public final void mo70368a(Object obj, Object obj2, Object obj3, int i, int i2, int i3) {
        nativeFrameReady(obj, obj2, obj3, i, i2, i3);
    }

    /* access modifiers changed from: protected */
    public void closeCamera2() {
        C11748b bVar = this.f28242b;
        if (bVar != null) {
            bVar.mo70524b();
        }
        this.f28242b = null;
    }

    /* access modifiers changed from: protected */
    public int getCamera2Count() {
        if (PlatformSupport.LOLLIPOP_SUPPORT) {
            return C11748b.m32120a(this.f28241a);
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public int getCamera2FocalLengthEquivalent(int i) {
        if (PlatformSupport.LOLLIPOP_SUPPORT) {
            return C11748b.m32141d(this.f28241a, i);
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public int[] getCamera2Resolutions(int i) {
        if (PlatformSupport.LOLLIPOP_SUPPORT) {
            return C11748b.m32144e(this.f28241a, i);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public int getCamera2SensorOrientation(int i) {
        if (PlatformSupport.LOLLIPOP_SUPPORT) {
            return C11748b.m32121a(this.f28241a, i);
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    public Object getCameraFocusArea(float f, float f2) {
        int a = m32074a(f);
        int a2 = m32074a(1.0f - f2);
        return new Camera.Area(new Rect(a - 100, a2 - 100, a + 100, a2 + 100), 1000);
    }

    /* access modifiers changed from: protected */
    public Rect getFrameSizeCamera2() {
        C11748b bVar = this.f28242b;
        return bVar != null ? bVar.mo70521a() : new Rect();
    }

    /* access modifiers changed from: protected */
    public boolean initializeCamera2(int i, int i2, int i3, int i4, int i5) {
        if (!PlatformSupport.LOLLIPOP_SUPPORT || this.f28242b != null || UnityPlayer.currentActivity == null) {
            return false;
        }
        C11748b bVar = new C11748b(this);
        this.f28242b = bVar;
        return bVar.mo70523a(this.f28241a, i, i2, i3, i4, i5);
    }

    /* access modifiers changed from: protected */
    public boolean isCamera2AutoFocusPointSupported(int i) {
        if (PlatformSupport.LOLLIPOP_SUPPORT) {
            return C11748b.m32139c(this.f28241a, i);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public boolean isCamera2FrontFacing(int i) {
        if (PlatformSupport.LOLLIPOP_SUPPORT) {
            return C11748b.m32137b(this.f28241a, i);
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public void pauseCamera2() {
        C11748b bVar = this.f28242b;
        if (bVar != null) {
            bVar.mo70526d();
        }
    }

    /* access modifiers changed from: protected */
    public boolean setAutoFocusPoint(float f, float f2) {
        C11748b bVar;
        if (!PlatformSupport.LOLLIPOP_SUPPORT || (bVar = this.f28242b) == null) {
            return false;
        }
        return bVar.mo70522a(f, f2);
    }

    /* access modifiers changed from: protected */
    public void startCamera2() {
        C11748b bVar = this.f28242b;
        if (bVar != null) {
            bVar.mo70525c();
        }
    }

    /* access modifiers changed from: protected */
    public void stopCamera2() {
        C11748b bVar = this.f28242b;
        if (bVar != null) {
            bVar.mo70527e();
        }
    }
}
