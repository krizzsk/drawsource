package com.ironsource.mediationsdk;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.C6738e;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.ironsource.mediationsdk.a */
abstract class C6507a {

    /* renamed from: a */
    C6738e f16716a = null;

    /* renamed from: b */
    int f16717b;

    /* renamed from: c */
    final CopyOnWriteArrayList<C6611b> f16718c = new CopyOnWriteArrayList<>();

    /* renamed from: d */
    C6611b f16719d;

    /* renamed from: e */
    C6611b f16720e;

    /* renamed from: f */
    String f16721f;

    /* renamed from: g */
    String f16722g;

    /* renamed from: h */
    IronSourceLoggerManager f16723h = IronSourceLoggerManager.getLogger();

    /* renamed from: i */
    boolean f16724i = false;

    /* renamed from: j */
    Boolean f16725j;

    /* renamed from: k */
    boolean f16726k;

    /* renamed from: l */
    boolean f16727l = true;

    /* renamed from: m */
    private String f16728m = IronSourceConstants.EVENTS_ERROR_REASON;

    /* renamed from: n */
    private String f16729n = "status";

    /* renamed from: o */
    private String f16730o = "placement";

    /* renamed from: p */
    private String f16731p = IronSourceConstants.EVENTS_REWARD_NAME;

    /* renamed from: q */
    private String f16732q = IronSourceConstants.EVENTS_REWARD_AMOUNT;

    /* renamed from: r */
    private String f16733r = "providerPriority";

    C6507a() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo36022a(Context context, boolean z);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo36327a(C6611b bVar) {
        this.f16718c.add(bVar);
        C6738e eVar = this.f16716a;
        if (eVar != null) {
            synchronized (eVar) {
                try {
                    if (bVar.f17128m != 99) {
                        eVar.f17588a.put(eVar.mo36967d(bVar), Integer.valueOf(bVar.f17128m));
                    }
                } catch (Exception e) {
                    eVar.f17590c.logException(IronSourceLogger.IronSourceTag.INTERNAL, "addSmash", e);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized boolean mo36328a() {
        return this.f16727l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized void mo36329b() {
        this.f16727l = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo36330b(C6611b bVar) {
        try {
            String str = C6459L.m19304a().f16422l;
            if (!TextUtils.isEmpty(str) && bVar.f17117b != null) {
                IronSourceLoggerManager ironSourceLoggerManager = bVar.f17132q;
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.ADAPTER_API;
                ironSourceLoggerManager.log(ironSourceTag, bVar.mo36622j() + ":setMediationSegment(segment:" + str + ")", 1);
                bVar.f17117b.setMediationSegment(str);
            }
            String pluginType = ConfigFile.getConfigFile().getPluginType();
            if (!TextUtils.isEmpty(pluginType)) {
                String pluginFrameworkVersion = ConfigFile.getConfigFile().getPluginFrameworkVersion();
                if (bVar.f17117b != null) {
                    bVar.f17117b.setPluginData(pluginType, pluginFrameworkVersion);
                }
            }
        } catch (Exception e) {
            IronSourceLoggerManager ironSourceLoggerManager2 = this.f16723h;
            IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.INTERNAL;
            ironSourceLoggerManager2.log(ironSourceTag2, ":setCustomParams():" + e.toString(), 3);
        }
    }
}
