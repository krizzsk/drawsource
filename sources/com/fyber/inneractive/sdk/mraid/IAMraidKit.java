package com.fyber.inneractive.sdk.mraid;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.factories.C4336a;
import com.fyber.inneractive.sdk.factories.C4339b;
import com.fyber.inneractive.sdk.factories.C4342c;
import com.fyber.inneractive.sdk.flow.C4357h;
import com.fyber.inneractive.sdk.flow.C4379u;
import com.fyber.inneractive.sdk.interfaces.C4394a;
import com.fyber.inneractive.sdk.interfaces.C4396b;
import com.fyber.inneractive.sdk.interfaces.C4397c;
import com.fyber.inneractive.sdk.renderers.C5216g;
import com.fyber.inneractive.sdk.renderers.C5223k;
import com.fyber.inneractive.sdk.response.C5229a;
import com.fyber.inneractive.sdk.response.C5230b;
import com.fyber.inneractive.sdk.response.C5231c;
import com.fyber.inneractive.sdk.util.C5315t;
import com.fyber.inneractive.sdk.util.C5317u;
import com.fyber.inneractive.sdk.util.IAlog;

public class IAMraidKit extends BroadcastReceiver {
    private static final C5315t sProvider = new C4439a();

    /* renamed from: com.fyber.inneractive.sdk.mraid.IAMraidKit$a */
    public class C4439a implements C5315t {
        /* renamed from: a */
        public C5317u mo24629a() {
            return C5317u.Mraid;
        }

        /* renamed from: a */
        public boolean mo24630a(String str) {
            return false;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.mraid.IAMraidKit$b */
    public class C4440b implements C4339b.C4341b {
        public C4440b(IAMraidKit iAMraidKit) {
        }

        /* renamed from: a */
        public C4394a mo24313a() {
            return new C4357h();
        }

        /* renamed from: b */
        public C5230b mo24314b() {
            return new C5231c();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.mraid.IAMraidKit$c */
    public class C4441c implements C4342c.C4343a {
        public C4441c() {
        }

        /* renamed from: a */
        public boolean mo24315a(InneractiveAdSpot inneractiveAdSpot) {
            return IAMraidKit.this.isMRaidSpotContent(inneractiveAdSpot);
        }

        /* renamed from: b */
        public C4397c mo24316b(InneractiveAdSpot inneractiveAdSpot) {
            return new C5223k();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.mraid.IAMraidKit$d */
    public class C4442d implements C4336a.C4337a {
        public C4442d() {
        }

        /* renamed from: a */
        public boolean mo24317a(InneractiveAdSpot inneractiveAdSpot) {
            return IAMraidKit.this.isMRaidSpotContent(inneractiveAdSpot);
        }

        /* renamed from: b */
        public C4396b mo24318b(InneractiveAdSpot inneractiveAdSpot) {
            return new C5216g();
        }
    }

    /* access modifiers changed from: private */
    public boolean isMRaidSpotContent(InneractiveAdSpot inneractiveAdSpot) {
        return inneractiveAdSpot.getAdContent() != null && (inneractiveAdSpot.getAdContent() instanceof C4379u);
    }

    public void onReceive(Context context, Intent intent) {
        IAlog.m16446a("IAMraidKit: onReceive in package: %s", context.getApplicationContext().getPackageName());
        C5315t tVar = sProvider;
        IAConfigManager.f10324J.f10333H.put(tVar.mo24629a(), tVar);
        C4440b bVar = new C4440b(this);
        C4339b.C4340a.f10657a.mo24485a(C5229a.RETURNED_ADTYPE_HTML, bVar);
        C4339b.C4340a.f10657a.mo24485a(C5229a.RETURNED_ADTYPE_MRAID, bVar);
        C4342c cVar = C4342c.C4344b.f10659a;
        cVar.f10658a.add(new C4441c());
        C4336a aVar = C4336a.C4338b.f10655a;
        aVar.f10654a.add(new C4442d());
    }
}
