package com.adcolony.sdk;

import android.content.Context;
import android.os.Build;
import android.os.StatFs;
import com.adcolony.sdk.C0826e0;
import java.io.File;

/* renamed from: com.adcolony.sdk.v0 */
class C0992v0 {

    /* renamed from: a */
    private String f848a;

    /* renamed from: b */
    private String f849b;

    /* renamed from: c */
    private String f850c;

    /* renamed from: d */
    private String f851d;

    /* renamed from: e */
    private File f852e;

    /* renamed from: f */
    private File f853f;

    /* renamed from: g */
    private File f854g;

    C0992v0() {
    }

    /* renamed from: b */
    private long m1103b(StatFs statFs) {
        return statFs.getAvailableBlocksLong();
    }

    /* renamed from: c */
    private long m1104c(StatFs statFs) {
        return Build.VERSION.SDK_INT >= 18 ? m1105d(statFs) : (long) statFs.getBlockSize();
    }

    /* renamed from: d */
    private long m1105d(StatFs statFs) {
        return statFs.getBlockSizeLong();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public double mo11152a(String str) {
        try {
            StatFs statFs = new StatFs(str);
            return (double) (m1102a(statFs) * m1104c(statFs));
        } catch (RuntimeException unused) {
            return 0.0d;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo11158e() {
        C0866k b = C0723a.m193b();
        this.f848a = mo11159f() + "/adc3/";
        this.f849b = this.f848a + "media/";
        File file = new File(this.f849b);
        this.f852e = file;
        if (!file.isDirectory()) {
            this.f852e.delete();
            this.f852e.mkdirs();
        }
        if (!this.f852e.isDirectory()) {
            b.mo10888b(true);
            return false;
        } else if (mo11152a(this.f849b) < 2.097152E7d) {
            new C0826e0.C0827a().mo10746a("Not enough memory available at media path, disabling AdColony.").mo10747a(C0826e0.f459f);
            b.mo10888b(true);
            return false;
        } else {
            this.f850c = mo11159f() + "/adc3/data/";
            File file2 = new File(this.f850c);
            this.f853f = file2;
            if (!file2.isDirectory()) {
                this.f853f.delete();
            }
            this.f853f.mkdirs();
            this.f851d = this.f848a + "tmp/";
            File file3 = new File(this.f851d);
            this.f854g = file3;
            if (!file3.isDirectory()) {
                this.f854g.delete();
                this.f854g.mkdirs();
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public String mo11159f() {
        Context a = C0723a.m186a();
        if (a == null) {
            return "";
        }
        return a.getFilesDir().getAbsolutePath();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C0832f1 mo11160g() {
        if (!new File(mo11153a() + "AppVersion").exists()) {
            return C0773c0.m379b();
        }
        return C0773c0.m388c(mo11153a() + "AppVersion");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public boolean mo11161h() {
        File file = this.f852e;
        if (file == null || this.f853f == null || this.f854g == null) {
            return false;
        }
        if (!file.isDirectory()) {
            this.f852e.delete();
        }
        if (!this.f853f.isDirectory()) {
            this.f853f.delete();
        }
        if (!this.f854g.isDirectory()) {
            this.f854g.delete();
        }
        this.f852e.mkdirs();
        this.f853f.mkdirs();
        this.f854g.mkdirs();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo11155b() {
        return this.f850c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public String mo11156c() {
        return this.f849b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public String mo11157d() {
        return this.f851d;
    }

    /* renamed from: a */
    private long m1102a(StatFs statFs) {
        return Build.VERSION.SDK_INT >= 18 ? m1103b(statFs) : (long) statFs.getAvailableBlocks();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo11154a(C0832f1 f1Var) {
        C0773c0.m395j(f1Var, mo11153a() + "AppVersion");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo11153a() {
        return this.f848a;
    }
}
