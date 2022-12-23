package com.unity3d.scar.adapter.v1920.signals;

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
    public static SignalsStorage f28567a;

    /* renamed from: com.unity3d.scar.adapter.v1920.signals.SignalsReader$a */
    private class C11788a implements Runnable {

        /* renamed from: a */
        private ISignalCollectionListener f28568a;

        public C11788a(ISignalCollectionListener iSignalCollectionListener) {
            this.f28568a = iSignalCollectionListener;
        }

        public void run() {
            HashMap hashMap = new HashMap();
            String str = null;
            for (Map.Entry<String, QueryInfoMetadata> value : SignalsReader.f28567a.getPlacementQueryInfoMap().entrySet()) {
                QueryInfoMetadata queryInfoMetadata = (QueryInfoMetadata) value.getValue();
                hashMap.put(queryInfoMetadata.getPlacementId(), queryInfoMetadata.getQueryStr());
                if (queryInfoMetadata.getError() != null) {
                    str = queryInfoMetadata.getError();
                }
            }
            if (hashMap.size() > 0) {
                this.f28568a.onSignalsCollected(new JSONObject(hashMap).toString());
            } else if (str == null) {
                this.f28568a.onSignalsCollected("");
            } else {
                this.f28568a.onSignalsCollectionFailed(str);
            }
        }
    }

    public SignalsReader(SignalsStorage signalsStorage) {
        f28567a = signalsStorage;
    }

    public void getSCARSignals(Context context, String[] strArr, String[] strArr2, ISignalCollectionListener iSignalCollectionListener) {
        DispatchGroup dispatchGroup = new DispatchGroup();
        for (String a : strArr) {
            dispatchGroup.enter();
            m32220a(context, a, AdFormat.INTERSTITIAL, dispatchGroup);
        }
        for (String a2 : strArr2) {
            dispatchGroup.enter();
            m32220a(context, a2, AdFormat.REWARDED, dispatchGroup);
        }
        dispatchGroup.notify(new C11788a(iSignalCollectionListener));
    }

    /* renamed from: a */
    private void m32220a(Context context, String str, AdFormat adFormat, DispatchGroup dispatchGroup) {
        AdRequest build = new AdRequest.Builder().build();
        QueryInfoMetadata queryInfoMetadata = new QueryInfoMetadata(str);
        QueryInfoCallback queryInfoCallback = new QueryInfoCallback(queryInfoMetadata, dispatchGroup);
        f28567a.put(str, queryInfoMetadata);
        QueryInfo.generate(context, adFormat, build, queryInfoCallback);
    }
}
