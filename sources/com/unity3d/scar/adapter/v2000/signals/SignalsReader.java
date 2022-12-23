package com.unity3d.scar.adapter.v2000.signals;

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
    public static Map<String, String> f28644a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static SignalsStorage f28645b;

    /* renamed from: com.unity3d.scar.adapter.v2000.signals.SignalsReader$a */
    private class C11806a implements Runnable {

        /* renamed from: a */
        private ISignalCollectionListener f28646a;

        public C11806a(ISignalCollectionListener iSignalCollectionListener) {
            this.f28646a = iSignalCollectionListener;
        }

        public void run() {
            Map unused = SignalsReader.f28644a = new HashMap();
            String str = null;
            for (Map.Entry<String, QueryInfoMetadata> value : SignalsReader.f28645b.getPlacementQueryInfoMap().entrySet()) {
                QueryInfoMetadata queryInfoMetadata = (QueryInfoMetadata) value.getValue();
                SignalsReader.f28644a.put(queryInfoMetadata.getPlacementId(), queryInfoMetadata.getQueryStr());
                if (queryInfoMetadata.getError() != null) {
                    str = queryInfoMetadata.getError();
                }
            }
            if (SignalsReader.f28644a.size() > 0) {
                this.f28646a.onSignalsCollected(new JSONObject(SignalsReader.f28644a).toString());
            } else if (str == null) {
                this.f28646a.onSignalsCollected("");
            } else {
                this.f28646a.onSignalsCollectionFailed(str);
            }
        }
    }

    public SignalsReader(SignalsStorage signalsStorage) {
        f28645b = signalsStorage;
    }

    public void getSCARSignals(Context context, String[] strArr, String[] strArr2, ISignalCollectionListener iSignalCollectionListener) {
        DispatchGroup dispatchGroup = new DispatchGroup();
        for (String a : strArr) {
            dispatchGroup.enter();
            m32232a(context, a, AdFormat.INTERSTITIAL, dispatchGroup);
        }
        for (String a2 : strArr2) {
            dispatchGroup.enter();
            m32232a(context, a2, AdFormat.REWARDED, dispatchGroup);
        }
        dispatchGroup.notify(new C11806a(iSignalCollectionListener));
    }

    /* renamed from: a */
    private void m32232a(Context context, String str, AdFormat adFormat, DispatchGroup dispatchGroup) {
        AdRequest build = new AdRequest.Builder().build();
        QueryInfoMetadata queryInfoMetadata = new QueryInfoMetadata(str);
        QueryInfoCallback queryInfoCallback = new QueryInfoCallback(queryInfoMetadata, dispatchGroup);
        f28645b.put(str, queryInfoMetadata);
        QueryInfo.generate(context, adFormat, build, queryInfoCallback);
    }
}
