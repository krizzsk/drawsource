package com.ironsource.mediationsdk;

import android.app.Activity;
import android.content.Context;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C6473Q;
import com.ironsource.mediationsdk.C6484T;
import com.ironsource.mediationsdk.C6689r;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.logger.LogListener;
import com.ironsource.mediationsdk.model.C6660k;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.p206a.C6518d;
import com.ironsource.mediationsdk.p206a.C6521g;
import com.ironsource.mediationsdk.p206a.C6522h;
import com.ironsource.mediationsdk.p216c.C6620a;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyInterstitialListener;
import com.ironsource.mediationsdk.sdk.ISDemandOnlyRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.InitializationListener;
import com.ironsource.mediationsdk.sdk.InterstitialListener;
import com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoManualListener;
import com.ironsource.mediationsdk.sdk.OfferwallListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoManualListener;
import com.ironsource.mediationsdk.sdk.SegmentListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.p199d.C6356a;
import com.ironsource.p199d.C6357b;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

public abstract class IronSource {
    public static final String DataSource_MOPUB = "MoPub";

    public enum AD_UNIT {
        REWARDED_VIDEO("rewardedVideo"),
        INTERSTITIAL("interstitial"),
        OFFERWALL("offerwall"),
        BANNER("banner");
        

        /* renamed from: a */
        private String f16335a;

        private AD_UNIT(String str) {
            this.f16335a = str;
        }

        public final String toString() {
            return this.f16335a;
        }
    }

    public static void addImpressionDataListener(ImpressionDataListener impressionDataListener) {
        C6459L a = C6459L.m19304a();
        if (C6620a.m20121a((Object) impressionDataListener, "addImpressionDataListener - listener is null")) {
            C6356a.m18973a().mo35845a(impressionDataListener);
            if (a.f16436z != null) {
                a.f16436z.mo35981a(impressionDataListener);
            }
            if (a.f16369A != null) {
                a.f16369A.mo36838a(impressionDataListener);
            }
            if (a.f16371C != null) {
                a.f16371C.mo36521a(impressionDataListener);
            }
            if (a.f16372D != null) {
                a.f16372D.mo36521a(impressionDataListener);
            }
            if (a.f16370B != null) {
                a.f16370B.mo36838a(impressionDataListener);
            }
            IronLog ironLog = IronLog.API;
            ironLog.info("add impression data listener to " + impressionDataListener.getClass().getSimpleName());
        }
    }

    public static void clearRewardedVideoServerParameters() {
        C6459L.m19304a().f16424n = null;
    }

    public static IronSourceBannerLayout createBanner(Activity activity, ISBannerSize iSBannerSize) {
        C6459L a = C6459L.m19304a();
        a.f16416f.log(IronSourceLogger.IronSourceTag.API, "createBanner()", 1);
        if (activity == null) {
            a.f16416f.log(IronSourceLogger.IronSourceTag.API, "createBanner() : Activity cannot be null", 3);
            return null;
        }
        ContextProvider.getInstance().updateActivity(activity);
        return new IronSourceBannerLayout(activity, iSBannerSize);
    }

    public static ISDemandOnlyBannerLayout createBannerForDemandOnly(Activity activity, ISBannerSize iSBannerSize) {
        C6459L a = C6459L.m19304a();
        a.f16416f.log(IronSourceLogger.IronSourceTag.API, "createBannerForDemandOnly()", 1);
        if (activity == null) {
            a.f16416f.log(IronSourceLogger.IronSourceTag.API, "createBannerForDemandOnly() : Activity cannot be null", 3);
            return null;
        }
        ContextProvider.getInstance().updateActivity(activity);
        return new ISDemandOnlyBannerLayout(activity, iSBannerSize);
    }

    public static void destroyBanner(IronSourceBannerLayout ironSourceBannerLayout) {
        C6459L a = C6459L.m19304a();
        a.f16416f.log(IronSourceLogger.IronSourceTag.API, "destroyBanner()", 1);
        try {
            if (a.f16379K && a.f16370B != null) {
                C6484T t = a.f16370B;
                IronLog.INTERNAL.verbose("");
                C6484T.C64862 r2 = new C6689r.C6691b(ironSourceBannerLayout) {

                    /* renamed from: a */
                    private /* synthetic */ IronSourceBannerLayout f16596a;

                    /* renamed from: a */
                    public final void mo36266a(
/*
Method generation error in method: com.ironsource.mediationsdk.T.2.a():void, dex: classes2.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ironsource.mediationsdk.T.2.a():void, class status: UNLOADED
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
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
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

                    /* renamed from: a */
                    public final void mo36267a(
/*
Method generation error in method: com.ironsource.mediationsdk.T.2.a(java.lang.String):void, dex: classes2.dex
                    jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.ironsource.mediationsdk.T.2.a(java.lang.String):void, class status: UNLOADED
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
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:221)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:109)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:55)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                    	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                    	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:311)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:68)
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
                };
                if (ironSourceBannerLayout != null) {
                    if (!ironSourceBannerLayout.isDestroyed()) {
                        r2.mo36266a();
                        return;
                    }
                }
                Object[] objArr = new Object[1];
                objArr[0] = ironSourceBannerLayout == null ? "banner is null" : "banner is destroyed";
                r2.mo36267a(String.format("can't destroy banner - %s", objArr));
            } else if (a.f16415e != null) {
                a.f16415e.mo36816a(ironSourceBannerLayout);
            }
        } catch (Throwable th) {
            a.f16416f.logException(IronSourceLogger.IronSourceTag.API, "destroyBanner()", th);
        }
    }

    public static void destroyISDemandOnlyBanner(String str) {
        C6459L a = C6459L.m19304a();
        a.f16416f.log(IronSourceLogger.IronSourceTag.API, "destroyBanner()", 1);
        try {
            if (a.f16382N != null) {
                a.f16382N.mo36978a(str);
            }
        } catch (Throwable th) {
            a.f16416f.logException(IronSourceLogger.IronSourceTag.API, "destroyISDemandOnlyBanner()", th);
        }
    }

    public static String getAdvertiserId(Context context) {
        C6459L.m19304a();
        return C6459L.m19307a(context);
    }

    public static synchronized String getISDemandOnlyBiddingData() {
        String n;
        synchronized (IronSource.class) {
            n = C6459L.m19304a().mo36157n();
        }
        return n;
    }

    public static synchronized String getISDemandOnlyBiddingData(Context context) {
        String b;
        synchronized (IronSource.class) {
            b = C6459L.m19304a().mo36131b(context);
        }
        return b;
    }

    public static InterstitialPlacement getInterstitialPlacementInfo(String str) {
        return C6459L.m19304a().mo36151k(str);
    }

    public static void getOfferwallCredits() {
        C6459L a = C6459L.m19304a();
        a.f16416f.log(IronSourceLogger.IronSourceTag.API, "getOfferwallCredits()", 1);
        try {
            C6483S s = a.f16414d;
            if (s.f16562a != null) {
                s.f16562a.getOfferwallCredits();
            }
        } catch (Throwable th) {
            a.f16416f.logException(IronSourceLogger.IronSourceTag.API, "getOfferwallCredits()", th);
        }
    }

    public static Placement getRewardedVideoPlacementInfo(String str) {
        return C6459L.m19304a().mo36153l(str);
    }

    public static void init(Activity activity, String str) {
        init(activity, str, (AD_UNIT[]) null);
    }

    public static void init(Activity activity, String str, InitializationListener initializationListener) {
        init(activity, str, initializationListener, (AD_UNIT[]) null);
    }

    public static void init(Activity activity, String str, InitializationListener initializationListener, AD_UNIT... ad_unitArr) {
        C6459L.m19304a().mo36122a(activity, str, false, initializationListener, ad_unitArr);
    }

    public static void init(Activity activity, String str, AD_UNIT... ad_unitArr) {
        C6459L.m19304a().mo36122a(activity, str, false, (InitializationListener) null, ad_unitArr);
    }

    @Deprecated
    public static void initISDemandOnly(Activity activity, String str, AD_UNIT... ad_unitArr) {
        C6459L.m19304a().mo36121a((Context) activity, str, (InitializationListener) null, ad_unitArr);
    }

    public static void initISDemandOnly(Context context, String str, AD_UNIT... ad_unitArr) {
        C6459L.m19304a().mo36121a(context, str, (InitializationListener) null, ad_unitArr);
    }

    public static boolean isBannerPlacementCapped(String str) {
        return C6459L.m19304a().mo36158n(str);
    }

    public static boolean isISDemandOnlyInterstitialReady(String str) {
        return C6459L.m19304a().mo36148i(str);
    }

    public static boolean isISDemandOnlyRewardedVideoAvailable(String str) {
        return C6459L.m19304a().mo36144g(str);
    }

    public static boolean isInterstitialPlacementCapped(String str) {
        return C6459L.m19304a().mo36156m(str);
    }

    public static boolean isInterstitialReady() {
        return C6459L.m19304a().mo36146h();
    }

    public static boolean isOfferwallAvailable() {
        return C6459L.m19304a().mo36154l();
    }

    public static boolean isRewardedVideoAvailable() {
        return C6459L.m19304a().mo36135c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r1 = com.ironsource.mediationsdk.C6459L.C64601.f16438b[r1 - 1];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean isRewardedVideoPlacementCapped(java.lang.String r7) {
        /*
            com.ironsource.mediationsdk.L r0 = com.ironsource.mediationsdk.C6459L.m19304a()
            int r1 = r0.mo36159o(r7)
            r2 = 2
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x001c
            int[] r5 = com.ironsource.mediationsdk.C6459L.C64601.f16438b
            int r1 = r1 - r4
            r1 = r5[r1]
            if (r1 == r4) goto L_0x001a
            if (r1 == r2) goto L_0x001a
            r5 = 3
            if (r1 == r5) goto L_0x001a
            goto L_0x001c
        L_0x001a:
            r1 = r4
            goto L_0x001d
        L_0x001c:
            r1 = r3
        L_0x001d:
            if (r1 == 0) goto L_0x003f
            boolean r5 = r0.f16431u
            boolean r6 = r0.f16373E
            int r0 = r0.f16380L
            org.json.JSONObject r0 = com.ironsource.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(r5, r6, r0)
            if (r7 == 0) goto L_0x003a
            java.lang.Object[][] r5 = new java.lang.Object[r4][]
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r6 = "placement"
            r2[r3] = r6
            r2[r4] = r7
            r5[r3] = r2
            com.ironsource.mediationsdk.C6459L.m19319a((org.json.JSONObject) r0, (java.lang.Object[][]) r5)
        L_0x003a:
            r7 = 1110(0x456, float:1.555E-42)
            com.ironsource.mediationsdk.C6459L.m19309a((int) r7, (org.json.JSONObject) r0)
        L_0x003f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.IronSource.isRewardedVideoPlacementCapped(java.lang.String):boolean");
    }

    public static void loadBanner(IronSourceBannerLayout ironSourceBannerLayout) {
        C6459L.m19304a().mo36124a(ironSourceBannerLayout, "");
    }

    public static void loadBanner(IronSourceBannerLayout ironSourceBannerLayout, String str) {
        C6459L.m19304a().mo36124a(ironSourceBannerLayout, str);
    }

    public static void loadISDemandOnlyBanner(Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str) {
        C6459L.m19304a().mo36118a(activity, iSDemandOnlyBannerLayout, str);
    }

    public static void loadISDemandOnlyBannerWithAdm(Activity activity, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, String str, String str2) {
        C6459L.m19304a().mo36119a(activity, iSDemandOnlyBannerLayout, str, str2);
    }

    public static void loadISDemandOnlyInterstitial(Activity activity, String str) {
        C6459L.m19304a().mo36137d(activity, str, (String) null);
    }

    @Deprecated
    public static void loadISDemandOnlyInterstitial(String str) {
        C6459L.m19304a().mo36137d((Activity) null, str, (String) null);
    }

    public static void loadISDemandOnlyInterstitialWithAdm(Activity activity, String str, String str2) {
        C6459L.m19304a().mo36134c(activity, str, str2);
    }

    @Deprecated
    public static void loadISDemandOnlyInterstitialWithAdm(String str, String str2) {
        C6459L.m19304a().mo36134c((Activity) null, str, str2);
    }

    public static void loadISDemandOnlyRewardedVideo(Activity activity, String str) {
        C6459L.m19304a().mo36132b(activity, str, (String) null);
    }

    @Deprecated
    public static void loadISDemandOnlyRewardedVideo(String str) {
        C6459L.m19304a().mo36132b((Activity) null, str, (String) null);
    }

    public static void loadISDemandOnlyRewardedVideoWithAdm(Activity activity, String str, String str2) {
        C6459L.m19304a().mo36120a(activity, str, str2);
    }

    @Deprecated
    public static void loadISDemandOnlyRewardedVideoWithAdm(String str, String str2) {
        C6459L.m19304a().mo36120a((Activity) null, str, str2);
    }

    public static void loadInterstitial() {
        C6459L a = C6459L.m19304a();
        a.f16416f.log(IronSourceLogger.IronSourceTag.API, "loadInterstitial()", 1);
        try {
            if (a.f16432v) {
                a.f16416f.log(IronSourceLogger.IronSourceTag.API, "Interstitial was initialized in demand only mode. Use loadISDemandOnlyInterstitial instead", 3);
                C6732u.m20387a().mo36954a(AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("Interstitial was initialized in demand only mode. Use loadISDemandOnlyInterstitial instead", IronSourceConstants.INTERSTITIAL_AD_UNIT));
            } else if (!a.f16434x) {
                a.f16416f.log(IronSourceLogger.IronSourceTag.API, "init() must be called before loadInterstitial()", 3);
                C6732u.m20387a().mo36954a(AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() must be called before loadInterstitial()", IronSourceConstants.INTERSTITIAL_AD_UNIT));
            } else {
                C6473Q.C6478a b = C6473Q.m19479a().mo36219b();
                if (b == C6473Q.C6478a.INIT_FAILED) {
                    a.f16416f.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                    C6732u.m20387a().mo36954a(AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                } else if (b == C6473Q.C6478a.INIT_IN_PROGRESS) {
                    if (C6473Q.m19479a().mo36221c()) {
                        a.f16416f.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                        C6732u.m20387a().mo36954a(AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                        return;
                    }
                    a.f16378J = true;
                } else if (!a.mo36150j()) {
                    a.f16416f.log(IronSourceLogger.IronSourceTag.API, "No interstitial configurations found", 3);
                    C6732u.m20387a().mo36954a(AD_UNIT.INTERSTITIAL, ErrorBuilder.buildInitFailedError("the server response does not contain interstitial data", IronSourceConstants.INTERSTITIAL_AD_UNIT));
                } else if (!a.f16376H) {
                    a.f16413c.mo36033c();
                } else {
                    if (a.f16377I) {
                        if (a.f16371C != null) {
                            a.f16371C.mo36526d();
                            return;
                        }
                    } else if (a.f16369A != null) {
                        a.f16369A.mo36297e();
                        return;
                    }
                    a.f16378J = true;
                }
            }
        } catch (Throwable th) {
            a.f16416f.logException(IronSourceLogger.IronSourceTag.API, "loadInterstitial()", th);
            C6732u.m20387a().mo36954a(AD_UNIT.INTERSTITIAL, new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, th.getMessage()));
        }
    }

    public static void loadRewardedVideo() {
        C6459L a = C6459L.m19304a();
        a.f16416f.log(IronSourceLogger.IronSourceTag.API, "loadRewardedVideo()", 1);
        try {
            if (a.f16431u) {
                a.f16416f.log(IronSourceLogger.IronSourceTag.API, "Rewarded Video was initialized in demand only mode. Use loadISDemandOnlyRewardedVideo instead", 3);
                C6732u.m20387a().mo36954a(AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("Rewarded Video was initialized in demand only mode. Use loadISDemandOnlyRewardedVideo instead", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            } else if (!a.f16374F) {
                a.f16416f.log(IronSourceLogger.IronSourceTag.API, "Rewarded Video is not initiated with manual load", 3);
            } else if (!a.f16433w) {
                a.f16416f.log(IronSourceLogger.IronSourceTag.API, "init() must be called before loadRewardedVideo()", 3);
                C6732u.m20387a().mo36954a(AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() must be called before loadRewardedVideo()", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            } else {
                C6473Q.C6478a b = C6473Q.m19479a().mo36219b();
                if (b == C6473Q.C6478a.INIT_FAILED) {
                    a.f16416f.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                    C6732u.m20387a().mo36954a(AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                } else if (b == C6473Q.C6478a.INIT_IN_PROGRESS) {
                    if (C6473Q.m19479a().mo36221c()) {
                        a.f16416f.log(IronSourceLogger.IronSourceTag.API, "init() had failed", 3);
                        C6732u.m20387a().mo36954a(AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("init() had failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                        return;
                    }
                    a.f16375G = true;
                } else if (!a.mo36141e()) {
                    a.f16416f.log(IronSourceLogger.IronSourceTag.API, "No rewarded video configurations found", 3);
                    C6732u.m20387a().mo36954a(AD_UNIT.REWARDED_VIDEO, ErrorBuilder.buildInitFailedError("the server response does not contain rewarded video data", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                } else if (a.f16372D == null) {
                    a.f16375G = true;
                } else {
                    a.f16372D.mo36526d();
                }
            }
        } catch (Throwable th) {
            a.f16416f.logException(IronSourceLogger.IronSourceTag.API, "loadRewardedVideo()", th);
            C6732u.m20387a().mo36954a(AD_UNIT.REWARDED_VIDEO, new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, th.getMessage()));
        }
    }

    public static void onPause(Activity activity) {
        C6459L a = C6459L.m19304a();
        try {
            a.f16416f.log(IronSourceLogger.IronSourceTag.API, "onPause()", 1);
            ContextProvider.getInstance().onPause(activity);
        } catch (Throwable th) {
            a.f16416f.logException(IronSourceLogger.IronSourceTag.API, "onPause()", th);
        }
    }

    public static void onResume(Activity activity) {
        C6459L a = C6459L.m19304a();
        try {
            a.f16416f.log(IronSourceLogger.IronSourceTag.API, "onResume()", 1);
            ContextProvider.getInstance().onResume(activity);
        } catch (Throwable th) {
            a.f16416f.logException(IronSourceLogger.IronSourceTag.API, "onResume()", th);
        }
    }

    public static void removeImpressionDataListener(ImpressionDataListener impressionDataListener) {
        C6459L a = C6459L.m19304a();
        if (C6620a.m20121a((Object) impressionDataListener, "removeImpressionDataListener - listener is null")) {
            C6356a.m18973a().mo35848b(impressionDataListener);
            if (a.f16436z != null) {
                a.f16436z.mo35983b(impressionDataListener);
            }
            if (a.f16369A != null) {
                a.f16369A.mo36843b(impressionDataListener);
            }
            if (a.f16371C != null) {
                a.f16371C.mo36524b(impressionDataListener);
            }
            if (a.f16372D != null) {
                a.f16372D.mo36524b(impressionDataListener);
            }
            if (a.f16370B != null) {
                a.f16370B.mo36843b(impressionDataListener);
            }
            IronLog ironLog = IronLog.API;
            ironLog.info("remove impression data listener from " + impressionDataListener.getClass().getSimpleName());
        }
    }

    public static void removeInterstitialListener() {
        C6459L a = C6459L.m19304a();
        a.f16416f.log(IronSourceLogger.IronSourceTag.API, "removeInterstitialListener()", 1);
        a.f16417g.f17492b = null;
        C6432F.m19211a().mo35998a((InterstitialListener) null);
        C6432F.m19211a().mo35999a((LevelPlayInterstitialListener) null);
    }

    public static void removeOfferwallListener() {
        C6459L a = C6459L.m19304a();
        a.f16416f.log(IronSourceLogger.IronSourceTag.API, "removeOfferwallListener()", 1);
        a.f16417g.f17493c = null;
    }

    public static void removeRewardedVideoListener() {
        C6459L a = C6459L.m19304a();
        a.f16416f.log(IronSourceLogger.IronSourceTag.API, "removeRewardedVideoListener()", 1);
        a.f16417g.f17491a = null;
        C6577ae.m20001a().f17045a = null;
        C6577ae.m20001a().f17046b = null;
    }

    public static void setAdRevenueData(String str, JSONObject jSONObject) {
        C6459L a = C6459L.m19304a();
        if (C6620a.m20121a((Object) jSONObject, "setAdRevenueData - impressionData is null") && C6620a.m20121a((Object) str, "setAdRevenueData - dataSource is null")) {
            a.f16383O.mo36683a(str, jSONObject);
        }
    }

    public static void setAdaptersDebug(boolean z) {
        C6459L.m19304a();
        C6459L.m19320a(z);
    }

    public static void setConsent(boolean z) {
        C6459L.m19304a().mo36133b(z);
    }

    public static boolean setDynamicUserId(String str) {
        return C6459L.m19304a().mo36136c(str);
    }

    public static void setISDemandOnlyInterstitialListener(ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        C6459L.m19304a();
        C6459L.m19312a(iSDemandOnlyInterstitialListener);
    }

    public static void setISDemandOnlyRewardedVideoListener(ISDemandOnlyRewardedVideoListener iSDemandOnlyRewardedVideoListener) {
        C6459L.m19304a();
        C6459L.m19313a(iSDemandOnlyRewardedVideoListener);
    }

    @Deprecated
    public static void setImpressionDataListener(ImpressionDataListener impressionDataListener) {
        C6459L a = C6459L.m19304a();
        IronLog.API.info("removing all impression data listeners");
        C6356a.m18973a().mo35849c();
        if (a.f16436z != null) {
            a.f16436z.mo35982b();
        }
        if (a.f16369A != null) {
            a.f16369A.mo36842b();
        }
        if (a.f16371C != null) {
            a.f16371C.mo36528g();
        }
        if (a.f16372D != null) {
            a.f16372D.mo36528g();
        }
        if (a.f16370B != null) {
            a.f16370B.mo36842b();
        }
        addImpressionDataListener(impressionDataListener);
    }

    public static void setInterstitialListener(InterstitialListener interstitialListener) {
        C6459L a = C6459L.m19304a();
        a.f16416f.log(IronSourceLogger.IronSourceTag.API, interstitialListener == null ? "setInterstitialListener(ISListener:null)" : "setInterstitialListener(ISListener)", 1);
        a.f16417g.f17492b = interstitialListener;
        C6432F.m19211a().mo35998a(interstitialListener);
    }

    public static void setLevelPlayInterstitialListener(LevelPlayInterstitialListener levelPlayInterstitialListener) {
        C6459L.m19304a();
        C6459L.m19314a(levelPlayInterstitialListener);
    }

    public static void setLevelPlayRewardedVideoListener(LevelPlayRewardedVideoListener levelPlayRewardedVideoListener) {
        C6459L.m19304a();
        C6459L.m19315a(levelPlayRewardedVideoListener);
    }

    public static void setLevelPlayRewardedVideoManualListener(LevelPlayRewardedVideoManualListener levelPlayRewardedVideoManualListener) {
        C6459L.m19304a().mo36125a(levelPlayRewardedVideoManualListener);
    }

    public static void setLogListener(LogListener logListener) {
        C6459L a = C6459L.m19304a();
        if (logListener == null) {
            a.f16416f.log(IronSourceLogger.IronSourceTag.API, "setLogListener(LogListener:null)", 1);
            return;
        }
        a.f16418h.f17274c = logListener;
        IronSourceLoggerManager ironSourceLoggerManager = a.f16416f;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "setLogListener(LogListener:" + logListener.getClass().getSimpleName() + ")", 1);
    }

    public static void setManualLoadRewardedVideo(RewardedVideoManualListener rewardedVideoManualListener) {
        C6459L.m19304a().mo36126a(rewardedVideoManualListener);
    }

    public static void setMediationSegment(String str) {
        C6459L a = C6459L.m19304a();
        try {
            a.f16416f.log(IronSourceLogger.IronSourceTag.API, a.f16395a + ":setMediationSegment(segment:" + str + ")", 1);
            C6357b bVar = new C6357b();
            C6459L.m19316a(str, bVar);
            if (bVar.mo35852a()) {
                a.f16422l = str;
            } else {
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, bVar.mo35853b().toString(), 2);
            }
        } catch (Exception e) {
            IronSourceLoggerManager ironSourceLoggerManager = a.f16416f;
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
            ironSourceLoggerManager.logException(ironSourceTag, a.f16395a + ":setMediationSegment(segment:" + str + ")", e);
        }
    }

    public static void setMediationType(String str) {
        C6459L.m19304a().mo36138d(str);
    }

    public static void setMetaData(String str, String str2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        C6459L.m19304a().mo36127a(str, (List<String>) arrayList);
    }

    public static void setMetaData(String str, List<String> list) {
        C6459L.m19304a().mo36127a(str, list);
    }

    public static void setNetworkData(String str, JSONObject jSONObject) {
        C6459L.m19304a();
        C6459L.m19317a(str, jSONObject);
    }

    public static void setOfferwallListener(OfferwallListener offerwallListener) {
        C6459L a = C6459L.m19304a();
        a.f16416f.log(IronSourceLogger.IronSourceTag.API, offerwallListener == null ? "setOfferwallListener(OWListener:null)" : "setOfferwallListener(OWListener)", 1);
        a.f16417g.f17493c = offerwallListener;
    }

    public static void setRewardedVideoListener(RewardedVideoListener rewardedVideoListener) {
        C6459L a = C6459L.m19304a();
        a.f16416f.log(IronSourceLogger.IronSourceTag.API, rewardedVideoListener == null ? "setRewardedVideoListener(RVListener:null)" : "setRewardedVideoListener(RVListener)", 1);
        a.f16417g.f17491a = rewardedVideoListener;
        C6577ae.m20001a().f17045a = rewardedVideoListener;
    }

    public static void setRewardedVideoServerParameters(Map<String, String> map) {
        C6459L a = C6459L.m19304a();
        if (map != null) {
            try {
                if (map.size() != 0) {
                    a.f16416f.log(IronSourceLogger.IronSourceTag.API, a.f16395a + ":setRewardedVideoServerParameters(params:" + map.toString() + ")", 1);
                    a.f16424n = new HashMap(map);
                }
            } catch (Exception e) {
                IronSourceLoggerManager ironSourceLoggerManager = a.f16416f;
                IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
                ironSourceLoggerManager.logException(ironSourceTag, a.f16395a + ":setRewardedVideoServerParameters(params:" + map.toString() + ")", e);
            }
        }
    }

    public static void setSegment(IronSourceSegment ironSourceSegment) {
        C6459L a = C6459L.m19304a();
        a.f16429s = ironSourceSegment;
        if (a.f16372D != null) {
            a.f16372D.mo36519a(ironSourceSegment);
        }
        if (a.f16436z != null) {
            a.f16436z.mo35980a(ironSourceSegment);
        }
        if (a.f16371C != null) {
            a.f16371C.mo36519a(ironSourceSegment);
        }
        if (a.f16369A != null) {
            a.f16369A.mo36836a(ironSourceSegment);
        }
        if (a.f16370B != null) {
            a.f16370B.mo36836a(ironSourceSegment);
        }
        C6518d.m19731d().f16776v = a.f16429s;
        C6522h.m19751d().f16776v = a.f16429s;
        C6521g.f16808w.f16776v = a.f16429s;
    }

    public static void setSegmentListener(SegmentListener segmentListener) {
        C6459L a = C6459L.m19304a();
        if (a.f16417g != null) {
            a.f16417g.f17494d = segmentListener;
            C6473Q.m19479a().f16528p = a.f16417g;
        }
    }

    public static void setUserId(String str) {
        C6459L.m19304a().mo36128a(str, true);
    }

    public static void shouldTrackNetworkState(Context context, boolean z) {
        C6459L a = C6459L.m19304a();
        a.f16427q = context;
        a.f16428r = Boolean.valueOf(z);
        if (a.f16376H) {
            if (a.f16377I) {
                if (a.f16371C != null) {
                    a.f16371C.mo36525b(z);
                }
            } else if (a.f16369A != null) {
                a.f16369A.mo36292a(z);
            }
        } else if (a.f16413c != null) {
            a.f16413c.mo36022a(context, z);
        }
        if (a.f16373E) {
            if (a.f16436z != null) {
                a.f16436z.mo35984a(context, z);
            }
        } else if (a.f16412b != null) {
            a.f16412b.mo36022a(context, z);
        }
    }

    public static void showISDemandOnlyInterstitial(String str) {
        C6459L a = C6459L.m19304a();
        IronSourceLoggerManager ironSourceLoggerManager = a.f16416f;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.API;
        ironSourceLoggerManager.log(ironSourceTag, "showISDemandOnlyInterstitial() instanceId=" + str, 1);
        try {
            if (!a.f16432v) {
                a.f16416f.log(IronSourceLogger.IronSourceTag.API, "Interstitial was initialized in mediation mode. Use showInterstitial instead", 3);
            } else if (a.f16381M == null) {
                a.f16416f.log(IronSourceLogger.IronSourceTag.API, "Interstitial video was not initiated", 3);
                C6425E.m19206a().mo35988b(str, new IronSourceError(IronSourceError.ERROR_CODE_INIT_FAILED, "Interstitial video was not initiated"));
            } else {
                C6759w wVar = a.f16381M;
                if (!wVar.f17804a.containsKey(str)) {
                    C6759w.m20510a(2500, str);
                    C6425E.m19206a().mo35988b(str, ErrorBuilder.buildNonExistentInstanceError(IronSourceConstants.INTERSTITIAL_AD_UNIT));
                    return;
                }
                C6760x xVar = wVar.f17804a.get(str);
                wVar.mo37001a((int) IronSourceConstants.IS_INSTANCE_SHOW, xVar);
                xVar.mo37003a();
            }
        } catch (Exception e) {
            a.f16416f.logException(IronSourceLogger.IronSourceTag.API, "showISDemandOnlyInterstitial", e);
            C6425E.m19206a().mo35988b(str, ErrorBuilder.buildInitFailedError("showISDemandOnlyInterstitial can't be called before the Interstitial ad unit initialization completed successfully", IronSourceConstants.INTERSTITIAL_AD_UNIT));
        }
    }

    public static void showISDemandOnlyRewardedVideo(String str) {
        C6459L.m19304a().mo36142f(str);
    }

    public static void showInterstitial() {
        C6459L a = C6459L.m19304a();
        a.f16416f.log(IronSourceLogger.IronSourceTag.API, "showInterstitial()", 1);
        try {
            if (a.f16432v) {
                a.f16416f.log(IronSourceLogger.IronSourceTag.API, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead", 3);
                C6432F.m19211a().mo35997a(new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, "Interstitial was initialized in demand only mode. Use showISDemandOnlyInterstitial instead"), (AdInfo) null);
            } else if (!a.mo36147i()) {
                C6432F.m19211a().mo35997a(ErrorBuilder.buildInitFailedError("showInterstitial can't be called before the Interstitial ad unit initialization completed successfully", IronSourceConstants.INTERSTITIAL_AD_UNIT), (AdInfo) null);
            } else {
                InterstitialPlacement g = a.mo36143g();
                if (g != null) {
                    a.mo36145h(g.getPlacementName());
                } else {
                    C6432F.m19211a().mo35997a(new IronSourceError(1020, "showInterstitial error: empty default placement in response"), (AdInfo) null);
                }
            }
        } catch (Exception e) {
            a.f16416f.logException(IronSourceLogger.IronSourceTag.API, "showInterstitial()", e);
            C6432F.m19211a().mo35997a(new IronSourceError(IronSourceError.ERROR_CODE_GENERIC, e.getMessage()), (AdInfo) null);
        }
    }

    public static void showInterstitial(String str) {
        C6459L.m19304a().mo36145h(str);
    }

    public static void showOfferwall() {
        C6459L a = C6459L.m19304a();
        try {
            a.f16416f.log(IronSourceLogger.IronSourceTag.API, "showOfferwall()", 1);
            if (!a.mo36152k()) {
                a.f16417g.onOfferwallShowFailed(ErrorBuilder.buildInitFailedError("showOfferwall can't be called before the Offerwall ad unit initialization completed successfully", IronSourceConstants.OFFERWALL_AD_UNIT));
                return;
            }
            C6660k a2 = a.f16419i.f17750c.f17354c.mo36780a();
            if (a2 != null) {
                a.mo36149j(a2.f17372b);
            }
        } catch (Exception e) {
            a.f16416f.logException(IronSourceLogger.IronSourceTag.API, "showOfferwall()", e);
            a.f16417g.onOfferwallShowFailed(ErrorBuilder.buildInitFailedError("showOfferwall can't be called before the Offerwall ad unit initialization completed successfully", IronSourceConstants.OFFERWALL_AD_UNIT));
        }
    }

    public static void showOfferwall(String str) {
        C6459L.m19304a().mo36149j(str);
    }

    public static void showRewardedVideo() {
        C6459L a = C6459L.m19304a();
        if (!a.mo36139d()) {
            C6577ae.m20001a().mo36561a(ErrorBuilder.buildInitFailedError("showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", IronSourceConstants.REWARDED_VIDEO_AD_UNIT), (AdInfo) null);
            a.f16416f.log(IronSourceLogger.IronSourceTag.INTERNAL, "showRewardedVideo can't be called before the Rewarded Video ad unit initialization completed successfully", 3);
            return;
        }
        Placement b = a.mo36130b();
        if (b == null) {
            a.f16416f.log(IronSourceLogger.IronSourceTag.INTERNAL, "showRewardedVideo error: empty default placement in response", 3);
            C6577ae.m20001a().mo36561a(new IronSourceError(1021, "showRewardedVideo error: empty default placement in response"), (AdInfo) null);
            return;
        }
        a.mo36140e(b.getPlacementName());
    }

    public static void showRewardedVideo(String str) {
        C6459L.m19304a().mo36140e(str);
    }
}
