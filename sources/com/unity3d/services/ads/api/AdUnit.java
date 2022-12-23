package com.unity3d.services.ads.api;

import android.content.Intent;
import android.os.Build;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.WindowInsets;
import com.tapjoy.TJAdUnitConstants;
import com.unity3d.services.ads.adunit.AdUnitActivity;
import com.unity3d.services.ads.adunit.AdUnitSoftwareActivity;
import com.unity3d.services.ads.adunit.AdUnitTransparentActivity;
import com.unity3d.services.ads.adunit.AdUnitTransparentSoftwareActivity;
import com.unity3d.services.ads.adunit.C11809a;
import com.unity3d.services.ads.adunit.C11811c;
import com.unity3d.services.core.log.C12065a;
import com.unity3d.services.core.misc.C12080j;
import com.unity3d.services.core.properties.C12084a;
import com.unity3d.services.core.webview.bridge.C12160l;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AdUnit {

    /* renamed from: a */
    private static AdUnitActivity f28709a = null;

    /* renamed from: b */
    private static int f28710b = -1;

    /* renamed from: com.unity3d.services.ads.api.AdUnit$a */
    static class C11819a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ JSONArray f28711a;

        C11819a(JSONArray jSONArray) {
            this.f28711a = jSONArray;
        }

        public void run() {
            if (AdUnit.getAdUnitActivity() != null) {
                try {
                    AdUnit.getAdUnitActivity().mo70706a(AdUnit.m32323c(this.f28711a));
                } catch (Exception e) {
                    C12065a.m32842a("Corrupted viewlist", e);
                }
            }
        }
    }

    /* renamed from: com.unity3d.services.ads.api.AdUnit$b */
    static class C11820b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Integer f28712a;

        C11820b(Integer num) {
            this.f28712a = num;
        }

        public void run() {
            if (AdUnit.getAdUnitActivity() != null) {
                AdUnit.getAdUnitActivity().mo70710b(this.f28712a.intValue());
            }
        }
    }

    /* renamed from: com.unity3d.services.ads.api.AdUnit$c */
    static class C11821c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Boolean f28713a;

        C11821c(Boolean bool) {
            this.f28713a = bool;
        }

        public void run() {
            if (AdUnit.getAdUnitActivity() != null) {
                AdUnit.getAdUnitActivity().mo70707a(this.f28713a.booleanValue());
            }
        }
    }

    /* renamed from: com.unity3d.services.ads.api.AdUnit$d */
    static class C11822d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Integer f28714a;

        C11822d(Integer num) {
            this.f28714a = num;
        }

        public void run() {
            if (AdUnit.getAdUnitActivity() != null) {
                AdUnit.getAdUnitActivity().mo70712c(this.f28714a.intValue());
            }
        }
    }

    /* renamed from: com.unity3d.services.ads.api.AdUnit$e */
    static class C11823e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f28715a;

        /* renamed from: b */
        final /* synthetic */ Integer f28716b;

        /* renamed from: c */
        final /* synthetic */ Integer f28717c;

        /* renamed from: d */
        final /* synthetic */ Integer f28718d;

        /* renamed from: e */
        final /* synthetic */ Integer f28719e;

        C11823e(String str, Integer num, Integer num2, Integer num3, Integer num4) {
            this.f28715a = str;
            this.f28716b = num;
            this.f28717c = num2;
            this.f28718d = num3;
            this.f28719e = num4;
        }

        public void run() {
            if (AdUnit.getAdUnitActivity() != null) {
                AdUnit.getAdUnitActivity().mo70704a(this.f28715a, this.f28716b.intValue(), this.f28717c.intValue(), this.f28718d.intValue(), this.f28719e.intValue());
            }
        }
    }

    /* renamed from: com.unity3d.services.ads.api.AdUnit$f */
    static class C11824f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ Integer f28720a;

        C11824f(Integer num) {
            this.f28720a = num;
        }

        public void run() {
            if (AdUnit.getAdUnitActivity() != null) {
                AdUnit.getAdUnitActivity().mo70703a(this.f28720a.intValue());
            }
        }
    }

    private AdUnit() {
    }

    /* renamed from: b */
    private static ArrayList<Integer> m32322b(JSONArray jSONArray) throws JSONException {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (Integer num = 0; num.intValue() < jSONArray.length(); num = Integer.valueOf(num.intValue() + 1)) {
            arrayList.add(Integer.valueOf(jSONArray.getInt(num.intValue())));
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static String[] m32323c(JSONArray jSONArray) throws JSONException {
        String[] strArr = new String[jSONArray.length()];
        for (int i = 0; i < jSONArray.length(); i++) {
            strArr[i] = jSONArray.getString(i);
        }
        return strArr;
    }

    @WebViewExposed
    public static void clearMotionEventCapture(C12160l lVar) {
        if (getAdUnitActivity() == null) {
            lVar.mo71346a(C11809a.ADUNIT_NULL, new Object[0]);
        } else if (getAdUnitActivity().mo70708b() != null) {
            getAdUnitActivity().mo70708b().mo70736a();
            lVar.mo71347a(new Object[0]);
        } else {
            lVar.mo71346a(C11809a.LAYOUT_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void close(C12160l lVar) {
        if (getAdUnitActivity() != null) {
            getAdUnitActivity().finish();
            lVar.mo71347a(new Object[0]);
            return;
        }
        lVar.mo71346a(C11809a.ADUNIT_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void endMotionEventCapture(C12160l lVar) {
        if (getAdUnitActivity() == null) {
            lVar.mo71346a(C11809a.ADUNIT_NULL, new Object[0]);
        } else if (getAdUnitActivity().mo70708b() != null) {
            getAdUnitActivity().mo70708b().mo70738b();
            lVar.mo71347a(new Object[0]);
        } else {
            lVar.mo71346a(C11809a.LAYOUT_NULL, new Object[0]);
        }
    }

    public static AdUnitActivity getAdUnitActivity() {
        return f28709a;
    }

    public static int getCurrentAdUnitActivityId() {
        return f28710b;
    }

    @WebViewExposed
    public static void getCurrentMotionEventCount(C12160l lVar) {
        if (getAdUnitActivity() == null) {
            lVar.mo71346a(C11809a.ADUNIT_NULL, new Object[0]);
        } else if (getAdUnitActivity().mo70708b() != null) {
            lVar.mo71347a(Integer.valueOf(getAdUnitActivity().mo70708b().getCurrentEventCount()));
        } else {
            lVar.mo71346a(C11809a.LAYOUT_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void getMotionEventCount(JSONArray jSONArray, C12160l lVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                arrayList.add(Integer.valueOf(jSONArray.getInt(i)));
            } catch (Exception e) {
                C12065a.m32842a("Error retrieving int from eventTypes", e);
            }
        }
        if (getAdUnitActivity() == null) {
            lVar.mo71346a(C11809a.ADUNIT_NULL, new Object[0]);
        } else if (getAdUnitActivity().mo70708b() == null) {
            lVar.mo71346a(C11809a.LAYOUT_NULL, new Object[0]);
        } else if (getAdUnitActivity().mo70708b().getCurrentEventCount() >= getAdUnitActivity().mo70708b().getMaxEventCount()) {
            lVar.mo71346a(C11809a.MAX_MOTION_EVENT_COUNT_REACHED, new Object[0]);
        } else {
            SparseIntArray a = getAdUnitActivity().mo70708b().mo70735a((ArrayList<Integer>) arrayList);
            JSONObject jSONObject = new JSONObject();
            for (int i2 = 0; i2 < a.size(); i2++) {
                int keyAt = a.keyAt(i2);
                try {
                    jSONObject.put(Integer.toString(keyAt), a.get(keyAt));
                } catch (Exception e2) {
                    C12065a.m32842a("Error building response JSON", e2);
                }
            }
            lVar.mo71347a(jSONObject);
        }
    }

    @WebViewExposed
    public static void getMotionEventData(JSONObject jSONObject, C12160l lVar) {
        Iterator<String> keys = jSONObject.keys();
        SparseArray sparseArray = new SparseArray();
        while (true) {
            if (!keys.hasNext()) {
                break;
            }
            String next = keys.next();
            int parseInt = Integer.parseInt(next);
            if (sparseArray.get(parseInt) == null) {
                sparseArray.put(parseInt, new ArrayList());
            }
            JSONArray jSONArray = null;
            try {
                jSONArray = jSONObject.getJSONArray(next);
            } catch (Exception e) {
                C12065a.m32842a("Couldn't fetch keyIndices", e);
            }
            if (jSONArray != null) {
                for (int i = 0; i < jSONArray.length(); i++) {
                    try {
                        ((ArrayList) sparseArray.get(parseInt)).add(Integer.valueOf(jSONArray.getInt(i)));
                    } catch (Exception e2) {
                        C12065a.m32842a("Couldn't add value to requested infos", e2);
                    }
                }
            }
        }
        if (getAdUnitActivity() == null) {
            lVar.mo71346a(C11809a.ADUNIT_NULL, new Object[0]);
        } else if (getAdUnitActivity().mo70708b() == null) {
            lVar.mo71346a(C11809a.LAYOUT_NULL, new Object[0]);
        } else if (getAdUnitActivity().mo70708b().getCurrentEventCount() >= getAdUnitActivity().mo70708b().getMaxEventCount()) {
            lVar.mo71346a(C11809a.MAX_MOTION_EVENT_COUNT_REACHED, new Object[0]);
        } else {
            SparseArray<SparseArray<C11811c>> a = getAdUnitActivity().mo70708b().mo70734a((SparseArray<ArrayList<Integer>>) sparseArray);
            JSONObject jSONObject2 = new JSONObject();
            for (int i2 = 0; i2 < a.size(); i2++) {
                int keyAt = a.keyAt(i2);
                SparseArray sparseArray2 = a.get(keyAt);
                JSONObject jSONObject3 = new JSONObject();
                for (int i3 = 0; i3 < sparseArray2.size(); i3++) {
                    JSONObject jSONObject4 = new JSONObject();
                    int keyAt2 = sparseArray2.keyAt(i3);
                    C11811c cVar = (C11811c) sparseArray2.get(keyAt2);
                    try {
                        jSONObject4.put("action", cVar.mo70724a());
                        jSONObject4.put("isObscured", cVar.mo70733j());
                        jSONObject4.put("toolType", cVar.mo70730g());
                        jSONObject4.put("source", cVar.mo70729f());
                        jSONObject4.put("deviceId", cVar.mo70725b());
                        jSONObject4.put("x", (double) cVar.mo70731h());
                        jSONObject4.put("y", (double) cVar.mo70732i());
                        jSONObject4.put("eventTime", cVar.mo70726c());
                        jSONObject4.put("pressure", (double) cVar.mo70727d());
                        jSONObject4.put("size", (double) cVar.mo70728e());
                        jSONObject3.put(Integer.toString(keyAt2), jSONObject4);
                    } catch (Exception e3) {
                        C12065a.m32843a("Couldn't construct event info", e3);
                    }
                }
                try {
                    jSONObject2.put(Integer.toString(keyAt), jSONObject3);
                } catch (Exception e4) {
                    C12065a.m32843a("Couldn't construct info object", e4);
                }
            }
            lVar.mo71347a(jSONObject2);
        }
    }

    @WebViewExposed
    public static void getOrientation(C12160l lVar) {
        if (getAdUnitActivity() != null) {
            lVar.mo71347a(Integer.valueOf(getAdUnitActivity().getRequestedOrientation()));
            return;
        }
        lVar.mo71346a(C11809a.ADUNIT_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void getSafeAreaInsets(C12160l lVar) {
        if (getAdUnitActivity() == null || getAdUnitActivity().mo70708b() == null) {
            lVar.mo71346a(C11809a.ADUNIT_NULL, new Object[0]);
        } else if (Build.VERSION.SDK_INT >= 28) {
            WindowInsets rootWindowInsets = getAdUnitActivity().mo70708b().getRootWindowInsets();
            if (rootWindowInsets != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    Object invoke = rootWindowInsets.getClass().getMethod("getDisplayCutout", new Class[0]).invoke(rootWindowInsets, new Object[0]);
                    if (invoke != null) {
                        Object invoke2 = invoke.getClass().getMethod("getSafeInsetTop", new Class[0]).invoke(invoke, new Object[0]);
                        Object invoke3 = invoke.getClass().getMethod("getSafeInsetRight", new Class[0]).invoke(invoke, new Object[0]);
                        Object invoke4 = invoke.getClass().getMethod("getSafeInsetBottom", new Class[0]).invoke(invoke, new Object[0]);
                        Object invoke5 = invoke.getClass().getMethod("getSafeInsetLeft", new Class[0]).invoke(invoke, new Object[0]);
                        jSONObject.put("top", invoke2);
                        jSONObject.put("right", invoke3);
                        jSONObject.put(TJAdUnitConstants.String.BOTTOM, invoke4);
                        jSONObject.put("left", invoke5);
                        lVar.mo71347a(jSONObject);
                        return;
                    }
                    lVar.mo71346a(C11809a.NO_DISPLAY_CUTOUT_AVAILABLE, new Object[0]);
                } catch (NoSuchMethodException e) {
                    lVar.mo71346a(C11809a.DISPLAY_CUTOUT_METHOD_NOT_AVAILABLE, new Object[0]);
                    C12065a.m32843a("Method getDisplayCutout not found", e);
                } catch (IllegalAccessException | InvocationTargetException e2) {
                    lVar.mo71346a(C11809a.DISPLAY_CUTOUT_INVOKE_FAILED, new Object[0]);
                    C12065a.m32843a("Error while calling displayCutout getter", e2);
                } catch (JSONException e3) {
                    lVar.mo71346a(C11809a.DISPLAY_CUTOUT_JSON_ERROR, new Object[0]);
                    C12065a.m32843a("JSON error while constructing display cutout object", e3);
                }
            } else {
                lVar.mo71346a(C11809a.NO_DISPLAY_CUTOUT_AVAILABLE, new Object[0]);
            }
        } else {
            lVar.mo71346a(C11809a.API_LEVEL_ERROR, new Object[0]);
        }
    }

    @WebViewExposed
    public static void getViewFrame(String str, C12160l lVar) {
        if (getAdUnitActivity() == null) {
            lVar.mo71346a(C11809a.ADUNIT_NULL, new Object[0]);
        } else if (getAdUnitActivity().mo70709b(str) != null) {
            Map<String, Integer> b = getAdUnitActivity().mo70709b(str);
            lVar.mo71347a(b.get("x"), b.get("y"), b.get("width"), b.get("height"));
        } else {
            lVar.mo71346a(C11809a.UNKNOWN_VIEW, new Object[0]);
        }
    }

    @WebViewExposed
    public static void getViews(C12160l lVar) {
        if (getAdUnitActivity() != null) {
            lVar.mo71347a(new JSONArray(Arrays.asList(getAdUnitActivity().mo70713c())));
            return;
        }
        lVar.mo71346a(C11809a.ADUNIT_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void open(Integer num, JSONArray jSONArray, Integer num2, C12160l lVar) {
        open(num, jSONArray, num2, (JSONArray) null, lVar);
    }

    public static void setAdUnitActivity(AdUnitActivity adUnitActivity) {
        f28709a = adUnitActivity;
    }

    public static void setCurrentAdUnitActivityId(int i) {
        f28710b = i;
    }

    @WebViewExposed
    public static void setKeepScreenOn(Boolean bool, C12160l lVar) {
        C12080j.m32879a((Runnable) new C11821c(bool));
        if (getAdUnitActivity() != null) {
            lVar.mo71347a(new Object[0]);
        } else {
            lVar.mo71346a(C11809a.ADUNIT_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void setKeyEventList(JSONArray jSONArray, C12160l lVar) {
        if (getAdUnitActivity() != null) {
            try {
                getAdUnitActivity().mo70705a(m32322b(jSONArray));
                lVar.mo71347a(jSONArray);
            } catch (Exception e) {
                C12065a.m32842a("Error parsing views from viewList", e);
                lVar.mo71346a(C11809a.CORRUPTED_KEYEVENTLIST, jSONArray, e.getMessage());
            }
        } else {
            lVar.mo71346a(C11809a.ADUNIT_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void setLayoutInDisplayCutoutMode(Integer num, C12160l lVar) {
        C12080j.m32879a((Runnable) new C11824f(num));
        if (getAdUnitActivity() != null) {
            lVar.mo71347a(num);
            return;
        }
        lVar.mo71346a(C11809a.ADUNIT_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void setOrientation(Integer num, C12160l lVar) {
        C12080j.m32879a((Runnable) new C11820b(num));
        if (getAdUnitActivity() != null) {
            lVar.mo71347a(num);
            return;
        }
        lVar.mo71346a(C11809a.ADUNIT_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void setSystemUiVisibility(Integer num, C12160l lVar) {
        C12080j.m32879a((Runnable) new C11822d(num));
        if (getAdUnitActivity() != null) {
            lVar.mo71347a(num);
            return;
        }
        lVar.mo71346a(C11809a.ADUNIT_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void setViewFrame(String str, Integer num, Integer num2, Integer num3, Integer num4, C12160l lVar) {
        C12080j.m32879a((Runnable) new C11823e(str, num, num2, num3, num4));
        if (getAdUnitActivity() != null) {
            lVar.mo71347a(new Object[0]);
        } else {
            lVar.mo71346a(C11809a.ADUNIT_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void setViews(JSONArray jSONArray, C12160l lVar) {
        boolean z;
        try {
            m32323c(jSONArray);
            z = false;
        } catch (JSONException unused) {
            lVar.mo71346a(C11809a.CORRUPTED_VIEWLIST, jSONArray);
            z = true;
        }
        if (!z) {
            C12080j.m32879a((Runnable) new C11819a(jSONArray));
        }
        if (getAdUnitActivity() != null) {
            lVar.mo71347a(jSONArray);
            return;
        }
        lVar.mo71346a(C11809a.ADUNIT_NULL, new Object[0]);
    }

    @WebViewExposed
    public static void startMotionEventCapture(Integer num, C12160l lVar) {
        if (getAdUnitActivity() == null) {
            lVar.mo71346a(C11809a.ADUNIT_NULL, new Object[0]);
        } else if (getAdUnitActivity().mo70708b() != null) {
            getAdUnitActivity().mo70708b().mo70737a(num.intValue());
            lVar.mo71347a(new Object[0]);
        } else {
            lVar.mo71346a(C11809a.LAYOUT_NULL, new Object[0]);
        }
    }

    @WebViewExposed
    public static void open(Integer num, JSONArray jSONArray, Integer num2, JSONArray jSONArray2, C12160l lVar) {
        open(num, jSONArray, num2, jSONArray2, 0, Boolean.TRUE, lVar);
    }

    @WebViewExposed
    public static void open(Integer num, JSONArray jSONArray, Integer num2, JSONArray jSONArray2, Integer num3, Boolean bool, C12160l lVar) {
        open(num, jSONArray, num2, jSONArray2, num3, bool, Boolean.FALSE, lVar);
    }

    @WebViewExposed
    public static void open(Integer num, JSONArray jSONArray, Integer num2, JSONArray jSONArray2, Integer num3, Boolean bool, Boolean bool2, C12160l lVar) {
        open(num, jSONArray, num2, jSONArray2, num3, bool, bool2, 0, lVar);
    }

    @WebViewExposed
    public static void open(Integer num, JSONArray jSONArray, Integer num2, JSONArray jSONArray2, Integer num3, Boolean bool, Boolean bool2, Integer num4, C12160l lVar) {
        Intent intent;
        if (!bool.booleanValue() && bool2.booleanValue()) {
            C12065a.m32845b("Unity Ads opening new transparent ad unit activity, hardware acceleration disabled");
            intent = new Intent(C12084a.m32900a(), AdUnitTransparentSoftwareActivity.class);
        } else if (bool.booleanValue() && !bool2.booleanValue()) {
            C12065a.m32845b("Unity Ads opening new hardware accelerated ad unit activity");
            intent = new Intent(C12084a.m32900a(), AdUnitActivity.class);
        } else if (!bool.booleanValue() || !bool2.booleanValue()) {
            C12065a.m32845b("Unity Ads opening new ad unit activity, hardware acceleration disabled");
            intent = new Intent(C12084a.m32900a(), AdUnitSoftwareActivity.class);
        } else {
            C12065a.m32845b("Unity Ads opening new hardware accelerated transparent ad unit activity");
            intent = new Intent(C12084a.m32900a(), AdUnitTransparentActivity.class);
        }
        intent.addFlags(268500992);
        if (num != null) {
            try {
                intent.putExtra("activityId", num.intValue());
                setCurrentAdUnitActivityId(num.intValue());
                try {
                    intent.putExtra("views", m32323c(jSONArray));
                    if (jSONArray2 != null) {
                        try {
                            intent.putExtra("keyEvents", m32322b(jSONArray2));
                        } catch (Exception e) {
                            C12065a.m32842a("Error parsing views from viewList", e);
                            lVar.mo71346a(C11809a.CORRUPTED_KEYEVENTLIST, jSONArray2, e.getMessage());
                            return;
                        }
                    }
                    intent.putExtra("systemUiVisibility", num3);
                    intent.putExtra(TJAdUnitConstants.String.ORIENTATION, num2);
                    intent.putExtra("displayCutoutMode", num4);
                    C12084a.m32900a().startActivity(intent);
                    C12065a.m32845b("Opened AdUnitActivity with: " + jSONArray.toString());
                    lVar.mo71347a(new Object[0]);
                } catch (Exception e2) {
                    C12065a.m32842a("Error parsing views from viewList", e2);
                    lVar.mo71346a(C11809a.CORRUPTED_VIEWLIST, jSONArray, e2.getMessage());
                }
            } catch (Exception e3) {
                C12065a.m32842a("Could not set activityId for intent", e3);
                lVar.mo71346a(C11809a.ACTIVITY_ID, Integer.valueOf(num.intValue()), e3.getMessage());
            }
        } else {
            C12065a.m32848c("Activity ID is NULL");
            lVar.mo71346a(C11809a.ACTIVITY_ID, "Activity ID NULL");
        }
    }
}
