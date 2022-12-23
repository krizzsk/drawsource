package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.inmobi.media.C5953dz;
import com.inmobi.media.C6074ft;
import java.lang.ref.WeakReference;
import java.util.Map;

/* renamed from: com.inmobi.media.eh */
/* compiled from: InMobiTrackedNativeV2DisplayAd */
public class C5969eh extends C5952dy {

    /* renamed from: d */
    private static final String f15125d = C5969eh.class.getSimpleName();

    /* renamed from: e */
    private final WeakReference<Context> f15126e;

    /* renamed from: f */
    private final C5953dz f15127f;

    /* renamed from: g */
    private final C5971ej f15128g = new C5971ej((byte) 1);

    /* renamed from: h */
    private final C6281n f15129h;

    public C5969eh(Context context, C6281n nVar, C5953dz dzVar) {
        super(nVar);
        this.f15126e = new WeakReference<>(context);
        this.f15127f = dzVar;
        this.f15129h = nVar;
    }

    /* renamed from: b */
    public final View mo35073b() {
        return this.f15127f.mo35073b();
    }

    /* renamed from: a */
    public final C5953dz.C5954a mo35068a() {
        return this.f15127f.mo35068a();
    }

    /* renamed from: a */
    public final void mo35072a(Map<View, FriendlyObstructionPurpose> map) {
        try {
            Context context = (Context) this.f15126e.get();
            View b = this.f15127f.mo35073b();
            C6074ft.C6091m mVar = this.f15090c.viewability;
            C6281n nVar = (C6281n) this.f15088a;
            if (!(context == null || b == null || nVar.f15846j)) {
                this.f15128g.mo35101a(context, b, nVar, mVar);
                this.f15128g.mo35100a(context, b, this.f15129h, this.f15129h.f15861y, mVar);
            }
        } catch (Exception e) {
            C6130gj.m18161a().mo35310a(new C6167hk(e));
        } catch (Throwable th) {
            this.f15127f.mo35072a(map);
            throw th;
        }
        this.f15127f.mo35072a(map);
    }

    /* renamed from: a */
    public final void mo35069a(byte b) {
        this.f15127f.mo35069a(b);
    }

    /* renamed from: a */
    public final void mo35070a(Context context, byte b) {
        if (b == 0) {
            C5971ej.m17765b(context);
        } else if (b == 1) {
            C5971ej.m17766c(context);
        } else if (b == 2) {
            try {
                this.f15128g.mo35098a(context);
            } catch (Exception e) {
                C6130gj.m18161a().mo35310a(new C6167hk(e));
            } catch (Throwable th) {
                this.f15127f.mo35070a(context, b);
                throw th;
            }
        }
        this.f15127f.mo35070a(context, b);
    }

    /* renamed from: e */
    public final void mo35076e() {
        this.f15128g.mo35099a(this.f15129h.mo35531d(), this.f15127f.mo35073b(), this.f15129h);
        super.mo35076e();
        this.f15126e.clear();
        this.f15127f.mo35076e();
    }

    /* renamed from: a */
    public final View mo35067a(View view, ViewGroup viewGroup, boolean z) {
        View b = this.f15127f.mo35073b();
        if (b != null) {
            this.f15128g.mo35099a(this.f15129h.mo35531d(), b, this.f15129h);
        }
        return this.f15127f.mo35067a(view, viewGroup, z);
    }

    /* renamed from: d */
    public final void mo35075d() {
        try {
            C6281n nVar = (C6281n) this.f15088a;
            if (!nVar.f15846j) {
                this.f15128g.mo35102a((Context) this.f15126e.get(), nVar);
            }
        } catch (Exception e) {
            C6130gj.m18161a().mo35310a(new C6167hk(e));
        } catch (Throwable th) {
            this.f15127f.mo35075d();
            throw th;
        }
        this.f15127f.mo35075d();
    }
}
