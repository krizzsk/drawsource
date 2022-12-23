package com.tapjoy.internal;

import com.tapjoy.TapjoyConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: com.tapjoy.internal.ib */
public class C11596ib extends C11595ia {

    /* renamed from: d */
    public static final C11288bc<C11596ib> f27877d = new C11288bc<C11596ib>() {
        /* renamed from: a */
        public final /* synthetic */ Object mo69701a(C11296bh bhVar) {
            return new C11596ib(bhVar);
        }
    };

    /* renamed from: a */
    public ArrayList<C11616ik> f27878a = new ArrayList<>();

    /* renamed from: b */
    public Map<String, Object> f27879b;

    /* renamed from: c */
    public float f27880c;

    public C11596ib(C11296bh bhVar) {
        bhVar.mo69722h();
        String str = null;
        String str2 = null;
        while (bhVar.mo69724j()) {
            String l = bhVar.mo69726l();
            if ("layouts".equals(l)) {
                bhVar.mo69708a(this.f27878a, C11616ik.f27947d);
            } else if ("meta".equals(l)) {
                this.f27879b = bhVar.mo69714d();
            } else if ("max_show_time".equals(l)) {
                this.f27880c = (float) bhVar.mo69730p();
            } else if ("ad_content".equals(l)) {
                str = bhVar.mo69711b();
            } else if (TapjoyConstants.TJC_REDIRECT_URL.equals(l)) {
                str2 = bhVar.mo69711b();
            } else {
                bhVar.mo69733s();
            }
        }
        bhVar.mo69723i();
        ArrayList<C11616ik> arrayList = this.f27878a;
        if (arrayList != null) {
            Iterator<C11616ik> it = arrayList.iterator();
            while (it.hasNext()) {
                C11616ik next = it.next();
                if (next.f27950c != null) {
                    Iterator<C11614ij> it2 = next.f27950c.iterator();
                    while (it2.hasNext()) {
                        C11614ij next2 = it2.next();
                        if (next2.f27942i == null) {
                            next2.f27942i = str;
                        }
                        if (next2.f27941h == null) {
                            next2.f27941h = str2;
                        }
                    }
                }
            }
        }
    }
}
