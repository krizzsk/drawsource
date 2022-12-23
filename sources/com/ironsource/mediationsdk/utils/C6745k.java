package com.ironsource.mediationsdk.utils;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.C6622d;
import com.ironsource.mediationsdk.C6630h;
import com.ironsource.mediationsdk.C6632i;
import com.ironsource.mediationsdk.C6756v;
import com.ironsource.mediationsdk.ISDemandOnlyBannerLayout;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.model.C6655f;
import com.ironsource.mediationsdk.model.C6656g;
import com.ironsource.mediationsdk.model.C6661l;
import com.ironsource.mediationsdk.model.C6663m;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.p206a.C6517c;
import com.ironsource.mediationsdk.p206a.C6518d;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.utils.k */
public class C6745k {

    /* renamed from: a */
    private ConcurrentHashMap<String, C6756v> f17637a = new ConcurrentHashMap<>();

    /* renamed from: b */
    private final Map<String, Object> f17638b;

    /* renamed from: com.ironsource.mediationsdk.utils.k$1 */
    static /* synthetic */ class C67461 {

        /* renamed from: a */
        static final /* synthetic */ int[] f17639a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.ironsource.mediationsdk.model.m[] r0 = com.ironsource.mediationsdk.model.C6663m.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f17639a = r0
                com.ironsource.mediationsdk.model.m r1 = com.ironsource.mediationsdk.model.C6663m.PER_DAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f17639a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.ironsource.mediationsdk.model.m r1 = com.ironsource.mediationsdk.model.C6663m.PER_HOUR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.utils.C6745k.C67461.<clinit>():void");
        }
    }

    /* renamed from: com.ironsource.mediationsdk.utils.k$a */
    public enum C6747a {
        ;
        

        /* renamed from: a */
        public static final int f17640a = 1;

        /* renamed from: b */
        public static final int f17641b = 2;

        /* renamed from: c */
        public static final int f17642c = 3;

        /* renamed from: d */
        public static final int f17643d = 4;

        static {
            f17644e = new int[]{1, 2, 3, 4};
        }

        /* renamed from: a */
        public static int[] m20459a() {
            return (int[]) f17644e.clone();
        }
    }

    public C6745k(List<NetworkSettings> list, C6655f fVar, String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        hashMap.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
        if (fVar.f17350h) {
            hashMap.put("isOneFlow", 1);
        }
        this.f17638b = hashMap;
        String sessionId = IronSourceUtils.getSessionId();
        boolean z = fVar.f17350h;
        C6630h hVar = new C6630h(new C6632i(fVar.f17349g, z, sessionId));
        for (NetworkSettings next : list) {
            if (next.getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.SUPERSONIC_CONFIG_NAME) || next.getProviderTypeForReflection().equalsIgnoreCase(IronSourceConstants.IRONSOURCE_CONFIG_NAME)) {
                AbstractAdapter a = C6622d.m20139a().mo36647a(next, next.getBannerSettings(), true, false);
                if (a != null) {
                    C6756v vVar = new C6756v(str, str2, next, fVar.f17344b, a);
                    vVar.f17795b = hVar;
                    vVar.mo35942a(z);
                    this.f17637a.put(vVar.mo35949g(), vVar);
                }
            } else {
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("cannot load " + next.getProviderTypeForReflection());
            }
        }
    }

    /* renamed from: a */
    private static int m20433a(Context context, String str, String str2) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!IronSourceUtils.getBooleanFromSharedPrefs(context, m20436a(str, "CappingManager.IS_DELIVERY_ENABLED", str2), true)) {
            return C6747a.f17640a;
        }
        if (IronSourceUtils.getBooleanFromSharedPrefs(context, m20436a(str, "CappingManager.IS_PACING_ENABLED", str2), false)) {
            if (currentTimeMillis - IronSourceUtils.getLongFromSharedPrefs(context, m20436a(str, "CappingManager.TIME_OF_THE_PREVIOUS_SHOW", str2), 0) < ((long) (IronSourceUtils.getIntFromSharedPrefs(context, m20436a(str, "CappingManager.SECONDS_BETWEEN_SHOWS", str2), 0) * 1000))) {
                return C6747a.f17642c;
            }
        }
        if (IronSourceUtils.getBooleanFromSharedPrefs(context, m20436a(str, "CappingManager.IS_CAPPING_ENABLED", str2), false)) {
            int intFromSharedPrefs = IronSourceUtils.getIntFromSharedPrefs(context, m20436a(str, "CappingManager.MAX_NUMBER_OF_SHOWS", str2), 0);
            String a = m20436a(str, "CappingManager.CURRENT_NUMBER_OF_SHOWS", str2);
            int intFromSharedPrefs2 = IronSourceUtils.getIntFromSharedPrefs(context, a, 0);
            String a2 = m20436a(str, "CappingManager.CAPPING_TIME_THRESHOLD", str2);
            if (currentTimeMillis >= IronSourceUtils.getLongFromSharedPrefs(context, a2, 0)) {
                IronSourceUtils.saveIntToSharedPrefs(context, a, 0);
                IronSourceUtils.saveLongToSharedPrefs(context, a2, 0);
            } else if (intFromSharedPrefs2 >= intFromSharedPrefs) {
                return C6747a.f17641b;
            }
        }
        return C6747a.f17643d;
    }

    /* renamed from: a */
    private static long m20434a(C6663m mVar) {
        Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        int i = C67461.f17639a[mVar.ordinal()];
        if (i == 1) {
            instance.set(14, 0);
            instance.set(13, 0);
            instance.set(12, 0);
            instance.set(11, 0);
            instance.add(6, 1);
        } else if (i == 2) {
            instance.set(14, 0);
            instance.set(13, 0);
            instance.set(12, 0);
            instance.add(11, 1);
        }
        return instance.getTimeInMillis();
    }

    /* renamed from: a */
    private static String m20435a(IronSource.AD_UNIT ad_unit) {
        return ad_unit == IronSource.AD_UNIT.INTERSTITIAL ? IronSourceConstants.INTERSTITIAL_AD_UNIT : ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO ? IronSourceConstants.REWARDED_VIDEO_AD_UNIT : ad_unit == IronSource.AD_UNIT.BANNER ? IronSourceConstants.BANNER_AD_UNIT : ad_unit.toString();
    }

    /* renamed from: a */
    private static String m20436a(String str, String str2, String str3) {
        return str + "_" + str2 + "_" + str3;
    }

    /* renamed from: a */
    private HashMap<String, Object> m20437a() {
        return new HashMap<>(this.f17638b);
    }

    /* renamed from: a */
    private void m20438a(int i, String str) {
        HashMap<String, Object> a = m20437a();
        if (str == null) {
            str = "";
        }
        a.put(IronSourceConstants.EVENTS_SUB_PROVIDER_ID, str);
        C6518d.m19731d().mo36349b(new C6517c(i, new JSONObject(a)));
    }

    /* renamed from: a */
    public static synchronized void m20439a(Context context, InterstitialPlacement interstitialPlacement) {
        synchronized (C6745k.class) {
            if (context != null) {
                C6661l placementAvailabilitySettings = interstitialPlacement.getPlacementAvailabilitySettings();
                if (placementAvailabilitySettings != null) {
                    m20442a(context, IronSourceConstants.INTERSTITIAL_AD_UNIT, interstitialPlacement.getPlacementName(), placementAvailabilitySettings);
                }
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m20440a(Context context, Placement placement) {
        synchronized (C6745k.class) {
            if (context != null) {
                C6661l placementAvailabilitySettings = placement.getPlacementAvailabilitySettings();
                if (placementAvailabilitySettings != null) {
                    m20442a(context, IronSourceConstants.REWARDED_VIDEO_AD_UNIT, placement.getPlacementName(), placementAvailabilitySettings);
                }
            }
        }
    }

    /* renamed from: a */
    public static synchronized void m20441a(Context context, C6656g gVar) {
        synchronized (C6745k.class) {
            if (context != null) {
                C6661l placementAvailabilitySettings = gVar.getPlacementAvailabilitySettings();
                if (placementAvailabilitySettings != null) {
                    m20442a(context, IronSourceConstants.BANNER_AD_UNIT, gVar.getPlacementName(), placementAvailabilitySettings);
                }
            }
        }
    }

    /* renamed from: a */
    private static void m20442a(Context context, String str, String str2, C6661l lVar) {
        boolean z = lVar.f17374a;
        IronSourceUtils.saveBooleanToSharedPrefs(context, m20436a(str, "CappingManager.IS_DELIVERY_ENABLED", str2), z);
        if (z) {
            boolean z2 = lVar.f17375b;
            IronSourceUtils.saveBooleanToSharedPrefs(context, m20436a(str, "CappingManager.IS_CAPPING_ENABLED", str2), z2);
            if (z2) {
                IronSourceUtils.saveIntToSharedPrefs(context, m20436a(str, "CappingManager.MAX_NUMBER_OF_SHOWS", str2), lVar.f17378e);
                IronSourceUtils.saveStringToSharedPrefs(context, m20436a(str, "CappingManager.CAPPING_TYPE", str2), lVar.f17377d.toString());
            }
            boolean z3 = lVar.f17376c;
            IronSourceUtils.saveBooleanToSharedPrefs(context, m20436a(str, "CappingManager.IS_PACING_ENABLED", str2), z3);
            if (z3) {
                IronSourceUtils.saveIntToSharedPrefs(context, m20436a(str, "CappingManager.SECONDS_BETWEEN_SHOWS", str2), lVar.f17379f);
            }
        }
    }

    /* renamed from: a */
    public static synchronized boolean m20443a(Context context, String str) {
        boolean z;
        synchronized (C6745k.class) {
            z = m20433a(context, IronSourceConstants.INTERSTITIAL_AD_UNIT, str) != C6747a.f17643d;
        }
        return z;
    }

    /* renamed from: a */
    public static synchronized boolean m20444a(Context context, String str, IronSource.AD_UNIT ad_unit) {
        boolean z;
        synchronized (C6745k.class) {
            z = m20433a(context, m20435a(ad_unit), str) != C6747a.f17643d;
        }
        return z;
    }

    /* renamed from: b */
    public static synchronized int m20445b(Context context, InterstitialPlacement interstitialPlacement) {
        synchronized (C6745k.class) {
            if (!(context == null || interstitialPlacement == null)) {
                if (interstitialPlacement.getPlacementAvailabilitySettings() != null) {
                    int a = m20433a(context, IronSourceConstants.INTERSTITIAL_AD_UNIT, interstitialPlacement.getPlacementName());
                    return a;
                }
            }
            int i = C6747a.f17643d;
            return i;
        }
    }

    /* renamed from: b */
    public static synchronized int m20446b(Context context, Placement placement) {
        synchronized (C6745k.class) {
            if (!(context == null || placement == null)) {
                if (placement.getPlacementAvailabilitySettings() != null) {
                    int a = m20433a(context, IronSourceConstants.REWARDED_VIDEO_AD_UNIT, placement.getPlacementName());
                    return a;
                }
            }
            int i = C6747a.f17643d;
            return i;
        }
    }

    /* renamed from: b */
    public static synchronized void m20447b(Context context, String str, IronSource.AD_UNIT ad_unit) {
        synchronized (C6745k.class) {
            m20448b(context, m20435a(ad_unit), str);
        }
    }

    /* renamed from: b */
    private static void m20448b(Context context, String str, String str2) {
        int i = 0;
        if (IronSourceUtils.getBooleanFromSharedPrefs(context, m20436a(str, "CappingManager.IS_PACING_ENABLED", str2), false)) {
            IronSourceUtils.saveLongToSharedPrefs(context, m20436a(str, "CappingManager.TIME_OF_THE_PREVIOUS_SHOW", str2), System.currentTimeMillis());
        }
        if (IronSourceUtils.getBooleanFromSharedPrefs(context, m20436a(str, "CappingManager.IS_CAPPING_ENABLED", str2), false)) {
            IronSourceUtils.getIntFromSharedPrefs(context, m20436a(str, "CappingManager.MAX_NUMBER_OF_SHOWS", str2), 0);
            String a = m20436a(str, "CappingManager.CURRENT_NUMBER_OF_SHOWS", str2);
            int intFromSharedPrefs = IronSourceUtils.getIntFromSharedPrefs(context, a, 0);
            if (intFromSharedPrefs == 0) {
                String stringFromSharedPrefs = IronSourceUtils.getStringFromSharedPrefs(context, m20436a(str, "CappingManager.CAPPING_TYPE", str2), C6663m.PER_DAY.toString());
                C6663m mVar = null;
                C6663m[] values = C6663m.values();
                int length = values.length;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    C6663m mVar2 = values[i];
                    if (mVar2.f17389c.equals(stringFromSharedPrefs)) {
                        mVar = mVar2;
                        break;
                    }
                    i++;
                }
                IronSourceUtils.saveLongToSharedPrefs(context, m20436a(str, "CappingManager.CAPPING_TIME_THRESHOLD", str2), m20434a(mVar));
            }
            IronSourceUtils.saveIntToSharedPrefs(context, a, intFromSharedPrefs + 1);
        }
    }

    /* renamed from: b */
    public static synchronized boolean m20449b(Context context, String str) {
        boolean z;
        synchronized (C6745k.class) {
            z = m20433a(context, IronSourceConstants.BANNER_AD_UNIT, str) != C6747a.f17643d;
        }
        return z;
    }

    /* renamed from: c */
    public static synchronized void m20450c(Context context, InterstitialPlacement interstitialPlacement) {
        synchronized (C6745k.class) {
            if (interstitialPlacement != null) {
                m20448b(context, IronSourceConstants.INTERSTITIAL_AD_UNIT, interstitialPlacement.getPlacementName());
            }
        }
    }

    /* renamed from: c */
    public static synchronized void m20451c(Context context, Placement placement) {
        synchronized (C6745k.class) {
            if (placement != null) {
                m20448b(context, IronSourceConstants.REWARDED_VIDEO_AD_UNIT, placement.getPlacementName());
            }
        }
    }

    /* renamed from: c */
    public static synchronized boolean m20452c(Context context, String str) {
        boolean z;
        synchronized (C6745k.class) {
            z = m20433a(context, IronSourceConstants.REWARDED_VIDEO_AD_UNIT, str) != C6747a.f17643d;
        }
        return z;
    }

    /* renamed from: d */
    public static synchronized void m20453d(Context context, String str) {
        synchronized (C6745k.class) {
            m20448b(context, IronSourceConstants.INTERSTITIAL_AD_UNIT, str);
        }
    }

    /* renamed from: e */
    public static synchronized void m20454e(Context context, String str) {
        synchronized (C6745k.class) {
            m20448b(context, IronSourceConstants.REWARDED_VIDEO_AD_UNIT, str);
        }
    }

    /* renamed from: f */
    public static synchronized void m20455f(Context context, String str) {
        synchronized (C6745k.class) {
            if (!TextUtils.isEmpty(str)) {
                m20448b(context, IronSourceConstants.BANNER_AD_UNIT, str);
            }
        }
    }

    /* renamed from: a */
    public void mo36976a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        C6756v vVar = this.f17637a.get(str);
        if (vVar == null) {
            m20438a((int) IronSourceConstants.BN_INSTANCE_NOT_FOUND_IN_LOAD, str);
            IronSourceError buildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError(IronSourceConstants.BANNER_AD_UNIT);
            IronLog.API.error(buildNonExistentInstanceError.getErrorMessage());
            iSDemandOnlyBannerLayout.sendBannerAdLoadFailed(str, buildNonExistentInstanceError);
            return;
        }
        vVar.mo36994a(iSDemandOnlyBannerLayout);
    }

    /* renamed from: a */
    public void mo36977a(ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str, String str2) {
        C6756v vVar = this.f17637a.get(str);
        if (vVar == null) {
            m20438a((int) IronSourceConstants.BN_INSTANCE_NOT_FOUND_IN_LOAD, str);
            IronSourceError buildNonExistentInstanceError = ErrorBuilder.buildNonExistentInstanceError(IronSourceConstants.BANNER_AD_UNIT);
            IronLog.API.error(buildNonExistentInstanceError.getErrorMessage());
            iSDemandOnlyBannerLayout.sendBannerAdLoadFailed(str, buildNonExistentInstanceError);
            return;
        }
        vVar.mo36995a(iSDemandOnlyBannerLayout, str2);
    }

    /* renamed from: a */
    public synchronized void mo36978a(String str) {
        C6756v vVar = this.f17637a.get(str);
        if (vVar == null) {
            m20438a((int) IronSourceConstants.BN_INSTANCE_NOT_FOUND_IN_DESTROY, str);
            IronLog.API.error(ErrorBuilder.buildNonExistentInstanceError(IronSourceConstants.BANNER_AD_UNIT).getErrorMessage());
            return;
        }
        vVar.mo36997b();
    }
}
