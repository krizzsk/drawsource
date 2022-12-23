package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(mo72584k = 3, mo72585mv = {1, 6, 0}, mo72587xi = 48)
@DebugMetadata(mo73296c = "kotlinx.coroutines.channels.AbstractChannel", mo73297f = "AbstractChannel.kt", mo73298i = {}, mo73299l = {633}, mo73300m = "receiveCatching-JP2dKIU", mo73301n = {}, mo73302s = {})
/* compiled from: AbstractChannel.kt */
final class AbstractChannel$receiveCatching$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AbstractChannel<E> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AbstractChannel$receiveCatching$1(AbstractChannel<E> abstractChannel, Continuation<? super AbstractChannel$receiveCatching$1> continuation) {
        super(continuation);
        this.this$0 = abstractChannel;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object r2 = this.this$0.m35316receiveCatchingJP2dKIU(this);
        return r2 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? r2 : ChannelResult.m35327boximpl(r2);
    }
}
