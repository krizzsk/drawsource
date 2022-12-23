package com.tapjoy.internal;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tapjoy.TJConnectListener;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.tapjoy.internal.ge */
public abstract class C11508ge {

    /* renamed from: a */
    private final ReentrantLock f27626a;

    /* renamed from: b */
    volatile int f27627b = C11516c.f27649a;

    /* renamed from: c */
    C11513b f27628c;

    /* renamed from: d */
    long f27629d = 1000;

    /* renamed from: e */
    C11512a f27630e;

    /* renamed from: f */
    private final Condition f27631f;

    /* renamed from: g */
    private final LinkedList<TJConnectListener> f27632g = new LinkedList<>();

    /* renamed from: h */
    private C11512a f27633h;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo69944a(Context context, String str, Hashtable<String, ?> hashtable, TJConnectListener tJConnectListener);

    public C11508ge() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f27626a = reentrantLock;
        this.f27631f = reentrantLock.newCondition();
    }

    /* renamed from: com.tapjoy.internal.ge$c */
    enum C11516c {
        ;
        

        /* renamed from: a */
        public static final int f27649a = 1;

        /* renamed from: b */
        public static final int f27650b = 2;

        /* renamed from: c */
        public static final int f27651c = 3;

        /* renamed from: d */
        public static final int f27652d = 4;

        /* renamed from: e */
        public static final int f27653e = 5;

        static {
            f27654f = new int[]{1, 2, 3, 4, 5};
        }

        /* renamed from: a */
        public static int[] m31507a() {
            return (int[]) f27654f.clone();
        }
    }

    /* renamed from: b */
    public final boolean mo70046b(Context context, String str, Hashtable<String, ?> hashtable, TJConnectListener tJConnectListener) {
        this.f27626a.lock();
        if (tJConnectListener != null) {
            try {
                this.f27632g.addLast(C11481fp.m31447a(tJConnectListener, TJConnectListener.class));
            } catch (Throwable th) {
                this.f27626a.unlock();
                throw th;
            }
        }
        C11512a aVar = new C11512a(context, str, hashtable);
        int i = C115113.f27636a[this.f27627b - 1];
        if (i != 1) {
            if (i == 2) {
                this.f27630e = aVar;
                C11491fu.f27585b.addObserver(new Observer() {
                    public final void update(Observable observable, Object obj) {
                        C11491fu.f27585b.deleteObserver(this);
                        if (!Boolean.TRUE.equals(obj) && C11508ge.this.f27630e != null && C11508ge.this.f27630e.f27637a != null) {
                            C11508ge.this.f27628c = new C11513b(C11508ge.this, (byte) 0);
                            new Thread(C11508ge.this.f27628c).start();
                        }
                    }
                });
                if (mo69944a(aVar.f27637a, aVar.f27638b, aVar.f27639c, new TJConnectListener() {
                    public final void onConnectSuccess() {
                        C11508ge geVar = C11508ge.this;
                        int i = C11516c.f27653e;
                        int i2 = C11516c.f27650b;
                        geVar.mo70042a(i);
                        C11508ge.this.mo70043a(true);
                    }

                    public final void onConnectFailure() {
                        C11508ge.this.mo70043a(false);
                    }
                })) {
                    int i2 = C11516c.f27650b;
                    int i3 = C11516c.f27649a;
                    mo70042a(i2);
                } else {
                    this.f27632g.clear();
                }
            } else if (i == 3 || i == 4) {
                this.f27633h = aVar;
            } else if (i != 5) {
                mo70042a(C11516c.f27649a);
            } else {
                this.f27633h = aVar;
                mo70045b();
            }
            this.f27626a.unlock();
            return false;
        }
        mo70043a(true);
        this.f27626a.unlock();
        return true;
    }

    /* renamed from: com.tapjoy.internal.ge$3 */
    static /* synthetic */ class C115113 {

        /* renamed from: a */
        static final /* synthetic */ int[] f27636a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x000f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0017 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0027 */
        static {
            /*
                int[] r0 = com.tapjoy.internal.C11508ge.C11516c.m31507a()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27636a = r0
                r1 = 1
                int r2 = com.tapjoy.internal.C11508ge.C11516c.f27653e     // Catch:{ NoSuchFieldError -> 0x000f }
                int r2 = r2 - r1
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x000f }
            L_0x000f:
                int[] r0 = f27636a     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r2 = com.tapjoy.internal.C11508ge.C11516c.f27649a     // Catch:{ NoSuchFieldError -> 0x0017 }
                int r2 = r2 - r1
                r3 = 2
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0017 }
            L_0x0017:
                int[] r0 = f27636a     // Catch:{ NoSuchFieldError -> 0x001f }
                int r2 = com.tapjoy.internal.C11508ge.C11516c.f27650b     // Catch:{ NoSuchFieldError -> 0x001f }
                int r2 = r2 - r1
                r3 = 3
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f27636a     // Catch:{ NoSuchFieldError -> 0x0027 }
                int r2 = com.tapjoy.internal.C11508ge.C11516c.f27651c     // Catch:{ NoSuchFieldError -> 0x0027 }
                int r2 = r2 - r1
                r3 = 4
                r0[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0027 }
            L_0x0027:
                int[] r0 = f27636a     // Catch:{ NoSuchFieldError -> 0x002f }
                int r2 = com.tapjoy.internal.C11508ge.C11516c.f27652d     // Catch:{ NoSuchFieldError -> 0x002f }
                int r2 = r2 - r1
                r1 = 5
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x002f }
            L_0x002f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11508ge.C115113.<clinit>():void");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo70042a(int i) {
        this.f27626a.lock();
        try {
            this.f27627b = i;
        } finally {
            this.f27626a.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C11512a mo70041a() {
        this.f27626a.lock();
        try {
            if (this.f27633h != null) {
                this.f27630e = this.f27633h;
                this.f27633h = null;
            }
            return this.f27630e;
        } finally {
            this.f27626a.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo70043a(boolean z) {
        this.f27626a.lock();
        try {
            if (this.f27632g.size() != 0) {
                ArrayList arrayList = new ArrayList(this.f27632g);
                this.f27632g.clear();
                this.f27626a.unlock();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    TJConnectListener tJConnectListener = (TJConnectListener) it.next();
                    if (z) {
                        tJConnectListener.onConnectSuccess();
                    } else {
                        tJConnectListener.onConnectFailure();
                    }
                }
            }
        } finally {
            this.f27626a.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo70045b() {
        this.f27626a.lock();
        try {
            this.f27629d = 1000;
            this.f27631f.signal();
        } finally {
            this.f27626a.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo70044a(long j) {
        this.f27626a.lock();
        try {
            int i = C11516c.f27652d;
            int i2 = C11516c.f27651c;
            mo70042a(i);
            if (this.f27631f.await(j, TimeUnit.MILLISECONDS)) {
                this.f27629d = 1000;
            }
        } catch (InterruptedException unused) {
        } catch (Throwable th) {
            int i3 = C11516c.f27651c;
            int i4 = C11516c.f27652d;
            mo70042a(i3);
            this.f27626a.unlock();
            throw th;
        }
        int i5 = C11516c.f27651c;
        int i6 = C11516c.f27652d;
        mo70042a(i5);
        this.f27626a.unlock();
        return false;
    }

    /* renamed from: com.tapjoy.internal.ge$a */
    class C11512a {

        /* renamed from: a */
        public final Context f27637a;

        /* renamed from: b */
        public final String f27638b;

        /* renamed from: c */
        public final Hashtable<String, ?> f27639c;

        public C11512a(Context context, String str, Hashtable<String, ?> hashtable) {
            Context context2;
            if (context == null) {
                context2 = null;
            } else if (context instanceof Application) {
                context2 = context;
            } else {
                context2 = context.getApplicationContext();
            }
            this.f27637a = context2 != null ? context2 : context;
            this.f27638b = str;
            this.f27639c = hashtable;
        }
    }

    /* renamed from: com.tapjoy.internal.ge$b */
    class C11513b implements Runnable {

        /* renamed from: b */
        private boolean f27642b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public boolean f27643c;

        /* renamed from: d */
        private Context f27644d;

        /* renamed from: e */
        private BroadcastReceiver f27645e;

        private C11513b() {
            this.f27645e = new BroadcastReceiver() {
                public final void onReceive(Context context, Intent intent) {
                    C11508ge.this.mo70045b();
                }
            };
        }

        /* synthetic */ C11513b(C11508ge geVar, byte b) {
            this();
        }

        /* renamed from: a */
        private void m31504a() {
            if (C11508ge.this.f27628c == this) {
                C11508ge.this.f27628c = null;
            }
            if (C11508ge.this.f27627b == C11516c.f27651c) {
                C11508ge geVar = C11508ge.this;
                int i = C11516c.f27649a;
                int i2 = C11516c.f27651c;
                geVar.mo70042a(i);
            }
        }

        /* renamed from: b */
        private void m31506b() {
            this.f27644d.unregisterReceiver(this.f27645e);
        }

        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x005a */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x006d A[Catch:{ all -> 0x0090 }, LOOP:0: B:1:0x0021->B:15:0x006d, LOOP_END] */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x005e A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r7 = this;
                com.tapjoy.internal.ge r0 = com.tapjoy.internal.C11508ge.this
                int r1 = com.tapjoy.internal.C11508ge.C11516c.f27651c
                int r2 = com.tapjoy.internal.C11508ge.C11516c.f27650b
                r0.mo70042a((int) r1)
                com.tapjoy.internal.ge r0 = com.tapjoy.internal.C11508ge.this
                com.tapjoy.internal.ge$a r0 = r0.mo70041a()
                android.content.Context r0 = r0.f27637a
                r7.f27644d = r0
                android.content.IntentFilter r0 = new android.content.IntentFilter
                java.lang.String r1 = "android.net.conn.CONNECTIVITY_CHANGE"
                r0.<init>(r1)
                android.content.Context r1 = r7.f27644d
                android.content.BroadcastReceiver r2 = r7.f27645e
                r1.registerReceiver(r2, r0)
            L_0x0021:
                boolean r0 = r7.f27642b     // Catch:{ all -> 0x0090 }
                if (r0 != 0) goto L_0x0050
                java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch     // Catch:{ all -> 0x0090 }
                r1 = 1
                r0.<init>(r1)     // Catch:{ all -> 0x0090 }
                com.tapjoy.internal.fu$a r2 = com.tapjoy.internal.C11491fu.f27585b     // Catch:{ all -> 0x0090 }
                com.tapjoy.internal.ge$b$1 r3 = new com.tapjoy.internal.ge$b$1     // Catch:{ all -> 0x0090 }
                r3.<init>(r0)     // Catch:{ all -> 0x0090 }
                r2.addObserver(r3)     // Catch:{ all -> 0x0090 }
                com.tapjoy.internal.ge r2 = com.tapjoy.internal.C11508ge.this     // Catch:{ all -> 0x0090 }
                com.tapjoy.internal.ge$a r2 = r2.mo70041a()     // Catch:{ all -> 0x0090 }
                com.tapjoy.internal.ge r3 = com.tapjoy.internal.C11508ge.this     // Catch:{ all -> 0x0090 }
                android.content.Context r4 = r2.f27637a     // Catch:{ all -> 0x0090 }
                java.lang.String r5 = r2.f27638b     // Catch:{ all -> 0x0090 }
                java.util.Hashtable<java.lang.String, ?> r2 = r2.f27639c     // Catch:{ all -> 0x0090 }
                r6 = 0
                boolean r2 = r3.mo69944a(r4, r5, r2, r6)     // Catch:{ all -> 0x0090 }
                r3 = 0
                if (r2 != 0) goto L_0x0057
                com.tapjoy.internal.ge r0 = com.tapjoy.internal.C11508ge.this     // Catch:{ all -> 0x0090 }
                r0.mo70043a((boolean) r3)     // Catch:{ all -> 0x0090 }
            L_0x0050:
                r7.m31506b()
                r7.m31504a()
                return
            L_0x0057:
                r0.await()     // Catch:{ InterruptedException -> 0x005a }
            L_0x005a:
                boolean r0 = r7.f27643c     // Catch:{ all -> 0x0090 }
                if (r0 == 0) goto L_0x006d
                com.tapjoy.internal.ge r0 = com.tapjoy.internal.C11508ge.this     // Catch:{ all -> 0x0090 }
                int r2 = com.tapjoy.internal.C11508ge.C11516c.f27653e     // Catch:{ all -> 0x0090 }
                int r3 = com.tapjoy.internal.C11508ge.C11516c.f27651c     // Catch:{ all -> 0x0090 }
                r0.mo70042a((int) r2)     // Catch:{ all -> 0x0090 }
                com.tapjoy.internal.ge r0 = com.tapjoy.internal.C11508ge.this     // Catch:{ all -> 0x0090 }
                r0.mo70043a((boolean) r1)     // Catch:{ all -> 0x0090 }
                goto L_0x0050
            L_0x006d:
                com.tapjoy.internal.ge r0 = com.tapjoy.internal.C11508ge.this     // Catch:{ all -> 0x0090 }
                r0.mo70043a((boolean) r3)     // Catch:{ all -> 0x0090 }
                com.tapjoy.internal.ge r0 = com.tapjoy.internal.C11508ge.this     // Catch:{ all -> 0x0090 }
                long r0 = r0.f27629d     // Catch:{ all -> 0x0090 }
                r2 = 1000(0x3e8, double:4.94E-321)
                long r0 = java.lang.Math.max(r0, r2)     // Catch:{ all -> 0x0090 }
                com.tapjoy.internal.ge r2 = com.tapjoy.internal.C11508ge.this     // Catch:{ all -> 0x0090 }
                r3 = 2
                long r3 = r0 << r3
                r5 = 3600000(0x36ee80, double:1.7786363E-317)
                long r3 = java.lang.Math.min(r3, r5)     // Catch:{ all -> 0x0090 }
                r2.f27629d = r3     // Catch:{ all -> 0x0090 }
                com.tapjoy.internal.ge r2 = com.tapjoy.internal.C11508ge.this     // Catch:{ all -> 0x0090 }
                r2.mo70044a((long) r0)     // Catch:{ all -> 0x0090 }
                goto L_0x0021
            L_0x0090:
                r0 = move-exception
                r7.m31506b()
                r7.m31504a()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11508ge.C11513b.run():void");
        }
    }
}
