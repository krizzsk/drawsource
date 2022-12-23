package com.inmobi.media;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.bw */
/* compiled from: NativeAsset */
public class C5847bw {

    /* renamed from: z */
    private static final String f14702z = C5847bw.class.getSimpleName();

    /* renamed from: a */
    String f14703a;

    /* renamed from: b */
    public String f14704b;

    /* renamed from: c */
    public C5848bx f14705c;

    /* renamed from: d */
    public String f14706d;

    /* renamed from: e */
    public Object f14707e;

    /* renamed from: f */
    JSONObject f14708f;

    /* renamed from: g */
    String f14709g;

    /* renamed from: h */
    public boolean f14710h;

    /* renamed from: i */
    public byte f14711i;

    /* renamed from: j */
    public String f14712j;

    /* renamed from: k */
    public byte f14713k;

    /* renamed from: l */
    public byte f14714l;

    /* renamed from: m */
    public byte f14715m;

    /* renamed from: n */
    byte f14716n;

    /* renamed from: o */
    public int f14717o;

    /* renamed from: p */
    public int f14718p;

    /* renamed from: q */
    String f14719q;

    /* renamed from: r */
    public String f14720r;

    /* renamed from: s */
    public String f14721s;

    /* renamed from: t */
    public C5847bw f14722t;

    /* renamed from: u */
    public List<C5868ci> f14723u;

    /* renamed from: v */
    public Map<String, Object> f14724v;

    /* renamed from: w */
    public Object f14725w;

    /* renamed from: x */
    public int f14726x;

    /* renamed from: y */
    public C5847bw f14727y;

    public C5847bw() {
        this("", "root", "CONTAINER", new C5848bx());
    }

    public C5847bw(String str, String str2, String str3, C5848bx bxVar) {
        this(str, str2, str3, bxVar, new LinkedList());
    }

    public C5847bw(String str, String str2, String str3, C5848bx bxVar, List<C5868ci> list) {
        this.f14703a = str;
        this.f14706d = str2;
        this.f14704b = str3;
        this.f14705c = bxVar;
        this.f14707e = null;
        this.f14709g = "";
        this.f14710h = false;
        this.f14711i = 0;
        this.f14712j = "";
        this.f14714l = 0;
        this.f14713k = 0;
        this.f14715m = 0;
        this.f14716n = 2;
        this.f14726x = 0;
        this.f14717o = -1;
        this.f14719q = "";
        this.f14720r = "";
        this.f14708f = new JSONObject();
        LinkedList linkedList = new LinkedList();
        this.f14723u = linkedList;
        linkedList.addAll(list);
        this.f14724v = new HashMap();
    }

    /* renamed from: a */
    public final void mo34823a(String str, Map<String, String> map) {
        mo34824a(str, map, (C5817bk) null);
    }

    /* renamed from: a */
    public final void mo34824a(String str, Map<String, String> map, C5817bk bkVar) {
        if (this.f14723u.size() != 0) {
            for (C5868ci next : this.f14723u) {
                if (str.equals(next.f14815d)) {
                    m17403a(next, map, bkVar);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo34825a(List<C5868ci> list) {
        this.f14723u.addAll(list);
    }

    /* renamed from: a */
    public final void mo34822a(String str) {
        this.f14720r = str.trim();
    }

    /* renamed from: b */
    public final void mo34826b(String str) {
        this.f14721s = str.trim();
    }

    /* renamed from: a */
    public static void m17403a(C5868ci ciVar, Map<String, String> map, C5817bk bkVar) {
        C5820bn.m17365a().mo34791a(C6196id.m18383a(ciVar.f14813b, map), ciVar.f14816e, true, bkVar);
    }
}
