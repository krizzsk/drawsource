package com.fyber.inneractive.sdk.response;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.config.C4287y;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.flow.vast.C4381a;
import com.fyber.inneractive.sdk.flow.vast.C4384c;
import com.fyber.inneractive.sdk.flow.vast.C4387e;
import com.fyber.inneractive.sdk.measurement.C4410i;
import com.fyber.inneractive.sdk.model.vast.C4422d;
import com.fyber.inneractive.sdk.model.vast.C4424f;
import com.fyber.inneractive.sdk.model.vast.C4431m;
import com.fyber.inneractive.sdk.model.vast.C4433o;
import com.fyber.inneractive.sdk.model.vast.C4436r;
import com.fyber.inneractive.sdk.model.vast.C4438s;
import com.fyber.inneractive.sdk.util.C5262d0;
import com.fyber.inneractive.sdk.util.C5310r;
import com.fyber.inneractive.sdk.util.IAlog;
import com.smaato.sdk.video.vast.model.VastTree;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;

/* renamed from: com.fyber.inneractive.sdk.response.d */
public class C5232d extends C5230b {

    /* renamed from: e */
    public C5235g f13858e;

    /* renamed from: f */
    public C4287y f13859f;

    /* renamed from: g */
    public C4422d f13860g;

    /* renamed from: h */
    public List<C4422d> f13861h = new ArrayList();

    /* renamed from: i */
    public int f13862i;

    /* renamed from: j */
    public C4436r f13863j;

    /* renamed from: a */
    public C5233e mo24319a() {
        C5235g gVar = new C5235g();
        this.f13854a = gVar;
        this.f13858e = gVar;
        return gVar;
    }

    /* renamed from: b */
    public void mo26312b(String str) throws C4387e, Exception {
        C4433o oVar;
        try {
            String replaceFirst = str.replaceFirst("<\\?.*\\?>", "");
            DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
            newInstance.setCoalescing(true);
            Document parse = newInstance.newDocumentBuilder().parse(new InputSource(new StringReader(replaceFirst)));
            if (parse != null) {
                Node firstChild = parse.getFirstChild();
                if (firstChild.getNodeName().equalsIgnoreCase(VastTree.VAST)) {
                    oVar = C4433o.m13615a(firstChild);
                } else {
                    IAlog.m16446a("XML does not contain a VAST tag as its first child!", new Object[0]);
                    throw new Exception("XML does not contain a VAST tag as its first child!");
                }
            } else {
                oVar = null;
            }
            try {
                if (this.f13863j == null) {
                    this.f13863j = new C4436r(oVar.f10924a);
                } else {
                    C4436r rVar = new C4436r(oVar.f10924a);
                    if (rVar.compareTo(this.f13863j) >= 0) {
                        this.f13863j = rVar;
                    }
                }
            } catch (C4436r.C4437a unused) {
            }
            List<C4422d> list = oVar.f10925b;
            if (list == null || list.size() == 0) {
                IAlog.m16446a("Vast response parser: no ads found in model. aborting", new Object[0]);
                throw new C4387e("ErrorNoMediaFiles", "No ads found in model. Empty Vast?");
            }
            C4422d dVar = list.get(0);
            C4438s sVar = dVar.f10877b;
            if (sVar != null) {
                IAlog.m16446a("Vast response parser: found VAST wrapper #%d", Integer.valueOf(this.f13861h.size()));
                int size = this.f13861h.size();
                int i = this.f13862i;
                if (size < i) {
                    this.f13861h.add(dVar);
                    String str2 = sVar.f10952e;
                    if (TextUtils.isEmpty(str2)) {
                        IAlog.m16446a("Vast response parser: found an empty tag uri in wrapper! aborting!", new Object[0]);
                        throw new C4387e("VastErrorInvalidFile", "No ad tag URI for wrapper");
                    } else if (C5262d0.m16469f(str2)) {
                        String a = C5310r.m16525a(str2, 3000, 5000, 5);
                        if (!TextUtils.isEmpty(a)) {
                            this.f13858e.f13897G.put(str2, a);
                            mo26312b(a);
                            return;
                        }
                        throw new C4387e("VastErrorInvalidFile", "Failed getting data from ad tag URI");
                    } else {
                        IAlog.m16446a("Vast response parser: Unsecure Wrapper URL. Aborting! url: %s", str2);
                        throw new C4387e("VastErrorUnsecure", "Unsecure ad tag URI for wrapper");
                    }
                } else {
                    IAlog.m16446a("Vast response parser: too many vast wrappers! Only %dallowed. stopping", Integer.valueOf(i));
                    throw new C4387e("VastErrorTooManyWrappers", "More than " + this.f13862i + " found");
                }
            } else if (dVar.f10878c != null) {
                this.f13860g = dVar;
            } else {
                throw new C4387e("VastErrorInvalidFile", "A top level ad with no wrapper on inline found!");
            }
        } catch (Exception e) {
            IAlog.m16446a("Failed parsing Vast file! parsing error = %s", e.getMessage());
            throw new C4387e("VastErrorInvalidFile", e.getMessage());
        }
    }

    /* renamed from: b */
    public boolean mo24321b() {
        return true;
    }

    /* renamed from: a */
    public void mo24320a(String str, C4287y yVar) throws Exception {
        this.f13859f = yVar;
        if (yVar == null || yVar.f10549f == null) {
            this.f13854a.f13873i = "ErrorConfigurationMismatch";
            return;
        }
        this.f13858e.f13892B = System.currentTimeMillis();
        this.f13862i = IAConfigManager.f10324J.f10343i.f10482c;
        this.f13858e.getClass();
        try {
            mo26312b(str);
            mo26311a(this.f13860g, this.f13861h);
        } catch (InterruptedException e) {
            throw e;
        } catch (C4387e e2) {
            this.f13858e.f13873i = e2.getMessage();
            this.f13858e.f13874j = e2.getCause().getMessage();
        } catch (Exception e3) {
            this.f13858e.f13874j = String.format("%s", new Object[]{e3.getMessage()});
            C5235g gVar = this.f13858e;
            gVar.f13873i = "VastErrorInvalidFile";
            gVar.f13888x = e3;
            if (IAlog.f13936a == 2) {
                e3.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public void mo26311a(C4422d dVar, List<C4422d> list) throws C4387e {
        C4381a aVar = new C4381a();
        int intValue = this.f13859f.f10549f.f10371c.intValue();
        int intValue2 = this.f13859f.f10549f.f10370b.intValue();
        int intValue3 = this.f13859f.f10549f.f10375g.intValue();
        aVar.f10771a = intValue;
        aVar.f10772b = intValue2;
        aVar.f10773c = intValue3;
        if (UnitDisplayType.VERTICAL.equals(this.f13859f.f10549f.f10378j)) {
            aVar.f10774d = true;
        }
        if (this.f13859f.f10549f.f10379k.contains(2)) {
            aVar.f10775e = true;
        }
        try {
            C4436r rVar = this.f13863j;
            this.f13858e.f13893C = aVar.mo24558a(dVar, list, rVar != null ? rVar.f10951b : "");
        } catch (C4387e e) {
            C5235g gVar = this.f13858e;
            gVar.getClass();
            gVar.f13873i = e.getMessage();
        }
        C5235g gVar2 = this.f13858e;
        Map<C4431m, C4384c> map = aVar.f10776f;
        gVar2.getClass();
        if (map != null) {
            gVar2.f13894D.putAll(map);
        }
        C5235g gVar3 = this.f13858e;
        List<C4424f> list2 = aVar.f10777g;
        gVar3.getClass();
        if (list2 != null) {
            gVar3.f13895E.addAll(list2);
        }
        C5235g gVar4 = this.f13858e;
        List<C4410i> list3 = aVar.f10779i;
        gVar4.getClass();
        if (list3 != null) {
            gVar4.f13896F.addAll(list3);
        }
        if (IAlog.f13936a == 2) {
            Map<C4431m, C4384c> map2 = aVar.f10776f;
            if (map2.size() > 0) {
                IAlog.m16449d(" VParser: Unsupported media files:", new Object[0]);
                for (C4431m next : map2.keySet()) {
                    IAlog.m16449d("VParser: %s", next);
                    IAlog.m16449d("VParser: reason = %s", map2.get(next));
                }
                return;
            }
            IAlog.m16449d("VParser: Unsupported media files: none", new Object[0]);
        }
    }
}
