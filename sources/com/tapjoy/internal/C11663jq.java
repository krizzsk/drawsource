package com.tapjoy.internal;

import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.tapjoy.internal.jq */
public final class C11663jq {
    /* renamed from: a */
    private static Throwable m31997a(Object[] objArr) {
        if (!(objArr == null || objArr.length == 0)) {
            Throwable th = objArr[objArr.length - 1];
            if (th instanceof Throwable) {
                return th;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static final C11662jp m31996a(String str, Object[] objArr) {
        int i;
        Throwable a = m31997a(objArr);
        if (str == null) {
            return new C11662jp((String) null, objArr, a);
        }
        if (objArr == null) {
            return new C11662jp(str);
        }
        StringBuffer stringBuffer = new StringBuffer(str.length() + 50);
        int i2 = 0;
        int i3 = 0;
        while (i2 < objArr.length) {
            int indexOf = str.indexOf(JsonUtils.EMPTY_JSON, i3);
            if (indexOf != -1) {
                if (!m32009a(str, indexOf)) {
                    stringBuffer.append(str.substring(i3, indexOf));
                    m31999a(stringBuffer, objArr[i2], (Map) new HashMap());
                } else if (!m32010b(str, indexOf)) {
                    i2--;
                    stringBuffer.append(str.substring(i3, indexOf - 1));
                    stringBuffer.append('{');
                    i = indexOf + 1;
                    i3 = i;
                    i2++;
                } else {
                    stringBuffer.append(str.substring(i3, indexOf - 1));
                    m31999a(stringBuffer, objArr[i2], (Map) new HashMap());
                }
                i = indexOf + 2;
                i3 = i;
                i2++;
            } else if (i3 == 0) {
                return new C11662jp(str, objArr, a);
            } else {
                stringBuffer.append(str.substring(i3, str.length()));
                return new C11662jp(stringBuffer.toString(), objArr, a);
            }
        }
        stringBuffer.append(str.substring(i3, str.length()));
        if (i2 < objArr.length - 1) {
            return new C11662jp(stringBuffer.toString(), objArr, a);
        }
        return new C11662jp(stringBuffer.toString(), objArr, (Throwable) null);
    }

    /* renamed from: a */
    private static boolean m32009a(String str, int i) {
        return i != 0 && str.charAt(i - 1) == '\\';
    }

    /* renamed from: b */
    private static boolean m32010b(String str, int i) {
        return i >= 2 && str.charAt(i - 2) == '\\';
    }

    /* renamed from: a */
    private static void m31999a(StringBuffer stringBuffer, Object obj, Map map) {
        if (obj == null) {
            stringBuffer.append("null");
        } else if (!obj.getClass().isArray()) {
            m31998a(stringBuffer, obj);
        } else if (obj instanceof boolean[]) {
            m32008a(stringBuffer, (boolean[]) obj);
        } else if (obj instanceof byte[]) {
            m32000a(stringBuffer, (byte[]) obj);
        } else if (obj instanceof char[]) {
            m32001a(stringBuffer, (char[]) obj);
        } else if (obj instanceof short[]) {
            m32007a(stringBuffer, (short[]) obj);
        } else if (obj instanceof int[]) {
            m32004a(stringBuffer, (int[]) obj);
        } else if (obj instanceof long[]) {
            m32005a(stringBuffer, (long[]) obj);
        } else if (obj instanceof float[]) {
            m32003a(stringBuffer, (float[]) obj);
        } else if (obj instanceof double[]) {
            m32002a(stringBuffer, (double[]) obj);
        } else {
            m32006a(stringBuffer, (Object[]) obj, map);
        }
    }

    /* renamed from: a */
    private static void m31998a(StringBuffer stringBuffer, Object obj) {
        try {
            stringBuffer.append(obj.toString());
        } catch (Throwable th) {
            PrintStream printStream = System.err;
            printStream.println("SLF4J: Failed toString() invocation on an object of type [" + obj.getClass().getName() + "]");
            th.printStackTrace();
            stringBuffer.append("[FAILED toString()]");
        }
    }

    /* renamed from: a */
    private static void m32006a(StringBuffer stringBuffer, Object[] objArr, Map map) {
        stringBuffer.append('[');
        if (!map.containsKey(objArr)) {
            map.put(objArr, (Object) null);
            int length = objArr.length;
            for (int i = 0; i < length; i++) {
                m31999a(stringBuffer, objArr[i], map);
                if (i != length - 1) {
                    stringBuffer.append(", ");
                }
            }
            map.remove(objArr);
        } else {
            stringBuffer.append(APSSharedUtil.TRUNCATE_SEPARATOR);
        }
        stringBuffer.append(']');
    }

    /* renamed from: a */
    private static void m32008a(StringBuffer stringBuffer, boolean[] zArr) {
        stringBuffer.append('[');
        int length = zArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(zArr[i]);
            if (i != length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
    }

    /* renamed from: a */
    private static void m32000a(StringBuffer stringBuffer, byte[] bArr) {
        stringBuffer.append('[');
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(bArr[i]);
            if (i != length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
    }

    /* renamed from: a */
    private static void m32001a(StringBuffer stringBuffer, char[] cArr) {
        stringBuffer.append('[');
        int length = cArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(cArr[i]);
            if (i != length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
    }

    /* renamed from: a */
    private static void m32007a(StringBuffer stringBuffer, short[] sArr) {
        stringBuffer.append('[');
        int length = sArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(sArr[i]);
            if (i != length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
    }

    /* renamed from: a */
    private static void m32004a(StringBuffer stringBuffer, int[] iArr) {
        stringBuffer.append('[');
        int length = iArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(iArr[i]);
            if (i != length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
    }

    /* renamed from: a */
    private static void m32005a(StringBuffer stringBuffer, long[] jArr) {
        stringBuffer.append('[');
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(jArr[i]);
            if (i != length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
    }

    /* renamed from: a */
    private static void m32003a(StringBuffer stringBuffer, float[] fArr) {
        stringBuffer.append('[');
        int length = fArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(fArr[i]);
            if (i != length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
    }

    /* renamed from: a */
    private static void m32002a(StringBuffer stringBuffer, double[] dArr) {
        stringBuffer.append('[');
        int length = dArr.length;
        for (int i = 0; i < length; i++) {
            stringBuffer.append(dArr[i]);
            if (i != length - 1) {
                stringBuffer.append(", ");
            }
        }
        stringBuffer.append(']');
    }
}
