package p405ms.p406bd.p407o.Pgl;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: ms.bd.o.Pgl.c */
public class C12600c {
    public static final int CLIENT_TYPE_BUSINESS = 1;
    public static final int CLIENT_TYPE_INHOUSE = 0;
    public static final int CLIENT_TYPE_UNKNOWN = -1;
    public static final int COLLECT_MODE_DEFAULT = 99999;
    public static final int COLLECT_MODE_FINANCE = 300;
    public static final int COLLECT_MODE_HELO = 315;
    public static final int COLLECT_MODE_MINIMIZE = 5;
    public static final int COLLECT_MODE_ML_MINIMIZE = 290;
    public static final int COLLECT_MODE_ML_PGL_AL = 810;
    public static final int COLLECT_MODE_ML_TEEN = 280;
    public static final int COLLECT_MODE_OV_MINIMIZE = 5;
    public static final int COLLECT_MODE_RESSO = 315;
    public static final int COLLECT_MODE_TIKTOK = 503;
    public static final int COLLECT_MODE_TIKTOKLITE = 330;
    public static final int COLLECT_MODE_TIKTOK_BASE = 10;
    public static final int COLLECT_MODE_TIKTOK_GUEST = 504;
    public static final int COLLECT_MODE_TIKTOK_INIT = 5;
    public static final int COLLECT_MODE_TIKTOK_NONUSEA = 603;
    public static final int COLLECT_MODE_TIKTOK_U13 = 10;
    public static final int COLLECT_MODE_TIKTOK_USEA = 503;
    public static final int COLLECT_MODE_TIKTOK_USUNREGISTER = 10;
    public static final int OVREGION_TYPE_SG = 0;
    public static final int OVREGION_TYPE_UNKNOWN = -1;
    public static final int OVREGION_TYPE_VA = 1;

    /* renamed from: a */
    protected String f29851a = "";

    /* renamed from: b */
    protected String f29852b = "";

    /* renamed from: c */
    protected String f29853c = "";

    /* renamed from: d */
    protected String f29854d = "";

    /* renamed from: e */
    protected String f29855e = "";

    /* renamed from: f */
    protected String f29856f = "";

    /* renamed from: g */
    protected String f29857g = "";

    /* renamed from: h */
    protected String f29858h = "";

    /* renamed from: i */
    protected String f29859i = "";

    /* renamed from: j */
    protected int f29860j = -1;

    /* renamed from: k */
    protected int f29861k = -1;

    /* renamed from: l */
    protected int f29862l = COLLECT_MODE_DEFAULT;

    /* renamed from: m */
    protected Map<String, String> f29863m = new HashMap();

    /* renamed from: n */
    protected Map<String, String> f29864n = new HashMap();

    /* renamed from: ms.bd.o.Pgl.c$pblb */
    public interface pblb {
    }

    /* renamed from: ms.bd.o.Pgl.c$pgla */
    public static abstract class pgla<T extends pblb> extends C12600c implements pblb {
        public pgla(String str, String str2) {
            this(str, str2, (int) C12600c.COLLECT_MODE_DEFAULT);
        }

        public pgla(String str, String str2, int i) {
            this.f29851a = str;
            this.f29859i = str2;
            this.f29862l = i;
            if (TextUtils.isEmpty(str) || "0".equals(str) || TextUtils.isEmpty(str2)) {
                throw new IllegalArgumentException("appID or license must be set.");
            }
        }

        public pgla(String str, String str2, String str3) {
            this(str, str2, str3, C12600c.COLLECT_MODE_DEFAULT);
        }

        public pgla(String str, String str2, String str3, int i) {
            this.f29857g = str;
            this.f29858h = str2;
            this.f29859i = str3;
            this.f29862l = i;
            if (TextUtils.isEmpty(str) || "0".equals(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
                throw new IllegalArgumentException("sdkID or license must be set.");
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public C12600c mo74877a() {
            if (this.f29860j != -1) {
                return this;
            }
            throw new IllegalArgumentException("MSConfig init error");
        }

        public T addAdvanceInfo0(String str, String str2) {
            this.f29864n.put(str, str2);
            return this;
        }

        public T setBDDeviceID0(String str) {
            this.f29854d = str;
            return this;
        }

        public T setChannel0(String str) {
            this.f29852b = str;
            return this;
        }

        public T setClientType0(int i) {
            this.f29860j = i;
            return this;
        }

        public T setCustomInfo0(Map<String, String> map) {
            if (map == null) {
                map = new HashMap<>();
            }
            this.f29863m = map;
            return this;
        }

        public T setDeviceID0(String str) {
            this.f29853c = str;
            return this;
        }

        public T setInstallID0(String str) {
            this.f29855e = str;
            return this;
        }

        public T setOVRegionType0(int i) {
            this.f29861k = i;
            return this;
        }

        public T setSecssionID0(String str) {
            this.f29856f = str;
            return this;
        }
    }

    protected C12600c() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public String mo74876a(Object obj) {
        return (obj == null || !(obj instanceof String)) ? "" : ((String) obj).trim();
    }
}
