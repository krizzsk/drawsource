package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4989s;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4991u;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.x */
public final class C4957x {

    /* renamed from: a */
    public final ExecutorService f13188a;

    /* renamed from: b */
    public C4959b<? extends C4960c> f13189b;

    /* renamed from: c */
    public IOException f13190c;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.x$a */
    public interface C4958a<T extends C4960c> {
        /* renamed from: a */
        int mo25138a(T t, long j, long j2, IOException iOException);

        /* renamed from: a */
        void mo25141a(T t, long j, long j2);

        /* renamed from: a */
        void mo25142a(T t, long j, long j2, boolean z);
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.x$c */
    public interface C4960c {
        /* renamed from: a */
        boolean mo25110a();

        /* renamed from: b */
        void mo25111b();

        void load() throws IOException, InterruptedException;
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.x$d */
    public static final class C4961d extends IOException {
        public C4961d(Throwable th) {
            super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
        }
    }

    public C4957x(String str) {
        this.f13188a = C4991u.m15145c(str);
    }

    /* renamed from: a */
    public <T extends C4960c> long mo25490a(T t, C4958a<T> aVar, int i) {
        Looper myLooper = Looper.myLooper();
        C4965a.m15051b(myLooper != null);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new C4959b(myLooper, t, aVar, i, elapsedRealtime).mo25495a(0);
        return elapsedRealtime;
    }

    /* renamed from: b */
    public boolean mo25492b() {
        return this.f13189b != null;
    }

    /* renamed from: c */
    public void mo25493c() throws IOException {
        IOException iOException = this.f13190c;
        if (iOException == null) {
            C4959b<? extends C4960c> bVar = this.f13189b;
            if (bVar != null) {
                int i = bVar.f13193c;
                IOException iOException2 = bVar.f13195e;
                if (iOException2 != null && bVar.f13196f > i) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    /* renamed from: d */
    public void mo25494d() {
        C4959b<? extends C4960c> bVar = this.f13189b;
        if (bVar != null) {
            bVar.mo25496a(true);
        }
        this.f13188a.shutdown();
    }

    /* renamed from: a */
    public void mo25491a() {
        this.f13189b.mo25496a(false);
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.x$b */
    public final class C4959b<T extends C4960c> extends Handler implements Runnable {

        /* renamed from: a */
        public final T f13191a;

        /* renamed from: b */
        public final C4958a<T> f13192b;

        /* renamed from: c */
        public final int f13193c;

        /* renamed from: d */
        public final long f13194d;

        /* renamed from: e */
        public IOException f13195e;

        /* renamed from: f */
        public int f13196f;

        /* renamed from: g */
        public volatile Thread f13197g;

        /* renamed from: h */
        public volatile boolean f13198h;

        public C4959b(Looper looper, T t, C4958a<T> aVar, int i, long j) {
            super(looper);
            this.f13191a = t;
            this.f13192b = aVar;
            this.f13193c = i;
            this.f13194d = j;
        }

        /* renamed from: a */
        public void mo25495a(long j) {
            C4965a.m15051b(C4957x.this.f13189b == null);
            C4957x xVar = C4957x.this;
            xVar.f13189b = this;
            if (j > 0) {
                sendEmptyMessageDelayed(0, j);
                return;
            }
            this.f13195e = null;
            xVar.f13188a.execute(this);
        }

        public void handleMessage(Message message) {
            int i;
            if (!this.f13198h) {
                int i2 = message.what;
                if (i2 == 0) {
                    this.f13195e = null;
                    C4957x xVar = C4957x.this;
                    xVar.f13188a.execute(xVar.f13189b);
                } else if (i2 != 4) {
                    C4957x.this.f13189b = null;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j = elapsedRealtime - this.f13194d;
                    if (this.f13191a.mo25110a()) {
                        this.f13192b.mo25142a(this.f13191a, elapsedRealtime, j, false);
                        return;
                    }
                    int i3 = message.what;
                    if (i3 == 1) {
                        this.f13192b.mo25142a(this.f13191a, elapsedRealtime, j, false);
                    } else if (i3 == 2) {
                        this.f13192b.mo25141a(this.f13191a, elapsedRealtime, j);
                    } else if (i3 == 3) {
                        IOException iOException = (IOException) message.obj;
                        this.f13195e = iOException;
                        int a = this.f13192b.mo25138a(this.f13191a, elapsedRealtime, j, iOException);
                        if (a == 3) {
                            C4957x.this.f13190c = this.f13195e;
                        } else if (a != 2) {
                            if (a == 1) {
                                i = 1;
                            } else {
                                i = this.f13196f + 1;
                            }
                            this.f13196f = i;
                            mo25495a((long) Math.min((i - 1) * 1000, 5000));
                        }
                    }
                } else {
                    throw ((Error) message.obj);
                }
            }
        }

        public void run() {
            try {
                this.f13197g = Thread.currentThread();
                if (!this.f13191a.mo25110a()) {
                    C4989s.m15127a("load:" + this.f13191a.getClass().getSimpleName());
                    this.f13191a.load();
                    C4989s.m15126a();
                }
                if (!this.f13198h) {
                    sendEmptyMessage(2);
                }
            } catch (IOException e) {
                if (!this.f13198h) {
                    obtainMessage(3, e).sendToTarget();
                }
            } catch (InterruptedException unused) {
                C4965a.m15051b(this.f13191a.mo25110a());
                if (!this.f13198h) {
                    sendEmptyMessage(2);
                }
            } catch (Exception e2) {
                Log.e("LoadTask", "Unexpected exception loading stream", e2);
                if (!this.f13198h) {
                    obtainMessage(3, new C4961d(e2)).sendToTarget();
                }
            } catch (OutOfMemoryError e3) {
                Log.e("LoadTask", "OutOfMemory error loading stream", e3);
                if (!this.f13198h) {
                    obtainMessage(3, new C4961d(e3)).sendToTarget();
                }
            } catch (Error e4) {
                Log.e("LoadTask", "Unexpected error loading stream", e4);
                if (!this.f13198h) {
                    obtainMessage(4, e4).sendToTarget();
                }
                throw e4;
            } catch (Throwable th) {
                C4989s.m15126a();
                throw th;
            }
        }

        /* renamed from: a */
        public void mo25496a(boolean z) {
            this.f13198h = z;
            this.f13195e = null;
            if (hasMessages(0)) {
                removeMessages(0);
                if (!z) {
                    sendEmptyMessage(1);
                }
            } else {
                this.f13191a.mo25111b();
                if (this.f13197g != null) {
                    this.f13197g.interrupt();
                }
            }
            if (z) {
                C4957x.this.f13189b = null;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                this.f13192b.mo25142a(this.f13191a, elapsedRealtime, elapsedRealtime - this.f13194d, true);
            }
        }
    }
}
