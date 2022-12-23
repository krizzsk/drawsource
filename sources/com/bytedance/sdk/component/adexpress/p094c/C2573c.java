package com.bytedance.sdk.component.adexpress.p094c;

import android.net.Uri;
import android.text.TextUtils;

/* renamed from: com.bytedance.sdk.component.adexpress.c.c */
/* compiled from: UrlUtils */
public class C2573c {
    /* renamed from: a */
    public static C2574a m6630a(String str) {
        C2574a aVar;
        C2574a aVar2 = C2574a.IMAGE;
        if (TextUtils.isEmpty(str)) {
            return aVar2;
        }
        try {
            String path = Uri.parse(str).getPath();
            if (path == null) {
                return aVar2;
            }
            if (path.endsWith(".css")) {
                aVar = C2574a.CSS;
            } else if (path.endsWith(".js")) {
                aVar = C2574a.JS;
            } else {
                if (!path.endsWith(".jpg") && !path.endsWith(".gif") && !path.endsWith(".png") && !path.endsWith(".jpeg") && !path.endsWith(".webp") && !path.endsWith(".bmp")) {
                    if (!path.endsWith(".ico")) {
                        if (!path.endsWith(".html")) {
                            return aVar2;
                        }
                        aVar = C2574a.HTML;
                    }
                }
                aVar = C2574a.IMAGE;
            }
            return aVar;
        } catch (Throwable unused) {
            return aVar2;
        }
    }

    /* renamed from: com.bytedance.sdk.component.adexpress.c.c$a */
    /* compiled from: UrlUtils */
    public enum C2574a {
        HTML("text/html"),
        CSS("text/css"),
        JS("application/x-javascript"),
        IMAGE("image/*");
        

        /* renamed from: e */
        private String f5479e;

        private C2574a(String str) {
            this.f5479e = str;
        }

        /* renamed from: a */
        public String mo16734a() {
            return this.f5479e;
        }
    }
}
