package com.inmobi.sdk;

import android.content.Context;
import android.location.Location;
import android.os.SystemClock;
import android.util.Base64;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.inmobi.media.C5924dj;
import com.inmobi.media.C5929dk;
import com.inmobi.media.C6074ft;
import com.inmobi.media.C6094fv;
import com.inmobi.media.C6115gg;
import com.inmobi.media.C6168hl;
import com.inmobi.media.C6183hw;
import com.inmobi.media.C6184hx;
import com.inmobi.media.C6195ic;
import com.inmobi.media.C6197ie;
import com.inmobi.media.C6199ig;
import com.inmobi.media.C6210ik;
import com.inmobi.media.C6219in;
import com.inmobi.media.C6221ip;
import com.inmobi.media.C6232iz;
import com.inmobi.media.C6236ja;
import com.inmobi.media.C6258jo;
import com.inmobi.media.C6269jr;
import com.inmobi.media.C6272jt;
import com.inmobi.media.C6273ju;
import com.inmobi.unification.sdk.InitializationStatus;
import com.inmobi.unifiedId.InMobiUnifiedIdService;
import com.mbridge.msdk.foundation.entity.CampaignUnit;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

public final class InMobiSdk {
    public static final String IM_GDPR_CONSENT_AVAILABLE = "gdpr_consent_available";
    public static final String IM_GDPR_CONSENT_GDPR_APPLIES = "gdpr";
    public static final String IM_GDPR_CONSENT_IAB = "gdpr_consent";
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String f16020a = InMobiSdk.class.getSimpleName();

    public enum LogLevel {
        NONE,
        ERROR,
        DEBUG
    }

    public enum Education {
        HIGH_SCHOOL_OR_LESS("highschoolorless"),
        COLLEGE_OR_GRADUATE("collegeorgraduate"),
        POST_GRADUATE_OR_ABOVE("postgraduateorabove");
        
        private String value;

        private Education(String str) {
            this.value = str;
        }

        public final String toString() {
            return this.value;
        }
    }

    public enum Gender {
        FEMALE(InneractiveMediationDefs.GENDER_FEMALE),
        MALE(InneractiveMediationDefs.GENDER_MALE);
        
        private String value;

        private Gender(String str) {
            this.value = str;
        }

        public final String toString() {
            return this.value;
        }
    }

    public enum AgeGroup {
        BELOW_18("below18"),
        BETWEEN_18_AND_24("between18and24"),
        BETWEEN_25_AND_29("between25and29"),
        BETWEEN_30_AND_34("between30and34"),
        BETWEEN_35_AND_44("between35and44"),
        BETWEEN_45_AND_54("between45and54"),
        BETWEEN_55_AND_65("between55and65"),
        ABOVE_65("above65");
        
        private String value;

        private AgeGroup(String str) {
            this.value = str;
        }

        public final String toString() {
            return this.value;
        }
    }

    @Deprecated
    @InitializationStatus
    public static String init(Context context, String str) {
        return init(context, str, (JSONObject) null);
    }

    @Deprecated
    @InitializationStatus
    public static String init(final Context context, String str, JSONObject jSONObject) {
        C6199ig.m18406a();
        if (C6258jo.m18612a()) {
            return "SDK could not be initialized; Required dependency could not be found. Please check out documentation and include the required dependency.";
        }
        final String trim = str.trim();
        try {
            C6219in.m18456a(jSONObject);
            if (trim.length() == 0) {
                return "Account id cannot be empty. Please provide a valid account id.";
            }
            if (!C6197ie.m18393a(context, "android.permission.ACCESS_COARSE_LOCATION") && !C6197ie.m18393a(context, "android.permission.ACCESS_FINE_LOCATION")) {
                C6195ic.m18378a((byte) 1, f16020a, "Please grant the location permissions (ACCESS_COARSE_LOCATION or ACCESS_FINE_LOCATION, or both) for better ad targeting.");
            }
            if (!(trim.length() == 32 || trim.length() == 36)) {
                C6195ic.m18378a((byte) 2, f16020a, "Invalid account id passed to init. Please provide a valid account id.");
            }
            if (C6183hw.m18323b()) {
                return InitializationStatus.SUCCESS;
            }
            C6183hw.m18314a(context, trim);
            C6258jo.m18614b(context);
            C6183hw.m18316a((Runnable) new Runnable() {
                public final void run() {
                    try {
                        C6258jo.m18610a(context);
                        C6183hw.m18339k();
                        C6183hw.m18321b(trim);
                        C6094fv.m18089a(trim);
                        C6258jo.m18616c(context);
                    } catch (Exception unused) {
                        String unused2 = InMobiSdk.f16020a;
                    }
                }
            });
            C6195ic.m18378a((byte) 2, f16020a, "InMobi SDK initialized with account id: ".concat(String.valueOf(trim)));
            m18955b();
            return InitializationStatus.SUCCESS;
        } catch (Exception unused) {
            C6183hw.m18311a((Context) null);
            C6195ic.m18378a((byte) 1, f16020a, "SDK could not be initialized; an unexpected error was encountered.");
            return "SDK could not be initialized; an unexpected error was encountered.";
        }
    }

    public static void init(Context context, String str, JSONObject jSONObject, SdkInitializationListener sdkInitializationListener) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        C6199ig.m18406a();
        if (C6258jo.m18612a()) {
            m18957c(sdkInitializationListener, "SDK could not be initialized; Required dependency could not be found. Please check out documentation and include the required dependency.");
            return;
        }
        final String trim = str.trim();
        try {
            C6219in.m18456a(jSONObject);
            if (trim.length() == 0) {
                m18957c(sdkInitializationListener, "Account id cannot be empty. Please provide a valid account id.");
                return;
            }
            if (!C6197ie.m18393a(context, "android.permission.ACCESS_COARSE_LOCATION") && !C6197ie.m18393a(context, "android.permission.ACCESS_FINE_LOCATION")) {
                C6195ic.m18378a((byte) 1, f16020a, "Please grant the location permissions (ACCESS_COARSE_LOCATION or ACCESS_FINE_LOCATION, or both) for better ad targeting.");
            }
            if (C6183hw.m18323b()) {
                m18957c(sdkInitializationListener, (String) null);
                return;
            }
            C6183hw.m18314a(context, trim);
            C6258jo.m18614b(context);
            m18955b();
            final Context context2 = context;
            final SdkInitializationListener sdkInitializationListener2 = sdkInitializationListener;
            C6183hw.m18316a((Runnable) new Runnable() {
                public final void run() {
                    try {
                        C6258jo.m18610a(context2);
                        C6183hw.m18339k();
                        C6183hw.m18321b(trim);
                        C6094fv.m18089a(trim);
                        C6258jo.m18616c(context2);
                        InMobiSdk.m18957c(sdkInitializationListener2, (String) null);
                        C6168hl.m18270a().mo35377a("SdkInitialized", (Map<String, Object>) InMobiSdk.m18953a(elapsedRealtime));
                    } catch (Exception unused) {
                        String unused2 = InMobiSdk.f16020a;
                        InMobiSdk.m18957c(sdkInitializationListener2, "SDK could not be initialized; an unexpected error was encountered.");
                    }
                }
            });
        } catch (Exception unused) {
            C6183hw.m18311a((Context) null);
            m18957c(sdkInitializationListener, "SDK could not be initialized; an unexpected error was encountered.");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static void m18957c(final SdkInitializationListener sdkInitializationListener, final String str) {
        if (sdkInitializationListener != null) {
            C6269jr.m18643a().mo35508a(new Runnable() {
                public final void run() {
                    InMobiSdk.fireListener(SdkInitializationListener.this, str);
                }
            });
        }
        if (str == null) {
            String str2 = f16020a;
            C6195ic.m18378a((byte) 2, str2, "InMobi SDK initialized with account id: " + C6183hw.m18334g());
            return;
        }
        C6195ic.m18378a((byte) 1, f16020a, str);
    }

    public static void fireListener(SdkInitializationListener sdkInitializationListener, String str) {
        sdkInitializationListener.onInitializationComplete(str == null ? null : new Error(str));
    }

    public static void updateGDPRConsent(JSONObject jSONObject) {
        C6219in.m18456a(jSONObject);
    }

    public static void setPartnerGDPRConsent(JSONObject jSONObject) {
        C6219in.m18460b(jSONObject);
    }

    public static void setApplicationMuted(boolean z) {
        C6183hw.m18317a(z);
    }

    /* renamed from: b */
    private static void m18955b() {
        C6183hw.m18316a((Runnable) new Runnable() {
            public final void run() {
                String[] strArr = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_WIFI_STATE", "android.permission.CHANGE_WIFI_STATE"};
                StringBuilder sb = new StringBuilder("Permissions granted to SDK are :\nandroid.permission.INTERNET\nandroid.permission.ACCESS_NETWORK_STATE");
                for (int i = 0; i < 4; i++) {
                    String str = strArr[i];
                    if (C6197ie.m18393a(C6183hw.m18324c(), str)) {
                        sb.append("\n");
                        sb.append(str);
                    }
                }
                C6195ic.m18378a((byte) 2, InMobiSdk.f16020a, sb.toString());
            }
        });
    }

    public static String getVersion() {
        return C6184hx.m18347b();
    }

    /* renamed from: com.inmobi.sdk.InMobiSdk$6 */
    static /* synthetic */ class C63356 {

        /* renamed from: a */
        static final /* synthetic */ int[] f16030a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.inmobi.sdk.InMobiSdk$LogLevel[] r0 = com.inmobi.sdk.InMobiSdk.LogLevel.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f16030a = r0
                com.inmobi.sdk.InMobiSdk$LogLevel r1 = com.inmobi.sdk.InMobiSdk.LogLevel.NONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f16030a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.inmobi.sdk.InMobiSdk$LogLevel r1 = com.inmobi.sdk.InMobiSdk.LogLevel.ERROR     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f16030a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.inmobi.sdk.InMobiSdk$LogLevel r1 = com.inmobi.sdk.InMobiSdk.LogLevel.DEBUG     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.inmobi.sdk.InMobiSdk.C63356.<clinit>():void");
        }
    }

    public static void setLogLevel(LogLevel logLevel) {
        int i = C63356.f16030a[logLevel.ordinal()];
        if (i == 1) {
            C6195ic.m18377a((byte) 0);
        } else if (i != 2) {
            C6195ic.m18377a((byte) 2);
        } else {
            C6195ic.m18377a((byte) 1);
        }
    }

    public static void setAge(int i) {
        C6221ip.m18471a(i);
    }

    public static void setIsAgeRestricted(boolean z) {
        C6221ip.m18474a(z);
        C6232iz.m18518a().mo35446f();
        if (z) {
            InMobiUnifiedIdService.reset();
        }
    }

    public static void setAgeGroup(AgeGroup ageGroup) {
        C6221ip.m18473a(ageGroup.toString().toLowerCase(Locale.ENGLISH));
    }

    public static void setAreaCode(String str) {
        C6221ip.m18477b(str);
    }

    public static void setPostalCode(String str) {
        C6221ip.m18480c(str);
    }

    public static void setLocationWithCityStateCountry(String str, String str2, String str3) {
        C6221ip.m18482d(str);
        C6221ip.m18484e(str2);
        C6221ip.m18486f(str3);
    }

    public static void setYearOfBirth(int i) {
        C6221ip.m18476b(i);
    }

    public static void setGender(Gender gender) {
        C6221ip.m18488g(gender.toString().toLowerCase(Locale.ENGLISH));
    }

    public static void setEducation(Education education) {
        C6221ip.m18490h(education.toString().toLowerCase(Locale.ENGLISH));
    }

    public static void setLanguage(String str) {
        C6221ip.m18492i(str);
    }

    public static void setInterests(String str) {
        C6221ip.m18494j(str);
    }

    public static void setLocation(Location location) {
        C6221ip.m18472a(location);
    }

    public static String getToken() {
        return getToken((Map<String, String>) null, (String) null);
    }

    public static String getToken(Map<String, String> map, String str) {
        C5924dj a = C5924dj.m17611a();
        long currentTimeMillis = System.currentTimeMillis();
        if (map != null) {
            C6184hx.m18346a(map.get("tp"));
            C6184hx.m18348b(map.get("tp-ver"));
        }
        HashMap hashMap = new HashMap();
        hashMap.put("networkType", C6210ik.m18428b());
        hashMap.put("plType", "AB");
        C6183hw.m18316a((Runnable) new Runnable(hashMap) {

            /* renamed from: a */
            final /* synthetic */ Map f15010a;

            public final void run(
/*
Method generation error in method: com.inmobi.media.dj.3.run():void, dex: classes2.dex
            jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.inmobi.media.dj.3.run():void, class status: UNLOADED
            	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
            	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
            	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
            	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
            	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
            	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
            	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
            	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
            	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
            	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
            	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
            	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
            	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
            	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
            	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
            	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
            
*/
        });
        if (!C6183hw.m18318a()) {
            C6195ic.m18378a((byte) 1, C5924dj.f15005a, "InMobi SDK is not initialised. Cannot fetch a token.");
            a.mo35030a(90, currentTimeMillis);
            return null;
        } else if (((C6115gg) C6094fv.m18084a("root", C6183hw.m18332f(), (C6094fv.C6097c) null)).mo35305i()) {
            a.mo35030a(9, currentTimeMillis);
            return null;
        } else {
            C5929dk dkVar = new C5929dk(new C6236ja(((C6074ft) C6094fv.m18084a(CampaignUnit.JSON_KEY_ADS, C6183hw.m18332f(), (C6094fv.C6097c) null)).mo35283f()));
            dkVar.f15014b = map;
            dkVar.f15013a = str;
            HashMap hashMap2 = new HashMap();
            hashMap2.put("h-user-agent", C6183hw.m18337i());
            dkVar.mo35341c(hashMap2);
            dkVar.mo34869a();
            if (!dkVar.f15536q) {
                a.mo35030a(21, currentTimeMillis);
                return null;
            }
            HashMap hashMap3 = new HashMap();
            hashMap3.put("latency", Long.valueOf(System.currentTimeMillis() - currentTimeMillis));
            hashMap3.put("networkType", C6210ik.m18428b());
            hashMap3.put("plType", "AB");
            C6183hw.m18316a((Runnable) new Runnable(hashMap3) {

                /* renamed from: a */
                final /* synthetic */ Map f15008a;

                public final void run(
/*
Method generation error in method: com.inmobi.media.dj.2.run():void, dex: classes2.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.inmobi.media.dj.2.run():void, class status: UNLOADED
                	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:278)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:116)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:313)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:676)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:607)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:364)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:231)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:123)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:107)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:787)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:728)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:368)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:156)
                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:211)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:204)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:318)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:271)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:240)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:485)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:474)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:150)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:173)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:497)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:236)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:227)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:112)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:78)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:44)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:33)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:21)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:61)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
                
*/
            });
            return new String(Base64.encode(dkVar.mo35346f().getBytes(), 8));
        }
    }

    public static void setPublisherProvidedUnifiedId(final JSONObject jSONObject) {
        C6183hw.m18316a((Runnable) new Runnable() {
            public final void run() {
                if (!C6273ju.m18662b()) {
                    C6272jt.m18654b(jSONObject);
                }
            }
        });
    }

    public static boolean isSDKInitialized() {
        return C6183hw.m18323b();
    }

    /* renamed from: a */
    static /* synthetic */ Map m18953a(long j) {
        HashMap hashMap = new HashMap();
        hashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j));
        hashMap.put("networkType", C6210ik.m18428b());
        hashMap.put("integrationType", "InMobi");
        return hashMap;
    }
}
