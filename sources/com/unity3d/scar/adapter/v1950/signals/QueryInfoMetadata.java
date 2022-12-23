package com.unity3d.scar.adapter.v1950.signals;

import com.google.android.gms.ads.query.QueryInfo;

public class QueryInfoMetadata {

    /* renamed from: a */
    private String f28602a;

    /* renamed from: b */
    private QueryInfo f28603b;

    /* renamed from: c */
    private String f28604c;

    public QueryInfoMetadata(String str) {
        this.f28602a = str;
    }

    public String getError() {
        return this.f28604c;
    }

    public String getPlacementId() {
        return this.f28602a;
    }

    public QueryInfo getQueryInfo() {
        return this.f28603b;
    }

    public String getQueryStr() {
        QueryInfo queryInfo = this.f28603b;
        if (queryInfo != null) {
            return queryInfo.getQuery();
        }
        return null;
    }

    public void setError(String str) {
        this.f28604c = str;
    }

    public void setQueryInfo(QueryInfo queryInfo) {
        this.f28603b = queryInfo;
    }
}
