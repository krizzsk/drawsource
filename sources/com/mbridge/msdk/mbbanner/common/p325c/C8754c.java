package com.mbridge.msdk.mbbanner.common.p325c;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.iab.omid.library.mmadbridge.ScriptInjector;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.C6765a;
import com.mbridge.msdk.click.p217a.C6772a;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p085b.C2462a;
import com.mbridge.msdk.foundation.p085b.C2470b;
import com.mbridge.msdk.foundation.p298db.C8412f;
import com.mbridge.msdk.foundation.p298db.C8414g;
import com.mbridge.msdk.foundation.p298db.C8417j;
import com.mbridge.msdk.foundation.same.p302c.C8481b;
import com.mbridge.msdk.foundation.same.p302c.C8484c;
import com.mbridge.msdk.foundation.same.p304e.C8490a;
import com.mbridge.msdk.foundation.same.report.C8574b;
import com.mbridge.msdk.foundation.same.report.C8580c;
import com.mbridge.msdk.foundation.same.report.C8582d;
import com.mbridge.msdk.foundation.same.report.C8598e;
import com.mbridge.msdk.foundation.tools.C8666t;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.foundation.tools.C8677z;
import com.mbridge.msdk.mbbanner.common.bridge.C8745a;
import com.mbridge.msdk.mbbanner.common.p323a.C8729a;
import com.mbridge.msdk.mbbanner.common.p324b.C8733a;
import com.mbridge.msdk.mbbanner.common.p324b.C8735c;
import com.mbridge.msdk.mbbanner.common.p324b.C8739g;
import com.mbridge.msdk.mbbanner.common.p326d.C8767a;
import com.mbridge.msdk.mbbanner.common.util.BannerUtils;
import com.mbridge.msdk.mbbanner.view.MBBannerWebView;
import com.mbridge.msdk.mbsignalcommon.communication.C8868b;
import com.mbridge.msdk.mbsignalcommon.mraid.C8871a;
import com.mbridge.msdk.mbsignalcommon.mraid.C8874c;
import com.mbridge.msdk.mbsignalcommon.p339b.C8853b;
import com.mbridge.msdk.mbsignalcommon.windvane.C8884d;
import com.mbridge.msdk.mbsignalcommon.windvane.C8887g;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.p078c.C2445b;
import com.mbridge.msdk.p078c.C2456d;
import com.mbridge.msdk.videocommon.download.C9661h;
import com.mbridge.msdk.widget.FeedBackButton;
import java.io.File;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.mbbanner.common.c.c */
/* compiled from: BannerShowManager */
public final class C8754c {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static String f21507b = "BannerShowManager";
    /* access modifiers changed from: private */

    /* renamed from: A */
    public float f21508A;

    /* renamed from: B */
    private View.OnClickListener f21509B = new View.OnClickListener() {
        public final void onClick(View view) {
            if (C8754c.this.f21526p) {
                C8754c.m25251c(C8754c.this);
            }
        }
    };

    /* renamed from: C */
    private C8733a f21510C = new C8733a() {
        /* renamed from: a */
        public final void mo58365a(int i) {
            if (i == 2) {
                C8754c.m25254d(C8754c.this);
            } else {
                C8754c.this.m25258f();
            }
        }

        /* renamed from: a */
        public final void mo58367a(String str) {
            C8754c.m25251c(C8754c.this);
        }

        /* renamed from: a */
        public final void mo58364a() {
            C8754c.m25251c(C8754c.this);
        }

        /* renamed from: b */
        public final void mo58370b(int i) {
            if (i == 1) {
                C8754c.this.m25253d();
                C8754c.this.m25241a("", 1);
                return;
            }
            C8754c.this.m25249c();
        }

        /* renamed from: a */
        public final void mo58366a(CampaignEx campaignEx) {
            C8754c.this.mo58405a(campaignEx);
        }

        /* renamed from: a */
        public final void mo58368a(boolean z) {
            if (C8754c.this.f21513c != null) {
                boolean unused = C8754c.this.f21525o = z;
                if (z) {
                    C8754c.this.f21513c.mo58336c();
                } else {
                    C8754c.this.f21513c.mo58337d();
                }
            }
        }

        /* renamed from: a */
        public final void mo58369a(boolean z, String str) {
            try {
                if (C8754c.this.f21513c == null) {
                    return;
                }
                if (TextUtils.isEmpty(str)) {
                    C8754c.this.f21513c.mo58331a();
                    C8754c.this.f21513c.mo58335b();
                    return;
                }
                CampaignEx parseCampaignWithBackData = CampaignEx.parseCampaignWithBackData(CampaignEx.campaignToJsonObject(C8754c.this.f21515e));
                parseCampaignWithBackData.setClickURL(str);
                if (z) {
                    String j = C8754c.this.f21527q;
                    if (parseCampaignWithBackData != null) {
                        try {
                            if (!TextUtils.isEmpty(str)) {
                                new C8582d(C8388a.m23845e().mo56913g()).mo58071b(parseCampaignWithBackData.getRequestId(), parseCampaignWithBackData.getRequestIdNotice(), parseCampaignWithBackData.getId(), j, str, parseCampaignWithBackData.isBidCampaign());
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
                C8754c.this.mo58405a(parseCampaignWithBackData);
            } catch (Exception e2) {
                C8672v.m24878d(C8754c.f21507b, e2.getMessage());
            }
        }
    };

    /* renamed from: D */
    private C8853b f21511D = new C8853b() {
        /* renamed from: a */
        public final void mo58279a(WebView webView, String str) {
            boolean unused = C8754c.this.f21522l = true;
            C8672v.m24878d("BannerCallJS", "fireOnSignalCommunication");
            C8887g.m25669a().mo58686a(webView);
            boolean unused2 = C8754c.this.f21524n = true;
            if (C8754c.this.f21515e != null && !C8754c.this.f21515e.isHasMBTplMark()) {
                C8754c.this.m25253d();
                C8754c.this.m25241a("", 1);
            }
        }

        /* renamed from: a */
        public final void mo58277a(WebView webView, int i, String str, String str2) {
            C8754c.this.m25240a(str);
            C8754c.this.m25241a(str, 2);
        }
    };

    /* renamed from: a */
    C6765a f21512a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C8735c f21513c;

    /* renamed from: d */
    private boolean f21514d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public CampaignEx f21515e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public MBBannerView f21516f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public ImageView f21517g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public MBBannerWebView f21518h;

    /* renamed from: i */
    private ImageView f21519i;

    /* renamed from: j */
    private boolean f21520j;

    /* renamed from: k */
    private boolean f21521k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public boolean f21522l;

    /* renamed from: m */
    private boolean f21523m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f21524n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f21525o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f21526p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public String f21527q;

    /* renamed from: r */
    private String f21528r;

    /* renamed from: s */
    private List<CampaignEx> f21529s;

    /* renamed from: t */
    private int f21530t;

    /* renamed from: u */
    private long f21531u = 15000;

    /* renamed from: v */
    private C8745a f21532v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public AdSession f21533w;

    /* renamed from: x */
    private Handler f21534x = new Handler(Looper.getMainLooper()) {
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1) {
                try {
                    if (C8754c.this.f21533w != null) {
                        AdEvents.createAdEvents(C8754c.this.f21533w).impressionOccurred();
                        C8754c.this.f21533w.finish();
                        AdSession unused = C8754c.this.f21533w = null;
                    }
                } catch (Throwable th) {
                    C8672v.m24874a(C8754c.f21507b, th.getMessage());
                }
            }
        }
    };

    /* renamed from: y */
    private C8490a f21535y = new C8490a() {
        /* renamed from: b */
        public final void mo37111b() {
        }

        /* renamed from: a */
        public final void mo37110a() {
            C8754c.this.m25240a("banner render failed because render is timeout");
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: z */
    public float f21536z;

    public C8754c(MBBannerView mBBannerView, C8735c cVar, String str, String str2, boolean z, C2456d dVar) {
        this.f21514d = z;
        this.f21516f = mBBannerView;
        this.f21527q = str2;
        this.f21528r = str;
        this.f21513c = new C8739g(cVar, dVar);
    }

    /* renamed from: a */
    public final void mo58408a(boolean z, int i) {
        this.f21530t = i;
        if (i == 0) {
            C2456d e = C2445b.m6020a().mo16292e(C8388a.m23845e().mo56914h(), this.f21527q);
            if (e != null) {
                z = e.mo16311c() == 1;
            } else {
                return;
            }
        }
        this.f21514d = z;
    }

    /* renamed from: a */
    public final void mo58407a(boolean z) {
        this.f21514d = z;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m25249c() {
        if (this.f21516f != null) {
            MBBannerWebView mBBannerWebView = this.f21518h;
            if (!(mBBannerWebView == null || mBBannerWebView.getParent() == null)) {
                this.f21516f.removeView(this.f21518h);
            }
            if (this.f21517g == null) {
                ImageView imageView = new ImageView(C8388a.m23845e().mo56913g());
                this.f21517g = imageView;
                imageView.setOnTouchListener(new View.OnTouchListener() {
                    public final boolean onTouch(View view, MotionEvent motionEvent) {
                        float unused = C8754c.this.f21536z = motionEvent.getRawX();
                        float unused2 = C8754c.this.f21508A = motionEvent.getRawY();
                        String b = C8754c.f21507b;
                        C8672v.m24878d(b, C8754c.this.f21536z + "  " + C8754c.this.f21508A);
                        return false;
                    }
                });
                this.f21517g.setOnClickListener(new View.OnClickListener() {
                    public final void onClick(View view) {
                        C8754c.this.mo58405a(BannerUtils.managerCampaignEX(C8868b.m25601a(C8754c.this.f21536z, C8754c.this.f21508A), C8754c.this.f21515e));
                    }
                });
            }
            String imageUrl = this.f21515e.getImageUrl();
            if (!TextUtils.isEmpty(imageUrl)) {
                C8481b.m24310a(C8388a.m23845e().mo56913g()).mo57883a(imageUrl, (C8484c) new C8484c() {
                    public final void onSuccessLoad(Bitmap bitmap, String str) {
                        if (C8754c.this.f21517g != null) {
                            C8754c.this.f21517g.setImageBitmap(bitmap);
                        }
                        boolean unused = C8754c.this.f21522l = true;
                        C8754c.m25267n(C8754c.this);
                        C8754c.this.m25258f();
                        C8754c.this.m25253d();
                    }

                    public final void onFailedLoad(String str, String str2) {
                        C8754c.this.m25240a("banner show failed because banner default view is exception");
                    }
                });
            } else {
                m25240a("banner show failed because campain is exception");
            }
        } else {
            m25240a("banner show failed because banner view is exception");
        }
    }

    /* renamed from: b */
    private String m25245b(CampaignEx campaignEx) {
        String str;
        String str2 = "";
        if (campaignEx == null) {
            return str2;
        }
        String b = C9661h.m27556a().mo63674b(campaignEx.getBannerUrl());
        if (!TextUtils.isEmpty(b)) {
            return ScriptInjector.injectScriptContentIntoHtml(MBridgeConstans.OMID_JS_SERVICE_CONTENT, b);
        }
        String bannerHtml = campaignEx.getBannerHtml();
        if (campaignEx.isActiveOm()) {
            try {
                File file = new File(bannerHtml);
                if (file.exists()) {
                    str2 = C8666t.m24856a(file);
                }
                str = ScriptInjector.injectScriptContentIntoHtml(MBridgeConstans.OMID_JS_SERVICE_CONTENT, str2);
            } catch (Exception unused) {
                File file2 = new File(bannerHtml);
                if (file2.exists() && file2.isFile() && file2.canRead()) {
                    str = "file:////" + bannerHtml;
                }
            }
        } else {
            File file3 = new File(bannerHtml);
            if (file3.exists() && file3.isFile() && file3.canRead()) {
                str = "file:////" + bannerHtml;
            }
            return bannerHtml;
        }
        return str;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m25240a(String str) {
        if (this.f21515e != null && !m25257e()) {
            this.f21534x.removeCallbacks(this.f21535y);
            C8735c cVar = this.f21513c;
            if (cVar != null) {
                cVar.mo58333a(str);
            }
            C8598e.m24681b(C8388a.m23845e().mo56913g(), this.f21515e, this.f21527q, str);
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x039e  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01d8  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01f2  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m25253d() {
        /*
            r24 = this;
            r1 = r24
            java.lang.String r2 = "true"
            boolean r0 = r1.f21522l
            r3 = 1
            if (r0 == 0) goto L_0x0047
            boolean r0 = r1.f21523m
            if (r0 != 0) goto L_0x0047
            com.mbridge.msdk.mbbanner.common.b.c r0 = r1.f21513c
            if (r0 == 0) goto L_0x0047
            r1.f21523m = r3
            android.os.Handler r0 = r1.f21534x
            com.mbridge.msdk.foundation.same.e.a r4 = r1.f21535y
            r0.removeCallbacks(r4)
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f21515e
            if (r0 == 0) goto L_0x0047
            boolean r0 = r0.isCallbacked()
            if (r0 != 0) goto L_0x0047
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f21515e
            r0.setCallbacked(r3)
            com.mbridge.msdk.mbbanner.common.b.c r0 = r1.f21513c
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r4 = r1.f21529s
            r0.mo58334a((java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx>) r4)
            com.mbridge.msdk.foundation.controller.a r0 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()
            android.content.Context r0 = r0.mo56913g()
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = r1.f21515e
            int r4 = r4.getMaitve()
            com.mbridge.msdk.foundation.entity.CampaignEx r5 = r1.f21515e
            java.lang.String r5 = r5.getMaitve_src()
            com.mbridge.msdk.click.C6779b.m20644a((android.content.Context) r0, (int) r4, (java.lang.String) r5)
        L_0x0047:
            boolean r0 = r1.f21522l
            if (r0 == 0) goto L_0x03a4
            boolean r0 = r1.f21520j
            if (r0 == 0) goto L_0x03a4
            boolean r0 = r1.f21521k
            if (r0 == 0) goto L_0x03a4
            boolean r0 = r1.f21523m
            if (r0 == 0) goto L_0x03a4
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f21515e
            if (r0 == 0) goto L_0x03a4
            boolean r0 = r24.m25257e()
            if (r0 != 0) goto L_0x03a4
            com.mbridge.msdk.out.MBBannerView r0 = r1.f21516f
            r4 = 0
            if (r0 != 0) goto L_0x0067
            goto L_0x0073
        L_0x0067:
            boolean r0 = com.mbridge.msdk.foundation.tools.C8620ag.m24732a(r0)
            if (r0 != 0) goto L_0x0073
            boolean r0 = r1.f21525o
            if (r0 != 0) goto L_0x0073
            r5 = r3
            goto L_0x0074
        L_0x0073:
            r5 = r4
        L_0x0074:
            r6 = 1000(0x3e8, double:4.94E-321)
            if (r5 != 0) goto L_0x0084
            com.mbridge.msdk.out.MBBannerView r0 = r1.f21516f
            if (r0 == 0) goto L_0x0084
            com.mbridge.msdk.mbbanner.common.c.c$11 r8 = new com.mbridge.msdk.mbbanner.common.c.c$11
            r8.<init>()
            r0.postDelayed(r8, r6)
        L_0x0084:
            boolean r0 = r1.f21524n
            if (r0 == 0) goto L_0x01ee
            if (r5 == 0) goto L_0x01ee
            r8 = 2
            int[] r9 = new int[r8]
            com.mbridge.msdk.out.MBBannerView r0 = r1.f21516f
            r0.getLocationInWindow(r9)
            com.mbridge.msdk.mbbanner.view.MBBannerWebView r0 = r1.f21518h
            r10 = r9[r4]
            float r10 = (float) r10
            r11 = r9[r3]
            float r11 = (float) r11
            java.lang.String r12 = "BannerCallJS"
            java.lang.String r13 = "fireOnBannerWebViewShow"
            com.mbridge.msdk.foundation.tools.C8672v.m24878d(r12, r13)
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch:{ all -> 0x00da }
            r14.<init>()     // Catch:{ all -> 0x00da }
            java.lang.String r15 = "startX"
            double r6 = (double) r10     // Catch:{ all -> 0x00da }
            r14.put(r15, r6)     // Catch:{ all -> 0x00da }
            java.lang.String r6 = "startY"
            double r10 = (double) r11     // Catch:{ all -> 0x00da }
            r14.put(r6, r10)     // Catch:{ all -> 0x00da }
            java.lang.String r6 = "scale"
            com.mbridge.msdk.foundation.controller.a r7 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ all -> 0x00da }
            android.content.Context r7 = r7.mo56913g()     // Catch:{ all -> 0x00da }
            float r7 = com.mbridge.msdk.foundation.tools.C8677z.m24936d((android.content.Context) r7)     // Catch:{ all -> 0x00da }
            double r10 = (double) r7     // Catch:{ all -> 0x00da }
            r14.put(r6, r10)     // Catch:{ all -> 0x00da }
            java.lang.String r6 = r14.toString()     // Catch:{ all -> 0x00da }
            byte[] r6 = r6.getBytes()     // Catch:{ all -> 0x00da }
            java.lang.String r6 = android.util.Base64.encodeToString(r6, r8)     // Catch:{ all -> 0x00da }
            com.mbridge.msdk.mbsignalcommon.windvane.g r7 = com.mbridge.msdk.mbsignalcommon.windvane.C8887g.m25669a()     // Catch:{ all -> 0x00da }
            java.lang.String r10 = "webviewshow"
            r7.mo58687a((android.webkit.WebView) r0, (java.lang.String) r10, (java.lang.String) r6)     // Catch:{ all -> 0x00da }
            goto L_0x00de
        L_0x00da:
            r0 = move-exception
            com.mbridge.msdk.foundation.tools.C8672v.m24875a(r12, r13, r0)
        L_0x00de:
            com.mbridge.msdk.mbbanner.view.MBBannerWebView r0 = r1.f21518h
            r6 = r9[r4]
            r7 = r9[r3]
            com.mbridge.msdk.out.MBBannerView r9 = r1.f21516f
            int r9 = r9.getWidth()
            com.mbridge.msdk.out.MBBannerView r10 = r1.f21516f
            int r10 = r10.getHeight()
            com.mbridge.msdk.foundation.controller.a r11 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ all -> 0x01c1 }
            android.content.Context r11 = r11.mo56913g()     // Catch:{ all -> 0x01c1 }
            android.content.res.Resources r11 = r11.getResources()     // Catch:{ all -> 0x01c1 }
            android.content.res.Configuration r11 = r11.getConfiguration()     // Catch:{ all -> 0x01c1 }
            int r11 = r11.orientation     // Catch:{ all -> 0x01c1 }
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch:{ all -> 0x01c1 }
            r13.<init>()     // Catch:{ all -> 0x01c1 }
            java.lang.String r14 = "orientation"
            if (r11 != r8) goto L_0x010e
            java.lang.String r8 = "landscape"
            goto L_0x0115
        L_0x010e:
            if (r11 != r3) goto L_0x0113
            java.lang.String r8 = "portrait"
            goto L_0x0115
        L_0x0113:
            java.lang.String r8 = "undefined"
        L_0x0115:
            r13.put(r14, r8)     // Catch:{ all -> 0x01c1 }
            java.lang.String r8 = "locked"
            r13.put(r8, r2)     // Catch:{ all -> 0x01c1 }
            com.mbridge.msdk.foundation.controller.a r8 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ all -> 0x01c1 }
            android.content.Context r8 = r8.mo56913g()     // Catch:{ all -> 0x01c1 }
            int r8 = com.mbridge.msdk.foundation.tools.C8660r.m24829i(r8)     // Catch:{ all -> 0x01c1 }
            float r8 = (float) r8     // Catch:{ all -> 0x01c1 }
            com.mbridge.msdk.foundation.controller.a r11 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ all -> 0x01c1 }
            android.content.Context r11 = r11.mo56913g()     // Catch:{ all -> 0x01c1 }
            int r11 = com.mbridge.msdk.foundation.tools.C8660r.m24831j(r11)     // Catch:{ all -> 0x01c1 }
            float r11 = (float) r11     // Catch:{ all -> 0x01c1 }
            com.mbridge.msdk.foundation.controller.a r14 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ all -> 0x01c1 }
            android.content.Context r14 = r14.mo56913g()     // Catch:{ all -> 0x01c1 }
            java.util.HashMap r14 = com.mbridge.msdk.foundation.tools.C8660r.m24833k(r14)     // Catch:{ all -> 0x01c1 }
            java.lang.String r15 = "width"
            java.lang.Object r15 = r14.get(r15)     // Catch:{ all -> 0x01c1 }
            java.lang.Integer r15 = (java.lang.Integer) r15     // Catch:{ all -> 0x01c1 }
            int r15 = r15.intValue()     // Catch:{ all -> 0x01c1 }
            java.lang.String r3 = "height"
            java.lang.Object r3 = r14.get(r3)     // Catch:{ all -> 0x01c1 }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x01c1 }
            int r3 = r3.intValue()     // Catch:{ all -> 0x01c1 }
            java.util.HashMap r14 = new java.util.HashMap     // Catch:{ all -> 0x01c1 }
            r14.<init>()     // Catch:{ all -> 0x01c1 }
            java.lang.String r4 = "placementType"
            r23 = r5
            java.lang.String r5 = "inline"
            r14.put(r4, r5)     // Catch:{ all -> 0x01bf }
            java.lang.String r4 = "state"
            java.lang.String r5 = "default"
            r14.put(r4, r5)     // Catch:{ all -> 0x01bf }
            java.lang.String r4 = "viewable"
            r14.put(r4, r2)     // Catch:{ all -> 0x01bf }
            java.lang.String r2 = "currentAppOrientation"
            r14.put(r2, r13)     // Catch:{ all -> 0x01bf }
            com.mbridge.msdk.mbsignalcommon.mraid.a r16 = com.mbridge.msdk.mbsignalcommon.mraid.C8871a.m25621a()     // Catch:{ all -> 0x01bf }
            float r2 = (float) r6     // Catch:{ all -> 0x01bf }
            float r4 = (float) r7     // Catch:{ all -> 0x01bf }
            float r5 = (float) r9     // Catch:{ all -> 0x01bf }
            float r6 = (float) r10     // Catch:{ all -> 0x01bf }
            r17 = r0
            r18 = r2
            r19 = r4
            r20 = r5
            r21 = r6
            r16.mo58631a(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x01bf }
            com.mbridge.msdk.mbsignalcommon.mraid.a r16 = com.mbridge.msdk.mbsignalcommon.mraid.C8871a.m25621a()     // Catch:{ all -> 0x01bf }
            r17 = r0
            r18 = r2
            r19 = r4
            r20 = r5
            r21 = r6
            r16.mo58636b(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x01bf }
            com.mbridge.msdk.mbsignalcommon.mraid.a r2 = com.mbridge.msdk.mbsignalcommon.mraid.C8871a.m25621a()     // Catch:{ all -> 0x01bf }
            r2.mo58635b(r0, r8, r11)     // Catch:{ all -> 0x01bf }
            com.mbridge.msdk.mbsignalcommon.mraid.a r2 = com.mbridge.msdk.mbsignalcommon.mraid.C8871a.m25621a()     // Catch:{ all -> 0x01bf }
            float r4 = (float) r15     // Catch:{ all -> 0x01bf }
            float r3 = (float) r3     // Catch:{ all -> 0x01bf }
            r2.mo58638c(r0, r4, r3)     // Catch:{ all -> 0x01bf }
            com.mbridge.msdk.mbsignalcommon.mraid.a r2 = com.mbridge.msdk.mbsignalcommon.mraid.C8871a.m25621a()     // Catch:{ all -> 0x01bf }
            r2.mo58634a((android.webkit.WebView) r0, (java.util.Map<java.lang.String, java.lang.Object>) r14)     // Catch:{ all -> 0x01bf }
            com.mbridge.msdk.mbsignalcommon.mraid.a r2 = com.mbridge.msdk.mbsignalcommon.mraid.C8871a.m25621a()     // Catch:{ all -> 0x01bf }
            r2.mo58628a(r0)     // Catch:{ all -> 0x01bf }
            goto L_0x01c9
        L_0x01bf:
            r0 = move-exception
            goto L_0x01c4
        L_0x01c1:
            r0 = move-exception
            r23 = r5
        L_0x01c4:
            java.lang.String r2 = "transInfoForMraid"
            com.mbridge.msdk.foundation.tools.C8672v.m24875a(r12, r2, r0)
        L_0x01c9:
            r2 = 0
            r1.f21524n = r2
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f21515e
            java.lang.String r0 = r0.getImageUrl()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x01f0
            com.mbridge.msdk.foundation.controller.a r0 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()
            android.content.Context r0 = r0.mo56913g()
            com.mbridge.msdk.foundation.same.c.b r0 = com.mbridge.msdk.foundation.same.p302c.C8481b.m24310a((android.content.Context) r0)
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = r1.f21515e
            java.lang.String r2 = r2.getImageUrl()
            r0.mo57886c(r2)
            goto L_0x01f0
        L_0x01ee:
            r23 = r5
        L_0x01f0:
            if (r23 == 0) goto L_0x039e
            android.widget.ImageView r0 = r1.f21517g
            java.lang.String r2 = "banner"
            if (r0 == 0) goto L_0x023a
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x023a
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f21515e
            if (r0 == 0) goto L_0x02ce
            if (r0 == 0) goto L_0x022b
            com.mbridge.msdk.foundation.controller.a r3 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()
            android.content.Context r3 = r3.mo56913g()
            java.lang.String r4 = r1.f21527q
            r1.m25250c(r0, r3, r4)
            com.mbridge.msdk.foundation.controller.a r3 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()
            android.content.Context r3 = r3.mo56913g()
            java.lang.String r4 = r1.f21527q
            r1.m25246b(r0, r3, r4)
            com.mbridge.msdk.foundation.controller.a r3 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()
            android.content.Context r3 = r3.mo56913g()
            java.lang.String r4 = r1.f21527q
            r1.m25237a((com.mbridge.msdk.foundation.entity.CampaignEx) r0, (android.content.Context) r3, (java.lang.String) r4)
        L_0x022b:
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f21515e
            r3 = 1
            r0.setReport(r3)
            java.lang.String r0 = r1.f21527q
            com.mbridge.msdk.foundation.entity.CampaignEx r3 = r1.f21515e
            com.mbridge.msdk.foundation.same.p300a.C8473d.m24279a((java.lang.String) r0, (com.mbridge.msdk.foundation.entity.CampaignEx) r3, (java.lang.String) r2)
            goto L_0x02ce
        L_0x023a:
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r0 = r1.f21529s
            if (r0 == 0) goto L_0x02ce
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x02ce
            r0 = 0
            r4 = 0
            r22 = 0
        L_0x0248:
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r3 = r1.f21529s
            int r3 = r3.size()
            if (r4 >= r3) goto L_0x02a2
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r3 = r1.f21529s
            java.lang.Object r3 = r3.get(r4)
            com.mbridge.msdk.foundation.entity.CampaignEx r3 = (com.mbridge.msdk.foundation.entity.CampaignEx) r3
            boolean r3 = r3.isHasMBTplMark()
            if (r3 != 0) goto L_0x029f
            if (r4 == 0) goto L_0x026e
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r3 = r1.f21529s
            java.lang.Object r3 = r3.get(r4)
            com.mbridge.msdk.foundation.entity.CampaignEx r3 = (com.mbridge.msdk.foundation.entity.CampaignEx) r3
            boolean r3 = r3.isReport()
            if (r3 != 0) goto L_0x029f
        L_0x026e:
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r0 = r1.f21529s
            java.lang.Object r0 = r0.get(r4)
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = (com.mbridge.msdk.foundation.entity.CampaignEx) r0
            com.mbridge.msdk.foundation.controller.a r3 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()
            android.content.Context r3 = r3.mo56913g()
            java.lang.String r5 = r1.f21527q
            r1.m25250c(r0, r3, r5)
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r0 = r1.f21529s
            java.lang.Object r0 = r0.get(r4)
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = (com.mbridge.msdk.foundation.entity.CampaignEx) r0
            r3 = 1
            r0.setReport(r3)
            java.lang.String r0 = r1.f21527q
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r3 = r1.f21529s
            java.lang.Object r3 = r3.get(r4)
            com.mbridge.msdk.foundation.entity.CampaignEx r3 = (com.mbridge.msdk.foundation.entity.CampaignEx) r3
            com.mbridge.msdk.foundation.same.p300a.C8473d.m24279a((java.lang.String) r0, (com.mbridge.msdk.foundation.entity.CampaignEx) r3, (java.lang.String) r2)
            r0 = r4
            r22 = 1
        L_0x029f:
            int r4 = r4 + 1
            goto L_0x0248
        L_0x02a2:
            if (r22 == 0) goto L_0x02ce
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r2 = r1.f21529s
            java.lang.Object r2 = r2.get(r0)
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = (com.mbridge.msdk.foundation.entity.CampaignEx) r2
            com.mbridge.msdk.foundation.controller.a r3 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()
            android.content.Context r3 = r3.mo56913g()
            java.lang.String r4 = r1.f21527q
            r1.m25246b(r2, r3, r4)
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r2 = r1.f21529s
            java.lang.Object r0 = r2.get(r0)
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = (com.mbridge.msdk.foundation.entity.CampaignEx) r0
            com.mbridge.msdk.foundation.controller.a r2 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()
            android.content.Context r2 = r2.mo56913g()
            java.lang.String r3 = r1.f21527q
            r1.m25237a((com.mbridge.msdk.foundation.entity.CampaignEx) r0, (android.content.Context) r2, (java.lang.String) r3)
        L_0x02ce:
            r2 = 1
            r1.f21526p = r2
            com.mbridge.msdk.mbbanner.common.b.c r0 = r1.f21513c
            if (r0 == 0) goto L_0x02da
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = r1.f21515e
            r0.mo58332a((com.mbridge.msdk.foundation.entity.CampaignEx) r2)
        L_0x02da:
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f21515e     // Catch:{ Exception -> 0x035c }
            if (r0 == 0) goto L_0x0384
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f21515e     // Catch:{ Exception -> 0x035c }
            boolean r0 = r0.isActiveOm()     // Catch:{ Exception -> 0x035c }
            if (r0 == 0) goto L_0x0384
            com.mbridge.msdk.foundation.controller.a r0 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ Exception -> 0x035c }
            android.content.Context r0 = r0.mo56913g()     // Catch:{ Exception -> 0x035c }
            com.mbridge.msdk.mbbanner.view.MBBannerWebView r2 = r1.f21518h     // Catch:{ Exception -> 0x035c }
            com.mbridge.msdk.mbbanner.view.MBBannerWebView r3 = r1.f21518h     // Catch:{ Exception -> 0x035c }
            java.lang.String r3 = r3.getUrl()     // Catch:{ Exception -> 0x035c }
            com.mbridge.msdk.foundation.entity.CampaignEx r4 = r1.f21515e     // Catch:{ Exception -> 0x035c }
            com.iab.omid.library.mmadbridge.adsession.AdSession r0 = com.mbridge.msdk.p075a.C2427b.m5854a(r0, r2, r3, r4)     // Catch:{ Exception -> 0x035c }
            r1.f21533w = r0     // Catch:{ Exception -> 0x035c }
            if (r0 == 0) goto L_0x0331
            com.mbridge.msdk.mbbanner.view.MBBannerWebView r2 = r1.f21518h     // Catch:{ Exception -> 0x0326 }
            r0.registerAdView(r2)     // Catch:{ Exception -> 0x0326 }
            android.widget.ImageView r0 = r1.f21519i     // Catch:{ Exception -> 0x0326 }
            r2 = 0
            if (r0 == 0) goto L_0x0313
            com.iab.omid.library.mmadbridge.adsession.AdSession r0 = r1.f21533w     // Catch:{ Exception -> 0x0326 }
            android.widget.ImageView r3 = r1.f21519i     // Catch:{ Exception -> 0x0326 }
            com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose r4 = com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose.VIDEO_CONTROLS     // Catch:{ Exception -> 0x0326 }
            r0.addFriendlyObstruction(r3, r4, r2)     // Catch:{ Exception -> 0x0326 }
        L_0x0313:
            android.widget.ImageView r0 = r1.f21517g     // Catch:{ Exception -> 0x0326 }
            if (r0 == 0) goto L_0x0320
            com.iab.omid.library.mmadbridge.adsession.AdSession r0 = r1.f21533w     // Catch:{ Exception -> 0x0326 }
            android.widget.ImageView r3 = r1.f21517g     // Catch:{ Exception -> 0x0326 }
            com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose r4 = com.iab.omid.library.mmadbridge.adsession.FriendlyObstructionPurpose.OTHER     // Catch:{ Exception -> 0x0326 }
            r0.addFriendlyObstruction(r3, r4, r2)     // Catch:{ Exception -> 0x0326 }
        L_0x0320:
            com.iab.omid.library.mmadbridge.adsession.AdSession r0 = r1.f21533w     // Catch:{ Exception -> 0x0326 }
            r0.start()     // Catch:{ Exception -> 0x0326 }
            goto L_0x0384
        L_0x0326:
            r0 = move-exception
            java.lang.String r2 = "OMSDK"
            java.lang.String r0 = r0.getMessage()     // Catch:{ Exception -> 0x035c }
            com.mbridge.msdk.foundation.tools.C8672v.m24874a(r2, r0)     // Catch:{ Exception -> 0x035c }
            goto L_0x0384
        L_0x0331:
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f21515e     // Catch:{ Exception -> 0x035c }
            if (r0 == 0) goto L_0x0384
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f21515e     // Catch:{ Exception -> 0x035c }
            java.lang.String r3 = r0.getRequestId()     // Catch:{ Exception -> 0x035c }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f21515e     // Catch:{ Exception -> 0x035c }
            java.lang.String r5 = r0.getId()     // Catch:{ Exception -> 0x035c }
            java.lang.String r6 = r1.f21527q     // Catch:{ Exception -> 0x035c }
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f21515e     // Catch:{ Exception -> 0x035c }
            java.lang.String r4 = r0.getRequestIdNotice()     // Catch:{ Exception -> 0x035c }
            com.mbridge.msdk.foundation.same.report.d r2 = new com.mbridge.msdk.foundation.same.report.d     // Catch:{ Exception -> 0x035c }
            com.mbridge.msdk.foundation.controller.a r0 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()     // Catch:{ Exception -> 0x035c }
            android.content.Context r0 = r0.mo56913g()     // Catch:{ Exception -> 0x035c }
            r2.<init>(r0)     // Catch:{ Exception -> 0x035c }
            java.lang.String r7 = "fetch OM failed, context null"
            r2.mo58069a((java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7)     // Catch:{ Exception -> 0x035c }
            goto L_0x0384
        L_0x035c:
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f21515e
            if (r0 == 0) goto L_0x0384
            java.lang.String r3 = r0.getRequestId()
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f21515e
            java.lang.String r5 = r0.getId()
            java.lang.String r6 = r1.f21527q
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f21515e
            java.lang.String r4 = r0.getRequestIdNotice()
            com.mbridge.msdk.foundation.same.report.d r2 = new com.mbridge.msdk.foundation.same.report.d
            com.mbridge.msdk.foundation.controller.a r0 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()
            android.content.Context r0 = r0.mo56913g()
            r2.<init>(r0)
            java.lang.String r7 = "fetch OM failed, context null"
            r2.mo58069a((java.lang.String) r3, (java.lang.String) r4, (java.lang.String) r5, (java.lang.String) r6, (java.lang.String) r7)
        L_0x0384:
            android.os.Handler r0 = r1.f21534x
            r2 = 1000(0x3e8, double:4.94E-321)
            r4 = 1
            r0.sendEmptyMessageDelayed(r4, r2)
            com.mbridge.msdk.foundation.controller.a r0 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()
            android.content.Context r0 = r0.mo56913g()
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = r1.f21515e
            java.lang.String r3 = r1.f21527q
            java.lang.String r4 = ""
            com.mbridge.msdk.foundation.same.report.C8598e.m24667a((android.content.Context) r0, (com.mbridge.msdk.foundation.entity.CampaignEx) r2, (java.lang.String) r3, (java.lang.String) r4)
            goto L_0x03a4
        L_0x039e:
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r1.f21515e
            r2 = 0
            r0.setReport(r2)
        L_0x03a4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbbanner.common.p325c.C8754c.m25253d():void");
    }

    /* renamed from: e */
    private synchronized boolean m25257e() {
        boolean isReport;
        isReport = this.f21515e.isReport();
        if (!isReport) {
            this.f21515e.setReport(true);
        }
        return isReport;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void m25258f() {
        ImageView imageView;
        if (this.f21514d && (imageView = this.f21519i) != null) {
            if (imageView.getVisibility() != 0) {
                this.f21519i.setVisibility(0);
                this.f21519i.setOnClickListener(this.f21509B);
            }
            if (this.f21519i.getParent() == null && this.f21516f != null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(C8677z.m24924b(C8388a.m23845e().mo56913g(), 12.0f), C8677z.m24924b(C8388a.m23845e().mo56913g(), 12.0f));
                layoutParams.addRule(11);
                layoutParams.addRule(10);
                this.f21516f.addView(this.f21519i, layoutParams);
            }
        }
    }

    /* renamed from: a */
    public final void mo58403a() {
        AdSession adSession = this.f21533w;
        if (adSession != null) {
            adSession.finish();
            this.f21533w = null;
        }
        if (this.f21513c != null) {
            this.f21513c = null;
        }
        MBBannerWebView mBBannerWebView = this.f21518h;
        if (mBBannerWebView != null) {
            mBBannerWebView.setWebViewListener((C8884d) null);
        }
        if (this.f21511D != null) {
            this.f21511D = null;
        }
        ImageView imageView = this.f21519i;
        if (imageView != null) {
            imageView.setOnClickListener((View.OnClickListener) null);
        }
        ImageView imageView2 = this.f21517g;
        if (imageView2 != null) {
            imageView2.setOnClickListener((View.OnClickListener) null);
        }
        MBBannerView mBBannerView = this.f21516f;
        if (mBBannerView != null) {
            mBBannerView.removeAllViews();
        }
        MBBannerWebView mBBannerWebView2 = this.f21518h;
        if (mBBannerWebView2 != null) {
            mBBannerWebView2.release();
        }
        C8745a aVar = this.f21532v;
        if (aVar != null) {
            aVar.mo58379a();
        }
        if (this.f21510C != null) {
            this.f21510C = null;
        }
        C2470b.m6168a().mo16429c(this.f21527q);
    }

    /* renamed from: b */
    public final void mo58409b(boolean z) {
        this.f21520j = z;
        m25253d();
        if (!z) {
            CampaignEx campaignEx = this.f21515e;
            String str = this.f21527q;
            if (campaignEx != null) {
                String a = C8874c.m25636a(campaignEx.getId());
                if (!TextUtils.isEmpty(a)) {
                    new C8582d(C8388a.m23845e().mo56913g()).mo58070a(campaignEx.getRequestId(), campaignEx.getRequestIdNotice(), campaignEx.getId(), str, a, campaignEx.isBidCampaign());
                    C8874c.m25637b(campaignEx.getId());
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo58410c(boolean z) {
        this.f21521k = z;
        m25253d();
    }

    /* renamed from: a */
    private void m25237a(CampaignEx campaignEx, Context context, String str) {
        if (campaignEx != null) {
            try {
                List<String> pv_urls = campaignEx.getPv_urls();
                if (pv_urls != null && pv_urls.size() > 0) {
                    for (String a : pv_urls) {
                        C6765a.m20557a(context, campaignEx, str, a, false, true);
                    }
                }
            } catch (Throwable th) {
                C8672v.m24878d(f21507b, th.getMessage());
            }
        }
    }

    /* renamed from: b */
    private void m25246b(CampaignEx campaignEx, Context context, String str) {
        if (campaignEx != null) {
            try {
                if (!TextUtils.isEmpty(campaignEx.getOnlyImpressionURL())) {
                    C6765a.m20558a(context, campaignEx, str, campaignEx.getOnlyImpressionURL(), false, true, C6772a.f17857h);
                }
            } catch (Throwable th) {
                C8672v.m24878d(f21507b, th.getMessage());
            }
        }
    }

    /* renamed from: c */
    private void m25250c(final CampaignEx campaignEx, final Context context, String str) {
        if (!TextUtils.isEmpty(campaignEx.getImpressionURL())) {
            new Thread(new Runnable() {
                public final void run() {
                    try {
                        C8417j.m23986a((C8412f) C8414g.m23969a(context)).mo57032b(campaignEx.getId());
                    } catch (Exception e) {
                        C8672v.m24878d(C8754c.f21507b, e.getMessage());
                    }
                }
            }).start();
            C6765a.m20558a(context, campaignEx, str, campaignEx.getImpressionURL(), false, true, C6772a.f17856g);
        }
        if (!TextUtils.isEmpty(str) && campaignEx.getNativeVideoTracking() != null && campaignEx.getNativeVideoTracking().mo57769i() != null) {
            C6765a.m20559a(context, campaignEx, str, campaignEx.getNativeVideoTracking().mo57769i(), false, false);
        }
    }

    /* renamed from: a */
    public final void mo58405a(CampaignEx campaignEx) {
        if (this.f21526p) {
            if (this.f21512a == null) {
                this.f21512a = new C6765a(C8388a.m23845e().mo56913g(), this.f21527q);
            }
            this.f21512a.mo37044a((NativeListener.NativeTrackingListener) new NativeListener.TrackingExListener() {
                public final void onDismissLoading(Campaign campaign) {
                }

                public final void onDownloadFinish(Campaign campaign) {
                }

                public final void onDownloadProgress(int i) {
                }

                public final void onDownloadStart(Campaign campaign) {
                }

                public final void onFinishRedirection(Campaign campaign, String str) {
                }

                public final boolean onInterceptDefaultLoadingDialog() {
                    return false;
                }

                public final void onRedirectionFailed(Campaign campaign, String str) {
                }

                public final void onShowLoading(Campaign campaign) {
                }

                public final void onStartRedirection(Campaign campaign, String str) {
                }

                public final void onLeaveApp() {
                    if (C8754c.this.f21513c != null) {
                        C8754c.this.f21513c.mo58335b();
                    }
                }
            });
            campaignEx.setCampaignUnitId(this.f21527q);
            this.f21512a.mo37041a(campaignEx);
            if (!this.f21515e.isReportClick()) {
                this.f21515e.setReportClick(true);
                Context g = C8388a.m23845e().mo56913g();
                if (!(campaignEx == null || campaignEx.getNativeVideoTracking() == null || campaignEx.getNativeVideoTracking().mo57761e() == null)) {
                    C6765a.m20559a(g, campaignEx, campaignEx.getCampaignUnitId(), campaignEx.getNativeVideoTracking().mo57761e(), false, false);
                }
            }
            C8735c cVar = this.f21513c;
            if (cVar != null) {
                cVar.mo58331a();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m25241a(String str, int i) {
        if (this.f21515e != null) {
            C8767a.m25292a(C8729a.m25134a().mo58348c(this.f21515e.getId()).mo58346b(this.f21527q).mo58350e(this.f21515e.getRequestId()).mo58349d(this.f21515e.getRequestIdNotice()).mo58352g(str).mo58343a(i).mo58345a(this.f21515e.isBidCampaign()), this.f21527q);
        }
    }

    /* renamed from: a */
    public final void mo58404a(int i, int i2, int i3, int i4) {
        if (i != i3 || i2 != i4) {
            MBBannerWebView mBBannerWebView = this.f21518h;
            C8672v.m24878d("BannerCallJS", "fireOnBannerViewSizeChange");
            try {
                C8871a.m25621a().mo58630a((WebView) mBBannerWebView, (float) i, (float) i2);
            } catch (Throwable th) {
                C8672v.m24875a("BannerCallJS", "fireOnBannerViewSizeChange", th);
            }
        }
    }

    /* renamed from: d */
    private void m25255d(boolean z) {
        if (this.f21516f != null) {
            FeedBackButton b = C2470b.m6168a().mo16426b(this.f21527q);
            if (C2470b.m6168a().mo16428b() && z && b != null) {
                ViewGroup viewGroup = (ViewGroup) b.getParent();
                if (viewGroup != null) {
                    viewGroup.removeView(b);
                }
                b.setVisibility(0);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) b.getLayoutParams();
                if (layoutParams == null) {
                    layoutParams = new RelativeLayout.LayoutParams(C2470b.f5203a, C2470b.f5204b);
                }
                layoutParams.addRule(12);
                b.setLayoutParams(layoutParams);
                this.f21516f.addView(b);
            }
            C2470b.m6168a().mo16422a(this.f21527q, (C2462a) new C2462a() {
                /* renamed from: a */
                public final void mo16392a() {
                    String str;
                    C8754c.this.f21516f.onPause();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (C8388a.m23845e().mo56913g() != null) {
                            jSONObject.put("status", 1);
                        }
                        str = jSONObject.toString();
                    } catch (Throwable th) {
                        C8672v.m24875a(C8754c.f21507b, th.getMessage(), th);
                        str = "";
                    }
                    C8887g.m25669a().mo58687a((WebView) C8754c.this.f21518h, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
                }

                /* renamed from: b */
                public final void mo16394b() {
                    String str;
                    C8754c.this.f21516f.onResume();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (C8388a.m23845e().mo56913g() != null) {
                            jSONObject.put("status", 2);
                        }
                        str = jSONObject.toString();
                    } catch (Throwable th) {
                        C8672v.m24875a(C8754c.f21507b, th.getMessage(), th);
                        str = "";
                    }
                    C8887g.m25669a().mo58687a((WebView) C8754c.this.f21518h, "onFeedbackAlertStatusNotify", Base64.encodeToString(str.getBytes(), 2));
                }

                /* renamed from: a */
                public final void mo16393a(String str) {
                    String str2;
                    C8754c.this.f21516f.onResume();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (C8388a.m23845e().mo56913g() != null) {
                            jSONObject.put("status", 2);
                        }
                        str2 = jSONObject.toString();
                    } catch (Throwable th) {
                        C8672v.m24875a(C8754c.f21507b, th.getMessage(), th);
                        str2 = "";
                    }
                    C8887g.m25669a().mo58687a((WebView) C8754c.this.f21518h, "onFeedbackAlertStatusNotify", Base64.encodeToString(str2.getBytes(), 2));
                }
            });
            this.f21515e.setCampaignUnitId(this.f21527q);
            C2470b.m6168a().mo16423a(this.f21527q, this.f21515e);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0025  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo58406a(com.mbridge.msdk.foundation.entity.CampaignUnit r11) {
        /*
            r10 = this;
            r0 = 0
            if (r11 == 0) goto L_0x001a
            java.util.ArrayList r11 = r11.getAds()
            r10.f21529s = r11
            if (r11 == 0) goto L_0x001a
            int r11 = r11.size()
            if (r11 <= 0) goto L_0x001a
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r11 = r10.f21529s
            java.lang.Object r11 = r11.get(r0)
            com.mbridge.msdk.foundation.entity.CampaignEx r11 = (com.mbridge.msdk.foundation.entity.CampaignEx) r11
            goto L_0x001b
        L_0x001a:
            r11 = 0
        L_0x001b:
            r10.f21515e = r11
            if (r11 != 0) goto L_0x0025
            java.lang.String r11 = "banner show failed because campain is exception"
            r10.m25240a((java.lang.String) r11)
            return
        L_0x0025:
            android.os.Handler r11 = r10.f21534x
            com.mbridge.msdk.foundation.same.e.a r1 = r10.f21535y
            r11.removeCallbacks(r1)
            boolean r11 = r10.f21514d
            r1 = 8
            if (r11 == 0) goto L_0x0064
            android.widget.ImageView r11 = r10.f21519i
            if (r11 != 0) goto L_0x0064
            android.widget.ImageView r11 = new android.widget.ImageView
            com.mbridge.msdk.foundation.controller.a r2 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()
            android.content.Context r2 = r2.mo56913g()
            r11.<init>(r2)
            r10.f21519i = r11
            com.mbridge.msdk.foundation.controller.a r2 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()
            android.content.Context r2 = r2.mo56913g()
            java.lang.String r3 = "mbridge_banner_close"
            java.lang.String r4 = "drawable"
            int r2 = com.mbridge.msdk.foundation.tools.C8658p.m24799a(r2, r3, r4)
            r11.setBackgroundResource(r2)
            android.widget.ImageView r11 = r10.f21519i
            r11.setVisibility(r1)
            android.widget.ImageView r11 = r10.f21519i
            java.lang.String r2 = "closeButton"
            r11.setContentDescription(r2)
        L_0x0064:
            r10.f21522l = r0
            r10.f21523m = r0
            r10.f21526p = r0
            com.mbridge.msdk.foundation.entity.CampaignEx r11 = r10.f21515e
            java.lang.String r11 = r11.getBannerHtml()
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 == 0) goto L_0x0082
            com.mbridge.msdk.foundation.entity.CampaignEx r11 = r10.f21515e
            java.lang.String r11 = r11.getBannerUrl()
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 != 0) goto L_0x00e2
        L_0x0082:
            com.mbridge.msdk.mbbanner.common.a.a r11 = com.mbridge.msdk.mbbanner.common.p323a.C8729a.m25134a()
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = r10.f21515e
            java.lang.String r2 = r2.getId()
            com.mbridge.msdk.mbbanner.common.a.a r11 = r11.mo58348c(r2)
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = r10.f21515e
            java.lang.String r2 = r2.getRequestId()
            com.mbridge.msdk.mbbanner.common.a.a r11 = r11.mo58350e(r2)
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = r10.f21515e
            java.lang.String r2 = r2.getRequestIdNotice()
            com.mbridge.msdk.mbbanner.common.a.a r11 = r11.mo58349d(r2)
            java.lang.String r2 = r10.f21527q
            com.mbridge.msdk.mbbanner.common.a.a r11 = r11.mo58346b(r2)
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = r10.f21515e
            boolean r2 = r2.isBidCampaign()
            com.mbridge.msdk.mbbanner.common.a.a r11 = r11.mo58345a((boolean) r2)
            java.lang.String r2 = r10.f21527q
            if (r11 == 0) goto L_0x00e2
            java.lang.String r3 = "2000067"
            r11.mo58344a((java.lang.String) r3)
            com.mbridge.msdk.foundation.same.report.b r3 = com.mbridge.msdk.foundation.same.report.C8574b.m24577a()
            boolean r3 = r3.mo58054c()
            if (r3 == 0) goto L_0x00d3
            com.mbridge.msdk.foundation.same.report.b r2 = com.mbridge.msdk.foundation.same.report.C8574b.m24577a()
            java.lang.String r11 = r11.mo58347b()
            r2.mo58052a((java.lang.String) r11)
            goto L_0x00e2
        L_0x00d3:
            java.lang.String r11 = r11.mo58347b()
            com.mbridge.msdk.foundation.controller.a r3 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()
            android.content.Context r3 = r3.mo56913g()
            com.mbridge.msdk.foundation.same.report.C8580c.m24608a((java.lang.String) r11, (android.content.Context) r3, (java.lang.String) r2)
        L_0x00e2:
            android.os.Handler r11 = r10.f21534x
            com.mbridge.msdk.foundation.same.e.a r2 = r10.f21535y
            long r3 = r10.f21531u
            r11.postDelayed(r2, r3)
            com.mbridge.msdk.foundation.entity.CampaignEx r11 = r10.f21515e
            java.lang.String r11 = r10.m25245b((com.mbridge.msdk.foundation.entity.CampaignEx) r11)
            boolean r2 = android.text.TextUtils.isEmpty(r11)
            r3 = 2
            if (r2 != 0) goto L_0x01d2
            com.mbridge.msdk.out.MBBannerView r2 = r10.f21516f
            if (r2 == 0) goto L_0x01c7
            com.mbridge.msdk.mbbanner.view.MBBannerWebView r2 = r10.f21518h
            if (r2 != 0) goto L_0x0128
            com.mbridge.msdk.mbbanner.view.MBBannerWebView r2 = new com.mbridge.msdk.mbbanner.view.MBBannerWebView
            com.mbridge.msdk.foundation.controller.a r4 = com.mbridge.msdk.foundation.controller.C8388a.m23845e()
            android.content.Context r4 = r4.mo56913g()
            r2.<init>(r4)
            r10.f21518h = r2
            android.widget.RelativeLayout$LayoutParams r4 = new android.widget.RelativeLayout$LayoutParams
            r5 = -1
            r4.<init>(r5, r5)
            r2.setLayoutParams(r4)
            com.mbridge.msdk.mbbanner.view.MBBannerWebView r2 = r10.f21518h
            com.mbridge.msdk.mbbanner.view.a r4 = new com.mbridge.msdk.mbbanner.view.a
            java.lang.String r5 = r10.f21527q
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r6 = r10.f21529s
            com.mbridge.msdk.mbbanner.common.b.a r7 = r10.f21510C
            r4.<init>(r5, r6, r7)
            r2.setWebViewClient(r4)
        L_0x0128:
            android.widget.ImageView r2 = r10.f21517g
            if (r2 == 0) goto L_0x012f
            r2.setVisibility(r1)
        L_0x012f:
            com.mbridge.msdk.mbbanner.view.MBBannerWebView r1 = r10.f21518h
            int r1 = r1.getVisibility()
            if (r1 == 0) goto L_0x013c
            com.mbridge.msdk.mbbanner.view.MBBannerWebView r1 = r10.f21518h
            r1.setVisibility(r0)
        L_0x013c:
            com.mbridge.msdk.mbbanner.view.MBBannerWebView r0 = r10.f21518h
            android.view.ViewParent r0 = r0.getParent()
            if (r0 != 0) goto L_0x014b
            com.mbridge.msdk.out.MBBannerView r0 = r10.f21516f
            com.mbridge.msdk.mbbanner.view.MBBannerWebView r1 = r10.f21518h
            r0.addView(r1)
        L_0x014b:
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r10.f21515e
            boolean r0 = r0.isMraid()
            r10.m25255d((boolean) r0)
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r10.f21515e
            java.lang.String r1 = r10.f21527q
            r0.setCampaignUnitId(r1)
            com.mbridge.msdk.foundation.b.b r0 = com.mbridge.msdk.foundation.p085b.C2470b.m6168a()
            java.lang.String r1 = r10.f21527q
            com.mbridge.msdk.foundation.entity.CampaignEx r2 = r10.f21515e
            r0.mo16423a((java.lang.String) r1, (com.mbridge.msdk.foundation.entity.CampaignEx) r2)
            r10.m25258f()
            com.mbridge.msdk.mbbanner.common.bridge.a r0 = new com.mbridge.msdk.mbbanner.common.bridge.a
            com.mbridge.msdk.out.MBBannerView r1 = r10.f21516f
            android.content.Context r1 = r1.getContext()
            java.lang.String r2 = r10.f21528r
            java.lang.String r4 = r10.f21527q
            r0.<init>(r1, r2, r4)
            r10.f21532v = r0
            java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx> r1 = r10.f21529s
            r0.mo58383a((java.util.List<com.mbridge.msdk.foundation.entity.CampaignEx>) r1)
            com.mbridge.msdk.mbbanner.common.bridge.a r0 = r10.f21532v
            com.mbridge.msdk.mbbanner.common.b.a r1 = r10.f21510C
            r0.mo58381a((com.mbridge.msdk.mbbanner.common.p324b.C8733a) r1)
            com.mbridge.msdk.mbbanner.common.bridge.a r0 = r10.f21532v
            int r1 = r10.f21530t
            r0.mo58380a((int) r1)
            com.mbridge.msdk.mbbanner.view.MBBannerWebView r0 = r10.f21518h
            com.mbridge.msdk.mbsignalcommon.b.b r1 = r10.f21511D
            r0.setWebViewListener(r1)
            com.mbridge.msdk.mbbanner.view.MBBannerWebView r0 = r10.f21518h
            com.mbridge.msdk.mbbanner.common.bridge.a r1 = r10.f21532v
            r0.setObject(r1)
            java.lang.String r0 = "file"
            boolean r0 = r11.startsWith(r0)
            if (r0 != 0) goto L_0x01c1
            com.mbridge.msdk.foundation.entity.CampaignEx r0 = r10.f21515e
            boolean r0 = r0.isActiveOm()
            if (r0 == 0) goto L_0x01af
            java.lang.String r11 = com.mbridge.msdk.p075a.C2427b.m5857a((java.lang.String) r11)
        L_0x01af:
            r6 = r11
            com.mbridge.msdk.mbbanner.view.MBBannerWebView r4 = r10.f21518h
            com.mbridge.msdk.foundation.entity.CampaignEx r11 = r10.f21515e
            java.lang.String r5 = r11.getBannerUrl()
            r9 = 0
            java.lang.String r7 = "text/html"
            java.lang.String r8 = "utf-8"
            r4.loadDataWithBaseURL(r5, r6, r7, r8, r9)
            goto L_0x01d1
        L_0x01c1:
            com.mbridge.msdk.mbbanner.view.MBBannerWebView r0 = r10.f21518h
            r0.loadUrl(r11)
            goto L_0x01d1
        L_0x01c7:
            java.lang.String r11 = "banner render failed because banner view is null"
            r10.m25241a((java.lang.String) r11, (int) r3)
            java.lang.String r11 = "banner show failed because banner view is exception"
            r10.m25240a((java.lang.String) r11)
        L_0x01d1:
            r0 = 1
        L_0x01d2:
            if (r0 != 0) goto L_0x01f4
            com.mbridge.msdk.foundation.entity.CampaignEx r11 = r10.f21515e
            java.lang.String r11 = r11.getBannerHtml()
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 == 0) goto L_0x01ec
            com.mbridge.msdk.foundation.entity.CampaignEx r11 = r10.f21515e
            java.lang.String r11 = r11.getBannerUrl()
            boolean r11 = android.text.TextUtils.isEmpty(r11)
            if (r11 != 0) goto L_0x01f1
        L_0x01ec:
            java.lang.String r11 = "banner render failed because res load failed"
            r10.m25241a((java.lang.String) r11, (int) r3)
        L_0x01f1:
            r10.m25249c()
        L_0x01f4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.mbbanner.common.p325c.C8754c.mo58406a(com.mbridge.msdk.foundation.entity.CampaignUnit):void");
    }

    /* renamed from: c */
    static /* synthetic */ void m25251c(C8754c cVar) {
        MBBannerWebView mBBannerWebView = cVar.f21518h;
        if (!(mBBannerWebView == null || mBBannerWebView.getParent() == null)) {
            cVar.f21516f.removeView(cVar.f21518h);
        }
        ImageView imageView = cVar.f21517g;
        if (!(imageView == null || imageView.getParent() == null)) {
            cVar.f21517g.setVisibility(8);
            cVar.f21516f.removeView(cVar.f21517g);
        }
        ImageView imageView2 = cVar.f21519i;
        if (!(imageView2 == null || imageView2.getParent() == null)) {
            cVar.f21516f.removeView(cVar.f21519i);
            cVar.f21519i.setVisibility(8);
        }
        C8729a c = C8729a.m25134a().mo58346b(cVar.f21527q).mo58350e(cVar.f21515e.getRequestId()).mo58349d(cVar.f21515e.getRequestIdNotice()).mo58348c(cVar.f21515e.getId());
        C8729a a = c.mo58351f(cVar.f21515e.getCreativeId() + "").mo58345a(cVar.f21515e.isBidCampaign());
        String str = cVar.f21527q;
        if (a != null) {
            a.mo58344a("2000069");
            if (C8574b.m24577a().mo58054c()) {
                C8574b.m24577a().mo58052a(a.mo58347b());
            } else {
                C8580c.m24608a(a.mo58347b(), C8388a.m23845e().mo56913g(), str);
            }
        }
        BannerUtils.inserCloseId(cVar.f21527q, cVar.f21529s);
        C8735c cVar2 = cVar.f21513c;
        if (cVar2 != null) {
            cVar2.mo58338e();
        }
    }

    /* renamed from: d */
    static /* synthetic */ void m25254d(C8754c cVar) {
        ImageView imageView;
        if (cVar.f21514d && (imageView = cVar.f21519i) != null && imageView.getVisibility() == 0) {
            cVar.f21519i.setVisibility(8);
            cVar.f21519i.setOnClickListener((View.OnClickListener) null);
            if (cVar.f21516f != null && cVar.f21519i.getParent() != null) {
                cVar.f21516f.removeView(cVar.f21519i);
            }
        }
    }

    /* renamed from: n */
    static /* synthetic */ void m25267n(C8754c cVar) {
        if (cVar.f21517g != null) {
            MBBannerWebView mBBannerWebView = cVar.f21518h;
            if (mBBannerWebView != null) {
                mBBannerWebView.setVisibility(8);
            }
            if (cVar.f21517g.getVisibility() != 0) {
                cVar.f21517g.setVisibility(0);
            }
            if (cVar.f21516f != null) {
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
                layoutParams.addRule(10);
                cVar.f21517g.setScaleType(ImageView.ScaleType.FIT_XY);
                if (cVar.f21517g.getParent() == null) {
                    cVar.f21516f.addView(cVar.f21517g, layoutParams);
                }
                cVar.m25255d(true);
            }
        }
    }
}
