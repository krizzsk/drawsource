package com.bytedance.sdk.component.p108d.p111c.p116c;

import java.io.Closeable;

/* renamed from: com.bytedance.sdk.component.d.c.c.b */
/* compiled from: IOUtils */
public class C2798b {
    /* renamed from: a */
    public static void m7727a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }
}
