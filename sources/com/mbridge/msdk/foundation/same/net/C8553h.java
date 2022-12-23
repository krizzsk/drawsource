package com.mbridge.msdk.foundation.same.net;

import android.content.Context;
import android.os.Process;
import com.mbridge.msdk.foundation.same.net.p306a.C8508a;
import com.mbridge.msdk.foundation.same.net.p310e.C8533a;
import com.mbridge.msdk.foundation.same.net.p310e.C8535c;
import com.mbridge.msdk.foundation.same.net.stack.C8564a;
import com.mbridge.msdk.foundation.same.net.stack.OkHttpStack;
import com.mbridge.msdk.foundation.tools.C8672v;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.mbridge.msdk.foundation.same.net.h */
/* compiled from: NetworkDispatcher */
public class C8553h {

    /* renamed from: a */
    private static final String f20993a = C8553h.class.getSimpleName();

    /* renamed from: b */
    private C8564a f20994b = new OkHttpStack();

    /* renamed from: c */
    private C8546g f20995c;

    /* renamed from: d */
    private C8511c f20996d;

    public C8553h(Context context, SSLSocketFactory sSLSocketFactory, C8511c cVar) {
        this.f20995c = new C8533a(this.f20994b, cVar);
        this.f20996d = cVar;
    }

    /* renamed from: a */
    public final void mo57984a(C8554i iVar) {
        Process.setThreadPriority(10);
        try {
            this.f20996d.mo57929c(iVar);
            if (iVar.mo57997c()) {
                iVar.mo57993a("network-discard-cancelled");
                this.f20996d.mo57928b(iVar);
                this.f20996d.mo57924a(iVar);
                return;
            }
            this.f20996d.mo57930d(iVar);
            this.f20996d.mo57927a((C8554i<?>) iVar, (C8557k<?>) iVar.mo57946a(this.f20995c.mo57956a(iVar)));
        } catch (C8508a e) {
            this.f20996d.mo57926a((C8554i<?>) iVar, e);
        } catch (Exception e2) {
            String str = f20993a;
            C8672v.m24878d(str, "Unhandled exception " + e2.getMessage());
            this.f20996d.mo57926a((C8554i<?>) iVar, new C8508a(4, (C8535c) null));
        }
    }
}
