package com.mbridge.msdk.videocommon.download;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.p302c.C8481b;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.mbridge.msdk.videocommon.download.i */
/* compiled from: ResDownloadCheckManager */
public final class C9664i {

    /* renamed from: b */
    private static Map<String, Boolean> f24066b = new HashMap();

    /* renamed from: a */
    private Map<String, Boolean> f24067a;

    /* renamed from: c */
    private Map<String, Boolean> f24068c;

    /* renamed from: d */
    private Map<String, Boolean> f24069d;

    /* renamed from: e */
    private Map<String, Boolean> f24070e;

    /* renamed from: com.mbridge.msdk.videocommon.download.i$a */
    /* compiled from: ResDownloadCheckManager */
    private static final class C9666a {

        /* renamed from: a */
        public static C9664i f24071a = new C9664i();
    }

    private C9664i() {
        this.f24067a = new HashMap();
        this.f24068c = new HashMap();
        this.f24069d = new HashMap();
        this.f24070e = new HashMap();
    }

    /* renamed from: a */
    public static C9664i m27564a() {
        return C9666a.f24071a;
    }

    /* renamed from: a */
    public final boolean mo63678a(String str) {
        if (this.f24067a == null || TextUtils.isEmpty(str) || !this.f24067a.containsKey(str)) {
            return false;
        }
        return this.f24067a.get(str).booleanValue();
    }

    /* renamed from: b */
    public final boolean mo63680b(String str) {
        if (this.f24068c == null || TextUtils.isEmpty(str) || !this.f24068c.containsKey(str)) {
            return false;
        }
        return this.f24068c.get(str).booleanValue();
    }

    /* renamed from: a */
    public final void mo63677a(List<CampaignEx> list) {
        List<CampaignEx.C8454c.C8455a> f;
        List<String> list2;
        Map<String, Boolean> map;
        if (list != null && list.size() != 0) {
            for (CampaignEx next : list) {
                if (next != null) {
                    if (next != null) {
                        String videoUrlEncode = next.getVideoUrlEncode();
                        Map<String, Boolean> map2 = this.f24067a;
                        if (map2 != null && !map2.containsKey(videoUrlEncode)) {
                            this.f24067a.put(videoUrlEncode, false);
                        }
                        String str = next.getendcard_url();
                        Map<String, Boolean> map3 = this.f24068c;
                        if (map3 != null && !map3.containsKey(str)) {
                            this.f24068c.put(str, false);
                        }
                        CampaignEx.C8454c rewardTemplateMode = next.getRewardTemplateMode();
                        if (!(rewardTemplateMode == null || (f = rewardTemplateMode.mo57577f()) == null)) {
                            for (CampaignEx.C8454c.C8455a next2 : f) {
                                if (!(next2 == null || (list2 = next2.f20604b) == null || list2.size() == 0)) {
                                    for (String next3 : list2) {
                                        if (!TextUtils.isEmpty(next3) && (map = f24066b) != null && !map.containsKey(next3)) {
                                            f24066b.put(next3, Boolean.valueOf(C8481b.m24310a(C8388a.m23845e().mo56913g()).mo57884b(next3)));
                                        }
                                    }
                                }
                            }
                        }
                    }
                    String id = next.getId();
                    if (this.f24069d == null) {
                        this.f24069d = new HashMap();
                    }
                    this.f24069d.put(id, false);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo63676a(String str, boolean z) {
        if (this.f24067a == null) {
            this.f24067a = new HashMap();
        }
        this.f24067a.put(str, Boolean.valueOf(z));
    }

    /* renamed from: b */
    public final void mo63679b(String str, boolean z) {
        if (this.f24068c == null) {
            this.f24068c = new HashMap();
        }
        this.f24068c.put(str, Boolean.valueOf(z));
    }

    /* renamed from: c */
    public final void mo63681c(String str, boolean z) {
        if (f24066b == null) {
            f24066b = new HashMap();
        }
        f24066b.put(str, Boolean.valueOf(z));
    }

    /* renamed from: d */
    public final void mo63683d(String str, boolean z) {
        if (this.f24070e == null) {
            this.f24070e = new HashMap();
        }
        this.f24070e.put(str, Boolean.valueOf(z));
    }

    /* renamed from: c */
    public final boolean mo63682c(String str) {
        if (!TextUtils.isEmpty(str) && this.f24070e.containsKey(str)) {
            return this.f24070e.get(str).booleanValue();
        }
        return false;
    }
}
