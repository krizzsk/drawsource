package com.ogury.p377ed.internal;

import android.content.Context;
import android.graphics.Paint;
import android.os.Build;

/* renamed from: com.ogury.ed.internal.jk */
public final class C10161jk {
    /* renamed from: a */
    public static final void m29715a(C10158jh jhVar, String str) {
        C10263mq.m29882b(jhVar, "<this>");
        C10263mq.m29882b(str, "javascript");
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(C10092hn.m29338b(jhVar));
            sb.append(" >> ");
            sb.append(str);
            jhVar.loadUrl(C10263mq.m29874a("javascript:", (Object) str));
        } catch (Throwable th) {
            C9925da daVar = C9925da.f24975a;
            C9925da.m28653a(th);
        }
    }

    /* renamed from: a */
    public static final void m29714a(C10158jh jhVar, C9981eb ebVar) {
        C10263mq.m29882b(jhVar, "<this>");
        C10263mq.m29882b(ebVar, "ad");
        boolean z = true;
        String h = ebVar.mo64520h().length() > 0 ? ebVar.mo64520h() : "http://ads-test.st.ogury.com/";
        if (ebVar.mo64506c().length() <= 0) {
            z = false;
        }
        try {
            jhVar.loadDataWithBaseURL(h, z ? ebVar.mo64506c() : "The ad contains no ad_content", "text/html", "UTF-8", (String) null);
        } catch (Throwable th) {
            C9925da daVar = C9925da.f24975a;
            C9925da.m28653a(th);
        }
    }

    /* renamed from: a */
    public static final C10158jh m29713a(Context context, C9981eb ebVar) {
        C10263mq.m29882b(context, "context");
        C10263mq.m29882b(ebVar, "ad");
        try {
            C10158jh jhVar = new C10158jh(context, ebVar);
            jhVar.setBackgroundColor(0);
            if (Build.VERSION.SDK_INT >= 19) {
                jhVar.setLayerType(2, (Paint) null);
            }
            return jhVar;
        } catch (Throwable th) {
            C9925da daVar = C9925da.f24975a;
            C9925da.m28653a(th);
            return null;
        }
    }
}
