package com.tapjoy.internal;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.tapjoy.internal.s */
public final class C11681s implements C11282ax<Bitmap> {

    /* renamed from: a */
    public static final C11681s f28188a = new C11681s();

    /* renamed from: a */
    public final /* synthetic */ void mo69687a(OutputStream outputStream, Object obj) {
        if (!((Bitmap) obj).compress(Bitmap.CompressFormat.PNG, 100, outputStream)) {
            throw new RuntimeException();
        }
    }

    private C11681s() {
    }

    /* renamed from: a */
    public final Bitmap mo69686b(final InputStream inputStream) {
        try {
            return (Bitmap) C11690x.m32062a(new C11280av<Bitmap>() {
                public final /* synthetic */ Object call() {
                    InputStream inputStream = inputStream;
                    if (inputStream instanceof C11281aw) {
                        return BitmapFactory.decodeStream(inputStream);
                    }
                    return BitmapFactory.decodeStream(new C11281aw(inputStream));
                }
            });
        } catch (OutOfMemoryError unused) {
            return null;
        }
    }
}
