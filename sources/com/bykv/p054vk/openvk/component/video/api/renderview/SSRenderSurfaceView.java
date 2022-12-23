package com.bykv.p054vk.openvk.component.video.api.renderview;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.View;
import android.view.ViewGroup;
import com.bykv.p054vk.openvk.component.video.api.p074f.C2415c;
import com.bykv.p054vk.openvk.component.video.api.renderview.C2419b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.bykv.vk.openvk.component.video.api.renderview.SSRenderSurfaceView */
public class SSRenderSurfaceView extends SSSurfaceView implements SurfaceHolder.Callback, C2419b {

    /* renamed from: c */
    private static final ArrayList<C2421c> f4924c = new ArrayList<>();

    /* renamed from: a */
    private WeakReference<C2418a> f4925a;

    /* renamed from: b */
    private C2421c f4926b;

    /* renamed from: d */
    private C2419b.C2420a f4927d;

    public View getView() {
        return this;
    }

    public SSRenderSurfaceView(Context context) {
        super(context);
        C2415c.m5831b("CSJ_VIDEO_SurfaceView", "SSRenderSurfaceView: ");
        m5838a();
    }

    /* renamed from: a */
    private void m5838a() {
        C2421c cVar = new C2421c(this);
        this.f4926b = cVar;
        f4924c.add(cVar);
    }

    /* renamed from: a */
    public void mo16072a(C2418a aVar) {
        this.f4925a = new WeakReference<>(aVar);
        SurfaceHolder holder = getHolder();
        holder.setFormat(-3);
        Iterator<C2421c> it = f4924c.iterator();
        while (it.hasNext()) {
            C2421c next = it.next();
            if (next != null && next.mo16098a() == null) {
                holder.removeCallback(next);
                it.remove();
            }
        }
        holder.addCallback(this.f4926b);
    }

    /* renamed from: a */
    public void mo16071a(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = i2;
        layoutParams.width = i;
        setLayoutParams(layoutParams);
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        WeakReference<C2418a> weakReference = this.f4925a;
        if (!(weakReference == null || weakReference.get() == null)) {
            ((C2418a) this.f4925a.get()).mo16090a(surfaceHolder);
        }
        C2415c.m5831b("CSJ_VIDEO_SurfaceView", "surfaceCreated: ");
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        C2415c.m5831b("CSJ_VIDEO_SurfaceView", "surfaceChanged: ");
        WeakReference<C2418a> weakReference = this.f4925a;
        if (weakReference != null && weakReference.get() != null) {
            ((C2418a) this.f4925a.get()).mo16091a(surfaceHolder, i, i2, i3);
        }
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        C2415c.m5831b("CSJ_VIDEO_SurfaceView", "surfaceDestroyed: ");
        WeakReference<C2418a> weakReference = this.f4925a;
        if (weakReference != null && weakReference.get() != null) {
            ((C2418a) this.f4925a.get()).mo16095b(surfaceHolder);
        }
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        C2419b.C2420a aVar = this.f4927d;
        if (aVar != null) {
            aVar.mo16097a(i);
        }
    }

    public void setWindowVisibilityChangedListener(C2419b.C2420a aVar) {
        this.f4927d = aVar;
    }
}
