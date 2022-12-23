package com.ironsource.environment;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.UriMatcher;
import android.database.Cursor;
import android.net.Uri;

public class CrashProvider extends ContentProvider {

    /* renamed from: a */
    private Context f16103a;

    /* renamed from: b */
    private C6388f f16104b;

    /* renamed from: c */
    private String f16105c;

    /* renamed from: d */
    private UriMatcher f16106d = new UriMatcher(-1);

    /* renamed from: e */
    private Uri f16107e;

    /* renamed from: f */
    private int f16108f = 1;

    /* renamed from: g */
    private int f16109g = 2;

    /* renamed from: h */
    private String f16110h;

    /* renamed from: i */
    private String f16111i;

    /* renamed from: j */
    private String f16112j = "REPORTS";

    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        int match = this.f16106d.match(uri);
        if (match == 1) {
            return this.f16110h;
        }
        if (match == 2) {
            return this.f16111i;
        }
        throw new IllegalArgumentException("Invalid URI: " + uri);
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        this.f16103a = getContext();
        this.f16104b = new C6388f(this.f16103a);
        this.f16105c = this.f16103a.getPackageName();
        this.f16107e = Uri.parse("content://" + this.f16105c + "/REPORTS");
        this.f16110h = "vnd.android.cursor.dir/CrashReporter.Reports";
        this.f16111i = "vnd.android.cursor.item/CrashReporter/Reports";
        return true;
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int match = this.f16106d.match(uri);
        if (match == 1) {
            return C6388f.m19077b();
        }
        if (match == 2) {
            return C6388f.m19074a(Integer.parseInt(uri.getLastPathSegment()));
        }
        throw new IllegalArgumentException("Invalid URI: " + uri);
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
