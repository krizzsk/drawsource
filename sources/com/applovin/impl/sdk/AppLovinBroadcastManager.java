package com.applovin.impl.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AppLovinBroadcastManager {

    /* renamed from: f */
    private static AppLovinBroadcastManager f2821f;

    /* renamed from: g */
    private static final Object f2822g = new Object();

    /* renamed from: a */
    private final Context f2823a;

    /* renamed from: b */
    private final HashMap<Receiver, ArrayList<C1794b>> f2824b = new HashMap<>();

    /* renamed from: c */
    private final HashMap<String, ArrayList<C1794b>> f2825c = new HashMap<>();

    /* renamed from: d */
    private final ArrayList<C1793a> f2826d = new ArrayList<>();

    /* renamed from: e */
    private final Handler f2827e = new Handler(Looper.getMainLooper()) {
        public void handleMessage(Message message) {
            if (message.what == 1) {
                AppLovinBroadcastManager.this.m3787a();
            } else {
                super.handleMessage(message);
            }
        }
    };

    public interface Receiver {
        void onReceive(Context context, Intent intent, Map<String, Object> map);
    }

    /* renamed from: com.applovin.impl.sdk.AppLovinBroadcastManager$a */
    private static class C1793a {

        /* renamed from: a */
        final Intent f2829a;

        /* renamed from: b */
        final Map<String, Object> f2830b;

        /* renamed from: c */
        final List<C1794b> f2831c;

        C1793a(Intent intent, Map<String, Object> map, List<C1794b> list) {
            this.f2829a = intent;
            this.f2830b = map;
            this.f2831c = list;
        }
    }

    /* renamed from: com.applovin.impl.sdk.AppLovinBroadcastManager$b */
    private static class C1794b {

        /* renamed from: a */
        final IntentFilter f2832a;

        /* renamed from: b */
        final Receiver f2833b;

        /* renamed from: c */
        boolean f2834c;

        /* renamed from: d */
        boolean f2835d;

        C1794b(IntentFilter intentFilter, Receiver receiver) {
            this.f2832a = intentFilter;
            this.f2833b = receiver;
        }
    }

    private AppLovinBroadcastManager(Context context) {
        this.f2823a = context;
    }

    /* renamed from: a */
    private List<C1794b> m3786a(Intent intent) {
        synchronized (this.f2824b) {
            String action = intent.getAction();
            String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f2823a.getContentResolver());
            Uri data = intent.getData();
            String scheme = intent.getScheme();
            Set<String> categories = intent.getCategories();
            List<C1794b> list = this.f2825c.get(action);
            if (list == null) {
                return null;
            }
            ArrayList<C1794b> arrayList = null;
            for (C1794b bVar : list) {
                if (!bVar.f2834c) {
                    C1794b bVar2 = bVar;
                    if (bVar.f2832a.match(action, resolveTypeIfNeeded, scheme, data, categories, "AppLovinBroadcastManager") >= 0) {
                        ArrayList arrayList2 = arrayList == null ? new ArrayList() : arrayList;
                        arrayList2.add(bVar2);
                        bVar2.f2834c = true;
                        arrayList = arrayList2;
                    }
                }
            }
            if (arrayList == null) {
                return null;
            }
            for (C1794b bVar3 : arrayList) {
                bVar3.f2834c = false;
            }
            return arrayList;
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        if (r0 >= r1) goto L_0x0000;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
        r3 = r2[r0];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001f, code lost:
        if (r3 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
        r4 = r3.f2831c.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        if (r4.hasNext() == false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
        r5 = r4.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        if (r5 == null) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0038, code lost:
        if (r5.f2835d != false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003a, code lost:
        r5.f2833b.onReceive(r9.f2823a, r3.f2829a, r3.f2830b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0046, code lost:
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        r0 = 0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m3787a() {
        /*
            r9 = this;
        L_0x0000:
            java.util.HashMap<com.applovin.impl.sdk.AppLovinBroadcastManager$Receiver, java.util.ArrayList<com.applovin.impl.sdk.AppLovinBroadcastManager$b>> r0 = r9.f2824b
            monitor-enter(r0)
            java.util.ArrayList<com.applovin.impl.sdk.AppLovinBroadcastManager$a> r1 = r9.f2826d     // Catch:{ all -> 0x0049 }
            int r1 = r1.size()     // Catch:{ all -> 0x0049 }
            if (r1 > 0) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            return
        L_0x000d:
            com.applovin.impl.sdk.AppLovinBroadcastManager$a[] r2 = new com.applovin.impl.sdk.AppLovinBroadcastManager.C1793a[r1]     // Catch:{ all -> 0x0049 }
            java.util.ArrayList<com.applovin.impl.sdk.AppLovinBroadcastManager$a> r3 = r9.f2826d     // Catch:{ all -> 0x0049 }
            r3.toArray(r2)     // Catch:{ all -> 0x0049 }
            java.util.ArrayList<com.applovin.impl.sdk.AppLovinBroadcastManager$a> r3 = r9.f2826d     // Catch:{ all -> 0x0049 }
            r3.clear()     // Catch:{ all -> 0x0049 }
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            r0 = 0
        L_0x001b:
            if (r0 >= r1) goto L_0x0000
            r3 = r2[r0]
            if (r3 != 0) goto L_0x0022
            goto L_0x0046
        L_0x0022:
            java.util.List<com.applovin.impl.sdk.AppLovinBroadcastManager$b> r4 = r3.f2831c
            java.util.Iterator r4 = r4.iterator()
        L_0x0028:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0046
            java.lang.Object r5 = r4.next()
            com.applovin.impl.sdk.AppLovinBroadcastManager$b r5 = (com.applovin.impl.sdk.AppLovinBroadcastManager.C1794b) r5
            if (r5 == 0) goto L_0x0028
            boolean r6 = r5.f2835d
            if (r6 != 0) goto L_0x0028
            com.applovin.impl.sdk.AppLovinBroadcastManager$Receiver r5 = r5.f2833b
            android.content.Context r6 = r9.f2823a
            android.content.Intent r7 = r3.f2829a
            java.util.Map<java.lang.String, java.lang.Object> r8 = r3.f2830b
            r5.onReceive(r6, r7, r8)
            goto L_0x0028
        L_0x0046:
            int r0 = r0 + 1
            goto L_0x001b
        L_0x0049:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0049 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.AppLovinBroadcastManager.m3787a():void");
    }

    public static AppLovinBroadcastManager getInstance(Context context) {
        AppLovinBroadcastManager appLovinBroadcastManager;
        synchronized (f2822g) {
            if (f2821f == null) {
                f2821f = new AppLovinBroadcastManager(context.getApplicationContext());
            }
            appLovinBroadcastManager = f2821f;
        }
        return appLovinBroadcastManager;
    }

    public void registerReceiver(Receiver receiver, IntentFilter intentFilter) {
        synchronized (this.f2824b) {
            C1794b bVar = new C1794b(intentFilter, receiver);
            ArrayList arrayList = this.f2824b.get(receiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                this.f2824b.put(receiver, arrayList);
            }
            arrayList.add(bVar);
            Iterator<String> actionsIterator = intentFilter.actionsIterator();
            while (actionsIterator.hasNext()) {
                String next = actionsIterator.next();
                ArrayList arrayList2 = this.f2825c.get(next);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    this.f2825c.put(next, arrayList2);
                }
                arrayList2.add(bVar);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean sendBroadcast(android.content.Intent r5, java.util.Map<java.lang.String, java.lang.Object> r6) {
        /*
            r4 = this;
            java.util.HashMap<com.applovin.impl.sdk.AppLovinBroadcastManager$Receiver, java.util.ArrayList<com.applovin.impl.sdk.AppLovinBroadcastManager$b>> r0 = r4.f2824b
            monitor-enter(r0)
            java.util.List r1 = r4.m3786a((android.content.Intent) r5)     // Catch:{ all -> 0x0026 }
            if (r1 != 0) goto L_0x000c
            r5 = 0
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            return r5
        L_0x000c:
            java.util.ArrayList<com.applovin.impl.sdk.AppLovinBroadcastManager$a> r2 = r4.f2826d     // Catch:{ all -> 0x0026 }
            com.applovin.impl.sdk.AppLovinBroadcastManager$a r3 = new com.applovin.impl.sdk.AppLovinBroadcastManager$a     // Catch:{ all -> 0x0026 }
            r3.<init>(r5, r6, r1)     // Catch:{ all -> 0x0026 }
            r2.add(r3)     // Catch:{ all -> 0x0026 }
            android.os.Handler r5 = r4.f2827e     // Catch:{ all -> 0x0026 }
            r6 = 1
            boolean r5 = r5.hasMessages(r6)     // Catch:{ all -> 0x0026 }
            if (r5 != 0) goto L_0x0024
            android.os.Handler r5 = r4.f2827e     // Catch:{ all -> 0x0026 }
            r5.sendEmptyMessage(r6)     // Catch:{ all -> 0x0026 }
        L_0x0024:
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            return r6
        L_0x0026:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.AppLovinBroadcastManager.sendBroadcast(android.content.Intent, java.util.Map):boolean");
    }

    public void sendBroadcastSync(Intent intent, Map<String, Object> map) {
        List<C1794b> a = m3786a(intent);
        if (a != null) {
            for (C1794b next : a) {
                if (!next.f2835d) {
                    next.f2833b.onReceive(this.f2823a, intent, map);
                }
            }
        }
    }

    public void sendBroadcastSyncWithPendingBroadcasts(Intent intent, Map<String, Object> map) {
        if (sendBroadcast(intent, map)) {
            m3787a();
        }
    }

    public boolean sendBroadcastWithAdObject(String str, Object obj) {
        HashMap hashMap = new HashMap(1);
        hashMap.put("ad", obj);
        return sendBroadcast(new Intent(str), hashMap);
    }

    public void unregisterReceiver(Receiver receiver) {
        synchronized (this.f2824b) {
            List<C1794b> remove = this.f2824b.remove(receiver);
            if (remove != null) {
                for (C1794b bVar : remove) {
                    bVar.f2835d = true;
                    Iterator<String> actionsIterator = bVar.f2832a.actionsIterator();
                    while (actionsIterator.hasNext()) {
                        String next = actionsIterator.next();
                        List list = this.f2825c.get(next);
                        if (list != null) {
                            Iterator it = list.iterator();
                            while (it.hasNext()) {
                                if (((C1794b) it.next()).f2833b == receiver) {
                                    bVar.f2835d = true;
                                    it.remove();
                                }
                            }
                            if (list.size() <= 0) {
                                this.f2825c.remove(next);
                            }
                        }
                    }
                }
            }
        }
    }
}
