package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p189ts;

import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C4673h;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4978k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C4988r;
import java.util.Collections;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v */
public interface C4795v {

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v$a */
    public static final class C4796a {

        /* renamed from: a */
        public final String f12639a;

        /* renamed from: b */
        public final byte[] f12640b;

        public C4796a(String str, int i, byte[] bArr) {
            this.f12639a = str;
            this.f12640b = bArr;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v$b */
    public static final class C4797b {

        /* renamed from: a */
        public final String f12641a;

        /* renamed from: b */
        public final List<C4796a> f12642b;

        /* renamed from: c */
        public final byte[] f12643c;

        public C4797b(int i, String str, List<C4796a> list, byte[] bArr) {
            List<C4796a> list2;
            this.f12641a = str;
            if (list == null) {
                list2 = Collections.emptyList();
            } else {
                list2 = Collections.unmodifiableList(list);
            }
            this.f12642b = list2;
            this.f12643c = bArr;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v$c */
    public interface C4798c {
        /* renamed from: a */
        SparseArray<C4795v> mo25225a();

        /* renamed from: a */
        C4795v mo25227a(int i, C4797b bVar);
    }

    /* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.v$d */
    public static final class C4799d {

        /* renamed from: a */
        public final String f12644a;

        /* renamed from: b */
        public final int f12645b;

        /* renamed from: c */
        public final int f12646c;

        /* renamed from: d */
        public int f12647d;

        /* renamed from: e */
        public String f12648e;

        public C4799d(int i, int i2, int i3) {
            String str;
            if (i != Integer.MIN_VALUE) {
                str = i + "/";
            } else {
                str = "";
            }
            this.f12644a = str;
            this.f12645b = i2;
            this.f12646c = i3;
            this.f12647d = Integer.MIN_VALUE;
        }

        /* renamed from: a */
        public void mo25247a() {
            int i = this.f12647d;
            this.f12647d = i == Integer.MIN_VALUE ? this.f12645b : i + this.f12646c;
            this.f12648e = this.f12644a + this.f12647d;
        }

        /* renamed from: b */
        public String mo25248b() {
            if (this.f12647d != Integer.MIN_VALUE) {
                return this.f12648e;
            }
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }

        /* renamed from: c */
        public int mo25249c() {
            int i = this.f12647d;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    /* renamed from: a */
    void mo25238a();

    /* renamed from: a */
    void mo25240a(C4978k kVar, boolean z);

    /* renamed from: a */
    void mo25241a(C4988r rVar, C4673h hVar, C4799d dVar);
}
