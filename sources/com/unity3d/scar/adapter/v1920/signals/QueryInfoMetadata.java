package com.unity3d.scar.adapter.v1920.signals;

import com.google.android.gms.ads.query.QueryInfo;

public class QueryInfoMetadata {

    /* renamed from: a */
    private String f28564a;

    /* renamed from: b */
    private QueryInfo f28565b;

    /* renamed from: c */
    private String f28566c;

    public QueryInfoMetadata(String str) {
        this.f28564a = str;
    }

    public String getError() {
        return this.f28566c;
    }

    public String getPlacementId() {
        return this.f28564a;
    }

    public QueryInfo getQueryInfo() {
        return this.f28565b;
    }

    public String getQueryStr() {
        QueryInfo queryInfo = this.f28565b;
        if (queryInfo != null) {
            return queryInfo.getQuery();
        }
        return null;
    }

    public void setError(String str) {
        this.f28566c = str;
    }

    public void setQueryInfo(QueryInfo queryInfo) {
        this.f28565b = queryInfo;
    }
}
