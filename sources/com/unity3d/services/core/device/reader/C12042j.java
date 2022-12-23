package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.device.reader.pii.C12051b;
import com.unity3d.services.core.device.reader.pii.C12052c;
import com.unity3d.services.core.device.reader.pii.C12055d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.unity3d.services.core.device.reader.j */
/* compiled from: DeviceInfoReaderWithPII */
public class C12042j implements C12049p {

    /* renamed from: a */
    private C12049p f29393a;

    /* renamed from: b */
    private C12051b f29394b;

    /* renamed from: c */
    private C12052c f29395c;

    /* renamed from: com.unity3d.services.core.device.reader.j$a */
    /* compiled from: DeviceInfoReaderWithPII */
    static /* synthetic */ class C12043a {

        /* renamed from: a */
        static final /* synthetic */ int[] f29396a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.unity3d.services.core.device.reader.pii.a[] r0 = com.unity3d.services.core.device.reader.pii.C12050a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f29396a = r0
                com.unity3d.services.core.device.reader.pii.a r1 = com.unity3d.services.core.device.reader.pii.C12050a.INCLUDE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f29396a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.unity3d.services.core.device.reader.pii.a r1 = com.unity3d.services.core.device.reader.pii.C12050a.UPDATE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f29396a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.unity3d.services.core.device.reader.pii.a r1 = com.unity3d.services.core.device.reader.pii.C12050a.EXCLUDE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.device.reader.C12042j.C12043a.<clinit>():void");
        }
    }

    public C12042j(C12049p pVar, C12052c cVar, C12051b bVar) {
        this.f29393a = pVar;
        this.f29395c = cVar;
        this.f29394b = bVar;
    }

    /* renamed from: b */
    private Map<String, Object> m32800b(C12055d dVar) {
        return dVar.mo71182a();
    }

    /* renamed from: a */
    public Map<String, Object> mo71178a() {
        Map<String, Object> a = this.f29393a.mo71178a();
        C12055d f = this.f29395c.mo71181f();
        int i = C12043a.f29396a[f.mo71184b().ordinal()];
        if (i == 1) {
            a.putAll(m32800b(f));
        } else if (i == 2) {
            a.putAll(m32799a(f));
        }
        return a;
    }

    /* renamed from: a */
    private Map<String, Object> m32799a(C12055d dVar) {
        HashMap hashMap = new HashMap();
        String a = this.f29394b.mo71180a();
        if (a != null) {
            hashMap.put("unifiedconfig.pii.advertisingTrackingId", a);
        }
        if (dVar.mo71185c() != null) {
            hashMap.put("user.nonBehavioral", dVar.mo71185c());
        }
        return hashMap;
    }
}
