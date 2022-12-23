package com.bykv.p054vk.openvk.component.video.api;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.bytedance.sdk.component.p102b.p103a.C2743i;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.bykv.vk.openvk.component.video.api.b */
/* compiled from: VideoConfig */
public class C2397b {

    /* renamed from: a */
    public static boolean f4864a = false;

    /* renamed from: b */
    private static Executor f4865b = null;

    /* renamed from: c */
    private static Context f4866c = null;

    /* renamed from: d */
    private static String f4867d = null;

    /* renamed from: e */
    private static boolean f4868e = false;

    /* renamed from: f */
    private static C2743i f4869f;

    /* renamed from: g */
    private static volatile Handler f4870g;

    /* renamed from: a */
    public static Context m5665a() {
        return f4866c;
    }

    /* renamed from: b */
    public static String m5669b() {
        if (TextUtils.isEmpty(f4867d)) {
            try {
                File file = new File(m5665a().getFilesDir(), "ttad_dir");
                if (!file.exists()) {
                    file.mkdirs();
                }
                f4867d = file.getAbsolutePath();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return f4867d;
    }

    /* renamed from: a */
    public static void m5666a(Context context, String str, Executor executor, Handler handler) {
        f4866c = context;
        f4865b = executor;
        f4867d = str;
        f4870g = handler;
    }

    /* renamed from: c */
    public static Handler m5670c() {
        if (f4870g == null) {
            synchronized (C2397b.class) {
                if (f4870g == null) {
                    HandlerThread handlerThread = new HandlerThread("tt_pangle_thread_video_handler_thread");
                    handlerThread.start();
                    f4870g = new Handler(handlerThread.getLooper());
                }
            }
        }
        return f4870g;
    }

    /* renamed from: d */
    public static boolean m5671d() {
        return f4868e;
    }

    /* renamed from: a */
    public static void m5668a(boolean z) {
        f4868e = z;
    }

    /* renamed from: e */
    public static C2743i m5672e() {
        if (f4869f == null) {
            f4869f = new C2743i.C2744a().mo17497a(10000, TimeUnit.MILLISECONDS).mo17500b(10000, TimeUnit.MILLISECONDS).mo17501c(10000, TimeUnit.MILLISECONDS).mo17499a();
        }
        return f4869f;
    }

    /* renamed from: a */
    public static void m5667a(C2743i iVar) {
        f4869f = iVar;
    }

    /* renamed from: f */
    public static boolean m5673f() {
        return f4864a;
    }
}
