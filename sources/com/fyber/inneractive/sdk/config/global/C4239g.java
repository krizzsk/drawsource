package com.fyber.inneractive.sdk.config.global;

import com.fyber.inneractive.sdk.config.global.features.C4229e;
import com.fyber.inneractive.sdk.util.IAlog;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.global.g */
public class C4239g {
    /* renamed from: a */
    public static JSONArray m13247a(Map<Class, C4229e> map, boolean z) {
        C4222d dVar;
        JSONArray jSONArray = new JSONArray();
        try {
            for (C4229e next : map.values()) {
                List<C4220b> list = next.f10425c;
                Map<String, C4243k> map2 = next.f10426d;
                for (C4220b next2 : list) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("id", next2.f10412a);
                    if (map2.containsKey(next2.f10412a)) {
                        jSONObject.put("v", map2.get(next2.f10412a).f10445b);
                    } else {
                        jSONObject.put("v", SessionDescription.ATTR_CONTROL);
                    }
                    if (z) {
                        Class<C4221c> cls = C4221c.class;
                        Iterator<C4222d> it = next2.f10415d.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                dVar = null;
                                break;
                            }
                            dVar = it.next();
                            if (cls.equals(dVar.getClass())) {
                                break;
                            }
                        }
                        if (dVar != null && ((C4221c) dVar).f10417b) {
                            Set<Long> set = ((C4221c) dVar).f10416a;
                            JSONArray jSONArray2 = new JSONArray();
                            for (Long put : set) {
                                jSONArray2.put(put);
                            }
                            if (jSONArray2.length() > 0) {
                                jSONObject.put(DownloadCommon.DOWNLOAD_REPORT_FIND_FILE_RESULT_VALUE_D, jSONArray2);
                            }
                        }
                    }
                    jSONArray.put(jSONObject);
                }
            }
            return jSONArray;
        } catch (JSONException e) {
            IAlog.m16446a("ExperimentParamBuilder: Json exception during experiments Json build!", new Object[0]);
            if (IAlog.f13936a <= 3) {
                e.printStackTrace();
            }
            return null;
        }
    }
}
