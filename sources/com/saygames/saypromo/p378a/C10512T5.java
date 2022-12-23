package com.saygames.saypromo.p378a;

import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import kotlin.reflect.KProperty;

/* renamed from: com.saygames.saypromo.a.T5 */
public final class C10512T5 implements C10505S5 {

    /* renamed from: h */
    static final /* synthetic */ KProperty[] f25981h;

    /* renamed from: a */
    private final C10484P4 f25982a;

    /* renamed from: b */
    private final C10484P4 f25983b;

    /* renamed from: c */
    private final C10484P4 f25984c;

    /* renamed from: d */
    private final C10484P4 f25985d;

    /* renamed from: e */
    private final C10484P4 f25986e;

    /* renamed from: f */
    private final C10484P4 f25987f;

    /* renamed from: g */
    private final C10484P4 f25988g;

    static {
        Class<C10512T5> cls = C10512T5.class;
        f25981h = new KProperty[]{C10532W4.m30277a(cls, "advertisingManager", "getAdvertisingManager()Lcom/saygames/saypromo/manager/AdvertisingManager;", 0), C10532W4.m30277a(cls, "apiVersion", "getApiVersion()Lcom/saygames/saypromo/common/ApiVersion;", 0), C10532W4.m30277a(cls, "appInfo", "getAppInfo()Lcom/saygames/saypromo/common/AppInfo;", 0), C10532W4.m30277a(cls, "currentDuration", "getCurrentDuration()Lcom/saygames/saypromo/common/CurrentDuration;", 0), C10532W4.m30277a(cls, "dateTimeFormatter", "getDateTimeFormatter()Lcom/saygames/saypromo/common/DateTimeFormatter;", 0), C10532W4.m30277a(cls, "deviceIdManager", "getDeviceIdManager()Lcom/saygames/saypromo/manager/DeviceIdManager;", 0), C10532W4.m30277a(cls, "deviceInfo", "getDeviceInfo()Lcom/saygames/saypromo/common/DeviceInfo;", 0)};
    }

    C10512T5(C10491Q4 q4, C10491Q4 q42, C10491Q4 q43, C10491Q4 q44, C10491Q4 q45, C10491Q4 q46, C10491Q4 q47) {
        this.f25982a = q4;
        this.f25983b = q42;
        this.f25984c = q43;
        this.f25985d = q44;
        this.f25986e = q45;
        this.f25987f = q46;
        this.f25988g = q47;
    }

    /* renamed from: a */
    private final C10466N0 m30256a() {
        C10484P4 p4 = this.f25982a;
        KProperty kProperty = f25981h[0];
        return (C10466N0) ((C10491Q4) p4).mo65365a();
    }

    /* renamed from: a */
    private final C10492Q5 m30257a(C10492Q5 q5, long j, String str, String str2, String str3) {
        String a = ((C10582d2) m30261e()).mo65437a(j);
        C10492Q5 a2 = q5.mo65367a("appKey", str2);
        String b = ((C10549Z0) m30259c()).mo65407b();
        if (b == null) {
            b = "";
        }
        C10492Q5 a3 = a2.mo65367a("appVersion", b).mo65367a(TJAdUnitConstants.String.BUNDLE, ((C10549Z0) m30259c()).mo65406a()).mo65367a("device", ((C10663n3) m30263g()).mo65509d()).mo65367a("idfa", str).mo65367a("idfv", ((C10631j3) m30262f()).mo65486b()).mo65367a("locale", ((C10663n3) m30263g()).mo65508c()).mo65367a("os", ((C10663n3) m30263g()).mo65510e()).mo65367a("os_build", ((C10663n3) m30263g()).mo65507b()).mo65367a(TapjoyConstants.TJC_DEVICE_OS_VERSION_NAME, Integer.valueOf(((C10663n3) m30263g()).mo65506a()).toString()).mo65367a("place", str3).mo65367a("time", a);
        m30258b().getClass();
        Integer num = 16;
        return a3.mo65367a("version", num.toString());
    }

    /* renamed from: b */
    private final C10521V0 m30258b() {
        C10484P4 p4 = this.f25983b;
        KProperty kProperty = f25981h[1];
        return (C10521V0) ((C10491Q4) p4).mo65365a();
    }

    /* renamed from: c */
    private final C10542Y0 m30259c() {
        C10484P4 p4 = this.f25984c;
        KProperty kProperty = f25981h[2];
        return (C10542Y0) ((C10491Q4) p4).mo65365a();
    }

    /* renamed from: d */
    private final C10529W1 m30260d() {
        C10484P4 p4 = this.f25985d;
        KProperty kProperty = f25981h[3];
        return (C10529W1) ((C10491Q4) p4).mo65365a();
    }

    /* renamed from: e */
    private final C10574c2 m30261e() {
        C10484P4 p4 = this.f25986e;
        KProperty kProperty = f25981h[4];
        return (C10574c2) ((C10491Q4) p4).mo65365a();
    }

    /* renamed from: f */
    private final C10623i3 m30262f() {
        C10484P4 p4 = this.f25987f;
        KProperty kProperty = f25981h[5];
        return (C10623i3) ((C10491Q4) p4).mo65365a();
    }

    /* renamed from: g */
    private final C10647l3 m30263g() {
        C10484P4 p4 = this.f25988g;
        KProperty kProperty = f25981h[6];
        return (C10647l3) ((C10491Q4) p4).mo65365a();
    }

    /* renamed from: a */
    public final C10498R5 mo65388a(String str, String str2, String str3, String str4, String str5, long j, long j2) {
        String str6 = "";
        String str7 = str;
        C10492Q5 a = m30257a(new C10492Q5("https", "api.saypromo.net").mo65366a("ad").mo65366a("debug"), ((C10536X1) m30260d()).mo65397b(), ((C10487Q0) m30256a()).mo65364b().mo65360a(), str2 == null ? str6 : str2, str3 == null ? str6 : str3).mo65367a("event", str).mo65367a("id", str4 == null ? str6 : str4).mo65367a("int1", Long.valueOf(j).toString()).mo65367a("int2", Long.valueOf(j2).toString());
        if (str5 != null) {
            str6 = str5;
        }
        return a.mo65367a("str1", str6).mo65368a();
    }

    /* renamed from: a */
    public final C10498R5 mo65387a(String str, String str2) {
        long b = ((C10536X1) m30260d()).mo65397b();
        C10473O0 b2 = ((C10487Q0) m30256a()).mo65364b();
        C10655m3 f = ((C10663n3) m30263g()).mo65511f();
        return m30257a(new C10492Q5("https", "api.saypromo.net").mo65366a("ad").mo65366a("request"), b, b2.mo65360a(), str, str2).mo65367a("height", Integer.valueOf(f.mo65496a()).toString()).mo65367a("width", Integer.valueOf(f.mo65497b()).toString()).mo65367a("lat", Integer.valueOf(b2.mo65361b() ? 1 : 0).toString()).mo65368a();
    }
}
