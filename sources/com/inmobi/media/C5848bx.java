package com.inmobi.media;

import android.graphics.Point;
import java.util.Locale;

/* renamed from: com.inmobi.media.bx */
/* compiled from: NativeAssetStyle */
public class C5848bx {

    /* renamed from: a */
    public Point f14728a;

    /* renamed from: b */
    public Point f14729b;

    /* renamed from: c */
    public Point f14730c;

    /* renamed from: d */
    public Point f14731d;

    /* renamed from: e */
    protected String f14732e;

    /* renamed from: f */
    protected String f14733f;

    /* renamed from: g */
    protected String f14734g;

    /* renamed from: h */
    protected float f14735h;

    /* renamed from: i */
    protected String f14736i;

    /* renamed from: j */
    protected String f14737j;

    /* renamed from: k */
    protected C5862cf f14738k;

    public C5848bx() {
        this.f14728a = new Point(0, 0);
        this.f14730c = new Point(0, 0);
        this.f14729b = new Point(0, 0);
        this.f14731d = new Point(0, 0);
        this.f14732e = "none";
        this.f14733f = "straight";
        this.f14735h = 10.0f;
        this.f14736i = "#ff000000";
        this.f14737j = "#00000000";
        this.f14734g = "fill";
        this.f14738k = null;
    }

    public C5848bx(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str, String str2, String str3, String str4, C5862cf cfVar) {
        this(i, i2, i3, i4, i5, i6, i7, i8, "fill", str, str2, str3, str4, cfVar);
    }

    public C5848bx(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str, String str2, String str3, String str4, String str5, C5862cf cfVar) {
        this.f14728a = new Point(i3, i4);
        this.f14729b = new Point(i7, i8);
        this.f14730c = new Point(i, i2);
        this.f14731d = new Point(i5, i6);
        this.f14732e = str2;
        this.f14733f = str3;
        this.f14735h = 10.0f;
        this.f14734g = str;
        this.f14736i = str4.length() == 0 ? "#ff000000" : str4;
        this.f14737j = str5.length() == 0 ? "#00000000" : str5;
        this.f14738k = cfVar;
    }

    /* renamed from: a */
    public final String mo34827a() {
        return this.f14732e;
    }

    /* renamed from: b */
    public final String mo34828b() {
        return this.f14733f;
    }

    /* renamed from: c */
    public final float mo34829c() {
        return this.f14735h;
    }

    /* renamed from: d */
    public final String mo34830d() {
        return this.f14736i.toLowerCase(Locale.US);
    }

    /* renamed from: e */
    public String mo34831e() {
        return this.f14737j.toLowerCase(Locale.US);
    }

    /* renamed from: f */
    public final String mo34832f() {
        return this.f14734g;
    }

    /* renamed from: g */
    public final C5862cf mo34833g() {
        return this.f14738k;
    }
}
