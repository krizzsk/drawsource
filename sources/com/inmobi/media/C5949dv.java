package com.inmobi.media;

import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.internal.security.CertificateUtil;
import com.inmobi.media.C6074ft;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.inmobi.media.dv */
/* compiled from: VastResponse */
public final class C5949dv implements C5950dw {

    /* renamed from: a */
    List<C5939dq> f15076a;

    /* renamed from: b */
    public String f15077b;

    /* renamed from: c */
    public String f15078c;

    /* renamed from: d */
    public List<C5868ci> f15079d;

    /* renamed from: e */
    public List<C5937dp> f15080e;

    /* renamed from: f */
    public int f15081f;

    /* renamed from: g */
    private String f15082g;

    /* renamed from: h */
    private C5937dp f15083h;

    /* renamed from: i */
    private C6074ft.C6089k f15084i;

    /* renamed from: j */
    private C5939dq f15085j;

    /* renamed from: a */
    private static boolean m17667a(double d, double d2, double d3) {
        return d3 > d && d3 <= d2;
    }

    C5949dv(C6074ft.C6089k kVar) {
        this.f15085j = null;
        this.f15076a = new ArrayList();
        this.f15079d = new ArrayList();
        this.f15080e = new ArrayList();
        this.f15084i = kVar;
        this.f15081f = 0;
    }

    private C5949dv(List<C5868ci> list, C6074ft.C6089k kVar) {
        this(kVar);
        if (list.size() != 0) {
            this.f15079d = new ArrayList(list);
        }
    }

    public C5949dv(String str, String str2, String str3, List<C5868ci> list, List<C5937dp> list2, C6074ft.C6089k kVar) {
        this(list, kVar);
        if (list2.size() != 0) {
            this.f15080e = new ArrayList(list2);
        }
        this.f15082g = str;
        this.f15076a.add(new C5939dq(str));
        this.f15077b = str2;
        this.f15078c = str3;
    }

    /* renamed from: a */
    public final String mo35058a() {
        return this.f15078c;
    }

    /* renamed from: b */
    public final String mo35061b() {
        C5939dq dqVar;
        int i;
        String str = this.f15082g;
        if (str != null) {
            return str;
        }
        C5803bg.m17287a();
        List<String> f = C5803bg.m17296f();
        C5939dq dqVar2 = null;
        if (!f.isEmpty()) {
            Iterator<C5939dq> it = this.f15076a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                dqVar = it.next();
                if (f.contains(dqVar.f15039a)) {
                    break;
                }
            }
        }
        dqVar = null;
        if (dqVar != null) {
            this.f15085j = dqVar;
            String str2 = dqVar.f15039a;
            this.f15082g = str2;
            return str2;
        }
        double d = (((double) this.f15084i.optimalVastVideoSize) * 2.0d) / 1048576.0d;
        double d2 = 1.0d;
        double d3 = (((double) this.f15084i.vastMaxAssetSize) * 1.0d) / 1048576.0d;
        for (C5939dq next : this.f15076a) {
            String[] split = this.f15077b.split(CertificateUtil.DELIMITER);
            try {
                i = (Integer.parseInt(split[1]) * 60) + Integer.parseInt(split[2]);
            } catch (ArrayIndexOutOfBoundsException e) {
                i = 0;
                C6130gj.m18161a().mo35310a(new C6167hk(e));
            }
            double d4 = ((((double) next.f15040b) * d2) * ((double) i)) / 8192.0d;
            next.f15041c = d4;
            double d5 = d4;
            C5939dq dqVar3 = next;
            if (m17667a(0.0d, d, d5)) {
                dqVar = m17664a(dqVar, dqVar3, d5);
            } else {
                if (m17667a(d, d3, d5)) {
                    dqVar2 = m17668b(dqVar2, dqVar3, d5);
                }
            }
            d2 = 1.0d;
        }
        m17665a(dqVar, dqVar2);
        if (TextUtils.isEmpty(this.f15082g)) {
            C6074ft.C6081c cVar = this.f15084i.bitRate;
            if (cVar.bitrate_mandatory || this.f15076a.size() == 0) {
                return this.f15082g;
            }
            CountDownLatch countDownLatch = new CountDownLatch(this.f15076a.size());
            try {
                m17666a(cVar, countDownLatch);
                countDownLatch.await((long) cVar.headerTimeout, TimeUnit.MILLISECONDS);
                for (C5939dq next2 : this.f15076a) {
                    double d6 = next2.f15041c;
                    double d7 = d6;
                    if (m17667a(0.0d, d, d6)) {
                        dqVar = m17664a(dqVar, next2, d7);
                    } else {
                        if (m17667a(d, d3, d7)) {
                            dqVar2 = m17668b(dqVar2, next2, d7);
                        }
                    }
                }
            } catch (Exception e2) {
                C6130gj.m18161a().mo35310a(new C6167hk(e2));
                for (C5939dq next3 : this.f15076a) {
                    double d8 = next3.f15041c;
                    double d9 = d8;
                    if (m17667a(0.0d, d, d8)) {
                        dqVar = m17664a(dqVar, next3, d9);
                    } else {
                        if (m17667a(d, d3, d9)) {
                            dqVar2 = m17668b(dqVar2, next3, d9);
                        }
                    }
                }
            } catch (Throwable th) {
                for (C5939dq next4 : this.f15076a) {
                    double d10 = next4.f15041c;
                    double d11 = d10;
                    if (m17667a(0.0d, d, d10)) {
                        dqVar = m17664a(dqVar, next4, d11);
                    } else {
                        if (m17667a(d, d3, d11)) {
                            dqVar2 = m17668b(dqVar2, next4, d11);
                        }
                    }
                }
                m17665a(dqVar, dqVar2);
                throw th;
            }
            m17665a(dqVar, dqVar2);
        }
        return this.f15082g;
    }

    /* renamed from: a */
    private void m17666a(C6074ft.C6081c cVar, CountDownLatch countDownLatch) {
        for (C5939dq drVar : this.f15076a) {
            C5940dr drVar2 = new C5940dr(drVar, cVar.headerTimeout, countDownLatch);
            drVar2.f15053c = SystemClock.elapsedRealtime();
            C5940dr.f15044d.execute(new Runnable() {
                public final void run(
/*
Method generation error in method: com.inmobi.media.dr.2.run():void, dex: classes2.dex
                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.inmobi.media.dr.2.run():void, class status: UNLOADED
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
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:232)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
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
        }
    }

    /* renamed from: a */
    private void m17665a(C5939dq dqVar, C5939dq dqVar2) {
        if (dqVar != null) {
            this.f15085j = dqVar;
            this.f15082g = dqVar.f15039a;
        } else if (dqVar2 != null) {
            this.f15085j = dqVar2;
            this.f15082g = dqVar2.f15039a;
        }
    }

    /* renamed from: c */
    public final List<C5939dq> mo35062c() {
        return this.f15076a;
    }

    /* renamed from: d */
    public final List<C5868ci> mo35063d() {
        return this.f15079d;
    }

    /* renamed from: e */
    public final List<C5937dp> mo35064e() {
        return this.f15080e;
    }

    /* renamed from: a */
    public final void mo35060a(C5937dp dpVar) {
        this.f15083h = dpVar;
    }

    /* renamed from: f */
    public final C5937dp mo35065f() {
        return this.f15083h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo35059a(C5868ci ciVar) {
        this.f15079d.add(ciVar);
    }

    /* renamed from: a */
    private static C5939dq m17664a(C5939dq dqVar, C5939dq dqVar2, double d) {
        return (dqVar != null && d <= dqVar.f15041c) ? dqVar : dqVar2;
    }

    /* renamed from: b */
    private static C5939dq m17668b(C5939dq dqVar, C5939dq dqVar2, double d) {
        return (dqVar != null && d >= dqVar.f15041c) ? dqVar : dqVar2;
    }
}
