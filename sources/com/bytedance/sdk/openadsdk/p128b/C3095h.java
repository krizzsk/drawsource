package com.bytedance.sdk.openadsdk.p128b;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.openadsdk.core.C3502k;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.C3516n;
import com.bytedance.sdk.openadsdk.p128b.C3101k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.h */
/* compiled from: AdEventThread */
public class C3095h<T extends C3101k> extends HandlerThread implements Handler.Callback {

    /* renamed from: a */
    public static String f7252a = "AdEventThread";

    /* renamed from: b */
    public static String f7253b = "ttad_bk";
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static long f7254l = 180000;

    /* renamed from: c */
    public final C3093f<T> f7255c;

    /* renamed from: d */
    public C3516n<T> f7256d;

    /* renamed from: e */
    public final List<T> f7257e;

    /* renamed from: f */
    public long f7258f;

    /* renamed from: g */
    public boolean f7259g;

    /* renamed from: h */
    public int f7260h;

    /* renamed from: i */
    public Handler f7261i;

    /* renamed from: j */
    public final C3097b f7262j;

    /* renamed from: k */
    public final C3098c f7263k;

    /* renamed from: com.bytedance.sdk.openadsdk.b.h$b */
    /* compiled from: AdEventThread */
    public interface C3097b {
        /* renamed from: a */
        boolean mo18678a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo18674a() {
        return true;
    }

    public C3095h(C3093f<T> fVar, C3516n<T> nVar, C3098c cVar, C3097b bVar) {
        this(f7253b, f7252a, fVar, nVar, cVar, bVar);
    }

    public C3095h(String str, String str2, C3093f<T> fVar, C3516n<T> nVar, C3098c cVar, C3097b bVar) {
        super(str);
        f7252a = str2;
        this.f7263k = cVar;
        this.f7262j = bVar;
        this.f7255c = fVar;
        this.f7256d = nVar;
        this.f7257e = Collections.synchronizedList(new LinkedList());
    }

    /* access modifiers changed from: protected */
    public void onLooperPrepared() {
        this.f7258f = System.currentTimeMillis();
        this.f7261i = new Handler(getLooper(), this);
        C3502k.m10921c().postDelayed(new C3096a(this.f7261i), f7254l);
    }

    public boolean handleMessage(Message message) {
        switch (message.what) {
            case 1:
                m8955a((C3101k) message.obj);
                return true;
            case 2:
                m8973g();
                return true;
            case 3:
                m8972f();
                return true;
            case 4:
                m8969e();
                return true;
            case 5:
                m8965c();
                return true;
            case 6:
                m8967d();
                return true;
            default:
                return true;
        }
    }

    /* renamed from: c */
    private void m8965c() {
        this.f7255c.mo18663a(this.f7263k.f7268d, this.f7263k.f7269e);
        this.f7259g = this.f7255c.mo18668a();
        this.f7260h = this.f7255c.mo18669b();
        if (this.f7259g) {
            m8956a("onHandleInitEvent serverBusy, retryCount = " + this.f7260h);
            m8975i();
            return;
        }
        m8962b(this.f7255c.mo18661a(30, "_id"));
        m8956a("onHandleInitEvent cacheData count = " + this.f7257e.size());
        m8974h();
    }

    /* renamed from: d */
    private void m8967d() {
        this.f7255c.mo18663a(this.f7263k.f7268d, this.f7263k.f7269e);
        this.f7259g = this.f7255c.mo18668a();
        this.f7260h = this.f7255c.mo18669b();
        if (this.f7259g) {
            m8956a("onHandleInitEvent serverBusy, retryCount = " + this.f7260h);
            m8975i();
            return;
        }
        m8962b(this.f7255c.mo18661a(30, "_id"));
        m8968d(this.f7257e);
        m8956a("onHandleInitEvent cacheData count = " + this.f7257e.size());
        m8974h();
    }

    /* renamed from: b */
    private void m8962b(List<T> list) {
        if (list != null) {
            try {
                if (list.size() != 0) {
                    HashSet hashSet = new HashSet();
                    for (T d : this.f7257e) {
                        hashSet.add(d.mo18568d());
                    }
                    for (T t : list) {
                        if (!hashSet.contains(t.mo18568d())) {
                            this.f7257e.add(t);
                        }
                    }
                    return;
                }
            } catch (Exception unused) {
                return;
            }
        }
        m8956a("reloadCacheList adEventList is empty======");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0045 A[LOOP:0: B:11:0x0045->B:14:0x0060, LOOP_START] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8969e() {
        /*
            r4 = this;
            com.bytedance.sdk.openadsdk.b.h$b r0 = r4.f7262j
            boolean r0 = r0.mo18678a()
            if (r0 != 0) goto L_0x0016
            r0 = 4
            com.bytedance.sdk.openadsdk.b.h$c r1 = r4.f7263k
            long r1 = r1.f7267c
            r4.m8954a((int) r0, (long) r1)
            java.lang.String r0 = "onHandleServerBusyRetryEvent, no net"
            r4.m8956a((java.lang.String) r0)
            return
        L_0x0016:
            com.bytedance.sdk.openadsdk.b.f<T> r0 = r4.f7255c
            r1 = 30
            java.lang.String r2 = "_id"
            java.util.List r0 = r0.mo18661a((int) r1, (java.lang.String) r2)
            boolean r1 = com.bytedance.sdk.component.utils.C2900j.m8097a(r0)
            if (r1 == 0) goto L_0x0032
            java.lang.String r0 = "onHandleServerBusyRetryEvent, empty list start routine"
            r4.m8956a((java.lang.String) r0)
            r4.m8981o()
            r4.m8977k()
            return
        L_0x0032:
            boolean r1 = r4.mo18674a()
            r2 = 1
            if (r1 == 0) goto L_0x0063
            java.util.HashMap r0 = r4.m8971f(r0)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0045:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0066
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            boolean r3 = r0.hasNext()
            r3 = r3 ^ r2
            boolean r1 = r4.m8960a(r1, (boolean) r3)
            if (r1 != 0) goto L_0x0045
            goto L_0x0066
        L_0x0063:
            r4.m8960a(r0, (boolean) r2)
        L_0x0066:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.p128b.C3095h.m8969e():void");
    }

    /* renamed from: a */
    private boolean m8960a(List<T> list, boolean z) {
        C3099i a = mo18673a(list);
        if (a == null) {
            return false;
        }
        if (a.f7271a) {
            m8956a("onHandleServerBusyRetryEvent, success");
            m8970e(list);
            m8957a(z);
            return true;
        } else if (m8958a(a)) {
            int i = this.f7260h + 1;
            this.f7260h = i;
            this.f7255c.mo18662a(i);
            this.f7255c.mo18666a(list, this.f7263k.f7268d, this.f7263k.f7269e);
            m8975i();
            m8956a("onHandleServerBusyRetryEvent, serverbusy, count = " + this.f7260h);
            return false;
        } else if (m8963b(a) || m8959a(list, a)) {
            m8970e(list);
            m8957a(true);
            return false;
        } else {
            m8976j();
            return false;
        }
    }

    /* renamed from: c */
    private boolean m8966c(List<T> list) {
        JSONObject b;
        if (list == null || list.size() == 0 || !(list.get(0) instanceof C3060a) || (b = ((C3060a) list.get(0)).mo18566b()) == null) {
            return true;
        }
        return TextUtils.isEmpty(b.optString("app_log_url"));
    }

    /* renamed from: a */
    public C3099i mo18673a(List<T> list) {
        if (this.f7256d == null) {
            C3513m.m10971f();
        }
        C3516n<T> nVar = this.f7256d;
        if (nVar == null) {
            return null;
        }
        return nVar.mo19981a(list);
    }

    /* renamed from: f */
    private void m8972f() {
        if (!this.f7259g) {
            m8956a("onHandleRoutineRetryEvent");
            m8974h();
        }
    }

    /* renamed from: g */
    private void m8973g() {
        if (!this.f7259g) {
            m8956a("onHandleRoutineUploadEvent");
            m8974h();
        }
    }

    /* renamed from: a */
    private void m8955a(T t) {
        C2905l.m8111b("ReportEvent", "execute onHandleReceivedAdEvent()  start...");
        this.f7255c.mo18664a(t);
        if (!this.f7259g) {
            m8956a("onHandleReceivedAdEvent");
            this.f7257e.add(t);
            m8968d(this.f7257e);
            C2905l.m8111b("ReportEvent", "execute onHandleReceivedAdEvent() ... mIsServerBusy =" + this.f7259g);
            if (m8980n()) {
                C2905l.m8111b("ReportEvent", "execute onHandleReceivedAdEvent()  needUploadRoutine ... upload ");
                m8974h();
            }
        }
    }

    /* renamed from: d */
    private void m8968d(List<T> list) {
        if (list != null) {
            if (list.size() <= 45) {
                m8956a("start and return, checkAndDeleteEvent local size:" + list.size() + "less than:" + 45);
                return;
            }
            int size = list.size() - 30;
            m8956a("start checkAndDeleteEvent local size,deleteCnt:" + list.size() + "," + size);
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < size; i++) {
                arrayList.add((C3101k) list.get(i));
            }
            list.removeAll(arrayList);
            m8956a("end checkAndDeleteEvent local size:" + list.size());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x006b A[LOOP:0: B:11:0x006b->B:14:0x0086, LOOP_START] */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m8974h() {
        /*
            r4 = this;
            java.lang.String r0 = "ReportEvent"
            java.lang.String r1 = "execute doRoutineUpload ... start "
            com.bytedance.sdk.component.utils.C2905l.m8114c(r0, r1)
            android.os.Handler r1 = r4.f7261i
            r2 = 3
            r1.removeMessages(r2)
            android.os.Handler r1 = r4.f7261i
            r2 = 2
            r1.removeMessages(r2)
            android.os.Handler r1 = r4.f7261i
            r2 = 6
            r1.removeMessages(r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "execute doRoutineUpload ... ListUtils.isEmpty(mCacheList) :"
            r1.append(r2)
            java.util.List<T> r2 = r4.f7257e
            boolean r2 = com.bytedance.sdk.component.utils.C2900j.m8097a(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.bytedance.sdk.component.utils.C2905l.m8114c(r0, r1)
            java.util.List<T> r1 = r4.f7257e
            boolean r1 = com.bytedance.sdk.component.utils.C2900j.m8097a(r1)
            if (r1 == 0) goto L_0x0045
            long r0 = java.lang.System.currentTimeMillis()
            r4.f7258f = r0
            r4.m8977k()
            return
        L_0x0045:
            com.bytedance.sdk.openadsdk.b.h$b r1 = r4.f7262j
            boolean r1 = r1.mo18678a()
            if (r1 != 0) goto L_0x0056
            java.lang.String r1 = "execute doRoutineUpload ...no network, wait retry "
            com.bytedance.sdk.component.utils.C2905l.m8114c(r0, r1)
            r4.m8976j()
            return
        L_0x0056:
            boolean r0 = r4.mo18674a()
            r1 = 1
            if (r0 == 0) goto L_0x0089
            java.util.List<T> r0 = r4.f7257e
            java.util.HashMap r0 = r4.m8971f(r0)
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x006b:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x008e
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getValue()
            java.util.List r2 = (java.util.List) r2
            boolean r3 = r0.hasNext()
            r3 = r3 ^ r1
            boolean r2 = r4.m8964b(r2, r3)
            if (r2 != 0) goto L_0x006b
            goto L_0x008e
        L_0x0089:
            java.util.List<T> r0 = r4.f7257e
            r4.m8964b(r0, r1)
        L_0x008e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.p128b.C3095h.m8974h():void");
    }

    /* renamed from: b */
    private boolean m8964b(List<T> list, boolean z) {
        C3099i a = mo18673a(list);
        if (a == null) {
            return false;
        }
        if (a.f7271a) {
            C2905l.m8114c("ReportEvent", "doRoutineUpload success");
            m8970e(list);
            m8957a(z);
            return true;
        } else if (m8958a(a)) {
            m8978l();
            return false;
        } else if (m8963b(a) || m8959a(list, a)) {
            m8970e(list);
            m8957a(true);
            return false;
        } else if (this.f7259g) {
            return false;
        } else {
            m8976j();
            return false;
        }
    }

    /* renamed from: a */
    private void m8957a(boolean z) {
        this.f7258f = System.currentTimeMillis();
        m8981o();
        if (z) {
            m8977k();
        }
    }

    /* renamed from: e */
    private void m8970e(List<T> list) {
        this.f7255c.mo18665a(list);
        this.f7257e.removeAll(list);
    }

    /* renamed from: i */
    private void m8975i() {
        m8954a(4, m8979m());
    }

    /* renamed from: j */
    private void m8976j() {
        m8954a(3, this.f7263k.f7267c);
    }

    /* renamed from: k */
    private void m8977k() {
        m8954a(2, this.f7263k.f7266b);
    }

    /* renamed from: a */
    private void m8954a(int i, long j) {
        Message obtainMessage = this.f7261i.obtainMessage();
        obtainMessage.what = i;
        this.f7261i.sendMessageDelayed(obtainMessage, j);
    }

    /* renamed from: l */
    private void m8978l() {
        this.f7259g = true;
        this.f7255c.mo18667a(true);
        this.f7257e.clear();
        this.f7261i.removeMessages(3);
        this.f7261i.removeMessages(2);
        m8975i();
    }

    /* renamed from: m */
    private long m8979m() {
        return ((long) ((this.f7260h % 3) + 1)) * this.f7263k.f7270f;
    }

    /* renamed from: a */
    private static boolean m8958a(C3099i iVar) {
        return iVar.f7272b == 509;
    }

    /* renamed from: a */
    private boolean m8959a(List<T> list, C3099i iVar) {
        if (!m8966c(list) && iVar.f7272b >= 400 && iVar.f7272b < 500) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m8963b(C3099i iVar) {
        return iVar.f7274d;
    }

    /* renamed from: n */
    private boolean m8980n() {
        return !this.f7259g && (this.f7257e.size() >= this.f7263k.f7265a || System.currentTimeMillis() - this.f7258f >= this.f7263k.f7266b);
    }

    /* renamed from: o */
    private void m8981o() {
        this.f7259g = false;
        this.f7255c.mo18667a(false);
        this.f7260h = 0;
        this.f7255c.mo18662a(0);
        this.f7261i.removeMessages(4);
    }

    /* renamed from: a */
    private void m8956a(String str) {
        C2905l.m8114c(f7252a, str);
    }

    /* renamed from: com.bytedance.sdk.openadsdk.b.h$c */
    /* compiled from: AdEventThread */
    public static class C3098c {

        /* renamed from: a */
        final int f7265a;

        /* renamed from: b */
        final long f7266b;

        /* renamed from: c */
        final long f7267c;

        /* renamed from: d */
        final int f7268d;

        /* renamed from: e */
        final long f7269e;

        /* renamed from: f */
        final long f7270f;

        C3098c(int i, long j, long j2, int i2, long j3, long j4) {
            this.f7265a = i;
            this.f7266b = j;
            this.f7267c = j2;
            this.f7268d = i2;
            this.f7269e = j3;
            this.f7270f = j4;
        }

        /* renamed from: a */
        public static C3098c m8985a() {
            return new C3098c(1, 120000, 15000, 5, 172800000, 300000);
        }

        /* renamed from: b */
        public static C3098c m8986b() {
            return new C3098c(3, 120000, 15000, 5, 172800000, 300000);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        r2 = (com.bytedance.sdk.openadsdk.p128b.C3060a) r6.get(r1);
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.util.HashMap<java.lang.String, java.util.List<T>> m8971f(java.util.List<T> r6) {
        /*
            r5 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 0
        L_0x0006:
            int r2 = r6.size()
            if (r1 >= r2) goto L_0x003c
            java.lang.Object r2 = r6.get(r1)
            boolean r2 = r2 instanceof com.bytedance.sdk.openadsdk.p128b.C3060a
            if (r2 == 0) goto L_0x0039
            java.lang.Object r2 = r6.get(r1)
            com.bytedance.sdk.openadsdk.b.a r2 = (com.bytedance.sdk.openadsdk.p128b.C3060a) r2
            org.json.JSONObject r3 = r2.mo18566b()
            if (r3 == 0) goto L_0x0039
            java.lang.String r4 = "app_log_url"
            java.lang.String r3 = r3.optString(r4)
            java.lang.Object r4 = r0.get(r3)
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L_0x0036
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r0.put(r3, r4)
        L_0x0036:
            r4.add(r2)
        L_0x0039:
            int r1 = r1 + 1
            goto L_0x0006
        L_0x003c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.p128b.C3095h.m8971f(java.util.List):java.util.HashMap");
    }

    /* renamed from: com.bytedance.sdk.openadsdk.b.h$a */
    /* compiled from: AdEventThread */
    private static class C3096a implements Runnable {

        /* renamed from: a */
        WeakReference<Handler> f7264a;

        public C3096a(Handler handler) {
            this.f7264a = new WeakReference<>(handler);
        }

        public void run() {
            Handler handler;
            C2905l.m8114c(C3095h.f7252a, "EventTimerRunnable: run");
            WeakReference<Handler> weakReference = this.f7264a;
            if (weakReference != null && weakReference.get() != null && (handler = (Handler) this.f7264a.get()) != null) {
                handler.removeMessages(6);
                Message obtainMessage = handler.obtainMessage();
                obtainMessage.what = 6;
                handler.sendMessage(obtainMessage);
                C3502k.m10921c().postDelayed(this, C3095h.f7254l);
            }
        }
    }
}
