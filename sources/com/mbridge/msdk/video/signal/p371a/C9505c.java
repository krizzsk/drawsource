package com.mbridge.msdk.video.signal.p371a;

import android.app.Activity;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.click.C6765a;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.out.NativeListener;
import com.mbridge.msdk.video.signal.C9521c;
import com.mbridge.msdk.videocommon.p375d.C9640c;

/* renamed from: com.mbridge.msdk.video.signal.a.c */
/* compiled from: DefaultJSCommon */
public class C9505c implements C9521c {

    /* renamed from: a */
    protected boolean f23543a = false;

    /* renamed from: b */
    protected boolean f23544b = false;

    /* renamed from: c */
    protected int f23545c = 0;

    /* renamed from: d */
    protected int f23546d = 0;

    /* renamed from: e */
    protected int f23547e = 0;

    /* renamed from: f */
    protected int f23548f = 0;

    /* renamed from: g */
    protected int f23549g = 1;

    /* renamed from: h */
    protected int f23550h = -1;

    /* renamed from: i */
    protected String f23551i;

    /* renamed from: j */
    protected C9640c f23552j;

    /* renamed from: k */
    protected C6765a f23553k;

    /* renamed from: l */
    public C9521c.C9522a f23554l = new C9506a();

    /* renamed from: m */
    protected int f23555m = 2;

    /* renamed from: f */
    public void mo63256f() {
    }

    /* renamed from: a */
    public final void mo63239a(int i) {
        this.f23555m = i;
    }

    /* renamed from: c */
    public final void mo63251c(int i) {
        this.f23545c = i;
    }

    /* renamed from: b */
    public final void mo63246b(int i) {
        this.f23546d = i;
    }

    /* renamed from: d */
    public final void mo63253d(int i) {
        this.f23547e = i;
    }

    /* renamed from: j */
    public final int mo63263j() {
        if (this.f23545c == 0 && this.f23544b) {
            this.f23545c = 1;
        }
        return this.f23545c;
    }

    /* renamed from: k */
    public final int mo63264k() {
        if (this.f23546d == 0 && this.f23544b) {
            this.f23546d = 1;
        }
        return this.f23546d;
    }

    /* renamed from: l */
    public final int mo63265l() {
        if (this.f23547e == 0 && this.f23544b) {
            this.f23547e = 1;
        }
        return this.f23547e;
    }

    /* renamed from: e */
    public final void mo63255e(int i) {
        this.f23548f = i;
    }

    /* renamed from: a */
    public final int mo63238a() {
        return this.f23548f;
    }

    /* renamed from: m */
    public final boolean mo63266m() {
        return this.f23544b;
    }

    /* renamed from: a */
    public final void mo63245a(boolean z) {
        C8672v.m24874a("DefaultJSCommon", "setIsShowingTransparent:" + z);
        this.f23544b = z;
    }

    /* renamed from: b */
    public final boolean mo63249b() {
        return this.f23543a;
    }

    /* renamed from: b */
    public final void mo63248b(boolean z) {
        this.f23543a = z;
    }

    /* renamed from: a */
    public final void mo63244a(String str) {
        C8672v.m24874a("DefaultJSCommon", "setUnitId:" + str);
        this.f23551i = str;
    }

    /* renamed from: a */
    public final void mo63242a(C9521c.C9522a aVar) {
        C8672v.m24874a("DefaultJSCommon", "setTrackingListener:" + aVar);
        this.f23554l = aVar;
    }

    /* renamed from: a */
    public final void mo63243a(C9640c cVar) {
        C8672v.m24874a("DefaultJSCommon", "setSetting:" + cVar);
        this.f23552j = cVar;
    }

    /* renamed from: e */
    public final void mo63254e() {
        C8672v.m24874a("DefaultJSCommon", "release");
        C6765a aVar = this.f23553k;
        if (aVar != null) {
            aVar.mo37046a(false);
            this.f23553k.mo37044a((NativeListener.NativeTrackingListener) null);
            this.f23553k.mo37040a();
        }
    }

    /* renamed from: a */
    public void mo63240a(int i, String str) {
        C8672v.m24874a("DefaultJSCommon", "statistics,type:" + i + ",json:" + str);
    }

    /* renamed from: f */
    public final void mo63257f(int i) {
        this.f23550h = i;
    }

    /* renamed from: g */
    public final int mo63258g() {
        return this.f23550h;
    }

    /* renamed from: g */
    public String mo63259g(int i) {
        C8672v.m24874a("DefaultJSCommon", "getSDKInfo");
        return JsonUtils.EMPTY_JSON;
    }

    /* renamed from: h */
    public final void mo63261h(int i) {
        C8672v.m24874a("DefaultJSCommon", "setAlertDialogRole " + i);
        this.f23549g = i;
    }

    /* renamed from: h */
    public final int mo63260h() {
        C8672v.m24874a("DefaultJSCommon", "getAlertDialogRole " + this.f23549g);
        return this.f23549g;
    }

    /* renamed from: a */
    public void mo63241a(Activity activity) {
        C8672v.m24874a("DefaultJSCommon", "setActivity ");
    }

    /* renamed from: c */
    public String mo63250c() {
        C8672v.m24874a("DefaultJSCommon", "init");
        return JsonUtils.EMPTY_JSON;
    }

    public void click(int i, String str) {
        C8672v.m24874a("DefaultJSCommon", "click:type" + i + ",pt:" + str);
    }

    public void handlerH5Exception(int i, String str) {
        C8672v.m24874a("DefaultJSCommon", "handlerH5Exception,code=" + i + ",msg:" + str);
    }

    /* renamed from: d */
    public void mo63252d() {
        C8672v.m24874a("DefaultJSCommon", "finish");
    }

    /* renamed from: b */
    public void mo63247b(String str) {
        C8672v.m24874a("DefaultJSCommon", "setNotchArea");
    }

    /* renamed from: i */
    public String mo63262i() {
        C8672v.m24874a("DefaultJSCommon", "getNotchArea");
        return null;
    }

    /* renamed from: com.mbridge.msdk.video.signal.a.c$b */
    /* compiled from: DefaultJSCommon */
    public static class C9507b implements C9521c.C9522a {

        /* renamed from: a */
        private C9521c f23556a;

        /* renamed from: b */
        private C9521c.C9522a f23557b;

        public C9507b(C9521c cVar, C9521c.C9522a aVar) {
            this.f23556a = cVar;
            this.f23557b = aVar;
        }

        public final boolean onInterceptDefaultLoadingDialog() {
            C9521c.C9522a aVar = this.f23557b;
            return aVar != null && aVar.onInterceptDefaultLoadingDialog();
        }

        public final void onShowLoading(Campaign campaign) {
            C9521c.C9522a aVar = this.f23557b;
            if (aVar != null) {
                aVar.onShowLoading(campaign);
            }
        }

        public final void onDismissLoading(Campaign campaign) {
            C9521c.C9522a aVar = this.f23557b;
            if (aVar != null) {
                aVar.onDismissLoading(campaign);
            }
        }

        public final void onStartRedirection(Campaign campaign, String str) {
            C9521c.C9522a aVar = this.f23557b;
            if (aVar != null) {
                aVar.onStartRedirection(campaign, str);
            }
        }

        public final void onFinishRedirection(Campaign campaign, String str) {
            C9521c.C9522a aVar = this.f23557b;
            if (aVar != null) {
                aVar.onFinishRedirection(campaign, str);
            }
            C9521c cVar = this.f23556a;
            if (cVar != null) {
                cVar.mo63252d();
            }
        }

        public final void onRedirectionFailed(Campaign campaign, String str) {
            C9521c.C9522a aVar = this.f23557b;
            if (aVar != null) {
                aVar.onRedirectionFailed(campaign, str);
            }
            C9521c cVar = this.f23556a;
            if (cVar != null) {
                cVar.mo63252d();
            }
        }

        public final void onDownloadStart(Campaign campaign) {
            C9521c.C9522a aVar = this.f23557b;
            if (aVar != null) {
                aVar.onDownloadStart(campaign);
            }
        }

        public final void onDownloadFinish(Campaign campaign) {
            C9521c.C9522a aVar = this.f23557b;
            if (aVar != null) {
                aVar.onDownloadFinish(campaign);
            }
        }

        public final void onDownloadProgress(int i) {
            C9521c.C9522a aVar = this.f23557b;
            if (aVar != null) {
                aVar.onDownloadProgress(i);
            }
        }

        /* renamed from: a */
        public final void mo62632a() {
            C9521c.C9522a aVar = this.f23557b;
            if (aVar != null) {
                aVar.mo62632a();
            }
        }

        /* renamed from: a */
        public final void mo62634a(boolean z) {
            C9521c.C9522a aVar = this.f23557b;
            if (aVar != null) {
                aVar.mo62634a(z);
            }
        }

        /* renamed from: a */
        public final void mo62633a(int i, String str) {
            C9521c.C9522a aVar = this.f23557b;
            if (aVar != null) {
                aVar.mo62633a(i, str);
            }
        }

        /* renamed from: b */
        public final void mo62635b() {
            C9521c.C9522a aVar = this.f23557b;
            if (aVar != null) {
                aVar.mo62635b();
            }
        }
    }

    /* renamed from: com.mbridge.msdk.video.signal.a.c$a */
    /* compiled from: DefaultJSCommon */
    public static class C9506a implements C9521c.C9522a {
        public boolean onInterceptDefaultLoadingDialog() {
            C8672v.m24874a("DefaultJSCommon", "onInterceptDefaultLoadingDialog");
            return false;
        }

        public void onShowLoading(Campaign campaign) {
            C8672v.m24874a("DefaultJSCommon", "onShowLoading,campaign:" + campaign);
        }

        public void onDismissLoading(Campaign campaign) {
            C8672v.m24874a("DefaultJSCommon", "onDismissLoading,campaign:" + campaign);
        }

        public void onStartRedirection(Campaign campaign, String str) {
            C8672v.m24874a("DefaultJSCommon", "onStartRedirection,campaign:" + campaign + ",url:" + str);
        }

        public void onFinishRedirection(Campaign campaign, String str) {
            C8672v.m24874a("DefaultJSCommon", "onFinishRedirection,campaign:" + campaign + ",url:" + str);
        }

        public void onRedirectionFailed(Campaign campaign, String str) {
            C8672v.m24874a("DefaultJSCommon", "onFinishRedirection,campaign:" + campaign + ",url:" + str);
        }

        public void onDownloadStart(Campaign campaign) {
            C8672v.m24874a("DefaultJSCommon", "onDownloadStart,campaign:" + campaign);
        }

        public void onDownloadFinish(Campaign campaign) {
            C8672v.m24874a("DefaultJSCommon", "onDownloadFinish,campaign:" + campaign);
        }

        public void onDownloadProgress(int i) {
            C8672v.m24874a("DefaultJSCommon", "onDownloadProgress,progress:" + i);
        }

        /* renamed from: a */
        public void mo62632a() {
            C8672v.m24874a("DefaultJSCommon", "onInitSuccess");
        }

        /* renamed from: a */
        public void mo62634a(boolean z) {
            C8672v.m24874a("DefaultJSCommon", "onStartInstall");
        }

        /* renamed from: a */
        public void mo62633a(int i, String str) {
            C8672v.m24874a("DefaultJSCommon", "onH5Error,code:" + i + "，msg:" + str);
        }

        /* renamed from: b */
        public void mo62635b() {
            C8672v.m24874a("DefaultJSCommon", "videoLocationReady");
        }
    }
}
