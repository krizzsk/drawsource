package com.bytedance.sdk.component.utils;

import android.content.Context;
import android.content.pm.Signature;
import com.facebook.internal.security.CertificateUtil;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.bytedance.sdk.component.utils.c */
/* compiled from: AppSigning */
public class C2891c {

    /* renamed from: a */
    private static HashMap<String, ArrayList<String>> f6503a = new HashMap<>();

    /* renamed from: a */
    public static ArrayList<String> m8071a(Context context, String str) {
        ArrayList<String> arrayList = null;
        if (!(context == null || str == null)) {
            String packageName = context.getPackageName();
            if (packageName == null) {
                return null;
            }
            if (f6503a.get(str) != null) {
                return f6503a.get(str);
            }
            arrayList = new ArrayList<>();
            try {
                for (Signature signature : m8072b(context, packageName)) {
                    String str2 = "error!";
                    if (SameMD5.TAG.equals(str)) {
                        str2 = m8070a(signature, SameMD5.TAG);
                    } else if ("SHA1".equals(str)) {
                        str2 = m8070a(signature, "SHA1");
                    } else if ("SHA256".equals(str)) {
                        str2 = m8070a(signature, "SHA256");
                    }
                    arrayList.add(str2);
                }
            } catch (Exception e) {
                C2905l.m8110b(e.toString());
            }
            f6503a.put(str, arrayList);
        }
        return arrayList;
    }

    /* renamed from: a */
    public static String m8069a(Context context) {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> a = m8071a(context, "SHA1");
        if (!(a == null || a.size() == 0)) {
            for (int i = 0; i < a.size(); i++) {
                sb.append(a.get(i));
                if (i < a.size() - 1) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    private static Signature[] m8072b(Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 64).signatures;
        } catch (Exception e) {
            C2905l.m8110b(e.toString());
            return null;
        }
    }

    /* renamed from: a */
    private static String m8070a(Signature signature, String str) {
        byte[] byteArray = signature.toByteArray();
        try {
            MessageDigest instance = MessageDigest.getInstance(str);
            if (instance == null) {
                return "error!";
            }
            byte[] digest = instance.digest(byteArray);
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(Integer.toHexString((b & 255) | 256).substring(1, 3).toUpperCase());
                sb.append(CertificateUtil.DELIMITER);
            }
            return sb.substring(0, sb.length() - 1).toString();
        } catch (Exception e) {
            C2905l.m8110b(e.toString());
            return "error!";
        }
    }
}
