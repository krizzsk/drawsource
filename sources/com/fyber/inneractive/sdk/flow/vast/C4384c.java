package com.fyber.inneractive.sdk.flow.vast;

/* renamed from: com.fyber.inneractive.sdk.flow.vast.c */
public class C4384c {

    /* renamed from: a */
    public C4385a f10783a;

    /* renamed from: b */
    public Object f10784b;

    /* renamed from: com.fyber.inneractive.sdk.flow.vast.c$a */
    public enum C4385a {
        BITRATE_NOT_IN_RANGE(1),
        UNSUPPORTED_MIME_TYPE(2),
        UNSUPPORTED_DELIVERY(3),
        UNSECURED_VIDEO_URL(4),
        VERTICAL_VIDEO_EXPECTED(5),
        FILTERED_BY_APP_OR_UNIT(6),
        NO_CONTENT(7);
        

        /* renamed from: a */
        public int f10793a;

        /* access modifiers changed from: public */
        C4385a(int i) {
            this.f10793a = i;
        }
    }

    public C4384c(C4385a aVar, Object obj) {
        this.f10783a = aVar;
        this.f10784b = obj;
    }

    public String toString() {
        return "Media File inc error::  type = " + this.f10783a + " expected value = " + this.f10784b;
    }
}
