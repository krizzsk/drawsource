package com.bytedance.sdk.openadsdk.p128b.p130b.p132b;

import com.bykv.p054vk.openvk.component.video.api.p071c.C2401c;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;

/* renamed from: com.bytedance.sdk.openadsdk.b.b.b.o */
/* compiled from: VideoLogHelperModel */
public class C3084o {

    /* renamed from: a */
    private long f7220a;

    /* renamed from: b */
    private String f7221b;

    /* renamed from: c */
    private int f7222c;

    /* renamed from: d */
    private C2401c f7223d;

    /* renamed from: e */
    private C3431n f7224e;

    public C3084o(long j, String str, int i, C2401c cVar, C3431n nVar) {
        this.f7220a = j;
        this.f7221b = str;
        this.f7222c = i;
        this.f7223d = cVar;
        this.f7224e = nVar;
    }

    /* renamed from: a */
    public long mo18625a() {
        return this.f7220a;
    }

    /* renamed from: b */
    public String mo18626b() {
        return this.f7221b;
    }

    /* renamed from: c */
    public int mo18627c() {
        return this.f7222c;
    }

    /* renamed from: d */
    public C2401c mo18628d() {
        return this.f7223d;
    }

    /* renamed from: e */
    public C3431n mo18629e() {
        return this.f7224e;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.b.b.b.o$a */
    /* compiled from: VideoLogHelperModel */
    public static class C3085a {

        /* renamed from: a */
        private long f7225a = 0;

        /* renamed from: b */
        private long f7226b = 0;

        /* renamed from: c */
        private long f7227c = 0;

        /* renamed from: d */
        private boolean f7228d = false;

        /* renamed from: e */
        private int f7229e = 0;

        /* renamed from: f */
        private int f7230f = 0;

        /* renamed from: g */
        private int f7231g;

        /* renamed from: h */
        private int f7232h;

        /* renamed from: i */
        private int f7233i;

        /* renamed from: j */
        private int f7234j;

        /* renamed from: k */
        private int f7235k;

        /* renamed from: l */
        private boolean f7236l = false;

        /* renamed from: a */
        public long mo18630a() {
            return this.f7225a;
        }

        /* renamed from: a */
        public void mo18632a(long j) {
            this.f7225a = j;
        }

        /* renamed from: b */
        public long mo18634b() {
            return this.f7226b;
        }

        /* renamed from: b */
        public void mo18636b(long j) {
            this.f7226b = j;
        }

        /* renamed from: c */
        public long mo18637c() {
            return this.f7227c;
        }

        /* renamed from: c */
        public void mo18639c(long j) {
            this.f7227c = j;
        }

        /* renamed from: d */
        public int mo18640d() {
            return this.f7229e;
        }

        /* renamed from: a */
        public void mo18631a(int i) {
            this.f7229e = i;
        }

        /* renamed from: e */
        public int mo18642e() {
            return this.f7230f;
        }

        /* renamed from: b */
        public void mo18635b(int i) {
            this.f7230f = i;
        }

        /* renamed from: f */
        public int mo18644f() {
            return this.f7231g;
        }

        /* renamed from: c */
        public void mo18638c(int i) {
            this.f7231g = i;
        }

        /* renamed from: g */
        public int mo18646g() {
            return this.f7232h;
        }

        /* renamed from: d */
        public void mo18641d(int i) {
            this.f7232h = i;
        }

        /* renamed from: h */
        public int mo18647h() {
            long j = this.f7227c;
            if (j <= 0) {
                return 0;
            }
            return Math.min((int) ((this.f7225a * 100) / j), 100);
        }

        /* renamed from: i */
        public int mo18648i() {
            return this.f7233i;
        }

        /* renamed from: e */
        public void mo18643e(int i) {
            this.f7233i = i;
        }

        /* renamed from: j */
        public int mo18649j() {
            return this.f7234j;
        }

        /* renamed from: k */
        public int mo18650k() {
            return this.f7235k;
        }

        /* renamed from: f */
        public void mo18645f(int i) {
            this.f7235k = i;
        }

        /* renamed from: l */
        public boolean mo18651l() {
            return this.f7236l;
        }

        /* renamed from: m */
        public boolean mo18652m() {
            return this.f7228d;
        }

        /* renamed from: a */
        public void mo18633a(boolean z) {
            this.f7228d = z;
        }
    }
}
