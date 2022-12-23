package com.tapjoy.internal;

import com.tapjoy.TJAdUnitConstants;
import com.tapjoy.TapjoyLog;
import com.tapjoy.internal.C11520gi;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.tapjoy.internal.fo */
public class C11480fo extends C11488fs {

    /* renamed from: b */
    private static final String f27558b = C11480fo.class.getSimpleName();

    public C11480fo(String str, String str2) {
        super(str, str2, "ad");
    }

    /* renamed from: a */
    public final C11520gi.C11522a mo70001a(String str, JSONObject jSONObject) {
        return mo70013a(str, m31443a(jSONObject), m31444b(jSONObject));
    }

    /* renamed from: b */
    public final C11520gi.C11522a mo70002b(String str, JSONObject jSONObject) {
        return mo70016b(str, m31443a(jSONObject), m31444b(jSONObject));
    }

    /* renamed from: a */
    public static Map<String, Object> m31443a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject(TJAdUnitConstants.String.USAGE_TRACKER_DIMENSIONS);
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject2.get(next));
                }
            } catch (JSONException e) {
                TapjoyLog.m30839d(f27558b, "Unable to getAdUnitDimensions. Invalid params: ".concat(String.valueOf(e)));
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    public static Map<String, Long> m31444b(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject(TJAdUnitConstants.String.USAGE_TRACKER_VALUES);
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, Long.valueOf(jSONObject2.getLong(next)));
                }
            } catch (JSONException e) {
                TapjoyLog.m30839d(f27558b, "Unable to getAdUnitValues. Invalid params: ".concat(String.valueOf(e)));
            }
        }
        return hashMap;
    }
}
