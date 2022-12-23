package com.inmobi.media;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.inmobi.media.jp */
/* compiled from: BitmapDetector */
public class C6262jp {
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final String f15775b = C6262jp.class.getSimpleName();

    /* renamed from: a */
    public final WeakReference<View> f15776a;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final WeakReference<C6267a> f15777c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public boolean f15778d = false;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public boolean f15779e = false;

    /* renamed from: com.inmobi.media.jp$a */
    /* compiled from: BitmapDetector */
    public interface C6267a {
        /* renamed from: j */
        void mo35495j();

        /* renamed from: k */
        void mo35496k();
    }

    public C6262jp(View view, C6267a aVar) {
        this.f15777c = new WeakReference<>(aVar);
        this.f15776a = new WeakReference<>(view);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static Bitmap m18623b(final View view) throws IllegalStateException {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            throw new IllegalStateException();
        }
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        final Canvas canvas = new Canvas(createBitmap);
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        view.post(new Runnable() {
            public final void run() {
                view.draw(canvas);
                countDownLatch.countDown();
            }
        });
        try {
            countDownLatch.await();
        } catch (InterruptedException unused) {
        }
        return createBitmap;
    }
}
