package com.mbridge.msdk.mbsignalcommon.windvane;

import com.google.android.exoplayer2.util.MimeTypes;
import com.tapjoy.TJAdUnitConstants;

/* renamed from: com.mbridge.msdk.mbsignalcommon.windvane.e */
/* compiled from: MimeTypeEnum */
public enum C8885e {
    JS("js", "application/x-javascript"),
    CSS("css", "text/css"),
    JPG("jpg", MimeTypes.IMAGE_JPEG),
    JPEG("jpep", MimeTypes.IMAGE_JPEG),
    PNG("png", "image/png"),
    WEBP("webp", "image/webp"),
    GIF("gif", "image/gif"),
    HTM("htm", "text/html"),
    HTML(TJAdUnitConstants.String.HTML, "text/html");
    

    /* renamed from: j */
    private String f21900j;

    /* renamed from: k */
    private String f21901k;

    private C8885e(String str, String str2) {
        this.f21900j = str;
        this.f21901k = str2;
    }

    /* renamed from: a */
    public final String mo58680a() {
        return this.f21900j;
    }

    /* renamed from: b */
    public final String mo58681b() {
        return this.f21901k;
    }
}
