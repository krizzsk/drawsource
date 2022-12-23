package com.mbridge.msdk.foundation.entity;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.authoritycontroller.C8395a;
import com.mbridge.msdk.foundation.same.C8469a;
import com.mbridge.msdk.foundation.tools.C8660r;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.foundation.tools.C8677z;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.mbridge.msdk.foundation.entity.m */
/* compiled from: VideoReportData */
public final class C8468m {

    /* renamed from: a */
    public static int f20702a = 1;

    /* renamed from: b */
    public static int f20703b;

    /* renamed from: A */
    private String f20704A;

    /* renamed from: B */
    private String f20705B;

    /* renamed from: C */
    private String f20706C;

    /* renamed from: D */
    private String f20707D;

    /* renamed from: E */
    private String f20708E;

    /* renamed from: F */
    private String f20709F;

    /* renamed from: G */
    private String f20710G;

    /* renamed from: H */
    private int f20711H = 0;

    /* renamed from: I */
    private int f20712I;

    /* renamed from: c */
    private String f20713c;

    /* renamed from: d */
    private String f20714d;

    /* renamed from: e */
    private String f20715e;

    /* renamed from: f */
    private String f20716f;

    /* renamed from: g */
    private int f20717g;

    /* renamed from: h */
    private String f20718h;

    /* renamed from: i */
    private int f20719i;

    /* renamed from: j */
    private int f20720j;

    /* renamed from: k */
    private int f20721k;

    /* renamed from: l */
    private String f20722l;

    /* renamed from: m */
    private String f20723m;

    /* renamed from: n */
    private int f20724n;

    /* renamed from: o */
    private int f20725o;

    /* renamed from: p */
    private String f20726p;

    /* renamed from: q */
    private long f20727q;

    /* renamed from: r */
    private int f20728r = 0;

    /* renamed from: s */
    private String f20729s;

    /* renamed from: t */
    private String f20730t;

    /* renamed from: u */
    private String f20731u;

    /* renamed from: v */
    private String f20732v;

    /* renamed from: w */
    private String f20733w;

    /* renamed from: x */
    private String f20734x;

    /* renamed from: y */
    private String f20735y;

    /* renamed from: z */
    private String f20736z;

    /* renamed from: a */
    public final String mo57815a() {
        return this.f20713c;
    }

    /* renamed from: a */
    public final void mo57817a(String str) {
        this.f20713c = str;
    }

    /* renamed from: b */
    public final String mo57818b() {
        return this.f20714d;
    }

    /* renamed from: b */
    public final void mo57820b(String str) {
        this.f20714d = str;
    }

    /* renamed from: c */
    public final String mo57821c() {
        return this.f20715e;
    }

    /* renamed from: c */
    public final void mo57823c(String str) {
        this.f20715e = URLEncoder.encode(str);
    }

    /* renamed from: d */
    public final String mo57824d() {
        return this.f20709F;
    }

    /* renamed from: d */
    public final void mo57826d(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                this.f20709F = URLEncoder.encode(str, "utf-8");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: e */
    public final String mo57827e() {
        return this.f20708E;
    }

    /* renamed from: e */
    public final void mo57828e(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                this.f20708E = URLEncoder.encode(str, "utf-8");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: f */
    public final String mo57829f() {
        return this.f20707D;
    }

    /* renamed from: f */
    public final void mo57830f(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                this.f20707D = URLEncoder.encode(str, "utf-8");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: g */
    public final String mo57831g() {
        return this.f20706C;
    }

    /* renamed from: g */
    public final void mo57832g(String str) {
        this.f20706C = str;
    }

    /* renamed from: h */
    public final String mo57833h() {
        return this.f20710G;
    }

    /* renamed from: h */
    public final void mo57834h(String str) {
        this.f20710G = str;
    }

    /* renamed from: i */
    public final String mo57835i() {
        return this.f20733w;
    }

    /* renamed from: i */
    public final void mo57836i(String str) {
        try {
            if (!TextUtils.isEmpty(str)) {
                this.f20733w = URLEncoder.encode(str, "utf-8");
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: j */
    public final void mo57838j(String str) {
        this.f20735y = str;
    }

    /* renamed from: a */
    public final void mo57816a(int i) {
        this.f20711H = i;
    }

    /* renamed from: j */
    public final int mo57837j() {
        return this.f20712I;
    }

    /* renamed from: b */
    public final void mo57819b(int i) {
        this.f20712I = i;
    }

    public C8468m(String str, int i, int i2, int i3, int i4, String str2, String str3, int i5, String str4, int i6, String str5) {
        this.f20716f = str;
        this.f20717g = i;
        this.f20718h = str5;
        this.f20719i = i2;
        this.f20720j = i3;
        this.f20721k = i4;
        try {
            if (!TextUtils.isEmpty(str2)) {
                this.f20722l = URLEncoder.encode(str2, "utf-8");
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        this.f20723m = str3;
        this.f20725o = i5;
        this.f20726p = str4;
        this.f20727q = (long) i6;
    }

    public C8468m() {
    }

    public C8468m(String str, int i, String str2, String str3, String str4) {
        this.f20716f = str;
        this.f20718h = str4;
        this.f20717g = i;
        try {
            if (!TextUtils.isEmpty(str2)) {
                this.f20722l = URLEncoder.encode(str2, "utf-8");
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        this.f20723m = str3;
    }

    public C8468m(String str, int i, int i2, String str2, int i3, String str3, int i4, String str4) {
        this.f20716f = str;
        this.f20717g = i;
        this.f20718h = str4;
        this.f20721k = i2;
        try {
            if (!TextUtils.isEmpty(str2)) {
                this.f20722l = URLEncoder.encode(str2, "utf-8");
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        this.f20725o = i3;
        this.f20726p = str3;
        this.f20727q = (long) i4;
    }

    public C8468m(Context context, CampaignEx campaignEx, int i, String str, long j, int i2) {
        if (i2 == 1) {
            this.f20716f = "2000022";
        } else if (i2 == 287 || i2 == 94) {
            this.f20716f = "2000022";
        } else if (i2 == 95) {
            this.f20716f = "2000025";
        }
        int o = C8660r.m24840o(context);
        this.f20717g = o;
        this.f20718h = C8660r.m24806a(context, o);
        this.f20721k = campaignEx.getVideoLength();
        try {
            this.f20722l = URLEncoder.encode(campaignEx.getNoticeUrl() == null ? campaignEx.getClickURL() : campaignEx.getNoticeUrl(), "utf-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f20725o = i;
        this.f20726p = str;
        this.f20727q = j == 0 ? (long) campaignEx.getVideoSize() : j;
    }

    public C8468m(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7) {
        this.f20716f = str;
        this.f20736z = str2;
        this.f20734x = str3;
        this.f20704A = str4;
        this.f20731u = str5;
        this.f20732v = str6;
        this.f20717g = i;
        this.f20718h = str7;
    }

    public C8468m(String str) {
        this.f20705B = str;
    }

    public C8468m(String str, int i, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f20716f = str;
        this.f20725o = i;
        this.f20726p = str2;
        try {
            if (!TextUtils.isEmpty(str3)) {
                this.f20707D = URLEncoder.encode(str3, "utf-8");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.f20732v = str4;
        this.f20731u = str5;
        this.f20723m = str6;
        this.f20706C = str7;
        if (Integer.valueOf(str2).intValue() > C8469a.f20752m) {
            this.f20725o = 2;
        }
    }

    public C8468m(String str, String str2, String str3, String str4, String str5, int i) {
        this.f20716f = str;
        this.f20732v = str2;
        this.f20729s = str3;
        this.f20730t = str4;
        this.f20731u = str5;
        this.f20717g = i;
    }

    public C8468m(String str, String str2, String str3, String str4, String str5, int i, int i2, String str6) {
        this.f20716f = str;
        this.f20732v = str2;
        this.f20729s = str3;
        this.f20730t = str4;
        this.f20731u = str5;
        this.f20717g = i;
        this.f20723m = str6;
        this.f20724n = i2;
    }

    /* renamed from: k */
    public final String mo57839k() {
        return this.f20729s;
    }

    /* renamed from: k */
    public final void mo57840k(String str) {
        this.f20729s = str;
    }

    /* renamed from: l */
    public final String mo57841l() {
        return this.f20730t;
    }

    /* renamed from: l */
    public final void mo57842l(String str) {
        this.f20730t = str;
    }

    /* renamed from: m */
    public final String mo57843m() {
        return this.f20731u;
    }

    /* renamed from: m */
    public final void mo57844m(String str) {
        this.f20731u = str;
    }

    /* renamed from: n */
    public final String mo57845n() {
        return this.f20732v;
    }

    /* renamed from: n */
    public final void mo57846n(String str) {
        this.f20732v = str;
    }

    /* renamed from: o */
    public final String mo57847o() {
        return this.f20716f;
    }

    /* renamed from: o */
    public final void mo57848o(String str) {
        this.f20716f = str;
    }

    /* renamed from: p */
    public final int mo57849p() {
        return this.f20720j;
    }

    /* renamed from: q */
    public final int mo57851q() {
        return this.f20721k;
    }

    /* renamed from: r */
    public final String mo57853r() {
        return this.f20722l;
    }

    /* renamed from: s */
    public final String mo57855s() {
        return TextUtils.isEmpty(this.f20723m) ? "" : this.f20723m;
    }

    /* renamed from: p */
    public final void mo57850p(String str) {
        this.f20723m = str;
    }

    /* renamed from: t */
    public final String mo57856t() {
        return this.f20726p;
    }

    /* renamed from: q */
    public final void mo57852q(String str) {
        this.f20726p = str;
    }

    /* renamed from: u */
    public final long mo57858u() {
        return this.f20727q;
    }

    /* renamed from: v */
    public final int mo57859v() {
        return this.f20717g;
    }

    /* renamed from: c */
    public final void mo57822c(int i) {
        this.f20717g = i;
    }

    /* renamed from: w */
    public final String mo57860w() {
        return this.f20718h;
    }

    /* renamed from: r */
    public final void mo57854r(String str) {
        this.f20718h = str;
    }

    /* renamed from: x */
    public final int mo57861x() {
        return this.f20719i;
    }

    /* renamed from: y */
    public final int mo57862y() {
        return this.f20725o;
    }

    /* renamed from: d */
    public final void mo57825d(int i) {
        this.f20725o = i;
    }

    /* renamed from: a */
    public static String m24195a(List<C8468m> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (C8468m next : list) {
            if (C8395a.m23879a().mo56941a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                stringBuffer.append("key=" + next.f20716f + "&");
                stringBuffer.append("network_type=" + next.f20717g + "&");
                stringBuffer.append("network_str=" + next.f20718h + "&");
                stringBuffer.append("reason=" + next.mo57855s() + "&");
                stringBuffer.append("cid=" + next.f20732v + "&");
                stringBuffer.append("video_url=" + next.f20708E + "&");
                stringBuffer.append("rid=" + next.f20729s + "&");
                stringBuffer.append("rid_n=" + next.f20730t + "&");
                stringBuffer.append("unit_id=" + next.f20731u + "&");
                StringBuilder sb = new StringBuilder();
                sb.append("offer_url=");
                sb.append(next.f20722l);
                stringBuffer.append(sb.toString());
                stringBuffer.append("\n");
            } else {
                stringBuffer.append("key=" + next.f20716f + "&");
                stringBuffer.append("reason=" + next.mo57855s() + "&");
                stringBuffer.append("cid=" + next.f20732v + "&");
                stringBuffer.append("video_url=" + next.f20708E + "&");
                stringBuffer.append("rid=" + next.f20729s + "&");
                stringBuffer.append("rid_n=" + next.f20730t + "&");
                stringBuffer.append("unit_id=" + next.f20731u + "&");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("offer_url=");
                sb2.append(next.f20722l);
                stringBuffer.append(sb2.toString());
                stringBuffer.append("\n");
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: b */
    public static String m24197b(List<C8468m> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        Iterator<C8468m> it = list.iterator();
        while (it.hasNext()) {
            C8468m next = it.next();
            Iterator<C8468m> it2 = it;
            if (C8395a.m23879a().mo56941a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                stringBuffer.append("key=" + next.f20716f + "&");
                stringBuffer.append("network_type=" + next.f20717g + "&");
                stringBuffer.append("network_str=" + next.f20718h + "&");
                stringBuffer.append("result=" + next.f20725o + "&");
                stringBuffer.append("duration=" + next.f20726p + "&");
                stringBuffer.append("video_size=" + next.f20727q + "&");
                stringBuffer.append("video_length=" + next.f20721k + "&");
                stringBuffer.append("reason=" + next.mo57855s() + "&");
                stringBuffer.append("cid=" + next.f20732v + "&");
                stringBuffer.append("video_url=" + next.f20708E + "&");
                stringBuffer.append("rid=" + next.f20729s + "&");
                stringBuffer.append("rid_n=" + next.f20730t + "&");
                stringBuffer.append("unit_id=" + next.f20731u + "&");
                stringBuffer.append("offer_url=" + next.f20722l + "&");
            } else {
                stringBuffer.append("key=" + next.f20716f + "&");
                stringBuffer.append("result=" + next.f20725o + "&");
                stringBuffer.append("duration=" + next.f20726p + "&");
                stringBuffer.append("video_size=" + next.f20727q + "&");
                stringBuffer.append("video_length=" + next.f20721k + "&");
                stringBuffer.append("reason=" + next.mo57855s() + "&");
                stringBuffer.append("cid=" + next.f20732v + "&");
                stringBuffer.append("video_url=" + next.f20708E + "&");
                stringBuffer.append("rid=" + next.f20729s + "&");
                stringBuffer.append("rid_n=" + next.f20730t + "&");
                stringBuffer.append("unit_id=" + next.f20731u + "&");
                stringBuffer.append("offer_url=" + next.f20722l + "&");
            }
            if (next.f20713c != null) {
                stringBuffer.append("resource_type=" + next.f20713c + "&");
            }
            if (next.f20715e != null) {
                stringBuffer.append("creative=" + next.f20715e + "&");
            }
            stringBuffer.append("\n");
            it = it2;
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static String m24194a(C8468m mVar) {
        if (mVar == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=" + mVar.f20716f + "&");
        stringBuffer.append("cid=" + mVar.f20732v + "&");
        stringBuffer.append("unit_id=" + mVar.f20731u + "&");
        stringBuffer.append("network_type=" + mVar.f20717g + "&");
        stringBuffer.append("rid=" + mVar.f20729s + "&");
        stringBuffer.append("rid_n=" + mVar.f20730t + "&");
        StringBuilder sb = new StringBuilder();
        sb.append("reason=");
        sb.append(mVar.mo57855s());
        stringBuffer.append(sb.toString());
        stringBuffer.append("\n");
        return stringBuffer.toString();
    }

    /* renamed from: b */
    public static String m24196b(C8468m mVar) {
        if (mVar == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=" + mVar.f20716f + "&");
        stringBuffer.append("cid=" + mVar.f20732v + "&");
        stringBuffer.append("unit_id=" + mVar.f20731u + "&");
        stringBuffer.append("network_type=" + mVar.f20717g + "&");
        stringBuffer.append("mraid_type=" + mVar.f20711H + "&");
        stringBuffer.append("rid_n=" + mVar.f20730t + "&");
        StringBuilder sb = new StringBuilder();
        sb.append("rid=");
        sb.append(mVar.f20729s);
        stringBuffer.append(sb.toString());
        stringBuffer.append("\n");
        return stringBuffer.toString();
    }

    /* renamed from: c */
    public static String m24198c(C8468m mVar) {
        if (mVar == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=" + mVar.f20716f + "&");
        stringBuffer.append("result=" + mVar.f20725o + "&");
        stringBuffer.append("duration=" + mVar.f20726p + "&");
        stringBuffer.append("cid=" + mVar.f20732v + "&");
        stringBuffer.append("reason=" + mVar.mo57855s() + "&");
        stringBuffer.append("ad_type=" + mVar.f20710G + "&");
        stringBuffer.append("unit_id=" + mVar.f20731u + "&");
        stringBuffer.append("devid=" + mVar.f20714d + "&");
        stringBuffer.append("mraid_type=" + mVar.f20711H + "&");
        stringBuffer.append("network_type=" + mVar.f20717g + "&");
        if (!TextUtils.isEmpty(mVar.f20707D)) {
            stringBuffer.append("endcard_url=" + mVar.f20707D + "&");
        }
        if (!TextUtils.isEmpty(mVar.f20706C)) {
            stringBuffer.append("type=" + mVar.f20706C + "&");
        }
        if (mVar.f20713c != null) {
            stringBuffer.append("resource_type=" + mVar.f20713c + "&");
        }
        stringBuffer.append("rid_n=" + mVar.f20730t + "&");
        StringBuilder sb = new StringBuilder();
        sb.append("rid=");
        sb.append(mVar.f20729s);
        stringBuffer.append(sb.toString());
        stringBuffer.append("\n");
        return stringBuffer.toString();
    }

    /* renamed from: d */
    public static String m24200d(C8468m mVar) {
        if (mVar == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=" + mVar.f20716f + "&");
        stringBuffer.append("result=" + mVar.f20725o + "&");
        stringBuffer.append("duration=" + mVar.f20726p + "&");
        stringBuffer.append("cid=" + mVar.f20732v + "&");
        stringBuffer.append("unit_id=" + mVar.f20731u + "&");
        stringBuffer.append("reason=" + mVar.mo57855s() + "&");
        stringBuffer.append("ad_type=" + mVar.f20710G + "&");
        stringBuffer.append("rid=" + mVar.f20729s + "&");
        stringBuffer.append("rid_n=" + mVar.f20730t + "&");
        stringBuffer.append("network_type=" + mVar.f20717g + "&");
        stringBuffer.append("mraid_type=" + mVar.f20711H + "&");
        stringBuffer.append("devid=" + mVar.f20714d + "&");
        if (mVar.f20713c != null) {
            stringBuffer.append("resource_type=" + mVar.f20713c + "&");
        }
        if (!TextUtils.isEmpty(mVar.f20707D)) {
            stringBuffer.append("endcard_url=" + mVar.f20707D + "&");
        }
        stringBuffer.append("type=" + mVar.f20706C);
        return stringBuffer.toString();
    }

    /* renamed from: c */
    public static String m24199c(List<C8468m> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (C8468m next : list) {
            stringBuffer.append("key=" + next.f20716f + "&");
            stringBuffer.append("result=" + next.f20725o + "&");
            stringBuffer.append("duration=" + next.f20726p + "&");
            stringBuffer.append("endcard_url=" + next.f20707D + "&");
            stringBuffer.append("cid=" + next.f20732v + "&");
            stringBuffer.append("unit_id=" + next.f20731u + "&");
            stringBuffer.append("reason=" + next.mo57855s() + "&");
            stringBuffer.append("ad_type=" + next.f20710G + "&");
            stringBuffer.append("rid=" + next.f20729s + "&");
            stringBuffer.append("rid_n=" + next.f20730t + "&");
            stringBuffer.append("type=" + next.f20706C + "&");
            StringBuilder sb = new StringBuilder();
            sb.append("adspace_t=");
            sb.append(next.f20712I);
            stringBuffer.append(sb.toString());
            stringBuffer.append("\n");
        }
        return stringBuffer.toString();
    }

    /* renamed from: d */
    public static String m24201d(List<C8468m> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (C8468m next : list) {
            if (C8395a.m23879a().mo56941a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                stringBuffer.append("key=" + next.f20716f + "&");
                stringBuffer.append("network_type=" + next.f20717g + "&");
                stringBuffer.append("result=" + next.f20725o + "&");
                stringBuffer.append("cid=" + next.f20732v + "&");
                stringBuffer.append("template_url=" + next.f20733w + "&");
                stringBuffer.append("reason=" + next.mo57855s() + "&");
                stringBuffer.append("rid=" + next.f20729s + "&");
                stringBuffer.append("rid_n=" + next.f20730t + "&");
                stringBuffer.append("unit_id=" + next.f20731u + "&");
                stringBuffer.append("\n");
            } else {
                stringBuffer.append("key=" + next.f20716f + "&");
                stringBuffer.append("result=" + next.f20725o + "&");
                stringBuffer.append("cid=" + next.f20732v + "&");
                stringBuffer.append("template_url=" + next.f20733w + "&");
                stringBuffer.append("reason=" + next.mo57855s() + "&");
                stringBuffer.append("rid=" + next.f20729s + "&");
                stringBuffer.append("rid_n=" + next.f20730t + "&");
                stringBuffer.append("unit_id=" + next.f20731u + "&");
                stringBuffer.append("\n");
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: e */
    public static String m24203e(List<C8468m> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (C8468m next : list) {
            if (C8395a.m23879a().mo56941a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                stringBuffer.append("key=" + next.f20716f + "&");
                stringBuffer.append("network_type=" + next.f20717g + "&");
                stringBuffer.append("cid=" + next.f20732v + "&");
                stringBuffer.append("image_url=" + next.f20709F + "&");
                stringBuffer.append("reason=" + next.mo57855s() + "&");
                stringBuffer.append("rid=" + next.f20729s + "&");
                stringBuffer.append("rid_n=" + next.f20730t + "&");
                stringBuffer.append("unit_id=" + next.f20731u + "&");
                stringBuffer.append("\n");
            } else {
                stringBuffer.append("key=" + next.f20716f + "&");
                stringBuffer.append("cid=" + next.f20732v + "&");
                stringBuffer.append("image_url=" + next.f20709F + "&");
                stringBuffer.append("reason=" + next.mo57855s() + "&");
                stringBuffer.append("rid=" + next.f20729s + "&");
                stringBuffer.append("rid_n=" + next.f20730t + "&");
                stringBuffer.append("unit_id=" + next.f20731u + "&");
                stringBuffer.append("\n");
            }
        }
        return stringBuffer.toString();
    }

    /* renamed from: e */
    public static String m24202e(C8468m mVar) {
        if (mVar == null) {
            return null;
        }
        try {
            StringBuffer stringBuffer = new StringBuffer();
            if (C8395a.m23879a().mo56941a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                stringBuffer.append("key=" + mVar.f20716f + "&");
                stringBuffer.append("error=" + C8677z.m24931c(mVar.f20735y) + "&");
                stringBuffer.append("template_url=" + C8677z.m24931c(mVar.f20733w) + "&");
                stringBuffer.append("unit_id=" + C8677z.m24931c(mVar.f20731u) + "&");
                stringBuffer.append("cid=" + C8677z.m24931c(mVar.f20732v) + "&");
                stringBuffer.append("network_str=" + mVar.f20718h + "&");
                StringBuilder sb = new StringBuilder();
                sb.append("network_type=");
                sb.append(mVar.f20717g);
                stringBuffer.append(sb.toString());
            } else {
                stringBuffer.append("key=" + mVar.f20716f + "&");
                stringBuffer.append("error=" + C8677z.m24931c(mVar.f20735y) + "&");
                stringBuffer.append("template_url=" + C8677z.m24931c(mVar.f20733w) + "&");
                stringBuffer.append("unit_id=" + C8677z.m24931c(mVar.f20731u) + "&");
                stringBuffer.append("cid=" + C8677z.m24931c(mVar.f20732v) + "&");
            }
            return stringBuffer.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: f */
    public static String m24204f(C8468m mVar) {
        if (mVar == null) {
            return null;
        }
        try {
            StringBuffer stringBuffer = new StringBuffer();
            if (C8395a.m23879a().mo56941a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                stringBuffer.append("key=" + mVar.f20716f + "&");
                stringBuffer.append("event=" + C8677z.m24931c(mVar.f20736z) + "&");
                stringBuffer.append("template=" + C8677z.m24931c(mVar.f20734x) + "&");
                stringBuffer.append("layout=" + C8677z.m24931c(mVar.f20704A) + "&");
                stringBuffer.append("unit_id=" + C8677z.m24931c(mVar.f20731u) + "&");
                stringBuffer.append("cid=" + C8677z.m24931c(mVar.f20732v) + "&");
                stringBuffer.append("network_str=" + mVar.f20718h + "&");
                StringBuilder sb = new StringBuilder();
                sb.append("network_type=");
                sb.append(mVar.f20717g);
                stringBuffer.append(sb.toString());
            } else {
                stringBuffer.append("key=" + mVar.f20716f + "&");
                stringBuffer.append("event=" + C8677z.m24931c(mVar.f20736z) + "&");
                stringBuffer.append("template=" + C8677z.m24931c(mVar.f20734x) + "&");
                stringBuffer.append("layout=" + C8677z.m24931c(mVar.f20704A) + "&");
                stringBuffer.append("unit_id=" + C8677z.m24931c(mVar.f20731u) + "&");
                stringBuffer.append("cid=" + C8677z.m24931c(mVar.f20732v) + "&");
            }
            return stringBuffer.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: f */
    public static String m24205f(List<C8468m> list) {
        if (list == null) {
            return null;
        }
        try {
            if (list.size() <= 0) {
                return null;
            }
            StringBuffer stringBuffer = new StringBuffer();
            for (C8468m mVar : list) {
                stringBuffer.append(mVar.f20705B);
                stringBuffer.append("\n");
            }
            return stringBuffer.toString();
        } catch (Throwable th) {
            C8672v.m24875a("VideoReportData", th.getMessage(), th);
            return null;
        }
    }

    /* renamed from: g */
    public static String m24206g(C8468m mVar) {
        if (mVar == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=" + mVar.f20716f + "&");
        stringBuffer.append("cid=" + mVar.f20732v + "&");
        stringBuffer.append("rid=" + mVar.f20729s + "&");
        stringBuffer.append("rid_n=" + mVar.f20730t + "&");
        stringBuffer.append("unit_id=" + mVar.f20731u + "&");
        stringBuffer.append("network_type=" + mVar.f20717g + "&");
        stringBuffer.append("mraid_type=" + mVar.f20711H + "&");
        stringBuffer.append("platform=1");
        return stringBuffer.toString();
    }

    /* renamed from: h */
    public static String m24207h(C8468m mVar) {
        if (mVar == null) {
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("key=" + mVar.f20716f + "&");
        stringBuffer.append("cid=" + mVar.f20732v + "&");
        stringBuffer.append("rid=" + mVar.f20729s + "&");
        stringBuffer.append("rid_n=" + mVar.f20730t + "&");
        stringBuffer.append("unit_id=" + mVar.f20731u + "&");
        stringBuffer.append("reason=" + mVar.mo57855s() + "&");
        stringBuffer.append("case=" + mVar.f20724n + "&");
        StringBuilder sb = new StringBuilder();
        sb.append("network_type=");
        sb.append(mVar.f20717g);
        stringBuffer.append(sb.toString());
        return stringBuffer.toString();
    }

    public final String toString() {
        return "RewardReportData [key=" + this.f20716f + ", networkType=" + this.f20717g + ", isCompleteView=" + this.f20719i + ", watchedMillis=" + this.f20720j + ", videoLength=" + this.f20721k + ", offerUrl=" + this.f20722l + ", reason=" + this.f20723m + ", result=" + this.f20725o + ", duration=" + this.f20726p + ", videoSize=" + this.f20727q + "]";
    }
}
