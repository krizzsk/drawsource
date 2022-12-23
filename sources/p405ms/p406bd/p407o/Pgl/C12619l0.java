package p405ms.p406bd.p407o.Pgl;

import android.content.Context;
import android.text.TextUtils;
import androidx.core.view.InputDeviceCompat;
import com.google.common.base.Ascii;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okio.Utf8;
import org.json.JSONArray;
import p405ms.p406bd.p407o.Pgl.pblb;

/* renamed from: ms.bd.o.Pgl.l0 */
public class C12619l0 {

    /* renamed from: a */
    private static volatile boolean f29868a;

    /* renamed from: b */
    private static final Map<String, C12600c> f29869b = new ConcurrentHashMap();

    /* renamed from: ms.bd.o.Pgl.l0$pgla */
    public interface pgla {
        Map<String, String> frameSign(String str, int i);

        Map<String, String> getFeatureHash(String str, byte[] bArr);

        Map<String, String> getReportRaw(String str, int i, Map<String, String> map);

        String getToken();

        void report(String str);

        void setBDDeviceID(String str);

        void setCollectMode(int i);

        void setDeviceID(String str);

        void setInstallID(String str);

        void setSessionID(String str);
    }

    /* renamed from: a */
    public static String m33416a() {
        return (String) pblb.m33437a(67108867);
    }

    /* renamed from: a */
    public static synchronized pgla m33417a(String str) {
        synchronized (C12619l0.class) {
            if (str == null) {
                throw new NullPointerException((String) pblk.m33455a(16777217, 0, 0, "50af32", new byte[]{37, 34, 2, 59, 40, 101, 59, 4, 35, 34, 100, 48, Ascii.ETB, 82, Ascii.f18308US, 32, 34}));
            } else if (!f29868a) {
                return null;
            } else {
                Object a = pblb.m33440a(67108866, str);
                if (a == null) {
                    return null;
                }
                C12600c cVar = f29869b.get(str);
                if (cVar == null) {
                    return null;
                }
                C12617k0 k0Var = new C12617k0(cVar, pgla.m33513a().mo74929b(), ((Long) a).longValue());
                return k0Var;
            }
        }
    }

    /* renamed from: a */
    public static synchronized boolean m33418a(Context context, C12600c cVar, String str, String str2) {
        C12600c cVar2 = cVar;
        synchronized (C12619l0.class) {
            if (context == null) {
                throw new NullPointerException((String) pblk.m33455a(16777217, 0, 0, "c3c598", new byte[]{113, 62, Ascii.f18304RS, 85, 3, 55, 116, 82, 49, 106, 103, 61, Ascii.DC4, 1, 8, 32, 116, 82, 48, 96, 50, Utf8.REPLACEMENT_BYTE, 5, 77, 10}));
            } else if (cVar2 != null) {
                String str3 = cVar2.f29851a;
                String str4 = (str3 == null || str3.length() <= 0) ? cVar2.f29857g : cVar2.f29851a;
                if (str4 == null || str4.length() <= 0) {
                    throw new NullPointerException((String) pblk.m33455a(16777217, 0, 0, "8b4cf5", new byte[]{40, 112, 87, 62, 125, 98, 54, 86, 118, 39, 105, 98, 66, 87, 74, 39, 47}));
                }
                synchronized (C12619l0.class) {
                    if (!f29868a) {
                        Context applicationContext = context.getApplicationContext();
                        pgla.m33513a().mo74928a(applicationContext);
                        try {
                            pblu.m33491a(applicationContext, str2);
                        } catch (Throwable unused) {
                        }
                        pblu.m33491a(applicationContext, str);
                        String str5 = (String) pblk.m33455a(16777217, 0, 0, "ac6ae2", new byte[]{62, 108, 86});
                        pblb.m33441a(16777218, (pblb.pgla) new C12622n());
                        pblb.m33441a(16777217, (pblb.pgla) new C12644y());
                        String str6 = (String) pblk.m33455a(16777217, 0, 0, "48316a", new byte[]{107, 55, 68});
                        pblb.m33441a(16777219, (pblb.pgla) new C12603d0());
                        pblb.m33441a(16777221, (pblb.pgla) new C12605e0());
                        pblb.m33441a(16777222, (pblb.pgla) new C12607f0());
                        pblb.m33441a(16777223, (pblb.pgla) new C12609g0());
                        pblb.m33441a(16777224, (pblb.pgla) new C12611h0());
                        pblb.m33441a(16777225, (pblb.pgla) new C12613i0());
                        pblb.m33441a(16777226, (pblb.pgla) new C12615j0());
                        pblb.m33441a(16777228, (pblb.pgla) new C12602d());
                        pblb.m33441a((int) InputDeviceCompat.SOURCE_JOYSTICK, (pblb.pgla) new C12604e());
                        pblb.m33441a(16777233, (pblb.pgla) new C12606f());
                        pblb.m33441a(16777235, (pblb.pgla) new C12608g());
                        pblb.m33441a(16777238, (pblb.pgla) new C12610h());
                        pblb.m33441a(16777239, (pblb.pgla) new C12612i());
                        pblb.m33441a(16777241, (pblb.pgla) new C12614j());
                        pblb.m33441a(16777242, (pblb.pgla) new C12616k());
                        pblb.m33441a(16777243, (pblb.pgla) new C12618l());
                        pblb.m33441a(16777244, (pblb.pgla) new C12620m());
                        pblb.m33441a(16777245, (pblb.pgla) new C12624o());
                        pblb.m33441a(16777246, (pblb.pgla) new C12626p());
                        pblb.m33441a(16777247, (pblb.pgla) new C12628q());
                        pblb.m33441a(16777248, (pblb.pgla) new C12630r());
                        pblb.m33441a(16777249, (pblb.pgla) new C12632s());
                        pblb.m33441a(16777250, (pblb.pgla) new C12634t());
                        pblb.m33441a(16777251, (pblb.pgla) new C12636u());
                        pblb.m33441a(16777240, (pblb.pgla) new C12638v());
                        pblb.m33441a(16777252, (pblb.pgla) new C12640w());
                        pblb.m33441a(16777253, (pblb.pgla) new C12642x());
                        pblb.m33441a(16777254, (pblb.pgla) new C12646z());
                        pblb.m33441a(16777255, (pblb.pgla) new C12597a0());
                        pblb.m33441a(16777256, (pblb.pgla) new C12599b0());
                        pblb.m33441a(16777257, (pblb.pgla) new C12601c0());
                        pblb.m33441a((int) InputDeviceCompat.SOURCE_HDMI, pbly.m33506b() ? new C12627p0() : new C12623n0());
                        pblb.m33441a(33554434, (pblb.pgla) new C12629q0());
                        pblj.m33452a();
                        com.bytedance.mobsec.metasec.p087ov.pgla.m6188a();
                        pblk.m33455a(16777219, 0, 0, (String) null, applicationContext);
                        pblk.m33455a(16777220, 0, 0, (String) null, (Object) null);
                        f29868a = true;
                    }
                }
                if (f29869b.containsKey(str4)) {
                    return false;
                }
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(cVar2.mo74876a(cVar2.f29851a));
                jSONArray.put(cVar2.mo74876a(cVar2.f29858h));
                jSONArray.put(cVar2.mo74876a(cVar2.f29857g));
                jSONArray.put(cVar2.mo74876a(cVar2.f29859i));
                jSONArray.put(cVar2.mo74876a(C12643x0.m33542a()));
                jSONArray.put(cVar2.mo74876a(cVar2.f29852b));
                jSONArray.put(cVar2.mo74876a(cVar2.f29853c));
                jSONArray.put(cVar2.mo74876a(cVar2.f29854d));
                jSONArray.put(cVar2.mo74876a(cVar2.f29855e));
                jSONArray.put(cVar2.mo74876a(cVar2.f29856f));
                jSONArray.put(String.valueOf(cVar2.f29860j));
                jSONArray.put(String.valueOf(cVar2.f29861k));
                jSONArray.put(String.valueOf(cVar2.f29862l));
                JSONArray jSONArray2 = new JSONArray();
                for (Map.Entry next : cVar2.f29863m.entrySet()) {
                    if (!TextUtils.isEmpty((CharSequence) next.getKey())) {
                        jSONArray2.put(cVar2.mo74876a(next.getKey()));
                        jSONArray2.put(cVar2.mo74876a(next.getValue()));
                    }
                }
                jSONArray.put(jSONArray2);
                JSONArray jSONArray3 = new JSONArray();
                for (Map.Entry next2 : cVar2.f29864n.entrySet()) {
                    if (!TextUtils.isEmpty((CharSequence) next2.getKey())) {
                        jSONArray3.put(cVar2.mo74876a(next2.getKey()));
                        jSONArray3.put(cVar2.mo74876a(next2.getValue()));
                    }
                }
                jSONArray.put(jSONArray3);
                if (!((Boolean) pblb.m33440a(67108865, jSONArray.toString())).booleanValue()) {
                    return false;
                }
                f29869b.put(str4, cVar2);
                return true;
            } else {
                throw new NullPointerException((String) pblk.m33455a(16777217, 0, 0, "c20a0c", new byte[]{113, Utf8.REPLACEMENT_BYTE, 77, 19, 6, 115, 32, Ascii.DLE, 110, 36, 126, 52, 3, Ascii.ESC, 0, 96, 32, 17, 100, 113, 124, 37, 79, Ascii.f18297EM}));
            }
        }
    }
}
