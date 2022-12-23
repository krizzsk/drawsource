package com.applovin.impl.sdk.p048a;

import android.content.Context;
import android.util.Log;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.p051c.C1867b;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.C2271R;
import com.facebook.internal.AnalyticsEvents;
import com.iab.omid.library.applovin.Omid;
import com.iab.omid.library.applovin.ScriptInjector;
import com.iab.omid.library.applovin.adsession.Partner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* renamed from: com.applovin.impl.sdk.a.f */
public class C1811f {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C1969m f2893a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final Context f2894b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public String f2895c;

    public C1811f(C1969m mVar) {
        this.f2893a = mVar;
        this.f2894b = mVar.mo14520L();
    }

    /* renamed from: a */
    public String mo14083a(String str) {
        try {
            return ScriptInjector.injectScriptContentIntoHtml(this.f2895c, str);
        } catch (Throwable th) {
            if (C2102v.m5104a()) {
                this.f2893a.mo14509A().mo15013b("OpenMeasurementService", "Failed to inject JavaScript SDK into HTML", th);
            }
            return str;
        }
    }

    /* renamed from: a */
    public void mo14084a() {
        if (((Boolean) this.f2893a.mo14534a(C1867b.f3142aq)).booleanValue()) {
            if (C2102v.m5104a()) {
                C2102v A = this.f2893a.mo14509A();
                A.mo15012b("OpenMeasurementService", "Initializing Open Measurement SDK v" + mo14086c() + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    long currentTimeMillis = System.currentTimeMillis();
                    Omid.activate(C1811f.this.f2894b);
                    if (C2102v.m5104a()) {
                        C2102v A = C1811f.this.f2893a.mo14509A();
                        StringBuilder sb = new StringBuilder();
                        sb.append("Init ");
                        sb.append(C1811f.this.mo14085b() ? AnalyticsEvents.PARAMETER_SHARE_OUTCOME_SUCCEEDED : "failed");
                        sb.append(" and took ");
                        sb.append(System.currentTimeMillis() - currentTimeMillis);
                        sb.append("ms");
                        A.mo15012b("OpenMeasurementService", sb.toString());
                    }
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(C1811f.this.f2894b.getResources().openRawResource(C2271R.raw.omsdk_v_1_0)));
                        try {
                            StringBuilder sb2 = new StringBuilder();
                            while (true) {
                                String readLine = bufferedReader.readLine();
                                if (readLine != null) {
                                    sb2.append(readLine);
                                } else {
                                    String unused = C1811f.this.f2895c = sb2.toString();
                                    try {
                                        bufferedReader.close();
                                        return;
                                    } catch (IOException e) {
                                        Log.e("OpenMeasurementService", "Failed to close the BufferReader for reading JavaScript Open Measurement SDK", e);
                                        return;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e2) {
                                Log.e("OpenMeasurementService", "Failed to close the BufferReader for reading JavaScript Open Measurement SDK", e2);
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        if (C2102v.m5104a()) {
                            C1811f.this.f2893a.mo14509A().mo15013b("OpenMeasurementService", "Failed to retrieve resource omskd_v_1_0.js", th2);
                        }
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public boolean mo14085b() {
        return Omid.isActive();
    }

    /* renamed from: c */
    public String mo14086c() {
        return Omid.getVersion();
    }

    /* renamed from: d */
    public Partner mo14087d() {
        return Partner.createPartner((String) this.f2893a.mo14534a(C1867b.f3143ar), AppLovinSdk.VERSION);
    }

    /* renamed from: e */
    public String mo14088e() {
        return this.f2895c;
    }
}
