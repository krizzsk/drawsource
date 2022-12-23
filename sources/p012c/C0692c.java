package p012c;

import android.view.View;
import com.iab.omid.library.smaato.adsession.FriendlyObstructionPurpose;
import p400h.C12480a;

/* renamed from: c.c */
public class C0692c {

    /* renamed from: a */
    private final C12480a f59a;

    /* renamed from: b */
    private final String f60b;

    /* renamed from: c */
    private final FriendlyObstructionPurpose f61c;

    /* renamed from: d */
    private final String f62d;

    public C0692c(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
        this.f59a = new C12480a(view);
        this.f60b = view.getClass().getCanonicalName();
        this.f61c = friendlyObstructionPurpose;
        this.f62d = str;
    }

    /* renamed from: a */
    public String mo10280a() {
        return this.f62d;
    }

    /* renamed from: b */
    public FriendlyObstructionPurpose mo10281b() {
        return this.f61c;
    }

    /* renamed from: c */
    public C12480a mo10282c() {
        return this.f59a;
    }

    /* renamed from: d */
    public String mo10283d() {
        return this.f60b;
    }
}
