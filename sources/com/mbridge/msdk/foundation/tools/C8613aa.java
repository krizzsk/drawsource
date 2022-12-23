package com.mbridge.msdk.foundation.tools;

import com.google.android.exoplayer2.C5429C;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* renamed from: com.mbridge.msdk.foundation.tools.aa */
/* compiled from: SerializeTools */
public final class C8613aa {
    /* renamed from: a */
    public static String m24711a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(obj);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            objectOutputStream.flush();
            objectOutputStream.close();
            return new String(byteArray, C5429C.ISO88591_NAME);
        } catch (IOException e) {
            C8672v.m24875a("SerializeTools", "IOException", e);
            return "";
        }
    }

    /* renamed from: a */
    public static Object m24710a(String str) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes(C5429C.ISO88591_NAME));
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            Object readObject = objectInputStream.readObject();
            objectInputStream.close();
            byteArrayInputStream.close();
            return readObject;
        } catch (Exception e) {
            C8672v.m24875a("SerializeTools", "Exception", e);
            return null;
        }
    }
}
