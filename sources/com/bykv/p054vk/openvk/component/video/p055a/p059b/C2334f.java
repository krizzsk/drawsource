package com.bykv.p054vk.openvk.component.video.p055a.p059b;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.util.SparseArray;
import com.bykv.p054vk.openvk.component.video.api.p074f.C2414b;
import com.bykv.p054vk.openvk.component.video.api.p074f.C2415c;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.C2344g;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.p060a.C2290b;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.p060a.C2292c;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.p061b.C2306c;
import com.bykv.p054vk.openvk.component.video.p055a.p066c.C2361a;
import com.bytedance.sdk.component.p123f.C2882e;
import com.bytedance.sdk.component.p123f.C2884f;
import com.bytedance.sdk.component.p123f.C2885g;
import com.facebook.appevents.UserDataStore;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.facebook.internal.security.CertificateUtil;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bykv.vk.openvk.component.video.a.b.f */
/* compiled from: ProxyServer */
public class C2334f {

    /* renamed from: d */
    private static volatile C2334f f4704d;
    /* access modifiers changed from: private */

    /* renamed from: a */
    public volatile ServerSocket f4705a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public volatile int f4706b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final AtomicInteger f4707c = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: e */
    public volatile C2306c f4708e;

    /* renamed from: f */
    private volatile C2292c f4709f;

    /* renamed from: g */
    private volatile C2290b f4710g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final SparseArray<Set<C2344g>> f4711h = new SparseArray<>(2);
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C2344g.C2349c f4712i = new C2344g.C2349c() {
        /* renamed from: a */
        public void mo15778a(C2344g gVar) {
            synchronized (C2334f.this.f4711h) {
                Set set = (Set) C2334f.this.f4711h.get(gVar.mo15687f());
                if (set != null) {
                    set.add(gVar);
                }
            }
        }

        /* renamed from: b */
        public void mo15779b(C2344g gVar) {
            if (C2325e.f4685c) {
                Log.d("ProxyServer", "afterExecute, ProxyTask: " + gVar);
            }
            int f = gVar.mo15687f();
            synchronized (C2334f.this.f4711h) {
                Set set = (Set) C2334f.this.f4711h.get(f);
                if (set != null) {
                    set.remove(gVar);
                }
            }
        }
    };

    /* renamed from: j */
    private volatile C2310c f4713j;

    /* renamed from: k */
    private volatile C2310c f4714k;

    /* renamed from: l */
    private final Runnable f4715l = new Runnable() {
        public void run() {
            try {
                int i = 0;
                ServerSocket unused = C2334f.this.f4705a = new ServerSocket(0, 50, InetAddress.getByName(C2334f.this.m5374i()));
                C2334f fVar = C2334f.this;
                int unused2 = fVar.f4706b = fVar.f4705a.getLocalPort();
                if (C2334f.this.f4706b == -1) {
                    C2334f.m5362b("socket not bound", "");
                    C2334f.this.m5366e();
                    return;
                }
                C2357j.m5432a(C2334f.this.m5374i(), C2334f.this.f4706b);
                if (C2334f.this.m5370g()) {
                    C2415c.m5833b("ProxyServer", "run:  state = ", C2334f.this.f4707c);
                    if (C2334f.this.f4707c.compareAndSet(0, 1)) {
                        C2415c.m5833b("ProxyServer", "run:  state = ", C2334f.this.f4707c);
                        if (C2325e.f4685c) {
                            C2415c.m5831b("ProxyServer", "proxy server start!");
                        }
                        while (C2334f.this.f4707c.get() == 1) {
                            try {
                                Socket accept = C2334f.this.f4705a.accept();
                                C2306c h = C2334f.this.f4708e;
                                if (h != null) {
                                    final C2344g a = new C2344g.C2347a().mo15791a(h).mo15793a(accept).mo15792a(C2334f.this.f4712i).mo15794a();
                                    C2882e.m8032a().execute(new C2885g("ProxyTask", 10) {
                                        public void run() {
                                            a.run();
                                        }
                                    });
                                } else {
                                    C2361a.m5455a(accept);
                                }
                            } catch (IOException e) {
                                e.printStackTrace();
                                C2334f.m5362b("accept error", Log.getStackTraceString(e));
                                i++;
                                if (i > 3) {
                                    break;
                                }
                            } catch (Throwable th) {
                                String stackTraceString = Log.getStackTraceString(th);
                                Log.e("ProxyServer", "proxy server crashed!  " + stackTraceString);
                                C2334f.m5362b("error", stackTraceString);
                            }
                        }
                        if (C2325e.f4685c) {
                            C2415c.m5831b("ProxyServer", "proxy server closed!");
                        }
                        C2334f.this.m5366e();
                    }
                }
            } catch (IOException e2) {
                if (C2325e.f4685c) {
                    Log.e("ProxyServer", "create ServerSocket error!  " + Log.getStackTraceString(e2));
                }
                C2334f.m5362b("create ServerSocket error", Log.getStackTraceString(e2));
                C2334f.this.m5366e();
            }
        }
    };

    /* renamed from: m */
    private final AtomicBoolean f4716m = new AtomicBoolean();

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m5362b(String str, String str2) {
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002f, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo15774a(int r4, java.lang.String r5) {
        /*
            r3 = this;
            r0 = 0
            if (r5 != 0) goto L_0x0004
            return r0
        L_0x0004:
            android.util.SparseArray<java.util.Set<com.bykv.vk.openvk.component.video.a.b.g>> r1 = r3.f4711h
            monitor-enter(r1)
            android.util.SparseArray<java.util.Set<com.bykv.vk.openvk.component.video.a.b.g>> r2 = r3.f4711h     // Catch:{ all -> 0x0030 }
            java.lang.Object r4 = r2.get(r4)     // Catch:{ all -> 0x0030 }
            java.util.Set r4 = (java.util.Set) r4     // Catch:{ all -> 0x0030 }
            if (r4 == 0) goto L_0x002e
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x0030 }
        L_0x0015:
            boolean r2 = r4.hasNext()     // Catch:{ all -> 0x0030 }
            if (r2 == 0) goto L_0x002e
            java.lang.Object r2 = r4.next()     // Catch:{ all -> 0x0030 }
            com.bykv.vk.openvk.component.video.a.b.g r2 = (com.bykv.p054vk.openvk.component.video.p055a.p059b.C2344g) r2     // Catch:{ all -> 0x0030 }
            if (r2 == 0) goto L_0x0015
            java.lang.String r2 = r2.f4591h     // Catch:{ all -> 0x0030 }
            boolean r2 = r5.equals(r2)     // Catch:{ all -> 0x0030 }
            if (r2 == 0) goto L_0x0015
            r4 = 1
            monitor-exit(r1)     // Catch:{ all -> 0x0030 }
            return r4
        L_0x002e:
            monitor-exit(r1)     // Catch:{ all -> 0x0030 }
            return r0
        L_0x0030:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0030 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.p054vk.openvk.component.video.p055a.p059b.C2334f.mo15774a(int, java.lang.String):boolean");
    }

    /* renamed from: a */
    public static C2334f m5358a() {
        if (f4704d == null) {
            synchronized (C2334f.class) {
                if (f4704d == null) {
                    f4704d = new C2334f();
                }
            }
        }
        return f4704d;
    }

    private C2334f() {
        this.f4711h.put(0, new HashSet());
        this.f4711h.put(1, new HashSet());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C2310c mo15775b() {
        return this.f4713j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public C2310c mo15776c() {
        return this.f4714k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo15773a(C2306c cVar) {
        this.f4708e = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo15772a(C2292c cVar) {
        this.f4709f = cVar;
    }

    /* renamed from: a */
    public String mo15771a(boolean z, boolean z2, String str, String... strArr) {
        String str2;
        String str3;
        if (strArr == null || strArr.length == 0) {
            m5362b("url", "url is empty");
            return null;
        } else if (TextUtils.isEmpty(str)) {
            m5362b(SDKConstants.PARAM_KEY, "key is empty");
            return strArr[0];
        } else if (this.f4708e == null) {
            m5362b(UserDataStore.DATE_OF_BIRTH, "VideoProxyDB is null");
            return strArr[0];
        } else {
            if ((z ? this.f4710g : this.f4709f) == null) {
                m5362b("cache", "Cache is null");
                return strArr[0];
            }
            int i = this.f4707c.get();
            if (i != 1) {
                m5362b("state", "ProxyServer is not running, " + i);
                return strArr[0];
            }
            List<String> a = C2361a.m5449a(strArr);
            if (a == null) {
                m5362b("url", "url not start with http/https");
                return strArr[0];
            }
            if (z2) {
                str2 = str;
            } else {
                str2 = C2414b.m5821a(str);
            }
            String a2 = C2352i.m5427a(str, str2, a);
            if (a2 == null) {
                m5362b("url", "combine proxy url error");
                return strArr[0];
            }
            if (z) {
                str3 = "https://" + m5374i() + CertificateUtil.DELIMITER + this.f4706b + "?f=" + 1 + "&" + a2;
            } else {
                str3 = "https://" + m5374i() + CertificateUtil.DELIMITER + this.f4706b + "?" + a2;
            }
            return str3.replaceFirst("s", "");
        }
    }

    /* renamed from: d */
    public void mo15777d() {
        if (this.f4716m.compareAndSet(false, true)) {
            Thread thread = new Thread(this.f4715l);
            thread.setName("tt_pangle_thread_proxy_server");
            thread.start();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m5366e() {
        if (this.f4707c.compareAndSet(1, 2) || this.f4707c.compareAndSet(0, 2)) {
            C2361a.m5454a(this.f4705a);
            m5367f();
        }
    }

    /* renamed from: f */
    private void m5367f() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f4711h) {
            int size = this.f4711h.size();
            for (int i = 0; i < size; i++) {
                Set set = this.f4711h.get(this.f4711h.keyAt(i));
                if (set != null) {
                    arrayList.addAll(set);
                    set.clear();
                }
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C2344g) it.next()).mo15680a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public boolean m5370g() {
        C2884f fVar = new C2884f(new C2338a(m5374i(), this.f4706b), 5, 1);
        C2882e.m8032a().submit(fVar);
        m5372h();
        try {
            if (!((Boolean) fVar.get()).booleanValue()) {
                Log.e("ProxyServer", "Ping error");
                m5362b("ping error", "");
                m5366e();
                return false;
            }
            C2415c.m5831b("ProxyServer", "pingTest: ");
            if (C2325e.f4685c) {
                C2415c.m5831b("ProxyServer", "Ping OK!");
            }
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            m5362b("ping error", Log.getStackTraceString(th));
            m5366e();
            return false;
        }
    }

    /* renamed from: com.bykv.vk.openvk.component.video.a.b.f$a */
    /* compiled from: ProxyServer */
    private static final class C2338a implements Callable<Boolean> {

        /* renamed from: a */
        private final String f4721a;

        /* renamed from: b */
        private final int f4722b;

        C2338a(String str, int i) {
            this.f4721a = str;
            this.f4722b = i;
        }

        /* renamed from: a */
        public Boolean call() {
            Socket socket;
            Throwable th;
            try {
                C2415c.m5831b("ProxyServer", "call: ");
                socket = new Socket(this.f4721a, this.f4722b);
                try {
                    socket.setSoTimeout(2000);
                    OutputStream outputStream = socket.getOutputStream();
                    outputStream.write("Ping\n".getBytes(C2361a.f4784a));
                    outputStream.flush();
                    if ("OK".equals(new BufferedReader(new InputStreamReader(socket.getInputStream())).readLine())) {
                        C2361a.m5455a(socket);
                        return true;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        th.printStackTrace();
                        C2415c.m5831b("ProxyServer", "call: " + th.getMessage());
                        C2334f.m5362b("ping error", Log.getStackTraceString(th));
                        C2361a.m5455a(socket);
                        return false;
                    } catch (Throwable th3) {
                        C2361a.m5455a(socket);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                Throwable th5 = th4;
                socket = null;
                th = th5;
                th.printStackTrace();
                C2415c.m5831b("ProxyServer", "call: " + th.getMessage());
                C2334f.m5362b("ping error", Log.getStackTraceString(th));
                C2361a.m5455a(socket);
                return false;
            }
            C2361a.m5455a(socket);
            return false;
        }
    }

    /* renamed from: h */
    private void m5372h() {
        Socket socket = null;
        try {
            socket = this.f4705a.accept();
            socket.setSoTimeout(2000);
            if ("Ping".equals(new BufferedReader(new InputStreamReader(socket.getInputStream())).readLine())) {
                OutputStream outputStream = socket.getOutputStream();
                outputStream.write("OK\n".getBytes(C2361a.f4784a));
                outputStream.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
            m5362b("ping error", Log.getStackTraceString(e));
        } catch (Throwable th) {
            C2361a.m5455a((Socket) null);
            throw th;
        }
        C2361a.m5455a(socket);
        C2415c.m5831b("ProxyServer", "answerPing: ");
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public String m5374i() {
        return new String(Base64.decode("MTI3LjAuMC4x".getBytes(), 0));
    }
}
