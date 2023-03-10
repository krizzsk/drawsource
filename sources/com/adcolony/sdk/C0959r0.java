package com.adcolony.sdk;

import android.os.Bundle;
import java.util.HashMap;

/* renamed from: com.adcolony.sdk.r0 */
class C0959r0 {

    /* renamed from: a */
    private static int f749a;

    /* renamed from: b */
    private static HashMap<String, Integer> f750b = new HashMap<>();

    /* renamed from: c */
    private static HashMap<String, Integer> f751c = new HashMap<>();

    /* renamed from: a */
    static boolean m1004a(int i, Bundle bundle) {
        int currentTimeMillis = (int) (System.currentTimeMillis() / 1000);
        if (i != 0) {
            if (i != 1 || bundle == null) {
                return false;
            }
            String string = bundle.getString("zone_id");
            if (f750b.get(string) == null) {
                f750b.put(string, Integer.valueOf(currentTimeMillis));
            }
            if (f751c.get(string) == null) {
                f751c.put(string, 0);
            }
            if (currentTimeMillis - f750b.get(string).intValue() > 1) {
                f751c.put(string, 1);
                f750b.put(string, Integer.valueOf(currentTimeMillis));
                return false;
            }
            int intValue = f751c.get(string).intValue() + 1;
            f751c.put(string, Integer.valueOf(intValue));
            return intValue > 3;
        } else if (currentTimeMillis - f749a < 5) {
            return true;
        } else {
            f749a = currentTimeMillis;
            return false;
        }
    }
}
