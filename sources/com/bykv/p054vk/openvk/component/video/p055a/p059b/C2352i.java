package com.bykv.p054vk.openvk.component.video.p055a.p059b;

import android.net.Uri;
import android.text.TextUtils;
import com.bykv.p054vk.openvk.component.video.p055a.p066c.C2361a;
import com.facebook.internal.security.CertificateUtil;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bykv.vk.openvk.component.video.a.b.i */
/* compiled from: Request */
public class C2352i {

    /* renamed from: a */
    public final C2355c f4755a;

    /* renamed from: b */
    public final List<C2354b> f4756b;

    /* renamed from: c */
    public final C2353a f4757c;

    public C2352i(C2355c cVar, List<C2354b> list, C2353a aVar) {
        this.f4755a = cVar;
        this.f4756b = list;
        this.f4757c = aVar;
    }

    /* renamed from: a */
    public static C2352i m5426a(InputStream inputStream) throws IOException, C2356d {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, C2361a.f4784a));
        ArrayList arrayList = new ArrayList();
        C2355c cVar = null;
        while (true) {
            String readLine = bufferedReader.readLine();
            if (TextUtils.isEmpty(readLine)) {
                break;
            }
            String trim = readLine.trim();
            if (cVar == null) {
                cVar = C2355c.m5431a(trim);
            } else {
                arrayList.add(C2354b.m5430a(trim));
            }
        }
        if (cVar != null) {
            return new C2352i(cVar, arrayList, C2353a.m5429a(cVar, arrayList));
        }
        throw new C2356d("request line is null");
    }

    /* renamed from: com.bykv.vk.openvk.component.video.a.b.i$c */
    /* compiled from: Request */
    static final class C2355c {

        /* renamed from: a */
        final String f4767a;

        /* renamed from: b */
        final String f4768b;

        /* renamed from: c */
        final String f4769c;

        private C2355c(String str, String str2, String str3) {
            this.f4767a = str;
            this.f4768b = str2;
            this.f4769c = str3;
        }

        /* renamed from: a */
        static C2355c m5431a(String str) throws C2356d {
            int indexOf = str.indexOf(32);
            if (indexOf != -1) {
                int lastIndexOf = str.lastIndexOf(32);
                if (lastIndexOf > indexOf) {
                    String trim = str.substring(0, indexOf).trim();
                    String trim2 = str.substring(indexOf + 1, lastIndexOf).trim();
                    String trim3 = str.substring(lastIndexOf + 1).trim();
                    if (trim.length() != 0 && trim2.length() != 0 && trim3.length() != 0) {
                        return new C2355c(trim, trim2, trim3);
                    }
                    throw new C2356d("request line format error, line: " + str);
                }
                throw new C2356d("request line format error, line: " + str);
            }
            throw new C2356d("request line format error, line: " + str);
        }

        public String toString() {
            return "RequestLine{method='" + this.f4767a + '\'' + ", path='" + this.f4768b + '\'' + ", version='" + this.f4769c + '\'' + '}';
        }
    }

    /* renamed from: com.bykv.vk.openvk.component.video.a.b.i$b */
    /* compiled from: Request */
    public static final class C2354b {

        /* renamed from: a */
        public final String f4765a;

        /* renamed from: b */
        public final String f4766b;

        public C2354b(String str, String str2) {
            this.f4765a = str;
            this.f4766b = str2;
        }

        /* renamed from: a */
        static C2354b m5430a(String str) throws C2356d {
            int indexOf = str.indexOf(CertificateUtil.DELIMITER);
            if (indexOf != -1) {
                String trim = str.substring(0, indexOf).trim();
                String trim2 = str.substring(indexOf + 1).trim();
                if (trim.length() != 0 && trim2.length() != 0) {
                    return new C2354b(trim, trim2);
                }
                throw new C2356d("request header format error, header: " + str);
            }
            throw new C2356d("request header format error, header: " + str);
        }

        public String toString() {
            return "Header{name='" + this.f4765a + '\'' + ", value='" + this.f4766b + '\'' + '}';
        }
    }

    /* renamed from: com.bykv.vk.openvk.component.video.a.b.i$a */
    /* compiled from: Request */
    static final class C2353a {

        /* renamed from: a */
        final int f4758a;

        /* renamed from: b */
        final String f4759b;

        /* renamed from: c */
        final String f4760c;

        /* renamed from: d */
        final int f4761d;

        /* renamed from: e */
        final int f4762e;

        /* renamed from: f */
        final String f4763f;

        /* renamed from: g */
        final List<String> f4764g;

        private C2353a(int i, String str, String str2, int i2, int i3, String str3, List<String> list) {
            this.f4758a = i;
            this.f4759b = str;
            this.f4760c = str2;
            this.f4761d = i2;
            this.f4762e = i3;
            this.f4763f = str3;
            this.f4764g = list;
        }

        /* renamed from: a */
        static C2353a m5429a(C2355c cVar, List<C2354b> list) throws C2356d {
            int i;
            String str;
            int i2;
            int indexOf = cVar.f4768b.indexOf("?");
            if (indexOf != -1) {
                ArrayList arrayList = new ArrayList();
                String str2 = null;
                String str3 = null;
                String str4 = null;
                int i3 = 0;
                for (String split : cVar.f4768b.substring(indexOf + 1).split("&")) {
                    String[] split2 = split.split("=");
                    if (split2.length == 2) {
                        if ("rk".equals(split2[0])) {
                            str3 = Uri.decode(split2[1]);
                        } else if (CampaignEx.JSON_KEY_AD_K.equals(split2[0])) {
                            str4 = Uri.decode(split2[1]);
                        } else if (split2[0].startsWith("u")) {
                            arrayList.add(Uri.decode(split2[1]));
                        } else if (InneractiveMediationDefs.GENDER_FEMALE.equals(split2[0]) && C2361a.m5457b(split2[1]) == 1) {
                            i3 = 1;
                        }
                    }
                }
                if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
                    throw new C2356d("rawKey or key is empty, path: " + cVar.f4768b);
                }
                if (list != null) {
                    i2 = 0;
                    int i4 = 0;
                    for (C2354b next : list) {
                        if (next != null && "Range".equalsIgnoreCase(next.f4765a)) {
                            int indexOf2 = next.f4766b.indexOf("=");
                            if (indexOf2 == -1) {
                                throw new C2356d("Range format error, Range: " + next.f4766b);
                            } else if ("bytes".equalsIgnoreCase(next.f4766b.substring(0, indexOf2).trim())) {
                                String substring = next.f4766b.substring(indexOf2 + 1);
                                if (!substring.contains(",")) {
                                    int indexOf3 = substring.indexOf("-");
                                    if (indexOf3 != -1) {
                                        String trim = substring.substring(0, indexOf3).trim();
                                        String trim2 = substring.substring(indexOf3 + 1).trim();
                                        try {
                                            if (trim.length() > 0) {
                                                i2 = Integer.parseInt(trim);
                                            }
                                            if (trim2.length() > 0) {
                                                i4 = Integer.parseInt(trim2);
                                                if (i2 > i4) {
                                                    throw new C2356d("Range format error, Range: " + next.f4766b);
                                                }
                                            }
                                            str2 = next.f4766b;
                                        } catch (NumberFormatException unused) {
                                            throw new C2356d("Range format error, Range: " + next.f4766b);
                                        }
                                    } else {
                                        throw new C2356d("Range format error, Range: " + next.f4766b);
                                    }
                                } else {
                                    throw new C2356d("Range format error, Range: " + next.f4766b);
                                }
                            } else {
                                throw new C2356d("Range format error, Range: " + next.f4766b);
                            }
                        }
                    }
                    i = i4;
                    str = str2;
                } else {
                    str = null;
                    i = 0;
                    i2 = 0;
                }
                if (!arrayList.isEmpty()) {
                    return new C2353a(i3, str3, str4, i2, i, str, arrayList);
                }
                throw new C2356d("no url found: path: " + cVar.f4768b);
            }
            throw new C2356d("path format error, path: " + cVar.f4768b);
        }

        public String toString() {
            return "Extra{flag=" + this.f4758a + ", rawKey='" + this.f4759b + '\'' + ", key='" + this.f4760c + '\'' + ", from=" + this.f4761d + ", to=" + this.f4762e + ", urls=" + this.f4764g + '}';
        }
    }

    /* renamed from: a */
    static String m5427a(String str, String str2, List<String> list) {
        StringBuilder sb = new StringBuilder(512);
        String str3 = null;
        do {
            if (str3 != null) {
                if (list.size() == 1) {
                    return null;
                }
                list.remove(list.size() - 1);
            }
            str3 = m5428a(sb, str, str2, list);
        } while (str3.length() > 3072);
        return str3;
    }

    /* renamed from: a */
    private static String m5428a(StringBuilder sb, String str, String str2, List<String> list) {
        sb.delete(0, sb.length());
        sb.append("rk");
        sb.append("=");
        sb.append(Uri.encode(str));
        sb.append("&");
        sb.append(CampaignEx.JSON_KEY_AD_K);
        sb.append("=");
        sb.append(Uri.encode(str2));
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append("&");
            sb.append("u");
            sb.append(i);
            sb.append("=");
            sb.append(Uri.encode(list.get(i)));
        }
        return sb.toString();
    }

    public String toString() {
        return "Request{requestLine=" + this.f4755a + ", headers=" + this.f4756b + ", extra=" + this.f4757c + '}';
    }

    /* renamed from: com.bykv.vk.openvk.component.video.a.b.i$d */
    /* compiled from: Request */
    static final class C2356d extends Exception {
        C2356d(String str) {
            super(str);
        }
    }
}
