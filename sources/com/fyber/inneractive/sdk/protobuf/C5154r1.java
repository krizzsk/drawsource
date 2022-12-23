package com.fyber.inneractive.sdk.protobuf;

import com.facebook.appevents.integrity.IntegrityManager;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* renamed from: com.fyber.inneractive.sdk.protobuf.r1 */
public final class C5154r1 {

    /* renamed from: a */
    public static final Unsafe f13661a;

    /* renamed from: b */
    public static final Class<?> f13662b = C5072d.f13533a;

    /* renamed from: c */
    public static final boolean f13663c;

    /* renamed from: d */
    public static final boolean f13664d;

    /* renamed from: e */
    public static final C5158d f13665e;

    /* renamed from: f */
    public static final boolean f13666f;

    /* renamed from: g */
    public static final boolean f13667g;

    /* renamed from: h */
    public static final long f13668h = ((long) m15962a((Class<?>) byte[].class));

    /* renamed from: i */
    public static final long f13669i;

    /* renamed from: j */
    public static final boolean f13670j;

    /* renamed from: com.fyber.inneractive.sdk.protobuf.r1$d */
    public static abstract class C5158d {

        /* renamed from: a */
        public Unsafe f13671a;

        public C5158d(Unsafe unsafe) {
            this.f13671a = unsafe;
        }

        /* renamed from: a */
        public abstract byte mo26155a(long j);

        /* renamed from: a */
        public abstract void mo26156a(long j, byte[] bArr, long j2, long j3);

        /* renamed from: a */
        public abstract void mo26157a(Object obj, long j, byte b);

        /* renamed from: a */
        public abstract void mo26158a(Object obj, long j, double d);

        /* renamed from: a */
        public abstract void mo26159a(Object obj, long j, float f);

        /* renamed from: a */
        public abstract void mo26160a(Object obj, long j, boolean z);

        /* renamed from: a */
        public boolean mo26166a() {
            Unsafe unsafe = this.f13671a;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod("objectFieldOffset", new Class[]{Field.class});
                cls.getMethod("arrayBaseOffset", new Class[]{Class.class});
                cls.getMethod("arrayIndexScale", new Class[]{Class.class});
                Class cls2 = Long.TYPE;
                cls.getMethod("getInt", new Class[]{Object.class, cls2});
                cls.getMethod("putInt", new Class[]{Object.class, cls2, Integer.TYPE});
                cls.getMethod("getLong", new Class[]{Object.class, cls2});
                cls.getMethod("putLong", new Class[]{Object.class, cls2, cls2});
                cls.getMethod("getObject", new Class[]{Object.class, cls2});
                cls.getMethod("putObject", new Class[]{Object.class, cls2, Object.class});
                return true;
            } catch (Throwable th) {
                C5154r1.m15972a(th);
                return false;
            }
        }

        /* renamed from: a */
        public abstract boolean mo26161a(Object obj, long j);

        /* renamed from: b */
        public abstract byte mo26162b(Object obj, long j);

        /* renamed from: b */
        public abstract boolean mo26163b();

        /* renamed from: c */
        public abstract double mo26164c(Object obj, long j);

        /* renamed from: d */
        public abstract float mo26165d(Object obj, long j);
    }

    static {
        Unsafe unsafe;
        boolean z;
        boolean z2;
        Class<double[]> cls = double[].class;
        Class<float[]> cls2 = float[].class;
        Class<long[]> cls3 = long[].class;
        Class<int[]> cls4 = int[].class;
        Class<boolean[]> cls5 = boolean[].class;
        C5158d dVar = null;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new C5151q1());
        } catch (Throwable unused) {
            unsafe = null;
        }
        f13661a = unsafe;
        boolean c = m15979c(Long.TYPE);
        f13663c = c;
        boolean c2 = m15979c(Integer.TYPE);
        f13664d = c2;
        if (unsafe != null) {
            if (!C5072d.m15287a()) {
                dVar = new C5157c(unsafe);
            } else if (c) {
                dVar = new C5156b(unsafe);
            } else if (c2) {
                dVar = new C5155a(unsafe);
            }
        }
        f13665e = dVar;
        boolean z3 = false;
        if (dVar == null) {
            z = false;
        } else {
            z = dVar.mo26163b();
        }
        f13666f = z;
        if (dVar == null) {
            z2 = false;
        } else {
            z2 = dVar.mo26166a();
        }
        f13667g = z2;
        m15962a((Class<?>) cls5);
        m15975b(cls5);
        m15962a((Class<?>) cls4);
        m15975b(cls4);
        m15962a((Class<?>) cls3);
        m15975b(cls3);
        m15962a((Class<?>) cls2);
        m15975b(cls2);
        m15962a((Class<?>) cls);
        m15975b(cls);
        m15962a((Class<?>) Object[].class);
        m15975b(Object[].class);
        Field a = m15964a();
        f13669i = (a == null || dVar == null) ? -1 : dVar.f13671a.objectFieldOffset(a);
        if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
            z3 = true;
        }
        f13670j = z3;
    }

    /* renamed from: a */
    public static int m15962a(Class<?> cls) {
        if (f13667g) {
            return f13665e.f13671a.arrayBaseOffset(cls);
        }
        return -1;
    }

    /* renamed from: b */
    public static int m15975b(Class<?> cls) {
        if (f13667g) {
            return f13665e.f13671a.arrayIndexScale(cls);
        }
        return -1;
    }

    /* renamed from: c */
    public static boolean m15979c(Class<?> cls) {
        Class<byte[]> cls2 = byte[].class;
        if (!C5072d.m15287a()) {
            return false;
        }
        try {
            Class<?> cls3 = f13662b;
            Class cls4 = Boolean.TYPE;
            cls3.getMethod("peekLong", new Class[]{cls, cls4});
            cls3.getMethod("pokeLong", new Class[]{cls, Long.TYPE, cls4});
            Class cls5 = Integer.TYPE;
            cls3.getMethod("pokeInt", new Class[]{cls, cls5, cls4});
            cls3.getMethod("peekInt", new Class[]{cls, cls4});
            cls3.getMethod("pokeByte", new Class[]{cls, Byte.TYPE});
            cls3.getMethod("peekByte", new Class[]{cls});
            cls3.getMethod("pokeByteArray", new Class[]{cls, cls2, cls5, cls5});
            cls3.getMethod("peekByteArray", new Class[]{cls, cls2, cls5, cls5});
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: d */
    public static byte m15980d(Object obj, long j) {
        return (byte) ((m15981e(obj, -4 & j) >>> ((int) ((j & 3) << 3))) & 255);
    }

    /* renamed from: e */
    public static int m15981e(Object obj, long j) {
        return f13665e.f13671a.getInt(obj, j);
    }

    /* renamed from: f */
    public static long m15982f(Object obj, long j) {
        return f13665e.f13671a.getLong(obj, j);
    }

    /* renamed from: g */
    public static Object m15983g(Object obj, long j) {
        return f13665e.f13671a.getObject(obj, j);
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.r1$a */
    public static final class C5155a extends C5158d {
        public C5155a(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public void mo26157a(Object obj, long j, byte b) {
            if (C5154r1.f13670j) {
                C5154r1.m15965a(obj, j, b);
            } else {
                C5154r1.m15976b(obj, j, b);
            }
        }

        /* renamed from: b */
        public byte mo26162b(Object obj, long j) {
            if (C5154r1.f13670j) {
                return C5154r1.m15978c(obj, j);
            }
            return C5154r1.m15980d(obj, j);
        }

        /* renamed from: b */
        public boolean mo26163b() {
            return false;
        }

        /* renamed from: c */
        public double mo26164c(Object obj, long j) {
            return Double.longBitsToDouble(this.f13671a.getLong(obj, j));
        }

        /* renamed from: d */
        public float mo26165d(Object obj, long j) {
            return Float.intBitsToFloat(this.f13671a.getInt(obj, j));
        }

        /* renamed from: a */
        public boolean mo26161a(Object obj, long j) {
            if (C5154r1.f13670j) {
                return C5154r1.m15974a(obj, j);
            }
            return C5154r1.m15977b(obj, j);
        }

        /* renamed from: a */
        public void mo26160a(Object obj, long j, boolean z) {
            if (C5154r1.f13670j) {
                C5154r1.m15965a(obj, j, z ? (byte) 1 : 0);
            } else {
                C5154r1.m15976b(obj, j, z ? (byte) 1 : 0);
            }
        }

        /* renamed from: a */
        public void mo26159a(Object obj, long j, float f) {
            this.f13671a.putInt(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: a */
        public void mo26158a(Object obj, long j, double d) {
            this.f13671a.putLong(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: a */
        public byte mo26155a(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public void mo26156a(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.r1$b */
    public static final class C5156b extends C5158d {
        public C5156b(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public void mo26157a(Object obj, long j, byte b) {
            if (C5154r1.f13670j) {
                C5154r1.m15965a(obj, j, b);
            } else {
                C5154r1.m15976b(obj, j, b);
            }
        }

        /* renamed from: b */
        public byte mo26162b(Object obj, long j) {
            if (C5154r1.f13670j) {
                return C5154r1.m15978c(obj, j);
            }
            return C5154r1.m15980d(obj, j);
        }

        /* renamed from: b */
        public boolean mo26163b() {
            return false;
        }

        /* renamed from: c */
        public double mo26164c(Object obj, long j) {
            return Double.longBitsToDouble(this.f13671a.getLong(obj, j));
        }

        /* renamed from: d */
        public float mo26165d(Object obj, long j) {
            return Float.intBitsToFloat(this.f13671a.getInt(obj, j));
        }

        /* renamed from: a */
        public boolean mo26161a(Object obj, long j) {
            if (C5154r1.f13670j) {
                return C5154r1.m15974a(obj, j);
            }
            return C5154r1.m15977b(obj, j);
        }

        /* renamed from: a */
        public void mo26160a(Object obj, long j, boolean z) {
            if (C5154r1.f13670j) {
                C5154r1.m15965a(obj, j, z ? (byte) 1 : 0);
            } else {
                C5154r1.m15976b(obj, j, z ? (byte) 1 : 0);
            }
        }

        /* renamed from: a */
        public void mo26159a(Object obj, long j, float f) {
            this.f13671a.putInt(obj, j, Float.floatToIntBits(f));
        }

        /* renamed from: a */
        public void mo26158a(Object obj, long j, double d) {
            this.f13671a.putLong(obj, j, Double.doubleToLongBits(d));
        }

        /* renamed from: a */
        public byte mo26155a(long j) {
            throw new UnsupportedOperationException();
        }

        /* renamed from: a */
        public void mo26156a(long j, byte[] bArr, long j2, long j3) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: a */
    public static void m15968a(Object obj, long j, int i) {
        f13665e.f13671a.putInt(obj, j, i);
    }

    /* renamed from: b */
    public static void m15976b(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int i = (((int) j) & 3) << 3;
        m15968a(obj, j2, ((255 & b) << i) | (m15981e(obj, j2) & (~(255 << i))));
    }

    /* renamed from: a */
    public static void m15969a(Object obj, long j, long j2) {
        f13665e.f13671a.putLong(obj, j, j2);
    }

    /* renamed from: a */
    public static void m15971a(Object obj, long j, boolean z) {
        f13665e.mo26160a(obj, j, z);
    }

    /* renamed from: b */
    public static boolean m15977b(Object obj, long j) {
        return m15980d(obj, j) != 0;
    }

    /* renamed from: a */
    public static void m15967a(Object obj, long j, float f) {
        f13665e.mo26159a(obj, j, f);
    }

    /* renamed from: a */
    public static void m15966a(Object obj, long j, double d) {
        f13665e.mo26158a(obj, j, d);
    }

    /* renamed from: a */
    public static void m15970a(Object obj, long j, Object obj2) {
        f13665e.f13671a.putObject(obj, j, obj2);
    }

    /* renamed from: a */
    public static byte m15961a(byte[] bArr, long j) {
        return f13665e.mo26162b(bArr, f13668h + j);
    }

    /* renamed from: a */
    public static void m15973a(byte[] bArr, long j, byte b) {
        f13665e.mo26157a((Object) bArr, f13668h + j, b);
    }

    /* renamed from: a */
    public static long m15963a(ByteBuffer byteBuffer) {
        C5158d dVar = f13665e;
        return dVar.f13671a.getLong(byteBuffer, f13669i);
    }

    /* renamed from: c */
    public static byte m15978c(Object obj, long j) {
        return (byte) ((m15981e(obj, -4 & j) >>> ((int) (((~j) & 3) << 3))) & 255);
    }

    /* renamed from: a */
    public static Field m15964a() {
        Field field;
        Field field2;
        if (C5072d.m15287a()) {
            try {
                field2 = Buffer.class.getDeclaredField("effectiveDirectAddress");
            } catch (Throwable unused) {
                field2 = null;
            }
            if (field2 != null) {
                return field2;
            }
        }
        try {
            field = Buffer.class.getDeclaredField(IntegrityManager.INTEGRITY_TYPE_ADDRESS);
        } catch (Throwable unused2) {
            field = null;
        }
        if (field == null || field.getType() != Long.TYPE) {
            return null;
        }
        return field;
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.r1$c */
    public static final class C5157c extends C5158d {
        public C5157c(Unsafe unsafe) {
            super(unsafe);
        }

        /* renamed from: a */
        public boolean mo26166a() {
            if (!super.mo26166a()) {
                return false;
            }
            try {
                Class<?> cls = this.f13671a.getClass();
                Class cls2 = Long.TYPE;
                cls.getMethod("getByte", new Class[]{Object.class, cls2});
                cls.getMethod("putByte", new Class[]{Object.class, cls2, Byte.TYPE});
                cls.getMethod("getBoolean", new Class[]{Object.class, cls2});
                cls.getMethod("putBoolean", new Class[]{Object.class, cls2, Boolean.TYPE});
                cls.getMethod("getFloat", new Class[]{Object.class, cls2});
                cls.getMethod("putFloat", new Class[]{Object.class, cls2, Float.TYPE});
                cls.getMethod("getDouble", new Class[]{Object.class, cls2});
                cls.getMethod("putDouble", new Class[]{Object.class, cls2, Double.TYPE});
                return true;
            } catch (Throwable th) {
                C5154r1.m15972a(th);
                return false;
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:10:0x0039 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x003a A[SYNTHETIC, Splitter:B:11:0x003a] */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean mo26163b() {
            /*
                r10 = this;
                java.lang.String r0 = "copyMemory"
                sun.misc.Unsafe r1 = r10.f13671a
                java.lang.String r2 = "getLong"
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 != 0) goto L_0x000c
                goto L_0x002e
            L_0x000c:
                java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x0032 }
                java.lang.String r6 = "objectFieldOffset"
                java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ all -> 0x0032 }
                java.lang.Class<java.lang.reflect.Field> r8 = java.lang.reflect.Field.class
                r7[r5] = r8     // Catch:{ all -> 0x0032 }
                r1.getMethod(r6, r7)     // Catch:{ all -> 0x0032 }
                java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ all -> 0x0032 }
                java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
                r6[r5] = r7     // Catch:{ all -> 0x0032 }
                java.lang.Class r7 = java.lang.Long.TYPE     // Catch:{ all -> 0x0032 }
                r6[r4] = r7     // Catch:{ all -> 0x0032 }
                r1.getMethod(r2, r6)     // Catch:{ all -> 0x0032 }
                java.lang.reflect.Field r1 = com.fyber.inneractive.sdk.protobuf.C5154r1.m15964a()     // Catch:{ all -> 0x0032 }
                if (r1 != 0) goto L_0x0030
            L_0x002e:
                r1 = r5
                goto L_0x0037
            L_0x0030:
                r1 = r4
                goto L_0x0037
            L_0x0032:
                r1 = move-exception
                com.fyber.inneractive.sdk.protobuf.C5154r1.m15972a((java.lang.Throwable) r1)
                goto L_0x002e
            L_0x0037:
                if (r1 != 0) goto L_0x003a
                return r5
            L_0x003a:
                sun.misc.Unsafe r1 = r10.f13671a     // Catch:{ all -> 0x00a2 }
                java.lang.Class r1 = r1.getClass()     // Catch:{ all -> 0x00a2 }
                java.lang.String r6 = "getByte"
                java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ all -> 0x00a2 }
                java.lang.Class r8 = java.lang.Long.TYPE     // Catch:{ all -> 0x00a2 }
                r7[r5] = r8     // Catch:{ all -> 0x00a2 }
                r1.getMethod(r6, r7)     // Catch:{ all -> 0x00a2 }
                java.lang.String r6 = "putByte"
                java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch:{ all -> 0x00a2 }
                r7[r5] = r8     // Catch:{ all -> 0x00a2 }
                java.lang.Class r9 = java.lang.Byte.TYPE     // Catch:{ all -> 0x00a2 }
                r7[r4] = r9     // Catch:{ all -> 0x00a2 }
                r1.getMethod(r6, r7)     // Catch:{ all -> 0x00a2 }
                java.lang.String r6 = "getInt"
                java.lang.Class[] r7 = new java.lang.Class[r4]     // Catch:{ all -> 0x00a2 }
                r7[r5] = r8     // Catch:{ all -> 0x00a2 }
                r1.getMethod(r6, r7)     // Catch:{ all -> 0x00a2 }
                java.lang.String r6 = "putInt"
                java.lang.Class[] r7 = new java.lang.Class[r3]     // Catch:{ all -> 0x00a2 }
                r7[r5] = r8     // Catch:{ all -> 0x00a2 }
                java.lang.Class r9 = java.lang.Integer.TYPE     // Catch:{ all -> 0x00a2 }
                r7[r4] = r9     // Catch:{ all -> 0x00a2 }
                r1.getMethod(r6, r7)     // Catch:{ all -> 0x00a2 }
                java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch:{ all -> 0x00a2 }
                r6[r5] = r8     // Catch:{ all -> 0x00a2 }
                r1.getMethod(r2, r6)     // Catch:{ all -> 0x00a2 }
                java.lang.String r2 = "putLong"
                java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ all -> 0x00a2 }
                r6[r5] = r8     // Catch:{ all -> 0x00a2 }
                r6[r4] = r8     // Catch:{ all -> 0x00a2 }
                r1.getMethod(r2, r6)     // Catch:{ all -> 0x00a2 }
                r2 = 3
                java.lang.Class[] r6 = new java.lang.Class[r2]     // Catch:{ all -> 0x00a2 }
                r6[r5] = r8     // Catch:{ all -> 0x00a2 }
                r6[r4] = r8     // Catch:{ all -> 0x00a2 }
                r6[r3] = r8     // Catch:{ all -> 0x00a2 }
                r1.getMethod(r0, r6)     // Catch:{ all -> 0x00a2 }
                r6 = 5
                java.lang.Class[] r6 = new java.lang.Class[r6]     // Catch:{ all -> 0x00a2 }
                java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
                r6[r5] = r7     // Catch:{ all -> 0x00a2 }
                r6[r4] = r8     // Catch:{ all -> 0x00a2 }
                java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
                r6[r3] = r7     // Catch:{ all -> 0x00a2 }
                r6[r2] = r8     // Catch:{ all -> 0x00a2 }
                r2 = 4
                r6[r2] = r8     // Catch:{ all -> 0x00a2 }
                r1.getMethod(r0, r6)     // Catch:{ all -> 0x00a2 }
                return r4
            L_0x00a2:
                r0 = move-exception
                com.fyber.inneractive.sdk.protobuf.C5154r1.m15972a((java.lang.Throwable) r0)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.C5154r1.C5157c.mo26163b():boolean");
        }

        /* renamed from: c */
        public double mo26164c(Object obj, long j) {
            return this.f13671a.getDouble(obj, j);
        }

        /* renamed from: d */
        public float mo26165d(Object obj, long j) {
            return this.f13671a.getFloat(obj, j);
        }

        /* renamed from: a */
        public void mo26157a(Object obj, long j, byte b) {
            this.f13671a.putByte(obj, j, b);
        }

        /* renamed from: a */
        public boolean mo26161a(Object obj, long j) {
            return this.f13671a.getBoolean(obj, j);
        }

        /* renamed from: a */
        public void mo26160a(Object obj, long j, boolean z) {
            this.f13671a.putBoolean(obj, j, z);
        }

        /* renamed from: a */
        public void mo26159a(Object obj, long j, float f) {
            this.f13671a.putFloat(obj, j, f);
        }

        /* renamed from: a */
        public void mo26158a(Object obj, long j, double d) {
            this.f13671a.putDouble(obj, j, d);
        }

        /* renamed from: a */
        public byte mo26155a(long j) {
            return this.f13671a.getByte(j);
        }

        /* renamed from: b */
        public byte mo26162b(Object obj, long j) {
            return this.f13671a.getByte(obj, j);
        }

        /* renamed from: a */
        public void mo26156a(long j, byte[] bArr, long j2, long j3) {
            this.f13671a.copyMemory((Object) null, j, bArr, C5154r1.f13668h + j2, j3);
        }
    }

    /* renamed from: a */
    public static void m15965a(Object obj, long j, byte b) {
        long j2 = -4 & j;
        int e = m15981e(obj, j2);
        int i = ((~((int) j)) & 3) << 3;
        m15968a(obj, j2, ((255 & b) << i) | (e & (~(255 << i))));
    }

    /* renamed from: a */
    public static boolean m15974a(Object obj, long j) {
        return m15978c(obj, j) != 0;
    }

    /* renamed from: a */
    public static void m15972a(Throwable th) {
        Logger logger = Logger.getLogger(C5154r1.class.getName());
        Level level = Level.WARNING;
        logger.log(level, "platform method missing - proto runtime falling back to safer methods: " + th);
    }
}
