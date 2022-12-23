package com.ironsource.sdk.p285g;

import android.text.TextUtils;
import java.util.HashSet;

/* renamed from: com.ironsource.sdk.g.d */
public class C8293d {

    /* renamed from: a */
    private boolean f20224a = false;

    /* renamed from: b */
    private HashSet<String> f20225b = new HashSet<>();

    /* renamed from: c */
    private String f20226c;

    /* renamed from: d */
    private String f20227d;

    /* renamed from: e */
    private boolean f20228e = false;

    /* renamed from: f */
    private int f20229f;

    /* renamed from: g */
    private boolean f20230g = true;

    /* renamed from: com.ironsource.sdk.g.d$a */
    public enum C8294a {
        ;
        

        /* renamed from: a */
        public static final int f20231a = 1;

        /* renamed from: b */
        public static final int f20232b = 2;

        /* renamed from: c */
        public static final int f20233c = 3;

        static {
            f20234d = new int[]{1, 2, 3};
        }

        /* renamed from: a */
        public static int[] m23644a() {
            return (int[]) f20234d.clone();
        }
    }

    /* renamed from: com.ironsource.sdk.g.d$b */
    public enum C8295b {
        None,
        Loaded,
        Ready,
        f20238d
    }

    /* renamed from: com.ironsource.sdk.g.d$c */
    public enum C8296c {
        Web,
        Native,
        None
    }

    /* renamed from: com.ironsource.sdk.g.d$d */
    public enum C8297d {
        MODE_0(0),
        MODE_1(1),
        MODE_2(2),
        MODE_3(3);
        

        /* renamed from: d */
        public int f20249d;

        private C8297d(int i) {
            this.f20249d = i;
        }
    }

    /* renamed from: com.ironsource.sdk.g.d$e */
    public enum C8298e {
        Banner,
        OfferWall,
        Interstitial,
        OfferWallCredits,
        RewardedVideo,
        None
    }

    /* renamed from: a */
    public HashSet<String> mo56725a() {
        return this.f20225b;
    }

    /* renamed from: a */
    public void mo56726a(int i) {
        this.f20229f = i;
    }

    /* renamed from: a */
    public void mo56727a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f20225b.add(str);
        }
    }

    /* renamed from: a */
    public void mo56728a(boolean z) {
        this.f20224a = z;
    }

    /* renamed from: b */
    public void mo56729b(String str) {
        this.f20226c = str;
    }

    /* renamed from: b */
    public void mo56730b(boolean z) {
        this.f20228e = z;
    }

    /* renamed from: b */
    public boolean mo56731b() {
        return this.f20224a;
    }

    /* renamed from: c */
    public String mo56732c() {
        return this.f20226c;
    }

    /* renamed from: c */
    public void mo56733c(String str) {
        this.f20227d = str;
    }

    /* renamed from: c */
    public void mo56734c(boolean z) {
        this.f20230g = z;
    }

    /* renamed from: d */
    public String mo56735d() {
        return this.f20227d;
    }

    /* renamed from: e */
    public boolean mo56736e() {
        return this.f20228e;
    }

    /* renamed from: f */
    public int mo56737f() {
        return this.f20229f;
    }

    /* renamed from: g */
    public boolean mo56738g() {
        return this.f20230g;
    }
}
