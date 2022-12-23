package com.applovin.impl.sdk.utils;

import android.util.Xml;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2102v;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.TimeUnit;
import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

/* renamed from: com.applovin.impl.sdk.utils.s */
public class C2099s {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C2102v f4123a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public Stack<C2101a> f4124b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public StringBuilder f4125c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public long f4126d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C2101a f4127e;

    /* renamed from: com.applovin.impl.sdk.utils.s$a */
    private static class C2101a extends C2098r {
        C2101a(String str, Map<String, String> map, C2098r rVar) {
            super(str, map, rVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo15008a(C2098r rVar) {
            if (rVar != null) {
                this.f4119c.add(rVar);
                return;
            }
            throw new IllegalArgumentException("None specified.");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo15009d(String str) {
            this.f4118b = str;
        }
    }

    C2099s(C1969m mVar) {
        if (mVar != null) {
            this.f4123a = mVar.mo14509A();
            return;
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    /* renamed from: a */
    public static C2098r m5089a(String str, C1969m mVar) throws SAXException {
        return new C2099s(mVar).mo14996a(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Map<String, String> m5093a(Attributes attributes) {
        if (attributes == null) {
            return Collections.emptyMap();
        }
        int length = attributes.getLength();
        HashMap hashMap = new HashMap(length);
        for (int i = 0; i < length; i++) {
            hashMap.put(attributes.getQName(i), attributes.getValue(i));
        }
        return hashMap;
    }

    /* renamed from: a */
    public C2098r mo14996a(String str) throws SAXException {
        if (str != null) {
            this.f4125c = new StringBuilder();
            this.f4124b = new Stack<>();
            this.f4127e = null;
            Xml.parse(str, new ContentHandler() {
                public void characters(char[] cArr, int i, int i2) {
                    String trim = new String(Arrays.copyOfRange(cArr, i, i2)).trim();
                    if (StringUtils.isValidString(trim)) {
                        C2099s.this.f4125c.append(trim);
                    }
                }

                public void endDocument() {
                    long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis()) - C2099s.this.f4126d;
                    if (C2102v.m5104a()) {
                        C2102v a = C2099s.this.f4123a;
                        a.mo15012b("XmlParser", "Finished parsing in " + seconds + " seconds");
                    }
                }

                public void endElement(String str, String str2, String str3) {
                    C2099s sVar = C2099s.this;
                    C2101a unused = sVar.f4127e = (C2101a) sVar.f4124b.pop();
                    C2099s.this.f4127e.mo15009d(C2099s.this.f4125c.toString().trim());
                    C2099s.this.f4125c.setLength(0);
                }

                public void endPrefixMapping(String str) {
                }

                public void ignorableWhitespace(char[] cArr, int i, int i2) {
                }

                public void processingInstruction(String str, String str2) {
                }

                public void setDocumentLocator(Locator locator) {
                }

                public void skippedEntity(String str) {
                }

                public void startDocument() {
                    if (C2102v.m5104a()) {
                        C2099s.this.f4123a.mo15012b("XmlParser", "Begin parsing...");
                    }
                    long unused = C2099s.this.f4126d = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
                }

                public void startElement(String str, String str2, String str3, Attributes attributes) throws SAXException {
                    C2101a aVar = null;
                    try {
                        if (!C2099s.this.f4124b.isEmpty()) {
                            aVar = (C2101a) C2099s.this.f4124b.peek();
                        }
                        C2101a aVar2 = new C2101a(str2, C2099s.this.m5093a(attributes), aVar);
                        if (aVar != null) {
                            aVar.mo15008a(aVar2);
                        }
                        C2099s.this.f4124b.push(aVar2);
                    } catch (Exception e) {
                        if (C2102v.m5104a()) {
                            C2102v a = C2099s.this.f4123a;
                            a.mo15013b("XmlParser", "Unable to process element <" + str2 + ">", e);
                        }
                        throw new SAXException("Failed to start element", e);
                    }
                }

                public void startPrefixMapping(String str, String str2) {
                }
            });
            C2101a aVar = this.f4127e;
            if (aVar != null) {
                return aVar;
            }
            throw new SAXException("Unable to parse XML into node");
        }
        throw new IllegalArgumentException("Unable to parse. No XML specified.");
    }
}
