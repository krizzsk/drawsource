package com.fyber.inneractive.sdk.protobuf;

import java.io.IOException;

/* renamed from: com.fyber.inneractive.sdk.protobuf.q0 */
public interface C5149q0 extends C5153r0 {

    /* renamed from: com.fyber.inneractive.sdk.protobuf.q0$a */
    public interface C5150a extends C5153r0, Cloneable {
    }

    int getSerializedSize();

    C5150a newBuilderForType();

    C5150a toBuilder();

    C5093i toByteString();

    void writeTo(C5125l lVar) throws IOException;
}
