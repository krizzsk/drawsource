package com.tapjoy.internal;

import android.app.Activity;
import android.content.Context;
import android.opengl.GLSurfaceView;
import com.tapjoy.TJAwardCurrencyListener;
import com.tapjoy.TJConnectListener;
import com.tapjoy.TJEarnedCurrencyListener;
import com.tapjoy.TJGetCurrencyBalanceListener;
import com.tapjoy.TJPlacement;
import com.tapjoy.TJPlacementListener;
import com.tapjoy.TJPrivacyPolicy;
import com.tapjoy.TJSetUserIDListener;
import com.tapjoy.TJSpendCurrencyListener;
import com.tapjoy.TJVideoListener;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/* renamed from: com.tapjoy.internal.et */
public abstract class C11426et {

    /* renamed from: c */
    private static final C11426et f27260c;

    /* renamed from: d */
    private static C11426et f27261d;

    /* renamed from: a */
    protected volatile boolean f27262a = false;

    /* renamed from: b */
    protected volatile boolean f27263b = false;

    /* renamed from: a */
    public abstract TJPlacement mo69884a(String str, TJPlacementListener tJPlacementListener);

    /* renamed from: a */
    public abstract void mo69885a(float f);

    /* renamed from: a */
    public abstract void mo69886a(int i);

    /* renamed from: a */
    public abstract void mo69887a(int i, TJAwardCurrencyListener tJAwardCurrencyListener);

    /* renamed from: a */
    public abstract void mo69888a(int i, TJSpendCurrencyListener tJSpendCurrencyListener);

    /* renamed from: a */
    public abstract void mo69889a(int i, String str);

    /* renamed from: a */
    public abstract void mo69890a(Activity activity);

    /* renamed from: a */
    public abstract void mo69891a(Context context);

    /* renamed from: a */
    public abstract void mo69892a(Context context, Map<String, String> map);

    /* renamed from: a */
    public abstract void mo69893a(Context context, boolean z);

    /* renamed from: a */
    public abstract void mo69894a(GLSurfaceView gLSurfaceView);

    /* renamed from: a */
    public abstract void mo69895a(TJEarnedCurrencyListener tJEarnedCurrencyListener);

    /* renamed from: a */
    public abstract void mo69896a(TJGetCurrencyBalanceListener tJGetCurrencyBalanceListener);

    /* renamed from: a */
    public abstract void mo69897a(TJVideoListener tJVideoListener);

    /* renamed from: a */
    public abstract void mo69898a(String str);

    /* renamed from: a */
    public abstract void mo69899a(String str, long j);

    /* renamed from: a */
    public abstract void mo69900a(String str, TJSetUserIDListener tJSetUserIDListener);

    /* renamed from: a */
    public abstract void mo69901a(String str, String str2);

    /* renamed from: a */
    public abstract void mo69902a(String str, String str2, double d, String str3);

    /* renamed from: a */
    public abstract void mo69903a(String str, String str2, long j);

    /* renamed from: a */
    public abstract void mo69904a(String str, String str2, String str3, String str4);

    /* renamed from: a */
    public abstract void mo69905a(String str, String str2, String str3, String str4, long j);

    /* renamed from: a */
    public abstract void mo69906a(String str, String str2, String str3, String str4, String str5, long j);

    /* renamed from: a */
    public abstract void mo69907a(String str, String str2, String str3, String str4, String str5, long j, String str6, long j2);

    /* renamed from: a */
    public abstract void mo69908a(String str, String str2, String str3, String str4, String str5, long j, String str6, long j2, String str7, long j3);

    /* renamed from: a */
    public abstract void mo69909a(String str, String str2, String str3, String str4, Map<String, Long> map);

    /* renamed from: a */
    public abstract void mo69910a(Set<String> set);

    /* renamed from: a */
    public abstract void mo69911a(boolean z);

    /* renamed from: a */
    public abstract boolean mo69912a(Context context, String str);

    /* renamed from: a */
    public abstract boolean mo69913a(Context context, String str, TJConnectListener tJConnectListener);

    /* renamed from: a */
    public abstract boolean mo69914a(Context context, String str, Hashtable<String, ?> hashtable, TJConnectListener tJConnectListener);

    /* renamed from: b */
    public abstract TJPlacement mo69915b(String str, TJPlacementListener tJPlacementListener);

    /* renamed from: b */
    public abstract String mo69916b();

    /* renamed from: b */
    public abstract void mo69917b(int i);

    /* renamed from: b */
    public abstract void mo69918b(Activity activity);

    /* renamed from: b */
    public abstract void mo69919b(Context context, String str);

    /* renamed from: b */
    public abstract void mo69920b(String str);

    /* renamed from: b */
    public abstract void mo69921b(String str, String str2, String str3, String str4);

    /* renamed from: b */
    public abstract void mo69922b(boolean z);

    /* renamed from: c */
    public abstract float mo69923c();

    /* renamed from: c */
    public abstract void mo69924c(Activity activity);

    /* renamed from: c */
    public abstract void mo69925c(String str);

    /* renamed from: c */
    public abstract void mo69926c(boolean z);

    /* renamed from: d */
    public abstract void mo69927d();

    /* renamed from: d */
    public abstract void mo69928d(String str);

    /* renamed from: d */
    public abstract void mo69929d(boolean z);

    /* renamed from: e */
    public abstract void mo69930e();

    /* renamed from: e */
    public abstract void mo69931e(String str);

    /* renamed from: f */
    public abstract String mo69932f(String str);

    /* renamed from: f */
    public abstract Set<String> mo69933f();

    /* renamed from: g */
    public abstract void mo69934g();

    /* renamed from: g */
    public abstract void mo69935g(String str);

    /* renamed from: h */
    public abstract void mo69936h(String str);

    /* renamed from: h */
    public abstract boolean mo69937h();

    /* renamed from: i */
    public abstract void mo69938i(String str);

    /* renamed from: i */
    public abstract boolean mo69939i();

    /* renamed from: j */
    public abstract boolean mo69940j();

    /* renamed from: k */
    public abstract String mo69941k();

    /* renamed from: l */
    public abstract String mo69942l();

    /* renamed from: m */
    public abstract TJPrivacyPolicy mo69943m();

    C11426et() {
    }

    static {
        C11497fz.m31469a();
        C11486fr.m31451a();
        C11430ev evVar = new C11430ev();
        f27260c = evVar;
        f27261d = evVar;
    }

    /* renamed from: a */
    public static C11426et m31243a() {
        return f27261d;
    }
}
