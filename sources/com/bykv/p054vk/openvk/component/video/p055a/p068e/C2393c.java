package com.bykv.p054vk.openvk.component.video.p055a.p068e;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: com.bykv.vk.openvk.component.video.a.e.c */
/* compiled from: VideoFilesUtils */
public class C2393c {
    /* renamed from: a */
    public static long m5617a(String str, String str2) {
        File c = m5620c(str, str2);
        if (c.exists()) {
            return c.length();
        }
        File b = m5619b(str, str2);
        if (b.exists()) {
            return b.length();
        }
        return 0;
    }

    /* renamed from: b */
    public static File m5619b(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str2 + ".temp");
    }

    /* renamed from: c */
    public static File m5620c(String str, String str2) {
        File file = new File(str);
        if (file.isFile()) {
            file.delete();
        }
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, str2);
    }

    /* renamed from: a */
    public static void m5618a(RandomAccessFile randomAccessFile, byte[] bArr, int i, int i2, String str) throws IOException {
        try {
            randomAccessFile.seek((long) i);
            randomAccessFile.write(bArr, 0, i2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
