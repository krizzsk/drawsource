package p012c;

import android.content.Context;

/* renamed from: c.d */
public class C0693d {

    /* renamed from: b */
    private static C0693d f63b = new C0693d();

    /* renamed from: a */
    private Context f64a;

    private C0693d() {
    }

    /* renamed from: b */
    public static C0693d m54b() {
        return f63b;
    }

    /* renamed from: a */
    public Context mo10284a() {
        return this.f64a;
    }

    /* renamed from: a */
    public void mo10285a(Context context) {
        this.f64a = context != null ? context.getApplicationContext() : null;
    }
}
