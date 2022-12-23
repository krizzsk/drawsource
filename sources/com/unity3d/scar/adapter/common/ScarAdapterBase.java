package com.unity3d.scar.adapter.common;

import android.app.Activity;
import android.content.Context;
import com.unity3d.scar.adapter.common.scarads.IScarAd;
import com.unity3d.scar.adapter.common.signals.ISignalCollectionListener;
import com.unity3d.scar.adapter.common.signals.ISignalsReader;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public abstract class ScarAdapterBase implements IScarAdapter {

    /* renamed from: a */
    protected ISignalsReader f28519a;

    /* renamed from: b */
    protected Map<String, IScarAd> f28520b = new ConcurrentHashMap();

    /* renamed from: c */
    protected IScarAd f28521c;

    /* renamed from: d */
    protected IAdsErrorHandler f28522d;

    /* renamed from: com.unity3d.scar.adapter.common.ScarAdapterBase$a */
    class C11780a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Activity f28523a;

        C11780a(Activity activity) {
            this.f28523a = activity;
        }

        public void run() {
            ScarAdapterBase.this.f28521c.show(this.f28523a);
        }
    }

    public ScarAdapterBase(IAdsErrorHandler iAdsErrorHandler) {
        this.f28522d = iAdsErrorHandler;
    }

    public void getSCARSignals(Context context, String[] strArr, String[] strArr2, ISignalCollectionListener iSignalCollectionListener) {
        this.f28519a.getSCARSignals(context, strArr, strArr2, iSignalCollectionListener);
    }

    public void show(Activity activity, String str, String str2) {
        IScarAd iScarAd = this.f28520b.get(str2);
        if (iScarAd == null) {
            IAdsErrorHandler iAdsErrorHandler = this.f28522d;
            iAdsErrorHandler.handleError(GMAAdsError.NoAdsError(str2, str, "Could not find ad for placement '" + str2 + "'."));
            return;
        }
        this.f28521c = iScarAd;
        Utils.runOnUiThread(new C11780a(activity));
    }
}
