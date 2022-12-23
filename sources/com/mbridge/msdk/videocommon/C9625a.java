package com.mbridge.msdk.videocommon;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.mbridge.msdk.videocommon.a */
/* compiled from: TemplateWebviewCache */
public final class C9625a {

    /* renamed from: a */
    private static ConcurrentHashMap<String, C9626a> f23895a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private static ConcurrentHashMap<String, C9626a> f23896b = new ConcurrentHashMap<>();

    /* renamed from: c */
    private static ConcurrentHashMap<String, C9626a> f23897c = new ConcurrentHashMap<>();

    /* renamed from: d */
    private static ConcurrentHashMap<String, C9626a> f23898d = new ConcurrentHashMap<>();

    /* renamed from: e */
    private static ConcurrentHashMap<String, C9626a> f23899e = new ConcurrentHashMap<>();

    /* renamed from: f */
    private static ConcurrentHashMap<String, C9626a> f23900f = new ConcurrentHashMap<>();

    /* renamed from: g */
    private static ConcurrentHashMap<String, C9626a> f23901g = new ConcurrentHashMap<>();

    /* renamed from: h */
    private static ConcurrentHashMap<String, C9626a> f23902h = new ConcurrentHashMap<>();

    /* renamed from: i */
    private static ConcurrentHashMap<String, C9626a> f23903i = new ConcurrentHashMap<>();

    /* renamed from: j */
    private static ConcurrentHashMap<String, C9626a> f23904j = new ConcurrentHashMap<>();

    /* renamed from: com.mbridge.msdk.videocommon.a$a */
    /* compiled from: TemplateWebviewCache */
    public static class C9626a {

        /* renamed from: a */
        private WindVaneWebView f23905a;

        /* renamed from: b */
        private boolean f23906b;

        /* renamed from: a */
        public final WindVaneWebView mo63497a() {
            return this.f23905a;
        }

        /* renamed from: a */
        public final void mo63498a(WindVaneWebView windVaneWebView) {
            this.f23905a = windVaneWebView;
        }

        /* renamed from: a */
        public final void mo63499a(String str) {
            WindVaneWebView windVaneWebView = this.f23905a;
            if (windVaneWebView != null) {
                windVaneWebView.setTag(str);
            }
        }

        /* renamed from: b */
        public final String mo63501b() {
            WindVaneWebView windVaneWebView = this.f23905a;
            return windVaneWebView != null ? (String) windVaneWebView.getTag() : "";
        }

        /* renamed from: c */
        public final boolean mo63502c() {
            return this.f23906b;
        }

        /* renamed from: a */
        public final void mo63500a(boolean z) {
            this.f23906b = z;
        }
    }

    /* renamed from: a */
    public static C9626a m27300a(String str) {
        if (f23901g.containsKey(str)) {
            return f23901g.get(str);
        }
        if (f23902h.containsKey(str)) {
            return f23902h.get(str);
        }
        if (f23903i.containsKey(str)) {
            return f23903i.get(str);
        }
        if (f23904j.containsKey(str)) {
            return f23904j.get(str);
        }
        return null;
    }

    /* renamed from: a */
    public static void m27303a(String str, C9626a aVar, boolean z, boolean z2) {
        if (z) {
            if (z2) {
                f23902h.put(str, aVar);
            } else {
                f23901g.put(str, aVar);
            }
        } else if (z2) {
            f23904j.put(str, aVar);
        } else {
            f23903i.put(str, aVar);
        }
    }

    /* renamed from: b */
    public static void m27306b(String str) {
        if (f23901g.containsKey(str)) {
            f23901g.remove(str);
        }
        if (f23903i.containsKey(str)) {
            f23903i.remove(str);
        }
        if (f23902h.containsKey(str)) {
            f23902h.remove(str);
        }
        if (f23904j.containsKey(str)) {
            f23904j.remove(str);
        }
    }

    /* renamed from: c */
    public static void m27307c(String str) {
        if (!TextUtils.isEmpty(str)) {
            for (String next : f23901g.keySet()) {
                if (!TextUtils.isEmpty(next) && next.startsWith(str)) {
                    f23901g.remove(next);
                }
            }
        } else {
            f23901g.clear();
        }
        f23902h.clear();
    }

    /* renamed from: a */
    public static void m27301a() {
        f23903i.clear();
        f23904j.clear();
    }

    /* renamed from: d */
    public static void m27308d(String str) {
        for (Map.Entry next : f23901g.entrySet()) {
            if (((String) next.getKey()).contains(str)) {
                f23901g.remove(next.getKey());
            }
        }
    }

    /* renamed from: e */
    public static void m27309e(String str) {
        for (Map.Entry next : f23902h.entrySet()) {
            if (((String) next.getKey()).contains(str)) {
                f23902h.remove(next.getKey());
            }
        }
    }

    /* renamed from: a */
    public static C9626a m27299a(int i, CampaignEx campaignEx) {
        if (campaignEx == null) {
            return null;
        }
        try {
            String requestIdNotice = campaignEx.getRequestIdNotice();
            if (i == 288) {
                requestIdNotice = campaignEx.getKeyIaUrl();
            }
            if (i != 94) {
                if (i != 287) {
                    if (i != 288) {
                        if (f23895a != null && f23895a.size() > 0) {
                            return f23895a.get(requestIdNotice);
                        }
                    } else if (f23898d != null && f23898d.size() > 0) {
                        return f23898d.get(requestIdNotice);
                    }
                } else if (campaignEx.isBidCampaign()) {
                    if (f23897c != null && f23897c.size() > 0) {
                        return f23897c.get(requestIdNotice);
                    }
                } else if (f23900f != null && f23900f.size() > 0) {
                    return f23900f.get(requestIdNotice);
                }
            } else if (campaignEx.isBidCampaign()) {
                if (f23896b != null && f23896b.size() > 0) {
                    return f23896b.get(requestIdNotice);
                }
            } else if (f23899e != null && f23899e.size() > 0) {
                return f23899e.get(requestIdNotice);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                e.printStackTrace();
            }
        }
        return null;
    }

    /* renamed from: b */
    public static void m27304b(int i, CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                String requestIdNotice = campaignEx.getRequestIdNotice();
                if (i == 288) {
                    requestIdNotice = campaignEx.getKeyIaUrl();
                }
                if (i != 94) {
                    if (i != 287) {
                        if (i != 288) {
                            if (f23895a != null) {
                                f23895a.remove(requestIdNotice);
                            }
                        } else if (f23898d != null) {
                            f23898d.remove(requestIdNotice);
                        }
                    } else if (campaignEx.isBidCampaign()) {
                        if (f23897c != null) {
                            f23897c.remove(requestIdNotice);
                        }
                    } else if (f23900f != null) {
                        f23900f.remove(requestIdNotice);
                    }
                } else if (campaignEx.isBidCampaign()) {
                    if (f23896b != null) {
                        f23896b.remove(requestIdNotice);
                    }
                } else if (f23899e != null) {
                    f23899e.remove(requestIdNotice);
                }
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public static void m27302a(int i, String str, C9626a aVar) {
        if (i == 94) {
            if (f23896b == null) {
                f23896b = new ConcurrentHashMap<>();
            }
            f23896b.put(str, aVar);
        } else if (i == 287) {
            try {
                if (f23897c == null) {
                    f23897c = new ConcurrentHashMap<>();
                }
                f23897c.put(str, aVar);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: b */
    public static void m27305b(int i, String str, C9626a aVar) {
        if (i == 94) {
            if (f23899e == null) {
                f23899e = new ConcurrentHashMap<>();
            }
            f23899e.put(str, aVar);
        } else if (i == 287) {
            if (f23900f == null) {
                f23900f = new ConcurrentHashMap<>();
            }
            f23900f.put(str, aVar);
        } else if (i != 288) {
            try {
                if (f23895a == null) {
                    f23895a = new ConcurrentHashMap<>();
                }
                f23895a.put(str, aVar);
            } catch (Exception e) {
                if (MBridgeConstans.DEBUG) {
                    e.printStackTrace();
                }
            }
        } else {
            if (f23898d == null) {
                f23898d = new ConcurrentHashMap<>();
            }
            f23898d.put(str, aVar);
        }
    }
}
