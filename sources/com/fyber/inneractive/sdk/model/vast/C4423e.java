package com.fyber.inneractive.sdk.model.vast;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.measurement.C4410i;
import com.fyber.inneractive.sdk.util.C5330x0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.smaato.sdk.video.vast.model.Companion;
import com.smaato.sdk.video.vast.model.Creative;
import com.smaato.sdk.video.vast.model.Extension;
import com.smaato.sdk.video.vast.model.Linear;
import com.smaato.sdk.video.vast.model.MediaFile;
import com.smaato.sdk.video.vast.model.StaticResource;
import com.smaato.sdk.video.vast.model.Tracking;
import com.smaato.sdk.video.vast.model.Verification;
import com.smaato.sdk.video.vast.model.VideoClicks;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Node;

/* renamed from: com.fyber.inneractive.sdk.model.vast.e */
public class C4423e {

    /* renamed from: a */
    public String f10879a;

    /* renamed from: b */
    public List<String> f10880b = new ArrayList();

    /* renamed from: c */
    public List<C4428j> f10881c = new ArrayList();

    /* renamed from: d */
    public List<C4410i> f10882d = new ArrayList();

    /* renamed from: a */
    public final void mo24616a(Node node) {
        C4410i iVar;
        Node d = C5330x0.m16558d(node, "AdVerifications");
        if (d != null) {
            Iterator it = ((ArrayList) C5330x0.m16557c(d, Verification.NAME)).iterator();
            while (it.hasNext()) {
                Node node2 = (Node) it.next();
                if (node2 == null) {
                    iVar = null;
                } else {
                    C4410i iVar2 = new C4410i();
                    iVar2.f10824e = C5330x0.m16556b(node2, Verification.VENDOR);
                    Node d2 = C5330x0.m16558d(node2, "JavaScriptResource");
                    if (d2 != null) {
                        iVar2.f10826g = true;
                        try {
                            iVar2.f10825f = C5330x0.m16555a(d2);
                            iVar2.f10821b = C5330x0.m16556b(d2, "apiFramework");
                            iVar2.f10820a = new URL(iVar2.f10825f);
                        } catch (MalformedURLException unused) {
                        }
                    }
                    Node d3 = C5330x0.m16558d(node2, "TrackingEvents");
                    if (d3 != null) {
                        Iterator it2 = ((ArrayList) C5330x0.m16557c(d3, Tracking.NAME)).iterator();
                        while (it2.hasNext()) {
                            Node node3 = (Node) it2.next();
                            C4434p a = C4434p.m13616a(node3);
                            if (node3 != null && a.f10926a.equalsIgnoreCase("verificationNotExecuted")) {
                                iVar2.mo24591a(C4435q.EVENT_VERIFICATION_NOT_EXECUTED, a.f10927b);
                            }
                        }
                    }
                    Node d4 = C5330x0.m16558d(node2, Verification.VERIFICATION_PARAMETERS);
                    if (d4 != null) {
                        iVar2.f10823d = C5330x0.m16555a(d4);
                    }
                    iVar = iVar2;
                }
                if (iVar != null) {
                    IAlog.m16446a("Verification Found - %s", iVar.toString());
                    this.f10882d.add(iVar);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo24617b(Node node) {
        Iterator it;
        C4428j jVar;
        C4424f fVar;
        Iterator it2;
        Iterator it3;
        C4431m mVar;
        Node node2 = node;
        if (node2 != null) {
            Node d = C5330x0.m16558d(node2, "AdSystem");
            if (d != null) {
                C5330x0.m16556b(d, "version");
                C5330x0.m16555a(d);
            }
            Node d2 = C5330x0.m16558d(node2, "Error");
            if (d2 != null) {
                String a = C5330x0.m16555a(d2);
                if (!TextUtils.isEmpty(a)) {
                    this.f10879a = a;
                }
            }
            Iterator it4 = ((ArrayList) C5330x0.m16557c(node2, "Impression")).iterator();
            while (it4.hasNext()) {
                String a2 = C5330x0.m16555a((Node) it4.next());
                if (!TextUtils.isEmpty(a2)) {
                    this.f10880b.add(a2);
                }
            }
            Node d3 = C5330x0.m16558d(node2, "Creatives");
            if (d3 != null) {
                Iterator it5 = ((ArrayList) C5330x0.m16557c(d3, Creative.NAME)).iterator();
                while (it5.hasNext()) {
                    Node node3 = (Node) it5.next();
                    if (node3 == null) {
                        it = it5;
                        jVar = null;
                    } else {
                        C4428j jVar2 = new C4428j();
                        C5330x0.m16556b(node3, "AdID");
                        C5330x0.m16556b(node3, "id");
                        C5330x0.m16554a(node3, "sequence");
                        Node d4 = C5330x0.m16558d(node3, "Linear");
                        if (d4 != null) {
                            C4430l lVar = new C4430l();
                            Node d5 = C5330x0.m16558d(d4, Linear.MEDIA_FILES);
                            if (d5 != null) {
                                ArrayList arrayList = (ArrayList) C5330x0.m16557c(d5, MediaFile.NAME);
                                if (!arrayList.isEmpty()) {
                                    lVar.f10905a = new ArrayList();
                                    Iterator it6 = arrayList.iterator();
                                    while (it6.hasNext()) {
                                        Node node4 = (Node) it6.next();
                                        if (node4 == null) {
                                            it3 = it5;
                                            it2 = it6;
                                            mVar = null;
                                        } else {
                                            it3 = it5;
                                            mVar = new C4431m();
                                            it2 = it6;
                                            mVar.f10910a = C5330x0.m16556b(node4, MediaFile.DELIVERY);
                                            mVar.f10911b = C5330x0.m16554a(node4, "width");
                                            mVar.f10912c = C5330x0.m16554a(node4, "height");
                                            mVar.f10913d = C5330x0.m16556b(node4, "type");
                                            C5330x0.m16556b(node4, "id");
                                            mVar.f10915f = C5330x0.m16556b(node4, "apiFramework");
                                            mVar.f10914e = C5330x0.m16554a(node4, MediaFile.BITRATE);
                                            String b = C5330x0.m16556b(node4, MediaFile.MAINTAIN_ASPECT_RATIO);
                                            if (!TextUtils.isEmpty(b)) {
                                                try {
                                                    Boolean.valueOf(b);
                                                } catch (NumberFormatException unused) {
                                                }
                                            }
                                            String b2 = C5330x0.m16556b(node4, MediaFile.SCALABLE);
                                            if (!TextUtils.isEmpty(b2)) {
                                                try {
                                                    Boolean.valueOf(b2);
                                                } catch (NumberFormatException unused2) {
                                                }
                                            }
                                            mVar.f10916g = C5330x0.m16555a(node4);
                                        }
                                        if (mVar != null) {
                                            lVar.f10905a.add(mVar);
                                        }
                                        it5 = it3;
                                        it6 = it2;
                                    }
                                }
                            }
                            it = it5;
                            Node d6 = C5330x0.m16558d(d4, "VideoClicks");
                            if (d6 != null) {
                                lVar.f10907c = C5330x0.m16555a(C5330x0.m16558d(d6, VideoClicks.CLICK_THROUGH));
                                ArrayList arrayList2 = (ArrayList) C5330x0.m16557c(d6, VideoClicks.CLICK_TRACKING);
                                if (!arrayList2.isEmpty()) {
                                    lVar.f10908d = new ArrayList();
                                    Iterator it7 = arrayList2.iterator();
                                    while (it7.hasNext()) {
                                        String a3 = C5330x0.m16555a((Node) it7.next());
                                        if (!TextUtils.isEmpty(a3)) {
                                            lVar.f10908d.add(a3);
                                        }
                                    }
                                }
                            }
                            Node d7 = C5330x0.m16558d(d4, "TrackingEvents");
                            if (d7 != null) {
                                ArrayList arrayList3 = (ArrayList) C5330x0.m16557c(d7, Tracking.NAME);
                                if (!arrayList3.isEmpty()) {
                                    lVar.f10906b = new ArrayList();
                                    Iterator it8 = arrayList3.iterator();
                                    while (it8.hasNext()) {
                                        C4434p a4 = C4434p.m13616a((Node) it8.next());
                                        if (a4 != null) {
                                            lVar.f10906b.add(a4);
                                        }
                                    }
                                }
                            }
                            Node d8 = C5330x0.m16558d(d4, Linear.DURATION);
                            if (d8 != null) {
                                lVar.f10909e = C5330x0.m16555a(d8);
                            }
                            jVar2.f10903a = lVar;
                        } else {
                            it = it5;
                        }
                        Node d9 = C5330x0.m16558d(node3, "CompanionAds");
                        if (d9 != null) {
                            List<Node> c = C5330x0.m16557c(d9, "Companion");
                            jVar2.f10904b = new ArrayList();
                            Iterator it9 = ((ArrayList) c).iterator();
                            while (it9.hasNext()) {
                                Node node5 = (Node) it9.next();
                                if (node5 == null) {
                                    fVar = null;
                                } else {
                                    fVar = new C4424f();
                                    fVar.f10883a = C5330x0.m16554a(node5, "width");
                                    fVar.f10884b = C5330x0.m16554a(node5, "height");
                                    fVar.f10885c = C5330x0.m16556b(node5, "id");
                                    C5330x0.m16556b(node5, "apiFramework");
                                    C5330x0.m16554a(node5, Companion.EXPANDED_WIDTH);
                                    C5330x0.m16554a(node5, Companion.EXPANDED_HEIGHT);
                                    Node d10 = C5330x0.m16558d(node5, "StaticResource");
                                    if (d10 != null) {
                                        C4427i iVar = new C4427i();
                                        iVar.f10901a = C5330x0.m16556b(d10, StaticResource.CREATIVE_TYPE);
                                        iVar.f10902b = C5330x0.m16555a(d10);
                                        fVar.f10886d = iVar;
                                    }
                                    Node d11 = C5330x0.m16558d(node5, "HTMLResource");
                                    if (d11 != null) {
                                        fVar.f10888f = C5330x0.m16555a(d11);
                                    }
                                    Node d12 = C5330x0.m16558d(node5, "IFrameResource");
                                    if (d12 != null) {
                                        fVar.f10887e = C5330x0.m16555a(d12);
                                    }
                                    Node d13 = C5330x0.m16558d(node5, Companion.COMPANION_CLICK_THROUGH);
                                    if (d13 != null) {
                                        fVar.f10889g = C5330x0.m16555a(d13);
                                    }
                                    ArrayList arrayList4 = (ArrayList) C5330x0.m16557c(node5, Companion.COMPANION_CLICK_TRACKING);
                                    if (arrayList4.size() > 0) {
                                        fVar.f10890h = new ArrayList();
                                        Iterator it10 = arrayList4.iterator();
                                        while (it10.hasNext()) {
                                            String a5 = C5330x0.m16555a((Node) it10.next());
                                            if (!TextUtils.isEmpty(a5)) {
                                                fVar.f10890h.add(a5);
                                            }
                                        }
                                    }
                                    Node d14 = C5330x0.m16558d(node5, "TrackingEvents");
                                    if (d14 != null) {
                                        ArrayList arrayList5 = (ArrayList) C5330x0.m16557c(d14, Tracking.NAME);
                                        if (!arrayList5.isEmpty()) {
                                            fVar.f10892j = new ArrayList();
                                            Iterator it11 = arrayList5.iterator();
                                            while (it11.hasNext()) {
                                                C4434p a6 = C4434p.m13616a((Node) it11.next());
                                                if (a6 != null) {
                                                    fVar.f10892j.add(a6);
                                                }
                                            }
                                        }
                                    }
                                }
                                if (fVar != null) {
                                    jVar2.f10904b.add(fVar);
                                }
                            }
                        }
                        jVar = jVar2;
                    }
                    if (jVar != null) {
                        this.f10881c.add(jVar);
                    }
                    it5 = it;
                }
            }
            Node d15 = C5330x0.m16558d(node2, "Extensions");
            if (d15 != null) {
                Iterator it12 = ((ArrayList) C5330x0.m16557c(d15, Extension.NAME)).iterator();
                while (it12.hasNext()) {
                    Node node6 = (Node) it12.next();
                    if ("AdVerifications".equalsIgnoreCase(C5330x0.m16556b(node6, "type"))) {
                        mo24616a(node6);
                    }
                }
            }
            mo24616a(node);
        }
    }
}
