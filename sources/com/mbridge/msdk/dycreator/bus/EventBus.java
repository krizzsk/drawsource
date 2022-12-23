package com.mbridge.msdk.dycreator.bus;

import android.os.Looper;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class EventBus {
    public static String TAG = "Event";

    /* renamed from: a */
    static ExecutorService f20389a = Executors.newCachedThreadPool();

    /* renamed from: b */
    private static volatile EventBus f20390b;

    /* renamed from: c */
    private static final Map<Class<?>, List<Class<?>>> f20391c = new HashMap();

    /* renamed from: d */
    private final Map<Class<?>, CopyOnWriteArrayList<Subscription>> f20392d = new HashMap();

    /* renamed from: e */
    private final Map<Object, List<Class<?>>> f20393e = new HashMap();

    /* renamed from: f */
    private final Map<Class<?>, Object> f20394f = new ConcurrentHashMap();

    /* renamed from: g */
    private final ThreadLocal<List<Object>> f20395g = new ThreadLocal<List<Object>>() {
        /* access modifiers changed from: protected */
        public /* synthetic */ Object initialValue() {
            return new ArrayList();
        }
    };

    /* renamed from: h */
    private final ThreadLocal<BooleanWrapper> f20396h = new ThreadLocal<BooleanWrapper>() {
        /* access modifiers changed from: protected */
        public /* synthetic */ Object initialValue() {
            return new BooleanWrapper();
        }
    };

    /* renamed from: i */
    private String f20397i = "onEvent";

    /* renamed from: j */
    private final HandlerPoster f20398j = new HandlerPoster(this, Looper.getMainLooper(), 10);

    /* renamed from: k */
    private final BackgroundPoster f20399k = new BackgroundPoster(this);

    /* renamed from: l */
    private final AsyncPoster f20400l = new AsyncPoster(this);

    /* renamed from: m */
    private final SubscriberMethodFinder f20401m = new SubscriberMethodFinder();

    /* renamed from: n */
    private boolean f20402n;

    /* renamed from: o */
    private boolean f20403o = true;

    /* renamed from: p */
    private Map<String, Object> f20404p = new ConcurrentHashMap();

    interface PostCallback {
        void onPostCompleted(List<SubscriberExceptionEvent> list);
    }

    public static EventBus getDefault() {
        if (f20390b == null) {
            synchronized (EventBus.class) {
                if (f20390b == null) {
                    f20390b = new EventBus();
                }
            }
        }
        return f20390b;
    }

    public static void clearCaches() {
        SubscriberMethodFinder.m23812a();
        f20391c.clear();
    }

    public static void skipMethodNameVerificationFor(Class<?> cls) {
        SubscriberMethodFinder.m23813a(cls);
    }

    public static void clearSkipMethodNameVerifications() {
        SubscriberMethodFinder.clearSkipMethodNameVerifications();
    }

    public final void configureLogSubscriberExceptions(boolean z) {
        if (!this.f20402n) {
            this.f20403o = z;
            return;
        }
        throw new EventBusException("This method must be called before any registration");
    }

    public final void register(Object obj) {
        m23801a(obj, this.f20397i, false);
    }

    public final void register(String str, Object obj) {
        Map<String, Object> map = this.f20404p;
        if (map != null && map.containsKey(str)) {
            unregister(this.f20404p.get(str));
        }
        this.f20404p.put(str, obj);
        m23801a(obj, this.f20397i, false);
    }

    public final void register(Object obj, String str) {
        m23801a(obj, str, false);
    }

    public final void registerSticky(Object obj) {
        m23801a(obj, this.f20397i, true);
    }

    public final void registerSticky(Object obj, String str) {
        m23801a(obj, str, true);
    }

    /* renamed from: a */
    private void m23801a(Object obj, String str, boolean z) {
        for (SubscriberMethod a : this.f20401m.mo56874a(obj.getClass(), str)) {
            m23799a(obj, a, z);
        }
    }

    public final void register(Object obj, Class<?> cls, Class<?>... clsArr) {
        m23802a(obj, this.f20397i, false, cls, clsArr);
    }

    public final synchronized void register(Object obj, String str, Class<?> cls, Class<?>... clsArr) {
        m23802a(obj, str, false, cls, clsArr);
    }

    public final void registerSticky(Object obj, Class<?> cls, Class<?>... clsArr) {
        m23802a(obj, this.f20397i, true, cls, clsArr);
    }

    public final synchronized void registerSticky(Object obj, String str, Class<?> cls, Class<?>... clsArr) {
        m23802a(obj, str, true, cls, clsArr);
    }

    /* renamed from: a */
    private synchronized void m23802a(Object obj, String str, boolean z, Class<?> cls, Class<?>... clsArr) {
        for (SubscriberMethod next : this.f20401m.mo56874a(obj.getClass(), str)) {
            if (cls == next.f20421c) {
                m23799a(obj, next, z);
            } else if (clsArr != null) {
                int length = clsArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (clsArr[i] == next.f20421c) {
                        m23799a(obj, next, z);
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void m23799a(Object obj, SubscriberMethod subscriberMethod, boolean z) {
        Object obj2;
        boolean z2 = true;
        this.f20402n = true;
        Class<?> cls = subscriberMethod.f20421c;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f20392d.get(cls);
        Subscription subscription = new Subscription(obj, subscriberMethod);
        if (copyOnWriteArrayList == null) {
            copyOnWriteArrayList = new CopyOnWriteArrayList();
            this.f20392d.put(cls, copyOnWriteArrayList);
        } else {
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (((Subscription) it.next()).equals(subscription)) {
                    throw new EventBusException("Subscriber " + obj.getClass() + " already registered to event " + cls);
                }
            }
        }
        subscriberMethod.f20419a.setAccessible(true);
        copyOnWriteArrayList.add(subscription);
        List list = this.f20393e.get(obj);
        if (list == null) {
            list = new ArrayList();
            this.f20393e.put(obj, list);
        }
        list.add(cls);
        if (z) {
            synchronized (this.f20394f) {
                obj2 = this.f20394f.get(cls);
            }
            if (obj2 != null) {
                if (Looper.getMainLooper() != Looper.myLooper()) {
                    z2 = false;
                }
                m23798a(subscription, obj2, z2);
            }
        }
    }

    public final synchronized void unregister(Object obj, Class<?>... clsArr) {
        if (clsArr.length != 0) {
            List list = this.f20393e.get(obj);
            if (list != null) {
                for (Class<?> cls : clsArr) {
                    m23800a(obj, cls);
                    list.remove(cls);
                }
                if (list.isEmpty()) {
                    this.f20393e.remove(obj);
                }
            } else {
                Log.w(TAG, "Subscriber to unregister was not registered before: " + obj.getClass());
            }
        } else {
            throw new IllegalArgumentException("Provide at least one event class");
        }
    }

    /* renamed from: a */
    private void m23800a(Object obj, Class<?> cls) {
        List list = this.f20392d.get(cls);
        if (list != null) {
            int size = list.size();
            int i = 0;
            while (i < size) {
                if (((Subscription) list.get(i)).f20425a == obj) {
                    list.remove(i);
                    i--;
                    size--;
                }
                i++;
            }
        }
    }

    public final synchronized void unregister(Object obj) {
        List<Class> list = this.f20393e.get(obj);
        if (list != null) {
            for (Class a : list) {
                m23800a(obj, (Class<?>) a);
            }
            this.f20393e.remove(obj);
        } else {
            String str = TAG;
            Log.w(str, "Subscriber to unregister was not registered before: " + obj.getClass());
        }
    }

    public final synchronized void unregister(String str) {
        if (this.f20404p != null && this.f20404p.containsKey(str)) {
            Object remove = this.f20404p.remove(str);
            List<Class> list = this.f20393e.get(remove);
            if (list != null) {
                for (Class a : list) {
                    m23800a(remove, (Class<?>) a);
                }
                this.f20393e.remove(remove);
            } else {
                String str2 = TAG;
                Log.w(str2, "Subscriber to unregister was not registered before: " + remove.getClass());
            }
        }
    }

    public final void post(Object obj) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        List list = this.f20395g.get();
        list.add(obj);
        BooleanWrapper booleanWrapper = this.f20396h.get();
        if (!booleanWrapper.f20408a) {
            boolean z = Looper.getMainLooper() == Looper.myLooper();
            booleanWrapper.f20408a = true;
            while (!list.isEmpty()) {
                try {
                    Object remove = list.remove(0);
                    if (remove != null) {
                        try {
                            Class<?> cls = remove.getClass();
                            List<Class<?>> a = m23796a(cls);
                            int size = a.size();
                            boolean z2 = false;
                            for (int i = 0; i < size; i++) {
                                Class cls2 = a.get(i);
                                synchronized (this) {
                                    copyOnWriteArrayList = this.f20392d.get(cls2);
                                }
                                if (copyOnWriteArrayList != null) {
                                    Iterator it = copyOnWriteArrayList.iterator();
                                    while (it.hasNext()) {
                                        m23798a((Subscription) it.next(), remove, z);
                                    }
                                    z2 = true;
                                }
                            }
                            if (!z2) {
                                Log.d(TAG, "No subscripers registered for event " + cls);
                                if (!(cls == NoSubscriberEvent.class || cls == SubscriberExceptionEvent.class)) {
                                    post(new NoSubscriberEvent(this, remove));
                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                } finally {
                    booleanWrapper.f20408a = false;
                }
            }
        }
    }

    public final void postSticky(Object obj) {
        post(obj);
        synchronized (this.f20394f) {
            this.f20394f.put(obj.getClass(), obj);
        }
    }

    public final Object getStickyEvent(Class<?> cls) {
        Object obj;
        synchronized (this.f20394f) {
            obj = this.f20394f.get(cls);
        }
        return obj;
    }

    public final Object removeStickyEvent(Class<?> cls) {
        Object remove;
        synchronized (this.f20394f) {
            remove = this.f20394f.remove(cls);
        }
        return remove;
    }

    public final boolean removeStickyEvent(Object obj) {
        synchronized (this.f20394f) {
            Class<?> cls = obj.getClass();
            if (!obj.equals(this.f20394f.get(cls))) {
                return false;
            }
            this.f20394f.remove(cls);
            return true;
        }
    }

    public final void release() {
        if (f20390b != null) {
            f20390b = null;
            f20389a = null;
            Map<Class<?>, List<Class<?>>> map = f20391c;
            if (map != null && map.size() > 0) {
                f20391c.clear();
            }
            Map<Class<?>, CopyOnWriteArrayList<Subscription>> map2 = this.f20392d;
            if (map2 != null && map2.size() > 0) {
                this.f20392d.clear();
            }
            Map<Object, List<Class<?>>> map3 = this.f20393e;
            if (map3 != null && map3.size() > 0) {
                this.f20393e.clear();
            }
            Map<Class<?>, Object> map4 = this.f20394f;
            if (map4 != null && map4.size() > 0) {
                this.f20394f.clear();
            }
            Map<String, Object> map5 = this.f20404p;
            if (map5 != null && map5.size() > 0) {
                this.f20404p.clear();
            }
        }
    }

    /* renamed from: com.mbridge.msdk.dycreator.bus.EventBus$3 */
    static /* synthetic */ class C83653 {

        /* renamed from: a */
        static final /* synthetic */ int[] f20407a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.mbridge.msdk.dycreator.bus.ThreadMode[] r0 = com.mbridge.msdk.dycreator.bus.ThreadMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f20407a = r0
                com.mbridge.msdk.dycreator.bus.ThreadMode r1 = com.mbridge.msdk.dycreator.bus.ThreadMode.PostThread     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f20407a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.mbridge.msdk.dycreator.bus.ThreadMode r1 = com.mbridge.msdk.dycreator.bus.ThreadMode.MainThread     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f20407a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.mbridge.msdk.dycreator.bus.ThreadMode r1 = com.mbridge.msdk.dycreator.bus.ThreadMode.BackgroundThread     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f20407a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.mbridge.msdk.dycreator.bus.ThreadMode r1 = com.mbridge.msdk.dycreator.bus.ThreadMode.Async     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.dycreator.bus.EventBus.C83653.<clinit>():void");
        }
    }

    /* renamed from: a */
    private void m23798a(Subscription subscription, Object obj, boolean z) {
        int i = C83653.f20407a[subscription.f20426b.f20420b.ordinal()];
        if (i == 1) {
            m23797a(subscription, obj);
        } else if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    this.f20400l.enqueue(subscription, obj);
                    return;
                }
                throw new IllegalStateException("Unknown thread mode: " + subscription.f20426b.f20420b);
            } else if (z) {
                this.f20399k.enqueue(subscription, obj);
            } else {
                m23797a(subscription, obj);
            }
        } else if (z) {
            m23797a(subscription, obj);
        } else {
            this.f20398j.mo56867a(subscription, obj);
        }
    }

    /* renamed from: a */
    private List<Class<?>> m23796a(Class<?> cls) {
        List<Class<?>> list;
        synchronized (f20391c) {
            list = f20391c.get(cls);
            if (list == null) {
                list = new ArrayList<>();
                for (Class<?> cls2 = cls; cls2 != null; cls2 = cls2.getSuperclass()) {
                    list.add(cls2);
                    m23803a(list, (Class<?>[]) cls2.getInterfaces());
                }
                f20391c.put(cls, list);
            }
        }
        return list;
    }

    /* renamed from: a */
    private static void m23803a(List<Class<?>> list, Class<?>[] clsArr) {
        for (Class<?> cls : clsArr) {
            if (!list.contains(cls)) {
                list.add(cls);
                m23803a(list, (Class<?>[]) cls.getInterfaces());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo56844a(PendingPost pendingPost) {
        Object obj = pendingPost.f20414a;
        Subscription subscription = pendingPost.f20415b;
        PendingPost.m23807a(pendingPost);
        m23797a(subscription, obj);
    }

    /* renamed from: a */
    private void m23797a(Subscription subscription, Object obj) throws Error {
        try {
            subscription.f20426b.f20419a.invoke(subscription.f20425a, new Object[]{obj});
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (obj instanceof SubscriberExceptionEvent) {
                String str = TAG;
                Log.e(str, "SubscriberExceptionEvent subscriber " + subscription.f20425a.getClass() + " threw an exception", cause);
                SubscriberExceptionEvent subscriberExceptionEvent = (SubscriberExceptionEvent) obj;
                String str2 = TAG;
                Log.e(str2, "Initial event " + subscriberExceptionEvent.causingEvent + " caused exception in " + subscriberExceptionEvent.causingSubscriber, subscriberExceptionEvent.throwable);
                return;
            }
            if (this.f20403o) {
                String str3 = TAG;
                Log.e(str3, "Could not dispatch event: " + obj.getClass() + " to subscribing class " + subscription.f20425a.getClass(), cause);
            }
            post(new SubscriberExceptionEvent(this, cause, obj, subscription.f20425a));
        } catch (IllegalAccessException e2) {
            throw new IllegalStateException("Unexpected exception", e2);
        }
    }

    static final class BooleanWrapper {

        /* renamed from: a */
        boolean f20408a;

        BooleanWrapper() {
        }
    }
}
