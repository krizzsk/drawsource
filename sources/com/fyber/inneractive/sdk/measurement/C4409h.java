package com.fyber.inneractive.sdk.measurement;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.model.vast.C4435q;
import com.fyber.inneractive.sdk.response.C5237i;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.measurement.h */
public class C4409h implements C5237i {

    /* renamed from: a */
    public final /* synthetic */ List f10818a;

    /* renamed from: b */
    public final /* synthetic */ C4411j f10819b;

    public C4409h(C4410i iVar, List list, C4411j jVar) {
        this.f10818a = list;
        this.f10819b = jVar;
    }

    /* renamed from: a */
    public List<String> mo24589a(C4435q qVar) {
        if (this.f10818a == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : this.f10818a) {
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str.replace("[REASON]", String.valueOf(this.f10819b.f10830a)));
            }
        }
        return arrayList;
    }
}
