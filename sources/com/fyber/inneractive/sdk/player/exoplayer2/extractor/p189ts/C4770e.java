package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p189ts;

import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.C4811i;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C4644a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.p189ts.C4795v;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4965a;
import com.google.common.base.Ascii;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import okio.Utf8;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.e */
public final class C4770e implements C4795v.C4798c {

    /* renamed from: a */
    public final int f12446a;

    /* renamed from: b */
    public final List<C4811i> f12447b;

    public C4770e(int i, List<C4811i> list) {
        this.f12446a = i;
        if (!mo25228a(32) && list.isEmpty()) {
            list = Collections.singletonList(C4811i.m14724a((String) null, "application/cea-608", (String) null, -1, 0, (String) null, (C4644a) null));
        }
        this.f12447b = list;
    }

    /* renamed from: a */
    public SparseArray<C4795v> mo25225a() {
        return new SparseArray<>();
    }

    /* renamed from: a */
    public C4795v mo25227a(int i, C4795v.C4797b bVar) {
        if (i == 2) {
            return new C4785o(new C4774i());
        }
        if (i == 3 || i == 4) {
            return new C4785o(new C4783m(bVar.f12641a));
        }
        if (i != 15) {
            if (i == 21) {
                return new C4785o(new C4782l());
            }
            if (i != 27) {
                if (i == 36) {
                    return new C4785o(new C4780k(mo25226a(bVar)));
                }
                if (i == 89) {
                    return new C4785o(new C4772g(bVar.f12642b));
                }
                if (i != 138) {
                    if (i != 129) {
                        if (i != 130) {
                            if (i != 134) {
                                if (i != 135) {
                                    return null;
                                }
                            } else if (mo25228a(16)) {
                                return null;
                            } else {
                                return new C4789r(new C4791t());
                            }
                        }
                    }
                    return new C4785o(new C4767b(bVar.f12641a));
                }
                return new C4785o(new C4771f(bVar.f12641a));
            } else if (mo25228a(4)) {
                return null;
            } else {
                return new C4785o(new C4776j(mo25226a(bVar), mo25228a(1), mo25228a(8)));
            }
        } else if (mo25228a(2)) {
            return null;
        } else {
            return new C4785o(new C4769d(false, bVar.f12641a));
        }
    }

    /* renamed from: a */
    public final C4790s mo25226a(C4795v.C4797b bVar) {
        byte b;
        String str;
        if (mo25228a(32)) {
            return new C4790s(this.f12447b);
        }
        byte[] bArr = bVar.f12643c;
        int length = bArr.length;
        int i = 0;
        List<C4811i> list = this.f12447b;
        while (length - i > 0) {
            int i2 = i + 1;
            byte b2 = bArr[i] & 255;
            int i3 = i2 + 1;
            int i4 = (bArr[i2] & 255) + i3;
            boolean z = true;
            ArrayList arrayList = list;
            if (b2 == 134) {
                ArrayList arrayList2 = new ArrayList();
                int i5 = i3 + 1;
                byte b3 = bArr[i3] & 255 & Ascii.f18308US;
                for (int i6 = 0; i6 < b3; i6++) {
                    String str2 = new String(bArr, i5, 3, Charset.defaultCharset());
                    int i7 = i5 + 3;
                    int i8 = i7 + 1;
                    byte b4 = bArr[i7] & 255;
                    if ((b4 & 128) != 0) {
                        b = b4 & Utf8.REPLACEMENT_BYTE;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        b = 1;
                    }
                    arrayList2.add(C4811i.m14723a((String) null, str, (String) null, -1, 0, str2, b, (C4644a) null, Long.MAX_VALUE, Collections.emptyList()));
                    i5 = i8 + 2;
                    C4965a.m15049a(i5 >= 0 && i5 <= length);
                }
                arrayList = arrayList2;
            }
            if (i4 < 0 || i4 > length) {
                z = false;
            }
            C4965a.m15049a(z);
            i = i4;
            list = arrayList;
        }
        return new C4790s(list);
    }

    /* renamed from: a */
    public final boolean mo25228a(int i) {
        return (i & this.f12446a) != 0;
    }
}
