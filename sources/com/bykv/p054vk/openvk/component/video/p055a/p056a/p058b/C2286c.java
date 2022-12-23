package com.bykv.p054vk.openvk.component.video.p055a.p056a.p058b;

import android.content.Context;
import android.os.Build;
import com.bykv.p054vk.openvk.component.video.api.p071c.C2401c;
import com.bykv.p054vk.openvk.component.video.api.p073e.C2410a;
import com.bykv.p054vk.openvk.component.video.api.p074f.C2415c;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bykv.vk.openvk.component.video.a.a.b.c */
/* compiled from: VideoFileManager */
public class C2286c {

    /* renamed from: a */
    public static final ConcurrentHashMap<String, C2284b> f4582a = new ConcurrentHashMap<>();

    /* renamed from: a */
    public static synchronized void m5236a(Context context, C2401c cVar, C2410a.C2411a aVar) {
        synchronized (C2286c.class) {
            if (cVar == null) {
                C2415c.m5827a(" url、dir and hash is must property   in VideoInfoModel");
                return;
            }
            if (Build.VERSION.SDK_INT >= 23) {
                C2284b bVar = f4582a.get(cVar.mo15992k());
                if (bVar == null) {
                    bVar = new C2284b(context, cVar);
                    f4582a.put(cVar.mo15992k(), bVar);
                    C2415c.m5833b("VideoFileManager", "preloadVideo:  cache size = ", Integer.valueOf(cVar.mo15973b()), cVar.mo15992k());
                }
                bVar.mo15677a(aVar);
            }
            C2415c.m5833b("VideoFileManager", "preloadVideo:  cache size = ", Integer.valueOf(cVar.mo15973b()), cVar.mo15992k());
        }
    }

    /* renamed from: a */
    public static synchronized void m5237a(C2401c cVar) {
        synchronized (C2286c.class) {
            if (Build.VERSION.SDK_INT >= 23) {
                C2284b remove = f4582a.remove(cVar.mo15992k());
                if (remove != null) {
                    remove.mo15678a(true);
                }
                C2415c.m5833b("VideoFileManager", "removePreload:  cache size = ", Integer.valueOf(cVar.mo15973b()), cVar.mo15992k());
            }
        }
    }
}
