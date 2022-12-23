package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@Metadata(mo72584k = 3, mo72585mv = {1, 6, 0}, mo72587xi = 48)
@DebugMetadata(mo73296c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$1$1", mo73297f = "Merge.kt", mo73298i = {}, mo73299l = {80}, mo73300m = "emit", mo73301n = {}, mo73302s = {})
/* compiled from: Merge.kt */
final class FlowKt__MergeKt$flattenConcat$1$1$emit$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FlowKt__MergeKt$flattenConcat$1$1<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FlowKt__MergeKt$flattenConcat$1$1$emit$1(FlowKt__MergeKt$flattenConcat$1$1<? super T> flowKt__MergeKt$flattenConcat$1$1, Continuation<? super FlowKt__MergeKt$flattenConcat$1$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = flowKt__MergeKt$flattenConcat$1$1;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((Flow) null, (Continuation<? super Unit>) this);
    }
}
