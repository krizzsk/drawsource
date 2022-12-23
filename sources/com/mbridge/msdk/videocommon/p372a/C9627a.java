package com.mbridge.msdk.videocommon.p372a;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.C8457b;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.p298db.C8410e;
import com.mbridge.msdk.foundation.p298db.C8412f;
import com.mbridge.msdk.foundation.p298db.C8414g;
import com.mbridge.msdk.foundation.same.p300a.C8473d;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.p078c.C2440a;
import com.mbridge.msdk.p078c.C2445b;
import com.mbridge.msdk.videocommon.C9625a;
import com.mbridge.msdk.videocommon.p375d.C9637a;
import com.mbridge.msdk.videocommon.p375d.C9638b;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.mbridge.msdk.videocommon.a.a */
/* compiled from: VideoCampaignCache */
public class C9627a {

    /* renamed from: a */
    private static final String f23907a = C9627a.class.getName();

    /* renamed from: b */
    private static C9627a f23908b = null;

    /* renamed from: c */
    private C8410e f23909c;

    private C9627a() {
        try {
            Context g = C8388a.m23845e().mo56913g();
            if (g != null) {
                this.f23909c = C8410e.m23925a((C8412f) C8414g.m23969a(g));
            } else {
                C8672v.m24878d(f23907a, "RewardCampaignCache get Context is null");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static synchronized C9627a m27316a() {
        C9627a aVar;
        synchronized (C9627a.class) {
            if (f23908b == null) {
                f23908b = new C9627a();
            }
            aVar = f23908b;
        }
        return aVar;
    }

    /* renamed from: a */
    public final List<CampaignEx> mo63504a(String str, int i) {
        List<CampaignEx> a;
        ArrayList arrayList = null;
        try {
            if (TextUtils.isEmpty(str) || (a = this.f23909c.mo56981a(str, 0, 0, i)) == null) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            try {
                for (CampaignEx next : a) {
                    if (next != null) {
                        arrayList2.add(next);
                    }
                }
                return arrayList2;
            } catch (Exception e) {
                e = e;
                arrayList = arrayList2;
                e.printStackTrace();
                return arrayList;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            return arrayList;
        }
    }

    /* renamed from: a */
    public final void mo63514a(String str, List<CampaignEx> list, String str2, int i) {
        C8410e eVar;
        if (!TextUtils.isEmpty(str) && list != null && list.size() > 0 && !TextUtils.isEmpty(str2) && (eVar = this.f23909c) != null) {
            eVar.mo56994a(str, list, str2, i);
        }
    }

    /* renamed from: a */
    public final void mo63513a(String str, List<CampaignEx> list) {
        C8410e eVar;
        if (!TextUtils.isEmpty(str) && list != null && list.size() > 0 && (eVar = this.f23909c) != null) {
            eVar.mo57005b(str, list);
        }
    }

    /* renamed from: a */
    public final void mo63511a(String str, String str2) {
        if (this.f23909c != null && !TextUtils.isEmpty(str)) {
            this.f23909c.mo57012e(str, str2);
        }
    }

    /* renamed from: a */
    public final List<CampaignEx> mo63505a(String str, int i, boolean z) {
        return mo63506a(str, i, z, "");
    }

    /* renamed from: a */
    public final List<CampaignEx> mo63506a(String str, int i, boolean z, String str2) {
        List<CampaignEx> list;
        ArrayList arrayList = null;
        try {
            C9637a b = C9638b.m27377a().mo63556b();
            long d = b != null ? b.mo63541d() : 0;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (z) {
                list = this.f23909c.mo56982a(str, 0, 0, i, str2);
            } else {
                list = this.f23909c.mo56983a(str, 0, 0, i, false);
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (list == null) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            try {
                for (CampaignEx next : list) {
                    if (next != null && (next.getReadyState() == 0 || next.getLoadTimeoutState() == 1)) {
                        long plct = next.getPlct() * 1000;
                        long timestamp = currentTimeMillis - next.getTimestamp();
                        int i2 = (plct > 0 ? 1 : (plct == 0 ? 0 : -1));
                        if ((i2 > 0 && plct >= timestamp) || (i2 <= 0 && d >= timestamp)) {
                            arrayList2.add(next);
                        }
                    }
                }
                return arrayList2;
            } catch (Exception e) {
                e = e;
                arrayList = arrayList2;
                e.printStackTrace();
                return arrayList;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            return arrayList;
        }
    }

    /* renamed from: a */
    public final List<CampaignEx> mo63507a(List<CampaignEx> list) {
        ArrayList arrayList = null;
        if (list == null) {
            return null;
        }
        try {
            C9637a b = C9638b.m27377a().mo63556b();
            long d = b != null ? b.mo63541d() : 0;
            long currentTimeMillis = System.currentTimeMillis();
            if (list == null || list.size() <= 0) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            try {
                for (CampaignEx next : list) {
                    if (next != null) {
                        long plct = next.getPlct() * 1000;
                        long timestamp = currentTimeMillis - next.getTimestamp();
                        int i = (plct > 0 ? 1 : (plct == 0 ? 0 : -1));
                        if ((i > 0 && plct >= timestamp) || (i <= 0 && d >= timestamp)) {
                            arrayList2.add(next);
                        }
                    }
                }
                return arrayList2;
            } catch (Exception e) {
                e = e;
                arrayList = arrayList2;
                e.printStackTrace();
                return arrayList;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            return arrayList;
        }
    }

    /* renamed from: a */
    public final List<C8457b> mo63503a(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return this.f23909c.mo57009d(str);
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public final int mo63515b(String str, int i, boolean z, String str2) {
        List<CampaignEx> list;
        try {
            if (TextUtils.isEmpty(str)) {
                return 0;
            }
            ArrayList arrayList = new ArrayList();
            if (z) {
                list = this.f23909c.mo56982a(str, 0, 0, i, str2);
            } else {
                list = this.f23909c.mo56983a(str, 0, 0, i, false);
            }
            if (list == null) {
                return 0;
            }
            for (CampaignEx next : list) {
                if (next != null && next.getReadyState() == 0) {
                    arrayList.add(next);
                }
            }
            return arrayList.size();
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    /* renamed from: b */
    public final List<CampaignEx> mo63516b(String str, int i, boolean z) {
        try {
            if (!TextUtils.isEmpty(str)) {
                return this.f23909c.mo56983a(str, 0, 0, i, z);
            }
            return null;
        } catch (Exception e) {
            C8672v.m24878d(f23907a, e.getLocalizedMessage());
            return null;
        }
    }

    /* renamed from: c */
    public final List<CampaignEx> mo63520c(String str, int i, boolean z, String str2) {
        long K;
        List<CampaignEx> list;
        ArrayList arrayList = null;
        try {
            C2440a b = C2445b.m6020a().mo16286b(C8388a.m23845e().mo56914h());
            if (b != null) {
                K = b.mo16156K();
            } else {
                K = C2445b.m6020a().mo16285b().mo16156K();
            }
            long j = K * 1000;
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (z) {
                list = this.f23909c.mo56982a(str, 0, 0, i, str2);
            } else {
                list = this.f23909c.mo56983a(str, 0, 0, i, false);
            }
            long currentTimeMillis = System.currentTimeMillis();
            if (list == null) {
                return null;
            }
            ArrayList arrayList2 = new ArrayList();
            try {
                for (CampaignEx next : list) {
                    if (next != null && next.getReadyState() == 0) {
                        long plctb = next.getPlctb() * 1000;
                        long timestamp = currentTimeMillis - next.getTimestamp();
                        int i2 = (plctb > 0 ? 1 : (plctb == 0 ? 0 : -1));
                        if ((i2 <= 0 && j >= timestamp) || (i2 > 0 && plctb >= timestamp)) {
                            arrayList2.add(next);
                        }
                    }
                }
                return arrayList2;
            } catch (Exception e) {
                e = e;
                arrayList = arrayList2;
                e.printStackTrace();
                return arrayList;
            }
        } catch (Exception e2) {
            e = e2;
            e.printStackTrace();
            return arrayList;
        }
    }

    /* renamed from: a */
    public final void mo63510a(CampaignEx campaignEx, String str) {
        if (campaignEx != null) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    if (campaignEx.isBidCampaign()) {
                        C8473d.m24284b(str, campaignEx.getRequestId());
                    }
                    this.f23909c.mo56992a(campaignEx.getId(), str, campaignEx.isBidCampaign(), campaignEx.getRequestId());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public final void mo63509a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            try {
                if (!TextUtils.isEmpty(campaignEx.getId())) {
                    this.f23909c.mo57004b(campaignEx.getId(), campaignEx.getRequestId());
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: b */
    public final void mo63517b(String str) {
        ConcurrentHashMap<String, C8457b> e;
        try {
            if (!TextUtils.isEmpty(str) && (e = this.f23909c.mo57011e(str)) != null && e.size() > 0) {
                C2440a b = C2445b.m6020a().mo16286b(C8388a.m23845e().mo56914h());
                if (b == null) {
                    b = C2445b.m6020a().mo16285b();
                }
                long K = b != null ? b.mo16156K() : 0;
                long currentTimeMillis = System.currentTimeMillis();
                for (C8457b next : e.values()) {
                    if (next != null) {
                        long d = next.mo57682d();
                        if (d <= 0) {
                            d = K;
                        }
                        if (next.mo57683e() + (d * 1000) < currentTimeMillis) {
                            if (!TextUtils.isEmpty(next.mo57675b())) {
                                mo63519b(str, next.mo57675b());
                            }
                        }
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: b */
    public final void mo63518b(String str, int i) {
        int size;
        try {
            List<C8457b> d = this.f23909c.mo57009d(str);
            if (d != null && d.size() > 0 && (size = d.size() - i) > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    mo63519b(str, d.get(i2).mo57675b());
                    C8473d.m24284b(str, d.get(i2).mo57675b());
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public final synchronized void mo63519b(String str, String str2) {
        try {
            this.f23909c.mo57007c(str2, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return;
    }

    /* renamed from: a */
    public final void mo63512a(String str, String str2, List<CampaignEx> list) {
        try {
            if (!TextUtils.isEmpty(str2) && list != null && list.size() > 0) {
                this.f23909c.mo56998a(list, str, str2, 0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public final synchronized void mo63508a(long j, String str) {
        try {
            this.f23909c.mo56985a(j, str);
        } catch (Exception e) {
            e.printStackTrace();
            C8672v.m24878d(f23907a, e.getMessage());
        }
        return;
    }

    /* renamed from: c */
    public final synchronized void mo63521c(String str, int i) {
        try {
            C2440a b = C2445b.m6020a().mo16286b(C8388a.m23845e().mo56914h());
            if (b == null) {
                b = C2445b.m6020a().mo16285b();
            }
            int av = b.mo16204av();
            if (av != 0) {
                boolean z = true;
                List<CampaignEx> b2 = this.f23909c.mo57002b(str, i, av == 2);
                if (b2 != null && b2.size() > 0) {
                    for (CampaignEx next : b2) {
                        String requestIdNotice = next.getRequestIdNotice();
                        String id = next.getId();
                        C9625a.m27306b(next.getCampaignUnitId() + "_" + id + "_" + requestIdNotice + "_" + next.getCMPTEntryUrl());
                    }
                }
                C8410e eVar = this.f23909c;
                if (av != 2) {
                    z = false;
                }
                eVar.mo56989a(str, i, z);
            } else {
                return;
            }
        } catch (Exception e) {
            C8672v.m24878d(f23907a, e.getMessage());
        }
        return;
    }
}
