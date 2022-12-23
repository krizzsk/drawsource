package com.bykv.p054vk.openvk.component.video.p055a.p056a;

import android.content.Context;
import android.media.MediaDataSource;
import android.text.TextUtils;
import com.bykv.p054vk.openvk.component.video.api.p071c.C2401c;
import com.bykv.p054vk.openvk.component.video.api.p074f.C2415c;
import com.bykv.p054vk.openvk.component.video.p055a.p056a.p057a.C2280b;
import com.bykv.p054vk.openvk.component.video.p055a.p056a.p057a.C2281c;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.bykv.vk.openvk.component.video.a.a.a */
/* compiled from: SdkMediaDataSource */
public class C2277a extends MediaDataSource {

    /* renamed from: a */
    public static final ConcurrentHashMap<String, C2277a> f4546a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private C2280b f4547b = null;

    /* renamed from: c */
    private long f4548c = -2147483648L;

    /* renamed from: d */
    private Context f4549d;

    /* renamed from: e */
    private final C2401c f4550e;

    public C2277a(Context context, C2401c cVar) {
        this.f4549d = context;
        this.f4550e = cVar;
    }

    public int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
        m5181b();
        int a = this.f4547b.mo15669a(j, bArr, i, i2);
        C2415c.m5831b("SdkMediaDataSource", "readAt: position = " + j + "  buffer.length =" + bArr.length + "  offset = " + i + " size =" + a + "  current = " + Thread.currentThread());
        return a;
    }

    /* renamed from: b */
    private void m5181b() {
        if (this.f4547b == null) {
            this.f4547b = new C2281c(this.f4549d, this.f4550e);
        }
    }

    public long getSize() throws IOException {
        m5181b();
        if (this.f4548c == -2147483648L) {
            if (this.f4549d == null || TextUtils.isEmpty(this.f4550e.mo15991j())) {
                return -1;
            }
            this.f4548c = this.f4547b.mo15671b();
            C2415c.m5831b("SdkMediaDataSource", "getSize: " + this.f4548c);
        }
        return this.f4548c;
    }

    public void close() throws IOException {
        C2415c.m5833b("SdkMediaDataSource", "close: ", this.f4550e.mo15991j());
        C2280b bVar = this.f4547b;
        if (bVar != null) {
            bVar.mo15670a();
        }
        f4546a.remove(this.f4550e.mo15992k());
    }

    /* renamed from: a */
    public C2401c mo15657a() {
        return this.f4550e;
    }

    /* renamed from: a */
    public static C2277a m5180a(Context context, C2401c cVar) {
        C2277a aVar = new C2277a(context, cVar);
        f4546a.put(cVar.mo15992k(), aVar);
        return aVar;
    }
}
