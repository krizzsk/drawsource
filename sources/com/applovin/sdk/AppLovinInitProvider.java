package com.applovin.sdk;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.applovin.impl.sdk.AppLovinContentProviderUtils;
import com.applovin.impl.sdk.C1969m;
import com.applovin.impl.sdk.C2022o;

public class AppLovinInitProvider extends ContentProvider {
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    public String getType(Uri uri) {
        return AppLovinContentProviderUtils.getType(uri);
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public boolean onCreate() {
        C2022o.m4818a(getContext());
        C2022o.m4823b(getContext());
        C1969m.m4459a(getContext());
        return true;
    }

    public ParcelFileDescriptor openFile(Uri uri, String str) {
        return AppLovinContentProviderUtils.openFile(uri);
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return AppLovinContentProviderUtils.query(uri);
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
