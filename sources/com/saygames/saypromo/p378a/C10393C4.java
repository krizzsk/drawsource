package com.saygames.saypromo.p378a;

import com.inmobi.media.C5922dh;

/* renamed from: com.saygames.saypromo.a.C4 */
public final class C10393C4 implements C10386B4 {
    C10393C4() {
    }

    /* renamed from: a */
    public final C10379A4 mo65265a(String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1314880604) {
                if (hashCode != -1012429441) {
                    if (hashCode != -655373719) {
                        if (hashCode == 1163912186 && str.equals("bottom-right")) {
                            return new C10731w4();
                        }
                    } else if (str.equals("bottom-left")) {
                        return new C10724v4();
                    }
                } else if (str.equals("top-left")) {
                    return new C10745y4();
                }
            } else if (str.equals(C5922dh.DEFAULT_POSITION)) {
                return new C10752z4();
            }
        }
        return new C10738x4();
    }
}
