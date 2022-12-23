package com.fyber.inneractive.sdk.mraid;

/* renamed from: com.fyber.inneractive.sdk.mraid.t */
public abstract class C4464t {
    /* renamed from: a */
    public abstract String mo24636a();

    public String toString() {
        String a = mo24636a();
        if (a != null) {
            return a.replaceAll("[^a-zA-Z0-9_,:\\s\\{\\}\\'\\\"]", "");
        }
        return "";
    }
}
