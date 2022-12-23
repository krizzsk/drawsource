package com.unity3d.services.core.api;

import android.app.Activity;
import android.net.Uri;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.unity3d.services.core.log.C12065a;
import com.unity3d.services.core.properties.C12084a;
import com.unity3d.services.core.webview.bridge.C12160l;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Intent {

    /* renamed from: a */
    private static WeakReference<Activity> f29111a;

    public enum IntentError {
        COULDNT_PARSE_EXTRAS,
        COULDNT_PARSE_CATEGORIES,
        INTENT_WAS_NULL,
        JSON_EXCEPTION,
        ACTIVITY_WAS_NULL
    }

    /* renamed from: com.unity3d.services.core.api.Intent$a */
    private static class C11973a extends Exception {

        /* renamed from: a */
        private IntentError f29113a;

        /* renamed from: b */
        private Object f29114b;

        public C11973a(IntentError intentError, Object obj) {
            this.f29113a = intentError;
            this.f29114b = obj;
        }

        /* renamed from: a */
        public IntentError mo71016a() {
            return this.f29113a;
        }

        /* renamed from: b */
        public Object mo71017b() {
            return this.f29114b;
        }
    }

    /* renamed from: a */
    private static boolean m32580a(android.content.Intent intent, JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return true;
        }
        int i = 0;
        while (i < jSONArray.length()) {
            try {
                intent.addCategory(jSONArray.getString(i));
                i++;
            } catch (Exception e) {
                C12065a.m32842a("Couldn't parse categories for intent", e);
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m32581b(android.content.Intent intent, JSONArray jSONArray) {
        if (jSONArray == null) {
            return true;
        }
        int i = 0;
        while (i < jSONArray.length()) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (!m32579a(intent, jSONObject.getString(SDKConstants.PARAM_KEY), jSONObject.get("value"))) {
                    return false;
                }
                i++;
            } catch (Exception e) {
                C12065a.m32842a("Couldn't parse extras", e);
                return false;
            }
        }
        return true;
    }

    @WebViewExposed
    public static void canOpenIntent(JSONObject jSONObject, C12160l lVar) {
        try {
            lVar.mo71347a(Boolean.valueOf(m32578a(m32577a(jSONObject))));
        } catch (C11973a e) {
            C12065a.m32842a("Couldn't resolve intent", (Exception) e);
            lVar.mo71346a(e.mo71016a(), e.mo71017b());
        }
    }

    @WebViewExposed
    public static void canOpenIntents(JSONArray jSONArray, C12160l lVar) {
        JSONObject jSONObject = new JSONObject();
        int length = jSONArray.length();
        int i = 0;
        while (i < length) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            try {
                jSONObject.put(optJSONObject.optString("id"), m32578a(m32577a(optJSONObject)));
                i++;
            } catch (C11973a e) {
                C12065a.m32842a("Exception parsing intent", (Exception) e);
                lVar.mo71346a(e.mo71016a(), e.mo71017b());
                return;
            } catch (JSONException e2) {
                lVar.mo71346a(IntentError.JSON_EXCEPTION, e2.getMessage());
                return;
            }
        }
        lVar.mo71347a(jSONObject);
    }

    @WebViewExposed
    public static void launch(JSONObject jSONObject, C12160l lVar) {
        android.content.Intent intent;
        String str = (String) jSONObject.opt("className");
        String str2 = (String) jSONObject.opt("packageName");
        String str3 = (String) jSONObject.opt("action");
        String str4 = (String) jSONObject.opt("uri");
        String str5 = (String) jSONObject.opt("mimeType");
        JSONArray jSONArray = (JSONArray) jSONObject.opt("categories");
        Integer num = (Integer) jSONObject.opt("flags");
        JSONArray jSONArray2 = (JSONArray) jSONObject.opt("extras");
        if (str2 != null && str == null && str3 == null && str5 == null) {
            intent = C12084a.m32908e().getPackageManager().getLaunchIntentForPackage(str2);
            if (intent != null && num.intValue() > -1) {
                intent.addFlags(num.intValue());
            }
        } else {
            android.content.Intent intent2 = new android.content.Intent();
            if (!(str == null || str2 == null)) {
                intent2.setClassName(str2, str);
            }
            if (str3 != null) {
                intent2.setAction(str3);
            }
            if (str4 != null && str5 != null) {
                intent2.setDataAndType(Uri.parse(str4), str5);
            } else if (str4 != null) {
                intent2.setData(Uri.parse(str4));
            } else if (str5 != null) {
                intent2.setType(str5);
            }
            if (num != null && num.intValue() > -1) {
                intent2.setFlags(num.intValue());
            }
            if (!m32580a(intent2, jSONArray)) {
                lVar.mo71346a(IntentError.COULDNT_PARSE_CATEGORIES, jSONArray);
            }
            if (!m32581b(intent2, jSONArray2)) {
                lVar.mo71346a(IntentError.COULDNT_PARSE_EXTRAS, jSONArray2);
            }
            intent = intent2;
        }
        if (intent == null) {
            lVar.mo71346a(IntentError.INTENT_WAS_NULL, new Object[0]);
        } else if (m32576a() != null) {
            m32576a().startActivity(intent);
            lVar.mo71347a(new Object[0]);
        } else {
            lVar.mo71346a(IntentError.ACTIVITY_WAS_NULL, new Object[0]);
        }
    }

    public static void removeActiveActivity(Activity activity) {
        WeakReference<Activity> weakReference = f29111a;
        if (weakReference != null && weakReference.get() != null && activity != null && activity.equals(f29111a.get())) {
            f29111a = null;
        }
    }

    public static void setActiveActivity(Activity activity) {
        if (activity == null) {
            f29111a = null;
        } else {
            f29111a = new WeakReference<>(activity);
        }
    }

    /* renamed from: a */
    private static boolean m32579a(android.content.Intent intent, String str, Object obj) {
        if (obj instanceof String) {
            intent.putExtra(str, (String) obj);
            return true;
        } else if (obj instanceof Integer) {
            intent.putExtra(str, ((Integer) obj).intValue());
            return true;
        } else if (obj instanceof Double) {
            intent.putExtra(str, ((Double) obj).doubleValue());
            return true;
        } else if (obj instanceof Boolean) {
            intent.putExtra(str, ((Boolean) obj).booleanValue());
            return true;
        } else {
            C12065a.m32848c("Unable to parse launch intent extra " + str);
            return false;
        }
    }

    /* renamed from: a */
    private static Activity m32576a() {
        WeakReference<Activity> weakReference = f29111a;
        if (weakReference != null && weakReference.get() != null) {
            return (Activity) f29111a.get();
        }
        if (C12084a.m32900a() != null) {
            return C12084a.m32900a();
        }
        return null;
    }

    /* renamed from: a */
    private static boolean m32578a(android.content.Intent intent) {
        if (C12084a.m32908e().getPackageManager().resolveActivity(intent, 0) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static android.content.Intent m32577a(JSONObject jSONObject) throws C11973a {
        String str = (String) jSONObject.opt("className");
        String str2 = (String) jSONObject.opt("packageName");
        String str3 = (String) jSONObject.opt("action");
        String str4 = (String) jSONObject.opt("uri");
        String str5 = (String) jSONObject.opt("mimeType");
        JSONArray jSONArray = (JSONArray) jSONObject.opt("categories");
        Integer num = (Integer) jSONObject.opt("flags");
        JSONArray jSONArray2 = (JSONArray) jSONObject.opt("extras");
        if (str2 != null && str == null && str3 == null && str5 == null) {
            android.content.Intent launchIntentForPackage = C12084a.m32908e().getPackageManager().getLaunchIntentForPackage(str2);
            if (launchIntentForPackage == null || num.intValue() <= -1) {
                return launchIntentForPackage;
            }
            launchIntentForPackage.addFlags(num.intValue());
            return launchIntentForPackage;
        }
        android.content.Intent intent = new android.content.Intent();
        if (!(str == null || str2 == null)) {
            intent.setClassName(str2, str);
        }
        if (str3 != null) {
            intent.setAction(str3);
        }
        if (str4 != null) {
            intent.setData(Uri.parse(str4));
        }
        if (str5 != null) {
            intent.setType(str5);
        }
        if (num != null && num.intValue() > -1) {
            intent.setFlags(num.intValue());
        }
        if (!m32580a(intent, jSONArray)) {
            throw new C11973a(IntentError.COULDNT_PARSE_CATEGORIES, jSONArray);
        } else if (m32581b(intent, jSONArray2)) {
            return intent;
        } else {
            throw new C11973a(IntentError.COULDNT_PARSE_EXTRAS, jSONArray2);
        }
    }
}
