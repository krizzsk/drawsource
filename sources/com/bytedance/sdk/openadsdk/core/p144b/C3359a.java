package com.bytedance.sdk.openadsdk.core.p144b;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.component.utils.C2909o;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.nativeexpress.C3545e;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.p178l.C3898x;

/* renamed from: com.bytedance.sdk.openadsdk.core.b.a */
/* compiled from: ClickCreativeListener */
public class C3359a extends C3360b {

    /* renamed from: F */
    private boolean f8039F = false;

    /* renamed from: G */
    private boolean f8040G = false;

    /* renamed from: H */
    private int f8041H;

    /* renamed from: a */
    private boolean f8042a = true;

    /* renamed from: b */
    public boolean mo19299b() {
        return false;
    }

    /* renamed from: c */
    public boolean mo19301c() {
        return false;
    }

    public C3359a(Context context, C3431n nVar, String str, int i) {
        super(context, nVar, str, i);
    }

    /* renamed from: a */
    public void mo19296a(boolean z) {
        this.f8042a = z;
    }

    /* renamed from: b */
    public void mo19298b(boolean z) {
        this.f8039F = z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x020a, code lost:
        if ((r2 instanceof com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView) == false) goto L_0x020c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0222, code lost:
        if (((java.lang.Boolean) r2.getTag(com.bytedance.sdk.component.utils.C2914t.m8158e(com.bytedance.sdk.openadsdk.core.C3513m.m10963a(), "tt_id_is_video_picture"))).booleanValue() != false) goto L_0x0224;
     */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0268  */
    /* JADX WARNING: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo18383a(android.view.View r24, float r25, float r26, float r27, float r28, android.util.SparseArray<com.bytedance.sdk.openadsdk.core.p144b.C3362c.C3363a> r29, boolean r30) {
        /*
            r23 = this;
            r11 = r23
            r10 = r24
            r9 = r30
            r2 = 2
            r0 = r23
            r1 = r24
            r3 = r25
            r4 = r26
            r5 = r27
            r6 = r28
            r7 = r29
            r8 = r30
            boolean r0 = r0.mo19314a(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r0 == 0) goto L_0x001e
            return
        L_0x001e:
            boolean r0 = r23.m9967i()
            java.lang.String r1 = "ClickCreativeListener"
            if (r0 == 0) goto L_0x0039
            boolean r0 = r23.m9964d(r24)
            if (r0 == 0) goto L_0x0039
            boolean r0 = r11.f8040G
            if (r0 != 0) goto L_0x0039
            java.lang.String r0 = "Intercept the native video view , Select the normal click event....."
            com.bytedance.sdk.component.utils.C2905l.m8111b((java.lang.String) r1, (java.lang.String) r0)
            super.mo18383a(r24, r25, r26, r27, r28, r29, r30)
            return
        L_0x0039:
            java.lang.String r0 = "Select creative area click event....."
            com.bytedance.sdk.component.utils.C2905l.m8111b((java.lang.String) r1, (java.lang.String) r0)
            android.content.Context r0 = r11.f8046b
            if (r0 != 0) goto L_0x0048
            android.content.Context r0 = com.bytedance.sdk.openadsdk.core.C3513m.m10963a()
            r11.f8046b = r0
        L_0x0048:
            android.content.Context r0 = r11.f8046b
            if (r0 != 0) goto L_0x004d
            return
        L_0x004d:
            boolean r0 = r11.mo19315a(r10, r9)
            if (r0 != 0) goto L_0x0054
            return
        L_0x0054:
            org.json.JSONObject r0 = com.bytedance.sdk.openadsdk.core.nativeexpress.NativeExpressView.m11034a((android.view.View) r24)
            com.bytedance.sdk.openadsdk.core.e.j r1 = r11.f8047c
            r18 = -1
            if (r1 == 0) goto L_0x006b
            com.bytedance.sdk.openadsdk.core.e.j r0 = r11.f8047c
            int r0 = r0.f8276l
            com.bytedance.sdk.openadsdk.core.e.j r1 = r11.f8047c
            org.json.JSONObject r1 = r1.f8277m
            r16 = r0
            r17 = r1
            goto L_0x006f
        L_0x006b:
            r17 = r0
            r16 = r18
        L_0x006f:
            long r6 = r11.f8079w
            long r4 = r11.f8080x
            java.lang.ref.WeakReference r0 = r11.f8051g
            if (r0 != 0) goto L_0x007c
            android.view.View r0 = r23.mo19319d()
            goto L_0x0084
        L_0x007c:
            java.lang.ref.WeakReference r0 = r11.f8051g
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
        L_0x0084:
            r19 = r0
            java.lang.ref.WeakReference r0 = r11.f8052h
            if (r0 != 0) goto L_0x008f
            android.view.View r0 = r23.mo19322e()
            goto L_0x0097
        L_0x008f:
            java.lang.ref.WeakReference r0 = r11.f8052h
            java.lang.Object r0 = r0.get()
            android.view.View r0 = (android.view.View) r0
        L_0x0097:
            r20 = r0
            java.lang.String r12 = r23.mo19323f()
            android.content.Context r0 = r11.f8046b
            float r13 = com.bytedance.sdk.openadsdk.p178l.C3904y.m12885e((android.content.Context) r0)
            android.content.Context r0 = r11.f8046b
            int r14 = com.bytedance.sdk.openadsdk.p178l.C3904y.m12890g(r0)
            android.content.Context r0 = r11.f8046b
            float r15 = com.bytedance.sdk.openadsdk.p178l.C3904y.m12888f((android.content.Context) r0)
            r0 = r23
            r1 = r25
            r2 = r26
            r3 = r27
            r21 = r4
            r4 = r28
            r5 = r29
            r8 = r21
            r10 = r19
            r11 = r20
            com.bytedance.sdk.openadsdk.core.e.g r0 = r0.mo19302a(r1, r2, r3, r4, r5, r6, r8, r10, r11, r12, r13, r14, r15, r16, r17)
            r1 = r23
            r1.f8053i = r0
            com.bytedance.sdk.openadsdk.core.e.n r0 = r1.f8048d
            int r0 = r0.mo19519L()
            r2 = 4
            r3 = 3
            r4 = 1
            r5 = 2
            if (r0 == r5) goto L_0x0193
            if (r0 == r3) goto L_0x0193
            if (r0 == r2) goto L_0x0127
            r2 = 5
            if (r0 == r2) goto L_0x00e4
            r2 = r24
            r0 = r18
            goto L_0x0264
        L_0x00e4:
            java.lang.String r2 = r1.f8049e
            java.lang.String r10 = r1.m9963b((java.lang.String) r2)
            boolean r2 = android.text.TextUtils.isEmpty(r10)
            if (r2 != 0) goto L_0x0103
            android.content.Context r6 = r1.f8046b
            com.bytedance.sdk.openadsdk.core.e.n r8 = r1.f8048d
            com.bytedance.sdk.openadsdk.core.e.g r9 = r1.f8053i
            r11 = 1
            java.util.Map r12 = r1.f8059o
            if (r30 == 0) goto L_0x00fd
            r13 = r4
            goto L_0x00fe
        L_0x00fd:
            r13 = r5
        L_0x00fe:
            java.lang.String r7 = "click_call"
            com.bytedance.sdk.openadsdk.p128b.C3090e.m8901a((android.content.Context) r6, (java.lang.String) r7, (com.bytedance.sdk.openadsdk.core.p149e.C3431n) r8, (com.bytedance.sdk.openadsdk.core.p149e.C3409g) r9, (java.lang.String) r10, (boolean) r11, (java.util.Map<java.lang.String, java.lang.Object>) r12, (int) r13)
        L_0x0103:
            android.content.Context r2 = r24.getContext()
            com.bytedance.sdk.openadsdk.core.e.n r3 = r1.f8048d
            java.lang.String r3 = r3.mo19524Q()
            boolean r11 = com.bytedance.sdk.openadsdk.p178l.C3898x.m12786d(r2, r3)
            android.content.Context r6 = r1.f8046b
            com.bytedance.sdk.openadsdk.core.e.n r8 = r1.f8048d
            com.bytedance.sdk.openadsdk.core.e.g r9 = r1.f8053i
            java.lang.String r10 = r1.f8049e
            java.util.Map r12 = r1.f8059o
            if (r30 == 0) goto L_0x011f
            r13 = r4
            goto L_0x0120
        L_0x011f:
            r13 = r5
        L_0x0120:
            java.lang.String r7 = "click"
            com.bytedance.sdk.openadsdk.p128b.C3090e.m8901a((android.content.Context) r6, (java.lang.String) r7, (com.bytedance.sdk.openadsdk.core.p149e.C3431n) r8, (com.bytedance.sdk.openadsdk.core.p149e.C3409g) r9, (java.lang.String) r10, (boolean) r11, (java.util.Map<java.lang.String, java.lang.Object>) r12, (int) r13)
            goto L_0x018f
        L_0x0127:
            com.bytedance.sdk.openadsdk.core.e.n r2 = r1.f8048d
            boolean r2 = com.bytedance.sdk.openadsdk.core.p149e.C3434p.m10489a((com.bytedance.sdk.openadsdk.core.p149e.C3431n) r2)
            if (r2 == 0) goto L_0x016d
            com.bytedance.sdk.openadsdk.TTNativeAd r2 = r1.f8055k
            if (r2 != 0) goto L_0x0137
            com.bytedance.sdk.openadsdk.TTNativeExpressAd r2 = r1.f8060p
            if (r2 == 0) goto L_0x016d
        L_0x0137:
            android.content.Context r6 = r1.f8046b
            com.bytedance.sdk.openadsdk.core.e.n r7 = r1.f8048d
            int r8 = r1.f8050f
            com.bytedance.sdk.openadsdk.TTNativeAd r9 = r1.f8055k
            com.bytedance.sdk.openadsdk.TTNativeExpressAd r10 = r1.f8060p
            java.lang.String r11 = r1.f8049e
            com.com.bytedance.overseas.sdk.a.c r12 = r1.f8058n
            r13 = 1
            boolean r19 = com.bytedance.sdk.openadsdk.core.C3704y.m12113a((android.content.Context) r6, (com.bytedance.sdk.openadsdk.core.p149e.C3431n) r7, (int) r8, (com.bytedance.sdk.openadsdk.TTNativeAd) r9, (com.bytedance.sdk.openadsdk.TTNativeExpressAd) r10, (java.lang.String) r11, (com.com.bytedance.overseas.sdk.p185a.C3968c) r12, (boolean) r13)
            boolean r2 = r1.f8042a
            if (r2 == 0) goto L_0x018f
            android.content.Context r14 = r1.f8046b
            com.bytedance.sdk.openadsdk.core.e.n r2 = r1.f8048d
            com.bytedance.sdk.openadsdk.core.e.g r3 = r1.f8053i
            java.lang.String r6 = r1.f8049e
            java.util.Map r7 = r1.f8059o
            if (r30 == 0) goto L_0x015d
            r21 = r4
            goto L_0x015f
        L_0x015d:
            r21 = r5
        L_0x015f:
            java.lang.String r15 = "click"
            r16 = r2
            r17 = r3
            r18 = r6
            r20 = r7
            com.bytedance.sdk.openadsdk.p128b.C3090e.m8901a((android.content.Context) r14, (java.lang.String) r15, (com.bytedance.sdk.openadsdk.core.p149e.C3431n) r16, (com.bytedance.sdk.openadsdk.core.p149e.C3409g) r17, (java.lang.String) r18, (boolean) r19, (java.util.Map<java.lang.String, java.lang.Object>) r20, (int) r21)
            goto L_0x018f
        L_0x016d:
            com.com.bytedance.overseas.sdk.a.c r2 = r1.f8058n
            if (r2 == 0) goto L_0x018f
            com.com.bytedance.overseas.sdk.a.c r2 = r1.f8058n
            r2.mo20860d()
            boolean r2 = r1.f8042a
            if (r2 == 0) goto L_0x018f
            android.content.Context r6 = r1.f8046b
            com.bytedance.sdk.openadsdk.core.e.n r8 = r1.f8048d
            com.bytedance.sdk.openadsdk.core.e.g r9 = r1.f8053i
            java.lang.String r10 = r1.f8049e
            r11 = 1
            java.util.Map r12 = r1.f8059o
            if (r30 == 0) goto L_0x0189
            r13 = r4
            goto L_0x018a
        L_0x0189:
            r13 = r5
        L_0x018a:
            java.lang.String r7 = "click"
            com.bytedance.sdk.openadsdk.p128b.C3090e.m8901a((android.content.Context) r6, (java.lang.String) r7, (com.bytedance.sdk.openadsdk.core.p149e.C3431n) r8, (com.bytedance.sdk.openadsdk.core.p149e.C3409g) r9, (java.lang.String) r10, (boolean) r11, (java.util.Map<java.lang.String, java.lang.Object>) r12, (int) r13)
        L_0x018f:
            r2 = r24
            goto L_0x0264
        L_0x0193:
            if (r0 != r3) goto L_0x01d6
            com.bytedance.sdk.openadsdk.core.e.n r3 = r1.f8048d
            java.lang.String r3 = r3.mo19522O()
            boolean r6 = android.text.TextUtils.isEmpty(r3)
            if (r6 != 0) goto L_0x01d6
            java.lang.String r6 = "play.google.com/store/apps/details?id="
            boolean r6 = r3.contains(r6)
            if (r6 == 0) goto L_0x01d6
            java.lang.String r6 = "?id="
            int r6 = r3.indexOf(r6)
            int r6 = r6 + r2
            java.lang.String r2 = r3.substring(r6)
            android.content.Context r3 = r1.f8046b
            boolean r2 = com.com.bytedance.overseas.sdk.p185a.C3967b.m13077b(r3, r2)
            if (r2 == 0) goto L_0x01d6
            boolean r2 = r1.f8042a
            if (r2 == 0) goto L_0x018f
            android.content.Context r6 = r1.f8046b
            com.bytedance.sdk.openadsdk.core.e.n r8 = r1.f8048d
            com.bytedance.sdk.openadsdk.core.e.g r9 = r1.f8053i
            java.lang.String r10 = r1.f8049e
            r11 = 1
            java.util.Map r12 = r1.f8059o
            if (r30 == 0) goto L_0x01cf
            r13 = r4
            goto L_0x01d0
        L_0x01cf:
            r13 = r5
        L_0x01d0:
            java.lang.String r7 = "click"
            com.bytedance.sdk.openadsdk.p128b.C3090e.m8901a((android.content.Context) r6, (java.lang.String) r7, (com.bytedance.sdk.openadsdk.core.p149e.C3431n) r8, (com.bytedance.sdk.openadsdk.core.p149e.C3409g) r9, (java.lang.String) r10, (boolean) r11, (java.util.Map<java.lang.String, java.lang.Object>) r12, (int) r13)
            goto L_0x018f
        L_0x01d6:
            com.bytedance.sdk.openadsdk.TTNativeAd r2 = r1.f8055k
            if (r2 != 0) goto L_0x01e2
            boolean r2 = r1.f8039F
            if (r2 == 0) goto L_0x01df
            goto L_0x01e2
        L_0x01df:
            r2 = r24
            goto L_0x01f8
        L_0x01e2:
            android.content.Context r6 = r1.f8046b
            com.bytedance.sdk.openadsdk.core.e.n r8 = r1.f8048d
            com.bytedance.sdk.openadsdk.core.e.g r9 = r1.f8053i
            java.lang.String r10 = r1.f8049e
            r11 = 1
            java.util.Map r12 = r1.f8059o
            if (r30 == 0) goto L_0x01f1
            r13 = r4
            goto L_0x01f2
        L_0x01f1:
            r13 = r5
        L_0x01f2:
            java.lang.String r7 = "click_button"
            com.bytedance.sdk.openadsdk.p128b.C3090e.m8901a((android.content.Context) r6, (java.lang.String) r7, (com.bytedance.sdk.openadsdk.core.p149e.C3431n) r8, (com.bytedance.sdk.openadsdk.core.p149e.C3409g) r9, (java.lang.String) r10, (boolean) r11, (java.util.Map<java.lang.String, java.lang.Object>) r12, (int) r13)
            goto L_0x01df
        L_0x01f8:
            if (r2 == 0) goto L_0x020c
            int r3 = r24.getId()     // Catch:{ Exception -> 0x0227 }
            android.content.Context r6 = r1.f8046b     // Catch:{ Exception -> 0x0227 }
            java.lang.String r7 = "tt_root_view"
            int r6 = com.bytedance.sdk.component.utils.C2914t.m8158e(r6, r7)     // Catch:{ Exception -> 0x0227 }
            if (r3 == r6) goto L_0x0224
            boolean r3 = r2 instanceof com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView     // Catch:{ Exception -> 0x0227 }
            if (r3 != 0) goto L_0x0224
        L_0x020c:
            android.content.Context r3 = com.bytedance.sdk.openadsdk.core.C3513m.m10963a()     // Catch:{ Exception -> 0x0227 }
            java.lang.String r6 = "tt_id_is_video_picture"
            int r3 = com.bytedance.sdk.component.utils.C2914t.m8158e(r3, r6)     // Catch:{ Exception -> 0x0227 }
            java.lang.Object r3 = r2.getTag(r3)     // Catch:{ Exception -> 0x0227 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ Exception -> 0x0227 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ Exception -> 0x0227 }
            boolean r3 = r3.booleanValue()     // Catch:{ Exception -> 0x0227 }
            if (r3 == 0) goto L_0x0227
        L_0x0224:
            com.bytedance.sdk.openadsdk.core.C3704y.m12112a(r4)     // Catch:{ Exception -> 0x0227 }
        L_0x0227:
            android.content.Context r6 = r1.f8046b
            com.bytedance.sdk.openadsdk.core.e.n r7 = r1.f8048d
            int r8 = r1.f8050f
            com.bytedance.sdk.openadsdk.TTNativeAd r9 = r1.f8055k
            com.bytedance.sdk.openadsdk.TTNativeExpressAd r10 = r1.f8060p
            int r3 = r1.f8050f
            java.lang.String r11 = com.bytedance.sdk.openadsdk.p178l.C3898x.m12752a((int) r3)
            com.com.bytedance.overseas.sdk.a.c r12 = r1.f8058n
            r13 = 1
            boolean r19 = com.bytedance.sdk.openadsdk.core.C3704y.m12113a((android.content.Context) r6, (com.bytedance.sdk.openadsdk.core.p149e.C3431n) r7, (int) r8, (com.bytedance.sdk.openadsdk.TTNativeAd) r9, (com.bytedance.sdk.openadsdk.TTNativeExpressAd) r10, (java.lang.String) r11, (com.com.bytedance.overseas.sdk.p185a.C3968c) r12, (boolean) r13)
            r3 = 0
            com.bytedance.sdk.openadsdk.core.C3704y.m12112a(r3)
            boolean r3 = r1.f8042a
            if (r3 == 0) goto L_0x0264
            android.content.Context r14 = r1.f8046b
            com.bytedance.sdk.openadsdk.core.e.n r3 = r1.f8048d
            com.bytedance.sdk.openadsdk.core.e.g r6 = r1.f8053i
            java.lang.String r7 = r1.f8049e
            java.util.Map r8 = r1.f8059o
            if (r30 == 0) goto L_0x0255
            r21 = r4
            goto L_0x0257
        L_0x0255:
            r21 = r5
        L_0x0257:
            java.lang.String r15 = "click"
            r16 = r3
            r17 = r6
            r18 = r7
            r20 = r8
            com.bytedance.sdk.openadsdk.p128b.C3090e.m8901a((android.content.Context) r14, (java.lang.String) r15, (com.bytedance.sdk.openadsdk.core.p149e.C3431n) r16, (com.bytedance.sdk.openadsdk.core.p149e.C3409g) r17, (java.lang.String) r18, (boolean) r19, (java.util.Map<java.lang.String, java.lang.Object>) r20, (int) r21)
        L_0x0264:
            com.bytedance.sdk.openadsdk.core.b.b$a r3 = r1.f8054j
            if (r3 == 0) goto L_0x026d
            com.bytedance.sdk.openadsdk.core.b.b$a r3 = r1.f8054j
            r3.mo18309a(r2, r0)
        L_0x026d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.p144b.C3359a.mo18383a(android.view.View, float, float, float, float, android.util.SparseArray, boolean):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo19297a() {
        if (this.f8048d == null) {
            return true;
        }
        int c = C3513m.m10973h().mo19841c(C3898x.m12794f(this.f8048d));
        int c2 = C2909o.m8136c(C3513m.m10963a());
        if (c == 1) {
            return C3898x.m12793e(c2);
        }
        if (c != 2) {
            if (c == 3) {
                return false;
            }
            if (c == 5 && !C3898x.m12793e(c2) && !C3898x.m12803g(c2)) {
                return false;
            }
            return true;
        } else if (C3898x.m12798f(c2) || C3898x.m12793e(c2) || C3898x.m12803g(c2)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: g */
    private boolean m9965g() {
        return C3431n.m10311c(this.f8048d) && this.f8048d.mo19646p() == 1;
    }

    /* renamed from: d */
    private boolean m9964d(View view) {
        if (view == null) {
            return false;
        }
        if (view instanceof NativeVideoTsView) {
            C2905l.m8114c("ClickCreativeListener", "NativeVideoTsView....");
            return true;
        } else if (view.getId() == C2914t.m8158e(this.f8046b, "tt_video_ad_cover_center_layout") || view.getId() == C2914t.m8158e(this.f8046b, "tt_video_ad_logo_image") || view.getId() == C2914t.m8158e(this.f8046b, "tt_video_btn_ad_image_tv") || view.getId() == C2914t.m8158e(this.f8046b, "tt_video_ad_name") || view.getId() == C2914t.m8158e(this.f8046b, "tt_video_ad_button")) {
            C2905l.m8114c("ClickCreativeListener", "tt_video_ad_cover_center_layout....");
            return true;
        } else if (view.getId() == C2914t.m8158e(this.f8046b, "tt_root_view") || view.getId() == C2914t.m8158e(this.f8046b, "tt_video_play")) {
            C2905l.m8114c("ClickCreativeListener", "tt_root_view....");
            return true;
        } else if (!(view instanceof ViewGroup)) {
            return false;
        } else {
            int i = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i >= viewGroup.getChildCount()) {
                    return false;
                }
                if (m9964d(viewGroup.getChildAt(i))) {
                    return true;
                }
                i++;
            }
        }
    }

    /* renamed from: h */
    private boolean m9966h() {
        return this instanceof C3545e;
    }

    /* renamed from: i */
    private boolean m9967i() {
        if (this.f8048d == null || m9966h()) {
            return false;
        }
        if (this.f8048d.mo19570ad() != 5 && this.f8048d.mo19570ad() != 15) {
            return false;
        }
        if (this.f8041H == 0) {
            this.f8041H = C3898x.m12790e(this.f8048d);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("!isViewVisibility()=");
        sb.append(!mo19299b());
        sb.append(",isAutoPlay()=");
        sb.append(mo19297a());
        sb.append(",!isCoverPageVisibility()=");
        sb.append(!mo19301c());
        C2905l.m8111b("ClickCreativeListener", sb.toString());
        if (this.f8041H == 5 && m9965g() && mo19297a() && !mo19299b() && !mo19301c()) {
            return false;
        }
        int i = this.f8041H;
        if (i == 1 || i == 2 || i == 5) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String m9963b(java.lang.String r8) {
        /*
            r7 = this;
            int r0 = r8.hashCode()
            java.lang.String r1 = "open_ad"
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r0) {
                case -1695837674: goto L_0x003f;
                case -1263194568: goto L_0x0037;
                case -712491894: goto L_0x002d;
                case 1844104722: goto L_0x0023;
                case 1912999166: goto L_0x0019;
                case 2091589896: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0049
        L_0x000f:
            java.lang.String r0 = "slide_banner_ad"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0049
            r8 = r4
            goto L_0x004a
        L_0x0019:
            java.lang.String r0 = "draw_ad"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0049
            r8 = r6
            goto L_0x004a
        L_0x0023:
            java.lang.String r0 = "interaction"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0049
            r8 = r3
            goto L_0x004a
        L_0x002d:
            java.lang.String r0 = "embeded_ad"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0049
            r8 = 0
            goto L_0x004a
        L_0x0037:
            boolean r8 = r8.equals(r1)
            if (r8 == 0) goto L_0x0049
            r8 = r2
            goto L_0x004a
        L_0x003f:
            java.lang.String r0 = "banner_ad"
            boolean r8 = r8.equals(r0)
            if (r8 == 0) goto L_0x0049
            r8 = r5
            goto L_0x004a
        L_0x0049:
            r8 = -1
        L_0x004a:
            if (r8 == 0) goto L_0x0060
            if (r8 == r6) goto L_0x0060
            java.lang.String r0 = "banner_call"
            if (r8 == r5) goto L_0x005f
            if (r8 == r4) goto L_0x005f
            if (r8 == r3) goto L_0x005c
            if (r8 == r2) goto L_0x005b
            java.lang.String r8 = ""
            return r8
        L_0x005b:
            return r1
        L_0x005c:
            java.lang.String r8 = "interaction_call"
            return r8
        L_0x005f:
            return r0
        L_0x0060:
            java.lang.String r8 = "feed_call"
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.p144b.C3359a.m9963b(java.lang.String):java.lang.String");
    }

    /* renamed from: c */
    public void mo19300c(boolean z) {
        this.f8040G = z;
    }
}
