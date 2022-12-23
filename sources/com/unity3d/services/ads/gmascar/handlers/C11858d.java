package com.unity3d.services.ads.gmascar.handlers;

import com.unity3d.scar.adapter.common.GMAEvent;
import com.unity3d.scar.adapter.common.signals.ISignalCollectionListener;
import com.unity3d.services.core.webview.C12136a;
import com.unity3d.services.core.webview.C12143b;

/* renamed from: com.unity3d.services.ads.gmascar.handlers.d */
/* compiled from: SignalsHandler */
public class C11858d implements ISignalCollectionListener {
    public void onSignalsCollected(String str) {
        C12136a.m33103c().mo71310a((Enum) C12143b.GMA, (Enum) GMAEvent.SIGNALS, str);
    }

    public void onSignalsCollectionFailed(String str) {
        C12136a.m33103c().mo71310a((Enum) C12143b.GMA, (Enum) GMAEvent.SIGNALS_ERROR, str);
    }
}
