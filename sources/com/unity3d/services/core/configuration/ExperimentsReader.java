package com.unity3d.services.core.configuration;

import com.unity3d.services.core.log.C12065a;
import com.unity3d.services.core.misc.C12080j;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class ExperimentsReader {

    /* renamed from: a */
    private static final Set<String> f29220a = new HashSet(Arrays.asList(new String[]{"tsi", "tsi_upii", "tsi_p", "tsi_nt", "tsi_prr", "tsi_prw"}));

    /* renamed from: b */
    private Experiments f29221b;

    /* renamed from: c */
    private Experiments f29222c;

    /* renamed from: a */
    private JSONObject m32628a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (!f29220a.contains(next)) {
                hashMap.put(next, String.valueOf(jSONObject.optBoolean(next)));
            }
        }
        return new JSONObject(hashMap);
    }

    /* renamed from: b */
    private JSONObject m32629b(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            if (f29220a.contains(next)) {
                hashMap.put(next, String.valueOf(jSONObject.optBoolean(next)));
            }
        }
        return new JSONObject(hashMap);
    }

    public synchronized Experiments getCurrentlyActiveExperiments() {
        Experiments experiments = this.f29222c;
        if (experiments == null && this.f29221b == null) {
            return new Experiments();
        } else if (experiments == null) {
            return this.f29221b;
        } else {
            if (this.f29221b == null) {
                this.f29221b = new Experiments();
            }
            try {
                return new Experiments(C12080j.m32878a(m32629b(this.f29221b.getExperimentData()), m32628a(this.f29222c.getExperimentData())));
            } catch (JSONException unused) {
                C12065a.m32848c("Couldn't get active experiments, reverting to default experiments");
                return new Experiments();
            }
        }
    }

    public synchronized void updateLocalExperiments(Experiments experiments) {
        this.f29221b = experiments;
    }

    public synchronized void updateRemoteExperiments(Experiments experiments) {
        this.f29222c = experiments;
    }
}
