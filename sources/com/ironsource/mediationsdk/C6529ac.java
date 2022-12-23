package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C6650a;
import com.ironsource.mediationsdk.utils.C6751n;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.ac */
public abstract class C6529ac implements C6751n.C6752a {

    /* renamed from: c */
    protected AbstractAdapter f16846c;

    /* renamed from: d */
    protected C6650a f16847d;

    /* renamed from: e */
    boolean f16848e;

    /* renamed from: f */
    protected JSONObject f16849f;

    /* renamed from: g */
    protected String f16850g;

    /* renamed from: h */
    protected int f16851h;

    /* renamed from: i */
    protected Long f16852i = null;

    C6529ac(C6650a aVar, AbstractAdapter abstractAdapter) {
        this.f16847d = aVar;
        this.f16846c = abstractAdapter;
        this.f16849f = aVar.f17321b;
    }

    /* renamed from: a */
    private String mo36182a() {
        return this.f16847d.f17320a.isMultipleInstances() ? this.f16847d.f17320a.getProviderTypeForReflection() : this.f16847d.f17320a.getProviderName();
    }

    /* renamed from: b */
    public final void mo36384b(String str) {
        C6625f.m20163a();
        this.f16850g = C6625f.m20174d(str);
    }

    /* renamed from: d */
    public void mo36275d() {
        try {
            if (this.f16846c != null) {
                this.f16846c.releaseMemory(this.f16847d.f17325f, this.f16849f);
            }
        } catch (Exception e) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.error("exception - " + e.getMessage());
        }
        this.f16846c = null;
    }

    /* renamed from: e */
    public int mo36191e() {
        return 1;
    }

    /* renamed from: h */
    public final boolean mo36385h() {
        return this.f16847d.f17322c;
    }

    /* renamed from: i */
    public final int mo36386i() {
        return this.f16847d.f17323d;
    }

    /* renamed from: j */
    public final int mo36387j() {
        return this.f16847d.f17324e;
    }

    /* renamed from: k */
    public final String mo36388k() {
        return this.f16847d.f17320a.getProviderName();
    }

    /* renamed from: l */
    public final String mo36389l() {
        return this.f16847d.f17320a.getProviderTypeForReflection();
    }

    /* renamed from: m */
    public final int mo36390m() {
        return this.f16851h;
    }

    /* renamed from: n */
    public final Map<String, Object> mo36391n() {
        HashMap hashMap = new HashMap();
        try {
            String str = "";
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, this.f16846c != null ? this.f16846c.getVersion() : str);
            if (this.f16846c != null) {
                str = this.f16846c.getCoreSDKVersion();
            }
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, str);
            hashMap.put(IronSourceConstants.EVENTS_SUB_PROVIDER_ID, this.f16847d.f17320a.getSubProviderId());
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.f16847d.f17320a.getAdSourceNameForEvents());
            hashMap.put("instanceType", Integer.valueOf(mo36385h() ? 2 : 1));
            hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, Integer.valueOf(mo36191e()));
            if (!TextUtils.isEmpty(this.f16850g)) {
                hashMap.put(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID, this.f16850g);
            }
        } catch (Exception e) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, "getProviderEventData " + mo36388k() + ")", e);
        }
        return hashMap;
    }

    /* renamed from: o */
    public final Long mo36392o() {
        return this.f16852i;
    }

    /* renamed from: p */
    public final String mo36393p() {
        return String.format("%s %s", new Object[]{mo36182a(), Integer.valueOf(hashCode())});
    }
}
