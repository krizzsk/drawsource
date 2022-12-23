package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.util.C5330x0;
import org.w3c.dom.Node;

/* renamed from: com.fyber.inneractive.sdk.model.vast.p */
public class C4434p {

    /* renamed from: a */
    public String f10926a;

    /* renamed from: b */
    public String f10927b;

    /* renamed from: a */
    public static C4434p m13616a(Node node) {
        if (node == null) {
            return null;
        }
        C4434p pVar = new C4434p();
        pVar.f10926a = C5330x0.m16556b(node, "event");
        pVar.f10927b = C5330x0.m16555a(node);
        return pVar;
    }

    public String toString() {
        return "VTracking: " + " name:" + this.f10926a + " url:" + this.f10927b;
    }
}
