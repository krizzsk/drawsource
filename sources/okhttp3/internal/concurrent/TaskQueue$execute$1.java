package okhttp3.internal.concurrent;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

@Metadata(mo72582d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, mo72583d2 = {"okhttp3/internal/concurrent/TaskQueue$execute$1", "Lokhttp3/internal/concurrent/Task;", "runOnce", "", "okhttp"}, mo72584k = 1, mo72585mv = {1, 6, 0}, mo72587xi = 176)
/* compiled from: TaskQueue.kt */
public final class TaskQueue$execute$1 extends Task {
    final /* synthetic */ Function0<Unit> $block;
    final /* synthetic */ boolean $cancelable;
    final /* synthetic */ String $name;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TaskQueue$execute$1(String str, boolean z, Function0<Unit> function0) {
        super(str, z);
        this.$name = str;
        this.$cancelable = z;
        this.$block = function0;
    }

    public long runOnce() {
        this.$block.invoke();
        return -1;
    }
}
