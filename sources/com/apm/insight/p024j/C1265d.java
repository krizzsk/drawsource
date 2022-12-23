package com.apm.insight.p024j;

import android.content.Context;
import android.os.Handler;
import com.apm.insight.p026l.C1295a;
import com.apm.insight.p026l.C1321q;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.apm.insight.j.d */
public final class C1265d {

    /* renamed from: a */
    private List<C1261a> f1218a = new ArrayList(3);

    private C1265d(Handler handler, Context context) {
        if (C1295a.m1781b(context)) {
            this.f1218a.add(new C1264c(handler, 0, 15000));
        }
    }

    /* renamed from: a */
    public static C1265d m1662a(Handler handler, Context context) {
        return new C1265d(handler, context);
    }

    /* renamed from: a */
    public void mo12542a() {
        C1321q.m1927a((Object) "[ScheduleTaskManager] execute, task size=" + this.f1218a.size());
        for (C1261a a : this.f1218a) {
            try {
                a.mo12535a();
            } catch (Throwable unused) {
            }
        }
    }
}
