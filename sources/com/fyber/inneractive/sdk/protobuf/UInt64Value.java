package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class UInt64Value extends GeneratedMessageLite<UInt64Value, C5057a> implements C5153r0 {
    /* access modifiers changed from: private */
    public static final UInt64Value DEFAULT_INSTANCE;
    private static volatile C5193y0<UInt64Value> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private long value_;

    /* renamed from: com.fyber.inneractive.sdk.protobuf.UInt64Value$a */
    public static final class C5057a extends GeneratedMessageLite.C5050a<UInt64Value, C5057a> implements C5153r0 {
        public C5057a() {
            super(UInt64Value.DEFAULT_INSTANCE);
        }
    }

    static {
        UInt64Value uInt64Value = new UInt64Value();
        DEFAULT_INSTANCE = uInt64Value;
        GeneratedMessageLite.registerDefaultInstance(UInt64Value.class, uInt64Value);
    }

    private UInt64Value() {
    }

    /* access modifiers changed from: private */
    public void clearValue() {
        this.value_ = 0;
    }

    public static UInt64Value getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C5057a newBuilder() {
        return (C5057a) DEFAULT_INSTANCE.createBuilder();
    }

    /* renamed from: of */
    public static UInt64Value m15269of(long j) {
        C5057a newBuilder = newBuilder();
        newBuilder.mo25737c();
        ((UInt64Value) newBuilder.f13487b).setValue(j);
        return (UInt64Value) newBuilder.mo25734a();
    }

    public static UInt64Value parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (UInt64Value) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UInt64Value parseFrom(ByteBuffer byteBuffer) throws C5061a0 {
        return (UInt64Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C5193y0<UInt64Value> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setValue(long j) {
        this.value_ = j;
    }

    public final Object dynamicMethod(GeneratedMessageLite.C5054e eVar, Object obj, Object obj2) {
        switch (eVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0003", new Object[]{"value_"});
            case 3:
                return new UInt64Value();
            case 4:
                return new C5057a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C5193y0<UInt64Value> y0Var = PARSER;
                if (y0Var == null) {
                    synchronized (UInt64Value.class) {
                        y0Var = PARSER;
                        if (y0Var == null) {
                            y0Var = new GeneratedMessageLite.C5051b<>(DEFAULT_INSTANCE);
                            PARSER = y0Var;
                        }
                    }
                }
                return y0Var;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public long getValue() {
        return this.value_;
    }

    public static C5057a newBuilder(UInt64Value uInt64Value) {
        return (C5057a) DEFAULT_INSTANCE.createBuilder(uInt64Value);
    }

    public static UInt64Value parseDelimitedFrom(InputStream inputStream, C5147q qVar) throws IOException {
        return (UInt64Value) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
    }

    public static UInt64Value parseFrom(ByteBuffer byteBuffer, C5147q qVar) throws C5061a0 {
        return (UInt64Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
    }

    public static UInt64Value parseFrom(C5093i iVar) throws C5061a0 {
        return (UInt64Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar);
    }

    public static UInt64Value parseFrom(C5093i iVar, C5147q qVar) throws C5061a0 {
        return (UInt64Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
    }

    public static UInt64Value parseFrom(byte[] bArr) throws C5061a0 {
        return (UInt64Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static UInt64Value parseFrom(byte[] bArr, C5147q qVar) throws C5061a0 {
        return (UInt64Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
    }

    public static UInt64Value parseFrom(InputStream inputStream) throws IOException {
        return (UInt64Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static UInt64Value parseFrom(InputStream inputStream, C5147q qVar) throws IOException {
        return (UInt64Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
    }

    public static UInt64Value parseFrom(C5114j jVar) throws IOException {
        return (UInt64Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static UInt64Value parseFrom(C5114j jVar, C5147q qVar) throws IOException {
        return (UInt64Value) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
    }
}
