package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.bykv.p054vk.openvk.component.video.api.p072d.C2402a;
import com.bykv.p054vk.openvk.component.video.api.p072d.C2403b;
import com.bykv.p054vk.openvk.component.video.api.p072d.C2405c;
import com.bytedance.sdk.component.adexpress.p094c.C2571a;
import com.bytedance.sdk.component.p108d.C2828j;
import com.bytedance.sdk.component.p108d.C2832n;
import com.bytedance.sdk.component.p108d.C2838t;
import com.bytedance.sdk.component.utils.C2909o;
import com.bytedance.sdk.component.utils.C2914t;
import com.bytedance.sdk.component.utils.C2917v;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.C3516n;
import com.bytedance.sdk.openadsdk.core.C3666w;
import com.bytedance.sdk.openadsdk.core.C3706z;
import com.bytedance.sdk.openadsdk.core.p144b.C3359a;
import com.bytedance.sdk.openadsdk.core.p149e.C3402a;
import com.bytedance.sdk.openadsdk.core.p149e.C3403b;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.core.p149e.C3433o;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.C3632b;
import com.bytedance.sdk.openadsdk.core.video.nativevideo.NativeVideoTsView;
import com.bytedance.sdk.openadsdk.core.widget.RoundImageView;
import com.bytedance.sdk.openadsdk.multipro.p182b.C3949a;
import com.bytedance.sdk.openadsdk.multipro.p184d.C3961a;
import com.bytedance.sdk.openadsdk.p128b.C3060a;
import com.bytedance.sdk.openadsdk.p128b.C3090e;
import com.bytedance.sdk.openadsdk.p128b.C3100j;
import com.bytedance.sdk.openadsdk.p128b.C3104n;
import com.bytedance.sdk.openadsdk.p165d.C3707a;
import com.bytedance.sdk.openadsdk.p166e.C3730d;
import com.bytedance.sdk.openadsdk.p174i.C3792d;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import com.bytedance.sdk.openadsdk.p178l.C3904y;
import com.com.bytedance.overseas.sdk.p185a.C3968c;
import com.com.bytedance.overseas.sdk.p185a.C3969d;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

public class TTVideoLandingPageActivity extends Activity implements C3730d {

    /* renamed from: A */
    protected ViewStub f6996A;

    /* renamed from: B */
    protected Button f6997B;

    /* renamed from: C */
    protected ProgressBar f6998C;

    /* renamed from: D */
    protected C3968c f6999D;

    /* renamed from: E */
    protected boolean f7000E = false;

    /* renamed from: F */
    protected String f7001F;

    /* renamed from: G */
    protected boolean f7002G = false;

    /* renamed from: H */
    protected boolean f7003H = true;

    /* renamed from: I */
    protected boolean f7004I = false;

    /* renamed from: J */
    protected String f7005J = null;

    /* renamed from: K */
    protected int f7006K;

    /* renamed from: L */
    protected C3949a f7007L;

    /* renamed from: M */
    protected C3104n f7008M;

    /* renamed from: N */
    protected AtomicBoolean f7009N = new AtomicBoolean(true);

    /* renamed from: O */
    protected JSONArray f7010O = null;

    /* renamed from: P */
    protected String f7011P;

    /* renamed from: Q */
    protected C3359a f7012Q = null;

    /* renamed from: R */
    private final C2405c.C2407b f7013R = new C2405c.C2407b() {
        /* renamed from: a */
        public void mo16059a(boolean z) {
            TTVideoLandingPageActivity.this.f7000E = z;
            if (TTVideoLandingPageActivity.this.isFinishing()) {
                return;
            }
            if (z) {
                C3904y.m12853a((View) TTVideoLandingPageActivity.this.f7016a, 8);
                C3904y.m12853a((View) TTVideoLandingPageActivity.this.f7026k, 8);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) TTVideoLandingPageActivity.this.f7027l.getLayoutParams();
                TTVideoLandingPageActivity.this.f7033r = marginLayoutParams.leftMargin;
                TTVideoLandingPageActivity.this.f7032q = marginLayoutParams.topMargin;
                TTVideoLandingPageActivity.this.f7034s = marginLayoutParams.width;
                TTVideoLandingPageActivity.this.f7035t = marginLayoutParams.height;
                marginLayoutParams.width = -1;
                marginLayoutParams.height = -1;
                marginLayoutParams.topMargin = 0;
                marginLayoutParams.leftMargin = 0;
                TTVideoLandingPageActivity.this.f7027l.setLayoutParams(marginLayoutParams);
                return;
            }
            C3904y.m12853a((View) TTVideoLandingPageActivity.this.f7016a, 0);
            C3904y.m12853a((View) TTVideoLandingPageActivity.this.f7026k, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) TTVideoLandingPageActivity.this.f7027l.getLayoutParams();
            marginLayoutParams2.width = TTVideoLandingPageActivity.this.f7034s;
            marginLayoutParams2.height = TTVideoLandingPageActivity.this.f7035t;
            marginLayoutParams2.leftMargin = TTVideoLandingPageActivity.this.f7033r;
            marginLayoutParams2.topMargin = TTVideoLandingPageActivity.this.f7032q;
            TTVideoLandingPageActivity.this.f7027l.setLayoutParams(marginLayoutParams2);
        }
    };

    /* renamed from: S */
    private boolean f7014S = false;

    /* renamed from: T */
    private final C2917v.C2920b f7015T = new C2917v.C2920b() {
        /* renamed from: a */
        public void mo17829a(Context context, Intent intent, boolean z) {
            intent.getAction();
            int i = 0;
            if (z) {
                NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
                if (networkInfo != null) {
                    int type = networkInfo.getType();
                    if (type == 1) {
                        i = 4;
                    } else if (type == 0) {
                        i = 1;
                    }
                } else {
                    i = C2909o.m8136c(context);
                }
            }
            if (!(TTVideoLandingPageActivity.this.f7006K != 0 || i == 0 || TTVideoLandingPageActivity.this.f7016a == null || TTVideoLandingPageActivity.this.f7005J == null)) {
                TTVideoLandingPageActivity.this.f7016a.mo17835a(TTVideoLandingPageActivity.this.f7005J);
            }
            if (!(TTVideoLandingPageActivity.this.f7029n == null || TTVideoLandingPageActivity.this.f7029n.getNativeVideoController() == null || TTVideoLandingPageActivity.this.f7002G || TTVideoLandingPageActivity.this.f7006K == i)) {
                ((C3632b) TTVideoLandingPageActivity.this.f7029n.getNativeVideoController()).mo20242a(context, i);
            }
            TTVideoLandingPageActivity.this.f7006K = i;
        }
    };

    /* renamed from: a */
    protected SSWebView f7016a;

    /* renamed from: b */
    protected ImageView f7017b;

    /* renamed from: c */
    protected ImageView f7018c;

    /* renamed from: d */
    protected TextView f7019d;

    /* renamed from: e */
    protected Context f7020e;

    /* renamed from: f */
    protected int f7021f;

    /* renamed from: g */
    protected String f7022g;

    /* renamed from: h */
    protected String f7023h;

    /* renamed from: i */
    protected C3666w f7024i;

    /* renamed from: j */
    protected int f7025j;

    /* renamed from: k */
    protected RelativeLayout f7026k;

    /* renamed from: l */
    protected FrameLayout f7027l;

    /* renamed from: m */
    protected int f7028m = -1;

    /* renamed from: n */
    protected NativeVideoTsView f7029n;

    /* renamed from: o */
    protected long f7030o;

    /* renamed from: p */
    protected C3431n f7031p;

    /* renamed from: q */
    protected int f7032q = 0;

    /* renamed from: r */
    protected int f7033r = 0;

    /* renamed from: s */
    protected int f7034s = 0;

    /* renamed from: t */
    protected int f7035t = 0;

    /* renamed from: u */
    protected String f7036u = "ダウンロード";

    /* renamed from: v */
    protected RelativeLayout f7037v;

    /* renamed from: w */
    protected TextView f7038w;

    /* renamed from: x */
    protected RoundImageView f7039x;

    /* renamed from: y */
    protected TextView f7040y;

    /* renamed from: z */
    protected TextView f7041z;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo18500a() {
        return "tt_activity_videolandingpage";
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo18502c() {
        return "tt_titlebar_close";
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0015 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00da  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r13) {
        /*
            r12 = this;
            super.onCreate(r13)
            boolean r0 = com.bytedance.sdk.openadsdk.TTAdSdk.isInitSuccess()
            if (r0 != 0) goto L_0x000c
            r12.finish()
        L_0x000c:
            android.view.Window r0 = r12.getWindow()     // Catch:{ all -> 0x0015 }
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            r0.addFlags(r1)     // Catch:{ all -> 0x0015 }
        L_0x0015:
            com.bytedance.sdk.openadsdk.core.C3513m.m10965a(r12)     // Catch:{ all -> 0x0018 }
        L_0x0018:
            android.content.Context r0 = r12.getApplicationContext()
            int r0 = com.bytedance.sdk.component.utils.C2909o.m8136c(r0)
            r12.f7006K = r0
            java.lang.String r0 = r12.mo18500a()
            int r0 = com.bytedance.sdk.component.utils.C2914t.m8159f(r12, r0)
            r12.setContentView(r0)
            r12.f7020e = r12
            android.content.Intent r0 = r12.getIntent()
            java.lang.String r1 = "sdk_version"
            r2 = 1
            int r1 = r0.getIntExtra(r1, r2)
            r12.f7021f = r1
            java.lang.String r1 = "adid"
            java.lang.String r1 = r0.getStringExtra(r1)
            r12.f7022g = r1
            java.lang.String r1 = "log_extra"
            java.lang.String r1 = r0.getStringExtra(r1)
            r12.f7023h = r1
            r1 = -1
            java.lang.String r3 = "source"
            int r1 = r0.getIntExtra(r3, r1)
            r12.f7025j = r1
            java.lang.String r1 = "url"
            java.lang.String r1 = r0.getStringExtra(r1)
            r12.f7005J = r1
            java.lang.String r1 = "web_title"
            java.lang.String r1 = r0.getStringExtra(r1)
            java.lang.String r3 = "event_tag"
            java.lang.String r3 = r0.getStringExtra(r3)
            r12.f7001F = r3
            java.lang.String r3 = "gecko_id"
            java.lang.String r3 = r0.getStringExtra(r3)
            r12.f7011P = r3
            java.lang.String r3 = "video_is_auto_play"
            boolean r3 = r0.getBooleanExtra(r3, r2)
            r12.f7004I = r3
            r3 = 0
            java.lang.String r5 = "video_play_position"
            if (r13 == 0) goto L_0x008f
            long r6 = r13.getLong(r5)
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 <= 0) goto L_0x008f
            long r6 = r13.getLong(r5, r3)
            r12.f7030o = r6
        L_0x008f:
            java.lang.String r6 = "multi_process_data"
            java.lang.String r6 = r0.getStringExtra(r6)
            boolean r7 = com.bytedance.sdk.openadsdk.multipro.C3948b.m12959c()
            if (r7 == 0) goto L_0x00b9
            java.lang.String r7 = "multi_process_materialmeta"
            java.lang.String r0 = r0.getStringExtra(r7)
            if (r0 == 0) goto L_0x00ae
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x00ae }
            r7.<init>(r0)     // Catch:{ Exception -> 0x00ae }
            com.bytedance.sdk.openadsdk.core.e.n r0 = com.bytedance.sdk.openadsdk.core.C3356b.m9935a((org.json.JSONObject) r7)     // Catch:{ Exception -> 0x00ae }
            r12.f7031p = r0     // Catch:{ Exception -> 0x00ae }
        L_0x00ae:
            com.bytedance.sdk.openadsdk.core.e.n r0 = r12.f7031p
            if (r0 == 0) goto L_0x00d2
            int r0 = r0.mo19570ad()
            r12.f7028m = r0
            goto L_0x00d2
        L_0x00b9:
            com.bytedance.sdk.openadsdk.core.t r0 = com.bytedance.sdk.openadsdk.core.C3580t.m11322a()
            com.bytedance.sdk.openadsdk.core.e.n r0 = r0.mo20135c()
            r12.f7031p = r0
            if (r0 == 0) goto L_0x00cb
            int r0 = r0.mo19570ad()
            r12.f7028m = r0
        L_0x00cb:
            com.bytedance.sdk.openadsdk.core.t r0 = com.bytedance.sdk.openadsdk.core.C3580t.m11322a()
            r0.mo20140h()
        L_0x00d2:
            com.bytedance.sdk.openadsdk.core.e.n r0 = r12.f7031p
            if (r0 != 0) goto L_0x00da
            r12.finish()
            return
        L_0x00da:
            if (r6 == 0) goto L_0x00ef
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x00e7 }
            r0.<init>(r6)     // Catch:{ Exception -> 0x00e7 }
            com.bytedance.sdk.openadsdk.multipro.b.a r0 = com.bytedance.sdk.openadsdk.multipro.p182b.C3949a.m12960a((org.json.JSONObject) r0)     // Catch:{ Exception -> 0x00e7 }
            r12.f7007L = r0     // Catch:{ Exception -> 0x00e7 }
        L_0x00e7:
            com.bytedance.sdk.openadsdk.multipro.b.a r0 = r12.f7007L
            if (r0 == 0) goto L_0x00ef
            long r6 = r0.f10062g
            r12.f7030o = r6
        L_0x00ef:
            if (r13 == 0) goto L_0x0115
            java.lang.String r0 = "material_meta"
            java.lang.String r0 = r13.getString(r0)
            com.bytedance.sdk.openadsdk.core.e.n r6 = r12.f7031p
            if (r6 != 0) goto L_0x0106
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ all -> 0x0106 }
            r6.<init>(r0)     // Catch:{ all -> 0x0106 }
            com.bytedance.sdk.openadsdk.core.e.n r0 = com.bytedance.sdk.openadsdk.core.C3356b.m9935a((org.json.JSONObject) r6)     // Catch:{ all -> 0x0106 }
            r12.f7031p = r0     // Catch:{ all -> 0x0106 }
        L_0x0106:
            long r5 = r13.getLong(r5)
            java.lang.String r0 = "is_complete"
            r13.getBoolean(r0)
            int r13 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r13 <= 0) goto L_0x0115
            r12.f7030o = r5
        L_0x0115:
            r12.mo18503d()
            r12.mo18509j()
            r12.m8654n()
            r13 = 4
            r12.m8646a((int) r13)
            int r13 = android.os.Build.VERSION.SDK_INT
            r0 = 16
            r3 = 0
            if (r13 < r0) goto L_0x012b
            r13 = r2
            goto L_0x012c
        L_0x012b:
            r13 = r3
        L_0x012c:
            com.bytedance.sdk.component.widget.SSWebView r0 = r12.f7016a
            java.lang.String r4 = "landingpage_split_screen"
            if (r0 == 0) goto L_0x015f
            android.content.Context r0 = r12.f7020e
            com.bytedance.sdk.openadsdk.core.widget.a.b r0 = com.bytedance.sdk.openadsdk.core.widget.p164a.C3685b.m12035a((android.content.Context) r0)
            com.bytedance.sdk.openadsdk.core.widget.a.b r13 = r0.mo20447a((boolean) r13)
            com.bytedance.sdk.openadsdk.core.widget.a.b r13 = r13.mo20449b((boolean) r3)
            com.bytedance.sdk.component.widget.SSWebView r0 = r12.f7016a
            android.webkit.WebView r0 = r0.getWebView()
            r13.mo20448a((android.webkit.WebView) r0)
            com.bytedance.sdk.openadsdk.b.n r13 = new com.bytedance.sdk.openadsdk.b.n
            com.bytedance.sdk.openadsdk.core.e.n r0 = r12.f7031p
            com.bytedance.sdk.component.widget.SSWebView r5 = r12.f7016a
            android.webkit.WebView r5 = r5.getWebView()
            r13.<init>(r12, r0, r5)
            com.bytedance.sdk.openadsdk.b.n r13 = r13.mo18688a((boolean) r2)
            r12.f7008M = r13
            r13.mo18698a((java.lang.String) r4)
        L_0x015f:
            com.bytedance.sdk.component.widget.SSWebView r13 = r12.f7016a
            r13.setLandingPage(r2)
            com.bytedance.sdk.component.widget.SSWebView r13 = r12.f7016a
            r13.setTag(r4)
            com.bytedance.sdk.component.widget.SSWebView r13 = r12.f7016a
            com.bytedance.sdk.openadsdk.core.e.n r0 = r12.f7031p
            com.bytedance.sdk.component.widget.b.a r0 = r0.mo19559aC()
            r13.setMaterialMeta(r0)
            com.bytedance.sdk.component.widget.SSWebView r13 = r12.f7016a
            com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity$1 r0 = new com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity$1
            android.content.Context r7 = r12.f7020e
            com.bytedance.sdk.openadsdk.core.w r8 = r12.f7024i
            java.lang.String r9 = r12.f7022g
            com.bytedance.sdk.openadsdk.b.n r10 = r12.f7008M
            r11 = 1
            r5 = r0
            r6 = r12
            r5.<init>(r7, r8, r9, r10, r11)
            r13.setWebViewClient(r0)
            com.bytedance.sdk.component.widget.SSWebView r13 = r12.f7016a
            if (r13 == 0) goto L_0x019a
            android.webkit.WebView r0 = r13.getWebView()
            int r2 = r12.f7021f
            java.lang.String r0 = com.bytedance.sdk.openadsdk.p178l.C3881j.m12666a((android.webkit.WebView) r0, (int) r2)
            r13.setUserAgentString(r0)
        L_0x019a:
            int r13 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            if (r13 < r0) goto L_0x01a5
            com.bytedance.sdk.component.widget.SSWebView r13 = r12.f7016a
            r13.setMixedContentMode(r3)
        L_0x01a5:
            android.content.Context r13 = r12.f7020e
            com.bytedance.sdk.openadsdk.core.e.n r0 = r12.f7031p
            com.bytedance.sdk.openadsdk.p128b.C3090e.m8890a((android.content.Context) r13, (com.bytedance.sdk.openadsdk.core.p149e.C3431n) r0, (java.lang.String) r4)
            com.bytedance.sdk.component.widget.SSWebView r13 = r12.f7016a
            java.lang.String r0 = r12.f7005J
            com.bytedance.sdk.openadsdk.p178l.C3882k.m12668a(r13, r0)
            com.bytedance.sdk.component.widget.SSWebView r13 = r12.f7016a
            com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity$3 r0 = new com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity$3
            com.bytedance.sdk.openadsdk.core.w r2 = r12.f7024i
            com.bytedance.sdk.openadsdk.b.n r3 = r12.f7008M
            r0.<init>(r2, r3)
            r13.setWebChromeClient(r0)
            com.bytedance.sdk.component.widget.SSWebView r13 = r12.f7016a
            com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity$4 r0 = new com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity$4
            r0.<init>()
            r13.setDownloadListener(r0)
            android.widget.TextView r13 = r12.f7019d
            if (r13 == 0) goto L_0x01de
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L_0x01db
            java.lang.String r0 = "tt_web_title_default"
            java.lang.String r1 = com.bytedance.sdk.component.utils.C2914t.m8151a(r12, r0)
        L_0x01db:
            r13.setText(r1)
        L_0x01de:
            r12.mo18510k()
            r12.mo18504e()
            r12.m8653m()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.onCreate(android.os.Bundle):void");
    }

    /* renamed from: m */
    private void m8653m() {
        C3431n nVar = this.f7031p;
        if (nVar != null && nVar.mo19519L() == 4) {
            this.f6996A.setVisibility(0);
            Button button = (Button) findViewById(C2914t.m8158e(this, "tt_browser_download_btn"));
            this.f6997B = button;
            if (button != null) {
                m8649a(mo18501b());
                this.f6997B.setOnClickListener(this.f7012Q);
                this.f6997B.setOnTouchListener(this.f7012Q);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo18501b() {
        C3431n nVar = this.f7031p;
        if (nVar != null && !TextUtils.isEmpty(nVar.mo19530W())) {
            this.f7036u = this.f7031p.mo19530W();
        }
        return this.f7036u;
    }

    /* renamed from: a */
    private void m8649a(final String str) {
        Button button;
        if (!TextUtils.isEmpty(str) && (button = this.f6997B) != null) {
            button.post(new Runnable() {
                public void run() {
                    if (TTVideoLandingPageActivity.this.f6997B != null && !TTVideoLandingPageActivity.this.isFinishing()) {
                        TTVideoLandingPageActivity.this.f6997B.setText(str);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo18503d() {
        this.f6998C = (ProgressBar) findViewById(C2914t.m8158e(this, "tt_browser_progress"));
        this.f6996A = (ViewStub) findViewById(C2914t.m8158e(this, "tt_browser_download_btn_stub"));
        this.f7016a = (SSWebView) findViewById(C2914t.m8158e(this, "tt_browser_webview"));
        ImageView imageView = (ImageView) findViewById(C2914t.m8158e(this, "tt_titlebar_back"));
        this.f7017b = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    if (TTVideoLandingPageActivity.this.f7016a == null) {
                        return;
                    }
                    if (TTVideoLandingPageActivity.this.f7016a.mo17846e()) {
                        TTVideoLandingPageActivity.this.f7016a.mo17847f();
                    } else if (TTVideoLandingPageActivity.this.m8658r()) {
                        TTVideoLandingPageActivity.this.onBackPressed();
                    } else {
                        Map<String, Object> map = null;
                        if (!(TTVideoLandingPageActivity.this.f7029n == null || TTVideoLandingPageActivity.this.f7029n.getNativeVideoController() == null)) {
                            map = C3898x.m12757a(TTVideoLandingPageActivity.this.f7031p, TTVideoLandingPageActivity.this.f7029n.getNativeVideoController().mo16043h(), TTVideoLandingPageActivity.this.f7029n.getNativeVideoController().mo16049n());
                        }
                        TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                        C3090e.m8894a((Context) tTVideoLandingPageActivity, tTVideoLandingPageActivity.f7031p, "embeded_ad", "detail_back", TTVideoLandingPageActivity.this.mo18506g(), TTVideoLandingPageActivity.this.mo18507h(), map, (C3100j) null);
                        TTVideoLandingPageActivity.this.finish();
                    }
                }
            });
        }
        NativeVideoTsView nativeVideoTsView = this.f7029n;
        if (nativeVideoTsView != null) {
            nativeVideoTsView.setIsAutoPlay(this.f7004I);
        }
        ImageView imageView2 = (ImageView) findViewById(C2914t.m8158e(this, mo18502c()));
        this.f7018c = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    if (TTVideoLandingPageActivity.this.f7029n != null) {
                        Map<String, Object> map = null;
                        if (TTVideoLandingPageActivity.this.f7029n.getNativeVideoController() != null) {
                            map = C3898x.m12757a(TTVideoLandingPageActivity.this.f7031p, TTVideoLandingPageActivity.this.f7029n.getNativeVideoController().mo16043h(), TTVideoLandingPageActivity.this.f7029n.getNativeVideoController().mo16049n());
                        }
                        TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                        C3090e.m8894a((Context) tTVideoLandingPageActivity, tTVideoLandingPageActivity.f7031p, "embeded_ad", "detail_skip", TTVideoLandingPageActivity.this.mo18506g(), TTVideoLandingPageActivity.this.mo18507h(), map, (C3100j) null);
                    }
                    TTVideoLandingPageActivity.this.finish();
                }
            });
        }
        this.f7019d = (TextView) findViewById(C2914t.m8158e(this, "tt_titlebar_title"));
        this.f7027l = (FrameLayout) findViewById(C2914t.m8158e(this, "tt_native_video_container"));
        this.f7026k = (RelativeLayout) findViewById(C2914t.m8158e(this, "tt_native_video_titlebar"));
        this.f7037v = (RelativeLayout) findViewById(C2914t.m8158e(this, "tt_rl_download"));
        this.f7038w = (TextView) findViewById(C2914t.m8158e(this, "tt_video_btn_ad_image_tv"));
        this.f7040y = (TextView) findViewById(C2914t.m8158e(this, "tt_video_ad_name"));
        this.f7041z = (TextView) findViewById(C2914t.m8158e(this, "tt_video_ad_button"));
        this.f7039x = (RoundImageView) findViewById(C2914t.m8158e(this, "tt_video_ad_logo_image"));
        mo18508i();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m8653m();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo18504e() {
        if (mo18505f()) {
            try {
                NativeVideoTsView nativeVideoTsView = new NativeVideoTsView(this.f7020e, this.f7031p, true, (C3100j) null);
                this.f7029n = nativeVideoTsView;
                if (nativeVideoTsView.getNativeVideoController() != null) {
                    this.f7029n.getNativeVideoController().mo16027a(false);
                }
                if (this.f7002G) {
                    this.f7027l.setVisibility(0);
                    this.f7027l.removeAllViews();
                    this.f7027l.addView(this.f7029n);
                    this.f7029n.mo20208b(true);
                } else {
                    if (!this.f7004I) {
                        this.f7030o = 0;
                    }
                    if (!(this.f7007L == null || this.f7029n.getNativeVideoController() == null)) {
                        this.f7029n.getNativeVideoController().mo16031b(this.f7007L.f10062g);
                        this.f7029n.getNativeVideoController().mo16035c(this.f7007L.f10060e);
                        this.f7029n.setIsQuiet(C3513m.m10973h().mo19837a(C3898x.m12794f(this.f7031p)));
                    }
                    if (this.f7029n.mo20207a(this.f7030o, this.f7003H, this.f7002G)) {
                        this.f7027l.setVisibility(0);
                        this.f7027l.removeAllViews();
                        this.f7027l.addView(this.f7029n);
                    }
                    if (this.f7029n.getNativeVideoController() != null) {
                        this.f7029n.getNativeVideoController().mo16027a(false);
                        this.f7029n.getNativeVideoController().mo16024a(this.f7013R);
                    }
                }
                C3707a.m12124a().mo17599a(this.f7031p.mo19523P().get(0).mo19468a()).mo17638a(C2838t.BITMAP).mo17633a((C2832n) new C2832n<Bitmap>() {
                    /* renamed from: a */
                    public void mo17178a(int i, String str, Throwable th) {
                    }

                    /* renamed from: a */
                    public void mo17179a(C2828j<Bitmap> jVar) {
                        try {
                            Bitmap b = jVar.mo17647b();
                            if (Build.VERSION.SDK_INT >= 17) {
                                new C3041a(b, TTVideoLandingPageActivity.this.f7029n.getNativeVideoController().mo16050o()).execute(new Void[0]);
                            }
                        } catch (Exception unused) {
                        }
                    }
                });
                this.f7029n.findViewById(C2914t.m8158e(this.f7020e, "tt_root_view")).setOnTouchListener((View.OnTouchListener) null);
                this.f7029n.findViewById(C2914t.m8158e(this.f7020e, "tt_root_view")).setOnClickListener((View.OnClickListener) null);
            } catch (Exception e) {
                e.printStackTrace();
            }
            if (this.f7006K == 0) {
                try {
                    Toast.makeText(this, C2914t.m8154b(this, "tt_no_network"), 0).show();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo18505f() {
        return this.f7028m == 5;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public long mo18506g() {
        NativeVideoTsView nativeVideoTsView = this.f7029n;
        if (nativeVideoTsView == null || nativeVideoTsView.getNativeVideoController() == null) {
            return 0;
        }
        return this.f7029n.getNativeVideoController().mo16045j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public int mo18507h() {
        NativeVideoTsView nativeVideoTsView = this.f7029n;
        if (nativeVideoTsView == null || nativeVideoTsView.getNativeVideoController() == null) {
            return 0;
        }
        return this.f7029n.getNativeVideoController().mo16047l();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo18508i() {
        String str;
        C3431n nVar = this.f7031p;
        if (nVar != null && nVar.mo19519L() == 4) {
            C3904y.m12853a((View) this.f7037v, 0);
            if (!TextUtils.isEmpty(this.f7031p.mo19528U())) {
                str = this.f7031p.mo19528U();
            } else if (!TextUtils.isEmpty(this.f7031p.mo19529V())) {
                str = this.f7031p.mo19529V();
            } else {
                str = !TextUtils.isEmpty(this.f7031p.mo19518K()) ? this.f7031p.mo19518K() : "";
            }
            if (this.f7031p.mo19520M() != null && this.f7031p.mo19520M().mo19468a() != null) {
                C3904y.m12853a((View) this.f7039x, 0);
                C3904y.m12853a((View) this.f7038w, 4);
                C3792d.m12395a().mo20613a(this.f7031p.mo19520M(), (ImageView) this.f7039x);
            } else if (!TextUtils.isEmpty(str)) {
                C3904y.m12853a((View) this.f7039x, 4);
                C3904y.m12853a((View) this.f7038w, 0);
                this.f7038w.setText(str.substring(0, 1));
            }
            if (!TextUtils.isEmpty(this.f7031p.mo19530W())) {
                this.f7041z.setText(this.f7031p.mo19530W());
            }
            if (!TextUtils.isEmpty(str)) {
                this.f7040y.setText(str);
            }
            C3904y.m12853a((View) this.f7040y, 0);
            C3904y.m12853a((View) this.f7041z, 0);
        }
    }

    /* renamed from: j */
    public void mo18509j() {
        C3431n nVar = this.f7031p;
        if (nVar != null) {
            this.f6999D = C3969d.m13089a(this, nVar, this.f7001F);
            C3359a aVar = new C3359a(this, this.f7031p, this.f7001F, this.f7025j);
            this.f7012Q = aVar;
            aVar.mo19296a(false);
            this.f7012Q.mo19300c(true);
            this.f7041z.setOnClickListener(this.f7012Q);
            this.f7041z.setOnTouchListener(this.f7012Q);
            this.f7012Q.mo19311a(this.f6999D);
        }
    }

    /* renamed from: n */
    private void m8654n() {
        C3666w wVar = new C3666w(this);
        this.f7024i = wVar;
        wVar.mo20354b(this.f7016a).mo20364d(this.f7022g).mo20368e(this.f7023h).mo20353b(this.f7025j).mo20337a(this.f7031p).mo20331a(this.f7031p.mo19513F()).mo20334a(this.f7016a).mo20360c("landingpage_split_screen").mo20370f(C3898x.m12810i(this.f7031p));
    }

    public void onBackPressed() {
        NativeVideoTsView nativeVideoTsView;
        if (this.f7000E && (nativeVideoTsView = this.f7029n) != null && nativeVideoTsView.getNativeVideoController() != null) {
            ((C2402a) this.f7029n.getNativeVideoController()).mo16014e((C2403b) null, (View) null);
            this.f7000E = false;
        } else if (!m8658r() || this.f7009N.getAndSet(true)) {
            super.onBackPressed();
        } else {
            m8650a(true);
            m8646a(0);
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        C3431n nVar = this.f7031p;
        bundle.putString("material_meta", nVar != null ? nVar.mo19584ar().toString() : null);
        bundle.putLong("video_play_position", this.f7030o);
        bundle.putBoolean("is_complete", this.f7002G);
        long j = this.f7030o;
        NativeVideoTsView nativeVideoTsView = this.f7029n;
        if (!(nativeVideoTsView == null || nativeVideoTsView.getNativeVideoController() == null)) {
            j = this.f7029n.getNativeVideoController().mo16042g();
        }
        bundle.putLong("video_play_position", j);
        super.onSaveInstanceState(bundle);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (!this.f7003H) {
            m8655o();
        }
        this.f7003H = false;
        C3666w wVar = this.f7024i;
        if (wVar != null) {
            wVar.mo20377l();
        }
        C3104n nVar = this.f7008M;
        if (nVar != null) {
            nVar.mo18701d();
        }
        m8659s();
    }

    /* renamed from: o */
    private void m8655o() {
        NativeVideoTsView nativeVideoTsView = this.f7029n;
        if (nativeVideoTsView != null && nativeVideoTsView.getNativeVideoController() != null && !m8657q()) {
            this.f7029n.mo20217l();
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        NativeVideoTsView nativeVideoTsView;
        NativeVideoTsView nativeVideoTsView2;
        super.onPause();
        C3666w wVar = this.f7024i;
        if (wVar != null) {
            wVar.mo20378m();
        }
        m8656p();
        if (this.f7002G || !((nativeVideoTsView2 = this.f7029n) == null || nativeVideoTsView2.getNativeVideoController() == null || !this.f7029n.getNativeVideoController().mo16052q())) {
            this.f7002G = true;
            C3961a.m13025a("sp_multi_native_video_data", "key_video_is_update_flag", (Boolean) true);
            C3961a.m13025a("sp_multi_native_video_data", "key_native_video_complete", (Boolean) true);
            C3961a.m13025a("sp_multi_native_video_data", "key_video_isfromvideodetailpage", (Boolean) true);
        }
        if (!this.f7002G && (nativeVideoTsView = this.f7029n) != null && nativeVideoTsView.getNativeVideoController() != null) {
            m8647a(this.f7029n.getNativeVideoController());
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        C3104n nVar = this.f7008M;
        if (nVar != null) {
            nVar.mo18702e();
        }
    }

    /* renamed from: a */
    private void m8647a(C2405c cVar) {
        C3961a.m13025a("sp_multi_native_video_data", "key_video_is_update_flag", (Boolean) true);
        C3961a.m13025a("sp_multi_native_video_data", "key_video_isfromvideodetailpage", (Boolean) true);
        C3961a.m13025a("sp_multi_native_video_data", "key_native_video_complete", Boolean.valueOf(cVar.mo16052q()));
        C3961a.m13028a("sp_multi_native_video_data", "key_video_current_play_position", Long.valueOf(cVar.mo16042g()));
        C3961a.m13028a("sp_multi_native_video_data", "key_video_total_play_duration", Long.valueOf(cVar.mo16045j() + cVar.mo16043h()));
        C3961a.m13028a("sp_multi_native_video_data", "key_video_duration", Long.valueOf(cVar.mo16045j()));
    }

    /* renamed from: p */
    private void m8656p() {
        if (this.f7029n != null && !m8657q()) {
            this.f7029n.mo20217l();
        }
    }

    /* renamed from: q */
    private boolean m8657q() {
        NativeVideoTsView nativeVideoTsView = this.f7029n;
        if (nativeVideoTsView == null || nativeVideoTsView.getNativeVideoController() == null) {
            return true;
        }
        return this.f7029n.getNativeVideoController().mo16052q();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        ViewGroup viewGroup;
        super.onDestroy();
        mo18511l();
        try {
            if (!(getWindow() == null || (viewGroup = (ViewGroup) getWindow().getDecorView()) == null)) {
                viewGroup.removeAllViews();
            }
            this.f7031p.mo19556a(false);
        } catch (Throwable unused) {
        }
        SSWebView sSWebView = this.f7016a;
        if (sSWebView != null) {
            C3706z.m12119a(this.f7020e, sSWebView.getWebView());
            C3706z.m12120a(this.f7016a.getWebView());
        }
        this.f7016a = null;
        C3666w wVar = this.f7024i;
        if (wVar != null) {
            wVar.mo20379n();
        }
        NativeVideoTsView nativeVideoTsView = this.f7029n;
        if (!(nativeVideoTsView == null || nativeVideoTsView.getNativeVideoController() == null)) {
            this.f7029n.getNativeVideoController().mo16041f();
        }
        this.f7029n = null;
        this.f7031p = null;
        C3104n nVar = this.f7008M;
        if (nVar != null) {
            nVar.mo18703f();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo18510k() {
        C2917v.m8179a(this.f7015T, this.f7020e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public void mo18511l() {
        try {
            C2917v.m8178a(this.f7015T);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r */
    public boolean m8658r() {
        return !TextUtils.isEmpty(this.f7005J) && this.f7005J.contains("__luban_sdk");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m8646a(int i) {
        if (this.f7018c != null && m8658r()) {
            C3904y.m12853a((View) this.f7018c, i);
        }
    }

    /* renamed from: a */
    private void m8650a(boolean z) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isBackIntercept", z);
            this.f7024i.mo20350a("temai_back_event", jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: s */
    private void m8659s() {
        if (this.f7031p != null) {
            JSONArray b = m8652b(this.f7005J);
            int f = C3898x.m12794f(this.f7031p);
            int e = C3898x.m12790e(this.f7031p);
            C3516n<C3060a> f2 = C3513m.m10971f();
            if (b != null && f2 != null && f > 0 && e > 0) {
                C3433o oVar = new C3433o();
                oVar.f8444e = b;
                AdSlot x = this.f7031p.mo19664x();
                if (x != null) {
                    x.setAdCount(6);
                    f2.mo19983a(x, oVar, e, new C3516n.C3517a() {
                        /* renamed from: a */
                        public void mo18456a(int i, String str) {
                            TTVideoLandingPageActivity.this.m8646a(0);
                        }

                        /* renamed from: a */
                        public void mo18457a(C3402a aVar, C3403b bVar) {
                            if (aVar != null) {
                                try {
                                    TTVideoLandingPageActivity.this.f7009N.set(false);
                                    TTVideoLandingPageActivity.this.f7024i.mo20355b(new JSONObject(aVar.mo19388c()));
                                } catch (Exception unused) {
                                    TTVideoLandingPageActivity.this.m8646a(0);
                                }
                            }
                        }
                    });
                }
            }
        }
    }

    /* renamed from: b */
    private JSONArray m8652b(String str) {
        int i;
        JSONArray jSONArray = this.f7010O;
        if (jSONArray != null && jSONArray.length() > 0) {
            return this.f7010O;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int indexOf = str.indexOf("?id=");
        int indexOf2 = str.indexOf("&");
        if (indexOf == -1 || indexOf2 == -1 || (i = indexOf + 4) >= indexOf2) {
            return null;
        }
        String substring = str.substring(i, indexOf2);
        if (TextUtils.isEmpty(substring)) {
            return null;
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(substring);
        return jSONArray2;
    }

    /* renamed from: a */
    public void mo18439a(boolean z, JSONArray jSONArray) {
        if (z && jSONArray != null && jSONArray.length() > 0) {
            this.f7010O = jSONArray;
            m8659s();
        }
    }

    /* renamed from: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity$a */
    private static class C3041a extends AsyncTask<Void, Void, Drawable> {

        /* renamed from: a */
        private Bitmap f7053a;

        /* renamed from: b */
        private WeakReference<C2403b> f7054b;

        private C3041a(Bitmap bitmap, C2403b bVar) {
            this.f7053a = bitmap;
            this.f7054b = new WeakReference<>(bVar);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Drawable doInBackground(Void... voidArr) {
            try {
                Bitmap a = C2571a.m6621a(C3513m.m10963a(), this.f7053a, 25);
                if (a == null) {
                    return null;
                }
                return new BitmapDrawable(C3513m.m10963a().getResources(), a);
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void onPostExecute(Drawable drawable) {
            WeakReference<C2403b> weakReference;
            if (drawable != null && (weakReference = this.f7054b) != null && weakReference.get() != null) {
                ((C2403b) this.f7054b.get()).mo16017a(drawable);
            }
        }
    }
}
