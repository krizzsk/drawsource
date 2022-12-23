package com.mbridge.msdk.interstitial.signalcommon;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.mbridge.msdk.click.C6779b;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p298db.C8412f;
import com.mbridge.msdk.foundation.p298db.C8414g;
import com.mbridge.msdk.foundation.p298db.C8417j;
import com.mbridge.msdk.foundation.same.net.p312g.C8550d;
import com.mbridge.msdk.foundation.same.p300a.C8473d;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.interstitial.p318b.C8696a;
import com.mbridge.msdk.interstitial.view.MBInterstitialActivity;
import com.mbridge.msdk.mbsignalcommon.windvane.AbsFeedBackForH5;
import com.mbridge.msdk.mbsignalcommon.windvane.C8887g;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.interstitial.signalcommon.interstitial */
public class C8705interstitial extends AbsFeedBackForH5 {

    /* renamed from: d */
    private static final String f21357d = C8705interstitial.class.getName();

    /* renamed from: e */
    private Object f21358e;

    public void getInfo(Object obj, String str) {
        MBInterstitialActivity mBInterstitialActivity;
        try {
            this.f21358e = obj;
            if (this.f21907a == null) {
                m25054a();
                return;
            }
            int a = m25050a(this.f21907a);
            if (TextUtils.isEmpty(m25055b())) {
                m25054a();
            } else if (a == 1) {
                try {
                    if (this.f21907a != null) {
                        if (m25050a(this.f21907a) == 1) {
                            try {
                                MBInterstitialActivity mBInterstitialActivity2 = (MBInterstitialActivity) this.f21907a;
                                if (mBInterstitialActivity2 != null) {
                                    mBInterstitialActivity2.hideLoading();
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                } catch (Exception e2) {
                    try {
                        e2.printStackTrace();
                    } catch (Exception e3) {
                        e3.printStackTrace();
                        m25054a();
                        return;
                    }
                }
                try {
                    if (this.f21907a != null) {
                        if (m25050a(this.f21907a) == 1 && (mBInterstitialActivity = (MBInterstitialActivity) this.f21907a) != null) {
                            mBInterstitialActivity.showWebView();
                        }
                    }
                } catch (Exception e4) {
                    e4.printStackTrace();
                }
                if (this.f21907a == null) {
                    m25054a();
                } else if (m25050a(this.f21907a) != 1) {
                    m25054a();
                } else {
                    if (this.f21907a instanceof MBInterstitialActivity) {
                        ((MBInterstitialActivity) this.f21907a).mIsMBPage = true;
                    }
                    final String b = m25055b();
                    if (TextUtils.isEmpty(b)) {
                        m25054a();
                        return;
                    }
                    final List<CampaignEx> a2 = m25053a(b);
                    if (a2 != null) {
                        String a3 = m25052a(a2);
                        if (TextUtils.isEmpty(a3)) {
                            m25054a();
                            return;
                        }
                        C8887g.m25669a().mo58688a(obj, a3);
                        try {
                            if (!TextUtils.isEmpty(b)) {
                                if (a2 != null) {
                                    if (a2.size() != 0) {
                                        for (int i = 0; i < a2.size(); i++) {
                                            CampaignEx campaignEx = a2.get(i);
                                            if (campaignEx != null) {
                                                C8473d.m24279a(b, campaignEx, "interstitial");
                                            }
                                        }
                                    }
                                }
                            }
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                        try {
                            if (!TextUtils.isEmpty(b)) {
                                if (a2 != null) {
                                    if (a2.size() != 0) {
                                        new Thread(new Runnable() {
                                            public final void run() {
                                                for (int i = 0; i < a2.size(); i++) {
                                                    CampaignEx campaignEx = (CampaignEx) a2.get(i);
                                                    if (campaignEx != null) {
                                                        C8417j.m23986a((C8412f) C8414g.m23969a(C8705interstitial.this.f21907a)).mo57032b(campaignEx.getId());
                                                    }
                                                }
                                            }
                                        }).start();
                                    }
                                }
                            }
                        } catch (Exception e6) {
                            e6.printStackTrace();
                        }
                        try {
                            new Thread(new Runnable() {
                                public final void run() {
                                    C8696a a = C8696a.m25003a();
                                    if (a != null) {
                                        a.mo58215a((List<CampaignEx>) a2, b);
                                    }
                                }
                            }).start();
                        } catch (Exception e7) {
                            e7.printStackTrace();
                        }
                    } else {
                        m25054a();
                    }
                }
            }
        } catch (Exception e8) {
            e8.printStackTrace();
            m25054a();
        }
    }

    public void install(Object obj, String str) {
        try {
            if (this.f21907a != null && (this.f21907a instanceof MBInterstitialActivity)) {
                ((MBInterstitialActivity) this.f21907a).clickTracking();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void openURL(Object obj, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                String optString = jSONObject.optString("url");
                int optInt = jSONObject.optInt("type");
                if (optInt == 1) {
                    C6779b.m20645a(this.f21907a, optString);
                } else if (optInt == 2) {
                    C6779b.m20647b(this.f21907a, optString);
                }
            } catch (JSONException e) {
                C8672v.m24878d(f21357d, e.getMessage());
            } catch (Throwable th) {
                C8672v.m24878d(f21357d, th.getMessage());
            }
        }
    }

    /* renamed from: a */
    private void m25054a() {
        try {
            C8887g.m25669a().mo58688a(this.f21358e, "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    private List<CampaignEx> m25053a(String str) {
        try {
            if (TextUtils.isEmpty(str) || C8696a.m25003a() == null) {
                return null;
            }
            return C8696a.m25003a().mo58212a(str, 1);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    private String m25052a(List<CampaignEx> list) {
        if (list == null) {
            return "";
        }
        try {
            if (list.size() <= 0) {
                return "";
            }
            JSONArray parseCamplistToJson = CampaignEx.parseCamplistToJson(list);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("campaignList", parseCamplistToJson);
            String jSONObject2 = jSONObject.toString();
            if (!TextUtils.isEmpty(jSONObject2)) {
                return Base64.encodeToString(jSONObject2.getBytes(), 2);
            }
            return "";
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public List<String> getExcludeIdList(String str) {
        ArrayList arrayList;
        Exception e;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String optString = new JSONObject(str).optString(C8550d.f20983c);
            if (TextUtils.isEmpty(optString)) {
                return null;
            }
            JSONArray jSONArray = new JSONArray(optString);
            if (jSONArray.length() <= 0) {
                return null;
            }
            arrayList = new ArrayList();
            int i = 0;
            while (i < jSONArray.length()) {
                try {
                    if (!TextUtils.isEmpty(jSONArray.optString(i))) {
                        arrayList.add(jSONArray.optString(i));
                    }
                    i++;
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    return arrayList;
                }
            }
            return arrayList;
        } catch (Exception e3) {
            e = e3;
            arrayList = null;
            e.printStackTrace();
            return arrayList;
        }
    }

    /* renamed from: a */
    private int m25050a(Context context) {
        return (context == null || !(context instanceof MBInterstitialActivity)) ? -1 : 1;
    }

    /* renamed from: b */
    private String m25055b() {
        MBInterstitialActivity mBInterstitialActivity;
        try {
            if (this.f21907a != null && m25050a(this.f21907a) == 1) {
                try {
                    if (!(this.f21907a == null || !(this.f21907a instanceof MBInterstitialActivity) || (mBInterstitialActivity = (MBInterstitialActivity) this.f21907a) == null)) {
                        return mBInterstitialActivity.mUnitid;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return null;
    }
}
