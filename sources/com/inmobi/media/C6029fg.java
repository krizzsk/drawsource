package com.inmobi.media;

import android.media.MediaPlayer;

/* renamed from: com.inmobi.media.fg */
/* compiled from: NativeMediaPlayer */
public final class C6029fg extends MediaPlayer {

    /* renamed from: d */
    private static final Object f15284d = new Object();

    /* renamed from: e */
    private static C6029fg f15285e;

    /* renamed from: f */
    private static int f15286f = 0;

    /* renamed from: a */
    public int f15287a = 0;

    /* renamed from: b */
    public int f15288b = 0;

    /* renamed from: c */
    private C6029fg f15289c;

    /* renamed from: a */
    public static C6029fg m17940a() {
        synchronized (f15284d) {
            if (f15285e == null) {
                return new C6029fg();
            }
            C6029fg fgVar = f15285e;
            f15285e = fgVar.f15289c;
            fgVar.f15289c = null;
            f15286f--;
            return fgVar;
        }
    }

    /* renamed from: b */
    public final void mo35187b() {
        if (!(3 == this.f15287a)) {
            synchronized (f15284d) {
                if (f15286f < 5) {
                    this.f15289c = f15285e;
                    f15285e = this;
                    f15286f++;
                }
            }
        }
    }
}
