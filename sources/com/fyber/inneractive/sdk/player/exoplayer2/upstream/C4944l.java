package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.os.Handler;
import android.os.SystemClock;
import android.support.p003v4.media.session.PlaybackStateCompat;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4983p;
import com.google.android.exoplayer2.source.rtsp.RtspMediaSource;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.l */
public final class C4944l implements C4912a0<Object> {

    /* renamed from: a */
    public final C4983p f13141a;

    /* renamed from: b */
    public int f13142b;

    /* renamed from: c */
    public long f13143c;

    /* renamed from: d */
    public long f13144d;

    /* renamed from: e */
    public long f13145e;

    /* renamed from: f */
    public long f13146f;

    /* renamed from: g */
    public long f13147g;

    public C4944l(Handler handler, C4933d dVar) {
        this((Handler) null, (C4933d) null, 2000);
    }

    /* renamed from: a */
    public synchronized void mo25484a(Object obj, C4942j jVar) {
        if (this.f13142b == 0) {
            this.f13143c = SystemClock.elapsedRealtime();
        }
        this.f13142b++;
    }

    public C4944l(Handler handler, C4933d dVar, int i) {
        this.f13141a = new C4983p(i);
        this.f13147g = -1;
    }

    /* renamed from: a */
    public synchronized void mo25483a(Object obj) {
        C4983p.C4986c cVar;
        float f;
        int i = 0;
        C4965a.m15051b(this.f13142b > 0);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        int i2 = (int) (elapsedRealtime - this.f13143c);
        long j = (long) i2;
        this.f13145e += j;
        long j2 = this.f13146f;
        long j3 = this.f13144d;
        this.f13146f = j2 + j3;
        if (i2 > 0) {
            float f2 = (float) ((RtspMediaSource.DEFAULT_TIMEOUT_MS * j3) / j);
            C4983p pVar = this.f13141a;
            int sqrt = (int) Math.sqrt((double) j3);
            if (pVar.f13256d != 1) {
                Collections.sort(pVar.f13254b, C4983p.f13251h);
                pVar.f13256d = 1;
            }
            int i3 = pVar.f13259g;
            if (i3 > 0) {
                C4983p.C4986c[] cVarArr = pVar.f13255c;
                int i4 = i3 - 1;
                pVar.f13259g = i4;
                cVar = cVarArr[i4];
            } else {
                cVar = new C4983p.C4986c();
            }
            int i5 = pVar.f13257e;
            pVar.f13257e = i5 + 1;
            cVar.f13260a = i5;
            cVar.f13261b = sqrt;
            cVar.f13262c = f2;
            pVar.f13254b.add(cVar);
            pVar.f13258f += sqrt;
            while (true) {
                int i6 = pVar.f13258f;
                int i7 = pVar.f13253a;
                if (i6 <= i7) {
                    break;
                }
                int i8 = i6 - i7;
                C4983p.C4986c cVar2 = pVar.f13254b.get(0);
                int i9 = cVar2.f13261b;
                if (i9 <= i8) {
                    pVar.f13258f -= i9;
                    pVar.f13254b.remove(0);
                    int i10 = pVar.f13259g;
                    if (i10 < 5) {
                        C4983p.C4986c[] cVarArr2 = pVar.f13255c;
                        pVar.f13259g = i10 + 1;
                        cVarArr2[i10] = cVar2;
                    }
                } else {
                    cVar2.f13261b = i9 - i8;
                    pVar.f13258f -= i8;
                }
            }
            if (this.f13145e >= 2000 || this.f13146f >= PlaybackStateCompat.ACTION_SET_SHUFFLE_MODE_ENABLED) {
                C4983p pVar2 = this.f13141a;
                if (pVar2.f13256d != 0) {
                    Collections.sort(pVar2.f13254b, C4983p.f13252i);
                    pVar2.f13256d = 0;
                }
                float f3 = 0.5f * ((float) pVar2.f13258f);
                int i11 = 0;
                while (true) {
                    if (i < pVar2.f13254b.size()) {
                        C4983p.C4986c cVar3 = pVar2.f13254b.get(i);
                        i11 += cVar3.f13261b;
                        if (((float) i11) >= f3) {
                            f = cVar3.f13262c;
                            break;
                        }
                        i++;
                    } else if (pVar2.f13254b.isEmpty()) {
                        f = Float.NaN;
                    } else {
                        ArrayList<C4983p.C4986c> arrayList = pVar2.f13254b;
                        f = arrayList.get(arrayList.size() - 1).f13262c;
                    }
                }
                this.f13147g = Float.isNaN(f) ? -1 : (long) f;
            }
        }
        int i12 = this.f13142b - 1;
        this.f13142b = i12;
        if (i12 > 0) {
            this.f13143c = elapsedRealtime;
        }
        this.f13144d = 0;
    }
}
