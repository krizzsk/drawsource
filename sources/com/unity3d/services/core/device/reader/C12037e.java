package com.unity3d.services.core.device.reader;

import com.unity3d.services.core.misc.C12073c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.unity3d.services.core.device.reader.e */
/* compiled from: DeviceInfoReaderFilterProvider */
public class C12037e {

    /* renamed from: a */
    private C12073c f29387a;

    public C12037e(C12073c cVar) {
        this.f29387a = cVar;
    }

    /* renamed from: a */
    public List<String> mo71179a() {
        Object opt;
        ArrayList arrayList = new ArrayList();
        C12073c cVar = this.f29387a;
        if (cVar == null || cVar.getData() == null || (opt = this.f29387a.getData().opt("unifiedconfig")) == null || !(opt instanceof JSONObject)) {
            return arrayList;
        }
        Object opt2 = ((JSONObject) opt).opt("exclude");
        return opt2 instanceof String ? m32791a(Arrays.asList(((String) opt2).split(","))) : arrayList;
    }

    /* renamed from: a */
    private List<String> m32791a(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (String trim : list) {
            arrayList.add(trim.trim());
        }
        return arrayList;
    }
}
