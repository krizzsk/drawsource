package com.saygames.saypromo.p378a;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import com.saygames.saypromo.SayPromoThrowable;
import com.saygames.saypromo.widget.SayPromoVideoView;
import java.io.File;

/* renamed from: com.saygames.saypromo.a.d6 */
public abstract class C10586d6 extends TextureView {

    /* renamed from: a */
    private float f26098a;

    /* renamed from: b */
    private float f26099b;

    /* renamed from: c */
    private C10578c6 f26100c;

    /* renamed from: d */
    private MediaPlayer f26101d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Surface f26102e;

    /* renamed from: f */
    private Uri f26103f;

    /* renamed from: g */
    private int f26104g;

    /* renamed from: h */
    private int f26105h;

    public C10586d6(Context context) {
        super(context);
        setSurfaceTextureListener(new C10570b6((SayPromoVideoView) this));
        setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                C10586d6.m30377a(C10586d6.this, view);
            }
        });
    }

    public C10586d6(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setSurfaceTextureListener(new C10570b6((SayPromoVideoView) this));
        setOnClickListener(new View.OnClickListener() {
            public final void onClick(View view) {
                C10586d6.m30377a(C10586d6.this, view);
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m30375a(C10586d6 d6Var, MediaPlayer mediaPlayer) {
        C10578c6 c6Var = d6Var.f26100c;
        if (c6Var != null) {
            ((C10534X) c6Var).mo65393a();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final void m30377a(C10586d6 d6Var, View view) {
        C10578c6 c6Var = d6Var.f26100c;
        if (c6Var != null) {
            ((C10534X) c6Var).mo65394a(d6Var.f26098a, d6Var.f26099b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static final boolean m30378a(C10586d6 d6Var, MediaPlayer mediaPlayer, int i, int i2) {
        SayPromoThrowable.Show.Video video = new SayPromoThrowable.Show.Video("what=" + i + ", extra=" + i2);
        C10578c6 c6Var = d6Var.f26100c;
        if (c6Var == null) {
            return true;
        }
        ((C10534X) c6Var).mo65396a(video);
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m30379b() {
        Uri uri;
        Surface surface = this.f26102e;
        if (surface != null && (uri = this.f26103f) != null) {
            MediaPlayer mediaPlayer = new MediaPlayer();
            this.f26101d = mediaPlayer;
            mediaPlayer.setSurface(surface);
            mediaPlayer.setDataSource(getContext(), uri);
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                public final void onCompletion(MediaPlayer mediaPlayer) {
                    C10586d6.m30375a(C10586d6.this, mediaPlayer);
                }
            });
            mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() {
                public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
                    return C10586d6.m30378a(C10586d6.this, mediaPlayer, i, i2);
                }
            });
            mediaPlayer.setOnInfoListener(new MediaPlayer.OnInfoListener() {
                public final boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
                    return C10586d6.m30381b(C10586d6.this, mediaPlayer, i, i2);
                }
            });
            mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                public final void onPrepared(MediaPlayer mediaPlayer) {
                    C10586d6.m30380b(C10586d6.this, mediaPlayer);
                }
            });
            mediaPlayer.prepareAsync();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final void m30380b(C10586d6 d6Var, MediaPlayer mediaPlayer) {
        mediaPlayer.start();
        C10578c6 c6Var = d6Var.f26100c;
        if (c6Var != null) {
            ((C10534X) c6Var).mo65395a(0, mediaPlayer.getDuration());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m30381b(C10586d6 d6Var, MediaPlayer mediaPlayer, int i, int i2) {
        if (i != 805) {
            return false;
        }
        SayPromoThrowable.Show.Video video = new SayPromoThrowable.Show.Video("what=" + i + ", extra=" + i2);
        C10578c6 c6Var = d6Var.f26100c;
        if (c6Var == null) {
            return true;
        }
        ((C10534X) c6Var).mo65396a(video);
        return true;
    }

    /* renamed from: a */
    public final int mo65439a() {
        MediaPlayer mediaPlayer = this.f26101d;
        if (mediaPlayer != null) {
            return mediaPlayer.getCurrentPosition();
        }
        return 0;
    }

    /* renamed from: a */
    public final void mo65440a(int i, int i2) {
        this.f26104g = i;
        this.f26105h = i2;
        requestLayout();
    }

    /* renamed from: a */
    public final void mo65441a(C10534X x) {
        this.f26100c = x;
    }

    /* renamed from: a */
    public final void mo65442a(File file) {
        mo65445e();
        this.f26103f = Uri.fromFile(file);
        m30379b();
    }

    /* renamed from: c */
    public final void mo65443c() {
        MediaPlayer mediaPlayer = this.f26101d;
        if (mediaPlayer != null && mediaPlayer.isPlaying()) {
            mediaPlayer.pause();
        }
    }

    /* renamed from: d */
    public final void mo65444d() {
        MediaPlayer mediaPlayer = this.f26101d;
        if (mediaPlayer != null && !mediaPlayer.isPlaying()) {
            mediaPlayer.start();
            C10578c6 c6Var = this.f26100c;
            if (c6Var != null) {
                ((C10534X) c6Var).mo65395a(mediaPlayer.getCurrentPosition(), mediaPlayer.getDuration());
            }
        }
    }

    /* renamed from: e */
    public final void mo65445e() {
        this.f26103f = null;
        MediaPlayer mediaPlayer = this.f26101d;
        if (mediaPlayer != null) {
            this.f26101d = null;
            if (mediaPlayer.isPlaying()) {
                mediaPlayer.stop();
            }
            mediaPlayer.release();
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3 = this.f26104g;
        int i4 = this.f26105h;
        if (i3 <= 0 || i4 <= 0) {
            setMeasuredDimension(0, 0);
            return;
        }
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int i5 = i4 * size;
        int i6 = i3 * size2;
        if (i5 < i6) {
            setMeasuredDimension(i5 / i3, size);
        } else if (i5 > i6) {
            setMeasuredDimension(size2, i6 / i4);
        } else {
            setMeasuredDimension(size2, size);
        }
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f26098a = motionEvent.getX() / ((float) getWidth());
            this.f26099b = motionEvent.getY() / ((float) getHeight());
        }
        return super.onTouchEvent(motionEvent);
    }
}
