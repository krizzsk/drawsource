package com.fyber.inneractive.sdk.player.exoplayer2.source.chunk;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4906e;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C4955v;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.chunk.b */
public final class C4863b {
    /* renamed from: a */
    public static boolean m14827a(C4906e eVar, int i, Exception exc, long j) {
        if (!m14828a(exc)) {
            return false;
        }
        boolean a = eVar.mo25416a(i, j);
        int i2 = ((C4955v) exc).f13185a;
        if (a) {
            Log.w("ChunkedTrackBlacklist", "Blacklisted: duration=" + j + ", responseCode=" + i2 + ", format=" + eVar.mo25415a(i));
        } else {
            Log.w("ChunkedTrackBlacklist", "Blacklisting failed (cannot blacklist last enabled track): responseCode=" + i2 + ", format=" + eVar.mo25415a(i));
        }
        return a;
    }

    /* renamed from: a */
    public static boolean m14828a(Exception exc) {
        if (!(exc instanceof C4955v)) {
            return false;
        }
        int i = ((C4955v) exc).f13185a;
        if (i == 404 || i == 410) {
            return true;
        }
        return false;
    }
}
