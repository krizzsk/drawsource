package com.bykv.p054vk.openvk.component.video.p055a.p059b;

import android.content.Context;
import android.util.Log;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.p060a.C2290b;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.p060a.C2292c;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.p061b.C2306c;
import com.bytedance.sdk.component.utils.C2905l;
import java.util.Collection;
import java.util.Set;

/* renamed from: com.bykv.vk.openvk.component.video.a.b.e */
/* compiled from: Proxy */
public class C2325e {

    /* renamed from: a */
    static volatile C2290b f4683a;

    /* renamed from: b */
    static volatile C2292c f4684b;

    /* renamed from: c */
    public static final boolean f4685c = C2905l.m8116c();

    /* renamed from: d */
    public static volatile boolean f4686d;

    /* renamed from: e */
    static volatile boolean f4687e = true;

    /* renamed from: f */
    static volatile boolean f4688f;

    /* renamed from: g */
    static volatile int f4689g = 0;

    /* renamed from: h */
    public static volatile int f4690h = 3;

    /* renamed from: i */
    public static volatile Integer f4691i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static volatile C2306c f4692j;

    /* renamed from: k */
    private static volatile Context f4693k;

    /* renamed from: a */
    public static Context m5324a() {
        return f4693k;
    }

    /* renamed from: a */
    public static void m5327a(boolean z) {
        f4687e = z;
    }

    /* renamed from: b */
    public static void m5329b(boolean z) {
        f4688f = z;
    }

    /* renamed from: a */
    public static void m5325a(int i) {
        f4689g = i;
    }

    /* renamed from: a */
    public static void m5326a(C2292c cVar, Context context) {
        if (cVar == null || context == null) {
            throw new IllegalArgumentException("DiskLruCache and Context can't be null !!!");
        }
        f4693k = context.getApplicationContext();
        if (f4684b == null) {
            C2290b bVar = f4683a;
            if (bVar == null || !bVar.f4599a.getAbsolutePath().equals(cVar.f4601a.getAbsolutePath())) {
                f4684b = cVar;
                f4692j = C2306c.m5297a(context);
                f4684b.mo15700a((C2292c.C2299a) new C2292c.C2299a() {
                    /* renamed from: a */
                    public void mo15708a(String str) {
                        if (C2325e.f4685c) {
                            Log.i("TAG_PROXY_DiskLruCache", "new cache created: " + str);
                        }
                    }

                    /* renamed from: a */
                    public void mo15709a(Set<String> set) {
                        C2325e.f4692j.mo15731a((Collection<String>) set, 0);
                        if (C2325e.f4685c) {
                            Log.i("TAG_PROXY_DiskLruCache", "cache file removed, " + set);
                        }
                    }
                });
                C2334f a = C2334f.m5358a();
                a.mo15772a(cVar);
                a.mo15773a(f4692j);
                C2315d c = C2315d.m5308c();
                c.mo15740a(cVar);
                c.mo15741a(f4692j);
                return;
            }
            throw new IllegalArgumentException("DiskLruCache 和 DiskCache 不能使用相同的目录");
        }
    }

    /* renamed from: b */
    public static C2292c m5328b() {
        return f4684b;
    }

    /* renamed from: c */
    public static C2290b m5330c() {
        return f4683a;
    }
}
