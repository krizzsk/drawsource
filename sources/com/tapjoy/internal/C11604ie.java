package com.tapjoy.internal;

import android.graphics.Point;
import android.os.SystemClock;
import com.tapjoy.TapjoyConstants;
import com.vungle.warren.model.VisionDataDBAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.Nullable;

/* renamed from: com.tapjoy.internal.ie */
public class C11604ie extends C11595ia {

    /* renamed from: n */
    public static final C11288bc<C11604ie> f27901n = new C11288bc<C11604ie>() {
        /* renamed from: a */
        public final /* synthetic */ Object mo69701a(C11296bh bhVar) {
            return new C11604ie(bhVar);
        }
    };
    @Nullable

    /* renamed from: a */
    public C11610ih f27902a;
    @Nullable

    /* renamed from: b */
    public C11610ih f27903b;

    /* renamed from: c */
    public C11610ih f27904c;
    @Nullable

    /* renamed from: d */
    public Point f27905d;
    @Nullable

    /* renamed from: e */
    public C11610ih f27906e;
    @Nullable

    /* renamed from: f */
    public C11610ih f27907f;

    /* renamed from: g */
    public String f27908g;
    @Nullable

    /* renamed from: h */
    public C11537gv f27909h;

    /* renamed from: i */
    public ArrayList<C11598ic> f27910i = new ArrayList<>();

    /* renamed from: j */
    public ArrayList<C11598ic> f27911j = new ArrayList<>();

    /* renamed from: k */
    public Map<String, Object> f27912k;

    /* renamed from: l */
    public long f27913l;
    @Nullable

    /* renamed from: m */
    public C11606if f27914m;

    public C11604ie() {
    }

    C11604ie(C11296bh bhVar) {
        bhVar.mo69722h();
        String str = null;
        String str2 = null;
        while (bhVar.mo69724j()) {
            String l = bhVar.mo69726l();
            if ("frame".equals(l)) {
                bhVar.mo69722h();
                while (bhVar.mo69724j()) {
                    String l2 = bhVar.mo69726l();
                    if ("portrait".equals(l2)) {
                        this.f27902a = C11610ih.f27922e.mo69701a(bhVar);
                    } else if ("landscape".equals(l2)) {
                        this.f27903b = C11610ih.f27922e.mo69701a(bhVar);
                    } else if ("close_button".equals(l2)) {
                        this.f27904c = C11610ih.f27922e.mo69701a(bhVar);
                    } else if ("close_button_offset".equals(l2)) {
                        this.f27905d = C11289bd.f26951a.mo69701a(bhVar);
                    } else {
                        bhVar.mo69733s();
                    }
                }
                bhVar.mo69723i();
            } else if (VisionDataDBAdapter.VisionDataColumns.COLUMN_CREATIVE.equals(l)) {
                bhVar.mo69722h();
                while (bhVar.mo69724j()) {
                    String l3 = bhVar.mo69726l();
                    if ("portrait".equals(l3)) {
                        this.f27906e = C11610ih.f27922e.mo69701a(bhVar);
                    } else if ("landscape".equals(l3)) {
                        this.f27907f = C11610ih.f27922e.mo69701a(bhVar);
                    } else {
                        bhVar.mo69733s();
                    }
                }
                bhVar.mo69723i();
            } else if ("url".equals(l)) {
                this.f27908g = bhVar.mo69711b();
            } else if (C11591hy.m31774a(l)) {
                this.f27909h = C11591hy.m31773a(l, bhVar);
            } else if ("mappings".equals(l)) {
                bhVar.mo69722h();
                while (bhVar.mo69724j()) {
                    String l4 = bhVar.mo69726l();
                    if ("portrait".equals(l4)) {
                        bhVar.mo69708a(this.f27910i, C11598ic.f27881h);
                    } else if ("landscape".equals(l4)) {
                        bhVar.mo69708a(this.f27911j, C11598ic.f27881h);
                    } else {
                        bhVar.mo69733s();
                    }
                }
                bhVar.mo69723i();
            } else if ("meta".equals(l)) {
                this.f27912k = bhVar.mo69714d();
            } else if ("ttl".equals(l)) {
                this.f27913l = SystemClock.elapsedRealtime() + ((long) (bhVar.mo69730p() * 1000.0d));
            } else if ("no_more_today".equals(l)) {
                this.f27914m = C11606if.f27915d.mo69701a(bhVar);
            } else if ("ad_content".equals(l)) {
                str = bhVar.mo69711b();
            } else if (TapjoyConstants.TJC_REDIRECT_URL.equals(l)) {
                str2 = bhVar.mo69711b();
            } else {
                bhVar.mo69733s();
            }
        }
        bhVar.mo69723i();
        if (this.f27908g == null) {
            this.f27908g = "";
        }
        ArrayList<C11598ic> arrayList = this.f27910i;
        if (arrayList != null) {
            Iterator<C11598ic> it = arrayList.iterator();
            while (it.hasNext()) {
                C11598ic next = it.next();
                if (next.f27887f == null) {
                    next.f27887f = str;
                }
                if (next.f27886e == null) {
                    next.f27886e = str2;
                }
            }
        }
        ArrayList<C11598ic> arrayList2 = this.f27911j;
        if (arrayList2 != null) {
            Iterator<C11598ic> it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                C11598ic next2 = it2.next();
                if (next2.f27887f == null) {
                    next2.f27887f = str;
                }
                if (next2.f27886e == null) {
                    next2.f27886e = str2;
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo70192a() {
        return (this.f27904c == null || this.f27902a == null || this.f27906e == null) ? false : true;
    }

    /* renamed from: b */
    public final boolean mo70193b() {
        return (this.f27904c == null || this.f27903b == null || this.f27907f == null) ? false : true;
    }
}
