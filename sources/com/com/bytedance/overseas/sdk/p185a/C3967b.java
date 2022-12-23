package com.com.bytedance.overseas.sdk.p185a;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.C3704y;
import com.bytedance.sdk.openadsdk.core.p149e.C3405c;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.p128b.C3090e;
import com.bytedance.sdk.openadsdk.p128b.C3110p;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.com.bytedance.overseas.sdk.a.b */
/* compiled from: GPDownLoader */
public class C3967b implements C3968c {

    /* renamed from: a */
    protected C3405c f10079a;

    /* renamed from: b */
    protected C3431n f10080b;

    /* renamed from: c */
    protected String f10081c;

    /* renamed from: d */
    protected boolean f10082d = false;

    /* renamed from: e */
    protected final AtomicBoolean f10083e = new AtomicBoolean(false);

    /* renamed from: f */
    private WeakReference<Context> f10084f;

    /* renamed from: g */
    private boolean f10085g = false;

    public C3967b(Context context, C3431n nVar, String str) {
        this.f10084f = new WeakReference<>(context);
        this.f10080b = nVar;
        this.f10079a = nVar.mo19567aa();
        this.f10081c = str;
        C2905l.m8114c("GPDownLoader", "====tag===" + str);
        if (C3513m.m10963a() == null) {
            C3513m.m10965a(context);
        }
    }

    /* renamed from: a */
    public void mo20857a(boolean z) {
        this.f10085g = z;
    }

    /* renamed from: a */
    public boolean mo20858a(Context context, String str) {
        return m13077b(context, str);
    }

    /* renamed from: b */
    public static boolean m13077b(Context context, String str) {
        Intent launchIntentForPackage;
        if (!(context == null || str == null || TextUtils.isEmpty(str))) {
            C2905l.m8114c("GPDownLoader", "gotoGooglePlay :market://details?id=" + str);
            Intent intent = new Intent("android.intent.action.VIEW");
            Uri parse = Uri.parse("market://details?id=" + str);
            intent.setData(parse);
            for (ResolveInfo next : context.getPackageManager().queryIntentActivities(intent, 65536)) {
                if (next.activityInfo.packageName.equals("com.android.vending") && (launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage("com.android.vending")) != null) {
                    launchIntentForPackage.setComponent(new ComponentName(next.activityInfo.packageName, next.activityInfo.name));
                    launchIntentForPackage.setData(parse);
                    if (!(context instanceof Activity)) {
                        launchIntentForPackage.setFlags(268435456);
                    }
                    context.startActivity(launchIntentForPackage);
                    return true;
                }
            }
            try {
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + str));
                intent2.setFlags(268435456);
                context.startActivity(intent2);
                return true;
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public Context mo20859c() {
        WeakReference<Context> weakReference = this.f10084f;
        return (weakReference == null || weakReference.get() == null) ? C3513m.m10963a() : (Context) this.f10084f.get();
    }

    /* renamed from: d */
    public void mo20860d() {
        if (mo20859c() != null) {
            if (mo20856b()) {
                this.f10083e.set(true);
            } else if (!mo20855a() && !mo20861e() && this.f10080b.mo19567aa() == null && this.f10080b.mo19522O() != null) {
                C3704y.m12115a(mo20859c(), this.f10080b.mo19522O(), this.f10080b, C3898x.m12747a(this.f10081c), this.f10081c, true);
            }
        }
    }

    /* renamed from: b */
    public boolean mo20856b() {
        if (this.f10080b.mo19568ab() == null) {
            return false;
        }
        String a = this.f10080b.mo19568ab().mo19443a();
        if (!TextUtils.isEmpty(a)) {
            Uri parse = Uri.parse(a);
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(parse);
            if (C3898x.m12765a(mo20859c(), intent)) {
                if (!(mo20859c() instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                try {
                    C3090e.m8924d(C3513m.m10963a(), this.f10080b, this.f10081c, "open_url_app", (Map<String, Object>) null);
                    mo20859c().startActivity(intent);
                    C3110p.m9026a().mo18708a(this.f10080b, this.f10081c);
                    return true;
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            }
        }
        if (this.f10082d && !this.f10083e.get()) {
            return false;
        }
        this.f10082d = true;
        C3090e.m8924d(mo20859c(), this.f10080b, this.f10081c, "open_fallback_url", (Map<String, Object>) null);
        return false;
    }

    /* renamed from: e */
    public boolean mo20861e() {
        this.f10083e.set(true);
        if (this.f10079a == null || !mo20858a(mo20859c(), this.f10079a.mo19407c())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo20855a() {
        Intent a;
        if (this.f10079a == null) {
            return false;
        }
        C3431n nVar = this.f10080b;
        if (nVar != null && nVar.mo19585as() == 0) {
            return false;
        }
        String c = this.f10079a.mo19407c();
        if (TextUtils.isEmpty(c) || !C3898x.m12773b(mo20859c(), c) || (a = C3898x.m12750a(mo20859c(), c)) == null) {
            return false;
        }
        a.putExtra("START_ONLY_FOR_ANDROID", true);
        try {
            mo20859c().startActivity(a);
            C3090e.m8924d(mo20859c(), this.f10080b, this.f10081c, "click_open", (Map<String, Object>) null);
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }
}
