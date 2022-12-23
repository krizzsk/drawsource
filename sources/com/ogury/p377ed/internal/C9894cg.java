package com.ogury.p377ed.internal;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ogury.ed.internal.cg */
public final class C9894cg {

    /* renamed from: a */
    public static final C9895a f24929a = new C9895a((byte) 0);

    /* renamed from: b */
    private final List<String> f24930b;

    /* renamed from: c */
    private final List<String> f24931c;

    public C9894cg(List<String> list, List<String> list2) {
        C10263mq.m29882b(list, "whitelist");
        C10263mq.m29882b(list2, "blacklist");
        this.f24930b = list;
        this.f24931c = list2;
    }

    /* renamed from: a */
    public final List<String> mo64433a() {
        return this.f24930b;
    }

    /* renamed from: b */
    public final List<String> mo64434b() {
        return this.f24931c;
    }

    /* renamed from: com.ogury.ed.internal.cg$a */
    public static final class C9895a {
        public /* synthetic */ C9895a(byte b) {
            this();
        }

        private C9895a() {
        }

        /* renamed from: a */
        public static C9894cg m28575a(Activity activity, C10024fj fjVar, C9901ck ckVar) {
            C10263mq.m29882b(activity, "activity");
            C10263mq.m29882b(fjVar, "fragmentOverlayConfig");
            C10263mq.m29882b(ckVar, "publisherFragmentFilter");
            return new C9894cg(m28577a(fjVar, ckVar, activity), m28576a(fjVar, ckVar));
        }

        /* renamed from: a */
        private static List<String> m28577a(C10024fj fjVar, C9901ck ckVar, Activity activity) {
            List<String> arrayList = new ArrayList<>();
            arrayList.addAll(fjVar.mo64667e());
            if (fjVar.mo64664c()) {
                arrayList.addAll(ckVar.mo64436a());
            }
            if (fjVar.mo64662b()) {
                arrayList.add(C9890cc.m28564a(activity));
            }
            return arrayList;
        }

        /* renamed from: a */
        private static List<String> m28576a(C10024fj fjVar, C9901ck ckVar) {
            List<String> arrayList = new ArrayList<>();
            arrayList.addAll(fjVar.mo64668f());
            if (fjVar.mo64666d()) {
                for (Class cls : ckVar.mo64438b()) {
                    String canonicalName = cls.getCanonicalName();
                    if (canonicalName == null) {
                        canonicalName = cls.getName();
                    }
                    C10263mq.m29879a((Object) canonicalName, "fullName");
                    arrayList.add(canonicalName);
                }
            }
            return arrayList;
        }
    }
}
