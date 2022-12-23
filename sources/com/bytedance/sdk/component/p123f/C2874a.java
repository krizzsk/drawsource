package com.bytedance.sdk.component.p123f;

import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C2905l;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bytedance.sdk.component.f.a */
/* compiled from: ADThreadPoolExecutor */
class C2874a extends ThreadPoolExecutor {

    /* renamed from: a */
    private String f6457a;

    public C2874a(String str, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
        this.f6457a = str;
    }

    /* renamed from: a */
    private void m8011a(Runnable runnable) {
        try {
            super.execute(runnable);
        } catch (OutOfMemoryError e) {
            m8012a(runnable, e);
        } catch (Throwable th) {
            m8013a(runnable, th);
        }
    }

    /* renamed from: a */
    private void m8012a(Runnable runnable, OutOfMemoryError outOfMemoryError) {
        m8013a(runnable, (Throwable) outOfMemoryError);
    }

    /* renamed from: a */
    private void m8013a(Runnable runnable, Throwable th) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                runnable.run();
            } catch (Throwable th2) {
                C2905l.m8115c("", "try exc failed", th2);
            }
        }
    }

    /* renamed from: a */
    private void m8014a(BlockingQueue<Runnable> blockingQueue, int i) {
        if (getCorePoolSize() != i && blockingQueue != null && blockingQueue.size() <= 0) {
            try {
                setCorePoolSize(i);
                C2905l.m8107a("ADThreadPoolExecutor", "reduceCoreThreadSize: reduce poolType =  ", this.f6457a, " coreSize=", Integer.valueOf(getCorePoolSize()), "  maxSize=", Integer.valueOf(getMaximumPoolSize()));
            } catch (Exception e) {
                C2905l.m8114c("ADThreadPoolExecutor", e.getMessage());
            }
        }
    }

    /* renamed from: a */
    private void m8015a(BlockingQueue<Runnable> blockingQueue, int i, int i2) {
        if (getCorePoolSize() != i && blockingQueue != null && blockingQueue.size() >= i2) {
            try {
                setCorePoolSize(i);
                C2905l.m8107a("ADThreadPoolExecutor", "increaseCoreThreadSize: increase poolType =  ", this.f6457a, " coreSize=", Integer.valueOf(getCorePoolSize()), "  maxSize=", Integer.valueOf(getMaximumPoolSize()));
            } catch (Exception e) {
                C2905l.m8114c("ADThreadPoolExecutor", e.getMessage());
            }
        }
    }

    public void execute(final Runnable runnable) {
        BlockingQueue queue;
        if (runnable instanceof C2885g) {
            m8011a(new C2878b((C2885g) runnable, this));
        } else {
            m8011a(new C2878b(new C2885g("unknown") {
                public void run() {
                    runnable.run();
                }
            }, this));
        }
        if (C2882e.m8046e() && !TextUtils.isEmpty(this.f6457a) && (queue = getQueue()) != null) {
            String str = this.f6457a;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 3366) {
                if (hashCode != 107332) {
                    if (hashCode == 2993840 && str.equals("aidl")) {
                        c = 1;
                    }
                } else if (str.equals("log")) {
                    c = 2;
                }
            } else if (str.equals("io")) {
                c = 0;
            }
            if (c == 0) {
                m8015a(queue, C2882e.f6486a + 2, getCorePoolSize() * 2);
            } else if (c == 1) {
                m8015a(queue, 5, 5);
            } else if (c == 2) {
                m8015a(queue, 6, 6);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void afterExecute(Runnable runnable, Throwable th) {
        BlockingQueue queue;
        super.afterExecute(runnable, th);
        if (C2882e.m8046e() && !TextUtils.isEmpty(this.f6457a) && (queue = getQueue()) != null) {
            String str = this.f6457a;
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 3366) {
                if (hashCode != 107332) {
                    if (hashCode == 2993840 && str.equals("aidl")) {
                        c = 1;
                    }
                } else if (str.equals("log")) {
                    c = 2;
                }
            } else if (str.equals("io")) {
                c = 0;
            }
            if (c == 0) {
                m8014a((BlockingQueue<Runnable>) queue, 4);
            } else if (c == 1) {
                m8014a((BlockingQueue<Runnable>) queue, 2);
            } else if (c == 2) {
                m8014a((BlockingQueue<Runnable>) queue, 2);
            }
        }
    }

    public List<Runnable> shutdownNow() {
        if ("io".equals(this.f6457a) || "aidl".equals(this.f6457a)) {
            return Collections.emptyList();
        }
        return super.shutdownNow();
    }

    public void shutdown() {
        if (!"io".equals(this.f6457a) && !"aidl".equals(this.f6457a)) {
            super.shutdown();
        }
    }

    /* renamed from: a */
    public String mo17770a() {
        return this.f6457a;
    }

    /* renamed from: com.bytedance.sdk.component.f.a$a */
    /* compiled from: ADThreadPoolExecutor */
    public static class C2876a {

        /* renamed from: a */
        private String f6460a = "io";

        /* renamed from: b */
        private int f6461b = 1;

        /* renamed from: c */
        private long f6462c = 30;

        /* renamed from: d */
        private TimeUnit f6463d = TimeUnit.SECONDS;

        /* renamed from: e */
        private int f6464e = Integer.MAX_VALUE;

        /* renamed from: f */
        private BlockingQueue<Runnable> f6465f = null;

        /* renamed from: g */
        private ThreadFactory f6466g = null;

        /* renamed from: h */
        private RejectedExecutionHandler f6467h;

        /* renamed from: i */
        private int f6468i = 5;

        /* renamed from: a */
        public C2876a mo17778a(String str) {
            this.f6460a = str;
            return this;
        }

        /* renamed from: a */
        public C2876a mo17776a(int i) {
            this.f6461b = i;
            return this;
        }

        /* renamed from: a */
        public C2876a mo17777a(long j) {
            this.f6462c = j;
            return this;
        }

        /* renamed from: a */
        public C2876a mo17781a(TimeUnit timeUnit) {
            this.f6463d = timeUnit;
            return this;
        }

        /* renamed from: a */
        public C2876a mo17779a(BlockingQueue<Runnable> blockingQueue) {
            this.f6465f = blockingQueue;
            return this;
        }

        /* renamed from: a */
        public C2876a mo17780a(RejectedExecutionHandler rejectedExecutionHandler) {
            this.f6467h = rejectedExecutionHandler;
            return this;
        }

        /* renamed from: b */
        public C2876a mo17783b(int i) {
            this.f6468i = i;
            return this;
        }

        /* renamed from: a */
        public C2874a mo17782a() {
            if (this.f6466g == null) {
                this.f6466g = new C2886h(this.f6468i, this.f6460a);
            }
            if (this.f6467h == null) {
                this.f6467h = C2882e.m8047f();
            }
            if (this.f6465f == null) {
                this.f6465f = new LinkedBlockingQueue();
            }
            return new C2874a(this.f6460a, this.f6461b, this.f6464e, this.f6462c, this.f6463d, this.f6465f, this.f6466g, this.f6467h);
        }
    }
}
