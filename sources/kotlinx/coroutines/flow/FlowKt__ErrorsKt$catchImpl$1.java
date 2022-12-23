package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(mo72584k = 3, mo72585mv = {1, 6, 0}, mo72587xi = 48)
@DebugMetadata(mo73296c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt", mo73297f = "Errors.kt", mo73298i = {0}, mo73299l = {156}, mo73300m = "catchImpl", mo73301n = {"fromDownstream"}, mo73302s = {"L$0"})
/* compiled from: Errors.kt */
final class FlowKt__ErrorsKt$catchImpl$1<T> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    FlowKt__ErrorsKt$catchImpl$1(Continuation<? super FlowKt__ErrorsKt$catchImpl$1> continuation) {
        super(continuation);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return FlowKt.catchImpl((Flow) null, (FlowCollector) null, this);
    }
}
