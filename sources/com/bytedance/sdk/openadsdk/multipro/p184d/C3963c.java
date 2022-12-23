package com.bytedance.sdk.openadsdk.multipro.p184d;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.adjust.sdk.Constants;
import com.bytedance.sdk.openadsdk.core.C3513m;
import com.bytedance.sdk.openadsdk.multipro.C3908a;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.multipro.d.c */
/* compiled from: SPMultiProviderImpl */
public class C3963c implements C3908a {

    /* renamed from: a */
    private Context f10073a;

    /* renamed from: a */
    public String mo20776a() {
        return "t_sp";
    }

    /* renamed from: b */
    public void mo20778b() {
    }

    /* renamed from: c */
    private Context m13056c() {
        Context context = this.f10073a;
        return context == null ? C3513m.m10963a() : context;
    }

    /* renamed from: a */
    public Cursor mo20774a(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        Map<String, ?> b;
        if (!uri.getPath().split("/")[2].equals("get_all") || (b = C3962b.m13051b(m13056c(), uri.getQueryParameter("sp_file_name"))) == null) {
            return null;
        }
        MatrixCursor matrixCursor = new MatrixCursor(new String[]{"cursor_name", "cursor_type", "cursor_value"});
        for (String next : b.keySet()) {
            Object[] objArr = new Object[3];
            objArr[0] = next;
            objArr[2] = b.get(next);
            if (objArr[2] instanceof Boolean) {
                objArr[1] = "boolean";
            } else if (objArr[2] instanceof String) {
                objArr[1] = "string";
            } else if (objArr[2] instanceof Integer) {
                objArr[1] = "int";
            } else if (objArr[2] instanceof Long) {
                objArr[1] = Constants.LONG;
            } else if (objArr[2] instanceof Float) {
                objArr[1] = "float";
            }
            matrixCursor.addRow(objArr);
        }
        return matrixCursor;
    }

    /* renamed from: a */
    public String mo20777a(Uri uri) {
        String[] split = uri.getPath().split("/");
        String str = split[2];
        String str2 = split[3];
        if (str.equals("contain")) {
            return C3962b.m13048a(C3513m.m10963a(), uri.getQueryParameter("sp_file_name"), str2) + "";
        }
        return "" + C3962b.m13043a(m13056c(), uri.getQueryParameter("sp_file_name"), str2, str);
    }

    /* renamed from: a */
    public Uri mo20775a(Uri uri, ContentValues contentValues) {
        if (contentValues == null) {
            return null;
        }
        String[] split = uri.getPath().split("/");
        String str = split[2];
        String str2 = split[3];
        Object obj = contentValues.get("value");
        if (obj != null) {
            C3962b.m13046a(m13056c(), uri.getQueryParameter("sp_file_name"), str2, obj);
        }
        return null;
    }

    /* renamed from: a */
    public int mo20773a(Uri uri, String str, String[] strArr) {
        String[] split = uri.getPath().split("/");
        if (split[2].equals("clean")) {
            C3962b.m13045a(m13056c(), uri.getQueryParameter("sp_file_name"));
            return 0;
        }
        String str2 = split[3];
        if (C3962b.m13048a(m13056c(), uri.getQueryParameter("sp_file_name"), str2)) {
            C3962b.m13052b(m13056c(), uri.getQueryParameter("sp_file_name"), str2);
        }
        return 0;
    }

    /* renamed from: a */
    public int mo20772a(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        if (contentValues == null) {
            return 0;
        }
        mo20775a(uri, contentValues);
        return 0;
    }
}
