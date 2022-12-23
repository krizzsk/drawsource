package com.fyber.inneractive.sdk.player.exoplayer2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.fyber.inneractive.sdk.player.exoplayer2.C4652e;
import com.fyber.inneractive.sdk.player.exoplayer2.C4806h;
import com.fyber.inneractive.sdk.player.exoplayer2.trackselection.C4910h;
import java.util.Iterator;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.f */
public class C4804f extends Handler {

    /* renamed from: a */
    public final /* synthetic */ C4805g f12664a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4804f(C4805g gVar, Looper looper) {
        super(looper);
        this.f12664a = gVar;
    }

    public void handleMessage(Message message) {
        C4805g gVar = this.f12664a;
        gVar.getClass();
        boolean z = true;
        switch (message.what) {
            case 0:
                gVar.f12677m--;
                return;
            case 1:
                gVar.f12675k = message.arg1;
                Iterator<C4652e.C4653a> it = gVar.f12670f.iterator();
                while (it.hasNext()) {
                    it.next().mo24905a(gVar.f12674j, gVar.f12675k);
                }
                return;
            case 2:
                if (message.arg1 == 0) {
                    z = false;
                }
                gVar.f12678n = z;
                Iterator<C4652e.C4653a> it2 = gVar.f12670f.iterator();
                while (it2.hasNext()) {
                    it2.next().mo24904a(gVar.f12678n);
                }
                return;
            case 3:
                if (gVar.f12677m == 0) {
                    C4910h hVar = (C4910h) message.obj;
                    gVar.f12673i = true;
                    gVar.f12681q = hVar.f13034a;
                    gVar.f12682r = hVar.f13035b;
                    gVar.f12666b.mo25431a(hVar.f13036c);
                    Iterator<C4652e.C4653a> it3 = gVar.f12670f.iterator();
                    while (it3.hasNext()) {
                        it3.next().mo24903a(gVar.f12681q, gVar.f12682r);
                    }
                    return;
                }
                return;
            case 4:
                int i = gVar.f12676l - 1;
                gVar.f12676l = i;
                if (i == 0) {
                    gVar.f12684t = (C4806h.C4808b) message.obj;
                    if (message.arg1 != 0) {
                        Iterator<C4652e.C4653a> it4 = gVar.f12670f.iterator();
                        while (it4.hasNext()) {
                            it4.next().mo24899a();
                        }
                        return;
                    }
                    return;
                }
                return;
            case 5:
                if (gVar.f12676l == 0) {
                    gVar.f12684t = (C4806h.C4808b) message.obj;
                    Iterator<C4652e.C4653a> it5 = gVar.f12670f.iterator();
                    while (it5.hasNext()) {
                        it5.next().mo24899a();
                    }
                    return;
                }
                return;
            case 6:
                C4806h.C4810d dVar = (C4806h.C4810d) message.obj;
                gVar.f12676l -= dVar.f12748d;
                if (gVar.f12677m == 0) {
                    gVar.f12679o = dVar.f12745a;
                    gVar.f12680p = dVar.f12746b;
                    gVar.f12684t = dVar.f12747c;
                    Iterator<C4652e.C4653a> it6 = gVar.f12670f.iterator();
                    while (it6.hasNext()) {
                        it6.next().mo24902a(gVar.f12679o, gVar.f12680p);
                    }
                    return;
                }
                return;
            case 7:
                C4816m mVar = (C4816m) message.obj;
                if (!gVar.f12683s.equals(mVar)) {
                    gVar.f12683s = mVar;
                    Iterator<C4652e.C4653a> it7 = gVar.f12670f.iterator();
                    while (it7.hasNext()) {
                        it7.next().mo24901a(mVar);
                    }
                    return;
                }
                return;
            case 8:
                C4639d dVar2 = (C4639d) message.obj;
                Iterator<C4652e.C4653a> it8 = gVar.f12670f.iterator();
                while (it8.hasNext()) {
                    it8.next().mo24900a(dVar2);
                }
                return;
            default:
                throw new IllegalStateException();
        }
    }
}
