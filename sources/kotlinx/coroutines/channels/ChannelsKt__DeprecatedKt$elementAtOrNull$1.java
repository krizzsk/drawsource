package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(mo72584k = 3, mo72585mv = {1, 6, 0}, mo72587xi = 48)
@DebugMetadata(mo73296c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", mo73297f = "Deprecated.kt", mo73298i = {0, 0, 0}, mo73299l = {53}, mo73300m = "elementAtOrNull", mo73301n = {"$this$consume$iv", "index", "count"}, mo73302s = {"L$0", "I$0", "I$1"})
/* compiled from: Deprecated.kt */
final class ChannelsKt__DeprecatedKt$elementAtOrNull$1<E> extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    ChannelsKt__DeprecatedKt$elementAtOrNull$1(Continuation<? super ChannelsKt__DeprecatedKt$elementAtOrNull$1> continuation) {
        super(continuation);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ChannelsKt__DeprecatedKt.elementAtOrNull((ReceiveChannel) null, 0, this);
    }
}
