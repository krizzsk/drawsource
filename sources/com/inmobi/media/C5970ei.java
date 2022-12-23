package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.media.C5953dz;
import com.inmobi.media.C6074ft;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.inmobi.media.ei */
/* compiled from: InMobiTrackedNativeV2VideoAd */
public class C5970ei extends C5952dy {

    /* renamed from: d */
    private static final String f15130d = C5970ei.class.getSimpleName();

    /* renamed from: e */
    private final WeakReference<Context> f15131e;

    /* renamed from: f */
    private final C5953dz f15132f;

    /* renamed from: g */
    private final C5971ej f15133g = new C5971ej((byte) 0);

    /* renamed from: h */
    private final C6281n f15134h;

    public C5970ei(C6296o oVar, C5953dz dzVar) {
        super(oVar);
        this.f15131e = new WeakReference<>(oVar.mo35538k());
        this.f15132f = dzVar;
        this.f15134h = oVar;
    }

    /* renamed from: b */
    public final View mo35073b() {
        return this.f15132f.mo35073b();
    }

    /* renamed from: a */
    public final C5953dz.C5954a mo35068a() {
        return this.f15132f.mo35068a();
    }

    /* renamed from: d */
    public final void mo35075d() {
        try {
            Context context = (Context) this.f15131e.get();
            C6296o oVar = (C6296o) this.f15088a;
            if (!oVar.f15846j && context != null) {
                this.f15133g.mo35102a(context, (C6281n) oVar);
            }
        } catch (Exception e) {
            C6130gj.m18161a().mo35310a(new C6167hk(e));
        } catch (Throwable th) {
            this.f15132f.mo35075d();
            throw th;
        }
        this.f15132f.mo35075d();
    }

    /* renamed from: a */
    public final void mo35069a(byte b) {
        this.f15132f.mo35069a(b);
    }

    /* renamed from: a */
    public final void mo35070a(Context context, byte b) {
        if (b == 0) {
            C5971ej.m17765b(context);
        } else if (b == 1) {
            C5971ej.m17766c(context);
        } else if (b == 2) {
            try {
                this.f15133g.mo35098a(context);
            } catch (Exception e) {
                C6130gj.m18161a().mo35310a(new C6167hk(e));
            } catch (Throwable th) {
                this.f15132f.mo35070a(context, b);
                throw th;
            }
        }
        this.f15132f.mo35070a(context, b);
    }

    /* renamed from: e */
    public final void mo35076e() {
        this.f15133g.mo35099a((Context) this.f15131e.get(), this.f15132f.mo35073b(), this.f15134h);
        super.mo35076e();
        this.f15131e.clear();
        this.f15132f.mo35076e();
    }

    /* renamed from: a */
    public final View mo35067a(View view, ViewGroup viewGroup, boolean z) {
        View b = this.f15132f.mo35073b();
        if (b != null) {
            this.f15133g.mo35099a((Context) this.f15131e.get(), b, this.f15134h);
        }
        return this.f15132f.mo35067a(view, viewGroup, z);
    }

    /* renamed from: a */
    public final void mo35072a(Map<View, FriendlyObstructionPurpose> map) {
        try {
            C6296o oVar = (C6296o) this.f15088a;
            C6051fn fnVar = (C6051fn) oVar.getVideoContainerView();
            Context context = (Context) this.f15131e.get();
            C6074ft.C6091m mVar = this.f15090c.viewability;
            if (!(context == null || fnVar == null || oVar.f15846j)) {
                C6038fm videoView = fnVar.getVideoView();
                this.f15133g.mo35101a(context, videoView, oVar, mVar);
                View b = this.f15132f.mo35073b();
                if (!(videoView.getTag() == null || b == null)) {
                    C5869cj cjVar = (C5869cj) videoView.getTag();
                    if (oVar.getPlacementType() == 0 && !((Boolean) cjVar.f14724v.get("isFullScreen")).booleanValue()) {
                        this.f15133g.mo35100a(context, b, this.f15134h, ((C6296o) this.f15134h).f15879z, mVar);
                    }
                }
            }
        } catch (Exception e) {
            C6130gj.m18161a().mo35310a(new C6167hk(e));
        } catch (Throwable th) {
            this.f15132f.mo35072a(map);
            throw th;
        }
        this.f15132f.mo35072a(map);
    }
}
