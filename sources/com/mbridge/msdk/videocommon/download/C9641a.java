package com.mbridge.msdk.videocommon.download;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.download.DownloadError;
import com.mbridge.msdk.foundation.download.DownloadMessage;
import com.mbridge.msdk.foundation.download.DownloadPriority;
import com.mbridge.msdk.foundation.download.DownloadResourceType;
import com.mbridge.msdk.foundation.download.DownloadStatus;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.OnDownloadStateListener;
import com.mbridge.msdk.foundation.download.OnProgressStateListener;
import com.mbridge.msdk.foundation.download.core.DownloadRequest;
import com.mbridge.msdk.foundation.entity.C8467l;
import com.mbridge.msdk.foundation.entity.C8468m;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p298db.C8412f;
import com.mbridge.msdk.foundation.p298db.C8414g;
import com.mbridge.msdk.foundation.p298db.C8422o;
import com.mbridge.msdk.foundation.p298db.C8423p;
import com.mbridge.msdk.foundation.same.C8469a;
import com.mbridge.msdk.foundation.same.net.C8532e;
import com.mbridge.msdk.foundation.same.net.p311f.C8543d;
import com.mbridge.msdk.foundation.same.net.p312g.C8550d;
import com.mbridge.msdk.foundation.same.p301b.C8476c;
import com.mbridge.msdk.foundation.same.p301b.C8478e;
import com.mbridge.msdk.foundation.same.report.C8574b;
import com.mbridge.msdk.foundation.same.report.C8598e;
import com.mbridge.msdk.foundation.same.report.p316d.C8596a;
import com.mbridge.msdk.foundation.tools.C8617ae;
import com.mbridge.msdk.foundation.tools.C8665s;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.p078c.C2440a;
import com.mbridge.msdk.p078c.C2445b;
import com.mbridge.msdk.videocommon.listener.C9673a;
import com.mbridge.msdk.videocommon.p372a.C9627a;
import com.mbridge.msdk.videocommon.p375d.C9638b;
import java.io.File;
import java.io.Serializable;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.mbridge.msdk.videocommon.download.a */
/* compiled from: CampaignDownLoadTask */
public final class C9641a implements Serializable {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public boolean f23991A;

    /* renamed from: B */
    private int f23992B;

    /* renamed from: C */
    private File f23993C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public int f23994D = 1;

    /* renamed from: E */
    private int f23995E;

    /* renamed from: F */
    private int f23996F;

    /* renamed from: G */
    private int f23997G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public volatile boolean f23998H = false;

    /* renamed from: I */
    private boolean f23999I = false;

    /* renamed from: J */
    private OnDownloadStateListener f24000J = new OnDownloadStateListener() {
        public final void onDownloadStart(DownloadMessage downloadMessage) {
            int unused = C9641a.this.f24006e = 1;
            if (C9641a.this.f24022u == null) {
                C8422o unused2 = C9641a.this.f24022u = C8422o.m24014a((C8412f) C8414g.m23969a(C8388a.m23845e().mo56913g()));
            }
            C9641a.this.f24022u.mo57048a(C9641a.this.f24010i, C9641a.this.f24013l, C9641a.this.f24017p, C9641a.this.f24006e);
        }

        public final void onDownloadComplete(DownloadMessage downloadMessage) {
            try {
                C8672v.m24878d("CampaignDownLoadTask", "onDownloadComplete callback : " + C9641a.this.f24016o + "    " + C9641a.this.f24013l);
                if (C9641a.this.f24022u == null) {
                    C8422o unused = C9641a.this.f24022u = C8422o.m24014a((C8412f) C8414g.m23969a(C8388a.m23845e().mo56913g()));
                }
                C9641a.this.f24022u.mo57049a(C9641a.this.f24014m, C9641a.this.f24016o, 5);
                String videoMD5Value = C9641a.this.f24010i.getVideoMD5Value();
                if (!TextUtils.isEmpty(videoMD5Value)) {
                    try {
                        if (videoMD5Value.equals(C8665s.m24854a(new File(C9641a.this.f24015n)))) {
                            C9641a.this.mo63622a(C9641a.this.f24016o, true);
                            C9641a.this.m27473c(C9641a.this.m27477f(3));
                            return;
                        }
                    } catch (Throwable th) {
                        C8672v.m24875a("CampaignDownLoadTask", th.getMessage(), th);
                    }
                    C9641a.this.mo63626a("Video download complete but MD5 check failed");
                    return;
                }
                C9641a.this.mo63622a(C9641a.this.f24016o, false);
                C9641a.this.m27473c(C9641a.this.m27477f(3));
            } catch (Exception e) {
                C8672v.m24878d("CampaignDownLoadTask", e.getMessage());
            }
        }

        public final void onDownloadError(DownloadMessage downloadMessage, DownloadError downloadError) {
            if (C9641a.this.f24025x != null && C9641a.this.f24025x.getStatus() != DownloadStatus.CANCELLED) {
                String message = (downloadError == null || downloadError.getException() == null) ? "Video Download Error" : downloadError.getException().getMessage();
                C9641a.this.m27489p();
                C9641a.this.m27462a(3, message);
                C9641a.this.mo63626a(message);
            }
        }
    };

    /* renamed from: K */
    private OnProgressStateListener f24001K = new OnProgressStateListener() {
        /* JADX WARNING: Can't wrap try/catch for region: R(7:0|1|2|(2:4|(1:8))|9|10|(2:15|(4:17|(1:19)|20|(1:34)(2:27|35))(1:32))(1:31)) */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x00db, code lost:
            r6 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x00dc, code lost:
            com.mbridge.msdk.foundation.tools.C8672v.m24878d("CampaignDownLoadTask", r6.getMessage());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0027 */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0059 A[Catch:{ Exception -> 0x00db }] */
        /* JADX WARNING: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void onProgress(com.mbridge.msdk.foundation.download.DownloadMessage r6, com.mbridge.msdk.foundation.download.DownloadProgress r7) {
            /*
                r5 = this;
                java.lang.String r0 = "CampaignDownLoadTask"
                r1 = 1
                com.mbridge.msdk.videocommon.download.a r2 = com.mbridge.msdk.videocommon.download.C9641a.this     // Catch:{ Exception -> 0x0027 }
                boolean r2 = r2.f23998H     // Catch:{ Exception -> 0x0027 }
                if (r2 != 0) goto L_0x0027
                java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x0027 }
                com.mbridge.msdk.videocommon.download.a r3 = com.mbridge.msdk.videocommon.download.C9641a.this     // Catch:{ Exception -> 0x0027 }
                java.lang.String r3 = r3.f24017p     // Catch:{ Exception -> 0x0027 }
                r2.<init>(r3)     // Catch:{ Exception -> 0x0027 }
                boolean r3 = r2.exists()     // Catch:{ Exception -> 0x0027 }
                if (r3 == 0) goto L_0x0027
                boolean r2 = r2.isFile()     // Catch:{ Exception -> 0x0027 }
                if (r2 == 0) goto L_0x0027
                com.mbridge.msdk.videocommon.download.a r2 = com.mbridge.msdk.videocommon.download.C9641a.this     // Catch:{ Exception -> 0x0027 }
                boolean unused = r2.f23998H = r1     // Catch:{ Exception -> 0x0027 }
            L_0x0027:
                com.mbridge.msdk.videocommon.download.a r2 = com.mbridge.msdk.videocommon.download.C9641a.this     // Catch:{ Exception -> 0x00db }
                long r3 = r7.getCurrent()     // Catch:{ Exception -> 0x00db }
                long unused = r2.f24016o = r3     // Catch:{ Exception -> 0x00db }
                com.mbridge.msdk.videocommon.download.a r2 = com.mbridge.msdk.videocommon.download.C9641a.this     // Catch:{ Exception -> 0x00db }
                long r3 = r7.getTotal()     // Catch:{ Exception -> 0x00db }
                long unused = r2.f24013l = r3     // Catch:{ Exception -> 0x00db }
                com.mbridge.msdk.videocommon.download.a r2 = com.mbridge.msdk.videocommon.download.C9641a.this     // Catch:{ Exception -> 0x00db }
                int r3 = r7.getCurrentDownloadRate()     // Catch:{ Exception -> 0x00db }
                int unused = r2.f24027z = r3     // Catch:{ Exception -> 0x00db }
                com.mbridge.msdk.videocommon.download.a r2 = com.mbridge.msdk.videocommon.download.C9641a.this     // Catch:{ Exception -> 0x00db }
                int r2 = r2.f24020s     // Catch:{ Exception -> 0x00db }
                r3 = 100
                if (r2 != r3) goto L_0x004d
                return
            L_0x004d:
                int r2 = r7.getCurrentDownloadRate()     // Catch:{ Exception -> 0x00db }
                com.mbridge.msdk.videocommon.download.a r3 = com.mbridge.msdk.videocommon.download.C9641a.this     // Catch:{ Exception -> 0x00db }
                int r3 = r3.f24020s     // Catch:{ Exception -> 0x00db }
                if (r2 < r3) goto L_0x00e3
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00db }
                r2.<init>()     // Catch:{ Exception -> 0x00db }
                java.lang.String r3 = "Rate : "
                r2.append(r3)     // Catch:{ Exception -> 0x00db }
                int r3 = r7.getCurrentDownloadRate()     // Catch:{ Exception -> 0x00db }
                r2.append(r3)     // Catch:{ Exception -> 0x00db }
                java.lang.String r3 = " ReadyRate & cdRate = "
                r2.append(r3)     // Catch:{ Exception -> 0x00db }
                com.mbridge.msdk.videocommon.download.a r3 = com.mbridge.msdk.videocommon.download.C9641a.this     // Catch:{ Exception -> 0x00db }
                int r3 = r3.f24020s     // Catch:{ Exception -> 0x00db }
                r2.append(r3)     // Catch:{ Exception -> 0x00db }
                java.lang.String r3 = " "
                r2.append(r3)     // Catch:{ Exception -> 0x00db }
                com.mbridge.msdk.videocommon.download.a r3 = com.mbridge.msdk.videocommon.download.C9641a.this     // Catch:{ Exception -> 0x00db }
                int r3 = r3.f24004c     // Catch:{ Exception -> 0x00db }
                r2.append(r3)     // Catch:{ Exception -> 0x00db }
                java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00db }
                com.mbridge.msdk.foundation.tools.C8672v.m24878d(r0, r2)     // Catch:{ Exception -> 0x00db }
                com.mbridge.msdk.videocommon.download.a r2 = com.mbridge.msdk.videocommon.download.C9641a.this     // Catch:{ Exception -> 0x00db }
                boolean r2 = r2.f24005d     // Catch:{ Exception -> 0x00db }
                if (r2 != 0) goto L_0x00e3
                com.mbridge.msdk.videocommon.download.a r2 = com.mbridge.msdk.videocommon.download.C9641a.this     // Catch:{ Exception -> 0x00db }
                boolean unused = r2.f24005d = r1     // Catch:{ Exception -> 0x00db }
                com.mbridge.msdk.videocommon.download.a r2 = com.mbridge.msdk.videocommon.download.C9641a.this     // Catch:{ Exception -> 0x00db }
                boolean r2 = r2.f23991A     // Catch:{ Exception -> 0x00db }
                if (r2 != 0) goto L_0x00b7
                com.mbridge.msdk.videocommon.download.a r2 = com.mbridge.msdk.videocommon.download.C9641a.this     // Catch:{ Exception -> 0x00db }
                com.mbridge.msdk.videocommon.download.a r3 = com.mbridge.msdk.videocommon.download.C9641a.this     // Catch:{ Exception -> 0x00db }
                java.lang.String r1 = r3.m27477f((int) r1)     // Catch:{ Exception -> 0x00db }
                r2.m27473c((java.lang.String) r1)     // Catch:{ Exception -> 0x00db }
                com.mbridge.msdk.videocommon.download.a r1 = com.mbridge.msdk.videocommon.download.C9641a.this     // Catch:{ Exception -> 0x00db }
                long r2 = r7.getCurrent()     // Catch:{ Exception -> 0x00db }
                r7 = 0
                r1.mo63622a((long) r2, (boolean) r7)     // Catch:{ Exception -> 0x00db }
            L_0x00b7:
                com.mbridge.msdk.videocommon.download.a r7 = com.mbridge.msdk.videocommon.download.C9641a.this     // Catch:{ Exception -> 0x00db }
                com.mbridge.msdk.foundation.download.core.DownloadRequest r7 = r7.f24025x     // Catch:{ Exception -> 0x00db }
                if (r7 == 0) goto L_0x00e3
                com.mbridge.msdk.videocommon.download.a r7 = com.mbridge.msdk.videocommon.download.C9641a.this     // Catch:{ Exception -> 0x00db }
                int r7 = r7.f23994D     // Catch:{ Exception -> 0x00db }
                r1 = 2
                if (r7 == r1) goto L_0x00c9
                return
            L_0x00c9:
                com.mbridge.msdk.videocommon.download.a r7 = com.mbridge.msdk.videocommon.download.C9641a.this     // Catch:{ Exception -> 0x00db }
                boolean r7 = r7.f23991A     // Catch:{ Exception -> 0x00db }
                if (r7 != 0) goto L_0x00e3
                com.mbridge.msdk.videocommon.download.a r7 = com.mbridge.msdk.videocommon.download.C9641a.this     // Catch:{ Exception -> 0x00db }
                com.mbridge.msdk.foundation.download.core.DownloadRequest r7 = r7.f24025x     // Catch:{ Exception -> 0x00db }
                r7.cancel(r6)     // Catch:{ Exception -> 0x00db }
                goto L_0x00e3
            L_0x00db:
                r6 = move-exception
                java.lang.String r6 = r6.getMessage()
                com.mbridge.msdk.foundation.tools.C8672v.m24878d(r0, r6)
            L_0x00e3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.videocommon.download.C9641a.C96432.onProgress(com.mbridge.msdk.foundation.download.DownloadMessage, com.mbridge.msdk.foundation.download.DownloadProgress):void");
        }
    };

    /* renamed from: a */
    private boolean f24002a = false;

    /* renamed from: b */
    private int f24003b = 1;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public int f24004c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f24005d = false;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public volatile int f24006e = 0;

    /* renamed from: f */
    private CopyOnWriteArrayList<C9646d> f24007f = new CopyOnWriteArrayList<>();

    /* renamed from: g */
    private C9673a f24008g;

    /* renamed from: h */
    private C9673a f24009h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public CampaignEx f24010i;

    /* renamed from: j */
    private String f24011j;

    /* renamed from: k */
    private Context f24012k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public long f24013l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public String f24014m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public String f24015n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public long f24016o = 0;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public String f24017p;

    /* renamed from: q */
    private boolean f24018q = false;

    /* renamed from: r */
    private long f24019r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public int f24020s = 100;

    /* renamed from: t */
    private boolean f24021t = false;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public C8422o f24022u;

    /* renamed from: v */
    private boolean f24023v = false;

    /* renamed from: w */
    private String f24024w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public DownloadRequest f24025x;

    /* renamed from: y */
    private DownloadMessage f24026y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public int f24027z;

    public C9641a(Context context, CampaignEx campaignEx, String str, int i) {
        String str2;
        CampaignEx campaignEx2 = campaignEx;
        if (context != null || campaignEx2 != null) {
            C2440a f = C2445b.m6020a().mo16294f(C8388a.m23845e().mo56914h());
            if (f != null) {
                this.f23999I = f.mo16230f();
            }
            this.f23995E = C8469a.f20738B;
            this.f23996F = C8469a.f20739C;
            this.f23997G = C8469a.f20737A;
            this.f24019r = System.currentTimeMillis();
            this.f24012k = C8388a.m23845e().mo56913g();
            this.f24010i = campaignEx2;
            this.f24011j = str;
            this.f24003b = i;
            if (campaignEx2 != null) {
                this.f24014m = campaignEx.getVideoUrlEncode();
            }
            String str3 = this.f24014m;
            if (!TextUtils.isEmpty(str3)) {
                str2 = SameMD5.getMD5(C8617ae.m24719a(str3.trim()));
            } else {
                str2 = "";
            }
            this.f24024w = str2;
            this.f24015n = C8478e.m24306b(C8476c.MBRIDGE_VC) + File.separator;
            this.f24017p = this.f24015n + this.f24024w;
            C8672v.m24876b("CampaignDownLoadTask", this.f24010i.getAppName() + " videoLocalPath:" + this.f24017p + " videoUrl: " + this.f24010i.getVideoUrlEncode() + " " + this.f24020s);
            try {
                if (!TextUtils.isEmpty(this.f24014m)) {
                    File file = null;
                    if (!TextUtils.isEmpty(this.f24015n)) {
                        file = new File(this.f24015n);
                        if (!file.exists()) {
                            file.mkdirs();
                        }
                    }
                    if (file != null && file.exists() && (this.f23993C == null || !this.f23993C.exists())) {
                        File file2 = new File(file + "/.nomedia");
                        this.f23993C = file2;
                        if (!file2.exists()) {
                            this.f23993C.createNewFile();
                        }
                    }
                    C8422o a = C8422o.m24014a((C8412f) C8414g.m23969a(C8388a.m23845e().mo56913g()));
                    C8467l a2 = a.mo57051a(this.f24014m, "");
                    if (a2 != null) {
                        this.f24016o = a2.mo57808b();
                        if (this.f24006e != 2) {
                            this.f24006e = a2.mo57813d();
                        }
                        if (this.f24006e == 1) {
                            this.f24006e = 2;
                        }
                        this.f24013l = (long) a2.mo57812c();
                        if (a2.mo57804a() > 0) {
                            this.f24019r = a2.mo57804a();
                        }
                        if (this.f24006e == 5) {
                            if (new File(this.f24015n + this.f24024w).exists()) {
                                this.f24017p = this.f24015n + this.f24024w;
                            } else {
                                m27486o();
                            }
                        } else if (this.f24006e != 0) {
                            this.f24017p = this.f24015n + this.f24024w;
                        }
                    } else {
                        a.mo57052a(this.f24014m, this.f24019r);
                    }
                    String str4 = this.f24014m;
                    if (TextUtils.isEmpty(str4)) {
                        this.f24009h.mo58774a("VideoUrl is NULL, Please check it.", "");
                    } else if (this.f24006e == 1) {
                        C8672v.m24874a("CampaignDownLoadTask", "Run : Task is RUNNING, Will return.");
                    } else if (this.f24006e == 5) {
                        C8672v.m24874a("CampaignDownLoadTask", "Run : Video Done, Will callback.");
                        if (this.f24008g != null) {
                            this.f24008g.mo58773a(this.f24014m);
                        }
                        if (this.f24009h != null) {
                            this.f24009h.mo58773a(this.f24014m);
                        }
                        try {
                            File file3 = new File(this.f24017p);
                            if (file3.exists() && file3.isFile()) {
                                this.f23998H = true;
                                file3.setLastModified(System.currentTimeMillis());
                            }
                        } catch (Exception e) {
                            C8672v.m24878d("CampaignDownLoadTask", e.getMessage());
                        }
                    } else if (this.f24003b == 3) {
                        C8672v.m24874a("CampaignDownLoadTask", "Run : Dlnet is 3, Will callback.");
                        mo63622a(0, false);
                    } else {
                        if (this.f24010i.getReady_rate() == 0) {
                            if (this.f24008g != null) {
                                this.f24008g.mo58773a(this.f24014m);
                            }
                            if (this.f24009h != null) {
                                this.f24009h.mo58773a(this.f24014m);
                            }
                        }
                        this.f24026y = new DownloadMessage(new Object(), str4, this.f24024w, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_VIDEO);
                        this.f24025x = MBDownloadManager.getInstance().download(this.f24026y).withReadTimeout((long) this.f23995E).withConnectTimeout((long) this.f23997G).withWriteTimeout((long) this.f23996F).withDownloadPriority(DownloadPriority.HIGH).withHttpRetryCounter(3).withDirectoryPathInternal(this.f24015n).withDownloadStateListener(this.f24000J).withProgressStateListener(this.f24001K).with("do_us_fi_re", Boolean.toString(this.f23999I)).build();
                    }
                }
            } catch (Exception e2) {
                C8672v.m24876b("CampaignDownLoadTask", e2.getMessage());
            }
        }
    }

    /* renamed from: a */
    public final String mo63619a() {
        return this.f24014m;
    }

    /* renamed from: a */
    public final void mo63620a(int i) {
        this.f24003b = i;
    }

    /* renamed from: b */
    public final void mo63628b(int i) {
        this.f24004c = i;
    }

    /* renamed from: b */
    public final boolean mo63632b() {
        return this.f24023v;
    }

    /* renamed from: a */
    public final void mo63627a(boolean z) {
        this.f24023v = z;
    }

    /* renamed from: c */
    public final long mo63633c() {
        return this.f24019r;
    }

    /* renamed from: b */
    public final void mo63631b(boolean z) {
        this.f24018q = z;
    }

    /* renamed from: d */
    public final String mo63635d() {
        return this.f24017p;
    }

    /* renamed from: e */
    public final long mo63637e() {
        return this.f24013l;
    }

    /* renamed from: f */
    public final int mo63639f() {
        return this.f24006e;
    }

    /* renamed from: a */
    public final void mo63621a(int i, int i2) {
        this.f24006e = i;
        if (this.f24022u == null) {
            this.f24022u = C8422o.m24014a((C8412f) C8414g.m23969a(C8388a.m23845e().mo56913g()));
        }
        this.f24022u.mo57049a(this.f24014m, (long) i2, i);
    }

    /* renamed from: g */
    public final CampaignEx mo63640g() {
        return this.f24010i;
    }

    /* renamed from: a */
    public final void mo63623a(CampaignEx campaignEx) {
        this.f24010i = campaignEx;
    }

    /* renamed from: c */
    public final void mo63634c(int i) {
        this.f24020s = i;
    }

    /* renamed from: h */
    public final long mo63641h() {
        return this.f24016o;
    }

    /* renamed from: d */
    public final void mo63636d(int i) {
        this.f23992B = i;
    }

    /* renamed from: e */
    public final void mo63638e(int i) {
        this.f23994D = i;
    }

    /* renamed from: a */
    public final void mo63622a(long j, boolean z) {
        C8422o oVar;
        C8672v.m24878d("CampaignDownLoadTask", "setStateToDone ： mProgressSize" + this.f24016o + "  progressSize" + j + "  " + this.f24027z + "%   FileSize : " + this.f24013l + "  " + this.f24010i.getAppName());
        long j2 = 0;
        if (this.f24020s != 100 || this.f24003b == 3 || j == this.f24013l || z) {
            this.f24006e = 5;
            m27462a(1, "");
            long j3 = this.f24013l;
            if (!(j3 == 0 || (oVar = this.f24022u) == null)) {
                oVar.mo57053b(this.f24014m, j3);
            }
            this.f24002a = false;
            m27463a(j, this.f24006e);
            return;
        }
        File file = new File(this.f24017p);
        if (file.exists()) {
            j2 = file.length();
        }
        C8672v.m24878d("CampaignDownLoadTask", "progressSize = " + j + " fileSize = " + this.f24013l + " " + z + " absFileSize = " + j2);
        mo63626a("File size is not match witch download size.");
    }

    /* renamed from: a */
    public final void mo63626a(String str) {
        C9673a aVar = this.f24008g;
        if (aVar != null) {
            aVar.mo58774a(str, this.f24014m);
        }
        C9673a aVar2 = this.f24009h;
        if (aVar2 != null) {
            aVar2.mo58774a(str, this.f24014m);
        }
        C8672v.m24878d("CampaignDownLoadTask", "Video download stop : " + str);
        if (this.f24006e != 4 && this.f24006e != 2 && this.f24006e != 5) {
            this.f24006e = 4;
            CampaignEx campaignEx = this.f24010i;
            if (campaignEx == null || campaignEx.getRsIgnoreCheckRule() == null || this.f24010i.getRsIgnoreCheckRule().size() <= 0 || !this.f24010i.getRsIgnoreCheckRule().contains(0)) {
                m27463a(this.f24016o, this.f24006e);
            } else {
                C8672v.m24876b("CampaignDownLoadTask", "Is not check video download status");
            }
        }
    }

    /* renamed from: i */
    public final void mo63642i() {
        C8672v.m24878d("CampaignDownLoadTask", "start()");
        try {
            if (!TextUtils.isEmpty(this.f24014m)) {
                if (this.f24014m != null) {
                    C8672v.m24878d("CampaignDownLoadTask", new URL(this.f24014m).getPath());
                }
                if (this.f24020s == 0 && this.f23994D == 2) {
                    C8672v.m24878d("CampaignDownLoadTask", "Can not start download because readyRate is 0 and videoCtnType is 2");
                    return;
                }
                DownloadRequest downloadRequest = this.f24025x;
                if (downloadRequest != null) {
                    downloadRequest.start();
                }
            }
        } catch (Throwable unused) {
            C9673a aVar = this.f24008g;
            if (aVar != null) {
                aVar.mo58774a("VideoUrl is not illegal, Please check it.", "");
            }
            C9673a aVar2 = this.f24009h;
            if (aVar2 != null) {
                aVar2.mo58774a("VideoUrl is not illegal, Please check it.", "");
            }
        }
    }

    /* renamed from: j */
    public final void mo63643j() {
        try {
            this.f23991A = true;
            if (this.f23994D == 1) {
                C8672v.m24878d("CampaignDownLoadTask", "Can not call resume(), because videoCtnType = " + this.f23994D);
                return;
            }
            C8672v.m24878d("CampaignDownLoadTask", "resume()");
            if (this.f24026y == null) {
                this.f24026y = new DownloadMessage(new Object(), this.f24014m, this.f24024w, 100, DownloadResourceType.DOWNLOAD_RESOURCE_TYPE_VIDEO);
            }
            DownloadRequest build = MBDownloadManager.getInstance().download(this.f24026y).withReadTimeout((long) this.f23995E).withConnectTimeout((long) this.f23997G).withWriteTimeout((long) this.f23996F).withDownloadPriority(DownloadPriority.HIGH).withHttpRetryCounter(3).withDirectoryPathInternal(this.f24015n).withDownloadStateListener(this.f24000J).withProgressStateListener(this.f24001K).with("do_us_fi_re", Boolean.toString(this.f23999I)).build();
            this.f24025x = build;
            build.start();
            m27473c(m27477f(2));
        } catch (Exception e) {
            C8672v.m24878d("CampaignDownLoadTask", e.getMessage());
        }
    }

    /* renamed from: b */
    public final void mo63630b(String str) {
        m27489p();
        m27462a(2, str);
        this.f24006e = 4;
    }

    /* renamed from: a */
    public final void mo63624a(C9646d dVar) {
        CopyOnWriteArrayList<C9646d> copyOnWriteArrayList = this.f24007f;
        if (copyOnWriteArrayList != null) {
            copyOnWriteArrayList.add(dVar);
        }
    }

    /* renamed from: k */
    public final String mo63644k() {
        String str = "";
        if (this.f24003b == 3) {
            return str;
        }
        String str2 = this.f24015n + this.f24024w;
        File file = new File(str2);
        try {
            if (!file.exists()) {
                str = "file is not exist ";
            } else if (!file.isFile()) {
                str = "file is not file ";
            } else if (!file.canRead()) {
                str = "file can not read ";
            } else if (file.length() > 0) {
                this.f24017p = str2;
            } else {
                str = "file length is 0 ";
            }
        } catch (Throwable th) {
            C8672v.m24878d("CampaignDownLoadTask", th.getMessage());
            str = th.getMessage();
        }
        if (this.f24006e == 5 && !TextUtils.isEmpty(str)) {
            m27486o();
        }
        return str;
    }

    /* renamed from: a */
    public final void mo63625a(C9673a aVar) {
        this.f24008g = aVar;
    }

    /* renamed from: b */
    public final void mo63629b(C9673a aVar) {
        this.f24009h = aVar;
    }

    /* renamed from: a */
    private void m27463a(long j, int i) {
        this.f24016o = j;
        int i2 = this.f24020s;
        if (100 * j >= ((long) i2) * this.f24013l && !this.f24021t && i != 4) {
            if (i2 != 100 || i == 5) {
                this.f24021t = true;
                C8672v.m24878d("CampaignDownLoadTask", "UpdateListener : state: " + i + " progress : " + j);
                String k = mo63644k();
                if (TextUtils.isEmpty(k)) {
                    C9673a aVar = this.f24008g;
                    if (aVar != null) {
                        aVar.mo58773a(this.f24014m);
                    }
                    C9673a aVar2 = this.f24009h;
                    if (aVar2 != null) {
                        aVar2.mo58773a(this.f24014m);
                    }
                } else {
                    C9673a aVar3 = this.f24008g;
                    if (aVar3 != null) {
                        aVar3.mo58774a("file is not effective " + k, this.f24014m);
                    }
                    C9673a aVar4 = this.f24009h;
                    if (aVar4 != null) {
                        aVar4.mo58774a("file is not effective " + k, this.f24014m);
                    }
                }
            } else {
                this.f24006e = 5;
                return;
            }
        }
        if (!this.f24002a && j > 0) {
            this.f24002a = true;
            if (this.f24022u == null) {
                this.f24022u = C8422o.m24014a((C8412f) C8414g.m23969a(C8388a.m23845e().mo56913g()));
            }
            this.f24022u.mo57049a(this.f24014m, j, this.f24006e);
        }
        CopyOnWriteArrayList<C9646d> copyOnWriteArrayList = this.f24007f;
        if (copyOnWriteArrayList != null) {
            Iterator<C9646d> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                C9646d next = it.next();
                if (next != null) {
                    next.mo63666a(j, i);
                }
            }
        }
    }

    /* renamed from: l */
    public final void mo63645l() {
        if (this.f24007f != null) {
            this.f24007f = null;
        }
    }

    /* renamed from: o */
    private void m27486o() {
        if (this.f24022u == null) {
            this.f24022u = C8422o.m24014a((C8412f) C8414g.m23969a(C8388a.m23845e().mo56913g()));
        }
        try {
            this.f24022u.mo57054b(this.f24014m);
            File file = new File(this.f24017p);
            if (file.exists() && file.isFile()) {
                file.delete();
            }
        } catch (Throwable th) {
            this.f24006e = 0;
            throw th;
        }
        this.f24006e = 0;
    }

    /* renamed from: m */
    public final void mo63646m() {
        try {
            m27486o();
            if (this.f24010i == null || this.f24010i.getPlayable_ads_without_video() != 2) {
                C9627a a = C9627a.m27316a();
                if (a != null) {
                    a.mo63509a(this.f24010i);
                }
                this.f24006e = 0;
                return;
            }
            this.f24006e = 0;
        } catch (Exception unused) {
            C8672v.m24878d("CampaignDownLoadTask", "del file is failed");
        } catch (Throwable th) {
            this.f24006e = 0;
            throw th;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public void m27489p() {
        try {
            Class<?> cls = Class.forName("com.mbridge.msdk.reward.a.a");
            Object newInstance = cls.newInstance();
            cls.getMethod("insertExcludeId", new Class[]{String.class, CampaignEx.class}).invoke(newInstance, new Object[]{this.f24011j, this.f24010i});
            Class<?> cls2 = Class.forName("com.mbridge.msdk.mbnative.controller.NativeController");
            Object newInstance2 = cls2.newInstance();
            cls2.getMethod("insertExcludeId", new Class[]{String.class, CampaignEx.class}).invoke(newInstance2, new Object[]{this.f24011j, this.f24010i});
        } catch (Exception e) {
            C8672v.m24878d("CampaignDownLoadTask", e.getMessage());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m27462a(int i, String str) {
        C8423p a = C8423p.m24023a((C8412f) C8414g.m23969a(C8388a.m23845e().mo56913g()));
        long j = 0;
        if (this.f24019r != 0) {
            j = System.currentTimeMillis() - this.f24019r;
        }
        C8468m mVar = new C8468m(this.f24012k, this.f24010i, i, Long.toString(j), this.f24013l, this.f23992B);
        mVar.mo57846n(this.f24010i.getId());
        mVar.mo57828e(this.f24010i.getVideoUrlEncode());
        mVar.mo57850p(str);
        mVar.mo57840k(this.f24010i.getRequestId());
        mVar.mo57842l(this.f24010i.getRequestIdNotice());
        mVar.mo57844m(this.f24011j);
        a.mo57056a(mVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m27473c(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                if (C8574b.m24577a().mo58054c()) {
                    C8574b.m24577a().mo58052a(str);
                    return;
                }
                C8596a aVar = new C8596a(C8388a.m23845e().mo56913g());
                C8550d a = C8598e.m24661a(str, C8388a.m23845e().mo56913g(), this.f24011j);
                if (!(this.f24010i == null || this.f24010i.getAdType() == 42)) {
                    a.mo57981a("r_stid", C9638b.m27377a().mo63556b().mo63532a());
                }
                aVar.mo57978c(0, C8543d.m24463a().f20952a, a, (C8532e) null);
            } catch (Exception e) {
                C8672v.m24878d("CampaignDownLoadTask", e.getMessage());
            }
        }
    }

    /* renamed from: n */
    public final String mo63647n() {
        if (this.f23998H) {
            return this.f24017p;
        }
        return this.f24014m;
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public String m27477f(int i) {
        if (this.f24010i == null || TextUtils.isEmpty(this.f24011j) || TextUtils.isEmpty(this.f24010i.getRequestId()) || TextUtils.isEmpty(this.f24010i.getVideoUrlEncode())) {
            return "";
        }
        return "key=" + "2000077" + "&" + "unit_id=" + this.f24011j + "&" + "rid=" + this.f24010i.getRequestId() + "&" + "rid_n=" + this.f24010i.getRequestIdNotice() + "&" + "package_name=" + C8388a.m23845e().mo56903b() + "&" + "app_id=" + C8388a.m23845e().mo56914h() + "&" + "video_url=" + URLEncoder.encode(this.f24010i.getVideoUrlEncode()) + "&" + "process_size=" + this.f24016o + "&" + "file_size=" + this.f24013l + "&" + "ready_rate=" + this.f24020s + "&" + "cd_rate=" + this.f24004c + "&" + "cid=" + this.f24010i.getId() + "&" + "type=" + this.f24006e + "&" + "video_download_status=" + i;
    }
}
