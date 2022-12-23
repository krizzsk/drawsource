package com.inmobi.media;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.inmobi.media.C6101fz;
import com.inmobi.media.C6108gb;
import com.smaato.sdk.core.dns.DnsName;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.inmobi.media.fv */
/* compiled from: ConfigComponent */
public class C6094fv {

    /* renamed from: a */
    public static boolean f15393a = false;

    /* renamed from: b */
    public static AtomicBoolean f15394b = new AtomicBoolean(false);

    /* renamed from: c */
    public static CopyOnWriteArrayList<C6093fu> f15395c = new CopyOnWriteArrayList<>();
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final String f15396d = C6094fv.class.getSimpleName();

    /* renamed from: e */
    private static Map<C6093fu, ArrayList<WeakReference<C6097c>>> f15397e = new HashMap();

    /* renamed from: f */
    private static C6095a f15398f;

    /* renamed from: com.inmobi.media.fv$c */
    /* compiled from: ConfigComponent */
    public interface C6097c {
        /* renamed from: a */
        void mo34420a(C6093fu fuVar);
    }

    static {
        HandlerThread handlerThread = new HandlerThread("ConfigBootstrapHandler");
        handlerThread.start();
        f15398f = new C6095a(handlerThread.getLooper());
    }

    /* renamed from: a */
    public static void m18086a() {
        if (!f15394b.getAndSet(true)) {
            new C6098fw();
            f15395c.addAll(C6098fw.m18101a());
            m18084a("root", C6183hw.m18332f(), (C6097c) null);
        }
    }

    /* renamed from: b */
    public static void m18092b() {
        if (f15394b.getAndSet(false)) {
            f15395c.clear();
            f15398f.sendEmptyMessage(5);
        }
    }

    /* renamed from: a */
    public static C6093fu m18084a(String str, String str2, C6097c cVar) {
        C6093fu a = C6093fu.m18077a(str, str2);
        if (str2 == null) {
            return a;
        }
        Message obtainMessage = f15398f.obtainMessage();
        obtainMessage.what = 0;
        obtainMessage.obj = new C6100fy(a, cVar);
        f15398f.sendMessage(obtainMessage);
        if (!f15395c.isEmpty()) {
            Iterator<C6093fu> it = f15395c.iterator();
            while (it.hasNext()) {
                C6093fu next = it.next();
                if (next.equals(a)) {
                    return next;
                }
            }
        }
        return a;
    }

    /* renamed from: a */
    public static void m18089a(String str) {
        new C6098fw();
        C6115gg ggVar = (C6115gg) C6098fw.m18100a("root", str);
        String str2 = ggVar.latestSdkInfo.version;
        String str3 = ggVar.latestSdkInfo.url;
        if (str2.trim().length() != 0 && m18094b(C6184hx.m18347b(), str2.trim())) {
            String str4 = f15396d;
            C6195ic.m18378a((byte) 2, str4, "A newer version (version " + str2 + ") of the InMobi SDK is available! You are currently on an older version (Version " + C6184hx.m18347b() + "). Please download the latest InMobi SDK from " + str3);
        }
    }

    /* renamed from: a */
    private static boolean m18091a(long j, long j2) {
        return System.currentTimeMillis() - j > j2 * 1000;
    }

    /* renamed from: b */
    private static void m18093b(C6093fu fuVar) {
        Message obtainMessage = f15398f.obtainMessage();
        obtainMessage.what = 1;
        obtainMessage.obj = fuVar;
        f15398f.sendMessage(obtainMessage);
    }

    /* renamed from: com.inmobi.media.fv$b */
    /* compiled from: ConfigComponent */
    static class C6096b {

        /* renamed from: a */
        final String f15403a;

        /* renamed from: b */
        final String f15404b;

        C6096b(String str, String str2) {
            this.f15403a = str;
            this.f15404b = str2;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C6096b)) {
                return false;
            }
            C6096b bVar = (C6096b) obj;
            if (!this.f15403a.equals(bVar.f15403a) || !this.f15404b.equals(bVar.f15404b)) {
                return false;
            }
            return true;
        }

        public final int hashCode() {
            return this.f15403a.hashCode() + this.f15404b.hashCode();
        }
    }

    /* renamed from: com.inmobi.media.fv$a */
    /* compiled from: ConfigComponent */
    static final class C6095a extends Handler implements C6101fz.C6102a {

        /* renamed from: a */
        private List<C6093fu> f15399a = new ArrayList();

        /* renamed from: b */
        private Map<C6096b, Map<String, C6093fu>> f15400b = new HashMap();

        /* renamed from: c */
        private Map<String, C6093fu> f15401c = new HashMap();

        /* renamed from: d */
        private ExecutorService f15402d;

        C6095a(Looper looper) {
            super(looper);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v1, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: int} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v1, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: boolean} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: boolean} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void handleMessage(android.os.Message r20) {
            /*
                r19 = this;
                r0 = r19
                r1 = r20
                int r2 = r1.what
                r3 = 0
                r4 = 0
                r5 = 3
                r6 = 1
                java.lang.String r7 = "root"
                switch(r2) {
                    case 0: goto L_0x025a;
                    case 1: goto L_0x01df;
                    case 2: goto L_0x01c7;
                    case 3: goto L_0x0152;
                    case 4: goto L_0x00a3;
                    case 5: goto L_0x0089;
                    case 6: goto L_0x0016;
                    default: goto L_0x000f;
                }
            L_0x000f:
                java.lang.String unused = com.inmobi.media.C6094fv.f15396d
                int r1 = r1.what
                goto L_0x028c
            L_0x0016:
                java.lang.Object r1 = r1.obj
                com.inmobi.media.gb$a r1 = (com.inmobi.media.C6108gb.C6109a) r1
                com.inmobi.media.fw r2 = new com.inmobi.media.fw
                r2.<init>()
                boolean r2 = r1.mo35297a()
                if (r2 != 0) goto L_0x0080
                int r2 = r1.f15433a
                r3 = 304(0x130, float:4.26E-43)
                if (r2 != r3) goto L_0x004f
                java.lang.String unused = com.inmobi.media.C6094fv.f15396d
                com.inmobi.media.fu r2 = r1.f15434b
                r2.mo35278b()
                com.inmobi.media.fu r2 = r1.f15434b
                java.lang.String r2 = r2.mo35284g()
                if (r2 == 0) goto L_0x004e
                com.inmobi.media.fu r2 = r1.f15434b
                java.lang.String r2 = r2.mo35278b()
                com.inmobi.media.fu r1 = r1.f15434b
                java.lang.String r1 = r1.mo35284g()
                long r3 = java.lang.System.currentTimeMillis()
                com.inmobi.media.C6098fw.m18103a(r2, r1, r3)
            L_0x004e:
                return
            L_0x004f:
                com.inmobi.media.fu r2 = r1.f15434b
                com.inmobi.media.C6098fw.m18102a((com.inmobi.media.C6093fu) r2)
                java.lang.String unused = com.inmobi.media.C6094fv.f15396d
                com.inmobi.media.fu r2 = r1.f15434b
                r2.mo35278b()
                java.lang.String unused = com.inmobi.media.C6094fv.f15396d
                com.inmobi.media.fu r2 = r1.f15434b
                r2.mo35279c()
                java.lang.String unused = com.inmobi.media.C6094fv.f15396d
                com.inmobi.media.fu r2 = r1.f15434b
                r2.mo35284g()
                java.util.concurrent.CopyOnWriteArrayList<com.inmobi.media.fu> r2 = com.inmobi.media.C6094fv.f15395c
                com.inmobi.media.fu r3 = r1.f15434b
                r2.remove(r3)
                java.util.concurrent.CopyOnWriteArrayList<com.inmobi.media.fu> r2 = com.inmobi.media.C6094fv.f15395c
                com.inmobi.media.fu r3 = r1.f15434b
                r2.add(r3)
                com.inmobi.media.fu r1 = r1.f15434b
                com.inmobi.media.C6094fv.m18087a((com.inmobi.media.C6093fu) r1)
                return
            L_0x0080:
                java.lang.String unused = com.inmobi.media.C6094fv.f15396d
                com.inmobi.media.fu r1 = r1.f15434b
                r1.mo35278b()
                return
            L_0x0089:
                java.util.concurrent.ExecutorService r1 = r0.f15402d
                if (r1 == 0) goto L_0x00a2
                boolean r1 = r1.isShutdown()
                if (r1 != 0) goto L_0x00a2
                r0.f15401c = r3
                java.util.Map<com.inmobi.media.fv$b, java.util.Map<java.lang.String, com.inmobi.media.fu>> r1 = r0.f15400b
                r1.clear()
                r0.removeMessages(r5)
                java.util.concurrent.ExecutorService r1 = r0.f15402d
                r1.shutdownNow()
            L_0x00a2:
                return
            L_0x00a3:
                java.util.Map<com.inmobi.media.fv$b, java.util.Map<java.lang.String, com.inmobi.media.fu>> r1 = r0.f15400b
                boolean r1 = r1.isEmpty()
                if (r1 != 0) goto L_0x014a
                java.util.Map<com.inmobi.media.fv$b, java.util.Map<java.lang.String, com.inmobi.media.fu>> r1 = r0.f15400b
                java.util.Set r1 = r1.entrySet()
                java.util.Iterator r1 = r1.iterator()
                java.lang.Object r1 = r1.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getValue()
                java.util.Map r2 = (java.util.Map) r2
                r0.f15401c = r2
                java.util.Map<com.inmobi.media.fv$b, java.util.Map<java.lang.String, com.inmobi.media.fu>> r2 = r0.f15400b
                java.lang.Object r4 = r1.getKey()
                r2.remove(r4)
                java.lang.Object r2 = r1.getKey()
                com.inmobi.media.fv$b r2 = (com.inmobi.media.C6094fv.C6096b) r2
                java.util.Map<java.lang.String, com.inmobi.media.fu> r4 = r0.f15401c
                java.lang.Object r1 = r1.getKey()
                com.inmobi.media.fv$b r1 = (com.inmobi.media.C6094fv.C6096b) r1
                java.lang.String r1 = r1.f15404b
                com.inmobi.media.fw r5 = new com.inmobi.media.fw
                r5.<init>()
                com.inmobi.media.fu r5 = com.inmobi.media.C6098fw.m18100a(r7, r1)
                com.inmobi.media.gg r5 = (com.inmobi.media.C6115gg) r5
                int r16 = r5.mo35304h()
                int r17 = r5.mo35303e()
                com.inmobi.media.ja r15 = new com.inmobi.media.ja
                com.inmobi.media.ge r8 = r5.mo35283f()
                r15.<init>(r8)
                boolean r8 = com.inmobi.media.C6219in.m18465f()
                if (r8 != 0) goto L_0x0109
                boolean r9 = r4.containsKey(r7)
                if (r9 == 0) goto L_0x0109
                java.util.Map r4 = com.inmobi.media.C6094fv.m18085a((java.util.Map) r4)
                goto L_0x010a
            L_0x0109:
                r6 = r8
            L_0x010a:
                com.inmobi.media.ga r14 = new com.inmobi.media.ga
                java.lang.String r11 = r2.f15403a
                r8 = r14
                r9 = r4
                r10 = r15
                r12 = r17
                r13 = r16
                r2 = r14
                r14 = r6
                r18 = r15
                r15 = r1
                r8.<init>(r9, r10, r11, r12, r13, r14, r15)
                boolean r7 = r4.containsKey(r7)
                if (r7 == 0) goto L_0x013b
                java.lang.String r11 = r5.mo35307k()
                com.inmobi.media.ga r3 = new com.inmobi.media.ga
                java.util.Map r9 = com.inmobi.media.C6094fv.m18085a((java.util.Map) r4)
                r14 = 1
                r8 = r3
                r10 = r18
                r12 = r17
                r13 = r16
                r15 = r6
                r16 = r1
                r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16)
            L_0x013b:
                com.inmobi.media.fz r1 = new com.inmobi.media.fz
                r1.<init>(r0, r2, r3)
                java.util.concurrent.ExecutorService r2 = r0.f15402d     // Catch:{ OutOfMemoryError -> 0x0146 }
                r2.execute(r1)     // Catch:{ OutOfMemoryError -> 0x0146 }
                return
            L_0x0146:
                java.lang.String unused = com.inmobi.media.C6094fv.f15396d
                return
            L_0x014a:
                java.lang.String unused = com.inmobi.media.C6094fv.f15396d
                r1 = 5
                r0.sendEmptyMessage(r1)
                return
            L_0x0152:
                java.util.List<com.inmobi.media.fu> r1 = r0.f15399a
            L_0x0154:
                int r2 = r1.size()
                if (r4 >= r2) goto L_0x01a4
                java.lang.Object r2 = r1.get(r4)
                com.inmobi.media.fu r2 = (com.inmobi.media.C6093fu) r2
                java.lang.String r3 = r2.mo35284g()
                if (r3 == 0) goto L_0x01a1
                com.inmobi.media.fw r3 = new com.inmobi.media.fw
                r3.<init>()
                java.lang.String r3 = r2.mo35284g()
                com.inmobi.media.fu r3 = com.inmobi.media.C6098fw.m18100a(r7, r3)
                com.inmobi.media.gg r3 = (com.inmobi.media.C6115gg) r3
                com.inmobi.media.fv$b r5 = new com.inmobi.media.fv$b
                java.lang.String r8 = r2.mo35278b()
                java.lang.String r3 = r3.mo35302b(r8)
                java.lang.String r8 = r2.mo35284g()
                r5.<init>(r3, r8)
                java.util.Map<com.inmobi.media.fv$b, java.util.Map<java.lang.String, com.inmobi.media.fu>> r3 = r0.f15400b
                java.lang.Object r3 = r3.get(r5)
                java.util.HashMap r3 = (java.util.HashMap) r3
                if (r3 != 0) goto L_0x019a
                java.util.HashMap r3 = new java.util.HashMap
                r3.<init>()
                java.util.Map<com.inmobi.media.fv$b, java.util.Map<java.lang.String, com.inmobi.media.fu>> r8 = r0.f15400b
                r8.put(r5, r3)
            L_0x019a:
                java.lang.String r5 = r2.mo35278b()
                r3.put(r5, r2)
            L_0x01a1:
                int r4 = r4 + 1
                goto L_0x0154
            L_0x01a4:
                java.util.List<com.inmobi.media.fu> r1 = r0.f15399a
                r1.clear()
                java.util.concurrent.ExecutorService r1 = r0.f15402d
                if (r1 == 0) goto L_0x01b3
                boolean r1 = r1.isShutdown()
                if (r1 == 0) goto L_0x028c
            L_0x01b3:
                com.inmobi.media.ib r1 = new com.inmobi.media.ib
                java.lang.String r2 = com.inmobi.media.C6094fv.f15396d
                r1.<init>(r2)
                java.util.concurrent.ExecutorService r1 = java.util.concurrent.Executors.newFixedThreadPool(r6, r1)
                r0.f15402d = r1
                r1 = 4
                r0.sendEmptyMessage(r1)
                return
            L_0x01c7:
                com.inmobi.media.fw r2 = new com.inmobi.media.fw
                r2.<init>()
                java.lang.Object r1 = r1.obj
                java.lang.String r1 = (java.lang.String) r1
                com.inmobi.media.fu r1 = com.inmobi.media.C6098fw.m18100a(r7, r1)
                com.inmobi.media.gg r1 = (com.inmobi.media.C6115gg) r1
                int r1 = r1.waitTime
                int r1 = r1 * 1000
                long r1 = (long) r1
                r0.sendEmptyMessageDelayed(r5, r1)
                return
            L_0x01df:
                java.lang.Object r1 = r1.obj
                com.inmobi.media.fu r1 = (com.inmobi.media.C6093fu) r1
                java.lang.String r2 = r1.mo35284g()
                if (r2 != 0) goto L_0x01f0
                java.lang.String unused = com.inmobi.media.C6094fv.f15396d
                r1.mo35278b()
                return
            L_0x01f0:
                java.lang.String r2 = r1.mo35278b()
                java.lang.String r3 = r1.mo35284g()
                com.inmobi.media.fw r5 = new com.inmobi.media.fw
                r5.<init>()
                com.inmobi.media.fu r5 = com.inmobi.media.C6098fw.m18100a(r7, r3)
                com.inmobi.media.gg r5 = (com.inmobi.media.C6115gg) r5
                com.inmobi.media.fv$b r7 = new com.inmobi.media.fv$b
                java.lang.String r5 = r5.mo35302b(r2)
                r7.<init>(r5, r3)
                java.util.Map<com.inmobi.media.fv$b, java.util.Map<java.lang.String, com.inmobi.media.fu>> r3 = r0.f15400b
                java.lang.Object r3 = r3.get(r7)
                if (r3 == 0) goto L_0x0223
                java.util.Map<com.inmobi.media.fv$b, java.util.Map<java.lang.String, com.inmobi.media.fu>> r3 = r0.f15400b
                java.lang.Object r3 = r3.get(r7)
                java.util.Map r3 = (java.util.Map) r3
                boolean r3 = r3.containsKey(r2)
                if (r3 == 0) goto L_0x0223
                r4 = r6
            L_0x0223:
                java.util.Map<java.lang.String, com.inmobi.media.fu> r3 = r0.f15401c
                if (r3 == 0) goto L_0x022e
                boolean r2 = r3.containsKey(r2)
                if (r2 == 0) goto L_0x022e
                goto L_0x022f
            L_0x022e:
                r6 = r4
            L_0x022f:
                java.lang.String unused = com.inmobi.media.C6094fv.f15396d
                r1.mo35278b()
                if (r6 != 0) goto L_0x0253
                java.util.List<com.inmobi.media.fu> r2 = r0.f15399a
                r2.add(r1)
                r2 = 2
                boolean r3 = r0.hasMessages(r2)
                if (r3 != 0) goto L_0x028c
                android.os.Message r3 = android.os.Message.obtain()
                r3.what = r2
                java.lang.String r1 = r1.mo35284g()
                r3.obj = r1
                r0.sendMessage(r3)
                return
            L_0x0253:
                java.lang.String unused = com.inmobi.media.C6094fv.f15396d
                r1.mo35278b()
                return
            L_0x025a:
                java.lang.Object r1 = r1.obj
                com.inmobi.media.fy r1 = (com.inmobi.media.C6100fy) r1
                com.inmobi.media.fu r2 = r1.f15409a
                java.util.concurrent.atomic.AtomicBoolean r3 = com.inmobi.media.C6094fv.f15394b
                boolean r3 = r3.get()
                if (r3 != 0) goto L_0x026f
                java.lang.String unused = com.inmobi.media.C6094fv.f15396d
                r2.mo35278b()
                return
            L_0x026f:
                com.inmobi.media.fv$c r1 = r1.f15410b
                com.inmobi.media.C6094fv.m18088a((com.inmobi.media.C6093fu) r2, (com.inmobi.media.C6094fv.C6097c) r1)
                java.lang.String r1 = r2.mo35284g()
                if (r1 != 0) goto L_0x0281
                java.lang.String unused = com.inmobi.media.C6094fv.f15396d
                r2.mo35278b()
                return
            L_0x0281:
                java.lang.String r1 = r2.mo35278b()
                java.lang.String r2 = r2.mo35284g()
                com.inmobi.media.C6094fv.m18090a((java.lang.String) r1, (java.lang.String) r2)
            L_0x028c:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6094fv.C6095a.handleMessage(android.os.Message):void");
        }

        /* renamed from: a */
        public final void mo35286a(C6108gb.C6109a aVar) {
            Message obtain = Message.obtain();
            obtain.what = 6;
            obtain.obj = aVar;
            sendMessage(obtain);
        }

        /* renamed from: a */
        public final void mo35287a(String str) {
            Message obtain = Message.obtain();
            obtain.what = 4;
            obtain.obj = str;
            sendMessage(obtain);
        }
    }

    /* renamed from: b */
    private static boolean m18094b(String str, String str2) {
        String[] split = str.split(DnsName.ESCAPED_DOT);
        String[] split2 = str2.split(DnsName.ESCAPED_DOT);
        try {
            for (String valueOf : split) {
                if (Integer.valueOf(valueOf).intValue() < 0) {
                    return false;
                }
            }
            for (String valueOf2 : split2) {
                if (Integer.valueOf(valueOf2).intValue() < 0) {
                    return false;
                }
            }
            int length = split.length < split2.length ? split.length : split2.length;
            int i = 0;
            while (i < length) {
                if (split[i].equals(split2[i])) {
                    i++;
                } else if (Integer.valueOf(split[i]).intValue() < Integer.valueOf(split2[i]).intValue()) {
                    return true;
                } else {
                    return false;
                }
            }
            if (split.length < split2.length) {
                return true;
            }
            return false;
        } catch (NumberFormatException unused) {
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m18088a(C6093fu fuVar, C6097c cVar) {
        WeakReference weakReference;
        ArrayList arrayList = f15397e.get(fuVar);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (cVar == null) {
            weakReference = null;
        } else {
            weakReference = new WeakReference(cVar);
        }
        arrayList.add(weakReference);
        f15397e.put(fuVar, arrayList);
    }

    /* renamed from: a */
    static /* synthetic */ void m18090a(String str, String str2) {
        new C6098fw();
        C6093fu a = C6093fu.m18077a(str, str2);
        if (C6098fw.m18104b("root", str2)) {
            m18093b(C6093fu.m18077a("root", str2));
            return;
        }
        C6115gg ggVar = (C6115gg) C6098fw.m18100a("root", str2);
        if (m18091a(C6098fw.m18105c(ggVar.mo35278b(), str2), ggVar.mo35300a(ggVar.mo35278b()))) {
            m18093b(C6093fu.m18077a("root", str2));
        }
        if ("root".equals(str)) {
            return;
        }
        if (C6098fw.m18104b(str, str2)) {
            m18093b(a);
        } else if (m18091a(C6098fw.m18105c(str, str2), ggVar.mo35300a(str))) {
            m18093b(a);
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m18087a(C6093fu fuVar) {
        C6097c cVar;
        ArrayList arrayList = f15397e.get(fuVar);
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                if (!(arrayList.get(i) == null || (cVar = (C6097c) ((WeakReference) arrayList.get(i)).get()) == null)) {
                    cVar.mo34420a(fuVar);
                }
            }
        }
    }

    /* renamed from: a */
    static /* synthetic */ Map m18085a(Map map) {
        HashMap hashMap = new HashMap(1);
        hashMap.put("root", (C6093fu) map.get("root"));
        return hashMap;
    }
}
