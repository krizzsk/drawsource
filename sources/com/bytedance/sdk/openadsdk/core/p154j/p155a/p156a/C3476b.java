package com.bytedance.sdk.openadsdk.core.p154j.p155a.p156a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.p154j.C3473a;
import com.bytedance.sdk.openadsdk.core.p154j.p157b.C3487c;
import com.smaato.sdk.video.vast.model.Creative;
import com.smaato.sdk.video.vast.model.InLine;
import java.io.IOException;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.bytedance.sdk.openadsdk.core.j.a.a.b */
/* compiled from: InLineParser */
public class C3476b {
    /* renamed from: a */
    public static C3473a m10805a(Context context, XmlPullParser xmlPullParser, List<C3487c> list, int i, double d) throws IOException, XmlPullParserException {
        xmlPullParser.require(2, C3478d.f8683f, "InLine");
        C3473a aVar = new C3473a();
        while (true) {
            if (xmlPullParser.next() == 3 && "InLine".equals(xmlPullParser.getName())) {
                aVar.mo19887a().mo19972j(list);
                if (!TextUtils.isEmpty(aVar.mo19903g())) {
                    return aVar;
                }
                return null;
            } else if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                char c = 65535;
                switch (name.hashCode()) {
                    case -1692490108:
                        if (name.equals("Creatives")) {
                            c = 4;
                            break;
                        }
                        break;
                    case -56677412:
                        if (name.equals(InLine.DESCRIPTION)) {
                            c = 1;
                            break;
                        }
                        break;
                    case 67232232:
                        if (name.equals("Error")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 501930965:
                        if (name.equals(InLine.AD_TITLE)) {
                            c = 0;
                            break;
                        }
                        break;
                    case 2114088489:
                        if (name.equals("Impression")) {
                            c = 3;
                            break;
                        }
                        break;
                }
                if (c == 0) {
                    aVar.mo19892a(C3478d.m10821b(xmlPullParser, name));
                } else if (c == 1) {
                    aVar.mo19894b(C3478d.m10821b(xmlPullParser, name));
                } else if (c == 2) {
                    list.addAll(C3478d.m10816a(xmlPullParser, name));
                } else if (c == 3) {
                    aVar.mo19887a().mo19954a(C3478d.m10816a(xmlPullParser, name));
                } else if (c != 4) {
                    C3478d.m10817a(xmlPullParser);
                } else if (TextUtils.isEmpty(aVar.mo19903g()) || aVar.mo19895c() == null) {
                    while (xmlPullParser.next() != 3) {
                        if (xmlPullParser.getEventType() == 2) {
                            if (Creative.NAME.equals(xmlPullParser.getName())) {
                                m10806a(context, xmlPullParser, aVar, i, d);
                            } else {
                                C3478d.m10817a(xmlPullParser);
                            }
                        }
                    }
                } else {
                    C3478d.m10817a(xmlPullParser);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m10806a(Context context, XmlPullParser xmlPullParser, C3473a aVar, int i, double d) throws IOException, XmlPullParserException {
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if ("Linear".equals(xmlPullParser.getName()) && TextUtils.isEmpty(aVar.mo19903g())) {
                    C3477c.m10810a(xmlPullParser, aVar, i, d);
                } else if (!"CompanionAds".equals(xmlPullParser.getName()) || aVar.mo19895c() != null) {
                    C3478d.m10817a(xmlPullParser);
                } else {
                    aVar.mo19891a(C3475a.m10804a(context, xmlPullParser));
                }
            }
        }
    }
}
