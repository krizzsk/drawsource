package com.apm.insight.p026l;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import com.apm.insight.C1250h;
import java.io.File;
import org.json.JSONObject;

/* renamed from: com.apm.insight.l.w */
public class C1328w {
    /* renamed from: a */
    public static long m1984a(File file) {
        try {
            StatFs statFs = new StatFs(file.getPath());
            if (Build.VERSION.SDK_INT >= 18) {
                return statFs.getTotalBytes();
            }
            return ((long) statFs.getBlockCount()) * ((long) statFs.getBlockSize());
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: a */
    public static JSONObject m1985a(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("inner_free", m1987b());
            jSONObject.put("inner_total", m1989c());
            jSONObject.put("sdcard_free", m1992f());
            jSONObject.put("sdcard_total", m1993g());
            jSONObject.put("inner_free_real", m1990d());
            jSONObject.put("inner_total_real", m1991e());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static boolean m1986a() {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    /* renamed from: b */
    private static long m1987b() {
        try {
            return m1988b(Environment.getRootDirectory());
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: b */
    public static long m1988b(File file) {
        try {
            StatFs statFs = new StatFs(file.getPath());
            if (Build.VERSION.SDK_INT >= 18) {
                return statFs.getFreeBytes();
            }
            return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize());
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: c */
    private static long m1989c() {
        try {
            return m1984a(Environment.getRootDirectory());
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: d */
    private static long m1990d() {
        try {
            return m1988b(C1250h.m1615g().getFilesDir());
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: e */
    private static long m1991e() {
        try {
            return m1984a(C1250h.m1615g().getFilesDir());
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: f */
    private static long m1992f() {
        try {
            if (m1986a()) {
                return Environment.getExternalStorageDirectory().getFreeSpace();
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* renamed from: g */
    private static long m1993g() {
        try {
            if (m1986a()) {
                return Environment.getExternalStorageDirectory().getTotalSpace();
            }
            return 0;
        } catch (Throwable unused) {
            return 0;
        }
    }
}
