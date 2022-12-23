package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.inmobi.media.C5961ee;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.inmobi.media.el */
/* compiled from: VisibilityTracker */
public abstract class C5977el {

    /* renamed from: a */
    private static final String f15146a = C5977el.class.getSimpleName();

    /* renamed from: b */
    boolean f15147b;
    /* access modifiers changed from: package-private */

    /* renamed from: c */
    public C5980c f15148c;

    /* renamed from: d */
    private final ArrayList<View> f15149d;

    /* renamed from: e */
    private long f15150e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final byte f15151f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Map<View, C5981d> f15152g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C5978a f15153h;

    /* renamed from: i */
    private final C5979b f15154i;

    /* renamed from: j */
    private final Handler f15155j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public boolean f15156k;

    /* renamed from: com.inmobi.media.el$a */
    /* compiled from: VisibilityTracker */
    public interface C5978a {
        /* renamed from: a */
        boolean mo35103a(View view, View view2, int i);

        /* renamed from: a */
        boolean mo35104a(View view, View view2, int i, Object obj);
    }

    /* renamed from: com.inmobi.media.el$c */
    /* compiled from: VisibilityTracker */
    public interface C5980c {
        /* renamed from: a */
        void mo35095a(List<View> list, List<View> list2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo35081a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo35082b();

    /* renamed from: com.inmobi.media.el$d */
    /* compiled from: VisibilityTracker */
    static class C5981d {

        /* renamed from: a */
        int f15160a;

        /* renamed from: b */
        long f15161b;

        /* renamed from: c */
        View f15162c;

        /* renamed from: d */
        Object f15163d;

        C5981d() {
        }
    }

    C5977el(C5978a aVar, byte b) {
        this(new WeakHashMap(10), aVar, new Handler(Looper.getMainLooper()), b);
    }

    private C5977el(Map<View, C5981d> map, C5978a aVar, Handler handler, byte b) {
        this.f15150e = 0;
        this.f15147b = true;
        this.f15152g = map;
        this.f15153h = aVar;
        this.f15155j = handler;
        this.f15154i = new C5979b(this);
        this.f15149d = new ArrayList<>(50);
        this.f15151f = b;
    }

    /* renamed from: c */
    public void mo35083c() {
        this.f15154i.run();
        this.f15155j.removeCallbacksAndMessages((Object) null);
        this.f15156k = false;
        this.f15147b = true;
    }

    /* renamed from: d */
    public void mo35084d() {
        this.f15147b = false;
        mo35111h();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo35107a(View view, Object obj, int i) {
        m17781a(view, view, obj, i);
    }

    /* renamed from: a */
    private void m17781a(View view, View view2, Object obj, int i) {
        C5981d dVar = this.f15152g.get(view2);
        if (dVar == null) {
            dVar = new C5981d();
            this.f15152g.put(view2, dVar);
            this.f15150e++;
        }
        dVar.f15160a = i;
        dVar.f15161b = this.f15150e;
        dVar.f15162c = view;
        dVar.f15163d = obj;
        long j = this.f15150e;
        if (j % 50 == 0) {
            m17780a(j - 50);
        }
        if (1 == this.f15152g.size()) {
            mo35084d();
        }
    }

    /* renamed from: a */
    private void m17780a(long j) {
        for (Map.Entry next : this.f15152g.entrySet()) {
            if (((C5981d) next.getValue()).f15161b < j) {
                this.f15149d.add((View) next.getKey());
            }
        }
        Iterator<View> it = this.f15149d.iterator();
        while (it.hasNext()) {
            mo35106a(it.next());
        }
        this.f15149d.clear();
    }

    /* renamed from: a */
    public final void mo35106a(View view) {
        if (this.f15152g.remove(view) != null) {
            this.f15150e--;
            if (this.f15152g.size() == 0) {
                mo35083c();
            }
        }
    }

    /* renamed from: f */
    public final void mo35109f() {
        this.f15152g.clear();
        this.f15155j.removeMessages(0);
        this.f15156k = false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: android.view.View} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo35108a(java.lang.Object r5) {
        /*
            r4 = this;
            if (r5 != 0) goto L_0x0003
            return
        L_0x0003:
            r0 = 0
            java.util.Map<android.view.View, com.inmobi.media.el$d> r1 = r4.f15152g
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x000e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x002f
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getValue()
            com.inmobi.media.el$d r3 = (com.inmobi.media.C5977el.C5981d) r3
            java.lang.Object r3 = r3.f15163d
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x000e
            java.lang.Object r5 = r2.getKey()
            r0 = r5
            android.view.View r0 = (android.view.View) r0
        L_0x002f:
            if (r0 == 0) goto L_0x0034
            r4.mo35106a((android.view.View) r0)
        L_0x0034:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C5977el.mo35108a(java.lang.Object):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo35110g() {
        return !this.f15152g.isEmpty();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo35085e() {
        mo35109f();
        this.f15148c = null;
        this.f15147b = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo35111h() {
        if (!this.f15156k && !this.f15147b) {
            this.f15156k = true;
            this.f15155j.postDelayed(this.f15154i, (long) mo35081a());
        }
    }

    /* renamed from: com.inmobi.media.el$b */
    /* compiled from: VisibilityTracker */
    static class C5979b implements Runnable {

        /* renamed from: a */
        private final ArrayList<View> f15157a = new ArrayList<>();

        /* renamed from: b */
        private final ArrayList<View> f15158b = new ArrayList<>();

        /* renamed from: c */
        private WeakReference<C5977el> f15159c;

        C5979b(C5977el elVar) {
            this.f15159c = new WeakReference<>(elVar);
        }

        public final void run() {
            C5980c e;
            C5977el elVar = (C5977el) this.f15159c.get();
            if (elVar != null) {
                boolean unused = elVar.f15156k = false;
                for (Map.Entry entry : elVar.f15152g.entrySet()) {
                    View view = (View) entry.getKey();
                    int i = ((C5981d) entry.getValue()).f15160a;
                    View view2 = ((C5981d) entry.getValue()).f15162c;
                    Object obj = ((C5981d) entry.getValue()).f15163d;
                    if (elVar.f15151f != 2) {
                        C5978a d = elVar.f15153h;
                        if (!d.mo35104a(view2, view, i, obj) || !d.mo35103a(view, view, i)) {
                            this.f15158b.add(view);
                        } else {
                            this.f15157a.add(view);
                        }
                    } else {
                        C5961ee.C5962a aVar = (C5961ee.C5962a) elVar.f15153h;
                        if (!aVar.mo35104a(view2, view, i, obj) || !aVar.mo35103a(view, view, i) || !aVar.mo35087a(view)) {
                            this.f15158b.add(view);
                        } else {
                            this.f15157a.add(view);
                        }
                    }
                }
            }
            if (!(elVar == null || (e = elVar.f15148c) == null)) {
                e.mo35095a(this.f15157a, this.f15158b);
            }
            this.f15157a.clear();
            this.f15158b.clear();
            if (elVar != null) {
                elVar.mo35082b();
            }
        }
    }
}
