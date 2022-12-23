package com.inmobi.media;

import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.inmobi.media.C5784ax;
import com.inmobi.media.C6074ft;
import com.inmobi.media.C6094fv;
import com.inmobi.media.C6200ih;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.smaato.sdk.video.vast.model.C11130Ad;
import com.squareup.picasso.Callback;
import java.io.File;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.inmobi.media.bi */
/* compiled from: AssetStore */
public final class C5806bi implements C6094fv.C6097c {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final String f14596b = C5806bi.class.getSimpleName();

    /* renamed from: m */
    private static final Object f14597m = new Object();

    /* renamed from: a */
    public ExecutorService f14598a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C5803bg f14599c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public C6074ft.C6079a f14600d;

    /* renamed from: e */
    private C6074ft.C6089k f14601e;

    /* renamed from: f */
    private ExecutorService f14602f;

    /* renamed from: g */
    private C5812a f14603g;

    /* renamed from: h */
    private HandlerThread f14604h;

    /* renamed from: i */
    private AtomicBoolean f14605i;

    /* renamed from: j */
    private AtomicBoolean f14606j;

    /* renamed from: k */
    private ConcurrentHashMap<String, C5784ax> f14607k;

    /* renamed from: l */
    private C6200ih.C6204c f14608l;

    /* renamed from: n */
    private List<C5786ay> f14609n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C5805bh f14610o;

    /* renamed from: com.inmobi.media.bi$b */
    /* compiled from: AssetStore */
    static class C5814b {

        /* renamed from: a */
        static final C5806bi f14623a = new C5806bi((byte) 0);
    }

    /* synthetic */ C5806bi(byte b) {
        this();
    }

    private C5806bi() {
        this.f14605i = new AtomicBoolean(false);
        this.f14606j = new AtomicBoolean(false);
        this.f14609n = new ArrayList();
        this.f14610o = new C5805bh() {
            /* renamed from: a */
            public final void mo34778a(C6157hb hbVar, String str, C5784ax axVar) {
                String unused = C5806bi.f14596b;
                C5784ax a = new C5784ax.C5785a().mo34698a(axVar.f14523d, str, hbVar, C5806bi.this.f14600d.maxRetries, C5806bi.this.f14600d.timeToLive).mo34699a();
                C5803bg unused2 = C5806bi.this.f14599c;
                C5803bg.m17288b(a);
                a.f14530k = axVar.f14530k;
                a.f14520a = axVar.f14520a;
                C5806bi.this.m17304a(a, (byte) 0);
                try {
                    C5806bi.m17321c(C5806bi.this);
                } catch (Exception e) {
                    String unused3 = C5806bi.f14596b;
                    C6130gj.m18161a().mo35310a(new C6167hk(e));
                }
            }

            /* renamed from: a */
            public final void mo34777a(C5784ax axVar) {
                String unused = C5806bi.f14596b;
                C5806bi.this.m17323c(axVar.f14523d);
                if (axVar.f14522c <= 0) {
                    String unused2 = C5806bi.f14596b;
                    C5806bi.this.m17304a(axVar, axVar.f14531l);
                    C5803bg unused3 = C5806bi.this.f14599c;
                    C5803bg.m17292c(axVar);
                } else {
                    String unused4 = C5806bi.f14596b;
                    axVar.f14525f = System.currentTimeMillis();
                    C5803bg unused5 = C5806bi.this.f14599c;
                    C5803bg.m17288b(axVar);
                    if (!C6196id.m18389a()) {
                        C5806bi.this.m17304a(axVar, axVar.f14531l);
                    }
                }
                try {
                    C5806bi.m17321c(C5806bi.this);
                } catch (Exception e) {
                    String unused6 = C5806bi.f14596b;
                    C6130gj.m18161a().mo35310a(new C6167hk(e));
                }
            }
        };
        C6074ft ftVar = (C6074ft) C6094fv.m18084a(CampaignUnit.JSON_KEY_ADS, C6183hw.m18332f(), this);
        this.f14600d = ftVar.assetCache;
        this.f14601e = ftVar.vastVideo;
        this.f14599c = C5803bg.m17287a();
        this.f14598a = Executors.newCachedThreadPool(new C6194ib(f14596b + "-AP"));
        this.f14602f = Executors.newFixedThreadPool(1, new C6194ib(f14596b + "-AD"));
        HandlerThread handlerThread = new HandlerThread("assetFetcher");
        this.f14604h = handlerThread;
        handlerThread.start();
        this.f14603g = new C5812a(this.f14604h.getLooper(), this);
        this.f14608l = new C6200ih.C6204c() {
            /* renamed from: a */
            public final void mo34782a(boolean z) {
                if (z) {
                    C5806bi.m17321c(C5806bi.this);
                } else {
                    C5806bi.this.m17335i();
                }
            }
        };
        this.f14607k = new ConcurrentHashMap<>(2, 0.9f, 2);
    }

    /* renamed from: a */
    public static C5806bi m17300a() {
        return C5814b.f14623a;
    }

    /* renamed from: a */
    public final void mo34420a(C6093fu fuVar) {
        C6074ft ftVar = (C6074ft) fuVar;
        this.f14600d = ftVar.assetCache;
        this.f14601e = ftVar.vastVideo;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m17311a(String str) {
        boolean z;
        for (int i = 0; i < this.f14609n.size(); i++) {
            C5786ay ayVar = this.f14609n.get(i);
            Set<C5841bq> set = ayVar.f14541b;
            Set<String> set2 = ayVar.f14542c;
            Iterator<C5841bq> it = set.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().f14697b.equals(str)) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (z && !set2.contains(str)) {
                ayVar.f14542c.add(str);
                ayVar.f14543d++;
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public synchronized void m17318b(String str) {
        boolean z;
        for (int i = 0; i < this.f14609n.size(); i++) {
            C5786ay ayVar = this.f14609n.get(i);
            Iterator<C5841bq> it = ayVar.f14541b.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().f14697b.equals(str)) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                ayVar.f14544e++;
            }
        }
    }

    /* renamed from: a */
    private synchronized void m17303a(C5784ax axVar) {
        boolean z;
        for (int i = 0; i < this.f14609n.size(); i++) {
            C5786ay ayVar = this.f14609n.get(i);
            Iterator<C5841bq> it = ayVar.f14541b.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (it.next().f14697b.equals(axVar.f14523d)) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (z && !ayVar.f14540a.contains(axVar)) {
                ayVar.f14540a.add(axVar);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m17305a(C5786ay ayVar) {
        if (!this.f14609n.contains(ayVar)) {
            this.f14609n.add(ayVar);
        }
    }

    /* renamed from: a */
    private synchronized void m17312a(List<C5786ay> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            this.f14609n.remove(list.get(i));
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x01a4, code lost:
        r14 = r6;
        r15 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x01a6, code lost:
        r4 = r15;
        r2 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x01c6, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x01c7, code lost:
        r4 = null;
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x01ca, code lost:
        r4 = null;
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x01d4, code lost:
        r2 = 5;
        r4 = null;
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x01df, code lost:
        r2 = 5;
        r4 = null;
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x01ea, code lost:
        r2 = 1;
        r4 = null;
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x01f5, code lost:
        r2 = 2;
        r4 = null;
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0200, code lost:
        r2 = 2;
        r4 = null;
        r14 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        r8.f14531l = 4;
        r8.f14522c = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x010a, code lost:
        if (r0.exists() == false) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x010c, code lost:
        r0.delete();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x010f, code lost:
        r5.disconnect();
        com.inmobi.media.C6196id.m18386a((java.io.Closeable) r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0116, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        com.inmobi.media.C6130gj.m18161a().mo35310a(new com.inmobi.media.C6167hk(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x013e, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x013f, code lost:
        r14 = r6;
        r4 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        r7.flush();
        r5.disconnect();
        r11 = android.os.SystemClock.elapsedRealtime();
        com.inmobi.media.C5787az.m17192a(r20, r16, r11);
        r13 = new com.inmobi.media.C6157hb();
        r13.f15543c = r5.getHeaderFields();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x015f, code lost:
        r14 = r6;
        r15 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        r8.f14530k = com.inmobi.media.C5787az.m17191a(r23, r0, r20, r11);
        r8.f14520a = r11 - r20;
        r10.f14551a.mo34778a(r13, r0.getAbsolutePath(), r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x017a, code lost:
        com.inmobi.media.C6196id.m18386a((java.io.Closeable) r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x017f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0187, code lost:
        r14 = r6;
        r15 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0189, code lost:
        r4 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x018c, code lost:
        r14 = r6;
        r15 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x018e, code lost:
        r4 = r15;
        r2 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0192, code lost:
        r14 = r6;
        r15 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0194, code lost:
        r4 = r15;
        r2 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0198, code lost:
        r14 = r6;
        r15 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x019a, code lost:
        r4 = r15;
        r2 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x019e, code lost:
        r14 = r6;
        r15 = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x01a0, code lost:
        r4 = r15;
        r2 = 2;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:102:? A[ExcHandler: SocketTimeoutException (unused java.net.SocketTimeoutException), SYNTHETIC, Splitter:B:48:0x00f1] */
    /* JADX WARNING: Removed duplicated region for block: B:122:? A[ExcHandler: Exception (unused java.lang.Exception), SYNTHETIC, Splitter:B:11:0x0052] */
    /* JADX WARNING: Removed duplicated region for block: B:126:? A[ExcHandler: IOException (unused java.io.IOException), SYNTHETIC, Splitter:B:11:0x0052] */
    /* JADX WARNING: Removed duplicated region for block: B:129:? A[ExcHandler: ProtocolException (unused java.net.ProtocolException), SYNTHETIC, Splitter:B:11:0x0052] */
    /* JADX WARNING: Removed duplicated region for block: B:132:? A[ExcHandler: MalformedURLException (unused java.net.MalformedURLException), SYNTHETIC, Splitter:B:11:0x0052] */
    /* JADX WARNING: Removed duplicated region for block: B:135:? A[ExcHandler: FileNotFoundException (unused java.io.FileNotFoundException), SYNTHETIC, Splitter:B:11:0x0052] */
    /* JADX WARNING: Removed duplicated region for block: B:138:? A[ExcHandler: SocketTimeoutException (unused java.net.SocketTimeoutException), SYNTHETIC, Splitter:B:11:0x0052] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x013e A[ExcHandler: all (th java.lang.Throwable), Splitter:B:54:0x0102] */
    /* JADX WARNING: Removed duplicated region for block: B:82:? A[ExcHandler: Exception (unused java.lang.Exception), SYNTHETIC, Splitter:B:48:0x00f1] */
    /* JADX WARNING: Removed duplicated region for block: B:86:? A[ExcHandler: IOException (unused java.io.IOException), SYNTHETIC, Splitter:B:48:0x00f1] */
    /* JADX WARNING: Removed duplicated region for block: B:90:? A[ExcHandler: ProtocolException (unused java.net.ProtocolException), SYNTHETIC, Splitter:B:48:0x00f1] */
    /* JADX WARNING: Removed duplicated region for block: B:94:? A[ExcHandler: MalformedURLException (unused java.net.MalformedURLException), SYNTHETIC, Splitter:B:48:0x00f1] */
    /* JADX WARNING: Removed duplicated region for block: B:98:? A[ExcHandler: FileNotFoundException (unused java.io.FileNotFoundException), SYNTHETIC, Splitter:B:48:0x00f1] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean m17313a(com.inmobi.media.C5784ax r23, com.inmobi.media.C5805bh r24) {
        /*
            r22 = this;
            r1 = r22
            r8 = r23
            java.util.concurrent.ConcurrentHashMap<java.lang.String, com.inmobi.media.ax> r0 = r1.f14607k
            java.lang.String r2 = r8.f14523d
            java.lang.Object r0 = r0.putIfAbsent(r2, r8)
            com.inmobi.media.ax r0 = (com.inmobi.media.C5784ax) r0
            r9 = 0
            if (r0 != 0) goto L_0x0223
            com.inmobi.media.az r10 = new com.inmobi.media.az
            r0 = r24
            r10.<init>(r0)
            com.inmobi.media.ft$k r0 = r1.f14601e
            long r2 = r0.vastMaxAssetSize
            com.inmobi.media.ft$k r0 = r1.f14601e
            java.util.List<java.lang.String> r0 = r0.allowedContentType
            boolean r4 = com.inmobi.media.C6196id.m18389a()
            r11 = 5
            if (r4 != 0) goto L_0x0031
            r8.f14531l = r11
            com.inmobi.media.bh r0 = r10.f14551a
            r0.mo34777a(r8)
        L_0x002e:
            r2 = 1
            goto L_0x0222
        L_0x0031:
            java.lang.String r4 = r8.f14523d
            java.lang.String r5 = ""
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L_0x021a
            java.lang.String r4 = r8.f14523d
            boolean r4 = android.webkit.URLUtil.isValidUrl(r4)
            if (r4 != 0) goto L_0x0045
            goto L_0x021a
        L_0x0045:
            int r4 = r0.size()
            java.lang.String[] r4 = new java.lang.String[r4]
            java.lang.Object[] r0 = r0.toArray(r4)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r4 = 0
            long r20 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x01c6 }
            java.net.URL r5 = new java.net.URL     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x01c6 }
            java.lang.String r6 = r8.f14523d     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x01c6 }
            r5.<init>(r6)     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x01c6 }
            java.net.URLConnection r5 = r5.openConnection()     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x01c6 }
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x01c6 }
            java.lang.String r6 = "GET"
            r5.setRequestMethod(r6)     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x01c6 }
            r6 = 60000(0xea60, float:8.4078E-41)
            r5.setConnectTimeout(r6)     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x01c6 }
            r5.setReadTimeout(r6)     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x01c6 }
            int r6 = r5.getResponseCode()     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x01c6 }
            r7 = 400(0x190, float:5.6E-43)
            if (r6 >= r7) goto L_0x00ae
            java.lang.String r6 = r5.getContentType()     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x00aa }
            int r7 = r0.length     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x00aa }
            r14 = r9
        L_0x007f:
            if (r14 >= r7) goto L_0x009c
            r15 = r0[r14]     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x00aa }
            if (r6 == 0) goto L_0x0099
            java.util.Locale r13 = java.util.Locale.ENGLISH     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x00aa }
            java.lang.String r13 = r15.toLowerCase(r13)     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x00aa }
            java.util.Locale r15 = java.util.Locale.ENGLISH     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x00aa }
            java.lang.String r15 = r6.toLowerCase(r15)     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x00aa }
            boolean r13 = r13.equals(r15)     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x00aa }
            if (r13 == 0) goto L_0x0099
            r0 = 1
            goto L_0x009d
        L_0x0099:
            int r14 = r14 + 1
            goto L_0x007f
        L_0x009c:
            r0 = r9
        L_0x009d:
            if (r0 != 0) goto L_0x00ae
            r0 = 3
            r8.f14531l = r0     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x00aa }
            r8.f14522c = r9     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x00aa }
            com.inmobi.media.bh r0 = r10.f14551a     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x00aa }
            r0.mo34777a(r8)     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x00aa }
            goto L_0x00c7
        L_0x00aa:
            r0 = move-exception
            r14 = r4
            goto L_0x0213
        L_0x00ae:
            int r0 = r5.getContentLength()     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x01c6 }
            long r6 = (long) r0
            r13 = 0
            int r0 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            r15 = 4
            if (r0 < 0) goto L_0x00cf
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x00cf
            r8.f14531l = r15     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x00aa }
            r8.f14522c = r9     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x00aa }
            com.inmobi.media.bh r0 = r10.f14551a     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x00aa }
            r0.mo34777a(r8)     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x00aa }
        L_0x00c7:
            com.inmobi.media.C6196id.m18386a((java.io.Closeable) r4)
            com.inmobi.media.C6196id.m18386a((java.io.Closeable) r4)
            goto L_0x002e
        L_0x00cf:
            r5.connect()     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x01c6 }
            java.lang.String r0 = r8.f14523d     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x01c6 }
            java.io.File r0 = com.inmobi.media.C6183hw.m18310a((java.lang.String) r0)     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x01c6 }
            boolean r6 = r0.exists()     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x01c6 }
            if (r6 == 0) goto L_0x00e1
            r0.delete()     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x00aa }
        L_0x00e1:
            java.io.InputStream r6 = r5.getInputStream()     // Catch:{ SocketTimeoutException -> 0x0200, FileNotFoundException -> 0x01f5, MalformedURLException -> 0x01ea, ProtocolException -> 0x01df, IOException -> 0x01d4, Exception -> 0x01ca, all -> 0x01c6 }
            java.io.BufferedOutputStream r7 = new java.io.BufferedOutputStream     // Catch:{ SocketTimeoutException -> 0x01c2, FileNotFoundException -> 0x01be, MalformedURLException -> 0x01ba, ProtocolException -> 0x01b6, IOException -> 0x01b2, Exception -> 0x01af, all -> 0x01aa }
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch:{ SocketTimeoutException -> 0x01c2, FileNotFoundException -> 0x01be, MalformedURLException -> 0x01ba, ProtocolException -> 0x01b6, IOException -> 0x01b2, Exception -> 0x01af, all -> 0x01aa }
            r4.<init>(r0)     // Catch:{ SocketTimeoutException -> 0x01c2, FileNotFoundException -> 0x01be, MalformedURLException -> 0x01ba, ProtocolException -> 0x01b6, IOException -> 0x01b2, Exception -> 0x01af, all -> 0x01aa }
            r7.<init>(r4)     // Catch:{ SocketTimeoutException -> 0x01c2, FileNotFoundException -> 0x01be, MalformedURLException -> 0x01ba, ProtocolException -> 0x01b6, IOException -> 0x01b2, Exception -> 0x01af, all -> 0x01aa }
            r4 = 1024(0x400, float:1.435E-42)
            byte[] r4 = new byte[r4]     // Catch:{ SocketTimeoutException -> 0x01a4, FileNotFoundException -> 0x019e, MalformedURLException -> 0x0198, ProtocolException -> 0x0192, IOException -> 0x018c, Exception -> 0x0187, all -> 0x0181 }
            r16 = r13
        L_0x00f5:
            int r13 = r6.read(r4)     // Catch:{ SocketTimeoutException -> 0x01a4, FileNotFoundException -> 0x019e, MalformedURLException -> 0x0198, ProtocolException -> 0x0192, IOException -> 0x018c, Exception -> 0x0187, all -> 0x0181 }
            if (r13 <= 0) goto L_0x0143
            long r11 = (long) r13
            long r16 = r16 + r11
            int r11 = (r16 > r2 ? 1 : (r16 == r2 ? 0 : -1))
            if (r11 <= 0) goto L_0x0139
            r8.f14531l = r15     // Catch:{ SocketTimeoutException -> 0x01a4, FileNotFoundException -> 0x019e, MalformedURLException -> 0x0198, ProtocolException -> 0x0192, IOException -> 0x018c, Exception -> 0x0187, all -> 0x013e }
            r8.f14522c = r9     // Catch:{ SocketTimeoutException -> 0x01a4, FileNotFoundException -> 0x019e, MalformedURLException -> 0x0198, ProtocolException -> 0x0192, IOException -> 0x018c, Exception -> 0x0187, all -> 0x013e }
            boolean r2 = r0.exists()     // Catch:{ Exception -> 0x0116, SocketTimeoutException -> 0x01a4, FileNotFoundException -> 0x019e, MalformedURLException -> 0x0198, ProtocolException -> 0x0192, IOException -> 0x018c, all -> 0x013e }
            if (r2 == 0) goto L_0x010f
            r0.delete()     // Catch:{ Exception -> 0x0116, SocketTimeoutException -> 0x01a4, FileNotFoundException -> 0x019e, MalformedURLException -> 0x0198, ProtocolException -> 0x0192, IOException -> 0x018c, all -> 0x013e }
        L_0x010f:
            r5.disconnect()     // Catch:{ Exception -> 0x0116, SocketTimeoutException -> 0x01a4, FileNotFoundException -> 0x019e, MalformedURLException -> 0x0198, ProtocolException -> 0x0192, IOException -> 0x018c, all -> 0x013e }
            com.inmobi.media.C6196id.m18386a((java.io.Closeable) r7)     // Catch:{ Exception -> 0x0116, SocketTimeoutException -> 0x01a4, FileNotFoundException -> 0x019e, MalformedURLException -> 0x0198, ProtocolException -> 0x0192, IOException -> 0x018c, all -> 0x013e }
            goto L_0x0123
        L_0x0116:
            r0 = move-exception
            com.inmobi.media.gj r2 = com.inmobi.media.C6130gj.m18161a()     // Catch:{ SocketTimeoutException -> 0x01a4, FileNotFoundException -> 0x019e, MalformedURLException -> 0x0198, ProtocolException -> 0x0192, IOException -> 0x018c, Exception -> 0x0187, all -> 0x013e }
            com.inmobi.media.hk r3 = new com.inmobi.media.hk     // Catch:{ SocketTimeoutException -> 0x01a4, FileNotFoundException -> 0x019e, MalformedURLException -> 0x0198, ProtocolException -> 0x0192, IOException -> 0x018c, Exception -> 0x0187, all -> 0x013e }
            r3.<init>(r0)     // Catch:{ SocketTimeoutException -> 0x01a4, FileNotFoundException -> 0x019e, MalformedURLException -> 0x0198, ProtocolException -> 0x0192, IOException -> 0x018c, Exception -> 0x0187, all -> 0x013e }
            r2.mo35310a((com.inmobi.media.C6167hk) r3)     // Catch:{ SocketTimeoutException -> 0x01a4, FileNotFoundException -> 0x019e, MalformedURLException -> 0x0198, ProtocolException -> 0x0192, IOException -> 0x018c, Exception -> 0x0187, all -> 0x013e }
        L_0x0123:
            long r18 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x01a4, FileNotFoundException -> 0x019e, MalformedURLException -> 0x0198, ProtocolException -> 0x0192, IOException -> 0x018c, Exception -> 0x0187, all -> 0x013e }
            r14 = r20
            com.inmobi.media.C5787az.m17192a(r14, r16, r18)     // Catch:{ SocketTimeoutException -> 0x01a4, FileNotFoundException -> 0x019e, MalformedURLException -> 0x0198, ProtocolException -> 0x0192, IOException -> 0x018c, Exception -> 0x0187, all -> 0x013e }
            com.inmobi.media.bh r0 = r10.f14551a     // Catch:{ SocketTimeoutException -> 0x01a4, FileNotFoundException -> 0x019e, MalformedURLException -> 0x0198, ProtocolException -> 0x0192, IOException -> 0x018c, Exception -> 0x0187, all -> 0x013e }
            r0.mo34777a(r8)     // Catch:{ SocketTimeoutException -> 0x01a4, FileNotFoundException -> 0x019e, MalformedURLException -> 0x0198, ProtocolException -> 0x0192, IOException -> 0x018c, Exception -> 0x0187, all -> 0x013e }
            com.inmobi.media.C6196id.m18386a((java.io.Closeable) r7)
            com.inmobi.media.C6196id.m18386a((java.io.Closeable) r6)
            goto L_0x002e
        L_0x0139:
            r7.write(r4, r9, r13)     // Catch:{ SocketTimeoutException -> 0x01a4, FileNotFoundException -> 0x019e, MalformedURLException -> 0x0198, ProtocolException -> 0x0192, IOException -> 0x018c, Exception -> 0x0187, all -> 0x013e }
            r11 = 5
            goto L_0x00f5
        L_0x013e:
            r0 = move-exception
            r14 = r6
            r4 = r7
            goto L_0x0213
        L_0x0143:
            r7.flush()     // Catch:{ SocketTimeoutException -> 0x01a4, FileNotFoundException -> 0x019e, MalformedURLException -> 0x0198, ProtocolException -> 0x0192, IOException -> 0x018c, Exception -> 0x0187, all -> 0x0181 }
            r5.disconnect()     // Catch:{ SocketTimeoutException -> 0x01a4, FileNotFoundException -> 0x019e, MalformedURLException -> 0x0198, ProtocolException -> 0x0192, IOException -> 0x018c, Exception -> 0x0187, all -> 0x0181 }
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch:{ SocketTimeoutException -> 0x01a4, FileNotFoundException -> 0x019e, MalformedURLException -> 0x0198, ProtocolException -> 0x0192, IOException -> 0x018c, Exception -> 0x0187, all -> 0x0181 }
            r14 = r20
            r18 = r11
            com.inmobi.media.C5787az.m17192a(r14, r16, r18)     // Catch:{ SocketTimeoutException -> 0x01a4, FileNotFoundException -> 0x019e, MalformedURLException -> 0x0198, ProtocolException -> 0x0192, IOException -> 0x018c, Exception -> 0x0187, all -> 0x0181 }
            com.inmobi.media.hb r13 = new com.inmobi.media.hb     // Catch:{ SocketTimeoutException -> 0x01a4, FileNotFoundException -> 0x019e, MalformedURLException -> 0x0198, ProtocolException -> 0x0192, IOException -> 0x018c, Exception -> 0x0187, all -> 0x0181 }
            r13.<init>()     // Catch:{ SocketTimeoutException -> 0x01a4, FileNotFoundException -> 0x019e, MalformedURLException -> 0x0198, ProtocolException -> 0x0192, IOException -> 0x018c, Exception -> 0x0187, all -> 0x0181 }
            java.util.Map r2 = r5.getHeaderFields()     // Catch:{ SocketTimeoutException -> 0x01a4, FileNotFoundException -> 0x019e, MalformedURLException -> 0x0198, ProtocolException -> 0x0192, IOException -> 0x018c, Exception -> 0x0187, all -> 0x0181 }
            r13.f15543c = r2     // Catch:{ SocketTimeoutException -> 0x01a4, FileNotFoundException -> 0x019e, MalformedURLException -> 0x0198, ProtocolException -> 0x0192, IOException -> 0x018c, Exception -> 0x0187, all -> 0x0181 }
            r2 = r23
            r3 = r0
            r4 = r20
            r14 = r6
            r15 = r7
            r6 = r11
            java.lang.String r2 = com.inmobi.media.C5787az.m17191a(r2, r3, r4, r6)     // Catch:{ SocketTimeoutException -> 0x01a6, FileNotFoundException -> 0x01a0, MalformedURLException -> 0x019a, ProtocolException -> 0x0194, IOException -> 0x018e, Exception -> 0x0189, all -> 0x017f }
            r8.f14530k = r2     // Catch:{ SocketTimeoutException -> 0x01a6, FileNotFoundException -> 0x01a0, MalformedURLException -> 0x019a, ProtocolException -> 0x0194, IOException -> 0x018e, Exception -> 0x0189, all -> 0x017f }
            long r11 = r11 - r20
            r8.f14520a = r11     // Catch:{ SocketTimeoutException -> 0x01a6, FileNotFoundException -> 0x01a0, MalformedURLException -> 0x019a, ProtocolException -> 0x0194, IOException -> 0x018e, Exception -> 0x0189, all -> 0x017f }
            com.inmobi.media.bh r2 = r10.f14551a     // Catch:{ SocketTimeoutException -> 0x01a6, FileNotFoundException -> 0x01a0, MalformedURLException -> 0x019a, ProtocolException -> 0x0194, IOException -> 0x018e, Exception -> 0x0189, all -> 0x017f }
            java.lang.String r0 = r0.getAbsolutePath()     // Catch:{ SocketTimeoutException -> 0x01a6, FileNotFoundException -> 0x01a0, MalformedURLException -> 0x019a, ProtocolException -> 0x0194, IOException -> 0x018e, Exception -> 0x0189, all -> 0x017f }
            r2.mo34778a(r13, r0, r8)     // Catch:{ SocketTimeoutException -> 0x01a6, FileNotFoundException -> 0x01a0, MalformedURLException -> 0x019a, ProtocolException -> 0x0194, IOException -> 0x018e, Exception -> 0x0189, all -> 0x017f }
            com.inmobi.media.C6196id.m18386a((java.io.Closeable) r15)
            goto L_0x020d
        L_0x017f:
            r0 = move-exception
            goto L_0x0184
        L_0x0181:
            r0 = move-exception
            r14 = r6
            r15 = r7
        L_0x0184:
            r4 = r15
            goto L_0x0213
        L_0x0187:
            r14 = r6
            r15 = r7
        L_0x0189:
            r4 = r15
            goto L_0x01cc
        L_0x018c:
            r14 = r6
            r15 = r7
        L_0x018e:
            r4 = r15
            r2 = 5
            goto L_0x01d7
        L_0x0192:
            r14 = r6
            r15 = r7
        L_0x0194:
            r4 = r15
            r2 = 5
            goto L_0x01e2
        L_0x0198:
            r14 = r6
            r15 = r7
        L_0x019a:
            r4 = r15
            r2 = 1
            goto L_0x01ed
        L_0x019e:
            r14 = r6
            r15 = r7
        L_0x01a0:
            r4 = r15
            r2 = 2
            goto L_0x01f8
        L_0x01a4:
            r14 = r6
            r15 = r7
        L_0x01a6:
            r4 = r15
            r2 = 2
            goto L_0x0203
        L_0x01aa:
            r0 = move-exception
            r14 = r6
            r4 = 0
            goto L_0x0213
        L_0x01af:
            r14 = r6
            r4 = 0
            goto L_0x01cc
        L_0x01b2:
            r14 = r6
            r2 = 5
            r4 = 0
            goto L_0x01d7
        L_0x01b6:
            r14 = r6
            r2 = 5
            r4 = 0
            goto L_0x01e2
        L_0x01ba:
            r14 = r6
            r2 = 1
            r4 = 0
            goto L_0x01ed
        L_0x01be:
            r14 = r6
            r2 = 2
            r4 = 0
            goto L_0x01f8
        L_0x01c2:
            r14 = r6
            r2 = 2
            r4 = 0
            goto L_0x0203
        L_0x01c6:
            r0 = move-exception
            r4 = 0
            r14 = 0
            goto L_0x0213
        L_0x01ca:
            r4 = 0
            r14 = 0
        L_0x01cc:
            r8.f14531l = r9     // Catch:{ all -> 0x0212 }
            com.inmobi.media.bh r0 = r10.f14551a     // Catch:{ all -> 0x0212 }
            r0.mo34777a(r8)     // Catch:{ all -> 0x0212 }
            goto L_0x020a
        L_0x01d4:
            r2 = 5
            r4 = 0
            r14 = 0
        L_0x01d7:
            r8.f14531l = r2     // Catch:{ all -> 0x0212 }
            com.inmobi.media.bh r0 = r10.f14551a     // Catch:{ all -> 0x0212 }
            r0.mo34777a(r8)     // Catch:{ all -> 0x0212 }
            goto L_0x020a
        L_0x01df:
            r2 = 5
            r4 = 0
            r14 = 0
        L_0x01e2:
            r8.f14531l = r2     // Catch:{ all -> 0x0212 }
            com.inmobi.media.bh r0 = r10.f14551a     // Catch:{ all -> 0x0212 }
            r0.mo34777a(r8)     // Catch:{ all -> 0x0212 }
            goto L_0x020a
        L_0x01ea:
            r2 = 1
            r4 = 0
            r14 = 0
        L_0x01ed:
            r8.f14531l = r2     // Catch:{ all -> 0x0212 }
            com.inmobi.media.bh r0 = r10.f14551a     // Catch:{ all -> 0x0212 }
            r0.mo34777a(r8)     // Catch:{ all -> 0x0212 }
            goto L_0x020a
        L_0x01f5:
            r2 = 2
            r4 = 0
            r14 = 0
        L_0x01f8:
            r8.f14531l = r2     // Catch:{ all -> 0x0212 }
            com.inmobi.media.bh r0 = r10.f14551a     // Catch:{ all -> 0x0212 }
            r0.mo34777a(r8)     // Catch:{ all -> 0x0212 }
            goto L_0x020a
        L_0x0200:
            r2 = 2
            r4 = 0
            r14 = 0
        L_0x0203:
            r8.f14531l = r2     // Catch:{ all -> 0x0212 }
            com.inmobi.media.bh r0 = r10.f14551a     // Catch:{ all -> 0x0212 }
            r0.mo34777a(r8)     // Catch:{ all -> 0x0212 }
        L_0x020a:
            com.inmobi.media.C6196id.m18386a((java.io.Closeable) r4)
        L_0x020d:
            com.inmobi.media.C6196id.m18386a((java.io.Closeable) r14)
            goto L_0x002e
        L_0x0212:
            r0 = move-exception
        L_0x0213:
            com.inmobi.media.C6196id.m18386a((java.io.Closeable) r4)
            com.inmobi.media.C6196id.m18386a((java.io.Closeable) r14)
            throw r0
        L_0x021a:
            r2 = 1
            r8.f14531l = r2
            com.inmobi.media.bh r0 = r10.f14551a
            r0.mo34777a(r8)
        L_0x0222:
            return r2
        L_0x0223:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5806bi.m17313a(com.inmobi.media.ax, com.inmobi.media.bh):boolean");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m17323c(String str) {
        this.f14607k.remove(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m17304a(C5784ax axVar, byte b) {
        m17303a(axVar);
        m17323c(axVar.f14523d);
        if (b == 0) {
            m17311a(axVar.f14523d);
            m17328f();
            return;
        }
        m17318b(axVar.f14523d);
        m17302a(b);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public synchronized void m17328f() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f14609n.size(); i++) {
            C5786ay ayVar = this.f14609n.get(i);
            if (ayVar.f14543d == ayVar.f14541b.size()) {
                try {
                    C5816bj a = ayVar.mo34700a();
                    if (a != null) {
                        a.mo34772a(ayVar);
                    }
                    arrayList.add(ayVar);
                } catch (Exception e) {
                    C6130gj.m18161a().mo35310a(new C6167hk(e));
                }
            }
        }
        m17312a((List<C5786ay>) arrayList);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m17302a(byte b) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.f14609n.size(); i++) {
            C5786ay ayVar = this.f14609n.get(i);
            if (ayVar.f14544e > 0) {
                try {
                    C5816bj a = ayVar.mo34700a();
                    if (a != null) {
                        a.mo34773a(ayVar, b);
                    }
                    arrayList.add(ayVar);
                } catch (Exception e) {
                    C6130gj.m18161a().mo35310a(new C6167hk(e));
                }
            }
        }
        m17312a((List<C5786ay>) arrayList);
    }

    /* renamed from: b */
    public final void mo34779b() {
        this.f14606j.set(false);
        if (!C6196id.m18389a()) {
            m17331g();
            m17333h();
            return;
        }
        synchronized (f14597m) {
            if (this.f14605i.compareAndSet(false, true)) {
                if (this.f14604h == null) {
                    HandlerThread handlerThread = new HandlerThread("assetFetcher");
                    this.f14604h = handlerThread;
                    handlerThread.start();
                }
                if (this.f14603g == null) {
                    this.f14603g = new C5812a(this.f14604h.getLooper(), this);
                }
                if (C5803bg.m17291c().isEmpty()) {
                    m17335i();
                } else {
                    m17331g();
                    m17333h();
                    this.f14603g.sendEmptyMessage(1);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo34780c() {
        this.f14606j.set(true);
        m17335i();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ad, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo34781d() {
        /*
            r11 = this;
            java.lang.Object r0 = f14597m
            monitor-enter(r0)
            java.util.List r1 = com.inmobi.media.C5803bg.m17294d()     // Catch:{ all -> 0x00ae }
            boolean r2 = r1.isEmpty()     // Catch:{ all -> 0x00ae }
            if (r2 == 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x00ae }
            return
        L_0x000f:
            java.util.Iterator r2 = r1.iterator()     // Catch:{ all -> 0x00ae }
        L_0x0013:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00ae }
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L_0x0033
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00ae }
            com.inmobi.media.ax r3 = (com.inmobi.media.C5784ax) r3     // Catch:{ all -> 0x00ae }
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00ae }
            long r8 = r3.f14527h     // Catch:{ all -> 0x00ae }
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 <= 0) goto L_0x002c
            goto L_0x002d
        L_0x002c:
            r4 = r5
        L_0x002d:
            if (r4 == 0) goto L_0x0013
            m17316b((com.inmobi.media.C5784ax) r3)     // Catch:{ all -> 0x00ae }
            goto L_0x0013
        L_0x0033:
            java.util.List r2 = com.inmobi.media.C5803bg.m17294d()     // Catch:{ all -> 0x00ae }
            r6 = 0
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00ae }
        L_0x003d:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x00ae }
            if (r3 == 0) goto L_0x0056
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x00ae }
            com.inmobi.media.ax r3 = (com.inmobi.media.C5784ax) r3     // Catch:{ all -> 0x00ae }
            java.io.File r8 = new java.io.File     // Catch:{ all -> 0x00ae }
            java.lang.String r3 = r3.f14524e     // Catch:{ all -> 0x00ae }
            r8.<init>(r3)     // Catch:{ all -> 0x00ae }
            long r8 = r8.length()     // Catch:{ all -> 0x00ae }
            long r6 = r6 + r8
            goto L_0x003d
        L_0x0056:
            com.inmobi.media.ft$a r2 = r11.f14600d     // Catch:{ all -> 0x00ae }
            long r2 = r2.maxCacheSize     // Catch:{ all -> 0x00ae }
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0068
            com.inmobi.media.ax r2 = com.inmobi.media.C5803bg.m17289b()     // Catch:{ all -> 0x00ae }
            if (r2 == 0) goto L_0x0068
            m17316b((com.inmobi.media.C5784ax) r2)     // Catch:{ all -> 0x00ae }
            goto L_0x0033
        L_0x0068:
            android.content.Context r2 = com.inmobi.media.C6183hw.m18324c()     // Catch:{ all -> 0x00ae }
            java.io.File r2 = com.inmobi.media.C6183hw.m18319b((android.content.Context) r2)     // Catch:{ all -> 0x00ae }
            boolean r3 = r2.exists()     // Catch:{ all -> 0x00ae }
            if (r3 == 0) goto L_0x00ac
            java.io.File[] r2 = r2.listFiles()     // Catch:{ all -> 0x00ae }
            if (r2 == 0) goto L_0x00ac
            int r3 = r2.length     // Catch:{ all -> 0x00ae }
            r6 = r5
        L_0x007e:
            if (r6 >= r3) goto L_0x00ac
            r7 = r2[r6]     // Catch:{ all -> 0x00ae }
            java.util.Iterator r8 = r1.iterator()     // Catch:{ all -> 0x00ae }
        L_0x0086:
            boolean r9 = r8.hasNext()     // Catch:{ all -> 0x00ae }
            if (r9 == 0) goto L_0x00a0
            java.lang.Object r9 = r8.next()     // Catch:{ all -> 0x00ae }
            com.inmobi.media.ax r9 = (com.inmobi.media.C5784ax) r9     // Catch:{ all -> 0x00ae }
            java.lang.String r10 = r7.getAbsolutePath()     // Catch:{ all -> 0x00ae }
            java.lang.String r9 = r9.f14524e     // Catch:{ all -> 0x00ae }
            boolean r9 = r10.equals(r9)     // Catch:{ all -> 0x00ae }
            if (r9 == 0) goto L_0x0086
            r8 = r4
            goto L_0x00a1
        L_0x00a0:
            r8 = r5
        L_0x00a1:
            if (r8 != 0) goto L_0x00a9
            r7.getAbsolutePath()     // Catch:{ all -> 0x00ae }
            r7.delete()     // Catch:{ all -> 0x00ae }
        L_0x00a9:
            int r6 = r6 + 1
            goto L_0x007e
        L_0x00ac:
            monitor-exit(r0)     // Catch:{ all -> 0x00ae }
            return
        L_0x00ae:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ae }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5806bi.mo34781d():void");
    }

    /* renamed from: b */
    private static void m17316b(C5784ax axVar) {
        C5803bg.m17292c(axVar);
        File file = new File(axVar.f14524e);
        if (file.exists()) {
            file.delete();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void m17320c(C5784ax axVar) {
        File file = new File(axVar.f14524e);
        long min = Math.min(System.currentTimeMillis() + (axVar.f14527h - axVar.f14525f), System.currentTimeMillis() + (this.f14600d.timeToLive * 1000));
        C5784ax.C5785a aVar = new C5784ax.C5785a();
        String str = axVar.f14523d;
        String str2 = axVar.f14524e;
        int i = this.f14600d.maxRetries;
        long j = axVar.f14528i;
        aVar.f14534c = str;
        aVar.f14535d = str2;
        aVar.f14533b = i;
        aVar.f14538g = min;
        aVar.f14539h = j;
        C5784ax a = aVar.mo34699a();
        a.f14525f = System.currentTimeMillis();
        C5803bg.m17288b(a);
        a.f14530k = C5787az.m17191a(axVar, file, axVar.f14525f, axVar.f14525f);
        a.f14529j = true;
        m17304a(a, (byte) 0);
    }

    /* renamed from: com.inmobi.media.bi$c */
    /* compiled from: AssetStore */
    class C5815c implements InvocationHandler {

        /* renamed from: b */
        private CountDownLatch f14625b;

        /* renamed from: c */
        private String f14626c;

        /* renamed from: d */
        private long f14627d;

        /* renamed from: e */
        private String f14628e;

        C5815c(CountDownLatch countDownLatch, String str, long j, String str2) {
            this.f14625b = countDownLatch;
            this.f14626c = str;
            this.f14627d = j;
            this.f14628e = str2;
        }

        public final Object invoke(Object obj, Method method, Object[] objArr) {
            String unused = C5806bi.f14596b;
            if (method == null) {
                return null;
            }
            if ("onSuccess".equalsIgnoreCase(method.getName())) {
                HashMap hashMap = new HashMap();
                hashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - this.f14627d));
                hashMap.put("size", 0);
                hashMap.put("assetType", "image");
                hashMap.put("networkType", C6210ik.m18428b());
                hashMap.put(C11130Ad.AD_TYPE, this.f14628e);
                C6168hl.m18270a().mo35377a("AssetDownloaded", (Map<String, Object>) hashMap);
                C5806bi.this.m17311a(this.f14626c);
                this.f14625b.countDown();
                return null;
            } else if (!"onError".equalsIgnoreCase(method.getName())) {
                return null;
            } else {
                C5806bi.this.m17318b(this.f14626c);
                this.f14625b.countDown();
                return null;
            }
        }
    }

    /* renamed from: g */
    private void m17331g() {
        C6200ih.m18408a();
        C6200ih.m18409a(this.f14608l, "android.net.conn.CONNECTIVITY_CHANGE");
        if (Build.VERSION.SDK_INT >= 23) {
            C6200ih.m18408a();
            C6200ih.m18413b(this.f14608l);
        }
    }

    /* renamed from: h */
    private void m17333h() {
        C6200ih.m18408a().mo35422a("android.net.conn.CONNECTIVITY_CHANGE", this.f14608l);
        if (Build.VERSION.SDK_INT >= 23) {
            C6200ih.m18408a().mo35421a(this.f14608l);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public void m17335i() {
        synchronized (f14597m) {
            this.f14605i.set(false);
            this.f14607k.clear();
            if (this.f14604h != null) {
                this.f14604h.getLooper().quit();
                this.f14604h.interrupt();
                this.f14604h = null;
                this.f14603g = null;
            }
        }
    }

    /* renamed from: com.inmobi.media.bi$a */
    /* compiled from: AssetStore */
    static final class C5812a extends Handler {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public WeakReference<C5806bi> f14620a;

        /* renamed from: b */
        private final C5805bh f14621b = new C5805bh() {
            /* renamed from: a */
            public final void mo34778a(C6157hb hbVar, String str, C5784ax axVar) {
                C5806bi biVar = (C5806bi) C5812a.this.f14620a.get();
                if (biVar != null) {
                    String unused = C5806bi.f14596b;
                    C5784ax a = new C5784ax.C5785a().mo34698a(axVar.f14523d, str, hbVar, biVar.f14600d.maxRetries, biVar.f14600d.timeToLive).mo34699a();
                    C5803bg unused2 = biVar.f14599c;
                    C5803bg.m17288b(a);
                    a.f14530k = axVar.f14530k;
                    a.f14520a = axVar.f14520a;
                    biVar.m17304a(a, (byte) 0);
                    C5812a.this.m17344a();
                    return;
                }
                String unused3 = C5806bi.f14596b;
            }

            /* renamed from: a */
            public final void mo34777a(C5784ax axVar) {
                C5806bi biVar = (C5806bi) C5812a.this.f14620a.get();
                if (biVar != null) {
                    String unused = C5806bi.f14596b;
                    biVar.m17323c(axVar.f14523d);
                    if (axVar.f14522c > 0) {
                        axVar.f14522c--;
                        axVar.f14525f = System.currentTimeMillis();
                        C5803bg unused2 = biVar.f14599c;
                        C5803bg.m17288b(axVar);
                        C5812a.this.m17347b();
                        return;
                    }
                    biVar.m17304a(axVar, axVar.f14531l);
                    C5812a.this.m17345a(axVar);
                    return;
                }
                String unused3 = C5806bi.f14596b;
            }
        };

        C5812a(Looper looper, C5806bi biVar) {
            super(looper);
            this.f14620a = new WeakReference<>(biVar);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
            com.inmobi.media.C5806bi.m17326e();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:71:?, code lost:
            return;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:64:0x0113 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void handleMessage(android.os.Message r9) {
            /*
                r8 = this;
                java.lang.ref.WeakReference<com.inmobi.media.bi> r0 = r8.f14620a     // Catch:{ Exception -> 0x0117 }
                java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0117 }
                com.inmobi.media.bi r0 = (com.inmobi.media.C5806bi) r0     // Catch:{ Exception -> 0x0117 }
                int r1 = r9.what     // Catch:{ Exception -> 0x0117 }
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == r4) goto L_0x0088
                if (r1 == r3) goto L_0x002d
                r2 = 3
                if (r1 == r2) goto L_0x0028
                r2 = 4
                if (r1 == r2) goto L_0x0018
                return
            L_0x0018:
                if (r0 == 0) goto L_0x0024
                java.lang.Object r9 = r9.obj     // Catch:{ Exception -> 0x0117 }
                com.inmobi.media.ax r9 = (com.inmobi.media.C5784ax) r9     // Catch:{ Exception -> 0x0117 }
                com.inmobi.media.C5803bg unused = r0.f14599c     // Catch:{ Exception -> 0x0117 }
                com.inmobi.media.C5803bg.m17292c(r9)     // Catch:{ Exception -> 0x0117 }
            L_0x0024:
                r8.m17347b()     // Catch:{ Exception -> 0x0117 }
                return
            L_0x0028:
                r8.m17347b()     // Catch:{ Exception -> 0x0117 }
                goto L_0x0116
            L_0x002d:
                if (r0 == 0) goto L_0x0116
                java.lang.Object r9 = r9.obj     // Catch:{ Exception -> 0x0117 }
                java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x0117 }
                com.inmobi.media.C5803bg unused = r0.f14599c     // Catch:{ Exception -> 0x0117 }
                com.inmobi.media.ax r9 = com.inmobi.media.C5803bg.m17290b((java.lang.String) r9)     // Catch:{ Exception -> 0x0117 }
                if (r9 != 0) goto L_0x0040
                r8.m17347b()     // Catch:{ Exception -> 0x0117 }
                return
            L_0x0040:
                boolean r1 = r9.mo34693a()     // Catch:{ Exception -> 0x0117 }
                if (r1 != 0) goto L_0x007e
                com.inmobi.media.C6074ft.C6079a unused = r0.f14600d     // Catch:{ Exception -> 0x0117 }
                int r1 = r9.f14522c     // Catch:{ Exception -> 0x0117 }
                if (r1 != 0) goto L_0x0059
                r1 = 6
                r9.f14531l = r1     // Catch:{ Exception -> 0x0117 }
                byte r1 = r9.f14531l     // Catch:{ Exception -> 0x0117 }
                r0.m17304a((com.inmobi.media.C5784ax) r9, (byte) r1)     // Catch:{ Exception -> 0x0117 }
                r8.m17345a((com.inmobi.media.C5784ax) r9)     // Catch:{ Exception -> 0x0117 }
                return
            L_0x0059:
                boolean r1 = com.inmobi.media.C6196id.m18389a()     // Catch:{ Exception -> 0x0117 }
                if (r1 != 0) goto L_0x0068
                byte r1 = r9.f14531l     // Catch:{ Exception -> 0x0117 }
                r0.m17304a((com.inmobi.media.C5784ax) r9, (byte) r1)     // Catch:{ Exception -> 0x0117 }
                r0.m17335i()     // Catch:{ Exception -> 0x0117 }
                return
            L_0x0068:
                com.inmobi.media.bh r1 = r8.f14621b     // Catch:{ Exception -> 0x0117 }
                boolean r9 = r0.m17313a((com.inmobi.media.C5784ax) r9, (com.inmobi.media.C5805bh) r1)     // Catch:{ Exception -> 0x0117 }
                if (r9 == 0) goto L_0x0077
                java.lang.String unused = com.inmobi.media.C5806bi.f14596b     // Catch:{ Exception -> 0x0117 }
                java.lang.String unused = com.inmobi.media.C5806bi.f14596b     // Catch:{ Exception -> 0x0117 }
                return
            L_0x0077:
                java.lang.String unused = com.inmobi.media.C5806bi.f14596b     // Catch:{ Exception -> 0x0117 }
                r8.m17347b()     // Catch:{ Exception -> 0x0117 }
                return
            L_0x007e:
                java.lang.String unused = com.inmobi.media.C5806bi.f14596b     // Catch:{ Exception -> 0x0117 }
                r8.m17344a()     // Catch:{ Exception -> 0x0117 }
                r0.m17304a((com.inmobi.media.C5784ax) r9, (byte) r2)     // Catch:{ Exception -> 0x0117 }
                return
            L_0x0088:
                if (r0 == 0) goto L_0x0116
                com.inmobi.media.ft$a r9 = r0.f14600d     // Catch:{ Exception -> 0x0117 }
                if (r9 != 0) goto L_0x009f
                java.lang.String r9 = "ads"
                java.lang.String r1 = com.inmobi.media.C6183hw.m18332f()     // Catch:{ Exception -> 0x0117 }
                r5 = 0
                com.inmobi.media.fu r9 = com.inmobi.media.C6094fv.m18084a(r9, r1, r5)     // Catch:{ Exception -> 0x0117 }
                com.inmobi.media.ft r9 = (com.inmobi.media.C6074ft) r9     // Catch:{ Exception -> 0x0117 }
                com.inmobi.media.ft$a r9 = r9.assetCache     // Catch:{ Exception -> 0x0117 }
            L_0x009f:
                com.inmobi.media.C5803bg unused = r0.f14599c     // Catch:{ Exception -> 0x0117 }
                java.util.List r1 = com.inmobi.media.C5803bg.m17291c()     // Catch:{ Exception -> 0x0117 }
                int r5 = r1.size()     // Catch:{ Exception -> 0x0117 }
                if (r5 > 0) goto L_0x00b3
                java.lang.String unused = com.inmobi.media.C5806bi.f14596b     // Catch:{ Exception -> 0x0117 }
                r0.m17335i()     // Catch:{ Exception -> 0x0117 }
                return
            L_0x00b3:
                java.lang.String unused = com.inmobi.media.C5806bi.f14596b     // Catch:{ Exception -> 0x0117 }
                java.lang.Object r2 = r1.get(r2)     // Catch:{ Exception -> 0x0117 }
                com.inmobi.media.ax r2 = (com.inmobi.media.C5784ax) r2     // Catch:{ Exception -> 0x0117 }
                java.util.Iterator r1 = r1.iterator()     // Catch:{ Exception -> 0x0117 }
            L_0x00c0:
                boolean r5 = r1.hasNext()     // Catch:{ Exception -> 0x0117 }
                if (r5 == 0) goto L_0x00d3
                java.lang.Object r5 = r1.next()     // Catch:{ Exception -> 0x0117 }
                com.inmobi.media.ax r5 = (com.inmobi.media.C5784ax) r5     // Catch:{ Exception -> 0x0117 }
                boolean r6 = r0.f14607k.containsKey(r2.f14523d)     // Catch:{ Exception -> 0x0117 }
                if (r6 != 0) goto L_0x00c0
                r2 = r5
            L_0x00d3:
                android.os.Message r1 = android.os.Message.obtain()     // Catch:{ Exception -> 0x0117 }
                r1.what = r4     // Catch:{ Exception -> 0x0117 }
                long r4 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x0117 }
                long r6 = r2.f14525f     // Catch:{ Exception -> 0x0117 }
                long r4 = r4 - r6
                int r6 = r9.retryInterval     // Catch:{ Exception -> 0x0113 }
                int r6 = r6 * 1000
                long r6 = (long) r6     // Catch:{ Exception -> 0x0113 }
                int r6 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r6 >= 0) goto L_0x00f3
                int r9 = r9.retryInterval     // Catch:{ Exception -> 0x0113 }
                int r9 = r9 * 1000
                long r2 = (long) r9     // Catch:{ Exception -> 0x0113 }
                long r2 = r2 - r4
                r8.sendMessageDelayed(r1, r2)     // Catch:{ Exception -> 0x0113 }
                return
            L_0x00f3:
                boolean r0 = r0.f14607k.containsKey(r2.f14523d)     // Catch:{ Exception -> 0x0113 }
                if (r0 == 0) goto L_0x0102
                int r9 = r9.retryInterval     // Catch:{ Exception -> 0x0113 }
                int r9 = r9 * 1000
                long r2 = (long) r9     // Catch:{ Exception -> 0x0113 }
                r8.sendMessageDelayed(r1, r2)     // Catch:{ Exception -> 0x0113 }
                return
            L_0x0102:
                java.lang.String unused = com.inmobi.media.C5806bi.f14596b     // Catch:{ Exception -> 0x0113 }
                android.os.Message r9 = android.os.Message.obtain()     // Catch:{ Exception -> 0x0113 }
                r9.what = r3     // Catch:{ Exception -> 0x0113 }
                java.lang.String r0 = r2.f14523d     // Catch:{ Exception -> 0x0113 }
                r9.obj = r0     // Catch:{ Exception -> 0x0113 }
                r8.sendMessage(r9)     // Catch:{ Exception -> 0x0113 }
                return
            L_0x0113:
                java.lang.String unused = com.inmobi.media.C5806bi.f14596b     // Catch:{ Exception -> 0x0117 }
            L_0x0116:
                return
            L_0x0117:
                r9 = move-exception
                java.lang.String unused = com.inmobi.media.C5806bi.f14596b
                com.inmobi.media.gj r0 = com.inmobi.media.C6130gj.m18161a()
                com.inmobi.media.hk r1 = new com.inmobi.media.hk
                r1.<init>(r9)
                r0.mo35310a((com.inmobi.media.C6167hk) r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5806bi.C5812a.handleMessage(android.os.Message):void");
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m17345a(C5784ax axVar) {
            try {
                Message obtain = Message.obtain();
                obtain.what = 4;
                obtain.obj = axVar;
                sendMessage(obtain);
            } catch (Exception unused) {
                String unused2 = C5806bi.f14596b;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m17344a() {
            try {
                sendEmptyMessage(3);
            } catch (Exception unused) {
                String unused2 = C5806bi.f14596b;
            }
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public void m17347b() {
            try {
                sendEmptyMessage(1);
            } catch (Exception unused) {
                String unused2 = C5806bi.f14596b;
            }
        }
    }

    /* renamed from: c */
    static /* synthetic */ void m17321c(C5806bi biVar) {
        if (!biVar.f14606j.get()) {
            biVar.mo34779b();
        }
    }

    /* renamed from: b */
    static /* synthetic */ void m17317b(C5806bi biVar, final String str) {
        C5784ax a = C5803bg.m17286a(str);
        if (a == null || !a.mo34693a()) {
            C5784ax a2 = new C5784ax.C5785a().mo34697a(str, biVar.f14600d.maxRetries, biVar.f14600d.timeToLive).mo34699a();
            if (C5803bg.m17286a(str) == null) {
                biVar.f14599c.mo34776a(a2);
            }
            biVar.f14602f.execute(new Runnable() {
                public final void run() {
                    C5803bg unused = C5806bi.this.f14599c;
                    C5784ax a = C5803bg.m17286a(str);
                    if (a == null) {
                        return;
                    }
                    if (a.mo34693a()) {
                        C5806bi.this.m17320c(a);
                        return;
                    }
                    C5806bi biVar = C5806bi.this;
                    if (biVar.m17313a(a, biVar.f14610o)) {
                        String unused2 = C5806bi.f14596b;
                    } else {
                        String unused3 = C5806bi.f14596b;
                    }
                }
            });
            return;
        }
        biVar.m17320c(a);
    }

    /* renamed from: a */
    static /* synthetic */ void m17310a(C5806bi biVar, List list, String str) {
        CountDownLatch countDownLatch = new CountDownLatch(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            try {
                C5930dl.m17614a(C6183hw.m18324c()).load(str2).fetch((Callback) C5930dl.m17616a((InvocationHandler) new C5815c(countDownLatch, str2, SystemClock.elapsedRealtime(), str)));
            } catch (Exception unused) {
                countDownLatch.countDown();
            }
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException unused2) {
        }
    }
}
