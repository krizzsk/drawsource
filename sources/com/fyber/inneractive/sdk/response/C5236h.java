package com.fyber.inneractive.sdk.response;

import android.util.Xml;
import com.fyber.inneractive.sdk.util.C5277g0;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.IOException;
import java.io.StringReader;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: com.fyber.inneractive.sdk.response.h */
public class C5236h {

    /* renamed from: a */
    public boolean f13898a = false;

    /* renamed from: b */
    public String f13899b;

    public C5236h(String str) throws Exception {
        try {
            mo26319a(str);
            this.f13898a = true;
            IAlog.m16446a("parser: Parsing finished. parser is ready", new Object[0]);
        } catch (Exception e) {
            IAlog.m16447b("Error parsing Ad XML: %s", e.getMessage());
            throw e;
        }
    }

    /* renamed from: a */
    public final void mo26319a(String str) throws XmlPullParserException, IOException {
        String str2;
        String str3;
        IAlog.m16446a("Start reading Response", new Object[0]);
        XmlPullParser newPullParser = Xml.newPullParser();
        newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
        newPullParser.setInput(new StringReader(str));
        newPullParser.nextTag();
        newPullParser.require(2, (String) null, "tns:Response");
        while (newPullParser.next() != 3) {
            if (newPullParser.getEventType() == 2) {
                int i = 1;
                if (newPullParser.getName().equals("tns:Ad")) {
                    newPullParser.require(2, (String) null, "tns:Ad");
                    IAlog.m16446a("Start reading Ad", new Object[0]);
                    if (newPullParser.next() == 4) {
                        str2 = newPullParser.getText();
                        newPullParser.nextTag();
                    } else {
                        IAlog.m16450e("No text: %s", newPullParser.getName());
                        str2 = "";
                    }
                    String trim = str2.trim();
                    IAlog.m16449d("Ad content: %s", trim);
                    if (trim == null) {
                        str3 = null;
                    } else {
                        str3 = C5277g0.f13989f.mo26375a(trim);
                    }
                    this.f13899b = str3;
                } else if (newPullParser.getEventType() == 2) {
                    while (i != 0) {
                        int next = newPullParser.next();
                        if (next == 2) {
                            i++;
                        } else if (next == 3) {
                            i--;
                        }
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
        }
    }
}
