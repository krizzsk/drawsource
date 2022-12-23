package com.tapjoy.internal;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* renamed from: com.tapjoy.internal.el */
public abstract class C11400el<E> {

    /* renamed from: c */
    public static final C11400el<Boolean> f27214c = new C11400el<Boolean>(C11395ei.VARINT, Boolean.class) {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ int mo69841a(Object obj) {
            return 1;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo69844a(C11417en enVar, Object obj) {
            enVar.mo69867c(((Boolean) obj).booleanValue() ? 1 : 0);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo69843a(C11416em emVar) {
            int c = emVar.mo69861c();
            if (c == 0) {
                return Boolean.FALSE;
            }
            if (c == 1) {
                return Boolean.TRUE;
            }
            throw new IOException(String.format("Invalid boolean value 0x%02x", new Object[]{Integer.valueOf(c)}));
        }
    };

    /* renamed from: d */
    public static final C11400el<Integer> f27215d = new C11400el<Integer>(C11395ei.VARINT, Integer.class) {
        /* renamed from: a */
        public final /* synthetic */ int mo69841a(Object obj) {
            int intValue = ((Integer) obj).intValue();
            if (intValue >= 0) {
                return C11417en.m31215a(intValue);
            }
            return 10;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo69844a(C11417en enVar, Object obj) {
            int intValue = ((Integer) obj).intValue();
            if (intValue >= 0) {
                enVar.mo69867c(intValue);
            } else {
                enVar.mo69868c((long) intValue);
            }
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo69843a(C11416em emVar) {
            return Integer.valueOf(emVar.mo69861c());
        }
    };

    /* renamed from: e */
    public static final C11400el<Integer> f27216e = new C11400el<Integer>(C11395ei.VARINT, Integer.class) {
        /* renamed from: a */
        public final /* synthetic */ int mo69841a(Object obj) {
            return C11417en.m31215a(((Integer) obj).intValue());
        }

        /* renamed from: a */
        public final /* synthetic */ void mo69844a(C11417en enVar, Object obj) {
            enVar.mo69867c(((Integer) obj).intValue());
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo69843a(C11416em emVar) {
            return Integer.valueOf(emVar.mo69861c());
        }
    };

    /* renamed from: f */
    public static final C11400el<Integer> f27217f = new C11400el<Integer>(C11395ei.VARINT, Integer.class) {
        /* renamed from: a */
        public final /* synthetic */ int mo69841a(Object obj) {
            return C11417en.m31215a(C11417en.m31218b(((Integer) obj).intValue()));
        }

        /* renamed from: a */
        public final /* synthetic */ void mo69844a(C11417en enVar, Object obj) {
            enVar.mo69867c(C11417en.m31218b(((Integer) obj).intValue()));
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo69843a(C11416em emVar) {
            int c = emVar.mo69861c();
            return Integer.valueOf((-(c & 1)) ^ (c >>> 1));
        }
    };

    /* renamed from: g */
    public static final C11400el<Integer> f27218g;

    /* renamed from: h */
    public static final C11400el<Integer> f27219h;

    /* renamed from: i */
    public static final C11400el<Long> f27220i = new C11400el<Long>(C11395ei.VARINT, Long.class) {
        /* renamed from: a */
        public final /* synthetic */ int mo69841a(Object obj) {
            return C11417en.m31217a(((Long) obj).longValue());
        }

        /* renamed from: a */
        public final /* synthetic */ void mo69844a(C11417en enVar, Object obj) {
            enVar.mo69868c(((Long) obj).longValue());
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo69843a(C11416em emVar) {
            return Long.valueOf(emVar.mo69862d());
        }
    };

    /* renamed from: j */
    public static final C11400el<Long> f27221j = new C11400el<Long>(C11395ei.VARINT, Long.class) {
        /* renamed from: a */
        public final /* synthetic */ int mo69841a(Object obj) {
            return C11417en.m31217a(((Long) obj).longValue());
        }

        /* renamed from: a */
        public final /* synthetic */ void mo69844a(C11417en enVar, Object obj) {
            enVar.mo69868c(((Long) obj).longValue());
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo69843a(C11416em emVar) {
            return Long.valueOf(emVar.mo69862d());
        }
    };

    /* renamed from: k */
    public static final C11400el<Long> f27222k = new C11400el<Long>(C11395ei.VARINT, Long.class) {
        /* renamed from: a */
        public final /* synthetic */ int mo69841a(Object obj) {
            return C11417en.m31217a(C11417en.m31219b(((Long) obj).longValue()));
        }

        /* renamed from: a */
        public final /* synthetic */ void mo69844a(C11417en enVar, Object obj) {
            enVar.mo69868c(C11417en.m31219b(((Long) obj).longValue()));
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo69843a(C11416em emVar) {
            long d = emVar.mo69862d();
            return Long.valueOf((-(d & 1)) ^ (d >>> 1));
        }
    };

    /* renamed from: l */
    public static final C11400el<Long> f27223l;

    /* renamed from: m */
    public static final C11400el<Long> f27224m;

    /* renamed from: n */
    public static final C11400el<Float> f27225n = new C11400el<Float>(C11395ei.FIXED32, Float.class) {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ int mo69841a(Object obj) {
            return 4;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo69844a(C11417en enVar, Object obj) {
            enVar.mo69869d(Float.floatToIntBits(((Float) obj).floatValue()));
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo69843a(C11416em emVar) {
            return Float.valueOf(Float.intBitsToFloat(emVar.mo69863e()));
        }
    };

    /* renamed from: o */
    public static final C11400el<Double> f27226o = new C11400el<Double>(C11395ei.FIXED64, Double.class) {
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ int mo69841a(Object obj) {
            return 8;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo69844a(C11417en enVar, Object obj) {
            enVar.mo69870d(Double.doubleToLongBits(((Double) obj).doubleValue()));
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo69843a(C11416em emVar) {
            return Double.valueOf(Double.longBitsToDouble(emVar.mo69864f()));
        }
    };

    /* renamed from: p */
    public static final C11400el<String> f27227p = new C11400el<String>(C11395ei.LENGTH_DELIMITED, String.class) {
        /* renamed from: a */
        public final /* synthetic */ int mo69841a(Object obj) {
            int i;
            String str = (String) obj;
            int length = str.length();
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                char charAt = str.charAt(i2);
                if (charAt >= 128) {
                    if (charAt < 2048) {
                        i3 += 2;
                    } else if (charAt < 55296 || charAt > 57343) {
                        i3 += 3;
                    } else if (charAt <= 56319 && (i = i2 + 1) < length && str.charAt(i) >= 56320 && str.charAt(i) <= 57343) {
                        i3 += 4;
                        i2 = i;
                    }
                    i2++;
                }
                i3++;
                i2++;
            }
            return i3;
        }

        /* renamed from: a */
        public final /* synthetic */ void mo69844a(C11417en enVar, Object obj) {
            enVar.f27242a.mo70253b((String) obj);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo69843a(C11416em emVar) {
            return emVar.f27234a.mo70258c(emVar.mo69865g());
        }
    };

    /* renamed from: q */
    public static final C11400el<C11648je> f27228q = new C11400el<C11648je>(C11395ei.LENGTH_DELIMITED, C11648je.class) {
        /* renamed from: a */
        public final /* synthetic */ int mo69841a(Object obj) {
            return ((C11648je) obj).mo70282c();
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo69844a(C11417en enVar, Object obj) {
            enVar.mo69866a((C11648je) obj);
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo69843a(C11416em emVar) {
            return emVar.f27234a.mo70254b(emVar.mo69865g());
        }
    };

    /* renamed from: a */
    final Class<?> f27229a;

    /* renamed from: b */
    C11400el<List<E>> f27230b;

    /* renamed from: r */
    private final C11395ei f27231r;

    /* renamed from: a */
    public abstract int mo69841a(E e);

    /* renamed from: a */
    public abstract E mo69843a(C11416em emVar);

    /* renamed from: a */
    public abstract void mo69844a(C11417en enVar, E e);

    public C11400el(C11395ei eiVar, Class<?> cls) {
        this.f27231r = eiVar;
        this.f27229a = cls;
    }

    /* renamed from: a */
    public int mo69851a(int i, E e) {
        int a = mo69841a(e);
        if (this.f27231r == C11395ei.LENGTH_DELIMITED) {
            a += C11417en.m31215a(a);
        }
        return a + C11417en.m31215a(C11417en.m31216a(i, C11395ei.VARINT));
    }

    /* renamed from: a */
    public void mo69855a(C11417en enVar, int i, E e) {
        enVar.mo69867c(C11417en.m31216a(i, this.f27231r));
        if (this.f27231r == C11395ei.LENGTH_DELIMITED) {
            enVar.mo69867c(mo69841a(e));
        }
        mo69844a(enVar, e);
    }

    /* renamed from: a */
    public final void mo69856a(C11646jc jcVar, E e) {
        C11399ek.m31148a(e, "value == null");
        C11399ek.m31148a(jcVar, "sink == null");
        mo69844a(new C11417en(jcVar), e);
    }

    /* renamed from: b */
    public final byte[] mo69857b(E e) {
        C11399ek.m31148a(e, "value == null");
        C11645jb jbVar = new C11645jb();
        try {
            mo69856a((C11646jc) jbVar, e);
            return jbVar.mo70272h();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    /* renamed from: a */
    public final E mo69854a(byte[] bArr) {
        C11399ek.m31148a(bArr, "bytes == null");
        C11645jb jbVar = new C11645jb();
        if (bArr != null) {
            return mo69853a((C11647jd) jbVar.mo70246a(bArr, 0, bArr.length));
        }
        throw new IllegalArgumentException("source == null");
    }

    /* renamed from: a */
    public final E mo69853a(C11647jd jdVar) {
        C11399ek.m31148a(jdVar, "source == null");
        return mo69843a(new C11416em(jdVar));
    }

    /* renamed from: c */
    public static String m31149c(E e) {
        return e.toString();
    }

    static {
        C1140210 r0 = new C11400el<Integer>(C11395ei.FIXED32, Integer.class) {
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ int mo69841a(Object obj) {
                return 4;
            }

            /* renamed from: a */
            public final /* synthetic */ void mo69844a(C11417en enVar, Object obj) {
                enVar.mo69869d(((Integer) obj).intValue());
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo69843a(C11416em emVar) {
                return Integer.valueOf(emVar.mo69863e());
            }
        };
        f27218g = r0;
        f27219h = r0;
        C1140614 r02 = new C11400el<Long>(C11395ei.FIXED64, Long.class) {
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ int mo69841a(Object obj) {
                return 8;
            }

            /* renamed from: a */
            public final /* synthetic */ void mo69844a(C11417en enVar, Object obj) {
                enVar.mo69870d(((Long) obj).longValue());
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo69843a(C11416em emVar) {
                return Long.valueOf(emVar.mo69864f());
            }
        };
        f27223l = r02;
        f27224m = r02;
    }

    /* renamed from: a */
    public final C11400el<List<E>> mo69852a() {
        C11400el<List<E>> elVar = this.f27230b;
        if (elVar != null) {
            return elVar;
        }
        C114116 r0 = new C11400el<List<E>>(this.f27231r, List.class) {
            /* renamed from: a */
            public final /* synthetic */ int mo69851a(int i, Object obj) {
                List list = (List) obj;
                int size = list.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    i2 += C11400el.this.mo69851a(i, list.get(i3));
                }
                return i2;
            }

            /* renamed from: a */
            public final /* synthetic */ void mo69855a(C11417en enVar, int i, Object obj) {
                List list = (List) obj;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    C11400el.this.mo69855a(enVar, i, list.get(i2));
                }
            }

            /* renamed from: a */
            public final /* synthetic */ Object mo69843a(C11416em emVar) {
                return Collections.singletonList(C11400el.this.mo69843a(emVar));
            }

            /* renamed from: a */
            public final /* synthetic */ void mo69844a(C11417en enVar, Object obj) {
                throw new UnsupportedOperationException("Repeated values can only be encoded with a tag.");
            }

            /* renamed from: a */
            public final /* synthetic */ int mo69841a(Object obj) {
                throw new UnsupportedOperationException("Repeated values can only be sized with a tag.");
            }
        };
        this.f27230b = r0;
        return r0;
    }

    /* renamed from: com.tapjoy.internal.el$a */
    public static final class C11415a extends IllegalArgumentException {

        /* renamed from: a */
        public final int f27233a;

        C11415a(int i, Class<?> cls) {
            super("Unknown enum tag " + i + " for " + cls.getCanonicalName());
            this.f27233a = i;
        }
    }
}
