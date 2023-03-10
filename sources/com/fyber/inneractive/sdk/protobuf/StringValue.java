package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.GeneratedMessageLite;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public final class StringValue extends GeneratedMessageLite<StringValue, C5055a> implements C5153r0 {
    /* access modifiers changed from: private */
    public static final StringValue DEFAULT_INSTANCE;
    private static volatile C5193y0<StringValue> PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 1;
    private String value_ = "";

    /* renamed from: com.fyber.inneractive.sdk.protobuf.StringValue$a */
    public static final class C5055a extends GeneratedMessageLite.C5050a<StringValue, C5055a> implements C5153r0 {
        public C5055a() {
            super(StringValue.DEFAULT_INSTANCE);
        }
    }

    static {
        StringValue stringValue = new StringValue();
        DEFAULT_INSTANCE = stringValue;
        GeneratedMessageLite.registerDefaultInstance(StringValue.class, stringValue);
    }

    private StringValue() {
    }

    /* access modifiers changed from: private */
    public void clearValue() {
        this.value_ = getDefaultInstance().getValue();
    }

    public static StringValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static C5055a newBuilder() {
        return (C5055a) DEFAULT_INSTANCE.createBuilder();
    }

    /* renamed from: of */
    public static StringValue m15267of(String str) {
        C5055a newBuilder = newBuilder();
        newBuilder.mo25737c();
        ((StringValue) newBuilder.f13487b).setValue(str);
        return (StringValue) newBuilder.mo25734a();
    }

    public static StringValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (StringValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StringValue parseFrom(ByteBuffer byteBuffer) throws C5061a0 {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static C5193y0<StringValue> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* access modifiers changed from: private */
    public void setValue(String str) {
        str.getClass();
        this.value_ = str;
    }

    /* access modifiers changed from: private */
    public void setValueBytes(C5093i iVar) {
        iVar.getClass();
        C5058a.checkByteStringIsUtf8(iVar);
        this.value_ = iVar.mo25918i();
    }

    public final Object dynamicMethod(GeneratedMessageLite.C5054e eVar, Object obj, Object obj2) {
        switch (eVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001??", new Object[]{"value_"});
            case 3:
                return new StringValue();
            case 4:
                return new C5055a();
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                C5193y0<StringValue> y0Var = PARSER;
                if (y0Var == null) {
                    synchronized (StringValue.class) {
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

    public String getValue() {
        return this.value_;
    }

    public C5093i getValueBytes() {
        return C5093i.m15514a(this.value_);
    }

    public static C5055a newBuilder(StringValue stringValue) {
        return (C5055a) DEFAULT_INSTANCE.createBuilder(stringValue);
    }

    public static StringValue parseDelimitedFrom(InputStream inputStream, C5147q qVar) throws IOException {
        return (StringValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, qVar);
    }

    public static StringValue parseFrom(ByteBuffer byteBuffer, C5147q qVar) throws C5061a0 {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, qVar);
    }

    public static StringValue parseFrom(C5093i iVar) throws C5061a0 {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar);
    }

    public static StringValue parseFrom(C5093i iVar, C5147q qVar) throws C5061a0 {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, iVar, qVar);
    }

    public static StringValue parseFrom(byte[] bArr) throws C5061a0 {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static StringValue parseFrom(byte[] bArr, C5147q qVar) throws C5061a0 {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, qVar);
    }

    public static StringValue parseFrom(InputStream inputStream) throws IOException {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static StringValue parseFrom(InputStream inputStream, C5147q qVar) throws IOException {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, qVar);
    }

    public static StringValue parseFrom(C5114j jVar) throws IOException {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
    }

    public static StringValue parseFrom(C5114j jVar, C5147q qVar) throws IOException {
        return (StringValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, qVar);
    }
}
