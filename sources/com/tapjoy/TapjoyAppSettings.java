package com.tapjoy;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;

public class TapjoyAppSettings {
    public static final String TAG = TapjoyAppSettings.class.getSimpleName();

    /* renamed from: b */
    private static TapjoyAppSettings f26746b;

    /* renamed from: a */
    String f26747a;

    /* renamed from: c */
    private Context f26748c;

    /* renamed from: d */
    private SharedPreferences f26749d;

    private TapjoyAppSettings(Context context) {
        this.f26748c = context;
        SharedPreferences sharedPreferences = context.getSharedPreferences(TapjoyConstants.TJC_PREFERENCE, 0);
        this.f26749d = sharedPreferences;
        String string = sharedPreferences.getString(TapjoyConstants.PREF_LOG_LEVEL, (String) null);
        this.f26747a = string;
        if (!TextUtils.isEmpty(string)) {
            String str = TAG;
            TapjoyLog.m30839d(str, "restoreLoggingLevel from sharedPref -- loggingLevel=" + this.f26747a);
            TapjoyLog.m30838a(this.f26747a, true);
        }
    }

    public static TapjoyAppSettings getInstance() {
        return f26746b;
    }

    public static void init(Context context) {
        TapjoyLog.m30839d(TAG, "initializing app settings");
        f26746b = new TapjoyAppSettings(context);
    }

    public void saveLoggingLevel(String str) {
        if (TextUtils.isEmpty(str)) {
            TapjoyLog.m30839d(TAG, "saveLoggingLevel -- server logging level is NULL or Empty string");
            return;
        }
        String str2 = TAG;
        TapjoyLog.m30839d(str2, "saveLoggingLevel -- currentLevel=" + this.f26747a + ";newLevel=" + str);
        if (TextUtils.isEmpty(this.f26747a) || !this.f26747a.equals(str)) {
            SharedPreferences.Editor edit = this.f26749d.edit();
            edit.putString(TapjoyConstants.PREF_LOG_LEVEL, str);
            edit.apply();
            this.f26747a = str;
            TapjoyLog.m30838a(str, true);
        }
        boolean isLoggingEnabled = TapjoyLog.isLoggingEnabled();
        String str3 = TAG;
        StringBuilder sb = new StringBuilder("Tapjoy remote device debugging set to '");
        sb.append(str);
        sb.append("'. The SDK Debug-setting is: ");
        sb.append(isLoggingEnabled ? "'Enabled'" : "'Disabled'");
        TapjoyLog.m30842i(str3, sb.toString());
    }

    public void clearLoggingLevel() {
        SharedPreferences.Editor edit = this.f26749d.edit();
        edit.remove(TapjoyConstants.PREF_LOG_LEVEL);
        edit.apply();
        this.f26747a = null;
        boolean isLoggingEnabled = TapjoyLog.isLoggingEnabled();
        String str = TAG;
        StringBuilder sb = new StringBuilder("Tapjoy remote device debugging 'Disabled'. The SDK Debug-setting is: ");
        sb.append(isLoggingEnabled ? "'Enabled'" : "'Disabled'");
        TapjoyLog.m30842i(str, sb.toString());
        TapjoyLog.setDebugEnabled(isLoggingEnabled);
    }

    public void saveConnectResultAndParams(String str, String str2, long j) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            SharedPreferences.Editor edit = this.f26749d.edit();
            edit.putString(TapjoyConstants.PREF_LAST_CONNECT_RESULT, str);
            edit.putString(TapjoyConstants.PREF_LAST_CONNECT_PARAMS_HASH, str2);
            if (j >= 0) {
                edit.putLong(TapjoyConstants.PREF_LAST_CONNECT_RESULT_EXPIRES, j);
            } else {
                edit.remove(TapjoyConstants.PREF_LAST_CONNECT_RESULT_EXPIRES);
            }
            TapjoyLog.m30842i(TAG, "Stored connect result");
            edit.apply();
        }
    }

    public void removeConnectResult() {
        if (this.f26749d.getString(TapjoyConstants.PREF_LAST_CONNECT_PARAMS_HASH, (String) null) != null) {
            SharedPreferences.Editor edit = this.f26749d.edit();
            edit.remove(TapjoyConstants.PREF_LAST_CONNECT_RESULT);
            edit.remove(TapjoyConstants.PREF_LAST_CONNECT_PARAMS_HASH);
            edit.remove(TapjoyConstants.PREF_LAST_CONNECT_RESULT_EXPIRES);
            TapjoyLog.m30842i(TAG, "Removed connect result");
            edit.apply();
        }
    }

    public String getConnectResult(String str, long j) {
        String string = this.f26749d.getString(TapjoyConstants.PREF_LAST_CONNECT_RESULT, (String) null);
        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(str) && str.equals(this.f26749d.getString(TapjoyConstants.PREF_LAST_CONNECT_PARAMS_HASH, (String) null))) {
            long j2 = this.f26749d.getLong(TapjoyConstants.PREF_LAST_CONNECT_RESULT_EXPIRES, -1);
            if (j2 < 0 || j2 >= j) {
                return string;
            }
        }
        return null;
    }
}
