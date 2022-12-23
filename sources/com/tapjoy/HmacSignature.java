package com.tapjoy;

import android.net.Uri;
import com.facebook.internal.security.CertificateUtil;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

public class HmacSignature {

    /* renamed from: a */
    private String f26457a;

    /* renamed from: b */
    private String f26458b;

    public HmacSignature(String str, String str2) {
        this.f26457a = str;
        this.f26458b = str2;
    }

    public String sign(String str, Map<String, String> map) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(this.f26458b.getBytes(), this.f26457a);
            Mac instance = Mac.getInstance(this.f26457a);
            instance.init(secretKeySpec);
            Uri parse = Uri.parse(str);
            String str2 = parse.getScheme() + "://" + parse.getHost();
            if (!((parse.getScheme().equals("http") && parse.getPort() == 80) || (parse.getScheme().equals("https") && parse.getPort() == 443)) && -1 != parse.getPort()) {
                str2 = str2 + CertificateUtil.DELIMITER + parse.getPort();
            }
            String str3 = str2.toLowerCase() + parse.getPath();
            String a = m30648a(map);
            String str4 = "POST&" + Uri.encode(str3) + "&" + Uri.encode(a);
            TapjoyLog.m30843v("HmacSignature", "Base Url: ".concat(String.valueOf(str4)));
            byte[] doFinal = instance.doFinal(str4.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : doFinal) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    public boolean matches(String str, Map<String, String> map, String str2) {
        return sign(str, map).equals(str2);
    }

    /* renamed from: a */
    private static String m30648a(Map<String, String> map) {
        TreeSet treeSet = new TreeSet(map.keySet());
        StringBuilder sb = new StringBuilder();
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            sb.append(str + "=" + map.get(str) + "&");
        }
        sb.deleteCharAt(sb.lastIndexOf("&"));
        TapjoyLog.m30843v("HmacSignature", "Unhashed String: " + sb.toString());
        return sb.toString();
    }
}
