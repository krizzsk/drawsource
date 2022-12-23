package com.bytedance.sdk.openadsdk;

import android.text.TextUtils;
import com.bykv.p054vk.openvk.component.video.api.p069a.C2396a;
import com.bykv.p054vk.openvk.component.video.p055a.p056a.p057a.C2278a;
import com.bytedance.sdk.component.utils.C2894f;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.multipro.C3948b;
import java.io.File;

public class CacheDirFactory {
    public static volatile C2396a MEDIA_CACHE_DIR = null;
    public static String ROOT_DIR = null;
    public static final int SPLASH_USE_INTERNAL_STORAGE = 1;
    public static volatile C2396a TTVIDEO_CACHE_DIR = null;

    /* renamed from: a */
    private static String f6623a = null;

    /* renamed from: b */
    private static int f6624b = 1;

    /* renamed from: a */
    private static C2396a m8260a() {
        if (MEDIA_CACHE_DIR == null) {
            synchronized (CacheDirFactory.class) {
                if (MEDIA_CACHE_DIR == null) {
                    MEDIA_CACHE_DIR = new C2278a();
                    MEDIA_CACHE_DIR.mo15662a(getRootDir());
                    MEDIA_CACHE_DIR.mo15666c();
                }
            }
        }
        return MEDIA_CACHE_DIR;
    }

    public static String getRootDir() {
        if (!TextUtils.isEmpty(ROOT_DIR)) {
            return ROOT_DIR;
        }
        File a = C2894f.m8080a(C3513m.m10963a(), C3948b.m12959c(), "tt_ad");
        if (a.isFile()) {
            a.delete();
        }
        if (!a.exists()) {
            a.mkdirs();
        }
        String absolutePath = a.getAbsolutePath();
        ROOT_DIR = absolutePath;
        return absolutePath;
    }

    public static C2396a getICacheDir(int i) {
        return m8260a();
    }

    public static String getBrandCacheDir() {
        return getRootDir() + File.separator + "video_brand";
    }

    public static int getCacheType() {
        return f6624b;
    }

    public static String getImageCacheDir() {
        if (f6623a == null) {
            f6623a = getDiskCacheDirPath("image");
        }
        return f6623a;
    }

    public static String getDiskCacheDirPath(String str) {
        return getRootDir() + File.separator + str;
    }
}
