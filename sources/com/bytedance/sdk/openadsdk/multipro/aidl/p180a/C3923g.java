package com.bytedance.sdk.openadsdk.multipro.aidl.p180a;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.core.p153i.C3470e;
import com.bytedance.sdk.openadsdk.multipro.C3965f;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.aidl.a.g */
/* compiled from: ProviderListenerManagerImpl */
public class C3923g extends C3917a {

    /* renamed from: a */
    private static volatile C3923g f10017a;

    /* renamed from: a */
    public static C3923g m12941a() {
        if (f10017a == null) {
            synchronized (C3923g.class) {
                if (f10017a == null) {
                    f10017a = new C3923g();
                }
            }
        }
        return f10017a;
    }

    public Map query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        if (!C3470e.m10697a()) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            Cursor a = C3965f.m13065a(C3513m.m10963a()).mo20774a(uri, strArr, str, strArr2, str2);
            if (a != null) {
                String[] columnNames = a.getColumnNames();
                while (a.getCount() > 0 && a.moveToNext()) {
                    for (String str3 : columnNames) {
                        if (!hashMap.containsKey(str3)) {
                            hashMap.put(str3, new LinkedList());
                        }
                        ((List) hashMap.get(str3)).add(a.getString(a.getColumnIndex(str3)));
                    }
                }
                a.close();
            }
            return hashMap;
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getType(Uri uri) {
        if (!C3470e.m10697a()) {
            return null;
        }
        return C3965f.m13065a(C3513m.m10963a()).mo20777a(uri);
    }

    public String insert(Uri uri, ContentValues contentValues) {
        Uri a;
        if (C3470e.m10697a() && (a = C3965f.m13065a(C3513m.m10963a()).mo20775a(uri, contentValues)) != null) {
            return a.toString();
        }
        return null;
    }

    public int delete(Uri uri, String str, String[] strArr) {
        if (!C3470e.m10697a()) {
            return 0;
        }
        return C3965f.m13065a(C3513m.m10963a()).mo20773a(uri, str, strArr);
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (!C3470e.m10697a()) {
            return 0;
        }
        return C3965f.m13065a(C3513m.m10963a()).mo20772a(uri, contentValues, str, strArr);
    }
}
