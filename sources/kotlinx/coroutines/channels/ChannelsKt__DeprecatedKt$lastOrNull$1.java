package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(mo72584k = 3, mo72585mv = {1, 6, 0}, mo72587xi = 48)
@DebugMetadata(mo73296c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt", mo73297f = "Deprecated.kt", mo73298i = {0, 0, 1, 1, 1}, mo73299l = {123, 126}, mo73300m = "lastOrNull", mo73301n = {"$this$consume$iv", "iterator", "$this$consume$iv", "iterator", "last"}, mo73302s = {"L$0", "L$1", "L$0", "L$1", "L$2"})
/* compiled from: Deprecated.kt */
final class ChannelsKt__DeprecatedKt$lastOrNull$1<E> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    ChannelsKt__DeprecatedKt$lastOrNull$1(Continuation<? super ChannelsKt__DeprecatedKt$lastOrNull$1> continuation) {
        super(continuation);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ChannelsKt__DeprecatedKt.lastOrNull((ReceiveChannel) null, this);
    }
}
