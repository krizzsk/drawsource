package com.fyber.inneractive.sdk.player.controller;

import android.animation.ObjectAnimator;
import android.app.Application;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.os.AsyncTask;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.fyber.inneractive.sdk.C4109R;
import com.fyber.inneractive.sdk.config.C4204a0;
import com.fyber.inneractive.sdk.config.C4213d0;
import com.fyber.inneractive.sdk.config.C4252h;
import com.fyber.inneractive.sdk.config.C4287y;
import com.fyber.inneractive.sdk.config.C4288z;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.C4251s;
import com.fyber.inneractive.sdk.config.global.features.C4226b;
import com.fyber.inneractive.sdk.config.global.features.C4234j;
import com.fyber.inneractive.sdk.measurement.C4408g;
import com.fyber.inneractive.sdk.model.vast.C4419a;
import com.fyber.inneractive.sdk.model.vast.C4421c;
import com.fyber.inneractive.sdk.model.vast.C4425g;
import com.fyber.inneractive.sdk.model.vast.C4435q;
import com.fyber.inneractive.sdk.p191ui.IAsmoothProgressBar;
import com.fyber.inneractive.sdk.player.C4533c;
import com.fyber.inneractive.sdk.player.C5008f;
import com.fyber.inneractive.sdk.player.controller.C4582g;
import com.fyber.inneractive.sdk.player.controller.C4605s;
import com.fyber.inneractive.sdk.player.enums.C4610b;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.player.p190ui.C5034a;
import com.fyber.inneractive.sdk.player.p190ui.C5035b;
import com.fyber.inneractive.sdk.player.p190ui.C5038e;
import com.fyber.inneractive.sdk.player.p190ui.C5041h;
import com.fyber.inneractive.sdk.player.p190ui.C5042i;
import com.fyber.inneractive.sdk.player.p190ui.C5047j;
import com.fyber.inneractive.sdk.player.p190ui.C5048k;
import com.fyber.inneractive.sdk.response.C5237i;
import com.fyber.inneractive.sdk.util.C5255b;
import com.fyber.inneractive.sdk.util.C5259c;
import com.fyber.inneractive.sdk.util.C5292l;
import com.fyber.inneractive.sdk.util.C5299n;
import com.fyber.inneractive.sdk.util.C5306p0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.iab.omid.library.fyber.adsession.AdSession;
import com.iab.omid.library.fyber.adsession.FriendlyObstructionPurpose;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.controller.k */
public abstract class C4594k<ListenerT extends C4605s> implements C4574b<ListenerT>, C4582g.C4588f, C4582g.C4587e, C5041h {

    /* renamed from: a */
    public C4533c f11409a;

    /* renamed from: b */
    public C4288z f11410b;

    /* renamed from: c */
    public C4251s f11411c;

    /* renamed from: d */
    public C5042i f11412d;

    /* renamed from: e */
    public C4582g.C4589g f11413e;

    /* renamed from: f */
    public int f11414f;

    /* renamed from: g */
    public ListenerT f11415g;

    /* renamed from: h */
    public boolean f11416h;

    /* renamed from: i */
    public float f11417i;

    /* renamed from: j */
    public Runnable f11418j;

    /* renamed from: k */
    public boolean f11419k;

    /* renamed from: l */
    public boolean f11420l;

    /* renamed from: m */
    public Application.ActivityLifecycleCallbacks f11421m;

    /* renamed from: n */
    public boolean f11422n;

    /* renamed from: o */
    public boolean f11423o;

    /* renamed from: p */
    public Bitmap f11424p;

    /* renamed from: q */
    public AsyncTask<?, ?, ?> f11425q;

    /* renamed from: r */
    public boolean f11426r;

    /* renamed from: s */
    public boolean f11427s;

    /* renamed from: t */
    public boolean f11428t;

    /* renamed from: u */
    public boolean f11429u;

    /* renamed from: v */
    public boolean f11430v;

    /* renamed from: w */
    public C5038e f11431w;

    /* renamed from: x */
    public Skip f11432x;

    /* renamed from: com.fyber.inneractive.sdk.player.controller.k$a */
    public class C4595a extends GestureDetector.SimpleOnGestureListener {
        public C4595a(C4594k kVar) {
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            return true;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.controller.k$b */
    public class C4596b extends AsyncTask<Integer, Void, Bitmap> {
        public C4596b() {
        }

        public Object doInBackground(Object[] objArr) {
            Integer[] numArr = (Integer[]) objArr;
            int intValue = numArr[0].intValue();
            int intValue2 = numArr[1].intValue();
            C4594k.this.getClass();
            Application application = C5292l.f14015a;
            Bitmap bitmap = null;
            if (!(application == null || application.getResources() == null || application.getResources().getDisplayMetrics() == null)) {
                DisplayMetrics displayMetrics = application.getResources().getDisplayMetrics();
                try {
                    bitmap = Bitmap.createBitmap(intValue, intValue2, Bitmap.Config.ARGB_8888);
                    if (bitmap != null) {
                        bitmap.setDensity(displayMetrics.densityDpi);
                    }
                } catch (Throwable unused) {
                }
            }
            return bitmap;
        }

        public void onPostExecute(Object obj) {
            Bitmap bitmap = (Bitmap) obj;
            super.onPostExecute(bitmap);
            C4594k kVar = C4594k.this;
            kVar.f11424p = bitmap;
            kVar.f11425q = null;
        }
    }

    public C4594k(C4533c cVar, C5042i iVar, C4288z zVar, C4251s sVar, boolean z) {
        this(cVar, iVar, zVar, sVar, z, (Skip) null);
    }

    /* renamed from: a */
    public void mo24801a(ListenerT listenert) {
        this.f11415g = listenert;
    }

    /* renamed from: a */
    public abstract void mo24815a(C5306p0 p0Var);

    /* renamed from: a */
    public void mo24717a(Exception exc) {
    }

    /* renamed from: b */
    public void mo24817b() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002d, code lost:
        if ((r2 != null && r2.getVisibility() == 0 && r0.f13463o.isEnabled()) == false) goto L_0x002f;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo24804c() {
        /*
            r5 = this;
            com.fyber.inneractive.sdk.player.c r0 = r5.f11409a
            r1 = 0
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r2 = r5.f11416h
            r3 = 1
            if (r2 != 0) goto L_0x0050
            com.fyber.inneractive.sdk.player.controller.g r0 = r0.f11205b
            if (r0 == 0) goto L_0x0011
            r0 = r3
            goto L_0x0012
        L_0x0011:
            r0 = r1
        L_0x0012:
            if (r0 == 0) goto L_0x0050
            com.fyber.inneractive.sdk.player.ui.i r0 = r5.f11412d
            if (r0 == 0) goto L_0x002f
            android.widget.TextView r2 = r0.f13463o
            if (r2 == 0) goto L_0x002c
            int r2 = r2.getVisibility()
            if (r2 != 0) goto L_0x002c
            android.widget.TextView r0 = r0.f13463o
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x002c
            r0 = r3
            goto L_0x002d
        L_0x002c:
            r0 = r1
        L_0x002d:
            if (r0 != 0) goto L_0x0050
        L_0x002f:
            com.fyber.inneractive.sdk.player.c r0 = r5.f11409a
            com.fyber.inneractive.sdk.player.controller.g r0 = r0.f11205b
            int r0 = r0.mo24790d()
            com.fyber.inneractive.sdk.player.c r2 = r5.f11409a
            r4 = r2
            com.fyber.inneractive.sdk.player.f r4 = (com.fyber.inneractive.sdk.player.C5008f) r4
            com.fyber.inneractive.sdk.config.z r4 = r4.f13359A
            int r2 = com.fyber.inneractive.sdk.player.C4533c.m13815a((com.fyber.inneractive.sdk.player.C4533c) r2)
            boolean r0 = com.fyber.inneractive.sdk.player.C4533c.m13817a((int) r0, (com.fyber.inneractive.sdk.config.C4288z) r4, (int) r2)
            if (r0 == 0) goto L_0x0051
            boolean r0 = r5.f11416h
            if (r0 != 0) goto L_0x0051
            int r0 = r5.f11414f
            if (r0 != 0) goto L_0x0051
        L_0x0050:
            r1 = r3
        L_0x0051:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.C4594k.mo24804c():boolean");
    }

    public void destroy() {
        C4582g gVar;
        Application application;
        Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.f11421m;
        if (!(activityLifecycleCallbacks == null || (application = C5292l.f14015a) == null)) {
            application.unregisterActivityLifecycleCallbacks(activityLifecycleCallbacks);
        }
        IAlog.m16446a("%sdestroy called", IAlog.m16443a((Object) this));
        C4533c cVar = this.f11409a;
        if (!(cVar == null || (gVar = cVar.f11205b) == null)) {
            List<C4582g.C4588f> list = gVar.f11379b;
            if (list != null) {
                list.remove(this);
            }
            List<C4582g.C4587e> list2 = this.f11409a.f11205b.f11380c;
            if (list2 != null) {
                list2.remove(this);
            }
        }
        mo24854j();
        mo24867h();
        AsyncTask<?, ?, ?> asyncTask = this.f11425q;
        if (asyncTask != null) {
            asyncTask.cancel(true);
        }
        this.f11415g = null;
    }

    /* renamed from: e */
    public void mo24841e() {
        if (this.f11426r && !this.f11420l) {
            this.f11420l = true;
            this.f11412d.mo25671b(false);
        }
    }

    /* renamed from: e */
    public void mo24723e(boolean z) {
    }

    /* renamed from: f */
    public void mo24864f(boolean z) {
        C4582g gVar;
        C4533c cVar = this.f11409a;
        if (!(cVar == null || (gVar = cVar.f11205b) == null)) {
            gVar.mo24788b(z);
        }
        this.f11412d.setMuteButtonState(true);
    }

    /* renamed from: g */
    public void mo24866g() {
        C4582g gVar;
        C4533c cVar = this.f11409a;
        if (cVar != null && (gVar = cVar.f11205b) != null) {
            List<C4582g.C4588f> list = gVar.f11379b;
            if (list != null && !list.contains(this)) {
                gVar.f11379b.add(this);
            }
            C4582g gVar2 = this.f11409a.f11205b;
            List<C4582g.C4587e> list2 = gVar2.f11380c;
            if (list2 != null && !list2.contains(this)) {
                gVar2.f11380c.add(this);
            }
        }
    }

    /* renamed from: h */
    public void mo24853h(boolean z) {
        C4582g gVar;
        C4533c cVar = this.f11409a;
        if (cVar == null) {
            return;
        }
        if (!cVar.f11214k) {
            mo24826y();
        } else if (!z || (gVar = cVar.f11205b) == null) {
            cVar.mo24725g();
        } else {
            gVar.mo24782a(0, true);
        }
    }

    /* renamed from: i */
    public void mo24868i(boolean z) {
        C4582g gVar;
        C4533c cVar = this.f11409a;
        if (!(cVar == null || (gVar = cVar.f11205b) == null)) {
            gVar.mo24791d(z);
        }
        this.f11412d.setMuteButtonState(false);
    }

    /* renamed from: j */
    public void mo24854j() {
        Bitmap g;
        if (this.f11431w != null) {
            IAlog.m16446a("%sdestroyTextureView", IAlog.m16443a((Object) this));
            if ((this.f11424p != null) && (g = mo24865g(false)) != null) {
                this.f11412d.setLastFrameBitmap(g);
                this.f11412d.mo25671b(true);
            }
        }
    }

    /* renamed from: k */
    public void mo24869k() {
        if (mo24825w()) {
            C4251s sVar = this.f11411c;
            String str = null;
            C4226b bVar = sVar != null ? (C4226b) sVar.mo24264a(C4226b.class) : null;
            if (bVar != null) {
                bVar.mo24235e(IAConfigManager.f10324J.f10350p);
                C4419a aVar = bVar.f10423e;
                if (aVar != null && aVar.f10858d) {
                    str = aVar.f10856b;
                }
            }
            if (str != null) {
                this.f11412d.setSkipText(str);
            } else {
                C5042i iVar = this.f11412d;
                iVar.setSkipText(iVar.getContext().getString(C4109R.string.ia_video_skip_text));
            }
            TextView textView = this.f11412d.f13463o;
            if (textView != null) {
                textView.setEnabled(true);
            }
            this.f11414f = 0;
            ListenerT listenert = this.f11415g;
            if (listenert != null) {
                listenert.mo24920e();
            }
        }
    }

    /* renamed from: l */
    public abstract int mo24819l();

    /* renamed from: m */
    public final float mo24870m() {
        try {
            return (float) ((AudioManager) this.f11412d.getContext().getSystemService("audio")).getStreamVolume(3);
        } catch (Throwable unused) {
            return 1.0f;
        }
    }

    /* renamed from: n */
    public abstract int mo24820n();

    /* renamed from: o */
    public boolean mo24871o() {
        C4582g gVar;
        C4533c cVar = this.f11409a;
        if (cVar == null || (gVar = cVar.f11205b) == null) {
            return false;
        }
        if (gVar.mo24796i()) {
            return true;
        }
        if (mo24870m() == 0.0f) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    public abstract void mo24821p();

    public void pauseVideo() {
        C4582g gVar;
        C4533c cVar = this.f11409a;
        if (cVar != null && (gVar = cVar.f11205b) != null) {
            if (gVar.f11382e != C4610b.Paused) {
                IAlog.m16446a("%spauseVideo %s", IAlog.m16443a((Object) this), this.f11412d);
                TextureView textureView = this.f11409a.f11205b.f11387j;
                if (textureView != null && textureView.getParent() != null && textureView.getParent().equals(this.f11412d.getTextureHost())) {
                    this.f11409a.f11205b.mo24797k();
                    return;
                }
                return;
            }
            IAlog.m16446a("%spauseVideo called in bad state! %s", IAlog.m16443a((Object) this), this.f11409a.f11205b.f11382e);
        }
    }

    /* renamed from: q */
    public void mo24872q() {
        if (!this.f11412d.mo25675d()) {
            this.f11412d.mo25669a(false);
            mo24867h();
            mo24826y();
            this.f11419k = false;
            this.f11416h = true;
        }
    }

    /* renamed from: r */
    public abstract void mo24822r();

    /* renamed from: s */
    public void mo24855s() {
        mo24867h();
        this.f11412d.mo25669a(false);
        mo24826y();
    }

    /* renamed from: t */
    public abstract void mo24823t();

    /* renamed from: u */
    public void mo24856u() {
    }

    /* renamed from: v */
    public void mo24824v() {
        C4582g gVar;
        this.f11412d.mo25669a(false);
        this.f11412d.mo25673c(false);
        C5042i iVar = this.f11412d;
        C5035b bVar = new C5035b();
        bVar.f13428b = false;
        iVar.mo25667a(new C5034a(bVar));
        IAsmoothProgressBar iAsmoothProgressBar = this.f11412d.f13470v;
        if (iAsmoothProgressBar != null) {
            iAsmoothProgressBar.setVisibility(0);
        }
        ImageView imageView = this.f11412d.f13468t;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        TextView textView = this.f11412d.f13462n;
        if (textView != null) {
            textView.setVisibility(0);
        }
        mo24867h();
        if (this.f11409a != null && mo24825w() && !this.f11416h) {
            int d = this.f11409a.f11205b.mo24790d();
            C4533c cVar = this.f11409a;
            if (C4533c.m13817a(d, ((C5008f) cVar).f13359A, C4533c.m13815a(cVar))) {
                if (this.f11414f <= 0) {
                    this.f11412d.mo25674d(true);
                    mo24869k();
                } else {
                    C4533c cVar2 = this.f11409a;
                    if (cVar2 != null && (gVar = cVar2.f11205b) != null && this.f11414f >= gVar.mo24790d() / 1000) {
                        this.f11412d.mo25674d(false);
                    } else if (!this.f11427s) {
                        this.f11412d.mo25674d(true);
                        mo24863c(this.f11414f);
                        this.f11427s = true;
                    }
                }
            }
        }
        ListenerT listenert = this.f11415g;
        if (listenert != null && !this.f11419k) {
            this.f11419k = true;
            listenert.mo24925l();
        }
        this.f11423o = false;
        this.f11428t = false;
    }

    /* renamed from: w */
    public abstract boolean mo24825w();

    /* renamed from: x */
    public void mo24873x() {
        boolean z;
        C4251s sVar = this.f11411c;
        String str = null;
        C4234j jVar = sVar != null ? (C4234j) sVar.mo24264a(C4234j.class) : null;
        C4251s sVar2 = this.f11411c;
        C4226b bVar = sVar2 != null ? (C4226b) sVar2.mo24264a(C4226b.class) : null;
        boolean z2 = true;
        if (jVar != null) {
            z2 = jVar.mo24239a("show_cta", true);
            z = jVar.mo24246c();
        } else {
            z = false;
        }
        if (bVar != null) {
            bVar.mo24235e(IAConfigManager.f10324J.f10350p);
            C4419a aVar = bVar.f10423e;
            if (aVar != null && aVar.f10858d) {
                str = aVar.f10855a;
            }
        }
        this.f11412d.mo25670a(z2, z, str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.Integer} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v1, types: [com.fyber.inneractive.sdk.config.global.features.e] */
    /* JADX WARNING: type inference failed for: r2v11 */
    /* JADX WARNING: type inference failed for: r2v12 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x0222  */
    /* JADX WARNING: Removed duplicated region for block: B:161:0x0225  */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0241  */
    /* JADX WARNING: Removed duplicated region for block: B:173:0x0246  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x024a  */
    /* JADX WARNING: Removed duplicated region for block: B:178:0x0256  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24826y() {
        /*
            r13 = this;
            com.fyber.inneractive.sdk.player.c r0 = r13.f11409a
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x003e
            com.fyber.inneractive.sdk.player.controller.g r0 = r0.f11205b
            if (r0 == 0) goto L_0x0015
            com.fyber.inneractive.sdk.player.enums.b r0 = r0.f11382e
            com.fyber.inneractive.sdk.player.enums.b r4 = com.fyber.inneractive.sdk.player.enums.C4610b.f11462i
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x0019
        L_0x0015:
            boolean r0 = r13.f11428t
            if (r0 == 0) goto L_0x003e
        L_0x0019:
            com.fyber.inneractive.sdk.player.c r0 = r13.f11409a
            com.fyber.inneractive.sdk.measurement.g r0 = r0.f11212i
            if (r0 == 0) goto L_0x003e
            com.iab.omid.library.fyber.adsession.AdSession r4 = r0.f10812a
            if (r4 == 0) goto L_0x0038
            java.lang.Object[] r4 = new java.lang.Object[r1]
            java.lang.String r5 = "OMVideo"
            r4[r3] = r5
            java.lang.String r5 = "%s destroy"
            com.fyber.inneractive.sdk.util.IAlog.m16446a(r5, r4)
            com.iab.omid.library.fyber.adsession.AdSession r4 = r0.f10812a     // Catch:{ all -> 0x0034 }
            r4.finish()     // Catch:{ all -> 0x0034 }
            goto L_0x0038
        L_0x0034:
            r4 = move-exception
            r0.mo24588a((java.lang.Throwable) r4)
        L_0x0038:
            r0.f10813b = r2
            r0.f10812a = r2
            r0.f10814c = r2
        L_0x003e:
            com.fyber.inneractive.sdk.config.IAConfigManager r0 = com.fyber.inneractive.sdk.config.IAConfigManager.f10324J
            com.fyber.inneractive.sdk.config.i r4 = r0.f10356v
            com.fyber.inneractive.sdk.config.h r4 = r4.f10459b
            java.lang.String r5 = "endcard"
            com.fyber.inneractive.sdk.config.f r4 = r4.mo24272a((java.lang.String) r5)
            java.lang.String r5 = "dsos"
            boolean r4 = r4.mo24228a(r5, r3)
            com.fyber.inneractive.sdk.player.c r5 = r13.f11409a
            if (r5 == 0) goto L_0x0062
            com.fyber.inneractive.sdk.player.controller.g r5 = r5.f11205b
            if (r5 == 0) goto L_0x0062
            com.fyber.inneractive.sdk.player.enums.b r5 = r5.f11382e
            com.fyber.inneractive.sdk.player.enums.b r6 = com.fyber.inneractive.sdk.player.enums.C4610b.f11462i
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x006c
        L_0x0062:
            boolean r5 = r13.f11428t
            if (r5 == 0) goto L_0x0068
            if (r4 == 0) goto L_0x006c
        L_0x0068:
            boolean r6 = r13.f11429u
            if (r6 == 0) goto L_0x02a0
        L_0x006c:
            com.fyber.inneractive.sdk.player.c r4 = r13.f11409a
            if (r4 == 0) goto L_0x0075
            android.view.View r4 = r4.mo24721c()
            goto L_0x0076
        L_0x0075:
            r4 = r2
        L_0x0076:
            com.fyber.inneractive.sdk.player.ui.i r5 = r13.f11412d
            r5.mo25674d(r3)
            android.widget.ImageView r6 = r5.f13468t
            r7 = 4
            if (r6 == 0) goto L_0x0083
            r6.setVisibility(r7)
        L_0x0083:
            com.fyber.inneractive.sdk.ui.IAsmoothProgressBar r6 = r5.f13470v
            if (r6 == 0) goto L_0x008a
            r6.setVisibility(r7)
        L_0x008a:
            android.widget.TextView r6 = r5.f13462n
            if (r6 == 0) goto L_0x0091
            r6.setVisibility(r7)
        L_0x0091:
            r5.mo25670a((boolean) r3, (boolean) r3, (java.lang.String) r2)
            android.widget.ImageView r5 = r5.f13469u
            if (r5 == 0) goto L_0x009b
            r5.setVisibility(r7)
        L_0x009b:
            com.fyber.inneractive.sdk.config.global.s r5 = r13.f11411c
            if (r5 == 0) goto L_0x00a8
            java.lang.Class<com.fyber.inneractive.sdk.config.global.features.j> r6 = com.fyber.inneractive.sdk.config.global.features.C4234j.class
            com.fyber.inneractive.sdk.config.global.features.e r5 = r5.mo24264a(r6)
            com.fyber.inneractive.sdk.config.global.features.j r5 = (com.fyber.inneractive.sdk.config.global.features.C4234j) r5
            goto L_0x00a9
        L_0x00a8:
            r5 = r2
        L_0x00a9:
            com.fyber.inneractive.sdk.config.global.s r6 = r13.f11411c
            if (r6 == 0) goto L_0x00b6
            java.lang.Class<com.fyber.inneractive.sdk.config.global.features.b> r8 = com.fyber.inneractive.sdk.config.global.features.C4226b.class
            com.fyber.inneractive.sdk.config.global.features.e r6 = r6.mo24264a(r8)
            com.fyber.inneractive.sdk.config.global.features.b r6 = (com.fyber.inneractive.sdk.config.global.features.C4226b) r6
            goto L_0x00b7
        L_0x00b6:
            r6 = r2
        L_0x00b7:
            r8 = 500(0x1f4, float:7.0E-43)
            r9 = 10
            java.lang.String r10 = "autoClickDelay"
            java.lang.String r11 = "shouldEnableEndCardAutoClick"
            r12 = 3
            if (r4 == 0) goto L_0x01c6
            boolean r0 = r4 instanceof com.fyber.inneractive.sdk.web.C5347c
            if (r0 == 0) goto L_0x010d
            com.fyber.inneractive.sdk.player.c r0 = r13.f11409a
            com.fyber.inneractive.sdk.player.controller.c r0 = r0.mo24722d()
            com.fyber.inneractive.sdk.player.controller.n r6 = new com.fyber.inneractive.sdk.player.controller.n
            r6.<init>(r13)
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r0 = r0.f11345a
            if (r0 == 0) goto L_0x00d8
            r0.setListener(r6)
        L_0x00d8:
            com.fyber.inneractive.sdk.player.c r0 = r13.f11409a
            com.fyber.inneractive.sdk.player.controller.c r0 = r0.mo24722d()
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r6 = r0.f11345a
            if (r6 == 0) goto L_0x00ea
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r0 = r0.f11347c
            com.fyber.inneractive.sdk.util.C5268e0.m16470a(r0)
            r6.mo26346m()
        L_0x00ea:
            com.fyber.inneractive.sdk.player.c r0 = r13.f11409a
            com.fyber.inneractive.sdk.player.controller.c r0 = r0.mo24722d()
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r0 = r0.f11345a
            if (r0 == 0) goto L_0x00fc
            boolean r0 = r0.mo26480h()
            if (r0 == 0) goto L_0x00fc
            r0 = r1
            goto L_0x00fd
        L_0x00fc:
            r0 = r3
        L_0x00fd:
            if (r0 == 0) goto L_0x0100
            return
        L_0x0100:
            com.fyber.inneractive.sdk.player.c r0 = r13.f11409a
            com.fyber.inneractive.sdk.player.controller.c r0 = r0.mo24722d()
            com.fyber.inneractive.sdk.ui.IAmraidWebViewController r0 = r0.f11345a
            if (r0 == 0) goto L_0x010d
            r0.mo26344e(r1)
        L_0x010d:
            r13.mo24854j()
            com.fyber.inneractive.sdk.player.ui.i r0 = r13.f11412d
            r0.mo25671b(r3)
            com.fyber.inneractive.sdk.player.ui.i r0 = r13.f11412d
            android.view.ViewGroup r0 = r0.f13458j
            if (r0 == 0) goto L_0x011e
            r0.setVisibility(r7)
        L_0x011e:
            com.fyber.inneractive.sdk.player.ui.i r0 = r13.f11412d
            r0.mo25673c(r3)
            com.fyber.inneractive.sdk.player.c r0 = r13.f11409a
            if (r0 == 0) goto L_0x012c
            com.fyber.inneractive.sdk.model.vast.c r0 = r0.mo24724f()
            goto L_0x012d
        L_0x012c:
            r0 = r2
        L_0x012d:
            com.fyber.inneractive.sdk.player.ui.i r6 = r13.f11412d
            if (r0 == 0) goto L_0x0134
            com.fyber.inneractive.sdk.model.vast.g r0 = r0.f10868a
            goto L_0x0135
        L_0x0134:
            r0 = r2
        L_0x0135:
            if (r5 == 0) goto L_0x013a
            r5.mo24246c()
        L_0x013a:
            if (r5 == 0) goto L_0x0144
            boolean r11 = r5.mo24239a((java.lang.String) r11, (boolean) r3)
            if (r11 == 0) goto L_0x0144
            r11 = r1
            goto L_0x0145
        L_0x0144:
            r11 = r3
        L_0x0145:
            if (r5 == 0) goto L_0x0159
            java.lang.Integer r10 = r5.mo24240b(r10)
            if (r10 == 0) goto L_0x0152
            int r10 = r10.intValue()
            goto L_0x0153
        L_0x0152:
            r10 = r12
        L_0x0153:
            if (r10 < 0) goto L_0x0159
            if (r10 <= r9) goto L_0x0158
            goto L_0x0159
        L_0x0158:
            r12 = r10
        L_0x0159:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r12)
            if (r11 == 0) goto L_0x0160
            r2 = r9
        L_0x0160:
            if (r5 == 0) goto L_0x0167
            com.fyber.inneractive.sdk.config.global.features.j$c r9 = r5.mo24250g()
            goto L_0x0169
        L_0x0167:
            com.fyber.inneractive.sdk.config.global.features.j$c r9 = com.fyber.inneractive.sdk.config.global.features.C4234j.C4237c.NONE
        L_0x0169:
            if (r5 == 0) goto L_0x016f
            int r8 = r5.mo24249f()
        L_0x016f:
            r6.getClass()
            r6.f13464p = r4
            android.view.ViewGroup r5 = r6.f13473y
            if (r5 == 0) goto L_0x01bc
            android.view.ViewParent r5 = r4.getParent()
            if (r5 == 0) goto L_0x0189
            boolean r10 = r5 instanceof android.view.ViewGroup
            if (r10 == 0) goto L_0x0189
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            android.view.View r10 = r6.f13464p
            r5.removeView(r10)
        L_0x0189:
            com.fyber.inneractive.sdk.model.vast.g r5 = com.fyber.inneractive.sdk.model.vast.C4425g.Static
            if (r5 != r0) goto L_0x019c
            com.fyber.inneractive.sdk.config.global.features.j$c r10 = com.fyber.inneractive.sdk.config.global.features.C4234j.C4237c.NONE
            boolean r10 = r10.equals(r9)
            r10 = r10 ^ r1
            if (r10 == 0) goto L_0x019c
            android.view.ViewGroup r10 = r6.f13473y
            r6.mo25666a((android.view.View) r10, (com.fyber.inneractive.sdk.config.global.features.C4234j.C4237c) r9, (int) r8)
            goto L_0x01a1
        L_0x019c:
            android.view.ViewGroup r8 = r6.f13473y
            r8.setVisibility(r3)
        L_0x01a1:
            android.view.ViewGroup r8 = r6.f13473y
            android.view.View r9 = r6.f13464p
            r8.addView(r9, r3)
            if (r5 != r0) goto L_0x01bc
            android.view.View r0 = r6.f13464p
            r6.mo25665a((android.view.View) r0, (int) r7)
            if (r2 == 0) goto L_0x01b2
            goto L_0x01b3
        L_0x01b2:
            r1 = r3
        L_0x01b3:
            if (r1 == 0) goto L_0x01bc
            int r0 = r2.intValue()
            r6.mo25663a((int) r7, (int) r0)
        L_0x01bc:
            com.fyber.inneractive.sdk.player.c r0 = r13.f11409a
            r0.mo24718a((boolean) r3)
            r4.requestFocus()
            goto L_0x02b4
        L_0x01c6:
            com.fyber.inneractive.sdk.player.ui.e r4 = r13.f11431w
            if (r4 == 0) goto L_0x01d6
            android.graphics.Bitmap r4 = r13.mo24865g(r1)
            if (r4 == 0) goto L_0x01e5
            com.fyber.inneractive.sdk.player.ui.i r7 = r13.f11412d
            r7.setLastFrameBitmap(r4)
            goto L_0x01e5
        L_0x01d6:
            com.fyber.inneractive.sdk.player.c r4 = r13.f11409a
            if (r4 == 0) goto L_0x01dd
            android.graphics.Bitmap r4 = r4.f11215l
            goto L_0x01de
        L_0x01dd:
            r4 = r2
        L_0x01de:
            if (r4 == 0) goto L_0x01e5
            com.fyber.inneractive.sdk.player.ui.i r7 = r13.f11412d
            r7.setLastFrameBitmap(r4)
        L_0x01e5:
            com.fyber.inneractive.sdk.player.ui.i r4 = r13.f11412d
            r4.mo25671b(r1)
            com.fyber.inneractive.sdk.player.ui.i r4 = r13.f11412d
            r4.mo25673c(r3)
            com.fyber.inneractive.sdk.player.ui.b r4 = new com.fyber.inneractive.sdk.player.ui.b
            r4.<init>()
            r4.f13428b = r1
            if (r5 == 0) goto L_0x0200
            boolean r7 = r5.mo24246c()
            if (r7 == 0) goto L_0x0200
            r7 = r1
            goto L_0x0201
        L_0x0200:
            r7 = r3
        L_0x0201:
            r4.f13429c = r7
            if (r6 == 0) goto L_0x0215
            java.lang.String r0 = r0.f10350p
            r6.mo24235e(r0)
            com.fyber.inneractive.sdk.model.vast.a r0 = r6.f10423e
            if (r0 == 0) goto L_0x0215
            boolean r6 = r0.f10858d
            if (r6 == 0) goto L_0x0215
            java.lang.String r0 = r0.f10855a
            goto L_0x0216
        L_0x0215:
            r0 = r2
        L_0x0216:
            r4.f13431e = r0
            if (r5 == 0) goto L_0x0222
            boolean r0 = r5.mo24239a((java.lang.String) r11, (boolean) r3)
            if (r0 == 0) goto L_0x0222
            r0 = r1
            goto L_0x0223
        L_0x0222:
            r0 = r3
        L_0x0223:
            if (r5 == 0) goto L_0x0237
            java.lang.Integer r6 = r5.mo24240b(r10)
            if (r6 == 0) goto L_0x0230
            int r6 = r6.intValue()
            goto L_0x0231
        L_0x0230:
            r6 = r12
        L_0x0231:
            if (r6 < 0) goto L_0x0237
            if (r6 <= r9) goto L_0x0236
            goto L_0x0237
        L_0x0236:
            r12 = r6
        L_0x0237:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r12)
            if (r0 == 0) goto L_0x023f
            r4.f13432f = r6
        L_0x023f:
            if (r5 == 0) goto L_0x0246
            com.fyber.inneractive.sdk.config.global.features.j$c r0 = r5.mo24250g()
            goto L_0x0248
        L_0x0246:
            com.fyber.inneractive.sdk.config.global.features.j$c r0 = com.fyber.inneractive.sdk.config.global.features.C4234j.C4237c.NONE
        L_0x0248:
            if (r5 == 0) goto L_0x024e
            int r8 = r5.mo24249f()
        L_0x024e:
            r4.f13435i = r0
            r4.f13436j = r8
            com.fyber.inneractive.sdk.config.global.s r0 = r13.f11411c
            if (r0 == 0) goto L_0x025f
            java.lang.Class<com.fyber.inneractive.sdk.config.global.features.f> r2 = com.fyber.inneractive.sdk.config.global.features.C4230f.class
            com.fyber.inneractive.sdk.config.global.features.e r0 = r0.mo24264a(r2)
            r2 = r0
            com.fyber.inneractive.sdk.config.global.features.f r2 = (com.fyber.inneractive.sdk.config.global.features.C4230f) r2
        L_0x025f:
            if (r2 == 0) goto L_0x028e
            java.lang.String r0 = "should_show_hand"
            boolean r0 = r2.mo24239a((java.lang.String) r0, (boolean) r3)
            r4.f13427a = r0
            r5 = 4608533498473480192(0x3ff4ccccc0000000, double:1.2999999523162842)
            java.lang.String r0 = "scale_up_to"
            java.lang.Double r0 = r2.mo24236a((java.lang.String) r0)
            if (r0 == 0) goto L_0x027a
            double r5 = r0.doubleValue()
        L_0x027a:
            float r0 = (float) r5
            r2 = 1071225242(0x3fd9999a, float:1.7)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto L_0x0289
            r2 = 1066192077(0x3f8ccccd, float:1.1)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x028c
        L_0x0289:
            r0 = 1067869798(0x3fa66666, float:1.3)
        L_0x028c:
            r4.f13430d = r0
        L_0x028e:
            com.fyber.inneractive.sdk.player.ui.i r0 = r13.f11412d
            com.fyber.inneractive.sdk.player.ui.a r2 = new com.fyber.inneractive.sdk.player.ui.a
            r2.<init>(r4)
            r0.mo25667a((com.fyber.inneractive.sdk.player.p190ui.C5034a) r2)
            com.fyber.inneractive.sdk.player.c r0 = r13.f11409a
            if (r0 == 0) goto L_0x02b4
            r0.mo24718a((boolean) r1)
            goto L_0x02b4
        L_0x02a0:
            if (r5 == 0) goto L_0x02af
            if (r4 == 0) goto L_0x02af
            com.fyber.inneractive.sdk.player.ui.i r0 = r13.f11412d
            r0.mo25671b(r3)
            com.fyber.inneractive.sdk.player.ui.i r0 = r13.f11412d
            r0.mo25673c(r3)
            goto L_0x02b4
        L_0x02af:
            com.fyber.inneractive.sdk.player.ui.i r0 = r13.f11412d
            r0.mo25673c(r1)
        L_0x02b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.C4594k.mo24826y():void");
    }

    /* renamed from: z */
    public void mo24874z() {
        C5042i iVar = this.f11412d;
        if (iVar.f13468t != null) {
            iVar.setMuteButtonState(mo24871o());
        }
    }

    public C4594k(C4533c cVar, C5042i iVar, C4288z zVar, C4251s sVar, boolean z, Skip skip) {
        this.f11414f = 0;
        this.f11416h = false;
        this.f11417i = -0.1f;
        this.f11420l = false;
        this.f11423o = false;
        this.f11424p = null;
        this.f11425q = null;
        this.f11426r = false;
        this.f11427s = false;
        this.f11428t = false;
        this.f11429u = false;
        this.f11430v = false;
        this.f11432x = null;
        this.f11432x = skip;
        this.f11409a = cVar;
        this.f11410b = zVar;
        this.f11411c = sVar;
        this.f11412d = iVar;
        this.f11422n = z;
        iVar.setListener(this);
        mo24866g();
        new GestureDetector(iVar.getContext(), new C4595a(this));
    }

    /* renamed from: a */
    public final void mo24858a(int i, int i2) {
        Bitmap bitmap = this.f11424p;
        if (!(bitmap != null && bitmap.getWidth() == i && this.f11424p.getHeight() == i2) && i2 > 0 && i > 0) {
            AsyncTask<?, ?, ?> asyncTask = this.f11425q;
            if (asyncTask != null) {
                asyncTask.cancel(true);
            }
            this.f11424p = null;
            C4596b bVar = new C4596b();
            this.f11425q = bVar;
            bVar.executeOnExecutor(C5299n.f14023a, new Integer[]{Integer.valueOf(i), Integer.valueOf(i2)});
        }
    }

    /* renamed from: d */
    public void mo24805d(boolean z) {
        IAlog.m16446a("%sinitUI", IAlog.m16443a((Object) this));
        C4533c cVar = this.f11409a;
        if (cVar != null && cVar.f11205b != null) {
            this.f11412d.setUnitConfig(this.f11410b);
            C5042i iVar = this.f11412d;
            int h = this.f11409a.f11205b.mo24795h();
            int g = this.f11409a.f11205b.mo24794g();
            boolean z2 = this.f11422n;
            iVar.f13465q = h;
            iVar.f13466r = g;
            iVar.f13467s = z2;
            if (this.f11409a.f11205b.mo24795h() > 0 && this.f11409a.f11205b.mo24794g() > 0) {
                mo24858a(this.f11409a.f11205b.mo24795h(), this.f11409a.f11205b.mo24794g());
            }
            if (mo24825w()) {
                this.f11414f = mo24820n();
            } else {
                this.f11412d.mo25674d(false);
            }
            if (!z) {
                mo24839a(this.f11409a.f11205b.mo24789c());
                mo24860a(this.f11409a.f11205b.f11382e, false);
            }
            mo24874z();
        }
    }

    /* renamed from: f */
    public void mo24807f() {
        C5038e eVar;
        C5042i iVar = this.f11412d;
        if (iVar != null) {
            iVar.mo25660g();
        }
        C4533c cVar = this.f11409a;
        if (!(cVar == null || cVar.f11205b == null || (eVar = this.f11431w) == null)) {
            eVar.invalidate();
            this.f11431w.requestLayout();
        }
        C5042i iVar2 = this.f11412d;
        if (iVar2 != null) {
            iVar2.invalidate();
            this.f11412d.requestLayout();
        }
    }

    /* renamed from: i */
    public boolean mo24818i() {
        C4582g gVar;
        C4582g gVar2;
        C5038e eVar;
        TextureView textureView;
        C4408g gVar3;
        if (this.f11431w == null) {
            C5038e eVar2 = new C5038e(this.f11412d);
            this.f11431w = eVar2;
            C4533c cVar = this.f11409a;
            if (!(cVar == null || (gVar3 = cVar.f11212i) == null)) {
                View[] trackingFriendlyView = this.f11412d.getTrackingFriendlyView();
                AdSession adSession = gVar3.f10812a;
                if (adSession != null) {
                    try {
                        adSession.registerAdView(eVar2);
                    } catch (Throwable th) {
                        gVar3.mo24588a(th);
                    }
                }
                if (!(gVar3.f10812a == null || trackingFriendlyView == null)) {
                    for (View view : trackingFriendlyView) {
                        if (view != null) {
                            try {
                                gVar3.f10812a.addFriendlyObstruction(view, FriendlyObstructionPurpose.VIDEO_CONTROLS, (String) null);
                            } catch (Throwable th2) {
                                gVar3.mo24588a(th2);
                            }
                        }
                    }
                }
            }
        }
        IAlog.m16446a("%sconnectToTextureView called %s", IAlog.m16443a((Object) this), this.f11412d.getTextureHost());
        if (this.f11431w == null || !this.f11412d.getTextureHost().equals(this.f11431w.getParent())) {
            C4533c cVar2 = this.f11409a;
            if (!(cVar2 == null || (gVar2 = cVar2.f11205b) == null || (textureView = gVar2.f11387j) == (eVar = this.f11431w))) {
                if (textureView != null) {
                    textureView.setSurfaceTextureListener((TextureView.SurfaceTextureListener) null);
                }
                gVar2.f11387j = eVar;
                if (gVar2.f11390m == null) {
                    gVar2.f11390m = new C4580f(gVar2);
                }
                eVar.setSurfaceTextureListener(gVar2.f11390m);
                if (gVar2.f11388k != null) {
                    IAlog.m16446a("%scalling setSurfaceTexture with cached texture", IAlog.m16443a((Object) gVar2));
                    if (gVar2.f11387j.getSurfaceTexture() == null || !gVar2.f11387j.getSurfaceTexture().equals(gVar2.f11388k)) {
                        IAlog.m16446a("%scalling setSurfaceTexture with cached texture success", IAlog.m16443a((Object) gVar2));
                        gVar2.f11387j.setSurfaceTexture(gVar2.f11388k);
                    } else {
                        IAlog.m16446a("%scalling setSurfaceTexture with cached texture failed", IAlog.m16443a((Object) gVar2));
                    }
                }
            }
            C5038e eVar3 = this.f11431w;
            if (eVar3 != null) {
                eVar3.setId(C4109R.C4111id.inn_texture_view);
            }
            IAlog.m16446a("%supdateView adding texture to parent", IAlog.m16443a((Object) this));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, 0, 0, 0);
            layoutParams.gravity = 17;
            if (this.f11431w.getParent() == null) {
                this.f11412d.getTextureHost().addView(this.f11431w, layoutParams);
            }
            this.f11420l = false;
            C4601p pVar = new C4601p(this);
            this.f11413e = pVar;
            C4533c cVar3 = this.f11409a;
            if (!(cVar3 == null || (gVar = cVar3.f11205b) == null)) {
                gVar.f11381d = pVar;
            }
        } else {
            IAlog.m16446a("%sconnectToTextureView called but already connected", IAlog.m16443a((Object) this));
        }
        return true;
    }

    /* renamed from: h */
    public final void mo24867h() {
        Runnable runnable = this.f11418j;
        if (runnable != null) {
            this.f11412d.removeCallbacks(runnable);
            this.f11418j = null;
        }
    }

    /* renamed from: g */
    public Bitmap mo24865g(boolean z) {
        C4533c cVar;
        C4582g gVar;
        if (!(this.f11424p == null || (cVar = this.f11409a) == null || (gVar = cVar.f11205b) == null)) {
            if (this.f11423o) {
                return cVar.f11215l;
            }
            TextureView textureView = gVar.f11387j;
            Object[] objArr = new Object[3];
            objArr[0] = IAlog.m16443a((Object) this);
            objArr[1] = textureView;
            objArr[2] = Boolean.valueOf(textureView != null && textureView.isAvailable());
            IAlog.m16446a("%sSave snapshot entered: tv = %s avail = %s", objArr);
            if (textureView != null && textureView.isAvailable()) {
                try {
                    IAlog.m16449d("creating bitmap on object - %s", this.f11424p);
                    Bitmap bitmap = textureView.getBitmap(this.f11424p);
                    if (this.f11412d.getVideoWidth() > 0 && this.f11412d.getVideoHeight() > 0) {
                        this.f11424p = null;
                        mo24858a(this.f11412d.getVideoWidth(), this.f11412d.getVideoHeight());
                    }
                    if (z) {
                        C5259c cVar2 = new C5259c();
                        cVar2.f13953c = 20;
                        cVar2.f13954d = 1;
                        cVar2.f13951a = bitmap.getWidth();
                        cVar2.f13952b = bitmap.getHeight();
                        this.f11409a.mo24714a(C5255b.m16456a(this.f11412d.getContext(), bitmap, cVar2));
                        this.f11423o = true;
                    } else {
                        this.f11409a.mo24714a(bitmap);
                    }
                    IAlog.m16449d("%ssave snapshot succeeded", IAlog.m16443a((Object) this));
                    return this.f11409a.f11215l;
                } catch (Exception unused) {
                    IAlog.m16449d("%ssave snapshot failed with exception", IAlog.m16443a((Object) this));
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public void mo24803c(boolean z) {
        C4533c cVar;
        C4582g gVar;
        C4204a0 a0Var;
        ListenerT listenert;
        C4582g gVar2;
        C4288z zVar;
        C4204a0 a0Var2;
        this.f11428t = true;
        C4213d0 d0Var = IAConfigManager.f10324J.f10358x;
        if (!(!z || d0Var == null || (zVar = this.f11410b) == null || (a0Var2 = ((C4287y) zVar).f10549f) == null)) {
            d0Var.mo24213a(a0Var2.f10378j, "LAST_VAST_SKIPED", "1");
        }
        C4533c cVar2 = this.f11409a;
        if (!(cVar2 == null || (gVar2 = cVar2.f11205b) == null)) {
            gVar2.mo24835m();
            this.f11409a.f11205b.mo24797k();
            C4408g gVar3 = this.f11409a.f11212i;
            if (!(gVar3 == null || gVar3.f10814c == null)) {
                IAlog.m16446a("%s skipped", "OMVideo");
                try {
                    gVar3.f10814c.skipped();
                } catch (Throwable th) {
                    gVar3.mo24588a(th);
                }
            }
        }
        if (!this.f11412d.mo25675d()) {
            this.f11412d.mo25669a(false);
            mo24867h();
            mo24826y();
            this.f11419k = false;
            this.f11416h = true;
            C4288z zVar2 = this.f11410b;
            if (!(zVar2 == null || (a0Var = ((C4287y) zVar2).f10549f) == null || a0Var.f10378j != UnitDisplayType.REWARDED || (listenert = this.f11415g) == null)) {
                listenert.onCompleted();
            }
        }
        if (this.f11415g != null && (this.f11414f <= 0 || this.f11416h || !((cVar = this.f11409a) == null || (gVar = cVar.f11205b) == null || !gVar.f11382e.equals(C4610b.f11462i)))) {
            this.f11415g.mo24918a(z);
        }
        mo24854j();
    }

    /* renamed from: a */
    public final void mo24861a(String str) {
        C4213d0 d0Var = IAConfigManager.f10324J.f10358x;
        C4288z zVar = this.f11410b;
        if (zVar != null) {
            C4287y yVar = (C4287y) zVar;
            if (yVar.f10549f != null) {
                d0Var.mo24213a(yVar.f10549f.f10378j, "LAST_VAST_CLICKED_TYPE", str);
            }
        }
    }

    /* renamed from: a */
    public void mo24840a(C4610b bVar) {
        IAlog.m16446a("%sonPlayerStateChanged with %s", IAlog.m16443a((Object) this), bVar);
        mo24860a(bVar, true);
    }

    /* renamed from: a */
    public final void mo24860a(C4610b bVar, boolean z) {
        ListenerT listenert;
        int ordinal = bVar.ordinal();
        if (ordinal != 2) {
            if (ordinal != 3) {
                switch (ordinal) {
                    case 6:
                        if (this.f11426r) {
                            mo24824v();
                            return;
                        }
                        return;
                    case 7:
                        mo24855s();
                        return;
                    case 8:
                        if (this.f11426r && !this.f11430v) {
                            this.f11430v = true;
                            mo24872q();
                            if (z && (listenert = this.f11415g) != null) {
                                listenert.onCompleted();
                                return;
                            }
                            return;
                        }
                        return;
                    case 9:
                        if (this.f11426r) {
                            mo24803c(false);
                            return;
                        }
                        return;
                    default:
                        return;
                }
            } else if (this.f11426r) {
                this.f11412d.mo25669a(true);
                this.f11412d.mo25673c(false);
                Runnable runnable = this.f11418j;
                if (runnable == null) {
                    if (runnable == null) {
                        this.f11418j = new C4597l(this);
                    }
                    int l = mo24819l();
                    IAlog.m16446a("%s Starting buffering timeout with %d", IAlog.m16443a((Object) this), Integer.valueOf(l));
                    this.f11412d.postDelayed(this.f11418j, (long) l);
                }
            }
        } else if (this.f11426r) {
            this.f11412d.mo25671b(true);
            mo24826y();
            mo24856u();
        }
    }

    /* renamed from: d */
    public void mo24852d() {
        IAlog.m16446a("%sonVideoViewDetachedFromWindow", IAlog.m16443a((Object) this));
        mo24854j();
    }

    /* renamed from: c */
    public final void mo24863c(int i) {
        if (this.f11412d != null) {
            C4251s sVar = this.f11411c;
            String str = null;
            C4226b bVar = sVar != null ? (C4226b) sVar.mo24264a(C4226b.class) : null;
            if (bVar != null) {
                bVar.mo24235e(IAConfigManager.f10324J.f10350p);
                C4419a aVar = bVar.f10423e;
                if (aVar != null && aVar.f10858d) {
                    str = aVar.f10857c;
                }
            }
            if (str != null) {
                this.f11412d.setSkipText(str.replaceFirst("\\[TIME\\]", Integer.toString(i)));
                return;
            }
            C5042i iVar = this.f11412d;
            iVar.setSkipText(iVar.getContext().getString(C4109R.string.ia_video_before_skip_format, new Object[]{Integer.valueOf(i)}));
        }
    }

    /* renamed from: a */
    public void mo24839a(int i) {
        int i2;
        C4288z zVar;
        C4582g gVar;
        C4533c cVar = this.f11409a;
        if (cVar != null && cVar.f11205b != null) {
            float m = mo24870m();
            C4533c cVar2 = this.f11409a;
            if (!(cVar2 == null || (gVar = cVar2.f11205b) == null || !gVar.mo24813j())) {
                float f = this.f11417i;
                if (m != f) {
                    int i3 = (m > 0.0f ? 1 : (m == 0.0f ? 0 : -1));
                    if (i3 > 0 && f >= 0.0f && mo24871o()) {
                        mo24868i(true);
                    } else if (i3 == 0 && !mo24871o()) {
                        mo24864f(true);
                    }
                }
                mo24874z();
            }
            this.f11417i = m;
            int d = this.f11409a.f11205b.mo24790d();
            int c = this.f11409a.f11205b.mo24789c();
            int i4 = c / 1000;
            int i5 = d / 1000;
            int i6 = i5 - i4;
            if (i6 < 0 || (!this.f11409a.f11205b.mo24813j() && c == d)) {
                i6 = 0;
            }
            C5042i iVar = this.f11412d;
            if (iVar.f13462n != null || iVar.f13470v != null) {
                iVar.setRemainingTime(Integer.toString(i6));
                if (this.f11414f < i5) {
                    if (mo24825w()) {
                        int d2 = this.f11409a.f11205b.mo24790d();
                        C4533c cVar3 = this.f11409a;
                        if (C4533c.m13817a(d2, ((C5008f) cVar3).f13359A, C4533c.m13815a(cVar3)) && !this.f11416h) {
                            int i7 = this.f11414f;
                            if (i4 < i7) {
                                mo24863c(i7 - i4);
                            } else {
                                this.f11414f = 0;
                                mo24869k();
                            }
                            this.f11412d.mo25674d(true);
                        }
                    }
                    this.f11412d.mo25674d(false);
                } else {
                    this.f11412d.mo25674d(false);
                }
                if (this.f11409a.f11205b.f11382e != C4610b.Paused) {
                    C5042i iVar2 = this.f11412d;
                    if (iVar2.f13470v != null) {
                        Runnable runnable = iVar2.f13451E;
                        if (runnable != null) {
                            iVar2.removeCallbacks(runnable);
                            iVar2.f13451E = null;
                        }
                        int i8 = i5 * 1000;
                        iVar2.f13470v.setMax(i8);
                        int i9 = i8 - (i6 * 1000);
                        int i10 = i9 + 1000;
                        iVar2.f13450D = i10;
                        int i11 = i9 + 200;
                        if (i10 > 0 && i10 <= i8) {
                            int i12 = iVar2.f13449C;
                            if (i11 >= i12 || i12 <= 0) {
                                iVar2.f13449C = i11;
                                iVar2.f13470v.setProgress(i11);
                                C5048k kVar = new C5048k(iVar2);
                                iVar2.f13451E = kVar;
                                iVar2.postDelayed(kVar, 200);
                            } else {
                                iVar2.f13470v.setProgress(i10);
                            }
                        }
                    }
                    C4252h hVar = IAConfigManager.f10324J.f10356v.f10459b;
                    int i13 = 30;
                    String num = Integer.toString(30);
                    if (hVar.f10456a.containsKey("max_rv_tsec")) {
                        num = hVar.f10456a.get("max_rv_tsec");
                    }
                    try {
                        i2 = Integer.parseInt(num);
                    } catch (Throwable unused) {
                        i2 = 30;
                    }
                    if (i2 >= 1) {
                        i13 = i2;
                    }
                    if (i5 > i13 && i4 > i13 && (zVar = this.f11410b) != null) {
                        C4287y yVar = (C4287y) zVar;
                        if (yVar.f10549f != null && yVar.f10549f.f10378j == UnitDisplayType.REWARDED) {
                            mo24869k();
                            this.f11412d.mo25674d(true);
                        }
                    }
                }
                ListenerT listenert = this.f11415g;
                if (listenert != null) {
                    listenert.onProgress(d, c);
                }
            }
        }
    }

    /* renamed from: a */
    public void mo24816a(boolean z) {
        C4533c cVar;
        C4582g gVar;
        C5042i iVar;
        Application application;
        if (this.f11426r != z && (cVar = this.f11409a) != null && cVar.f11205b != null) {
            IAlog.m16446a("%sonVisibilityChanged: %s my video view is%s", IAlog.m16443a((Object) this), Boolean.valueOf(z), this.f11412d);
            if (z) {
                this.f11426r = true;
                C4610b bVar = this.f11409a.f11205b.f11382e;
                if (bVar.equals(C4610b.f11462i) || this.f11412d.mo25675d()) {
                    if (!this.f11430v) {
                        this.f11430v = true;
                        mo24872q();
                        ListenerT listenert = this.f11415g;
                        if (listenert != null) {
                            listenert.onCompleted();
                        }
                    }
                    C5042i iVar2 = this.f11412d;
                    if (iVar2 != null && iVar2.f13452F != null) {
                        IAlog.m16446a("Autoclick resumed", new Object[0]);
                        iVar2.f13452F.mo26410b();
                        return;
                    }
                    return;
                }
                if (!bVar.equals(C4610b.Error)) {
                    if (bVar.equals(C4610b.Idle)) {
                        this.f11409a.getClass();
                    } else {
                        if (bVar == C4610b.Start_in_progress || bVar == C4610b.Playing) {
                            mo24824v();
                        }
                        C4533c cVar2 = this.f11409a;
                        if (!cVar2.f11220q) {
                            C5008f fVar = (C5008f) cVar2;
                            fVar.mo24716a(fVar.f13362x, VideoClickOrigin.InvalidOrigin, C4435q.EVENT_CREATIVE_VIEW);
                            cVar2.f11220q = true;
                        }
                        mo24818i();
                        if (this.f11421m == null && (application = C5292l.f14015a) != null) {
                            C4598m mVar = new C4598m(this);
                            this.f11421m = mVar;
                            application.registerActivityLifecycleCallbacks(mVar);
                            return;
                        }
                        return;
                    }
                }
                mo24803c(false);
                return;
            }
            this.f11426r = false;
            C4533c cVar3 = this.f11409a;
            if (!(cVar3 == null || (gVar = cVar3.f11205b) == null || !gVar.f11381d.equals(this.f11413e))) {
                IAlog.m16446a("%sonVisibilityChanged pausing video", IAlog.m16443a((Object) this));
                pauseVideo();
                if (this.f11409a.f11205b.f11382e == C4610b.f11462i || ((iVar = this.f11412d) != null && iVar.mo25675d())) {
                    C5042i iVar3 = this.f11412d;
                    if (iVar3.f13452F != null) {
                        IAlog.m16446a("Autoclick paused", new Object[0]);
                        iVar3.f13452F.mo26408a();
                    }
                }
            }
            mo24854j();
        }
    }

    /* renamed from: a */
    public void mo24859a(int i, C5306p0 p0Var) {
        IAlog.m16446a("onClicked called with %d", Integer.valueOf(i));
        switch (i) {
            case 1:
                if (mo24871o()) {
                    mo24868i(true);
                    C4533c cVar = this.f11409a;
                    if (cVar != null) {
                        C5008f fVar = (C5008f) cVar;
                        fVar.mo24716a(fVar.f13362x, VideoClickOrigin.MUTE, C4435q.EVENT_UNMUTE);
                    }
                } else {
                    mo24864f(true);
                    C4533c cVar2 = this.f11409a;
                    if (cVar2 != null) {
                        C5008f fVar2 = (C5008f) cVar2;
                        fVar2.mo24716a(fVar2.f13362x, VideoClickOrigin.MUTE, C4435q.EVENT_MUTE);
                    }
                }
                mo24874z();
                return;
            case 2:
                mo24823t();
                return;
            case 3:
                mo24861a("1");
                mo24862a(false, VideoClickOrigin.CTA, p0Var);
                return;
            case 4:
                mo24861a("2");
                C4533c cVar3 = this.f11409a;
                String str = null;
                C4421c f = cVar3 != null ? cVar3.mo24724f() : null;
                if (f != null && f.f10868a == C4425g.Static) {
                    str = f.f10874g;
                    C4533c cVar4 = this.f11409a;
                    if (cVar4 != null) {
                        cVar4.mo24716a((C5237i) f, VideoClickOrigin.COMPANION, C4435q.EVENT_CLICK);
                    }
                }
                C5042i iVar = this.f11412d;
                if (iVar != null) {
                    iVar.mo25676e();
                    iVar.f13453G = true;
                }
                ListenerT listenert = this.f11415g;
                if (listenert != null) {
                    listenert.mo24915a(str, p0Var);
                    return;
                }
                return;
            case 5:
                mo24822r();
                return;
            case 6:
                mo24803c(true);
                return;
            case 7:
                mo24815a(p0Var);
                return;
            case 8:
                mo24861a("2");
                mo24862a(true, VideoClickOrigin.COMPANION, p0Var);
                return;
            case 9:
                C4533c cVar5 = this.f11409a;
                if (cVar5 != null && !this.f11412d.f13444h) {
                    cVar5.f11214k = true;
                    mo24853h(false);
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0075, code lost:
        if (r5.f13957a != com.fyber.inneractive.sdk.util.C5262d0.C5265c.FAILED) goto L_0x0079;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo24862a(boolean r5, com.fyber.inneractive.sdk.player.enums.VideoClickOrigin r6, com.fyber.inneractive.sdk.util.C5306p0 r7) {
        /*
            r4 = this;
            com.fyber.inneractive.sdk.player.ui.i r0 = r4.f11412d
            r1 = 1
            if (r0 == 0) goto L_0x000a
            r0.mo25676e()
            r0.f13453G = r1
        L_0x000a:
            ListenerT r0 = r4.f11415g
            r2 = 0
            if (r0 == 0) goto L_0x0078
            if (r5 == 0) goto L_0x0032
            com.fyber.inneractive.sdk.player.c r5 = r4.f11409a
            if (r5 == 0) goto L_0x0078
            com.fyber.inneractive.sdk.player.f r5 = (com.fyber.inneractive.sdk.player.C5008f) r5
            com.fyber.inneractive.sdk.model.vast.b r5 = r5.f13362x
            if (r5 == 0) goto L_0x001e
            java.lang.String r5 = r5.f10860b
            goto L_0x001f
        L_0x001e:
            r5 = 0
        L_0x001f:
            r0.mo24915a((java.lang.String) r5, (com.fyber.inneractive.sdk.util.C5306p0) r7)
            com.fyber.inneractive.sdk.player.c r5 = r4.f11409a
            com.fyber.inneractive.sdk.model.vast.q[] r7 = new com.fyber.inneractive.sdk.model.vast.C4435q[r1]
            com.fyber.inneractive.sdk.model.vast.q r0 = com.fyber.inneractive.sdk.model.vast.C4435q.EVENT_CLICK
            r7[r2] = r0
            com.fyber.inneractive.sdk.player.f r5 = (com.fyber.inneractive.sdk.player.C5008f) r5
            com.fyber.inneractive.sdk.model.vast.b r0 = r5.f13362x
            r5.mo24716a(r0, r6, r7)
            goto L_0x0078
        L_0x0032:
            com.fyber.inneractive.sdk.player.enums.VideoClickOrigin r5 = com.fyber.inneractive.sdk.player.enums.VideoClickOrigin.VIDEO
            if (r6 != r5) goto L_0x0039
            com.fyber.inneractive.sdk.util.e r5 = com.fyber.inneractive.sdk.util.C5267e.VIDEO_CLICK
            goto L_0x003b
        L_0x0039:
            com.fyber.inneractive.sdk.util.e r5 = com.fyber.inneractive.sdk.util.C5267e.VIDEO_CTA
        L_0x003b:
            com.fyber.inneractive.sdk.util.d0$a r5 = r0.mo24914a((com.fyber.inneractive.sdk.util.C5306p0) r7, (com.fyber.inneractive.sdk.util.C5267e) r5)
            com.fyber.inneractive.sdk.player.c r7 = r4.f11409a
            if (r7 == 0) goto L_0x0071
            com.fyber.inneractive.sdk.model.vast.q[] r0 = new com.fyber.inneractive.sdk.model.vast.C4435q[r1]
            com.fyber.inneractive.sdk.model.vast.q r3 = com.fyber.inneractive.sdk.model.vast.C4435q.EVENT_CLICK
            r0[r2] = r3
            com.fyber.inneractive.sdk.player.f r7 = (com.fyber.inneractive.sdk.player.C5008f) r7
            com.fyber.inneractive.sdk.model.vast.b r3 = r7.f13362x
            r7.mo24716a(r3, r6, r0)
            com.fyber.inneractive.sdk.player.c r7 = r4.f11409a
            com.fyber.inneractive.sdk.measurement.g r7 = r7.f11212i
            if (r7 == 0) goto L_0x0071
            com.iab.omid.library.fyber.adsession.media.MediaEvents r0 = r7.f10814c
            if (r0 == 0) goto L_0x0071
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r3 = "OMVideo"
            r0[r2] = r3
            java.lang.String r3 = "%s click"
            com.fyber.inneractive.sdk.util.IAlog.m16446a(r3, r0)
            com.iab.omid.library.fyber.adsession.media.MediaEvents r0 = r7.f10814c     // Catch:{ all -> 0x006d }
            com.iab.omid.library.fyber.adsession.media.InteractionType r3 = com.iab.omid.library.fyber.adsession.media.InteractionType.CLICK     // Catch:{ all -> 0x006d }
            r0.adUserInteraction(r3)     // Catch:{ all -> 0x006d }
            goto L_0x0071
        L_0x006d:
            r0 = move-exception
            r7.mo24588a((java.lang.Throwable) r0)
        L_0x0071:
            com.fyber.inneractive.sdk.util.d0$c r5 = r5.f13957a
            com.fyber.inneractive.sdk.util.d0$c r7 = com.fyber.inneractive.sdk.util.C5262d0.C5265c.FAILED
            if (r5 == r7) goto L_0x0078
            goto L_0x0079
        L_0x0078:
            r1 = r2
        L_0x0079:
            com.fyber.inneractive.sdk.player.enums.VideoClickOrigin r5 = com.fyber.inneractive.sdk.player.enums.VideoClickOrigin.VIDEO
            if (r6 != r5) goto L_0x0082
            java.lang.String r5 = "3"
            r4.mo24861a((java.lang.String) r5)
        L_0x0082:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.C4594k.mo24862a(boolean, com.fyber.inneractive.sdk.player.enums.VideoClickOrigin, com.fyber.inneractive.sdk.util.p0):boolean");
    }

    /* renamed from: a */
    public void mo24800a(Bitmap bitmap) {
        C4582g gVar;
        C4533c cVar = this.f11409a;
        if (cVar != null && (gVar = cVar.f11205b) != null && gVar.f11382e != C4610b.f11462i) {
            this.f11412d.mo25669a(cVar.f11214k);
            this.f11412d.mo25671b(true);
            this.f11412d.setLastFrameBitmap(bitmap);
        }
    }

    /* renamed from: a */
    public void mo24799a(long j) {
        View view;
        C4533c cVar = this.f11409a;
        View c = cVar != null ? cVar.mo24721c() : null;
        C5042i iVar = this.f11412d;
        boolean z = c == null;
        ObjectAnimator objectAnimator = iVar.f13454H;
        if (objectAnimator != null) {
            if (objectAnimator.getDuration() <= j) {
                ViewGroup viewGroup = iVar.f13473y;
                if (viewGroup != null) {
                    iVar.mo25665a((View) viewGroup.getParent(), 4);
                }
                iVar.f13454H.start();
                iVar.f13454H.addListener(new C5047j(iVar));
            } else {
                iVar.f13455I = true;
                iVar.f13454H = null;
                ViewGroup viewGroup2 = iVar.f13473y;
                if (!(viewGroup2 == null || viewGroup2.getParent() == null)) {
                    ((View) iVar.f13473y.getParent()).setOnTouchListener((View.OnTouchListener) null);
                }
            }
            if (!z || (view = iVar.f13472x) == null) {
                ViewGroup viewGroup3 = iVar.f13473y;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(0);
                    return;
                }
                return;
            }
            view.setVisibility(0);
        }
    }
}
