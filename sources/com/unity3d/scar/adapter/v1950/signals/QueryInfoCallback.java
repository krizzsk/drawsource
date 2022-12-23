package com.unity3d.scar.adapter.v1950.signals;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.unity3d.scar.adapter.common.DispatchGroup;

public class QueryInfoCallback extends QueryInfoGenerationCallback {

    /* renamed from: a */
    private DispatchGroup f28600a;

    /* renamed from: b */
    private QueryInfoMetadata f28601b;

    public QueryInfoCallback(QueryInfoMetadata queryInfoMetadata, DispatchGroup dispatchGroup) {
        this.f28600a = dispatchGroup;
        this.f28601b = queryInfoMetadata;
    }

    public void onFailure(String str) {
        this.f28601b.setError(str);
        this.f28600a.leave();
    }

    public void onSuccess(QueryInfo queryInfo) {
        this.f28601b.setQueryInfo(queryInfo);
        this.f28600a.leave();
    }
}
