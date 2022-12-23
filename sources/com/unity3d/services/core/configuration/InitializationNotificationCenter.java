package com.unity3d.services.core.configuration;

import com.unity3d.services.core.log.C12065a;
import com.unity3d.services.core.misc.C12080j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class InitializationNotificationCenter implements IInitializationNotificationCenter {

    /* renamed from: a */
    private static InitializationNotificationCenter f29224a;

    /* renamed from: b */
    private HashMap<Integer, IInitializationListener> f29225b = new HashMap<>();

    /* renamed from: com.unity3d.services.core.configuration.InitializationNotificationCenter$a */
    class C11993a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Map.Entry f29226a;

        C11993a(Map.Entry entry) {
            this.f29226a = entry;
        }

        public void run() {
            ((IInitializationListener) this.f29226a.getValue()).onSdkInitialized();
        }
    }

    /* renamed from: com.unity3d.services.core.configuration.InitializationNotificationCenter$b */
    class C11994b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Map.Entry f29228a;

        /* renamed from: b */
        final /* synthetic */ String f29229b;

        /* renamed from: c */
        final /* synthetic */ ErrorState f29230c;

        /* renamed from: d */
        final /* synthetic */ int f29231d;

        C11994b(Map.Entry entry, String str, ErrorState errorState, int i) {
            this.f29228a = entry;
            this.f29229b = str;
            this.f29230c = errorState;
            this.f29231d = i;
        }

        public void run() {
            ((IInitializationListener) this.f29228a.getValue()).onSdkInitializationFailed(this.f29229b, this.f29230c, this.f29231d);
        }
    }

    /* renamed from: a */
    private void m32630a(Integer num) {
        this.f29225b.remove(num);
    }

    public static InitializationNotificationCenter getInstance() {
        if (f29224a == null) {
            f29224a = new InitializationNotificationCenter();
        }
        return f29224a;
    }

    public void addListener(IInitializationListener iInitializationListener) {
        synchronized (this.f29225b) {
            if (iInitializationListener != null) {
                this.f29225b.put(new Integer(iInitializationListener.hashCode()), iInitializationListener);
            }
        }
    }

    public void removeListener(IInitializationListener iInitializationListener) {
        synchronized (this.f29225b) {
            if (iInitializationListener != null) {
                m32630a(new Integer(iInitializationListener.hashCode()));
            }
        }
    }

    public void triggerOnSdkInitializationFailed(String str, ErrorState errorState, int i) {
        synchronized (this.f29225b) {
            String str2 = "SDK Failed to Initialize due to " + str;
            C12065a.m32848c(str2);
            ArrayList arrayList = new ArrayList();
            for (Map.Entry next : this.f29225b.entrySet()) {
                if (next.getValue() != null) {
                    C12080j.m32879a((Runnable) new C11994b(next, str2, errorState, i));
                } else {
                    arrayList.add(next.getKey());
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f29225b.remove((Integer) it.next());
            }
        }
    }

    public void triggerOnSdkInitialized() {
        synchronized (this.f29225b) {
            ArrayList arrayList = new ArrayList();
            for (Map.Entry next : this.f29225b.entrySet()) {
                if (next.getValue() != null) {
                    C12080j.m32879a((Runnable) new C11993a(next));
                } else {
                    arrayList.add(next.getKey());
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f29225b.remove((Integer) it.next());
            }
        }
    }
}
