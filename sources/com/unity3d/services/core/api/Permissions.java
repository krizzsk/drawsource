package com.unity3d.services.core.api;

import android.content.Context;
import com.unity3d.services.ads.adunit.C11809a;
import com.unity3d.services.ads.api.AdUnit;
import com.unity3d.services.core.device.C12017c;
import com.unity3d.services.core.properties.C12084a;
import com.unity3d.services.core.webview.bridge.C12160l;
import com.unity3d.services.core.webview.bridge.WebViewExposed;
import java.util.ArrayList;
import org.json.JSONArray;

public class Permissions {
    @WebViewExposed
    public static void checkPermission(String str, C12160l lVar) {
        if (C12084a.m32908e() == null) {
            lVar.mo71346a(C12017c.APPLICATION_CONTEXT_NULL, new Object[0]);
            return;
        }
        try {
            Context e = C12084a.m32908e();
            lVar.mo71347a(Integer.valueOf(e.getPackageManager().checkPermission(str, e.getPackageName())));
        } catch (Exception e2) {
            lVar.mo71346a(C11978a.ERROR_CHECKING_PERMISSION, e2.getMessage());
        }
    }

    @WebViewExposed
    public static void getPermissions(C12160l lVar) {
        if (C12084a.m32908e() == null) {
            lVar.mo71346a(C12017c.APPLICATION_CONTEXT_NULL, new Object[0]);
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray();
            Context e = C12084a.m32908e();
            String[] strArr = e.getPackageManager().getPackageInfo(e.getPackageName(), 4096).requestedPermissions;
            if (strArr != null) {
                for (String put : strArr) {
                    jSONArray.put(put);
                }
                lVar.mo71347a(jSONArray);
                return;
            }
            lVar.mo71346a(C11978a.NO_REQUESTED_PERMISSIONS, new Object[0]);
        } catch (Exception e2) {
            lVar.mo71346a(C11978a.COULDNT_GET_PERMISSIONS, e2.getMessage());
        }
    }

    @WebViewExposed
    public static void requestPermissions(JSONArray jSONArray, Integer num, C12160l lVar) {
        if (AdUnit.getAdUnitActivity() == null) {
            lVar.mo71346a(C11809a.ADUNIT_NULL, new Object[0]);
        } else if (jSONArray == null || jSONArray.length() < 1) {
            lVar.mo71346a(C11978a.NO_REQUESTED_PERMISSIONS, new Object[0]);
        } else {
            try {
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(jSONArray.getString(i));
                }
                AdUnit.getAdUnitActivity().requestPermissions((String[]) arrayList.toArray(new String[arrayList.size()]), num.intValue());
                lVar.mo71347a(new Object[0]);
            } catch (Exception e) {
                lVar.mo71346a(C11978a.ERROR_REQUESTING_PERMISSIONS, e.getMessage());
            }
        }
    }
}
