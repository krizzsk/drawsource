package com.tapjoy.internal;

import com.adjust.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyConstants;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.tapjoy.internal.hz */
public final class C11592hz {
    /* renamed from: a */
    public static String m31780a(C11450fc fcVar) {
        C11287bb b = new C11287bb().mo69698c().mo69692a("sdk").mo69697b(fcVar.f27393t).mo69692a("os_name").mo69697b(fcVar.f27384k).mo69692a("os_ver").mo69697b(fcVar.f27385l).mo69692a("device_id").mo69697b(fcVar.f27381h).mo69692a("device_maker").mo69697b(fcVar.f27382i).mo69692a("device_model").mo69697b(fcVar.f27383j).mo69692a(TapjoyConstants.TJC_PACKAGE_ID).mo69697b(fcVar.f27391r).mo69692a(TapjoyConstants.TJC_PACKAGE_SIGN).mo69697b(fcVar.f27392s).mo69692a("locale").mo69697b(fcVar.f27389p).mo69692a(TapjoyConstants.TJC_DEVICE_TIMEZONE).mo69697b(fcVar.f27390q);
        if (fcVar.f27386m != null) {
            b.mo69692a(TapjoyConstants.TJC_DEVICE_DISPLAY_DENSITY).mo69691a((Number) fcVar.f27386m);
        }
        if (fcVar.f27387n != null) {
            b.mo69692a(TapjoyConstants.TJC_DEVICE_DISPLAY_WIDTH).mo69691a((Number) fcVar.f27387n);
        }
        if (fcVar.f27388o != null) {
            b.mo69692a(TapjoyConstants.TJC_DEVICE_DISPLAY_HEIGHT).mo69691a((Number) fcVar.f27388o);
        }
        if (fcVar.f27380g != null) {
            b.mo69692a("mac").mo69697b(fcVar.f27380g);
        }
        if (fcVar.f27394u != null) {
            b.mo69692a(TapjoyConstants.TJC_DEVICE_COUNTRY_SIM).mo69697b(fcVar.f27394u);
        }
        if (fcVar.f27395v != null) {
            b.mo69692a("country_net").mo69697b(fcVar.f27395v);
        }
        if (fcVar.f27396w != null) {
            b.mo69692a("imei").mo69697b(fcVar.f27396w);
        }
        if (fcVar.f27397x != null) {
            b.mo69692a("android_id").mo69697b(fcVar.f27397x);
        }
        return b.mo69699d().toString();
    }

    /* renamed from: a */
    public static String m31776a(C11432ew ewVar) {
        C11287bb c = new C11287bb().mo69698c();
        if (ewVar.f27278e != null) {
            c.mo69692a(TapjoyConstants.TJC_PACKAGE_VERSION).mo69697b(ewVar.f27278e);
        }
        if (ewVar.f27279f != null) {
            c.mo69692a(TapjoyConstants.TJC_PACKAGE_REVISION).mo69691a((Number) ewVar.f27279f);
        }
        if (ewVar.f27280g != null) {
            c.mo69692a("data_ver").mo69697b(ewVar.f27280g);
        }
        if (ewVar.f27281h != null) {
            c.mo69692a(TapjoyConstants.TJC_INSTALLER).mo69697b(ewVar.f27281h);
        }
        if (ewVar.f27282i != null) {
            c.mo69692a(TapjoyConstants.TJC_STORE).mo69697b(ewVar.f27282i);
        }
        return c.mo69699d().toString();
    }

    /* renamed from: a */
    public static String m31781a(C11471fj fjVar) {
        return m31782a(fjVar, (C11435ex) null);
    }

    /* renamed from: a */
    private static String m31782a(C11471fj fjVar, C11435ex exVar) {
        String b;
        C11287bb c = new C11287bb().mo69698c();
        if (fjVar.f27512s != null) {
            c.mo69692a(TapjoyConstants.TJC_INSTALLED).mo69691a((Number) fjVar.f27512s);
        }
        if (fjVar.f27513t != null) {
            c.mo69692a("referrer").mo69697b(fjVar.f27513t);
        }
        if (fjVar.f27500G != null) {
            c.mo69692a("idfa").mo69697b(fjVar.f27500G);
            if (fjVar.f27501H != null && fjVar.f27501H.booleanValue()) {
                c.mo69692a("idfa_optout").mo69689a(1);
            }
        } else if (!(exVar == null || exVar.f27315r == null || !C11570hm.f27781a.equals(exVar.f27315r) || (b = C11589hx.m31771b()) == null)) {
            c.mo69692a("idfa").mo69697b(b);
            if (C11589hx.m31772c()) {
                c.mo69692a("idfa_optout").mo69689a(1);
            }
        }
        if (fjVar.f27514u != null) {
            c.mo69692a(TapjoyConstants.TJC_USER_WEEKLY_FREQUENCY).mo69689a((long) Math.max(fjVar.f27514u.intValue(), 1));
        }
        if (fjVar.f27515v != null) {
            c.mo69692a(TapjoyConstants.TJC_USER_MONTHLY_FREQUENCY).mo69689a((long) Math.max(fjVar.f27515v.intValue(), 1));
        }
        if (fjVar.f27516w.size() > 0) {
            ArrayList arrayList = new ArrayList(fjVar.f27516w.size());
            for (C11462fg next : fjVar.f27516w) {
                if (next.f27468h != null) {
                    arrayList.add(next.f27466f);
                }
            }
            if (!arrayList.isEmpty()) {
                c.mo69692a(Constants.PUSH).mo69688a();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    c.mo69697b((String) it.next());
                }
                c.mo69696b();
            }
        }
        c.mo69692a("session").mo69698c();
        if (fjVar.f27517x != null) {
            c.mo69692a("total_count").mo69691a((Number) fjVar.f27517x);
        }
        if (fjVar.f27518y != null) {
            c.mo69692a("total_length").mo69691a((Number) fjVar.f27518y);
        }
        if (fjVar.f27519z != null) {
            c.mo69692a("last_at").mo69691a((Number) fjVar.f27519z);
        }
        if (fjVar.f27494A != null) {
            c.mo69692a("last_length").mo69691a((Number) fjVar.f27494A);
        }
        c.mo69699d();
        c.mo69692a(FirebaseAnalytics.Event.PURCHASE).mo69698c();
        if (fjVar.f27495B != null) {
            c.mo69692a("currency").mo69697b(fjVar.f27495B);
        }
        if (fjVar.f27496C != null) {
            c.mo69692a("total_count").mo69691a((Number) fjVar.f27496C);
        }
        if (fjVar.f27497D != null) {
            c.mo69692a("total_price").mo69691a((Number) fjVar.f27497D);
        }
        if (fjVar.f27498E != null) {
            c.mo69692a("last_at").mo69691a((Number) fjVar.f27498E);
        }
        if (fjVar.f27499F != null) {
            c.mo69692a("last_price").mo69691a((Number) fjVar.f27499F);
        }
        c.mo69699d();
        if (fjVar.f27502I != null) {
            c.mo69692a("user_id").mo69697b(fjVar.f27502I);
        }
        if (fjVar.f27503J != null) {
            c.mo69692a(TapjoyConstants.TJC_USER_LEVEL).mo69691a((Number) fjVar.f27503J);
        }
        if (fjVar.f27504K != null) {
            c.mo69692a(TapjoyConstants.TJC_USER_FRIEND_COUNT).mo69691a((Number) fjVar.f27504K);
        }
        if (fjVar.f27505L != null) {
            c.mo69692a(TapjoyConstants.TJC_USER_VARIABLE_1).mo69697b(fjVar.f27505L);
        }
        if (fjVar.f27506M != null) {
            c.mo69692a(TapjoyConstants.TJC_USER_VARIABLE_2).mo69697b(fjVar.f27506M);
        }
        if (fjVar.f27507N != null) {
            c.mo69692a(TapjoyConstants.TJC_USER_VARIABLE_3).mo69697b(fjVar.f27507N);
        }
        if (fjVar.f27508O != null) {
            c.mo69692a(TapjoyConstants.TJC_USER_VARIABLE_4).mo69697b(fjVar.f27508O);
        }
        if (fjVar.f27509P != null) {
            c.mo69692a(TapjoyConstants.TJC_USER_VARIABLE_5).mo69697b(fjVar.f27509P);
        }
        if (fjVar.f27510Q.size() > 0) {
            c.mo69692a("tags").mo69693a((Collection) fjVar.f27510Q);
        }
        if (Boolean.TRUE.equals(fjVar.f27511R)) {
            c.mo69692a("push_optout").mo69689a(1);
        }
        return c.mo69699d().toString();
    }

    /* renamed from: a */
    private static String m31777a(C11435ex exVar, boolean z, boolean z2, boolean z3) {
        C11287bb b = new C11287bb().mo69698c().mo69692a("type").mo69697b(m31779a(exVar.f27311n)).mo69692a("name").mo69697b(exVar.f27312o);
        b.mo69692a("time");
        if (exVar.f27314q != null) {
            b.mo69691a((Number) exVar.f27313p);
            b.mo69692a("systime").mo69691a((Number) exVar.f27314q);
        } else if (!C11685u.m32056c() || exVar.f27315r == null || exVar.f27316s == null || !C11570hm.f27781a.equals(exVar.f27315r)) {
            b.mo69691a((Number) exVar.f27313p);
        } else {
            b.mo69689a(C11685u.m32052a(exVar.f27316s.longValue()));
            b.mo69692a("systime").mo69691a((Number) exVar.f27313p);
        }
        if (exVar.f27317t != null) {
            b.mo69692a("duration").mo69691a((Number) exVar.f27317t);
        }
        if (!z && exVar.f27318u != null) {
            b.mo69692a(TJAdUnitConstants.String.VIDEO_INFO).mo69690a((C11294bf) new C11295bg(m31780a(exVar.f27318u)));
        }
        if (!z2 && exVar.f27319v != null) {
            b.mo69692a(TapjoyConstants.TJC_APP_PLACEMENT).mo69690a((C11294bf) new C11295bg(m31776a(exVar.f27319v)));
        }
        if (!z3 && exVar.f27320w != null) {
            b.mo69692a("user").mo69690a((C11294bf) new C11295bg(m31782a(exVar.f27320w, exVar)));
        }
        if (exVar.f27322y != null) {
            b.mo69692a("event_seq").mo69691a((Number) exVar.f27322y);
        }
        if (exVar.f27323z != null) {
            C11287bb a = b.mo69692a("event_prev");
            C11441ez ezVar = exVar.f27323z;
            C11287bb b2 = new C11287bb().mo69698c().mo69692a("type").mo69697b(m31779a(ezVar.f27354e)).mo69692a("name").mo69697b(ezVar.f27355f);
            if (ezVar.f27356g != null) {
                b2.mo69692a("category").mo69697b(ezVar.f27356g);
            }
            a.mo69690a((C11294bf) new C11295bg(b2.mo69699d().toString()));
        }
        if (exVar.f27299A != null) {
            C11287bb a2 = b.mo69692a(FirebaseAnalytics.Event.PURCHASE);
            C11459ff ffVar = exVar.f27299A;
            C11287bb b3 = new C11287bb().mo69698c().mo69692a("product_id").mo69697b(ffVar.f27435h);
            if (ffVar.f27436i != null) {
                b3.mo69692a("product_quantity").mo69691a((Number) ffVar.f27436i);
            }
            if (ffVar.f27437j != null) {
                b3.mo69692a("product_price").mo69691a((Number) ffVar.f27437j);
            }
            if (ffVar.f27438k != null) {
                b3.mo69692a("product_price_currency").mo69697b(ffVar.f27438k);
            }
            if (ffVar.f27446s != null) {
                b3.mo69692a("currency_price").mo69697b(ffVar.f27446s);
            }
            if (ffVar.f27439l != null) {
                b3.mo69692a("product_type").mo69697b(ffVar.f27439l);
            }
            if (ffVar.f27440m != null) {
                b3.mo69692a("product_title").mo69697b(ffVar.f27440m);
            }
            if (ffVar.f27441n != null) {
                b3.mo69692a("product_description").mo69697b(ffVar.f27441n);
            }
            if (ffVar.f27442o != null) {
                b3.mo69692a("transaction_id").mo69697b(ffVar.f27442o);
            }
            if (ffVar.f27443p != null) {
                b3.mo69692a("transaction_state").mo69691a((Number) ffVar.f27443p);
            }
            if (ffVar.f27444q != null) {
                b3.mo69692a("transaction_date").mo69691a((Number) ffVar.f27444q);
            }
            if (ffVar.f27445r != null) {
                b3.mo69692a("campaign_id").mo69697b(ffVar.f27445r);
            }
            if (ffVar.f27447t != null) {
                b3.mo69692a("receipt").mo69697b(ffVar.f27447t);
            }
            if (ffVar.f27448u != null) {
                b3.mo69692a(InAppPurchaseMetaData.KEY_SIGNATURE).mo69697b(ffVar.f27448u);
            }
            a2.mo69690a((C11294bf) new C11295bg(b3.mo69699d().toString()));
        }
        if (exVar.f27300B != null) {
            b.mo69692a("exception").mo69697b(exVar.f27300B);
        }
        try {
            if (exVar.f27302D != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (exVar.f27301C != null) {
                    C11296bh.m30911b(exVar.f27301C).mo69709a((Map) linkedHashMap);
                }
                C11456fe feVar = exVar.f27302D;
                if (feVar.f27424d != null) {
                    linkedHashMap.put("fq7_change", feVar.f27424d);
                }
                if (feVar.f27425e != null) {
                    linkedHashMap.put("fq30_change", feVar.f27425e);
                }
                if (feVar.f27426f != null) {
                    linkedHashMap.put(TJAdUnitConstants.PARAM_PUSH_ID, feVar.f27426f);
                }
                b.mo69692a("meta").mo69694a((Map) linkedHashMap);
            } else if (exVar.f27301C != null) {
                b.mo69692a("meta").mo69690a((C11294bf) new C11295bg(exVar.f27301C));
            }
        } catch (IOException unused) {
        }
        if (exVar.f27307I != null) {
            b.mo69692a(TJAdUnitConstants.String.USAGE_TRACKER_DIMENSIONS).mo69690a((C11294bf) new C11295bg(exVar.f27307I));
        }
        if (exVar.f27308J != null) {
            b.mo69692a("count").mo69691a((Number) exVar.f27308J);
        }
        if (exVar.f27309K != null) {
            b.mo69692a("first_time").mo69691a((Number) exVar.f27309K);
        }
        if (exVar.f27310L != null) {
            b.mo69692a("last_time").mo69691a((Number) exVar.f27310L);
        }
        if (exVar.f27303E != null) {
            b.mo69692a("category").mo69697b(exVar.f27303E);
        }
        if (exVar.f27304F != null) {
            b.mo69692a("p1").mo69697b(exVar.f27304F);
        }
        if (exVar.f27305G != null) {
            b.mo69692a("p2").mo69697b(exVar.f27305G);
        }
        if (exVar.f27306H.size() > 0) {
            b.mo69692a(TJAdUnitConstants.String.USAGE_TRACKER_VALUES).mo69698c();
            for (C11447fb next : exVar.f27306H) {
                b.mo69692a(next.f27372e).mo69691a((Number) next.f27373f);
            }
            b.mo69699d();
        }
        return b.mo69699d().toString();
    }

    /* renamed from: a */
    public static String m31778a(C11438ey eyVar) {
        boolean z;
        boolean z2;
        C11287bb a = new C11287bb().mo69688a();
        C11450fc fcVar = null;
        C11432ew ewVar = null;
        C11471fj fjVar = null;
        for (C11435ex next : eyVar.f27350d) {
            boolean z3 = true;
            if (fcVar == null || !fcVar.equals(next.f27318u)) {
                fcVar = next.f27318u;
                z = false;
            } else {
                z = true;
            }
            if (ewVar == null || !ewVar.equals(next.f27319v)) {
                ewVar = next.f27319v;
                z2 = false;
            } else {
                z2 = true;
            }
            if (fjVar == null || !fjVar.equals(next.f27320w)) {
                fjVar = next.f27320w;
                z3 = false;
            }
            a.mo69690a((C11294bf) new C11295bg(m31777a(next, z, z2, z3)));
        }
        return a.mo69696b().toString();
    }

    /* renamed from: com.tapjoy.internal.hz$1 */
    static /* synthetic */ class C115931 {

        /* renamed from: a */
        static final /* synthetic */ int[] f27875a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.tapjoy.internal.fa[] r0 = com.tapjoy.internal.C11445fa.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27875a = r0
                com.tapjoy.internal.fa r1 = com.tapjoy.internal.C11445fa.APP     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f27875a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.tapjoy.internal.fa r1 = com.tapjoy.internal.C11445fa.CAMPAIGN     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f27875a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.tapjoy.internal.fa r1 = com.tapjoy.internal.C11445fa.CUSTOM     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f27875a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.tapjoy.internal.fa r1 = com.tapjoy.internal.C11445fa.USAGES     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11592hz.C115931.<clinit>():void");
        }
    }

    /* renamed from: a */
    private static String m31779a(C11445fa faVar) {
        int i = C115931.f27875a[faVar.ordinal()];
        if (i == 1) {
            return TapjoyConstants.TJC_APP_PLACEMENT;
        }
        if (i == 2) {
            return "campaign";
        }
        if (i == 3) {
            return "custom";
        }
        if (i == 4) {
            return "usages";
        }
        throw new RuntimeException();
    }
}
