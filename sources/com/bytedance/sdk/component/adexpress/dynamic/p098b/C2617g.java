package com.bytedance.sdk.component.adexpress.dynamic.p098b;

import android.graphics.Color;
import android.text.TextUtils;
import androidx.core.view.ViewCompat;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.component.adexpress.C2570c;
import com.bytedance.sdk.component.adexpress.dynamic.p099c.C2640l;
import com.facebook.internal.security.CertificateUtil;
import com.tapjoy.TJAdUnitConstants;
import com.vungle.warren.model.VisionDataDBAdapter;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.b.g */
/* compiled from: DynamicLayoutNativeValue */
public class C2617g {

    /* renamed from: a */
    public int f5664a;

    /* renamed from: b */
    public String f5665b;

    /* renamed from: c */
    private C2616f f5666c;

    /* renamed from: d */
    private C2615e f5667d;

    /* renamed from: e */
    private String f5668e;

    public C2617g(C2615e eVar) {
        this.f5667d = eVar;
        this.f5664a = eVar.mo16873a();
        this.f5665b = eVar.mo16879c();
        this.f5668e = eVar.mo16881d();
        if (C2570c.m6620c() == 1) {
            this.f5666c = eVar.mo16883f();
        } else {
            this.f5666c = eVar.mo16882e();
        }
        if (C2570c.m6619b()) {
            this.f5666c = eVar.mo16882e();
        }
    }

    /* renamed from: a */
    public int mo17032a() {
        return (int) this.f5666c.mo16955f();
    }

    /* renamed from: b */
    public int mo17035b() {
        return (int) this.f5666c.mo16970i();
    }

    /* renamed from: c */
    public int mo17036c() {
        return (int) this.f5666c.mo16960g();
    }

    /* renamed from: d */
    public int mo17037d() {
        return (int) this.f5666c.mo16965h();
    }

    /* renamed from: e */
    public float mo17038e() {
        return this.f5666c.mo16975j();
    }

    /* renamed from: f */
    public String mo17039f() {
        return this.f5664a == 0 ? this.f5665b : "";
    }

    /* renamed from: g */
    public int mo17040g() {
        return m6917a(this.f5666c.mo16991n());
    }

    /* renamed from: h */
    public int mo17041h() {
        String m = this.f5666c.mo16987m();
        if ("left".equals(m)) {
            return 2;
        }
        if ("center".equals(m)) {
            return 4;
        }
        if ("right".equals(m)) {
            return 3;
        }
        return 2;
    }

    /* renamed from: i */
    public int mo17042i() {
        int h = mo17041h();
        if (h == 4) {
            return 17;
        }
        return h == 3 ? 5 : 3;
    }

    /* renamed from: j */
    public String mo17043j() {
        int i = this.f5664a;
        if (i == 2 || i == 13) {
            return this.f5665b;
        }
        return "";
    }

    /* renamed from: k */
    public String mo17044k() {
        return this.f5664a == 1 ? this.f5665b : "";
    }

    /* renamed from: l */
    public String mo17045l() {
        return this.f5668e;
    }

    /* renamed from: m */
    public double mo17046m() {
        if (this.f5664a == 11) {
            try {
                double parseDouble = Double.parseDouble(this.f5665b);
                return !C2570c.m6619b() ? (double) ((int) parseDouble) : parseDouble;
            } catch (NumberFormatException unused) {
            }
        }
        return -1.0d;
    }

    /* renamed from: n */
    public double mo17047n() {
        return this.f5666c.mo16979k();
    }

    /* renamed from: o */
    public float mo17048o() {
        return this.f5666c.mo16939c();
    }

    /* renamed from: p */
    public int mo17049p() {
        return m6917a(this.f5666c.mo16997p());
    }

    /* renamed from: q */
    public float mo17050q() {
        return this.f5666c.mo16945d();
    }

    /* renamed from: r */
    public int mo17051r() {
        return this.f5666c.mo16924af();
    }

    /* renamed from: s */
    public boolean mo17052s() {
        return this.f5666c.mo16925ag();
    }

    /* renamed from: a */
    public void mo17033a(float f) {
        this.f5666c.mo16913a(f);
    }

    /* renamed from: t */
    public boolean mo17053t() {
        return this.f5666c.mo17019y();
    }

    /* renamed from: u */
    public int mo17054u() {
        return this.f5666c.mo17020z();
    }

    /* renamed from: v */
    public int mo17055v() {
        String u = this.f5666c.mo17011u();
        if ("skip-with-time-skip-btn".equals(this.f5667d.mo16876b()) || "skip".equals(this.f5667d.mo16876b()) || TextUtils.equals("skip-with-countdowns-skip-btn", this.f5667d.mo16876b())) {
            return 6;
        }
        if (!"skip-with-time-countdown".equals(this.f5667d.mo16876b()) && !"skip-with-time".equals(this.f5667d.mo16876b())) {
            if (this.f5664a == 10 && TextUtils.equals(this.f5666c.mo17013v(), "click")) {
                return 5;
            }
            if (m6915L() && m6916M()) {
                return 0;
            }
            if (m6915L()) {
                return 7;
            }
            if ("feedback-dislike".equals(this.f5667d.mo16876b())) {
                return 3;
            }
            if (!TextUtils.isEmpty(u) && !u.equals("none")) {
                if (u.equals("video") || (this.f5667d.mo16873a() == 7 && TextUtils.equals(u, Constants.NORMAL))) {
                    return (!C2570c.m6619b() || this.f5667d.mo16882e() == null || !this.f5667d.mo16882e().mo16927ai()) ? 4 : 11;
                }
                if (u.equals(Constants.NORMAL)) {
                    return 1;
                }
                if (!u.equals(VisionDataDBAdapter.VisionDataColumns.COLUMN_CREATIVE) && !"slide".equals(this.f5666c.mo17013v())) {
                    return 0;
                }
                return 2;
            }
        }
        return 0;
    }

    /* renamed from: L */
    private boolean m6915L() {
        return "logo-union".equals(this.f5667d.mo16876b()) || "logounion".equals(this.f5667d.mo16876b()) || "logoad".equals(this.f5667d.mo16876b());
    }

    /* renamed from: w */
    public int mo17056w() {
        return m6917a(this.f5666c.mo16994o());
    }

    /* renamed from: x */
    public int mo17057x() {
        return this.f5666c.mo16911a();
    }

    /* renamed from: y */
    public String mo17058y() {
        return this.f5666c.mo16932b();
    }

    /* renamed from: z */
    public String mo17059z() {
        return this.f5666c.mo17013v();
    }

    /* renamed from: M */
    private boolean m6916M() {
        if (C2570c.m6619b()) {
            return false;
        }
        if ((TextUtils.isEmpty(this.f5665b) || !this.f5665b.contains("adx:")) && !C2640l.m7086b()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static int m6917a(String str) {
        String[] split;
        if (TextUtils.isEmpty(str)) {
            return ViewCompat.MEASURED_STATE_MASK;
        }
        if (str.equals(TJAdUnitConstants.String.TRANSPARENT)) {
            return 0;
        }
        if (str.charAt(0) == '#' && str.length() == 7) {
            return Color.parseColor(str);
        }
        if (str.charAt(0) == '#' && str.length() == 9) {
            return Color.parseColor(str);
        }
        if (!str.startsWith("rgba") || (split = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",")) == null || split.length != 4) {
            return ViewCompat.MEASURED_STATE_MASK;
        }
        return (((int) ((Float.parseFloat(split[3]) * 255.0f) + 0.5f)) << 24) | (((int) Float.parseFloat(split[0])) << 16) | (((int) Float.parseFloat(split[1])) << 8) | ((int) Float.parseFloat(split[2])) | 0;
    }

    /* renamed from: b */
    public static float[] m6918b(String str) {
        String[] split = str.substring(str.indexOf("(") + 1, str.indexOf(")")).split(",");
        if (split == null || split.length != 4) {
            return new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        }
        return new float[]{Float.parseFloat(split[0]), Float.parseFloat(split[1]), Float.parseFloat(split[2]), Float.parseFloat(split[3])};
    }

    /* renamed from: a */
    public boolean mo17034a(int i) {
        C2615e eVar = this.f5667d;
        if (eVar == null) {
            return false;
        }
        if (i == 1) {
            this.f5666c = eVar.mo16883f();
        } else {
            this.f5666c = eVar.mo16882e();
        }
        if (this.f5666c != null) {
            return true;
        }
        return false;
    }

    /* renamed from: A */
    public boolean mo17021A() {
        return this.f5666c.mo16902R();
    }

    /* renamed from: B */
    public int mo17022B() {
        return this.f5666c.mo16904T();
    }

    /* renamed from: C */
    public int mo17023C() {
        return this.f5666c.mo16903S();
    }

    /* renamed from: D */
    public String mo17024D() {
        return this.f5666c.mo17009t();
    }

    /* renamed from: E */
    public int mo17025E() {
        return this.f5666c.mo16923ae();
    }

    /* renamed from: F */
    public int mo17026F() {
        return this.f5666c.mo16928aj();
    }

    /* renamed from: G */
    public int mo17027G() {
        return this.f5666c.mo16920ab();
    }

    /* renamed from: H */
    public int mo17028H() {
        return this.f5666c.mo16919aa();
    }

    /* renamed from: I */
    public String mo17029I() {
        return this.f5666c.mo17006s();
    }

    /* renamed from: J */
    public boolean mo17030J() {
        return this.f5666c.mo16954e();
    }

    /* renamed from: K */
    public String mo17031K() {
        return this.f5667d.mo16876b() + CertificateUtil.DELIMITER + this.f5666c.mo16922ad();
    }
}
