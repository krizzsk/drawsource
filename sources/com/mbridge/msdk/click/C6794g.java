package com.mbridge.msdk.click;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.mbridge.msdk.click.C6785e;
import com.mbridge.msdk.click.C6787f;
import com.mbridge.msdk.click.CommonJumpLoader;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.p304e.C8490a;
import com.mbridge.msdk.foundation.same.p304e.C8493b;
import com.mbridge.msdk.foundation.tools.C8675y;
import java.util.concurrent.Semaphore;

/* renamed from: com.mbridge.msdk.click.g */
/* compiled from: WebViewSpiderLoader */
public final class C6794g extends C6783c implements C8490a.C8492b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C6784d f17940a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public CommonJumpLoader.JumpLoaderResult f17941b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public boolean f17942c = true;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f17943d;

    /* renamed from: e */
    private Context f17944e;

    /* renamed from: f */
    private C8493b f17945f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C6785e.C6786a f17946g;

    /* renamed from: h */
    private Handler f17947h = new Handler(Looper.getMainLooper());

    public C6794g(Context context) {
        this.f17944e = context;
        this.f17945f = new C8493b(context, 2);
    }

    /* renamed from: a */
    public final void mo37108a(String str, C6784d dVar, boolean z, String str2, String str3, CampaignEx campaignEx, boolean z2, boolean z3, int i) {
        this.f17940a = dVar;
        this.f17943d = z;
        this.f17945f.mo57904a(new C6796a(this.f17944e, str, str2, str3, campaignEx, z2, z3, i), this);
    }

    /* renamed from: a */
    public final void mo37013a() {
        this.f17942c = false;
    }

    /* renamed from: com.mbridge.msdk.click.g$a */
    /* compiled from: WebViewSpiderLoader */
    private class C6796a extends C8490a {

        /* renamed from: e */
        private final Semaphore f17950e = new Semaphore(0);

        /* renamed from: f */
        private final Context f17951f;

        /* renamed from: g */
        private String f17952g;

        /* renamed from: h */
        private String f17953h;

        /* renamed from: i */
        private String f17954i;

        /* renamed from: j */
        private CampaignEx f17955j;

        /* renamed from: k */
        private boolean f17956k;

        /* renamed from: l */
        private boolean f17957l;

        /* renamed from: m */
        private int f17958m;

        /* renamed from: n */
        private C6787f.C6793a f17959n = new C6787f.C6793a() {
            /* renamed from: c */
            public final boolean mo37106c(String str) {
                return false;
            }

            /* renamed from: a */
            public final boolean mo37104a(String str) {
                boolean a = C6796a.this.m20704a(str);
                if (a) {
                    m20708a();
                }
                return a;
            }

            /* renamed from: b */
            public final boolean mo37105b(String str) {
                boolean a = C6796a.this.m20704a(str);
                if (a) {
                    m20708a();
                }
                return a;
            }

            /* renamed from: a */
            public final void mo37103a(String str, boolean z, String str2) {
                boolean unused = C6796a.this.m20704a(str);
                C6794g.this.f17941b.setContent(str2);
                m20708a();
            }

            /* renamed from: a */
            private void m20708a() {
                synchronized (C6794g.this) {
                    C6794g.this.f17941b.setSuccess(true);
                    C6796a.this.f17950e.release();
                }
            }

            /* renamed from: a */
            public final void mo37102a(int i, String str, String str2, String str3) {
                if (!TextUtils.isEmpty(str2)) {
                    C6794g.this.f17941b.setExceptionMsg(str2);
                }
                if (!TextUtils.isEmpty(str3)) {
                    C6794g.this.f17941b.setContent(str3);
                }
                boolean unused = C6796a.this.m20704a(str);
                m20708a();
            }
        };

        /* renamed from: b */
        public final void mo37111b() {
        }

        public C6796a(Context context, String str, String str2, String str3, CampaignEx campaignEx, boolean z, boolean z2, int i) {
            this.f17951f = context;
            this.f17952g = str;
            this.f17953h = str2;
            this.f17954i = str3;
            this.f17955j = campaignEx;
            this.f17956k = z;
            this.f17957l = z2;
            this.f17958m = i;
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x005a  */
        /* JADX WARNING: Removed duplicated region for block: B:81:0x01ec A[EDGE_INSN: B:81:0x01ec->B:79:0x01ec ?: BREAK  , SYNTHETIC] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private com.mbridge.msdk.click.CommonJumpLoader.JumpLoaderResult m20701a(java.lang.String r16, boolean r17, boolean r18, com.mbridge.msdk.foundation.entity.CampaignEx r19, int r20) {
            /*
                r15 = this;
                r1 = r15
                r0 = r16
                java.lang.String r2 = ""
                com.mbridge.msdk.click.g r3 = com.mbridge.msdk.click.C6794g.this
                boolean r3 = r3.f17943d
                if (r3 == 0) goto L_0x0028
                android.content.Context r3 = r1.f17951f
                java.lang.String r3 = com.mbridge.msdk.p078c.C2440a.m5882a(r3, r0)
                boolean r4 = android.text.TextUtils.isEmpty(r3)
                if (r4 != 0) goto L_0x0028
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r0)
                r4.append(r3)
                java.lang.String r0 = r4.toString()
            L_0x0028:
                r3 = r0
                com.mbridge.msdk.click.CommonJumpLoader$JumpLoaderResult r4 = new com.mbridge.msdk.click.CommonJumpLoader$JumpLoaderResult
                r4.<init>()
                com.mbridge.msdk.click.e r5 = new com.mbridge.msdk.click.e
                r5.<init>()
                boolean r0 = r15.m20705b(r3)     // Catch:{ Exception -> 0x004a }
                if (r0 != 0) goto L_0x0048
                java.net.URI r0 = java.net.URI.create(r3)     // Catch:{ Exception -> 0x004a }
                java.lang.String r6 = r0.getScheme()     // Catch:{ Exception -> 0x004a }
                java.lang.String r2 = r0.getHost()     // Catch:{ Exception -> 0x0046 }
                goto L_0x004f
            L_0x0046:
                r0 = move-exception
                goto L_0x004c
            L_0x0048:
                r0 = r2
                goto L_0x0051
            L_0x004a:
                r0 = move-exception
                r6 = r2
            L_0x004c:
                r0.printStackTrace()
            L_0x004f:
                r0 = r2
                r2 = r6
            L_0x0051:
                r6 = 0
                r8 = r3
                r7 = r6
                r3 = r2
                r2 = r0
            L_0x0056:
                r0 = 10
                if (r7 >= r0) goto L_0x01ec
                com.mbridge.msdk.click.g r0 = com.mbridge.msdk.click.C6794g.this
                boolean r0 = r0.f17942c
                r9 = 0
                if (r0 != 0) goto L_0x0064
                return r9
            L_0x0064:
                com.mbridge.msdk.click.g r0 = com.mbridge.msdk.click.C6794g.this
                r12 = r17
                r13 = r18
                r10 = r19
                com.mbridge.msdk.click.e$a r11 = r5.mo37085a(r8, r12, r13, r10)
                com.mbridge.msdk.click.C6785e.C6786a unused = r0.f17946g = r11
                com.mbridge.msdk.click.g r0 = com.mbridge.msdk.click.C6794g.this
                com.mbridge.msdk.click.e$a r0 = r0.f17946g
                if (r0 != 0) goto L_0x0083
                r4.setUrl(r8)
                r4.setSuccess(r6)
                goto L_0x01ec
            L_0x0083:
                com.mbridge.msdk.click.g r0 = com.mbridge.msdk.click.C6794g.this
                com.mbridge.msdk.click.e$a r0 = r0.f17946g
                java.lang.String r0 = r0.f17909h
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                r11 = 1
                if (r0 != 0) goto L_0x00d0
                r4.setUrl(r8)
                com.mbridge.msdk.click.g r0 = com.mbridge.msdk.click.C6794g.this
                com.mbridge.msdk.click.e$a r0 = r0.f17946g
                java.lang.String r0 = r0.f17909h
                r4.setExceptionMsg(r0)
                r4.setType(r11)
                com.mbridge.msdk.click.g r0 = com.mbridge.msdk.click.C6794g.this
                com.mbridge.msdk.click.e$a r0 = r0.f17946g
                java.lang.String r0 = r0.mo37086a()
                r4.setHeader(r0)
                r4.setSuccess(r6)
                if (r7 != 0) goto L_0x01ec
                com.mbridge.msdk.click.a.a r7 = com.mbridge.msdk.click.p217a.C6772a.m20600a()
                com.mbridge.msdk.click.g r0 = com.mbridge.msdk.click.C6794g.this
                com.mbridge.msdk.click.e$a r0 = r0.f17946g
                java.lang.String r9 = r0.f17909h
                java.lang.String r11 = r1.f17954i
                r10 = r19
                r12 = r17
                r13 = r18
                r14 = r20
                r7.mo37052a(r8, r9, r10, r11, r12, r13, r14)
                goto L_0x01ec
            L_0x00d0:
                r4.setSuccess(r11)
                com.mbridge.msdk.click.g r0 = com.mbridge.msdk.click.C6794g.this
                com.mbridge.msdk.click.e$a r0 = r0.f17946g
                int r0 = r0.f17907f
                r14 = 301(0x12d, float:4.22E-43)
                if (r0 == r14) goto L_0x00ea
                r14 = 302(0x12e, float:4.23E-43)
                if (r0 == r14) goto L_0x00ea
                r14 = 307(0x133, float:4.3E-43)
                if (r0 != r14) goto L_0x00e8
                goto L_0x00ea
            L_0x00e8:
                r0 = r6
                goto L_0x00eb
            L_0x00ea:
                r0 = r11
            L_0x00eb:
                if (r0 == 0) goto L_0x0197
                r4.setIs302Jump(r11)
                com.mbridge.msdk.click.g r0 = com.mbridge.msdk.click.C6794g.this
                com.mbridge.msdk.click.e$a r0 = r0.f17946g
                java.lang.String r0 = r0.f17902a
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L_0x0106
                r4.setjumpDone(r11)
                r4.setUrl(r8)
                goto L_0x01ec
            L_0x0106:
                com.mbridge.msdk.click.g r0 = com.mbridge.msdk.click.C6794g.this
                com.mbridge.msdk.click.e$a r0 = r0.f17946g
                java.lang.String r8 = r0.f17902a
                boolean r0 = r15.m20705b(r8)
                if (r0 == 0) goto L_0x014a
                java.lang.String r0 = "/"
                boolean r0 = r8.startsWith(r0)
                if (r0 == 0) goto L_0x0142
                boolean r0 = android.text.TextUtils.isEmpty(r3)
                if (r0 != 0) goto L_0x0142
                boolean r0 = android.text.TextUtils.isEmpty(r2)
                if (r0 != 0) goto L_0x0142
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                r0.append(r3)
                java.lang.String r3 = "://"
                r0.append(r3)
                r0.append(r2)
                r0.append(r8)
                java.lang.String r8 = r0.toString()
                r2 = r9
                r3 = r2
                goto L_0x0162
            L_0x0142:
                r4.setjumpDone(r11)
                r4.setUrl(r8)
                goto L_0x01ec
            L_0x014a:
                boolean r0 = r15.m20705b(r8)
                if (r0 != 0) goto L_0x0162
                java.net.URI r0 = java.net.URI.create(r8)     // Catch:{ Exception -> 0x015e }
                java.lang.String r3 = r0.getScheme()     // Catch:{ Exception -> 0x015e }
                java.lang.String r0 = r0.getHost()     // Catch:{ Exception -> 0x015e }
                r2 = r0
                goto L_0x0162
            L_0x015e:
                r0 = move-exception
                r0.printStackTrace()
            L_0x0162:
                boolean r0 = com.mbridge.msdk.foundation.tools.C8675y.C8676a.m24900a((java.lang.String) r8)
                if (r0 == 0) goto L_0x0170
                r4.setjumpDone(r11)
                r4.setUrl(r8)
                goto L_0x01ec
            L_0x0170:
                com.mbridge.msdk.click.g r0 = com.mbridge.msdk.click.C6794g.this
                boolean r0 = r0.f17943d
                if (r0 == 0) goto L_0x0193
                android.content.Context r0 = r1.f17951f
                java.lang.String r0 = com.mbridge.msdk.p078c.C2440a.m5882a(r0, r8)
                boolean r9 = android.text.TextUtils.isEmpty(r0)
                if (r9 != 0) goto L_0x0193
                java.lang.StringBuilder r9 = new java.lang.StringBuilder
                r9.<init>()
                r9.append(r8)
                r9.append(r0)
                java.lang.String r8 = r9.toString()
            L_0x0193:
                int r7 = r7 + 1
                goto L_0x0056
            L_0x0197:
                com.mbridge.msdk.click.g r0 = com.mbridge.msdk.click.C6794g.this
                com.mbridge.msdk.click.e$a r0 = r0.f17946g
                int r0 = r0.f17907f
                r2 = 200(0xc8, float:2.8E-43)
                if (r0 != r2) goto L_0x01a5
                r0 = r11
                goto L_0x01a6
            L_0x01a5:
                r0 = r6
            L_0x01a6:
                if (r0 == 0) goto L_0x01ba
                r4.setjumpDone(r11)
                r4.setUrl(r8)
                com.mbridge.msdk.click.g r0 = com.mbridge.msdk.click.C6794g.this
                com.mbridge.msdk.click.e$a r0 = r0.f17946g
                java.lang.String r0 = r0.f17908g
                r4.setContent(r0)
                goto L_0x01ec
            L_0x01ba:
                r4.setjumpDone(r6)
                r4.setUrl(r8)
                if (r7 != 0) goto L_0x01ec
                com.mbridge.msdk.click.a.a r7 = com.mbridge.msdk.click.p217a.C6772a.m20600a()
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r2 = "error code:"
                r0.append(r2)
                com.mbridge.msdk.click.g r2 = com.mbridge.msdk.click.C6794g.this
                com.mbridge.msdk.click.e$a r2 = r2.f17946g
                int r2 = r2.f17907f
                r0.append(r2)
                java.lang.String r9 = r0.toString()
                java.lang.String r11 = r1.f17954i
                r10 = r19
                r12 = r17
                r13 = r18
                r14 = r20
                r7.mo37052a(r8, r9, r10, r11, r12, r13, r14)
            L_0x01ec:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.click.C6794g.C6796a.m20701a(java.lang.String, boolean, boolean, com.mbridge.msdk.foundation.entity.CampaignEx, int):com.mbridge.msdk.click.CommonJumpLoader$JumpLoaderResult");
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public boolean m20704a(String str) {
            CampaignEx campaignEx = this.f17955j;
            if (campaignEx != null) {
                campaignEx.getLinkType();
            }
            if (C8675y.C8676a.m24900a(str)) {
                C6794g.this.f17941b.setCode(1);
                C6794g.this.f17941b.setUrl(str);
                C6794g.this.f17941b.setjumpDone(true);
                return true;
            }
            C6794g.this.f17941b.setCode(2);
            C6794g.this.f17941b.setUrl(str);
            return false;
        }

        /* renamed from: b */
        private boolean m20705b(String str) {
            return !URLUtil.isNetworkUrl(str);
        }

        /* renamed from: a */
        public final void mo37110a() {
            if (C6794g.this.f17940a != null) {
                C6794g.this.f17940a.mo37047a((Object) null);
            }
            CommonJumpLoader.JumpLoaderResult unused = C6794g.this.f17941b = new CommonJumpLoader.JumpLoaderResult();
            C6794g.this.f17941b.setUrl(this.f17952g);
            CommonJumpLoader.JumpLoaderResult unused2 = C6794g.this.f17941b = m20701a(this.f17952g, this.f17956k, this.f17957l, this.f17955j, this.f17958m);
            if (!TextUtils.isEmpty(C6794g.this.f17941b.getExceptionMsg())) {
                C6794g.this.f17941b.setSuccess(true);
            }
            if (C6794g.this.f17942c && C6794g.this.f17941b.isSuccess()) {
                if (C6794g.this.f17946g != null) {
                    C6794g.this.f17941b.setStatusCode(C6794g.this.f17946g.f17907f);
                }
                if (C8675y.C8676a.m24900a(C6794g.this.f17941b.getUrl()) || 200 != C6794g.this.f17946g.f17907f || TextUtils.isEmpty(C6794g.this.f17941b.getContent()) || C6794g.this.f17941b.getContent().contains("EXCEPTION_CAMPAIGN_NOT_ACTIVE")) {
                    if (C6794g.this.f17946g != null) {
                        C6794g.this.f17941b.setType(1);
                        C6794g.this.f17941b.setExceptionMsg(C6794g.this.f17946g.f17909h);
                        C6794g.this.f17941b.setStatusCode(C6794g.this.f17946g.f17907f);
                        C6794g.this.f17941b.setHeader(C6794g.this.f17946g.mo37086a());
                        C6794g.this.f17941b.setContent(C6794g.this.f17946g.f17908g);
                    }
                    m20704a(C6794g.this.f17941b.getUrl());
                    return;
                }
                C6794g.this.f17941b.setType(2);
                if (!TextUtils.isEmpty(C6794g.this.f17941b.getContent())) {
                    new C6787f().mo37089a(this.f17953h, this.f17954i, this.f17951f, C6794g.this.f17941b.getUrl(), C6794g.this.f17941b.getContent(), this.f17959n);
                } else {
                    try {
                        new C6787f().mo37088a(this.f17953h, this.f17954i, this.f17951f, C6794g.this.f17941b.getUrl(), this.f17959n);
                    } catch (Exception unused3) {
                    }
                }
                this.f17950e.acquireUninterruptibly();
            }
        }
    }

    /* renamed from: a */
    public final void mo37107a(C8490a.C8491a aVar) {
        if (aVar == C8490a.C8491a.FINISH && this.f17942c) {
            this.f17947h.post(new Runnable() {
                public final void run() {
                    if (C6794g.this.f17940a == null) {
                        return;
                    }
                    if (C6794g.this.f17941b.isSuccess()) {
                        C6794g.this.f17940a.mo37049b(C6794g.this.f17941b);
                    } else {
                        C6794g.this.f17940a.mo37048a(C6794g.this.f17941b, C6794g.this.f17941b.getMsg());
                    }
                }
            });
        }
    }
}
