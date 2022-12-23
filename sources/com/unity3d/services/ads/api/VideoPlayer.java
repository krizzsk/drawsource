package com.unity3d.services.ads.api;

import android.os.Build;
import com.unity3d.services.ads.video.C11915a;
import com.unity3d.services.ads.video.C11916b;
import com.unity3d.services.ads.video.C11917c;
import com.unity3d.services.core.log.C12065a;
import com.unity3d.services.core.misc.C12080j;
import com.unity3d.services.core.webview.C12143b;
import com.unity3d.services.core.webview.bridge.C12160l;
import com.unity3d.services.core.webview.bridge.WebViewExposed;

public class VideoPlayer {

    /* renamed from: a */
    private static C11917c f28722a;

    /* renamed from: com.unity3d.services.ads.api.VideoPlayer$a */
    static class C11825a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Integer f28723a;

        C11825a(Integer num) {
            this.f28723a = num;
        }

        public void run() {
            if (VideoPlayer.getVideoPlayerView() != null) {
                VideoPlayer.getVideoPlayerView().setProgressEventInterval(this.f28723a.intValue());
            }
        }
    }

    /* renamed from: com.unity3d.services.ads.api.VideoPlayer$b */
    static class C11826b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f28724a;

        /* renamed from: b */
        final /* synthetic */ Double f28725b;

        /* renamed from: c */
        final /* synthetic */ Integer f28726c;

        C11826b(String str, Double d, Integer num) {
            this.f28724a = str;
            this.f28725b = d;
            this.f28726c = num;
        }

        public void run() {
            if (VideoPlayer.getVideoPlayerView() != null) {
                VideoPlayer.getVideoPlayerView().mo70866a(this.f28724a, this.f28725b.floatValue(), this.f28726c.intValue());
            }
        }
    }

    /* renamed from: com.unity3d.services.ads.api.VideoPlayer$c */
    static class C11827c implements Runnable {
        C11827c() {
        }

        public void run() {
            if (VideoPlayer.getVideoPlayerView() != null) {
                VideoPlayer.getVideoPlayerView().mo70865a();
            }
        }
    }

    /* renamed from: com.unity3d.services.ads.api.VideoPlayer$d */
    static class C11828d implements Runnable {
        C11828d() {
        }

        public void run() {
            if (VideoPlayer.getVideoPlayerView() != null) {
                VideoPlayer.getVideoPlayerView().pause();
            }
        }
    }

    /* renamed from: com.unity3d.services.ads.api.VideoPlayer$e */
    static class C11829e implements Runnable {
        C11829e() {
        }

        public void run() {
            if (VideoPlayer.getVideoPlayerView() != null) {
                VideoPlayer.getVideoPlayerView().mo70867c();
            }
        }
    }

    /* renamed from: com.unity3d.services.ads.api.VideoPlayer$f */
    static class C11830f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Integer f28727a;

        C11830f(Integer num) {
            this.f28727a = num;
        }

        public void run() {
            if (VideoPlayer.getVideoPlayerView() != null) {
                VideoPlayer.getVideoPlayerView().seekTo(this.f28727a.intValue());
            }
        }
    }

    @WebViewExposed
    public static void getCurrentPosition(C12160l lVar) {
        if (getVideoPlayerView() != null) {
            lVar.mo71347a(Integer.valueOf(getVideoPlayerView().getCurrentPosition()));
            return;
        }
        lVar.mo71346a(C11915a.VIDEOVIEW_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void getProgressEventInterval(C12160l lVar) {
        if (getVideoPlayerView() != null) {
            lVar.mo71347a(Integer.valueOf(getVideoPlayerView().getProgressEventInterval()));
            return;
        }
        lVar.mo71346a(C11915a.VIDEOVIEW_NULL, new Object[0]);
    }

    public static C11917c getVideoPlayerView() {
        return f28722a;
    }

    @WebViewExposed
    public static void getVideoViewRectangle(C12160l lVar) {
        C11917c videoPlayerView = getVideoPlayerView();
        if (videoPlayerView != null) {
            int[] videoViewRectangle = videoPlayerView.getVideoViewRectangle();
            lVar.mo71347a(Integer.valueOf(videoViewRectangle[0]), Integer.valueOf(videoViewRectangle[1]), Integer.valueOf(videoViewRectangle[2]), Integer.valueOf(videoViewRectangle[3]));
            return;
        }
        lVar.mo71346a(C11915a.VIDEOVIEW_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void getVolume(C12160l lVar) {
        if (getVideoPlayerView() != null) {
            lVar.mo71347a(Float.valueOf(getVideoPlayerView().getVolume()));
            return;
        }
        lVar.mo71346a(C11915a.VIDEOVIEW_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void pause(C12160l lVar) {
        C12065a.m32845b("Pausing current video");
        C12080j.m32879a((Runnable) new C11828d());
        if (getVideoPlayerView() != null) {
            lVar.mo71347a(new Object[0]);
        } else {
            lVar.mo71346a(C11915a.VIDEOVIEW_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void play(C12160l lVar) {
        C12065a.m32845b("Starting playback of prepared video");
        C12080j.m32879a((Runnable) new C11827c());
        if (getVideoPlayerView() != null) {
            lVar.mo71347a(new Object[0]);
        } else {
            lVar.mo71346a(C11915a.VIDEOVIEW_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void prepare(String str, Double d, C12160l lVar) {
        prepare(str, d, 0, lVar);
    }

    @WebViewExposed
    public static void seekTo(Integer num, C12160l lVar) {
        C12065a.m32845b("Seeking video to time: " + num);
        C12080j.m32879a((Runnable) new C11830f(num));
        if (getVideoPlayerView() != null) {
            lVar.mo71347a(new Object[0]);
        } else {
            lVar.mo71346a(C11915a.VIDEOVIEW_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void setInfoListenerEnabled(boolean z, C12160l lVar) {
        int i = Build.VERSION.SDK_INT;
        if (i <= 16) {
            lVar.mo71346a(C11915a.API_LEVEL_ERROR, Integer.valueOf(i), Boolean.valueOf(z));
        } else if (getVideoPlayerView() != null) {
            getVideoPlayerView().setInfoListenerEnabled(z);
            lVar.mo71347a(C12143b.VIDEOPLAYER, C11916b.INFO, Boolean.valueOf(z));
        } else {
            lVar.mo71346a(C11915a.VIDEOVIEW_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void setProgressEventInterval(Integer num, C12160l lVar) {
        C12080j.m32879a((Runnable) new C11825a(num));
        if (getVideoPlayerView() != null) {
            lVar.mo71347a(new Object[0]);
        } else {
            lVar.mo71346a(C11915a.VIDEOVIEW_NULL, new Object[0]);
        }
    }

    public static void setVideoPlayerView(C11917c cVar) {
        f28722a = cVar;
    }

    @WebViewExposed
    public static void setVolume(Double d, C12160l lVar) {
        C12065a.m32845b("Setting video volume: " + d);
        if (getVideoPlayerView() != null) {
            getVideoPlayerView().setVolume(Float.valueOf(d.floatValue()));
            lVar.mo71347a(d);
            return;
        }
        lVar.mo71346a(C11915a.VIDEOVIEW_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void stop(C12160l lVar) {
        C12065a.m32845b("Stopping current video");
        C12080j.m32879a((Runnable) new C11829e());
        if (getVideoPlayerView() != null) {
            lVar.mo71347a(new Object[0]);
        } else {
            lVar.mo71346a(C11915a.VIDEOVIEW_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void prepare(String str, Double d, Integer num, C12160l lVar) {
        C12065a.m32845b("Preparing video for playback: " + str);
        C12080j.m32879a((Runnable) new C11826b(str, d, num));
        if (getVideoPlayerView() != null) {
            lVar.mo71347a(str);
            return;
        }
        lVar.mo71346a(C11915a.VIDEOVIEW_NULL, new Object[0]);
    }
}
