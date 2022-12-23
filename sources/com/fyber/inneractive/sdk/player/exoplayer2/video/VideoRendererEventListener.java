package com.fyber.inneractive.sdk.player.exoplayer2.video;

import android.os.Handler;
import android.view.Surface;
import com.fyber.inneractive.sdk.player.exoplayer2.C4811i;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a;

public interface VideoRendererEventListener {

    public static final class EventDispatcher {
        private final Handler handler;
        /* access modifiers changed from: private */
        public final VideoRendererEventListener listener;

        /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener$EventDispatcher$a */
        public class C4995a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ DecoderCounters f13311a;

            public C4995a(DecoderCounters decoderCounters) {
                this.f13311a = decoderCounters;
            }

            public void run() {
                EventDispatcher.this.listener.onVideoEnabled(this.f13311a);
            }
        }

        /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener$EventDispatcher$b */
        public class C4996b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ String f13313a;

            /* renamed from: b */
            public final /* synthetic */ long f13314b;

            /* renamed from: c */
            public final /* synthetic */ long f13315c;

            public C4996b(String str, long j, long j2) {
                this.f13313a = str;
                this.f13314b = j;
                this.f13315c = j2;
            }

            public void run() {
                EventDispatcher.this.listener.onVideoDecoderInitialized(this.f13313a, this.f13314b, this.f13315c);
            }
        }

        /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener$EventDispatcher$c */
        public class C4997c implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C4811i f13317a;

            public C4997c(C4811i iVar) {
                this.f13317a = iVar;
            }

            public void run() {
                EventDispatcher.this.listener.onVideoInputFormatChanged(this.f13317a);
            }
        }

        /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener$EventDispatcher$d */
        public class C4998d implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ int f13319a;

            /* renamed from: b */
            public final /* synthetic */ long f13320b;

            public C4998d(int i, long j) {
                this.f13319a = i;
                this.f13320b = j;
            }

            public void run() {
                EventDispatcher.this.listener.onDroppedFrames(this.f13319a, this.f13320b);
            }
        }

        /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener$EventDispatcher$e */
        public class C4999e implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ int f13322a;

            /* renamed from: b */
            public final /* synthetic */ int f13323b;

            /* renamed from: c */
            public final /* synthetic */ int f13324c;

            /* renamed from: d */
            public final /* synthetic */ float f13325d;

            public C4999e(int i, int i2, int i3, float f) {
                this.f13322a = i;
                this.f13323b = i2;
                this.f13324c = i3;
                this.f13325d = f;
            }

            public void run() {
                EventDispatcher.this.listener.onVideoSizeChanged(this.f13322a, this.f13323b, this.f13324c, this.f13325d);
            }
        }

        /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener$EventDispatcher$f */
        public class C5000f implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ Surface f13327a;

            public C5000f(Surface surface) {
                this.f13327a = surface;
            }

            public void run() {
                EventDispatcher.this.listener.onRenderedFirstFrame(this.f13327a);
            }
        }

        /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.VideoRendererEventListener$EventDispatcher$g */
        public class C5001g implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ DecoderCounters f13329a;

            public C5001g(DecoderCounters decoderCounters) {
                this.f13329a = decoderCounters;
            }

            public void run() {
                this.f13329a.ensureUpdated();
                EventDispatcher.this.listener.onVideoDisabled(this.f13329a);
            }
        }

        public EventDispatcher(Handler handler2, VideoRendererEventListener videoRendererEventListener) {
            this.handler = videoRendererEventListener != null ? (Handler) C4965a.m15047a(handler2) : null;
            this.listener = videoRendererEventListener;
        }

        public void decoderInitialized(String str, long j, long j2) {
            if (this.listener != null) {
                this.handler.post(new C4996b(str, j, j2));
            }
        }

        public void disabled(DecoderCounters decoderCounters) {
            if (this.listener != null) {
                this.handler.post(new C5001g(decoderCounters));
            }
        }

        public void droppedFrames(int i, long j) {
            if (this.listener != null) {
                this.handler.post(new C4998d(i, j));
            }
        }

        public void enabled(DecoderCounters decoderCounters) {
            if (this.listener != null) {
                this.handler.post(new C4995a(decoderCounters));
            }
        }

        public void inputFormatChanged(C4811i iVar) {
            if (this.listener != null) {
                this.handler.post(new C4997c(iVar));
            }
        }

        public void renderedFirstFrame(Surface surface) {
            if (this.listener != null) {
                this.handler.post(new C5000f(surface));
            }
        }

        public void videoSizeChanged(int i, int i2, int i3, float f) {
            if (this.listener != null) {
                this.handler.post(new C4999e(i, i2, i3, f));
            }
        }
    }

    void onDroppedFrames(int i, long j);

    void onRenderedFirstFrame(Surface surface);

    void onVideoDecoderInitialized(String str, long j, long j2);

    void onVideoDisabled(DecoderCounters decoderCounters);

    void onVideoEnabled(DecoderCounters decoderCounters);

    void onVideoInputFormatChanged(C4811i iVar);

    void onVideoSizeChanged(int i, int i2, int i3, float f);
}
