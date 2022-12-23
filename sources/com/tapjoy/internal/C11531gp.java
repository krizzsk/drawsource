package com.tapjoy.internal;

import java.io.Closeable;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.tapjoy.internal.gp */
public final class C11531gp {

    /* renamed from: a */
    static final Logger f27696a = Logger.getLogger(C11531gp.class.getName());

    private C11531gp() {
    }

    /* renamed from: a */
    public static void m31567a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                try {
                    f27696a.log(Level.WARNING, "IOException thrown while closing Closeable.", e);
                } catch (IOException e2) {
                    f27696a.log(Level.SEVERE, "IOException should not have been thrown.", e2);
                }
            }
        }
    }
}
