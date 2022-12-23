package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import android.content.SharedPreferences;
import com.mbridge.msdk.foundation.controller.C8396b;
import com.mbridge.msdk.foundation.same.p301b.C8476c;
import com.mbridge.msdk.foundation.same.p301b.C8478e;
import com.mbridge.msdk.foundation.tools.FastKV;

/* renamed from: com.mbridge.msdk.foundation.tools.ab */
/* compiled from: SharedPreferencesUtils */
public final class C8614ab {

    /* renamed from: a */
    static FastKV f21124a;

    /* renamed from: a */
    public static void m24712a(Context context, String str, Object obj) {
        String simpleName = obj.getClass().getSimpleName();
        if (context != null) {
            if (C8396b.m23890a().mo56951d() && f21124a == null) {
                try {
                    f21124a = new FastKV.Builder(C8478e.m24306b(C8476c.MBRIDGE_700_CONFIG), "share_date").build();
                } catch (Exception unused) {
                    f21124a = null;
                }
            }
            if (f21124a != null) {
                try {
                    if ("String".equals(simpleName)) {
                        f21124a.putString(str, (String) obj);
                    } else if ("Integer".equals(simpleName)) {
                        f21124a.putInt(str, ((Integer) obj).intValue());
                    } else if ("Boolean".equals(simpleName)) {
                        f21124a.putBoolean(str, ((Boolean) obj).booleanValue());
                    } else if ("Float".equals(simpleName)) {
                        f21124a.putFloat(str, ((Float) obj).floatValue());
                    } else if ("Long".equals(simpleName)) {
                        f21124a.putLong(str, ((Long) obj).longValue());
                    }
                } catch (Exception unused2) {
                }
            } else {
                SharedPreferences.Editor edit = context.getApplicationContext().getSharedPreferences("share_date", 0).edit();
                if ("String".equals(simpleName)) {
                    edit.putString(str, (String) obj);
                } else if ("Integer".equals(simpleName)) {
                    edit.putInt(str, ((Integer) obj).intValue());
                } else if ("Boolean".equals(simpleName)) {
                    edit.putBoolean(str, ((Boolean) obj).booleanValue());
                } else if ("Float".equals(simpleName)) {
                    edit.putFloat(str, ((Float) obj).floatValue());
                } else if ("Long".equals(simpleName)) {
                    edit.putLong(str, ((Long) obj).longValue());
                }
                edit.apply();
            }
        }
    }

    /* renamed from: b */
    public static Object m24713b(Context context, String str, Object obj) {
        if (context == null) {
            return obj;
        }
        String simpleName = obj != null ? obj.getClass().getSimpleName() : "";
        if (C8396b.m23890a().mo56951d() && f21124a == null) {
            try {
                f21124a = new FastKV.Builder(C8478e.m24306b(C8476c.MBRIDGE_700_CONFIG), "share_date").build();
            } catch (Exception unused) {
                f21124a = null;
            }
        }
        if (f21124a != null) {
            try {
                if ("String".equals(simpleName)) {
                    return f21124a.getString(str, (String) obj);
                }
                if ("Integer".equals(simpleName)) {
                    return Integer.valueOf(f21124a.getInt(str, ((Integer) obj).intValue()));
                }
                if ("Boolean".equals(simpleName)) {
                    return Boolean.valueOf(f21124a.getBoolean(str, ((Boolean) obj).booleanValue()));
                }
                if ("Float".equals(simpleName)) {
                    return Float.valueOf(f21124a.getFloat(str, ((Float) obj).floatValue()));
                }
                if ("Long".equals(simpleName)) {
                    return Long.valueOf(f21124a.getLong(str, ((Long) obj).longValue()));
                }
            } catch (Exception unused2) {
                return obj;
            }
        } else {
            SharedPreferences sharedPreferences = context.getSharedPreferences("share_date", 0);
            if ("String".equals(simpleName)) {
                return sharedPreferences.getString(str, (String) obj);
            }
            if ("Integer".equals(simpleName)) {
                return Integer.valueOf(sharedPreferences.getInt(str, ((Integer) obj).intValue()));
            }
            if ("Boolean".equals(simpleName)) {
                return Boolean.valueOf(sharedPreferences.getBoolean(str, ((Boolean) obj).booleanValue()));
            }
            if ("Float".equals(simpleName)) {
                return Float.valueOf(sharedPreferences.getFloat(str, ((Float) obj).floatValue()));
            }
            if ("Long".equals(simpleName)) {
                return Long.valueOf(sharedPreferences.getLong(str, ((Long) obj).longValue()));
            }
        }
        return obj;
    }
}
