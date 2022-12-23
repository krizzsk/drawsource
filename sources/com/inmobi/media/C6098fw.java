package com.inmobi.media;

import android.content.ContentValues;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.inmobi.media.fw */
/* compiled from: ConfigDao */
public class C6098fw {

    /* renamed from: a */
    private static final String f15405a = C6098fw.class.getSimpleName();

    /* renamed from: b */
    private static final String[] f15406b = {"account_id", "config_value", "config_type", "update_ts"};

    /* renamed from: d */
    private static String[] m18106d(String str, String str2) {
        return new String[]{str2, str};
    }

    /* renamed from: a */
    private static C6093fu m18099a(ContentValues contentValues) throws JSONException {
        String asString = contentValues.getAsString("config_value");
        if (asString == null) {
            return null;
        }
        return C6093fu.m18078a(contentValues.getAsString("config_type"), new JSONObject(asString), contentValues.getAsString("account_id"));
    }

    public C6098fw() {
        C6164hh a = C6164hh.m18246a();
        a.mo35362a("config_db", "(account_id TEXT NOT NULL,config_value TEXT NOT NULL,config_type TEXT NOT NULL,update_ts INTEGER DEFAULT 0,UNIQUE(account_id,config_type))");
        a.mo35365b();
    }

    /* renamed from: a */
    public static void m18102a(C6093fu fuVar) {
        try {
            if (fuVar.mo35284g() != null) {
                C6164hh a = C6164hh.m18246a();
                ContentValues contentValues = new ContentValues();
                contentValues.put("account_id", fuVar.mo35284g());
                JSONObject c = fuVar.mo35279c();
                if (c == null) {
                    c = new JSONObject();
                }
                contentValues.put("config_value", c.toString());
                contentValues.put("config_type", fuVar.mo35278b());
                contentValues.put("update_ts", Long.valueOf(System.currentTimeMillis()));
                a.mo35361a("config_db", contentValues, "account_id=? AND config_type=?", m18106d(fuVar.mo35278b(), fuVar.mo35284g()));
                a.mo35365b();
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static C6093fu m18100a(String str, String str2) {
        C6093fu fuVar;
        try {
            C6164hh a = C6164hh.m18246a();
            List<ContentValues> a2 = a.mo35360a("config_db", f15406b, "account_id=? AND config_type=?", m18106d(str, str2), (String) null, (String) null, (String) null, (String) null);
            fuVar = !a2.isEmpty() ? m18099a(a2.get(0)) : null;
            try {
                a.mo35365b();
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            fuVar = null;
        }
        return fuVar == null ? C6093fu.m18077a(str, (String) null) : fuVar;
    }

    /* renamed from: a */
    public static LinkedList<C6093fu> m18101a() {
        LinkedList<C6093fu> linkedList = new LinkedList<>();
        try {
            C6164hh a = C6164hh.m18246a();
            List<ContentValues> a2 = a.mo35360a("config_db", f15406b, (String) null, (String[]) null, (String) null, (String) null, (String) null, (String) null);
            if (!a2.isEmpty()) {
                for (ContentValues a3 : a2) {
                    linkedList.add(m18099a(a3));
                }
            }
            a.mo35365b();
        } catch (Exception unused) {
        }
        return linkedList;
    }

    /* renamed from: b */
    public static boolean m18104b(String str, String str2) {
        try {
            C6164hh a = C6164hh.m18246a();
            int b = a.mo35364b("config_db", "account_id=? AND config_type=?", m18106d(str, str2));
            a.mo35365b();
            if (b <= 0) {
                return true;
            }
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    /* renamed from: c */
    public static long m18105c(String str, String str2) {
        long j = 0;
        try {
            C6164hh a = C6164hh.m18246a();
            List<ContentValues> a2 = a.mo35360a("config_db", f15406b, "account_id=? AND config_type=?", m18106d(str, str2), (String) null, (String) null, (String) null, (String) null);
            if (!a2.isEmpty()) {
                j = a2.get(0).getAsLong("update_ts").longValue();
            }
            a.mo35365b();
        } catch (Exception unused) {
        }
        return j;
    }

    /* renamed from: a */
    public static void m18103a(String str, String str2, long j) {
        try {
            C6164hh a = C6164hh.m18246a();
            ContentValues contentValues = new ContentValues();
            contentValues.put("update_ts", Long.valueOf(j));
            a.mo35363b("config_db", contentValues, "account_id=? AND config_type=?", m18106d(str, str2));
            a.mo35365b();
        } catch (Exception unused) {
        }
    }
}
