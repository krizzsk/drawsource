package com.fyber.inneractive.sdk.renderers;

import android.graphics.Rect;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.response.C5233e;
import com.fyber.inneractive.sdk.util.C5287j;
import com.fyber.inneractive.sdk.util.C5299n;

/* renamed from: com.fyber.inneractive.sdk.renderers.b */
public class C5208b {

    /* renamed from: a */
    public C5287j<Rect> f13767a;

    /* renamed from: b */
    public final C5233e f13768b;

    /* renamed from: c */
    public final FrameLayout f13769c;

    /* renamed from: d */
    public float f13770d = 0.0f;

    /* renamed from: e */
    public int f13771e = 1;

    /* renamed from: f */
    public float f13772f = 0.0f;

    /* renamed from: g */
    public long f13773g = 0;

    /* renamed from: h */
    public boolean f13774h = false;

    /* renamed from: i */
    public boolean f13775i = false;

    /* renamed from: j */
    public final C5211c f13776j;

    /* renamed from: k */
    public final Runnable f13777k = new C5209a();

    /* renamed from: com.fyber.inneractive.sdk.renderers.b$a */
    public class C5209a implements Runnable {
        public C5209a() {
        }

        public void run() {
            C5208b.this.mo26249a();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.renderers.b$b */
    public class C5210b implements C5287j.C5288a<Rect> {
        public C5210b(C5208b bVar) {
        }

        /* renamed from: a */
        public Object mo26253a() {
            return new Rect();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.renderers.b$c */
    public interface C5211c {
    }

    public C5208b(C5233e eVar, FrameLayout frameLayout, C5211c cVar) {
        this.f13768b = eVar;
        this.f13769c = frameLayout;
        this.f13776j = cVar;
        this.f13767a = new C5287j<>(4, new C5210b(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00dd  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo26249a() {
        /*
            r10 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "IAVisibilityTracker: onCheckVisibility"
            com.fyber.inneractive.sdk.util.IAlog.m16446a(r2, r1)
            int r1 = r10.f13771e
            float r1 = (float) r1
            r2 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r2
            com.fyber.inneractive.sdk.util.j<android.graphics.Rect> r2 = r10.f13767a
            java.lang.Object r2 = r2.mo26381a()
            android.graphics.Rect r2 = (android.graphics.Rect) r2
            android.widget.FrameLayout r3 = r10.f13769c
            android.view.ViewParent r4 = r3.getParent()
            if (r4 == 0) goto L_0x0046
            boolean r4 = r3.isShown()
            if (r4 == 0) goto L_0x0046
            boolean r4 = r3.hasWindowFocus()
            if (r4 == 0) goto L_0x0046
            boolean r4 = r3.getGlobalVisibleRect(r2)
            if (r4 == 0) goto L_0x0046
            int r4 = r2.height()
            int r5 = r2.width()
            int r4 = r4 * r5
            float r4 = (float) r4
            int r5 = r3.getHeight()
            int r3 = r3.getWidth()
            int r5 = r5 * r3
            float r3 = (float) r5
            float r4 = r4 / r3
            goto L_0x0047
        L_0x0046:
            r4 = 0
        L_0x0047:
            com.fyber.inneractive.sdk.util.j<android.graphics.Rect> r3 = r10.f13767a
            java.util.Queue<T> r3 = r3.f14004a
            r3.offer(r2)
            r10.f13770d = r4
            int r2 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            r3 = 0
            r5 = 1
            if (r2 < 0) goto L_0x006e
            float r2 = r10.f13772f
            r6 = 1148846080(0x447a0000, float:1000.0)
            float r2 = r2 * r6
            long r6 = java.lang.System.currentTimeMillis()
            long r8 = r10.f13773g
            long r6 = r6 - r8
            float r6 = (float) r6
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x006e
            int r2 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x006e
            r2 = r5
            goto L_0x006f
        L_0x006e:
            r2 = r0
        L_0x006f:
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r2)
            r6[r0] = r7
            java.lang.Float r7 = java.lang.Float.valueOf(r1)
            r6[r5] = r7
            java.lang.String r7 = "BannerVisibilityTracker | visible = %s, minVis = %f"
            com.fyber.inneractive.sdk.util.IAlog.m16446a(r7, r6)
            if (r2 == 0) goto L_0x00dd
            boolean r2 = r10.f13774h
            if (r2 == 0) goto L_0x00dd
            com.fyber.inneractive.sdk.renderers.b$c r1 = r10.f13776j
            if (r1 == 0) goto L_0x0108
            boolean r1 = r10.f13775i
            if (r1 != 0) goto L_0x0108
            r10.f13775i = r5
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.String r2 = "BannerVisibilityTracker | firing viewable"
            com.fyber.inneractive.sdk.util.IAlog.m16446a(r2, r1)
            com.fyber.inneractive.sdk.renderers.b$c r1 = r10.f13776j
            com.fyber.inneractive.sdk.renderers.d r1 = (com.fyber.inneractive.sdk.renderers.C5213d) r1
            com.fyber.inneractive.sdk.renderers.g r1 = r1.f13780a
            r1.getClass()
            AdContent r2 = r1.f10720b     // Catch:{ Exception -> 0x0108 }
            if (r2 == 0) goto L_0x0108
            r3 = r2
            com.fyber.inneractive.sdk.flow.u r3 = (com.fyber.inneractive.sdk.flow.C4379u) r3     // Catch:{ Exception -> 0x0108 }
            T r3 = r3.f10713b     // Catch:{ Exception -> 0x0108 }
            if (r3 == 0) goto L_0x0108
            com.fyber.inneractive.sdk.flow.u r2 = (com.fyber.inneractive.sdk.flow.C4379u) r2     // Catch:{ Exception -> 0x0108 }
            T r2 = r2.f10713b     // Catch:{ Exception -> 0x0108 }
            com.fyber.inneractive.sdk.response.f r2 = (com.fyber.inneractive.sdk.response.C5234f) r2     // Catch:{ Exception -> 0x0108 }
            java.lang.String r2 = r2.f13886v     // Catch:{ Exception -> 0x0108 }
            if (r2 == 0) goto L_0x0108
            java.lang.String r3 = r2.trim()     // Catch:{ Exception -> 0x0108 }
            int r3 = r3.length()     // Catch:{ Exception -> 0x0108 }
            if (r3 <= 0) goto L_0x0108
            java.lang.String r3 = "%sfiring banner mrc visibility impression!"
            java.lang.Object[] r4 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0108 }
            java.lang.String r6 = com.fyber.inneractive.sdk.util.IAlog.m16443a((java.lang.Object) r1)     // Catch:{ Exception -> 0x0108 }
            r4[r0] = r6     // Catch:{ Exception -> 0x0108 }
            com.fyber.inneractive.sdk.util.IAlog.m16449d(r3, r4)     // Catch:{ Exception -> 0x0108 }
            int r3 = com.fyber.inneractive.sdk.util.IAlog.f13936a     // Catch:{ Exception -> 0x0108 }
            r3 = 0
            java.lang.String r4 = "MRC_VISIBILITY_IMPRESSION"
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x0108 }
            com.fyber.inneractive.sdk.util.IAlog.m16444a(r5, r3, r4, r0)     // Catch:{ Exception -> 0x0108 }
            r1.mo24530b((java.lang.String) r2)     // Catch:{ Exception -> 0x0108 }
            goto L_0x0108
        L_0x00dd:
            boolean r0 = r10.f13774h
            if (r0 == 0) goto L_0x0108
            float r0 = r10.f13770d
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 >= 0) goto L_0x00ea
            r10.f13773g = r3
            goto L_0x00fa
        L_0x00ea:
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x00fa
            long r0 = r10.f13773g
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x00fa
            long r0 = java.lang.System.currentTimeMillis()
            r10.f13773g = r0
        L_0x00fa:
            android.os.Handler r0 = com.fyber.inneractive.sdk.util.C5299n.f14024b
            java.lang.Runnable r1 = r10.f13777k
            r0.removeCallbacks(r1)
            java.lang.Runnable r1 = r10.f13777k
            r2 = 50
            r0.postDelayed(r1, r2)
        L_0x0108:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.renderers.C5208b.mo26249a():void");
    }

    /* renamed from: b */
    public void mo26250b() {
        if (!this.f13775i && !this.f13774h && this.f13773g != 0) {
            this.f13773g = 0;
            this.f13774h = true;
            mo26249a();
        }
    }

    /* renamed from: c */
    public void mo26251c() {
        this.f13774h = false;
        C5299n.f14024b.removeCallbacks(this.f13777k);
    }
}
