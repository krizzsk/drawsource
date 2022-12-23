package com.ogury.core.internal.aaid;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.ogury.core.internal.C9717ai;
import com.ogury.core.internal.C9731au;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* renamed from: com.ogury.core.internal.aaid.e */
/* compiled from: OguryAdvertisingIdGenerator.kt */
public final class C9708e {

    /* renamed from: a */
    public static final C9708e f24595a = new C9708e();

    /* renamed from: com.ogury.core.internal.aaid.e$a */
    /* compiled from: OguryAdvertisingIdGenerator.kt */
    static final class C9709a<T> implements Comparator<ApplicationInfo> {

        /* renamed from: a */
        public static final C9709a f24596a = new C9709a();

        C9709a() {
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            String str = ((ApplicationInfo) obj).packageName;
            String str2 = ((ApplicationInfo) obj2).packageName;
            C9717ai.m28143a((Object) str2, "rhs.packageName");
            return str.compareTo(str2);
        }
    }

    private C9708e() {
    }

    /* renamed from: a */
    public final OguryAaid mo64057a(Context context) {
        String str;
        String a;
        C9717ai.m28145b(context, "context");
        try {
            C9704a a2 = C9706c.f24592a.mo64053a(context);
            if (a2 == null || (a = a2.mo64045a()) == null) {
                throw new IllegalStateException("Advertising Id is null");
            }
            return new OguryAaid(a, !a2.mo64046b(), false);
        } catch (Exception unused) {
            ApplicationInfo b = m28132b(context);
            if (b == null) {
                str = "00000000-0000-0000-0000-000000000000";
            } else {
                str = m28131a(context, b);
            }
            return new OguryAaid(str, true, true);
        }
    }

    /* renamed from: a */
    private static String m28131a(Context context, ApplicationInfo applicationInfo) {
        try {
            long j = context.getPackageManager().getPackageInfo(applicationInfo.packageName, 128).firstInstallTime;
            String str = String.valueOf(j);
            Charset charset = C9731au.f24608a;
            if (str != null) {
                byte[] bytes = str.getBytes(charset);
                C9717ai.m28143a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
                String uuid = UUID.nameUUIDFromBytes(bytes).toString();
                C9717ai.m28143a((Object) uuid, "UUID.nameUUIDFromBytes((…toByteArray()).toString()");
                return uuid;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Exception unused) {
            return "00000000-0000-0000-0000-000000000000";
        }
    }

    /* renamed from: b */
    private final ApplicationInfo m28132b(Context context) {
        if (context != null) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager != null) {
                    List<ApplicationInfo> installedApplications = packageManager.getInstalledApplications(128);
                    ArrayList arrayList = new ArrayList();
                    if (installedApplications.size() == 0) {
                        return null;
                    }
                    C9717ai.m28143a((Object) installedApplications, "apps");
                    for (int i = 0; i < installedApplications.size(); i++) {
                        ApplicationInfo applicationInfo = installedApplications.get(i);
                        if (!((1 & applicationInfo.flags) == 0 || applicationInfo.packageName == null)) {
                            arrayList.add(applicationInfo);
                        }
                    }
                    List list = arrayList;
                    Comparator comparator = C9709a.f24596a;
                    C9717ai.m28145b(list, "$this$sortWith");
                    C9717ai.m28145b(comparator, "comparator");
                    if (list.size() > 1) {
                        Collections.sort(list, comparator);
                    }
                    return (ApplicationInfo) arrayList.get(0);
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
