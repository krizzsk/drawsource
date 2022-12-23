package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.fyber.inneractive.sdk.protobuf.C5058a;
import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite;
import com.google.android.exoplayer2.C5429C;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.fyber.inneractive.sdk.protobuf.z */
public final class C5194z {

    /* renamed from: a */
    public static final Charset f13762a = Charset.forName("UTF-8");

    /* renamed from: b */
    public static final byte[] f13763b;

    /* renamed from: com.fyber.inneractive.sdk.protobuf.z$a */
    public interface C5195a extends C5205j<Boolean> {
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.z$b */
    public interface C5196b extends C5205j<Double> {
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.z$c */
    public interface C5197c {
        /* renamed from: a */
        int mo24014a();
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.z$d */
    public interface C5198d<T extends C5197c> {
        /* renamed from: a */
        T mo26241a(int i);
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.z$e */
    public interface C5199e {
        /* renamed from: a */
        boolean mo26242a(int i);
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.z$f */
    public interface C5200f extends C5205j<Float> {
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.z$g */
    public interface C5201g extends C5205j<Integer> {
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.z$h */
    public static class C5202h<F, T> extends AbstractList<T> {

        /* renamed from: a */
        public final List<F> f13764a;

        /* renamed from: b */
        public final C5203a<F, T> f13765b;

        /* renamed from: com.fyber.inneractive.sdk.protobuf.z$h$a */
        public interface C5203a<F, T> {
        }

        public C5202h(List<F> list, C5203a<F, T> aVar) {
            this.f13764a = list;
            this.f13765b = aVar;
        }

        public T get(int i) {
            C5203a<F, T> aVar = this.f13765b;
            F f = this.f13764a.get(i);
            ((TokenParametersOuterClass$TokenParameters.C4137a) aVar).getClass();
            T a = TokenParametersOuterClass$TokenParameters.C4147k.m13111a(((Integer) f).intValue());
            return a == null ? TokenParametersOuterClass$TokenParameters.C4147k.UNRECOGNIZED : a;
        }

        public int size() {
            return this.f13764a.size();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.z$i */
    public interface C5204i extends C5205j<Long> {
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.z$j */
    public interface C5205j<E> extends List<E>, RandomAccess {
        /* renamed from: b */
        C5205j<E> mo25786b(int i);

        /* renamed from: b */
        void mo25766b();

        /* renamed from: d */
        boolean mo25768d();
    }

    static {
        Charset.forName(C5429C.ISO88591_NAME);
        byte[] bArr = new byte[0];
        f13763b = bArr;
        ByteBuffer.wrap(bArr);
        C5114j.m15568a(bArr, 0, 0, false);
    }

    /* renamed from: a */
    public static int m16179a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* renamed from: a */
    public static int m16180a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* renamed from: a */
    public static <T> T m16182a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: a */
    public static Object m16181a(Object obj, Object obj2) {
        C5149q0 q0Var = (C5149q0) obj2;
        C5058a.C5059a aVar = (C5058a.C5059a) ((C5149q0) obj).toBuilder();
        aVar.getClass();
        GeneratedMessageLite.C5050a aVar2 = (GeneratedMessageLite.C5050a) aVar;
        if (aVar2.f13486a.getClass().isInstance(q0Var)) {
            aVar2.mo25737c();
            aVar2.mo25735a(aVar2.f13487b, (GeneratedMessageLite) ((C5058a) q0Var));
            return aVar2.mo25736b();
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
