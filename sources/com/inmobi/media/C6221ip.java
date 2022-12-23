package com.inmobi.media;

import android.content.Context;
import android.location.Location;
import com.facebook.AuthenticationTokenClaims;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: com.inmobi.media.ip */
/* compiled from: PublisherProvidedUserInfoDao */
public final class C6221ip {

    /* renamed from: a */
    private static int f15681a = Integer.MIN_VALUE;

    /* renamed from: b */
    private static boolean f15682b = false;

    /* renamed from: c */
    private static String f15683c = null;

    /* renamed from: d */
    private static String f15684d = null;

    /* renamed from: e */
    private static String f15685e = null;

    /* renamed from: f */
    private static String f15686f = null;

    /* renamed from: g */
    private static String f15687g = null;

    /* renamed from: h */
    private static String f15688h = null;

    /* renamed from: i */
    private static int f15689i = Integer.MIN_VALUE;

    /* renamed from: j */
    private static String f15690j;

    /* renamed from: k */
    private static String f15691k;

    /* renamed from: l */
    private static String f15692l;

    /* renamed from: m */
    private static String f15693m;

    /* renamed from: n */
    private static Location f15694n;

    /* renamed from: a */
    public static void m18470a() {
        m18471a(f15681a);
        m18473a(f15683c);
        m18477b(f15684d);
        m18480c(f15685e);
        m18482d(f15686f);
        m18484e(f15687g);
        m18486f(f15688h);
        m18476b(f15689i);
        m18488g(f15690j);
        m18490h(f15691k);
        m18492i(f15692l);
        m18494j(f15693m);
        m18472a(f15694n);
        m18483e();
        m18478b();
        m18485f();
        m18487g();
        m18489h();
        m18491i();
        m18493j();
        m18495k();
        m18496l();
        m18497m();
        m18498n();
        m18499o();
        m18500p();
        m18479c();
    }

    /* renamed from: a */
    public static void m18471a(int i) {
        Context c = C6183hw.m18324c();
        if (i != Integer.MIN_VALUE) {
            f15681a = i;
            if (c != null) {
                C6165hi.m18257a(c, "user_info_store").mo35367a("user_age", i);
            }
        }
    }

    /* renamed from: a */
    public static void m18474a(boolean z) {
        Context c = C6183hw.m18324c();
        f15682b = z;
        if (c != null) {
            C6165hi.m18257a(c, "user_info_store").mo35370a("user_age_restricted", z);
        }
    }

    /* renamed from: b */
    public static boolean m18478b() {
        Context c = C6183hw.m18324c();
        if (c != null) {
            f15682b = C6165hi.m18257a(c, "user_info_store").mo35373b("user_age_restricted", false);
        }
        return f15682b;
    }

    /* renamed from: e */
    private static int m18483e() {
        int i = f15681a;
        int i2 = Integer.MIN_VALUE;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        Context c = C6183hw.m18324c();
        if (c != null) {
            i2 = C6165hi.m18257a(c, "user_info_store").mo35374c("user_age");
        }
        f15681a = i2;
        return i2;
    }

    /* renamed from: a */
    public static void m18473a(String str) {
        Context c = C6183hw.m18324c();
        if (str != null) {
            f15683c = str;
            if (c != null) {
                C6165hi.m18257a(c, "user_info_store").mo35369a("user_age_group", str);
            }
        }
    }

    /* renamed from: f */
    private static String m18485f() {
        String str;
        String str2 = f15683c;
        if (str2 != null) {
            return str2;
        }
        Context c = C6183hw.m18324c();
        if (c == null) {
            str = null;
        } else {
            str = C6165hi.m18257a(c, "user_info_store").mo35372b("user_age_group");
        }
        f15683c = str;
        return str;
    }

    /* renamed from: b */
    public static void m18477b(String str) {
        Context c = C6183hw.m18324c();
        f15684d = str;
        if (c != null && str != null) {
            C6165hi.m18257a(c, "user_info_store").mo35369a("user_area_code", str);
        }
    }

    /* renamed from: g */
    private static String m18487g() {
        String str;
        String str2 = f15684d;
        if (str2 != null) {
            return str2;
        }
        Context c = C6183hw.m18324c();
        if (c == null) {
            str = null;
        } else {
            str = C6165hi.m18257a(c, "user_info_store").mo35372b("user_area_code");
        }
        f15684d = str;
        return str;
    }

    /* renamed from: c */
    public static void m18480c(String str) {
        Context c = C6183hw.m18324c();
        if (str != null) {
            f15685e = str;
            if (c != null) {
                C6165hi.m18257a(c, "user_info_store").mo35369a("user_post_code", str);
            }
        }
    }

    /* renamed from: h */
    private static String m18489h() {
        String str;
        String str2 = f15685e;
        if (str2 != null) {
            return str2;
        }
        Context c = C6183hw.m18324c();
        if (c == null) {
            str = null;
        } else {
            str = C6165hi.m18257a(c, "user_info_store").mo35372b("user_post_code");
        }
        f15685e = str;
        return str;
    }

    /* renamed from: d */
    public static void m18482d(String str) {
        Context c = C6183hw.m18324c();
        if (str != null) {
            f15686f = str;
            if (c != null) {
                C6165hi.m18257a(c, "user_info_store").mo35369a("user_city_code", str);
            }
        }
    }

    /* renamed from: i */
    private static String m18491i() {
        String str;
        String str2 = f15686f;
        if (str2 != null) {
            return str2;
        }
        Context c = C6183hw.m18324c();
        if (c == null) {
            str = null;
        } else {
            str = C6165hi.m18257a(c, "user_info_store").mo35372b("user_city_code");
        }
        f15686f = str;
        return str;
    }

    /* renamed from: j */
    private static String m18493j() {
        String str;
        String str2 = f15687g;
        if (str2 != null) {
            return str2;
        }
        Context c = C6183hw.m18324c();
        if (c == null) {
            str = null;
        } else {
            str = C6165hi.m18257a(c, "user_info_store").mo35372b("user_state_code");
        }
        f15687g = str;
        return str;
    }

    /* renamed from: e */
    public static void m18484e(String str) {
        Context c = C6183hw.m18324c();
        if (str != null) {
            f15687g = str;
            if (c != null) {
                C6165hi.m18257a(c, "user_info_store").mo35369a("user_state_code", str);
            }
        }
    }

    /* renamed from: f */
    public static void m18486f(String str) {
        Context c = C6183hw.m18324c();
        if (str != null) {
            f15688h = str;
            if (c != null) {
                C6165hi.m18257a(c, "user_info_store").mo35369a("user_country_code", str);
            }
        }
    }

    /* renamed from: k */
    private static String m18495k() {
        String str;
        String str2 = f15688h;
        if (str2 != null) {
            return str2;
        }
        Context c = C6183hw.m18324c();
        if (c == null) {
            str = null;
        } else {
            str = C6165hi.m18257a(c, "user_info_store").mo35372b("user_country_code");
        }
        f15688h = str;
        return str;
    }

    /* renamed from: b */
    public static void m18476b(int i) {
        Context c = C6183hw.m18324c();
        if (i != Integer.MIN_VALUE) {
            f15689i = i;
            if (c != null) {
                C6165hi.m18257a(c, "user_info_store").mo35367a("user_yob", i);
            }
        }
    }

    /* renamed from: l */
    private static int m18496l() {
        int i = f15689i;
        int i2 = Integer.MIN_VALUE;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        Context c = C6183hw.m18324c();
        if (c != null) {
            i2 = C6165hi.m18257a(c, "user_info_store").mo35374c("user_yob");
        }
        f15689i = i2;
        return i2;
    }

    /* renamed from: g */
    public static void m18488g(String str) {
        Context c = C6183hw.m18324c();
        if (str != null) {
            f15690j = str;
            if (c != null) {
                C6165hi.m18257a(c, "user_info_store").mo35369a(AuthenticationTokenClaims.JSON_KEY_USER_GENDER, str);
            }
        }
    }

    /* renamed from: m */
    private static String m18497m() {
        String str;
        String str2 = f15690j;
        if (str2 != null) {
            return str2;
        }
        Context c = C6183hw.m18324c();
        if (c == null) {
            str = null;
        } else {
            str = C6165hi.m18257a(c, "user_info_store").mo35372b(AuthenticationTokenClaims.JSON_KEY_USER_GENDER);
        }
        f15690j = str;
        return str;
    }

    /* renamed from: h */
    public static void m18490h(String str) {
        Context c = C6183hw.m18324c();
        if (str != null) {
            f15691k = str;
            if (c != null) {
                C6165hi.m18257a(c, "user_info_store").mo35369a("user_education", str);
            }
        }
    }

    /* renamed from: n */
    private static String m18498n() {
        String str;
        String str2 = f15691k;
        if (str2 != null) {
            return str2;
        }
        Context c = C6183hw.m18324c();
        if (c == null) {
            str = null;
        } else {
            str = C6165hi.m18257a(c, "user_info_store").mo35372b("user_education");
        }
        f15691k = str;
        return str;
    }

    /* renamed from: o */
    private static String m18499o() {
        String str;
        String str2 = f15692l;
        if (str2 != null) {
            return str2;
        }
        Context c = C6183hw.m18324c();
        if (c == null) {
            str = null;
        } else {
            str = C6165hi.m18257a(c, "user_info_store").mo35372b("user_language");
        }
        f15692l = str;
        return str;
    }

    /* renamed from: i */
    public static void m18492i(String str) {
        Context c = C6183hw.m18324c();
        if (str != null) {
            f15692l = str;
            if (c != null) {
                C6165hi.m18257a(c, "user_info_store").mo35369a("user_language", str);
            }
        }
    }

    /* renamed from: j */
    public static void m18494j(String str) {
        Context c = C6183hw.m18324c();
        if (str != null) {
            f15693m = str;
            if (c != null) {
                C6165hi.m18257a(c, "user_info_store").mo35369a("user_interest", str);
            }
        }
    }

    /* renamed from: p */
    private static String m18500p() {
        String str;
        String str2 = f15693m;
        if (str2 != null) {
            return str2;
        }
        Context c = C6183hw.m18324c();
        if (c == null) {
            str = null;
        } else {
            str = C6165hi.m18257a(c, "user_info_store").mo35372b("user_interest");
        }
        f15693m = str;
        return str;
    }

    /* renamed from: c */
    public static Location m18479c() {
        String b;
        Location location = f15694n;
        if (location != null) {
            return location;
        }
        Context c = C6183hw.m18324c();
        Location location2 = null;
        if (c == null || (b = C6165hi.m18257a(c, "user_info_store").mo35372b(AuthenticationTokenClaims.JSON_KEY_USER_LOCATION)) == null) {
            return null;
        }
        Location location3 = new Location("");
        try {
            String[] split = b.split(",");
            location3.setLatitude(Double.parseDouble(split[0]));
            location3.setLongitude(Double.parseDouble(split[1]));
            location3.setAccuracy(Float.parseFloat(split[2]));
            location3.setTime(Long.parseLong(split[3]));
            location2 = location3;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
        }
        f15694n = location2;
        return location2;
    }

    /* renamed from: a */
    public static void m18472a(Location location) {
        Context c = C6183hw.m18324c();
        if (location != null) {
            f15694n = location;
            if (c != null) {
                C6165hi.m18257a(c, "user_info_store").mo35369a(AuthenticationTokenClaims.JSON_KEY_USER_LOCATION, m18475b(location));
            }
        }
    }

    /* renamed from: d */
    public static HashMap<String, String> m18481d() {
        HashMap<String, String> hashMap = new HashMap<>();
        int e = m18483e();
        if (e > 0) {
            hashMap.put("u-age", String.valueOf(e));
        }
        int l = m18496l();
        if (l > 0) {
            hashMap.put("u-yearofbirth", String.valueOf(l));
        }
        String i = m18491i();
        String j = m18493j();
        String k = m18495k();
        String trim = (i == null || i.trim().length() == 0) ? "" : i.trim();
        if (!(j == null || j.trim().length() == 0)) {
            trim = trim + "-" + j.trim();
        }
        if (!(k == null || k.trim().length() == 0)) {
            trim = trim + "-" + k.trim();
        }
        if (!(trim == null || trim.trim().length() == 0)) {
            hashMap.put("u-location", trim);
        }
        String f = m18485f();
        if (f != null) {
            hashMap.put("u-agegroup", f.toLowerCase(Locale.ENGLISH));
        }
        String g = m18487g();
        if (g != null) {
            hashMap.put("u-areacode", g);
        }
        String h = m18489h();
        if (h != null) {
            hashMap.put("u-postalcode", h);
        }
        String m = m18497m();
        if (m != null) {
            hashMap.put("u-gender", m);
        }
        String n = m18498n();
        if (n != null) {
            hashMap.put("u-education", n);
        }
        String o = m18499o();
        if (o != null) {
            hashMap.put("u-language", o);
        }
        String p = m18500p();
        if (p != null) {
            hashMap.put("u-interests", p);
        }
        hashMap.put("u-age-restricted", String.valueOf(m18478b() ? 1 : 0));
        return hashMap;
    }

    /* renamed from: b */
    private static String m18475b(Location location) {
        return location.getLatitude() + "," + location.getLongitude() + "," + ((int) location.getAccuracy()) + "," + location.getTime();
    }
}
