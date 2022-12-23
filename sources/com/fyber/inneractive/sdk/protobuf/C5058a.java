package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C5058a;
import com.fyber.inneractive.sdk.protobuf.C5058a.C5059a;
import com.fyber.inneractive.sdk.protobuf.C5093i;
import com.fyber.inneractive.sdk.protobuf.C5125l;
import com.fyber.inneractive.sdk.protobuf.C5149q0;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

/* renamed from: com.fyber.inneractive.sdk.protobuf.a */
public abstract class C5058a<MessageType extends C5058a<MessageType, BuilderType>, BuilderType extends C5059a<MessageType, BuilderType>> implements C5149q0 {
    public int memoizedHashCode = 0;

    @Deprecated
    public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        C5059a.m15270a(iterable, (List) collection);
    }

    public static void checkByteStringIsUtf8(C5093i iVar) throws IllegalArgumentException {
        if (!iVar.mo25912e()) {
            throw new IllegalArgumentException("Byte string is not UTF-8.");
        }
    }

    private String getSerializingExceptionMessage(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public int getMemoizedSerializedSize() {
        throw new UnsupportedOperationException();
    }

    public int getSerializedSize(C5083f1 f1Var) {
        int memoizedSerializedSize = getMemoizedSerializedSize();
        if (memoizedSerializedSize != -1) {
            return memoizedSerializedSize;
        }
        int b = f1Var.mo25874b(this);
        setMemoizedSerializedSize(b);
        return b;
    }

    public C5132l1 newUninitializedMessageException() {
        return new C5132l1();
    }

    public void setMemoizedSerializedSize(int i) {
        throw new UnsupportedOperationException();
    }

    public byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            Logger logger = C5125l.f13629b;
            C5125l.C5128c cVar = new C5125l.C5128c(bArr, 0, serializedSize);
            writeTo(cVar);
            if (cVar.mo26041a() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(getSerializingExceptionMessage("byte array"), e);
        }
    }

    public C5093i toByteString() {
        try {
            int serializedSize = getSerializedSize();
            C5093i iVar = C5093i.f13565b;
            byte[] bArr = new byte[serializedSize];
            C5125l a = C5125l.m15780a(bArr);
            writeTo(a);
            if (a.mo26041a() == 0) {
                return new C5093i.C5101h(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(getSerializingExceptionMessage("ByteString"), e);
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        int c = C5125l.m15785c(serializedSize) + serializedSize;
        if (c > 4096) {
            c = 4096;
        }
        C5125l.C5130e eVar = new C5125l.C5130e(outputStream, c);
        eVar.mo26055g(serializedSize);
        writeTo(eVar);
        if (eVar.f13634f > 0) {
            eVar.mo26069b();
        }
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        int serializedSize = getSerializedSize();
        Logger logger = C5125l.f13629b;
        if (serializedSize > 4096) {
            serializedSize = 4096;
        }
        C5125l.C5130e eVar = new C5125l.C5130e(outputStream, serializedSize);
        writeTo(eVar);
        if (eVar.f13634f > 0) {
            eVar.mo26069b();
        }
    }

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        C5059a.m15270a(iterable, list);
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.a$a */
    public static abstract class C5059a<MessageType extends C5058a<MessageType, BuilderType>, BuilderType extends C5059a<MessageType, BuilderType>> implements C5149q0.C5150a {
        /* renamed from: a */
        public static <T> void m15270a(Iterable<T> iterable, List<? super T> list) {
            Charset charset = C5194z.f13762a;
            iterable.getClass();
            if (iterable instanceof C5082f0) {
                List<?> c = ((C5082f0) iterable).mo25801c();
                C5082f0 f0Var = (C5082f0) list;
                int size = list.size();
                for (Object next : c) {
                    if (next == null) {
                        String str = "Element at index " + (f0Var.size() - size) + " is null.";
                        for (int size2 = f0Var.size() - 1; size2 >= size; size2--) {
                            f0Var.remove(size2);
                        }
                        throw new NullPointerException(str);
                    } else if (next instanceof C5093i) {
                        f0Var.mo25799a((C5093i) next);
                    } else {
                        f0Var.add((String) next);
                    }
                }
            } else if (iterable instanceof C5206z0) {
                list.addAll((Collection) iterable);
            } else {
                if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                    ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
                }
                int size3 = list.size();
                for (T next2 : iterable) {
                    if (next2 == null) {
                        String str2 = "Element at index " + (list.size() - size3) + " is null.";
                        for (int size4 = list.size() - 1; size4 >= size3; size4--) {
                            list.remove(size4);
                        }
                        throw new NullPointerException(str2);
                    }
                    list.add(next2);
                }
            }
        }

        /* renamed from: com.fyber.inneractive.sdk.protobuf.a$a$a */
        public static final class C5060a extends FilterInputStream {

            /* renamed from: a */
            public int f13507a;

            public C5060a(InputStream inputStream, int i) {
                super(inputStream);
                this.f13507a = i;
            }

            public int available() throws IOException {
                return Math.min(super.available(), this.f13507a);
            }

            public int read() throws IOException {
                if (this.f13507a <= 0) {
                    return -1;
                }
                int read = super.read();
                if (read >= 0) {
                    this.f13507a--;
                }
                return read;
            }

            public long skip(long j) throws IOException {
                long skip = super.skip(Math.min(j, (long) this.f13507a));
                if (skip >= 0) {
                    this.f13507a = (int) (((long) this.f13507a) - skip);
                }
                return skip;
            }

            public int read(byte[] bArr, int i, int i2) throws IOException {
                int i3 = this.f13507a;
                if (i3 <= 0) {
                    return -1;
                }
                int read = super.read(bArr, i, Math.min(i2, i3));
                if (read >= 0) {
                    this.f13507a -= read;
                }
                return read;
            }
        }
    }
}
