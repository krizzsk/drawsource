package com.mbridge.msdk.foundation.same.p301b;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.mbridge.msdk.foundation.same.b.d */
/* compiled from: MBridgeDirContext */
public final class C8477d extends C8475b {
    public C8477d(String str) {
        super(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final List<C8474a> mo57878b() {
        ArrayList arrayList = new ArrayList();
        mo57877a(arrayList, C8476c.MBRIDGE_RES_MANAGER_DIR, "mb/res");
        mo57877a(arrayList, C8476c.AD_MOVIES, "mb/res/Movies").mo57870a(C8476c.MBRIDGE_VC, "mb/res/.MBridge_VC");
        C8474a a = mo57877a(arrayList, C8476c.AD_MBRIDGE_700, "mb/res/.mbridge700");
        a.mo57870a(C8476c.MBRIDGE_700_IMG, "mb/res/img");
        a.mo57870a(C8476c.MBRIDGE_700_RES, "mb/res/res");
        a.mo57870a(C8476c.MBRIDGE_700_HTML, "mb/res/html");
        a.mo57870a(C8476c.MBRIDGE_700_XML, "mb/res/xml");
        a.mo57870a(C8476c.MBRIDGE_700_CONFIG, "mb/config");
        mo57877a(arrayList, C8476c.MBRIDGE_OTHER, "mb/other");
        mo57877a(arrayList, C8476c.MBRIDGE_CRASH_INFO, "mb/crashinfo");
        mo57877a(arrayList, C8476c.MBRIDGE_OTHER, "mb/other");
        return arrayList;
    }
}
