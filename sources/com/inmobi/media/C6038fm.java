package com.inmobi.media;

import android.app.KeyguardManager;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.os.PowerManager;
import android.view.Surface;
import android.view.TextureView;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.ProgressBar;
import com.inmobi.media.C5784ax;
import com.inmobi.media.C6006fb;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

/* renamed from: com.inmobi.media.fm */
/* compiled from: NativeVideoView */
public class C6038fm extends TextureView implements MediaController.MediaPlayerControl, C6006fb.C6007a {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final String f15306g = C6038fm.class.getSimpleName();

    /* renamed from: A */
    private MediaPlayer.OnCompletionListener f15307A = new MediaPlayer.OnCompletionListener() {
        public final void onCompletion(MediaPlayer mediaPlayer) {
            try {
                C6038fm.m17966f(C6038fm.this);
            } catch (Exception e) {
                String unused = C6038fm.f15306g;
                C6130gj.m18161a().mo35310a(new C6167hk(e));
            }
        }
    };

    /* renamed from: B */
    private MediaPlayer.OnInfoListener f15308B = new MediaPlayer.OnInfoListener() {
        public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            if (Build.VERSION.SDK_INT < 17 || 3 != i) {
                return true;
            }
            C6038fm.this.mo35206a(8, 8);
            return true;
        }
    };

    /* renamed from: C */
    private MediaPlayer.OnBufferingUpdateListener f15309C = new MediaPlayer.OnBufferingUpdateListener() {
        public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
            int unused = C6038fm.this.f15333w = i;
        }
    };

    /* renamed from: D */
    private MediaPlayer.OnErrorListener f15310D = new MediaPlayer.OnErrorListener() {
        public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            String unused = C6038fm.f15306g;
            if (C6038fm.this.f15329s != null) {
                C6038fm.this.f15329s.mo35186a();
            }
            if (C6038fm.this.f15312a != null) {
                C6038fm.this.f15312a.f15287a = -1;
                C6038fm.this.f15312a.f15288b = -1;
            }
            if (C6038fm.this.f15332v != null) {
                C6038fm.this.f15332v.mo35193b();
            }
            C6038fm.m17968h(C6038fm.this);
            return true;
        }
    };

    /* renamed from: E */
    private final TextureView.SurfaceTextureListener f15311E = new TextureView.SurfaceTextureListener() {
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            Surface unused = C6038fm.this.f15320j = new Surface(surfaceTexture);
            C6038fm.this.m17972k();
        }

        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            int intValue;
            boolean z = true;
            boolean z2 = C6038fm.this.f15312a != null && C6038fm.this.f15312a.f15288b == 3;
            if (i <= 0 || i2 <= 0) {
                z = false;
            }
            if (C6038fm.this.f15312a != null && z2 && z) {
                if (!(C6038fm.this.getTag() == null || (intValue = ((Integer) ((C5869cj) C6038fm.this.getTag()).f14724v.get("seekPosition")).intValue()) == 0)) {
                    C6038fm.this.mo35205a(intValue);
                }
                C6038fm.this.start();
            }
        }

        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            if (C6038fm.this.f15320j != null) {
                C6038fm.this.f15320j.release();
                Surface unused = C6038fm.this.f15320j = null;
            }
            if (C6038fm.this.f15332v != null) {
                C6038fm.this.f15332v.mo35193b();
            }
            C6038fm.this.mo35213g();
            return true;
        }
    };

    /* renamed from: a */
    public C6029fg f15312a = null;

    /* renamed from: b */
    public final C6006fb f15313b = new C6006fb(getContext(), this);

    /* renamed from: c */
    public Handler f15314c;

    /* renamed from: d */
    public boolean f15315d;

    /* renamed from: e */
    MediaPlayer.OnVideoSizeChangedListener f15316e = new MediaPlayer.OnVideoSizeChangedListener() {
        public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            int unused = C6038fm.this.f15322l = mediaPlayer.getVideoWidth();
            int unused2 = C6038fm.this.f15323m = mediaPlayer.getVideoHeight();
            if (C6038fm.this.f15322l != 0 && C6038fm.this.f15323m != 0) {
                C6038fm.this.requestLayout();
            }
        }
    };

    /* renamed from: f */
    MediaPlayer.OnPreparedListener f15317f = new MediaPlayer.OnPreparedListener() {
        public final void onPrepared(MediaPlayer mediaPlayer) {
            if (C6038fm.this.f15312a != null) {
                C6038fm.this.f15312a.f15287a = 2;
                C6038fm fmVar = C6038fm.this;
                boolean unused = fmVar.f15334x = fmVar.f15335y = fmVar.f15336z = true;
                if (C6038fm.this.f15332v != null) {
                    C6038fm.this.f15332v.setEnabled(true);
                }
                int unused2 = C6038fm.this.f15322l = mediaPlayer.getVideoWidth();
                int unused3 = C6038fm.this.f15323m = mediaPlayer.getVideoHeight();
                C5869cj cjVar = (C5869cj) C6038fm.this.getTag();
                int i = 0;
                if (cjVar != null && ((Boolean) cjVar.f14724v.get("didCompleteQ4")).booleanValue()) {
                    C6038fm.this.mo35206a(8, 0);
                    if (((Byte) cjVar.f14724v.get("placementType")).byteValue() == 1) {
                        return;
                    }
                }
                if (C6038fm.this.getPlaybackEventListener() != null) {
                    C6038fm.this.getPlaybackEventListener().mo35185a((byte) 0);
                }
                if (cjVar != null && !((Boolean) cjVar.f14724v.get("didCompleteQ4")).booleanValue()) {
                    i = ((Integer) cjVar.f14724v.get("seekPosition")).intValue();
                }
                if (C6038fm.this.f15322l == 0 || C6038fm.this.f15323m == 0) {
                    if (3 == C6038fm.this.f15312a.f15288b && cjVar != null && ((Boolean) cjVar.f14724v.get("isFullScreen")).booleanValue()) {
                        C6038fm.this.start();
                    }
                } else if (3 == C6038fm.this.f15312a.f15288b) {
                    if (cjVar != null && ((Boolean) cjVar.f14724v.get("isFullScreen")).booleanValue()) {
                        C6038fm.this.start();
                    }
                    if (C6038fm.this.f15332v != null) {
                        C6038fm.this.f15332v.mo35192a();
                    }
                } else if (C6038fm.this.isPlaying()) {
                } else {
                    if ((i != 0 || C6038fm.this.getCurrentPosition() > 0) && C6038fm.this.f15332v != null) {
                        C6038fm.this.f15332v.mo35192a();
                    }
                }
            }
        }
    };

    /* renamed from: h */
    private Uri f15318h;

    /* renamed from: i */
    private Map<String, String> f15319i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Surface f15320j = null;

    /* renamed from: k */
    private int f15321k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f15322l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f15323m;

    /* renamed from: n */
    private int f15324n;

    /* renamed from: o */
    private int f15325o = Integer.MIN_VALUE;

    /* renamed from: p */
    private int f15326p = 0;

    /* renamed from: q */
    private C6049c f15327q;

    /* renamed from: r */
    private C6048b f15328r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C6047a f15329s;

    /* renamed from: t */
    private boolean f15330t;

    /* renamed from: u */
    private C6050d f15331u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public C6035fl f15332v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public int f15333w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public boolean f15334x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public boolean f15335y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public boolean f15336z;

    /* renamed from: com.inmobi.media.fm$a */
    /* compiled from: NativeVideoView */
    interface C6047a {
        /* renamed from: a */
        void mo35186a();
    }

    /* renamed from: com.inmobi.media.fm$b */
    /* compiled from: NativeVideoView */
    public interface C6048b {
        /* renamed from: a */
        void mo35185a(byte b);
    }

    /* renamed from: com.inmobi.media.fm$c */
    /* compiled from: NativeVideoView */
    interface C6049c {
        /* renamed from: a */
        void mo35184a(byte b);
    }

    public void seekTo(int i) {
    }

    /* renamed from: com.inmobi.media.fm$d */
    /* compiled from: NativeVideoView */
    static final class C6050d extends Handler {

        /* renamed from: a */
        private final WeakReference<C6038fm> f15345a;

        C6050d(C6038fm fmVar) {
            this.f15345a = new WeakReference<>(fmVar);
        }

        public final void handleMessage(Message message) {
            C6038fm fmVar = (C6038fm) this.f15345a.get();
            if (fmVar != null && message.what == 1) {
                int duration = fmVar.getDuration();
                int currentPosition = fmVar.getCurrentPosition();
                if (!(duration == -1 || currentPosition == 0)) {
                    C5869cj cjVar = (C5869cj) fmVar.getTag();
                    if (!((Boolean) cjVar.f14724v.get("didCompleteQ1")).booleanValue() && (currentPosition * 4) - duration >= 0) {
                        cjVar.f14724v.put("didCompleteQ1", Boolean.TRUE);
                        fmVar.getQuartileCompletedListener().mo35184a((byte) 0);
                    }
                    if (!((Boolean) cjVar.f14724v.get("didCompleteQ2")).booleanValue() && (currentPosition * 2) - duration >= 0) {
                        cjVar.f14724v.put("didCompleteQ2", Boolean.TRUE);
                        fmVar.getQuartileCompletedListener().mo35184a((byte) 1);
                    }
                    if (!((Boolean) cjVar.f14724v.get("didCompleteQ3")).booleanValue() && (currentPosition * 4) - (duration * 3) >= 0) {
                        cjVar.f14724v.put("didCompleteQ3", Boolean.TRUE);
                        fmVar.getQuartileCompletedListener().mo35184a((byte) 2);
                    }
                    boolean booleanValue = ((Boolean) cjVar.f14724v.get("didQ4Fire")).booleanValue();
                    if ((((float) currentPosition) / ((float) duration)) * 100.0f > ((float) cjVar.f14822E) && !booleanValue) {
                        fmVar.getPlaybackEventListener().mo35185a((byte) 5);
                    }
                }
                sendEmptyMessageDelayed(1, 1000);
            }
            super.handleMessage(message);
        }
    }

    public C6038fm(Context context) {
        super(context);
        requestLayout();
        invalidate();
    }

    /* renamed from: a */
    public final void mo35207a(C5869cj cjVar) {
        C6029fg fgVar;
        this.f15322l = 0;
        this.f15323m = 0;
        this.f15318h = Uri.parse(((C5950dw) cjVar.f14707e).mo35061b());
        if (1 == ((Byte) cjVar.f14724v.get("placementType")).byteValue()) {
            fgVar = new C6029fg();
        } else {
            fgVar = C6029fg.m17940a();
        }
        this.f15312a = fgVar;
        int i = this.f15321k;
        if (i != 0) {
            fgVar.setAudioSessionId(i);
        } else {
            this.f15321k = fgVar.getAudioSessionId();
        }
        try {
            this.f15312a.setDataSource(getContext().getApplicationContext(), this.f15318h, this.f15319i);
            setTag(cjVar);
            this.f15331u = new C6050d(this);
            setSurfaceTextureListener(this.f15311E);
            setFocusable(true);
            setFocusableInTouchMode(true);
            requestFocus();
        } catch (IOException unused) {
            this.f15312a.f15287a = -1;
            this.f15312a.f15288b = -1;
        }
    }

    public C6029fg getMediaPlayer() {
        return this.f15312a;
    }

    /* renamed from: e */
    public final void mo35211e() {
        Surface surface = this.f15320j;
        if (surface != null) {
            surface.release();
            this.f15320j = null;
        }
        mo35213g();
    }

    public int getState() {
        C6029fg fgVar = this.f15312a;
        if (fgVar != null) {
            return fgVar.f15287a;
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0066, code lost:
        if (r1 > r6) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onMeasure(int r6, int r7) {
        /*
            r5 = this;
            int r0 = r5.f15322l     // Catch:{ Exception -> 0x008c }
            int r0 = getDefaultSize(r0, r6)     // Catch:{ Exception -> 0x008c }
            int r1 = r5.f15323m     // Catch:{ Exception -> 0x008c }
            int r1 = getDefaultSize(r1, r7)     // Catch:{ Exception -> 0x008c }
            int r2 = r5.f15322l     // Catch:{ Exception -> 0x008c }
            if (r2 <= 0) goto L_0x0089
            int r2 = r5.f15323m     // Catch:{ Exception -> 0x008c }
            if (r2 <= 0) goto L_0x0089
            int r0 = android.view.View.MeasureSpec.getMode(r6)     // Catch:{ Exception -> 0x008c }
            int r6 = android.view.View.MeasureSpec.getSize(r6)     // Catch:{ Exception -> 0x008c }
            int r1 = android.view.View.MeasureSpec.getMode(r7)     // Catch:{ Exception -> 0x008c }
            int r7 = android.view.View.MeasureSpec.getSize(r7)     // Catch:{ Exception -> 0x008c }
            r2 = 1073741824(0x40000000, float:2.0)
            if (r0 != r2) goto L_0x004a
            if (r1 != r2) goto L_0x004a
            int r0 = r5.f15322l     // Catch:{ Exception -> 0x008c }
            int r0 = r0 * r7
            int r1 = r5.f15323m     // Catch:{ Exception -> 0x008c }
            int r1 = r1 * r6
            if (r0 >= r1) goto L_0x003a
            int r7 = r5.f15323m     // Catch:{ Exception -> 0x008c }
            int r7 = r7 * r6
            int r0 = r5.f15322l     // Catch:{ Exception -> 0x008c }
            int r1 = r7 / r0
            goto L_0x005a
        L_0x003a:
            int r0 = r5.f15322l     // Catch:{ Exception -> 0x008c }
            int r0 = r0 * r7
            int r1 = r5.f15323m     // Catch:{ Exception -> 0x008c }
            int r1 = r1 * r6
            if (r0 <= r1) goto L_0x0068
            int r6 = r5.f15322l     // Catch:{ Exception -> 0x008c }
            int r6 = r6 * r7
            int r0 = r5.f15323m     // Catch:{ Exception -> 0x008c }
            int r0 = r6 / r0
            goto L_0x0088
        L_0x004a:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r2) goto L_0x005c
            int r0 = r5.f15323m     // Catch:{ Exception -> 0x008c }
            int r0 = r0 * r6
            int r2 = r5.f15322l     // Catch:{ Exception -> 0x008c }
            int r0 = r0 / r2
            if (r1 != r3) goto L_0x0059
            if (r0 <= r7) goto L_0x0059
            goto L_0x0068
        L_0x0059:
            r1 = r0
        L_0x005a:
            r0 = r6
            goto L_0x0089
        L_0x005c:
            if (r1 != r2) goto L_0x006a
            int r1 = r5.f15322l     // Catch:{ Exception -> 0x008c }
            int r1 = r1 * r7
            int r2 = r5.f15323m     // Catch:{ Exception -> 0x008c }
            int r1 = r1 / r2
            if (r0 != r3) goto L_0x0087
            if (r1 <= r6) goto L_0x0087
        L_0x0068:
            r0 = r6
            goto L_0x0088
        L_0x006a:
            int r2 = r5.f15322l     // Catch:{ Exception -> 0x008c }
            int r4 = r5.f15323m     // Catch:{ Exception -> 0x008c }
            if (r1 != r3) goto L_0x0079
            if (r4 <= r7) goto L_0x0079
            int r1 = r5.f15322l     // Catch:{ Exception -> 0x008c }
            int r1 = r1 * r7
            int r2 = r5.f15323m     // Catch:{ Exception -> 0x008c }
            int r1 = r1 / r2
            goto L_0x007b
        L_0x0079:
            r1 = r2
            r7 = r4
        L_0x007b:
            if (r0 != r3) goto L_0x0087
            if (r1 <= r6) goto L_0x0087
            int r7 = r5.f15323m     // Catch:{ Exception -> 0x008c }
            int r7 = r7 * r6
            int r0 = r5.f15322l     // Catch:{ Exception -> 0x008c }
            int r1 = r7 / r0
            goto L_0x005a
        L_0x0087:
            r0 = r1
        L_0x0088:
            r1 = r7
        L_0x0089:
            r5.setMeasuredDimension(r0, r1)     // Catch:{ Exception -> 0x008c }
        L_0x008c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C6038fm.onMeasure(int, int):void");
    }

    public C6035fl getMediaController() {
        return this.f15332v;
    }

    /* renamed from: f */
    public final boolean mo35212f() {
        C6029fg fgVar = this.f15312a;
        return (fgVar == null || fgVar.f15287a == -1 || this.f15312a.f15287a == 0 || this.f15312a.f15287a == 1) ? false : true;
    }

    public void setIsLockScreen(boolean z) {
        this.f15330t = z;
    }

    public void start() {
        boolean z;
        PowerManager powerManager = (PowerManager) getContext().getSystemService("power");
        boolean inKeyguardRestrictedInputMode = ((KeyguardManager) getContext().getSystemService("keyguard")).inKeyguardRestrictedInputMode();
        if (Build.VERSION.SDK_INT < 20) {
            z = powerManager.isScreenOn();
        } else {
            z = powerManager.isInteractive();
        }
        boolean f = mo35212f();
        C5869cj cjVar = (C5869cj) getTag();
        boolean z2 = false;
        boolean z3 = cjVar == null || ((Boolean) cjVar.f14724v.get("shouldAutoPlay")).booleanValue();
        if (f && !z3) {
            mo35206a(8, 0);
        }
        if (f && z && !this.f15312a.isPlaying() && z3 && (this.f15330t || !inKeyguardRestrictedInputMode)) {
            mo35205a((cjVar == null || ((Boolean) cjVar.f14724v.get("didCompleteQ4")).booleanValue()) ? 0 : ((Integer) cjVar.f14724v.get("seekPosition")).intValue());
            if (cjVar != null) {
                z2 = cjVar.mo34866a();
            }
            if (z2) {
                this.f15313b.mo35155b();
            } else {
                mo35227h();
            }
            this.f15312a.start();
            this.f15312a.f15287a = 3;
            mo35206a(8, 8);
            if (cjVar != null) {
                cjVar.f14724v.put("didCompleteQ4", Boolean.FALSE);
                if (((Boolean) cjVar.f14724v.get("didPause")).booleanValue()) {
                    getPlaybackEventListener().mo35185a((byte) 3);
                    cjVar.f14724v.put("didPause", Boolean.FALSE);
                } else {
                    getPlaybackEventListener().mo35185a((byte) 1);
                }
                C6050d dVar = this.f15331u;
                if (dVar != null && !dVar.hasMessages(1)) {
                    this.f15331u.sendEmptyMessage(1);
                }
            }
            C6035fl flVar = this.f15332v;
            if (flVar != null) {
                flVar.mo35192a();
            }
        }
        C6029fg fgVar = this.f15312a;
        if (fgVar != null) {
            fgVar.f15288b = 3;
        }
    }

    public void pause() {
        if (mo35212f() && this.f15312a.isPlaying()) {
            this.f15312a.pause();
            this.f15312a.f15287a = 4;
            this.f15313b.mo35154a();
            if (getTag() != null) {
                C5869cj cjVar = (C5869cj) getTag();
                cjVar.f14724v.put("didPause", Boolean.TRUE);
                cjVar.f14724v.put("seekPosition", Integer.valueOf(getCurrentPosition()));
            }
            getPlaybackEventListener().mo35185a((byte) 2);
        }
        C6029fg fgVar = this.f15312a;
        if (fgVar != null) {
            fgVar.f15288b = 4;
        }
        this.f15315d = false;
    }

    public int getDuration() {
        if (mo35212f()) {
            return this.f15312a.getDuration();
        }
        return -1;
    }

    public int getCurrentPosition() {
        if (mo35212f()) {
            return this.f15312a.getCurrentPosition();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35205a(int i) {
        if (mo35212f()) {
            this.f15312a.seekTo(i);
        }
    }

    public boolean isPlaying() {
        return mo35212f() && this.f15312a.isPlaying();
    }

    public int getBufferPercentage() {
        if (this.f15312a != null) {
            return this.f15333w;
        }
        return 0;
    }

    public boolean canPause() {
        return this.f15334x;
    }

    public boolean canSeekBackward() {
        return this.f15335y;
    }

    public boolean canSeekForward() {
        return this.f15336z;
    }

    public int getAudioSessionId() {
        if (this.f15321k == 0) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f15321k = mediaPlayer.getAudioSessionId();
            mediaPlayer.release();
        }
        return this.f15321k;
    }

    public void setVideoPath(String str) {
        setVideoURI(Uri.parse(str));
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m17972k() {
        C6029fg fgVar;
        if (this.f15318h != null && this.f15320j != null) {
            if (this.f15312a == null) {
                C5869cj cjVar = (C5869cj) getTag();
                if (1 == (cjVar != null ? ((Byte) cjVar.f14724v.get("placementType")).byteValue() : 1)) {
                    fgVar = new C6029fg();
                } else {
                    fgVar = C6029fg.m17940a();
                }
                this.f15312a = fgVar;
                int i = this.f15321k;
                if (i != 0) {
                    fgVar.setAudioSessionId(i);
                } else {
                    this.f15321k = fgVar.getAudioSessionId();
                }
                try {
                    this.f15312a.setDataSource(getContext().getApplicationContext(), this.f15318h, this.f15319i);
                } catch (IOException unused) {
                    this.f15312a.f15287a = -1;
                    this.f15312a.f15288b = -1;
                    return;
                }
            }
            try {
                C5869cj cjVar2 = (C5869cj) getTag();
                this.f15312a.setOnPreparedListener(this.f15317f);
                this.f15312a.setOnVideoSizeChangedListener(this.f15316e);
                this.f15312a.setOnCompletionListener(this.f15307A);
                this.f15312a.setOnErrorListener(this.f15310D);
                this.f15312a.setOnInfoListener(this.f15308B);
                this.f15312a.setOnBufferingUpdateListener(this.f15309C);
                this.f15312a.setSurface(this.f15320j);
                if (Build.VERSION.SDK_INT >= 26) {
                    this.f15312a.setAudioAttributes(this.f15313b.f15221a);
                } else {
                    this.f15312a.setAudioStreamType(3);
                }
                this.f15312a.prepareAsync();
                this.f15333w = 0;
                this.f15312a.f15287a = 1;
                m17976o();
                if (cjVar2 != null) {
                    if (((Boolean) cjVar2.f14724v.get("shouldAutoPlay")).booleanValue()) {
                        this.f15312a.f15288b = 3;
                    }
                    if (((Boolean) cjVar2.f14724v.get("didCompleteQ4")).booleanValue()) {
                        mo35206a(8, 0);
                        return;
                    }
                }
                mo35206a(0, 0);
            } catch (Exception e) {
                this.f15312a.f15287a = -1;
                this.f15312a.f15288b = -1;
                this.f15310D.onError(this.f15312a, 1, 0);
                C6130gj.m18161a().mo35310a(new C6167hk(e));
            }
        }
    }

    /* renamed from: g */
    public final void mo35213g() {
        if (this.f15312a != null) {
            this.f15313b.mo35156c();
            C6050d dVar = this.f15331u;
            if (dVar != null) {
                dVar.removeMessages(1);
            }
            if (getTag() != null) {
                ((C5869cj) getTag()).f14724v.put("seekPosition", Integer.valueOf(getCurrentPosition()));
            }
            this.f15312a.f15287a = 0;
            this.f15312a.f15288b = 0;
            this.f15312a.reset();
            m17973l();
            if (getTag() == null) {
                this.f15312a.mo35187b();
            } else if (((Byte) ((C5869cj) getTag()).f14724v.get("placementType")).byteValue() == 0) {
                this.f15312a.mo35187b();
            }
            this.f15312a = null;
        }
    }

    public C6006fb getAudioFocusManager() {
        return this.f15313b;
    }

    /* renamed from: a */
    public final void mo35157a() {
        m17975n();
        C6035fl flVar = this.f15332v;
        if (flVar != null) {
            flVar.mo35194c();
        }
    }

    /* renamed from: b */
    public final void mo35158b() {
        m17974m();
        C6035fl flVar = this.f15332v;
        if (flVar != null) {
            flVar.mo35195d();
        }
    }

    /* renamed from: c */
    public final void mo35159c() {
        if (isPlaying()) {
            m17975n();
            C6035fl flVar = this.f15332v;
            if (flVar != null) {
                flVar.mo35194c();
            }
        }
    }

    /* renamed from: d */
    public final void mo35160d() {
        m17974m();
        C6035fl flVar = this.f15332v;
        if (flVar != null) {
            flVar.mo35195d();
        }
    }

    /* renamed from: l */
    private void m17973l() {
        this.f15312a.setOnPreparedListener((MediaPlayer.OnPreparedListener) null);
        this.f15312a.setOnVideoSizeChangedListener((MediaPlayer.OnVideoSizeChangedListener) null);
        this.f15312a.setOnCompletionListener((MediaPlayer.OnCompletionListener) null);
        this.f15312a.setOnErrorListener((MediaPlayer.OnErrorListener) null);
        this.f15312a.setOnInfoListener((MediaPlayer.OnInfoListener) null);
        this.f15312a.setOnBufferingUpdateListener((MediaPlayer.OnBufferingUpdateListener) null);
    }

    /* renamed from: h */
    public final void mo35227h() {
        if (this.f15312a != null) {
            this.f15313b.mo35154a();
            m17974m();
        }
    }

    /* renamed from: m */
    private void m17974m() {
        C6029fg fgVar = this.f15312a;
        if (fgVar != null) {
            this.f15324n = 0;
            fgVar.setVolume(0.0f, 0.0f);
            if (getTag() != null) {
                ((C5869cj) getTag()).f14724v.put("currentMediaVolume", 0);
            }
        }
    }

    /* renamed from: i */
    public final void mo35228i() {
        if (this.f15312a == null) {
            return;
        }
        if (isPlaying()) {
            this.f15313b.mo35155b();
        } else {
            m17975n();
        }
    }

    /* renamed from: n */
    private void m17975n() {
        C6029fg fgVar = this.f15312a;
        if (fgVar != null) {
            this.f15324n = 1;
            fgVar.setVolume(1.0f, 1.0f);
            if (getTag() != null) {
                ((C5869cj) getTag()).f14724v.put("currentMediaVolume", 15);
            }
        }
    }

    public int getVolume() {
        if (mo35212f()) {
            return this.f15324n;
        }
        return -1;
    }

    /* renamed from: o */
    private void m17976o() {
        C6035fl flVar;
        if (this.f15312a != null && (flVar = this.f15332v) != null) {
            flVar.setMediaPlayer(this);
            this.f15332v.setEnabled(mo35212f());
            this.f15332v.mo35192a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35206a(int i, int i2) {
        if (this.f15312a != null) {
            ProgressBar progressBar = ((C6051fn) getParent()).getProgressBar();
            ImageView poster = ((C6051fn) getParent()).getPoster();
            progressBar.setVisibility(i);
            poster.setVisibility(i2);
        }
    }

    public int getVideoVolume() {
        if (isPlaying()) {
            return this.f15324n;
        }
        return -1;
    }

    public int getLastVolume() {
        return this.f15325o;
    }

    public void setLastVolume(int i) {
        this.f15325o = i;
    }

    public void setMediaController(C6035fl flVar) {
        if (flVar != null) {
            this.f15332v = flVar;
            m17976o();
        }
    }

    public C6049c getQuartileCompletedListener() {
        return this.f15327q;
    }

    public void setQuartileCompletedListener(C6049c cVar) {
        this.f15327q = cVar;
    }

    public C6048b getPlaybackEventListener() {
        return this.f15328r;
    }

    public void setPlaybackEventListener(C6048b bVar) {
        this.f15328r = bVar;
    }

    public void setMediaErrorListener(C6047a aVar) {
        this.f15329s = aVar;
    }

    public void setVideoURI(Uri uri) {
        this.f15318h = uri;
        this.f15319i = null;
        m17972k();
        requestLayout();
        invalidate();
    }

    /* renamed from: f */
    static /* synthetic */ void m17966f(C6038fm fmVar) {
        C6029fg fgVar = fmVar.f15312a;
        if (fgVar != null) {
            fgVar.f15287a = 5;
            fmVar.f15312a.f15288b = 5;
        }
        C6035fl flVar = fmVar.f15332v;
        if (flVar != null) {
            flVar.mo35193b();
        }
        C6050d dVar = fmVar.f15331u;
        if (dVar != null) {
            dVar.removeMessages(1);
        }
        if (fmVar.getTag() != null) {
            C5869cj cjVar = (C5869cj) fmVar.getTag();
            if (!((Boolean) cjVar.f14724v.get("didCompleteQ4")).booleanValue()) {
                cjVar.f14724v.put("didCompleteQ4", Boolean.TRUE);
                if (fmVar.getQuartileCompletedListener() != null) {
                    fmVar.getQuartileCompletedListener().mo35184a((byte) 3);
                }
            }
            cjVar.f14724v.put("didSignalVideoCompleted", Boolean.TRUE);
            if (cjVar != null) {
                cjVar.f14724v.put("didCompleteQ1", Boolean.FALSE);
                cjVar.f14724v.put("didCompleteQ2", Boolean.FALSE);
                cjVar.f14724v.put("didCompleteQ3", Boolean.FALSE);
                cjVar.f14724v.put("didPause", Boolean.FALSE);
                cjVar.f14724v.put("didStartPlaying", Boolean.FALSE);
                cjVar.f14724v.put("didQ4Fire", Boolean.FALSE);
            }
            if (cjVar.f14820C) {
                fmVar.start();
                return;
            }
            fmVar.f15313b.mo35154a();
            if (((Boolean) cjVar.f14724v.get("isFullScreen")).booleanValue()) {
                fmVar.mo35206a(8, 0);
            }
        }
    }

    /* renamed from: h */
    static /* synthetic */ void m17968h(C6038fm fmVar) {
        try {
            if (fmVar.f15318h != null) {
                String uri = fmVar.f15318h.toString();
                C5803bg.m17287a();
                C6164hh a = C6164hh.m18246a();
                List<ContentValues> a2 = a.mo35360a("asset", C5803bg.f14593a, "disk_uri=? ", new String[]{uri}, (String) null, (String) null, "created_ts DESC ", "1");
                a.mo35365b();
                C5784ax a3 = a2.isEmpty() ? null : C5803bg.m17285a(a2.get(0));
                C5784ax.C5785a aVar = new C5784ax.C5785a();
                if (a3 != null) {
                    C5784ax a4 = aVar.mo34697a(a3.f14523d, 0, 0).mo34699a();
                    C5803bg.m17287a();
                    C5803bg.m17288b(a4);
                }
            }
        } catch (Exception unused) {
        }
    }
}
