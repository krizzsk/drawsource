package com.fyber.inneractive.sdk.video;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.factories.C4336a;
import com.fyber.inneractive.sdk.factories.C4339b;
import com.fyber.inneractive.sdk.factories.C4342c;
import com.fyber.inneractive.sdk.flow.C4360i;
import com.fyber.inneractive.sdk.flow.C4392y;
import com.fyber.inneractive.sdk.interfaces.C4394a;
import com.fyber.inneractive.sdk.interfaces.C4396b;
import com.fyber.inneractive.sdk.interfaces.C4397c;
import com.fyber.inneractive.sdk.player.cache.C4571n;
import com.fyber.inneractive.sdk.renderers.C5218h;
import com.fyber.inneractive.sdk.renderers.C5222j;
import com.fyber.inneractive.sdk.renderers.C5226m;
import com.fyber.inneractive.sdk.response.C5229a;
import com.fyber.inneractive.sdk.response.C5230b;
import com.fyber.inneractive.sdk.response.C5232d;
import com.fyber.inneractive.sdk.util.C5315t;
import com.fyber.inneractive.sdk.util.C5317u;
import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;

public class IAVideoKit extends BroadcastReceiver {
    private static final C5315t sProvider = new C5334a();

    /* renamed from: com.fyber.inneractive.sdk.video.IAVideoKit$b */
    public class C5335b implements C4339b.C4341b {
        public C5335b(IAVideoKit iAVideoKit) {
        }

        /* renamed from: a */
        public C4394a mo24313a() {
            return new C4360i(IronSourceConstants.INTERSTITIAL_AD_UNIT);
        }

        /* renamed from: b */
        public C5230b mo24314b() {
            return new C5232d();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.video.IAVideoKit$c */
    public class C5336c implements C4342c.C4343a {
        public C5336c(IAVideoKit iAVideoKit) {
        }

        /* renamed from: a */
        public boolean mo24315a(InneractiveAdSpot inneractiveAdSpot) {
            return inneractiveAdSpot.getAdContent() != null && (inneractiveAdSpot.getAdContent() instanceof C4392y);
        }

        /* renamed from: b */
        public C4397c mo24316b(InneractiveAdSpot inneractiveAdSpot) {
            InneractiveAdRequest inneractiveAdRequest = inneractiveAdSpot.getAdContent().f10712a;
            boolean z = inneractiveAdRequest == null || inneractiveAdRequest.getAllowFullscreen();
            if (!inneractiveAdSpot.getAdContent().mo24299d() || !z) {
                return new C5222j();
            }
            return new C5226m();
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.video.IAVideoKit$d */
    public class C5337d implements C4336a.C4337a {
        public C5337d(IAVideoKit iAVideoKit) {
        }

        /* renamed from: a */
        public boolean mo24317a(InneractiveAdSpot inneractiveAdSpot) {
            return inneractiveAdSpot.getAdContent() != null && (inneractiveAdSpot.getAdContent() instanceof C4392y);
        }

        /* renamed from: b */
        public C4396b mo24318b(InneractiveAdSpot inneractiveAdSpot) {
            return new C5218h();
        }
    }

    public void onReceive(Context context, Intent intent) {
        C5315t tVar = sProvider;
        IAConfigManager.f10324J.f10333H.put(tVar.mo24629a(), tVar);
        C4571n nVar = C4571n.f11333f;
        Context applicationContext = context.getApplicationContext();
        nVar.getClass();
        if (applicationContext == null) {
            IAlog.m16450e("context is null, would not start the video cache.", new Object[0]);
        } else if (!nVar.mo24778a()) {
            nVar.f11334a = applicationContext;
            new Thread(nVar.f11338e, "VideoCache").start();
        }
        IAlog.m16446a("IAVideoKit: onReceive in package: %s", context.getApplicationContext().getPackageName());
        C4339b.C4340a.f10657a.mo24485a(C5229a.RETURNED_ADTYPE_VAST, new C5335b(this));
        C4342c cVar = C4342c.C4344b.f10659a;
        cVar.f10658a.add(new C5336c(this));
        C4336a aVar = C4336a.C4338b.f10655a;
        aVar.f10654a.add(new C5337d(this));
    }

    /* renamed from: com.fyber.inneractive.sdk.video.IAVideoKit$a */
    public class C5334a implements C5315t {
        /* renamed from: a */
        public boolean mo24630a(String str) {
            if (TextUtils.equals(str, "vid_cache")) {
                return C4571n.f11333f.mo24778a();
            }
            return false;
        }

        /* renamed from: a */
        public C5317u mo24629a() {
            return C5317u.Video;
        }
    }
}
