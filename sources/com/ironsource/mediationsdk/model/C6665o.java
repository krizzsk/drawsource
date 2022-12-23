package com.ironsource.mediationsdk.model;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ironsource.mediationsdk.model.o */
public final class C6665o {

    /* renamed from: b */
    private static C6665o f17397b;

    /* renamed from: a */
    private ArrayList<NetworkSettings> f17398a = new ArrayList<>();

    private C6665o() {
    }

    /* renamed from: a */
    public static synchronized C6665o m20230a() {
        C6665o oVar;
        synchronized (C6665o.class) {
            if (f17397b == null) {
                f17397b = new C6665o();
            }
            oVar = f17397b;
        }
        return oVar;
    }

    /* renamed from: a */
    public final NetworkSettings mo36788a(String str) {
        Iterator<NetworkSettings> it = this.f17398a.iterator();
        while (it.hasNext()) {
            NetworkSettings next = it.next();
            if (next.getProviderName().equals(str)) {
                return next;
            }
        }
        NetworkSettings networkSettings = new NetworkSettings(str);
        mo36789a(networkSettings);
        return networkSettings;
    }

    /* renamed from: a */
    public final void mo36789a(NetworkSettings networkSettings) {
        this.f17398a.add(networkSettings);
    }

    /* renamed from: b */
    public final void mo36790b() {
        Iterator<NetworkSettings> it = this.f17398a.iterator();
        while (it.hasNext()) {
            NetworkSettings next = it.next();
            if (next.isMultipleInstances() && !TextUtils.isEmpty(next.getProviderTypeForReflection())) {
                NetworkSettings a = mo36788a(next.getProviderDefaultInstance());
                next.setApplicationSettings(IronSourceUtils.mergeJsons(next.getApplicationSettings(), a.getApplicationSettings()));
                next.setInterstitialSettings(IronSourceUtils.mergeJsons(next.getInterstitialSettings(), a.getInterstitialSettings()));
                next.setRewardedVideoSettings(IronSourceUtils.mergeJsons(next.getRewardedVideoSettings(), a.getRewardedVideoSettings()));
                next.setBannerSettings(IronSourceUtils.mergeJsons(next.getBannerSettings(), a.getBannerSettings()));
            }
        }
    }

    /* renamed from: b */
    public final boolean mo36791b(String str) {
        Iterator<NetworkSettings> it = this.f17398a.iterator();
        while (it.hasNext()) {
            if (it.next().getProviderName().equals(str)) {
                return true;
            }
        }
        return false;
    }
}
