package com.unity3d.services.core.log;

/* renamed from: com.unity3d.services.core.log.b */
/* compiled from: DeviceLogEntry */
class C12068b {

    /* renamed from: a */
    private C12069c f29453a = null;

    /* renamed from: b */
    private String f29454b = null;

    /* renamed from: c */
    private StackTraceElement f29455c = null;

    public C12068b(C12069c cVar, String str, StackTraceElement stackTraceElement) {
        this.f29453a = cVar;
        this.f29454b = str;
        this.f29455c = stackTraceElement;
    }

    /* renamed from: a */
    public C12069c mo71207a() {
        return this.f29453a;
    }

    /* renamed from: b */
    public String mo71208b() {
        int i;
        String str;
        String str2;
        String str3 = this.f29454b;
        StackTraceElement stackTraceElement = this.f29455c;
        if (stackTraceElement != null) {
            str2 = stackTraceElement.getClassName();
            str = this.f29455c.getMethodName();
            i = this.f29455c.getLineNumber();
        } else {
            str2 = "UnknownClass";
            str = "unknownMethod";
            i = -1;
        }
        if (str3 != null && !str3.isEmpty()) {
            str3 = " :: " + str3;
        }
        if (str3 == null) {
            str3 = "";
        }
        return str2 + "." + str + "()" + (" (line:" + i + ")") + str3;
    }
}
