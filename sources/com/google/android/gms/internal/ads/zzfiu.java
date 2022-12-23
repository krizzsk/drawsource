package com.google.android.gms.internal.ads;

import com.tapjoy.TJAdUnitConstants;

/* compiled from: com.google.android.gms:play-services-ads@@21.1.0 */
public enum zzfiu {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    UNSPECIFIED("unspecified"),
    LOADED(TJAdUnitConstants.String.VIDEO_LOADED),
    BEGIN_TO_RENDER("beginToRender"),
    ONE_PIXEL("onePixel"),
    VIEWABLE("viewable"),
    AUDIBLE("audible"),
    OTHER("other");
    
    private final String zzj;

    private zzfiu(String str) {
        this.zzj = str;
    }

    public final String toString() {
        return this.zzj;
    }
}
