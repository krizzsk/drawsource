package org.fmod;

import android.media.AudioRecord;
import android.util.Log;
import java.nio.ByteBuffer;

/* renamed from: org.fmod.a */
final class C12654a implements Runnable {

    /* renamed from: a */
    private final FMODAudioDevice f29943a;

    /* renamed from: b */
    private final ByteBuffer f29944b;

    /* renamed from: c */
    private final int f29945c;

    /* renamed from: d */
    private final int f29946d;

    /* renamed from: e */
    private final int f29947e = 2;

    /* renamed from: f */
    private volatile Thread f29948f;

    /* renamed from: g */
    private volatile boolean f29949g;

    /* renamed from: h */
    private AudioRecord f29950h;

    /* renamed from: i */
    private boolean f29951i;

    C12654a(FMODAudioDevice fMODAudioDevice, int i, int i2) {
        this.f29943a = fMODAudioDevice;
        this.f29945c = i;
        this.f29946d = i2;
        this.f29944b = ByteBuffer.allocateDirect(AudioRecord.getMinBufferSize(i, i2, 2));
    }

    /* renamed from: d */
    private void m33561d() {
        AudioRecord audioRecord = this.f29950h;
        if (audioRecord != null) {
            if (audioRecord.getState() == 1) {
                this.f29950h.stop();
            }
            this.f29950h.release();
            this.f29950h = null;
        }
        this.f29944b.position(0);
        this.f29951i = false;
    }

    /* renamed from: a */
    public final int mo76896a() {
        return this.f29944b.capacity();
    }

    /* renamed from: b */
    public final void mo76897b() {
        if (this.f29948f != null) {
            mo76898c();
        }
        this.f29949g = true;
        this.f29948f = new Thread(this);
        this.f29948f.start();
    }

    /* renamed from: c */
    public final void mo76898c() {
        while (this.f29948f != null) {
            this.f29949g = false;
            try {
                this.f29948f.join();
                this.f29948f = null;
            } catch (InterruptedException unused) {
            }
        }
    }

    public final void run() {
        int i = 3;
        while (this.f29949g) {
            if (!this.f29951i && i > 0) {
                m33561d();
                AudioRecord audioRecord = new AudioRecord(1, this.f29945c, this.f29946d, this.f29947e, this.f29944b.capacity());
                this.f29950h = audioRecord;
                int state = audioRecord.getState();
                boolean z = true;
                if (state != 1) {
                    z = false;
                }
                this.f29951i = z;
                if (z) {
                    this.f29944b.position(0);
                    this.f29950h.startRecording();
                    i = 3;
                } else {
                    Log.e("FMOD", "AudioRecord failed to initialize (status " + this.f29950h.getState() + ")");
                    i += -1;
                    m33561d();
                }
            }
            if (this.f29951i && this.f29950h.getRecordingState() == 3) {
                AudioRecord audioRecord2 = this.f29950h;
                ByteBuffer byteBuffer = this.f29944b;
                this.f29943a.fmodProcessMicData(this.f29944b, audioRecord2.read(byteBuffer, byteBuffer.capacity()));
                this.f29944b.position(0);
            }
        }
        m33561d();
    }
}
