package com.unity3d.services.core.device.reader.pii;

import com.unity3d.services.core.misc.C12073c;

/* renamed from: com.unity3d.services.core.device.reader.pii.f */
/* compiled from: PiiTrackingStatusReader */
public class C12057f {

    /* renamed from: a */
    private final C12073c f29423a;

    public C12057f(C12073c cVar) {
        this.f29423a = cVar;
    }

    /* renamed from: b */
    private C12056e m32823b() {
        return m32822a("privacy.spm.value");
    }

    /* renamed from: d */
    private C12056e m32824d() {
        return m32822a("privacy.mode.value");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
        r0 = m32824d();
        r1 = com.unity3d.services.core.device.reader.pii.C12056e.f29418b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001e, code lost:
        r0 = m32824d();
        r1 = com.unity3d.services.core.device.reader.pii.C12056e.f29419c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.unity3d.services.core.device.reader.pii.C12056e mo71186a() {
        /*
            r2 = this;
            com.unity3d.services.core.device.reader.pii.e r0 = r2.m32824d()
            com.unity3d.services.core.device.reader.pii.e r1 = com.unity3d.services.core.device.reader.pii.C12056e.NULL
            if (r0 != r1) goto L_0x000f
            com.unity3d.services.core.device.reader.pii.e r0 = r2.m32823b()
            if (r0 != r1) goto L_0x000f
            return r1
        L_0x000f:
            com.unity3d.services.core.device.reader.pii.e r0 = r2.m32824d()
            com.unity3d.services.core.device.reader.pii.e r1 = com.unity3d.services.core.device.reader.pii.C12056e.APP
            if (r0 == r1) goto L_0x003f
            com.unity3d.services.core.device.reader.pii.e r0 = r2.m32823b()
            if (r0 != r1) goto L_0x001e
            goto L_0x003f
        L_0x001e:
            com.unity3d.services.core.device.reader.pii.e r0 = r2.m32824d()
            com.unity3d.services.core.device.reader.pii.e r1 = com.unity3d.services.core.device.reader.pii.C12056e.MIXED
            if (r0 == r1) goto L_0x003f
            com.unity3d.services.core.device.reader.pii.e r0 = r2.m32823b()
            if (r0 != r1) goto L_0x002d
            goto L_0x003f
        L_0x002d:
            com.unity3d.services.core.device.reader.pii.e r0 = r2.m32824d()
            com.unity3d.services.core.device.reader.pii.e r1 = com.unity3d.services.core.device.reader.pii.C12056e.NONE
            if (r0 == r1) goto L_0x003f
            com.unity3d.services.core.device.reader.pii.e r0 = r2.m32823b()
            if (r0 != r1) goto L_0x003c
            goto L_0x003f
        L_0x003c:
            com.unity3d.services.core.device.reader.pii.e r0 = com.unity3d.services.core.device.reader.pii.C12056e.UNDEFINED
            return r0
        L_0x003f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.device.reader.pii.C12057f.mo71186a():com.unity3d.services.core.device.reader.pii.e");
    }

    /* renamed from: c */
    public boolean mo71187c() {
        C12073c cVar = this.f29423a;
        if (cVar != null) {
            Object obj = cVar.get("user.nonbehavioral.value");
            if (obj == null) {
                obj = this.f29423a.get("user.nonBehavioral.value");
            }
            if (obj instanceof String) {
                return Boolean.parseBoolean((String) obj);
            }
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
        }
        return false;
    }

    /* renamed from: a */
    private C12056e m32822a(String str) {
        String str2;
        C12073c cVar = this.f29423a;
        if (cVar != null) {
            Object obj = cVar.get(str);
            if (obj instanceof String) {
                str2 = (String) obj;
                return C12056e.m32821a(str2);
            }
        }
        str2 = null;
        return C12056e.m32821a(str2);
    }
}
