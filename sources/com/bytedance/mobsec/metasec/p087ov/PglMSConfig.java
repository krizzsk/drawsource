package com.bytedance.mobsec.metasec.p087ov;

import java.util.Map;
import p405ms.p406bd.p407o.Pgl.C12600c;

/* renamed from: com.bytedance.mobsec.metasec.ov.PglMSConfig */
public final class PglMSConfig extends C12600c {

    /* renamed from: o */
    private final C12600c f5221o;

    /* renamed from: com.bytedance.mobsec.metasec.ov.PglMSConfig$Builder */
    public static class Builder extends C12600c.pgla<Builder> {
        public Builder(String str, String str2) {
            super(str, str2);
        }

        public Builder(String str, String str2, int i) {
            super(str, str2, i);
        }

        public Builder(String str, String str2, String str3) {
            super(str, str2, str3);
        }

        public Builder(String str, String str2, String str3, int i) {
            super(str, str2, str3, i);
        }

        public Builder addAdvanceInfo(String str, String str2) {
            addAdvanceInfo0(str, str2);
            return this;
        }

        public PglMSConfig build() {
            if (this.f29861k != -1 && this.f29862l != 99999) {
                return new PglMSConfig(mo74877a());
            }
            throw new IllegalArgumentException("MSConfig init error!");
        }

        public Builder setBDDeviceID(String str) {
            setBDDeviceID0(str);
            return this;
        }

        public Builder setChannel(String str) {
            setChannel0(str);
            return this;
        }

        public Builder setClientType(int i) {
            setClientType0(i);
            return this;
        }

        public Builder setCustomInfo(Map<String, String> map) {
            setCustomInfo0(map);
            return this;
        }

        public Builder setDeviceID(String str) {
            setDeviceID0(str);
            return this;
        }

        public Builder setInstallID(String str) {
            setInstallID0(str);
            return this;
        }

        public Builder setOVRegionType(int i) {
            setOVRegionType0(i);
            return this;
        }

        public Builder setSecssionID(String str) {
            setSecssionID0(str);
            return this;
        }
    }

    private PglMSConfig(C12600c cVar) {
        this.f5221o = cVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C12600c mo16431a() {
        return this.f5221o;
    }
}
