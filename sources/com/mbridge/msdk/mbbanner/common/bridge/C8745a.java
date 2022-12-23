package com.mbridge.msdk.mbbanner.common.bridge;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.C8467l;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p298db.C8412f;
import com.mbridge.msdk.foundation.p298db.C8414g;
import com.mbridge.msdk.foundation.p298db.C8417j;
import com.mbridge.msdk.foundation.p298db.C8422o;
import com.mbridge.msdk.foundation.same.p300a.C8473d;
import com.mbridge.msdk.foundation.tools.C8633c;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.foundation.tools.C8675y;
import com.mbridge.msdk.mbbanner.common.p324b.C8733a;
import com.mbridge.msdk.mbbanner.common.p326d.C8767a;
import com.mbridge.msdk.mbsignalcommon.communication.C8867a;
import com.mbridge.msdk.mbsignalcommon.communication.C8868b;
import com.mbridge.msdk.mbsignalcommon.windvane.C8887g;
import com.mbridge.msdk.p078c.C2445b;
import com.mbridge.msdk.p078c.C2456d;
import com.mbridge.msdk.videocommon.download.C9652g;
import com.smaato.sdk.richmedia.mraid.bridge.MraidJsMethods;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.mbbanner.common.bridge.a */
/* compiled from: BannerSignalCommunicationImpl */
public final class C8745a extends C8867a {

    /* renamed from: b */
    private WeakReference<Context> f21464b;

    /* renamed from: c */
    private List<CampaignEx> f21465c;

    /* renamed from: d */
    private String f21466d;

    /* renamed from: e */
    private String f21467e;

    /* renamed from: f */
    private int f21468f;

    /* renamed from: g */
    private C8733a f21469g;

    /* renamed from: h */
    private BannerExpandDialog f21470h;

    /* renamed from: i */
    private boolean f21471i = false;

    public C8745a(Context context, String str, String str2) {
        this.f21466d = str;
        this.f21467e = str2;
        this.f21464b = new WeakReference<>(context);
    }

    /* renamed from: a */
    public final void mo58381a(C8733a aVar) {
        if (aVar != null) {
            this.f21469g = aVar;
        }
    }

    /* renamed from: a */
    public final void mo58383a(List<CampaignEx> list) {
        this.f21465c = list;
    }

    /* renamed from: a */
    public final void mo58380a(int i) {
        this.f21468f = i;
    }

    /* renamed from: a */
    public final void mo58379a() {
        if (this.f21469g != null) {
            this.f21469g = null;
        }
        if (this.f21470h != null) {
            this.f21470h = null;
        }
    }

    /* renamed from: c */
    public final void mo58385c(Object obj, String str) {
        if (obj != null) {
            try {
                int optInt = new JSONObject(str).optInt("isReady", 1);
                C8887g.m25669a().mo58688a(obj, C8868b.m25602a(0));
                if (this.f21469g != null) {
                    this.f21469g.mo58370b(optInt);
                }
            } catch (Throwable th) {
                C8672v.m24875a("BannerSignalCommunicationImpl", "readyStatus", th);
            }
        }
    }

    /* renamed from: a */
    public final void mo58382a(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            C8633c cVar = new C8633c(C8388a.m23845e().mo56913g());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("dev_close_state", this.f21468f);
            jSONObject.put("sdkSetting", jSONObject2);
            jSONObject.put("device", cVar.mo58124a());
            jSONObject.put("campaignList", CampaignEx.parseCamplistToJson(this.f21465c));
            C2456d e = C2445b.m6020a().mo16292e(C8388a.m23845e().mo56914h(), this.f21467e);
            if (e == null) {
                e = C2456d.m6070d(this.f21467e);
            }
            if (!TextUtils.isEmpty(this.f21466d)) {
                e.mo16317g(this.f21466d);
            }
            jSONObject.put("unitSetting", e.mo16328s());
            String c = C2445b.m6020a().mo16289c(C8388a.m23845e().mo56914h());
            if (!TextUtils.isEmpty(c)) {
                jSONObject.put("appSetting", new JSONObject(c));
            }
            C8887g.m25669a().mo58688a(obj, Base64.encodeToString(jSONObject.toString().getBytes(), 2));
        } catch (Throwable th) {
            C8672v.m24875a("BannerSignalCommunicationImpl", "init", th);
        }
    }

    /* renamed from: b */
    public final void mo58384b(Object obj, String str) {
        C8672v.m24878d("BannerSignalCommunicationImpl", "click");
        try {
            if (this.f21465c != null && !TextUtils.isEmpty(str)) {
                CampaignEx parseCampaignWithBackData = CampaignEx.parseCampaignWithBackData(new JSONObject(str).getJSONObject("pt"));
                if (this.f21469g != null) {
                    this.f21469g.mo58366a(parseCampaignWithBackData);
                }
            }
        } catch (Throwable th) {
            C8672v.m24875a("BannerSignalCommunicationImpl", "click", th);
        }
    }

    /* renamed from: d */
    public final void mo58386d(Object obj, String str) {
        C8672v.m24878d("BannerSignalCommunicationImpl", "toggleCloseBtn");
        try {
            if (!TextUtils.isEmpty(str)) {
                int optInt = new JSONObject(str).optInt("state");
                if (this.f21469g != null) {
                    this.f21469g.mo58365a(optInt);
                }
            }
        } catch (Throwable th) {
            C8672v.m24875a("BannerSignalCommunicationImpl", "toggleCloseBtn", th);
        }
    }

    /* renamed from: e */
    public final void mo58387e(Object obj, String str) {
        C8672v.m24878d("BannerSignalCommunicationImpl", "triggerCloseBtn");
        try {
            if (!TextUtils.isEmpty(str)) {
                String optString = new JSONObject(str).optString("state");
                if (this.f21469g != null) {
                    this.f21469g.mo58367a(optString);
                }
                C8887g.m25669a().mo58688a(obj, C8868b.m25602a(0));
            }
        } catch (Throwable th) {
            C8672v.m24875a("BannerSignalCommunicationImpl", "triggerCloseBtn", th);
            C8887g.m25669a().mo58688a(obj, C8868b.m25602a(-1));
        }
    }

    /* renamed from: i */
    public final void mo58388i(Object obj, String str) {
        C8672v.m24874a("BannerSignalCommunicationImpl", "sendImpressions:" + str);
        try {
            if (!TextUtils.isEmpty(str)) {
                JSONArray jSONArray = new JSONArray(str);
                final ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    String string = jSONArray.getString(i);
                    for (CampaignEx next : this.f21465c) {
                        if (next.getId().equals(string)) {
                            C8473d.m24279a(this.f21467e, next, "banner");
                            arrayList.add(string);
                        }
                    }
                }
                new Thread(new Runnable() {
                    public final void run() {
                        try {
                            C8417j a = C8417j.m23986a((C8412f) C8414g.m23969a(C8388a.m23845e().mo56913g()));
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                a.mo57032b((String) it.next());
                            }
                        } catch (Exception e) {
                            C8672v.m24878d("BannerSignalCommunicationImpl", e.getMessage());
                        }
                    }
                }).start();
            }
        } catch (Throwable th) {
            C8672v.m24875a("BannerSignalCommunicationImpl", "sendImpressions", th);
        }
    }

    public final void open(String str) {
        C8672v.m24878d("BannerSignalCommunicationImpl", "open");
        try {
            C8672v.m24878d("BannerSignalCommunicationImpl", str);
            if (this.f21465c.size() > 1) {
                C8388a.m23845e().mo56913g().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                str = null;
            }
            if (this.f21469g != null) {
                this.f21469g.mo58369a(true, str);
            }
        } catch (Throwable th) {
            C8672v.m24875a("BannerSignalCommunicationImpl", "open", th);
        }
    }

    public final void close() {
        C8672v.m24878d("BannerSignalCommunicationImpl", "close");
        try {
            if (this.f21469g != null) {
                this.f21469g.mo58364a();
            }
        } catch (Throwable th) {
            C8672v.m24875a("BannerSignalCommunicationImpl", "close", th);
        }
    }

    public final void unload() {
        close();
    }

    public final CampaignEx getMraidCampaign() {
        List<CampaignEx> list = this.f21465c;
        if (list == null || list.size() <= 0) {
            return null;
        }
        return this.f21465c.get(0);
    }

    public final void useCustomClose(boolean z) {
        int i = z ? 2 : 1;
        try {
            if (this.f21469g != null) {
                this.f21469g.mo58365a(i);
            }
        } catch (Throwable th) {
            C8672v.m24875a("BannerSignalCommunicationImpl", "useCustomClose", th);
        }
    }

    public final void expand(String str, boolean z) {
        Context context;
        String str2 = "";
        try {
            if (getMraidCampaign() != null) {
                if (TextUtils.isEmpty(getMraidCampaign().getBannerHtml())) {
                    str2 = getMraidCampaign().getBannerUrl();
                } else {
                    str2 = "file:////" + getMraidCampaign().getBannerHtml();
                }
            }
            Bundle bundle = new Bundle();
            if (!TextUtils.isEmpty(str)) {
                str2 = str;
            }
            bundle.putString("url", str2);
            bundle.putBoolean("shouldUseCustomClose", z);
            if (!(this.f21464b == null || (context = (Context) this.f21464b.get()) == null)) {
                if (this.f21470h == null || !this.f21470h.isShowing()) {
                    BannerExpandDialog bannerExpandDialog = new BannerExpandDialog(context, bundle, this.f21469g);
                    this.f21470h = bannerExpandDialog;
                    bannerExpandDialog.setCampaignList(this.f21467e, this.f21465c);
                    this.f21470h.show();
                } else {
                    return;
                }
            }
            if (this.f21469g != null) {
                this.f21469g.mo58368a(true);
            }
            C8767a.m25293a(this.f21467e, getMraidCampaign(), str);
        } catch (Throwable th) {
            C8672v.m24875a("BannerSignalCommunicationImpl", MraidJsMethods.EXPAND, th);
        }
    }

    /* renamed from: j */
    public final void mo58389j(Object obj, String str) {
        if (TextUtils.isEmpty(str)) {
            C8868b.m25603a(obj, "params is empty");
            return;
        }
        try {
            m25196a(obj, new JSONObject(str));
        } catch (Throwable th) {
            C8672v.m24874a("BannerSignalCommunicationImpl", th.getMessage());
        }
    }

    /* renamed from: a */
    private static void m25196a(Object obj, JSONObject jSONObject) {
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        boolean z;
        String str5;
        String str6;
        String str7;
        Object obj2 = obj;
        JSONObject jSONObject2 = jSONObject;
        JSONObject jSONObject3 = new JSONObject();
        String str8 = "message";
        String str9 = "code";
        int i2 = 1;
        if (jSONObject2 == null) {
            try {
                jSONObject3.put(str9, 1);
                jSONObject3.put(str8, "params is null");
                C8887g.m25669a().mo58688a(obj2, Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
            } catch (JSONException e) {
                C8672v.m24874a("BannerSignalCommunicationImpl", e.getMessage());
            }
        } else {
            try {
                jSONObject3.put(str9, 0);
                jSONObject3.put(str8, "");
                JSONArray jSONArray = jSONObject2.getJSONArray("resource");
                if (jSONArray == null || jSONArray.length() <= 0) {
                    str3 = str8;
                    str2 = str9;
                    try {
                        jSONObject3.put(str2, 1);
                        str = str3;
                        try {
                            jSONObject3.put(str, "resource is null");
                            C8887g.m25669a().mo58688a(obj2, Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
                        } catch (JSONException e2) {
                            e = e2;
                        }
                    } catch (JSONException e3) {
                        e = e3;
                        str = str3;
                        try {
                            C8672v.m24874a("BannerSignalCommunicationImpl", e.getMessage());
                        } catch (Throwable th) {
                            th = th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        str = str3;
                        try {
                            jSONObject3.put(str2, 1);
                            jSONObject3.put(str, th.getLocalizedMessage());
                            C8887g.m25669a().mo58688a(obj2, Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
                        } catch (JSONException e4) {
                            C8672v.m24874a("BannerSignalCommunicationImpl", e4.getMessage());
                        }
                    }
                } else {
                    JSONArray jSONArray2 = new JSONArray();
                    int length = jSONArray.length();
                    int i3 = 0;
                    while (i3 < length) {
                        JSONObject jSONObject4 = jSONArray.getJSONObject(i3);
                        String optString = jSONObject4.optString("ref", "");
                        int i4 = jSONObject4.getInt("type");
                        JSONObject jSONObject5 = new JSONObject();
                        JSONArray jSONArray3 = jSONArray;
                        if (i4 == i2) {
                            if (!TextUtils.isEmpty(optString)) {
                                JSONObject jSONObject6 = new JSONObject();
                                C8467l a = C8422o.m24014a((C8412f) C8414g.m23969a(C8388a.m23845e().mo56913g())).mo57050a(optString);
                                if (a != null) {
                                    i = length;
                                    C8672v.m24874a("BannerSignalCommunicationImpl", "VideoBean not null");
                                    jSONObject6.put("type", 1);
                                    str3 = str8;
                                    try {
                                        jSONObject6.put("videoDataLength", a.mo57812c());
                                        String e5 = a.mo57814e();
                                        str4 = str9;
                                        if (TextUtils.isEmpty(e5)) {
                                            C8672v.m24874a("BannerSignalCommunicationImpl", "VideoPath null");
                                            jSONObject6.put("path", "");
                                            jSONObject6.put("path4Web", "");
                                        } else {
                                            C8672v.m24874a("BannerSignalCommunicationImpl", "VideoPath not null");
                                            jSONObject6.put("path", e5);
                                            jSONObject6.put("path4Web", e5);
                                        }
                                        if (a.mo57813d() == 5) {
                                            jSONObject6.put("downloaded", 1);
                                            z = false;
                                        } else {
                                            z = false;
                                            jSONObject6.put("downloaded", 0);
                                        }
                                        jSONObject5.put(optString, jSONObject6);
                                        jSONArray2.put(jSONObject5);
                                    } catch (Throwable th3) {
                                        th = th3;
                                        str = str3;
                                        str2 = str4;
                                        jSONObject3.put(str2, 1);
                                        jSONObject3.put(str, th.getLocalizedMessage());
                                        C8887g.m25669a().mo58688a(obj2, Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
                                    }
                                } else {
                                    str3 = str8;
                                    str4 = str9;
                                    i = length;
                                    z = false;
                                    C8672v.m24874a("BannerSignalCommunicationImpl", "VideoBean null");
                                }
                                i3++;
                                jSONArray = jSONArray3;
                                boolean z2 = z;
                                length = i;
                                str8 = str3;
                                str9 = str4;
                                i2 = 1;
                            }
                        }
                        str3 = str8;
                        str4 = str9;
                        i = length;
                        z = false;
                        if (i4 == 2 && !TextUtils.isEmpty(optString)) {
                            JSONObject jSONObject7 = new JSONObject();
                            jSONObject7.put("type", 2);
                            if (C9652g.m27539a().mo63668a(optString) == null) {
                                str7 = "";
                            } else {
                                str7 = C9652g.m27539a().mo63670b(optString);
                            }
                            jSONObject7.put("path", str7);
                            jSONObject5.put(optString, jSONObject7);
                            jSONArray2.put(jSONObject5);
                            i3++;
                            jSONArray = jSONArray3;
                            boolean z22 = z;
                            length = i;
                            str8 = str3;
                            str9 = str4;
                            i2 = 1;
                        } else if (i4 != 3 || TextUtils.isEmpty(optString)) {
                            if (i4 == 4 && !TextUtils.isEmpty(optString)) {
                                JSONObject jSONObject8 = new JSONObject();
                                jSONObject8.put("type", 4);
                                if (C8675y.m24893a(optString) == null) {
                                    str5 = "";
                                } else {
                                    str5 = C8675y.m24893a(optString);
                                }
                                jSONObject8.put("path", str5);
                                jSONObject5.put(optString, jSONObject8);
                                jSONArray2.put(jSONObject5);
                            }
                            i3++;
                            jSONArray = jSONArray3;
                            boolean z222 = z;
                            length = i;
                            str8 = str3;
                            str9 = str4;
                            i2 = 1;
                        } else {
                            try {
                                File file = new File(optString);
                                if (file.exists() && file.isFile() && file.canRead()) {
                                    C8672v.m24874a("BannerSignalCommunicationImpl", "getFileInfo Mraid file " + optString);
                                    str6 = "file:////" + optString;
                                    JSONObject jSONObject9 = new JSONObject();
                                    jSONObject9.put("type", 3);
                                    jSONObject9.put("path", str6);
                                    jSONObject5.put(optString, jSONObject9);
                                    jSONArray2.put(jSONObject5);
                                    i3++;
                                    jSONArray = jSONArray3;
                                    boolean z2222 = z;
                                    length = i;
                                    str8 = str3;
                                    str9 = str4;
                                    i2 = 1;
                                }
                            } catch (Throwable th4) {
                                if (MBridgeConstans.DEBUG) {
                                    th4.printStackTrace();
                                }
                            }
                            str6 = "";
                            JSONObject jSONObject92 = new JSONObject();
                            jSONObject92.put("type", 3);
                            jSONObject92.put("path", str6);
                            jSONObject5.put(optString, jSONObject92);
                            jSONArray2.put(jSONObject5);
                            i3++;
                            jSONArray = jSONArray3;
                            boolean z22222 = z;
                            length = i;
                            str8 = str3;
                            str9 = str4;
                            i2 = 1;
                        }
                    }
                    String str10 = str8;
                    String str11 = str9;
                    jSONObject3.put("resource", jSONArray2);
                    C8887g.m25669a().mo58688a(obj2, Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
                }
            } catch (Throwable th5) {
                th = th5;
                str = str8;
                str2 = str9;
                jSONObject3.put(str2, 1);
                jSONObject3.put(str, th.getLocalizedMessage());
                C8887g.m25669a().mo58688a(obj2, Base64.encodeToString(jSONObject3.toString().getBytes(), 2));
            }
        }
    }
}
