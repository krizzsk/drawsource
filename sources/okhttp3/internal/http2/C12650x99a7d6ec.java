package okhttp3.internal.http2;

import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import okhttp3.internal.concurrent.Task;

@Metadata(mo72582d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004¸\u0006\u0000"}, mo72583d2 = {"okhttp3/internal/concurrent/TaskQueue$execute$1", "Lokhttp3/internal/concurrent/Task;", "runOnce", "", "okhttp"}, mo72584k = 1, mo72585mv = {1, 6, 0}, mo72587xi = 48)
/* renamed from: okhttp3.internal.http2.Http2Connection$ReaderRunnable$applyAndAckSettings$lambda-7$lambda-6$$inlined$execute$default$1 */
/* compiled from: TaskQueue.kt */
public final class C12650x99a7d6ec extends Task {
    final /* synthetic */ boolean $cancelable;
    final /* synthetic */ String $name;
    final /* synthetic */ Ref.ObjectRef $newPeerSettings$inlined;
    final /* synthetic */ Http2Connection this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C12650x99a7d6ec(String str, boolean z, Http2Connection http2Connection, Ref.ObjectRef objectRef) {
        super(str, z);
        this.$name = str;
        this.$cancelable = z;
        this.this$0 = http2Connection;
        this.$newPeerSettings$inlined = objectRef;
    }

    public long runOnce() {
        this.this$0.getListener$okhttp().onSettings(this.this$0, (Settings) this.$newPeerSettings$inlined.element);
        return -1;
    }
}
