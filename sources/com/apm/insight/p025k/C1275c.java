package com.apm.insight.p025k;

import com.apm.insight.CrashType;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.apm.insight.k.c */
public abstract class C1275c {

    /* renamed from: a */
    private static ConcurrentLinkedQueue<C1275c> f1252a = new ConcurrentLinkedQueue<>();

    /* renamed from: com.apm.insight.k.c$1 */
    static /* synthetic */ class C12761 {

        /* renamed from: a */
        static final /* synthetic */ int[] f1253a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.apm.insight.CrashType[] r0 = com.apm.insight.CrashType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f1253a = r0
                com.apm.insight.CrashType r1 = com.apm.insight.CrashType.JAVA     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f1253a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.apm.insight.CrashType r1 = com.apm.insight.CrashType.LAUNCH     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f1253a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.apm.insight.CrashType r1 = com.apm.insight.CrashType.NATIVE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.p025k.C1275c.C12761.<clinit>():void");
        }
    }

    /* renamed from: com.apm.insight.k.c$a */
    public static class C1277a {

        /* renamed from: a */
        private JSONObject f1254a;

        /* renamed from: b */
        private JSONObject f1255b;

        /* renamed from: c */
        private CrashType f1256c;

        C1277a(JSONObject jSONObject, CrashType crashType) {
            this.f1256c = crashType;
            if (crashType == CrashType.LAUNCH) {
                this.f1254a = ((JSONArray) jSONObject.opt("data")).optJSONObject(0);
            } else {
                this.f1254a = jSONObject;
            }
            this.f1255b = jSONObject.optJSONObject("header");
        }

        /* renamed from: a */
        public String mo12550a() {
            return this.f1254a.optString("crash_thread_name", (String) null);
        }

        /* renamed from: b */
        public long mo12551b() {
            return (long) this.f1254a.optInt("app_start_time", -1);
        }

        /* renamed from: c */
        public String mo12552c() {
            int i = C12761.f1253a[this.f1256c.ordinal()];
            if (i == 1) {
                return this.f1254a.optString("data", (String) null);
            }
            if (i == 2) {
                return this.f1254a.optString("stack", (String) null);
            }
            if (i != 3) {
                return null;
            }
            return this.f1254a.optString("data", (String) null);
        }
    }

    /* renamed from: a */
    static void m1700a(CrashType crashType, JSONObject jSONObject) {
        ConcurrentLinkedQueue<C1275c> concurrentLinkedQueue = f1252a;
        if (concurrentLinkedQueue != null && !concurrentLinkedQueue.isEmpty()) {
            C1277a aVar = new C1277a(jSONObject, crashType);
            while (!f1252a.isEmpty()) {
                C1275c poll = f1252a.poll();
                if (poll != null) {
                    poll.mo12549a(crashType, aVar);
                }
            }
            f1252a = null;
        }
    }

    /* renamed from: a */
    public abstract void mo12549a(CrashType crashType, C1277a aVar);
}
