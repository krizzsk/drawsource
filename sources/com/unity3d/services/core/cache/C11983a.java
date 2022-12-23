package com.unity3d.services.core.cache;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import com.unity3d.services.core.log.C12065a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* renamed from: com.unity3d.services.core.cache.a */
/* compiled from: CacheDirectory */
public class C11983a {

    /* renamed from: a */
    private String f29131a;

    /* renamed from: b */
    private boolean f29132b = false;

    /* renamed from: c */
    private File f29133c = null;

    /* renamed from: d */
    private C11984b f29134d = null;

    public C11983a(String str) {
        this.f29131a = str;
    }

    /* renamed from: a */
    public synchronized File mo71024a(Context context) {
        File file;
        if (this.f29132b) {
            return this.f29133c;
        }
        this.f29132b = true;
        if (Build.VERSION.SDK_INT > 18) {
            if ("mounted".equals(Environment.getExternalStorageState())) {
                try {
                    file = mo71025a(context.getExternalCacheDir(), this.f29131a);
                } catch (Exception e) {
                    C12065a.m32842a("Creating external cache directory failed", e);
                    file = null;
                }
                if (mo71026b(file)) {
                    m32597a(file);
                    this.f29133c = file;
                    this.f29134d = C11984b.EXTERNAL;
                    C12065a.m32845b("Unity Ads is using external cache directory: " + file.getAbsolutePath());
                    return this.f29133c;
                }
            } else {
                C12065a.m32845b("External media not mounted");
            }
        }
        File filesDir = context.getFilesDir();
        if (mo71026b(filesDir)) {
            this.f29133c = filesDir;
            this.f29134d = C11984b.INTERNAL;
            C12065a.m32845b("Unity Ads is using internal cache directory: " + filesDir.getAbsolutePath());
            return this.f29133c;
        }
        C12065a.m32848c("Unity Ads failed to initialize cache directory");
        return null;
    }

    /* renamed from: b */
    public boolean mo71026b(File file) {
        if (file != null && file.isDirectory()) {
            try {
                byte[] bytes = "test".getBytes("UTF-8");
                int length = bytes.length;
                byte[] bArr = new byte[length];
                File file2 = new File(file, "UnityAdsTest.txt");
                FileOutputStream fileOutputStream = new FileOutputStream(file2);
                fileOutputStream.write(bytes);
                fileOutputStream.flush();
                fileOutputStream.close();
                FileInputStream fileInputStream = new FileInputStream(file2);
                int read = fileInputStream.read(bArr, 0, length);
                fileInputStream.close();
                if (!file2.delete()) {
                    C12065a.m32845b("Failed to delete testfile " + file2.getAbsoluteFile());
                    return false;
                } else if (read != length) {
                    C12065a.m32845b("Read buffer size mismatch");
                    return false;
                } else if (new String(bArr, "UTF-8").equals("test")) {
                    return true;
                } else {
                    C12065a.m32845b("Read buffer content mismatch");
                    return false;
                }
            } catch (Exception e) {
                C12065a.m32845b("Unity Ads exception while testing cache directory " + file.getAbsolutePath() + ": " + e.getMessage());
            }
        }
        return false;
    }

    /* renamed from: a */
    public C11984b mo71023a() {
        return this.f29134d;
    }

    /* renamed from: a */
    public File mo71025a(File file, String str) {
        if (file == null) {
            return null;
        }
        File file2 = new File(file, str);
        file2.mkdirs();
        if (file2.isDirectory()) {
            return file2;
        }
        return null;
    }

    /* renamed from: a */
    private void m32597a(File file) {
        try {
            if (new File(file, ".nomedia").createNewFile()) {
                C12065a.m32845b("Successfully created .nomedia file");
            } else {
                C12065a.m32845b("Using existing .nomedia file");
            }
        } catch (Exception e) {
            C12065a.m32842a("Failed to create .nomedia file", e);
        }
    }
}
