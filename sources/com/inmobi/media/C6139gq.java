package com.inmobi.media;

import com.smaato.sdk.core.injections.CoreLightModuleInterface;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.inmobi.media.gq */
/* compiled from: EventProcessor */
public class C6139gq implements C6144gs {

    /* renamed from: f */
    private static final String f15475f = C6139gq.class.getSimpleName();

    /* renamed from: a */
    public AtomicBoolean f15476a = new AtomicBoolean(false);

    /* renamed from: b */
    public AtomicBoolean f15477b = new AtomicBoolean(false);

    /* renamed from: c */
    public HashMap<String, C6136gn> f15478c = new HashMap<>(1);

    /* renamed from: d */
    public List<String> f15479d = new LinkedList();

    /* renamed from: e */
    public ScheduledExecutorService f15480e;

    /* renamed from: g */
    private C6137go f15481g;

    /* renamed from: h */
    private C6145gt f15482h;

    public C6139gq(C6137go goVar, C6145gt gtVar, C6136gn gnVar) {
        this.f15481g = goVar;
        this.f15482h = gtVar;
        mo35324a(gnVar);
    }

    /* renamed from: a */
    public final void mo35327a(String str, boolean z) {
        if (!this.f15477b.get()) {
            m18191a(str, m18192b(str).f15465f, z);
        }
    }

    /* renamed from: a */
    private void m18191a(final String str, long j, final boolean z) {
        if (!this.f15479d.contains(str)) {
            this.f15479d.add(str);
            if (this.f15480e == null) {
                this.f15480e = Executors.newSingleThreadScheduledExecutor(new C6194ib(f15475f));
            }
            this.f15480e.scheduleAtFixedRate(new Runnable() {

                /* renamed from: b */
                final /* synthetic */ C6236ja f15484b = null;

                public final void run() {
                    C6139gq.m18190a(C6139gq.this, str, this.f15484b, z);
                }
            }, m18189a(str), j, TimeUnit.SECONDS);
        }
    }

    /* renamed from: a */
    private long m18189a(String str) {
        C6136gn b = m18192b(str);
        long c = this.f15481g.mo35319c();
        if (c == -1) {
            this.f15481g.mo35320c(System.currentTimeMillis());
        }
        long seconds = TimeUnit.MILLISECONDS.toSeconds(c) + b.f15465f;
        if (seconds - TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) > 0) {
            return seconds - TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
        }
        return 0;
    }

    /* renamed from: b */
    private C6136gn m18192b(String str) {
        return this.f15478c.get(str);
    }

    /* renamed from: a */
    public final void mo35324a(C6136gn gnVar) {
        String str = gnVar.f15461b;
        if (str == null) {
            str = CoreLightModuleInterface.NAME_DEFAULT_HTTP_HANDLER;
        }
        this.f15478c.put(str, gnVar);
    }

    /* renamed from: a */
    public final void mo35325a(C6138gp gpVar) {
        gpVar.f15472a.get(0).intValue();
        this.f15481g.mo35315a(gpVar.f15472a);
        this.f15481g.mo35320c(System.currentTimeMillis());
        this.f15476a.set(false);
    }

    /* renamed from: a */
    public final void mo35326a(C6138gp gpVar, boolean z) {
        gpVar.f15472a.get(0).intValue();
        if (gpVar.f15474c && z) {
            this.f15481g.mo35315a(gpVar.f15472a);
        }
        this.f15481g.mo35320c(System.currentTimeMillis());
        this.f15476a.set(false);
    }

    /* renamed from: a */
    static /* synthetic */ void m18190a(C6139gq gqVar, String str, C6236ja jaVar, boolean z) {
        int i;
        long j;
        C6138gp c;
        if (!gqVar.f15477b.get() && !gqVar.f15476a.get()) {
            gqVar.f15481g.mo35318b(gqVar.m18192b(str).f15460a);
            int a = gqVar.f15481g.mo35314a();
            int a2 = C6210ik.m18422a();
            if (a2 != 1) {
                i = gqVar.m18192b(str).f15468i;
            } else {
                i = gqVar.m18192b(str).f15466g;
            }
            if (a2 != 1) {
                j = gqVar.m18192b(str).f15469j;
            } else {
                j = gqVar.m18192b(str).f15467h;
            }
            long j2 = j;
            if ((i <= a || gqVar.f15481g.mo35316a(gqVar.m18192b(str).f15462c) || gqVar.f15481g.mo35317a(gqVar.m18192b(str).f15465f, gqVar.m18192b(str).f15462c)) && (c = gqVar.f15482h.mo35312c()) != null) {
                gqVar.f15476a.set(true);
                C6136gn b = gqVar.m18192b(str);
                C6141gr a3 = C6141gr.m18197a();
                String str2 = b.f15464e;
                int i2 = b.f15463d + 1;
                a3.mo35329a(c, str2, i2, i2, j2, jaVar, gqVar, z);
            }
        }
    }
}
