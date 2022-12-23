package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.network.C4511q;
import com.fyber.inneractive.sdk.response.C5233e;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.PrintWriter;
import java.io.StringWriter;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.network.r */
public class C4516r {
    /* renamed from: a */
    public static void m13797a(String str, String str2, InneractiveAdRequest inneractiveAdRequest, C5233e eVar) {
        C4509p pVar = C4509p.CAUGHT_EXCEPTION;
        C4511q.C4512a aVar = new C4511q.C4512a(eVar);
        aVar.f11164c = pVar;
        aVar.f11162a = inneractiveAdRequest;
        aVar.f11165d = null;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("exception_name", str);
        } catch (Exception unused) {
            IAlog.m16450e("Got exception adding param to json object: %s, %s", "exception_name", str);
        }
        try {
            jSONObject.put("description", str2);
        } catch (Exception unused2) {
            IAlog.m16450e("Got exception adding param to json object: %s, %s", "description", str2);
        }
        aVar.f11167f.put(jSONObject);
        aVar.mo24693a((String) null);
    }

    /* renamed from: a */
    public static void m13798a(Throwable th, InneractiveAdRequest inneractiveAdRequest, C5233e eVar) {
        StringWriter stringWriter = new StringWriter();
        th.printStackTrace(new PrintWriter(stringWriter));
        String stringBuffer = stringWriter.getBuffer().toString();
        C4509p pVar = C4509p.CAUGHT_EXCEPTION;
        C4511q.C4512a aVar = new C4511q.C4512a(eVar);
        aVar.f11164c = pVar;
        aVar.f11162a = inneractiveAdRequest;
        aVar.f11165d = null;
        JSONObject jSONObject = new JSONObject();
        String cls = th.getClass().toString();
        try {
            jSONObject.put("exception_name", cls);
        } catch (Exception unused) {
            IAlog.m16450e("Got exception adding param to json object: %s, %s", "exception_name", cls);
        }
        String message = th.getMessage();
        try {
            jSONObject.put("description", message);
        } catch (Exception unused2) {
            IAlog.m16450e("Got exception adding param to json object: %s, %s", "description", message);
        }
        try {
            jSONObject.put("stack_trace", stringBuffer);
        } catch (Exception unused3) {
            IAlog.m16450e("Got exception adding param to json object: %s, %s", "stack_trace", stringBuffer);
        }
        aVar.f11167f.put(jSONObject);
        aVar.mo24693a((String) null);
    }
}
