package okhttp3.internal.http2;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo72582d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, mo72583d2 = {"Lokhttp3/internal/http2/StreamResetException;", "Ljava/io/IOException;", "errorCode", "Lokhttp3/internal/http2/ErrorCode;", "(Lokhttp3/internal/http2/ErrorCode;)V", "okhttp"}, mo72584k = 1, mo72585mv = {1, 6, 0}, mo72587xi = 48)
/* compiled from: StreamResetException.kt */
public final class StreamResetException extends IOException {
    public final ErrorCode errorCode;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StreamResetException(ErrorCode errorCode2) {
        super(Intrinsics.stringPlus("stream was reset: ", errorCode2));
        Intrinsics.checkNotNullParameter(errorCode2, IronSourceConstants.EVENTS_ERROR_CODE);
        this.errorCode = errorCode2;
    }
}
