package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(mo72584k = 3, mo72585mv = {1, 6, 0}, mo72587xi = 48)
@DebugMetadata(mo73296c = "kotlinx.coroutines.flow.SubscribedSharedFlow", mo73297f = "Share.kt", mo73298i = {}, mo73299l = {409}, mo73300m = "collect", mo73301n = {}, mo73302s = {})
/* compiled from: Share.kt */
final class SubscribedSharedFlow$collect$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SubscribedSharedFlow<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SubscribedSharedFlow$collect$1(SubscribedSharedFlow<T> subscribedSharedFlow, Continuation<? super SubscribedSharedFlow$collect$1> continuation) {
        super(continuation);
        this.this$0 = subscribedSharedFlow;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.collect((FlowCollector) null, this);
    }
}
