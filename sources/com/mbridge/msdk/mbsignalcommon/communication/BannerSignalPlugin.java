package com.mbridge.msdk.mbsignalcommon.communication;

import android.content.Context;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.mbsignalcommon.windvane.AbsFeedBackForH5;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;

public class BannerSignalPlugin extends AbsFeedBackForH5 {

    /* renamed from: d */
    private final String f21846d = "BannerSignalPlugin";

    /* renamed from: e */
    private C8870c f21847e;

    public void initialize(Context context, WindVaneWebView windVaneWebView) {
        super.initialize(context, windVaneWebView);
        try {
            if (context instanceof C8870c) {
                this.f21847e = (C8870c) context;
            } else if (windVaneWebView.getObject() != null && (windVaneWebView.getObject() instanceof C8870c)) {
                this.f21847e = (C8870c) windVaneWebView.getObject();
            }
        } catch (Throwable th) {
            C8672v.m24875a("BannerSignalPlugin", "initialize", th);
        }
    }

    public void onSignalCommunication(Object obj, String str) {
        try {
            C8672v.m24878d("BannerSignalPlugin", "onSignalCommunication");
            if (this.f21847e != null) {
                this.f21847e.mo58613f(obj, str);
            }
        } catch (Throwable th) {
            C8672v.m24875a("BannerSignalPlugin", "onSignalCommunication", th);
        }
    }

    public void readyStatus(Object obj, String str) {
        try {
            C8672v.m24878d("BannerSignalPlugin", "readyStatus");
            if (this.f21847e != null) {
                this.f21847e.mo58385c(obj, str);
            }
        } catch (Throwable th) {
            C8672v.m24875a("BannerSignalPlugin", "readyStatus", th);
        }
    }

    public void init(Object obj, String str) {
        try {
            C8672v.m24878d("BannerSignalPlugin", "init");
            if (this.f21847e != null) {
                this.f21847e.mo58382a(obj, str);
            }
        } catch (Throwable th) {
            C8672v.m24875a("BannerSignalPlugin", "init", th);
        }
    }

    public void click(Object obj, String str) {
        try {
            C8672v.m24878d("BannerSignalPlugin", "click");
            if (this.f21847e != null) {
                this.f21847e.mo58384b(obj, str);
            }
        } catch (Throwable th) {
            C8672v.m24875a("BannerSignalPlugin", "click", th);
        }
    }

    public void toggleCloseBtn(Object obj, String str) {
        try {
            C8672v.m24878d("BannerSignalPlugin", "toggleCloseBtn");
            if (this.f21847e != null) {
                this.f21847e.mo58386d(obj, str);
            }
        } catch (Throwable th) {
            C8672v.m24875a("BannerSignalPlugin", "toggleCloseBtn", th);
        }
    }

    public void triggerCloseBtn(Object obj, String str) {
        try {
            C8672v.m24878d("BannerSignalPlugin", "triggerCloseBtn");
            if (this.f21847e != null) {
                this.f21847e.mo58387e(obj, str);
            }
        } catch (Throwable th) {
            C8672v.m24875a("BannerSignalPlugin", "triggerCloseBtn", th);
        }
    }

    public void sendImpressions(Object obj, String str) {
        try {
            C8672v.m24878d("BannerSignalPlugin", "sendImpressions");
            if (this.f21847e != null) {
                this.f21847e.mo58388i(obj, str);
            }
        } catch (Throwable th) {
            C8672v.m24875a("BannerSignalPlugin", "sendImpressions", th);
        }
    }

    public void reportUrls(Object obj, String str) {
        try {
            C8672v.m24878d("BannerSignalPlugin", "reportUrls");
            if (this.f21847e != null) {
                this.f21847e.mo58616k(obj, str);
            }
        } catch (Throwable th) {
            C8672v.m24875a("BannerSignalPlugin", "reportUrls", th);
        }
    }

    public void increaseOfferFrequence(Object obj, String str) {
        try {
            C8672v.m24878d("BannerSignalPlugin", "increaseOfferFrequence");
            if (this.f21847e != null) {
                this.f21847e.mo58617l(obj, str);
            }
        } catch (Throwable th) {
            C8672v.m24875a("BannerSignalPlugin", "increaseOfferFrequence", th);
        }
    }

    public void resetCountdown(Object obj, String str) {
        try {
            C8672v.m24878d("BannerSignalPlugin", "resetCountdown");
            if (this.f21847e != null) {
                this.f21847e.mo58615h(obj, str);
            }
        } catch (Throwable th) {
            C8672v.m24875a("BannerSignalPlugin", "resetCountdown", th);
        }
    }

    public void handlerH5Exception(Object obj, String str) {
        try {
            C8672v.m24878d("BannerSignalPlugin", "handlerH5Exception");
            if (this.f21847e != null) {
                this.f21847e.mo58618m(obj, str);
            }
        } catch (Throwable th) {
            C8672v.m24875a("BannerSignalPlugin", "handlerH5Exception", th);
        }
    }

    public void install(Object obj, String str) {
        try {
            C8672v.m24878d("BannerSignalPlugin", "install");
            if (this.f21847e != null) {
                this.f21847e.mo58614g(obj, str);
            }
        } catch (Throwable th) {
            C8672v.m24875a("BannerSignalPlugin", "install", th);
        }
    }

    public void getNetstat(Object obj, String str) {
        try {
            C8672v.m24878d("BannerSignalPlugin", "getNetstat");
            if (this.f21847e != null) {
                this.f21847e.mo58620o(obj, str);
            }
        } catch (Throwable th) {
            C8672v.m24875a("BannerSignalPlugin", "getNetstat", th);
        }
    }

    public void openURL(Object obj, String str) {
        try {
            C8672v.m24878d("BannerSignalPlugin", "openURL");
            if (this.f21847e != null) {
                this.f21847e.mo58619n(obj, str);
            }
        } catch (Throwable th) {
            C8672v.m24875a("BannerSignalPlugin", "openURL", th);
        }
    }

    public void getFileInfo(Object obj, String str) {
        try {
            C8672v.m24878d("BannerSignalPlugin", "getFileInfo");
            if (this.f21847e != null) {
                this.f21847e.mo58389j(obj, str);
            }
        } catch (Throwable th) {
            C8672v.m24875a("BannerSignalPlugin", "getFileInfo", th);
        }
    }
}
