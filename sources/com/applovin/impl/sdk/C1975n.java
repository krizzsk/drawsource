package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AlphaAnimation;
import android.widget.FrameLayout;
import com.amazon.aps.shared.APSAnalytics;
import com.applovin.impl.mediation.p031a.C1583a;
import com.applovin.impl.mediation.p035d.C1655c;
import com.applovin.impl.sdk.p049ad.C1839e;
import com.applovin.impl.sdk.p051c.C1867b;
import com.applovin.impl.sdk.utils.BundleUtils;
import com.applovin.impl.sdk.utils.C2051i;
import com.applovin.impl.sdk.utils.C2088k;
import com.applovin.impl.sdk.utils.C2092o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: com.applovin.impl.sdk.n */
public class C1975n implements C2051i.C2052a {

    /* renamed from: a */
    private final C1969m f3746a;

    /* renamed from: b */
    private Object f3747b;

    /* renamed from: c */
    private WeakReference<View> f3748c = new WeakReference<>((Object) null);

    /* renamed from: d */
    private C2051i f3749d;

    /* renamed from: e */
    private C2092o f3750e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f3751f;

    public C1975n(C1969m mVar) {
        this.f3746a = mVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: android.widget.Button} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: android.widget.ImageButton} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: android.widget.Button} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: android.widget.Button} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.View m4564a(final android.app.Activity r6) {
        /*
            r5 = this;
            r0 = 40
            int r0 = com.applovin.sdk.AppLovinSdkUtils.dpToPx(r6, r0)
            int r1 = r0 / 10
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = 8388629(0x800015, float:1.1754973E-38)
            r2.<init>(r0, r0, r3)
            r2.setMargins(r1, r1, r1, r1)
            android.widget.ImageButton r0 = new android.widget.ImageButton     // Catch:{ all -> 0x0030 }
            r0.<init>(r6)     // Catch:{ all -> 0x0030 }
            android.content.res.Resources r3 = r6.getResources()     // Catch:{ all -> 0x0030 }
            int r4 = com.applovin.sdk.C2271R.C2272drawable.applovin_ic_white_small     // Catch:{ all -> 0x0030 }
            android.graphics.drawable.Drawable r3 = r3.getDrawable(r4)     // Catch:{ all -> 0x0030 }
            r0.setImageDrawable(r3)     // Catch:{ all -> 0x0030 }
            android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ all -> 0x0030 }
            r0.setScaleType(r3)     // Catch:{ all -> 0x0030 }
            int r3 = r1 * 2
            r0.setPadding(r1, r1, r1, r3)     // Catch:{ all -> 0x0030 }
            goto L_0x004b
        L_0x0030:
            android.widget.Button r0 = new android.widget.Button
            r0.<init>(r6)
            java.lang.String r1 = "ⓘ"
            r0.setText(r1)
            r1 = -1
            r0.setTextColor(r1)
            r1 = 0
            r0.setAllCaps(r1)
            r3 = 1101004800(0x41a00000, float:20.0)
            r4 = 2
            r0.setTextSize(r4, r3)
            r0.setPadding(r1, r1, r1, r1)
        L_0x004b:
            r0.setLayoutParams(r2)
            android.graphics.drawable.Drawable r1 = r5.m4571e()
            r0.setBackground(r1)
            com.applovin.impl.sdk.n$4 r1 = new com.applovin.impl.sdk.n$4
            r1.<init>(r6)
            r0.setOnClickListener(r1)
            boolean r1 = com.applovin.impl.sdk.utils.C2049g.m4942d()
            if (r1 == 0) goto L_0x006c
            r1 = 5
            int r6 = com.applovin.sdk.AppLovinSdkUtils.dpToPx(r6, r1)
            float r6 = (float) r6
            r0.setElevation(r6)
        L_0x006c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.C1975n.m4564a(android.app.Activity):android.view.View");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m4565a(Context context) {
        final String f = m4572f();
        final WeakReference weakReference = new WeakReference(context);
        new AlertDialog.Builder(context).setTitle("Ad Info").setMessage(f).setNegativeButton("Close", (DialogInterface.OnClickListener) null).setPositiveButton("Report", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogInterface, int i) {
                Context context = (Context) weakReference.get();
                if (context != null) {
                    C1975n.this.m4566a(context, f);
                }
            }
        }).show();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m4566a(Context context, String str) {
        C2088k kVar = new C2088k();
        kVar.mo14945b("Describe your issue below:\n\n\n").mo14941a("Ad Info:").mo14941a(str).mo14941a("\nDebug Info:\n").mo14942a("Platform", "fireos".equals(this.f3746a.mo14529V().mo14827f()) ? "Fire OS" : APSAnalytics.OS_NAME).mo14942a("AppLovin SDK Version", AppLovinSdk.VERSION).mo14942a("Plugin Version", this.f3746a.mo14534a(C1867b.f3308dz)).mo14942a("Ad Review Version", C1883e.m4176a()).mo14942a("App Package Name", context.getPackageName()).mo14942a("Device", Build.DEVICE).mo14942a("OS Version", Build.VERSION.RELEASE).mo14942a("AppLovin Random Token", this.f3746a.mo14585o()).mo14936a(m4573g());
        Intent intent = new Intent("android.intent.action.SEND").setType("text/plain").putExtra("android.intent.extra.SUBJECT", "MAX Ad Report").setPackage("com.google.android.gm");
        if (this.f3747b instanceof C1839e) {
            intent.putExtra("android.intent.extra.SUBJECT", "AppLovin Ad Report");
            JSONObject originalFullResponse = ((C1839e) this.f3747b).getOriginalFullResponse();
            Uri cacheTextWithFileName = AppLovinContentProviderUtils.cacheTextWithFileName(originalFullResponse.toString(), "ad_response.json");
            if (cacheTextWithFileName != null) {
                intent.putExtra("android.intent.extra.STREAM", cacheTextWithFileName);
            } else {
                kVar.mo14941a("\nAd Response:\n");
                kVar.mo14941a(originalFullResponse.toString());
            }
        }
        intent.putExtra("android.intent.extra.TEXT", kVar.toString());
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            intent.setPackage((String) null);
            context.startActivity(intent);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m4570d() {
        if (this.f3746a.mo14555ae().mo14870b() && this.f3748c.get() == null) {
            Activity a = this.f3746a.mo14556af().mo14045a();
            if (a == null) {
                C2102v A = this.f3746a.mo14509A();
                A.mo15016e("AppLovinSdk", "Failed to display creative debugger button for ad: " + this.f3747b);
                return;
            }
            View findViewById = a.findViewById(16908290);
            if (findViewById instanceof FrameLayout) {
                if (C2102v.m5104a()) {
                    C2102v A2 = this.f3746a.mo14509A();
                    A2.mo15012b("AppLovinSdk", "Displaying creative debugger button for ad: " + this.f3747b);
                }
                final FrameLayout frameLayout = (FrameLayout) findViewById;
                final View a2 = m4564a(a);
                frameLayout.addView(a2);
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(150);
                a2.startAnimation(alphaAnimation);
                findViewById.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                    public void onGlobalLayout() {
                        if (a2.getParent() == null) {
                            frameLayout.addView(a2);
                        }
                    }
                });
                this.f3748c = new WeakReference<>(a2);
            }
        }
    }

    /* renamed from: e */
    private Drawable m4571e() {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(Color.rgb(5, 131, 170));
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(Color.rgb(2, 98, 127));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        return stateListDrawable;
    }

    /* renamed from: f */
    private String m4572f() {
        C2088k kVar = new C2088k();
        Object obj = this.f3747b;
        if (obj instanceof C1839e) {
            C1839e eVar = (C1839e) obj;
            kVar.mo14942a("Network", "APPLOVIN").mo14939a(eVar).mo14944b(eVar);
        } else if (obj instanceof C1583a) {
            kVar.mo14938a((C1583a) obj);
        }
        kVar.mo14940a(this.f3746a);
        kVar.mo14936a(m4573g());
        return kVar.toString();
    }

    /* renamed from: g */
    private Bundle m4573g() {
        Bundle b = this.f3746a.mo14510B().mo14360b(Utils.getCurrentAdServeId(this.f3747b));
        if (b == null) {
            return null;
        }
        for (String str : b.keySet()) {
            Object obj = b.get(str);
            b.remove(str);
            BundleUtils.put(StringUtils.toHumanReadableString(str), obj, b);
        }
        return b;
    }

    /* renamed from: a */
    public void mo14603a() {
        C2051i iVar = this.f3749d;
        if (iVar != null) {
            iVar.mo14898b();
        }
        this.f3747b = null;
        this.f3748c = new WeakReference<>((Object) null);
    }

    /* renamed from: a */
    public void mo14604a(Object obj) {
        if (!C1655c.m3376b(obj)) {
            this.f3747b = obj;
            if (((Boolean) this.f3746a.mo14534a(C1867b.f3160bH)).booleanValue() && this.f3746a.mo14586p().isCreativeDebuggerEnabled()) {
                if (this.f3749d == null) {
                    this.f3749d = new C2051i(this.f3746a, this);
                }
                this.f3749d.mo14897a();
            }
        }
    }

    /* renamed from: b */
    public void mo14605b() {
        if (this.f3751f == 0) {
            this.f3750e = C2092o.m5058a(TimeUnit.SECONDS.toMillis(3), this.f3746a, new Runnable() {
                public void run() {
                    int unused = C1975n.this.f3751f = 0;
                }
            });
        }
        int i = this.f3751f;
        if (i % 2 == 0) {
            this.f3751f = i + 1;
        }
    }

    /* renamed from: c */
    public void mo14606c() {
        int i = this.f3751f;
        if (i % 2 == 1) {
            this.f3751f = i + 1;
        }
        if (this.f3751f / 2 == 2) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    C1975n.this.m4570d();
                }
            });
            this.f3751f = 0;
            this.f3750e.mo14976d();
            this.f3749d.mo14898b();
        }
    }
}
