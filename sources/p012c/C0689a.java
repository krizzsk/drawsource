package p012c;

import com.iab.omid.library.smaato.adsession.C8021a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* renamed from: c.a */
public class C0689a {

    /* renamed from: c */
    private static C0689a f52c = new C0689a();

    /* renamed from: a */
    private final ArrayList<C8021a> f53a = new ArrayList<>();

    /* renamed from: b */
    private final ArrayList<C8021a> f54b = new ArrayList<>();

    private C0689a() {
    }

    /* renamed from: c */
    public static C0689a m34c() {
        return f52c;
    }

    /* renamed from: a */
    public Collection<C8021a> mo10261a() {
        return Collections.unmodifiableCollection(this.f54b);
    }

    /* renamed from: a */
    public void mo10262a(C8021a aVar) {
        this.f53a.add(aVar);
    }

    /* renamed from: b */
    public Collection<C8021a> mo10263b() {
        return Collections.unmodifiableCollection(this.f53a);
    }

    /* renamed from: b */
    public void mo10264b(C8021a aVar) {
        boolean d = mo10266d();
        this.f53a.remove(aVar);
        this.f54b.remove(aVar);
        if (d && !mo10266d()) {
            C0696f.m75c().mo10306e();
        }
    }

    /* renamed from: c */
    public void mo10265c(C8021a aVar) {
        boolean d = mo10266d();
        this.f54b.add(aVar);
        if (!d) {
            C0696f.m75c().mo10305d();
        }
    }

    /* renamed from: d */
    public boolean mo10266d() {
        return this.f54b.size() > 0;
    }
}
