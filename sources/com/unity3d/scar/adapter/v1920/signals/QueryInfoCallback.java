package com.unity3d.scar.adapter.v1920.signals;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.unity3d.scar.adapter.common.DispatchGroup;

public class QueryInfoCallback extends QueryInfoGenerationCallback {

    /* renamed from: a */
    private DispatchGroup f28562a;

    /* renamed from: b */
    private QueryInfoMetadata f28563b;

    public QueryInfoCallback(QueryInfoMetadata queryInfoMetadata, DispatchGroup dispatchGroup) {
        this.f28562a = dispatchGroup;
        this.f28563b = queryInfoMetadata;
    }

    public void onFailure(String str) {
        this.f28563b.setError(str);
        this.f28562a.leave();
    }

    public void onSuccess(QueryInfo queryInfo) {
        this.f28563b.setQueryInfo(queryInfo);
        this.f28562a.leave();
    }
}
