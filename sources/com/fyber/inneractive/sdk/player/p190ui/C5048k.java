package com.fyber.inneractive.sdk.player.p190ui;

/* renamed from: com.fyber.inneractive.sdk.player.ui.k */
public class C5048k implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C5042i f13485a;

    public C5048k(C5042i iVar) {
        this.f13485a = iVar;
    }

    public void run() {
        C5042i iVar = this.f13485a;
        int i = iVar.f13449C + 200;
        iVar.f13449C = i;
        iVar.f13470v.setProgress(i);
        C5042i iVar2 = this.f13485a;
        if (iVar2.f13449C == iVar2.f13450D) {
            iVar2.f13451E = null;
            iVar2.f13449C = 0;
            iVar2.f13450D = 0;
            return;
        }
        iVar2.postDelayed(iVar2.f13451E, 200);
    }
}
