package com.ogury.p376cm.internal;

import android.content.Context;
import android.content.SharedPreferences;
import com.ogury.p376cm.internal.aacaa;

/* renamed from: com.ogury.cm.internal.acccb */
public final class acccb extends accca {

    /* renamed from: b */
    public static final aaaaa f24471b = new aaaaa((bbabb) null);

    /* renamed from: c */
    private String f24472c = "cacheConsentV2";

    /* renamed from: com.ogury.cm.internal.acccb$aaaaa */
    public static final class aaaaa {
        private aaaaa() {
        }

        public /* synthetic */ aaaaa(bbabb bbabb) {
            this();
        }
    }

    /* renamed from: b */
    private static abcac m27982b() {
        abbba abbba = abbba.f24320a;
        return (abcac) abcab.m27881d();
    }

    /* renamed from: a */
    public final String mo63926a() {
        return this.f24472c;
    }

    /* renamed from: a */
    public final void mo63923a(Context context) {
        bbabc.m28052b(context, "context");
        super.mo63923a(context);
        abbba abbba = abbba.f24320a;
        if (abbba.m27838f("TCF")) {
            SharedPreferences.Editor edit = context.getSharedPreferences(this.f24472c, 0).edit();
            edit.putInt("purposes", m27982b().mo63878g());
            edit.putString("acceptedVendors", aacaa.aaaaa.m27769a(m27982b().mo63876e()));
            edit.putInt("specialFeatures", m27982b().mo63880i());
            edit.putString("vendorsLi", aacaa.aaaaa.m27769a(m27982b().mo63877f()));
            edit.putInt("purposesLi", m27982b().mo63879h());
            edit.putString("vendorPurposesAndSF", String.valueOf(m27982b().mo63882k()));
            edit.putInt("maxVendorId", m27982b().mo63883l());
            edit.apply();
        }
    }

    /* renamed from: c */
    public final void mo63925c(Context context) {
        bbabc.m28052b(context, "context");
        super.mo63925c(context);
        abbba abbba = abbba.f24320a;
        if (abbba.m27838f("TCF")) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(this.f24472c, 0);
            abcac b = m27982b();
            b.mo63868a(sharedPreferences.getInt("purposes", 0));
            String string = sharedPreferences.getString("acceptedVendors", "");
            bbabc.m28049a((Object) string, "prefs.getString(ACCEPTED_VENDORS, \"\")");
            Object[] array = aacaa.aaaaa.m27770a(aacaa.aaaaa.m27773b(string)).toArray(new Integer[0]);
            if (array != null) {
                b.mo63870a((Integer[]) array);
                b.mo63874c(sharedPreferences.getInt("specialFeatures", 0));
                String string2 = sharedPreferences.getString("vendorsLi", "");
                bbabc.m28049a((Object) string2, "prefs.getString(VENDORS_LI, \"\")");
                Object[] array2 = aacaa.aaaaa.m27770a(aacaa.aaaaa.m27773b(string2)).toArray(new Integer[0]);
                if (array2 != null) {
                    b.mo63873b((Integer[]) array2);
                    b.mo63871b(sharedPreferences.getInt("purposesLi", 0));
                    String string3 = sharedPreferences.getString("vendorPurposesAndSF", "");
                    bbabc.m28049a((Object) string3, "prefs.getString(VENDOR_PURPOSES_AND_SF, \"\")");
                    b.mo63872b(aacaa.aaaaa.m27771a(string3));
                    b.mo63875d(sharedPreferences.getInt("maxVendorId", 0));
                    return;
                }
                throw new babca("null cannot be cast to non-null type kotlin.Array<T>");
            }
            throw new babca("null cannot be cast to non-null type kotlin.Array<T>");
        }
    }
}
