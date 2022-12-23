package com.unity3d.services.core.device;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import com.unity3d.services.core.properties.C12084a;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.unity3d.services.core.device.k */
/* compiled from: VolumeChange */
public class C12031k {

    /* renamed from: a */
    private static ContentObserver f29377a;

    /* renamed from: b */
    private static ArrayList<C12018d> f29378b;

    /* renamed from: com.unity3d.services.core.device.k$a */
    /* compiled from: VolumeChange */
    static class C12032a extends ContentObserver {
        C12032a(Handler handler) {
            super(handler);
        }

        public boolean deliverSelfNotifications() {
            return false;
        }

        public void onChange(boolean z, Uri uri) {
            C12031k.m32776e();
        }
    }

    /* renamed from: b */
    public static void m32773b(C12018d dVar) {
        if (f29378b.contains(dVar)) {
            f29378b.remove(dVar);
        }
        ArrayList<C12018d> arrayList = f29378b;
        if (arrayList == null || arrayList.size() == 0) {
            m32775d();
        }
    }

    /* renamed from: c */
    public static void m32774c() {
        ContentResolver contentResolver;
        if (f29377a == null) {
            f29377a = new C12032a(new Handler(Looper.getMainLooper()));
            Context e = C12084a.m32908e();
            if (e != null && (contentResolver = e.getContentResolver()) != null) {
                contentResolver.registerContentObserver(Settings.System.CONTENT_URI, true, f29377a);
            }
        }
    }

    /* renamed from: d */
    public static void m32775d() {
        ContentResolver contentResolver;
        if (f29377a != null) {
            Context e = C12084a.m32908e();
            if (!(e == null || (contentResolver = e.getContentResolver()) == null)) {
                contentResolver.unregisterContentObserver(f29377a);
            }
            f29377a = null;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static void m32776e() {
        ArrayList<C12018d> arrayList = f29378b;
        if (arrayList != null) {
            Iterator<C12018d> it = arrayList.iterator();
            while (it.hasNext()) {
                C12018d next = it.next();
                next.mo71014a(C12014b.m32714b(next.mo71013a()));
            }
        }
    }

    /* renamed from: a */
    public static void m32771a(C12018d dVar) {
        if (f29378b == null) {
            f29378b = new ArrayList<>();
        }
        if (!f29378b.contains(dVar)) {
            m32774c();
            f29378b.add(dVar);
        }
    }

    /* renamed from: b */
    public static void m32772b() {
        ArrayList<C12018d> arrayList = f29378b;
        if (arrayList != null) {
            arrayList.clear();
        }
        m32775d();
        f29378b = null;
    }
}
