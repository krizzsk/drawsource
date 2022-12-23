package com.mbridge.msdk.system;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.MBridgeSDK;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.controller.C8396b;
import com.mbridge.msdk.foundation.controller.authoritycontroller.AuthorityInfoBean;
import com.mbridge.msdk.foundation.controller.authoritycontroller.C8395a;
import com.mbridge.msdk.foundation.controller.authoritycontroller.CallBackForDeveloper;
import com.mbridge.msdk.foundation.download.MBDownloadConfig;
import com.mbridge.msdk.foundation.download.MBDownloadManager;
import com.mbridge.msdk.foundation.download.database.IDatabaseOpenHelper;
import com.mbridge.msdk.foundation.download.resource.ResourceConfig;
import com.mbridge.msdk.foundation.download.utils.ILogger;
import com.mbridge.msdk.foundation.p298db.C8414g;
import com.mbridge.msdk.foundation.same.net.C8563n;
import com.mbridge.msdk.foundation.same.net.p311f.C8543d;
import com.mbridge.msdk.foundation.same.report.C8574b;
import com.mbridge.msdk.foundation.same.report.C8598e;
import com.mbridge.msdk.foundation.tools.C8649n;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.out.SDKInitStatusListener;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.mbridge.msdk.system.a */
/* compiled from: MBridgeSDKImpl */
public final class C9196a implements MBridgeSDK {

    /* renamed from: a */
    public static Map<String, String> f22581a;

    /* renamed from: b */
    private volatile MBridgeSDK.PLUGIN_LOAD_STATUS f22582b = MBridgeSDK.PLUGIN_LOAD_STATUS.INITIAL;

    /* renamed from: c */
    private Context f22583c;

    /* renamed from: d */
    private SDKInitStatusListener f22584d;

    /* renamed from: e */
    private boolean f22585e = false;

    /* renamed from: f */
    private final Application.ActivityLifecycleCallbacks f22586f = new Application.ActivityLifecycleCallbacks() {
        public final void onActivityPaused(Activity activity) {
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
            C8649n.m24782a().mo58148c();
        }

        public final void onActivityStarted(Activity activity) {
            int f = C8388a.m23845e().mo56912f();
            if (f == 0) {
                C8598e.m24678a("1");
            }
            C8388a.m23845e().mo56904b(f + 1);
        }

        public final void onActivityResumed(Activity activity) {
            C8388a.m23845e().mo56898a((Context) activity);
        }

        public final void onActivityStopped(Activity activity) {
            int f = C8388a.m23845e().mo56912f();
            if (f <= 1) {
                C8598e.m24678a("2");
            }
            C8388a.m23845e().mo56904b(f - 1);
        }

        public final void onActivityDestroyed(Activity activity) {
            C8649n.m24782a().mo58149d();
            C8388a.m23845e().mo56910d();
        }
    };

    public final void setThirdPartyFeatures(Map<String, Object> map) {
    }

    public final void showUserPrivateInfoTips(Context context, CallBackForDeveloper callBackForDeveloper) {
    }

    /* renamed from: a */
    private void m26193a() {
        this.f22585e = false;
        try {
            if (this.f22583c instanceof Application) {
                ((Application) this.f22583c).registerActivityLifecycleCallbacks(this.f22586f);
            }
            C8563n.m24557a(this.f22583c);
            C8396b.m23890a().mo56948a((Map) f22581a, this.f22583c);
            this.f22582b = MBridgeSDK.PLUGIN_LOAD_STATUS.COMPLETED;
            C8543d.m24463a().mo57969c();
            HandlerThread handlerThread = new HandlerThread("mb_db_thread");
            handlerThread.start();
            Handler handler = new Handler(handlerThread.getLooper());
            MBDownloadConfig.Builder builder = new MBDownloadConfig.Builder();
            builder.setDatabaseHandler(handler);
            builder.setDatabaseOpenHelper(new IDatabaseOpenHelper() {
                public final SQLiteDatabase getReadableDatabase() {
                    return C8414g.m23969a(C8388a.m23845e().mo56913g()).mo57014a();
                }

                public final SQLiteDatabase getWritableDatabase() {
                    return C8414g.m23969a(C8388a.m23845e().mo56913g()).mo57017b();
                }
            });
            builder.setLogger(new ILogger() {
                public final void log(String str, String str2) {
                    C8672v.m24874a(str, str2);
                }

                public final void log(String str, Exception exc) {
                    C8672v.m24874a(str, exc.getMessage());
                }
            });
            MBDownloadManager.getInstance().initialize(C8388a.m23845e().mo56913g(), builder.build(), new ResourceConfig.Builder().setMaxStorageSpace(100).setMaxStorageTime(259200000).build());
            C8574b.m24577a().mo58053b();
            if (this.f22584d != null && !this.f22585e) {
                this.f22585e = true;
                this.f22584d.onInitSuccess();
            }
            try {
                C8649n.m24782a().mo58144a(this.f22583c.getApplicationContext());
            } catch (Exception e) {
                C8672v.m24875a("com.mbridge.msdk", "INIT", e);
            }
        } catch (Exception e2) {
            if (MBridgeConstans.DEBUG) {
                C8672v.m24875a("com.mbridge.msdk", "INIT FAIL", e2);
                e2.printStackTrace();
            }
            SDKInitStatusListener sDKInitStatusListener = this.f22584d;
            if (sDKInitStatusListener != null && !this.f22585e) {
                this.f22585e = true;
                sDKInitStatusListener.onInitFail(e2.getMessage());
            }
        }
    }

    public final MBridgeSDK.PLUGIN_LOAD_STATUS getStatus() {
        return this.f22582b;
    }

    public final void preload(Map<String, Object> map) {
        if (this.f22582b == MBridgeSDK.PLUGIN_LOAD_STATUS.COMPLETED) {
            C8396b.m23890a().mo56947a(map, 0);
        }
    }

    public final void setUserPrivateInfoType(Context context, String str, int i) {
        m26194a(context);
        C8395a.m23879a().mo56940a(str, i);
    }

    public final void setDoNotTrackStatus(boolean z) {
        C8395a.m23879a().mo56943b(z ? 1 : 0);
    }

    public final void setDoNotTrackStatus(Context context, boolean z) {
        m26194a(context);
        C8395a.m23879a().mo56943b(z ? 1 : 0);
    }

    public final AuthorityInfoBean userPrivateInfo(Context context) {
        m26194a(context);
        return C8395a.m23879a().mo56942b();
    }

    public final void setConsentStatus(Context context, int i) {
        m26194a(context);
        C8395a.m23879a().mo56939a(i);
    }

    public final boolean getConsentStatus(Context context) {
        m26194a(context);
        return C8395a.m23879a().mo56945d();
    }

    public final void preloadFrame(Map<String, Object> map) {
        C8396b.m23890a().mo56947a(map, 1);
    }

    public final Map<String, String> getMBConfigurationMap(String str, String str2) {
        return getMBConfigurationMap(str, str2, "");
    }

    public final Map<String, String> getMBConfigurationMap(String str, String str2, String str3) {
        HashMap hashMap = new HashMap();
        hashMap.put(MBridgeConstans.ID_MBRIDGE_APPID, str);
        hashMap.put(MBridgeConstans.ID_MBRIDGE_APPKEY, str2);
        hashMap.put(MBridgeConstans.ID_MBRIDGE_WX_APPID, str3);
        hashMap.put(MBridgeConstans.ID_MBRIDGE_STARTUPCRASH, String.valueOf(1));
        return hashMap;
    }

    public final void release() {
        if (this.f22582b == MBridgeSDK.PLUGIN_LOAD_STATUS.COMPLETED) {
            C8396b.m23890a().mo56949b();
        }
        Context context = this.f22583c;
        if (context instanceof Application) {
            ((Application) context).unregisterActivityLifecycleCallbacks(this.f22586f);
        }
    }

    public final void init(Map<String, String> map, Application application) {
        this.f22583c = application.getApplicationContext();
        f22581a = map;
        m26193a();
    }

    public final void initAsync(Map<String, String> map, Application application) {
        this.f22583c = application.getApplicationContext();
        f22581a = map;
        m26193a();
    }

    public final void init(Map<String, String> map, Context context) {
        this.f22583c = context.getApplicationContext();
        f22581a = map;
        m26193a();
    }

    public final void initAsync(Map<String, String> map, Context context) {
        this.f22583c = context.getApplicationContext();
        f22581a = map;
        m26193a();
    }

    public final void init(Map<String, String> map, Application application, SDKInitStatusListener sDKInitStatusListener) {
        this.f22583c = application;
        this.f22584d = sDKInitStatusListener;
        f22581a = map;
        m26193a();
    }

    public final void initAsync(Map<String, String> map, Application application, SDKInitStatusListener sDKInitStatusListener) {
        this.f22583c = application;
        this.f22584d = sDKInitStatusListener;
        f22581a = map;
        m26193a();
    }

    public final void init(Map<String, String> map, Context context, SDKInitStatusListener sDKInitStatusListener) {
        this.f22583c = context.getApplicationContext();
        this.f22584d = sDKInitStatusListener;
        f22581a = map;
        m26193a();
    }

    public final void initAsync(Map<String, String> map, Context context, SDKInitStatusListener sDKInitStatusListener) {
        this.f22583c = context.getApplicationContext();
        this.f22584d = sDKInitStatusListener;
        f22581a = map;
        m26193a();
    }

    /* renamed from: a */
    private void m26194a(Context context) {
        if (C8388a.m23845e().mo56913g() == null && context != null) {
            C8388a.m23845e().mo56905b(context);
        }
    }

    public final void updateDialogWeakActivity(WeakReference<Activity> weakReference) {
        C8388a.m23845e().mo56901a(weakReference);
    }
}
