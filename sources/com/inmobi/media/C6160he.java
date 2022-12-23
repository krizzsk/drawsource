package com.inmobi.media;

import java.io.IOException;
import java.net.SocketTimeoutException;
import p405ms.p406bd.p407o.Pgl.C12600c;

/* renamed from: com.inmobi.media.he */
/* compiled from: VastBitRateNetworkConnection */
public final class C6160he extends C6153gy {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C6157hb mo35336a() {
        return super.mo35336a();
    }

    public C6160he(C6156ha haVar) {
        super(haVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C6157hb mo35337b() {
        C6157hb hbVar = new C6157hb();
        try {
            this.f15516c.getResponseCode();
            hbVar.f15542b = this.f15516c.getContentLength();
            this.f15516c.disconnect();
        } catch (SocketTimeoutException unused) {
            hbVar.f15541a = new C6154gz(C12600c.COLLECT_MODE_TIKTOK_GUEST, "HTTP_GATEWAY_TIMEOUT");
        } catch (IOException unused2) {
            hbVar.f15541a = new C6154gz(-2, "NETWORK_IO_ERROR");
        } catch (OutOfMemoryError unused3) {
            hbVar.f15541a = new C6154gz(-3, "OUT_OF_MEMORY_ERROR");
        } catch (Exception unused4) {
            hbVar.f15541a = new C6154gz(-1, "UNKNOWN_ERROR");
        } catch (Throwable th) {
            this.f15516c.disconnect();
            throw th;
        }
        return hbVar;
    }
}
