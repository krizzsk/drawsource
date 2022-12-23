package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.config.C4287y;
import com.fyber.inneractive.sdk.config.C4288z;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Skip;
import com.fyber.inneractive.sdk.config.enums.TapAction;
import com.fyber.inneractive.sdk.config.global.C4251s;
import com.fyber.inneractive.sdk.config.global.features.C4234j;
import com.fyber.inneractive.sdk.player.C4533c;
import com.fyber.inneractive.sdk.player.enums.C4610b;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.player.p190ui.C5037d;
import com.fyber.inneractive.sdk.util.C5306p0;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.player.controller.e */
public class C4579e extends C4594k<C4605s> {

    /* renamed from: A */
    public boolean f11373A;

    /* renamed from: y */
    public boolean f11374y = false;

    /* renamed from: z */
    public boolean f11375z = false;

    public C4579e(C4533c cVar, C5037d dVar, C4288z zVar, C4251s sVar, boolean z, boolean z2, Skip skip, boolean z3) {
        super(cVar, dVar, zVar, sVar, z2, skip);
        this.f11374y = z;
        this.f11373A = z3;
    }

    /* renamed from: a */
    public void mo24816a(boolean z) {
        C4533c cVar;
        C4582g gVar;
        if (z && (cVar = this.f11409a) != null && (gVar = cVar.f11205b) != null && !gVar.f11382e.equals(C4610b.f11462i) && !this.f11412d.mo25675d()) {
            mo24853h(false);
        }
        super.mo24816a(z);
    }

    /* renamed from: b */
    public void mo24817b() {
        if (this.f11416h) {
            mo24872q();
        } else {
            mo24818i();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        r3 = (r3 = r3.f11205b).f11382e;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo24805d(boolean r3) {
        /*
            r2 = this;
            super.mo24805d(r3)
            boolean r3 = r2.f11374y
            r0 = 0
            if (r3 == 0) goto L_0x0014
            com.fyber.inneractive.sdk.player.ui.i r3 = r2.f11412d
            r3.mo25677f()
            com.fyber.inneractive.sdk.player.ui.i r3 = r2.f11412d
            r3.mo25674d(r0)
            r2.f11414f = r0
        L_0x0014:
            r2.mo24873x()
            com.fyber.inneractive.sdk.player.c r3 = r2.f11409a
            if (r3 == 0) goto L_0x002c
            com.fyber.inneractive.sdk.player.controller.g r3 = r3.f11205b
            if (r3 != 0) goto L_0x0020
            goto L_0x002c
        L_0x0020:
            com.fyber.inneractive.sdk.player.enums.b r3 = r3.f11382e
            com.fyber.inneractive.sdk.player.enums.b r1 = com.fyber.inneractive.sdk.player.enums.C4610b.Preparing
            if (r3 == r1) goto L_0x002a
            com.fyber.inneractive.sdk.player.enums.b r1 = com.fyber.inneractive.sdk.player.enums.C4610b.Prepared
            if (r3 != r1) goto L_0x002c
        L_0x002a:
            r3 = 1
            goto L_0x002d
        L_0x002c:
            r3 = r0
        L_0x002d:
            com.fyber.inneractive.sdk.player.ui.i r1 = r2.f11412d
            r1.mo25671b(r3)
            com.fyber.inneractive.sdk.player.ui.i r3 = r2.f11412d
            r3.mo25673c(r0)
            com.fyber.inneractive.sdk.player.ui.i r3 = r2.f11412d
            com.fyber.inneractive.sdk.player.ui.b r1 = new com.fyber.inneractive.sdk.player.ui.b
            r1.<init>()
            r1.f13428b = r0
            com.fyber.inneractive.sdk.player.ui.a r0 = new com.fyber.inneractive.sdk.player.ui.a
            r0.<init>(r1)
            r3.mo25667a((com.fyber.inneractive.sdk.player.p190ui.C5034a) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.C4579e.mo24805d(boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0044  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo24818i() {
        /*
            r7 = this;
            super.mo24818i()
            com.fyber.inneractive.sdk.player.c r0 = r7.f11409a
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0077
            com.fyber.inneractive.sdk.player.controller.g r0 = r0.f11205b
            if (r0 == 0) goto L_0x0077
            boolean r0 = r7.f11375z
            if (r0 == 0) goto L_0x0013
            goto L_0x0077
        L_0x0013:
            r0 = 2
            com.fyber.inneractive.sdk.player.ui.i r3 = r7.f11412d     // Catch:{ all -> 0x002b }
            android.content.Context r3 = r3.getContext()     // Catch:{ all -> 0x002b }
            java.lang.String r4 = "audio"
            java.lang.Object r3 = r3.getSystemService(r4)     // Catch:{ all -> 0x002b }
            android.media.AudioManager r3 = (android.media.AudioManager) r3     // Catch:{ all -> 0x002b }
            int r4 = r3.getRingerMode()     // Catch:{ all -> 0x002b }
            int r3 = r3.getStreamVolume(r0)     // Catch:{ all -> 0x002c }
            goto L_0x002d
        L_0x002b:
            r4 = r2
        L_0x002c:
            r3 = r2
        L_0x002d:
            boolean r5 = r7.f11374y
            if (r5 != 0) goto L_0x0041
            com.fyber.inneractive.sdk.config.z r5 = r7.f11410b
            com.fyber.inneractive.sdk.config.y r5 = (com.fyber.inneractive.sdk.config.C4287y) r5
            com.fyber.inneractive.sdk.config.a0 r5 = r5.f10549f
            java.lang.Boolean r5 = r5.f10372d
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L_0x0041
            r5 = r1
            goto L_0x0042
        L_0x0041:
            r5 = r2
        L_0x0042:
            if (r5 != 0) goto L_0x006f
            boolean r5 = r7.f11373A
            if (r5 == 0) goto L_0x0056
            com.fyber.inneractive.sdk.config.z r5 = r7.f11410b
            com.fyber.inneractive.sdk.config.y r5 = (com.fyber.inneractive.sdk.config.C4287y) r5
            com.fyber.inneractive.sdk.config.a0 r5 = r5.f10549f
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r5 = r5.f10378j
            com.fyber.inneractive.sdk.config.enums.UnitDisplayType r6 = com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED
            if (r5 == r6) goto L_0x0056
            r5 = r1
            goto L_0x0057
        L_0x0056:
            r5 = r2
        L_0x0057:
            if (r5 == 0) goto L_0x005a
            goto L_0x006f
        L_0x005a:
            if (r3 <= 0) goto L_0x0072
            if (r4 != r0) goto L_0x0072
            java.lang.Object[] r0 = new java.lang.Object[r1]
            java.lang.String r3 = com.fyber.inneractive.sdk.util.IAlog.m16443a((java.lang.Object) r7)
            r0[r2] = r3
            java.lang.String r3 = "%s setting default volume. unmuting player"
            com.fyber.inneractive.sdk.util.IAlog.m16446a(r3, r0)
            r7.mo24868i(r2)
            goto L_0x0072
        L_0x006f:
            r7.mo24864f(r2)
        L_0x0072:
            r7.mo24874z()
            r7.f11375z = r1
        L_0x0077:
            r7.mo24853h(r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.C4579e.mo24818i():boolean");
    }

    /* renamed from: l */
    public int mo24819l() {
        return IAConfigManager.f10324J.f10356v.f10459b.mo24271a("VideoFullscreenBufferingTimeout", 12, 1) * 1000;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0033  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo24820n() {
        /*
            r6 = this;
            com.fyber.inneractive.sdk.config.IAConfigManager r0 = com.fyber.inneractive.sdk.config.IAConfigManager.f10324J
            com.fyber.inneractive.sdk.config.i r0 = r0.f10356v
            com.fyber.inneractive.sdk.config.h r0 = r0.f10459b
            com.fyber.inneractive.sdk.config.z r1 = r6.f11410b
            com.fyber.inneractive.sdk.config.enums.Skip r2 = r6.f11432x
            java.lang.String r3 = "vast_configuration"
            com.fyber.inneractive.sdk.config.f r0 = r0.mo24272a((java.lang.String) r3)
            java.lang.String r3 = "skip_d"
            r0.getClass()
            r4 = -1
            java.util.Map<java.lang.String, java.lang.String> r5 = r0.f10408a     // Catch:{ Exception -> 0x002b }
            boolean r5 = r5.containsKey(r3)     // Catch:{ Exception -> 0x002b }
            if (r5 == 0) goto L_0x002b
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f10408a     // Catch:{ Exception -> 0x002b }
            java.lang.Object r0 = r0.get(r3)     // Catch:{ Exception -> 0x002b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x002b }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x002b }
            goto L_0x002c
        L_0x002b:
            r0 = r4
        L_0x002c:
            int r0 = java.lang.Math.max(r0, r4)
            if (r0 <= r4) goto L_0x0033
            goto L_0x004b
        L_0x0033:
            if (r2 != 0) goto L_0x003b
            com.fyber.inneractive.sdk.config.y r1 = (com.fyber.inneractive.sdk.config.C4287y) r1
            com.fyber.inneractive.sdk.config.a0 r0 = r1.f10549f
            com.fyber.inneractive.sdk.config.enums.Skip r2 = r0.f10376h
        L_0x003b:
            com.fyber.inneractive.sdk.config.enums.Skip r0 = com.fyber.inneractive.sdk.config.enums.Skip.DEFAULT
            if (r2 != r0) goto L_0x0043
            r0 = 99999(0x1869f, float:1.40128E-40)
            goto L_0x004b
        L_0x0043:
            java.lang.Integer r0 = r2.value()
            int r0 = r0.intValue()
        L_0x004b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.controller.C4579e.mo24820n():int");
    }

    /* renamed from: p */
    public void mo24821p() {
        this.f11429u = true;
        IAlog.m16446a("%s onBufferingTimeout reached. Skipping to end card", IAlog.m16443a((Object) this));
        mo24803c(false);
    }

    /* renamed from: r */
    public void mo24822r() {
        ListenerT listenert = this.f11415g;
        if (listenert != null) {
            listenert.mo24924k();
        }
    }

    /* renamed from: t */
    public void mo24823t() {
        this.f11412d.mo25674d(true);
        mo24873x();
        mo24869k();
        mo24818i();
        mo24853h(true);
    }

    /* renamed from: v */
    public void mo24824v() {
        super.mo24824v();
        this.f11412d.mo25671b(false);
        if (this.f11374y) {
            this.f11412d.mo25677f();
        }
    }

    /* renamed from: w */
    public boolean mo24825w() {
        return !this.f11374y;
    }

    /* renamed from: y */
    public void mo24826y() {
        C4582g gVar;
        super.mo24826y();
        C4533c cVar = this.f11409a;
        if (cVar != null && (gVar = cVar.f11205b) != null && gVar.f11382e.equals(C4610b.f11462i) && this.f11374y) {
            this.f11412d.mo25677f();
        }
    }

    /* renamed from: a */
    public void mo24815a(C5306p0 p0Var) {
        C4234j.C4236b bVar;
        TapAction tapAction = ((C4287y) this.f11410b).f10549f.f10377i;
        if (tapAction == TapAction.CTR) {
            mo24862a(false, VideoClickOrigin.VIDEO, p0Var);
        } else if (tapAction == TapAction.FULLSCREEN || tapAction == TapAction.DO_NOTHING) {
            String a = ((C4234j) this.f11411c.mo24264a(C4234j.class)).mo24237a("click_action", "none");
            C4234j.C4236b[] values = C4234j.C4236b.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    bVar = C4234j.C4236b.NONE;
                    break;
                }
                bVar = values[i];
                if (a.equalsIgnoreCase(bVar.f10431a)) {
                    break;
                }
                i++;
            }
            if (bVar.equals(C4234j.C4236b.OPEN)) {
                mo24862a(false, VideoClickOrigin.VIDEO, p0Var);
            }
        } else {
            IAlog.m16446a("% sonVideoClicked called, but we recieved an unknown tap action %s", IAlog.m16443a((Object) this), tapAction);
        }
    }
}
