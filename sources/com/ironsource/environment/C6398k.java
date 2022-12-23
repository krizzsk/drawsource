package com.ironsource.environment;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ironsource.environment.k */
public class C6398k {

    /* renamed from: a */
    private static final String f16188a = C6398k.class.getSimpleName();

    /* renamed from: b */
    private static final ArrayList<String> f16189b = new ArrayList<String>() {
        {
            add("com.google.market");
            add("com.android.vending");
        }
    };

    /* renamed from: com.ironsource.environment.k$a */
    enum C6401a {
        GOOGLE_PLAY(2, new String[]{"com.android.vending"}),
        GOOGLE_MARKET(4, new String[]{"com.google.market"}),
        SAMSUNG(5, new String[]{"com.sec.android.app.samsungapps"}),
        AMAZON(6, new String[]{"com.amazon.venezia"}),
        HUAWEI(7, new String[]{"com.huawei.appmarket"});
        

        /* renamed from: h */
        private static final Map<String, C6401a> f16196h = null;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public final int f16198f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public final String[] f16199g;

        static {
            f16196h = new HashMap();
            for (C6401a aVar : values()) {
                for (String put : aVar.f16199g) {
                    f16196h.put(put, aVar);
                }
            }
        }

        private C6401a(int i, String[] strArr) {
            this.f16198f = i;
            this.f16199g = strArr;
        }
    }

    /* renamed from: a */
    private static JSONObject m19148a(Context context, ArrayList<String> arrayList) {
        JSONObject jSONObject = new JSONObject();
        try {
            ArrayList<String> c = m19151c(context);
            Iterator<String> it = arrayList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                final boolean contains = c.contains(next.trim().toLowerCase());
                jSONObject.put(next, new JSONObject() {
                    {
                        put("isInstalled", contains);
                    }
                });
            }
        } catch (Exception unused) {
            Log.d(f16188a, "Error while extracting packages installation data");
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static boolean m19149a(Context context) {
        JSONObject a = m19148a(context, f16189b);
        Iterator<String> keys = a.keys();
        while (keys.hasNext()) {
            JSONObject optJSONObject = a.optJSONObject(keys.next());
            if (optJSONObject != null && optJSONObject.optBoolean("isInstalled")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static Integer m19150b(Context context) {
        JSONObject a = m19148a(context, C6401a.m19152a());
        int i = 0;
        for (C6401a aVar : C6401a.values()) {
            String[] a2 = aVar.f16199g;
            int length = a2.length;
            int i2 = 0;
            while (true) {
                if (i2 < length) {
                    JSONObject optJSONObject = a.optJSONObject(a2[i2]);
                    if (optJSONObject != null && optJSONObject.optBoolean("isInstalled")) {
                        i = (int) (((double) i) + Math.pow(2.0d, (double) (aVar.f16198f - 1)));
                        break;
                    }
                    i2++;
                } else {
                    break;
                }
            }
        }
        return Integer.valueOf(i);
    }

    /* renamed from: c */
    private static ArrayList<String> m19151c(Context context) {
        List<ApplicationInfo> p = C6393h.m19132p(context);
        ArrayList<String> arrayList = new ArrayList<>();
        for (ApplicationInfo next : p) {
            if (next != null) {
                arrayList.add(next.packageName.toLowerCase());
            }
        }
        return arrayList;
    }
}
