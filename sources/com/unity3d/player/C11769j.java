package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import android.media.MediaPlayer;
import android.util.Log;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.MediaController;

/* renamed from: com.unity3d.player.j */
public final class C11769j extends FrameLayout implements MediaPlayer.OnBufferingUpdateListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnPreparedListener, MediaPlayer.OnVideoSizeChangedListener, SurfaceHolder.Callback, MediaController.MediaPlayerControl {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static boolean f28465a = false;

    /* renamed from: b */
    private final Context f28466b;

    /* renamed from: c */
    private final SurfaceView f28467c;

    /* renamed from: d */
    private final SurfaceHolder f28468d;

    /* renamed from: e */
    private final String f28469e;

    /* renamed from: f */
    private final int f28470f;

    /* renamed from: g */
    private final int f28471g;

    /* renamed from: h */
    private final boolean f28472h;

    /* renamed from: i */
    private final long f28473i;

    /* renamed from: j */
    private final long f28474j;

    /* renamed from: k */
    private final FrameLayout f28475k;

    /* renamed from: l */
    private final Display f28476l;

    /* renamed from: m */
    private int f28477m;

    /* renamed from: n */
    private int f28478n;

    /* renamed from: o */
    private int f28479o;

    /* renamed from: p */
    private int f28480p;

    /* renamed from: q */
    private MediaPlayer f28481q;

    /* renamed from: r */
    private MediaController f28482r;

    /* renamed from: s */
    private boolean f28483s = false;

    /* renamed from: t */
    private boolean f28484t = false;

    /* renamed from: u */
    private int f28485u = 0;

    /* renamed from: v */
    private boolean f28486v = false;

    /* renamed from: w */
    private boolean f28487w = false;

    /* renamed from: x */
    private C11770a f28488x;

    /* renamed from: y */
    private C11771b f28489y;

    /* renamed from: z */
    private volatile int f28490z = 0;

    /* renamed from: com.unity3d.player.j$a */
    public interface C11770a {
        /* renamed from: a */
        void mo70598a(int i);
    }

    /* renamed from: com.unity3d.player.j$b */
    public class C11771b implements Runnable {

        /* renamed from: b */
        private C11769j f28492b;

        /* renamed from: c */
        private boolean f28493c = false;

        public C11771b(C11769j jVar) {
            this.f28492b = jVar;
        }

        /* renamed from: a */
        public final void mo70599a() {
            this.f28493c = true;
        }

        public final void run() {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
            if (!this.f28493c) {
                if (C11769j.f28465a) {
                    C11769j.m32192b("Stopping the video player due to timeout.");
                }
                this.f28492b.CancelOnPrepare();
            }
        }
    }

    protected C11769j(Context context, String str, int i, int i2, int i3, boolean z, long j, long j2, C11770a aVar) {
        super(context);
        this.f28488x = aVar;
        this.f28466b = context;
        this.f28475k = this;
        SurfaceView surfaceView = new SurfaceView(context);
        this.f28467c = surfaceView;
        SurfaceHolder holder = surfaceView.getHolder();
        this.f28468d = holder;
        holder.addCallback(this);
        this.f28475k.setBackgroundColor(i);
        this.f28475k.addView(this.f28467c);
        this.f28476l = ((WindowManager) this.f28466b.getSystemService("window")).getDefaultDisplay();
        this.f28469e = str;
        this.f28470f = i2;
        this.f28471g = i3;
        this.f28472h = z;
        this.f28473i = j;
        this.f28474j = j2;
        if (f28465a) {
            m32192b("fileName: " + this.f28469e);
        }
        if (f28465a) {
            m32192b("backgroundColor: " + i);
        }
        if (f28465a) {
            m32192b("controlMode: " + this.f28470f);
        }
        if (f28465a) {
            m32192b("scalingMode: " + this.f28471g);
        }
        if (f28465a) {
            m32192b("isURL: " + this.f28472h);
        }
        if (f28465a) {
            m32192b("videoOffset: " + this.f28473i);
        }
        if (f28465a) {
            m32192b("videoLength: " + this.f28474j);
        }
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    /* renamed from: a */
    private void m32190a(int i) {
        this.f28490z = i;
        C11770a aVar = this.f28488x;
        if (aVar != null) {
            aVar.mo70598a(this.f28490z);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static void m32192b(String str) {
        Log.i("Video", "VideoPlayer: " + str);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:17|18|19|20|21) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x007d */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m32194c() {
        /*
            r8 = this;
            android.media.MediaPlayer r0 = r8.f28481q
            if (r0 == 0) goto L_0x001c
            android.view.SurfaceHolder r1 = r8.f28468d
            r0.setDisplay(r1)
            boolean r0 = r8.f28486v
            if (r0 != 0) goto L_0x001b
            boolean r0 = f28465a
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = "Resuming playback"
            m32192b(r0)
        L_0x0016:
            android.media.MediaPlayer r0 = r8.f28481q
            r0.start()
        L_0x001b:
            return
        L_0x001c:
            r0 = 0
            r8.m32190a((int) r0)
            r8.doCleanUp()
            android.media.MediaPlayer r0 = new android.media.MediaPlayer     // Catch:{ Exception -> 0x00cc }
            r0.<init>()     // Catch:{ Exception -> 0x00cc }
            r8.f28481q = r0     // Catch:{ Exception -> 0x00cc }
            boolean r1 = r8.f28472h     // Catch:{ Exception -> 0x00cc }
            if (r1 == 0) goto L_0x003a
            android.content.Context r1 = r8.f28466b     // Catch:{ Exception -> 0x00cc }
            java.lang.String r2 = r8.f28469e     // Catch:{ Exception -> 0x00cc }
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch:{ Exception -> 0x00cc }
            r0.setDataSource(r1, r2)     // Catch:{ Exception -> 0x00cc }
            goto L_0x008e
        L_0x003a:
            long r0 = r8.f28474j     // Catch:{ Exception -> 0x00cc }
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x005a
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ Exception -> 0x00cc }
            java.lang.String r1 = r8.f28469e     // Catch:{ Exception -> 0x00cc }
            r0.<init>(r1)     // Catch:{ Exception -> 0x00cc }
            android.media.MediaPlayer r2 = r8.f28481q     // Catch:{ Exception -> 0x00cc }
            java.io.FileDescriptor r3 = r0.getFD()     // Catch:{ Exception -> 0x00cc }
            long r4 = r8.f28473i     // Catch:{ Exception -> 0x00cc }
            long r6 = r8.f28474j     // Catch:{ Exception -> 0x00cc }
            r2.setDataSource(r3, r4, r6)     // Catch:{ Exception -> 0x00cc }
        L_0x0056:
            r0.close()     // Catch:{ Exception -> 0x00cc }
            goto L_0x008e
        L_0x005a:
            android.content.res.Resources r0 = r8.getResources()     // Catch:{ Exception -> 0x00cc }
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch:{ Exception -> 0x00cc }
            java.lang.String r1 = r8.f28469e     // Catch:{ IOException -> 0x007d }
            android.content.res.AssetFileDescriptor r0 = r0.openFd(r1)     // Catch:{ IOException -> 0x007d }
            android.media.MediaPlayer r1 = r8.f28481q     // Catch:{ IOException -> 0x007d }
            java.io.FileDescriptor r2 = r0.getFileDescriptor()     // Catch:{ IOException -> 0x007d }
            long r3 = r0.getStartOffset()     // Catch:{ IOException -> 0x007d }
            long r5 = r0.getLength()     // Catch:{ IOException -> 0x007d }
            r1.setDataSource(r2, r3, r5)     // Catch:{ IOException -> 0x007d }
            r0.close()     // Catch:{ IOException -> 0x007d }
            goto L_0x008e
        L_0x007d:
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ Exception -> 0x00cc }
            java.lang.String r1 = r8.f28469e     // Catch:{ Exception -> 0x00cc }
            r0.<init>(r1)     // Catch:{ Exception -> 0x00cc }
            android.media.MediaPlayer r1 = r8.f28481q     // Catch:{ Exception -> 0x00cc }
            java.io.FileDescriptor r2 = r0.getFD()     // Catch:{ Exception -> 0x00cc }
            r1.setDataSource(r2)     // Catch:{ Exception -> 0x00cc }
            goto L_0x0056
        L_0x008e:
            android.media.MediaPlayer r0 = r8.f28481q     // Catch:{ Exception -> 0x00cc }
            android.view.SurfaceHolder r1 = r8.f28468d     // Catch:{ Exception -> 0x00cc }
            r0.setDisplay(r1)     // Catch:{ Exception -> 0x00cc }
            android.media.MediaPlayer r0 = r8.f28481q     // Catch:{ Exception -> 0x00cc }
            r1 = 1
            r0.setScreenOnWhilePlaying(r1)     // Catch:{ Exception -> 0x00cc }
            android.media.MediaPlayer r0 = r8.f28481q     // Catch:{ Exception -> 0x00cc }
            r0.setOnBufferingUpdateListener(r8)     // Catch:{ Exception -> 0x00cc }
            android.media.MediaPlayer r0 = r8.f28481q     // Catch:{ Exception -> 0x00cc }
            r0.setOnCompletionListener(r8)     // Catch:{ Exception -> 0x00cc }
            android.media.MediaPlayer r0 = r8.f28481q     // Catch:{ Exception -> 0x00cc }
            r0.setOnPreparedListener(r8)     // Catch:{ Exception -> 0x00cc }
            android.media.MediaPlayer r0 = r8.f28481q     // Catch:{ Exception -> 0x00cc }
            r0.setOnVideoSizeChangedListener(r8)     // Catch:{ Exception -> 0x00cc }
            android.media.MediaPlayer r0 = r8.f28481q     // Catch:{ Exception -> 0x00cc }
            r1 = 3
            r0.setAudioStreamType(r1)     // Catch:{ Exception -> 0x00cc }
            android.media.MediaPlayer r0 = r8.f28481q     // Catch:{ Exception -> 0x00cc }
            r0.prepareAsync()     // Catch:{ Exception -> 0x00cc }
            com.unity3d.player.j$b r0 = new com.unity3d.player.j$b     // Catch:{ Exception -> 0x00cc }
            r0.<init>(r8)     // Catch:{ Exception -> 0x00cc }
            r8.f28489y = r0     // Catch:{ Exception -> 0x00cc }
            java.lang.Thread r0 = new java.lang.Thread     // Catch:{ Exception -> 0x00cc }
            com.unity3d.player.j$b r1 = r8.f28489y     // Catch:{ Exception -> 0x00cc }
            r0.<init>(r1)     // Catch:{ Exception -> 0x00cc }
            r0.start()     // Catch:{ Exception -> 0x00cc }
            return
        L_0x00cc:
            r0 = move-exception
            boolean r1 = f28465a
            if (r1 == 0) goto L_0x00e9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "error: "
            r1.<init>(r2)
            java.lang.String r2 = r0.getMessage()
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            m32192b(r0)
        L_0x00e9:
            r0 = 2
            r8.m32190a((int) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.player.C11769j.m32194c():void");
    }

    /* renamed from: d */
    private void m32195d() {
        if (!isPlaying()) {
            m32190a(1);
            if (f28465a) {
                m32192b("startVideoPlayback");
            }
            updateVideoLayout();
            if (!this.f28486v) {
                start();
            }
        }
    }

    public final void CancelOnPrepare() {
        m32190a(2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo70574a() {
        return this.f28486v;
    }

    public final boolean canPause() {
        return true;
    }

    public final boolean canSeekBackward() {
        return true;
    }

    public final boolean canSeekForward() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final void destroyPlayer() {
        if (f28465a) {
            m32192b("destroyPlayer");
        }
        if (!this.f28486v) {
            pause();
        }
        doCleanUp();
    }

    /* access modifiers changed from: protected */
    public final void doCleanUp() {
        C11771b bVar = this.f28489y;
        if (bVar != null) {
            bVar.mo70599a();
            this.f28489y = null;
        }
        MediaPlayer mediaPlayer = this.f28481q;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.f28481q = null;
        }
        this.f28479o = 0;
        this.f28480p = 0;
        this.f28484t = false;
        this.f28483s = false;
    }

    public final int getAudioSessionId() {
        MediaPlayer mediaPlayer = this.f28481q;
        if (mediaPlayer == null) {
            return 0;
        }
        return mediaPlayer.getAudioSessionId();
    }

    public final int getBufferPercentage() {
        if (this.f28472h) {
            return this.f28485u;
        }
        return 100;
    }

    public final int getCurrentPosition() {
        MediaPlayer mediaPlayer = this.f28481q;
        if (mediaPlayer == null) {
            return 0;
        }
        return mediaPlayer.getCurrentPosition();
    }

    public final int getDuration() {
        MediaPlayer mediaPlayer = this.f28481q;
        if (mediaPlayer == null) {
            return 0;
        }
        return mediaPlayer.getDuration();
    }

    public final boolean isPlaying() {
        boolean z = this.f28484t && this.f28483s;
        MediaPlayer mediaPlayer = this.f28481q;
        return mediaPlayer == null ? !z : mediaPlayer.isPlaying() || !z;
    }

    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
        if (f28465a) {
            m32192b("onBufferingUpdate percent:" + i);
        }
        this.f28485u = i;
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
        if (f28465a) {
            m32192b("onCompletion called");
        }
        destroyPlayer();
        m32190a(3);
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 || (this.f28470f == 2 && i != 0 && !keyEvent.isSystem())) {
            destroyPlayer();
            m32190a(3);
            return true;
        }
        MediaController mediaController = this.f28482r;
        return mediaController != null ? mediaController.onKeyDown(i, keyEvent) : super.onKeyDown(i, keyEvent);
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        if (f28465a) {
            m32192b("onPrepared called");
        }
        C11771b bVar = this.f28489y;
        if (bVar != null) {
            bVar.mo70599a();
            this.f28489y = null;
        }
        int i = this.f28470f;
        if (i == 0 || i == 1) {
            MediaController mediaController = new MediaController(this.f28466b);
            this.f28482r = mediaController;
            mediaController.setMediaPlayer(this);
            this.f28482r.setAnchorView(this);
            this.f28482r.setEnabled(true);
            Context context = this.f28466b;
            if (context instanceof Activity) {
                this.f28482r.setSystemUiVisibility(((Activity) context).getWindow().getDecorView().getSystemUiVisibility());
            }
            this.f28482r.show();
        }
        this.f28484t = true;
        if (1 != 0 && this.f28483s) {
            m32195d();
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        if (this.f28470f == 2 && action == 0) {
            destroyPlayer();
            m32190a(3);
            return true;
        }
        MediaController mediaController = this.f28482r;
        return mediaController != null ? mediaController.onTouchEvent(motionEvent) : super.onTouchEvent(motionEvent);
    }

    public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
        if (f28465a) {
            m32192b("onVideoSizeChanged called " + i + "x" + i2);
        }
        if (i != 0 && i2 != 0) {
            this.f28483s = true;
            this.f28479o = i;
            this.f28480p = i2;
            if (this.f28484t && 1 != 0) {
                m32195d();
            }
        } else if (f28465a) {
            m32192b("invalid video width(" + i + ") or height(" + i2 + ")");
        }
    }

    public final void pause() {
        MediaPlayer mediaPlayer = this.f28481q;
        if (mediaPlayer != null) {
            if (this.f28487w) {
                mediaPlayer.pause();
            }
            this.f28486v = true;
        }
    }

    public final void seekTo(int i) {
        MediaPlayer mediaPlayer = this.f28481q;
        if (mediaPlayer != null) {
            mediaPlayer.seekTo(i);
        }
    }

    public final void start() {
        if (f28465a) {
            m32192b("Start");
        }
        MediaPlayer mediaPlayer = this.f28481q;
        if (mediaPlayer != null) {
            if (this.f28487w) {
                mediaPlayer.start();
            }
            this.f28486v = false;
        }
    }

    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (f28465a) {
            m32192b("surfaceChanged called " + i + " " + i2 + "x" + i3);
        }
        if (this.f28477m != i2 || this.f28478n != i3) {
            this.f28477m = i2;
            this.f28478n = i3;
            if (this.f28487w) {
                updateVideoLayout();
            }
        }
    }

    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        if (f28465a) {
            m32192b("surfaceCreated called");
        }
        this.f28487w = true;
        m32194c();
    }

    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        if (f28465a) {
            m32192b("surfaceDestroyed called");
        }
        this.f28487w = false;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        if (r5 <= r3) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0053, code lost:
        r0 = (int) (((float) r1) * r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005c, code lost:
        if (r5 >= r3) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void updateVideoLayout() {
        /*
            r8 = this;
            boolean r0 = f28465a
            if (r0 == 0) goto L_0x0009
            java.lang.String r0 = "updateVideoLayout"
            m32192b(r0)
        L_0x0009:
            android.media.MediaPlayer r0 = r8.f28481q
            if (r0 != 0) goto L_0x000e
            return
        L_0x000e:
            int r0 = r8.f28477m
            if (r0 == 0) goto L_0x0016
            int r0 = r8.f28478n
            if (r0 != 0) goto L_0x0034
        L_0x0016:
            android.content.Context r0 = r8.f28466b
            java.lang.String r1 = "window"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.util.DisplayMetrics r1 = new android.util.DisplayMetrics
            r1.<init>()
            android.view.Display r0 = r0.getDefaultDisplay()
            r0.getMetrics(r1)
            int r0 = r1.widthPixels
            r8.f28477m = r0
            int r0 = r1.heightPixels
            r8.f28478n = r0
        L_0x0034:
            int r0 = r8.f28477m
            int r1 = r8.f28478n
            boolean r2 = r8.f28483s
            if (r2 == 0) goto L_0x0064
            int r2 = r8.f28479o
            float r3 = (float) r2
            int r4 = r8.f28480p
            float r5 = (float) r4
            float r3 = r3 / r5
            float r5 = (float) r0
            float r6 = (float) r1
            float r5 = r5 / r6
            int r6 = r8.f28471g
            r7 = 1
            if (r6 != r7) goto L_0x0057
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 > 0) goto L_0x0053
        L_0x004f:
            float r1 = (float) r0
            float r1 = r1 / r3
            int r1 = (int) r1
            goto L_0x006d
        L_0x0053:
            float r0 = (float) r1
            float r0 = r0 * r3
            int r0 = (int) r0
            goto L_0x006d
        L_0x0057:
            r7 = 2
            if (r6 != r7) goto L_0x005f
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 < 0) goto L_0x0053
            goto L_0x004f
        L_0x005f:
            if (r6 != 0) goto L_0x006d
            r0 = r2
            r1 = r4
            goto L_0x006d
        L_0x0064:
            boolean r2 = f28465a
            if (r2 == 0) goto L_0x006d
            java.lang.String r2 = "updateVideoLayout: Video size is not known yet"
            m32192b(r2)
        L_0x006d:
            int r2 = r8.f28477m
            if (r2 != r0) goto L_0x0075
            int r2 = r8.f28478n
            if (r2 == r1) goto L_0x00a0
        L_0x0075:
            boolean r2 = f28465a
            if (r2 == 0) goto L_0x0092
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "frameWidth = "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r3 = "; frameHeight = "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            m32192b(r2)
        L_0x0092:
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = 17
            r2.<init>(r0, r1, r3)
            android.widget.FrameLayout r0 = r8.f28475k
            android.view.SurfaceView r1 = r8.f28467c
            r0.updateViewLayout(r1, r2)
        L_0x00a0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.player.C11769j.updateVideoLayout():void");
    }
}
