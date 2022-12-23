package com.tapjoy.internal;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.ba */
public final class C11286ba {
    /* renamed from: a */
    public static String m30887a(File file, Charset charset) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            return C11530go.m31566a(new InputStreamReader(fileInputStream, charset)).toString();
        } finally {
            C11531gp.m31567a(fileInputStream);
        }
    }

    @Nullable
    /* renamed from: a */
    public static String m30886a(File file) {
        try {
            return m30887a(file, C11262af.f26924c);
        } catch (IOException unused) {
            return null;
        }
    }
}
