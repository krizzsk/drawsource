package com.bykv.p054vk.openvk.component.video.p055a.p059b;

import android.util.Log;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.C2350h;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.C2352i;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.C2359l;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.p060a.C2289a;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.p061b.C2304a;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.p061b.C2306c;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.p062c.C2311a;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.p062c.C2312b;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.p062c.C2313c;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.p062c.C2314d;
import com.bykv.p054vk.openvk.component.video.p055a.p059b.p064e.C2327a;
import com.bykv.p054vk.openvk.component.video.p055a.p066c.C2361a;
import com.ironsource.mediationsdk.config.VersionInfo;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;

/* renamed from: com.bykv.vk.openvk.component.video.a.b.g */
/* compiled from: ProxyTask */
class C2344g extends C2287a {

    /* renamed from: m */
    private final Socket f4739m;

    /* renamed from: n */
    private final C2349c f4740n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C2315d f4741o;

    /* renamed from: p */
    private volatile C2301b f4742p;

    /* renamed from: q */
    private volatile boolean f4743q = true;

    /* renamed from: com.bykv.vk.openvk.component.video.a.b.g$c */
    /* compiled from: ProxyTask */
    public interface C2349c {
        /* renamed from: a */
        void mo15778a(C2344g gVar);

        /* renamed from: b */
        void mo15779b(C2344g gVar);
    }

    /* renamed from: a */
    private void m5402a(boolean z, int i, int i2, int i3, int i4) {
    }

    C2344g(C2347a aVar) {
        super(aVar.f4747a, aVar.f4748b);
        this.f4739m = aVar.f4749c;
        this.f4740n = aVar.f4750d;
        this.f4741o = C2315d.m5308c();
    }

    /* renamed from: h */
    private C2348b m5408h() {
        try {
            this.f4592i = C2352i.m5426a(this.f4739m.getInputStream());
            OutputStream outputStream = this.f4739m.getOutputStream();
            C2289a aVar = this.f4592i.f4757c.f4758a == 1 ? C2325e.f4683a : C2325e.f4684b;
            if (aVar == null) {
                if (C2325e.f4685c) {
                    Log.e("TAG_PROXY_ProxyTask", "cache is null");
                }
                return null;
            }
            this.f4584a = aVar;
            this.f4590g = this.f4592i.f4757c.f4759b;
            this.f4591h = this.f4592i.f4757c.f4760c;
            this.f4593j = new C2359l(this.f4592i.f4757c.f4764g);
            this.f4589f = this.f4592i.f4756b;
            if (C2325e.f4685c) {
                Log.i("TAG_PROXY_ProxyTask", "request from MediaPlayer:    " + this.f4592i.toString());
            }
            return new C2348b(outputStream, this.f4592i.f4757c.f4761d);
        } catch (IOException e) {
            C2361a.m5455a(this.f4739m);
            if (C2325e.f4685c) {
                Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e));
            }
            mo15682a(this.f4584a == null ? null : Boolean.valueOf(mo15688g()), this.f4590g, e);
            return null;
        } catch (C2352i.C2356d e2) {
            C2361a.m5455a(this.f4739m);
            if (C2325e.f4685c) {
                Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e2));
            }
            mo15682a(this.f4584a == null ? null : Boolean.valueOf(mo15688g()), this.f4590g, e2);
            return null;
        }
    }

    public void run() {
        C2304a a;
        C2348b h = m5408h();
        if (h != null) {
            C2349c cVar = this.f4740n;
            if (cVar != null) {
                cVar.mo15778a(this);
            }
            this.f4584a.mo15690a(this.f4591h);
            if (C2325e.f4690h != 0 && ((a = this.f4585b.mo15728a(this.f4591h, this.f4592i.f4757c.f4758a)) == null || this.f4584a.mo15692c(this.f4591h).length() < ((long) a.f4639c))) {
                this.f4741o.mo15743a(mo15688g(), this.f4591h);
            }
            try {
                m5403a(h);
            } catch (C2311a e) {
                if (C2325e.f4685c) {
                    Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e));
                }
            } catch (Throwable th) {
                if (C2325e.f4685c) {
                    Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(th));
                }
            }
            this.f4584a.mo15691b(this.f4591h);
            this.f4741o.mo15743a(mo15688g(), (String) null);
            mo15680a();
            C2361a.m5455a(this.f4739m);
            C2349c cVar2 = this.f4740n;
            if (cVar2 != null) {
                cVar2.mo15779b(this);
            }
        }
    }

    /* renamed from: a */
    private boolean m5403a(C2348b bVar) throws C2311a {
        while (this.f4593j.mo15809a()) {
            mo15686e();
            C2359l.C2360a b = this.f4593j.mo15810b();
            try {
                m5401a(bVar, b);
                return true;
            } catch (C2313c e) {
                b.mo15811a();
                mo15682a(Boolean.valueOf(mo15688g()), this.f4590g, e);
            } catch (IOException e2) {
                if (e2 instanceof SocketTimeoutException) {
                    b.mo15812b();
                }
                if (!mo15683b()) {
                    mo15682a(Boolean.valueOf(mo15688g()), this.f4590g, e2);
                } else if (C2325e.f4685c) {
                    if ("Canceled".equalsIgnoreCase(e2.getMessage())) {
                        Log.w("TAG_PROXY_ProxyTask", "okhttp call canceled");
                    } else {
                        Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e2));
                    }
                }
            } catch (C2314d e3) {
                if (C2325e.f4685c) {
                    Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e3));
                }
                return true;
            } catch (C2350h.C2351a e4) {
                if (C2325e.f4685c) {
                    Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e4));
                }
                this.f4743q = false;
                mo15682a(Boolean.valueOf(mo15688g()), this.f4590g, e4);
            } catch (C2312b e5) {
                if (C2325e.f4685c) {
                    Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e5));
                }
                return false;
            } catch (Exception e6) {
                if (C2325e.f4685c) {
                    Log.e("TAG_PROXY_ProxyTask", Log.getStackTraceString(e6));
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m5401a(C2348b bVar, C2359l.C2360a aVar) throws C2314d, IOException, C2350h.C2351a, C2311a, C2312b {
        if (VersionInfo.GIT_BRANCH.equalsIgnoreCase(this.f4592i.f4755a.f4767a)) {
            m5405b(bVar, aVar);
        } else {
            m5406c(bVar, aVar);
        }
    }

    /* renamed from: b */
    private void m5405b(C2348b bVar, C2359l.C2360a aVar) throws IOException, C2314d {
        byte[] a = m5404a(this.f4585b.mo15728a(this.f4591h, this.f4592i.f4757c.f4758a), bVar, aVar);
        if (a != null) {
            bVar.mo15795a(a, 0, a.length);
        }
    }

    /* renamed from: c */
    private void m5406c(C2348b bVar, C2359l.C2360a aVar) throws C2350h.C2351a, C2314d, IOException, C2311a, C2312b {
        int i;
        if (this.f4743q) {
            File c = this.f4584a.mo15692c(this.f4591h);
            long length = c.length();
            C2304a a = this.f4585b.mo15728a(this.f4591h, this.f4592i.f4757c.f4758a);
            int b = bVar.mo15797b();
            long j = length - ((long) b);
            int i2 = (int) j;
            if (a == null) {
                i = -1;
            } else {
                i = a.f4639c;
            }
            if (length > ((long) bVar.mo15797b())) {
                if (C2325e.f4685c) {
                    Log.i("TAG_PROXY_ProxyTask", "cache hit, remainSize: " + j);
                }
                m5402a(true, i2, i, (int) length, b);
                m5400a(a, c, bVar, aVar);
                return;
            }
            m5402a(false, i2, i, (int) length, b);
        } else {
            m5402a(false, 0, 0, 0, bVar.mo15797b());
        }
        m5407d(bVar, aVar);
    }

    /* renamed from: a */
    private byte[] m5404a(C2304a aVar, C2348b bVar, C2359l.C2360a aVar2) throws IOException {
        if (aVar != null) {
            if (C2325e.f4685c) {
                Log.i("TAG_PROXY_ProxyTask", "get header from db");
            }
            return C2361a.m5444a(aVar, bVar.mo15797b()).getBytes(C2361a.f4784a);
        }
        C2327a a = mo15679a(aVar2, 0, -1, VersionInfo.GIT_BRANCH);
        if (a == null) {
            return null;
        }
        try {
            String a2 = C2361a.m5446a(a, false, false);
            if (a2 == null) {
                C2304a a3 = C2361a.m5442a(a, this.f4585b, this.f4591h, this.f4592i.f4757c.f4758a);
                if (C2325e.f4685c) {
                    Log.w("TAG_PROXY_ProxyTask", "get header from network");
                }
                return C2361a.m5444a(a3, bVar.mo15797b()).getBytes(C2361a.f4784a);
            }
            throw new C2313c(a2 + ", rawKey: " + this.f4590g + ", url: " + aVar2);
        } finally {
            C2361a.m5451a((Closeable) a.mo15765d());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:90:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x01cd A[SYNTHETIC, Splitter:B:92:0x01cd] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5400a(com.bykv.p054vk.openvk.component.video.p055a.p059b.p061b.C2304a r8, java.io.File r9, com.bykv.p054vk.openvk.component.video.p055a.p059b.C2344g.C2348b r10, com.bykv.p054vk.openvk.component.video.p055a.p059b.C2359l.C2360a r11) throws java.io.IOException, com.bykv.p054vk.openvk.component.video.p055a.p059b.p062c.C2314d, com.bykv.p054vk.openvk.component.video.p055a.p059b.C2350h.C2351a, com.bykv.p054vk.openvk.component.video.p055a.p059b.p062c.C2311a, com.bykv.p054vk.openvk.component.video.p055a.p059b.p062c.C2312b {
        /*
            r7 = this;
            boolean r0 = r10.mo15796a()
            r1 = 0
            if (r0 != 0) goto L_0x0015
            byte[] r0 = r7.m5404a(r8, r10, r11)
            r7.mo15686e()
            if (r0 != 0) goto L_0x0011
            return
        L_0x0011:
            int r2 = r0.length
            r10.mo15795a(r0, r1, r2)
        L_0x0015:
            r0 = 0
            if (r8 != 0) goto L_0x0068
            com.bykv.vk.openvk.component.video.a.b.b.c r8 = r7.f4585b
            java.lang.String r2 = r7.f4591h
            com.bykv.vk.openvk.component.video.a.b.i r3 = r7.f4592i
            com.bykv.vk.openvk.component.video.a.b.i$a r3 = r3.f4757c
            int r3 = r3.f4758a
            com.bykv.vk.openvk.component.video.a.b.b.a r8 = r8.mo15728a((java.lang.String) r2, (int) r3)
            if (r8 != 0) goto L_0x0068
            boolean r8 = com.bykv.p054vk.openvk.component.video.p055a.p059b.C2325e.f4685c
            if (r8 == 0) goto L_0x0033
            java.lang.String r8 = "TAG_PROXY_ProxyTask"
            java.lang.String r2 = "failed to get video header info from db"
            android.util.Log.e(r8, r2)
        L_0x0033:
            r7.m5404a(r0, r10, r11)
            com.bykv.vk.openvk.component.video.a.b.b.c r8 = r7.f4585b
            java.lang.String r2 = r7.f4591h
            com.bykv.vk.openvk.component.video.a.b.i r3 = r7.f4592i
            com.bykv.vk.openvk.component.video.a.b.i$a r3 = r3.f4757c
            int r3 = r3.f4758a
            com.bykv.vk.openvk.component.video.a.b.b.a r8 = r8.mo15728a((java.lang.String) r2, (int) r3)
            if (r8 == 0) goto L_0x0047
            goto L_0x0068
        L_0x0047:
            com.bykv.vk.openvk.component.video.a.b.c.c r8 = new com.bykv.vk.openvk.component.video.a.b.c.c
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r10 = "failed to get header, rawKey: "
            r9.append(r10)
            java.lang.String r10 = r7.f4590g
            r9.append(r10)
            java.lang.String r10 = ", url: "
            r9.append(r10)
            r9.append(r11)
            java.lang.String r9 = r9.toString()
            r8.<init>(r9)
            throw r8
        L_0x0068:
            long r2 = r9.length()
            int r4 = r8.f4639c
            long r4 = (long) r4
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L_0x00e4
            com.bykv.vk.openvk.component.video.a.b.b r2 = r7.f4742p
            if (r2 == 0) goto L_0x0083
            boolean r3 = r2.mo15683b()
            if (r3 != 0) goto L_0x0083
            boolean r2 = r2.mo15685d()
            if (r2 == 0) goto L_0x00e4
        L_0x0083:
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = new com.bykv.vk.openvk.component.video.a.b.b$a
            r2.<init>()
            com.bykv.vk.openvk.component.video.a.b.a.a r3 = r7.f4584a
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = r2.mo15717a((com.bykv.p054vk.openvk.component.video.p055a.p059b.p060a.C2289a) r3)
            com.bykv.vk.openvk.component.video.a.b.b.c r3 = r7.f4585b
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = r2.mo15719a((com.bykv.p054vk.openvk.component.video.p055a.p059b.p061b.C2306c) r3)
            java.lang.String r3 = r7.f4590g
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = r2.mo15723a((java.lang.String) r3)
            java.lang.String r3 = r7.f4591h
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = r2.mo15726b(r3)
            com.bykv.vk.openvk.component.video.a.b.l r3 = new com.bykv.vk.openvk.component.video.a.b.l
            java.lang.String r4 = r11.f4781a
            r3.<init>((java.lang.String) r4)
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = r2.mo15721a((com.bykv.p054vk.openvk.component.video.p055a.p059b.C2359l) r3)
            java.util.List r3 = r7.f4589f
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = r2.mo15724a((java.util.List<com.bykv.p054vk.openvk.component.video.p055a.p059b.C2352i.C2354b>) r3)
            com.bykv.vk.openvk.component.video.a.b.i r3 = r7.f4592i
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = r2.mo15720a((com.bykv.p054vk.openvk.component.video.p055a.p059b.C2352i) r3)
            com.bykv.vk.openvk.component.video.a.b.g$1 r3 = new com.bykv.vk.openvk.component.video.a.b.g$1
            r3.<init>()
            com.bykv.vk.openvk.component.video.a.b.b$a r2 = r2.mo15718a((com.bykv.p054vk.openvk.component.video.p055a.p059b.C2301b.C2303b) r3)
            com.bykv.vk.openvk.component.video.a.b.b r2 = r2.mo15725a()
            r7.f4742p = r2
            com.bytedance.sdk.component.f.f r3 = new com.bytedance.sdk.component.f.f
            r4 = 10
            r5 = 1
            r3.<init>(r2, r0, r4, r5)
            com.bykv.vk.openvk.component.video.a.b.g$2 r2 = new com.bykv.vk.openvk.component.video.a.b.g$2
            java.lang.String r4 = "processCacheNetWorkConcurrent"
            r2.<init>(r4, r3)
            com.bytedance.sdk.component.p123f.C2882e.m8035a((com.bytedance.sdk.component.p123f.C2885g) r2)
            boolean r2 = com.bykv.p054vk.openvk.component.video.p055a.p059b.C2325e.f4685c
            if (r2 == 0) goto L_0x00e5
            java.lang.String r2 = "TAG_PROXY_ProxyTask"
            java.lang.String r4 = "fire download in process cache task"
            android.util.Log.e(r2, r4)
            goto L_0x00e5
        L_0x00e4:
            r3 = r0
        L_0x00e5:
            r2 = 8192(0x2000, float:1.14794E-41)
            byte[] r2 = new byte[r2]
            com.bykv.vk.openvk.component.video.a.b.h r4 = new com.bykv.vk.openvk.component.video.a.b.h     // Catch:{ all -> 0x01c5 }
            java.lang.String r5 = "r"
            r4.<init>(r9, r5)     // Catch:{ all -> 0x01c5 }
            int r9 = r10.mo15797b()     // Catch:{ all -> 0x01c2 }
            long r5 = (long) r9     // Catch:{ all -> 0x01c2 }
            r4.mo15801a((long) r5)     // Catch:{ all -> 0x01c2 }
            com.bykv.vk.openvk.component.video.a.b.i r9 = r7.f4592i     // Catch:{ all -> 0x01c2 }
            com.bykv.vk.openvk.component.video.a.b.i$a r9 = r9.f4757c     // Catch:{ all -> 0x01c2 }
            int r9 = r9.f4762e     // Catch:{ all -> 0x01c2 }
            if (r9 <= 0) goto L_0x010d
            int r8 = r8.f4639c     // Catch:{ all -> 0x01c2 }
            com.bykv.vk.openvk.component.video.a.b.i r9 = r7.f4592i     // Catch:{ all -> 0x01c2 }
            com.bykv.vk.openvk.component.video.a.b.i$a r9 = r9.f4757c     // Catch:{ all -> 0x01c2 }
            int r9 = r9.f4762e     // Catch:{ all -> 0x01c2 }
            int r8 = java.lang.Math.min(r8, r9)     // Catch:{ all -> 0x01c2 }
            goto L_0x010f
        L_0x010d:
            int r8 = r8.f4639c     // Catch:{ all -> 0x01c2 }
        L_0x010f:
            int r9 = r10.mo15797b()     // Catch:{ all -> 0x01c2 }
            if (r9 >= r8) goto L_0x018b
            r7.mo15686e()     // Catch:{ all -> 0x01c2 }
            int r9 = r4.mo15799a((byte[]) r2)     // Catch:{ all -> 0x01c2 }
            if (r9 > 0) goto L_0x0184
            com.bykv.vk.openvk.component.video.a.b.b r9 = r7.f4742p     // Catch:{ all -> 0x01c2 }
            if (r9 == 0) goto L_0x0131
            com.bykv.vk.openvk.component.video.a.b.c.b r0 = r9.mo15714i()     // Catch:{ all -> 0x01c2 }
            if (r0 != 0) goto L_0x0130
            com.bykv.vk.openvk.component.video.a.b.h$a r0 = r9.mo15713h()     // Catch:{ all -> 0x01c2 }
            if (r0 != 0) goto L_0x012f
            goto L_0x0131
        L_0x012f:
            throw r0     // Catch:{ all -> 0x01c2 }
        L_0x0130:
            throw r0     // Catch:{ all -> 0x01c2 }
        L_0x0131:
            if (r9 == 0) goto L_0x0158
            boolean r0 = r9.mo15683b()     // Catch:{ all -> 0x01c2 }
            if (r0 != 0) goto L_0x0158
            boolean r0 = r9.mo15685d()     // Catch:{ all -> 0x01c2 }
            if (r0 == 0) goto L_0x0140
            goto L_0x0158
        L_0x0140:
            r7.mo15686e()     // Catch:{ all -> 0x01c2 }
            java.lang.Object r0 = r9.f4621m     // Catch:{ all -> 0x01c2 }
            monitor-enter(r0)     // Catch:{ all -> 0x01c2 }
            java.lang.Object r9 = r9.f4621m     // Catch:{ InterruptedException -> 0x0150 }
            r5 = 1000(0x3e8, double:4.94E-321)
            r9.wait(r5)     // Catch:{ InterruptedException -> 0x0150 }
            goto L_0x0154
        L_0x014e:
            r8 = move-exception
            goto L_0x0156
        L_0x0150:
            r9 = move-exception
            r9.printStackTrace()     // Catch:{ all -> 0x014e }
        L_0x0154:
            monitor-exit(r0)     // Catch:{ all -> 0x014e }
            goto L_0x0187
        L_0x0156:
            monitor-exit(r0)     // Catch:{ all -> 0x014e }
            throw r8     // Catch:{ all -> 0x01c2 }
        L_0x0158:
            boolean r8 = com.bykv.p054vk.openvk.component.video.p055a.p059b.C2325e.f4685c     // Catch:{ all -> 0x01c2 }
            if (r8 == 0) goto L_0x0163
            java.lang.String r8 = "TAG_PROXY_ProxyTask"
            java.lang.String r9 = "download task has finished!!!"
            android.util.Log.e(r8, r9)     // Catch:{ all -> 0x01c2 }
        L_0x0163:
            com.bykv.vk.openvk.component.video.a.b.c.c r8 = new com.bykv.vk.openvk.component.video.a.b.c.c     // Catch:{ all -> 0x01c2 }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c2 }
            r9.<init>()     // Catch:{ all -> 0x01c2 }
            java.lang.String r10 = "illegal state download task has finished, rawKey: "
            r9.append(r10)     // Catch:{ all -> 0x01c2 }
            java.lang.String r10 = r7.f4590g     // Catch:{ all -> 0x01c2 }
            r9.append(r10)     // Catch:{ all -> 0x01c2 }
            java.lang.String r10 = ", url: "
            r9.append(r10)     // Catch:{ all -> 0x01c2 }
            r9.append(r11)     // Catch:{ all -> 0x01c2 }
            java.lang.String r9 = r9.toString()     // Catch:{ all -> 0x01c2 }
            r8.<init>(r9)     // Catch:{ all -> 0x01c2 }
            throw r8     // Catch:{ all -> 0x01c2 }
        L_0x0184:
            r10.mo15798b(r2, r1, r9)     // Catch:{ all -> 0x01c2 }
        L_0x0187:
            r7.mo15686e()     // Catch:{ all -> 0x01c2 }
            goto L_0x010f
        L_0x018b:
            boolean r9 = com.bykv.p054vk.openvk.component.video.p055a.p059b.C2325e.f4685c     // Catch:{ all -> 0x01c2 }
            if (r9 == 0) goto L_0x01b1
            java.lang.String r9 = "TAG_PROXY_ProxyTask"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x01c2 }
            r11.<init>()     // Catch:{ all -> 0x01c2 }
            java.lang.String r0 = "read cache file complete: "
            r11.append(r0)     // Catch:{ all -> 0x01c2 }
            int r10 = r10.mo15797b()     // Catch:{ all -> 0x01c2 }
            r11.append(r10)     // Catch:{ all -> 0x01c2 }
            java.lang.String r10 = ", "
            r11.append(r10)     // Catch:{ all -> 0x01c2 }
            r11.append(r8)     // Catch:{ all -> 0x01c2 }
            java.lang.String r8 = r11.toString()     // Catch:{ all -> 0x01c2 }
            android.util.Log.i(r9, r8)     // Catch:{ all -> 0x01c2 }
        L_0x01b1:
            r7.mo15684c()     // Catch:{ all -> 0x01c2 }
            r4.mo15800a()
            if (r3 == 0) goto L_0x01c1
            r3.get()     // Catch:{ all -> 0x01bd }
            goto L_0x01c1
        L_0x01bd:
            r8 = move-exception
            r8.printStackTrace()
        L_0x01c1:
            return
        L_0x01c2:
            r8 = move-exception
            r0 = r4
            goto L_0x01c6
        L_0x01c5:
            r8 = move-exception
        L_0x01c6:
            if (r0 == 0) goto L_0x01cb
            r0.mo15800a()
        L_0x01cb:
            if (r3 == 0) goto L_0x01d5
            r3.get()     // Catch:{ all -> 0x01d1 }
            goto L_0x01d5
        L_0x01d1:
            r9 = move-exception
            r9.printStackTrace()
        L_0x01d5:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.p054vk.openvk.component.video.p055a.p059b.C2344g.m5400a(com.bykv.vk.openvk.component.video.a.b.b.a, java.io.File, com.bykv.vk.openvk.component.video.a.b.g$b, com.bykv.vk.openvk.component.video.a.b.l$a):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x01ad A[EDGE_INSN: B:100:0x01ad->B:77:0x01ad ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0104 A[Catch:{ all -> 0x01d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x015c A[Catch:{ all -> 0x01d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x015e A[Catch:{ all -> 0x01d9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x016f A[Catch:{ all -> 0x017e, all -> 0x01d5, all -> 0x01a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01b1 A[Catch:{ all -> 0x017e, all -> 0x01d5, all -> 0x01a0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0208  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m5407d(com.bykv.p054vk.openvk.component.video.p055a.p059b.C2344g.C2348b r13, com.bykv.p054vk.openvk.component.video.p055a.p059b.C2359l.C2360a r14) throws com.bykv.p054vk.openvk.component.video.p055a.p059b.p062c.C2314d, java.io.IOException, com.bykv.p054vk.openvk.component.video.p055a.p059b.p062c.C2311a, com.bykv.p054vk.openvk.component.video.p055a.p059b.p062c.C2312b {
        /*
            r12 = this;
            r12.m5409i()
            long r0 = android.os.SystemClock.elapsedRealtime()
            int r2 = r13.mo15797b()
            com.bykv.vk.openvk.component.video.a.b.i r3 = r12.f4592i
            com.bykv.vk.openvk.component.video.a.b.i$a r3 = r3.f4757c
            int r3 = r3.f4762e
            java.lang.String r4 = "GET"
            com.bykv.vk.openvk.component.video.a.b.e.a r3 = r12.mo15679a(r14, r2, r3, r4)
            if (r3 != 0) goto L_0x001a
            return
        L_0x001a:
            r4 = 1
            r5 = 0
            r6 = 0
            java.lang.String r4 = com.bykv.p054vk.openvk.component.video.p055a.p066c.C2361a.m5446a(r3, r6, r4)     // Catch:{ all -> 0x01fe }
            java.lang.String r7 = ", rawKey: "
            if (r4 != 0) goto L_0x01dc
            com.bykv.vk.openvk.component.video.a.b.b.c r4 = r12.f4585b     // Catch:{ all -> 0x01fe }
            java.lang.String r8 = r12.f4591h     // Catch:{ all -> 0x01fe }
            int r9 = r12.mo15687f()     // Catch:{ all -> 0x01fe }
            com.bykv.vk.openvk.component.video.a.b.b.a r4 = r4.mo15728a((java.lang.String) r8, (int) r9)     // Catch:{ all -> 0x01fe }
            int r8 = com.bykv.p054vk.openvk.component.video.p055a.p066c.C2361a.m5440a((com.bykv.p054vk.openvk.component.video.p055a.p059b.p064e.C2327a) r3)     // Catch:{ all -> 0x01fe }
            java.lang.String r9 = "TAG_PROXY_ProxyTask"
            if (r4 == 0) goto L_0x00a4
            int r10 = r4.f4639c     // Catch:{ all -> 0x01fe }
            if (r10 == r8) goto L_0x00a4
            boolean r13 = com.bykv.p054vk.openvk.component.video.p055a.p059b.C2325e.f4685c     // Catch:{ all -> 0x01fe }
            if (r13 == 0) goto L_0x0069
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fe }
            r13.<init>()     // Catch:{ all -> 0x01fe }
            java.lang.String r2 = "Content-Length not match, old: "
            r13.append(r2)     // Catch:{ all -> 0x01fe }
            int r2 = r4.f4639c     // Catch:{ all -> 0x01fe }
            r13.append(r2)     // Catch:{ all -> 0x01fe }
            java.lang.String r2 = ", "
            r13.append(r2)     // Catch:{ all -> 0x01fe }
            r13.append(r8)     // Catch:{ all -> 0x01fe }
            java.lang.String r2 = ", key: "
            r13.append(r2)     // Catch:{ all -> 0x01fe }
            java.lang.String r2 = r12.f4591h     // Catch:{ all -> 0x01fe }
            r13.append(r2)     // Catch:{ all -> 0x01fe }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x01fe }
            android.util.Log.e(r9, r13)     // Catch:{ all -> 0x01fe }
        L_0x0069:
            com.bykv.vk.openvk.component.video.a.b.c.b r13 = new com.bykv.vk.openvk.component.video.a.b.c.b     // Catch:{ all -> 0x01fe }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fe }
            r2.<init>()     // Catch:{ all -> 0x01fe }
            java.lang.String r9 = "Content-Length not match, old length: "
            r2.append(r9)     // Catch:{ all -> 0x01fe }
            int r9 = r4.f4639c     // Catch:{ all -> 0x01fe }
            r2.append(r9)     // Catch:{ all -> 0x01fe }
            java.lang.String r9 = ", new length: "
            r2.append(r9)     // Catch:{ all -> 0x01fe }
            r2.append(r8)     // Catch:{ all -> 0x01fe }
            r2.append(r7)     // Catch:{ all -> 0x01fe }
            java.lang.String r7 = r12.f4590g     // Catch:{ all -> 0x01fe }
            r2.append(r7)     // Catch:{ all -> 0x01fe }
            java.lang.String r7 = ", currentUrl: "
            r2.append(r7)     // Catch:{ all -> 0x01fe }
            r2.append(r14)     // Catch:{ all -> 0x01fe }
            java.lang.String r14 = ", previousInfo: "
            r2.append(r14)     // Catch:{ all -> 0x01fe }
            java.lang.String r14 = r4.f4641e     // Catch:{ all -> 0x01fe }
            r2.append(r14)     // Catch:{ all -> 0x01fe }
            java.lang.String r14 = r2.toString()     // Catch:{ all -> 0x01fe }
            r13.<init>(r14)     // Catch:{ all -> 0x01fe }
            throw r13     // Catch:{ all -> 0x01fe }
        L_0x00a4:
            boolean r14 = r13.mo15796a()     // Catch:{ all -> 0x01fe }
            if (r14 != 0) goto L_0x00bb
            java.lang.String r14 = com.bykv.p054vk.openvk.component.video.p055a.p066c.C2361a.m5445a((com.bykv.p054vk.openvk.component.video.p055a.p059b.p064e.C2327a) r3, (int) r2)     // Catch:{ all -> 0x01fe }
            r12.mo15686e()     // Catch:{ all -> 0x01fe }
            java.nio.charset.Charset r2 = com.bykv.p054vk.openvk.component.video.p055a.p066c.C2361a.f4784a     // Catch:{ all -> 0x01fe }
            byte[] r14 = r14.getBytes(r2)     // Catch:{ all -> 0x01fe }
            int r2 = r14.length     // Catch:{ all -> 0x01fe }
            r13.mo15795a(r14, r6, r2)     // Catch:{ all -> 0x01fe }
        L_0x00bb:
            r12.mo15686e()     // Catch:{ all -> 0x01fe }
            com.bykv.vk.openvk.component.video.a.b.a.a r14 = r12.f4584a     // Catch:{ all -> 0x01fe }
            java.lang.String r2 = r12.f4591h     // Catch:{ all -> 0x01fe }
            java.io.File r14 = r14.mo15693d(r2)     // Catch:{ all -> 0x01fe }
            boolean r2 = r12.f4743q     // Catch:{ all -> 0x01fe }
            java.lang.String r4 = ", from: "
            if (r2 == 0) goto L_0x0127
            if (r14 == 0) goto L_0x0127
            long r7 = r14.length()     // Catch:{ all -> 0x01fe }
            int r2 = r13.mo15797b()     // Catch:{ all -> 0x01fe }
            long r10 = (long) r2     // Catch:{ all -> 0x01fe }
            int r2 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r2 < 0) goto L_0x0127
            com.bykv.vk.openvk.component.video.a.b.b.c r2 = r12.f4585b     // Catch:{ all -> 0x01fe }
            java.lang.String r7 = r12.f4591h     // Catch:{ all -> 0x01fe }
            com.bykv.vk.openvk.component.video.a.b.i r8 = r12.f4592i     // Catch:{ all -> 0x01fe }
            com.bykv.vk.openvk.component.video.a.b.i$a r8 = r8.f4757c     // Catch:{ all -> 0x01fe }
            int r8 = r8.f4758a     // Catch:{ all -> 0x01fe }
            com.bykv.p054vk.openvk.component.video.p055a.p066c.C2361a.m5442a(r3, r2, r7, r8)     // Catch:{ all -> 0x01fe }
            com.bykv.vk.openvk.component.video.a.b.h r2 = new com.bykv.vk.openvk.component.video.a.b.h     // Catch:{ a -> 0x00fa }
            java.lang.String r7 = "rwd"
            r2.<init>(r14, r7)     // Catch:{ a -> 0x00fa }
            int r7 = r13.mo15797b()     // Catch:{ a -> 0x00f8 }
            long r7 = (long) r7     // Catch:{ a -> 0x00f8 }
            r2.mo15801a((long) r7)     // Catch:{ a -> 0x00f8 }
            goto L_0x0100
        L_0x00f8:
            r7 = move-exception
            goto L_0x00fc
        L_0x00fa:
            r7 = move-exception
            r2 = r5
        L_0x00fc:
            r7.printStackTrace()     // Catch:{ all -> 0x01d9 }
            r2 = r5
        L_0x0100:
            boolean r7 = com.bykv.p054vk.openvk.component.video.p055a.p059b.C2325e.f4685c     // Catch:{ all -> 0x01d9 }
            if (r7 == 0) goto L_0x014e
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x01d9 }
            r7.<init>()     // Catch:{ all -> 0x01d9 }
            java.lang.String r8 = "can write to cache file in network task, cache file size: "
            r7.append(r8)     // Catch:{ all -> 0x01d9 }
            long r10 = r14.length()     // Catch:{ all -> 0x01d9 }
            r7.append(r10)     // Catch:{ all -> 0x01d9 }
            r7.append(r4)     // Catch:{ all -> 0x01d9 }
            int r14 = r13.mo15797b()     // Catch:{ all -> 0x01d9 }
            r7.append(r14)     // Catch:{ all -> 0x01d9 }
            java.lang.String r14 = r7.toString()     // Catch:{ all -> 0x01d9 }
            android.util.Log.i(r9, r14)     // Catch:{ all -> 0x01d9 }
            goto L_0x014e
        L_0x0127:
            boolean r2 = com.bykv.p054vk.openvk.component.video.p055a.p059b.C2325e.f4685c     // Catch:{ all -> 0x01fe }
            if (r2 == 0) goto L_0x014d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fe }
            r2.<init>()     // Catch:{ all -> 0x01fe }
            java.lang.String r7 = "can't write to cache file in network task, cache file size: "
            r2.append(r7)     // Catch:{ all -> 0x01fe }
            long r7 = r14.length()     // Catch:{ all -> 0x01fe }
            r2.append(r7)     // Catch:{ all -> 0x01fe }
            r2.append(r4)     // Catch:{ all -> 0x01fe }
            int r14 = r13.mo15797b()     // Catch:{ all -> 0x01fe }
            r2.append(r14)     // Catch:{ all -> 0x01fe }
            java.lang.String r14 = r2.toString()     // Catch:{ all -> 0x01fe }
            android.util.Log.w(r9, r14)     // Catch:{ all -> 0x01fe }
        L_0x014d:
            r2 = r5
        L_0x014e:
            com.bykv.vk.openvk.component.video.a.b.b.c r14 = r12.f4585b     // Catch:{ all -> 0x01d9 }
            java.lang.String r4 = r12.f4591h     // Catch:{ all -> 0x01d9 }
            int r7 = r12.mo15687f()     // Catch:{ all -> 0x01d9 }
            com.bykv.vk.openvk.component.video.a.b.b.a r14 = r14.mo15728a((java.lang.String) r4, (int) r7)     // Catch:{ all -> 0x01d9 }
            if (r14 != 0) goto L_0x015e
            r14 = r6
            goto L_0x0160
        L_0x015e:
            int r14 = r14.f4639c     // Catch:{ all -> 0x01d9 }
        L_0x0160:
            r4 = 8192(0x2000, float:1.14794E-41)
            byte[] r4 = new byte[r4]     // Catch:{ all -> 0x01d9 }
            java.io.InputStream r7 = r3.mo15765d()     // Catch:{ all -> 0x01d9 }
            r8 = r6
        L_0x0169:
            int r10 = r7.read(r4)     // Catch:{ all -> 0x01d5 }
            if (r10 < 0) goto L_0x01ad
            r12.mo15686e()     // Catch:{ all -> 0x01d5 }
            if (r10 <= 0) goto L_0x01a9
            r13.mo15798b(r4, r6, r10)     // Catch:{ all -> 0x01d5 }
            int r8 = r8 + r10
            if (r2 == 0) goto L_0x01a2
            r2.mo15802a(r4, r6, r10)     // Catch:{ all -> 0x017e }
            goto L_0x01a2
        L_0x017e:
            r10 = move-exception
            r2.mo15800a()     // Catch:{ all -> 0x01d5 }
            boolean r2 = com.bykv.p054vk.openvk.component.video.p055a.p059b.C2325e.f4685c     // Catch:{ all -> 0x01a0 }
            if (r2 == 0) goto L_0x019e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a0 }
            r2.<init>()     // Catch:{ all -> 0x01a0 }
            java.lang.String r11 = "append to cache file error in network task!!! "
            r2.append(r11)     // Catch:{ all -> 0x01a0 }
            java.lang.String r10 = android.util.Log.getStackTraceString(r10)     // Catch:{ all -> 0x01a0 }
            r2.append(r10)     // Catch:{ all -> 0x01a0 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x01a0 }
            android.util.Log.e(r9, r2)     // Catch:{ all -> 0x01a0 }
        L_0x019e:
            r2 = r5
            goto L_0x01a2
        L_0x01a0:
            r13 = move-exception
            goto L_0x01d7
        L_0x01a2:
            int r10 = r13.mo15797b()     // Catch:{ all -> 0x01d5 }
            r12.mo15681a(r14, r10)     // Catch:{ all -> 0x01d5 }
        L_0x01a9:
            r12.mo15686e()     // Catch:{ all -> 0x01d5 }
            goto L_0x0169
        L_0x01ad:
            boolean r13 = com.bykv.p054vk.openvk.component.video.p055a.p059b.C2325e.f4685c     // Catch:{ all -> 0x01d5 }
            if (r13 == 0) goto L_0x01b6
            java.lang.String r13 = "read from net complete!"
            android.util.Log.i(r9, r13)     // Catch:{ all -> 0x01d5 }
        L_0x01b6:
            r12.mo15684c()     // Catch:{ all -> 0x01d5 }
            java.io.InputStream r13 = r3.mo15765d()
            com.bykv.p054vk.openvk.component.video.p055a.p066c.C2361a.m5451a((java.io.Closeable) r13)
            if (r2 == 0) goto L_0x01c5
            r2.mo15800a()
        L_0x01c5:
            java.util.concurrent.atomic.AtomicInteger r13 = r12.f4586c
            r13.addAndGet(r8)
            java.util.concurrent.atomic.AtomicLong r13 = r12.f4587d
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r2 = r2 - r0
            r13.addAndGet(r2)
            return
        L_0x01d5:
            r13 = move-exception
            r5 = r2
        L_0x01d7:
            r6 = r8
            goto L_0x01ff
        L_0x01d9:
            r13 = move-exception
            r5 = r2
            goto L_0x01ff
        L_0x01dc:
            com.bykv.vk.openvk.component.video.a.b.c.c r13 = new com.bykv.vk.openvk.component.video.a.b.c.c     // Catch:{ all -> 0x01fe }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x01fe }
            r2.<init>()     // Catch:{ all -> 0x01fe }
            r2.append(r4)     // Catch:{ all -> 0x01fe }
            r2.append(r7)     // Catch:{ all -> 0x01fe }
            java.lang.String r4 = r12.f4590g     // Catch:{ all -> 0x01fe }
            r2.append(r4)     // Catch:{ all -> 0x01fe }
            java.lang.String r4 = ", url: "
            r2.append(r4)     // Catch:{ all -> 0x01fe }
            r2.append(r14)     // Catch:{ all -> 0x01fe }
            java.lang.String r14 = r2.toString()     // Catch:{ all -> 0x01fe }
            r13.<init>(r14)     // Catch:{ all -> 0x01fe }
            throw r13     // Catch:{ all -> 0x01fe }
        L_0x01fe:
            r13 = move-exception
        L_0x01ff:
            java.io.InputStream r14 = r3.mo15765d()
            com.bykv.p054vk.openvk.component.video.p055a.p066c.C2361a.m5451a((java.io.Closeable) r14)
            if (r5 == 0) goto L_0x020b
            r5.mo15800a()
        L_0x020b:
            java.util.concurrent.atomic.AtomicInteger r14 = r12.f4586c
            r14.addAndGet(r6)
            java.util.concurrent.atomic.AtomicLong r14 = r12.f4587d
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r2 = r2 - r0
            r14.addAndGet(r2)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.p054vk.openvk.component.video.p055a.p059b.C2344g.m5407d(com.bykv.vk.openvk.component.video.a.b.g$b, com.bykv.vk.openvk.component.video.a.b.l$a):void");
    }

    /* renamed from: a */
    public void mo15680a() {
        super.mo15680a();
        m5409i();
    }

    /* renamed from: i */
    private void m5409i() {
        C2301b bVar = this.f4742p;
        this.f4742p = null;
        if (bVar != null) {
            bVar.mo15680a();
        }
    }

    /* renamed from: com.bykv.vk.openvk.component.video.a.b.g$b */
    /* compiled from: ProxyTask */
    private static class C2348b {

        /* renamed from: a */
        private final OutputStream f4751a;

        /* renamed from: b */
        private int f4752b;

        /* renamed from: c */
        private boolean f4753c;

        C2348b(OutputStream outputStream, int i) {
            this.f4751a = outputStream;
            this.f4752b = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo15796a() {
            return this.f4753c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo15795a(byte[] bArr, int i, int i2) throws C2314d {
            if (!this.f4753c) {
                try {
                    this.f4751a.write(bArr, i, i2);
                    this.f4753c = true;
                } catch (IOException e) {
                    throw new C2314d(e);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo15798b(byte[] bArr, int i, int i2) throws C2314d {
            try {
                this.f4751a.write(bArr, i, i2);
                this.f4752b += i2;
            } catch (IOException e) {
                throw new C2314d(e);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo15797b() {
            return this.f4752b;
        }
    }

    /* renamed from: com.bykv.vk.openvk.component.video.a.b.g$a */
    /* compiled from: ProxyTask */
    static final class C2347a {

        /* renamed from: a */
        C2289a f4747a;

        /* renamed from: b */
        C2306c f4748b;

        /* renamed from: c */
        Socket f4749c;

        /* renamed from: d */
        C2349c f4750d;

        C2347a() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2347a mo15791a(C2306c cVar) {
            if (cVar != null) {
                this.f4748b = cVar;
                return this;
            }
            throw new IllegalArgumentException("db == null");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2347a mo15793a(Socket socket) {
            if (socket != null) {
                this.f4749c = socket;
                return this;
            }
            throw new IllegalArgumentException("socket == null");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2347a mo15792a(C2349c cVar) {
            this.f4750d = cVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C2344g mo15794a() {
            if (this.f4748b != null && this.f4749c != null) {
                return new C2344g(this);
            }
            throw new IllegalArgumentException();
        }
    }
}
