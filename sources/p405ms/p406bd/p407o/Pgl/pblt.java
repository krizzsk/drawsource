package p405ms.p406bd.p407o.Pgl;

import java.util.Arrays;

/* renamed from: ms.bd.o.Pgl.pblt */
public class pblt extends RuntimeException {
    public pblt(String str, String[] strArr, String[] strArr2) {
        super("Could not find '" + str + "'. Looked for: " + Arrays.toString(strArr) + ", but only found: " + Arrays.toString(strArr2) + ".");
    }
}
