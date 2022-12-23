package okio;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(mo72582d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\b¨\u0006\u0003"}, mo72583d2 = {"gzip", "Lokio/GzipSink;", "Lokio/Sink;", "okio"}, mo72584k = 2, mo72585mv = {1, 6, 0}, mo72587xi = 48)
/* renamed from: okio.-GzipSinkExtensions  reason: invalid class name */
/* compiled from: GzipSink.kt */
public final class GzipSinkExtensions {
    public static final GzipSink gzip(Sink sink) {
        Intrinsics.checkNotNullParameter(sink, "<this>");
        return new GzipSink(sink);
    }
}
