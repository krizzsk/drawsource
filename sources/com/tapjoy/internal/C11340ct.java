package com.tapjoy.internal;

import com.tapjoy.TJAdUnitConstants;

/* renamed from: com.tapjoy.internal.ct */
public enum C11340ct {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED("unspecified"),
    LOADED(TJAdUnitConstants.String.VIDEO_LOADED),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE("viewable"),
    AUDIBLE("audible"),
    OTHER("other");
    

    /* renamed from: i */
    private final String f27065i;

    private C11340ct(String str) {
        this.f27065i = str;
    }

    public final String toString() {
        return this.f27065i;
    }
}
