package com.saygames.saypromo.p378a;

import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* renamed from: com.saygames.saypromo.a.k6 */
public final class C10642k6 implements C10634j6 {

    /* renamed from: b */
    static final /* synthetic */ KProperty[] f26247b = {C10532W4.m30277a(C10642k6.class, "linkMapper", "getLinkMapper()Lcom/saygames/saypromo/common/LinkMapper;", 0)};

    /* renamed from: a */
    private final C10484P4 f26248a;

    C10642k6(C10491Q4 q4) {
        this.f26248a = q4;
    }

    /* renamed from: a */
    private final C10696r4 m30491a() {
        C10484P4 p4 = this.f26248a;
        KProperty kProperty = f26247b[0];
        return (C10696r4) ((C10491Q4) p4).mo65365a();
    }

    /* renamed from: a */
    public final C10626i6 mo65490a(String str) {
        if (StringsKt.startsWith$default(str, "click", false, 2, (Object) null)) {
            C10498R5 a = C10485P5.m30221a("https://open?type=" + str);
            return new C10602f6((C10664n4) null, C10658m6.m30515a(a), C10658m6.m30517b(a));
        } else if (StringsKt.startsWith$default(str, "event", false, 2, (Object) null)) {
            String a2 = C10485P5.m30221a("https://open?" + str).mo65373a("event");
            return a2 == null ? new C10618h6() : new C10610g6(a2);
        } else if (StringsKt.startsWith$default(str, "http://", false, 2, (Object) null)) {
            C10498R5 a3 = C10485P5.m30221a(str);
            C10664n4 a4 = ((C10703s4) m30491a()).mo65537a(new C10680p4((String) null, str));
            return a4 == null ? new C10618h6() : new C10602f6(a4, C10658m6.m30515a(a3), C10658m6.m30517b(a3));
        } else if (!StringsKt.startsWith$default(str, "https://", false, 2, (Object) null)) {
            return new C10618h6();
        } else {
            C10498R5 a5 = C10485P5.m30221a(str);
            C10664n4 a6 = ((C10703s4) m30491a()).mo65537a(new C10680p4((String) null, str));
            return a6 == null ? new C10618h6() : new C10602f6(a6, C10658m6.m30515a(a5), C10658m6.m30517b(a5));
        }
    }
}
