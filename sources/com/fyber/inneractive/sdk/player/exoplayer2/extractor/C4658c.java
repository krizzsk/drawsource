package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.flv.C4667b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C4711a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv.C4715d;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.C4722b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4735d;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.C4739f;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.C4751c;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p189ts.C4766a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p189ts.C4768c;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p189ts.C4770e;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p189ts.C4786p;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p189ts.C4792u;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.wav.C4800a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4988r;
import java.lang.reflect.Constructor;
import java.util.Collections;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.c */
public final class C4658c implements C4704i {

    /* renamed from: a */
    public static final Constructor<? extends C4665f> f11674a;

    /* renamed from: a */
    public synchronized C4665f[] mo25066a() {
        C4665f[] fVarArr;
        Constructor<? extends C4665f> constructor = f11674a;
        fVarArr = new C4665f[(constructor == null ? 11 : 12)];
        fVarArr[0] = new C4715d(new C4711a(), 0);
        fVarArr[1] = new C4735d(0, (C4988r) null);
        fVarArr[2] = new C4739f();
        fVarArr[3] = new C4722b(0, -9223372036854775807L);
        fVarArr[4] = new C4768c(0);
        fVarArr[5] = new C4766a(0);
        fVarArr[6] = new C4792u(1, new C4988r(0), new C4770e(0, Collections.emptyList()));
        fVarArr[7] = new C4667b();
        fVarArr[8] = new C4751c();
        fVarArr[9] = new C4786p(new C4988r(0));
        fVarArr[10] = new C4800a();
        if (constructor != null) {
            try {
                fVarArr[11] = (C4665f) constructor.newInstance(new Object[0]);
            } catch (Exception e) {
                throw new IllegalStateException("Unexpected error creating FLAC extractor", e);
            }
        }
        return fVarArr;
    }

    static {
        Constructor<? extends U> constructor;
        try {
            constructor = Class.forName("com.fyber.inneractive.sdk.player.exoplayer2.ext.flac.FlacExtractor").asSubclass(C4665f.class).getConstructor(new Class[0]);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            constructor = null;
        }
        f11674a = constructor;
    }
}
