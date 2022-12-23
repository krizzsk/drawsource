package com.bytedance.sdk.component.p123f;

import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.sdk.component.p123f.p124a.C2877a;
import com.bytedance.sdk.component.utils.C2905l;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.sdk.component.f.d */
/* compiled from: PoolTaskStatistics */
public class C2880d {

    /* renamed from: a */
    public static final String[] f6477a = {"com.bytedance.sdk", "com.bykv.vk", "com.ss", "tt_pangle"};

    /* renamed from: b */
    public static final String[] f6478b = {"tt_pangle", "bd_tracker"};

    /* renamed from: c */
    private static AtomicInteger f6479c = new AtomicInteger(0);

    /* renamed from: d */
    private static int f6480d = 0;

    /* renamed from: e */
    private static int f6481e = 0;

    /* renamed from: a */
    public static void m8028a() {
        int i;
        String str;
        C2879c g = C2882e.m8048g();
        if (g != null) {
            int i2 = 1;
            int addAndGet = f6479c.addAndGet(1);
            if (C2882e.f6488c >= 0 && addAndGet % C2882e.f6488c == 0 && Looper.getMainLooper() != Looper.myLooper()) {
                Map<Thread, StackTraceElement[]> allStackTraces = Thread.getAllStackTraces();
                HashMap hashMap = new HashMap();
                if (allStackTraces != null) {
                    boolean a = C2905l.m8108a();
                    int size = allStackTraces.size();
                    if (size > f6481e) {
                        f6481e = size;
                    }
                    Iterator<Map.Entry<Thread, StackTraceElement[]>> it = allStackTraces.entrySet().iterator();
                    int i3 = 0;
                    int i4 = 0;
                    while (it.hasNext()) {
                        Map.Entry next = it.next();
                        i4 += i2;
                        Thread thread = (Thread) next.getKey();
                        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) next.getValue();
                        StringBuilder sb = new StringBuilder("\n");
                        if (a) {
                            sb.append("Thread Name is : " + thread.getName());
                            sb.append("\n");
                        }
                        String str2 = null;
                        int length = stackTraceElementArr.length;
                        int i5 = 0;
                        while (i5 < length) {
                            String stackTraceElement = stackTraceElementArr[i5].toString();
                            Iterator<Map.Entry<Thread, StackTraceElement[]>> it2 = it;
                            if (a) {
                                sb.append(stackTraceElement + "\n");
                            }
                            if (TextUtils.isEmpty(str2)) {
                                if (!m8029a(stackTraceElement, f6477a)) {
                                    str = stackTraceElement;
                                    if (!m8029a(thread.getName(), f6478b)) {
                                    }
                                } else {
                                    str = stackTraceElement;
                                }
                                i3++;
                                str2 = str;
                            }
                            i5++;
                            it = it2;
                        }
                        Iterator<Map.Entry<Thread, StackTraceElement[]>> it3 = it;
                        if (a) {
                            if (!TextUtils.isEmpty(str2)) {
                                String str3 = str2 + "&" + thread.getName();
                                C2881a aVar = (C2881a) hashMap.get(str3);
                                if (aVar != null) {
                                    i = 1;
                                    aVar.mo17792a(aVar.mo17791a() + 1);
                                } else {
                                    i = 1;
                                    aVar = new C2881a(str3, 1, sb.toString(), thread.getName());
                                }
                                hashMap.put(str3, aVar);
                            } else {
                                i = 1;
                            }
                            if (!TextUtils.isEmpty(sb.toString())) {
                                Log.e("PoolTaskStatistics", "Thread index = " + i4 + "   &&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
                                Log.w("PoolTaskStatistics", sb.toString());
                            }
                        } else {
                            i = 1;
                        }
                        i2 = i;
                        it = it3;
                    }
                    if (i3 > f6480d) {
                        f6480d = i3;
                    }
                    if (a) {
                        Log.e("PoolTaskStatistics", "SDK current threads=" + i3 + ", SDK Max threads=" + f6480d + ", Application threads = " + size + ", Application max threads = " + f6481e);
                        for (Map.Entry value : hashMap.entrySet()) {
                            Log.i("PoolTaskStatistics", ((C2881a) value.getValue()).toString());
                        }
                    }
                    g.mo17790a(new C2877a(i3, f6480d, size, f6481e));
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m8029a(String str, String[] strArr) {
        if (!TextUtils.isEmpty(str) && strArr != null) {
            for (String contains : strArr) {
                if (str.contains(contains)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: com.bytedance.sdk.component.f.d$a */
    /* compiled from: PoolTaskStatistics */
    public static class C2881a {

        /* renamed from: a */
        public int f6482a = 0;

        /* renamed from: b */
        public String f6483b = null;

        /* renamed from: c */
        public String f6484c = null;

        /* renamed from: d */
        public String f6485d = null;

        public C2881a(String str, int i, String str2, String str3) {
            this.f6484c = str;
            this.f6482a = i;
            this.f6485d = str2;
            this.f6483b = str3;
        }

        /* renamed from: a */
        public void mo17792a(int i) {
            this.f6482a = i;
        }

        /* renamed from: a */
        public int mo17791a() {
            return this.f6482a;
        }

        public String toString() {
            return "ThreadModel{times=" + this.f6482a + ", name='" + this.f6483b + '\'' + ", lastStackStack='" + this.f6484c + '\'' + '}';
        }
    }
}
