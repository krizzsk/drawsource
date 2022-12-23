package com.bykv.p054vk.openvk.component.video.p055a.p059b;

import com.bykv.p054vk.openvk.component.video.p055a.p066c.C2361a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: com.bykv.vk.openvk.component.video.a.b.h */
/* compiled from: RandomAccessFileWrapper */
class C2350h {

    /* renamed from: a */
    private final RandomAccessFile f4754a;

    C2350h(File file, String str) throws C2351a {
        try {
            this.f4754a = new RandomAccessFile(file, str);
        } catch (FileNotFoundException e) {
            throw new C2351a(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo15801a(long j) throws C2351a {
        try {
            this.f4754a.seek(j);
        } catch (IOException e) {
            throw new C2351a(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo15802a(byte[] bArr, int i, int i2) throws C2351a {
        try {
            this.f4754a.write(bArr, i, i2);
        } catch (IOException e) {
            throw new C2351a(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo15799a(byte[] bArr) throws C2351a {
        try {
            return this.f4754a.read(bArr);
        } catch (IOException e) {
            throw new C2351a(e);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo15800a() {
        C2361a.m5452a(this.f4754a);
    }

    /* renamed from: com.bykv.vk.openvk.component.video.a.b.h$a */
    /* compiled from: RandomAccessFileWrapper */
    static class C2351a extends Exception {
        C2351a(Throwable th) {
            super(th);
        }
    }
}
