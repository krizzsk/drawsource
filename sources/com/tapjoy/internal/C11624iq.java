package com.tapjoy.internal;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import java.nio.ByteBuffer;

/* renamed from: com.tapjoy.internal.iq */
public final class C11624iq extends ImageView implements Runnable {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C11619im f28006a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Bitmap f28007b;

    /* renamed from: c */
    private final Handler f28008c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    private boolean f28009d;

    /* renamed from: e */
    private boolean f28010e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public boolean f28011f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Thread f28012g;

    /* renamed from: h */
    private C11628b f28013h = null;

    /* renamed from: i */
    private long f28014i = -1;

    /* renamed from: j */
    private C11627a f28015j = null;

    /* renamed from: k */
    private final Runnable f28016k = new Runnable() {
        public final void run() {
            if (C11624iq.this.f28007b != null && !C11624iq.this.f28007b.isRecycled()) {
                C11624iq iqVar = C11624iq.this;
                iqVar.setImageBitmap(iqVar.f28007b);
            }
        }
    };

    /* renamed from: l */
    private final Runnable f28017l = new Runnable() {
        public final void run() {
            Bitmap unused = C11624iq.this.f28007b = null;
            C11619im unused2 = C11624iq.this.f28006a = null;
            Thread unused3 = C11624iq.this.f28012g = null;
            boolean unused4 = C11624iq.this.f28011f = false;
        }
    };

    /* renamed from: com.tapjoy.internal.iq$a */
    public interface C11627a {
    }

    /* renamed from: com.tapjoy.internal.iq$b */
    public interface C11628b {
        /* renamed from: a */
        Bitmap mo70222a();
    }

    public C11624iq(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo70206a(C11622io ioVar, byte[] bArr) {
        try {
            this.f28006a = new C11619im(new C11629ir(), ioVar, ByteBuffer.wrap(bArr));
            if (this.f28009d) {
                m31857f();
            } else {
                m31854d();
            }
        } catch (Exception unused) {
            this.f28006a = null;
            Object[] objArr = new Object[1];
        }
    }

    public final void setBytes(byte[] bArr) {
        C11619im imVar = new C11619im();
        this.f28006a = imVar;
        try {
            imVar.mo70197a(bArr);
            if (this.f28009d) {
                m31857f();
            } else {
                m31854d();
            }
        } catch (Exception unused) {
            this.f28006a = null;
            Object[] objArr = new Object[1];
        }
    }

    public final long getFramesDisplayDuration() {
        return this.f28014i;
    }

    public final void setFramesDisplayDuration(long j) {
        this.f28014i = j;
    }

    /* renamed from: a */
    public final void mo70205a() {
        this.f28009d = true;
        m31857f();
    }

    /* renamed from: b */
    public final void mo70207b() {
        this.f28009d = false;
        Thread thread = this.f28012g;
        if (thread != null) {
            thread.interrupt();
            this.f28012g = null;
        }
    }

    /* renamed from: d */
    private void m31854d() {
        if (this.f28006a.f27954a != 0 && this.f28006a.mo70198a() && !this.f28009d) {
            this.f28010e = true;
            m31857f();
        }
    }

    /* renamed from: c */
    public final void mo70208c() {
        this.f28009d = false;
        this.f28010e = false;
        this.f28011f = true;
        mo70207b();
        this.f28008c.post(this.f28017l);
    }

    /* renamed from: e */
    private boolean m31855e() {
        return (this.f28009d || this.f28010e) && this.f28006a != null && this.f28012g == null;
    }

    public final int getGifWidth() {
        return this.f28006a.f27956c.f27994f;
    }

    public final int getGifHeight() {
        return this.f28006a.f27956c.f27995g;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x004f A[Catch:{ ArrayIndexOutOfBoundsException -> 0x006c, IllegalArgumentException -> 0x0068 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0075 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x0008  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00b3 A[ADDED_TO_REGION, EDGE_INSN: B:64:0x00b3->B:56:0x00b3 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r11 = this;
        L_0x0000:
            boolean r0 = r11.f28009d
            if (r0 != 0) goto L_0x0008
            boolean r0 = r11.f28010e
            if (r0 == 0) goto L_0x00b5
        L_0x0008:
            com.tapjoy.internal.im r0 = r11.f28006a
            com.tapjoy.internal.io r1 = r0.f27956c
            int r1 = r1.f27991c
            r2 = -1
            r3 = 0
            r4 = 1
            if (r1 > 0) goto L_0x0015
        L_0x0013:
            r0 = r3
            goto L_0x003d
        L_0x0015:
            int r1 = r0.f27954a
            com.tapjoy.internal.io r5 = r0.f27956c
            int r5 = r5.f27991c
            int r5 = r5 - r4
            if (r1 != r5) goto L_0x0023
            int r1 = r0.f27955b
            int r1 = r1 + r4
            r0.f27955b = r1
        L_0x0023:
            com.tapjoy.internal.io r1 = r0.f27956c
            int r1 = r1.f28001m
            if (r1 == r2) goto L_0x0032
            int r1 = r0.f27955b
            com.tapjoy.internal.io r5 = r0.f27956c
            int r5 = r5.f28001m
            if (r1 <= r5) goto L_0x0032
            goto L_0x0013
        L_0x0032:
            int r1 = r0.f27954a
            int r1 = r1 + r4
            com.tapjoy.internal.io r5 = r0.f27956c
            int r5 = r5.f27991c
            int r1 = r1 % r5
            r0.f27954a = r1
            r0 = r4
        L_0x003d:
            r5 = 0
            long r7 = java.lang.System.nanoTime()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x006c, IllegalArgumentException -> 0x0068 }
            com.tapjoy.internal.im r1 = r11.f28006a     // Catch:{ ArrayIndexOutOfBoundsException -> 0x006c, IllegalArgumentException -> 0x0068 }
            android.graphics.Bitmap r1 = r1.mo70199b()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x006c, IllegalArgumentException -> 0x0068 }
            r11.f28007b = r1     // Catch:{ ArrayIndexOutOfBoundsException -> 0x006c, IllegalArgumentException -> 0x0068 }
            com.tapjoy.internal.iq$b r1 = r11.f28013h     // Catch:{ ArrayIndexOutOfBoundsException -> 0x006c, IllegalArgumentException -> 0x0068 }
            if (r1 == 0) goto L_0x0057
            com.tapjoy.internal.iq$b r1 = r11.f28013h     // Catch:{ ArrayIndexOutOfBoundsException -> 0x006c, IllegalArgumentException -> 0x0068 }
            android.graphics.Bitmap r1 = r1.mo70222a()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x006c, IllegalArgumentException -> 0x0068 }
            r11.f28007b = r1     // Catch:{ ArrayIndexOutOfBoundsException -> 0x006c, IllegalArgumentException -> 0x0068 }
        L_0x0057:
            long r9 = java.lang.System.nanoTime()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x006c, IllegalArgumentException -> 0x0068 }
            long r9 = r9 - r7
            r7 = 1000000(0xf4240, double:4.940656E-318)
            long r9 = r9 / r7
            android.os.Handler r1 = r11.f28008c     // Catch:{ ArrayIndexOutOfBoundsException -> 0x006d, IllegalArgumentException -> 0x0069 }
            java.lang.Runnable r7 = r11.f28016k     // Catch:{ ArrayIndexOutOfBoundsException -> 0x006d, IllegalArgumentException -> 0x0069 }
            r1.post(r7)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x006d, IllegalArgumentException -> 0x0069 }
            goto L_0x006f
        L_0x0068:
            r9 = r5
        L_0x0069:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            goto L_0x006f
        L_0x006c:
            r9 = r5
        L_0x006d:
            java.lang.Object[] r1 = new java.lang.Object[r4]
        L_0x006f:
            r11.f28010e = r3
            boolean r1 = r11.f28009d
            if (r1 == 0) goto L_0x00b3
            if (r0 != 0) goto L_0x0078
            goto L_0x00b3
        L_0x0078:
            com.tapjoy.internal.im r0 = r11.f28006a     // Catch:{ InterruptedException -> 0x00ae }
            com.tapjoy.internal.io r1 = r0.f27956c     // Catch:{ InterruptedException -> 0x00ae }
            int r1 = r1.f27991c     // Catch:{ InterruptedException -> 0x00ae }
            if (r1 <= 0) goto L_0x009c
            int r1 = r0.f27954a     // Catch:{ InterruptedException -> 0x00ae }
            if (r1 >= 0) goto L_0x0085
            goto L_0x009c
        L_0x0085:
            int r1 = r0.f27954a     // Catch:{ InterruptedException -> 0x00ae }
            if (r1 < 0) goto L_0x009b
            com.tapjoy.internal.io r3 = r0.f27956c     // Catch:{ InterruptedException -> 0x00ae }
            int r3 = r3.f27991c     // Catch:{ InterruptedException -> 0x00ae }
            if (r1 >= r3) goto L_0x009b
            com.tapjoy.internal.io r0 = r0.f27956c     // Catch:{ InterruptedException -> 0x00ae }
            java.util.List<com.tapjoy.internal.in> r0 = r0.f27993e     // Catch:{ InterruptedException -> 0x00ae }
            java.lang.Object r0 = r0.get(r1)     // Catch:{ InterruptedException -> 0x00ae }
            com.tapjoy.internal.in r0 = (com.tapjoy.internal.C11621in) r0     // Catch:{ InterruptedException -> 0x00ae }
            int r2 = r0.f27986i     // Catch:{ InterruptedException -> 0x00ae }
        L_0x009b:
            r3 = r2
        L_0x009c:
            long r0 = (long) r3     // Catch:{ InterruptedException -> 0x00ae }
            long r0 = r0 - r9
            int r0 = (int) r0     // Catch:{ InterruptedException -> 0x00ae }
            if (r0 <= 0) goto L_0x00ae
            long r1 = r11.f28014i     // Catch:{ InterruptedException -> 0x00ae }
            int r1 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x00aa
            long r0 = r11.f28014i     // Catch:{ InterruptedException -> 0x00ae }
            goto L_0x00ab
        L_0x00aa:
            long r0 = (long) r0     // Catch:{ InterruptedException -> 0x00ae }
        L_0x00ab:
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x00ae }
        L_0x00ae:
            boolean r0 = r11.f28009d
            if (r0 != 0) goto L_0x0000
            goto L_0x00b5
        L_0x00b3:
            r11.f28009d = r3
        L_0x00b5:
            boolean r0 = r11.f28011f
            if (r0 == 0) goto L_0x00c0
            android.os.Handler r0 = r11.f28008c
            java.lang.Runnable r1 = r11.f28017l
            r0.post(r1)
        L_0x00c0:
            r0 = 0
            r11.f28012g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11624iq.run():void");
    }

    public final C11628b getOnFrameAvailable() {
        return this.f28013h;
    }

    public final void setOnFrameAvailable(C11628b bVar) {
        this.f28013h = bVar;
    }

    public final C11627a getOnAnimationStop() {
        return this.f28015j;
    }

    public final void setOnAnimationStop(C11627a aVar) {
        this.f28015j = aVar;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo70208c();
    }

    /* renamed from: f */
    private void m31857f() {
        if (m31855e()) {
            Thread thread = new Thread(this);
            this.f28012g = thread;
            thread.start();
        }
    }
}
