package com.unity3d.scar.adapter.v2000.signals;

import java.util.HashMap;
import java.util.Map;

public class SignalsStorage {

    /* renamed from: a */
    private Map<String, QueryInfoMetadata> f28648a = new HashMap();

    public Map<String, QueryInfoMetadata> getPlacementQueryInfoMap() {
        return this.f28648a;
    }

    public QueryInfoMetadata getQueryInfoMetadata(String str) {
        return this.f28648a.get(str);
    }

    public void put(String str, QueryInfoMetadata queryInfoMetadata) {
        this.f28648a.put(str, queryInfoMetadata);
    }
}
