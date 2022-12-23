package com.unity3d.scar.adapter.v2000.signals;

import com.google.android.gms.ads.query.QueryInfo;

public class QueryInfoMetadata {

    /* renamed from: a */
    private String f28641a;

    /* renamed from: b */
    private QueryInfo f28642b;

    /* renamed from: c */
    private String f28643c;

    public QueryInfoMetadata(String str) {
        this.f28641a = str;
    }

    public String getError() {
        return this.f28643c;
    }

    public String getPlacementId() {
        return this.f28641a;
    }

    public QueryInfo getQueryInfo() {
        return this.f28642b;
    }

    public String getQueryStr() {
        QueryInfo queryInfo = this.f28642b;
        if (queryInfo != null) {
            return queryInfo.getQuery();
        }
        return null;
    }

    public void setError(String str) {
        this.f28643c = str;
    }

    public void setQueryInfo(QueryInfo queryInfo) {
        this.f28642b = queryInfo;
    }
}
