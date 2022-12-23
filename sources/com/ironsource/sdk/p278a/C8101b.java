package com.ironsource.sdk.p278a;

import android.content.Context;
import com.adcolony.adcolonysdk.BuildConfig;
import com.ironsource.p196a.C6343c;
import com.ironsource.p199d.C6356a;
import com.ironsource.sdk.utils.C8341a;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ironsource.sdk.a.b */
public final class C8101b implements C6343c {

    /* renamed from: a */
    private static Map<String, Object> f19614a = new HashMap();

    /* renamed from: com.ironsource.sdk.a.b$a */
    public static class C8102a {

        /* renamed from: a */
        public String f19615a;

        /* renamed from: b */
        public String f19616b;

        /* renamed from: c */
        public Context f19617c;

        /* renamed from: d */
        public String f19618d;
    }

    private C8101b(C8102a aVar) {
        Context context = aVar.f19617c;
        C8341a a = C8341a.m23755a(context);
        f19614a.put("deviceos", SDKUtils.encodeString(a.f20325c));
        f19614a.put("deviceosversion", SDKUtils.encodeString(a.f20326d));
        f19614a.put("deviceapilevel", Integer.valueOf(a.f20327e));
        f19614a.put("deviceoem", SDKUtils.encodeString(a.f20323a));
        f19614a.put("devicemodel", SDKUtils.encodeString(a.f20324b));
        f19614a.put("bundleid", SDKUtils.encodeString(context.getPackageName()));
        f19614a.put("applicationkey", SDKUtils.encodeString(aVar.f19616b));
        f19614a.put("sessionid", SDKUtils.encodeString(aVar.f19615a));
        f19614a.put("sdkversion", SDKUtils.encodeString(SDKUtils.getSDKVersion()));
        f19614a.put("applicationuserid", SDKUtils.encodeString(aVar.f19618d));
        f19614a.put("env", BuildConfig.FLAVOR);
        f19614a.put("origin", "n");
        f19614a.put("connectiontype", C6356a.m18974a(aVar.f19617c));
    }

    public /* synthetic */ C8101b(C8102a aVar, byte b) {
        this(aVar);
    }

    /* renamed from: a */
    public static void m23155a(String str) {
        f19614a.put("connectiontype", SDKUtils.encodeString(str));
    }

    /* renamed from: a */
    public final Map<String, Object> mo35743a() {
        return f19614a;
    }
}
