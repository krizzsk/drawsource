package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.util.C5330x0;
import org.w3c.dom.Node;

/* renamed from: com.fyber.inneractive.sdk.model.vast.s */
public class C4438s extends C4423e {

    /* renamed from: e */
    public String f10952e;

    /* renamed from: c */
    public static C4438s m13621c(Node node) {
        C4438s sVar = new C4438s();
        super.mo24617b(node);
        sVar.f10952e = C5330x0.m16555a(C5330x0.m16558d(node, "VASTAdTagURI"));
        return sVar;
    }
}
