package com.tapjoy.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.logging.Logger;

/* renamed from: com.tapjoy.internal.jf */
public final class C11649jf {

    /* renamed from: a */
    static final Logger f28081a = Logger.getLogger(C11649jf.class.getName());

    private C11649jf() {
    }

    /* renamed from: a */
    public static C11647jd m31949a(C11658jm jmVar) {
        if (jmVar != null) {
            return new C11653jh(jmVar);
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: a */
    public static C11646jc m31948a(C11657jl jlVar) {
        if (jlVar != null) {
            return new C11652jg(jlVar);
        }
        throw new IllegalArgumentException("sink == null");
    }

    /* renamed from: a */
    public static C11657jl m31950a(final OutputStream outputStream) {
        final C11659jn jnVar = new C11659jn();
        if (outputStream != null) {
            return new C11657jl() {
                /* renamed from: a */
                public final void mo70249a(C11645jb jbVar, long j) {
                    C11661jo.m31993a(jbVar.f28075b, 0, j);
                    while (j > 0) {
                        jnVar.mo70295a();
                        C11654ji jiVar = jbVar.f28074a;
                        int min = (int) Math.min(j, (long) (jiVar.f28094c - jiVar.f28093b));
                        outputStream.write(jiVar.f28092a, jiVar.f28093b, min);
                        jiVar.f28093b += min;
                        long j2 = (long) min;
                        j -= j2;
                        jbVar.f28075b -= j2;
                        if (jiVar.f28093b == jiVar.f28094c) {
                            jbVar.f28074a = jiVar.mo70292a();
                            C11655jj.m31976a(jiVar);
                        }
                    }
                }

                public final void flush() {
                    outputStream.flush();
                }

                public final void close() {
                    outputStream.close();
                }

                public final String toString() {
                    return "sink(" + outputStream + ")";
                }
            };
        }
        throw new IllegalArgumentException("out == null");
    }

    /* renamed from: a */
    public static C11658jm m31951a(final InputStream inputStream) {
        final C11659jn jnVar = new C11659jn();
        if (inputStream != null) {
            return new C11658jm() {
                /* renamed from: b */
                public final long mo70250b(C11645jb jbVar, long j) {
                    int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                    if (i < 0) {
                        throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
                    } else if (i == 0) {
                        return 0;
                    } else {
                        try {
                            jnVar.mo70295a();
                            C11654ji c = jbVar.mo70257c(1);
                            int read = inputStream.read(c.f28092a, c.f28094c, (int) Math.min(j, (long) (8192 - c.f28094c)));
                            if (read == -1) {
                                return -1;
                            }
                            c.f28094c += read;
                            long j2 = (long) read;
                            jbVar.f28075b += j2;
                            return j2;
                        } catch (AssertionError e) {
                            if (C11649jf.m31952a(e)) {
                                throw new IOException(e);
                            }
                            throw e;
                        }
                    }
                }

                public final void close() {
                    inputStream.close();
                }

                public final String toString() {
                    return "source(" + inputStream + ")";
                }
            };
        }
        throw new IllegalArgumentException("in == null");
    }

    /* renamed from: a */
    static boolean m31952a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }
}
