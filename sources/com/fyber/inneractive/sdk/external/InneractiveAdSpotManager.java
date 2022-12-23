package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.flow.C4365m;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class InneractiveAdSpotManager {

    /* renamed from: a */
    public Map<String, InneractiveAdSpot> f10620a = new ConcurrentHashMap();

    /* renamed from: com.fyber.inneractive.sdk.external.InneractiveAdSpotManager$a */
    public static class C4331a {

        /* renamed from: a */
        public static InneractiveAdSpotManager f10621a = new InneractiveAdSpotManager();
    }

    public static void destroy() {
        Map<String, InneractiveAdSpot> map = get().f10620a;
        for (String str : map.keySet()) {
            InneractiveAdSpot inneractiveAdSpot = map.get(str);
            if (inneractiveAdSpot != null) {
                inneractiveAdSpot.destroy();
            }
        }
        map.clear();
    }

    public static InneractiveAdSpotManager get() {
        return C4331a.f10621a;
    }

    public void bindSpot(InneractiveAdSpot inneractiveAdSpot) {
        this.f10620a.put(inneractiveAdSpot.getLocalUniqueId(), inneractiveAdSpot);
    }

    public InneractiveAdSpot createSpot() {
        C4365m mVar = new C4365m();
        this.f10620a.put(mVar.f10731a, mVar);
        return mVar;
    }

    public InneractiveAdSpot getSpot(String str) {
        return this.f10620a.get(str);
    }

    public void removeSpot(InneractiveAdSpot inneractiveAdSpot) {
        Map<String, InneractiveAdSpot> map = this.f10620a;
        if (map != null) {
            map.remove(inneractiveAdSpot.getLocalUniqueId());
        }
    }
}
