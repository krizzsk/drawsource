package com.inmobi.media;

import android.os.SystemClock;
import com.inmobi.media.C6108gb;
import java.util.Map;

/* renamed from: com.inmobi.media.fz */
/* compiled from: ConfigNetworkClient */
class C6101fz implements Runnable {

    /* renamed from: a */
    private static final String f15411a = C6101fz.class.getSimpleName();

    /* renamed from: b */
    private C6107ga f15412b;

    /* renamed from: c */
    private C6102a f15413c;

    /* renamed from: d */
    private final C6107ga f15414d;

    /* renamed from: com.inmobi.media.fz$a */
    /* compiled from: ConfigNetworkClient */
    public interface C6102a {
        /* renamed from: a */
        void mo35286a(C6108gb.C6109a aVar);

        /* renamed from: a */
        void mo35287a(String str);
    }

    C6101fz(C6102a aVar, C6107ga gaVar, C6107ga gaVar2) {
        this.f15413c = aVar;
        this.f15412b = gaVar;
        this.f15414d = gaVar2;
    }

    /* renamed from: a */
    private void m18108a(C6107ga gaVar, Map<String, C6108gb.C6109a> map) {
        for (Map.Entry next : map.entrySet()) {
            C6108gb.C6109a aVar = (C6108gb.C6109a) next.getValue();
            String str = (String) next.getKey();
            if (!aVar.mo35297a()) {
                this.f15413c.mo35286a(aVar);
                gaVar.f15426c.remove(str);
            }
        }
    }

    /* renamed from: a */
    private static C6108gb m18107a(C6107ga gaVar) {
        return new C6108gb(gaVar, new C6159hd(gaVar).mo35353a(), SystemClock.elapsedRealtime() - SystemClock.elapsedRealtime());
    }

    /* renamed from: a */
    private boolean m18109a(C6107ga gaVar, int i, Map<String, C6108gb.C6109a> map) throws InterruptedException {
        if (i > gaVar.f15424a) {
            for (Map.Entry<String, C6093fu> key : gaVar.f15426c.entrySet()) {
                String str = (String) key.getKey();
                if (map.containsKey(str)) {
                    this.f15413c.mo35286a(map.get(str));
                }
            }
            return true;
        }
        Thread.sleep((long) (gaVar.f15425b * 1000));
        return false;
    }

    public void run() {
        Map<String, C6108gb.C6109a> map;
        int i = 0;
        int i2 = 0;
        do {
            try {
                if (i2 > this.f15412b.f15424a) {
                    break;
                }
                C6108gb a = m18107a(this.f15412b);
                map = a.f15428a;
                if (!(a.mo35296a() && this.f15414d != null)) {
                    m18108a(this.f15412b, map);
                    if (this.f15412b.f15426c.isEmpty()) {
                        break;
                    }
                    i2++;
                } else {
                    while (i <= this.f15414d.f15424a) {
                        C6108gb a2 = m18107a(this.f15414d);
                        Map<String, C6108gb.C6109a> map2 = a2.f15428a;
                        if (a2.mo35296a()) {
                            break;
                        }
                        m18108a(this.f15414d, map2);
                        if (this.f15414d.f15426c.isEmpty()) {
                            break;
                        }
                        i++;
                        if (m18109a(this.f15414d, i, map2)) {
                            break;
                        }
                    }
                    this.f15413c.mo35287a(this.f15414d.mo35295b());
                    return;
                }
            } catch (InterruptedException unused) {
                return;
            }
        } while (!m18109a(this.f15412b, i2, map));
        this.f15413c.mo35287a(this.f15412b.mo35295b());
    }
}
