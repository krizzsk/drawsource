package com.mbridge.msdk.out;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.click.C6765a;
import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.p298db.C8410e;
import com.mbridge.msdk.foundation.p298db.C8412f;
import com.mbridge.msdk.foundation.p298db.C8414g;
import com.mbridge.msdk.foundation.tools.C8616ad;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.foundation.tools.C8675y;
import com.mbridge.msdk.foundation.tools.C8677z;
import com.mbridge.msdk.mbnative.p334c.C8801a;
import com.mbridge.msdk.mbnative.p336e.C8840a;
import com.mbridge.msdk.out.NativeListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MBNativeHandler extends MBCommonHandler {
    private static final String TAG = MBNativeHandler.class.getName();
    public static final String TEMPLATE_ID = "id";
    public static final String TEMPLATE_NUM = "ad_num";
    private static String mUnitID;
    private C8801a adListener = new C8801a();
    private C6765a clickControler;
    private Context context;
    private Map<String, Object> map;
    private C8840a nativeProvider;
    private List<NativeListener.Template> templateList;
    private NativeListener.NativeTrackingListener trackingListener;

    public void setMustBrowser(boolean z) {
        C8675y.f21253a = z;
    }

    public MBNativeHandler(Context context2) {
        this.context = context2;
        if (C8388a.m23845e().mo56913g() == null && context2 != null) {
            C8388a.m23845e().mo56905b(context2);
        }
        Map<String, Object> map2 = this.map;
        if (map2 != null && map2.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID)) {
            String str = (String) this.map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
            if (!TextUtils.isEmpty(str)) {
                C8801a aVar = this.adListener;
                if (aVar != null) {
                    aVar.mo58486a(str);
                }
                String f = C8677z.m24944f(str);
                if (!TextUtils.isEmpty(f)) {
                    C8677z.m24918a(str, f);
                }
            }
        }
    }

    public MBNativeHandler(Map<String, Object> map2, Context context2) {
        super(map2, context2);
        this.context = context2;
        this.map = map2;
        if (C8388a.m23845e().mo56913g() == null && context2 != null) {
            C8388a.m23845e().mo56905b(context2);
        }
        if (map2 != null) {
            try {
                if (map2.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID) && map2.get(MBridgeConstans.PROPERTIES_UNIT_ID) != null && (map2.get(MBridgeConstans.PROPERTIES_UNIT_ID) instanceof String) && map2.containsKey(MBridgeConstans.NATIVE_VIDEO_WIDTH) && map2.get(MBridgeConstans.NATIVE_VIDEO_WIDTH) != null && (map2.get(MBridgeConstans.NATIVE_VIDEO_WIDTH) instanceof Integer) && map2.containsKey(MBridgeConstans.NATIVE_VIDEO_HEIGHT) && map2.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT) != null) {
                    boolean z = map2.get(MBridgeConstans.NATIVE_VIDEO_HEIGHT) instanceof Integer;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        if (map2 != null && map2.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID)) {
            String str = (String) map2.get(MBridgeConstans.PROPERTIES_UNIT_ID);
            if (!TextUtils.isEmpty(str)) {
                C8801a aVar = this.adListener;
                if (aVar != null) {
                    aVar.mo58486a(str);
                }
                String f = C8677z.m24944f(str);
                if (!TextUtils.isEmpty(f)) {
                    C8677z.m24918a(str, f);
                }
            }
        }
    }

    public static Map<String, Object> getNativeProperties(String str, String str2) {
        HashMap hashMap = new HashMap();
        mUnitID = str2;
        hashMap.put(MBridgeConstans.PROPERTIES_UNIT_ID, str2);
        String str3 = MBridgeConstans.PLACEMENT_ID;
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        hashMap.put(str3, str);
        hashMap.put(MBridgeConstans.PLUGIN_NAME, new String[]{MBridgeConstans.PLUGIN_NATIVE});
        hashMap.put(MBridgeConstans.PROPERTIES_LAYOUT_TYPE, 0);
        return hashMap;
    }

    public void addTemplate(NativeListener.Template template) {
        if (template != null) {
            if (this.templateList == null) {
                this.templateList = new ArrayList();
            }
            this.templateList.add(template);
        }
    }

    public void handleResult(Campaign campaign, String str) {
        if (this.clickControler == null) {
            String str2 = null;
            Map<String, Object> map2 = this.map;
            if (map2 != null) {
                str2 = (String) map2.get(MBridgeConstans.PROPERTIES_UNIT_ID);
            }
            this.clickControler = new C6765a(this.context, str2);
        }
        this.clickControler.mo37043a(campaign, str);
    }

    public String buildTemplateString() {
        try {
            if (this.templateList == null || this.templateList.size() <= 0) {
                return null;
            }
            StringBuffer stringBuffer = new StringBuffer();
            for (NativeListener.Template next : this.templateList) {
                stringBuffer.append("{\"id\":");
                stringBuffer.append(next.getId() + ",");
                stringBuffer.append("\"ad_num\":");
                stringBuffer.append(next.getAdNum() + "},");
            }
            return "[{$native_info}]".replace("{$native_info}", stringBuffer.subSequence(0, stringBuffer.lastIndexOf(",")));
        } catch (Exception unused) {
            return null;
        }
    }

    public static String getTemplateString(List<NativeListener.Template> list) {
        if (list == null) {
            return null;
        }
        try {
            if (list.size() <= 0) {
                return null;
            }
            StringBuffer stringBuffer = new StringBuffer();
            for (NativeListener.Template next : list) {
                stringBuffer.append("{\"id\":");
                stringBuffer.append(next.getId() + ",");
                stringBuffer.append("\"ad_num\":");
                stringBuffer.append(next.getAdNum() + "},");
            }
            return "[{$native_info}]".replace("{$native_info}", stringBuffer.subSequence(0, stringBuffer.lastIndexOf(",")));
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean load() {
        if (this.properties == null || !this.properties.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID)) {
            C8672v.m24877c(TAG, "no unit id.");
            return true;
        }
        loadMB();
        return true;
    }

    private boolean loadMB() {
        if (this.properties == null || !this.properties.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID)) {
            C8672v.m24877c(TAG, "no unit id.");
            return true;
        }
        List<NativeListener.Template> list = this.templateList;
        if (list != null && list.size() > 0) {
            try {
                this.properties.put(MBridgeConstans.NATIVE_INFO, buildTemplateString());
            } catch (Exception unused) {
                C8672v.m24877c(TAG, "MBSDK set template error");
            }
        }
        try {
            this.properties.put(MBridgeConstans.PROPERTIES_HANDLER_CONTROLLER, this);
            if (this.nativeProvider == null) {
                C8840a aVar = new C8840a(this.adListener, this.trackingListener);
                this.nativeProvider = aVar;
                aVar.mo58541a(this.context, (Resources) null, (Map<String, Object>) this.properties);
            }
            this.nativeProvider.mo58540a();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    public boolean loadFrame() {
        if (this.properties == null || !this.properties.containsKey(MBridgeConstans.PROPERTIES_UNIT_ID)) {
            C8672v.m24877c(TAG, "no unit id.");
            return true;
        }
        loadMBFrame();
        return true;
    }

    private boolean loadMBFrame() {
        List<NativeListener.Template> list = this.templateList;
        if (list != null && list.size() > 0) {
            try {
                this.properties.put(MBridgeConstans.NATIVE_INFO, buildTemplateString());
            } catch (Exception unused) {
                C8672v.m24877c(TAG, "MBSDK set template error");
            }
        }
        try {
            this.properties.put(MBridgeConstans.PROPERTIES_HANDLER_CONTROLLER, this);
            if (this.nativeProvider == null) {
                C8840a aVar = new C8840a(this.adListener, this.trackingListener);
                this.nativeProvider = aVar;
                aVar.mo58541a(this.context, (Resources) null, (Map<String, Object>) this.properties);
            }
            this.nativeProvider.mo58547b();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    public void registerView(View view, Campaign campaign) {
        if (this.nativeProvider == null) {
            this.nativeProvider = new C8840a(this.adListener, this.trackingListener);
            if (this.properties != null) {
                this.properties.put(MBridgeConstans.PROPERTIES_HANDLER_CONTROLLER, this);
            }
            this.nativeProvider.mo58541a(this.context, (Resources) null, (Map<String, Object>) this.properties);
        }
        this.nativeProvider.mo58542a(view, campaign);
    }

    public void registerView(View view, List<View> list, Campaign campaign) {
        if (this.nativeProvider == null) {
            this.nativeProvider = new C8840a(this.adListener, this.trackingListener);
            if (this.properties != null) {
                this.properties.put(MBridgeConstans.PROPERTIES_HANDLER_CONTROLLER, this);
            }
            this.nativeProvider.mo58541a(this.context, (Resources) null, (Map<String, Object>) this.properties);
        }
        this.nativeProvider.mo58543a(view, list, campaign);
    }

    public void unregisterView(View view, Campaign campaign) {
        if (this.nativeProvider == null) {
            this.nativeProvider = new C8840a(this.adListener, this.trackingListener);
            if (this.properties != null) {
                this.properties.put(MBridgeConstans.PROPERTIES_HANDLER_CONTROLLER, this);
            }
            this.nativeProvider.mo58541a(this.context, (Resources) null, (Map<String, Object>) this.properties);
        }
        this.nativeProvider.mo58548b(view, campaign);
    }

    public void unregisterView(View view, List<View> list, Campaign campaign) {
        if (this.nativeProvider == null) {
            this.nativeProvider = new C8840a(this.adListener, this.trackingListener);
            if (this.properties != null) {
                this.properties.put(MBridgeConstans.PROPERTIES_HANDLER_CONTROLLER, this);
            }
            this.nativeProvider.mo58541a(this.context, (Resources) null, (Map<String, Object>) this.properties);
        }
        this.nativeProvider.mo58549b(view, list, campaign);
    }

    public void release() {
        C8840a aVar = this.nativeProvider;
        if (aVar != null) {
            aVar.mo58551d();
        }
        this.trackingListener = null;
    }

    public C8801a getAdListener() {
        return this.adListener;
    }

    public void setAdListener(NativeListener.NativeAdListener nativeAdListener) {
        C8801a aVar = new C8801a(nativeAdListener);
        this.adListener = aVar;
        if (aVar != null) {
            aVar.mo58486a(mUnitID);
        }
        C8840a aVar2 = this.nativeProvider;
        if (aVar2 != null) {
            aVar2.mo58544a(this.adListener);
        }
    }

    public NativeListener.NativeTrackingListener getTrackingListener() {
        return this.trackingListener;
    }

    public void setTrackingListener(NativeListener.NativeTrackingListener nativeTrackingListener) {
        this.trackingListener = nativeTrackingListener;
        C8840a aVar = this.nativeProvider;
        if (aVar != null) {
            aVar.mo58545a(nativeTrackingListener);
        }
    }

    public static class KeyWordInfo {
        String keyWordPN;
        String keyWorkVN;

        public String getKeyWordPN() {
            return this.keyWordPN;
        }

        public void setKeyWordPN(String str) {
            this.keyWordPN = str;
        }

        public String getKeyWorkVN() {
            return this.keyWorkVN;
        }

        public void setKeyWorkVN(String str) {
            this.keyWorkVN = str;
        }

        public KeyWordInfo(String str, String str2) {
            this.keyWordPN = str;
            this.keyWorkVN = str2;
        }
    }

    public void clearVideoCache() {
        try {
            if (this.nativeProvider != null) {
                this.nativeProvider.mo58550c();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void clearCacheByUnitid(String str) {
        try {
            if (!C8616ad.m24717a(str)) {
                C8410e.m23925a((C8412f) C8414g.m23969a(C8388a.m23845e().mo56913g())).mo57008c(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getRequestId() {
        C8840a aVar = this.nativeProvider;
        return aVar != null ? aVar.mo58552e() : "";
    }
}
