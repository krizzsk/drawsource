package com.unity3d.scar.adapter.v1950.signals;

import android.content.Context;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.query.QueryInfo;
import com.unity3d.scar.adapter.common.DispatchGroup;
import com.unity3d.scar.adapter.common.signals.ISignalCollectionListener;
import com.unity3d.scar.adapter.common.signals.ISignalsReader;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class SignalsReader implements ISignalsReader {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static SignalsStorage f28605a;

    /* renamed from: com.unity3d.scar.adapter.v1950.signals.SignalsReader$a */
    private class C11796a implements Runnable {

        /* renamed from: a */
        private ISignalCollectionListener f28606a;

        public C11796a(ISignalCollectionListener iSignalCollectionListener) {
            this.f28606a = iSignalCollectionListener;
        }

        public void run() {
            HashMap hashMap = new HashMap();
            String str = null;
            for (Map.Entry<String, QueryInfoMetadata> value : SignalsReader.f28605a.getPlacementQueryInfoMap().entrySet()) {
                QueryInfoMetadata queryInfoMetadata = (QueryInfoMetadata) value.getValue();
                hashMap.put(queryInfoMetadata.getPlacementId(), queryInfoMetadata.getQueryStr());
                if (queryInfoMetadata.getError() != null) {
                    str = queryInfoMetadata.getError();
                }
            }
            if (hashMap.size() > 0) {
                this.f28606a.onSignalsCollected(new JSONObject(hashMap).toString());
            } else if (str == null) {
                this.f28606a.onSignalsCollected("");
            } else {
                this.f28606a.onSignalsCollectionFailed(str);
            }
        }
    }

    public SignalsReader(SignalsStorage signalsStorage) {
        f28605a = signalsStorage;
    }

    public void getSCARSignals(Context context, String[] strArr, String[] strArr2, ISignalCollectionListener iSignalCollectionListener) {
        DispatchGroup dispatchGroup = new DispatchGroup();
        for (String a : strArr) {
            dispatchGroup.enter();
            m32224a(context, a, AdFormat.INTERSTITIAL, dispatchGroup);
        }
        for (String a2 : strArr2) {
            dispatchGroup.enter();
            m32224a(context, a2, AdFormat.REWARDED, dispatchGroup);
        }
        dispatchGroup.notify(new C11796a(iSignalCollectionListener));
    }

    /* renamed from: a */
    private void m32224a(Context context, String str, AdFormat adFormat, DispatchGroup dispatchGroup) {
        AdRequest build = new AdRequest.Builder().build();
        QueryInfoMetadata queryInfoMetadata = new QueryInfoMetadata(str);
        QueryInfoCallback queryInfoCallback = new QueryInfoCallback(queryInfoMetadata, dispatchGroup);
        f28605a.put(str, queryInfoMetadata);
        QueryInfo.generate(context, adFormat, build, queryInfoCallback);
    }
}
