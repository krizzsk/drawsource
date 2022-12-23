package kotlinx.coroutines.sync;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;

@Metadata(mo72584k = 3, mo72585mv = {1, 6, 0}, mo72587xi = 176)
@DebugMetadata(mo73296c = "kotlinx.coroutines.sync.MutexKt", mo73297f = "Mutex.kt", mo73298i = {0, 0, 0}, mo73299l = {112}, mo73300m = "withLock", mo73301n = {"$this$withLock", "owner", "action"}, mo73302s = {"L$0", "L$1", "L$2"})
/* compiled from: Mutex.kt */
final class MutexKt$withLock$1<T> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    MutexKt$withLock$1(Continuation<? super MutexKt$withLock$1> continuation) {
        super(continuation);
    }

    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return MutexKt.withLock((Mutex) null, (Object) null, (Function0) null, this);
    }
}
