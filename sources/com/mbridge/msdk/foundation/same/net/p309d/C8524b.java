package com.mbridge.msdk.foundation.same.net.p309d;

import com.mbridge.msdk.foundation.same.net.C8532e;
import com.mbridge.msdk.foundation.same.net.C8536f;
import com.mbridge.msdk.foundation.same.net.C8554i;
import com.mbridge.msdk.foundation.same.net.C8555j;
import com.mbridge.msdk.foundation.same.net.C8557k;
import com.mbridge.msdk.foundation.same.net.p306a.C8508a;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.mbridge.msdk.foundation.same.net.d.b */
/* compiled from: FileDownloader */
public final class C8524b {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C8555j f20889a;

    /* renamed from: b */
    private int f20890b;

    /* renamed from: c */
    private LinkedList<C8526a> f20891c = new LinkedList<>();

    public C8524b(C8555j jVar, int i) {
        this.f20889a = jVar;
        this.f20890b = i;
    }

    /* renamed from: a */
    public final C8526a mo57949a(File file, String str, C8532e<Void> eVar) {
        C8526a aVar = new C8526a(file, str, eVar);
        synchronized (this) {
            this.f20891c.add(aVar);
        }
        m24408a();
        return aVar;
    }

    /* renamed from: a */
    private void m24408a() {
        synchronized (this) {
            int i = 0;
            Iterator it = this.f20891c.iterator();
            while (it.hasNext()) {
                if (((C8526a) it.next()).mo57950a()) {
                    i++;
                }
            }
            if (i < this.f20890b) {
                Iterator it2 = this.f20891c.iterator();
                while (it2.hasNext()) {
                    if (C8526a.m24412a((C8526a) it2.next()) && (i = i + 1) == this.f20890b) {
                        return;
                    }
                }
            }
        }
    }

    /* renamed from: com.mbridge.msdk.foundation.same.net.d.b$a */
    /* compiled from: FileDownloader */
    public class C8526a {

        /* renamed from: b */
        private String f20893b;

        /* renamed from: c */
        private File f20894c;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public C8532e<Void> f20895d;

        /* renamed from: e */
        private C8523a f20896e;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public int f20897f;

        private C8526a(File file, String str, C8532e<Void> eVar) {
            this.f20894c = file;
            this.f20895d = eVar;
            this.f20893b = str;
        }

        /* renamed from: a */
        public final boolean mo57950a() {
            return this.f20897f == 1;
        }

        /* renamed from: a */
        static /* synthetic */ boolean m24412a(C8526a aVar) {
            if (aVar.f20897f != 0) {
                return false;
            }
            C8524b bVar = C8524b.this;
            C8523a aVar2 = new C8523a(aVar.f20894c, aVar.f20893b);
            aVar.f20896e = aVar2;
            aVar2.mo57991a(new C8536f<Void>() {

                /* renamed from: a */
                boolean f20898a;

                /* renamed from: a */
                public final void mo57951a() {
                    C8526a.this.f20895d.mo57951a();
                }

                /* renamed from: b */
                public final void mo57896b() {
                    if (!this.f20898a) {
                        int unused = C8526a.this.f20897f = 3;
                        C8526a.this.f20895d.mo57896b();
                        C8524b.m24409a(C8524b.this, C8526a.this);
                    }
                }

                /* renamed from: a */
                public final void mo57895a(C8557k kVar) {
                    if (!this.f20898a) {
                        C8526a.this.f20895d.mo57895a(kVar);
                    }
                }

                /* renamed from: a */
                public final void mo57894a(C8508a aVar) {
                    if (!this.f20898a) {
                        C8526a.this.f20895d.mo57894a(aVar);
                    }
                }

                /* renamed from: c */
                public final void mo57952c() {
                    C8526a.this.f20895d.mo57952c();
                    this.f20898a = true;
                }

                /* renamed from: a */
                public final void mo57893a(long j, long j2) {
                    C8526a.this.f20895d.mo57893a(j, j2);
                }
            });
            aVar.f20897f = 1;
            C8524b.this.f20889a.mo58013a((C8554i) aVar.f20896e);
            return true;
        }
    }

    /* renamed from: a */
    static /* synthetic */ void m24409a(C8524b bVar, C8526a aVar) {
        synchronized (bVar) {
            bVar.f20891c.remove(aVar);
        }
        bVar.m24408a();
    }
}
