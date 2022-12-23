package com.unity3d.scar.adapter.v1920.signals;

import java.util.HashMap;
import java.util.Map;

public class SignalsStorage {

    /* renamed from: a */
    private Map<String, QueryInfoMetadata> f28570a = new HashMap();

    public Map<String, QueryInfoMetadata> getPlacementQueryInfoMap() {
        return this.f28570a;
    }

    public QueryInfoMetadata getQueryInfoMetadata(String str) {
        return this.f28570a.get(str);
    }

    public void put(String str, QueryInfoMetadata queryInfoMetadata) {
        this.f28570a.put(str, queryInfoMetadata);
    }
}
