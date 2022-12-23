package com.fyber.inneractive.sdk.flow.vast;

import com.fyber.inneractive.sdk.model.vast.C4421c;
import com.fyber.inneractive.sdk.model.vast.C4425g;
import java.util.Comparator;

/* renamed from: com.fyber.inneractive.sdk.flow.vast.b */
public class C4383b implements Comparator<C4421c> {

    /* renamed from: a */
    public int f10781a;

    /* renamed from: b */
    public int f10782b;

    public C4383b(int i, int i2) {
        this.f10781a = i;
        this.f10782b = i2;
    }

    /* renamed from: a */
    public Integer mo24564a(C4421c cVar) {
        C4425g gVar = cVar.f10868a;
        if (gVar == C4425g.Html) {
            return 3;
        }
        if (gVar == C4425g.Iframe) {
            return 2;
        }
        if (gVar == C4425g.Static) {
            return 1;
        }
        return -1;
    }

    public int compare(Object obj, Object obj2) {
        C4421c cVar = (C4421c) obj;
        C4421c cVar2 = (C4421c) obj2;
        int i = cVar.f10870c * cVar.f10871d;
        int i2 = cVar2.f10870c * cVar2.f10871d;
        int i3 = this.f10781a * this.f10782b;
        int abs = Math.abs(i - i3);
        int abs2 = Math.abs(i2 - i3);
        if (abs >= abs2) {
            if (abs <= abs2) {
                float floatValue = Float.valueOf((float) this.f10781a).floatValue() / Float.valueOf((float) this.f10782b).floatValue();
                float abs3 = Math.abs(floatValue - (Float.valueOf((float) cVar.f10870c).floatValue() / Float.valueOf((float) cVar.f10871d).floatValue()));
                float abs4 = Math.abs(floatValue - (Float.valueOf((float) cVar2.f10870c).floatValue() / Float.valueOf((float) cVar2.f10871d).floatValue()));
                if (abs3 >= abs4) {
                    if (abs3 <= abs4) {
                        int compareTo = mo24564a(cVar2).compareTo(mo24564a(cVar));
                        if (compareTo != 0) {
                            return compareTo;
                        }
                        return 0;
                    }
                }
            }
            return 1;
        }
        return -1;
    }
}
