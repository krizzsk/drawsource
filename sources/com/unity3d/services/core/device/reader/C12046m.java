package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.misc.C12073c;
import com.unity3d.services.core.misc.C12075e;
import com.unity3d.services.core.misc.C12076f;
import com.unity3d.services.core.misc.C12078h;
import com.unity3d.services.core.misc.C12080j;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* renamed from: com.unity3d.services.core.device.reader.m */
/* compiled from: DeviceInfoReaderWithStorageInfo */
public class C12046m implements C12049p {

    /* renamed from: a */
    private final C12049p f29403a;

    /* renamed from: b */
    private final List<C12073c> f29404b;

    /* renamed from: c */
    private final C12076f f29405c;

    public C12046m(C12049p pVar, C12076f fVar, C12073c... cVarArr) {
        this.f29403a = pVar;
        this.f29405c = fVar;
        this.f29404b = Arrays.asList(cVarArr);
    }

    /* renamed from: a */
    public Map<String, Object> mo71178a() {
        Map<String, Object> a = this.f29403a.mo71178a();
        return a != null ? C12080j.m32876a(a, new C12075e(new C12078h(this.f29404b).getData()).mo71218a(".", this.f29405c)) : a;
    }
}
