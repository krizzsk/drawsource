package com.bytedance.sdk.openadsdk.core.video.p160a;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.view.SurfaceHolder;
import android.view.View;
import com.bykv.p054vk.openvk.component.video.api.C2394a;
import com.bykv.p054vk.openvk.component.video.api.p072d.C2403b;
import com.bykv.p054vk.openvk.component.video.api.p072d.C2405c;
import com.bykv.p054vk.openvk.component.video.api.renderview.SSRenderTextureView;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.component.utils.C2923x;
import com.bytedance.sdk.openadsdk.core.C3457h;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.C3631a;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.C3658d;
import com.bytedance.sdk.openadsdk.p178l.C3886o;
import com.bytedance.sdk.openadsdk.p178l.C3891q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.bytedance.sdk.openadsdk.core.video.a.a */
/* compiled from: BaseController */
public abstract class C3594a implements C2405c, C2923x.C2924a, C3631a {

    /* renamed from: a */
    protected SurfaceHolder f9088a;

    /* renamed from: b */
    protected SurfaceTexture f9089b;
    /* access modifiers changed from: protected */

    /* renamed from: c */
    public C2394a f9090c;
    /* access modifiers changed from: protected */

    /* renamed from: d */
    public C3658d f9091d;
    /* access modifiers changed from: protected */

    /* renamed from: e */
    public C3431n f9092e;
    /* access modifiers changed from: protected */

    /* renamed from: f */
    public long f9093f = 0;

    /* renamed from: g */
    protected long f9094g = 0;
    /* access modifiers changed from: protected */

    /* renamed from: h */
    public WeakReference<Context> f9095h;

    /* renamed from: i */
    protected List<Runnable> f9096i;

    /* renamed from: j */
    protected boolean f9097j = false;
    /* access modifiers changed from: protected */

    /* renamed from: k */
    public final C2923x f9098k = new C2923x(Looper.getMainLooper(), this);

    /* renamed from: l */
    protected boolean f9099l = false;
    /* access modifiers changed from: protected */

    /* renamed from: m */
    public boolean f9100m = true;
    /* access modifiers changed from: protected */

    /* renamed from: n */
    public boolean f9101n = false;

    /* renamed from: o */
    protected boolean f9102o = false;

    /* renamed from: p */
    protected boolean f9103p = false;
    /* access modifiers changed from: protected */

    /* renamed from: q */
    public long f9104q;

    /* renamed from: r */
    protected Runnable f9105r = new Runnable() {
        public void run() {
            C2905l.m8107a("CSJ_VIDEO_Controller", "resumeVideo: run ", Boolean.valueOf(C3594a.this.f9097j));
            C3594a.this.mo20159E();
        }
    };

    /* renamed from: s */
    private long f9106s = 0;

    /* renamed from: a */
    public void mo17240a(Message message) {
    }

    /* renamed from: a */
    public void mo16005a(C2403b bVar, SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    /* renamed from: f */
    public void mo16015f(C2403b bVar, View view) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void mo20155A() {
        if (this.f9090c != null) {
            if (mo20156B()) {
                SurfaceTexture surfaceTexture = this.f9089b;
                if (surfaceTexture != null && surfaceTexture != this.f9090c.mo15880g()) {
                    this.f9090c.mo15867a(this.f9089b);
                    return;
                }
                return;
            }
            SurfaceHolder surfaceHolder = this.f9088a;
            if (surfaceHolder != null && surfaceHolder != this.f9090c.mo15879f()) {
                this.f9090c.mo15869a(this.f9088a);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public boolean mo20156B() {
        C3658d dVar = this.f9091d;
        if (dVar != null) {
            return dVar.mo20317q() instanceof SSRenderTextureView;
        }
        return false;
    }

    /* renamed from: s */
    public boolean mo16054s() {
        if (Build.VERSION.SDK_INT < 14) {
            return false;
        }
        C3431n nVar = this.f9092e;
        if (nVar != null && nVar.mo19560aD() == 1 && Build.VERSION.SDK_INT < 23) {
            return true;
        }
        if ((!C3886o.m12684e() || Build.VERSION.SDK_INT < 30) && !C3891q.m12709a(this.f9092e)) {
            return C3457h.m10580d().mo19777q();
        }
        return true;
    }

    /* renamed from: g */
    public long mo16042g() {
        return this.f9093f;
    }

    /* renamed from: a */
    public void mo16022a(long j) {
        this.f9093f = j;
        long j2 = this.f9094g;
        if (j2 > j) {
            j = j2;
        }
        this.f9094g = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public boolean mo20157C() {
        WeakReference<Context> weakReference = this.f9095h;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo20162a(Runnable runnable) {
        if (runnable != null) {
            if (!this.f9091d.mo20292m() || !this.f9097j) {
                mo20163b(runnable);
            } else {
                runnable.run();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo20163b(Runnable runnable) {
        if (this.f9096i == null) {
            this.f9096i = new ArrayList();
        }
        this.f9096i.add(runnable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo20158D() {
        C2905l.m8114c("CSJ_VIDEO_Controller", "execPendingActions: before ");
        List<Runnable> list = this.f9096i;
        if (list != null && !list.isEmpty()) {
            C2905l.m8114c("CSJ_VIDEO_Controller", "execPendingActions:  exec");
            Iterator it = new ArrayList(this.f9096i).iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            this.f9096i.clear();
        }
    }

    /* renamed from: a */
    public void mo16004a(C2403b bVar, SurfaceHolder surfaceHolder) {
        this.f9097j = true;
        this.f9088a = surfaceHolder;
        C2394a aVar = this.f9090c;
        if (aVar != null) {
            if (aVar != null) {
                aVar.mo15869a(surfaceHolder);
            }
            C2905l.m8114c("CSJ_VIDEO_Controller", "surfaceCreated: ");
            mo20158D();
        }
    }

    /* renamed from: b */
    public void mo16010b(C2403b bVar, SurfaceHolder surfaceHolder) {
        this.f9097j = false;
        this.f9088a = null;
        C2394a aVar = this.f9090c;
        if (aVar != null) {
            aVar.mo15875b(false);
        }
    }

    /* renamed from: a */
    public void mo16003a(C2403b bVar, SurfaceTexture surfaceTexture) {
        this.f9097j = true;
        this.f9089b = surfaceTexture;
        C2394a aVar = this.f9090c;
        if (aVar != null) {
            aVar.mo15867a(surfaceTexture);
            this.f9090c.mo15875b(this.f9097j);
        }
        C2905l.m8114c("CSJ_VIDEO_Controller", "surfaceTextureCreated: ");
        mo20158D();
    }

    /* renamed from: b */
    public void mo16009b(C2403b bVar, SurfaceTexture surfaceTexture) {
        this.f9097j = false;
        C2905l.m8114c("CSJ_VIDEO_Controller", "surfaceTextureDestroyed: ");
        C2394a aVar = this.f9090c;
        if (aVar != null) {
            aVar.mo15875b(false);
        }
        this.f9089b = null;
        mo20158D();
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void mo20159E() {
        this.f9098k.postAtFrontOfQueue(new Runnable() {
            public void run() {
                if (C3594a.this.f9090c != null) {
                    C2905l.m8107a("CSJ_VIDEO_Controller", "resumeVideo: execResumePlay", Boolean.valueOf(C3594a.this.f9097j));
                    C3594a.this.f9090c.mo15865a();
                }
            }
        });
    }

    /* renamed from: n */
    public C2394a mo16049n() {
        return this.f9090c;
    }

    /* renamed from: F */
    public C3658d mo16050o() {
        return this.f9091d;
    }

    /* renamed from: a */
    public void mo16027a(boolean z) {
        this.f9100m = z;
        C3658d dVar = this.f9091d;
        if (dVar != null) {
            dVar.mo20315d(z);
        }
    }

    /* renamed from: G */
    public boolean mo20161G() {
        return this.f9100m;
    }

    /* renamed from: m */
    public boolean mo16048m() {
        return this.f9102o;
    }

    /* renamed from: b */
    public void mo16031b(long j) {
        this.f9106s = j;
    }

    /* renamed from: c */
    public void mo16035c(long j) {
        this.f9104q = j;
    }

    /* renamed from: h */
    public long mo16043h() {
        if (mo16049n() == null) {
            return 0;
        }
        return mo16049n().mo15888o();
    }

    /* renamed from: i */
    public int mo16044i() {
        C2394a aVar = this.f9090c;
        if (aVar == null) {
            return 0;
        }
        return aVar.mo15889p();
    }

    /* renamed from: p */
    public boolean mo16051p() {
        return this.f9101n;
    }

    /* renamed from: b */
    public void mo16033b(boolean z) {
        this.f9101n = z;
        C2394a aVar = this.f9090c;
        if (aVar != null) {
            aVar.mo15872a(z);
        }
    }

    /* renamed from: j */
    public long mo16045j() {
        C2394a aVar = this.f9090c;
        if (aVar == null) {
            return 0;
        }
        return aVar.mo15890q();
    }

    /* renamed from: q */
    public boolean mo16052q() {
        return this.f9099l;
    }

    /* renamed from: c */
    public void mo16036c(boolean z) {
        this.f9099l = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo20164f(boolean z) {
        this.f9103p = z;
    }

    /* renamed from: c */
    public void mo16034c() {
        C2394a aVar = this.f9090c;
        if (aVar != null) {
            aVar.mo15876c();
        }
    }
}
