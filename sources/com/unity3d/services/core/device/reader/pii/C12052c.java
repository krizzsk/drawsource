package com.unity3d.services.core.device.reader.pii;

import com.unity3d.services.core.configuration.Experiments;
import com.unity3d.services.core.misc.C12073c;
import com.unity3d.services.core.misc.C12080j;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.unity3d.services.core.device.reader.pii.c */
/* compiled from: PiiDataSelector */
public class C12052c {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C12057f f29410a;

    /* renamed from: b */
    private final C12073c f29411b;

    /* renamed from: c */
    private final Experiments f29412c;

    /* renamed from: com.unity3d.services.core.device.reader.pii.c$a */
    /* compiled from: PiiDataSelector */
    class C12053a extends HashMap<String, Object> {
        C12053a() {
            put("user.nonBehavioral", Boolean.valueOf(C12052c.this.f29410a.mo71187c()));
        }
    }

    /* renamed from: com.unity3d.services.core.device.reader.pii.c$b */
    /* compiled from: PiiDataSelector */
    static /* synthetic */ class C12054b {

        /* renamed from: a */
        static final /* synthetic */ int[] f29414a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.unity3d.services.core.device.reader.pii.e[] r0 = com.unity3d.services.core.device.reader.pii.C12056e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f29414a = r0
                com.unity3d.services.core.device.reader.pii.e r1 = com.unity3d.services.core.device.reader.pii.C12056e.NONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f29414a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.unity3d.services.core.device.reader.pii.e r1 = com.unity3d.services.core.device.reader.pii.C12056e.NULL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f29414a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.unity3d.services.core.device.reader.pii.e r1 = com.unity3d.services.core.device.reader.pii.C12056e.MIXED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.device.reader.pii.C12052c.C12054b.<clinit>():void");
        }
    }

    public C12052c(C12057f fVar, C12073c cVar, Experiments experiments) {
        this.f29410a = fVar;
        this.f29411b = cVar;
        this.f29412c = experiments;
    }

    /* renamed from: b */
    private Map<String, Object> m32812b() {
        HashMap hashMap = new HashMap();
        C12073c cVar = this.f29411b;
        if (cVar == null) {
            return hashMap;
        }
        Object obj = cVar.get("unifiedconfig.pii");
        return obj instanceof JSONObject ? C12080j.m32877a(hashMap, (JSONObject) obj, "unifiedconfig.pii.") : hashMap;
    }

    /* renamed from: c */
    private HashMap<String, Object> m32813c() {
        return new C12053a();
    }

    /* renamed from: d */
    private C12055d m32814d() {
        if (this.f29410a.mo71187c()) {
            return new C12055d(C12050a.INCLUDE, m32813c());
        }
        C12055d a = m32810a();
        a.mo71183a(m32813c());
        return a;
    }

    /* renamed from: e */
    private C12055d m32815e() {
        return new C12055d(C12050a.EXCLUDE);
    }

    /* renamed from: f */
    public C12055d mo71181f() {
        int i = C12054b.f29414a[this.f29410a.mo71186a().ordinal()];
        if (i == 1 || i == 2) {
            return m32810a();
        }
        if (i != 3) {
            return m32815e();
        }
        return m32814d();
    }

    /* renamed from: a */
    private C12055d m32810a() {
        return new C12055d(this.f29412c.isUpdatePiiFields() ? C12050a.UPDATE : C12050a.INCLUDE, m32812b());
    }
}
