package com.iab.omid.library.mmadbridge.adsession;

import com.tapjoy.TJAdUnitConstants;

public enum ImpressionType {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED("unspecified"),
    LOADED(TJAdUnitConstants.String.VIDEO_LOADED),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE("viewable"),
    AUDIBLE("audible"),
    OTHER("other");
    
    private final String impressionType;

    private ImpressionType(String str) {
        this.impressionType = str;
    }

    public String toString() {
        return this.impressionType;
    }
}