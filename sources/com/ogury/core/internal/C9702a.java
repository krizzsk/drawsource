package com.ogury.core.internal;

import com.ogury.core.internal.network.CloseableUtilKt;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.ogury.core.internal.a */
/* compiled from: CoreLogger.kt */
public class C9702a {

    /* renamed from: a */
    public static final C9702a f24584a = new C9702a();

    private C9702a() {
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static byte[] m28117a(String str) throws Exception {
        C9717ai.m28145b(str, "$this$compressToGzip");
        if (str.length() == 0) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        try {
            Charset forName = Charset.forName("UTF-8");
            C9717ai.m28143a((Object) forName, "Charset.forName(charsetName)");
            byte[] bytes = str.getBytes(forName);
            C9717ai.m28143a((Object) bytes, "(this as java.lang.String).getBytes(charset)");
            gZIPOutputStream.write(bytes);
            CloseableUtilKt.closeSafely(gZIPOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            C9717ai.m28143a((Object) byteArray, "obj.toByteArray()");
            return byteArray;
        } catch (Throwable th) {
            CloseableUtilKt.closeSafely(gZIPOutputStream);
            throw th;
        }
    }

    /* renamed from: a */
    public static String m28116a(byte[] bArr) throws Exception {
        C9717ai.m28145b(bArr, "$this$decompressFromGzip");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new GZIPInputStream(new ByteArrayInputStream(bArr)), "UTF-8"));
        try {
            return m28115a((Reader) bufferedReader);
        } finally {
            CloseableUtilKt.closeSafely(bufferedReader);
        }
    }

    /* renamed from: a */
    private static int m28110a(int i, int i2) {
        int i3 = i % i2;
        return i3 >= 0 ? i3 : i3 + i2;
    }

    /* renamed from: b */
    private static int m28118b(int i, int i2, int i3) {
        return m28110a(m28110a(i, i3) - m28110a(i2, i3), i3);
    }

    /* renamed from: a */
    public static int m28111a(int i, int i2, int i3) {
        if (i3 > 0) {
            return i >= i2 ? i2 : i2 - m28118b(i2, i, i3);
        }
        if (i3 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        } else if (i <= i2) {
            return i2;
        } else {
            return i2 + m28118b(i, i2, -i3);
        }
    }

    /* renamed from: a */
    public static /* synthetic */ long m28112a(InputStream inputStream, OutputStream outputStream, int i, int i2) {
        C9717ai.m28145b(inputStream, "$this$copyTo");
        C9717ai.m28145b(outputStream, "out");
        byte[] bArr = new byte[8192];
        int read = inputStream.read(bArr);
        long j = 0;
        while (read >= 0) {
            outputStream.write(bArr, 0, read);
            j += (long) read;
            read = inputStream.read(bArr);
        }
        return j;
    }

    /* renamed from: a */
    public static String m28115a(Reader reader) {
        C9717ai.m28145b(reader, "$this$readText");
        StringWriter stringWriter = new StringWriter();
        long unused = m28113a(reader, (Writer) stringWriter, 8192);
        String stringWriter2 = stringWriter.toString();
        C9717ai.m28143a((Object) stringWriter2, "buffer.toString()");
        return stringWriter2;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static long m28113a(Reader reader, Writer writer, int i) {
        C9717ai.m28145b(reader, "$this$copyTo");
        C9717ai.m28145b(writer, "out");
        char[] cArr = new char[i];
        int read = reader.read(cArr);
        long j = 0;
        while (read >= 0) {
            writer.write(cArr, 0, read);
            j += (long) read;
            read = reader.read(cArr);
        }
        return j;
    }
}
