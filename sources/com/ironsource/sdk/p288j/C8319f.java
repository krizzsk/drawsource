package com.ironsource.sdk.p288j;

import com.ironsource.sdk.p285g.C8289a;
import org.json.JSONObject;

@Deprecated
/* renamed from: com.ironsource.sdk.j.f */
public interface C8319f extends C8310a {
    void onRVAdClicked();

    void onRVAdClosed();

    void onRVAdCredited(int i);

    void onRVAdOpened();

    void onRVEventNotificationReceived(String str, JSONObject jSONObject);

    void onRVInitFail(String str);

    void onRVInitSuccess(C8289a aVar);

    void onRVNoMoreOffers();

    void onRVShowFail(String str);
}
