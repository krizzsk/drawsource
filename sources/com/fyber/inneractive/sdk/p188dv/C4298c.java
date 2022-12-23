package com.fyber.inneractive.sdk.p188dv;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.factories.C4336a;
import com.fyber.inneractive.sdk.factories.C4339b;
import com.fyber.inneractive.sdk.factories.C4342c;
import com.fyber.inneractive.sdk.interfaces.C4394a;
import com.fyber.inneractive.sdk.interfaces.C4396b;
import com.fyber.inneractive.sdk.interfaces.C4397c;
import com.fyber.inneractive.sdk.p188dv.banner.C4297b;
import com.fyber.inneractive.sdk.p188dv.interstitial.C4320d;
import com.fyber.inneractive.sdk.p188dv.rewarded.C4328c;
import com.fyber.inneractive.sdk.response.C5229a;
import com.fyber.inneractive.sdk.response.C5230b;
import com.fyber.inneractive.sdk.util.IAlog;

/* renamed from: com.fyber.inneractive.sdk.dv.c */
public class C4298c extends BroadcastReceiver {

    /* renamed from: com.fyber.inneractive.sdk.dv.c$a */
    public class C4299a implements C4339b.C4341b {
        public C4299a(C4298c cVar) {
        }

        /* renamed from: a */
        public C4394a mo24313a() {
            return new C4293b();
        }

        /* renamed from: b */
        public C5230b mo24314b() {
            return new C4303e();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.dv.c$b */
    public class C4300b implements C4342c.C4343a {
        public C4300b(C4298c cVar) {
        }

        /* renamed from: a */
        public boolean mo24315a(InneractiveAdSpot inneractiveAdSpot) {
            return IAConfigManager.f10324J.f10330E != null && (inneractiveAdSpot.getAdContent() instanceof C4292a);
        }

        /* renamed from: b */
        public C4397c mo24316b(InneractiveAdSpot inneractiveAdSpot) {
            InneractiveAdRequest inneractiveAdRequest = inneractiveAdSpot.getAdContent().f10712a;
            boolean z = inneractiveAdRequest == null || inneractiveAdRequest.getAllowFullscreen();
            if (!inneractiveAdSpot.getAdContent().mo24299d() || !z) {
                return null;
            }
            if (inneractiveAdSpot.getAdContent().mo24293c().f13878n == UnitDisplayType.INTERSTITIAL) {
                return new C4320d();
            }
            return new C4328c();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.dv.c$c */
    public class C4301c implements C4336a.C4337a {
        public C4301c() {
        }

        /* renamed from: a */
        public boolean mo24317a(InneractiveAdSpot inneractiveAdSpot) {
            return C4298c.m13344a(C4298c.this, inneractiveAdSpot);
        }

        /* renamed from: b */
        public C4396b mo24318b(InneractiveAdSpot inneractiveAdSpot) {
            return new C4297b();
        }
    }

    /* renamed from: a */
    public static boolean m13344a(C4298c cVar, InneractiveAdSpot inneractiveAdSpot) {
        cVar.getClass();
        return inneractiveAdSpot.getAdContent() != null && (inneractiveAdSpot.getAdContent() instanceof C4292a);
    }

    public void onReceive(Context context, Intent intent) {
        IAlog.m16446a("DVKit: onReceive in package: %s", context.getApplicationContext().getPackageName());
        C4339b.C4340a.f10657a.mo24485a(C5229a.RETURNED_ADTYPE_MOBILE_ADS, new C4299a(this));
        C4342c cVar = C4342c.C4344b.f10659a;
        cVar.f10658a.add(new C4300b(this));
        C4336a aVar = C4336a.C4338b.f10655a;
        aVar.f10654a.add(new C4301c());
    }
}
