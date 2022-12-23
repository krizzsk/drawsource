package com.ogury.p376cm.internal;

import android.content.Context;
import androidx.browser.trusted.sharing.ShareTarget;

/* renamed from: com.ogury.cm.internal.abcba */
public final class abcba {

    /* renamed from: a */
    private final abccb f24364a = new abccb();

    /* renamed from: a */
    private static acaba m27904a(acabc acabc, acabb acabb) {
        acaba a = new acaba().mo63900a(ShareTarget.METHOD_POST);
        acaca acaca = acaca.f24445a;
        return a.mo63905c(acaca.m27937a(acabc)).mo63899a(acabb);
    }

    /* renamed from: a */
    public static void m27905a(Context context, String str, acabc acabc, acabb acabb) {
        bbabc.m28052b(context, "context");
        bbabc.m28052b(str, "assetKey");
        bbabc.m28052b(acabc, "requestType");
        bbabc.m28052b(acabb, "requestCallback");
        acaba a = m27904a(acabc, acabb);
        new acaac();
        abccb.m27913a(a.mo63903b(acaac.m27922a(context, str)).mo63909f());
    }

    /* renamed from: a */
    public static void m27906a(String str, acabb acabb) {
        bbabc.m28052b(str, "errorMessage");
        bbabc.m28052b(acabb, "requestCallback");
        acaba a = m27904a(acabc.EVENT, acabb);
        new acaac();
        acaba b = a.mo63903b(acaac.m27923a(str));
        abbba abbba = abbba.f24320a;
        abccb.m27913a(b.mo63901a("X-CM-SECURE-TOKEN", abbba.m27843k()).mo63909f());
    }
}
