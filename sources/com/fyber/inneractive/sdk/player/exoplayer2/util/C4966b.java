package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.b */
public final class C4966b {

    /* renamed from: a */
    public final File f13208a;

    /* renamed from: b */
    public final File f13209b;

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.b$a */
    public static final class C4967a extends OutputStream {

        /* renamed from: a */
        public final FileOutputStream f13210a;

        /* renamed from: b */
        public boolean f13211b = false;

        public C4967a(File file) throws FileNotFoundException {
            this.f13210a = new FileOutputStream(file);
        }

        public void close() throws IOException {
            if (!this.f13211b) {
                this.f13211b = true;
                this.f13210a.flush();
                try {
                    this.f13210a.getFD().sync();
                } catch (IOException e) {
                    Log.w("AtomicFile", "Failed to sync file descriptor:", e);
                }
                this.f13210a.close();
            }
        }

        public void flush() throws IOException {
            this.f13210a.flush();
        }

        public void write(int i) throws IOException {
            this.f13210a.write(i);
        }

        public void write(byte[] bArr) throws IOException {
            this.f13210a.write(bArr);
        }

        public void write(byte[] bArr, int i, int i2) throws IOException {
            this.f13210a.write(bArr, i, i2);
        }
    }

    public C4966b(File file) {
        this.f13208a = file;
        this.f13209b = new File(file.getPath() + ".bak");
    }

    /* renamed from: a */
    public InputStream mo25499a() throws FileNotFoundException {
        if (this.f13209b.exists()) {
            this.f13208a.delete();
            this.f13209b.renameTo(this.f13208a);
        }
        return new FileInputStream(this.f13208a);
    }

    /* renamed from: b */
    public OutputStream mo25500b() throws IOException {
        if (this.f13208a.exists()) {
            if (this.f13209b.exists()) {
                this.f13208a.delete();
            } else if (!this.f13208a.renameTo(this.f13209b)) {
                Log.w("AtomicFile", "Couldn't rename file " + this.f13208a + " to backup file " + this.f13209b);
            }
        }
        try {
            return new C4967a(this.f13208a);
        } catch (FileNotFoundException unused) {
            if (this.f13208a.getParentFile().mkdirs()) {
                try {
                    return new C4967a(this.f13208a);
                } catch (FileNotFoundException unused2) {
                    throw new IOException("Couldn't create " + this.f13208a);
                }
            } else {
                throw new IOException("Couldn't create directory " + this.f13208a);
            }
        }
    }
}
