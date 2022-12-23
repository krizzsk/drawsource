package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;

@Metadata(mo72584k = 3, mo72585mv = {1, 6, 0}, mo72587xi = 176)
@DebugMetadata(mo73296c = "kotlinx.coroutines.channels.ChannelsKt__Channels_commonKt", mo73297f = "Channels.common.kt", mo73298i = {0, 0}, mo73299l = {104}, mo73300m = "consumeEach", mo73301n = {"action", "$this$consume$iv"}, mo73302s = {"L$0", "L$1"})
/* compiled from: Channels.common.kt */
final class ChannelsKt__Channels_commonKt$consumeEach$1<E> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    ChannelsKt__Channels_commonKt$consumeEach$1(Continuation<? super ChannelsKt__Channels_commonKt$consumeEach$1> continuation) {
        super(continuation);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return ChannelsKt__Channels_commonKt.consumeEach((ReceiveChannel) null, (Function1) null, (Continuation<? super Unit>) this);
    }
}
