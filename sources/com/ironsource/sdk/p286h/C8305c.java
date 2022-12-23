package com.ironsource.sdk.p286h;

import java.io.File;
import org.json.JSONObject;

/* renamed from: com.ironsource.sdk.h.c */
public final class C8305c extends File {
    public C8305c(String str) {
        super(str);
    }

    public C8305c(String str, String str2) {
        super(str, str2);
    }

    /* renamed from: a */
    public final JSONObject mo56750a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", getName());
        jSONObject.put("path", getPath());
        jSONObject.put("lastModified", lastModified());
        if (isFile()) {
            jSONObject.put("size", length());
        }
        return jSONObject;
    }

    public final String toString() {
        return "ISNFile(name: " + getName() + ", path: " + getPath() + ", isFile: " + isFile() + ", isDirectory: " + isDirectory() + ", lastModified: " + lastModified() + ", length: " + length() + ")";
    }
}
