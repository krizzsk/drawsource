package com.unity3d.scar.adapter.v2000.signals;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.unity3d.scar.adapter.common.DispatchGroup;

public class QueryInfoCallback extends QueryInfoGenerationCallback {

    /* renamed from: a */
    private DispatchGroup f28639a;

    /* renamed from: b */
    private QueryInfoMetadata f28640b;

    public QueryInfoCallback(QueryInfoMetadata queryInfoMetadata, DispatchGroup dispatchGroup) {
        this.f28639a = dispatchGroup;
        this.f28640b = queryInfoMetadata;
    }

    public void onFailure(String str) {
        this.f28640b.setError(str);
        this.f28639a.leave();
    }

    public void onSuccess(QueryInfo queryInfo) {
        this.f28640b.setQueryInfo(queryInfo);
        this.f28639a.leave();
    }
}
