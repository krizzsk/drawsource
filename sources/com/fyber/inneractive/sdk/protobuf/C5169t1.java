package com.fyber.inneractive.sdk.protobuf;

import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.protobuf.t1 */
public final class C5169t1 {

    /* renamed from: a */
    public static final int f13694a = m16117a(1, 3);

    /* renamed from: b */
    public static final int f13695b = m16117a(1, 4);

    /* renamed from: c */
    public static final int f13696c = m16117a(2, 0);

    /* renamed from: d */
    public static final int f13697d = m16117a(3, 2);

    /* renamed from: com.fyber.inneractive.sdk.protobuf.t1$b */
    public enum C5171b {
        DOUBLE(C5176c.DOUBLE, 1),
        FLOAT(C5176c.FLOAT, 5),
        INT64(r5, 0),
        UINT64(r5, 0),
        INT32(r11, 0),
        FIXED64(r5, 1),
        FIXED32(r11, 5),
        BOOL(C5176c.BOOLEAN, 0),
        STRING(C5176c.STRING, 2) {
        },
        GROUP(r13, 3) {
            /* renamed from: f */
            public boolean mo26198f() {
                return false;
            }
        },
        MESSAGE(r13, 2) {
            /* renamed from: f */
            public boolean mo26198f() {
                return false;
            }
        },
        BYTES(C5176c.BYTE_STRING, 2) {
            /* renamed from: f */
            public boolean mo26198f() {
                return false;
            }
        },
        UINT32(r11, 0),
        ENUM(C5176c.ENUM, 0),
        SFIXED32(r11, 5),
        SFIXED64(r5, 1),
        SINT32(r11, 0),
        SINT64(r5, 0);
        

        /* renamed from: a */
        public final C5176c f13717a;

        /* renamed from: b */
        public final int f13718b;

        /* renamed from: f */
        public boolean mo26198f() {
            return !(this instanceof C5172a);
        }

        /* access modifiers changed from: public */
        C5171b(C5176c cVar, int i) {
            this.f13717a = cVar;
            this.f13718b = i;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.t1$c */
    public enum C5176c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(C5093i.f13565b),
        ENUM((String) null),
        MESSAGE((String) null);
        

        /* renamed from: a */
        public final Object f13729a;

        /* access modifiers changed from: public */
        C5176c(Object obj) {
            this.f13729a = obj;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.t1$d */
    public enum C5177d {
        LOOSE {
            /* renamed from: a */
            public Object mo26199a(C5114j jVar) throws IOException {
                return jVar.mo25993r();
            }
        },
        STRICT {
            /* renamed from: a */
            public Object mo26199a(C5114j jVar) throws IOException {
                return jVar.mo25994s();
            }
        };

        /* 'enum' modifier removed */
        /* renamed from: com.fyber.inneractive.sdk.protobuf.t1$d$c */
        public final class C5180c extends C5177d {
            public C5180c(String str, int i) {
                super(str, i);
            }

            /* renamed from: a */
            public Object mo26199a(C5114j jVar) throws IOException {
                return jVar.mo25979e();
            }
        }

        /* renamed from: a */
        public abstract Object mo26199a(C5114j jVar) throws IOException;
    }

    /* renamed from: a */
    public static int m16117a(int i, int i2) {
        return (i << 3) | i2;
    }

    /* renamed from: a */
    public static Object m16118a(C5114j jVar, C5171b bVar, C5177d dVar) throws IOException {
        switch (bVar.ordinal()) {
            case 0:
                return Double.valueOf(jVar.mo25981f());
            case 1:
                return Float.valueOf(jVar.mo25985j());
            case 2:
                return Long.valueOf(jVar.mo25987l());
            case 3:
                return Long.valueOf(jVar.mo25997v());
            case 4:
                return Integer.valueOf(jVar.mo25986k());
            case 5:
                return Long.valueOf(jVar.mo25984i());
            case 6:
                return Integer.valueOf(jVar.mo25983h());
            case 7:
                return Boolean.valueOf(jVar.mo25978d());
            case 8:
                return dVar.mo26199a(jVar);
            case 9:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 10:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 11:
                return jVar.mo25979e();
            case 12:
                return Integer.valueOf(jVar.mo25996u());
            case 13:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            case 14:
                return Integer.valueOf(jVar.mo25989n());
            case 15:
                return Long.valueOf(jVar.mo25990o());
            case 16:
                return Integer.valueOf(jVar.mo25991p());
            case 17:
                return Long.valueOf(jVar.mo25992q());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
