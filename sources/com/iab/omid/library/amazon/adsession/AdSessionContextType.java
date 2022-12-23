package com.iab.omid.library.amazon.adsession;

import com.tapjoy.TJAdUnitConstants;

public enum AdSessionContextType {
    HTML(TJAdUnitConstants.String.HTML),
    NATIVE("native"),
    JAVASCRIPT("javascript");
    
    private final String typeString;

    private AdSessionContextType(String str) {
        this.typeString = str;
    }

    public String toString() {
        return this.typeString;
    }
}
