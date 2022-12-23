package com.ogury.p376cm.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import com.smaato.sdk.core.gdpr.CmpApiConstants;

/* renamed from: com.ogury.cm.internal.aaacb */
public final class aaacb {

    /* renamed from: a */
    private final SharedPreferences f24235a;

    /* renamed from: b */
    private SharedPreferences.OnSharedPreferenceChangeListener f24236b = new SharedPreferences.OnSharedPreferenceChangeListener(this) {

        /* renamed from: a */
        final /* synthetic */ aaacb f24238a;

        {
            this.f24238a = r1;
        }

        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            aaaaa a;
            if (bbabc.m28051a((Object) str, (Object) CmpApiConstants.IABTCF_TC_STRING) && (a = this.f24238a.f24237c) != null) {
                a.mo63800a();
            }
        }
    };
    /* access modifiers changed from: private */

    /* renamed from: c */
    public aaaaa f24237c;

    /* renamed from: com.ogury.cm.internal.aaacb$aaaaa */
    public interface aaaaa {
        /* renamed from: a */
        void mo63800a();
    }

    public aaacb(Context context) {
        bbabc.m28052b(context, "context");
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        bbabc.m28049a((Object) defaultSharedPreferences, "PreferenceManager.getDef…haredPreferences(context)");
        this.f24235a = defaultSharedPreferences;
    }

    /* renamed from: a */
    public final int mo63803a() {
        return this.f24235a.getInt(CmpApiConstants.IABTCF_POLICY_VERSION, 0);
    }

    /* renamed from: a */
    public final void mo63804a(aaaaa aaaaa2) {
        this.f24237c = aaaaa2;
        this.f24235a.registerOnSharedPreferenceChangeListener(this.f24236b);
    }

    /* renamed from: b */
    public final boolean mo63805b() {
        return this.f24235a.getInt(CmpApiConstants.IABTCF_GDPR_APPLIES, 0) == 1;
    }

    /* renamed from: c */
    public final boolean mo63806c() {
        return this.f24235a.contains(CmpApiConstants.IABTCF_TC_STRING);
    }

    /* renamed from: d */
    public final String mo63807d() {
        String string = this.f24235a.getString(CmpApiConstants.IABTCF_TC_STRING, "");
        bbabc.m28049a((Object) string, "sharedPreferences.getString(\"IABTCF_TCString\", \"\")");
        return string;
    }

    /* renamed from: e */
    public final int mo63808e() {
        return this.f24235a.getInt(CmpApiConstants.IABTCF_CMP_SDK_ID, 0);
    }
}
