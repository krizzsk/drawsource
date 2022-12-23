package com.mbridge.msdk.dycreator.bus;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.Typography;

class SubscriberMethodFinder {

    /* renamed from: a */
    private static final Map<String, List<SubscriberMethod>> f20423a = new HashMap();

    /* renamed from: b */
    private static final Map<Class<?>, Class<?>> f20424b = new ConcurrentHashMap();

    SubscriberMethodFinder() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final List<SubscriberMethod> mo56874a(Class<?> cls, String str) {
        List<SubscriberMethod> list;
        ThreadMode threadMode;
        String str2 = str;
        String str3 = cls.getName() + '.' + str2;
        synchronized (f20423a) {
            list = f20423a.get(str3);
        }
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
            String name = cls2.getName();
            if (name.startsWith("java.") || name.startsWith("javax.") || name.startsWith("android.")) {
                break;
            }
            for (Method method : cls2.getDeclaredMethods()) {
                String name2 = method.getName();
                if (name2.startsWith(str2)) {
                    Class[] parameterTypes = method.getParameterTypes();
                    if (parameterTypes.length == 1) {
                        String substring = name2.substring(str.length());
                        if (substring.length() == 0) {
                            threadMode = ThreadMode.PostThread;
                        } else if (substring.equals("MainThread")) {
                            threadMode = ThreadMode.MainThread;
                        } else if (substring.equals("BackgroundThread")) {
                            threadMode = ThreadMode.BackgroundThread;
                        } else if (substring.equals("Async")) {
                            threadMode = ThreadMode.Async;
                        } else if (!f20424b.containsKey(cls2)) {
                            throw new EventBusException("Illegal onEvent method, check for typos: " + method);
                        }
                        Class cls3 = parameterTypes[0];
                        sb.setLength(0);
                        sb.append(name2);
                        sb.append(Typography.greater);
                        sb.append(cls3.getName());
                        if (hashSet.add(sb.toString())) {
                            arrayList.add(new SubscriberMethod(method, threadMode, cls3));
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        if (!arrayList.isEmpty()) {
            synchronized (f20423a) {
                f20423a.put(str3, arrayList);
            }
            return arrayList;
        }
        throw new EventBusException("Subscriber " + cls + " has no methods called " + str2);
    }

    /* renamed from: a */
    static void m23812a() {
        f20423a.clear();
    }

    /* renamed from: a */
    static void m23813a(Class<?> cls) {
        if (f20423a.isEmpty()) {
            f20424b.put(cls, cls);
            return;
        }
        throw new IllegalStateException("This method must be called before registering anything");
    }

    public static void clearSkipMethodNameVerifications() {
        f20424b.clear();
    }
}
