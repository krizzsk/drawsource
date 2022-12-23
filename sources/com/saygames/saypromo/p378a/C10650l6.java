package com.saygames.saypromo.p378a;

import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;

/* renamed from: com.saygames.saypromo.a.l6 */
public final class C10650l6 implements C10634j6 {

    /* renamed from: b */
    static final /* synthetic */ KProperty[] f26260b = {C10532W4.m30277a(C10650l6.class, "linkMapper", "getLinkMapper()Lcom/saygames/saypromo/common/LinkMapper;", 0)};

    /* renamed from: a */
    private final C10484P4 f26261a;

    C10650l6(C10491Q4 q4) {
        this.f26261a = q4;
    }

    /* renamed from: a */
    private final C10696r4 m30504a() {
        C10484P4 p4 = this.f26261a;
        KProperty kProperty = f26260b[0];
        return (C10696r4) ((C10491Q4) p4).mo65365a();
    }

    /* renamed from: b */
    private final C10626i6 m30505b(String str) {
        C10498R5 a = C10485P5.m30221a(str);
        C10664n4 a2 = ((C10703s4) m30504a()).mo65537a(new C10680p4((String) null, str));
        return a2 == null ? new C10618h6() : new C10602f6(a2, C10658m6.m30515a(a), C10658m6.m30517b(a));
    }

    /* renamed from: a */
    public final C10626i6 mo65490a(String str) {
        C10602f6 f6Var;
        C10610g6 g6Var;
        if (!StringsKt.startsWith$default(str, "mraid://open?", false, 2, (Object) null)) {
            return new C10618h6();
        }
        String a = C10485P5.m30221a(StringsKt.replace$default(str, "mraid://", "https://", false, 4, (Object) null)).mo65373a("url");
        if (a == null) {
            return new C10618h6();
        }
        if (StringsKt.startsWith$default(a, "event", false, 2, (Object) null)) {
            String a2 = C10485P5.m30221a("https://open?" + a).mo65373a("event");
            if (a2 == null) {
                return new C10618h6();
            }
            g6Var = new C10610g6(a2);
        } else if (StringsKt.startsWith$default(a, "http://", false, 2, (Object) null) || StringsKt.startsWith$default(a, "https://", false, 2, (Object) null)) {
            return m30505b(a);
        } else {
            C10498R5 a3 = C10485P5.m30221a("https://open?" + a);
            String a4 = a3.mo65373a("type");
            if (a4 != null) {
                int hashCode = a4.hashCode();
                if (hashCode != -1964722632) {
                    if (hashCode != 96891546) {
                        if (hashCode == 1685379946 && a4.equals("click_store")) {
                            String a5 = a3.mo65373a("id");
                            if (a5 == null) {
                                return new C10618h6();
                            }
                            C10664n4 a6 = ((C10703s4) m30504a()).mo65537a(new C10680p4(a5, (String) null));
                            if (a6 == null) {
                                return new C10618h6();
                            }
                            f6Var = new C10602f6(a6, C10658m6.m30515a(a3), C10658m6.m30517b(a3));
                        }
                    } else if (a4.equals("event")) {
                        String a7 = a3.mo65373a("name");
                        if (a7 == null) {
                            return new C10618h6();
                        }
                        g6Var = new C10610g6(a7);
                    }
                } else if (a4.equals("click_url")) {
                    String a8 = a3.mo65373a("url");
                    if (a8 == null) {
                        return new C10618h6();
                    }
                    C10664n4 a9 = ((C10703s4) m30504a()).mo65537a(new C10680p4((String) null, a8));
                    if (a9 == null) {
                        return new C10618h6();
                    }
                    f6Var = new C10602f6(a9, C10658m6.m30515a(a3), C10658m6.m30517b(a3));
                }
                return f6Var;
            }
            return new C10618h6();
        }
        return g6Var;
    }
}
