package com.inmobi.media;

import android.content.ContentValues;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.browser.trusted.sharing.ShareTarget;
import com.inmobi.media.C6074ft;
import com.inmobi.media.C6094fv;
import com.inmobi.media.C6161hf;
import com.inmobi.media.C6200ih;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.inmobi.media.bn */
/* compiled from: ClickManager */
public class C5820bn implements C6094fv.C6097c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f14640a = C5820bn.class.getSimpleName();

    /* renamed from: b */
    private static ExecutorService f14641b;

    /* renamed from: c */
    private static C5829b f14642c;

    /* renamed from: d */
    private static HandlerThread f14643d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static List<C5818bl> f14644e = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static C5819bm f14645f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static AtomicBoolean f14646g = new AtomicBoolean(false);
    /* access modifiers changed from: private */

    /* renamed from: h */
    public static C6074ft.C6083e f14647h;

    /* renamed from: i */
    private static final Object f14648i = new Object();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public long f14649j = 0;

    /* renamed from: k */
    private HashMap<Integer, C5817bk> f14650k = new HashMap<>();
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final C5838e f14651l = new C5838e() {
        /* renamed from: a */
        public final void mo34800a(C5818bl blVar) {
            if (blVar != null) {
                String unused = C5820bn.f14640a;
                C5820bn.m17368a(C5820bn.this, blVar);
                C5819bm unused2 = C5820bn.f14645f;
                C5819bm.m17359a(blVar);
            }
        }

        /* renamed from: a */
        public final void mo34801a(C5818bl blVar, int i) {
            if (blVar != null) {
                String unused = C5820bn.f14640a;
                if (blVar.f14634f == 0) {
                    C5820bn.this.mo34790a(blVar, "NetworkError.ErrorCode ".concat(String.valueOf(i)));
                }
                C5820bn.m17367a(blVar);
                C5820bn.this.mo34794b();
            }
        }
    };

    /* renamed from: com.inmobi.media.bn$a */
    /* compiled from: ClickManager */
    static class C5828a {

        /* renamed from: a */
        static final C5820bn f14669a = new C5820bn();
    }

    /* renamed from: com.inmobi.media.bn$e */
    /* compiled from: ClickManager */
    interface C5838e {
        /* renamed from: a */
        void mo34800a(C5818bl blVar);

        /* renamed from: a */
        void mo34801a(C5818bl blVar, int i);
    }

    /* renamed from: a */
    public static C5820bn m17365a() {
        return C5828a.f14669a;
    }

    /* renamed from: a */
    public void mo34420a(C6093fu fuVar) {
        f14647h = ((C6074ft) fuVar).imai;
    }

    /* renamed from: b */
    public void mo34794b() {
        try {
            if (C6196id.m18389a()) {
                synchronized (f14648i) {
                    if (f14646g.compareAndSet(false, true)) {
                        if (f14643d == null) {
                            HandlerThread handlerThread = new HandlerThread("pingHandlerThread");
                            f14643d = handlerThread;
                            handlerThread.start();
                        }
                        if (f14642c == null) {
                            f14642c = new C5829b(f14643d.getLooper());
                        }
                        if (C5819bm.m17360a()) {
                            f14646g.set(false);
                            m17378i();
                        } else {
                            Message obtain = Message.obtain();
                            obtain.what = 1;
                            f14642c.sendMessage(obtain);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public void mo34792a(String str, boolean z) {
        mo34793a(str, z, (C5817bk) null);
    }

    /* renamed from: a */
    public void mo34793a(final String str, final boolean z, final C5817bk bkVar) {
        new Thread() {
            public final void run() {
                try {
                    if (!((C6115gg) C6094fv.m18084a("root", C6183hw.m18332f(), (C6094fv.C6097c) null)).mo35305i()) {
                        C5818bl blVar = new C5818bl(str, z, false, C5820bn.f14647h.maxRetries + 1);
                        String unused = C5820bn.f14640a;
                        C5820bn.m17369a(C5820bn.this, blVar, bkVar);
                    }
                } catch (Exception unused2) {
                    String unused3 = C5820bn.f14640a;
                }
            }
        }.start();
    }

    /* renamed from: a */
    public void mo34791a(String str, Map<String, String> map, boolean z, C5817bk bkVar) {
        final String str2 = str;
        final Map<String, String> map2 = map;
        final boolean z2 = z;
        final C5817bk bkVar2 = bkVar;
        new Thread() {
            public final void run() {
                try {
                    if (!((C6115gg) C6094fv.m18084a("root", C6183hw.m18332f(), (C6094fv.C6097c) null)).mo35305i()) {
                        C5818bl blVar = new C5818bl(str2, (Map<String, String>) map2, z2, C5820bn.f14647h.maxRetries + 1);
                        String unused = C5820bn.f14640a;
                        C5820bn.m17369a(C5820bn.this, blVar, bkVar2);
                    }
                } catch (Exception e) {
                    String unused2 = C5820bn.f14640a;
                    C6130gj.m18161a().mo35310a(new C6167hk(e));
                }
            }
        }.start();
    }

    /* renamed from: b */
    public void mo34795b(final String str, final boolean z) {
        new Thread() {
            public final void run() {
                try {
                    if (!((C6115gg) C6094fv.m18084a("root", C6183hw.m18332f(), (C6094fv.C6097c) null)).mo35305i()) {
                        C5818bl blVar = new C5818bl(str, z, true, C5820bn.f14647h.maxRetries + 1);
                        String unused = C5820bn.f14640a;
                        C5820bn.m17369a(C5820bn.this, blVar, (C5817bk) null);
                    }
                } catch (Exception unused2) {
                    String unused3 = C5820bn.f14640a;
                }
            }
        }.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static void m17378i() {
        try {
            f14646g.set(false);
            synchronized (f14648i) {
                if (!f14646g.get() && f14643d != null) {
                    f14643d.getLooper().quit();
                    f14643d.interrupt();
                    f14643d = null;
                    f14642c = null;
                }
            }
        } catch (Exception unused) {
        }
    }

    public C5820bn() {
        try {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 5, TimeUnit.SECONDS, new LinkedBlockingQueue(), new C6194ib(f14640a));
            threadPoolExecutor.allowCoreThreadTimeOut(true);
            f14641b = threadPoolExecutor;
            HandlerThread handlerThread = new HandlerThread("pingHandlerThread");
            f14643d = handlerThread;
            handlerThread.start();
            f14642c = new C5829b(f14643d.getLooper());
            f14647h = ((C6074ft) C6094fv.m18084a(CampaignUnit.JSON_KEY_ADS, C6183hw.m18332f(), this)).imai;
            f14645f = new C5819bm();
            C6200ih.m18408a().mo35421a((C6200ih.C6204c) new C6200ih.C6204c() {
                /* renamed from: a */
                public final void mo34782a(boolean z) {
                    if (z) {
                        C5820bn.this.mo34794b();
                    }
                }
            });
            if (Build.VERSION.SDK_INT >= 23) {
                C6200ih.m18408a().mo35422a("android.os.action.DEVICE_IDLE_MODE_CHANGED", (C6200ih.C6204c) new C6200ih.C6204c() {
                    /* renamed from: a */
                    public final void mo34782a(boolean z) {
                        if (!z) {
                            C5820bn.this.mo34794b();
                        }
                    }
                });
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo34790a(C5818bl blVar, String str) {
        C5817bk bkVar = this.f14650k.get(Integer.valueOf(blVar.f14629a));
        if (bkVar != null) {
            bkVar.mo34375a(str);
        }
        this.f14650k.remove(Integer.valueOf(blVar.f14629a));
    }

    /* renamed from: com.inmobi.media.bn$d */
    /* compiled from: ClickManager */
    static final class C5837d {

        /* renamed from: a */
        private C5838e f14684a;

        public C5837d(C5838e eVar) {
            this.f14684a = eVar;
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0068 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo34815a(com.inmobi.media.C5818bl r8) {
            /*
                r7 = this;
                com.inmobi.media.ha r0 = new com.inmobi.media.ha     // Catch:{ Exception -> 0x00a1 }
                java.lang.String r1 = "GET"
                java.lang.String r2 = r8.f14630b     // Catch:{ Exception -> 0x00a1 }
                r0.<init>(r1, r2)     // Catch:{ Exception -> 0x00a1 }
                java.util.HashMap r1 = com.inmobi.media.C5820bn.m17372c(r8)     // Catch:{ Exception -> 0x00a1 }
                boolean r2 = r1.isEmpty()     // Catch:{ Exception -> 0x00a1 }
                if (r2 != 0) goto L_0x0016
                r0.mo35338a((java.util.Map<java.lang.String, java.lang.String>) r1)     // Catch:{ Exception -> 0x00a1 }
            L_0x0016:
                r1 = 0
                r0.f15539t = r1     // Catch:{ Exception -> 0x00a1 }
                r0.f15534o = r1     // Catch:{ Exception -> 0x00a1 }
                java.util.Map<java.lang.String, java.lang.String> r1 = r8.f14631c     // Catch:{ Exception -> 0x00a1 }
                r0.mo35340b(r1)     // Catch:{ Exception -> 0x00a1 }
                boolean r1 = r8.f14637i     // Catch:{ Exception -> 0x00a1 }
                r0.f15533n = r1     // Catch:{ Exception -> 0x00a1 }
                com.inmobi.media.ft$e r1 = com.inmobi.media.C5820bn.f14647h     // Catch:{ Exception -> 0x00a1 }
                int r1 = r1.pingTimeout     // Catch:{ Exception -> 0x00a1 }
                int r1 = r1 * 1000
                r0.f15531l = r1     // Catch:{ Exception -> 0x00a1 }
                com.inmobi.media.ft$e r1 = com.inmobi.media.C5820bn.f14647h     // Catch:{ Exception -> 0x00a1 }
                int r1 = r1.pingTimeout     // Catch:{ Exception -> 0x00a1 }
                int r1 = r1 * 1000
                r0.f15532m = r1     // Catch:{ Exception -> 0x00a1 }
                long r1 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x00a1 }
                com.inmobi.media.hd r3 = new com.inmobi.media.hd     // Catch:{ Exception -> 0x00a1 }
                r3.<init>(r0)     // Catch:{ Exception -> 0x00a1 }
                com.inmobi.media.hb r3 = r3.mo35353a()     // Catch:{ Exception -> 0x00a1 }
                com.inmobi.media.je r4 = com.inmobi.media.C6244je.m18561a()     // Catch:{ Exception -> 0x0068 }
                long r5 = r0.mo35347g()     // Catch:{ Exception -> 0x0068 }
                r4.mo35474a(r5)     // Catch:{ Exception -> 0x0068 }
                com.inmobi.media.je r0 = com.inmobi.media.C6244je.m18561a()     // Catch:{ Exception -> 0x0068 }
                long r4 = r3.mo35352d()     // Catch:{ Exception -> 0x0068 }
                r0.mo35475b(r4)     // Catch:{ Exception -> 0x0068 }
                com.inmobi.media.je r0 = com.inmobi.media.C6244je.m18561a()     // Catch:{ Exception -> 0x0068 }
                long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Exception -> 0x0068 }
                long r4 = r4 - r1
                r0.mo35476c(r4)     // Catch:{ Exception -> 0x0068 }
                goto L_0x006b
            L_0x0068:
                java.lang.String unused = com.inmobi.media.C5820bn.f14640a     // Catch:{ Exception -> 0x00a1 }
            L_0x006b:
                boolean r0 = r3.mo35349a()     // Catch:{ Exception -> 0x00a1 }
                if (r0 == 0) goto L_0x009b
                com.inmobi.media.gz r0 = r3.f15541a     // Catch:{ Exception -> 0x00a1 }
                int r0 = r0.f15517a     // Catch:{ Exception -> 0x00a1 }
                r1 = -9
                if (r1 != r0) goto L_0x007f
                com.inmobi.media.bn$e r0 = r7.f14684a     // Catch:{ Exception -> 0x00a1 }
                r0.mo34800a(r8)     // Catch:{ Exception -> 0x00a1 }
                return
            L_0x007f:
                boolean r1 = r8.f14637i     // Catch:{ Exception -> 0x00a1 }
                if (r1 != 0) goto L_0x0091
                r1 = 303(0x12f, float:4.25E-43)
                if (r1 == r0) goto L_0x008b
                r1 = 302(0x12e, float:4.23E-43)
                if (r1 != r0) goto L_0x0091
            L_0x008b:
                com.inmobi.media.bn$e r0 = r7.f14684a     // Catch:{ Exception -> 0x00a1 }
                r0.mo34800a(r8)     // Catch:{ Exception -> 0x00a1 }
                return
            L_0x0091:
                com.inmobi.media.bn$e r0 = r7.f14684a     // Catch:{ Exception -> 0x00a1 }
                com.inmobi.media.gz r1 = r3.f15541a     // Catch:{ Exception -> 0x00a1 }
                int r1 = r1.f15517a     // Catch:{ Exception -> 0x00a1 }
                r0.mo34801a(r8, r1)     // Catch:{ Exception -> 0x00a1 }
                return
            L_0x009b:
                com.inmobi.media.bn$e r0 = r7.f14684a     // Catch:{ Exception -> 0x00a1 }
                r0.mo34800a(r8)     // Catch:{ Exception -> 0x00a1 }
                return
            L_0x00a1:
                java.lang.String unused = com.inmobi.media.C5820bn.f14640a
                com.inmobi.media.bn$e r0 = r7.f14684a
                com.inmobi.media.gz r1 = new com.inmobi.media.gz
                r2 = -1
                java.lang.String r3 = "Unknown error"
                r1.<init>(r2, r3)
                int r1 = r1.f15517a
                r0.mo34801a(r8, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5820bn.C5837d.mo34815a(com.inmobi.media.bl):void");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static HashMap<String, String> m17372c(C5818bl blVar) {
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            int i = (f14647h.maxRetries - blVar.f14634f) + 1;
            if (i > 0) {
                hashMap.put("X-im-retry-count", String.valueOf(i));
            }
        } catch (Exception unused) {
        }
        return hashMap;
    }

    /* renamed from: com.inmobi.media.bn$c */
    /* compiled from: ClickManager */
    static final class C5832c {

        /* renamed from: a */
        C5838e f14673a;

        public C5832c(C5838e eVar) {
            this.f14673a = eVar;
        }

        /* renamed from: a */
        public final void mo34803a(final C5818bl blVar) {
            blVar.f14635g.set(false);
            final Handler handler = new Handler(Looper.getMainLooper());
            handler.post(new Runnable() {
                public final void run() {
                    C6156ha haVar = new C6156ha(ShareTarget.METHOD_GET, blVar.f14630b);
                    haVar.f15539t = false;
                    haVar.f15534o = false;
                    HashMap b = C5820bn.m17372c(blVar);
                    if (!b.isEmpty()) {
                        haVar.mo35338a((Map<String, String>) b);
                    }
                    C6161hf hfVar = new C6161hf(haVar, new WebViewClient() {

                        /* renamed from: a */
                        AtomicBoolean f14677a = new AtomicBoolean(false);

                        /* renamed from: b */
                        boolean f14678b;

                        /* renamed from: c */
                        boolean f14679c;

                        public final void onPageStarted(final WebView webView, String str, Bitmap bitmap) {
                            this.f14679c = true;
                            this.f14678b = false;
                            new Thread(new Runnable() {
                                public final void run() {
                                    try {
                                        Thread.sleep((long) (C5820bn.f14647h.pingTimeout * 1000));
                                    } catch (InterruptedException unused) {
                                    }
                                    if (!C58341.this.f14677a.get()) {
                                        String unused2 = C5820bn.f14640a;
                                        blVar.f14635g.set(true);
                                        handler.post(new Runnable() {
                                            public final void run() {
                                                try {
                                                    C6161hf.C6162a aVar = (C6161hf.C6162a) webView;
                                                    if (aVar != null && !aVar.f15556a) {
                                                        webView.stopLoading();
                                                    }
                                                } catch (Throwable th) {
                                                    C6130gj.m18161a().mo35310a(new C6167hk(th));
                                                }
                                            }
                                        });
                                        C5832c.this.f14673a.mo34801a(blVar, -1);
                                    }
                                }
                            }).start();
                        }

                        public final void onPageFinished(WebView webView, String str) {
                            this.f14677a.set(true);
                            if (!this.f14678b && !blVar.f14635g.get()) {
                                C5832c.this.f14673a.mo34800a(blVar);
                            }
                        }

                        public final void onReceivedError(WebView webView, int i, String str, String str2) {
                            this.f14678b = true;
                            C5832c.this.f14673a.mo34801a(blVar, -1);
                        }

                        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                            this.f14678b = true;
                            C5832c.this.f14673a.mo34801a(blVar, -1);
                        }

                        public final void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                            this.f14678b = true;
                            C5832c.this.f14673a.mo34801a(blVar, -1);
                        }

                        public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
                            return Build.VERSION.SDK_INT >= 21 && !blVar.f14637i && !webResourceRequest.getUrl().toString().equals(blVar.f14630b);
                        }

                        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                            return !blVar.f14637i && !str.equals(blVar.f14630b);
                        }

                        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                            if (Build.VERSION.SDK_INT < 26) {
                                return false;
                            }
                            webView.destroy();
                            return true;
                        }
                    });
                    try {
                        hfVar.f15555c = new C6161hf.C6162a(hfVar, C6183hw.m18324c());
                        hfVar.f15555c.setWebViewClient(hfVar.f15554b);
                        hfVar.f15555c.getSettings().setJavaScriptEnabled(true);
                        hfVar.f15555c.getSettings().setCacheMode(2);
                        hfVar.f15555c.loadUrl(hfVar.f15553a.mo35345e(), hfVar.f15553a.mo35343d());
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    /* renamed from: com.inmobi.media.bn$b */
    /* compiled from: ClickManager */
    final class C5829b extends Handler {
        public C5829b(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            Message message2 = message;
            try {
                int i = message2.what;
                int i2 = 3;
                if (i == 1) {
                    String str = null;
                    if (!((C6115gg) C6094fv.m18084a("root", C6183hw.m18332f(), (C6094fv.C6097c) null)).mo35305i()) {
                        C5819bm unused = C5820bn.f14645f;
                        int i3 = C5820bn.f14647h.maxEventBatch;
                        int i4 = C5820bn.f14647h.pingInterval;
                        ArrayList arrayList = new ArrayList();
                        C6164hh a = C6164hh.m18246a();
                        if (a.mo35357a("click") != 0) {
                            if (-1 != i3) {
                                str = Integer.toString(i3);
                            }
                            List<ContentValues> a2 = a.mo35360a("click", C5819bm.f14638a, (String) null, (String[]) null, CampaignEx.JSON_KEY_ST_TS, "ts < " + (System.currentTimeMillis() - ((long) i4)), "ts ASC ", str);
                            a.mo35365b();
                            for (ContentValues a3 : a2) {
                                arrayList.add(C5819bm.m17357a(a3));
                            }
                        }
                        List unused2 = C5820bn.f14644e = arrayList;
                        if (C5820bn.f14644e.isEmpty()) {
                            C5819bm unused3 = C5820bn.f14645f;
                            if (C5819bm.m17360a()) {
                                C5820bn.f14646g.set(false);
                                return;
                            }
                            Message obtain = Message.obtain();
                            obtain.what = 1;
                            sendMessageDelayed(obtain, (long) (C5820bn.f14647h.pingInterval * 1000));
                            return;
                        }
                        String unused4 = C5820bn.f14640a;
                        Iterator it = C5820bn.f14644e.iterator();
                        while (it.hasNext()) {
                            it.next();
                            String unused5 = C5820bn.f14640a;
                        }
                        C5818bl blVar = (C5818bl) C5820bn.f14644e.get(0);
                        Message obtain2 = Message.obtain();
                        obtain2.what = blVar.f14636h ? 3 : 2;
                        obtain2.obj = blVar;
                        long currentTimeMillis = System.currentTimeMillis() - blVar.f14632d;
                        if (currentTimeMillis < ((long) (C5820bn.f14647h.pingInterval * 1000))) {
                            sendMessageDelayed(obtain2, ((long) (C5820bn.f14647h.pingInterval * 1000)) - currentTimeMillis);
                        } else {
                            sendMessage(obtain2);
                        }
                    }
                } else if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            String unused6 = C5820bn.f14640a;
                            int i5 = message2.what;
                            return;
                        }
                        C5818bl blVar2 = (C5818bl) message2.obj;
                        String unused7 = C5820bn.f14640a;
                        C5820bn.m17368a(C5820bn.this, blVar2);
                        C5819bm unused8 = C5820bn.f14645f;
                        C5819bm.m17359a(blVar2);
                        C5820bn.f14644e.remove(blVar2);
                        if (C5820bn.f14644e.isEmpty()) {
                            C5819bm unused9 = C5820bn.f14645f;
                            if (C5819bm.m17360a()) {
                                String unused10 = C5820bn.f14640a;
                                C5820bn.f14646g.set(false);
                                return;
                            }
                            Message obtain3 = Message.obtain();
                            obtain3.what = 1;
                            sendMessage(obtain3);
                            return;
                        }
                        C5818bl blVar3 = (C5818bl) C5820bn.f14644e.get(0);
                        Message obtain4 = Message.obtain();
                        if (!blVar3.f14636h) {
                            i2 = 2;
                        }
                        obtain4.what = i2;
                        obtain4.obj = blVar3;
                        sendMessage(obtain4);
                    } else if (!C6196id.m18389a()) {
                        C5820bn.f14646g.set(false);
                        C5820bn.m17378i();
                    } else {
                        C5818bl blVar4 = (C5818bl) message2.obj;
                        if (blVar4.f14634f != 0) {
                            if (!blVar4.mo34788a(C5820bn.f14647h.pingCacheExpiry)) {
                                if ((C5820bn.f14647h.maxRetries - blVar4.f14634f) + 1 == 0) {
                                    String unused11 = C5820bn.f14640a;
                                } else {
                                    String unused12 = C5820bn.f14640a;
                                }
                                new C5832c(new C5838e() {
                                    /* renamed from: a */
                                    public final void mo34800a(C5818bl blVar) {
                                        C5829b.m17391a(C5829b.this, blVar);
                                    }

                                    /* renamed from: a */
                                    public final void mo34801a(C5818bl blVar, int i) {
                                        String unused = C5820bn.f14640a;
                                        C5820bn.m17367a(blVar);
                                        C5829b.this.m17392b(blVar);
                                    }
                                }).mo34803a(blVar4);
                                return;
                            }
                        }
                        m17390a(blVar4);
                    }
                } else if (!C6196id.m18389a()) {
                    C5820bn.f14646g.set(false);
                    C5820bn.m17378i();
                } else {
                    C5818bl blVar5 = (C5818bl) message2.obj;
                    if (blVar5.f14634f != 0) {
                        if (!blVar5.mo34788a(C5820bn.f14647h.pingCacheExpiry)) {
                            if ((C5820bn.f14647h.maxRetries - blVar5.f14634f) + 1 == 0) {
                                String unused13 = C5820bn.f14640a;
                            } else {
                                String unused14 = C5820bn.f14640a;
                            }
                            new C5837d(new C5838e() {
                                /* renamed from: a */
                                public final void mo34800a(C5818bl blVar) {
                                    C5829b.m17391a(C5829b.this, blVar);
                                }

                                /* renamed from: a */
                                public final void mo34801a(C5818bl blVar, int i) {
                                    String unused = C5820bn.f14640a;
                                    C5820bn.m17367a(blVar);
                                    C5829b.this.m17392b(blVar);
                                }
                            }).mo34815a(blVar5);
                            return;
                        }
                    }
                    m17390a(blVar5);
                }
            } catch (Exception unused15) {
                String unused16 = C5820bn.f14640a;
            }
        }

        /* renamed from: a */
        private void m17390a(C5818bl blVar) {
            String unused = C5820bn.f14640a;
            m17392b(blVar);
            C5820bn.this.mo34790a(blVar, "RETRY_EXHAUSTED");
            C5819bm unused2 = C5820bn.f14645f;
            C5819bm.m17359a(blVar);
            C5820bn.f14644e.remove(blVar);
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m17392b(C5818bl blVar) {
            int indexOf = C5820bn.f14644e.indexOf(blVar);
            if (-1 != indexOf) {
                C5818bl blVar2 = (C5818bl) C5820bn.f14644e.get(indexOf == C5820bn.f14644e.size() + -1 ? 0 : indexOf + 1);
                Message obtain = Message.obtain();
                obtain.what = blVar2.f14636h ? 3 : 2;
                obtain.obj = blVar2;
                if (System.currentTimeMillis() - blVar2.f14632d < ((long) (C5820bn.f14647h.pingInterval * 1000))) {
                    sendMessageDelayed(obtain, (long) (C5820bn.f14647h.pingInterval * 1000));
                } else {
                    sendMessage(obtain);
                }
            }
        }

        /* renamed from: a */
        static /* synthetic */ void m17391a(C5829b bVar, C5818bl blVar) {
            Message obtain = Message.obtain();
            obtain.what = 4;
            obtain.obj = blVar;
            bVar.sendMessage(obtain);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m17369a(C5820bn bnVar, final C5818bl blVar, C5817bk bkVar) {
        f14645f.mo34789a(blVar, f14647h.maxDbEvents);
        if (bkVar != null) {
            bnVar.f14650k.put(Integer.valueOf(blVar.f14629a), bkVar);
        }
        if (!C6196id.m18389a()) {
            f14646g.set(false);
            m17378i();
            return;
        }
        f14641b.submit(new Runnable() {
            public final void run() {
                long unused = C5820bn.this.f14649j = SystemClock.elapsedRealtime();
                if (blVar.f14636h) {
                    new C5832c(C5820bn.this.f14651l).mo34803a(blVar);
                } else {
                    new C5837d(C5820bn.this.f14651l).mo34815a(blVar);
                }
            }
        });
    }

    /* renamed from: a */
    static /* synthetic */ void m17368a(C5820bn bnVar, C5818bl blVar) {
        C5817bk bkVar = bnVar.f14650k.get(Integer.valueOf(blVar.f14629a));
        if (bkVar != null) {
            bkVar.mo34374a();
        }
        bnVar.f14650k.remove(Integer.valueOf(blVar.f14629a));
    }

    /* renamed from: a */
    static /* synthetic */ void m17367a(C5818bl blVar) {
        if (blVar.f14634f > 0) {
            blVar.f14634f--;
            blVar.f14632d = System.currentTimeMillis();
            C6164hh a = C6164hh.m18246a();
            a.mo35363b("click", C5819bm.m17361b(blVar), "id = ?", new String[]{String.valueOf(blVar.f14629a)});
            a.mo35365b();
        }
    }
}
