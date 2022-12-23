package com.bytedance.mobsec.metasec.p087ov;

import java.util.Map;
import p405ms.p406bd.p407o.Pgl.C12619l0;

/* renamed from: com.bytedance.mobsec.metasec.ov.PglMSManager */
public final class PglMSManager implements C12619l0.pgla {

    /* renamed from: a */
    private final C12619l0.pgla f5222a;

    PglMSManager(C12619l0.pgla pgla) {
        this.f5222a = pgla;
    }

    public Map<String, String> frameSign(String str, int i) {
        return this.f5222a.frameSign(str, i);
    }

    public Map<String, String> getFeatureHash(String str, byte[] bArr) {
        return this.f5222a.getFeatureHash(str, bArr);
    }

    public Map<String, String> getReportRaw(String str, int i, Map<String, String> map) {
        return this.f5222a.getReportRaw(str, i, map);
    }

    public String getToken() {
        return this.f5222a.getToken();
    }

    public void report(String str) {
        this.f5222a.report(str);
    }

    public void setBDDeviceID(String str) {
        this.f5222a.setBDDeviceID(str);
    }

    public void setCollectMode(int i) {
        this.f5222a.setCollectMode(i);
    }

    public void setDeviceID(String str) {
        this.f5222a.setDeviceID(str);
    }

    public void setInstallID(String str) {
        this.f5222a.setInstallID(str);
    }

    public void setSessionID(String str) {
        this.f5222a.setSessionID(str);
    }
}
