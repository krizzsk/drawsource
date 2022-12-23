package com.tapjoy.internal;

import android.graphics.Bitmap;
import java.io.InputStream;
import java.net.ContentHandler;
import java.net.URLConnection;
import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.r */
public final class C11680r extends ContentHandler {

    /* renamed from: a */
    public static final C11680r f28187a = new C11680r();

    @Nullable
    public final /* synthetic */ Object getContent(URLConnection uRLConnection) {
        return m32045a(uRLConnection);
    }

    private C11680r() {
    }

    @Nullable
    /* renamed from: a */
    private static Bitmap m32045a(URLConnection uRLConnection) {
        InputStream inputStream = uRLConnection.getInputStream();
        try {
            return C11681s.f28188a.mo69686b(inputStream);
        } finally {
            inputStream.close();
        }
    }

    @Nullable
    /* renamed from: a */
    public static Bitmap m32044a(InputStream inputStream) {
        try {
            return C11681s.f28188a.mo69686b(inputStream);
        } finally {
            inputStream.close();
        }
    }
}
