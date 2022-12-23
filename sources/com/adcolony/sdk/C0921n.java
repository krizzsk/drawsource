package com.adcolony.sdk;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.adcolony.sdk.C0826e0;
import com.adcolony.sdk.C0923n0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* renamed from: com.adcolony.sdk.n */
class C0921n {

    /* renamed from: a */
    private final SQLiteDatabase f648a;

    /* renamed from: b */
    private final C0923n0 f649b;

    C0921n(SQLiteDatabase sQLiteDatabase, C0923n0 n0Var) {
        this.f648a = sQLiteDatabase;
        this.f649b = n0Var;
    }

    /* renamed from: a */
    private void m828a(C0923n0.C0924a aVar, List<String> list) {
        m830a(aVar.mo10965f(), "manager_tmp_table");
        m835c(aVar);
        m831a("manager_tmp_table", aVar.mo10965f(), list);
        m834b("manager_tmp_table");
    }

    /* renamed from: c */
    private void m836c(C0923n0.C0926c cVar, String str) {
        ArrayList<String[]> c = mo10950c(cVar.mo10971b());
        boolean z = true;
        if (cVar.mo10970a().length == c.size()) {
            boolean z2 = false;
            for (int i = 0; i < cVar.mo10970a().length; i++) {
                if (!Objects.equals(cVar.mo10970a()[i], c.get(i)[2])) {
                    z2 = true;
                }
            }
            z = z2;
        }
        if (z) {
            m829a(cVar.mo10971b());
            m833b(cVar, str);
        }
    }

    /* renamed from: d */
    private void m837d(C0923n0.C0924a aVar) {
        List<C0923n0.C0926c> b = aVar.mo10961b();
        ArrayList<String> d = mo10951d(aVar.mo10965f());
        for (C0923n0.C0926c next : b) {
            if (d.contains(next.mo10971b())) {
                m836c(next, aVar.mo10965f());
            } else {
                m833b(next, aVar.mo10965f());
            }
            d.remove(next.mo10971b());
        }
        Iterator<String> it = d.iterator();
        while (it.hasNext()) {
            m829a(it.next());
        }
    }

    /* renamed from: e */
    private void m838e(C0923n0.C0924a aVar) {
        boolean z;
        boolean z2;
        ArrayList<C0922a> g = mo10954g(aVar.mo10965f());
        ArrayList arrayList = new ArrayList();
        boolean z3 = true;
        boolean z4 = false;
        for (C0923n0.C0925b next : aVar.mo10960a()) {
            int size = g.size() - 1;
            while (true) {
                if (size < 0) {
                    z = false;
                    z2 = false;
                    break;
                }
                C0922a aVar2 = g.get(size);
                if (Objects.equals(aVar2.mo10955a(), next.mo10968b())) {
                    arrayList.add(next.mo10968b());
                    z = aVar2.mo10956a(next);
                    g.remove(size);
                    z2 = true;
                    break;
                }
                size--;
            }
            if (!z2 || !z) {
                z4 = true;
            }
        }
        if (g.size() <= 0) {
            z3 = z4;
        }
        if (z3) {
            m828a(aVar, (List<String>) arrayList);
            m832b(aVar);
            return;
        }
        m837d(aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo10949b() {
        int version = this.f648a.getVersion();
        this.f648a.beginTransaction();
        boolean z = false;
        try {
            List<C0923n0.C0924a> a = this.f649b.mo10958a();
            ArrayList<String> a2 = mo10948a();
            for (C0923n0.C0924a next : a) {
                if (a2.contains(next.mo10965f())) {
                    m838e(next);
                } else {
                    m835c(next);
                    m832b(next);
                }
                a2.remove(next.mo10965f());
            }
            Iterator<String> it = a2.iterator();
            while (it.hasNext()) {
                m834b(it.next());
            }
            this.f648a.setVersion(this.f649b.mo10959b());
            this.f648a.setTransactionSuccessful();
            z = true;
            new C0826e0.C0827a().mo10746a("Success upgrading database from ").mo10744a(version).mo10746a(" to ").mo10744a(this.f649b.mo10959b()).mo10747a(C0826e0.f458e);
        } catch (SQLException e) {
            new C0826e0.C0827a().mo10746a("Upgrading database from ").mo10744a(version).mo10746a(" to ").mo10744a(this.f649b.mo10959b()).mo10746a("caused: ").mo10746a(e.toString()).mo10747a(C0826e0.f460g);
        } catch (Throwable th) {
            this.f648a.endTransaction();
            throw th;
        }
        this.f648a.endTransaction();
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public ArrayList<String> mo10953f(String str) {
        SQLiteDatabase sQLiteDatabase = this.f648a;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT name FROM sqlite_master  WHERE type='" + str + "' ORDER BY name", (String[]) null);
        ArrayList<String> arrayList = new ArrayList<>();
        if (rawQuery == null || !rawQuery.moveToFirst()) {
            rawQuery.close();
            return arrayList;
        }
        do {
            arrayList.add(rawQuery.getString(0));
        } while (rawQuery.moveToNext());
        rawQuery.close();
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public ArrayList<C0922a> mo10954g(String str) {
        ArrayList<C0922a> arrayList = new ArrayList<>();
        Iterator<String[]> it = mo10952e("PRAGMA table_info(" + str + ")").iterator();
        while (it.hasNext()) {
            C0922a a = C0922a.m846a(it.next());
            if (a != null) {
                arrayList.add(a);
            }
        }
        return arrayList;
    }

    /* renamed from: com.adcolony.sdk.n$a */
    static class C0922a {

        /* renamed from: a */
        private final String f650a;

        /* renamed from: b */
        private final String f651b;

        /* renamed from: c */
        private final String f652c;

        private C0922a(String[] strArr) {
            this.f650a = strArr[1];
            this.f651b = strArr[2];
            this.f652c = strArr[4];
        }

        /* renamed from: a */
        static C0922a m846a(String[] strArr) {
            if (strArr.length >= 5) {
                return new C0922a(strArr);
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public boolean mo10956a(C0923n0.C0925b bVar) {
            return Objects.equals(this.f650a, bVar.mo10968b()) && Objects.equals(this.f651b, bVar.mo10969c()) && Objects.equals(this.f652c, bVar.mo10967a());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public String mo10955a() {
            return this.f650a;
        }
    }

    /* renamed from: a */
    private void m829a(String str) {
        SQLiteDatabase sQLiteDatabase = this.f648a;
        sQLiteDatabase.execSQL("DROP INDEX " + str);
    }

    /* renamed from: a */
    private String m826a(C0923n0.C0924a aVar) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE ");
        sb.append(aVar.mo10965f());
        sb.append(" (");
        for (int i = 0; i < aVar.mo10960a().size(); i++) {
            C0923n0.C0925b bVar = aVar.mo10960a().get(i);
            sb.append(bVar.mo10968b());
            sb.append(" ");
            sb.append(bVar.mo10969c());
            if (bVar.mo10967a() != null) {
                if (bVar.mo10967a() instanceof Boolean) {
                    str = ((Boolean) bVar.mo10967a()).booleanValue() ? "1" : "0";
                } else if (bVar.mo10967a() instanceof String) {
                    str = "'" + bVar.mo10967a() + "'";
                } else {
                    str = bVar.mo10967a().toString();
                }
                sb.append(" DEFAULT ");
                sb.append(str);
            }
            if (i < aVar.mo10960a().size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(")");
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public ArrayList<String> mo10951d(String str) {
        ArrayList<String[]> e = mo10952e("PRAGMA index_list(" + str + ")");
        ArrayList<String> arrayList = new ArrayList<>();
        Iterator<String[]> it = e.iterator();
        while (it.hasNext()) {
            String[] next = it.next();
            if (next.length >= 3) {
                arrayList.add(next[1]);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    private void m835c(C0923n0.C0924a aVar) {
        this.f648a.execSQL(m826a(aVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public ArrayList<String[]> mo10950c(String str) {
        return mo10952e("PRAGMA index_info(" + str + ")");
    }

    /* renamed from: a */
    private String m827a(C0923n0.C0926c cVar, String str) {
        String join = TextUtils.join(", ", cVar.mo10970a());
        return "CREATE INDEX " + cVar.mo10971b() + " ON " + str + "(" + join + ")";
    }

    /* renamed from: a */
    private void m830a(String str, String str2) {
        SQLiteDatabase sQLiteDatabase = this.f648a;
        sQLiteDatabase.execSQL("ALTER TABLE " + str + " RENAME TO " + str2);
    }

    /* renamed from: a */
    private void m831a(String str, String str2, List<String> list) {
        String join = TextUtils.join(", ", list);
        SQLiteDatabase sQLiteDatabase = this.f648a;
        sQLiteDatabase.execSQL("INSERT INTO " + str2 + " (" + join + ") SELECT " + join + " FROM " + str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public ArrayList<String[]> mo10952e(String str) {
        Cursor rawQuery = this.f648a.rawQuery(str, (String[]) null);
        ArrayList<String[]> arrayList = new ArrayList<>();
        if (rawQuery == null || !rawQuery.moveToFirst()) {
            rawQuery.close();
            return arrayList;
        }
        do {
            int columnCount = rawQuery.getColumnCount();
            String[] strArr = new String[columnCount];
            for (int i = 0; i < columnCount; i++) {
                strArr[i] = rawQuery.getString(i);
            }
            arrayList.add(strArr);
        } while (rawQuery.moveToNext());
        rawQuery.close();
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public ArrayList<String> mo10948a() {
        ArrayList<String> f = mo10953f("table");
        for (int size = f.size() - 1; size >= 0; size--) {
            String str = f.get(size);
            if (str.startsWith("android_") || str.startsWith("sqlite_")) {
                f.remove(size);
            }
        }
        return f;
    }

    /* renamed from: b */
    private void m832b(C0923n0.C0924a aVar) {
        for (C0923n0.C0926c b : aVar.mo10961b()) {
            m833b(b, aVar.mo10965f());
        }
    }

    /* renamed from: b */
    private void m833b(C0923n0.C0926c cVar, String str) {
        this.f648a.execSQL(m827a(cVar, str));
    }

    /* renamed from: b */
    private void m834b(String str) {
        SQLiteDatabase sQLiteDatabase = this.f648a;
        sQLiteDatabase.execSQL("DROP TABLE " + str);
    }
}
