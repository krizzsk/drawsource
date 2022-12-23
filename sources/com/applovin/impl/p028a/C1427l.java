package com.applovin.impl.p028a;

import android.net.Uri;
import android.webkit.URLUtil;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import com.applovin.impl.sdk.network.C2017h;
import com.applovin.impl.sdk.utils.C2098r;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.smaato.sdk.video.vast.model.Tracking;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* renamed from: com.applovin.impl.a.l */
public class C1427l {

    /* renamed from: a */
    private static final DateFormat f1631a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);

    /* renamed from: b */
    private static final Random f1632b = new Random(System.currentTimeMillis());

    /* renamed from: a */
    public static Uri m2483a(String str, long j, Uri uri, C1420f fVar, C1969m mVar) {
        if (URLUtil.isValidUrl(str)) {
            try {
                String num = Integer.toString(fVar.mo12905a());
                String replace = str.replace("[ERRORCODE]", num).replace("[REASON]", num);
                if (j >= 0) {
                    replace = replace.replace("[CONTENTPLAYHEAD]", m2486a(j));
                }
                if (uri != null) {
                    replace = replace.replace("[ASSETURI]", uri.toString());
                }
                return Uri.parse(replace.replace("[CACHEBUSTING]", m2485a()).replace("[TIMESTAMP]", m2498b()));
            } catch (Throwable th) {
                if (C2102v.m5104a()) {
                    C2102v A = mVar.mo14509A();
                    A.mo15013b("VastUtils", "Unable to replace macros in URL string " + str, th);
                }
                return null;
            }
        } else {
            if (C2102v.m5104a()) {
                mVar.mo14509A().mo15016e("VastUtils", "Unable to replace macros in invalid URL string.");
            }
            return null;
        }
    }

    /* renamed from: a */
    public static C1420f m2484a(C1411a aVar) {
        if (m2499b(aVar) || m2501c(aVar)) {
            return null;
        }
        return C1420f.GENERAL_WRAPPER_ERROR;
    }

    /* renamed from: a */
    private static String m2485a() {
        return Integer.toString(f1632b.nextInt(89999999) + 10000000);
    }

    /* renamed from: a */
    private static String m2486a(long j) {
        if (j <= 0) {
            return "00:00:00.000";
        }
        long hours = TimeUnit.SECONDS.toHours(j);
        long seconds = j % TimeUnit.MINUTES.toSeconds(1);
        return String.format(Locale.US, "%02d:%02d:%02d.000", new Object[]{Long.valueOf(hours), Long.valueOf(TimeUnit.SECONDS.toMinutes(j) % TimeUnit.MINUTES.toSeconds(1)), Long.valueOf(seconds)});
    }

    /* renamed from: a */
    public static String m2487a(C1419e eVar) {
        C2098r c;
        if (eVar != null) {
            List<C2098r> b = eVar.mo12898b();
            int size = eVar.mo12898b().size();
            if (size <= 0 || (c = b.get(size - 1).mo14992c("VASTAdTagURI")) == null) {
                return null;
            }
            return c.mo14993c();
        }
        throw new IllegalArgumentException("Unable to get resolution uri string for fetching the next wrapper or inline response in the chain");
    }

    /* renamed from: a */
    public static String m2488a(C2098r rVar, String str, String str2) {
        C2098r b = rVar.mo14990b(str);
        if (b != null) {
            String c = b.mo14993c();
            if (StringUtils.isValidString(c)) {
                return c;
            }
        }
        return str2;
    }

    /* renamed from: a */
    private static Set<C1425j> m2489a(C1419e eVar, C1969m mVar) {
        if (eVar == null) {
            return null;
        }
        List<C2098r> b = eVar.mo12898b();
        Set<C1425j> hashSet = new HashSet<>(b.size());
        for (C2098r next : b) {
            C2098r c = next.mo14992c("Wrapper");
            if (c == null) {
                c = next.mo14992c("InLine");
            }
            hashSet = m2490a(hashSet, c != null ? c.mo14989a("Error") : next.mo14989a("Error"), eVar, mVar);
        }
        if (C2102v.m5104a()) {
            C2102v A = mVar.mo14509A();
            A.mo15012b("VastUtils", "Retrieved " + hashSet.size() + " top level error trackers: " + hashSet);
        }
        return hashSet;
    }

    /* renamed from: a */
    private static Set<C1425j> m2490a(Set<C1425j> set, List<C2098r> list, C1419e eVar, C1969m mVar) {
        if (list != null) {
            for (C2098r a : list) {
                C1425j a2 = C1425j.m2479a(a, eVar, mVar);
                if (a2 != null) {
                    set.add(a2);
                }
            }
        }
        return set;
    }

    /* renamed from: a */
    public static void m2491a(C1419e eVar, AppLovinAdLoadListener appLovinAdLoadListener, C1420f fVar, int i, C1969m mVar) {
        if (mVar != null) {
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.failedToReceiveAd(i);
            }
            m2495a(m2489a(eVar, mVar), fVar, mVar);
            return;
        }
        throw new IllegalArgumentException("Unable to handle failure. No sdk specified.");
    }

    /* renamed from: a */
    public static void m2492a(C2098r rVar, Map<String, Set<C1425j>> map, C1419e eVar, C1969m mVar) {
        List<C2098r> a;
        if (mVar == null) {
            throw new IllegalArgumentException("Unable to render event trackers. No sdk specified.");
        } else if (rVar == null) {
            if (C2102v.m5104a()) {
                mVar.mo14509A().mo15016e("VastUtils", "Unable to render event trackers; null node provided");
            }
        } else if (map != null) {
            C2098r b = rVar.mo14990b("TrackingEvents");
            if (b != null && (a = b.mo14989a(Tracking.NAME)) != null) {
                for (C2098r next : a) {
                    String str = next.mo14991b().get("event");
                    if (StringUtils.isValidString(str)) {
                        C1425j a2 = C1425j.m2479a(next, eVar, mVar);
                        if (a2 != null) {
                            Set set = map.get(str);
                            if (set != null) {
                                set.add(a2);
                            } else {
                                HashSet hashSet = new HashSet();
                                hashSet.add(a2);
                                map.put(str, hashSet);
                            }
                        }
                    } else if (C2102v.m5104a()) {
                        C2102v A = mVar.mo14509A();
                        A.mo15016e("VastUtils", "Could not find event for tracking node = " + next);
                    }
                }
            }
        } else if (C2102v.m5104a()) {
            mVar.mo14509A().mo15016e("VastUtils", "Unable to render event trackers; null event trackers provided");
        }
    }

    /* renamed from: a */
    public static void m2493a(List<C2098r> list, Set<C1425j> set, C1419e eVar, C1969m mVar) {
        if (mVar == null) {
            throw new IllegalArgumentException("Unable to render trackers. No sdk specified.");
        } else if (list == null) {
            if (C2102v.m5104a()) {
                mVar.mo14509A().mo15016e("VastUtils", "Unable to render trackers; null nodes provided");
            }
        } else if (set != null) {
            for (C2098r a : list) {
                C1425j a2 = C1425j.m2479a(a, eVar, mVar);
                if (a2 != null) {
                    set.add(a2);
                }
            }
        } else if (C2102v.m5104a()) {
            mVar.mo14509A().mo15016e("VastUtils", "Unable to render trackers; null trackers provided");
        }
    }

    /* renamed from: a */
    public static void m2494a(Set<C1425j> set, long j, Uri uri, C1420f fVar, C1969m mVar) {
        if (mVar == null) {
            throw new IllegalArgumentException("Unable to fire trackers. No sdk specified.");
        } else if (set != null && !set.isEmpty()) {
            for (C1425j b : set) {
                Uri a = m2483a(b.mo12924b(), j, uri, fVar, mVar);
                if (a != null) {
                    mVar.mo14528U().mo14765a(C2017h.m4735o().mo14798c(a.toString()).mo14793a(false).mo14794a(), false);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m2495a(Set<C1425j> set, C1420f fVar, C1969m mVar) {
        m2494a(set, -1, (Uri) null, fVar, mVar);
    }

    /* renamed from: a */
    public static void m2496a(Set<C1425j> set, C1969m mVar) {
        m2494a(set, -1, (Uri) null, C1420f.UNSPECIFIED, mVar);
    }

    /* renamed from: a */
    public static boolean m2497a(C2098r rVar) {
        if (rVar != null) {
            return rVar.mo14992c("Wrapper") != null;
        }
        throw new IllegalArgumentException("Unable to check if a given XmlNode contains a wrapper response");
    }

    /* renamed from: b */
    private static String m2498b() {
        f1631a.setTimeZone(TimeZone.getDefault());
        return f1631a.format(new Date());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000a, code lost:
        r1 = (r1 = r1.mo12861m()).mo12929a();
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m2499b(com.applovin.impl.p028a.C1411a r1) {
        /*
            r0 = 0
            if (r1 != 0) goto L_0x0004
            return r0
        L_0x0004:
            com.applovin.impl.a.m r1 = r1.mo12861m()
            if (r1 == 0) goto L_0x0017
            java.util.List r1 = r1.mo12929a()
            if (r1 == 0) goto L_0x0017
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0017
            r0 = 1
        L_0x0017:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.p028a.C1427l.m2499b(com.applovin.impl.a.a):boolean");
    }

    /* renamed from: b */
    public static boolean m2500b(C2098r rVar) {
        if (rVar != null) {
            return rVar.mo14992c("InLine") != null;
        }
        throw new IllegalArgumentException("Unable to check if a given XmlNode contains an inline response");
    }

    /* renamed from: c */
    public static boolean m2501c(C1411a aVar) {
        C1418d aM;
        C1422h b;
        if (aVar == null || (aM = aVar.mo12836aM()) == null || (b = aM.mo12891b()) == null) {
            return false;
        }
        return b.mo12914b() != null || StringUtils.isValidString(b.mo12915c());
    }
}
