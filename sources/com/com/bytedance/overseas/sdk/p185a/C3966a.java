package com.com.bytedance.overseas.sdk.p185a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.p128b.C3090e;
import com.bytedance.sdk.openadsdk.p128b.C3110p;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import java.util.Map;

/* renamed from: com.com.bytedance.overseas.sdk.a.a */
/* compiled from: AndroidRGPDownLoader */
class C3966a extends C3967b {
    public C3966a(Context context, C3431n nVar, String str) {
        super(context, nVar, str);
    }

    /* renamed from: a */
    public boolean mo20855a() {
        Intent a;
        if ((this.f10080b != null && this.f10080b.mo19585as() == 0) || this.f10079a == null) {
            return false;
        }
        try {
            String c = this.f10079a.mo19407c();
            if (TextUtils.isEmpty(c) || (a = C3898x.m12750a(mo20859c(), c)) == null) {
                return false;
            }
            a.putExtra("START_ONLY_FOR_ANDROID", true);
            if (!(mo20859c() instanceof Activity)) {
                a.addFlags(268435456);
            }
            mo20859c().startActivity(a);
            C3090e.m8924d(mo20859c(), this.f10080b, this.f10081c, "click_open", (Map<String, Object>) null);
            return true;
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo20856b() {
        if (this.f10080b.mo19568ab() == null) {
            return false;
        }
        try {
            String a = this.f10080b.mo19568ab().mo19443a();
            if (!TextUtils.isEmpty(a)) {
                Uri parse = Uri.parse(a);
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(parse);
                if (!(mo20859c() instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                C3090e.m8924d(C3513m.m10963a(), this.f10080b, this.f10081c, "open_url_app", (Map<String, Object>) null);
                mo20859c().startActivity(intent);
                C3110p.m9026a().mo18708a(this.f10080b, this.f10081c);
                return true;
            }
        } catch (Throwable unused) {
        }
        if (this.f10082d && !this.f10083e.get()) {
            return false;
        }
        this.f10082d = true;
        C3090e.m8924d(mo20859c(), this.f10080b, this.f10081c, "open_fallback_url", (Map<String, Object>) null);
        return false;
    }
}
