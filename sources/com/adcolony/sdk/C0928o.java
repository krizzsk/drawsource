package com.adcolony.sdk;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.adcolony.sdk.C0826e0;
import com.adcolony.sdk.C0923n0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* renamed from: com.adcolony.sdk.o */
class C0928o {

    /* renamed from: com.adcolony.sdk.o$a */
    class C0929a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C0923n0 f671a;

        /* renamed from: b */
        final /* synthetic */ SQLiteDatabase f672b;

        /* renamed from: c */
        final /* synthetic */ C0930b f673c;

        /* renamed from: d */
        final /* synthetic */ CountDownLatch f674d;

        C0929a(C0923n0 n0Var, SQLiteDatabase sQLiteDatabase, C0930b bVar, CountDownLatch countDownLatch) {
            this.f671a = n0Var;
            this.f672b = sQLiteDatabase;
            this.f673c = bVar;
            this.f674d = countDownLatch;
        }

        public void run() {
            for (C0923n0.C0924a next : this.f671a.mo10958a()) {
                for (Map.Entry next2 : next.mo10964e().entrySet()) {
                    C0932c a = C0928o.m870a((String) next2.getValue(), this.f672b);
                    if (a != null) {
                        this.f673c.m872a(next.mo10963d(), (String) next2.getKey(), a);
                    }
                }
            }
            C0934o0.m895c().mo10991a(this.f673c);
            this.f674d.countDown();
        }
    }

    /* renamed from: com.adcolony.sdk.o$b */
    static class C0930b {

        /* renamed from: a */
        private final int f675a;

        /* renamed from: b */
        private final Map<String, ArrayList<C0931a>> f676b;

        /* renamed from: com.adcolony.sdk.o$b$a */
        static class C0931a {

            /* renamed from: a */
            private final String f677a;

            /* renamed from: b */
            private final C0932c f678b;

            /* synthetic */ C0931a(String str, C0932c cVar, C0929a aVar) {
                this(str, cVar);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public String mo10977a() {
                return this.f677a;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public C0932c mo10978b() {
                return this.f678b;
            }

            private C0931a(String str, C0932c cVar) {
                this.f677a = str;
                this.f678b = cVar;
            }
        }

        /* synthetic */ C0930b(int i, C0929a aVar) {
            this(i);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C0832f1 mo10976b() {
            C0832f1 b = C0773c0.m379b();
            C0773c0.m383b(b, "version", mo10975a());
            for (Map.Entry next : this.f676b.entrySet()) {
                C0832f1 b2 = C0773c0.m379b();
                Iterator it = ((ArrayList) next.getValue()).iterator();
                while (it.hasNext()) {
                    C0931a aVar = (C0931a) it.next();
                    C0828e1 a = C0773c0.m365a();
                    for (String b3 : aVar.mo10978b().mo10981a((Character) ',')) {
                        a.mo10754b(b3);
                    }
                    C0773c0.m374a(b2, aVar.mo10977a(), a);
                }
                C0773c0.m375a(b, (String) next.getKey(), b2);
            }
            return b;
        }

        private C0930b(int i) {
            this.f676b = new ConcurrentHashMap();
            this.f675a = i;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m872a(String str, String str2, C0932c cVar) {
            ArrayList arrayList;
            C0931a aVar = new C0931a(str2, cVar, (C0929a) null);
            if (!this.f676b.containsKey(str) || (arrayList = this.f676b.get(str)) == null) {
                this.f676b.put(str, new ArrayList(Collections.singletonList(aVar)));
            } else {
                arrayList.add(aVar);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public int mo10975a() {
            return this.f675a;
        }
    }

    /* renamed from: a */
    static C0930b m869a(C0923n0 n0Var, SQLiteDatabase sQLiteDatabase, Executor executor, long j) {
        C0930b bVar = new C0930b(n0Var.mo10959b(), (C0929a) null);
        try {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            executor.execute(new C0929a(n0Var, sQLiteDatabase, bVar, countDownLatch));
            if (j > 0) {
                countDownLatch.await(j, TimeUnit.MILLISECONDS);
            } else {
                countDownLatch.await();
            }
        } catch (InterruptedException | RejectedExecutionException e) {
            C0826e0.C0827a aVar = new C0826e0.C0827a();
            aVar.mo10746a("ADCDbReader.calculateFeatureVectors failed with: " + e.toString()).mo10747a(C0826e0.f462i);
        }
        return bVar;
    }

    /* renamed from: com.adcolony.sdk.o$c */
    static class C0932c {

        /* renamed from: a */
        private final List<C0933a> f679a = new ArrayList();

        /* renamed from: b */
        private final List<ContentValues> f680b = new ArrayList();

        /* renamed from: com.adcolony.sdk.o$c$a */
        static class C0933a {

            /* renamed from: a */
            private final int f681a;
            /* access modifiers changed from: private */

            /* renamed from: b */
            public final String f682b;
            /* access modifiers changed from: private */

            /* renamed from: c */
            public final int f683c;

            /* synthetic */ C0933a(int i, String str, int i2, C0929a aVar) {
                this(i, str, i2);
            }

            /* access modifiers changed from: package-private */
            /* renamed from: c */
            public int mo10986c() {
                return this.f683c;
            }

            private C0933a(int i, String str, int i2) {
                this.f681a = i;
                this.f682b = str;
                this.f683c = i2;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: a */
            public int mo10984a() {
                return this.f681a;
            }

            /* access modifiers changed from: package-private */
            /* renamed from: b */
            public String mo10985b() {
                return this.f682b;
            }
        }

        C0932c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public int mo10982b(int i) {
            if (i < 0 || i >= this.f679a.size()) {
                return -1;
            }
            return this.f679a.get(i).mo10986c();
        }

        public String toString() {
            String str;
            String str2;
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (true) {
                str = "\n";
                if (i >= this.f679a.size()) {
                    break;
                }
                sb.append(this.f679a.get(i).f682b);
                if (i != this.f679a.size() - 1) {
                    str = " | ";
                }
                sb.append(str);
                i++;
            }
            for (ContentValues next : this.f680b) {
                for (int i2 = 0; i2 < this.f679a.size(); i2++) {
                    sb.append(next.getAsString(mo10979a(i2)));
                    if (i2 == this.f679a.size() - 1) {
                        str2 = str;
                    } else {
                        str2 = " | ";
                    }
                    sb.append(str2);
                }
            }
            return sb.toString();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m877a(int i, String str, int i2) {
            this.f679a.add(new C0933a(i, str, i2, (C0929a) null));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo10979a(int i) {
            if (i < 0 || i >= this.f679a.size()) {
                return null;
            }
            return this.f679a.get(i).mo10985b();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void m878a(Cursor cursor) {
            ContentValues contentValues = new ContentValues();
            for (C0933a next : this.f679a) {
                int a = next.f683c;
                if (a == 1) {
                    contentValues.put(next.mo10985b(), Long.valueOf(cursor.getLong(next.mo10984a())));
                } else if (a == 2) {
                    contentValues.put(next.mo10985b(), Double.valueOf(cursor.getDouble(next.mo10984a())));
                } else if (a != 4) {
                    contentValues.put(next.mo10985b(), cursor.getString(next.mo10984a()));
                } else {
                    contentValues.put(next.mo10985b(), cursor.getBlob(next.mo10984a()));
                }
            }
            this.f680b.add(contentValues);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo10980a(int i, Character ch) {
            if (i < 0 || i >= this.f680b.size()) {
                return null;
            }
            ContentValues contentValues = this.f680b.get(i);
            StringBuilder sb = new StringBuilder();
            int i2 = 0;
            while (i2 < this.f679a.size()) {
                if (mo10982b(i2) == 3) {
                    sb.append("\"");
                    sb.append(contentValues.get(mo10979a(i2)));
                    sb.append("\"");
                } else {
                    sb.append(contentValues.getAsString(mo10979a(i2)));
                }
                sb.append(i2 == this.f679a.size() + -1 ? "" : ch);
                i2++;
            }
            return sb.toString();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public List<String> mo10981a(Character ch) {
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < this.f680b.size(); i++) {
                arrayList.add(mo10980a(i, ch));
            }
            return arrayList;
        }
    }

    /* renamed from: a */
    static C0932c m870a(String str, SQLiteDatabase sQLiteDatabase) {
        C0932c cVar;
        Throwable th;
        C0932c cVar2 = null;
        try {
            Cursor rawQuery = sQLiteDatabase.rawQuery(str, (String[]) null);
            if (rawQuery != null) {
                try {
                    if (rawQuery.moveToFirst()) {
                        cVar = new C0932c();
                        int i = 0;
                        while (i < rawQuery.getColumnCount()) {
                            try {
                                cVar.m877a(i, rawQuery.getColumnName(i), rawQuery.getType(i));
                                i++;
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    rawQuery.close();
                                } catch (Throwable th3) {
                                    try {
                                        th.addSuppressed(th3);
                                    } catch (SQLException e) {
                                        e = e;
                                        new C0826e0.C0827a().mo10746a("SQLException on execute query: ").mo10746a(e.toString()).mo10747a(C0826e0.f462i);
                                        return cVar;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        new C0826e0.C0827a().mo10746a("Error on execute query: ").mo10746a(th.toString()).mo10747a(C0826e0.f462i);
                                        return cVar;
                                    }
                                }
                                throw th;
                            }
                        }
                        do {
                            cVar.m878a(rawQuery);
                        } while (rawQuery.moveToNext());
                        cVar2 = cVar;
                    }
                } catch (Throwable th5) {
                    th = th5;
                    cVar = null;
                    rawQuery.close();
                    throw th;
                }
            }
            if (rawQuery == null) {
                return cVar2;
            }
            rawQuery.close();
            return cVar2;
        } catch (SQLException e2) {
            e = e2;
            cVar = cVar2;
        } catch (Throwable th6) {
            th = th6;
            cVar = cVar2;
            new C0826e0.C0827a().mo10746a("Error on execute query: ").mo10746a(th.toString()).mo10747a(C0826e0.f462i);
            return cVar;
        }
    }
}
