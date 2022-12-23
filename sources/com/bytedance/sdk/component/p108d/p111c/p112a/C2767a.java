package com.bytedance.sdk.component.p108d.p111c.p112a;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import com.bytedance.sdk.component.p108d.C2759b;
import java.io.File;

/* renamed from: com.bytedance.sdk.component.d.c.a.a */
/* compiled from: CacheConfig */
public class C2767a implements C2759b, Cloneable {

    /* renamed from: f */
    private static volatile C2759b f6158f;

    /* renamed from: a */
    private long f6159a;

    /* renamed from: b */
    private int f6160b;

    /* renamed from: c */
    private boolean f6161c;

    /* renamed from: d */
    private boolean f6162d;

    /* renamed from: e */
    private File f6163e;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C2767a(int i, long j, File file) {
        this(i, j, i != 0, j != 0, file);
    }

    public C2767a(int i, long j, boolean z, boolean z2, File file) {
        this.f6159a = j;
        this.f6160b = i;
        this.f6161c = z;
        this.f6162d = z2;
        this.f6163e = file;
    }

    /* renamed from: a */
    public long mo17527a() {
        return this.f6159a;
    }

    /* renamed from: b */
    public int mo17528b() {
        return this.f6160b;
    }

    /* renamed from: c */
    public boolean mo17529c() {
        return this.f6161c;
    }

    /* renamed from: d */
    public boolean mo17530d() {
        return this.f6162d;
    }

    /* renamed from: e */
    public File mo17531e() {
        return this.f6163e;
    }

    /* renamed from: a */
    public static void m7544a(Context context, C2759b bVar) {
        if (bVar != null) {
            f6158f = bVar;
        } else {
            f6158f = m7543a(new File(context.getCacheDir(), "image"));
        }
    }

    /* renamed from: a */
    public static C2759b m7543a(File file) {
        long j;
        int i;
        file.mkdirs();
        if (f6158f == null) {
            i = Math.min(Long.valueOf(Runtime.getRuntime().maxMemory()).intValue() / 16, 31457280);
            j = Math.min(m7546g() / 16, 41943040);
        } else {
            i = Math.min(f6158f.mo17528b() / 2, 31457280);
            j = Math.min(f6158f.mo17527a() / 2, 41943040);
        }
        return new C2767a(Math.max(i, 26214400), Math.max(j, 20971520), file);
    }

    /* renamed from: f */
    public static C2759b m7545f() {
        return f6158f;
    }

    /* renamed from: g */
    private static long m7546g() {
        StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
        return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
    }
}
