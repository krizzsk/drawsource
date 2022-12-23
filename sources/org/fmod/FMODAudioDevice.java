package org.fmod;

import android.media.AudioTrack;
import android.util.Log;
import java.nio.ByteBuffer;

public class FMODAudioDevice implements Runnable {

    /* renamed from: h */
    private static int f29932h = 0;

    /* renamed from: i */
    private static int f29933i = 1;

    /* renamed from: j */
    private static int f29934j = 2;

    /* renamed from: k */
    private static int f29935k = 3;

    /* renamed from: a */
    private volatile Thread f29936a = null;

    /* renamed from: b */
    private volatile boolean f29937b = false;

    /* renamed from: c */
    private AudioTrack f29938c = null;

    /* renamed from: d */
    private boolean f29939d = false;

    /* renamed from: e */
    private ByteBuffer f29940e = null;

    /* renamed from: f */
    private byte[] f29941f = null;

    /* renamed from: g */
    private volatile C12654a f29942g;

    private native int fmodGetInfo(int i);

    private native int fmodProcess(ByteBuffer byteBuffer);

    private void releaseAudioTrack() {
        AudioTrack audioTrack = this.f29938c;
        if (audioTrack != null) {
            if (audioTrack.getState() == 1) {
                this.f29938c.stop();
            }
            this.f29938c.release();
            this.f29938c = null;
        }
        this.f29940e = null;
        this.f29941f = null;
        this.f29939d = false;
    }

    public synchronized void close() {
        stop();
    }

    /* access modifiers changed from: package-private */
    public native int fmodProcessMicData(ByteBuffer byteBuffer, int i);

    public boolean isRunning() {
        return this.f29936a != null && this.f29936a.isAlive();
    }

    public void run() {
        int i = 3;
        while (this.f29937b) {
            if (!this.f29939d && i > 0) {
                releaseAudioTrack();
                int fmodGetInfo = fmodGetInfo(f29932h);
                int round = Math.round(((float) AudioTrack.getMinBufferSize(fmodGetInfo, 12, 2)) * 1.1f) & -4;
                int fmodGetInfo2 = fmodGetInfo(f29933i);
                int fmodGetInfo3 = fmodGetInfo(f29934j) * fmodGetInfo2 * 4;
                AudioTrack audioTrack = new AudioTrack(3, fmodGetInfo, 12, 2, fmodGetInfo3 > round ? fmodGetInfo3 : round, 1);
                this.f29938c = audioTrack;
                boolean z = audioTrack.getState() == 1;
                this.f29939d = z;
                if (z) {
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fmodGetInfo2 * 2 * 2);
                    this.f29940e = allocateDirect;
                    this.f29941f = new byte[allocateDirect.capacity()];
                    this.f29938c.play();
                    i = 3;
                } else {
                    Log.e("FMOD", "AudioTrack failed to initialize (status " + this.f29938c.getState() + ")");
                    releaseAudioTrack();
                    i += -1;
                }
            }
            if (this.f29939d) {
                if (fmodGetInfo(f29935k) == 1) {
                    fmodProcess(this.f29940e);
                    ByteBuffer byteBuffer = this.f29940e;
                    byteBuffer.get(this.f29941f, 0, byteBuffer.capacity());
                    this.f29938c.write(this.f29941f, 0, this.f29940e.capacity());
                    this.f29940e.position(0);
                } else {
                    releaseAudioTrack();
                }
            }
        }
        releaseAudioTrack();
    }

    public synchronized void start() {
        if (this.f29936a != null) {
            stop();
        }
        this.f29936a = new Thread(this, "FMODAudioDevice");
        this.f29936a.setPriority(10);
        this.f29937b = true;
        this.f29936a.start();
        if (this.f29942g != null) {
            this.f29942g.mo76897b();
        }
    }

    public synchronized int startAudioRecord(int i, int i2, int i3) {
        if (this.f29942g == null) {
            this.f29942g = new C12654a(this, i, i2);
            this.f29942g.mo76897b();
        }
        return this.f29942g.mo76896a();
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:1:0x0001 */
    /* JADX WARNING: Removed duplicated region for block: B:1:0x0001 A[LOOP:0: B:1:0x0001->B:16:0x0001, LOOP_START, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void stop() {
        /*
            r1 = this;
            monitor-enter(r1)
        L_0x0001:
            java.lang.Thread r0 = r1.f29936a     // Catch:{ all -> 0x001c }
            if (r0 == 0) goto L_0x0011
            r0 = 0
            r1.f29937b = r0     // Catch:{ all -> 0x001c }
            java.lang.Thread r0 = r1.f29936a     // Catch:{ InterruptedException -> 0x0001 }
            r0.join()     // Catch:{ InterruptedException -> 0x0001 }
            r0 = 0
            r1.f29936a = r0     // Catch:{ InterruptedException -> 0x0001 }
            goto L_0x0001
        L_0x0011:
            org.fmod.a r0 = r1.f29942g     // Catch:{ all -> 0x001c }
            if (r0 == 0) goto L_0x001a
            org.fmod.a r0 = r1.f29942g     // Catch:{ all -> 0x001c }
            r0.mo76898c()     // Catch:{ all -> 0x001c }
        L_0x001a:
            monitor-exit(r1)
            return
        L_0x001c:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.fmod.FMODAudioDevice.stop():void");
    }

    public synchronized void stopAudioRecord() {
        if (this.f29942g != null) {
            this.f29942g.mo76898c();
            this.f29942g = null;
        }
    }
}
