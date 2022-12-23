package com.fyber.inneractive.sdk.model.vast;

import com.fyber.inneractive.sdk.util.C5330x0;
import com.smaato.sdk.video.vast.model.InLine;
import org.w3c.dom.Node;

/* renamed from: com.fyber.inneractive.sdk.model.vast.k */
public class C4429k extends C4423e {
    /* renamed from: c */
    public static C4429k m13613c(Node node) {
        C4429k kVar = new C4429k();
        super.mo24617b(node);
        C5330x0.m16555a(C5330x0.m16558d(node, InLine.AD_TITLE));
        C5330x0.m16555a(C5330x0.m16558d(node, InLine.DESCRIPTION));
        return kVar;
    }
}
