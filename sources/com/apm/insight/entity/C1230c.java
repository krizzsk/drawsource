package com.apm.insight.entity;

import com.apm.insight.C1250h;
import com.apm.insight.p026l.C1295a;

/* renamed from: com.apm.insight.entity.c */
public class C1230c extends C1227a {

    /* renamed from: c */
    private String f1118c;

    public C1230c(String str) {
        this.f1118c = str;
    }

    /* renamed from: a */
    public static C1230c m1513a(StackTraceElement stackTraceElement, String str, String str2, String str3, boolean z, String str4, String str5) {
        C1230c cVar = new C1230c(str5);
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        int lineNumber = stackTraceElement.getLineNumber();
        cVar.mo12474a("event_type", (Object) "exception");
        cVar.mo12474a("log_type", (Object) str5);
        cVar.mo12474a("timestamp", (Object) Long.valueOf(System.currentTimeMillis()));
        cVar.mo12474a("crash_time", (Object) Long.valueOf(System.currentTimeMillis()));
        cVar.mo12474a("class_ref", (Object) className);
        cVar.mo12474a("method", (Object) methodName);
        cVar.mo12474a("line_num", (Object) Integer.valueOf(lineNumber));
        cVar.mo12474a("stack", (Object) str);
        cVar.mo12474a("exception_type", (Object) 1);
        cVar.mo12474a("ensure_type", (Object) str4);
        cVar.mo12474a("is_core", (Object) Integer.valueOf(z ? 1 : 0));
        cVar.mo12474a("message", (Object) str2);
        cVar.mo12474a("process_name", (Object) C1295a.m1782c(C1250h.m1615g()));
        cVar.mo12474a("crash_thread_name", (Object) str3);
        C1231d.m1516b(cVar.mo12488h());
        return cVar;
    }
}
