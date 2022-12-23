package com.bytedance.sdk.openadsdk.p128b.p130b.p131a;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bykv.p054vk.openvk.component.video.api.p070b.C2398a;
import com.bykv.p054vk.openvk.component.video.api.p071c.C2400b;
import com.bykv.p054vk.openvk.component.video.api.p071c.C2401c;
import com.bytedance.sdk.component.utils.C2905l;
import com.bytedance.sdk.openadsdk.CacheDirFactory;
import com.bytedance.sdk.openadsdk.core.p149e.C3431n;
import com.bytedance.sdk.openadsdk.p128b.C3090e;
import com.bytedance.sdk.openadsdk.p128b.C3100j;
import com.bytedance.sdk.openadsdk.p128b.p129a.C3063a;
import com.bytedance.sdk.openadsdk.p128b.p130b.p132b.C3070a;
import com.bytedance.sdk.openadsdk.p128b.p130b.p132b.C3071b;
import com.bytedance.sdk.openadsdk.p128b.p130b.p132b.C3073d;
import com.bytedance.sdk.openadsdk.p128b.p130b.p132b.C3074e;
import com.bytedance.sdk.openadsdk.p128b.p130b.p132b.C3075f;
import com.bytedance.sdk.openadsdk.p128b.p130b.p132b.C3076g;
import com.bytedance.sdk.openadsdk.p128b.p130b.p132b.C3077h;
import com.bytedance.sdk.openadsdk.p128b.p130b.p132b.C3078i;
import com.bytedance.sdk.openadsdk.p128b.p130b.p132b.C3079j;
import com.bytedance.sdk.openadsdk.p128b.p130b.p132b.C3080k;
import com.bytedance.sdk.openadsdk.p128b.p130b.p132b.C3081l;
import com.bytedance.sdk.openadsdk.p128b.p130b.p132b.C3082m;
import com.bytedance.sdk.openadsdk.p128b.p130b.p132b.C3083n;
import com.bytedance.sdk.openadsdk.p128b.p130b.p132b.C3084o;
import com.bytedance.sdk.openadsdk.p170h.C3750a;
import com.bytedance.sdk.openadsdk.p170h.C3753b;
import com.bytedance.sdk.openadsdk.p170h.p171a.C3751a;
import com.bytedance.sdk.openadsdk.p170h.p171a.C3752b;
import com.bytedance.sdk.openadsdk.p178l.C3885n;
import com.bytedance.sdk.openadsdk.p178l.C3898x;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.sdk.openadsdk.b.b.a.a */
/* compiled from: VideoEventManager */
public class C3067a {

    /* renamed from: a */
    private static final Map<C2398a, C3084o> f7168a = Collections.synchronizedMap(new WeakHashMap());

    /* renamed from: a */
    public static JSONObject m8764a(C3431n nVar, String str, int i, int i2) {
        C2400b J;
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("session_id", str);
            }
            if (i > 0) {
                jSONObject.put("play_type", String.valueOf(i));
            }
            if (!(nVar == null || (J = nVar.mo19517J()) == null)) {
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_RESOLUTION, J.mo15949g());
                jSONObject.put(CampaignEx.JSON_KEY_VIDEO_SIZE, Long.valueOf(J.mo15943e()));
                jSONObject.put("video_url", J.mo15953i());
                jSONObject.put("player_type", i2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static void m8768a(C3070a<C3080k> aVar) {
        m8769a((C3070a) aVar, "load_video_start");
    }

    /* renamed from: b */
    public static void m8778b(C3070a<C3081l> aVar) {
        m8769a((C3070a) aVar, "load_video_success");
    }

    /* renamed from: c */
    public static void m8781c(C3070a<C3079j> aVar) {
        m8769a((C3070a) aVar, "load_video_error");
    }

    /* renamed from: d */
    public static void m8784d(C3070a<C3078i> aVar) {
        m8769a((C3070a) aVar, "load_video_cancel");
    }

    /* renamed from: a */
    public static void m8773a(C3431n nVar, C2398a aVar, C2401c cVar) {
        if (nVar != null && aVar != null && cVar != null) {
            String a = C3885n.m12675a();
            boolean z = true;
            int i = CacheDirFactory.getICacheDir(nVar.mo19560aD()).mo15663a(cVar) ? 1 : 2;
            f7168a.put(aVar, new C3084o(SystemClock.elapsedRealtime(), a, i, cVar, nVar));
            C3070a aVar2 = new C3070a(nVar, C3898x.m12754a(nVar), m8764a(nVar, a, i, cVar.mo15993l()), null);
            if (cVar.mo15993l() != -1) {
                z = false;
            }
            aVar2.mo18584a(z);
            m8769a(aVar2, "play_start");
        }
    }

    /* renamed from: a */
    public static void m8765a(Context context, C2398a aVar, C3084o.C3085a aVar2, C3100j jVar) {
        C3084o oVar;
        if (context != null && aVar != null && aVar2 != null && (oVar = f7168a.get(aVar)) != null) {
            C2401c d = oVar.mo18628d();
            C3431n e = oVar.mo18629e();
            if (d != null && e != null) {
                if (!aVar2.mo18651l()) {
                    m8774a(e, d, aVar2);
                }
                C3077h hVar = new C3077h();
                hVar.mo18605a(aVar2.mo18652m() ? 1 : 0);
                hVar.mo18607b(CacheDirFactory.getICacheDir(e.mo19560aD()).mo15664b(d));
                hVar.mo18606a(SystemClock.elapsedRealtime() - oVar.mo18625a());
                C3070a aVar3 = new C3070a(e, C3898x.m12754a(e), m8764a(e, oVar.mo18626b(), oVar.mo18627c(), d.mo15993l()), hVar);
                aVar3.mo18584a(aVar2.mo18651l());
                m8770a(aVar3, "feed_play", jVar);
            }
        }
    }

    /* renamed from: a */
    public static void m8766a(C2398a aVar, C3084o.C3085a aVar2) {
        C3084o oVar;
        if (aVar != null && aVar2 != null && (oVar = f7168a.get(aVar)) != null) {
            C2401c d = oVar.mo18628d();
            C3431n e = oVar.mo18629e();
            if (d != null && e != null) {
                long a = aVar2.mo18630a();
                long c = aVar2.mo18637c();
                if (c > 0 && a > 0) {
                    C3076g gVar = new C3076g();
                    gVar.mo18603a(aVar2.mo18634b());
                    gVar.mo18604b(c);
                    C3070a aVar3 = new C3070a(e, C3898x.m12754a(e), m8764a(e, oVar.mo18626b(), oVar.mo18627c(), d.mo15993l()), gVar);
                    aVar3.mo18584a(aVar2.mo18651l());
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("duration", a);
                        jSONObject.put("percent", aVar2.mo18647h());
                        m8771a(aVar3, "feed_pause", jSONObject);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public static void m8776b(C2398a aVar, C3084o.C3085a aVar2) {
        C3084o oVar;
        if (aVar != null && aVar2 != null && (oVar = f7168a.get(aVar)) != null) {
            C2401c d = oVar.mo18628d();
            C3431n e = oVar.mo18629e();
            if (d != null && e != null) {
                long a = aVar2.mo18630a();
                long c = aVar2.mo18637c();
                if (c > 0 && a > 0) {
                    C3074e eVar = new C3074e();
                    eVar.mo18598a(aVar2.mo18634b());
                    eVar.mo18599b(c);
                    C3070a aVar3 = new C3070a(e, C3898x.m12754a(e), m8764a(e, oVar.mo18626b(), oVar.mo18627c(), d.mo15993l()), eVar);
                    aVar3.mo18584a(aVar2.mo18651l());
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("duration", a);
                        jSONObject.put("percent", aVar2.mo18647h());
                        m8771a(aVar3, "feed_continue", jSONObject);
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public static void m8780c(C2398a aVar, C3084o.C3085a aVar2) {
        C3084o oVar;
        if (aVar != null && aVar2 != null && (oVar = f7168a.get(aVar)) != null) {
            C2401c d = oVar.mo18628d();
            C3431n e = oVar.mo18629e();
            if (d != null && e != null) {
                long a = aVar2.mo18630a();
                long c = aVar2.mo18637c();
                C3083n nVar = new C3083n();
                nVar.mo18622a(aVar2.mo18634b());
                nVar.mo18624b(c);
                nVar.mo18621a(aVar2.mo18640d());
                nVar.mo18623b(aVar2.mo18642e());
                C3070a aVar3 = new C3070a(e, C3898x.m12754a(e), m8764a(e, oVar.mo18626b(), oVar.mo18627c(), d.mo15993l()), nVar);
                aVar3.mo18584a(aVar2.mo18651l());
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", a);
                    jSONObject.put("percent", aVar2.mo18647h());
                    m8771a(aVar3, "play_error", jSONObject);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    /* renamed from: d */
    public static void m8783d(C2398a aVar, C3084o.C3085a aVar2) {
        C3084o oVar;
        if (aVar != null && aVar2 != null && (oVar = f7168a.get(aVar)) != null) {
            C2401c d = oVar.mo18628d();
            C3431n e = oVar.mo18629e();
            if (d != null && e != null) {
                long a = aVar2.mo18630a();
                long c = aVar2.mo18637c();
                C3071b bVar = new C3071b();
                bVar.mo18590a(aVar2.mo18634b());
                bVar.mo18593b(c);
                bVar.mo18589a(aVar2.mo18644f());
                bVar.mo18592b(aVar2.mo18646g());
                C3070a aVar3 = new C3070a(e, C3898x.m12754a(e), m8764a(e, oVar.mo18626b(), oVar.mo18627c(), d.mo15993l()), bVar);
                aVar3.mo18584a(aVar2.mo18651l());
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", a);
                    jSONObject.put("percent", aVar2.mo18647h());
                    m8771a(aVar3, "endcard_skip", jSONObject);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                f7168a.remove(aVar);
            }
        }
    }

    /* renamed from: a */
    public static void m8767a(C2398a aVar, C3084o.C3085a aVar2, C3100j jVar) {
        C3084o oVar;
        if (aVar != null && aVar2 != null && (oVar = f7168a.get(aVar)) != null) {
            C2401c d = oVar.mo18628d();
            C3431n e = oVar.mo18629e();
            if (d != null && e != null) {
                long a = aVar2.mo18630a();
                long c = aVar2.mo18637c();
                C3073d dVar = new C3073d();
                dVar.mo18597b(aVar2.mo18634b());
                dVar.mo18595a(c);
                dVar.mo18594a(aVar2.mo18648i());
                dVar.mo18596b(aVar2.mo18649j());
                C3070a aVar3 = new C3070a(e, C3898x.m12754a(e), m8764a(e, oVar.mo18626b(), oVar.mo18627c(), d.mo15993l()), dVar);
                aVar3.mo18584a(aVar2.mo18651l());
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("duration", a);
                    jSONObject.put("percent", aVar2.mo18647h());
                    m8772a(aVar3, "feed_break", jSONObject, jVar);
                } catch (JSONException e2) {
                    e2.printStackTrace();
                }
                f7168a.remove(aVar);
            }
        }
    }

    /* renamed from: b */
    public static void m8777b(C2398a aVar, C3084o.C3085a aVar2, C3100j jVar) {
        if (aVar != null && aVar2 != null) {
            m8785e(aVar, aVar2);
            C3084o oVar = f7168a.get(aVar);
            if (oVar != null) {
                C2401c d = oVar.mo18628d();
                C3431n e = oVar.mo18629e();
                if (d != null && e != null) {
                    long a = aVar2.mo18630a();
                    long c = aVar2.mo18637c();
                    if (c > 0) {
                        C3075f fVar = new C3075f();
                        fVar.mo18602b(aVar2.mo18634b());
                        fVar.mo18601a(c);
                        fVar.mo18600a(aVar2.mo18649j());
                        C3070a aVar3 = new C3070a(e, C3898x.m12754a(e), m8764a(e, oVar.mo18626b(), oVar.mo18627c(), d.mo15993l()), fVar);
                        aVar3.mo18584a(aVar2.mo18651l());
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("duration", a);
                            jSONObject.put("percent", aVar2.mo18647h());
                            m8772a(aVar3, "feed_over", jSONObject, jVar);
                        } catch (JSONException e2) {
                            e2.printStackTrace();
                        }
                        f7168a.remove(aVar);
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public static void m8785e(C2398a aVar, C3084o.C3085a aVar2) {
        if (aVar != null && aVar2 != null) {
            if (aVar2.mo18650k() <= 0) {
                C2905l.m8114c("VideoEventManager", "Cancel log report when buffer count is 0");
                return;
            }
            C3084o oVar = f7168a.get(aVar);
            if (oVar != null) {
                C2401c d = oVar.mo18628d();
                C3431n e = oVar.mo18629e();
                if (d != null && e != null) {
                    long c = aVar2.mo18637c();
                    if (c > 0) {
                        C3082m mVar = new C3082m();
                        mVar.mo18619a(aVar2.mo18634b());
                        mVar.mo18620b(c);
                        mVar.mo18618a(aVar2.mo18650k());
                        C3070a aVar3 = new C3070a(e, C3898x.m12754a(e), m8764a(e, oVar.mo18626b(), oVar.mo18627c(), d.mo15993l()), mVar);
                        aVar3.mo18584a(aVar2.mo18651l());
                        m8769a(aVar3, "play_buffer");
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m8769a(C3070a aVar, String str) {
        m8772a(aVar, str, (JSONObject) null, (C3100j) null);
    }

    /* renamed from: a */
    private static void m8771a(C3070a aVar, String str, JSONObject jSONObject) {
        m8772a(aVar, str, jSONObject, (C3100j) null);
    }

    /* renamed from: a */
    private static void m8770a(C3070a aVar, String str, C3100j jVar) {
        m8772a(aVar, str, (JSONObject) null, jVar);
    }

    /* renamed from: a */
    private static void m8772a(final C3070a aVar, String str, JSONObject jSONObject, final C3100j jVar) {
        if (aVar != null) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            JSONObject jSONObject2 = jSONObject;
            if (aVar.mo18588e() && !TextUtils.isEmpty(aVar.mo18585b())) {
                String b = aVar.mo18585b();
                char c = 65535;
                int hashCode = b.hashCode();
                if (hashCode != -891990144) {
                    if (hashCode != -712491894) {
                        if (hashCode == 1912999166 && b.equals("draw_ad")) {
                            c = 2;
                        }
                    } else if (b.equals("embeded_ad")) {
                        c = 0;
                    }
                } else if (b.equals("stream")) {
                    c = 1;
                }
                if (c == 0 || c == 1 || c == 2) {
                    str = "customer_" + str;
                }
            }
            final String str2 = str;
            C3090e.m8909a(aVar.mo18583a(), aVar.mo18585b(), str2, jSONObject2, jVar, (C3063a) new C3063a() {
                /* renamed from: a */
                public void mo18580a(JSONObject jSONObject) throws JSONException {
                    C3100j jVar;
                    JSONObject c = aVar.mo18586c();
                    if (aVar.mo18587d() != null) {
                        aVar.mo18587d().mo18591a(c);
                    }
                    if (("feed_play".equals(str2) || "feed_over".equals(str2) || "feed_break".equals(str2)) && (jVar = jVar) != null) {
                        jVar.mo18679a(c);
                    }
                    jSONObject.put("ad_extra_data", c.toString());
                }
            });
        }
    }

    /* renamed from: a */
    private static void m8774a(final C3431n nVar, final C2401c cVar, final C3084o.C3085a aVar) {
        C3753b.m12287a().mo20569a((C3750a) new C3750a() {
            /* renamed from: a */
            public C3751a mo18582a() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("service_duration", C3067a.m8779c(cVar));
                jSONObject.put("player_duration", aVar.mo18637c());
                jSONObject.put("cache_path_type", CacheDirFactory.getCacheType());
                jSONObject.put("url", cVar.mo15991j());
                jSONObject.put("path", C3067a.m8782d(cVar));
                jSONObject.put("player_type", cVar.mo15993l());
                return C3752b.m12257b().mo20544a("pangle_video_play_state").mo20542a(C3898x.m12790e(nVar)).mo20546b(jSONObject.toString());
            }
        });
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static long m8779c(C2401c cVar) {
        if (cVar == null) {
            return 0;
        }
        C2400b r = cVar.mo15990i() ? cVar.mo15999r() : cVar.mo15998q();
        if (r != null) {
            return Double.valueOf(r.mo15946f() * 1000.0d).longValue();
        }
        return 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static String m8782d(C2401c cVar) {
        return new File(cVar.mo15966a(), cVar.mo15992k()).getAbsolutePath();
    }
}
