package com.mbridge.msdk.foundation.same.p300a;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.C8457b;
import com.mbridge.msdk.foundation.entity.C8458c;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p298db.C8410e;
import com.mbridge.msdk.foundation.p298db.C8412f;
import com.mbridge.msdk.foundation.p298db.C8414g;
import com.mbridge.msdk.foundation.same.p303d.C8489a;
import com.mbridge.msdk.foundation.tools.C8616ad;
import com.mbridge.msdk.foundation.tools.C8672v;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.same.a.d */
/* compiled from: StaticDataPoll */
public class C8473d {

    /* renamed from: a */
    public static Map<String, Long> f20772a = new HashMap();

    /* renamed from: b */
    public static Map<String, List<C8489a>> f20773b = new HashMap();

    /* renamed from: c */
    public static Map<String, List<C8489a>> f20774c = new HashMap();

    /* renamed from: d */
    public static Map<String, List<C8489a>> f20775d = new HashMap();

    /* renamed from: e */
    public static Map<String, List<C8489a>> f20776e = new HashMap();

    /* renamed from: f */
    public static Map<String, List<C8489a>> f20777f = new HashMap();

    /* renamed from: g */
    public static Map<String, List<C8489a>> f20778g = new HashMap();

    /* renamed from: h */
    public static Map<String, List<C8489a>> f20779h = new HashMap();

    /* renamed from: i */
    public static Map<String, List<C8489a>> f20780i = new HashMap();

    /* renamed from: j */
    public static ConcurrentHashMap<String, ConcurrentHashMap<String, C8457b>> f20781j;

    /* renamed from: k */
    public static ConcurrentHashMap<String, CopyOnWriteArrayList<String>> f20782k;

    /* renamed from: l */
    public static ConcurrentHashMap<String, ConcurrentHashMap<String, String>> f20783l;

    /* renamed from: m */
    private static final String f20784m = C8473d.class.getSimpleName();

    /* renamed from: a */
    public static void m24279a(String str, CampaignEx campaignEx, String str2) {
        Map<String, List<C8489a>> d = m24287d(str2);
        if (campaignEx != null && d != null) {
            try {
                if (!TextUtils.isEmpty(campaignEx.getId())) {
                    C8489a aVar = new C8489a(campaignEx.getId(), campaignEx.getRequestIdNotice());
                    if (d.containsKey(str)) {
                        List list = d.get(str);
                        if (list != null && list.size() == 20) {
                            list.remove(0);
                        }
                        if (list != null) {
                            list.add(aVar);
                            return;
                        }
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(aVar);
                    d.put(str, arrayList);
                }
            } catch (Throwable th) {
                C8672v.m24875a(f20784m, th.getMessage(), th);
            }
        }
    }

    /* renamed from: a */
    public static String m24277a(String str, String str2) {
        Map<String, List<C8489a>> map;
        List list;
        JSONArray jSONArray = new JSONArray();
        if (TextUtils.isEmpty(str2)) {
            map = null;
            if (f20774c.containsKey(str)) {
                map = f20774c;
            } else if (f20775d.containsKey(str)) {
                map = f20775d;
            } else if (f20776e.containsKey(str)) {
                map = f20776e;
            } else if (f20777f.containsKey(str)) {
                map = f20777f;
            } else if (f20778g.containsKey(str)) {
                map = f20778g;
            } else if (f20779h.containsKey(str)) {
                map = f20779h;
            } else if (f20780i.containsKey(str)) {
                map = f20780i;
            }
        } else {
            map = m24287d(str2);
        }
        if (map != null) {
            try {
                if (C8616ad.m24718b(str) && map.containsKey(str) && (list = map.get(str)) != null && list.size() > 0) {
                    for (int i = 0; i < list.size(); i++) {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("2", ((C8489a) list.get(i)).mo57897a());
                        jSONObject.put("1", ((C8489a) list.get(i)).mo57898b());
                        jSONArray.put(jSONObject);
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return jSONArray.toString();
    }

    /* renamed from: a */
    public static void m24282a(String str, String str2, String str3, long j, long j2, long j3) {
        if (f20781j == null) {
            f20781j = new ConcurrentHashMap<>();
        }
        try {
            if (f20781j.containsKey(str)) {
                Map map = f20781j.get(str);
                if (map != null) {
                    C8457b bVar = (C8457b) map.get(str2);
                    if (bVar == null) {
                        C8457b bVar2 = new C8457b();
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(str3);
                        bVar2.mo57674a((List<String>) arrayList);
                        bVar2.mo57672a(j);
                        bVar2.mo57677b(j2);
                        bVar2.mo57681c(j3);
                        map.put(str2, bVar2);
                    } else if (bVar.mo57679c() != null) {
                        bVar.mo57672a(j);
                        bVar.mo57677b(j2);
                        bVar.mo57681c(j3);
                        bVar.mo57679c().add(str3);
                    }
                }
            } else {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(str3);
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                C8457b bVar3 = new C8457b();
                bVar3.mo57674a((List<String>) arrayList2);
                bVar3.mo57672a(j);
                bVar3.mo57677b(j2);
                bVar3.mo57681c(j3);
                concurrentHashMap.put(str2, bVar3);
                f20781j.put(str, concurrentHashMap);
            }
        } catch (Throwable th) {
            C8672v.m24878d(f20784m, th.getMessage());
        }
    }

    /* renamed from: b */
    public static void m24284b(String str, String str2) {
        ConcurrentHashMap<String, ConcurrentHashMap<String, C8457b>> concurrentHashMap;
        if (TextUtils.isEmpty(str) || (concurrentHashMap = f20781j) == null || !concurrentHashMap.containsKey(str)) {
            return;
        }
        if (TextUtils.isEmpty(str2)) {
            f20781j.remove(str);
            return;
        }
        Map map = f20781j.get(str);
        if (map != null && map.containsKey(str2)) {
            map.remove(str2);
        }
    }

    /* renamed from: a */
    public static ConcurrentHashMap<String, C8457b> m24278a(String str) {
        ConcurrentHashMap<String, ConcurrentHashMap<String, C8457b>> concurrentHashMap = f20781j;
        if (concurrentHashMap == null) {
            C8410e a = C8410e.m23925a((C8412f) C8414g.m23969a(C8388a.m23845e().mo56913g()));
            if (a != null) {
                a.mo57010d(str, "");
                f20781j = new ConcurrentHashMap<>();
            }
        } else if (concurrentHashMap.containsKey(str)) {
            return f20781j.get(str);
        }
        return null;
    }

    /* renamed from: a */
    public static void m24280a(String str, String str2, int i) {
        CopyOnWriteArrayList copyOnWriteArrayList;
        int size;
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            if (f20782k == null) {
                f20782k = new ConcurrentHashMap<>();
            }
            try {
                if (f20782k.containsKey(str)) {
                    copyOnWriteArrayList = f20782k.get(str);
                    copyOnWriteArrayList.add(str2);
                } else {
                    CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
                    copyOnWriteArrayList2.add(str2);
                    f20782k.put(str, copyOnWriteArrayList2);
                    copyOnWriteArrayList = copyOnWriteArrayList2;
                }
                if (copyOnWriteArrayList != null && (size = copyOnWriteArrayList.size() - i) >= 0) {
                    for (int i2 = 0; i2 < size; i2++) {
                        copyOnWriteArrayList.remove(i2);
                    }
                }
            } catch (Exception e) {
                C8672v.m24874a(f20784m, e.getMessage());
            }
        }
    }

    /* renamed from: b */
    public static void m24283b(String str) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<String>> concurrentHashMap;
        CopyOnWriteArrayList copyOnWriteArrayList;
        if (!TextUtils.isEmpty(str) && (concurrentHashMap = f20782k) != null && concurrentHashMap.containsKey(str) && (copyOnWriteArrayList = f20782k.get(str)) != null && copyOnWriteArrayList.size() > 0) {
            copyOnWriteArrayList.remove(0);
        }
    }

    /* renamed from: c */
    public static String m24286c(String str) {
        ConcurrentHashMap<String, CopyOnWriteArrayList<String>> concurrentHashMap;
        CopyOnWriteArrayList copyOnWriteArrayList;
        if (!TextUtils.isEmpty(str) && (concurrentHashMap = f20782k) != null && concurrentHashMap.containsKey(str) && (copyOnWriteArrayList = f20782k.get(str)) != null && copyOnWriteArrayList.size() > 0) {
            return (String) copyOnWriteArrayList.get(0);
        }
        return "";
    }

    /* renamed from: a */
    public static void m24281a(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            try {
                if (f20783l == null) {
                    f20783l = new ConcurrentHashMap<>();
                }
                if (!f20783l.containsKey(str)) {
                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                    concurrentHashMap.put(str2, str3);
                    f20783l.put(str, concurrentHashMap);
                } else if (f20783l.get(str) == null) {
                    ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
                    concurrentHashMap2.put(str2, str3);
                    f20783l.put(str, concurrentHashMap2);
                }
            } catch (Exception e) {
                C8672v.m24874a(f20784m, e.getMessage());
            }
        }
    }

    /* renamed from: c */
    public static C8458c m24285c(String str, String str2) {
        ConcurrentHashMap concurrentHashMap;
        C8458c cVar = new C8458c();
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return cVar;
        }
        try {
            if (f20783l != null && f20783l.containsKey(str) && (concurrentHashMap = f20783l.get(str)) != null && concurrentHashMap.containsKey(str2)) {
                cVar.mo57688b(1);
                cVar.mo57691c((String) concurrentHashMap.get(str2));
            }
        } catch (Exception e) {
            C8672v.m24874a(f20784m, e.getMessage());
        }
        return cVar;
    }

    /* renamed from: d */
    public static void m24288d(String str, String str2) {
        ConcurrentHashMap concurrentHashMap;
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            try {
                if (f20783l != null && f20783l.containsKey(str) && (concurrentHashMap = f20783l.get(str2)) != null && concurrentHashMap.containsKey(str2)) {
                    concurrentHashMap.remove(str2);
                }
            } catch (Exception e) {
                C8672v.m24874a(f20784m, e.getMessage());
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.Map<java.lang.String, java.util.List<com.mbridge.msdk.foundation.same.p303d.C8489a>> m24287d(java.lang.String r1) {
        /*
            int r0 = r1.hashCode()
            switch(r0) {
                case -1396342996: goto L_0x0044;
                case -1052618729: goto L_0x003a;
                case -934326481: goto L_0x0030;
                case -895866265: goto L_0x0026;
                case 538816457: goto L_0x001c;
                case 604727084: goto L_0x0012;
                case 1844104930: goto L_0x0008;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x004e
        L_0x0008:
            java.lang.String r0 = "interactive"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x004e
            r1 = 2
            goto L_0x004f
        L_0x0012:
            java.lang.String r0 = "interstitial"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x004e
            r1 = 3
            goto L_0x004f
        L_0x001c:
            java.lang.String r0 = "h5_native"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x004e
            r1 = 6
            goto L_0x004f
        L_0x0026:
            java.lang.String r0 = "splash"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x004e
            r1 = 5
            goto L_0x004f
        L_0x0030:
            java.lang.String r0 = "reward"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x004e
            r1 = 1
            goto L_0x004f
        L_0x003a:
            java.lang.String r0 = "native"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x004e
            r1 = 0
            goto L_0x004f
        L_0x0044:
            java.lang.String r0 = "banner"
            boolean r1 = r1.equals(r0)
            if (r1 == 0) goto L_0x004e
            r1 = 4
            goto L_0x004f
        L_0x004e:
            r1 = -1
        L_0x004f:
            switch(r1) {
                case 0: goto L_0x0066;
                case 1: goto L_0x0063;
                case 2: goto L_0x0060;
                case 3: goto L_0x005d;
                case 4: goto L_0x005a;
                case 5: goto L_0x0057;
                case 6: goto L_0x0054;
                default: goto L_0x0052;
            }
        L_0x0052:
            r1 = 0
            goto L_0x0068
        L_0x0054:
            java.util.Map<java.lang.String, java.util.List<com.mbridge.msdk.foundation.same.d.a>> r1 = f20780i
            goto L_0x0068
        L_0x0057:
            java.util.Map<java.lang.String, java.util.List<com.mbridge.msdk.foundation.same.d.a>> r1 = f20779h
            goto L_0x0068
        L_0x005a:
            java.util.Map<java.lang.String, java.util.List<com.mbridge.msdk.foundation.same.d.a>> r1 = f20778g
            goto L_0x0068
        L_0x005d:
            java.util.Map<java.lang.String, java.util.List<com.mbridge.msdk.foundation.same.d.a>> r1 = f20777f
            goto L_0x0068
        L_0x0060:
            java.util.Map<java.lang.String, java.util.List<com.mbridge.msdk.foundation.same.d.a>> r1 = f20776e
            goto L_0x0068
        L_0x0063:
            java.util.Map<java.lang.String, java.util.List<com.mbridge.msdk.foundation.same.d.a>> r1 = f20775d
            goto L_0x0068
        L_0x0066:
            java.util.Map<java.lang.String, java.util.List<com.mbridge.msdk.foundation.same.d.a>> r1 = f20774c
        L_0x0068:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.p300a.C8473d.m24287d(java.lang.String):java.util.Map");
    }
}
