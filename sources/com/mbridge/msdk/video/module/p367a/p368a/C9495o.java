package com.mbridge.msdk.video.module.p367a.p368a;

import com.mbridge.msdk.foundation.controller.C8388a;
import com.mbridge.msdk.foundation.controller.C8396b;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.p305f.C8498b;
import com.mbridge.msdk.foundation.tools.C8672v;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.module.p367a.C9473a;
import com.mbridge.msdk.video.module.p367a.p368a.C9485k;
import com.mbridge.msdk.video.module.p369b.C9499b;
import com.mbridge.msdk.videocommon.download.C9641a;
import com.mbridge.msdk.videocommon.download.C9645c;
import com.mbridge.msdk.videocommon.p373b.C9630c;
import java.util.Map;

/* renamed from: com.mbridge.msdk.video.module.a.a.o */
/* compiled from: VideoViewStatisticsListener */
public class C9495o extends C9485k {

    /* renamed from: k */
    protected int f23531k = 0;

    /* renamed from: l */
    private boolean f23532l;

    /* renamed from: m */
    private boolean f23533m;

    /* renamed from: n */
    private boolean f23534n;

    /* renamed from: o */
    private boolean f23535o;

    /* renamed from: p */
    private boolean f23536p = false;

    /* renamed from: q */
    private Map<Integer, String> f23537q;

    /* renamed from: r */
    private int f23538r = -1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C9495o(CampaignEx campaignEx, C9630c cVar, C9641a aVar, String str, String str2, C9473a aVar2, int i, boolean z) {
        super(campaignEx, aVar, cVar, str, str2, aVar2, i, z);
        if (this.f23498a) {
            this.f23537q = campaignEx.getAdvImpList();
        }
        this.f23531k = campaignEx.getVideoCompleteTime();
    }

    /* renamed from: a */
    public void mo62631a(int i, final Object obj) {
        int i2;
        if (!(i == 2 || i == 6)) {
            if (i != 7) {
                int i3 = 0;
                if (i == 15) {
                    mo63219g();
                    mo63218f();
                    mo63217e();
                    if (obj == null || !(obj instanceof MBridgeVideoView.C9471a)) {
                        i2 = 0;
                    } else {
                        int i4 = ((MBridgeVideoView.C9471a) obj).f23467a;
                        i3 = ((MBridgeVideoView.C9471a) obj).f23468b;
                        i2 = i4;
                    }
                    if (i3 == 0 && this.f23499b != null) {
                        i3 = this.f23499b.getVideoLength();
                    }
                    C9499b.m27022a(C8388a.m23845e().mo56913g(), this.f23499b, i2, i3, this.f23507j);
                    C9499b.m27025a(this.f23499b, this.f23537q, this.f23504g, i2);
                    if (!this.f23535o) {
                        this.f23535o = true;
                        C9499b.m27024a(this.f23499b, this.f23504g);
                    }
                    if (!this.f23536p) {
                        if (this.f23531k != 0) {
                            i3 = this.f23531k;
                        }
                        if (i2 >= i3) {
                            this.f23536p = true;
                            i = 17;
                        }
                    }
                    C8672v.m24878d("NotifyListener", "onPlayProgress:" + i2);
                    this.f23538r = i2;
                } else if (i != 16) {
                    switch (i) {
                        case 11:
                            C9645c.getInstance().mo63661b(false);
                            mo63216d();
                            break;
                        case 12:
                            C94961 r1 = new Runnable() {
                                public final void run() {
                                    Object obj = obj;
                                    if (obj != null && (obj instanceof String)) {
                                        C9495o.this.mo63210a((String) obj);
                                    }
                                }
                            };
                            if (C8396b.m23890a().mo56951d()) {
                                C8498b.m24359a().execute(r1);
                            } else {
                                r1.run();
                            }
                            mo63216d();
                            mo63212b();
                            mo63215c();
                            C9485k.C94894 r12 = new Runnable() {
                                public final void run(
/*
Method generation error in method: com.mbridge.msdk.video.module.a.a.k.4.run():void, dex: classes4.dex
                                jadx.core.utils.exceptions.JadxRuntimeException: Method args not loaded: com.mbridge.msdk.video.module.a.a.k.4.run():void, class status: UNLOADED
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
                                	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:298)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:64)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:175)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:152)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:62)
                                	at jadx.core.codegen.RegionGen.makeSimpleRegion(RegionGen.java:92)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:58)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:98)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:142)
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
                            };
                            if (C8396b.m23890a().mo56951d()) {
                                C8498b.m24359a().execute(r12);
                            } else {
                                r12.run();
                            }
                            C9645c.getInstance().mo63661b(false);
                            break;
                        case 13:
                            try {
                                mo63212b();
                                mo63215c();
                                break;
                            } catch (Throwable th) {
                                C8672v.m24875a("NotifyListener", th.getMessage(), th);
                                return;
                            }
                    }
                }
            } else if (this.f23498a && obj != null && (obj instanceof Integer)) {
                int intValue = ((Integer) obj).intValue();
                if (intValue == 2) {
                    if (!this.f23533m) {
                        this.f23533m = true;
                        C9499b.m27028b(C8388a.m23845e().mo56913g(), this.f23499b);
                    }
                } else if (intValue == 1 && !this.f23532l) {
                    this.f23532l = true;
                    C9499b.m27029c(C8388a.m23845e().mo56913g(), this.f23499b);
                }
            }
            this.f23506i.mo62631a(i, obj);
        }
        if (this.f23498a && !this.f23534n) {
            this.f23534n = true;
            mo63216d();
            C9499b.m27031e(C8388a.m23845e().mo56913g(), this.f23499b);
        }
        this.f23506i.mo62631a(i, obj);
    }
}
