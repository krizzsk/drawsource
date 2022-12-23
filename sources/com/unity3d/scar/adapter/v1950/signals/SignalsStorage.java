package com.unity3d.scar.adapter.v1950.signals;

import java.util.HashMap;
import java.util.Map;

public class SignalsStorage {

    /* renamed from: a */
    private Map<String, QueryInfoMetadata> f28608a = new HashMap();

    public Map<String, QueryInfoMetadata> getPlacementQueryInfoMap() {
        return this.f28608a;
    }

    public QueryInfoMetadata getQueryInfoMetadata(String str) {
        return this.f28608a.get(str);
    }

    public void put(String str, QueryInfoMetadata queryInfoMetadata) {
        this.f28608a.put(str, queryInfoMetadata);
    }
}
