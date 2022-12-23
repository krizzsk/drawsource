package com.saygames.saypromo.p378a;

import com.saygames.saypromo.SayPromo;
import com.saygames.saypromo.SayPromoAd;
import com.saygames.saypromo.SayPromoAdvertisingIdCallback;
import com.saygames.saypromo.SayPromoTokenCallback;
import kotlin.coroutines.Continuation;
import kotlin.reflect.KProperty;

/* renamed from: com.saygames.saypromo.a.a5 */
public final class C10561a5 implements SayPromo {

    /* renamed from: i */
    static final /* synthetic */ KProperty[] f26059i;

    /* renamed from: a */
    private final C10491Q4 f26060a;

    /* renamed from: b */
    private final C10491Q4 f26061b;

    /* renamed from: c */
    private final C10491Q4 f26062c;

    /* renamed from: d */
    private final C10491Q4 f26063d;

    /* renamed from: e */
    private final C10491Q4 f26064e;

    /* renamed from: f */
    private final C10491Q4 f26065f;

    /* renamed from: g */
    private final C10380A5 f26066g;

    /* renamed from: h */
    final /* synthetic */ C10622i2 f26067h;

    static {
        Class<C10561a5> cls = C10561a5.class;
        f26059i = new KProperty[]{C10532W4.m30277a(cls, "advertisingManager", "getAdvertisingManager()Lcom/saygames/saypromo/manager/AdvertisingManager;", 0), C10532W4.m30277a(cls, "cacheDirectoryManager", "getCacheDirectoryManager()Lcom/saygames/saypromo/manager/CacheDirectoryManager;", 0), C10532W4.m30277a(cls, "deviceIdManager", "getDeviceIdManager()Lcom/saygames/saypromo/manager/DeviceIdManager;", 0), C10532W4.m30277a(cls, "idGenerator", "getIdGenerator()Lcom/saygames/saypromo/common/IdGenerator;", 0), C10532W4.m30277a(cls, "taskScopeFactory", "getTaskScopeFactory()Lcom/saygames/saypromo/common/TaskScopeFactory;", 0), C10532W4.m30277a(cls, "tokenLoader", "getTokenLoader()Lcom/saygames/saypromo/common/TokenLoader;", 0)};
    }

    C10561a5(C10607g3 g3Var) {
        this.f26067h = g3Var;
        this.f26060a = g3Var.mo65463c();
        this.f26061b = g3Var.mo65464d();
        this.f26062c = g3Var.mo65466f();
        this.f26063d = g3Var.mo65469i();
        this.f26064e = g3Var.mo65472l();
        this.f26065f = g3Var.mo65474n();
        C10380A5 a = ((C10725v5) m30342e()).mo65546a();
        this.f26066g = a;
        a.mo65246a(new C10539X4(this, (Continuation) null));
        a.mo65246a(new C10546Y4(this, (Continuation) null));
    }

    /* renamed from: a */
    private final C10525V4 m30337a(String str, String str2, String str3) {
        C10511T4 a = C10518U4.m30273a();
        C10633j5 a2 = C10641k5.m30490a(((C10607g3) this.f26067h).mo65461a(), ((C10607g3) this.f26067h).mo65462b(), ((C10607g3) this.f26067h).mo65465e(), ((C10607g3) this.f26067h).mo65467g(), ((C10607g3) this.f26067h).mo65468h(), ((C10607g3) this.f26067h).mo65472l(), ((C10607g3) this.f26067h).mo65473m());
        ((C10568b4) m30341d()).getClass();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 20; i++) {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt((int) (Math.random() * ((double) 62))));
        }
        String sb2 = sb.toString();
        return new C10525V4(C10711t5.m30576a(a, a2, new C10665n5(str, str2, sb2, sb2, str3)));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final C10637k1 m30338b() {
        C10491Q4 q4 = this.f26061b;
        KProperty kProperty = f26059i[1];
        return (C10637k1) q4.mo65365a();
    }

    /* renamed from: c */
    private final C10623i3 m30340c() {
        C10491Q4 q4 = this.f26062c;
        KProperty kProperty = f26059i[2];
        return (C10623i3) q4.mo65365a();
    }

    /* renamed from: d */
    private final C10560a4 m30341d() {
        C10491Q4 q4 = this.f26063d;
        KProperty kProperty = f26059i[3];
        return (C10560a4) q4.mo65365a();
    }

    /* renamed from: e */
    private final C10718u5 m30342e() {
        C10491Q4 q4 = this.f26064e;
        KProperty kProperty = f26059i[4];
        return (C10718u5) q4.mo65365a();
    }

    /* renamed from: f */
    private final C10457L5 m30343f() {
        C10491Q4 q4 = this.f26065f;
        KProperty kProperty = f26059i[5];
        return (C10457L5) q4.mo65365a();
    }

    public final SayPromoAd createAd(String str, String str2) {
        String b = C10485P5.m30223b(str);
        if (b != null) {
            String b2 = C10485P5.m30223b(str2);
            if (b2 != null) {
                return m30337a(b, b2, (String) null);
            }
            throw new IllegalArgumentException("placeId is null or blank");
        }
        throw new IllegalArgumentException("appId is null or blank");
    }

    public final SayPromoAd createAd(String str, String str2, String str3) {
        String b = C10485P5.m30223b(str);
        if (b != null) {
            String b2 = C10485P5.m30223b(str2);
            if (b2 != null) {
                String b3 = C10485P5.m30223b(str3);
                if (b3 != null) {
                    return m30337a(b, b2, b3);
                }
                throw new IllegalArgumentException("bidResponse is null or blank");
            }
            throw new IllegalArgumentException("placeId is null or blank");
        }
        throw new IllegalArgumentException("appId is null or blank");
    }

    public final String generateId(int i) {
        ((C10568b4) m30341d()).getClass();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt((int) (Math.random() * ((double) 62))));
        }
        return sb.toString();
    }

    public final void loadAdvertisingId(SayPromoAdvertisingIdCallback sayPromoAdvertisingIdCallback) {
        C10485P5.m30222a(sayPromoAdvertisingIdCallback, "callback");
        this.f26066g.mo65246a(new C10553Z4(this, sayPromoAdvertisingIdCallback, (Continuation) null));
    }

    public final void loadToken(String str, String str2, SayPromoTokenCallback sayPromoTokenCallback) {
        C10485P5.m30222a(sayPromoTokenCallback, "callback");
        String b = C10485P5.m30223b(str);
        if (b != null) {
            String b2 = C10485P5.m30223b(str2);
            if (b2 != null) {
                ((C10471N5) m30343f()).mo65359a(b, b2, sayPromoTokenCallback);
                return;
            }
            throw new IllegalArgumentException("placeId is null or blank");
        }
        throw new IllegalArgumentException("appId is null or blank");
    }

    public final void setDeviceId(String str) {
        String b = C10485P5.m30223b(str);
        if (b != null) {
            ((C10631j3) m30340c()).mo65485a(b);
            return;
        }
        throw new IllegalArgumentException("deviceId is null or blank");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final C10466N0 m30335a() {
        C10491Q4 q4 = this.f26060a;
        KProperty kProperty = f26059i[0];
        return (C10466N0) q4.mo65365a();
    }
}
