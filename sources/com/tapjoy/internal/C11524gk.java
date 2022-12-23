package com.tapjoy.internal;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.tapjoy.internal.gk */
public final class C11524gk extends C11523gj {

    /* renamed from: b */
    private final ThreadPoolExecutor f27679b = new ThreadPoolExecutor(0, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public C11524gk(File file, C11557hi hiVar) {
        super(file, hiVar);
    }

    /* access modifiers changed from: protected */
    public final void finalize() {
        try {
            this.f27679b.shutdown();
            this.f27679b.awaitTermination(1, TimeUnit.SECONDS);
        } finally {
            super.finalize();
        }
    }

    /* renamed from: com.tapjoy.internal.gk$a */
    class C11525a implements Runnable {

        /* renamed from: b */
        private int f27681b;

        /* renamed from: c */
        private long f27682c;

        /* renamed from: d */
        private String f27683d;

        /* renamed from: e */
        private String f27684e;

        /* renamed from: f */
        private Map<String, Long> f27685f;

        C11525a(int i, long j, String str, String str2, Map<String, Long> map) {
            this.f27681b = i;
            this.f27682c = j;
            this.f27683d = str;
            this.f27684e = str2;
            this.f27685f = map;
        }

        public final void run() {
            try {
                int i = this.f27681b;
                if (i == 1) {
                    C11524gk.super.mo70060a(this.f27682c);
                } else if (i == 2) {
                    C11524gk.super.mo70059a();
                } else if (i == 3) {
                    C11524gk.super.mo70061a(this.f27682c, this.f27683d, this.f27684e, this.f27685f);
                }
            } catch (Throwable unused) {
                C11524gk.super.mo70059a();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo70060a(long j) {
        try {
            this.f27679b.execute(new C11525a(1, j, (String) null, (String) null, (Map<String, Long>) null));
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo70059a() {
        try {
            this.f27679b.execute(new C11525a(2, 0, (String) null, (String) null, (Map<String, Long>) null));
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo70061a(long j, String str, String str2, Map<String, Long> map) {
        try {
            this.f27679b.execute(new C11525a(3, j, str, str2, map != null ? new HashMap(map) : null));
        } catch (Throwable unused) {
        }
    }
}
