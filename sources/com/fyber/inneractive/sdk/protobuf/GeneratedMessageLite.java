package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C5058a;
import com.fyber.inneractive.sdk.protobuf.C5075e;
import com.fyber.inneractive.sdk.protobuf.C5147q;
import com.fyber.inneractive.sdk.protobuf.C5149q0;
import com.fyber.inneractive.sdk.protobuf.C5169t1;
import com.fyber.inneractive.sdk.protobuf.C5181u;
import com.fyber.inneractive.sdk.protobuf.C5194z;
import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite;
import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite.C5050a;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import sun.misc.Unsafe;

public abstract class GeneratedMessageLite<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends C5050a<MessageType, BuilderType>> extends C5058a<MessageType, BuilderType> {
    private static Map<Object, GeneratedMessageLite<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    public int memoizedSerializedSize = -1;
    public C5138n1 unknownFields = C5138n1.f13646f;

    /* renamed from: com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$b */
    public static class C5051b<T extends GeneratedMessageLite<T, ?>> extends C5064b<T> {

        /* renamed from: a */
        public final T f13489a;

        public C5051b(T t) {
            this.f13489a = t;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c */
    public static final class C5052c implements C5181u.C5182a<C5052c> {

        /* renamed from: a */
        public final C5194z.C5198d<?> f13490a;

        /* renamed from: b */
        public final int f13491b;

        /* renamed from: c */
        public final C5169t1.C5171b f13492c;

        /* renamed from: d */
        public final boolean f13493d;

        /* renamed from: e */
        public final boolean f13494e;

        public C5052c(C5194z.C5198d<?> dVar, int i, C5169t1.C5171b bVar, boolean z, boolean z2) {
            this.f13490a = dVar;
            this.f13491b = i;
            this.f13492c = bVar;
            this.f13493d = z;
            this.f13494e = z2;
        }

        /* renamed from: a */
        public int mo25739a() {
            return this.f13491b;
        }

        /* renamed from: b */
        public boolean mo25741b() {
            return this.f13493d;
        }

        /* renamed from: c */
        public C5169t1.C5171b mo25742c() {
            return this.f13492c;
        }

        public int compareTo(Object obj) {
            return this.f13491b - ((C5052c) obj).f13491b;
        }

        /* renamed from: d */
        public C5169t1.C5176c mo25744d() {
            return this.f13492c.f13717a;
        }

        /* renamed from: e */
        public boolean mo25745e() {
            return this.f13494e;
        }

        /* renamed from: a */
        public C5149q0.C5150a mo25740a(C5149q0.C5150a aVar, C5149q0 q0Var) {
            return ((C5050a) aVar).mo25732a((GeneratedMessageLite) q0Var);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$d */
    public static class C5053d<ContainingType extends C5149q0, Type> extends C5139o<ContainingType, Type> {

        /* renamed from: a */
        public final ContainingType f13495a;

        /* renamed from: b */
        public final Type f13496b;

        /* renamed from: c */
        public final C5149q0 f13497c;

        /* renamed from: d */
        public final C5052c f13498d;

        public C5053d(C5149q0 q0Var, Object obj, C5149q0 q0Var2, C5052c cVar) {
            if (q0Var == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            } else if (cVar.mo25742c() == C5169t1.C5171b.MESSAGE && q0Var2 == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            } else {
                this.f13495a = q0Var;
                this.f13496b = obj;
                this.f13497c = q0Var2;
                this.f13498d = cVar;
            }
        }

        /* renamed from: a */
        public Object mo25746a(Object obj) {
            C5052c cVar = this.f13498d;
            return cVar.f13492c.f13717a == C5169t1.C5176c.ENUM ? cVar.f13490a.mo26241a(((Integer) obj).intValue()) : obj;
        }

        /* renamed from: b */
        public Object mo25747b(Object obj) {
            return this.f13498d.f13492c.f13717a == C5169t1.C5176c.ENUM ? Integer.valueOf(((C5194z.C5197c) obj).mo24014a()) : obj;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$e */
    public enum C5054e {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* access modifiers changed from: private */
    public static <MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType, T> C5053d<MessageType, T> checkIsLite(C5139o<MessageType, T> oVar) {
        oVar.getClass();
        return (C5053d) oVar;
    }

    private static <T extends GeneratedMessageLite<T, ?>> T checkMessageInitialized(T t) throws C5061a0 {
        if (t == null || t.isInitialized()) {
            return t;
        }
        C5132l1 newUninitializedMessageException = t.newUninitializedMessageException();
        newUninitializedMessageException.getClass();
        throw new C5061a0(newUninitializedMessageException.getMessage());
    }

    public static C5194z.C5195a emptyBooleanList() {
        return C5084g.f13552d;
    }

    public static C5194z.C5196b emptyDoubleList() {
        return C5136n.f13641d;
    }

    public static C5194z.C5200f emptyFloatList() {
        return C5188w.f13753d;
    }

    public static C5194z.C5201g emptyIntList() {
        return C5192y.f13759d;
    }

    public static C5194z.C5204i emptyLongList() {
        return C5091h0.f13558d;
    }

    public static <E> C5194z.C5205j<E> emptyProtobufList() {
        return C5071c1.f13530d;
    }

    private final void ensureUnknownFieldsInitialized() {
        if (this.unknownFields == C5138n1.f13646f) {
            this.unknownFields = C5138n1.m15916c();
        }
    }

    public static <T extends GeneratedMessageLite<?, ?>> T getDefaultInstance(Class<T> cls) {
        T t = (GeneratedMessageLite) defaultInstanceMap.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (GeneratedMessageLite) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            Unsafe unsafe = C5154r1.f13661a;
            try {
                t = ((GeneratedMessageLite) C5154r1.f13661a.allocateInstance(cls)).getDefaultInstanceForType();
                if (t != null) {
                    defaultInstanceMap.put(cls, t);
                } else {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw new IllegalStateException(th);
            }
        }
        return t;
    }

    public static Method getMethodOrDie(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException("Generated message class \"" + cls.getName() + "\" missing method \"" + str + "\".", e);
        }
    }

    public static Object invokeOrDie(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    public static C5194z.C5201g mutableCopy(C5194z.C5201g gVar) {
        C5192y yVar = (C5192y) gVar;
        int i = yVar.f13761c;
        return yVar.mo25786b(i == 0 ? 10 : i * 2);
    }

    public static Object newMessageInfo(C5149q0 q0Var, String str, Object[] objArr) {
        return new C5074d1(q0Var, str, objArr);
    }

    public static <ContainingType extends C5149q0, Type> C5053d<ContainingType, Type> newRepeatedGeneratedExtension(ContainingType containingtype, C5149q0 q0Var, C5194z.C5198d<?> dVar, int i, C5169t1.C5171b bVar, boolean z, Class cls) {
        return new C5053d<>(containingtype, Collections.emptyList(), q0Var, new C5052c(dVar, i, bVar, true, z));
    }

    public static <ContainingType extends C5149q0, Type> C5053d<ContainingType, Type> newSingularGeneratedExtension(ContainingType containingtype, Type type, C5149q0 q0Var, C5194z.C5198d<?> dVar, int i, C5169t1.C5171b bVar, Class cls) {
        return new C5053d<>(containingtype, type, q0Var, new C5052c(dVar, i, bVar, false, false));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t, InputStream inputStream) throws C5061a0 {
        return checkMessageInitialized(parsePartialDelimitedFrom(t, inputStream, C5147q.m15950a()));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, ByteBuffer byteBuffer, C5147q qVar) throws C5061a0 {
        return checkMessageInitialized(parseFrom(t, C5114j.m15567a(byteBuffer, false), qVar));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002e, code lost:
        if (r2 >= 64) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0030, code lost:
        r3 = r6.read();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0034, code lost:
        if (r3 == -1) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0038, code lost:
        if ((r3 & 128) != 0) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x004e, code lost:
        r2 = r2 + 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0055, code lost:
        throw com.fyber.inneractive.sdk.protobuf.C5061a0.m15279i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x005a, code lost:
        throw com.fyber.inneractive.sdk.protobuf.C5061a0.m15275e();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <T extends com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite<T, ?>> T parsePartialDelimitedFrom(T r5, java.io.InputStream r6, com.fyber.inneractive.sdk.protobuf.C5147q r7) throws com.fyber.inneractive.sdk.protobuf.C5061a0 {
        /*
            int r0 = r6.read()     // Catch:{ IOException -> 0x005b }
            r1 = -1
            if (r0 != r1) goto L_0x0009
            r5 = 0
            return r5
        L_0x0009:
            r2 = r0 & 128(0x80, float:1.794E-43)
            if (r2 != 0) goto L_0x000e
            goto L_0x003a
        L_0x000e:
            r0 = r0 & 127(0x7f, float:1.78E-43)
            r2 = 7
        L_0x0011:
            r3 = 32
            if (r2 >= r3) goto L_0x002c
            int r3 = r6.read()     // Catch:{ IOException -> 0x005b }
            if (r3 == r1) goto L_0x0027
            r4 = r3 & 127(0x7f, float:1.78E-43)
            int r4 = r4 << r2
            r0 = r0 | r4
            r3 = r3 & 128(0x80, float:1.794E-43)
            if (r3 != 0) goto L_0x0024
            goto L_0x003a
        L_0x0024:
            int r2 = r2 + 7
            goto L_0x0011
        L_0x0027:
            com.fyber.inneractive.sdk.protobuf.a0 r5 = com.fyber.inneractive.sdk.protobuf.C5061a0.m15279i()     // Catch:{ IOException -> 0x005b }
            throw r5     // Catch:{ IOException -> 0x005b }
        L_0x002c:
            r3 = 64
            if (r2 >= r3) goto L_0x0056
            int r3 = r6.read()     // Catch:{ IOException -> 0x005b }
            if (r3 == r1) goto L_0x0051
            r3 = r3 & 128(0x80, float:1.794E-43)
            if (r3 != 0) goto L_0x004e
        L_0x003a:
            com.fyber.inneractive.sdk.protobuf.a$a$a r1 = new com.fyber.inneractive.sdk.protobuf.a$a$a
            r1.<init>(r6, r0)
            com.fyber.inneractive.sdk.protobuf.j r6 = com.fyber.inneractive.sdk.protobuf.C5114j.m15566a((java.io.InputStream) r1)
            com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite r5 = parsePartialFrom(r5, (com.fyber.inneractive.sdk.protobuf.C5114j) r6, (com.fyber.inneractive.sdk.protobuf.C5147q) r7)
            r7 = 0
            r6.mo25971a((int) r7)     // Catch:{ a0 -> 0x004c }
            return r5
        L_0x004c:
            r5 = move-exception
            throw r5
        L_0x004e:
            int r2 = r2 + 7
            goto L_0x002c
        L_0x0051:
            com.fyber.inneractive.sdk.protobuf.a0 r5 = com.fyber.inneractive.sdk.protobuf.C5061a0.m15279i()     // Catch:{ IOException -> 0x005b }
            throw r5     // Catch:{ IOException -> 0x005b }
        L_0x0056:
            com.fyber.inneractive.sdk.protobuf.a0 r5 = com.fyber.inneractive.sdk.protobuf.C5061a0.m15275e()     // Catch:{ IOException -> 0x005b }
            throw r5     // Catch:{ IOException -> 0x005b }
        L_0x005b:
            r5 = move-exception
            com.fyber.inneractive.sdk.protobuf.a0 r6 = new com.fyber.inneractive.sdk.protobuf.a0
            java.lang.String r5 = r5.getMessage()
            r6.<init>(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite.parsePartialDelimitedFrom(com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite, java.io.InputStream, com.fyber.inneractive.sdk.protobuf.q):com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite");
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, C5114j jVar, C5147q qVar) throws C5061a0 {
        T t2 = (GeneratedMessageLite) t.dynamicMethod(C5054e.NEW_MUTABLE_INSTANCE);
        try {
            C5066b1 b1Var = C5066b1.f13524c;
            b1Var.getClass();
            C5083f1<?> a = b1Var.mo25762a(t2.getClass());
            C5122k kVar = jVar.f13597d;
            if (kVar == null) {
                kVar = new C5122k(jVar);
            }
            a.mo25869a(t2, kVar, qVar);
            a.mo25876c(t2);
            return t2;
        } catch (IOException e) {
            if (e.getCause() instanceof C5061a0) {
                throw ((C5061a0) e.getCause());
            }
            throw new C5061a0(e.getMessage());
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof C5061a0) {
                throw ((C5061a0) e2.getCause());
            }
            throw e2;
        }
    }

    public static <T extends GeneratedMessageLite<?, ?>> void registerDefaultInstance(Class<T> cls, T t) {
        defaultInstanceMap.put(cls, t);
    }

    public Object buildMessageInfo() throws Exception {
        return dynamicMethod(C5054e.BUILD_MESSAGE_INFO);
    }

    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends C5050a<MessageType, BuilderType>> BuilderType createBuilder() {
        return (C5050a) dynamicMethod(C5054e.NEW_BUILDER);
    }

    public Object dynamicMethod(C5054e eVar, Object obj) {
        return dynamicMethod(eVar, obj, (Object) null);
    }

    public abstract Object dynamicMethod(C5054e eVar, Object obj, Object obj2);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5066b1 b1Var = C5066b1.f13524c;
        b1Var.getClass();
        return b1Var.mo25762a(getClass()).mo25875b(this, (GeneratedMessageLite) obj);
    }

    public int getMemoizedSerializedSize() {
        return this.memoizedSerializedSize;
    }

    public final C5193y0<MessageType> getParserForType() {
        return (C5193y0) dynamicMethod(C5054e.GET_PARSER);
    }

    public int getSerializedSize() {
        if (this.memoizedSerializedSize == -1) {
            C5066b1 b1Var = C5066b1.f13524c;
            b1Var.getClass();
            this.memoizedSerializedSize = b1Var.mo25762a(getClass()).mo25874b(this);
        }
        return this.memoizedSerializedSize;
    }

    public int hashCode() {
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        C5066b1 b1Var = C5066b1.f13524c;
        b1Var.getClass();
        int d = b1Var.mo25762a(getClass()).mo25877d(this);
        this.memoizedHashCode = d;
        return d;
    }

    public final boolean isInitialized() {
        return isInitialized(this, true);
    }

    public void makeImmutable() {
        C5066b1 b1Var = C5066b1.f13524c;
        b1Var.getClass();
        b1Var.mo25762a(getClass()).mo25876c(this);
    }

    public void mergeLengthDelimitedField(int i, C5093i iVar) {
        ensureUnknownFieldsInitialized();
        C5138n1 n1Var = this.unknownFields;
        n1Var.mo26119a();
        if (i != 0) {
            n1Var.mo26120a(C5169t1.m16117a(i, 2), (Object) iVar);
            return;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    public final void mergeUnknownFields(C5138n1 n1Var) {
        this.unknownFields = C5138n1.m15914a(this.unknownFields, n1Var);
    }

    public void mergeVarintField(int i, int i2) {
        ensureUnknownFieldsInitialized();
        C5138n1 n1Var = this.unknownFields;
        n1Var.mo26119a();
        if (i != 0) {
            n1Var.mo26120a(C5169t1.m16117a(i, 0), (Object) Long.valueOf((long) i2));
            return;
        }
        throw new IllegalArgumentException("Zero is not a valid field number.");
    }

    public boolean parseUnknownField(int i, C5114j jVar) throws IOException {
        int i2 = C5169t1.f13694a;
        if ((i & 7) == 4) {
            return false;
        }
        ensureUnknownFieldsInitialized();
        return this.unknownFields.mo26122a(i, jVar);
    }

    public void setMemoizedSerializedSize(int i) {
        this.memoizedSerializedSize = i;
    }

    public String toString() {
        String obj = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        C5160s0.m16041a(this, sb, 0);
        return sb.toString();
    }

    public void writeTo(C5125l lVar) throws IOException {
        C5066b1 b1Var = C5066b1.f13524c;
        b1Var.getClass();
        C5083f1<?> a = b1Var.mo25762a(getClass());
        C5133m mVar = lVar.f13631a;
        if (mVar == null) {
            mVar = new C5133m(lVar);
        }
        a.mo25870a(this, (C5184u1) mVar);
    }

    public static final <T extends GeneratedMessageLite<T, ?>> boolean isInitialized(T t, boolean z) {
        byte byteValue = ((Byte) t.dynamicMethod(C5054e.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        C5066b1 b1Var = C5066b1.f13524c;
        b1Var.getClass();
        boolean a = b1Var.mo25762a(t.getClass()).mo25873a(t);
        if (z) {
            t.dynamicMethod(C5054e.SET_MEMOIZED_IS_INITIALIZED, a ? t : null);
        }
        return a;
    }

    public final <MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends C5050a<MessageType, BuilderType>> BuilderType createBuilder(MessageType messagetype) {
        BuilderType createBuilder = createBuilder();
        createBuilder.mo25737c();
        createBuilder.mo25735a(createBuilder.f13487b, messagetype);
        return createBuilder;
    }

    public Object dynamicMethod(C5054e eVar) {
        return dynamicMethod(eVar, (Object) null, (Object) null);
    }

    public final MessageType getDefaultInstanceForType() {
        return (GeneratedMessageLite) dynamicMethod(C5054e.GET_DEFAULT_INSTANCE);
    }

    public final BuilderType newBuilderForType() {
        return (C5050a) dynamicMethod(C5054e.NEW_BUILDER);
    }

    public final BuilderType toBuilder() {
        BuilderType buildertype = (C5050a) dynamicMethod(C5054e.NEW_BUILDER);
        buildertype.mo25737c();
        buildertype.mo25735a(buildertype.f13487b, this);
        return buildertype;
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$a */
    public static abstract class C5050a<MessageType extends GeneratedMessageLite<MessageType, BuilderType>, BuilderType extends C5050a<MessageType, BuilderType>> extends C5058a.C5059a<MessageType, BuilderType> {

        /* renamed from: a */
        public final MessageType f13486a;

        /* renamed from: b */
        public MessageType f13487b;

        /* renamed from: c */
        public boolean f13488c = false;

        public C5050a(MessageType messagetype) {
            this.f13486a = messagetype;
            this.f13487b = (GeneratedMessageLite) messagetype.dynamicMethod(C5054e.NEW_MUTABLE_INSTANCE);
        }

        /* renamed from: a */
        public final void mo25735a(MessageType messagetype, MessageType messagetype2) {
            C5066b1 b1Var = C5066b1.f13524c;
            b1Var.getClass();
            b1Var.mo25762a(messagetype.getClass()).mo25871a(messagetype, messagetype2);
        }

        /* renamed from: b */
        public MessageType mo25736b() {
            if (this.f13488c) {
                return this.f13487b;
            }
            this.f13487b.makeImmutable();
            this.f13488c = true;
            return this.f13487b;
        }

        /* renamed from: c */
        public final void mo25737c() {
            if (this.f13488c) {
                MessageType messagetype = (GeneratedMessageLite) this.f13487b.dynamicMethod(C5054e.NEW_MUTABLE_INSTANCE);
                MessageType messagetype2 = this.f13487b;
                C5066b1 b1Var = C5066b1.f13524c;
                b1Var.getClass();
                b1Var.mo25762a(messagetype.getClass()).mo25871a(messagetype, messagetype2);
                this.f13487b = messagetype;
                this.f13488c = false;
            }
        }

        public Object clone() throws CloneNotSupportedException {
            C5050a newBuilderForType = this.f13486a.newBuilderForType();
            newBuilderForType.mo25732a(mo25736b());
            return newBuilderForType;
        }

        public C5149q0 getDefaultInstanceForType() {
            return this.f13486a;
        }

        /* renamed from: a */
        public final MessageType mo25734a() {
            MessageType b = mo25736b();
            if (b.isInitialized()) {
                return b;
            }
            throw new C5132l1();
        }

        /* renamed from: a */
        public BuilderType mo25732a(MessageType messagetype) {
            mo25737c();
            mo25735a(this.f13487b, messagetype);
            return this;
        }

        /* renamed from: a */
        public BuilderType mo25733a(C5114j jVar, C5147q qVar) throws IOException {
            mo25737c();
            try {
                C5066b1 b1Var = C5066b1.f13524c;
                MessageType messagetype = this.f13487b;
                b1Var.getClass();
                C5083f1<?> a = b1Var.mo25762a(messagetype.getClass());
                MessageType messagetype2 = this.f13487b;
                C5122k kVar = jVar.f13597d;
                if (kVar == null) {
                    kVar = new C5122k(jVar);
                }
                a.mo25869a(messagetype2, kVar, qVar);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }
    }

    public static C5194z.C5204i mutableCopy(C5194z.C5204i iVar) {
        C5091h0 h0Var = (C5091h0) iVar;
        int i = h0Var.f13560c;
        return h0Var.mo25786b(i == 0 ? 10 : i * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseDelimitedFrom(T t, InputStream inputStream, C5147q qVar) throws C5061a0 {
        return checkMessageInitialized(parsePartialDelimitedFrom(t, inputStream, qVar));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, ByteBuffer byteBuffer) throws C5061a0 {
        return parseFrom(t, byteBuffer, C5147q.m15950a());
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, C5093i iVar) throws C5061a0 {
        return checkMessageInitialized(parseFrom(t, iVar, C5147q.m15950a()));
    }

    public static C5194z.C5200f mutableCopy(C5194z.C5200f fVar) {
        C5188w wVar = (C5188w) fVar;
        int i = wVar.f13755c;
        return wVar.mo25786b(i == 0 ? 10 : i * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, C5093i iVar, C5147q qVar) throws C5061a0 {
        return checkMessageInitialized(parsePartialFrom(t, iVar, qVar));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, byte[] bArr) throws C5061a0 {
        return checkMessageInitialized(parsePartialFrom(t, bArr, 0, bArr.length, C5147q.m15950a()));
    }

    public static C5194z.C5196b mutableCopy(C5194z.C5196b bVar) {
        C5136n nVar = (C5136n) bVar;
        int i = nVar.f13643c;
        return nVar.mo25786b(i == 0 ? 10 : i * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, byte[] bArr, C5147q qVar) throws C5061a0 {
        return checkMessageInitialized(parsePartialFrom(t, bArr, 0, bArr.length, qVar));
    }

    public static C5194z.C5195a mutableCopy(C5194z.C5195a aVar) {
        C5084g gVar = (C5084g) aVar;
        int i = gVar.f13554c;
        return gVar.mo25786b(i == 0 ? 10 : i * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, InputStream inputStream) throws C5061a0 {
        return checkMessageInitialized(parsePartialFrom(t, C5114j.m15566a(inputStream), C5147q.m15950a()));
    }

    public static <E> C5194z.C5205j<E> mutableCopy(C5194z.C5205j<E> jVar) {
        int size = jVar.size();
        return jVar.mo25786b(size == 0 ? 10 : size * 2);
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, InputStream inputStream, C5147q qVar) throws C5061a0 {
        return checkMessageInitialized(parsePartialFrom(t, C5114j.m15566a(inputStream), qVar));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, C5114j jVar) throws C5061a0 {
        return parseFrom(t, jVar, C5147q.m15950a());
    }

    public static abstract class ExtendableMessage<MessageType extends ExtendableMessage<MessageType, BuilderType>, BuilderType> extends GeneratedMessageLite<MessageType, BuilderType> implements C5153r0 {
        public C5181u<C5052c> extensions = C5181u.m16132b();

        /* renamed from: com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$ExtendableMessage$a */
        public class C5049a {
            public C5049a(ExtendableMessage extendableMessage, boolean z) {
                Iterator<Map.Entry<C5052c, Object>> f = extendableMessage.extensions.mo26213f();
                if (f.hasNext()) {
                    Map.Entry next = f.next();
                }
            }
        }

        private void eagerlyMergeMessageSetExtension(C5114j jVar, C5053d<?, ?> dVar, C5147q qVar, int i) throws IOException {
            parseExtension(jVar, qVar, dVar, C5169t1.m16117a(i, 2), i);
        }

        private void mergeMessageSetExtensionFromBytes(C5093i iVar, C5147q qVar, C5053d<?, ?> dVar) throws IOException {
            C5149q0 q0Var = (C5149q0) this.extensions.mo26202a(dVar.f13498d);
            C5149q0.C5150a builder = q0Var != null ? q0Var.toBuilder() : null;
            if (builder == null) {
                builder = dVar.f13497c.newBuilderForType();
            }
            C5058a.C5059a aVar = (C5058a.C5059a) builder;
            aVar.getClass();
            try {
                C5114j g = iVar.mo25915g();
                ((C5050a) aVar).mo25733a(g, qVar);
                g.mo25971a(0);
                ensureExtensionsAreMutable().mo26206c(dVar.f13498d, dVar.mo25747b(((C5050a) builder).mo25734a()));
            } catch (C5061a0 e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException("Reading " + aVar.getClass().getName() + " from a " + "ByteString" + " threw an IOException (should never happen).", e2);
            }
        }

        private <MessageType extends C5149q0> void mergeMessageSetExtensionFromCodedStream(MessageType messagetype, C5114j jVar, C5147q qVar) throws IOException {
            int i = 0;
            C5093i iVar = null;
            C5053d dVar = null;
            while (true) {
                int t = jVar.mo25995t();
                if (t == 0) {
                    break;
                } else if (t == C5169t1.f13696c) {
                    i = jVar.mo25996u();
                    if (i != 0) {
                        dVar = qVar.f13658a.get(new C5147q.C5148a(messagetype, i));
                    }
                } else if (t == C5169t1.f13697d) {
                    if (i == 0 || dVar == null) {
                        iVar = jVar.mo25979e();
                    } else {
                        eagerlyMergeMessageSetExtension(jVar, dVar, qVar, i);
                        iVar = null;
                    }
                } else if (!jVar.mo25980e(t)) {
                    break;
                }
            }
            jVar.mo25971a(C5169t1.f13695b);
            if (iVar != null && i != 0) {
                if (dVar != null) {
                    mergeMessageSetExtensionFromBytes(iVar, qVar, dVar);
                } else {
                    mergeLengthDelimitedField(i, iVar);
                }
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0033  */
        /* JADX WARNING: Removed duplicated region for block: B:16:0x0038  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean parseExtension(com.fyber.inneractive.sdk.protobuf.C5114j r6, com.fyber.inneractive.sdk.protobuf.C5147q r7, com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite.C5053d<?, ?> r8, int r9, int r10) throws java.io.IOException {
            /*
                r5 = this;
                int r0 = com.fyber.inneractive.sdk.protobuf.C5169t1.f13694a
                r0 = r9 & 7
                r1 = 0
                r2 = 1
                if (r8 != 0) goto L_0x0009
                goto L_0x002f
            L_0x0009:
                com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r3 = r8.f13498d
                com.fyber.inneractive.sdk.protobuf.t1$b r3 = r3.f13492c
                int r3 = com.fyber.inneractive.sdk.protobuf.C5181u.m16129a((com.fyber.inneractive.sdk.protobuf.C5169t1.C5171b) r3, (boolean) r1)
                if (r0 != r3) goto L_0x0015
                r0 = r1
                goto L_0x0031
            L_0x0015:
                com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r3 = r8.f13498d
                boolean r4 = r3.f13493d
                if (r4 == 0) goto L_0x002f
                com.fyber.inneractive.sdk.protobuf.t1$b r3 = r3.f13492c
                boolean r3 = r3.mo26198f()
                if (r3 == 0) goto L_0x002f
                com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r3 = r8.f13498d
                com.fyber.inneractive.sdk.protobuf.t1$b r3 = r3.f13492c
                int r3 = com.fyber.inneractive.sdk.protobuf.C5181u.m16129a((com.fyber.inneractive.sdk.protobuf.C5169t1.C5171b) r3, (boolean) r2)
                if (r0 != r3) goto L_0x002f
                r0 = r2
                goto L_0x0031
            L_0x002f:
                r0 = r1
                r1 = r2
            L_0x0031:
                if (r1 == 0) goto L_0x0038
                boolean r6 = r5.parseUnknownField(r9, r6)
                return r6
            L_0x0038:
                r5.ensureExtensionsAreMutable()
                if (r0 == 0) goto L_0x008d
                int r7 = r6.mo25988m()
                int r7 = r6.mo25977d(r7)
                com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r9 = r8.f13498d
                com.fyber.inneractive.sdk.protobuf.t1$b r9 = r9.f13492c
                com.fyber.inneractive.sdk.protobuf.t1$b r10 = com.fyber.inneractive.sdk.protobuf.C5169t1.C5171b.ENUM
                if (r9 != r10) goto L_0x006e
            L_0x004d:
                int r9 = r6.mo25970a()
                if (r9 <= 0) goto L_0x0088
                int r9 = r6.mo25982g()
                com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r10 = r8.f13498d
                com.fyber.inneractive.sdk.protobuf.z$d<?> r10 = r10.f13490a
                com.fyber.inneractive.sdk.protobuf.z$c r9 = r10.mo26241a(r9)
                if (r9 != 0) goto L_0x0062
                return r2
            L_0x0062:
                com.fyber.inneractive.sdk.protobuf.u<com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c> r10 = r5.extensions
                com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r0 = r8.f13498d
                java.lang.Object r9 = r8.mo25747b(r9)
                r10.mo26203a(r0, (java.lang.Object) r9)
                goto L_0x004d
            L_0x006e:
                int r9 = r6.mo25970a()
                if (r9 <= 0) goto L_0x0088
                com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r9 = r8.f13498d
                com.fyber.inneractive.sdk.protobuf.t1$b r9 = r9.f13492c
                com.fyber.inneractive.sdk.protobuf.u r10 = com.fyber.inneractive.sdk.protobuf.C5181u.f13733d
                com.fyber.inneractive.sdk.protobuf.t1$d r10 = com.fyber.inneractive.sdk.protobuf.C5169t1.C5177d.LOOSE
                java.lang.Object r9 = com.fyber.inneractive.sdk.protobuf.C5169t1.m16118a(r6, r9, r10)
                com.fyber.inneractive.sdk.protobuf.u<com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c> r10 = r5.extensions
                com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r0 = r8.f13498d
                r10.mo26203a(r0, (java.lang.Object) r9)
                goto L_0x006e
            L_0x0088:
                r6.mo25975c(r7)
                goto L_0x010c
            L_0x008d:
                com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r9 = r8.f13498d
                com.fyber.inneractive.sdk.protobuf.t1$b r9 = r9.f13492c
                com.fyber.inneractive.sdk.protobuf.t1$c r9 = r9.f13717a
                int r9 = r9.ordinal()
                r0 = 7
                if (r9 == r0) goto L_0x00e0
                r10 = 8
                if (r9 == r10) goto L_0x00ab
                com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r7 = r8.f13498d
                com.fyber.inneractive.sdk.protobuf.t1$b r7 = r7.f13492c
                com.fyber.inneractive.sdk.protobuf.u r9 = com.fyber.inneractive.sdk.protobuf.C5181u.f13733d
                com.fyber.inneractive.sdk.protobuf.t1$d r9 = com.fyber.inneractive.sdk.protobuf.C5169t1.C5177d.LOOSE
                java.lang.Object r6 = com.fyber.inneractive.sdk.protobuf.C5169t1.m16118a(r6, r7, r9)
                goto L_0x00f3
            L_0x00ab:
                r9 = 0
                com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r10 = r8.f13498d
                boolean r0 = r10.f13493d
                if (r0 != 0) goto L_0x00c0
                com.fyber.inneractive.sdk.protobuf.u<com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c> r0 = r5.extensions
                java.lang.Object r10 = r0.mo26202a(r10)
                com.fyber.inneractive.sdk.protobuf.q0 r10 = (com.fyber.inneractive.sdk.protobuf.C5149q0) r10
                if (r10 == 0) goto L_0x00c0
                com.fyber.inneractive.sdk.protobuf.q0$a r9 = r10.toBuilder()
            L_0x00c0:
                if (r9 != 0) goto L_0x00c8
                com.fyber.inneractive.sdk.protobuf.q0 r9 = r8.f13497c
                com.fyber.inneractive.sdk.protobuf.q0$a r9 = r9.newBuilderForType()
            L_0x00c8:
                com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r10 = r8.f13498d
                com.fyber.inneractive.sdk.protobuf.t1$b r0 = r10.f13492c
                com.fyber.inneractive.sdk.protobuf.t1$b r1 = com.fyber.inneractive.sdk.protobuf.C5169t1.C5171b.GROUP
                if (r0 != r1) goto L_0x00d6
                int r10 = r10.f13491b
                r6.mo25972a(r10, r9, r7)
                goto L_0x00d9
            L_0x00d6:
                r6.mo25973a((com.fyber.inneractive.sdk.protobuf.C5149q0.C5150a) r9, (com.fyber.inneractive.sdk.protobuf.C5147q) r7)
            L_0x00d9:
                com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$a r9 = (com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite.C5050a) r9
                com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite r6 = r9.mo25734a()
                goto L_0x00f3
            L_0x00e0:
                int r6 = r6.mo25982g()
                com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r7 = r8.f13498d
                com.fyber.inneractive.sdk.protobuf.z$d<?> r7 = r7.f13490a
                com.fyber.inneractive.sdk.protobuf.z$c r7 = r7.mo26241a(r6)
                if (r7 != 0) goto L_0x00f2
                r5.mergeVarintField(r10, r6)
                return r2
            L_0x00f2:
                r6 = r7
            L_0x00f3:
                com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c r7 = r8.f13498d
                boolean r9 = r7.f13493d
                if (r9 == 0) goto L_0x0103
                com.fyber.inneractive.sdk.protobuf.u<com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c> r9 = r5.extensions
                java.lang.Object r6 = r8.mo25747b(r6)
                r9.mo26203a(r7, (java.lang.Object) r6)
                goto L_0x010c
            L_0x0103:
                com.fyber.inneractive.sdk.protobuf.u<com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$c> r9 = r5.extensions
                java.lang.Object r6 = r8.mo25747b(r6)
                r9.mo26206c(r7, r6)
            L_0x010c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite.ExtendableMessage.parseExtension(com.fyber.inneractive.sdk.protobuf.j, com.fyber.inneractive.sdk.protobuf.q, com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite$d, int, int):boolean");
        }

        private void verifyExtensionContainingType(C5053d<MessageType, ?> dVar) {
            if (dVar.f13495a != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        public C5181u<C5052c> ensureExtensionsAreMutable() {
            C5181u<C5052c> uVar = this.extensions;
            if (uVar.f13735b) {
                this.extensions = uVar.clone();
            }
            return this.extensions;
        }

        public boolean extensionsAreInitialized() {
            return this.extensions.mo26211e();
        }

        public int extensionsSerializedSize() {
            return this.extensions.mo26209d();
        }

        public int extensionsSerializedSizeAsMessageSet() {
            return this.extensions.mo26205c();
        }

        public /* bridge */ /* synthetic */ C5149q0 getDefaultInstanceForType() {
            return GeneratedMessageLite.super.getDefaultInstanceForType();
        }

        public final <Type> Type getExtension(C5139o<MessageType, Type> oVar) {
            C5053d access$000 = GeneratedMessageLite.checkIsLite(oVar);
            verifyExtensionContainingType(access$000);
            Type a = this.extensions.mo26202a(access$000.f13498d);
            if (a == null) {
                return access$000.f13496b;
            }
            C5052c cVar = access$000.f13498d;
            if (!cVar.f13493d) {
                return access$000.mo25746a(a);
            }
            if (cVar.f13492c.f13717a != C5169t1.C5176c.ENUM) {
                return a;
            }
            Type arrayList = new ArrayList();
            for (Object a2 : (List) a) {
                arrayList.add(access$000.mo25746a(a2));
            }
            return arrayList;
        }

        public final <Type> int getExtensionCount(C5139o<MessageType, List<Type>> oVar) {
            C5053d access$000 = GeneratedMessageLite.checkIsLite(oVar);
            verifyExtensionContainingType(access$000);
            C5181u<C5052c> uVar = this.extensions;
            C5052c cVar = access$000.f13498d;
            uVar.getClass();
            if (cVar.mo25741b()) {
                Object a = uVar.mo26202a(cVar);
                if (a == null) {
                    return 0;
                }
                return ((List) a).size();
            }
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }

        public final <Type> boolean hasExtension(C5139o<MessageType, Type> oVar) {
            C5053d access$000 = GeneratedMessageLite.checkIsLite(oVar);
            verifyExtensionContainingType(access$000);
            C5181u<C5052c> uVar = this.extensions;
            C5052c cVar = access$000.f13498d;
            uVar.getClass();
            if (!cVar.mo25741b()) {
                return uVar.f13734a.get(cVar) != null;
            }
            throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
        }

        public final void mergeExtensionFields(MessageType messagetype) {
            C5181u<C5052c> uVar = this.extensions;
            if (uVar.f13735b) {
                this.extensions = uVar.clone();
            }
            this.extensions.mo26204a(messagetype.extensions);
        }

        public /* bridge */ /* synthetic */ C5149q0.C5150a newBuilderForType() {
            return GeneratedMessageLite.super.newBuilderForType();
        }

        public ExtendableMessage<MessageType, BuilderType>.a newExtensionWriter() {
            return new C5049a(this, false);
        }

        public ExtendableMessage<MessageType, BuilderType>.a newMessageSetExtensionWriter() {
            return new C5049a(this, true);
        }

        public <MessageType extends C5149q0> boolean parseUnknownField(MessageType messagetype, C5114j jVar, C5147q qVar, int i) throws IOException {
            int i2 = C5169t1.f13694a;
            int i3 = i >>> 3;
            return parseExtension(jVar, qVar, qVar.f13658a.get(new C5147q.C5148a(messagetype, i3)), i, i3);
        }

        public <MessageType extends C5149q0> boolean parseUnknownFieldAsMessageSet(MessageType messagetype, C5114j jVar, C5147q qVar, int i) throws IOException {
            if (i == C5169t1.f13694a) {
                mergeMessageSetExtensionFromCodedStream(messagetype, jVar, qVar);
                return true;
            } else if ((i & 7) == 2) {
                return parseUnknownField(messagetype, jVar, qVar, i);
            } else {
                return jVar.mo25980e(i);
            }
        }

        public /* bridge */ /* synthetic */ C5149q0.C5150a toBuilder() {
            return GeneratedMessageLite.super.toBuilder();
        }

        public final <Type> Type getExtension(C5139o<MessageType, List<Type>> oVar, int i) {
            C5053d access$000 = GeneratedMessageLite.checkIsLite(oVar);
            verifyExtensionContainingType(access$000);
            C5181u<C5052c> uVar = this.extensions;
            C5052c cVar = access$000.f13498d;
            uVar.getClass();
            if (cVar.mo25741b()) {
                Object a = uVar.mo26202a(cVar);
                if (a != null) {
                    return access$000.mo25746a(((List) a).get(i));
                }
                throw new IndexOutOfBoundsException();
            }
            throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
        }
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parseFrom(T t, C5114j jVar, C5147q qVar) throws C5061a0 {
        return checkMessageInitialized(parsePartialFrom(t, jVar, qVar));
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, byte[] bArr, int i, int i2, C5147q qVar) throws C5061a0 {
        T t2 = (GeneratedMessageLite) t.dynamicMethod(C5054e.NEW_MUTABLE_INSTANCE);
        try {
            C5066b1 b1Var = C5066b1.f13524c;
            b1Var.getClass();
            C5083f1<?> a = b1Var.mo25762a(t2.getClass());
            a.mo25872a(t2, bArr, i, i + i2, new C5075e.C5076a(qVar));
            a.mo25876c(t2);
            if (t2.memoizedHashCode == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof C5061a0) {
                throw ((C5061a0) e.getCause());
            }
            throw new C5061a0(e.getMessage());
        } catch (IndexOutOfBoundsException unused) {
            throw C5061a0.m15279i();
        }
    }

    public static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, C5114j jVar) throws C5061a0 {
        return parsePartialFrom(t, jVar, C5147q.m15950a());
    }

    private static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, C5093i iVar, C5147q qVar) throws C5061a0 {
        try {
            C5114j g = iVar.mo25915g();
            T parsePartialFrom = parsePartialFrom(t, g, qVar);
            g.mo25971a(0);
            return parsePartialFrom;
        } catch (C5061a0 e) {
            throw e;
        } catch (C5061a0 e2) {
            throw e2;
        }
    }

    private static <T extends GeneratedMessageLite<T, ?>> T parsePartialFrom(T t, byte[] bArr, C5147q qVar) throws C5061a0 {
        return checkMessageInitialized(parsePartialFrom(t, bArr, 0, bArr.length, qVar));
    }
}
