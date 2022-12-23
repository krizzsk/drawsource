package com.ironsource.mediationsdk;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.C6650a;
import com.ironsource.mediationsdk.p216c.C6620a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import org.json.JSONObject;

/* renamed from: com.ironsource.mediationsdk.A */
public class C6419A {

    /* renamed from: a */
    private C6420a f16237a;

    /* renamed from: b */
    private Timer f16238b;

    /* renamed from: c */
    private final Object f16239c = new Object();

    /* renamed from: d */
    protected AbstractAdapter f16240d;

    /* renamed from: e */
    protected C6650a f16241e;

    /* renamed from: f */
    protected JSONObject f16242f;

    /* renamed from: g */
    long f16243g;

    /* renamed from: h */
    protected String f16244h;

    /* renamed from: i */
    protected JSONObject f16245i;

    /* renamed from: j */
    protected List<String> f16246j;

    /* renamed from: k */
    protected String f16247k;

    /* renamed from: l */
    private final Object f16248l = new Object();

    /* renamed from: com.ironsource.mediationsdk.A$a */
    public enum C6420a {
        NOT_LOADED,
        LOAD_IN_PROGRESS,
        LOADED,
        SHOW_IN_PROGRESS
    }

    public C6419A(C6650a aVar, AbstractAdapter abstractAdapter) {
        this.f16241e = aVar;
        this.f16240d = abstractAdapter;
        this.f16242f = aVar.f17321b;
        this.f16237a = C6420a.NOT_LOADED;
        this.f16238b = null;
        this.f16244h = "";
        this.f16245i = null;
        this.f16246j = new ArrayList();
    }

    /* renamed from: a */
    protected static void m19178a(List<String> list, String str, int i, String str2, String str3) {
        for (String a : (List) C6620a.m20120a(list, new ArrayList())) {
            C6625f.m20163a();
            String a2 = C6625f.m20165a(a, str, i, str2, "", "", "", "");
            C6625f.m20163a();
            C6625f.m20168a(str3, str, a2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C6420a mo35937a(C6420a[] aVarArr, C6420a aVar) {
        C6420a aVar2;
        synchronized (this.f16239c) {
            aVar2 = this.f16237a;
            if (Arrays.asList(aVarArr).contains(this.f16237a)) {
                mo35938a(aVar);
            }
        }
        return aVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35938a(C6420a aVar) {
        IronLog.INTERNAL.verbose("DemandOnlySmash " + this.f16241e.f17320a.getProviderName() + ": current state=" + this.f16237a + ", new state=" + aVar);
        synchronized (this.f16239c) {
            this.f16237a = aVar;
        }
    }

    /* renamed from: a */
    public final void mo35939a(String str) {
        C6625f.m20163a();
        this.f16247k = C6625f.m20174d(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35940a(TimerTask timerTask) {
        synchronized (this.f16248l) {
            mo35952j();
            Timer timer = new Timer();
            this.f16238b = timer;
            timer.schedule(timerTask, this.f16243g);
        }
    }

    /* renamed from: a */
    public final void mo35941a(JSONObject jSONObject) {
        this.f16245i = jSONObject;
    }

    /* renamed from: a */
    public final void mo35942a(boolean z) {
        try {
            this.f16242f.put("isOneFlow", z);
        } catch (Exception e) {
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("Can't set isOneFlow = " + z + ". Error: " + e.getMessage());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo35943a(C6420a aVar, C6420a aVar2) {
        synchronized (this.f16239c) {
            if (this.f16237a != aVar) {
                return false;
            }
            mo35938a(aVar2);
            return true;
        }
    }

    /* renamed from: b */
    public final void mo35944b(String str) {
        this.f16244h = str;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final boolean mo35945b(C6420a aVar) {
        boolean z;
        synchronized (this.f16239c) {
            z = this.f16237a == aVar;
        }
        return z;
    }

    /* renamed from: d */
    public Map<String, Object> mo35946d() {
        HashMap hashMap = new HashMap();
        try {
            String str = "";
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_ADAPTER_VERSION, this.f16240d != null ? this.f16240d.getVersion() : str);
            if (this.f16240d != null) {
                str = this.f16240d.getCoreSDKVersion();
            }
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER_SDK_VERSION, str);
            hashMap.put(IronSourceConstants.EVENTS_SUB_PROVIDER_ID, this.f16241e.f17320a.getSubProviderId());
            hashMap.put(IronSourceConstants.EVENTS_PROVIDER, this.f16241e.f17320a.getAdSourceNameForEvents());
            hashMap.put(IronSourceConstants.EVENTS_DEMAND_ONLY, 1);
            if (this.f16241e.f17322c) {
                hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 1);
                hashMap.put("instanceType", 2);
                if (!TextUtils.isEmpty(this.f16244h)) {
                    hashMap.put("auctionId", this.f16244h);
                }
                if (this.f16245i != null && this.f16245i.length() > 0) {
                    hashMap.put(IronSourceConstants.EVENTS_GENERIC_PARAMS, this.f16245i);
                }
            } else {
                hashMap.put(IronSourceConstants.EVENTS_PROGRAMMATIC, 0);
                hashMap.put("instanceType", 1);
            }
            if (!TextUtils.isEmpty(this.f16247k)) {
                hashMap.put(IronSourceConstants.EVENTS_DYNAMIC_DEMAND_SOURCE_ID, this.f16247k);
            }
        } catch (Exception e) {
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NATIVE;
            logger.logException(ironSourceTag, "getProviderEventData " + mo35947e() + ")", e);
        }
        return hashMap;
    }

    /* renamed from: e */
    public final String mo35947e() {
        return this.f16241e.f17320a.getProviderName();
    }

    /* renamed from: f */
    public final int mo35948f() {
        return this.f16241e.f17323d;
    }

    /* renamed from: g */
    public final String mo35949g() {
        return this.f16241e.f17320a.getSubProviderId();
    }

    /* renamed from: h */
    public final boolean mo35950h() {
        return this.f16242f.optBoolean("isOneFlow", false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final String mo35951i() {
        C6420a aVar = this.f16237a;
        return aVar == null ? "null" : aVar.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo35952j() {
        synchronized (this.f16248l) {
            if (this.f16238b != null) {
                this.f16238b.cancel();
                this.f16238b = null;
            }
        }
    }

    /* renamed from: k */
    public final boolean mo35953k() {
        return this.f16241e.f17322c;
    }
}
