package com.inmobi.media;

import android.app.Activity;
import android.view.View;
import java.util.Map;

/* renamed from: com.inmobi.media.j */
/* compiled from: AdContainer */
public interface C6234j {

    /* renamed from: com.inmobi.media.j$a */
    /* compiled from: AdContainer */
    public interface C6235a {
        /* renamed from: a */
        void mo35461a();

        /* renamed from: a */
        void mo35462a(Object obj);

        /* renamed from: b */
        void mo35463b(Object obj);
    }

    /* renamed from: a */
    void mo35448a();

    /* renamed from: a */
    void mo35449a(byte b, Map<String, String> map);

    /* renamed from: b */
    void mo35450b();

    /* renamed from: c */
    boolean mo35451c();

    void destroy();

    C6074ft getAdConfig();

    Object getDataModel();

    C6235a getFullScreenEventsListener();

    String getMarkupType();

    byte getPlacementType();

    View getVideoContainerView();

    C5953dz getViewableAd();

    void setFullScreenActivityContext(Activity activity);
}
