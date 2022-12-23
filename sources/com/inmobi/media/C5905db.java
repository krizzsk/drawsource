package com.inmobi.media;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.MediaController;
import android.widget.VideoView;
import com.google.android.exoplayer2.C5429C;
import com.google.common.base.Ascii;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.inmobi.media.db */
/* compiled from: MediaRenderView */
public final class C5905db extends VideoView implements Application.ActivityLifecycleCallbacks, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnPreparedListener {
    /* access modifiers changed from: private */

    /* renamed from: l */
    public static final String f14945l = C5905db.class.getSimpleName();

    /* renamed from: a */
    public C5907a f14946a;

    /* renamed from: b */
    public Bitmap f14947b;

    /* renamed from: c */
    public ViewGroup f14948c;

    /* renamed from: d */
    public C5908b f14949d;

    /* renamed from: e */
    int f14950e;

    /* renamed from: f */
    boolean f14951f;

    /* renamed from: g */
    public String f14952g;

    /* renamed from: h */
    public String f14953h;

    /* renamed from: i */
    boolean f14954i;

    /* renamed from: j */
    int f14955j;

    /* renamed from: k */
    int f14956k;

    /* renamed from: m */
    private boolean f14957m = false;

    /* renamed from: n */
    private WeakReference<Activity> f14958n;

    /* renamed from: com.inmobi.media.db$b */
    /* compiled from: MediaRenderView */
    interface C5908b {
        /* renamed from: a */
        void mo35015a();

        /* renamed from: a */
        void mo35016a(C5905db dbVar);
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onCompletion(MediaPlayer mediaPlayer) {
    }

    public C5905db(Activity activity) {
        super(activity);
        setZOrderOnTop(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
        if (Build.VERSION.SDK_INT < 28) {
            setDrawingCacheEnabled(true);
        }
        this.f14950e = 100;
        this.f14955j = -1;
        this.f14956k = 0;
        this.f14951f = false;
        this.f14958n = new WeakReference<>(activity);
        C6183hw.m18312a((Context) activity, (Application.ActivityLifecycleCallbacks) this);
    }

    /* access modifiers changed from: protected */
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        getHolder().setSizeFromLayout();
    }

    /* access modifiers changed from: protected */
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            Context c = C6183hw.m18324c();
            if (c != null) {
                setBackground(new BitmapDrawable(c.getResources(), this.f14947b));
                return;
            }
            return;
        }
        setBackgroundDrawable(new BitmapDrawable(this.f14947b));
    }

    public final boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        mo34993a();
        return false;
    }

    public final void onPrepared(MediaPlayer mediaPlayer) {
        mediaPlayer.setOnVideoSizeChangedListener(new MediaPlayer.OnVideoSizeChangedListener() {
            public final void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
                String unused = C5905db.f14945l;
                if (C5905db.this.f14946a == null) {
                    C5907a unused2 = C5905db.this.f14946a = new C5907a(C5905db.this.getContext());
                    C5905db.this.f14946a.setAnchorView(C5905db.this);
                    C5905db dbVar = C5905db.this;
                    dbVar.setMediaController(dbVar.f14946a);
                    C5905db.this.requestLayout();
                    C5905db.this.requestFocus();
                }
            }
        });
        int i = this.f14956k;
        if (i < getDuration()) {
            this.f14956k = i;
            seekTo(i);
        }
        this.f14954i = true;
        this.f14949d.mo35015a();
        start();
    }

    public final void setPlaybackData(String str) {
        this.f14953h = m17575a(str);
        this.f14952g = "anonymous";
        if (this.f14947b == null) {
            this.f14947b = Bitmap.createBitmap(24, 24, Bitmap.Config.ARGB_8888);
            this.f14947b = m17576b(this.f14953h);
        }
    }

    public final void start() {
        if (!this.f14957m) {
            super.start();
        }
    }

    public final void pause() {
        super.pause();
    }

    /* renamed from: a */
    public final void mo34993a() {
        stopPlayback();
        m17578c();
        super.setMediaController((MediaController) null);
        this.f14946a = null;
        C5908b bVar = this.f14949d;
        if (bVar != null) {
            bVar.mo35016a(this);
        }
    }

    public final ViewGroup getViewContainer() {
        return this.f14948c;
    }

    public final void setViewContainer(ViewGroup viewGroup) {
        this.f14948c = viewGroup;
    }

    public final void setListener(C5908b bVar) {
        this.f14949d = bVar;
    }

    /* renamed from: c */
    private void m17578c() {
        ViewGroup viewGroup = this.f14948c;
        if (viewGroup != null) {
            ViewGroup viewGroup2 = (ViewGroup) viewGroup.getParent();
            if (viewGroup2 != null) {
                viewGroup2.removeView(this.f14948c);
            }
            ViewGroup viewGroup3 = (ViewGroup) getParent();
            if (viewGroup3 != null) {
                viewGroup3.removeView(this);
            }
            setBackgroundColor(0);
            this.f14948c = null;
        }
    }

    /* renamed from: a */
    public static String m17575a(String str) {
        byte[] bytes = str.getBytes();
        StringBuilder sb = new StringBuilder();
        for (byte b : bytes) {
            if ((b & 128) > 0) {
                sb.append("%");
                char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
                sb.append(new String(new char[]{cArr[(b >> 4) & 15], cArr[b & Ascii.f18305SI]}));
            } else {
                sb.append((char) b);
            }
        }
        try {
            return new String(sb.toString().getBytes(), C5429C.ISO88591_NAME);
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    /* renamed from: b */
    public static Bitmap m17576b(String str) {
        try {
            return (Bitmap) Class.forName("android.media.ThumbnailUtils").getDeclaredMethod("createVideoThumbnail", new Class[]{String.class, Integer.TYPE}).invoke((Object) null, new Object[]{str, 1});
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: com.inmobi.media.db$a */
    /* compiled from: MediaRenderView */
    public static class C5907a extends MediaController {
        public C5907a(Context context) {
            super(context);
        }

        public final void show(int i) {
            super.show(i);
            if (Build.VERSION.SDK_INT < 19) {
                try {
                    Field declaredField = MediaController.class.getDeclaredField("mAnchor");
                    declaredField.setAccessible(true);
                    View view = (View) declaredField.get(this);
                    Field declaredField2 = MediaController.class.getDeclaredField("mDecor");
                    declaredField2.setAccessible(true);
                    View view2 = (View) declaredField2.get(this);
                    Field declaredField3 = MediaController.class.getDeclaredField("mDecorLayoutParams");
                    declaredField3.setAccessible(true);
                    WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) declaredField3.get(this);
                    Field declaredField4 = MediaController.class.getDeclaredField("mWindowManager");
                    declaredField4.setAccessible(true);
                    int[] iArr = new int[2];
                    view.getLocationOnScreen(iArr);
                    view2.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(view.getHeight(), Integer.MIN_VALUE));
                    view2.setPadding(0, 0, 0, 0);
                    layoutParams.verticalMargin = 0.0f;
                    layoutParams.horizontalMargin = 0.0f;
                    layoutParams.width = view.getWidth();
                    layoutParams.gravity = 8388659;
                    layoutParams.x = iArr[0];
                    layoutParams.y = (iArr[1] + view.getHeight()) - view2.getMeasuredHeight();
                    ((WindowManager) declaredField4.get(this)).updateViewLayout(view2, layoutParams);
                } catch (Exception unused) {
                }
            }
        }
    }

    public final void onActivityStarted(Activity activity) {
        if (this.f14958n.get() != null && ((Activity) this.f14958n.get()).equals(activity)) {
            this.f14957m = false;
            start();
        }
    }

    public final void onActivityStopped(Activity activity) {
        Activity activity2 = (Activity) this.f14958n.get();
        if (activity2 != null && activity2.equals(activity)) {
            this.f14957m = true;
            if (getCurrentPosition() != 0) {
                this.f14956k = getCurrentPosition();
            }
            pause();
        }
    }

    public final void onActivityDestroyed(Activity activity) {
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
    }
}
