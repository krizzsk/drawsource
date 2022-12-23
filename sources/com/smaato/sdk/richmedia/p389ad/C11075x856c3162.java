package com.smaato.sdk.richmedia.p389ad;

import com.smaato.sdk.core.flow.Flow;
import com.smaato.sdk.core.flow.Function1;
import com.smaato.sdk.core.p380ad.AdPresenterBuilder;
import com.smaato.sdk.core.p380ad.AdPresenterBuilderException;

/* renamed from: com.smaato.sdk.richmedia.ad.-$$Lambda$RichMediaAdPresenterBuilder$oD2AC5jZZE277kNkcTWMhe8mCpE */
/* compiled from: lambda */
public final /* synthetic */ class C11075x856c3162 implements Function1 {
    public static final /* synthetic */ C11075x856c3162 INSTANCE = new C11075x856c3162();

    private /* synthetic */ C11075x856c3162() {
    }

    public final Object apply(Object obj) {
        return Flow.error((Throwable) new AdPresenterBuilderException(AdPresenterBuilder.Error.INVALID_RESPONSE, (Exception) ((Throwable) obj)));
    }
}
