package com.bytedance.sdk.openadsdk.p165d;

import com.bytedance.sdk.component.p108d.C2826h;
import com.bytedance.sdk.component.p108d.C2836r;
import com.bytedance.sdk.component.p108d.p111c.C2766a;
import com.bytedance.sdk.component.p108d.p111c.C2790c;
import com.bytedance.sdk.component.utils.C2905l;

/* renamed from: com.bytedance.sdk.openadsdk.d.b */
/* compiled from: StepTrackImpl */
public class C3710b implements C2836r {

    /* renamed from: a */
    private static int f9615a;

    /* renamed from: b */
    private long f9616b = 0;

    /* renamed from: c */
    private long f9617c;

    /* renamed from: d */
    private boolean f9618d;

    /* renamed from: e */
    private String f9619e;

    public C3710b() {
        f9615a++;
        this.f9619e = "image_request_" + f9615a;
    }

    /* renamed from: a */
    public void mo17680a(String str, C2826h hVar) {
        if (!this.f9618d) {
            C2905l.m8111b("ImageLoaderStep", "start " + this.f9619e + " request:" + hVar.mo17603a() + ", width:" + hVar.mo17610b() + ",height:" + hVar.mo17612c());
            this.f9618d = true;
        }
        this.f9616b = System.currentTimeMillis();
        C2905l.m8111b("ImageLoaderStep", this.f9619e + " start:" + m12142c(str, hVar));
    }

    /* renamed from: b */
    public void mo17681b(String str, C2826h hVar) {
        long currentTimeMillis = System.currentTimeMillis() - this.f9616b;
        this.f9617c += currentTimeMillis;
        C2905l.m8111b("ImageLoaderStep", this.f9619e + " end:" + m12142c(str, hVar) + ",cost：" + currentTimeMillis + " ms" + "， total：" + this.f9617c + "\r\n");
    }

    /* renamed from: c */
    private String m12142c(String str, C2826h hVar) {
        C2766a o;
        String str2;
        if (str == null) {
            return str;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -1867169789:
                if (str.equals("success")) {
                    c = 8;
                    break;
                }
                break;
            case -1584526165:
                if (str.equals("raw_cache")) {
                    c = 4;
                    break;
                }
                break;
            case -1442758754:
                if (str.equals("image_type")) {
                    c = 10;
                    break;
                }
                break;
            case -1428113824:
                if (str.equals("disk_cache")) {
                    c = 5;
                    break;
                }
                break;
            case -1335717394:
                if (str.equals("decode")) {
                    c = 1;
                    break;
                }
                break;
            case -1281977283:
                if (str.equals("failed")) {
                    c = 9;
                    break;
                }
                break;
            case -1076854124:
                if (str.equals("check_duplicate")) {
                    c = 2;
                    break;
                }
                break;
            case 1017400004:
                if (str.equals("memory_cache")) {
                    c = 3;
                    break;
                }
                break;
            case 1478448621:
                if (str.equals("net_request")) {
                    c = 7;
                    break;
                }
                break;
            case 1718821013:
                if (str.equals("generate_key")) {
                    c = 6;
                    break;
                }
                break;
            case 2067979407:
                if (str.equals("cache_policy")) {
                    c = 0;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return "cache policy";
            case 1:
                return "decode";
            case 2:
                return "duplicate request";
            case 3:
                return "memory cache";
            case 4:
                return "raw cache";
            case 5:
                return "disk cache";
            case 6:
                return "generate key:" + hVar.mo17614e();
            case 7:
                return "net request";
            case 8:
                return "success";
            case 9:
                if (!(hVar instanceof C2790c) || (o = ((C2790c) hVar).mo17624o()) == null) {
                    return "fail";
                }
                Throwable c2 = o.mo17550c();
                StringBuilder sb = new StringBuilder();
                sb.append("fail：code:");
                sb.append(o.mo17548a());
                sb.append(", msg:");
                sb.append(o.mo17549b());
                sb.append(", exception:");
                if (c2 != null) {
                    str2 = c2.getMessage();
                } else {
                    str2 = "null \r\n";
                }
                sb.append(str2);
                return sb.toString();
            case 10:
                return "image type：";
            default:
                return str;
        }
    }
}
