package com.bykv.p054vk.openvk.component.video.p055a.p059b.p060a;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.C2315d;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.C2325e;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.p061b.C2306c;
import com.bytedance.sdk.component.p123f.C2882e;
import com.bytedance.sdk.component.p123f.C2885g;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: com.bykv.vk.openvk.component.video.a.b.a.c */
/* compiled from: DiskLruCache */
public class C2292c extends C2289a {

    /* renamed from: a */
    public final File f4601a;

    /* renamed from: b */
    private final LinkedHashMap<String, File> f4602b = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: c */
    private final ReentrantReadWriteLock f4603c;

    /* renamed from: d */
    private final ReentrantReadWriteLock.ReadLock f4604d;

    /* renamed from: e */
    private final ReentrantReadWriteLock.WriteLock f4605e;

    /* renamed from: f */
    private final Set<C2299a> f4606f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public volatile long f4607g;

    /* renamed from: h */
    private volatile float f4608h;

    /* renamed from: i */
    private final C2300b f4609i;

    /* renamed from: j */
    private final Runnable f4610j;

    /* renamed from: k */
    private final Handler f4611k;

    /* renamed from: com.bykv.vk.openvk.component.video.a.b.a.c$a */
    /* compiled from: DiskLruCache */
    public interface C2299a {
        /* renamed from: a */
        void mo15708a(String str);

        /* renamed from: a */
        void mo15709a(Set<String> set);
    }

    /* renamed from: a */
    public void mo15700a(C2299a aVar) {
        if (aVar != null) {
            this.f4606f.add(aVar);
        }
    }

    public C2292c(File file) throws IOException {
        String str;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f4603c = reentrantReadWriteLock;
        this.f4604d = reentrantReadWriteLock.readLock();
        this.f4605e = this.f4603c.writeLock();
        this.f4606f = Collections.newSetFromMap(new ConcurrentHashMap());
        this.f4607g = 104857600;
        this.f4608h = 0.5f;
        this.f4609i = new C2300b();
        this.f4610j = new Runnable() {
            public void run() {
                C2882e.m8035a((C2885g) new C2885g("cleanupCmd", 1) {
                    public void run() {
                        C2292c.this.m5262b(C2292c.this.f4607g);
                    }
                });
            }
        };
        this.f4611k = new Handler(Looper.getMainLooper());
        if (file == null || !file.exists() || !file.isDirectory() || !file.canRead() || !file.canWrite()) {
            if (file == null) {
                str = " dir null";
            } else {
                str = "exists: " + file.exists() + ", isDirectory: " + file.isDirectory() + ", canRead: " + file.canRead() + ", canWrite: " + file.canWrite();
            }
            throw new IOException("dir error!  " + str);
        }
        this.f4601a = file;
        C2882e.m8035a((C2885g) new C2885g("DiskLruCache", 5) {
            public void run() {
                C2292c.this.m5261b();
            }
        });
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* renamed from: b */
    public void m5261b() {
        this.f4605e.lock();
        try {
            File[] listFiles = this.f4601a.listFiles();
            if (listFiles != null && listFiles.length > 0) {
                final HashMap hashMap = new HashMap(listFiles.length);
                ArrayList arrayList = new ArrayList(listFiles.length);
                for (File file : listFiles) {
                    if (file.isFile()) {
                        arrayList.add(file);
                        hashMap.put(file, Long.valueOf(file.lastModified()));
                    }
                }
                Collections.sort(arrayList, new Comparator<File>() {
                    /* renamed from: a */
                    public int compare(File file, File file2) {
                        int i = ((((Long) hashMap.get(file)).longValue() - ((Long) hashMap.get(file2)).longValue()) > 0 ? 1 : ((((Long) hashMap.get(file)).longValue() - ((Long) hashMap.get(file2)).longValue()) == 0 ? 0 : -1));
                        if (i < 0) {
                            return -1;
                        }
                        return i > 0 ? 1 : 0;
                    }
                });
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    File file2 = (File) it.next();
                    this.f4602b.put(m5259a(file2), file2);
                }
            }
            this.f4605e.unlock();
            m5264c();
        } catch (Throwable th) {
            this.f4605e.unlock();
            throw th;
        }
    }

    /* renamed from: a */
    public void mo15699a(long j) {
        this.f4607g = j;
        m5264c();
    }

    /* renamed from: c */
    private void m5264c() {
        this.f4611k.removeCallbacks(this.f4610j);
        this.f4611k.postDelayed(this.f4610j, 10000);
    }

    /* renamed from: a */
    public void mo15698a() {
        C2315d.m5308c().mo15748d();
        Context a = C2325e.m5324a();
        if (a != null) {
            C2306c.m5297a(a).mo15729a(0);
        }
        this.f4611k.removeCallbacks(this.f4610j);
        C2882e.m8035a((C2885g) new C2885g("clear", 1) {
            public void run() {
                C2292c.this.m5262b(0);
            }
        });
    }

    /* renamed from: a */
    public void mo15690a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f4609i.mo15710a(str);
        }
    }

    /* renamed from: b */
    public void mo15691b(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f4609i.mo15711b(str);
        }
    }

    /* renamed from: c */
    public File mo15692c(String str) {
        this.f4604d.lock();
        File file = this.f4602b.get(str);
        this.f4604d.unlock();
        if (file != null) {
            return file;
        }
        File file2 = new File(this.f4601a, str);
        this.f4605e.lock();
        this.f4602b.put(str, file2);
        this.f4605e.unlock();
        for (C2299a a : this.f4606f) {
            a.mo15708a(str);
        }
        m5264c();
        return file2;
    }

    /* renamed from: d */
    public File mo15693d(String str) {
        if (!this.f4604d.tryLock()) {
            return null;
        }
        File file = this.f4602b.get(str);
        this.f4604d.unlock();
        return file;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00e3 A[LOOP:3: B:42:0x00dd->B:44:0x00e3, LOOP_END] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m5262b(long r13) {
        /*
            r12 = this;
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r12.f4605e
            r1.lock()
            r1 = 0
            r3 = 0
            java.util.LinkedHashMap<java.lang.String, java.io.File> r4 = r12.f4602b     // Catch:{ all -> 0x00cd }
            java.util.Set r4 = r4.entrySet()     // Catch:{ all -> 0x00cd }
            java.util.Iterator r4 = r4.iterator()     // Catch:{ all -> 0x00cd }
        L_0x0017:
            boolean r5 = r4.hasNext()     // Catch:{ all -> 0x00cd }
            if (r5 == 0) goto L_0x002f
            java.lang.Object r5 = r4.next()     // Catch:{ all -> 0x00cd }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ all -> 0x00cd }
            java.lang.Object r5 = r5.getValue()     // Catch:{ all -> 0x00cd }
            java.io.File r5 = (java.io.File) r5     // Catch:{ all -> 0x00cd }
            long r5 = r5.length()     // Catch:{ all -> 0x00cd }
            long r1 = r1 + r5
            goto L_0x0017
        L_0x002f:
            int r4 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r4 > 0) goto L_0x0039
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r13 = r12.f4605e
            r13.unlock()
            return
        L_0x0039:
            float r13 = (float) r13
            float r14 = r12.f4608h     // Catch:{ all -> 0x00cd }
            float r13 = r13 * r14
            long r13 = (long) r13     // Catch:{ all -> 0x00cd }
            java.util.HashSet r4 = new java.util.HashSet     // Catch:{ all -> 0x00cd }
            r4.<init>()     // Catch:{ all -> 0x00cd }
            java.util.LinkedHashMap<java.lang.String, java.io.File> r3 = r12.f4602b     // Catch:{ all -> 0x00ca }
            java.util.Set r3 = r3.entrySet()     // Catch:{ all -> 0x00ca }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x00ca }
        L_0x004d:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x00ca }
            if (r5 == 0) goto L_0x00ae
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x00ca }
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch:{ all -> 0x00ca }
            java.lang.Object r6 = r5.getValue()     // Catch:{ all -> 0x00ca }
            java.io.File r6 = (java.io.File) r6     // Catch:{ all -> 0x00ca }
            if (r6 == 0) goto L_0x00a3
            boolean r7 = r6.exists()     // Catch:{ all -> 0x00ca }
            if (r7 == 0) goto L_0x00a3
            com.bykv.vk.openvk.component.video.a.b.a.c$b r7 = r12.f4609i     // Catch:{ all -> 0x00ca }
            java.lang.String r8 = r12.m5259a((java.io.File) r6)     // Catch:{ all -> 0x00ca }
            boolean r7 = r7.mo15712c(r8)     // Catch:{ all -> 0x00ca }
            if (r7 != 0) goto L_0x00aa
            long r7 = r6.length()     // Catch:{ all -> 0x00ca }
            java.io.File r9 = new java.io.File     // Catch:{ all -> 0x00ca }
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ all -> 0x00ca }
            r10.<init>()     // Catch:{ all -> 0x00ca }
            java.lang.String r11 = r6.getAbsolutePath()     // Catch:{ all -> 0x00ca }
            r10.append(r11)     // Catch:{ all -> 0x00ca }
            java.lang.String r11 = "-tmp"
            r10.append(r11)     // Catch:{ all -> 0x00ca }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x00ca }
            r9.<init>(r10)     // Catch:{ all -> 0x00ca }
            boolean r6 = r6.renameTo(r9)     // Catch:{ all -> 0x00ca }
            if (r6 == 0) goto L_0x00aa
            r0.add(r9)     // Catch:{ all -> 0x00ca }
            long r1 = r1 - r7
            java.lang.Object r5 = r5.getKey()     // Catch:{ all -> 0x00ca }
            r4.add(r5)     // Catch:{ all -> 0x00ca }
            goto L_0x00aa
        L_0x00a3:
            java.lang.Object r5 = r5.getKey()     // Catch:{ all -> 0x00ca }
            r4.add(r5)     // Catch:{ all -> 0x00ca }
        L_0x00aa:
            int r5 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r5 > 0) goto L_0x004d
        L_0x00ae:
            java.util.Iterator r13 = r4.iterator()     // Catch:{ all -> 0x00ca }
        L_0x00b2:
            boolean r14 = r13.hasNext()     // Catch:{ all -> 0x00ca }
            if (r14 == 0) goto L_0x00c4
            java.lang.Object r14 = r13.next()     // Catch:{ all -> 0x00ca }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x00ca }
            java.util.LinkedHashMap<java.lang.String, java.io.File> r1 = r12.f4602b     // Catch:{ all -> 0x00ca }
            r1.remove(r14)     // Catch:{ all -> 0x00ca }
            goto L_0x00b2
        L_0x00c4:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r13 = r12.f4605e
            r13.unlock()
            goto L_0x00d7
        L_0x00ca:
            r13 = move-exception
            r3 = r4
            goto L_0x00ce
        L_0x00cd:
            r13 = move-exception
        L_0x00ce:
            r13.printStackTrace()     // Catch:{ all -> 0x00f9 }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r13 = r12.f4605e
            r13.unlock()
            r4 = r3
        L_0x00d7:
            java.util.Set<com.bykv.vk.openvk.component.video.a.b.a.c$a> r13 = r12.f4606f
            java.util.Iterator r13 = r13.iterator()
        L_0x00dd:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x00ed
            java.lang.Object r14 = r13.next()
            com.bykv.vk.openvk.component.video.a.b.a.c$a r14 = (com.bykv.p054vk.openvk.component.video.p055a.p059b.p060a.C2292c.C2299a) r14
            r14.mo15709a((java.util.Set<java.lang.String>) r4)
            goto L_0x00dd
        L_0x00ed:
            com.bykv.vk.openvk.component.video.a.b.a.c$5 r13 = new com.bykv.vk.openvk.component.video.a.b.a.c$5
            r14 = 1
            java.lang.String r1 = "trimSize"
            r13.<init>(r1, r14, r0)
            com.bytedance.sdk.component.p123f.C2882e.m8035a((com.bytedance.sdk.component.p123f.C2885g) r13)
            return
        L_0x00f9:
            r13 = move-exception
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r14 = r12.f4605e
            r14.unlock()
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.p054vk.openvk.component.video.p055a.p059b.p060a.C2292c.m5262b(long):void");
    }

    /* renamed from: a */
    private String m5259a(File file) {
        return file.getName();
    }

    /* renamed from: com.bykv.vk.openvk.component.video.a.b.a.c$b */
    /* compiled from: DiskLruCache */
    private static final class C2300b {

        /* renamed from: a */
        private final Map<String, Integer> f4620a;

        private C2300b() {
            this.f4620a = new HashMap();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public synchronized void mo15710a(String str) {
            if (!TextUtils.isEmpty(str)) {
                Integer num = this.f4620a.get(str);
                if (num == null) {
                    this.f4620a.put(str, 1);
                } else {
                    this.f4620a.put(str, Integer.valueOf(num.intValue() + 1));
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public synchronized void mo15711b(String str) {
            Integer num;
            if (!TextUtils.isEmpty(str) && (num = this.f4620a.get(str)) != null) {
                if (num.intValue() == 1) {
                    this.f4620a.remove(str);
                } else {
                    this.f4620a.put(str, Integer.valueOf(num.intValue() - 1));
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public synchronized boolean mo15712c(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return this.f4620a.containsKey(str);
        }
    }
}
