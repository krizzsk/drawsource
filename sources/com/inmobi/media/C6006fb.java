package com.inmobi.media;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;

/* renamed from: com.inmobi.media.fb */
/* compiled from: NativeAudioFocusManager */
public final class C6006fb {

    /* renamed from: a */
    final AudioAttributes f15221a = new AudioAttributes.Builder().setUsage(1).setContentType(2).setLegacyStreamType(3).build();

    /* renamed from: b */
    private final Context f15222b;

    /* renamed from: c */
    private final C6007a f15223c;

    /* renamed from: d */
    private boolean f15224d = false;

    /* renamed from: e */
    private final Object f15225e = new Object();

    /* renamed from: f */
    private AudioFocusRequest f15226f;

    /* renamed from: g */
    private AudioManager.OnAudioFocusChangeListener f15227g;

    /* renamed from: com.inmobi.media.fb$a */
    /* compiled from: NativeAudioFocusManager */
    interface C6007a {
        /* renamed from: a */
        void mo35157a();

        /* renamed from: b */
        void mo35158b();

        /* renamed from: c */
        void mo35159c();

        /* renamed from: d */
        void mo35160d();
    }

    protected C6006fb(Context context, C6007a aVar) {
        this.f15222b = context;
        this.f15223c = aVar;
    }

    /* renamed from: a */
    public final void mo35154a() {
        synchronized (this.f15225e) {
            AudioManager audioManager = (AudioManager) this.f15222b.getSystemService("audio");
            if (audioManager != null) {
                if (Build.VERSION.SDK_INT >= 26) {
                    if (this.f15226f != null) {
                        audioManager.abandonAudioFocusRequest(this.f15226f);
                    }
                } else if (this.f15227g != null) {
                    audioManager.abandonAudioFocus(this.f15227g);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo35155b() {
        int i;
        synchronized (this.f15225e) {
            AudioManager audioManager = (AudioManager) this.f15222b.getSystemService("audio");
            if (audioManager != null) {
                if (this.f15227g == null) {
                    this.f15227g = new AudioManager.OnAudioFocusChangeListener() {
                        public final void onAudioFocusChange(int i) {
                            C6006fb.this.m17895a(i);
                        }
                    };
                }
                if (Build.VERSION.SDK_INT >= 26) {
                    if (this.f15226f == null) {
                        this.f15226f = new AudioFocusRequest.Builder(2).setAudioAttributes(this.f15221a).setOnAudioFocusChangeListener(this.f15227g).build();
                    }
                    i = audioManager.requestAudioFocus(this.f15226f);
                } else {
                    i = audioManager.requestAudioFocus(this.f15227g, 3, 2);
                }
            } else {
                i = 0;
            }
        }
        if (i == 1) {
            this.f15223c.mo35157a();
        } else {
            this.f15223c.mo35158b();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public /* synthetic */ void m17895a(int i) {
        if (i == -2) {
            synchronized (this.f15225e) {
                this.f15224d = true;
            }
            this.f15223c.mo35160d();
        } else if (i == -1) {
            synchronized (this.f15225e) {
                this.f15224d = false;
            }
            this.f15223c.mo35160d();
        } else if (i == 1) {
            synchronized (this.f15225e) {
                if (this.f15224d) {
                    this.f15223c.mo35159c();
                }
                this.f15224d = false;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo35156c() {
        mo35154a();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f15226f = null;
        }
        this.f15227g = null;
    }
}
