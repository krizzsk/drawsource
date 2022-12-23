package com.ogury.core.internal.crash;

import com.ogury.core.internal.C9717ai;
import java.io.File;
import java.io.PrintWriter;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ogury.core.internal.crash.d */
/* compiled from: CrashFileWriter.kt */
public final class C9746d {
    static {
        new C9747a((byte) 0);
    }

    /* renamed from: com.ogury.core.internal.crash.d$a */
    /* compiled from: CrashFileWriter.kt */
    public static final class C9747a {
        private C9747a() {
        }

        public /* synthetic */ C9747a(byte b) {
            this();
        }
    }

    /* renamed from: b */
    private static void m28185b(JSONArray jSONArray, File file) {
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.print(jSONArray);
        printWriter.close();
    }

    /* renamed from: a */
    public final void mo64097a(JSONArray jSONArray, File file) {
        C9717ai.m28145b(jSONArray, "crashes");
        C9717ai.m28145b(file, "crashFile");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            jSONObject.put("number_of_crashes_on_last_upload", jSONObject.getInt("number_of_crashes"));
        }
        m28185b(jSONArray, file);
    }

    /* renamed from: a */
    public final void mo64096a(File file, JSONObject jSONObject, JSONArray jSONArray) {
        C9717ai.m28145b(file, "crashFile");
        C9717ai.m28145b(jSONObject, "newCrash");
        C9717ai.m28145b(jSONArray, "previousCrashes");
        int length = jSONArray.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (C9717ai.m28144a((Object) jSONArray.getJSONObject(i).getString("stacktrace"), (Object) jSONObject.getString("stacktrace"))) {
                break;
            } else {
                i++;
            }
        }
        if (i != -1) {
            JSONObject jSONObject2 = jSONArray.getJSONObject(i);
            int i2 = jSONObject2.getInt("number_of_crashes_on_last_upload");
            jSONObject.put("number_of_crashes", jSONObject2.getInt("number_of_crashes") + 1);
            jSONObject.put("number_of_crashes_on_last_upload", i2);
            jSONArray.put(i, jSONObject);
        } else {
            jSONArray.put(jSONObject);
        }
        m28185b(jSONArray, file);
    }
}
