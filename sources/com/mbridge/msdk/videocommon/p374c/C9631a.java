package com.mbridge.msdk.videocommon.p374c;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C8396b;
import com.mbridge.msdk.foundation.p083a.p084a.C2461a;
import com.mbridge.msdk.foundation.same.net.C8532e;
import com.mbridge.msdk.foundation.same.net.p311f.C8543d;
import com.mbridge.msdk.foundation.same.net.p312g.C8549c;
import com.mbridge.msdk.foundation.same.net.p312g.C8550d;
import com.mbridge.msdk.foundation.same.p305f.C8498b;
import com.mbridge.msdk.foundation.same.report.C8582d;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.videocommon.p375d.C9637a;
import com.mbridge.msdk.videocommon.p375d.C9638b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.videocommon.c.a */
/* compiled from: RewardSettingController */
public class C9631a {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f23917a = C9631a.class.getName();

    /* renamed from: a */
    public final void mo63529a(final Context context, final String str, String str2) {
        C8550d dVar = new C8550d();
        dVar.mo57981a("app_id", str);
        dVar.mo57981a("sign", SameMD5.getMD5(str + str2));
        new C9635b(context).mo57975a(1, C8543d.m24463a().f20969r, dVar, (C8532e) new C8549c() {
            /* renamed from: a */
            public final void mo16305a(JSONObject jSONObject) {
                if (jSONObject != null) {
                    C9638b.m27377a().mo63555a(false);
                    try {
                        jSONObject.put("current_time", System.currentTimeMillis());
                        C9638b.m27377a();
                        String str = str;
                        String jSONObject2 = jSONObject.toString();
                        C2461a.m6124a().mo16388a("reward_" + str, jSONObject2);
                        C9638b.f23937a = C9637a.m27358a(jSONObject2);
                    } catch (JSONException e) {
                        C8672v.m24878d(C9631a.f23917a, e.getMessage());
                    }
                    try {
                        new C8582d(context).mo58061a(1, C8543d.m24463a().f20960i, "", C8543d.m24463a().f20959h ? C8543d.m24463a().f20974w : C8543d.m24463a().f20969r);
                    } catch (Throwable th) {
                        C8672v.m24878d(C9631a.f23917a, th.getMessage());
                    }
                }
            }

            /* renamed from: a */
            public final void mo16304a(String str) {
                C9638b.m27377a().mo63555a(false);
                C8672v.m24878d(C9631a.f23917a, str);
                try {
                    new C8582d(context).mo58061a(2, C8543d.m24463a().f20960i, str, C8543d.m24463a().f20959h ? C8543d.m24463a().f20974w : C8543d.m24463a().f20969r);
                } catch (Throwable th) {
                    C8672v.m24878d(C9631a.f23917a, th.getMessage());
                }
            }
        });
    }

    /* renamed from: a */
    public final void mo63530a(final Context context, final String str, String str2, String str3, final C9636c cVar) {
        C8550d dVar = new C8550d();
        dVar.mo57981a("app_id", str);
        dVar.mo57981a("sign", SameMD5.getMD5(str + str2));
        dVar.mo57981a("unit_ids", "[" + str3 + "]");
        C96332 r5 = new C8549c() {
            /* renamed from: a */
            public final void mo16305a(final JSONObject jSONObject) {
                try {
                    C9638b.m27377a().mo63552a(this.f20918d);
                } catch (Exception unused) {
                }
                if (jSONObject != null) {
                    try {
                        if (C9638b.m27382c(jSONObject.toString())) {
                            jSONObject.put("current_time", System.currentTimeMillis());
                            C96341 r0 = new Runnable() {
                                public final void run() {
                                    C9638b.m27377a().mo63553a(str, C96332.this.f20918d, jSONObject.toString());
                                }
                            };
                            if (C8396b.m23890a().mo56951d()) {
                                C8498b.m24359a().execute(r0);
                            } else {
                                r0.run();
                            }
                            if (cVar != null) {
                                cVar.mo61292a("request success");
                            }
                        } else if (cVar != null) {
                            cVar.mo61293b("data error");
                        }
                    } catch (JSONException e) {
                        e.printStackTrace();
                    }
                    try {
                        new C8582d(context).mo58061a(1, C8543d.m24463a().f20960i, "", C8543d.m24463a().f20959h ? C8543d.m24463a().f20974w : C8543d.m24463a().f20969r);
                    } catch (Throwable th) {
                        C8672v.m24878d(C9631a.f23917a, th.getMessage());
                    }
                }
            }

            /* renamed from: a */
            public final void mo16304a(String str) {
                try {
                    C9638b.m27377a().mo63552a(this.f20918d);
                } catch (Exception unused) {
                }
                if (!TextUtils.isEmpty(str)) {
                    C9636c cVar = cVar;
                    if (cVar != null) {
                        cVar.mo61293b(str);
                    }
                } else {
                    C9636c cVar2 = cVar;
                    if (cVar2 != null) {
                        cVar2.mo61293b("request error");
                    }
                }
                try {
                    new C8582d(context).mo58061a(2, C8543d.m24463a().f20960i, str, C8543d.m24463a().f20959h ? C8543d.m24463a().f20974w : C8543d.m24463a().f20969r);
                } catch (Throwable th) {
                    C8672v.m24878d(C9631a.f23917a, th.getMessage());
                }
            }
        };
        r5.f20918d = str3;
        new C9635b(context).mo57975a(1, C8543d.m24463a().f20969r, dVar, (C8532e) r5);
    }
}
