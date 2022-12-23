package com.fyber.inneractive.sdk.flow.vast;

import android.text.TextUtils;
import com.facebook.internal.security.CertificateUtil;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.flow.vast.C4384c;
import com.fyber.inneractive.sdk.measurement.C4409h;
import com.fyber.inneractive.sdk.measurement.C4410i;
import com.fyber.inneractive.sdk.measurement.C4411j;
import com.fyber.inneractive.sdk.model.vast.C4420b;
import com.fyber.inneractive.sdk.model.vast.C4421c;
import com.fyber.inneractive.sdk.model.vast.C4422d;
import com.fyber.inneractive.sdk.model.vast.C4423e;
import com.fyber.inneractive.sdk.model.vast.C4424f;
import com.fyber.inneractive.sdk.model.vast.C4425g;
import com.fyber.inneractive.sdk.model.vast.C4426h;
import com.fyber.inneractive.sdk.model.vast.C4427i;
import com.fyber.inneractive.sdk.model.vast.C4428j;
import com.fyber.inneractive.sdk.model.vast.C4430l;
import com.fyber.inneractive.sdk.model.vast.C4431m;
import com.fyber.inneractive.sdk.model.vast.C4432n;
import com.fyber.inneractive.sdk.model.vast.C4434p;
import com.fyber.inneractive.sdk.model.vast.C4435q;
import com.fyber.inneractive.sdk.model.vast.C4438s;
import com.fyber.inneractive.sdk.player.C5008f;
import com.fyber.inneractive.sdk.response.C5237i;
import com.fyber.inneractive.sdk.util.C5262d0;
import com.fyber.inneractive.sdk.util.C5292l;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.fyber.inneractive.sdk.flow.vast.a */
public class C4381a {

    /* renamed from: a */
    public int f10771a = -1;

    /* renamed from: b */
    public int f10772b = -1;

    /* renamed from: c */
    public int f10773c = -1;

    /* renamed from: d */
    public boolean f10774d = false;

    /* renamed from: e */
    public boolean f10775e = false;

    /* renamed from: f */
    public Map<C4431m, C4384c> f10776f = new LinkedHashMap();

    /* renamed from: g */
    public List<C4424f> f10777g = new ArrayList();

    /* renamed from: h */
    public final List<C4424f> f10778h = new ArrayList();

    /* renamed from: i */
    public final List<C4410i> f10779i = new ArrayList();

    /* renamed from: com.fyber.inneractive.sdk.flow.vast.a$a */
    public class C4382a extends Exception {

        /* renamed from: a */
        public int f10780a;

        public C4382a(C4381a aVar, String str, int i) {
            super(str);
            this.f10780a = i;
        }
    }

    /* renamed from: a */
    public void mo24560a(C4420b bVar, C4424f fVar, boolean z) throws C4382a {
        Integer num;
        String str;
        List<C4434p> list;
        String str2;
        Integer num2;
        C4424f fVar2 = fVar;
        List<String> list2 = fVar2.f10890h;
        if (list2 != null) {
            if (z) {
                this.f10778h.add(fVar2);
            }
            for (String f : list2) {
                if (!C5262d0.m16469f(f)) {
                    throw new C4382a(this, "Found non secure click tracking url for companion: " + fVar2, 0);
                }
            }
        }
        String str3 = fVar2.f10889g;
        if (C5262d0.m16469f(str3)) {
            Integer num3 = fVar2.f10883a;
            Integer num4 = fVar2.f10884b;
            boolean z2 = true;
            if (num3 != null && num4 != null && num3.intValue() >= 100 && num4.intValue() >= 100) {
                String str4 = fVar2.f10885c;
                List<C4434p> list3 = fVar2.f10892j;
                if (list3 != null) {
                    for (C4434p next : list3) {
                        if (!C5262d0.m16469f(next.f10927b)) {
                            throw new C4382a(this, "Found non secure tracking event: " + next, 0);
                        }
                    }
                }
                if (TextUtils.isEmpty(fVar2.f10887e) && TextUtils.isEmpty(fVar2.f10888f) && fVar2.f10886d == null) {
                    z2 = false;
                }
                if (z2) {
                    String str5 = fVar2.f10887e;
                    if (C5262d0.m16469f(str5)) {
                        C4427i iVar = fVar2.f10886d;
                        if (iVar != null) {
                            String str6 = iVar.f10901a;
                            C4426h hVar = C4426h.Gif;
                            C4426h hVar2 = !TextUtils.isEmpty(str6) ? (C4426h) ((HashMap) C4426h.f10898c).get(str6.toLowerCase()) : null;
                            if (hVar2 != null) {
                                str2 = str5;
                                list = list3;
                                str = str4;
                                num = num4;
                                num2 = num3;
                                mo24561a(bVar, C4425g.Static, z, num3.intValue(), num4.intValue(), str4, str3, list2, list, iVar.f10902b, hVar2);
                            } else {
                                throw new C4382a(this, "Found invalid creative type:" + iVar.f10901a, 0);
                            }
                        } else {
                            str2 = str5;
                            list = list3;
                            str = str4;
                            num = num4;
                            num2 = num3;
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            mo24561a(bVar, C4425g.Iframe, z, num2.intValue(), num.intValue(), str, str3, list2, list, str2, (C4426h) null);
                        }
                        String str7 = fVar2.f10888f;
                        if (!TextUtils.isEmpty(str7)) {
                            mo24561a(bVar, C4425g.Html, z, num2.intValue(), num.intValue(), str, str3, list2, list, str7, (C4426h) null);
                            return;
                        }
                        return;
                    }
                    throw new C4382a(this, "Found non secure iframe url:" + str5, 0);
                }
                throw new C4382a(this, "None sources of companion avaliable", 0);
            }
            throw new C4382a(this, "Incompatible size: " + num3 + "," + num4, 16);
        }
        throw new C4382a(this, "Found non secure click through url: " + str3, 0);
    }

    /* renamed from: a */
    public C4420b mo24558a(C4422d dVar, List<C4422d> list, String str) throws C4387e {
        IAlog.m16446a("%sprocess started", "VastProcessor: ");
        if (dVar == null || dVar.f10878c == null) {
            IAlog.m16446a("%sno inline found", "VastProcessor: ");
            throw new C4387e("ErrorNoMediaFiles", "Empty inline ad found");
        }
        int e = C5292l.m16516e();
        int d = C5292l.m16514d();
        C4420b bVar = new C4420b(new C4386d(this.f10773c, e, d), new C4383b(e, d));
        bVar.f10859a = str;
        List<C4428j> list2 = dVar.f10878c.f10881c;
        if (list2 == null || list2.isEmpty()) {
            throw new C4387e("ErrorNoMediaFiles", "Empty inline with no creatives");
        }
        if (list != null) {
            for (C4422d dVar2 : list) {
                C4438s sVar = dVar2.f10877b;
                if (sVar != null) {
                    mo24559a(bVar, (C4423e) sVar, true);
                }
            }
        }
        mo24559a(bVar, (C4423e) dVar.f10878c, false);
        if (bVar.f10862d.size() != 0) {
            if (IAlog.f13936a == 2) {
                IAlog.m16449d("%sLogging merged model media files: ", "VastProcessor: ");
                Iterator it = new ArrayList(bVar.f10862d).iterator();
                int i = 0;
                while (it.hasNext()) {
                    IAlog.m16449d("%s(%d) %s", "VastProcessor: ", Integer.valueOf(i), (C4431m) it.next());
                    i++;
                }
            }
            if (IAlog.f13936a == 2) {
                IAlog.m16449d("%sLogging merged model companion ads: ", "VastProcessor: ");
                ArrayList arrayList = new ArrayList(bVar.f10864f);
                if (arrayList.size() > 0) {
                    Iterator it2 = arrayList.iterator();
                    int i2 = 0;
                    while (it2.hasNext()) {
                        IAlog.m16449d("%s(%d) %s", "VastProcessor: ", Integer.valueOf(i2), ((C4421c) it2.next()).mo24612a());
                        i2++;
                    }
                } else {
                    IAlog.m16449d("%sNo companion ads found!", "VastProcessor: ");
                }
            }
            return bVar;
        } else if (this.f10776f.size() == 0) {
            throw new C4387e("ErrorNoMediaFiles", "No media files exist after merge");
        } else {
            throw new C4387e("ErrorNoCompatibleMediaFile", "No compatible media files after filtering");
        }
    }

    /* renamed from: a */
    public final void mo24559a(C4420b bVar, C4423e eVar, boolean z) {
        String[] split;
        C4384c cVar;
        Integer num;
        int i;
        List list;
        IAlog.m16446a("%sprocessing ad element: %s", "VastProcessor: ", eVar);
        List<String> list2 = eVar.f10880b;
        if (list2 != null) {
            for (String next : list2) {
                IAlog.m16446a("%sadding impression url: %s", "VastProcessor: ", next);
                mo24562a((C5237i) bVar, C4435q.EVENT_IMPRESSION, next);
            }
        }
        String str = eVar.f10879a;
        if (!TextUtils.isEmpty(str)) {
            IAlog.m16446a("%sadding error url: %s", "VastProcessor: ", str);
            bVar.mo24609a(C4435q.EVENT_ERROR, str);
        }
        if (IAConfigManager.f10324J.f10334I != null) {
            for (C4410i next2 : eVar.f10882d) {
                if (next2.mo24592b()) {
                    bVar.f10863e.add(next2);
                } else {
                    C4435q qVar = C4435q.EVENT_VERIFICATION_NOT_EXECUTED;
                    Map<C4435q, List<String>> map = next2.f10822c;
                    if (map == null || (list = map.get(qVar)) == null) {
                        i = 0;
                    } else {
                        i = list.size();
                    }
                    if (i > 0) {
                        C5008f.m15180a((C5237i) new C4409h(next2, next2.mo24589a(qVar), C4411j.VERIFICATION_NOT_SUPPORTED), qVar);
                    }
                    this.f10779i.add(next2);
                }
            }
        }
        for (C4428j next3 : eVar.f10881c) {
            C4430l lVar = next3.f10903a;
            if (lVar != null) {
                List<C4431m> list3 = lVar.f10905a;
                if (list3 != null) {
                    bVar.f10867i = list3.size();
                    for (C4431m next4 : list3) {
                        C4384c cVar2 = null;
                        if (!next4.f10910a.equals("progressive")) {
                            cVar2 = new C4384c(C4384c.C4385a.UNSUPPORTED_DELIVERY, "progressive");
                        } else {
                            if (!(!(this.f10772b > -1) || (num = next4.f10914e) == null || num.intValue() == 0)) {
                                int intValue = next4.f10914e.intValue();
                                int i2 = this.f10771a;
                                if (intValue < i2) {
                                    cVar2 = new C4384c(C4384c.C4385a.BITRATE_NOT_IN_RANGE, Integer.valueOf(i2));
                                } else {
                                    int intValue2 = next4.f10914e.intValue();
                                    int i3 = this.f10772b;
                                    if (intValue2 > i3) {
                                        cVar2 = new C4384c(C4384c.C4385a.BITRATE_NOT_IN_RANGE, Integer.valueOf(i3));
                                    }
                                }
                            }
                            String str2 = next4.f10913d;
                            HashMap hashMap = (HashMap) C4432n.f10921f;
                            if (!((hashMap.containsKey(str2) ? (C4432n) hashMap.get(str2) : C4432n.UNKNOWN) != C4432n.UNKNOWN)) {
                                cVar = new C4384c(C4384c.C4385a.UNSUPPORTED_MIME_TYPE, (Object) null);
                            } else if (!this.f10774d || next4.f10911b.intValue() < next4.f10912c.intValue()) {
                                String str3 = next4.f10915f;
                                if (str3 != null && this.f10775e && str3.equalsIgnoreCase("VPAID")) {
                                    cVar = new C4384c(C4384c.C4385a.FILTERED_BY_APP_OR_UNIT, (Object) null);
                                } else if (TextUtils.isEmpty(next4.f10916g)) {
                                    cVar = new C4384c(C4384c.C4385a.NO_CONTENT, (Object) null);
                                } else if (!C5262d0.m16469f(next4.f10916g)) {
                                    cVar = new C4384c(C4384c.C4385a.UNSECURED_VIDEO_URL, (Object) null);
                                }
                            } else {
                                cVar = new C4384c(C4384c.C4385a.VERTICAL_VIDEO_EXPECTED, (Object) null);
                            }
                            cVar2 = cVar;
                        }
                        if (cVar2 != null) {
                            IAlog.m16446a("%smedia file filtered!: %s", "VastProcessor: ", next4);
                            IAlog.m16446a("%s-- %s", "VastProcessor: ", next4);
                            IAlog.m16446a("%s-- %s", "VastProcessor: ", cVar2);
                            this.f10776f.put(next4, cVar2);
                        } else {
                            IAlog.m16446a("%sadding media file: %s", "VastProcessor: ", next4);
                            bVar.f10862d.add(next4);
                            bVar.f10866h++;
                        }
                    }
                }
                List<String> list4 = lVar.f10908d;
                if (list4 != null) {
                    for (String a : list4) {
                        mo24562a((C5237i) bVar, C4435q.EVENT_CLICK, a);
                    }
                }
                List<C4434p> list5 = lVar.f10906b;
                if (list5 != null) {
                    for (C4434p next5 : list5) {
                        C4435q a2 = C4435q.m13617a(next5.f10926a);
                        if (a2 != C4435q.UNKNOWN) {
                            bVar.mo24609a(a2, next5.f10927b);
                        }
                    }
                }
                bVar.f10860b = lVar.f10907c;
                String str4 = lVar.f10909e;
                if (!TextUtils.isEmpty(str4) && (split = str4.split(CertificateUtil.DELIMITER)) != null && split.length <= 3) {
                    if (split.length == 1) {
                        try {
                            Integer.parseInt(str4);
                        } catch (NumberFormatException unused) {
                        }
                    } else if (split.length == 2) {
                        Integer.parseInt(split[1]);
                        Integer.parseInt(split[0]);
                    } else {
                        Integer.parseInt(split[2]);
                        Integer.parseInt(split[1]);
                        Integer.parseInt(split[0]);
                    }
                }
            }
            List<C4424f> list6 = next3.f10904b;
            if (list6 != null) {
                for (C4424f next6 : list6) {
                    try {
                        mo24560a(bVar, next6, z);
                    } catch (C4382a e) {
                        IAlog.m16446a("Failed processing companion ad: %s error = %s", next6, e.getMessage());
                        next6.f10891i = e;
                        this.f10777g.add(next6);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo24562a(C5237i iVar, C4435q qVar, String str) throws C4387e {
        if (C5262d0.m16469f(str)) {
            ((C4420b) iVar).mo24609a(qVar, str);
            return;
        }
        throw new C4387e("VastErrorUnsecure", "found unsecure tracking event: " + qVar.f10949a);
    }

    /* renamed from: a */
    public void mo24561a(C4420b bVar, C4425g gVar, boolean z, int i, int i2, String str, String str2, List<String> list, List<C4434p> list2, String str3, C4426h hVar) {
        C4421c cVar = new C4421c(gVar, i, i2, str);
        cVar.f10874g = str2;
        if (list2 != null) {
            for (C4434p next : list2) {
                cVar.mo24613a(C4435q.m13617a(next.f10926a), next.f10927b);
            }
        }
        if (list != null) {
            for (String a : list) {
                cVar.mo24613a(C4435q.EVENT_CLICK, a);
            }
        }
        mo24563a(cVar, z);
        cVar.f10873f = str3;
        cVar.f10869b = hVar;
        bVar.f10864f.add(cVar);
    }

    /* renamed from: a */
    public boolean mo24563a(C4421c cVar, boolean z) {
        boolean z2 = false;
        if (!this.f10778h.isEmpty()) {
            C4424f fVar = null;
            if (z) {
                List<C4424f> list = this.f10778h;
                fVar = list.remove(list.size() - 1);
            }
            String str = cVar.f10872e;
            for (C4424f next : this.f10778h) {
                String str2 = next.f10885c;
                if ((str != null && str.equals(str2)) || (str2 == null && cVar.f10870c == next.f10883a.intValue() && cVar.f10871d == next.f10884b.intValue())) {
                    List<String> list2 = next.f10890h;
                    if (list2 != null) {
                        for (String next2 : list2) {
                            if (C5262d0.m16469f(next2)) {
                                cVar.mo24613a(C4435q.EVENT_CLICK, next2);
                            }
                        }
                    }
                    z2 = true;
                }
            }
            if (fVar != null) {
                this.f10778h.add(fVar);
            }
        }
        return z2;
    }
}
