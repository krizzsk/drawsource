package com.ogury.p376cm.internal;

import com.ogury.p376cm.ConsentActivity;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.ogury.cm.internal.abcca */
public final class abcca {

    /* renamed from: a */
    public static final abcca f24390a = new abcca();

    private abcca() {
    }

    /* renamed from: a */
    public static String m27910a(byte[] bArr) throws Exception {
        bbabc.m28052b(bArr, "str");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new GZIPInputStream(new ByteArrayInputStream(bArr)), "UTF-8"));
        try {
            return ConsentActivity.aaaaa.m27628a((Reader) bufferedReader);
        } finally {
            ConsentActivity.aaaaa.m27629a((Closeable) bufferedReader);
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static byte[] m27911a(String str) throws Exception {
        bbabc.m28052b(str, "str");
        if (str.length() == 0) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        try {
            Charset forName = Charset.forName("UTF-8");
            bbabc.m28049a((Object) forName, "Charset.forName(charsetName)");
            byte[] bytes = str.getBytes(forName);
            bbabc.m28049a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
            gZIPOutputStream.write(bytes);
            ConsentActivity.aaaaa.m27629a((Closeable) gZIPOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            bbabc.m28049a((Object) byteArray, "obj.toByteArray()");
            return byteArray;
        } catch (Throwable th) {
            ConsentActivity.aaaaa.m27629a((Closeable) gZIPOutputStream);
            throw th;
        }
    }
}
