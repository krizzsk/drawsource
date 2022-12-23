package com.inmobi.media;

import android.graphics.Canvas;
import android.graphics.Movie;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.inmobi.media.C6000ey;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/* renamed from: com.inmobi.media.ez */
/* compiled from: GifMovieObject */
public final class C6002ez implements C6000ey {

    /* renamed from: a */
    int f15211a = 0;

    /* renamed from: b */
    private Movie f15212b;

    /* renamed from: c */
    private long f15213c;

    /* renamed from: d */
    private volatile boolean f15214d = false;

    /* renamed from: e */
    private C6000ey.C6001a f15215e;

    /* renamed from: a */
    public final void mo35124a() {
    }

    /* JADX INFO: finally extract failed */
    public C6002ez(String str) throws IOException {
        File file = new File(str);
        byte[] bArr = new byte[((int) file.length())];
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            int read = fileInputStream.read(bArr);
            C6196id.m18386a((Closeable) fileInputStream);
            Movie decodeByteArray = Movie.decodeByteArray(bArr, 0, read);
            this.f15212b = decodeByteArray;
            if (decodeByteArray == null) {
                throw new IllegalStateException("Cannot decode gif byte array");
            }
        } catch (Throwable th) {
            C6196id.m18386a((Closeable) fileInputStream);
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo35127a(boolean z) {
        this.f15214d = z;
        if (!this.f15214d) {
            this.f15213c = SystemClock.uptimeMillis() - ((long) this.f15211a);
        }
        C6000ey.C6001a aVar = this.f15215e;
        if (aVar != null) {
            aVar.mo35140a();
        }
    }

    /* renamed from: b */
    public final int mo35128b() {
        return this.f15212b.width();
    }

    /* renamed from: c */
    public final int mo35129c() {
        return this.f15212b.height();
    }

    /* renamed from: a */
    public final void mo35125a(Canvas canvas, float f, float f2) {
        this.f15212b.draw(canvas, f, f2);
        if (this.f15211a + 20 >= this.f15212b.duration()) {
            new Handler(Looper.getMainLooper()).post(new Runnable() {
                public final void run() {
                    C6002ez.this.f15211a = 0;
                    C6002ez.this.mo35127a(false);
                }
            });
        }
    }

    /* renamed from: d */
    public final boolean mo35130d() {
        return !this.f15214d;
    }

    /* renamed from: e */
    public final void mo35131e() {
        long uptimeMillis = SystemClock.uptimeMillis();
        if (this.f15213c == 0) {
            this.f15213c = uptimeMillis;
        }
        int duration = this.f15212b.duration();
        if (duration == 0) {
            duration = 1000;
        }
        int i = (int) ((uptimeMillis - this.f15213c) % ((long) duration));
        this.f15211a = i;
        this.f15212b.setTime(i);
    }

    /* renamed from: a */
    public final void mo35126a(C6000ey.C6001a aVar) {
        this.f15215e = aVar;
    }
}
