package com.apm.insight.p026l;

import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.security.MessageDigest;

/* renamed from: com.apm.insight.l.e */
public class C1303e extends PrintWriter {

    /* renamed from: a */
    private MessageDigest f1318a = null;

    /* renamed from: b */
    private Charset f1319b = null;

    /* renamed from: c */
    private C1304a f1320c = null;

    /* renamed from: com.apm.insight.l.e$a */
    public static class C1304a {
        /* renamed from: a */
        public boolean mo12523a(String str) {
            return true;
        }
    }

    public C1303e(OutputStream outputStream, MessageDigest messageDigest, C1304a aVar) {
        super(outputStream);
        this.f1318a = messageDigest;
        this.f1320c = aVar;
        if (messageDigest != null) {
            this.f1319b = Charset.defaultCharset();
        }
    }

    public void write(int i) {
        super.write(i);
        MessageDigest messageDigest = this.f1318a;
        if (messageDigest != null) {
            messageDigest.update((byte) i);
        }
    }

    public void write(String str, int i, int i2) {
        super.write(str, i, i2);
        if (this.f1318a != null) {
            C1304a aVar = this.f1320c;
            if (aVar == null || aVar.mo12523a(str)) {
                this.f1318a.update(this.f1319b.encode(CharBuffer.wrap(str, i, i2 + i)).array());
            }
        }
    }

    public void write(char[] cArr, int i, int i2) {
        super.write(cArr, i, i2);
        MessageDigest messageDigest = this.f1318a;
        if (messageDigest != null) {
            messageDigest.update(this.f1319b.encode(CharBuffer.wrap(cArr)).array());
        }
    }
}
