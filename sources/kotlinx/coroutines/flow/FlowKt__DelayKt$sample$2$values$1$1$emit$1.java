package kotlinx.coroutines.flow;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1;

@Metadata(mo72584k = 3, mo72585mv = {1, 6, 0}, mo72587xi = 48)
@DebugMetadata(mo73296c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$values$1$1", mo73297f = "Delay.kt", mo73298i = {}, mo73299l = {280}, mo73300m = "emit", mo73301n = {}, mo73302s = {})
/* compiled from: Delay.kt */
final class FlowKt__DelayKt$sample$2$values$1$1$emit$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FlowKt__DelayKt$sample$2$values$1.C125171<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FlowKt__DelayKt$sample$2$values$1$1$emit$1(FlowKt__DelayKt$sample$2$values$1.C125171<? super T> r1, Continuation<? super FlowKt__DelayKt$sample$2$values$1$1$emit$1> continuation) {
        super(continuation);
        this.this$0 = r1;
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
