package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.WindowManager;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.d */
public final class C5006d {

    /* renamed from: a */
    public final C5007a f13343a;

    /* renamed from: b */
    public final long f13344b;

    /* renamed from: c */
    public final long f13345c;

    /* renamed from: d */
    public long f13346d;

    /* renamed from: e */
    public long f13347e;

    /* renamed from: f */
    public long f13348f;

    /* renamed from: g */
    public boolean f13349g;

    /* renamed from: h */
    public long f13350h;

    /* renamed from: i */
    public long f13351i;

    /* renamed from: j */
    public long f13352j;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.d$a */
    public static final class C5007a implements Choreographer.FrameCallback, Handler.Callback {

        /* renamed from: e */
        public static final C5007a f13353e = new C5007a();

        /* renamed from: a */
        public volatile long f13354a;

        /* renamed from: b */
        public final Handler f13355b;

        /* renamed from: c */
        public Choreographer f13356c;

        /* renamed from: d */
        public int f13357d;

        public C5007a() {
            HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper(), this);
            this.f13355b = handler;
            handler.sendEmptyMessage(0);
        }

        /* renamed from: a */
        public static C5007a m15179a() {
            return f13353e;
        }

        public void doFrame(long j) {
            this.f13354a = j;
            this.f13356c.postFrameCallbackDelayed(this, 500);
        }

        public boolean handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                this.f13356c = Choreographer.getInstance();
                return true;
            } else if (i == 1) {
                int i2 = this.f13357d + 1;
                this.f13357d = i2;
                if (i2 == 1) {
                    this.f13356c.postFrameCallback(this);
                }
                return true;
            } else if (i != 2) {
                return false;
            } else {
                int i3 = this.f13357d - 1;
                this.f13357d = i3;
                if (i3 == 0) {
                    this.f13356c.removeFrameCallback(this);
                    this.f13354a = 0;
                }
                return true;
            }
        }
    }

    public C5006d(Context context) {
        this((double) m15177a(context), true);
    }

    /* renamed from: a */
    public final boolean mo25594a(long j, long j2) {
        return Math.abs((j2 - this.f13350h) - (j - this.f13351i)) > 20000000;
    }

    public C5006d(double d, boolean z) {
        if (z) {
            this.f13343a = C5007a.m15179a();
            long j = (long) (1.0E9d / d);
            this.f13344b = j;
            this.f13345c = (j * 80) / 100;
            return;
        }
        this.f13343a = null;
        this.f13344b = -1;
        this.f13345c = -1;
    }

    /* renamed from: a */
    public static float m15177a(Context context) {
        return ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRefreshRate();
    }
}
