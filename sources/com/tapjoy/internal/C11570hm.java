package com.tapjoy.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import com.amazon.aps.shared.APSAnalytics;
import com.tapjoy.TapjoyConnectFlag;
import com.tapjoy.TapjoyConstants;
import com.tapjoy.internal.C11432ew;
import com.tapjoy.internal.C11450fc;
import com.tapjoy.internal.C11462fg;
import com.tapjoy.internal.C11471fj;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.TimeZone;
import java.util.UUID;

/* renamed from: com.tapjoy.internal.hm */
public final class C11570hm {

    /* renamed from: a */
    public static final String f27781a = UUID.randomUUID().toString();

    /* renamed from: d */
    private static C11570hm f27782d;

    /* renamed from: b */
    final C11471fj.C11472a f27783b = new C11471fj.C11472a();

    /* renamed from: c */
    final C11581ht f27784c;

    /* renamed from: e */
    private final C11450fc.C11451a f27785e = new C11450fc.C11451a();

    /* renamed from: f */
    private final C11432ew.C11433a f27786f = new C11432ew.C11433a();

    /* renamed from: g */
    private final Context f27787g;

    /* renamed from: a */
    public static synchronized C11570hm m31698a(Context context) {
        C11570hm hmVar;
        synchronized (C11570hm.class) {
            if (f27782d == null) {
                f27782d = new C11570hm(context, C11581ht.m31750a(context));
            }
            hmVar = f27782d;
        }
        return hmVar;
    }

    private C11570hm(Context context, C11581ht htVar) {
        C11589hx.m31769a();
        this.f27785e.f27411p = "12.10.0/Android";
        this.f27785e.f27402g = APSAnalytics.OS_NAME;
        this.f27785e.f27403h = Build.VERSION.RELEASE;
        this.f27785e.f27400e = Build.MANUFACTURER;
        this.f27785e.f27401f = Build.MODEL;
        this.f27785e.f27407l = Locale.getDefault().toString();
        this.f27785e.f27408m = TimeZone.getDefault().getID();
        Context applicationContext = context.getApplicationContext();
        this.f27787g = applicationContext;
        C11450fc.C11451a aVar = this.f27785e;
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences(TapjoyConstants.TJC_PREFERENCE, 0);
        File file = new File(C11558hj.m31649c(applicationContext), "deviceid");
        String string = sharedPreferences.getString(TapjoyConstants.PREF_ANALYTICS_ID, (String) null);
        if (TextUtils.isEmpty(string)) {
            String b = file.exists() ? C11534gs.m31572b(C11286ba.m30886a(file)) : null;
            string = b == null ? UUID.randomUUID().toString() : b;
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.putString(TapjoyConstants.PREF_ANALYTICS_ID, string);
            edit.apply();
        }
        aVar.f27399d = string;
        if (!C11506gd.m31493b().mo70076a(TapjoyConnectFlag.DISABLE_ANDROID_ID_AS_ANALYTICS_ID, true)) {
            C11450fc.C11451a aVar2 = this.f27785e;
            String string2 = Settings.Secure.getString(applicationContext.getContentResolver(), "android_id");
            aVar2.f27415t = !"9774d56d682e549c".equals(string2) ? C11534gs.m31572b(string2) : null;
        }
        PackageManager packageManager = applicationContext.getPackageManager();
        TelephonyManager telephonyManager = (TelephonyManager) applicationContext.getSystemService("phone");
        if (telephonyManager != null) {
            String simCountryIso = telephonyManager.getSimCountryIso();
            if (!TextUtils.isEmpty(simCountryIso)) {
                this.f27785e.f27412q = simCountryIso.toUpperCase(Locale.US);
            }
            String networkCountryIso = telephonyManager.getNetworkCountryIso();
            if (!TextUtils.isEmpty(networkCountryIso)) {
                this.f27785e.f27413r = networkCountryIso.toUpperCase(Locale.US);
            }
        }
        String packageName = applicationContext.getPackageName();
        this.f27785e.f27409n = packageName;
        C11450fc.C11451a aVar3 = this.f27785e;
        Signature[] e = C11691y.m32067e(packageManager, packageName);
        aVar3.f27410o = C11534gs.m31571a((e == null || e.length <= 0) ? null : Base64.encodeToString(C11322cb.m31027a(e[0].toByteArray()), 2));
        this.f27786f.f27283c = C11691y.m32063a(packageManager, packageName);
        this.f27786f.f27284d = Integer.valueOf(C11691y.m32064b(packageManager, packageName));
        String installerPackageName = packageManager.getInstallerPackageName(packageName);
        if (!TextUtils.isEmpty(installerPackageName)) {
            this.f27786f.f27286f = installerPackageName;
        }
        String a = m31699a(packageManager, packageName);
        if (!TextUtils.isEmpty(a)) {
            this.f27786f.f27287g = a;
        }
        mo70140a();
        this.f27784c = htVar;
        String a2 = htVar.f27828c.mo70312a();
        if (a2 != null && a2.length() > 0) {
            C11450fc.C11451a aVar4 = this.f27785e;
            aVar4.f27411p = a2 + " 12.10.0/Android";
        }
        String b2 = this.f27784c.mo70168b();
        if (b2 != null) {
            this.f27783b.f27523d = b2;
        }
        C11471fj.C11472a aVar5 = this.f27783b;
        C11581ht htVar2 = this.f27784c;
        long j = htVar2.f27827b.getLong("it", 0);
        if (j == 0) {
            Context context2 = htVar2.f27826a;
            j = C11691y.m32065c(context2.getPackageManager(), context2.getPackageName());
            if (j == 0) {
                j = C11558hj.m31650d(htVar2.f27826a).lastModified();
                if (j == 0) {
                    Context context3 = htVar2.f27826a;
                    j = new File(C11691y.m32066d(context3.getPackageManager(), context3.getPackageName())).lastModified();
                    if (j == 0) {
                        j = System.currentTimeMillis();
                    }
                }
            }
            htVar2.f27827b.edit().putLong("it", j).apply();
        }
        aVar5.f27522c = Long.valueOf(j);
        int b3 = this.f27784c.f27831f.mo70238b();
        this.f27783b.f27524e = Integer.valueOf(m31697a(7, b3));
        this.f27783b.f27525f = Integer.valueOf(m31697a(30, b3));
        int b4 = this.f27784c.f27833h.mo70238b();
        if (b4 > 0) {
            this.f27783b.f27527h = Integer.valueOf(b4);
        }
        long a3 = this.f27784c.f27834i.mo70306a();
        if (a3 > 0) {
            this.f27783b.f27528i = Long.valueOf(a3);
        }
        long a4 = this.f27784c.f27835j.mo70306a();
        if (a4 > 0) {
            this.f27783b.f27529j = Long.valueOf(a4);
        }
        long a5 = this.f27784c.f27836k.mo70306a();
        if (a5 > 0) {
            this.f27783b.f27530k = Long.valueOf(a5);
        }
        String a6 = this.f27784c.f27837l.mo70312a();
        if (a6 != null) {
            this.f27783b.f27531l = a6;
        }
        int b5 = this.f27784c.f27838m.mo70238b();
        if (b5 > 0) {
            this.f27783b.f27532m = Integer.valueOf(b5);
        }
        double a7 = this.f27784c.f27839n.mo70180a();
        if (a7 != 0.0d) {
            this.f27783b.f27533n = Double.valueOf(a7);
        }
        long a8 = this.f27784c.f27840o.mo70306a();
        if (a8 > 0) {
            this.f27783b.f27534o = Long.valueOf(a8);
        }
        double a9 = this.f27784c.f27841p.mo70180a();
        if (a9 != 0.0d) {
            this.f27783b.f27535p = Double.valueOf(a9);
        }
        String a10 = this.f27784c.f27832g.mo70312a();
        if (a10 != null) {
            try {
                byte[] decode = Base64.decode(a10, 2);
                this.f27783b.f27526g.clear();
                this.f27783b.f27526g.addAll(C11465fh.f27472c.mo69854a(decode).f27473d);
            } catch (IllegalArgumentException unused) {
                this.f27784c.f27832g.mo70310c();
            } catch (IOException unused2) {
                this.f27784c.f27832g.mo70310c();
            }
        }
        this.f27786f.f27285e = this.f27784c.f27842q.mo70312a();
        this.f27783b.f27538s = this.f27784c.f27843r.mo70312a();
        int intValue = this.f27784c.f27844s.mo70235a().intValue();
        this.f27783b.f27539t = intValue != -1 ? Integer.valueOf(intValue) : null;
        int intValue2 = this.f27784c.f27845t.mo70235a().intValue();
        this.f27783b.f27540u = intValue2 != -1 ? Integer.valueOf(intValue2) : null;
        this.f27783b.f27541v = this.f27784c.f27846u.mo70312a();
        this.f27783b.f27542w = this.f27784c.f27847v.mo70312a();
        this.f27783b.f27543x = this.f27784c.f27848w.mo70312a();
        this.f27783b.f27544y = this.f27784c.f27849x.mo70312a();
        this.f27783b.f27545z = this.f27784c.f27850y.mo70312a();
        String a11 = this.f27784c.f27851z.mo70312a();
        if (a11 != null) {
            try {
                byte[] decode2 = Base64.decode(a11, 2);
                this.f27783b.f27520A.clear();
                this.f27783b.f27520A.addAll(C11468fi.f27475c.mo69854a(decode2).f27476d);
            } catch (IllegalArgumentException unused3) {
                this.f27784c.f27851z.mo70310c();
            } catch (IOException unused4) {
                this.f27784c.f27851z.mo70310c();
            }
        }
        String a12 = this.f27784c.f27822A.mo70312a();
        boolean booleanValue = this.f27784c.f27823B.mo70027a().booleanValue();
        if (a12 != null) {
            this.f27783b.f27536q = a12;
            this.f27783b.f27537r = Boolean.valueOf(booleanValue);
        } else {
            this.f27783b.f27536q = null;
            this.f27783b.f27537r = null;
        }
        this.f27783b.f27521B = this.f27784c.f27824C.mo70027a();
    }

    /* renamed from: a */
    private static String m31699a(PackageManager packageManager, String str) {
        Object obj;
        try {
            Bundle bundle = packageManager.getApplicationInfo(str, 128).metaData;
            if (bundle == null || (obj = bundle.get("com.tapjoy.appstore")) == null) {
                return null;
            }
            return obj.toString().trim();
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0049 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo70140a() {
        /*
            r3 = this;
            monitor-enter(r3)
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics     // Catch:{ Exception -> 0x0049 }
            r0.<init>()     // Catch:{ Exception -> 0x0049 }
            android.content.Context r1 = r3.f27787g     // Catch:{ Exception -> 0x0049 }
            android.view.WindowManager r1 = com.tapjoy.internal.C11542h.m31594a(r1)     // Catch:{ Exception -> 0x0049 }
            android.view.Display r1 = r1.getDefaultDisplay()     // Catch:{ Exception -> 0x0049 }
            r1.getMetrics(r0)     // Catch:{ Exception -> 0x0049 }
            android.app.Activity r1 = com.tapjoy.internal.C11544hb.m31599a()     // Catch:{ Exception -> 0x0049 }
            if (r1 == 0) goto L_0x0028
            android.view.Window r1 = r1.getWindow()     // Catch:{ Exception -> 0x0049 }
            if (r1 == 0) goto L_0x0028
            int r2 = r0.heightPixels     // Catch:{ Exception -> 0x0049 }
            int r1 = com.tapjoy.internal.C11259ac.m30849a(r1)     // Catch:{ Exception -> 0x0049 }
            int r2 = r2 - r1
            r0.heightPixels = r2     // Catch:{ Exception -> 0x0049 }
        L_0x0028:
            com.tapjoy.internal.fc$a r1 = r3.f27785e     // Catch:{ Exception -> 0x0049 }
            int r2 = r0.densityDpi     // Catch:{ Exception -> 0x0049 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x0049 }
            r1.f27404i = r2     // Catch:{ Exception -> 0x0049 }
            com.tapjoy.internal.fc$a r1 = r3.f27785e     // Catch:{ Exception -> 0x0049 }
            int r2 = r0.widthPixels     // Catch:{ Exception -> 0x0049 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x0049 }
            r1.f27405j = r2     // Catch:{ Exception -> 0x0049 }
            com.tapjoy.internal.fc$a r1 = r3.f27785e     // Catch:{ Exception -> 0x0049 }
            int r0 = r0.heightPixels     // Catch:{ Exception -> 0x0049 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0049 }
            r1.f27406k = r0     // Catch:{ Exception -> 0x0049 }
            goto L_0x0049
        L_0x0047:
            r0 = move-exception
            goto L_0x004b
        L_0x0049:
            monitor-exit(r3)     // Catch:{ all -> 0x0047 }
            return
        L_0x004b:
            monitor-exit(r3)     // Catch:{ all -> 0x0047 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11570hm.mo70140a():void");
    }

    /* renamed from: b */
    public final C11453fd mo70150b() {
        C11453fd fdVar;
        synchronized (this) {
            this.f27785e.f27407l = Locale.getDefault().toString();
            this.f27785e.f27408m = TimeZone.getDefault().getID();
            boolean z = false;
            long currentTimeMillis = System.currentTimeMillis() - 259200000;
            Iterator<C11462fg> it = this.f27783b.f27526g.iterator();
            while (it.hasNext()) {
                if (it.next().f27467g.longValue() <= currentTimeMillis) {
                    it.remove();
                    z = true;
                }
            }
            if (z) {
                m31700g();
            }
            fdVar = new C11453fd(this.f27785e.mo69969b(), this.f27786f.mo69947b(), this.f27783b.mo69990b());
        }
        return fdVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final String mo70153c() {
        String a;
        synchronized (this) {
            a = this.f27784c.f27829d.mo70312a();
        }
        return a;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00dc  */
    @javax.annotation.Nullable
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.tapjoy.internal.C11456fe mo70154d() {
        /*
            r20 = this;
            r1 = r20
            monitor-enter(r20)
            java.util.Calendar r0 = java.util.Calendar.getInstance()     // Catch:{ all -> 0x0141 }
            r2 = 1
            int r3 = r0.get(r2)     // Catch:{ all -> 0x0141 }
            int r3 = r3 * 10000
            r4 = 2
            int r5 = r0.get(r4)     // Catch:{ all -> 0x0141 }
            int r5 = r5 * 100
            int r3 = r3 + r5
            int r3 = r3 + 100
            r5 = 5
            int r6 = r0.get(r5)     // Catch:{ all -> 0x0141 }
            int r3 = r3 + r6
            com.tapjoy.internal.ht r6 = r1.f27784c     // Catch:{ all -> 0x0141 }
            com.tapjoy.internal.j r6 = r6.f27830e     // Catch:{ all -> 0x0141 }
            java.lang.Integer r6 = r6.mo70235a()     // Catch:{ all -> 0x0141 }
            int r6 = r6.intValue()     // Catch:{ all -> 0x0141 }
            r7 = 0
            if (r6 == r3) goto L_0x013f
            if (r6 != 0) goto L_0x004a
            com.tapjoy.internal.fj$a r0 = r1.f27783b     // Catch:{ all -> 0x0141 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0141 }
            r0.f27524e = r4     // Catch:{ all -> 0x0141 }
            com.tapjoy.internal.fj$a r0 = r1.f27783b     // Catch:{ all -> 0x0141 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0141 }
            r0.f27525f = r4     // Catch:{ all -> 0x0141 }
            com.tapjoy.internal.fe r0 = new com.tapjoy.internal.fe     // Catch:{ all -> 0x0141 }
            java.lang.String r4 = "fq7_0_1"
            java.lang.String r5 = "fq30_0_1"
            r0.<init>(r4, r5, r7)     // Catch:{ all -> 0x0141 }
            goto L_0x012f
        L_0x004a:
            com.tapjoy.internal.ht r8 = r1.f27784c     // Catch:{ all -> 0x0141 }
            com.tapjoy.internal.j r8 = r8.f27831f     // Catch:{ all -> 0x0141 }
            java.lang.Integer r8 = r8.mo70235a()     // Catch:{ all -> 0x0141 }
            int r8 = r8.intValue()     // Catch:{ all -> 0x0141 }
            r9 = 7
            int r10 = m31697a((int) r9, (int) r8)     // Catch:{ all -> 0x0141 }
            r11 = 30
            int r12 = m31697a((int) r11, (int) r8)     // Catch:{ all -> 0x0141 }
            java.util.Calendar r13 = java.util.Calendar.getInstance()     // Catch:{ all -> 0x0141 }
            int r14 = r6 / 10000
            int r15 = r6 / 100
            int r15 = r15 % 100
            int r15 = r15 - r2
            int r6 = r6 % 100
            r13.set(r14, r15, r6)     // Catch:{ all -> 0x0141 }
            int r6 = r0.get(r2)     // Catch:{ all -> 0x0141 }
            int r14 = r13.get(r2)     // Catch:{ all -> 0x0141 }
            int r6 = r6 - r14
            int r6 = java.lang.Integer.signum(r6)     // Catch:{ all -> 0x0141 }
            r14 = -1
            if (r6 == r14) goto L_0x00a8
            if (r6 == r2) goto L_0x008e
            r4 = 6
            int r0 = r0.get(r4)     // Catch:{ all -> 0x0141 }
            int r4 = r13.get(r4)     // Catch:{ all -> 0x0141 }
            int r0 = r0 - r4
            goto L_0x00d4
        L_0x008e:
            java.lang.Object r14 = r0.clone()     // Catch:{ all -> 0x0141 }
            java.util.Calendar r14 = (java.util.Calendar) r14     // Catch:{ all -> 0x0141 }
            int r15 = r13.get(r2)     // Catch:{ all -> 0x0141 }
            int r4 = r13.get(r4)     // Catch:{ all -> 0x0141 }
            int r13 = r13.get(r5)     // Catch:{ all -> 0x0141 }
            r14.set(r15, r4, r13)     // Catch:{ all -> 0x0141 }
            long r16 = r0.getTimeInMillis()     // Catch:{ all -> 0x0141 }
            goto L_0x00c1
        L_0x00a8:
            java.lang.Object r14 = r13.clone()     // Catch:{ all -> 0x0141 }
            java.util.Calendar r14 = (java.util.Calendar) r14     // Catch:{ all -> 0x0141 }
            int r15 = r0.get(r2)     // Catch:{ all -> 0x0141 }
            int r4 = r0.get(r4)     // Catch:{ all -> 0x0141 }
            int r0 = r0.get(r5)     // Catch:{ all -> 0x0141 }
            r14.set(r15, r4, r0)     // Catch:{ all -> 0x0141 }
            long r16 = r13.getTimeInMillis()     // Catch:{ all -> 0x0141 }
        L_0x00c1:
            r0 = 0
        L_0x00c2:
            long r18 = r14.getTimeInMillis()     // Catch:{ all -> 0x0141 }
            int r4 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r4 >= 0) goto L_0x00d0
            r14.add(r5, r2)     // Catch:{ all -> 0x0141 }
            int r0 = r0 + 1
            goto L_0x00c2
        L_0x00d0:
            if (r6 <= 0) goto L_0x00d3
            goto L_0x00d4
        L_0x00d3:
            int r0 = -r0
        L_0x00d4:
            int r4 = java.lang.Math.abs(r0)     // Catch:{ all -> 0x0141 }
            if (r4 < r11) goto L_0x00dc
            r15 = 0
            goto L_0x00e4
        L_0x00dc:
            if (r0 < 0) goto L_0x00e1
            int r15 = r8 << r0
            goto L_0x00e4
        L_0x00e1:
            int r0 = -r0
            int r15 = r8 >> r0
        L_0x00e4:
            r2 = r2 | r15
            int r0 = m31697a((int) r9, (int) r2)     // Catch:{ all -> 0x0141 }
            int r4 = m31697a((int) r11, (int) r2)     // Catch:{ all -> 0x0141 }
            com.tapjoy.internal.fj$a r5 = r1.f27783b     // Catch:{ all -> 0x0141 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x0141 }
            r5.f27524e = r6     // Catch:{ all -> 0x0141 }
            com.tapjoy.internal.fj$a r5 = r1.f27783b     // Catch:{ all -> 0x0141 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x0141 }
            r5.f27525f = r6     // Catch:{ all -> 0x0141 }
            com.tapjoy.internal.fe r5 = new com.tapjoy.internal.fe     // Catch:{ all -> 0x0141 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0141 }
            java.lang.String r8 = "fq7_"
            r6.<init>(r8)     // Catch:{ all -> 0x0141 }
            r6.append(r10)     // Catch:{ all -> 0x0141 }
            java.lang.String r8 = "_"
            r6.append(r8)     // Catch:{ all -> 0x0141 }
            r6.append(r0)     // Catch:{ all -> 0x0141 }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x0141 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0141 }
            java.lang.String r8 = "fq30_"
            r6.<init>(r8)     // Catch:{ all -> 0x0141 }
            r6.append(r12)     // Catch:{ all -> 0x0141 }
            java.lang.String r8 = "_"
            r6.append(r8)     // Catch:{ all -> 0x0141 }
            r6.append(r4)     // Catch:{ all -> 0x0141 }
            java.lang.String r4 = r6.toString()     // Catch:{ all -> 0x0141 }
            r5.<init>(r0, r4, r7)     // Catch:{ all -> 0x0141 }
            r0 = r5
        L_0x012f:
            com.tapjoy.internal.ht r4 = r1.f27784c     // Catch:{ all -> 0x0141 }
            com.tapjoy.internal.j r4 = r4.f27830e     // Catch:{ all -> 0x0141 }
            r4.mo70236a((int) r3)     // Catch:{ all -> 0x0141 }
            com.tapjoy.internal.ht r3 = r1.f27784c     // Catch:{ all -> 0x0141 }
            com.tapjoy.internal.j r3 = r3.f27831f     // Catch:{ all -> 0x0141 }
            r3.mo70236a((int) r2)     // Catch:{ all -> 0x0141 }
            monitor-exit(r20)     // Catch:{ all -> 0x0141 }
            return r0
        L_0x013f:
            monitor-exit(r20)     // Catch:{ all -> 0x0141 }
            return r7
        L_0x0141:
            r0 = move-exception
            monitor-exit(r20)     // Catch:{ all -> 0x0141 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tapjoy.internal.C11570hm.mo70154d():com.tapjoy.internal.fe");
    }

    /* renamed from: a */
    private static int m31697a(int i, int i2) {
        return Integer.bitCount(((1 << i) - 1) & i2);
    }

    /* renamed from: a */
    public final void mo70142a(String str, double d) {
        synchronized (this) {
            SharedPreferences.Editor a = this.f27784c.mo70166a();
            int i = 1;
            if (str.equals(this.f27784c.f27837l.mo70312a())) {
                i = 1 + this.f27784c.f27838m.mo70238b();
                this.f27784c.f27838m.mo70234a(a, i);
                d += this.f27784c.f27839n.mo70180a();
                this.f27784c.f27839n.mo70182a(a, d);
                a.apply();
            } else {
                this.f27784c.f27837l.mo70311a(a, str);
                this.f27784c.f27838m.mo70234a(a, 1);
                this.f27784c.f27839n.mo70182a(a, d);
                this.f27784c.f27840o.mo70307a(a);
                this.f27784c.f27841p.mo70181a(a);
                a.apply();
                this.f27783b.f27531l = str;
                this.f27783b.f27534o = null;
                this.f27783b.f27535p = null;
            }
            this.f27783b.f27532m = Integer.valueOf(i);
            this.f27783b.f27533n = Double.valueOf(d);
        }
    }

    /* renamed from: a */
    public final void mo70141a(long j, double d) {
        synchronized (this) {
            SharedPreferences.Editor a = this.f27784c.mo70166a();
            this.f27784c.f27840o.mo70308a(a, j);
            this.f27784c.f27841p.mo70182a(a, d);
            a.apply();
            this.f27783b.f27534o = Long.valueOf(j);
            this.f27783b.f27535p = Double.valueOf(d);
        }
    }

    /* renamed from: a */
    public final boolean mo70148a(String str, long j, boolean z) {
        synchronized (this) {
            int size = this.f27783b.f27526g.size();
            int i = 0;
            while (i < size) {
                C11462fg fgVar = this.f27783b.f27526g.get(i);
                if (!fgVar.f27466f.equals(str)) {
                    i++;
                } else if (!z) {
                    return false;
                } else {
                    C11462fg.C11463a aVar = new C11462fg.C11463a();
                    aVar.f27469c = fgVar.f27466f;
                    aVar.f27470d = fgVar.f27467g;
                    aVar.f27471e = fgVar.f27468h;
                    aVar.mo69849a(fgVar.mo69846a());
                    aVar.f27470d = Long.valueOf(j);
                    this.f27783b.f27526g.set(i, aVar.mo69981b());
                    return true;
                }
            }
            this.f27783b.f27526g.add(new C11462fg(str, Long.valueOf(j)));
            m31700g();
            return true;
        }
    }

    /* renamed from: g */
    private void m31700g() {
        this.f27784c.f27832g.mo70313a(Base64.encodeToString(C11465fh.f27472c.mo69857b(new C11465fh(this.f27783b.f27526g)), 2));
    }

    /* renamed from: a */
    public final boolean mo70147a(String str) {
        boolean z;
        synchronized (this) {
            this.f27784c.f27842q.mo70313a(str);
            z = true;
            if (str != null) {
                if (C11532gq.m31568a(this.f27786f.f27285e, str)) {
                    z = false;
                }
                this.f27786f.f27285e = str;
            } else {
                if (this.f27786f.f27285e == null) {
                    z = false;
                }
                this.f27786f.f27285e = null;
            }
        }
        return z;
    }

    /* renamed from: b */
    public final boolean mo70152b(String str) {
        boolean z;
        synchronized (this) {
            this.f27784c.f27843r.mo70313a(str);
            z = !C11532gq.m31568a(this.f27783b.f27538s, str);
            if (z) {
                this.f27783b.f27538s = str;
            }
        }
        return z;
    }

    /* renamed from: a */
    public final boolean mo70146a(Integer num) {
        boolean z;
        synchronized (this) {
            this.f27784c.f27844s.mo70237a(num);
            z = !C11532gq.m31568a(this.f27783b.f27539t, num);
            if (z) {
                this.f27783b.f27539t = num;
            }
        }
        return z;
    }

    /* renamed from: b */
    public final boolean mo70151b(Integer num) {
        boolean z;
        synchronized (this) {
            this.f27784c.f27845t.mo70237a(num);
            z = !C11532gq.m31568a(this.f27783b.f27540u, num);
            if (z) {
                this.f27783b.f27540u = num;
            }
        }
        return z;
    }

    /* renamed from: a */
    public final boolean mo70145a(int i, String str) {
        boolean z;
        synchronized (this) {
            z = false;
            if (i == 1) {
                this.f27784c.f27846u.mo70313a(str);
                z = !C11532gq.m31568a(this.f27783b.f27541v, str);
                if (z) {
                    this.f27783b.f27541v = str;
                }
            } else if (i == 2) {
                this.f27784c.f27847v.mo70313a(str);
                z = !C11532gq.m31568a(this.f27783b.f27542w, str);
                if (z) {
                    this.f27783b.f27542w = str;
                }
            } else if (i == 3) {
                this.f27784c.f27848w.mo70313a(str);
                z = !C11532gq.m31568a(this.f27783b.f27543x, str);
                if (z) {
                    this.f27783b.f27543x = str;
                }
            } else if (i == 4) {
                this.f27784c.f27849x.mo70313a(str);
                z = !C11532gq.m31568a(this.f27783b.f27544y, str);
                if (z) {
                    this.f27783b.f27544y = str;
                }
            } else if (i == 5) {
                this.f27784c.f27850y.mo70313a(str);
                z = !C11532gq.m31568a(this.f27783b.f27545z, str);
                if (z) {
                    this.f27783b.f27545z = str;
                }
            }
        }
        return z;
    }

    /* renamed from: e */
    public final Set<String> mo70155e() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f27783b.f27520A);
        }
        return hashSet;
    }

    /* renamed from: a */
    public final void mo70144a(Set<String> set) {
        synchronized (this) {
            if (set != null) {
                if (!set.isEmpty()) {
                    this.f27784c.f27851z.mo70313a(Base64.encodeToString(C11468fi.f27475c.mo69857b(new C11468fi(new ArrayList(set))), 2));
                    this.f27783b.f27520A.clear();
                    this.f27783b.f27520A.addAll(set);
                }
            }
            this.f27784c.f27851z.mo70310c();
            this.f27783b.f27520A.clear();
        }
    }

    /* renamed from: a */
    public final void mo70143a(String str, boolean z) {
        String a = this.f27784c.f27822A.mo70312a();
        this.f27783b.f27536q = str;
        this.f27783b.f27537r = Boolean.valueOf(z);
        this.f27784c.f27822A.mo70313a(str);
        this.f27784c.f27823B.mo70028a(z);
        C11589hx.m31770a(str, z);
        if (!TextUtils.isEmpty(a) && !str.equals(a)) {
            this.f27784c.mo70167a(false);
        }
    }

    /* renamed from: f */
    public final boolean mo70156f() {
        return ((Boolean) C11532gq.m31569b(this.f27783b.f27521B, C11471fj.f27493r)).booleanValue();
    }

    /* renamed from: a */
    public final boolean mo70149a(boolean z) {
        boolean z2;
        synchronized (this) {
            this.f27784c.f27824C.mo70028a(z);
            z2 = z != ((Boolean) C11532gq.m31569b(this.f27783b.f27521B, C11471fj.f27493r)).booleanValue();
            this.f27783b.f27521B = Boolean.valueOf(z);
        }
        return z2;
    }
}
