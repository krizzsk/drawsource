package com.vungle.warren.network;

import java.util.List;
import okhttp3.Call;
import okhttp3.HttpUrl;

public class APIFactory {
    private static final String TAG = APIFactory.class.getSimpleName();
    private HttpUrl baseUrl;
    private Call.Factory okHttpClient;

    public APIFactory(Call.Factory factory, String str) {
        HttpUrl httpUrl = HttpUrl.get(str);
        this.baseUrl = httpUrl;
        this.okHttpClient = factory;
        List<String> pathSegments = httpUrl.pathSegments();
        if (!"".equals(pathSegments.get(pathSegments.size() - 1))) {
            throw new IllegalArgumentException("baseUrl must end in /: " + str);
        }
    }

    public VungleApi createAPI(String str) {
        VungleApiImpl vungleApiImpl = new VungleApiImpl(this.baseUrl, this.okHttpClient);
        vungleApiImpl.setAppId(str);
        return vungleApiImpl;
    }
}
