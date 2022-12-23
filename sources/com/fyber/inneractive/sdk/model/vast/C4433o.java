package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.util.C5330x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Node;

/* renamed from: com.fyber.inneractive.sdk.model.vast.o */
public class C4433o {

    /* renamed from: a */
    public String f10924a;

    /* renamed from: b */
    public List<C4422d> f10925b;

    /* renamed from: a */
    public static C4433o m13615a(Node node) {
        C4422d dVar;
        C4433o oVar = new C4433o();
        oVar.f10924a = C5330x0.m16556b(node, "version");
        ArrayList arrayList = (ArrayList) C5330x0.m16557c(node, "Ad");
        if (!arrayList.isEmpty()) {
            oVar.f10925b = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Node node2 = (Node) it.next();
                if (node2 == null) {
                    dVar = null;
                } else {
                    C4422d dVar2 = new C4422d();
                    dVar2.f10876a = C5330x0.m16556b(node2, "id");
                    Node d = C5330x0.m16558d(node2, "Wrapper");
                    if (d != null) {
                        dVar2.f10877b = C4438s.m13621c(d);
                    }
                    Node d2 = C5330x0.m16558d(node2, "InLine");
                    if (d2 != null) {
                        dVar2.f10878c = C4429k.m13613c(d2);
                    }
                    dVar = dVar2;
                }
                oVar.f10925b.add(dVar);
            }
        }
        return oVar;
    }

    public String toString() {
        return new StringBuilder("Vast: version - " + this.f10924a + "\nAds: ").toString();
    }
}
