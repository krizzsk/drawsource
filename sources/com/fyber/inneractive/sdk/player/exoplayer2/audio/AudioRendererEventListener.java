package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import android.os.Handler;
import com.fyber.inneractive.sdk.player.exoplayer2.C4811i;
import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a;

public interface AudioRendererEventListener {

    public static final class EventDispatcher {
        private final Handler handler;
        /* access modifiers changed from: private */
        public final AudioRendererEventListener listener;

        /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener$EventDispatcher$a */
        public class C4612a implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ DecoderCounters f11473a;

            public C4612a(DecoderCounters decoderCounters) {
                this.f11473a = decoderCounters;
            }

            public void run() {
                EventDispatcher.this.listener.onAudioEnabled(this.f11473a);
            }
        }

        /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener$EventDispatcher$b */
        public class C4613b implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ String f11475a;

            /* renamed from: b */
            public final /* synthetic */ long f11476b;

            /* renamed from: c */
            public final /* synthetic */ long f11477c;

            public C4613b(String str, long j, long j2) {
                this.f11475a = str;
                this.f11476b = j;
                this.f11477c = j2;
            }

            public void run() {
                EventDispatcher.this.listener.onAudioDecoderInitialized(this.f11475a, this.f11476b, this.f11477c);
            }
        }

        /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener$EventDispatcher$c */
        public class C4614c implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ C4811i f11479a;

            public C4614c(C4811i iVar) {
                this.f11479a = iVar;
            }

            public void run() {
                EventDispatcher.this.listener.onAudioInputFormatChanged(this.f11479a);
            }
        }

        /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener$EventDispatcher$d */
        public class C4615d implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ int f11481a;

            /* renamed from: b */
            public final /* synthetic */ long f11482b;

            /* renamed from: c */
            public final /* synthetic */ long f11483c;

            public C4615d(int i, long j, long j2) {
                this.f11481a = i;
                this.f11482b = j;
                this.f11483c = j2;
            }

            public void run() {
                EventDispatcher.this.listener.onAudioTrackUnderrun(this.f11481a, this.f11482b, this.f11483c);
            }
        }

        /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener$EventDispatcher$e */
        public class C4616e implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ DecoderCounters f11485a;

            public C4616e(DecoderCounters decoderCounters) {
                this.f11485a = decoderCounters;
            }

            public void run() {
                this.f11485a.ensureUpdated();
                EventDispatcher.this.listener.onAudioDisabled(this.f11485a);
            }
        }

        /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.AudioRendererEventListener$EventDispatcher$f */
        public class C4617f implements Runnable {

            /* renamed from: a */
            public final /* synthetic */ int f11487a;

            public C4617f(int i) {
                this.f11487a = i;
            }

            public void run() {
                EventDispatcher.this.listener.onAudioSessionId(this.f11487a);
            }
        }

        public EventDispatcher(Handler handler2, AudioRendererEventListener audioRendererEventListener) {
            this.handler = audioRendererEventListener != null ? (Handler) C4965a.m15047a(handler2) : null;
            this.listener = audioRendererEventListener;
        }

        public void audioSessionId(int i) {
            if (this.listener != null) {
                this.handler.post(new C4617f(i));
            }
        }

        public void audioTrackUnderrun(int i, long j, long j2) {
            if (this.listener != null) {
                this.handler.post(new C4615d(i, j, j2));
            }
        }

        public void decoderInitialized(String str, long j, long j2) {
            if (this.listener != null) {
                this.handler.post(new C4613b(str, j, j2));
            }
        }

        public void disabled(DecoderCounters decoderCounters) {
            if (this.listener != null) {
                this.handler.post(new C4616e(decoderCounters));
            }
        }

        public void enabled(DecoderCounters decoderCounters) {
            if (this.listener != null) {
                this.handler.post(new C4612a(decoderCounters));
            }
        }

        public void inputFormatChanged(C4811i iVar) {
            if (this.listener != null) {
                this.handler.post(new C4614c(iVar));
            }
        }
    }

    void onAudioDecoderInitialized(String str, long j, long j2);

    void onAudioDisabled(DecoderCounters decoderCounters);

    void onAudioEnabled(DecoderCounters decoderCounters);

    void onAudioInputFormatChanged(C4811i iVar);

    void onAudioSessionId(int i);

    void onAudioTrackUnderrun(int i, long j, long j2);
}
