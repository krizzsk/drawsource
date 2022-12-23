package com.mbridge.msdk.foundation.entity;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.controller.authoritycontroller.C8395a;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.mbridge.msdk.foundation.entity.d */
/* compiled from: ClickTime */
public final class C8459d {

    /* renamed from: a */
    private String f20625a;

    /* renamed from: b */
    private String f20626b;

    /* renamed from: c */
    private String f20627c;

    /* renamed from: d */
    private String f20628d;

    /* renamed from: e */
    private String f20629e;

    /* renamed from: f */
    private int f20630f;

    /* renamed from: g */
    private String f20631g;

    /* renamed from: h */
    private String f20632h;

    /* renamed from: i */
    private String f20633i;

    /* renamed from: j */
    private int f20634j;

    /* renamed from: k */
    private int f20635k;

    /* renamed from: l */
    private String f20636l;

    /* renamed from: m */
    private int f20637m;

    /* renamed from: n */
    private int f20638n;

    /* renamed from: o */
    private String f20639o;

    /* renamed from: p */
    private int f20640p;

    /* renamed from: q */
    private String f20641q;

    /* renamed from: r */
    private int f20642r;

    public C8459d() {
    }

    public C8459d(String str, String str2, String str3, String str4, String str5, int i, String str6, String str7, String str8, int i2, int i3, String str9, int i4, int i5, String str10, int i6, int i7, String str11) {
        this.f20625a = str;
        this.f20626b = str2;
        this.f20627c = str3;
        this.f20628d = str4;
        this.f20629e = str5;
        this.f20630f = i;
        this.f20631g = str6;
        this.f20632h = str7;
        this.f20633i = str8;
        this.f20634j = i2;
        this.f20635k = i3;
        this.f20636l = str9;
        this.f20637m = i4;
        this.f20638n = i5;
        this.f20639o = str10;
        this.f20640p = i6;
        this.f20641q = str11;
        this.f20642r = i7;
    }

    /* renamed from: a */
    public final void mo57695a(int i) {
        this.f20640p = i;
    }

    /* renamed from: a */
    public final void mo57696a(String str) {
        this.f20641q = str;
    }

    /* renamed from: b */
    public final void mo57698b(String str) {
        this.f20636l = str;
    }

    /* renamed from: b */
    public final void mo57697b(int i) {
        this.f20637m = i;
    }

    /* renamed from: c */
    public final void mo57699c(int i) {
        this.f20638n = i;
    }

    /* renamed from: c */
    public final void mo57700c(String str) {
        this.f20639o = str;
    }

    /* renamed from: d */
    public final void mo57701d(int i) {
        this.f20635k = i;
    }

    /* renamed from: d */
    public final void mo57702d(String str) {
        this.f20631g = str;
    }

    /* renamed from: e */
    public final void mo57703e(int i) {
        this.f20630f = i;
    }

    /* renamed from: e */
    public final void mo57704e(String str) {
        this.f20632h = str;
    }

    /* renamed from: f */
    public final void mo57706f(String str) {
        this.f20633i = str;
    }

    /* renamed from: f */
    public final void mo57705f(int i) {
        this.f20634j = i;
    }

    /* renamed from: g */
    public final void mo57707g(String str) {
        this.f20629e = str;
    }

    /* renamed from: h */
    public final void mo57708h(String str) {
        this.f20627c = str;
    }

    /* renamed from: i */
    public final void mo57709i(String str) {
        this.f20628d = str;
    }

    /* renamed from: j */
    public final void mo57710j(String str) {
        this.f20625a = str;
    }

    /* renamed from: k */
    public final void mo57711k(String str) {
        this.f20626b = str;
    }

    /* renamed from: a */
    public static String m24074a(List<C8459d> list) {
        if (list == null || list.size() <= 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator<C8459d> it = list.iterator();
        while (it.hasNext()) {
            C8459d next = it.next();
            String str = next.f20636l;
            if (!TextUtils.isEmpty(str)) {
                String str2 = C8388a.f20464c.get(str);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("u_stid=");
                if (str2 == null) {
                    str2 = "";
                }
                sb2.append(str2);
                sb2.append("&");
                sb.append(sb2.toString());
            }
            Iterator<C8459d> it2 = it;
            String str3 = "\n";
            String str4 = "&click_time=";
            String str5 = "&link_type=";
            String str6 = "&landing_type=";
            if (C8395a.m23879a().mo56941a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                sb.append("rid=" + next.f20625a);
                sb.append("&rid_n=" + next.f20626b);
                sb.append("&network_type=" + next.f20640p);
                sb.append("&network_str=" + next.f20641q);
                sb.append("&cid=" + next.f20627c);
                sb.append("&click_type=" + next.f20635k);
                sb.append("&type=" + next.f20634j);
                sb.append("&click_duration=" + next.f20628d);
                sb.append("&key=2000013");
                sb.append("&unit_id=" + next.f20636l);
                sb.append("&last_url=" + next.f20629e);
                sb.append("&content=" + next.f20633i);
                sb.append("&code=" + next.f20630f);
                sb.append("&exception=" + next.f20631g);
                sb.append("&header=" + next.f20632h);
                sb.append(str6 + next.f20637m);
                sb.append(str5 + next.f20638n);
                sb.append(str4 + next.f20639o + str3);
            } else {
                sb.append("rid=" + next.f20625a);
                sb.append("&rid_n=" + next.f20626b);
                sb.append("&cid=" + next.f20627c);
                sb.append("&click_type=" + next.f20635k);
                sb.append("&type=" + next.f20634j);
                sb.append("&click_duration=" + next.f20628d);
                sb.append("&key=2000013");
                sb.append("&unit_id=" + next.f20636l);
                sb.append("&last_url=" + next.f20629e);
                sb.append("&content=" + next.f20633i);
                sb.append("&code=" + next.f20630f);
                sb.append("&exception=" + next.f20631g);
                sb.append("&header=" + next.f20632h);
                sb.append(str6 + next.f20637m);
                sb.append(str5 + next.f20638n);
                sb.append(str4 + next.f20639o + str3);
            }
            it = it2;
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m24073a(C8459d dVar) {
        C8459d dVar2 = dVar;
        if (dVar2 == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        String str = dVar2.f20629e;
        String str2 = "\n";
        String str3 = "&click_time=";
        String str4 = "&link_type=";
        if (C8395a.m23879a().mo56941a(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
            sb.append("rid=" + dVar2.f20625a);
            sb.append("&rid_n=" + dVar2.f20626b);
            sb.append("&network_type=" + dVar2.f20640p);
            sb.append("&network_str=" + dVar2.f20641q);
            sb.append("&click_type=" + dVar2.f20635k);
            sb.append("&type=" + dVar2.f20634j);
            sb.append("&cid=" + dVar2.f20627c);
            sb.append("&click_duration=" + dVar2.f20628d);
            sb.append("&key=2000012");
            sb.append("&unit_id=" + dVar2.f20636l);
            sb.append("&last_url=" + str);
            sb.append("&code=" + dVar2.f20630f);
            sb.append("&exception=" + dVar2.f20631g);
            sb.append("&landing_type=" + dVar2.f20637m);
            sb.append(str4 + dVar2.f20638n);
            sb.append(str3 + dVar2.f20639o + str2);
        } else {
            sb.append("rid=" + dVar2.f20625a);
            sb.append("&rid_n=" + dVar2.f20626b);
            sb.append("&click_type=" + dVar2.f20635k);
            sb.append("&type=" + dVar2.f20634j);
            sb.append("&cid=" + dVar2.f20627c);
            sb.append("&click_duration=" + dVar2.f20628d);
            sb.append("&key=2000012");
            sb.append("&unit_id=" + dVar2.f20636l);
            sb.append("&last_url=" + str);
            sb.append("&code=" + dVar2.f20630f);
            sb.append("&exception=" + dVar2.f20631g);
            sb.append("&landing_type=" + dVar2.f20637m);
            sb.append(str4 + dVar2.f20638n);
            sb.append(str3 + dVar2.f20639o + str2);
        }
        return sb.toString();
    }

    public final String toString() {
        return "ClickTime [campaignId=" + this.f20627c + ", click_duration=" + this.f20628d + ", lastUrl=" + this.f20629e + ", code=" + this.f20630f + ", excepiton=" + this.f20631g + ", header=" + this.f20632h + ", content=" + this.f20633i + ", type=" + this.f20634j + ", click_type=" + this.f20635k + "]";
    }
}
