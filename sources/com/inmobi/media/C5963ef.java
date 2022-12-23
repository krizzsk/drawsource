package com.inmobi.media;

import android.os.Handler;
import android.os.SystemClock;
import android.view.View;
import com.inmobi.media.C5977el;
import com.inmobi.media.C6074ft;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.inmobi.media.ef */
/* compiled from: ImpressionTracker */
public class C5963ef {

    /* renamed from: a */
    private static final String f15104a = C5963ef.class.getSimpleName();

    /* renamed from: b */
    private final C5977el f15105b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Map<View, C5966b> f15106c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Map<View, C5966b> f15107d;

    /* renamed from: e */
    private final Handler f15108e;

    /* renamed from: f */
    private final C5967c f15109f;

    /* renamed from: g */
    private final long f15110g;

    /* renamed from: h */
    private C5977el.C5980c f15111h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public C5965a f15112i;

    /* renamed from: com.inmobi.media.ef$a */
    /* compiled from: ImpressionTracker */
    public interface C5965a {
        /* renamed from: a */
        void mo35096a(View view, Object obj);
    }

    /* renamed from: com.inmobi.media.ef$b */
    /* compiled from: ImpressionTracker */
    static class C5966b {

        /* renamed from: a */
        Object f15114a;

        /* renamed from: b */
        int f15115b;

        /* renamed from: c */
        int f15116c;

        /* renamed from: d */
        long f15117d = Long.MAX_VALUE;

        C5966b(Object obj, int i, int i2) {
            this.f15114a = obj;
            this.f15115b = i;
            this.f15116c = i2;
        }
    }

    public C5963ef(C6074ft.C6091m mVar, C5977el elVar, C5965a aVar) {
        this(new WeakHashMap(), new WeakHashMap(), elVar, new Handler(), mVar, aVar);
    }

    private C5963ef(Map<View, C5966b> map, Map<View, C5966b> map2, C5977el elVar, Handler handler, C6074ft.C6091m mVar, C5965a aVar) {
        this.f15106c = map;
        this.f15107d = map2;
        this.f15105b = elVar;
        this.f15110g = (long) mVar.impressionPollIntervalMillis;
        C59641 r1 = new C5977el.C5980c() {
            /* renamed from: a */
            public final void mo35095a(List<View> list, List<View> list2) {
                for (View next : list) {
                    C5966b bVar = (C5966b) C5963ef.this.f15106c.get(next);
                    if (bVar == null) {
                        C5963ef.this.mo35089a(next);
                    } else {
                        C5966b bVar2 = (C5966b) C5963ef.this.f15107d.get(next);
                        if (bVar2 == null || !bVar.f15114a.equals(bVar2.f15114a)) {
                            bVar.f15117d = SystemClock.uptimeMillis();
                            C5963ef.this.f15107d.put(next, bVar);
                        }
                    }
                }
                for (View remove : list2) {
                    C5963ef.this.f15107d.remove(remove);
                }
                C5963ef.this.m17728e();
            }
        };
        this.f15111h = r1;
        this.f15105b.f15148c = r1;
        this.f15108e = handler;
        this.f15109f = new C5967c(this);
        this.f15112i = aVar;
    }

    /* renamed from: a */
    public final void mo35090a(View view, Object obj, int i, int i2) {
        C5966b bVar = this.f15106c.get(view);
        if (bVar == null || !bVar.f15114a.equals(obj)) {
            mo35089a(view);
            C5966b bVar2 = new C5966b(obj, i, i2);
            this.f15106c.put(view, bVar2);
            this.f15105b.mo35107a(view, obj, bVar2.f15115b);
        }
    }

    /* renamed from: a */
    public final void mo35089a(View view) {
        this.f15106c.remove(view);
        this.f15107d.remove(view);
        this.f15105b.mo35106a(view);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35091a(Object obj) {
        View view;
        Iterator<Map.Entry<View, C5966b>> it = this.f15106c.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                view = null;
                break;
            }
            Map.Entry next = it.next();
            if (((C5966b) next.getValue()).f15114a.equals(obj)) {
                view = (View) next.getKey();
                break;
            }
        }
        if (view != null) {
            mo35089a(view);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35088a() {
        this.f15105b.mo35109f();
        this.f15108e.removeCallbacksAndMessages((Object) null);
        this.f15107d.clear();
    }

    /* renamed from: b */
    public final void mo35092b() {
        for (Map.Entry next : this.f15106c.entrySet()) {
            this.f15105b.mo35107a((View) next.getKey(), ((C5966b) next.getValue()).f15114a, ((C5966b) next.getValue()).f15115b);
        }
        m17728e();
        this.f15105b.mo35084d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo35093c() {
        return !this.f15106c.isEmpty();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m17728e() {
        if (!this.f15108e.hasMessages(0)) {
            this.f15108e.postDelayed(this.f15109f, this.f15110g);
        }
    }

    /* renamed from: com.inmobi.media.ef$c */
    /* compiled from: ImpressionTracker */
    static class C5967c implements Runnable {

        /* renamed from: a */
        private final ArrayList<View> f15118a = new ArrayList<>();

        /* renamed from: b */
        private WeakReference<C5963ef> f15119b;

        C5967c(C5963ef efVar) {
            this.f15119b = new WeakReference<>(efVar);
        }

        public final void run() {
            C5963ef efVar = (C5963ef) this.f15119b.get();
            if (efVar != null) {
                for (Map.Entry entry : efVar.f15107d.entrySet()) {
                    View view = (View) entry.getKey();
                    C5966b bVar = (C5966b) entry.getValue();
                    if (C5963ef.m17724a(bVar.f15117d, bVar.f15116c) && this.f15119b.get() != null) {
                        efVar.f15112i.mo35096a(view, bVar.f15114a);
                        this.f15118a.add(view);
                    }
                }
                Iterator<View> it = this.f15118a.iterator();
                while (it.hasNext()) {
                    efVar.mo35089a(it.next());
                }
                this.f15118a.clear();
                if (!efVar.f15107d.isEmpty()) {
                    efVar.m17728e();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo35094d() {
        this.f15106c.clear();
        this.f15107d.clear();
        this.f15105b.mo35109f();
        this.f15108e.removeMessages(0);
        this.f15105b.mo35085e();
        this.f15111h = null;
    }

    /* renamed from: a */
    static /* synthetic */ boolean m17724a(long j, int i) {
        return SystemClock.uptimeMillis() - j >= ((long) i);
    }
}
