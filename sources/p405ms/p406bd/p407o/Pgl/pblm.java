package p405ms.p406bd.p407o.Pgl;

import com.google.common.base.Ascii;
import org.json.JSONObject;
import p405ms.p406bd.p407o.Pgl.pblb;

/* renamed from: ms.bd.o.Pgl.pblm */
public abstract class pblm extends pblb.pgla {

    /* renamed from: a */
    private static pblm f29879a;

    /* renamed from: ms.bd.o.Pgl.pblm$pgla */
    public static class pgla {

        /* renamed from: a */
        private long f29880a;

        /* renamed from: b */
        private long f29881b;

        /* renamed from: c */
        private String f29882c;

        /* renamed from: d */
        private String f29883d;

        /* renamed from: a */
        public void mo74902a(String str) {
            this.f29882c = str;
            this.f29883d = null;
            this.f29880a = System.currentTimeMillis();
        }

        /* renamed from: a */
        public void mo74903a(String str, int i) {
            pblm a = pblm.m33461a();
            if (a != null) {
                long currentTimeMillis = System.currentTimeMillis();
                long j = this.f29880a;
                long j2 = currentTimeMillis - j;
                this.f29881b = j2;
                a.mo74898a(j2, j, this.f29882c, this.f29883d, str, i, (JSONObject) null);
            }
        }

        /* renamed from: b */
        public void mo74904b(String str, int i) {
            pblm a = pblm.m33461a();
            if (a != null) {
                long currentTimeMillis = System.currentTimeMillis();
                long j = this.f29880a;
                long j2 = currentTimeMillis - j;
                this.f29881b = j2;
                a.mo74901b(j2, j, this.f29882c, this.f29883d, str, i, (JSONObject) null);
            }
        }
    }

    /* renamed from: a */
    public static synchronized pblm m33461a() {
        pblm pblm;
        synchronized (pblm.class) {
            pblm = f29879a;
        }
        return pblm;
    }

    /* renamed from: a */
    public static synchronized void m33462a(pblm pblm) {
        synchronized (pblm.class) {
            f29879a = pblm;
        }
    }

    /* renamed from: a */
    public Object mo74897a(int i, int i2, long j, String str, Object obj) throws Throwable {
        if (i != 131073) {
            if (i == 131074) {
                String[] strArr = (String[]) obj;
                if (!(str == null || strArr == null || strArr.length == 0)) {
                    mo74899a(str, new JSONObject(strArr[0]), new JSONObject(strArr[1]), new JSONObject(strArr[2]));
                }
            }
            return null;
        } else if (str == null || !mo74900a(str)) {
            return null;
        } else {
            return (String) pblk.m33455a(16777217, 0, 0, "15fb7c", new byte[]{Ascii.f18305SI, Ascii.f18299FS});
        }
    }

    /* renamed from: a */
    public abstract void mo74898a(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject);

    /* renamed from: a */
    public abstract void mo74899a(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);

    /* renamed from: a */
    public abstract boolean mo74900a(String str);

    /* renamed from: b */
    public abstract void mo74901b(long j, long j2, String str, String str2, String str3, int i, JSONObject jSONObject);
}
