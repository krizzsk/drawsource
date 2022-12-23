package com.bykv.p054vk.openvk.component.video.p055a.p059b.p065f;

import android.text.TextUtils;
import com.bykv.p054vk.openvk.component.video.api.C2397b;
import com.bykv.p054vk.openvk.component.video.api.p071c.C2401c;
import com.bykv.p054vk.openvk.component.video.api.p074f.C2415c;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.C2315d;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.C2325e;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.C2334f;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.p060a.C2292c;
import com.bykv.p054vk.openvk.component.video.p055a.p066c.C2361a;
import com.bytedance.sdk.component.utils.C2905l;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: com.bykv.vk.openvk.component.video.a.b.f.a */
/* compiled from: VideoCachePreloader */
public class C2339a {

    /* renamed from: a */
    public static final boolean f4723a = C2415c.m5834b();

    /* renamed from: b */
    private HashMap<String, Boolean> f4724b;

    /* renamed from: c */
    private C2341a f4725c;

    /* renamed from: com.bykv.vk.openvk.component.video.a.b.f.a$b */
    /* compiled from: VideoCachePreloader */
    private static class C2343b {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final C2339a f4738a = new C2339a();
    }

    private C2339a() {
        this.f4724b = new HashMap<>();
        mo15786b();
    }

    /* renamed from: a */
    public static C2339a m5385a() {
        return C2343b.f4738a;
    }

    /* renamed from: b */
    public boolean mo15786b() {
        if (this.f4725c != null) {
            return true;
        }
        C2292c c = m5386c();
        if (c == null) {
            return false;
        }
        C2325e.m5327a(true);
        C2325e.m5329b(true);
        C2325e.m5325a(1);
        C2334f.m5358a().mo15777d();
        try {
            C2341a aVar = new C2341a();
            this.f4725c = aVar;
            aVar.setName("tt_pangle_thread_video_cache_preloader");
            this.f4725c.start();
            C2325e.m5326a(c, C2397b.m5665a());
            C2315d.m5308c().mo15739a(30000, 30000, 30000);
            C2315d.m5308c().mo15738a(10485759);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public boolean mo15784a(C2401c cVar) {
        if (!mo15786b()) {
            return false;
        }
        this.f4725c.mo15787a(cVar);
        return true;
    }

    /* renamed from: b */
    public String mo15785b(C2401c cVar) {
        if (cVar == null) {
            return null;
        }
        boolean z = !TextUtils.isEmpty(cVar.mo15992k());
        return C2334f.m5358a().mo15771a(false, z, z ? cVar.mo15992k() : cVar.mo15991j(), cVar.mo15991j());
    }

    /* renamed from: c */
    private static C2292c m5386c() {
        File file = new File(C2397b.m5665a().getCacheDir(), "proxy_cache");
        if (!file.exists()) {
            file.mkdirs();
        }
        C2292c cVar = null;
        try {
            C2292c cVar2 = new C2292c(file);
            try {
                cVar2.mo15699a(104857600);
                return cVar2;
            } catch (IOException e) {
                e = e;
                cVar = cVar2;
            }
        } catch (IOException e2) {
            e = e2;
            e.printStackTrace();
            return cVar;
        }
    }

    /* renamed from: com.bykv.vk.openvk.component.video.a.b.f.a$a */
    /* compiled from: VideoCachePreloader */
    class C2341a extends Thread {

        /* renamed from: b */
        private Queue<C2342a> f4727b = new LinkedBlockingQueue();

        /* renamed from: c */
        private boolean f4728c = true;

        /* renamed from: d */
        private final Queue<C2342a> f4729d = new ArrayBlockingQueue(10);

        /* renamed from: e */
        private Queue<C2342a> f4730e = new LinkedBlockingQueue();

        /* renamed from: a */
        private void m5391a() {
        }

        /* renamed from: b */
        private void m5393b() {
        }

        public C2341a() {
        }

        /* renamed from: a */
        private C2342a m5390a(int i, C2401c cVar) {
            m5393b();
            C2905l.m8111b("VideoCachePreloader", "pool: " + this.f4729d.size());
            C2342a poll = this.f4729d.poll();
            if (poll == null) {
                poll = new C2342a();
            }
            poll.f4731a = i;
            poll.f4736f = cVar;
            return poll;
        }

        /* renamed from: a */
        private void m5392a(C2342a aVar) {
            m5391a();
            aVar.f4733c = null;
            aVar.f4732b = null;
            aVar.f4731a = -1;
            aVar.f4736f = null;
            this.f4729d.offer(aVar);
        }

        /* renamed from: b */
        private synchronized void m5394b(C2342a aVar) {
            m5393b();
            this.f4730e.add(aVar);
            notify();
        }

        /* renamed from: c */
        private void m5396c(C2342a aVar) {
            m5391a();
            if (aVar != null) {
                this.f4727b.offer(aVar);
                notify();
            }
        }

        public void run() {
            while (this.f4728c) {
                synchronized (this) {
                    if (!this.f4730e.isEmpty()) {
                        m5395c();
                    }
                    while (!this.f4727b.isEmpty()) {
                        C2342a poll = this.f4727b.poll();
                        if (poll != null) {
                            int i = poll.f4731a;
                            if (i != 0) {
                                if (i == 1) {
                                    C2315d.m5308c().mo15742a(poll.f4732b);
                                } else if (i == 2) {
                                    C2315d.m5308c().mo15748d();
                                } else if (i == 3) {
                                    C2315d.m5308c().mo15748d();
                                    if (C2325e.m5330c() != null) {
                                        C2325e.m5330c().mo15694a();
                                    }
                                    if (C2325e.m5328b() != null) {
                                        C2325e.m5328b().mo15698a();
                                    }
                                } else if (i == 4) {
                                    C2315d.m5308c().mo15748d();
                                    this.f4728c = false;
                                }
                            } else if (poll.f4733c != null && poll.f4733c.length > 0) {
                                ArrayList arrayList = new ArrayList();
                                for (String str : poll.f4733c) {
                                    if (C2361a.m5456a(str)) {
                                        arrayList.add(str);
                                    }
                                }
                                C2315d.m5308c().mo15745a(false, !TextUtils.isEmpty(poll.f4735e), poll.f4734d, poll.f4732b, (String[]) arrayList.toArray(new String[arrayList.size()]));
                            }
                            m5392a(poll);
                        }
                    }
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        /* renamed from: c */
        private void m5395c() {
            m5391a();
            while (true) {
                C2342a poll = this.f4730e.poll();
                if (poll != null) {
                    poll.f4732b = poll.f4736f.mo15991j();
                    poll.f4733c = new String[]{poll.f4736f.mo15991j()};
                    poll.f4734d = poll.f4736f.mo15973b();
                    poll.f4735e = poll.f4736f.mo15992k();
                    if (!TextUtils.isEmpty(poll.f4736f.mo15992k())) {
                        poll.f4732b = poll.f4736f.mo15992k();
                    }
                    poll.f4736f = null;
                    m5396c(poll);
                } else {
                    return;
                }
            }
        }

        /* renamed from: a */
        public void mo15787a(C2401c cVar) {
            m5394b(m5390a(0, cVar));
        }

        /* renamed from: com.bykv.vk.openvk.component.video.a.b.f.a$a$a */
        /* compiled from: VideoCachePreloader */
        private class C2342a {

            /* renamed from: a */
            public int f4731a;

            /* renamed from: b */
            public String f4732b;

            /* renamed from: c */
            public String[] f4733c;

            /* renamed from: d */
            public int f4734d;

            /* renamed from: e */
            public String f4735e;

            /* renamed from: f */
            public C2401c f4736f;

            public C2342a() {
            }
        }
    }
}
