package com.bytedance.sdk.openadsdk.p127a;

import com.bytedance.sdk.component.utils.C2894f;
import com.bytedance.sdk.component.utils.C2905l;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: com.bytedance.sdk.openadsdk.a.a */
/* compiled from: LruDiskFile */
public abstract class C2950a {

    /* renamed from: a */
    private final ExecutorService f6708a = Executors.newSingleThreadExecutor();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo18277a(List<File> list);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo18278a(long j, int i);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo18279a(File file, long j, int i);

    /* renamed from: a */
    public void mo18276a(File file) throws IOException {
        this.f6708a.submit(new C2952a(file));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m8284b(File file) throws IOException {
        try {
            C2894f.m8085b(file);
        } catch (Throwable th) {
            C2905l.m8106a("LruDiskFile", "setLastModifiedNowError", th);
        }
        mo18277a(C2894f.m8083a(file.getParentFile()));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public long mo18280b(List<File> list) {
        long j = 0;
        for (File length : list) {
            j += length.length();
        }
        return j;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.a.a$a */
    /* compiled from: LruDiskFile */
    private class C2952a implements Callable<Void> {

        /* renamed from: b */
        private final File f6710b;

        private C2952a(File file) {
            this.f6710b = file;
        }

        /* renamed from: a */
        public Void call() throws Exception {
            C2950a.this.m8284b(this.f6710b);
            return null;
        }
    }
}
