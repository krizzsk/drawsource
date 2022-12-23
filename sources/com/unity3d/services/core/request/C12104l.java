package com.unity3d.services.core.request;

import android.os.ConditionVariable;
import com.google.android.exoplayer2.audio.SilenceSkippingAudioProcessor;
import com.unity3d.services.core.log.C12065a;
import com.unity3d.services.core.request.C12099h;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: com.unity3d.services.core.request.l */
/* compiled from: WebRequestThread */
public class C12104l {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static boolean f29534a = false;

    /* renamed from: b */
    private static LinkedBlockingQueue<Runnable> f29535b = null;

    /* renamed from: c */
    private static C12092a f29536c = null;

    /* renamed from: d */
    private static int f29537d = 1;

    /* renamed from: e */
    private static int f29538e = 1;

    /* renamed from: f */
    private static long f29539f = 1000;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final Object f29540g = new Object();

    /* renamed from: com.unity3d.services.core.request.l$a */
    /* compiled from: WebRequestThread */
    static class C12105a implements Runnable {
        C12105a() {
        }

        public void run() {
            boolean unused = C12104l.f29534a = true;
            synchronized (C12104l.f29540g) {
                C12104l.f29540g.notify();
            }
        }
    }

    /* renamed from: com.unity3d.services.core.request.l$b */
    /* compiled from: WebRequestThread */
    static class C12106b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f29541a;

        /* renamed from: b */
        final /* synthetic */ C12093b f29542b;

        /* renamed from: com.unity3d.services.core.request.l$b$a */
        /* compiled from: WebRequestThread */
        class C12107a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ ConditionVariable f29543a;

            C12107a(ConditionVariable conditionVariable) {
                this.f29543a = conditionVariable;
            }

            public void run() {
                try {
                    String hostAddress = InetAddress.getByName(C12106b.this.f29541a).getHostAddress();
                    C12106b bVar = C12106b.this;
                    bVar.f29542b.mo71021a(bVar.f29541a, hostAddress);
                } catch (UnknownHostException e) {
                    C12065a.m32842a("Unknown host", (Exception) e);
                    C12106b bVar2 = C12106b.this;
                    bVar2.f29542b.mo71020a(bVar2.f29541a, C12097f.UNKNOWN_HOST, e.getMessage());
                }
                this.f29543a.open();
            }
        }

        C12106b(String str, C12093b bVar) {
            this.f29541a = str;
            this.f29542b = bVar;
        }

        public void run() {
            Thread thread;
            Exception e;
            ConditionVariable conditionVariable = new ConditionVariable();
            try {
                thread = new Thread(new C12107a(conditionVariable));
                try {
                    thread.start();
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Exception e3) {
                e = e3;
                thread = null;
                C12065a.m32842a("Exception while resolving host", e);
                this.f29542b.mo71020a(this.f29541a, C12097f.UNEXPECTED_EXCEPTION, e.getMessage());
                if (!conditionVariable.block(SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US)) {
                    return;
                }
            }
            if (!conditionVariable.block(SilenceSkippingAudioProcessor.DEFAULT_PADDING_SILENCE_US) && thread != null) {
                thread.interrupt();
                this.f29542b.mo71020a(this.f29541a, C12097f.TIMEOUT, "Timeout");
            }
        }
    }

    /* renamed from: b */
    public static synchronized void m32997b() {
        synchronized (C12104l.class) {
            C12092a aVar = f29536c;
            if (aVar != null) {
                aVar.mo71241a();
                Iterator<Runnable> it = f29535b.iterator();
                while (it.hasNext()) {
                    Runnable next = it.next();
                    if (next instanceof C12103k) {
                        ((C12103k) next).mo71261a(true);
                    }
                }
                f29535b.clear();
                f29536c.purge();
            }
        }
    }

    /* renamed from: c */
    private static synchronized void m32999c() {
        synchronized (C12104l.class) {
            f29535b = new LinkedBlockingQueue<>();
            C12092a aVar = new C12092a(f29537d, f29538e, f29539f, TimeUnit.MILLISECONDS, f29535b);
            f29536c = aVar;
            aVar.prestartAllCoreThreads();
            f29535b.add(new C12105a());
            while (!f29534a) {
                try {
                    Object obj = f29540g;
                    synchronized (obj) {
                        obj.wait();
                    }
                } catch (InterruptedException unused) {
                    C12065a.m32845b("Couldn't synchronize thread");
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m32993a(String str, C12099h.C12100a aVar, Map<String, List<String>> map, Integer num, Integer num2, C12094c cVar) {
        synchronized (C12104l.class) {
            m32994a(str, aVar, map, (String) null, num, num2, cVar);
        }
    }

    /* renamed from: a */
    public static synchronized void m32994a(String str, C12099h.C12100a aVar, Map<String, List<String>> map, String str2, Integer num, Integer num2, C12094c cVar) {
        String str3 = str;
        synchronized (C12104l.class) {
            if (!f29534a) {
                m32999c();
            }
            if (str3 != null) {
                if (str.length() >= 3) {
                    f29535b.add(new C12103k(str, aVar.name(), str2, num.intValue(), num2.intValue(), map, cVar));
                    return;
                }
            }
            cVar.mo71018a(str, "Request is NULL or too short");
        }
    }

    /* renamed from: b */
    public static synchronized void m32998b(int i) {
        synchronized (C12104l.class) {
            f29538e = i;
            C12092a aVar = f29536c;
            if (aVar != null) {
                aVar.setMaximumPoolSize(i);
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m32991a(int i) {
        synchronized (C12104l.class) {
            f29537d = i;
            f29538e = i;
            C12092a aVar = f29536c;
            if (aVar != null) {
                aVar.setCorePoolSize(i);
                f29536c.setMaximumPoolSize(f29538e);
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m32992a(long j) {
        synchronized (C12104l.class) {
            f29539f = j;
            C12092a aVar = f29536c;
            if (aVar != null) {
                aVar.setKeepAliveTime(j, TimeUnit.MILLISECONDS);
            }
        }
    }

    /* renamed from: a */
    public static synchronized boolean m32995a(String str, C12093b bVar) {
        synchronized (C12104l.class) {
            if (str != null) {
                if (str.length() >= 3) {
                    new Thread(new C12106b(str, bVar)).start();
                    return true;
                }
            }
            bVar.mo71020a(str, C12097f.INVALID_HOST, "Host is NULL");
            return false;
        }
    }
}
