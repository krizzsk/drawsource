package com.mbridge.msdk.video.signal.factory;

import com.mbridge.msdk.video.signal.C9502a;
import com.mbridge.msdk.video.signal.C9520b;
import com.mbridge.msdk.video.signal.C9521c;
import com.mbridge.msdk.video.signal.C9615e;
import com.mbridge.msdk.video.signal.C9616f;
import com.mbridge.msdk.video.signal.C9620h;
import com.mbridge.msdk.video.signal.C9621i;
import com.mbridge.msdk.video.signal.p371a.C9503a;
import com.mbridge.msdk.video.signal.p371a.C9504b;
import com.mbridge.msdk.video.signal.p371a.C9505c;
import com.mbridge.msdk.video.signal.p371a.C9508d;
import com.mbridge.msdk.video.signal.p371a.C9509e;
import com.mbridge.msdk.video.signal.p371a.C9510f;
import com.mbridge.msdk.video.signal.p371a.C9511g;

/* renamed from: com.mbridge.msdk.video.signal.factory.a */
/* compiled from: DefaultJSFactory */
public class C9617a implements IJSFactory {

    /* renamed from: a */
    protected C9502a f23879a;

    /* renamed from: b */
    protected C9521c f23880b;

    /* renamed from: c */
    protected C9621i f23881c;

    /* renamed from: d */
    protected C9616f f23882d;

    /* renamed from: e */
    protected C9615e f23883e;

    /* renamed from: f */
    protected C9620h f23884f;

    /* renamed from: g */
    protected C9520b f23885g;

    public C9502a getActivityProxy() {
        if (this.f23879a == null) {
            this.f23879a = new C9503a();
        }
        return this.f23879a;
    }

    public C9521c getJSCommon() {
        if (this.f23880b == null) {
            this.f23880b = new C9505c();
        }
        return this.f23880b;
    }

    public C9621i getJSVideoModule() {
        if (this.f23881c == null) {
            this.f23881c = new C9511g();
        }
        return this.f23881c;
    }

    public C9616f getJSNotifyProxy() {
        if (this.f23882d == null) {
            this.f23882d = new C9509e();
        }
        return this.f23882d;
    }

    public C9615e getJSContainerModule() {
        if (this.f23883e == null) {
            this.f23883e = new C9508d();
        }
        return this.f23883e;
    }

    public C9620h getIJSRewardVideoV1() {
        if (this.f23884f == null) {
            this.f23884f = new C9510f();
        }
        return this.f23884f;
    }

    public C9520b getJSBTModule() {
        if (this.f23885g == null) {
            this.f23885g = new C9504b();
        }
        return this.f23885g;
    }
}
